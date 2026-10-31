package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class g9 extends View {
    public qz0 D;
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public f5 e;
    public ColorFilter f;
    public r8 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public ValueAnimator y;

    public g9(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.x = true;
        ImageReceiver c10 = c();
        this.a = c10;
        c10.n1 = 0.0f;
        c10.z1 = true;
        c10.g1 = new t(this, 14);
    }

    public final void a() {
        Bitmap n10;
        if (!this.r || this.b.n() != null || this.a.n() == null || (n10 = this.a.n()) == null || n10.isRecycled()) {
            return;
        }
        this.b.v0(Utilities.D(n10, false));
        invalidate();
    }

    public final void b() {
        this.a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.r) {
            if (this.b.n() != null && !this.b.n().isRecycled()) {
                this.b.n().recycle();
            }
            this.b.w0(null);
            a();
        }
    }

    public final void e(TLObject tLObject, r8 r8Var) {
        this.a.i0(tLObject, r8Var, null);
        d();
    }

    public final void g(int i10, long j10, Object obj, String str, String str2, String str3, org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2) {
        this.a.r0(icVar, str, icVar2, str2, null, j10, str3, obj, i10);
        d();
    }

    public f5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public r8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new r8((org.telegram.ui.ActionBar.p6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.a;
    }

    public int[] getRoundRadius() {
        return this.a.W0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        o(org.telegram.messenger.ic.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.ic icVar, String str, Drawable drawable, Object obj) {
        o(icVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.ic icVar, String str, String str2, Drawable drawable, Object obj) {
        o(icVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, String str2, int i10, Object obj) {
        o(icVar, str, icVar2, str2, null, null, i10, obj);
    }

    public final void m(org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, String str2, Drawable drawable, Object obj) {
        this.a.u0(icVar, str, icVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void o(org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.a.r0(icVar, str, icVar2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        if (this.x) {
            this.a.P();
        }
        if (this.s) {
            this.b.P();
        }
        f5 f5Var = this.e;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        if (this.x) {
            this.a.R();
        }
        if (this.s) {
            this.b.R();
        }
        f5 f5Var = this.e;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        ColorFilter colorFilter;
        f5 f5Var = this.e;
        ImageReceiver imageReceiver = f5Var != null ? f5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (f5Var != null && (colorFilter = this.f) != null) {
            f5Var.setColorFilter(colorFilter);
        }
        int i11 = this.c;
        if (i11 == -1 || (i10 = this.d) == -1) {
            imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
            if (this.s) {
                this.b.y0(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.w) {
            imageReceiver.y0(0.0f, 0.0f, i11, i10);
            if (this.s) {
                this.b.y0(0.0f, 0.0f, this.c, this.d);
            }
        } else {
            float width = (getWidth() - this.c) / 2;
            int height = getHeight();
            imageReceiver.y0(width, (height - r3) / 2, this.c, this.d);
            if (this.s) {
                ImageReceiver imageReceiver2 = this.b;
                float width2 = (getWidth() - this.c) / 2;
                int height2 = getHeight();
                imageReceiver2.y0(width2, (height2 - r4) / 2, this.c, this.d);
            }
        }
        imageReceiver.h(canvas, null);
        if (this.s) {
            this.b.h(canvas, null);
        }
    }

    public final void p(org.telegram.messenger.ic icVar, String str, Drawable drawable, Object obj) {
        o(icVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(g61 g61Var, org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, org.telegram.messenger.ic icVar3, String str2, int i10, String str3) {
        if (g61Var != null) {
            this.a.w0(g61Var);
        } else {
            this.a.u0(icVar, str, icVar2, null, icVar3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.a.G0(0, 0, true);
    }

    public final void s(int i10, int i11, boolean z10) {
        this.a.G0(i10, i11, true);
    }

    public void setAnimatedEmojiDrawable(f5 f5Var) {
        f5 f5Var2 = this.e;
        if (f5Var2 == f5Var) {
            return;
        }
        if (this.n && f5Var2 != null) {
            f5Var2.n(this);
        }
        this.e = f5Var;
        if (this.n && f5Var != null) {
            f5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.a.R0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (this.n) {
            throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
        }
        this.s = z10;
        if (z10) {
            this.b = new ImageReceiver(null);
        }
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.D = null;
            return;
        }
        this.D = new qz0(charSequence, 16.5f, org.telegram.messenger.i0.o());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.i0.h(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.o1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.r = z10;
        if (!z10) {
            if (this.b.n() != null && !this.b.n().isRecycled()) {
                this.b.n().recycle();
            }
            this.b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.a.v0(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.a.w0(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.a.w0(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.a.E0(i10);
    }

    public void setRoundRadius(int i10) {
        this.a.J0(i10);
        if (this.s) {
            this.b.J0(i10);
        }
        invalidate();
    }

    public final void t(int i10, int i11, int i12, int i13) {
        this.a.K0(i10, i11, i12, i13);
        if (this.s) {
            this.b.K0(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void u(int i10, int i11) {
        this.c = i10;
        this.d = i11;
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a.t() || drawable == this.a.S || super.verifyDrawable(drawable);
    }
}
