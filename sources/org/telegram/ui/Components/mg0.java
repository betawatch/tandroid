package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mg0 {
    public int a;
    public final pc b;
    public final y5 e;
    public Drawable i;
    public Drawable j;
    public mi0 k;
    public nz0 l;
    public p80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ pg0 y;
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Rect h = new Rect();
    public float m = 1.0f;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public final float q = 1.0f;
    public int v = 0;

    public mg0(pg0 pg0Var) {
        this.y = pg0Var;
        this.b = new pc(pg0Var);
        this.e = new y5(pg0Var, 0L, 250L, gr.f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d == 1.0f) {
            this.n = false;
            if (this.o) {
                this.p = true;
                return;
            }
            return;
        }
        RectF rectF = this.g;
        float f10 = rectF.left;
        RectF rectF2 = this.f;
        float lerp = AndroidUtilities.lerp(f10, rectF2.left, d);
        RectF rectF3 = this.d;
        rectF3.left = lerp;
        rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
    }

    public final float b() {
        boolean z10 = this.o;
        y5 y5Var = this.e;
        if (z10) {
            return 1.0f - y5Var.d(1.0f, false);
        }
        if (this.n) {
            return y5Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        nz0 nz0Var = new nz0(str, 11.0f, AndroidUtilities.bold());
        nz0Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        nz0Var.a();
        this.l = nz0Var;
    }

    public final void d(int i9, int i10, int i11) {
        pg0 pg0Var = this.y;
        if (i9 != 0) {
            mi0 mi0Var = new mi0(i9, String.valueOf(i9), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            mi0Var.r0 = pg0Var;
            mi0Var.start();
            this.k = mi0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? pg0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? pg0Var.getResources().getDrawable(i11).mutate() : null;
        mi0 mi0Var2 = this.k;
        Rect rect = this.h;
        if (mi0Var2 != null) {
            mi0Var2.setBounds(rect);
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public mg0(pg0 pg0Var, ng0 ng0Var) {
        this.y = pg0Var;
        this.b = new pc(pg0Var);
        this.e = new y5(pg0Var, 0L, 250L, gr.f);
        d(0, ng0Var.b, ng0Var.c);
        c(LocaleController.getString(ng0Var.a));
    }
}
