package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class kh0 {
    public int a;
    public final yc b;
    public final d6 e;
    public Drawable i;
    public Drawable j;
    public hj0 k;
    public u01 l;
    public o90 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ nh0 y;
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

    public kh0(nh0 nh0Var) {
        this.y = nh0Var;
        this.b = new yc(nh0Var);
        this.e = new d6(nh0Var, 0L, 250L, qr.f);
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
        u01 u01Var = new u01(str, 11.0f, AndroidUtilities.bold());
        u01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        u01Var.a();
        this.l = u01Var;
    }

    public final void d(int i10, int i11, int i12) {
        nh0 nh0Var = this.y;
        if (i10 != 0) {
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            hj0Var.R(nh0Var);
            hj0Var.start();
            this.k = hj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? nh0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? nh0Var.getResources().getDrawable(i12).mutate() : null;
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

    public kh0(nh0 nh0Var, lh0 lh0Var) {
        this.y = nh0Var;
        this.b = new yc(nh0Var);
        this.e = new d6(nh0Var, 0L, 250L, qr.f);
        d(0, lh0Var.b, lh0Var.c);
        c(LocaleController.getString(lh0Var.a));
    }
}
