package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gd0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 D;
    public final dd0 E;
    public final dd0 F;
    public fd0 a;
    public final og.o b;
    public final og.f c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public AnimatorSet s;
    public AnimatorSet w;
    public float x;
    public final Paint y;

    public gd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.E = new dd0(this, 0);
        this.F = new dd0(this, 1);
        this.D = g6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.b = oVar;
        oVar.setListener(new vy(this, 2));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.c = fVar;
        fVar.setListener(new fi.h0(2, this));
        addView(fVar, c8.ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.b;
        oVar.b.setVisibility(4);
        CropAreaView cropAreaView = oVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z9, boolean z10, og.g gVar, i51 i51Var, org.telegram.messenger.ye yeVar) {
        org.telegram.messenger.ye yeVar2;
        requestLayout();
        this.f = false;
        this.e.w0(null);
        og.o oVar = this.b;
        ImageView imageView = oVar.b;
        oVar.y = z9;
        oVar.d = i51Var;
        oVar.e = gVar;
        oVar.K = i7;
        oVar.x = bitmap;
        CropAreaView cropAreaView = oVar.a;
        cropAreaView.setIsVideo(i51Var != null);
        if (bitmap == null && i51Var == null) {
            oVar.L = null;
            imageView.setImageDrawable(null);
            yeVar2 = yeVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.L;
            if (mVar == null || !z10) {
                oVar.L = new og.m(oVar, currentWidth, currentHeight);
                yeVar2 = yeVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new og.k(oVar, yeVar2, currentHeight, currentWidth, 1));
            } else {
                float f10 = currentWidth;
                mVar.e *= mVar.a / f10;
                mVar.a = f10;
                mVar.b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.k;
                og.o oVar2 = mVar.l;
                matrix.getValues(oVar2.H);
                matrix.reset();
                float f11 = mVar.e;
                matrix.postScale(f11, f11);
                float[] fArr = oVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                oVar2.r(false);
                yeVar2 = yeVar;
            }
            imageView.setImageBitmap(i51Var == null ? oVar.x : null);
        }
        og.f fVar = this.c;
        fVar.setFreeform(z9);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (yeVar2 != null) {
            fVar.b(yeVar2.d);
            fVar.setRotated(yeVar2.k != 0);
            fVar.setMirrored(yeVar2.l);
        } else {
            fVar.setRotated(false);
            fVar.setMirrored(false);
        }
        fVar.setVisibility(z9 ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        og.o oVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f && view == (oVar = this.b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.to0 to0Var = (org.telegram.ui.to0) this.a;
            to0Var.getClass();
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (((r1.R7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * to0Var.a.v8) + org.telegram.messenger.g0.L(16.0f))) - (L / 2));
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z9 = com.google.android.recaptcha.internal.a.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z9, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.h(canvas, null);
            float f14 = this.x;
            Paint paint = this.y;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ng, this.D));
            paint.setAlpha(Math.min(org.telegram.messenger.qs.e4, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(L2 + r1, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
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
        return this.b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        return (this.b.getCropTop() - org.telegram.messenger.g0.L(14.0f)) - (!this.d ? org.telegram.messenger.g0.m : 0);
    }

    public Bitmap getVideoThumb() {
        if (this.f && this.h) {
            return this.e.n();
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
            if (this.e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.to0) this.a).o();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        og.m mVar;
        super.onLayout(z9, i7, i10, i11, i12);
        og.o oVar = this.b;
        CropAreaView cropAreaView = oVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (mVar = oVar.L) == null) {
            return;
        }
        cropAreaView.a(oVar.h, mVar.a / mVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(oVar.f);
        og.m.g(oVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        oVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.to0) this.a).o();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.b.setAspectRatio(f10);
    }

    public void setDelegate(fd0 fd0Var) {
        this.a = fd0Var;
    }

    public void setFreeform(boolean z9) {
        this.b.setFreeform(z9);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z9) {
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, z9 ? 1.0f : 0.0f));
        this.w.setDuration(180L);
        this.w.addListener(new ed0(this, 1));
        this.w.start();
    }
}
