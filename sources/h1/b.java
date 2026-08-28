package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import j3.r0;
import m.b3;
import m.c3;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public com.google.android.gms.internal.clearcut.c e;
    public a f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
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
    public View getDropDownView(int i9, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i9);
        if (view == null) {
            c3 c3Var = (c3) this;
            view = c3Var.s.inflate(c3Var.r, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.h == null) {
            c cVar = new c();
            cVar.a = this;
            this.h = cVar;
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i9) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i9);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i9)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(i9)) {
            throw new IllegalStateException(r0.l(i9, "couldn't move cursor to position "));
        }
        if (view == null) {
            c3 c3Var = (c3) this;
            view = c3Var.s.inflate(c3Var.n, viewGroup, false);
            view.setTag(new b3(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(c3Var.A);
        }
        a(view, this.c);
        return view;
    }
}
