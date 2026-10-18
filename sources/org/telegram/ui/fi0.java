package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fi0 extends org.telegram.ui.Components.jw0 {
    public final u10 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 C0;
    public final /* synthetic */ ni0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = ni0Var;
        this.C0 = d6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new u10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0380, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.u1 u1Var;
        float f7;
        int i10;
        boolean z10;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        ni0 ni0Var = this.D0;
        int[] iArr2 = ni0Var.o0;
        Paint paint = ni0Var.T;
        Rect rect = ni0Var.u0;
        gi0 gi0Var = ni0Var.K;
        if (ni0Var.w && (u1Var = ni0Var.Q) != null && u1Var.getCurrentPosition() == null) {
            if (ni0Var.x) {
                org.telegram.ui.Components.pf pfVar = ni0Var.S;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                ni0Var.x = false;
            }
            boolean z11 = ni0Var.Q.getMessageObject() != null && ni0Var.Q.getMessageObject().type == 15;
            float imageX = z11 ? ni0Var.Q.getPhotoImage().getImageX() : ni0Var.Q.getTextX();
            float imageY = z11 ? ni0Var.Q.getPhotoImage().getImageY() : ni0Var.Q.getTextY();
            float x10 = ni0Var.Q.getX() + gi0Var.getX() + imageX;
            float y3 = ni0Var.Q.getY() + gi0Var.getY() + imageY;
            float textSize = (ni0Var.Q.getMessageObject() != null ? ni0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.h6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = ni0Var.S;
            if (pfVar2 != null) {
                z10 = false;
                int[] iArr3 = this.w0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = ni0Var.S.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (ni0Var.S.getPaddingTop() + iArr3[1]) - ni0Var.S.getScrollY();
                float textSize2 = ni0Var.S.getTextSize();
                int i11 = iArr3[1];
                f7 = imageY;
                height = ni0Var.S.getMeasuredHeight() + i11;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, ni0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, ni0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, ni0Var.E);
                f12 = i11;
            } else {
                f7 = imageY;
                i10 = 1;
                z10 = false;
                f10 = 255.0f;
                height = getHeight();
                f11 = textSize;
                f12 = 0.0f;
            }
            float f14 = x10;
            float f15 = y3;
            float f16 = ni0Var.E;
            if (ni0Var.r0 != null) {
                f12 = ni0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - gi0Var.getScaleY()) * gi0Var.getHeight()) + gi0Var.getY(), ni0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ni0Var.E);
            float lerp3 = AndroidUtilities.lerp(ni0Var.r0 != null ? ni0Var.t0 : f17, gi0Var.getY() + gi0Var.getHeight(), ni0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(i10) ? 1.0f : 0.0f, ni0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (ni0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-ni0Var.S.getX()) - ni0Var.S.getPaddingLeft(), ((-ni0Var.S.getY()) - ni0Var.S.getPaddingTop()) + ni0Var.S.getScrollY());
                float alpha = ni0Var.S.getAlpha();
                ni0Var.S.setAlpha(1.0f);
                if (ni0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (ni0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.S.getY());
                    canvas2.saveLayerAlpha(ni0Var.S.getX() + ni0Var.S.getPaddingLeft(), 0.0f, ((ni0Var.S.getX() + ni0Var.S.getPaddingLeft()) + ni0Var.S.getWidth()) - ni0Var.S.getPaddingRight(), ni0Var.S.getHeight(), (int) org.telegram.messenger.lk.z(ni0Var.E, 0.1f, 1.0f, f10), 31);
                    ni0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.lk.z(ni0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ni0Var.S.getPaddingLeft(), ni0Var.S.getY(), ((ni0Var.S.getX() + ni0Var.S.getPaddingLeft()) + ni0Var.S.getWidth()) - ni0Var.S.getPaddingRight(), ni0Var.S.getY() + ni0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ni0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ei0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ni0 ni0Var2 = fi0.this.D0;
                            canvas3.translate(ni0Var2.S.getX(), ni0Var2.S.getY() - ni0Var2.S.getScrollY());
                            float textSize3 = f11 / ni0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, ni0Var2.S.getPaddingLeft(), ni0Var2.S.getPaddingTop());
                            ni0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ni0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ni0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.u1 u1Var2 = ni0Var.r0;
            if (u1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.E);
                canvas2.scale(lerp5, lerp5, (-ni0Var.Q.getX()) + gi0Var.getWidth(), (-ni0Var.Q.getY()) + gi0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (ni0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.Q.getPaddingTop());
                    ni0Var.Q.D1(canvas2, true, z10);
                    canvas2.restore();
                }
                ni0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                u1Var2.getLocationInWindow(iArr4);
                int translationY = ni0Var.r0.getParent() instanceof View ? (int) ((View) ni0Var.r0.getParent()).getTranslationY() : 0;
                int i12 = this.y0;
                int[] iArr5 = this.z0;
                if (i12 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.y0 = translationY;
                float lerp6 = AndroidUtilities.lerp(ni0Var.Q.getX() + gi0Var.getX(), iArr5[c11], 1.0f - ni0Var.E);
                float lerp7 = AndroidUtilities.lerp(ni0Var.Q.getY() + gi0Var.getY(), iArr5[1], 1.0f - ni0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.E);
                canvas2.scale(lerp8, lerp8, (-ni0Var.Q.getX()) + gi0Var.getWidth(), (-ni0Var.Q.getY()) + gi0Var.getHeight());
                ni0Var.Q.getTransitionParams().K1 = 1.0f - ni0Var.E;
                ni0Var.Q.getTransitionParams().g0 = rect.left * ni0Var.E;
                ni0Var.Q.getTransitionParams().j0 = rect.top * ni0Var.E;
                ni0Var.Q.getTransitionParams().h0 = rect.right * ni0Var.E;
                org.telegram.ui.Cells.t1 transitionParams = ni0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = ni0Var.E;
                transitionParams.i0 = f21 * f22;
                ni0Var.Q.setTimeAlpha(1.0f - f22);
                if (ni0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.r0.getWidth(), ni0Var.r0.getHeight(), (int) (ni0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.Q.getPaddingTop());
                    ni0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.r0.getWidth(), ni0Var.r0.getHeight(), (int) ((1.0f - ni0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.r0.getPaddingTop());
                    ni0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                ni0Var.Q.draw(canvas2);
                if (ni0Var.Q.getTransitionParams().w0) {
                    ni0Var.Q.W1(canvas2, 1.0f);
                    ni0Var.Q.m2(1.0f - ni0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            u10 u10Var = this.A0;
            u10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            u10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (ni0Var.w) {
            if (ni0Var.y) {
                org.telegram.ui.Components.vg vgVar = ni0Var.W;
                if (vgVar != null) {
                    vgVar.setAlpha(0.0f);
                }
                c10 = 0;
                ni0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i13 = iArr[c10];
            int width = ni0Var.X.getWidth();
            ni0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i13 - (width - r4.m())), ni0Var.X.getX(), ni0Var.E), AndroidUtilities.lerp(iArr[1], ni0Var.X.getY(), ni0Var.E));
            if (ni0Var.v && ni0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.X.getWidth(), ni0Var.X.getHeight(), (int) (ni0Var.E * 255.0f), 31);
            }
            ni0Var.X.draw(canvas2);
            if (ni0Var.v && ni0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ni0Var.l0 != null) {
            if (ni0Var.J == null) {
                ni0Var.J = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((ni0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((ni0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (ni0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (ni0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ni0Var.J.e() * 30.0f * ni0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            ni0Var.J.setBounds(rect2);
            org.telegram.ui.Components.p5 p5Var = ni0Var.J;
            p5Var.v = (int) (ni0Var.E * 255.0f);
            p5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ni0 ni0Var = this.D0;
        if (ni0Var.w) {
            if (view == ni0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.u1 u1Var = ni0Var.Q;
            if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
