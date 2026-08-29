package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ci0 extends org.telegram.ui.Components.hv0 {
    public final int[] s0;
    public final int[] t0;
    public int u0;
    public final int[] v0;
    public final u10 w0;
    public final Paint x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 y0;
    public final /* synthetic */ ki0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(ki0 ki0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.z0 = ki0Var;
        this.y0 = c6Var;
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = 0;
        this.v0 = new int[2];
        this.w0 = new u10();
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
        this.x0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c3;
        org.telegram.ui.Cells.s1 s1Var;
        float f9;
        float f10;
        float height;
        final float f11;
        float f12;
        char c6;
        float f13;
        ki0 ki0Var = this.z0;
        int[] iArr2 = ki0Var.k0;
        Paint paint = ki0Var.P;
        Rect rect = ki0Var.q0;
        di0 di0Var = ki0Var.G;
        if (ki0Var.w && (s1Var = ki0Var.M) != null && s1Var.getCurrentPosition() == null) {
            if (ki0Var.x) {
                org.telegram.ui.Components.jf jfVar = ki0Var.O;
                if (jfVar != null) {
                    jfVar.setAlpha(0.0f);
                }
                ki0Var.x = false;
            }
            boolean z10 = ki0Var.M.getMessageObject() != null && ki0Var.M.getMessageObject().type == 15;
            float imageX = z10 ? ki0Var.M.getPhotoImage().getImageX() : ki0Var.M.getTextX();
            float imageY = z10 ? ki0Var.M.getPhotoImage().getImageY() : ki0Var.M.getTextY();
            float x4 = ki0Var.M.getX() + di0Var.getX() + imageX;
            float y8 = ki0Var.M.getY() + di0Var.getY() + imageY;
            float textSize = (ki0Var.M.getMessageObject() != null ? ki0Var.M.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.g6.o2).getTextSize();
            org.telegram.ui.Components.jf jfVar2 = ki0Var.O;
            if (jfVar2 != null) {
                int[] iArr3 = this.s0;
                jfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = ki0Var.O.getPaddingLeft() + iArr3[0];
                float paddingTop = (ki0Var.O.getPaddingTop() + iArr3[1]) - ki0Var.O.getScrollY();
                float textSize2 = ki0Var.O.getTextSize();
                int i10 = iArr3[1];
                f9 = imageY;
                height = ki0Var.O.getMeasuredHeight() + i10;
                x4 = AndroidUtilities.lerp(paddingLeft, x4, ki0Var.A);
                y8 = AndroidUtilities.lerp(paddingTop, y8, ki0Var.A);
                f11 = AndroidUtilities.lerp(textSize2, textSize, ki0Var.A);
                f12 = i10;
            } else {
                f9 = imageY;
                f10 = 255.0f;
                height = getHeight();
                f11 = textSize;
                f12 = 0.0f;
            }
            float f14 = x4;
            float f15 = y8;
            float f16 = ki0Var.A;
            if (ki0Var.n0 != null) {
                f12 = ki0Var.o0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - di0Var.getScaleY()) * di0Var.getHeight()) + di0Var.getY(), ki0Var.A);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, di0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ki0Var.A);
            float lerp3 = AndroidUtilities.lerp(ki0Var.n0 != null ? ki0Var.p0 : f17, di0Var.getY() + di0Var.getHeight(), ki0Var.A);
            float lerp4 = AndroidUtilities.lerp(0.0f, di0Var.canScrollVertically(1) ? 1.0f : 0.0f, ki0Var.A);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f9;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (ki0Var.O != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-ki0Var.O.getX()) - ki0Var.O.getPaddingLeft(), ((-ki0Var.O.getY()) - ki0Var.O.getPaddingTop()) + ki0Var.O.getScrollY());
                float alpha = ki0Var.O.getAlpha();
                ki0Var.O.setAlpha(1.0f);
                if (ki0Var.A >= 0.001f) {
                    f13 = alpha;
                } else if (ki0Var.R != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ki0Var.O.getY());
                    canvas2.saveLayerAlpha(ki0Var.O.getX() + ki0Var.O.getPaddingLeft(), 0.0f, ((ki0Var.O.getX() + ki0Var.O.getPaddingLeft()) + ki0Var.O.getWidth()) - ki0Var.O.getPaddingRight(), ki0Var.O.getHeight(), (int) b.c(ki0Var.A, 0.1f, 1.0f, 255.0f), 31);
                    ki0Var.R.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.y0));
                    paint.setAlpha((int) b.c(ki0Var.A, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ki0Var.O.getPaddingLeft(), ki0Var.O.getY(), ((ki0Var.O.getX() + ki0Var.O.getPaddingLeft()) + ki0Var.O.getWidth()) - ki0Var.O.getPaddingRight(), ki0Var.O.getY() + ki0Var.O.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ki0Var.Q;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.bi0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ki0 ki0Var2 = ci0.this.z0;
                            canvas3.translate(ki0Var2.O.getX(), ki0Var2.O.getY() - ki0Var2.O.getScrollY());
                            float textSize3 = f11 / ki0Var2.O.getTextSize();
                            canvas3.scale(textSize3, textSize3, ki0Var2.O.getPaddingLeft(), ki0Var2.O.getPaddingTop());
                            ki0Var2.O.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ki0Var.O.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ki0Var.M.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.s1 s1Var2 = ki0Var.n0;
            if (s1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, di0Var.getScaleX(), ki0Var.A);
                canvas2.scale(lerp5, lerp5, (-ki0Var.M.getX()) + di0Var.getWidth(), (-ki0Var.M.getY()) + di0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (ki0Var.M.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ki0Var.M.getPaddingTop());
                    ki0Var.M.D1(canvas2, true, false);
                    canvas2.restore();
                }
                ki0Var.M.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.t0;
                s1Var2.getLocationInWindow(iArr4);
                int translationY = ki0Var.n0.getParent() instanceof View ? (int) ((View) ki0Var.n0.getParent()).getTranslationY() : 0;
                int i11 = this.u0;
                int[] iArr5 = this.v0;
                if (i11 > translationY) {
                    c6 = 0;
                } else {
                    c6 = 0;
                }
                iArr5[c6] = iArr4[c6];
                iArr5[1] = iArr4[1];
                this.u0 = translationY;
                float lerp6 = AndroidUtilities.lerp(ki0Var.M.getX() + di0Var.getX(), iArr5[c6], 1.0f - ki0Var.A);
                float lerp7 = AndroidUtilities.lerp(ki0Var.M.getY() + di0Var.getY(), iArr5[1], 1.0f - ki0Var.A);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, di0Var.getScaleX(), ki0Var.A);
                canvas2.scale(lerp8, lerp8, (-ki0Var.M.getX()) + di0Var.getWidth(), (-ki0Var.M.getY()) + di0Var.getHeight());
                ki0Var.M.getTransitionParams().K1 = 1.0f - ki0Var.A;
                ki0Var.M.getTransitionParams().g0 = rect.left * ki0Var.A;
                ki0Var.M.getTransitionParams().j0 = rect.top * ki0Var.A;
                ki0Var.M.getTransitionParams().h0 = rect.right * ki0Var.A;
                org.telegram.ui.Cells.r1 transitionParams = ki0Var.M.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = ki0Var.A;
                transitionParams.i0 = f21 * f22;
                ki0Var.M.setTimeAlpha(1.0f - f22);
                if (ki0Var.M.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ki0Var.n0.getWidth(), ki0Var.n0.getHeight(), (int) (ki0Var.A * 255.0f), 31);
                    canvas2.translate(0.0f, ki0Var.M.getPaddingTop());
                    ki0Var.M.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ki0Var.n0.getWidth(), ki0Var.n0.getHeight(), (int) ((1.0f - ki0Var.A) * 255.0f), 31);
                    canvas2.translate(0.0f, ki0Var.n0.getPaddingTop());
                    ki0Var.n0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                ki0Var.M.draw(canvas2);
                if (ki0Var.M.getTransitionParams().w0) {
                    ki0Var.M.W1(canvas2, 1.0f);
                    ki0Var.M.m2(1.0f - ki0Var.A, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            u10 u10Var = this.w0;
            u10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            u10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (ki0Var.w) {
            if (ki0Var.y) {
                org.telegram.ui.Components.og ogVar = ki0Var.S;
                if (ogVar != null) {
                    ogVar.setAlpha(0.0f);
                }
                c3 = 0;
                ki0Var.y = false;
            } else {
                c3 = 0;
            }
            canvas2.save();
            int i12 = iArr[c3];
            int width = ki0Var.T.getWidth();
            ki0Var.T.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), ki0Var.T.getX(), ki0Var.A), AndroidUtilities.lerp(iArr[1], ki0Var.T.getY(), ki0Var.A));
            if (ki0Var.v && ki0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ki0Var.T.getWidth(), ki0Var.T.getHeight(), (int) (ki0Var.A * 255.0f), 31);
            }
            ki0Var.T.draw(canvas2);
            if (ki0Var.v && ki0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ki0Var.h0 != null) {
            if (ki0Var.F == null) {
                ki0Var.F = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((ki0Var.h0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((ki0Var.h0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (ki0Var.h0.right - AndroidUtilities.dp(12.0f)), (int) (ki0Var.h0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.x0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ki0Var.F.e() * 30.0f * ki0Var.A));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            ki0Var.F.setBounds(rect2);
            org.telegram.ui.Components.n5 n5Var = ki0Var.F;
            n5Var.v = (int) (ki0Var.A * 255.0f);
            n5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ki0 ki0Var = this.z0;
        if (ki0Var.w) {
            if (view == ki0Var.T) {
                return false;
            }
            org.telegram.ui.Cells.s1 s1Var = ki0Var.M;
            if (view == s1Var && s1Var != null && s1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
