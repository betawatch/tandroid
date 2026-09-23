package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bh0 {
    public int a;
    public final yc b;
    public final e6 e;
    public Drawable i;
    public Drawable j;
    public yi0 k;
    public f01 l;
    public h90 r;
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
        this.b = new yc(eh0Var);
        this.e = new e6(eh0Var, 0L, 250L, rr.f);
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
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (this.n) {
            return e6Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        f01 f01Var = new f01(str, 11.0f, AndroidUtilities.bold());
        f01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        this.l = f01Var;
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
        this.b = new yc(eh0Var);
        this.e = new e6(eh0Var, 0L, 250L, rr.f);
        d(0, ch0Var.b, ch0Var.c);
        c(LocaleController.getString(ch0Var.a));
    }
}
