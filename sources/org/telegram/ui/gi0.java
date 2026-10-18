package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class gi0 extends org.telegram.ui.Components.jw0 {
    public final u10 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 C0;
    public final /* synthetic */ oi0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(oi0 oi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = oi0Var;
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
        oi0 oi0Var = this.D0;
        int[] iArr2 = oi0Var.o0;
        Paint paint = oi0Var.T;
        Rect rect = oi0Var.u0;
        hi0 hi0Var = oi0Var.K;
        if (oi0Var.w && (u1Var = oi0Var.Q) != null && u1Var.getCurrentPosition() == null) {
            if (oi0Var.x) {
                org.telegram.ui.Components.pf pfVar = oi0Var.S;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                oi0Var.x = false;
            }
            boolean z11 = oi0Var.Q.getMessageObject() != null && oi0Var.Q.getMessageObject().type == 15;
            float imageX = z11 ? oi0Var.Q.getPhotoImage().getImageX() : oi0Var.Q.getTextX();
            float imageY = z11 ? oi0Var.Q.getPhotoImage().getImageY() : oi0Var.Q.getTextY();
            float x10 = oi0Var.Q.getX() + hi0Var.getX() + imageX;
            float y3 = oi0Var.Q.getY() + hi0Var.getY() + imageY;
            float textSize = (oi0Var.Q.getMessageObject() != null ? oi0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.h6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = oi0Var.S;
            if (pfVar2 != null) {
                z10 = false;
                int[] iArr3 = this.w0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = oi0Var.S.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (oi0Var.S.getPaddingTop() + iArr3[1]) - oi0Var.S.getScrollY();
                float textSize2 = oi0Var.S.getTextSize();
                int i11 = iArr3[1];
                f7 = imageY;
                height = oi0Var.S.getMeasuredHeight() + i11;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, oi0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, oi0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, oi0Var.E);
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
            float f16 = oi0Var.E;
            if (oi0Var.r0 != null) {
                f12 = oi0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - hi0Var.getScaleY()) * hi0Var.getHeight()) + hi0Var.getY(), oi0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, hi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, oi0Var.E);
            float lerp3 = AndroidUtilities.lerp(oi0Var.r0 != null ? oi0Var.t0 : f17, hi0Var.getY() + hi0Var.getHeight(), oi0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, hi0Var.canScrollVertically(i10) ? 1.0f : 0.0f, oi0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (oi0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-oi0Var.S.getX()) - oi0Var.S.getPaddingLeft(), ((-oi0Var.S.getY()) - oi0Var.S.getPaddingTop()) + oi0Var.S.getScrollY());
                float alpha = oi0Var.S.getAlpha();
                oi0Var.S.setAlpha(1.0f);
                if (oi0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (oi0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, oi0Var.S.getY());
                    canvas2.saveLayerAlpha(oi0Var.S.getX() + oi0Var.S.getPaddingLeft(), 0.0f, ((oi0Var.S.getX() + oi0Var.S.getPaddingLeft()) + oi0Var.S.getWidth()) - oi0Var.S.getPaddingRight(), oi0Var.S.getHeight(), (int) org.telegram.messenger.kk.z(oi0Var.E, 0.1f, 1.0f, f10), 31);
                    oi0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.kk.z(oi0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(oi0Var.S.getPaddingLeft(), oi0Var.S.getY(), ((oi0Var.S.getX() + oi0Var.S.getPaddingLeft()) + oi0Var.S.getWidth()) - oi0Var.S.getPaddingRight(), oi0Var.S.getY() + oi0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = oi0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.fi0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            oi0 oi0Var2 = gi0.this.D0;
                            canvas3.translate(oi0Var2.S.getX(), oi0Var2.S.getY() - oi0Var2.S.getScrollY());
                            float textSize3 = f11 / oi0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, oi0Var2.S.getPaddingLeft(), oi0Var2.S.getPaddingTop());
                            oi0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                oi0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            oi0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.u1 u1Var2 = oi0Var.r0;
            if (u1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, hi0Var.getScaleX(), oi0Var.E);
                canvas2.scale(lerp5, lerp5, (-oi0Var.Q.getX()) + hi0Var.getWidth(), (-oi0Var.Q.getY()) + hi0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (oi0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, oi0Var.Q.getPaddingTop());
                    oi0Var.Q.D1(canvas2, true, z10);
                    canvas2.restore();
                }
                oi0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                u1Var2.getLocationInWindow(iArr4);
                int translationY = oi0Var.r0.getParent() instanceof View ? (int) ((View) oi0Var.r0.getParent()).getTranslationY() : 0;
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
                float lerp6 = AndroidUtilities.lerp(oi0Var.Q.getX() + hi0Var.getX(), iArr5[c11], 1.0f - oi0Var.E);
                float lerp7 = AndroidUtilities.lerp(oi0Var.Q.getY() + hi0Var.getY(), iArr5[1], 1.0f - oi0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, hi0Var.getScaleX(), oi0Var.E);
                canvas2.scale(lerp8, lerp8, (-oi0Var.Q.getX()) + hi0Var.getWidth(), (-oi0Var.Q.getY()) + hi0Var.getHeight());
                oi0Var.Q.getTransitionParams().K1 = 1.0f - oi0Var.E;
                oi0Var.Q.getTransitionParams().g0 = rect.left * oi0Var.E;
                oi0Var.Q.getTransitionParams().j0 = rect.top * oi0Var.E;
                oi0Var.Q.getTransitionParams().h0 = rect.right * oi0Var.E;
                org.telegram.ui.Cells.t1 transitionParams = oi0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = oi0Var.E;
                transitionParams.i0 = f21 * f22;
                oi0Var.Q.setTimeAlpha(1.0f - f22);
                if (oi0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, oi0Var.r0.getWidth(), oi0Var.r0.getHeight(), (int) (oi0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, oi0Var.Q.getPaddingTop());
                    oi0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, oi0Var.r0.getWidth(), oi0Var.r0.getHeight(), (int) ((1.0f - oi0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, oi0Var.r0.getPaddingTop());
                    oi0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                oi0Var.Q.draw(canvas2);
                if (oi0Var.Q.getTransitionParams().w0) {
                    oi0Var.Q.W1(canvas2, 1.0f);
                    oi0Var.Q.m2(1.0f - oi0Var.E, canvas2, true);
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
        if (oi0Var.w) {
            if (oi0Var.y) {
                org.telegram.ui.Components.vg vgVar = oi0Var.W;
                if (vgVar != null) {
                    vgVar.setAlpha(0.0f);
                }
                c10 = 0;
                oi0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i13 = iArr[c10];
            int width = oi0Var.X.getWidth();
            oi0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i13 - (width - r4.m())), oi0Var.X.getX(), oi0Var.E), AndroidUtilities.lerp(iArr[1], oi0Var.X.getY(), oi0Var.E));
            if (oi0Var.v && oi0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, oi0Var.X.getWidth(), oi0Var.X.getHeight(), (int) (oi0Var.E * 255.0f), 31);
            }
            oi0Var.X.draw(canvas2);
            if (oi0Var.v && oi0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (oi0Var.l0 != null) {
            if (oi0Var.J == null) {
                oi0Var.J = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((oi0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((oi0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (oi0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (oi0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (oi0Var.J.e() * 30.0f * oi0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            oi0Var.J.setBounds(rect2);
            org.telegram.ui.Components.p5 p5Var = oi0Var.J;
            p5Var.v = (int) (oi0Var.E * 255.0f);
            p5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        oi0 oi0Var = this.D0;
        if (oi0Var.w) {
            if (view == oi0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.u1 u1Var = oi0Var.Q;
            if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
