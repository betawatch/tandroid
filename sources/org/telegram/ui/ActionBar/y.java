package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.se;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y {
    public z a;
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
    public v0 m;
    public ArrayList n;
    public Integer o;

    public final void a() {
        z zVar = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = zVar.getChildCount();
        ArrayList arrayList = zVar.e;
        int i10 = 0;
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
            int i11 = 0;
            while (true) {
                if (i11 >= zVar.getChildCount()) {
                    break;
                }
                Object tag = zVar.getChildAt(i11).getTag();
                if (tag instanceof Integer) {
                    if (zVar.e.indexOf((Integer) tag) > indexOf) {
                        childCount = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        v0 f10 = zVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
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
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((Utilities.Callback) obj).run(this.m);
            }
            this.n = null;
        }
    }

    public final void b(se seVar) {
        v0 v0Var = this.m;
        if (v0Var != null) {
            seVar.run(v0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(seVar);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        v0 v0Var = this.m;
        if (v0Var != null) {
            v0Var.N = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        v0 v0Var = this.m;
        if (v0Var != null) {
            v0Var.O = true;
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
            v0 v0Var = this.m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}
