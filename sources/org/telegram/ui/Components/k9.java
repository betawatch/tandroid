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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class k9 extends View {
    public ly0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public g5 e;
    public ColorFilter f;
    public u8 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public ValueAnimator y;

    public k9(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.x = true;
        ImageReceiver c2 = c();
        this.a = c2;
        c2.o1 = 0.0f;
        c2.A1 = true;
        c2.h1 = new t(this, 14);
    }

    public final void a() {
        Bitmap n4;
        if (!this.r || this.b.n() != null || this.a.n() == null || (n4 = this.a.n()) == null || n4.isRecycled()) {
            return;
        }
        this.b.v0(Utilities.D(n4, false));
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

    public final void e(TLObject tLObject, u8 u8Var) {
        this.a.i0(tLObject, u8Var, null);
        d();
    }

    public final void g(int i3, long j10, Object obj, String str, String str2, String str3, org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2) {
        this.a.r0(acVar, str, acVar2, str2, null, j10, str3, obj, i3);
        d();
    }

    public g5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public u8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new u8((org.telegram.ui.ActionBar.e6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.a;
    }

    public int[] getRoundRadius() {
        return this.a.X0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        n(org.telegram.messenger.ac.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.ac acVar, String str, Drawable drawable, Object obj) {
        n(acVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.ac acVar, String str, String str2, Drawable drawable, Object obj) {
        n(acVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, String str2, int i3, Object obj) {
        n(acVar, str, acVar2, str2, null, null, i3, obj);
    }

    public final void m(org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, String str2, Drawable drawable, Object obj) {
        this.a.u0(acVar, str, acVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void n(org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, String str2, Drawable drawable, String str3, int i3, Object obj) {
        this.a.r0(acVar, str, acVar2, str2, drawable, i3, str3, obj, 0);
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
        g5 g5Var = this.e;
        if (g5Var != null) {
            g5Var.a(this);
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
        g5 g5Var = this.e;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i3;
        ColorFilter colorFilter;
        g5 g5Var = this.e;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (g5Var != null && (colorFilter = this.f) != null) {
            g5Var.setColorFilter(colorFilter);
        }
        int i10 = this.c;
        if (i10 == -1 || (i3 = this.d) == -1) {
            imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
            if (this.s) {
                this.b.y0(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.w) {
            imageReceiver.y0(0.0f, 0.0f, i10, i3);
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

    public final void p(org.telegram.messenger.ac acVar, String str, Drawable drawable, Object obj) {
        n(acVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(x41 x41Var, org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, org.telegram.messenger.ac acVar3, String str2, int i3, String str3) {
        if (x41Var != null) {
            this.a.w0(x41Var);
        } else {
            this.a.u0(acVar, str, acVar2, null, acVar3, str2, null, i3, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.a.G0(0, 0, true);
    }

    public final void s(int i3, int i10, boolean z10) {
        this.a.G0(i3, i10, true);
    }

    public void setAnimatedEmojiDrawable(g5 g5Var) {
        g5 g5Var2 = this.e;
        if (g5Var2 == g5Var) {
            return;
        }
        if (this.n && g5Var2 != null) {
            g5Var2.n(this);
        }
        this.e = g5Var;
        if (this.n && g5Var != null) {
            g5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.a.S0 = z10;
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
            this.E = null;
            return;
        }
        this.E = new ly0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.p1 = colorFilter;
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

    public void setImageResource(int i3) {
        this.a.w0(getResources().getDrawable(i3));
        invalidate();
        d();
    }

    public void setLayerNum(int i3) {
        this.a.E0(i3);
    }

    public void setRoundRadius(int i3) {
        this.a.J0(i3);
        if (this.s) {
            this.b.J0(i3);
        }
        invalidate();
    }

    public final void t(int i3, int i10, int i11, int i12) {
        this.a.K0(i3, i10, i11, i12);
        if (this.s) {
            this.b.K0(i3, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i3, int i10) {
        this.c = i3;
        this.d = i10;
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a.t() || drawable == this.a.T || super.verifyDrawable(drawable);
    }
}
