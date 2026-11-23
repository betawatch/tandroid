package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.ui.me;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x {
    public y a;
    public int b;
    public int c;
    public CharSequence d;
    public int e;
    public Drawable f;
    public int g;
    public h6 h;
    public float i;
    public Boolean j;
    public Boolean k;
    public int l;
    public q0 m;
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
        q0 f10 = yVar.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
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
                ((y10) obj).a(this.m);
            }
            this.n = null;
        }
    }

    public final void b(me meVar) {
        q0 q0Var = this.m;
        if (q0Var != null) {
            meVar.a(q0Var);
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(meVar);
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

    public final void e(int i7) {
        if (this.l != i7) {
            this.l = i7;
            if (i7 == 0) {
                a();
            }
            q0 q0Var = this.m;
            if (q0Var != null) {
                q0Var.setVisibility(i7);
            }
        }
    }
}
