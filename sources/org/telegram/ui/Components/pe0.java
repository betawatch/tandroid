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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pe0 extends FrameLayout {
    public final me0 A;
    public final me0 B;
    public oe0 a;
    public final wf.n b;
    public final wf.e c;
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
    public final org.telegram.ui.ActionBar.c6 y;

    public pe0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.w = 0.0f;
        this.x = new Paint(1);
        this.A = new me0(this, 0);
        this.B = new me0(this, 1);
        this.y = c6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        wf.n nVar = new wf.n(contextThemeWrapper);
        this.b = nVar;
        nVar.setListener(new nh.d6(this, 8));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.e = new ImageReceiver(this);
        wf.e eVar = new wf.e(contextThemeWrapper);
        this.c = eVar;
        eVar.setListener(new nh.h0(2, this));
        addView(eVar, i7.f6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        wf.n nVar = this.b;
        nVar.b.setVisibility(4);
        CropAreaView cropAreaView = nVar.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, wf.f fVar, l61 l61Var, MediaController.CropState cropState) {
        requestLayout();
        this.f = false;
        this.e.setImageBitmap((Drawable) null);
        wf.n nVar = this.b;
        ImageView imageView = nVar.b;
        nVar.x = z10;
        nVar.d = l61Var;
        nVar.e = fVar;
        nVar.G = i10;
        nVar.w = bitmap;
        CropAreaView cropAreaView = nVar.a;
        cropAreaView.setIsVideo(l61Var != null);
        if (bitmap == null && l61Var == null) {
            nVar.H = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            wf.l lVar = nVar.H;
            if (lVar == null || !z11) {
                nVar.H = new wf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new wf.j(nVar, cropState, currentHeight, currentWidth));
            } else {
                float f9 = currentWidth;
                lVar.e *= lVar.a / f9;
                lVar.a = f9;
                lVar.b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.k;
                wf.n nVar2 = lVar.l;
                matrix.getValues(nVar2.D);
                matrix.reset();
                float f10 = lVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = nVar2.D;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            }
            imageView.setImageBitmap(l61Var == null ? nVar.w : null);
        }
        wf.e eVar = this.c;
        eVar.setFreeform(z10);
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
        eVar.setVisibility(z10 ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wf.n nVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f && view == (nVar = this.b)) {
            RectF actualRect = nVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this.a;
            pr0Var.getClass();
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (((r1.N7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * pr0Var.a.r8) + AndroidUtilities.dp(16.0f))) - (dp / 2));
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f9 = actualRect.left;
            float f10 = this.r;
            float f11 = ((dp2 - f9) * f10) + f9;
            float f12 = actualRect.top;
            float z10 = com.google.android.recaptcha.internal.a.z(measuredHeight, f12, f10, f12);
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
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zf, this.y));
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
                    ((org.telegram.ui.pr0) this.a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wf.l lVar;
        super.onLayout(z10, i10, i11, i12, i13);
        wf.n nVar = this.b;
        CropAreaView cropAreaView = nVar.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (lVar = nVar.H) == null) {
            return;
        }
        cropAreaView.a(nVar.h, lVar.a / lVar.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(nVar.f);
        wf.l.g(nVar.H, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        nVar.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.pr0) this.a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f9) {
        this.b.setAspectRatio(f9);
    }

    public void setDelegate(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public void setFreeform(boolean z10) {
        this.b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f9) {
        this.w = f9;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.B, z10 ? 1.0f : 0.0f));
        this.v.setDuration(180L);
        this.v.addListener(new ne0(this, 1));
        this.v.start();
    }
}
