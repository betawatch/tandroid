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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ue0 extends FrameLayout {
    public final re0 E;
    public final re0 F;
    public te0 a;
    public final mg.q b;
    public final mg.f c;
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

    public ue0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.w = 0.0f;
        this.x = new Paint(1);
        this.E = new re0(this, 0);
        this.F = new re0(this, 1);
        this.y = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        mg.q qVar = new mg.q(contextThemeWrapper);
        this.b = qVar;
        qVar.setListener(new ji.u4(this, 12));
        qVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(qVar);
        this.e = new ImageReceiver(this);
        mg.f fVar = new mg.f(contextThemeWrapper);
        this.c = fVar;
        fVar.setListener(new di.h0(2, this));
        addView(fVar, w7.x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        mg.q qVar = this.b;
        qVar.b.setVisibility(4);
        CropAreaView cropAreaView = qVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, mg.g gVar, u61 u61Var, MediaController.CropState cropState) {
        requestLayout();
        this.f = false;
        this.e.setImageBitmap((Drawable) null);
        mg.q qVar = this.b;
        ImageView imageView = qVar.b;
        qVar.x = z10;
        qVar.d = u61Var;
        qVar.e = gVar;
        qVar.K = i10;
        qVar.w = bitmap;
        CropAreaView cropAreaView = qVar.a;
        cropAreaView.setIsVideo(u61Var != null);
        if (bitmap == null && u61Var == null) {
            qVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = qVar.getCurrentWidth();
            int currentHeight = qVar.getCurrentHeight();
            mg.o oVar = qVar.L;
            if (oVar == null || !z11) {
                qVar.L = new mg.o(qVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new mg.l(qVar, cropState, currentHeight, currentWidth));
            } else {
                float f7 = currentWidth;
                oVar.e *= oVar.a / f7;
                oVar.a = f7;
                oVar.b = currentHeight;
                oVar.h();
                Matrix matrix = oVar.k;
                mg.q qVar2 = oVar.l;
                matrix.getValues(qVar2.H);
                matrix.reset();
                float f10 = oVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = qVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                qVar2.r(false);
            }
            imageView.setImageBitmap(u61Var == null ? qVar.w : null);
        }
        mg.f fVar = this.c;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mg.q qVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f && view == (qVar = this.b)) {
            RectF actualRect = qVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.ss0 ss0Var = (org.telegram.ui.ss0) this.a;
            ss0Var.getClass();
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (((r1.R7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * ss0Var.a.v8) + AndroidUtilities.dp(16.0f))) - (dp / 2));
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
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
                    ((org.telegram.ui.ss0) this.a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mg.o oVar;
        super.onLayout(z10, i10, i11, i12, i13);
        mg.q qVar = this.b;
        CropAreaView cropAreaView = qVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (oVar = qVar.L) == null) {
            return;
        }
        cropAreaView.a(qVar.h, oVar.a / oVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(qVar.f);
        mg.o.g(qVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        qVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ss0) this.a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.b.setAspectRatio(f7);
    }

    public void setDelegate(te0 te0Var) {
        this.a = te0Var;
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
        this.v.addListener(new se0(this, 1));
        this.v.start();
    }
}
