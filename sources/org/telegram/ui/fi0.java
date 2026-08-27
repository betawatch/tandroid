package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fi0 extends org.telegram.ui.Components.zu0 {
    public final int[] s0;
    public final int[] t0;
    public int u0;
    public final int[] v0;
    public final v10 w0;
    public final Paint x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 y0;
    public final /* synthetic */ ni0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.z0 = ni0Var;
        this.y0 = c6Var;
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = 0;
        this.v0 = new int[2];
        this.w0 = new v10();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
        this.x0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.s1 s1Var;
        float f10;
        float f11;
        float height;
        final float f12;
        float f13;
        char c11;
        float f14;
        ni0 ni0Var = this.z0;
        int[] iArr2 = ni0Var.k0;
        Paint paint = ni0Var.P;
        Rect rect = ni0Var.q0;
        gi0 gi0Var = ni0Var.G;
        if (ni0Var.w && (s1Var = ni0Var.M) != null && s1Var.getCurrentPosition() == null) {
            if (ni0Var.x) {
                org.telegram.ui.Components.bf bfVar = ni0Var.O;
                if (bfVar != null) {
                    bfVar.setAlpha(0.0f);
                }
                ni0Var.x = false;
            }
            boolean z10 = ni0Var.M.getMessageObject() != null && ni0Var.M.getMessageObject().type == 15;
            float imageX = z10 ? ni0Var.M.getPhotoImage().getImageX() : ni0Var.M.getTextX();
            float imageY = z10 ? ni0Var.M.getPhotoImage().getImageY() : ni0Var.M.getTextY();
            float x8 = ni0Var.M.getX() + gi0Var.getX() + imageX;
            float y10 = ni0Var.M.getY() + gi0Var.getY() + imageY;
            float textSize = (ni0Var.M.getMessageObject() != null ? ni0Var.M.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.g6.o2).getTextSize();
            org.telegram.ui.Components.bf bfVar2 = ni0Var.O;
            if (bfVar2 != null) {
                int[] iArr3 = this.s0;
                bfVar2.getLocationOnScreen(iArr3);
                f11 = 255.0f;
                float paddingLeft = ni0Var.O.getPaddingLeft() + iArr3[0];
                float paddingTop = (ni0Var.O.getPaddingTop() + iArr3[1]) - ni0Var.O.getScrollY();
                float textSize2 = ni0Var.O.getTextSize();
                int i10 = iArr3[1];
                f10 = imageY;
                height = ni0Var.O.getMeasuredHeight() + i10;
                x8 = AndroidUtilities.lerp(paddingLeft, x8, ni0Var.A);
                y10 = AndroidUtilities.lerp(paddingTop, y10, ni0Var.A);
                f12 = AndroidUtilities.lerp(textSize2, textSize, ni0Var.A);
                f13 = i10;
            } else {
                f10 = imageY;
                f11 = 255.0f;
                height = getHeight();
                f12 = textSize;
                f13 = 0.0f;
            }
            float f15 = x8;
            float f16 = y10;
            float f17 = ni0Var.A;
            if (ni0Var.n0 != null) {
                f13 = ni0Var.o0;
            }
            float lerp = AndroidUtilities.lerp(f13, ((1.0f - gi0Var.getScaleY()) * gi0Var.getHeight()) + gi0Var.getY(), ni0Var.A);
            float f18 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ni0Var.A);
            float lerp3 = AndroidUtilities.lerp(ni0Var.n0 != null ? ni0Var.p0 : f18, gi0Var.getY() + gi0Var.getHeight(), ni0Var.A);
            float lerp4 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(1) ? 1.0f : 0.0f, ni0Var.A);
            float f19 = imageX;
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (ni0Var.O != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f17) * f11), 31);
                canvas2.translate(f15, f16);
                canvas2.translate((-ni0Var.O.getX()) - ni0Var.O.getPaddingLeft(), ((-ni0Var.O.getY()) - ni0Var.O.getPaddingTop()) + ni0Var.O.getScrollY());
                float alpha = ni0Var.O.getAlpha();
                ni0Var.O.setAlpha(1.0f);
                if (ni0Var.A >= 0.001f) {
                    f14 = alpha;
                } else if (ni0Var.R != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.O.getY());
                    canvas2.saveLayerAlpha(ni0Var.O.getX() + ni0Var.O.getPaddingLeft(), 0.0f, ((ni0Var.O.getX() + ni0Var.O.getPaddingLeft()) + ni0Var.O.getWidth()) - ni0Var.O.getPaddingRight(), ni0Var.O.getHeight(), (int) org.telegram.messenger.rl.t(ni0Var.A, 0.1f, 1.0f, 255.0f), 31);
                    ni0Var.R.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f14 = alpha;
                } else {
                    f14 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.y0));
                    paint.setAlpha((int) org.telegram.messenger.rl.t(ni0Var.A, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ni0Var.O.getPaddingLeft(), ni0Var.O.getY(), ((ni0Var.O.getX() + ni0Var.O.getPaddingLeft()) + ni0Var.O.getWidth()) - ni0Var.O.getPaddingRight(), ni0Var.O.getY() + ni0Var.O.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ni0Var.Q;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ei0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ni0 ni0Var2 = fi0.this.z0;
                            canvas3.translate(ni0Var2.O.getX(), ni0Var2.O.getY() - ni0Var2.O.getScrollY());
                            float textSize3 = f12 / ni0Var2.O.getTextSize();
                            canvas3.scale(textSize3, textSize3, ni0Var2.O.getPaddingLeft(), ni0Var2.O.getPaddingTop());
                            ni0Var2.O.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ni0Var.O.setAlpha(f14);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ni0Var.M.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.s1 s1Var2 = ni0Var.n0;
            if (s1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f17 * 255.0f), 31);
                canvas2.translate(f15, f16);
                canvas2.translate(-f19, -f20);
                float lerp5 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.A);
                canvas2.scale(lerp5, lerp5, (-ni0Var.M.getX()) + gi0Var.getWidth(), (-ni0Var.M.getY()) + gi0Var.getHeight());
                float f21 = f12 / textSize;
                canvas2.scale(f21, f21, f19, f20);
                if (ni0Var.M.B1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.M.getPaddingTop());
                    ni0Var.M.C1(canvas2, true, false);
                    canvas2.restore();
                }
                ni0Var.M.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.t0;
                s1Var2.getLocationInWindow(iArr4);
                int translationY = ni0Var.n0.getParent() instanceof View ? (int) ((View) ni0Var.n0.getParent()).getTranslationY() : 0;
                int i11 = this.u0;
                int[] iArr5 = this.v0;
                if (i11 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.u0 = translationY;
                float lerp6 = AndroidUtilities.lerp(ni0Var.M.getX() + gi0Var.getX(), iArr5[c11], 1.0f - ni0Var.A);
                float lerp7 = AndroidUtilities.lerp(ni0Var.M.getY() + gi0Var.getY(), iArr5[1], 1.0f - ni0Var.A);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.A);
                canvas2.scale(lerp8, lerp8, (-ni0Var.M.getX()) + gi0Var.getWidth(), (-ni0Var.M.getY()) + gi0Var.getHeight());
                ni0Var.M.getTransitionParams().K1 = 1.0f - ni0Var.A;
                ni0Var.M.getTransitionParams().g0 = rect.left * ni0Var.A;
                ni0Var.M.getTransitionParams().j0 = rect.top * ni0Var.A;
                ni0Var.M.getTransitionParams().h0 = rect.right * ni0Var.A;
                org.telegram.ui.Cells.r1 transitionParams = ni0Var.M.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = ni0Var.A;
                transitionParams.i0 = f22 * f23;
                ni0Var.M.setTimeAlpha(1.0f - f23);
                if (ni0Var.M.B1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.n0.getWidth(), ni0Var.n0.getHeight(), (int) (ni0Var.A * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.M.getPaddingTop());
                    ni0Var.M.C1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.n0.getWidth(), ni0Var.n0.getHeight(), (int) ((1.0f - ni0Var.A) * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.n0.getPaddingTop());
                    ni0Var.n0.C1(canvas2, true, false);
                    canvas2.restore();
                }
                ni0Var.M.draw(canvas2);
                if (ni0Var.M.getTransitionParams().w0) {
                    ni0Var.M.V1(canvas2, 1.0f);
                    ni0Var.M.l2(1.0f - ni0Var.A, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            v10 v10Var = this.w0;
            v10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            v10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (ni0Var.w) {
            if (ni0Var.y) {
                org.telegram.ui.Components.hg hgVar = ni0Var.S;
                if (hgVar != null) {
                    hgVar.setAlpha(0.0f);
                }
                c10 = 0;
                ni0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i12 = iArr[c10];
            int width = ni0Var.T.getWidth();
            ni0Var.T.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), ni0Var.T.getX(), ni0Var.A), AndroidUtilities.lerp(iArr[1], ni0Var.T.getY(), ni0Var.A));
            if (ni0Var.v && ni0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.T.getWidth(), ni0Var.T.getHeight(), (int) (ni0Var.A * 255.0f), 31);
            }
            ni0Var.T.draw(canvas2);
            if (ni0Var.v && ni0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ni0Var.h0 != null) {
            if (ni0Var.F == null) {
                ni0Var.F = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((ni0Var.h0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((ni0Var.h0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (ni0Var.h0.right - AndroidUtilities.dp(12.0f)), (int) (ni0Var.h0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.x0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ni0Var.F.e() * 30.0f * ni0Var.A));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            ni0Var.F.setBounds(rect2);
            org.telegram.ui.Components.i5 i5Var = ni0Var.F;
            i5Var.v = (int) (ni0Var.A * 255.0f);
            i5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ni0 ni0Var = this.z0;
        if (ni0Var.w) {
            if (view == ni0Var.T) {
                return false;
            }
            org.telegram.ui.Cells.s1 s1Var = ni0Var.M;
            if (view == s1Var && s1Var != null && s1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
