package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ih0 {
    public int a;
    public final rc b;
    public final z5 e;
    public Drawable i;
    public Drawable j;
    public hj0 k;
    public k01 l;
    public k90 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ lh0 y;
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

    public ih0(lh0 lh0Var) {
        this.y = lh0Var;
        this.b = new rc(lh0Var);
        this.e = new z5(lh0Var, 0L, 250L, pr.f);
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
        boolean z4 = this.o;
        z5 z5Var = this.e;
        if (z4) {
            return 1.0f - z5Var.d(1.0f, false);
        }
        if (this.n) {
            return z5Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        k01 k01Var = new k01(str, 11.0f, AndroidUtilities.bold());
        k01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        k01Var.a();
        this.l = k01Var;
    }

    public final void d(int i10, int i11, int i12) {
        lh0 lh0Var = this.y;
        if (i10 != 0) {
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            hj0Var.s0 = lh0Var;
            hj0Var.start();
            this.k = hj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? lh0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? lh0Var.getResources().getDrawable(i12).mutate() : null;
        hj0 hj0Var2 = this.k;
        Rect rect = this.h;
        if (hj0Var2 != null) {
            hj0Var2.setBounds(rect);
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

    public ih0(lh0 lh0Var, jh0 jh0Var) {
        this.y = lh0Var;
        this.b = new rc(lh0Var);
        this.e = new z5(lh0Var, 0L, 250L, pr.f);
        d(0, jh0Var.b, jh0Var.c);
        c(LocaleController.getString(jh0Var.a));
    }
}
