package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vh0 {
    public int a;
    public final yc b;
    public final f6 e;
    public Drawable i;
    public Drawable j;
    public uj0 k;
    public d11 l;
    public ba0 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ yh0 y;
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

    public vh0(yh0 yh0Var) {
        this.y = yh0Var;
        this.b = new yc(yh0Var);
        this.e = new f6(yh0Var, 0L, 250L, bs.f);
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
        d11 d11Var = new d11(str, 11.0f, AndroidUtilities.bold());
        d11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d11Var.a();
        this.l = d11Var;
    }

    public final void d(int i10, int i11, int i12) {
        yh0 yh0Var = this.y;
        if (i10 != 0) {
            uj0 uj0Var = new uj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            uj0Var.R(yh0Var);
            uj0Var.start();
            this.k = uj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? yh0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? yh0Var.getResources().getDrawable(i12).mutate() : null;
        uj0 uj0Var2 = this.k;
        Rect rect = this.h;
        if (uj0Var2 != null) {
            uj0Var2.setBounds(rect);
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

    public vh0(yh0 yh0Var, wh0 wh0Var) {
        this.y = yh0Var;
        this.b = new yc(yh0Var);
        this.e = new f6(yh0Var, 0L, 250L, bs.f);
        d(0, wh0Var.b, wh0Var.c);
        c(LocaleController.getString(wh0Var.a));
    }
}
