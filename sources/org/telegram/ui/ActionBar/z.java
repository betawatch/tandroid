package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z {
    public a0 a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public c6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public w0 m;
    public ArrayList n;
    public Integer o;

    public final void a() {
        a0 a0Var = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = a0Var.getChildCount();
        ArrayList arrayList = a0Var.e;
        int i10 = 0;
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
            int i11 = 0;
            while (true) {
                if (i11 >= a0Var.getChildCount()) {
                    break;
                }
                Object tag = a0Var.getChildAt(i11).getTag();
                if (tag instanceof Integer) {
                    if (a0Var.e.indexOf((Integer) tag) > indexOf) {
                        childCount = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        w0 f9 = a0Var.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
        this.m = f9;
        f9.setVisibility(this.l);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            this.m.setContentDescription(charSequence);
        }
        Boolean bool = this.k;
        if (bool != null) {
            this.m.N = bool.booleanValue();
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            this.m.O = bool2.booleanValue();
        }
        this.m.setAlpha(this.i);
        ArrayList arrayList2 = this.n;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((Utilities.Callback) obj).run(this.m);
            }
            this.n = null;
        }
    }

    public final void b(qe qeVar) {
        w0 w0Var = this.m;
        if (w0Var != null) {
            qeVar.run(w0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(qeVar);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        w0 w0Var = this.m;
        if (w0Var != null) {
            w0Var.N = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        w0 w0Var = this.m;
        if (w0Var != null) {
            w0Var.O = true;
        }
    }

    public final void e() {
        this.o = null;
    }

    public final void f(int i10) {
        if (this.l != i10) {
            this.l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}
