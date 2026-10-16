package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bi0 {
    public int a;
    public final ad b;
    public final g6 e;
    public Drawable i;
    public Drawable j;
    public yj0 k;
    public i11 l;
    public ha0 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ ei0 y;
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

    public bi0(ei0 ei0Var) {
        this.y = ei0Var;
        this.b = new ad(ei0Var);
        this.e = new g6(ei0Var, 0L, 250L, es.f);
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
        g6 g6Var = this.e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (this.n) {
            return g6Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        i11 i11Var = new i11(str, 11.0f, AndroidUtilities.bold());
        i11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var.a();
        this.l = i11Var;
    }

    public final void d(int i10, int i11, int i12) {
        ei0 ei0Var = this.y;
        if (i10 != 0) {
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yj0Var.R(ei0Var);
            yj0Var.start();
            this.k = yj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? ei0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? ei0Var.getResources().getDrawable(i12).mutate() : null;
        yj0 yj0Var2 = this.k;
        Rect rect = this.h;
        if (yj0Var2 != null) {
            yj0Var2.setBounds(rect);
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

    public bi0(ei0 ei0Var, ci0 ci0Var) {
        this.y = ei0Var;
        this.b = new ad(ei0Var);
        this.e = new g6(ei0Var, 0L, 250L, es.f);
        d(0, ci0Var.b, ci0Var.c);
        c(LocaleController.getString(ci0Var.a));
    }
}
