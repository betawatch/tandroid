package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class og0 {
    public int a;
    public final nc b;
    public final y5 e;
    public Drawable i;
    public Drawable j;
    public oi0 k;
    public pz0 l;
    public t80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ rg0 y;
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

    public og0(rg0 rg0Var) {
        this.y = rg0Var;
        this.b = new nc(rg0Var);
        this.e = new y5(rg0Var, 0L, 250L, er.f);
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
        pz0 pz0Var = new pz0(str, 11.0f, AndroidUtilities.bold());
        pz0Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pz0Var.a();
        this.l = pz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        rg0 rg0Var = this.y;
        if (i10 != 0) {
            oi0 oi0Var = new oi0(i10, String.valueOf(i10), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            oi0Var.r0 = rg0Var;
            oi0Var.start();
            this.k = oi0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? rg0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? rg0Var.getResources().getDrawable(i12).mutate() : null;
        oi0 oi0Var2 = this.k;
        Rect rect = this.h;
        if (oi0Var2 != null) {
            oi0Var2.setBounds(rect);
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

    public og0(rg0 rg0Var, pg0 pg0Var) {
        this.y = rg0Var;
        this.b = new nc(rg0Var);
        this.e = new y5(rg0Var, 0L, 250L, er.f);
        d(0, pg0Var.b, pg0Var.c);
        c(LocaleController.getString(pg0Var.a));
    }
}
