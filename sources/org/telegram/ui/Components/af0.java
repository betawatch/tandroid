package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class af0 extends FrameLayout {
    public final we0 B;
    public final we0 C;
    public ze0 a;
    public final zf.n b;
    public final zf.e c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public AnimatorSet s;
    public AnimatorSet v;
    public float w;
    public final Paint x;
    public final org.telegram.ui.ActionBar.g6 y;

    public af0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.w = 0.0f;
        this.x = new Paint(1);
        this.B = new we0(this, 0);
        this.C = new we0(this, 1);
        this.y = g6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        zf.n nVar = new zf.n(contextThemeWrapper);
        this.b = nVar;
        nVar.setListener(new androidx.biometric.f0(this, 27));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.e = new ImageReceiver(this);
        zf.e eVar = new zf.e(contextThemeWrapper);
        this.c = eVar;
        eVar.setListener(new xe0(0, this));
        addView(eVar, k7.c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        zf.n nVar = this.b;
        nVar.b.setVisibility(4);
        CropAreaView cropAreaView = nVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z4, boolean z10, zf.f fVar, x61 x61Var, MediaController.CropState cropState) {
        requestLayout();
        this.f = false;
        this.e.setImageBitmap((Drawable) null);
        zf.n nVar = this.b;
        ImageView imageView = nVar.b;
        nVar.x = z4;
        nVar.d = x61Var;
        nVar.e = fVar;
        nVar.H = i10;
        nVar.w = bitmap;
        CropAreaView cropAreaView = nVar.a;
        cropAreaView.setIsVideo(x61Var != null);
        if (bitmap == null && x61Var == null) {
            nVar.I = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            zf.l lVar = nVar.I;
            if (lVar == null || !z10) {
                nVar.I = new zf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new zf.j(nVar, cropState, currentHeight, currentWidth));
            } else {
                float f10 = currentWidth;
                lVar.e *= lVar.a / f10;
                lVar.a = f10;
                lVar.b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.k;
                zf.n nVar2 = lVar.l;
                matrix.getValues(nVar2.E);
                matrix.reset();
                float f11 = lVar.e;
                matrix.postScale(f11, f11);
                float[] fArr = nVar2.E;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            }
            imageView.setImageBitmap(x61Var == null ? nVar.w : null);
        }
        zf.e eVar = this.c;
        eVar.setFreeform(z4);
        eVar.b(0.0f);
        eVar.setMirrored(false);
        eVar.setRotated(false);
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            eVar.setRotated(cropState.transformRotation != 0);
            eVar.setMirrored(cropState.mirrored);
        } else {
            eVar.setRotated(false);
            eVar.setMirrored(false);
        }
        eVar.setVisibility(z4 ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zf.n nVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f && view == (nVar = this.b)) {
            RectF actualRect = nVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.es0 es0Var = (org.telegram.ui.es0) this.a;
            es0Var.getClass();
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (((r1.O7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * es0Var.a.s8) + AndroidUtilities.dp(16.0f))) - (dp / 2));
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f10 = actualRect.left;
            float f11 = this.r;
            float f12 = ((dp2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float w10 = e2.c.w(measuredHeight, f13, f11, f13);
            float width = ((dp - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f12, w10, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.draw(canvas);
            float f14 = this.w;
            Paint paint = this.x;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zf, this.y));
            paint.setAlpha(Math.min(255, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(dp2 + r1, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.b.getCropHeight();
    }

    public float getRectX() {
        return this.b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        return (this.b.getCropTop() - AndroidUtilities.dp(14.0f)) - (!this.d ? AndroidUtilities.statusBarHeight : 0);
    }

    public Bitmap getVideoThumb() {
        if (this.f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.es0) this.a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        zf.l lVar;
        super.onLayout(z4, i10, i11, i12, i13);
        zf.n nVar = this.b;
        CropAreaView cropAreaView = nVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (lVar = nVar.I) == null) {
            return;
        }
        cropAreaView.a(nVar.h, lVar.a / lVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(nVar.f);
        zf.l.g(nVar.I, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        nVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.es0) this.a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.b.setAspectRatio(f10);
    }

    public void setDelegate(ze0 ze0Var) {
        this.a = ze0Var;
    }

    public void setFreeform(boolean z4) {
        this.b.setFreeform(z4);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.w = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.v = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.C, z4 ? 1.0f : 0.0f));
        this.v.setDuration(180L);
        this.v.addListener(new ye0(this, 1));
        this.v.start();
    }
}
