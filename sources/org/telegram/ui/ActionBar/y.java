package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.ui.me;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y {
    public z a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public i6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public r0 m;
    public ArrayList n;

    public final void a() {
        z zVar = this.a;
        if (this.m != null) {
            return;
        }
        int childCount = zVar.getChildCount();
        ArrayList arrayList = zVar.e;
        int i7 = 0;
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
        r0 f10 = zVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
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
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ((x10) obj).a(this.m);
            }
            this.n = null;
        }
    }

    public final void b(me meVar) {
        r0 r0Var = this.m;
        if (r0Var != null) {
            meVar.a(r0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(meVar);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        r0 r0Var = this.m;
        if (r0Var != null) {
            r0Var.S = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        r0 r0Var = this.m;
        if (r0Var != null) {
            r0Var.T = true;
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
