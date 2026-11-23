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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class p9 extends View {
    public wy0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public o5 e;
    public ColorFilter f;
    public a9 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public ValueAnimator y;

    public p9(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.x = true;
        ImageReceiver c10 = c();
        this.a = c10;
        c10.o1 = 0.0f;
        c10.A1 = true;
        c10.h1 = new b0(this, 13);
    }

    public final void a() {
        Bitmap n10;
        if (!this.r || this.b.n() != null || this.a.n() == null || (n10 = this.a.n()) == null || n10.isRecycled()) {
            return;
        }
        this.b.w0(Utilities.D(n10, false));
        invalidate();
    }

    public final void b() {
        this.a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void e() {
        if (this.r) {
            if (this.b.n() != null && !this.b.n().isRecycled()) {
                this.b.n().recycle();
            }
            this.b.x0(null);
            a();
        }
    }

    public final void f(TLObject tLObject, a9 a9Var) {
        this.a.j0(tLObject, a9Var, null);
        e();
    }

    public final void g(int i7, long j3, Object obj, String str, String str2, String str3, org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2) {
        this.a.s0(fcVar, str, fcVar2, str2, null, j3, str3, obj, i7);
        e();
    }

    public o5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public a9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new a9((org.telegram.ui.ActionBar.i6) null);
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
        n(org.telegram.messenger.fc.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.fc fcVar, String str, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.fc fcVar, String str, String str2, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, int i7, Object obj) {
        n(fcVar, str, fcVar2, str2, null, null, i7, obj);
    }

    public final void m(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, Drawable drawable, Object obj) {
        this.a.v0(fcVar, str, fcVar2, str2, null, null, drawable, 0L, null, obj, 1);
        e();
    }

    public final void n(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, Drawable drawable, String str3, int i7, Object obj) {
        this.a.s0(fcVar, str, fcVar2, str2, drawable, i7, str3, obj, 0);
        e();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        if (this.x) {
            this.a.Q();
        }
        if (this.s) {
            this.b.Q();
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        if (this.x) {
            this.a.S();
        }
        if (this.s) {
            this.b.S();
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i7;
        ColorFilter colorFilter;
        o5 o5Var = this.e;
        ImageReceiver imageReceiver = o5Var != null ? o5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (o5Var != null && (colorFilter = this.f) != null) {
            o5Var.setColorFilter(colorFilter);
        }
        int i10 = this.c;
        if (i10 == -1 || (i7 = this.d) == -1) {
            imageReceiver.z0(0.0f, 0.0f, getWidth(), getHeight());
            if (this.s) {
                this.b.z0(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.w) {
            imageReceiver.z0(0.0f, 0.0f, i10, i7);
            if (this.s) {
                this.b.z0(0.0f, 0.0f, this.c, this.d);
            }
        } else {
            float width = (getWidth() - this.c) / 2;
            int height = getHeight();
            imageReceiver.z0(width, (height - r3) / 2, this.c, this.d);
            if (this.s) {
                ImageReceiver imageReceiver2 = this.b;
                float width2 = (getWidth() - this.c) / 2;
                int height2 = getHeight();
                imageReceiver2.z0(width2, (height2 - r4) / 2, this.c, this.d);
            }
        }
        imageReceiver.h(canvas, null);
        if (this.s) {
            this.b.h(canvas, null);
        }
    }

    public final void p(org.telegram.messenger.fc fcVar, String str, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(s51 s51Var, org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, org.telegram.messenger.fc fcVar3, String str2, int i7, String str3) {
        if (s51Var != null) {
            this.a.x0(s51Var);
        } else {
            this.a.v0(fcVar, str, fcVar2, null, fcVar3, str2, null, i7, null, str3, 1);
        }
        e();
    }

    public final void r() {
        this.a.H0(0, 0, true);
    }

    public final void s(int i7, int i10, boolean z10) {
        this.a.H0(i7, i10, true);
    }

    public void setAnimatedEmojiDrawable(o5 o5Var) {
        o5 o5Var2 = this.e;
        if (o5Var2 == o5Var) {
            return;
        }
        if (this.n && o5Var2 != null) {
            o5Var2.n(this);
        }
        this.e = o5Var;
        if (this.n && o5Var != null) {
            o5Var.a(this);
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
        this.E = new wy0(charSequence, 16.5f, org.telegram.messenger.g0.o());
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
            this.b.x0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.a.w0(bitmap);
        e();
    }

    public void setImageDrawable(Drawable drawable) {
        this.a.x0(drawable);
        e();
    }

    public void setImageResource(int i7) {
        this.a.x0(getResources().getDrawable(i7));
        invalidate();
        e();
    }

    public void setLayerNum(int i7) {
        this.a.F0(i7);
    }

    public void setRoundRadius(int i7) {
        this.a.K0(i7);
        if (this.s) {
            this.b.K0(i7);
        }
        invalidate();
    }

    public final void t(int i7, int i10, int i11, int i12) {
        this.a.L0(i7, i10, i11, i12);
        if (this.s) {
            this.b.L0(i7, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i7, int i10) {
        this.c = i7;
        this.d = i10;
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a.t() || drawable == this.a.T || super.verifyDrawable(drawable);
    }
}
