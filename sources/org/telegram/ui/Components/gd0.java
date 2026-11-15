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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gd0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 E;
    public final dd0 F;
    public final dd0 G;
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

    public gd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.F = new dd0(this, 0);
        this.G = new dd0(this, 1);
        this.E = e6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.b = oVar;
        oVar.setListener(new org.telegram.messenger.ou(this, 9));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.c = fVar;
        fVar.setListener(new hi.h0(2, this));
        addView(fVar, c8.ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.b;
        oVar.b.setVisibility(4);
        CropAreaView cropAreaView = oVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z10, boolean z11, og.g gVar, k51 k51Var, org.telegram.messenger.xe xeVar) {
        org.telegram.messenger.xe xeVar2;
        requestLayout();
        this.f = false;
        this.e.w0(null);
        og.o oVar = this.b;
        ImageView imageView = oVar.b;
        oVar.y = z10;
        oVar.d = k51Var;
        oVar.e = gVar;
        oVar.L = i7;
        oVar.x = bitmap;
        CropAreaView cropAreaView = oVar.a;
        cropAreaView.setIsVideo(k51Var != null);
        if (bitmap == null && k51Var == null) {
            oVar.M = null;
            imageView.setImageDrawable(null);
            xeVar2 = xeVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.M;
            if (mVar == null || !z11) {
                oVar.M = new og.m(oVar, currentWidth, currentHeight);
                xeVar2 = xeVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new og.k(oVar, xeVar2, currentHeight, currentWidth, 1));
            } else {
                float f10 = currentWidth;
                mVar.e *= mVar.a / f10;
                mVar.a = f10;
                mVar.b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.k;
                og.o oVar2 = mVar.l;
                matrix.getValues(oVar2.I);
                matrix.reset();
                float f11 = mVar.e;
                matrix.postScale(f11, f11);
                float[] fArr = oVar2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                oVar2.r(false);
                xeVar2 = xeVar;
            }
            imageView.setImageBitmap(k51Var == null ? oVar.x : null);
        }
        og.f fVar = this.c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (xeVar2 != null) {
            fVar.b(xeVar2.d);
            fVar.setRotated(xeVar2.k != 0);
            fVar.setMirrored(xeVar2.l);
        } else {
            fVar.setRotated(false);
            fVar.setMirrored(false);
        }
        fVar.setVisibility(z10 ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        og.o oVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f && view == (oVar = this.b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.po0 po0Var = (org.telegram.ui.po0) this.a;
            po0Var.getClass();
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (((r1.S7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * po0Var.a.w8) + org.telegram.messenger.g0.L(16.0f))) - (L / 2));
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z10, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.h(canvas, null);
            float f14 = this.x;
            Paint paint = this.y;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qg, this.E));
            paint.setAlpha(Math.min(org.telegram.messenger.ns.e4, (int) (this.r * 255.0f * this.n)));
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
                    ((org.telegram.ui.po0) this.a).o();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        og.m mVar;
        super.onLayout(z10, i7, i10, i11, i12);
        og.o oVar = this.b;
        CropAreaView cropAreaView = oVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (mVar = oVar.M) == null) {
            return;
        }
        cropAreaView.a(oVar.h, mVar.a / mVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(oVar.f);
        og.m.g(oVar.M, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        oVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.po0) this.a).o();
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

    public void setFreeform(boolean z10) {
        this.b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, z10 ? 1.0f : 0.0f));
        this.w.setDuration(180L);
        this.w.addListener(new ed0(this, 1));
        this.w.start();
    }
}
