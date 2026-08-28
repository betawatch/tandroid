package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.se;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y {
    public z a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public b6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public w0 m;
    public ArrayList n;
    public Integer o;

    public final void a() {
        z zVar = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = zVar.getChildCount();
        ArrayList arrayList = zVar.e;
        int i9 = 0;
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
            int i10 = 0;
            while (true) {
                if (i10 >= zVar.getChildCount()) {
                    break;
                }
                Object tag = zVar.getChildAt(i10).getTag();
                if (tag instanceof Integer) {
                    if (zVar.e.indexOf((Integer) tag) > indexOf) {
                        childCount = i10;
                        break;
                    }
                }
                i10++;
            }
        }
        w0 f10 = zVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
        this.m = f10;
        f10.setVisibility(this.l);
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
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                ((Utilities.Callback) obj).run(this.m);
            }
            this.n = null;
        }
    }

    public final void b(se seVar) {
        w0 w0Var = this.m;
        if (w0Var != null) {
            seVar.run(w0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(seVar);
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

    public final void f(int i9) {
        if (this.l != i9) {
            this.l = i9;
            if (i9 == 0) {
                a();
            }
            w0 w0Var = this.m;
            if (w0Var != null) {
                w0Var.setVisibility(i9);
            }
        }
    }
}
