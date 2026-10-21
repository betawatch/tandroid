package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wh0 {
    public int a;
    public final yc b;
    public final f6 e;
    public Drawable i;
    public Drawable j;
    public vj0 k;
    public f11 l;
    public ba0 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ zh0 y;
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

    public wh0(zh0 zh0Var) {
        this.y = zh0Var;
        this.b = new yc(zh0Var);
        this.e = new f6(zh0Var, 0L, 250L, bs.f);
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
        float f7 = rectF.left;
        RectF rectF2 = this.f;
        float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
        RectF rectF3 = this.d;
        rectF3.left = lerp;
        rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
    }

    public final float b() {
        boolean z10 = this.o;
        f6 f6Var = this.e;
        if (z10) {
            return 1.0f - f6Var.d(1.0f, false);
        }
        if (this.n) {
            return f6Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        f11 f11Var = new f11(str, 11.0f, AndroidUtilities.bold());
        f11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f11Var.a();
        this.l = f11Var;
    }

    public final void d(int i10, int i11, int i12) {
        zh0 zh0Var = this.y;
        if (i10 != 0) {
            vj0 vj0Var = new vj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            vj0Var.R(zh0Var);
            vj0Var.start();
            this.k = vj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? zh0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? zh0Var.getResources().getDrawable(i12).mutate() : null;
        vj0 vj0Var2 = this.k;
        Rect rect = this.h;
        if (vj0Var2 != null) {
            vj0Var2.setBounds(rect);
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

    public wh0(zh0 zh0Var, xh0 xh0Var) {
        this.y = zh0Var;
        this.b = new yc(zh0Var);
        this.e = new f6(zh0Var, 0L, 250L, bs.f);
        d(0, xh0Var.b, xh0Var.c);
        c(LocaleController.getString(xh0Var.a));
    }
}
