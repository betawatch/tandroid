package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yh0 {
    public int a;
    public final xc b;
    public final h6 e;
    public Drawable i;
    public Drawable j;
    public xj0 k;
    public q11 l;
    public da0 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ bi0 y;
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

    public yh0(bi0 bi0Var) {
        this.y = bi0Var;
        this.b = new xc(bi0Var);
        this.e = new h6(bi0Var, 0L, 250L, ds.f);
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
        h6 h6Var = this.e;
        if (z10) {
            return 1.0f - h6Var.d(1.0f, false);
        }
        if (this.n) {
            return h6Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        q11 q11Var = new q11(str, 11.0f, AndroidUtilities.bold());
        q11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        q11Var.a();
        this.l = q11Var;
    }

    public final void d(int i10, int i11, int i12) {
        bi0 bi0Var = this.y;
        if (i10 != 0) {
            xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xj0Var.R(bi0Var);
            xj0Var.start();
            this.k = xj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? bi0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? bi0Var.getResources().getDrawable(i12).mutate() : null;
        xj0 xj0Var2 = this.k;
        Rect rect = this.h;
        if (xj0Var2 != null) {
            xj0Var2.setBounds(rect);
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

    public yh0(bi0 bi0Var, zh0 zh0Var) {
        this.y = bi0Var;
        this.b = new xc(bi0Var);
        this.e = new h6(bi0Var, 0L, 250L, ds.f);
        d(0, zh0Var.b, zh0Var.c);
        c(LocaleController.getString(zh0Var.a));
    }
}
