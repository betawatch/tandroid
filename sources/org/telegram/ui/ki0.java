package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ki0 extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ si0 A0;
    public final int[] t0;
    public final int[] u0;
    public int v0;
    public final int[] w0;
    public final g20 x0;
    public final Paint y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(si0 si0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.A0 = si0Var;
        this.z0 = f6Var;
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = 0;
        this.w0 = new int[2];
        this.x0 = new g20();
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
        this.y0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c3;
        org.telegram.ui.Cells.t1 t1Var;
        float f10;
        float f11;
        float height;
        final float f12;
        float f13;
        char c10;
        float f14;
        si0 si0Var = this.A0;
        int[] iArr2 = si0Var.l0;
        Paint paint = si0Var.Q;
        Rect rect = si0Var.r0;
        li0 li0Var = si0Var.H;
        if (si0Var.w && (t1Var = si0Var.N) != null && t1Var.getCurrentPosition() == null) {
            if (si0Var.x) {
                org.telegram.ui.Components.ff ffVar = si0Var.P;
                if (ffVar != null) {
                    ffVar.setAlpha(0.0f);
                }
                si0Var.x = false;
            }
            boolean z4 = si0Var.N.getMessageObject() != null && si0Var.N.getMessageObject().type == 15;
            float imageX = z4 ? si0Var.N.getPhotoImage().getImageX() : si0Var.N.getTextX();
            float imageY = z4 ? si0Var.N.getPhotoImage().getImageY() : si0Var.N.getTextY();
            float x10 = si0Var.N.getX() + li0Var.getX() + imageX;
            float y10 = si0Var.N.getY() + li0Var.getY() + imageY;
            float textSize = (si0Var.N.getMessageObject() != null ? si0Var.N.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.j6.o2).getTextSize();
            org.telegram.ui.Components.ff ffVar2 = si0Var.P;
            if (ffVar2 != null) {
                int[] iArr3 = this.t0;
                ffVar2.getLocationOnScreen(iArr3);
                f11 = 255.0f;
                float paddingLeft = si0Var.P.getPaddingLeft() + iArr3[0];
                float paddingTop = (si0Var.P.getPaddingTop() + iArr3[1]) - si0Var.P.getScrollY();
                float textSize2 = si0Var.P.getTextSize();
                int i10 = iArr3[1];
                f10 = imageY;
                height = si0Var.P.getMeasuredHeight() + i10;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, si0Var.B);
                y10 = AndroidUtilities.lerp(paddingTop, y10, si0Var.B);
                f12 = AndroidUtilities.lerp(textSize2, textSize, si0Var.B);
                f13 = i10;
            } else {
                f10 = imageY;
                f11 = 255.0f;
                height = getHeight();
                f12 = textSize;
                f13 = 0.0f;
            }
            float f15 = x10;
            float f16 = y10;
            float f17 = si0Var.B;
            if (si0Var.o0 != null) {
                f13 = si0Var.p0;
            }
            float lerp = AndroidUtilities.lerp(f13, ((1.0f - li0Var.getScaleY()) * li0Var.getHeight()) + li0Var.getY(), si0Var.B);
            float f18 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, li0Var.canScrollVertically(-1) ? 1.0f : 0.0f, si0Var.B);
            float lerp3 = AndroidUtilities.lerp(si0Var.o0 != null ? si0Var.q0 : f18, li0Var.getY() + li0Var.getHeight(), si0Var.B);
            float lerp4 = AndroidUtilities.lerp(0.0f, li0Var.canScrollVertically(1) ? 1.0f : 0.0f, si0Var.B);
            float f19 = imageX;
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (si0Var.P != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f17) * f11), 31);
                canvas2.translate(f15, f16);
                canvas2.translate((-si0Var.P.getX()) - si0Var.P.getPaddingLeft(), ((-si0Var.P.getY()) - si0Var.P.getPaddingTop()) + si0Var.P.getScrollY());
                float alpha = si0Var.P.getAlpha();
                si0Var.P.setAlpha(1.0f);
                if (si0Var.B >= 0.001f) {
                    f14 = alpha;
                } else if (si0Var.S != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, si0Var.P.getY());
                    canvas2.saveLayerAlpha(si0Var.P.getX() + si0Var.P.getPaddingLeft(), 0.0f, ((si0Var.P.getX() + si0Var.P.getPaddingLeft()) + si0Var.P.getWidth()) - si0Var.P.getPaddingRight(), si0Var.P.getHeight(), (int) b.c(si0Var.B, 0.1f, 1.0f, 255.0f), 31);
                    si0Var.S.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f14 = alpha;
                } else {
                    f14 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.z0));
                    paint.setAlpha((int) b.c(si0Var.B, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(si0Var.P.getPaddingLeft(), si0Var.P.getY(), ((si0Var.P.getX() + si0Var.P.getPaddingLeft()) + si0Var.P.getWidth()) - si0Var.P.getPaddingRight(), si0Var.P.getY() + si0Var.P.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = si0Var.R;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ji0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            si0 si0Var2 = ki0.this.A0;
                            canvas3.translate(si0Var2.P.getX(), si0Var2.P.getY() - si0Var2.P.getScrollY());
                            float textSize3 = f12 / si0Var2.P.getTextSize();
                            canvas3.scale(textSize3, textSize3, si0Var2.P.getPaddingLeft(), si0Var2.P.getPaddingTop());
                            si0Var2.P.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                si0Var.P.setAlpha(f14);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            si0Var.N.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.t1 t1Var2 = si0Var.o0;
            if (t1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f17 * 255.0f), 31);
                canvas2.translate(f15, f16);
                canvas2.translate(-f19, -f20);
                float lerp5 = AndroidUtilities.lerp(1.0f, li0Var.getScaleX(), si0Var.B);
                canvas2.scale(lerp5, lerp5, (-si0Var.N.getX()) + li0Var.getWidth(), (-si0Var.N.getY()) + li0Var.getHeight());
                float f21 = f12 / textSize;
                canvas2.scale(f21, f21, f19, f20);
                if (si0Var.N.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, si0Var.N.getPaddingTop());
                    si0Var.N.D1(canvas2, true, false);
                    canvas2.restore();
                }
                si0Var.N.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.u0;
                t1Var2.getLocationInWindow(iArr4);
                int translationY = si0Var.o0.getParent() instanceof View ? (int) ((View) si0Var.o0.getParent()).getTranslationY() : 0;
                int i11 = this.v0;
                int[] iArr5 = this.w0;
                if (i11 > translationY) {
                    c10 = 0;
                } else {
                    c10 = 0;
                }
                iArr5[c10] = iArr4[c10];
                iArr5[1] = iArr4[1];
                this.v0 = translationY;
                float lerp6 = AndroidUtilities.lerp(si0Var.N.getX() + li0Var.getX(), iArr5[c10], 1.0f - si0Var.B);
                float lerp7 = AndroidUtilities.lerp(si0Var.N.getY() + li0Var.getY(), iArr5[1], 1.0f - si0Var.B);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, li0Var.getScaleX(), si0Var.B);
                canvas2.scale(lerp8, lerp8, (-si0Var.N.getX()) + li0Var.getWidth(), (-si0Var.N.getY()) + li0Var.getHeight());
                si0Var.N.getTransitionParams().K1 = 1.0f - si0Var.B;
                si0Var.N.getTransitionParams().g0 = rect.left * si0Var.B;
                si0Var.N.getTransitionParams().j0 = rect.top * si0Var.B;
                si0Var.N.getTransitionParams().h0 = rect.right * si0Var.B;
                org.telegram.ui.Cells.s1 transitionParams = si0Var.N.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = si0Var.B;
                transitionParams.i0 = f22 * f23;
                si0Var.N.setTimeAlpha(1.0f - f23);
                if (si0Var.N.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, si0Var.o0.getWidth(), si0Var.o0.getHeight(), (int) (si0Var.B * 255.0f), 31);
                    canvas2.translate(0.0f, si0Var.N.getPaddingTop());
                    si0Var.N.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, si0Var.o0.getWidth(), si0Var.o0.getHeight(), (int) ((1.0f - si0Var.B) * 255.0f), 31);
                    canvas2.translate(0.0f, si0Var.o0.getPaddingTop());
                    si0Var.o0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                si0Var.N.draw(canvas2);
                if (si0Var.N.getTransitionParams().w0) {
                    si0Var.N.W1(canvas2, 1.0f);
                    si0Var.N.m2(1.0f - si0Var.B, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            g20 g20Var = this.x0;
            g20Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            g20Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (si0Var.w) {
            if (si0Var.y) {
                org.telegram.ui.Components.lg lgVar = si0Var.T;
                if (lgVar != null) {
                    lgVar.setAlpha(0.0f);
                }
                c3 = 0;
                si0Var.y = false;
            } else {
                c3 = 0;
            }
            canvas2.save();
            int i12 = iArr[c3];
            int width = si0Var.U.getWidth();
            si0Var.U.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), si0Var.U.getX(), si0Var.B), AndroidUtilities.lerp(iArr[1], si0Var.U.getY(), si0Var.B));
            if (si0Var.v && si0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, si0Var.U.getWidth(), si0Var.U.getHeight(), (int) (si0Var.B * 255.0f), 31);
            }
            si0Var.U.draw(canvas2);
            if (si0Var.v && si0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (si0Var.i0 != null) {
            if (si0Var.G == null) {
                si0Var.G = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((si0Var.i0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((si0Var.i0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (si0Var.i0.right - AndroidUtilities.dp(12.0f)), (int) (si0Var.i0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.y0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (si0Var.G.e() * 30.0f * si0Var.B));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            si0Var.G.setBounds(rect2);
            org.telegram.ui.Components.j5 j5Var = si0Var.G;
            j5Var.v = (int) (si0Var.B * 255.0f);
            j5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        si0 si0Var = this.A0;
        if (si0Var.w) {
            if (view == si0Var.U) {
                return false;
            }
            org.telegram.ui.Cells.t1 t1Var = si0Var.N;
            if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
