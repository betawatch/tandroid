package h1;

import a5.j;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import com.google.android.gms.internal.clearcut.c;
import m.a3;
import m.z2;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public c e;
    public j f;
    public b h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                j jVar = this.f;
                if (jVar != null) {
                    cursor2.unregisterDataSetObserver(jVar);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                j jVar2 = this.f;
                if (jVar2 != null) {
                    cursor.registerDataSetObserver(jVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i10);
        if (view == null) {
            a3 a3Var = (a3) this;
            view = a3Var.s.inflate(a3Var.r, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.h == null) {
            b bVar = new b();
            bVar.a = this;
            this.h = bVar;
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i10)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(i10)) {
            throw new IllegalStateException(ic.a.i(i10, "couldn't move cursor to position "));
        }
        if (view == null) {
            a3 a3Var = (a3) this;
            view = a3Var.s.inflate(a3Var.n, viewGroup, false);
            view.setTag(new z2(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(a3Var.E);
        }
        a(view, this.c);
        return view;
    }
}
