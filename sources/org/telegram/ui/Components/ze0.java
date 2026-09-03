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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ze0 extends FrameLayout {
    public final ve0 B;
    public final ve0 C;
    public ye0 a;
    public final yf.n b;
    public final yf.e c;
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
    public final org.telegram.ui.ActionBar.f6 y;

    public ze0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.w = 0.0f;
        this.x = new Paint(1);
        this.B = new ve0(this, 0);
        this.C = new ve0(this, 1);
        this.y = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        yf.n nVar = new yf.n(contextThemeWrapper);
        this.b = nVar;
        nVar.setListener(new o3.c(this, 5));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.e = new ImageReceiver(this);
        yf.e eVar = new yf.e(contextThemeWrapper);
        this.c = eVar;
        eVar.setListener(new we0(0, this));
        addView(eVar, k7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        yf.n nVar = this.b;
        nVar.b.setVisibility(4);
        CropAreaView cropAreaView = nVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z4, boolean z10, yf.f fVar, w61 w61Var, MediaController.CropState cropState) {
        requestLayout();
        this.f = false;
        this.e.setImageBitmap((Drawable) null);
        yf.n nVar = this.b;
        ImageView imageView = nVar.b;
        nVar.x = z4;
        nVar.d = w61Var;
        nVar.e = fVar;
        nVar.H = i10;
        nVar.w = bitmap;
        CropAreaView cropAreaView = nVar.a;
        cropAreaView.setIsVideo(w61Var != null);
        if (bitmap == null && w61Var == null) {
            nVar.I = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            yf.l lVar = nVar.I;
            if (lVar == null || !z10) {
                nVar.I = new yf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new yf.j(nVar, cropState, currentHeight, currentWidth));
            } else {
                float f10 = currentWidth;
                lVar.e *= lVar.a / f10;
                lVar.a = f10;
                lVar.b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.k;
                yf.n nVar2 = lVar.l;
                matrix.getValues(nVar2.E);
                matrix.reset();
                float f11 = lVar.e;
                matrix.postScale(f11, f11);
                float[] fArr = nVar2.E;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            }
            imageView.setImageBitmap(w61Var == null ? nVar.w : null);
        }
        yf.e eVar = this.c;
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
        yf.n nVar;
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
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, this.y));
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
        yf.l lVar;
        super.onLayout(z4, i10, i11, i12, i13);
        yf.n nVar = this.b;
        CropAreaView cropAreaView = nVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (lVar = nVar.I) == null) {
            return;
        }
        cropAreaView.a(nVar.h, lVar.a / lVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(nVar.f);
        yf.l.g(nVar.I, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
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

    public void setDelegate(ye0 ye0Var) {
        this.a = ye0Var;
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
        this.v.addListener(new xe0(this, 1));
        this.v.start();
    }
}
