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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class be0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 D;
    public final xd0 E;
    public final xd0 F;
    public ae0 a;
    public final eg.q b;
    public final eg.f c;
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

    public be0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.p6 p6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.E = new xd0(this, 0);
        this.F = new xd0(this, 1);
        this.D = p6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        eg.q qVar = new eg.q(contextThemeWrapper);
        this.b = qVar;
        qVar.setListener(new l2.f(this, 17));
        qVar.setBottomPadding(org.telegram.messenger.i0.L(64.0f));
        addView(qVar);
        this.e = new ImageReceiver(this);
        eg.f fVar = new eg.f(contextThemeWrapper);
        this.c = fVar;
        fVar.setListener(new yd0(0, this));
        addView(fVar, w7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        eg.q qVar = this.b;
        qVar.b.setVisibility(4);
        CropAreaView cropAreaView = qVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, eg.g gVar, k61 k61Var, org.telegram.messenger.ye yeVar) {
        org.telegram.messenger.ye yeVar2;
        requestLayout();
        this.f = false;
        this.e.w0(null);
        eg.q qVar = this.b;
        ImageView imageView = qVar.b;
        qVar.y = z10;
        qVar.d = k61Var;
        qVar.e = gVar;
        qVar.K = i10;
        qVar.x = bitmap;
        CropAreaView cropAreaView = qVar.a;
        cropAreaView.setIsVideo(k61Var != null);
        if (bitmap == null && k61Var == null) {
            qVar.L = null;
            imageView.setImageDrawable(null);
            yeVar2 = yeVar;
        } else {
            int currentWidth = qVar.getCurrentWidth();
            int currentHeight = qVar.getCurrentHeight();
            eg.o oVar = qVar.L;
            if (oVar == null || !z11) {
                qVar.L = new eg.o(qVar, currentWidth, currentHeight);
                yeVar2 = yeVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new eg.l(qVar, yeVar2, currentHeight, currentWidth, 1));
            } else {
                float f7 = currentWidth;
                oVar.e *= oVar.a / f7;
                oVar.a = f7;
                oVar.b = currentHeight;
                oVar.h();
                Matrix matrix = oVar.k;
                eg.q qVar2 = oVar.l;
                matrix.getValues(qVar2.H);
                matrix.reset();
                float f10 = oVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = qVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                qVar2.r(false);
                yeVar2 = yeVar;
            }
            imageView.setImageBitmap(k61Var == null ? qVar.x : null);
        }
        eg.f fVar = this.c;
        fVar.setFreeform(z10);
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
        fVar.setVisibility(z10 ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        eg.q qVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f && view == (qVar = this.b)) {
            RectF actualRect = qVar.getActualRect();
            int L = org.telegram.messenger.i0.L(32.0f);
            org.telegram.ui.bq0 bq0Var = (org.telegram.ui.bq0) this.a;
            bq0Var.getClass();
            int L2 = org.telegram.messenger.i0.L(2.0f) + (((int) (((r1.S7.getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f)) * bq0Var.a.w8) + org.telegram.messenger.i0.L(16.0f))) - (L / 2));
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(156.0f);
            float f7 = actualRect.left;
            float f10 = this.r;
            float f11 = ((L2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = c3.i0.z(measuredHeight, f12, f10, f12);
            float width = ((L - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f11, z10, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.h(canvas, null);
            float f13 = this.x;
            Paint paint = this.y;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ng, this.D));
            paint.setAlpha(Math.min(org.telegram.messenger.zs.e4, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(L2 + r1, org.telegram.messenger.i0.L(8.0f) + measuredHeight + L, org.telegram.messenger.i0.L(3.0f), paint);
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
        return this.b.getCropLeft() - org.telegram.messenger.i0.L(14.0f);
    }

    public float getRectY() {
        return (this.b.getCropTop() - org.telegram.messenger.i0.L(14.0f)) - (!this.d ? org.telegram.messenger.i0.m : 0);
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
                    ((org.telegram.ui.bq0) this.a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        eg.o oVar;
        super.onLayout(z10, i10, i11, i12, i13);
        eg.q qVar = this.b;
        CropAreaView cropAreaView = qVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (oVar = qVar.L) == null) {
            return;
        }
        cropAreaView.a(qVar.h, oVar.a / oVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(qVar.f);
        eg.o.g(qVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        qVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.bq0) this.a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.b.setAspectRatio(f7);
    }

    public void setDelegate(ae0 ae0Var) {
        this.a = ae0Var;
    }

    public void setFreeform(boolean z10) {
        this.b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.x = f7;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, z10 ? 1.0f : 0.0f));
        this.w.setDuration(180L);
        this.w.addListener(new zd0(this, 1));
        this.w.start();
    }
}
