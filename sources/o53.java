// default package

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class o53 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public m53 e;
    public n53 f;
    public p53 h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                m53 m53Var = this.e;
                if (m53Var != null) {
                    cursor2.unregisterContentObserver(m53Var);
                }
                n53 n53Var = this.f;
                if (n53Var != null) {
                    cursor2.unregisterDataSetObserver(n53Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                m53 m53Var2 = this.e;
                if (m53Var2 != null) {
                    cursor.registerContentObserver(m53Var2);
                }
                n53 n53Var2 = this.f;
                if (n53Var2 != null) {
                    cursor.registerDataSetObserver(n53Var2);
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
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            mdb mdbVar = (mdb) this;
            view = mdbVar.s.inflate(mdbVar.r, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        p53 p53Var = this.h;
        if (p53Var != null) {
            return p53Var;
        }
        p53 p53Var2 = new p53();
        p53Var2.a = this;
        this.h = p53Var2;
        return p53Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            dq9.m("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            dq9.m(hg9.j(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            mdb mdbVar = (mdb) this;
            view = mdbVar.s.inflate(mdbVar.n, viewGroup, false);
            view.setTag(new ldb(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(mdbVar.F);
        }
        a(view, this.c);
        return view;
    }
}
