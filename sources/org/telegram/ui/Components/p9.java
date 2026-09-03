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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class p9 extends View {
    public Path B;
    public ColorMatrixColorFilter C;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public l5 e;
    public ColorFilter f;
    public z8 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public k01 y;

    public p9(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.w = true;
        ImageReceiver c3 = c();
        this.a = c3;
        c3.setCrossfadeByScale(0.0f);
        this.a.setAllowLoadingOnAttachedOnly(true);
        this.a.setDelegate(new t(this, 14));
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

    public l5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public z8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new z8((org.telegram.ui.ActionBar.f6) null);
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

    public final void j(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, int i10, Object obj) {
        m(imageLocation, str, imageLocation2, str2, null, null, i10, obj);
    }

    public final void k(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j10, String str3, Object obj, int i10) {
        this.a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(s61 s61Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (s61Var != null) {
            this.a.setImageBitmap(s61Var);
        } else {
            this.a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
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
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.a(this);
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
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        ColorFilter colorFilter;
        l5 l5Var = this.e;
        ImageReceiver imageReceiver = l5Var != null ? l5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (l5Var != null && (colorFilter = this.f) != null) {
            l5Var.setColorFilter(colorFilter);
        }
        int i11 = this.c;
        if (i11 == -1 || (i10 = this.d) == -1) {
            imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            if (this.s) {
                this.b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.v) {
            imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
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

    public final void p(int i10, int i11, boolean z4) {
        this.a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z4) {
        this.a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.a.setRoundRadius(i10, i11, i12, i13);
        if (this.s) {
            this.b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(l5 l5Var) {
        l5 l5Var2 = this.e;
        if (l5Var2 == l5Var) {
            return;
        }
        if (this.n && l5Var2 != null) {
            l5Var2.o(this);
        }
        this.e = l5Var;
        if (this.n && l5Var != null) {
            l5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z4) {
        this.a.setAspectFit(z4);
    }

    public void setBlurAllowed(boolean z4) {
        if (this.n) {
            throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
        }
        this.s = z4;
        if (z4) {
            this.b = new ImageReceiver();
        }
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.y = null;
            return;
        }
        this.y = new k01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.C == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.C = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z4) {
        if (z4 && !this.s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.r = z4;
        if (!z4) {
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

    public void setImageResource(int i10) {
        this.a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.a.setRoundRadius(i10);
        if (this.s) {
            this.b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a.getDrawable() || drawable == this.a.getImageDrawable() || super.verifyDrawable(drawable);
    }
}
