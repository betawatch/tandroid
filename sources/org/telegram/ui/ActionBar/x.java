package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ne;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x {
    public y a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public f6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public r0 m;
    public ArrayList n;

    public final void a() {
        y yVar = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = yVar.getChildCount();
        ArrayList arrayList = yVar.e;
        int i7 = 0;
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
            int i10 = 0;
            while (true) {
                if (i10 >= yVar.getChildCount()) {
                    break;
                }
                Object tag = yVar.getChildAt(i10).getTag();
                if (tag instanceof Integer) {
                    if (yVar.e.indexOf((Integer) tag) > indexOf) {
                        childCount = i10;
                        break;
                    }
                }
                i10++;
            }
        }
        r0 f10 = yVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
        this.m = f10;
        f10.setVisibility(this.l);
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
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ((c20) obj).a(this.m);
            }
            this.n = null;
        }
    }

    public final void b(ne neVar) {
        r0 r0Var = this.m;
        if (r0Var != null) {
            neVar.a(r0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(neVar);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        r0 r0Var = this.m;
        if (r0Var != null) {
            r0Var.R = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        r0 r0Var = this.m;
        if (r0Var != null) {
            r0Var.S = true;
        }
    }

    public final void e(int i7) {
        if (this.l != i7) {
            this.l = i7;
            if (i7 == 0) {
                a();
            }
            r0 r0Var = this.m;
            if (r0Var != null) {
                r0Var.setVisibility(i7);
            }
        }
    }
}
