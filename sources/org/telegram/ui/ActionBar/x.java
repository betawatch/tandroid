package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x {
    public y a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public d6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public u0 m;
    public ArrayList n;
    public Integer o;

    public final void a() {
        y yVar = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = yVar.getChildCount();
        ArrayList arrayList = yVar.e;
        int i10 = 0;
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
            int i11 = 0;
            while (true) {
                if (i11 >= yVar.getChildCount()) {
                    break;
                }
                Object tag = yVar.getChildAt(i11).getTag();
                if (tag instanceof Integer) {
                    if (yVar.e.indexOf((Integer) tag) > indexOf) {
                        childCount = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        u0 f7 = yVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
        this.m = f7;
        f7.setVisibility(this.l);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            this.m.setContentDescription(charSequence);
        }
        Boolean bool = this.k;
        if (bool != null) {
            this.m.R = bool.booleanValue();
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            this.m.S = bool2.booleanValue();
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

    public final void b(af afVar) {
        u0 u0Var = this.m;
        if (u0Var != null) {
            afVar.run(u0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(afVar);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        u0 u0Var = this.m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        u0 u0Var = this.m;
        if (u0Var != null) {
            u0Var.S = true;
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
            u0 u0Var = this.m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}
