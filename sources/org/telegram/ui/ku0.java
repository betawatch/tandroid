package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ku0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final e5.c c;
    public final org.telegram.ui.Components.t9 d;
    public final /* synthetic */ lu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(lu0 lu0Var, Context context) {
        super(context);
        this.e = lu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new ju0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        frameLayout.addView(t9Var);
        frameLayout.setWillNotDraw(false);
        e5.c cVar = new e5.c(context);
        this.c = cVar;
        cVar.setBackgroundColor(0);
        frameLayout.addView(cVar, i7.f6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        cVar.addView(textureView, i7.f6.c(-1.0f, -1));
        addView(frameLayout, i7.f6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f9;
        lu0 lu0Var = this.e;
        float[] fArr = lu0Var.m;
        gh.k kVar = lu0Var.j;
        Path path = lu0Var.l;
        if (!lu0Var.n || lu0Var.e == null || lu0Var.a == null) {
            return;
        }
        lu0Var.i();
        float left = lu0Var.o - getLeft();
        float top = lu0Var.p - getTop();
        canvas.save();
        float f10 = lu0Var.O;
        float f11 = lu0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, lu0Var.s + left, lu0Var.t + top);
        float f13 = lu0Var.J;
        float f14 = lu0Var.A;
        canvas.translate((f13 * f14) + left, (lu0Var.K * f14) + top);
        ImageReceiver imageReceiver = lu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = lu0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                lu0Var.B = f16;
                if (f16 > 1.0f) {
                    lu0Var.B = 1.0f;
                } else {
                    lu0Var.e();
                }
            }
            lu0Var.g.setAlpha(lu0Var.B);
        }
        float f17 = lu0Var.u;
        float f18 = lu0Var.v;
        float f19 = lu0Var.w;
        float f20 = lu0Var.y;
        if (f19 == f20 && lu0Var.x == lu0Var.z) {
            f9 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f9 = 1.0f;
            float f22 = lu0Var.z;
            float f23 = lu0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = lu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (lu0Var.R) {
            float f26 = lu0Var.s - lu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(lu0Var.t - lu0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((lu0Var.J * f12 * lu0Var.A) + f17 + left);
            frameLayout.setTranslationY((lu0Var.K * f12 * lu0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = lu0Var.f;
            if (imageReceiver3 != null) {
                if (lu0Var.B != f9) {
                    if (imageReceiver3.getLottieAnimation() != null || lu0Var.f.getAnimation() != null || lu0Var.g.getLottieAnimation() != null || lu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    lu0Var.f.draw(canvas);
                    lu0Var.g.setImageCoords(lu0Var.f.getImageX(), lu0Var.f.getImageY(), lu0Var.f.getImageWidth(), lu0Var.f.getImageHeight());
                    lu0Var.g.draw(canvas);
                } else {
                    lu0Var.g.setImageCoords(imageReceiver3.getImageX(), lu0Var.f.getImageY(), lu0Var.f.getImageWidth(), lu0Var.f.getImageHeight());
                    lu0Var.g.draw(canvas);
                    if (lu0Var.g.getLottieAnimation() != null || lu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (lu0Var.i) {
            lu0Var.h.setAlpha(lu0Var.f.getAlpha());
            lu0Var.h.setRoundRadius(lu0Var.f.getRoundRadius(true));
            lu0Var.h.setImageCoords(lu0Var.f.getImageX(), lu0Var.f.getImageY(), lu0Var.f.getImageWidth(), lu0Var.f.getImageHeight());
            lu0Var.h.draw(canvas);
            int[] roundRadius = lu0Var.f.getRoundRadius(true);
            float f27 = roundRadius[0];
            fArr[1] = f27;
            fArr[0] = f27;
            float f28 = roundRadius[1];
            fArr[3] = f28;
            fArr[2] = f28;
            float f29 = roundRadius[2];
            fArr[5] = f29;
            fArr[4] = f29;
            float f30 = roundRadius[3];
            fArr[7] = f30;
            fArr[6] = f30;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(lu0Var.f.getImageX(), lu0Var.f.getImageY(), lu0Var.f.getImageX2(), lu0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (lu0Var.k != null) {
                canvas.translate(lu0Var.f.getImageX(), lu0Var.f.getImageY());
                lu0Var.k.c(canvas, lu0Var.d, (int) lu0Var.f.getImageWidth(), (int) lu0Var.f.getImageHeight(), 1.0f, false);
            } else {
                kVar.h(i0.a.k(-1, (int) (lu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                kVar.setBounds((int) lu0Var.f.getImageX(), (int) lu0Var.f.getImageY(), (int) lu0Var.f.getImageX2(), (int) lu0Var.f.getImageY2());
                kVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        iu0 iu0Var;
        lu0 lu0Var = this.e;
        float[] fArr = lu0Var.Q;
        if (lu0Var.C == null) {
            float f10 = lu0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                lu0Var.P = f11;
                if (f11 > 1.0f) {
                    lu0Var.P = 1.0f;
                } else {
                    lu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.jr.f.getInterpolation(lu0Var.P) * lu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation == 1.0f || (iu0Var = lu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f9 = measuredHeight;
        } else {
            iu0Var.h(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f9 = measuredHeight2;
            f12 = f14;
        }
        lu0Var.c(canvas, 1.0f - interpolation, lu0Var.o - getLeft(), lu0Var.p - getTop(), f12, f9);
    }
}
