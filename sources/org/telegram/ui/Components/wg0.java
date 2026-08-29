package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wg0 {
    public int a;
    public final uc b;
    public final d6 e;
    public Drawable i;
    public Drawable j;
    public xi0 k;
    public zz0 l;
    public c90 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ zg0 y;
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

    public wg0(zg0 zg0Var) {
        this.y = zg0Var;
        this.b = new uc(zg0Var);
        this.e = new d6(zg0Var, 0L, 250L, jr.f);
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
        float f9 = rectF.left;
        RectF rectF2 = this.f;
        float lerp = AndroidUtilities.lerp(f9, rectF2.left, d);
        RectF rectF3 = this.d;
        rectF3.left = lerp;
        rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
    }

    public final float b() {
        boolean z10 = this.o;
        d6 d6Var = this.e;
        if (z10) {
            return 1.0f - d6Var.d(1.0f, false);
        }
        if (this.n) {
            return d6Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        zz0 zz0Var = new zz0(str, 11.0f, AndroidUtilities.bold());
        zz0Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        zz0Var.a();
        this.l = zz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        zg0 zg0Var = this.y;
        if (i10 != 0) {
            xi0 xi0Var = new xi0(i10, String.valueOf(i10), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xi0Var.r0 = zg0Var;
            xi0Var.start();
            this.k = xi0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? zg0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? zg0Var.getResources().getDrawable(i12).mutate() : null;
        xi0 xi0Var2 = this.k;
        Rect rect = this.h;
        if (xi0Var2 != null) {
            xi0Var2.setBounds(rect);
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

    public wg0(zg0 zg0Var, xg0 xg0Var) {
        this.y = zg0Var;
        this.b = new uc(zg0Var);
        this.e = new d6(zg0Var, 0L, 250L, jr.f);
        d(0, xg0Var.b, xg0Var.c);
        c(LocaleController.getString(xg0Var.a));
    }
}
