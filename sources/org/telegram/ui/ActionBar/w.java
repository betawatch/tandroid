package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.ui.le;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w {
    public x a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public e6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public q0 m;
    public ArrayList n;

    public final void a() {
        x xVar = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = xVar.getChildCount();
        ArrayList arrayList = xVar.e;
        int i3 = 0;
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
            int i10 = 0;
            while (true) {
                if (i10 >= xVar.getChildCount()) {
                    break;
                }
                Object tag = xVar.getChildAt(i10).getTag();
                if (tag instanceof Integer) {
                    if (xVar.e.indexOf((Integer) tag) > indexOf) {
                        childCount = i10;
                        break;
                    }
                }
                i10++;
            }
        }
        q0 f10 = xVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
        this.m = f10;
        f10.setVisibility(this.l);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            this.m.setContentDescription(charSequence);
        }
        Boolean bool = this.k;
        if (bool != null) {
            this.m.S = bool.booleanValue();
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            this.m.T = bool2.booleanValue();
        }
        this.m.setAlpha(this.i);
        ArrayList arrayList2 = this.n;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ((u10) obj).a(this.m);
            }
            this.n = null;
        }
    }

    public final void b(le leVar) {
        q0 q0Var = this.m;
        if (q0Var != null) {
            leVar.a(q0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(leVar);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        q0 q0Var = this.m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        q0 q0Var = this.m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i3) {
        if (this.l != i3) {
            this.l = i3;
            if (i3 == 0) {
                a();
            }
            q0 q0Var = this.m;
            if (q0Var != null) {
                q0Var.setVisibility(i3);
            }
        }
    }
}
