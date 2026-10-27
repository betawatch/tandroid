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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pf0 extends FrameLayout {
    public final mf0 E;
    public final mf0 F;
    public of0 a;
    public final ng.p b;
    public final ng.f c;
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
    public final org.telegram.ui.ActionBar.u6 y;

    public pf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.u6 u6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.w = 0.0f;
        this.x = new Paint(1);
        this.E = new mf0(this, 0);
        this.F = new mf0(this, 1);
        this.y = u6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        ng.p pVar = new ng.p(contextThemeWrapper);
        this.b = pVar;
        pVar.setListener(new li.h5(this));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        ng.f fVar = new ng.f(contextThemeWrapper);
        this.c = fVar;
        fVar.setListener(new fi.h0(2, this));
        addView(fVar, kb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        ng.p pVar = this.b;
        pVar.b.setVisibility(4);
        CropAreaView cropAreaView = pVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, ng.g gVar, i81 i81Var, MediaController.CropState cropState) {
        requestLayout();
        this.f = false;
        this.e.setImageBitmap((Drawable) null);
        ng.p pVar = this.b;
        ImageView imageView = pVar.b;
        pVar.x = z10;
        pVar.d = i81Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.w = bitmap;
        CropAreaView cropAreaView = pVar.a;
        cropAreaView.setIsVideo(i81Var != null);
        if (bitmap == null && i81Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            ng.n nVar = pVar.L;
            if (nVar == null || !z11) {
                pVar.L = new ng.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new ng.l(pVar, cropState, currentHeight, currentWidth));
            } else {
                float f7 = currentWidth;
                nVar.e *= nVar.a / f7;
                nVar.a = f7;
                nVar.b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.k;
                ng.p pVar2 = nVar.l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            }
            imageView.setImageBitmap(i81Var == null ? pVar.w : null);
        }
        ng.f fVar = this.c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            fVar.setRotated(cropState.transformRotation != 0);
            fVar.setMirrored(cropState.mirrored);
        } else {
            fVar.setRotated(false);
            fVar.setMirrored(false);
        }
        fVar.setVisibility(z10 ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ng.p pVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f && view == (pVar = this.b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.is0 is0Var = (org.telegram.ui.is0) this.a;
            is0Var.getClass();
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (((r1.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * is0Var.a.w8) + AndroidUtilities.dp(16.0f))) - (dp / 2));
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = c3.h0.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.draw(canvas);
            float f13 = this.w;
            Paint paint = this.x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zf, this.y));
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
                    ((org.telegram.ui.is0) this.a).e();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ng.n nVar;
        super.onLayout(z10, i10, i11, i12, i13);
        ng.p pVar = this.b;
        CropAreaView cropAreaView = pVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (nVar = pVar.L) == null) {
            return;
        }
        cropAreaView.a(pVar.h, nVar.a / nVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(pVar.f);
        ng.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        pVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.is0) this.a).e();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.b.setAspectRatio(f7);
    }

    public void setDelegate(of0 of0Var) {
        this.a = of0Var;
    }

    public void setFreeform(boolean z10) {
        this.b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.w = f7;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.v = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, z10 ? 1.0f : 0.0f));
        this.v.setDuration(180L);
        this.v.addListener(new nf0(this, 1));
        this.v.start();
    }
}
