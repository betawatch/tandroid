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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class o9 extends View {
    public Path A;
    public ColorMatrixColorFilter B;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public k5 e;
    public ColorFilter f;
    public z8 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public nz0 y;

    public o9(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.w = true;
        ImageReceiver c10 = c();
        this.a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.a.setAllowLoadingOnAttachedOnly(true);
        this.a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (!this.r || this.b.getBitmap() != null || this.a.getBitmap() == null || (bitmap = this.a.getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        this.b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
        invalidate();
    }

    public final void b() {
        this.a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.r) {
            if (this.b.getBitmap() != null && !this.b.getBitmap().isRecycled()) {
                this.b.getBitmap().recycle();
            }
            this.b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, z8 z8Var) {
        this.a.setForUserOrChat(tLObject, z8Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public k5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public z8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new z8((org.telegram.ui.ActionBar.b6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.a;
    }

    public int[] getRoundRadius() {
        return this.a.getRoundRadius();
    }

    public final void h(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void i(ImageLocation imageLocation, String str, String str2, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, str2, 0, obj);
    }

    public final void j(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, int i9, Object obj) {
        m(imageLocation, str, imageLocation2, str2, null, null, i9, obj);
    }

    public final void k(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j10, String str3, Object obj, int i9) {
        this.a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i9);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i9, Object obj) {
        this.a.setImage(imageLocation, str, imageLocation2, str2, drawable, i9, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(u51 u51Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i9, String str3) {
        if (u51Var != null) {
            this.a.setImageBitmap(u51Var);
        } else {
            this.a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i9, null, str3, 1);
        }
        d();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        if (this.w) {
            this.a.onAttachedToWindow();
        }
        if (this.s) {
            this.b.onAttachedToWindow();
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        if (this.w) {
            this.a.onDetachedFromWindow();
        }
        if (this.s) {
            this.b.onDetachedFromWindow();
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.o(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        ColorFilter colorFilter;
        k5 k5Var = this.e;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (k5Var != null && (colorFilter = this.f) != null) {
            k5Var.setColorFilter(colorFilter);
        }
        int i10 = this.c;
        if (i10 == -1 || (i9 = this.d) == -1) {
            imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            if (this.s) {
                this.b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.v) {
            imageReceiver.setImageCoords(0.0f, 0.0f, i10, i9);
            if (this.s) {
                this.b.setImageCoords(0.0f, 0.0f, this.c, this.d);
            }
        } else {
            float width = (getWidth() - this.c) / 2;
            int height = getHeight();
            imageReceiver.setImageCoords(width, (height - r3) / 2, this.c, this.d);
            if (this.s) {
                ImageReceiver imageReceiver2 = this.b;
                float width2 = (getWidth() - this.c) / 2;
                int height2 = getHeight();
                imageReceiver2.setImageCoords(width2, (height2 - r4) / 2, this.c, this.d);
            }
        }
        imageReceiver.draw(canvas);
        if (this.s) {
            this.b.draw(canvas);
        }
    }

    public final void p(int i9, int i10, boolean z10) {
        this.a.setOrientation(i9, i10, true);
    }

    public final void q(int i9, boolean z10) {
        this.a.setOrientation(0, true);
    }

    public final void r(int i9, int i10, int i11, int i12) {
        this.a.setRoundRadius(i9, i10, i11, i12);
        if (this.s) {
            this.b.setRoundRadius(i9, i10, i11, i12);
        }
        invalidate();
    }

    public final void s(int i9, int i10) {
        this.c = i9;
        this.d = i10;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        k5 k5Var2 = this.e;
        if (k5Var2 == k5Var) {
            return;
        }
        if (this.n && k5Var2 != null) {
            k5Var2.o(this);
        }
        this.e = k5Var;
        if (this.n && k5Var != null) {
            k5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (this.n) {
            throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
        }
        this.s = z10;
        if (z10) {
            this.b = new ImageReceiver();
        }
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.y = null;
            return;
        }
        this.y = new nz0(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.B == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.B = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
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
            if (this.b.getBitmap() != null && !this.b.getBitmap().isRecycled()) {
                this.b.getBitmap().recycle();
            }
            this.b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i9) {
        this.a.setImageBitmap(getResources().getDrawable(i9));
        invalidate();
        d();
    }

    public void setLayerNum(int i9) {
        this.a.setLayerNum(i9);
    }

    public void setRoundRadius(int i9) {
        this.a.setRoundRadius(i9);
        if (this.s) {
            this.b.setRoundRadius(i9);
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a.getDrawable() || drawable == this.a.getImageDrawable() || super.verifyDrawable(drawable);
    }
}
