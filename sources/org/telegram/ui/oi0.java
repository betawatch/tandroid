package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oi0 extends org.telegram.ui.Components.pv0 {
    public final i20 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 C0;
    public final /* synthetic */ wi0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = wi0Var;
        this.C0 = d6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new i20();
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.t1 t1Var;
        float f7;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        wi0 wi0Var = this.D0;
        int[] iArr2 = wi0Var.o0;
        Paint paint = wi0Var.T;
        Rect rect = wi0Var.u0;
        pi0 pi0Var = wi0Var.K;
        if (wi0Var.w && (t1Var = wi0Var.Q) != null && t1Var.getCurrentPosition() == null) {
            if (wi0Var.x) {
                org.telegram.ui.Components.pf pfVar = wi0Var.S;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                wi0Var.x = false;
            }
            boolean z10 = wi0Var.Q.getMessageObject() != null && wi0Var.Q.getMessageObject().type == 15;
            float imageX = z10 ? wi0Var.Q.getPhotoImage().getImageX() : wi0Var.Q.getTextX();
            float imageY = z10 ? wi0Var.Q.getPhotoImage().getImageY() : wi0Var.Q.getTextY();
            float x10 = wi0Var.Q.getX() + pi0Var.getX() + imageX;
            float y3 = wi0Var.Q.getY() + pi0Var.getY() + imageY;
            float textSize = (wi0Var.Q.getMessageObject() != null ? wi0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.h6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = wi0Var.S;
            if (pfVar2 != null) {
                int[] iArr3 = this.w0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = wi0Var.S.getPaddingLeft() + iArr3[0];
                float paddingTop = (wi0Var.S.getPaddingTop() + iArr3[1]) - wi0Var.S.getScrollY();
                float textSize2 = wi0Var.S.getTextSize();
                int i10 = iArr3[1];
                f7 = imageY;
                height = wi0Var.S.getMeasuredHeight() + i10;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, wi0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, wi0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, wi0Var.E);
                f12 = i10;
            } else {
                f7 = imageY;
                f10 = 255.0f;
                height = getHeight();
                f11 = textSize;
                f12 = 0.0f;
            }
            float f14 = x10;
            float f15 = y3;
            float f16 = wi0Var.E;
            if (wi0Var.r0 != null) {
                f12 = wi0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - pi0Var.getScaleY()) * pi0Var.getHeight()) + pi0Var.getY(), wi0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, pi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, wi0Var.E);
            float lerp3 = AndroidUtilities.lerp(wi0Var.r0 != null ? wi0Var.t0 : f17, pi0Var.getY() + pi0Var.getHeight(), wi0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, pi0Var.canScrollVertically(1) ? 1.0f : 0.0f, wi0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (wi0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-wi0Var.S.getX()) - wi0Var.S.getPaddingLeft(), ((-wi0Var.S.getY()) - wi0Var.S.getPaddingTop()) + wi0Var.S.getScrollY());
                float alpha = wi0Var.S.getAlpha();
                wi0Var.S.setAlpha(1.0f);
                if (wi0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (wi0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, wi0Var.S.getY());
                    canvas2.saveLayerAlpha(wi0Var.S.getX() + wi0Var.S.getPaddingLeft(), 0.0f, ((wi0Var.S.getX() + wi0Var.S.getPaddingLeft()) + wi0Var.S.getWidth()) - wi0Var.S.getPaddingRight(), wi0Var.S.getHeight(), (int) org.telegram.messenger.ul.v(wi0Var.E, 0.1f, 1.0f, 255.0f), 31);
                    wi0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.ul.v(wi0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(wi0Var.S.getPaddingLeft(), wi0Var.S.getY(), ((wi0Var.S.getX() + wi0Var.S.getPaddingLeft()) + wi0Var.S.getWidth()) - wi0Var.S.getPaddingRight(), wi0Var.S.getY() + wi0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = wi0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ni0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            wi0 wi0Var2 = oi0.this.D0;
                            canvas3.translate(wi0Var2.S.getX(), wi0Var2.S.getY() - wi0Var2.S.getScrollY());
                            float textSize3 = f11 / wi0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, wi0Var2.S.getPaddingLeft(), wi0Var2.S.getPaddingTop());
                            wi0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                wi0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            wi0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.t1 t1Var2 = wi0Var.r0;
            if (t1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, pi0Var.getScaleX(), wi0Var.E);
                canvas2.scale(lerp5, lerp5, (-wi0Var.Q.getX()) + pi0Var.getWidth(), (-wi0Var.Q.getY()) + pi0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (wi0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, wi0Var.Q.getPaddingTop());
                    wi0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                }
                wi0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                t1Var2.getLocationInWindow(iArr4);
                int translationY = wi0Var.r0.getParent() instanceof View ? (int) ((View) wi0Var.r0.getParent()).getTranslationY() : 0;
                int i11 = this.y0;
                int[] iArr5 = this.z0;
                if (i11 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.y0 = translationY;
                float lerp6 = AndroidUtilities.lerp(wi0Var.Q.getX() + pi0Var.getX(), iArr5[c11], 1.0f - wi0Var.E);
                float lerp7 = AndroidUtilities.lerp(wi0Var.Q.getY() + pi0Var.getY(), iArr5[1], 1.0f - wi0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, pi0Var.getScaleX(), wi0Var.E);
                canvas2.scale(lerp8, lerp8, (-wi0Var.Q.getX()) + pi0Var.getWidth(), (-wi0Var.Q.getY()) + pi0Var.getHeight());
                wi0Var.Q.getTransitionParams().K1 = 1.0f - wi0Var.E;
                wi0Var.Q.getTransitionParams().g0 = rect.left * wi0Var.E;
                wi0Var.Q.getTransitionParams().j0 = rect.top * wi0Var.E;
                wi0Var.Q.getTransitionParams().h0 = rect.right * wi0Var.E;
                org.telegram.ui.Cells.s1 transitionParams = wi0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = wi0Var.E;
                transitionParams.i0 = f21 * f22;
                wi0Var.Q.setTimeAlpha(1.0f - f22);
                if (wi0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, wi0Var.r0.getWidth(), wi0Var.r0.getHeight(), (int) (wi0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, wi0Var.Q.getPaddingTop());
                    wi0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, wi0Var.r0.getWidth(), wi0Var.r0.getHeight(), (int) ((1.0f - wi0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, wi0Var.r0.getPaddingTop());
                    wi0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                wi0Var.Q.draw(canvas2);
                if (wi0Var.Q.getTransitionParams().w0) {
                    wi0Var.Q.W1(canvas2, 1.0f);
                    wi0Var.Q.m2(1.0f - wi0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            i20 i20Var = this.A0;
            i20Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            i20Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (wi0Var.w) {
            if (wi0Var.y) {
                org.telegram.ui.Components.ug ugVar = wi0Var.W;
                if (ugVar != null) {
                    ugVar.setAlpha(0.0f);
                }
                c10 = 0;
                wi0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i12 = iArr[c10];
            int width = wi0Var.X.getWidth();
            wi0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), wi0Var.X.getX(), wi0Var.E), AndroidUtilities.lerp(iArr[1], wi0Var.X.getY(), wi0Var.E));
            if (wi0Var.v && wi0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, wi0Var.X.getWidth(), wi0Var.X.getHeight(), (int) (wi0Var.E * 255.0f), 31);
            }
            wi0Var.X.draw(canvas2);
            if (wi0Var.v && wi0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (wi0Var.l0 != null) {
            if (wi0Var.J == null) {
                wi0Var.J = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((wi0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((wi0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (wi0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (wi0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (wi0Var.J.e() * 30.0f * wi0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            wi0Var.J.setBounds(rect2);
            org.telegram.ui.Components.o5 o5Var = wi0Var.J;
            o5Var.v = (int) (wi0Var.E * 255.0f);
            o5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        wi0 wi0Var = this.D0;
        if (wi0Var.w) {
            if (view == wi0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.t1 t1Var = wi0Var.Q;
            if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
