package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class nh0 {
    public int a;
    public final zc b;
    public final e6 e;
    public Drawable i;
    public Drawable j;
    public kj0 k;
    public v01 l;
    public t90 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ qh0 y;
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

    public nh0(qh0 qh0Var) {
        this.y = qh0Var;
        this.b = new zc(qh0Var);
        this.e = new e6(qh0Var, 0L, 250L, sr.f);
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
        v01 v01Var = new v01(str, 11.0f, AndroidUtilities.bold());
        v01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        v01Var.a();
        this.l = v01Var;
    }

    public final void d(int i10, int i11, int i12) {
        qh0 qh0Var = this.y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.k = kj0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? qh0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? qh0Var.getResources().getDrawable(i12).mutate() : null;
        kj0 kj0Var2 = this.k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
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

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.y = qh0Var;
        this.b = new zc(qh0Var);
        this.e = new e6(qh0Var, 0L, 250L, sr.f);
        d(0, oh0Var.b, oh0Var.c);
        c(LocaleController.getString(oh0Var.a));
    }
}
