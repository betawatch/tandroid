package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bh0 {
    public int a;
    public final wc b;
    public final c6 e;
    public Drawable i;
    public Drawable j;
    public yi0 k;
    public h01 l;
    public g90 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ eh0 y;
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

    public bh0(eh0 eh0Var) {
        this.y = eh0Var;
        this.b = new wc(eh0Var);
        this.e = new c6(eh0Var, 0L, 250L, qr.f);
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
        c6 c6Var = this.e;
        if (z10) {
            return 1.0f - c6Var.d(1.0f, false);
        }
        if (this.n) {
            return c6Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        h01 h01Var = new h01(str, 11.0f, AndroidUtilities.bold());
        h01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h01Var.a();
        this.l = h01Var;
    }

    public final void d(int i10, int i11, int i12) {
        eh0 eh0Var = this.y;
        if (i10 != 0) {
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yi0Var.R(eh0Var);
            yi0Var.start();
            this.k = yi0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? eh0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? eh0Var.getResources().getDrawable(i12).mutate() : null;
        yi0 yi0Var2 = this.k;
        Rect rect = this.h;
        if (yi0Var2 != null) {
            yi0Var2.setBounds(rect);
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

    public bh0(eh0 eh0Var, ch0 ch0Var) {
        this.y = eh0Var;
        this.b = new wc(eh0Var);
        this.e = new c6(eh0Var, 0L, 250L, qr.f);
        d(0, ch0Var.b, ch0Var.c);
        c(LocaleController.getString(ch0Var.a));
    }
}
