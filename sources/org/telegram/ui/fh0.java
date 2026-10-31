package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fh0 extends org.telegram.ui.Components.uu0 {
    public final int[] f0;
    public final int[] g0;
    public int h0;
    public final int[] i0;
    public final li.k j0;
    public final Paint k0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 l0;
    public final /* synthetic */ kh0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(kh0 kh0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null);
        this.m0 = kh0Var;
        this.l0 = p6Var;
        this.f0 = new int[2];
        this.g0 = new int[2];
        this.h0 = 0;
        this.i0 = new int[2];
        this.j0 = new li.k(23);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        this.k0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03db, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L113;
     */
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.q1 q1Var;
        TextPaint textPaint;
        float f7;
        int i10;
        boolean z10;
        float f10;
        float height;
        final float f11;
        float f12;
        float f13;
        float f14;
        char c11;
        float f15;
        kh0 kh0Var = this.m0;
        int[] iArr2 = kh0Var.n0;
        Paint paint = kh0Var.S;
        Rect rect = kh0Var.t0;
        gh0 gh0Var = kh0Var.J;
        if (kh0Var.w && (q1Var = kh0Var.P) != null && q1Var.getCurrentPosition() == null) {
            if (kh0Var.x) {
                org.telegram.ui.Components.se seVar = kh0Var.R;
                if (seVar != null) {
                    seVar.setAlpha(0.0f);
                }
                kh0Var.x = false;
            }
            boolean z11 = kh0Var.P.getMessageObject() != null && kh0Var.P.getMessageObject().D == 15;
            float textX = z11 ? kh0Var.P.getPhotoImage().K0 : kh0Var.P.getTextX();
            float textY = z11 ? kh0Var.P.getPhotoImage().L0 : kh0Var.P.getTextY();
            float x10 = kh0Var.P.getX() + gh0Var.getX() + textX;
            float y3 = kh0Var.P.getY() + gh0Var.getY() + textY;
            if (kh0Var.P.getMessageObject() != null) {
                org.telegram.messenger.jj messageObject = kh0Var.P.getMessageObject();
                if (messageObject.N1 >= 1 && messageObject.k != null && !messageObject.u2()) {
                    int i11 = messageObject.N1;
                    int i12 = messageObject.O1;
                    boolean z12 = i11 == i12;
                    switch (Math.max(i11, i12)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.t6.y2;
                            if (!z12) {
                                textPaint = textPaintArr[2];
                                break;
                            } else {
                                textPaint = textPaintArr[0];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.t6.y2;
                            if (!z12) {
                                textPaint = textPaintArr2[3];
                                break;
                            } else {
                                textPaint = textPaintArr2[1];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.t6.y2;
                            if (!z12) {
                                textPaint = textPaintArr3[4];
                                break;
                            } else {
                                textPaint = textPaintArr3[2];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.t6.y2;
                            if (!z12) {
                                textPaint = textPaintArr4[5];
                                break;
                            } else {
                                textPaint = textPaintArr4[3];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.t6.y2;
                            if (!z12) {
                                textPaint = textPaintArr5[5];
                                break;
                            } else {
                                textPaint = textPaintArr5[4];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.t6.y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.t6.o2;
                }
            } else {
                textPaint = org.telegram.ui.ActionBar.t6.o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.se seVar2 = kh0Var.R;
            if (seVar2 != null) {
                z10 = false;
                int[] iArr3 = this.f0;
                seVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = kh0Var.R.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (kh0Var.R.getPaddingTop() + iArr3[1]) - kh0Var.R.getScrollY();
                float textSize2 = kh0Var.R.getTextSize();
                int i13 = iArr3[1];
                f7 = textY;
                height = kh0Var.R.getMeasuredHeight() + i13;
                float T1 = org.telegram.messenger.i0.T1(paddingLeft, x10, kh0Var.D);
                float T12 = org.telegram.messenger.i0.T1(paddingTop, y3, kh0Var.D);
                f11 = org.telegram.messenger.i0.T1(textSize2, textSize, kh0Var.D);
                f12 = i13;
                f14 = T12;
                f13 = T1;
            } else {
                f7 = textY;
                i10 = 1;
                z10 = false;
                f10 = 255.0f;
                height = getHeight();
                f11 = textSize;
                f12 = 0.0f;
                f13 = x10;
                f14 = y3;
            }
            float f16 = kh0Var.D;
            if (kh0Var.q0 != null) {
                f12 = kh0Var.r0;
            }
            float T13 = org.telegram.messenger.i0.T1(f12, ((1.0f - gh0Var.getScaleY()) * gh0Var.getHeight()) + gh0Var.getY(), kh0Var.D);
            float f17 = height;
            float T14 = org.telegram.messenger.i0.T1(0.0f, gh0Var.canScrollVertically(-1) ? 1.0f : 0.0f, kh0Var.D);
            float T15 = org.telegram.messenger.i0.T1(kh0Var.q0 != null ? kh0Var.s0 : f17, gh0Var.getY() + gh0Var.getHeight(), kh0Var.D);
            float T16 = org.telegram.messenger.i0.T1(0.0f, gh0Var.canScrollVertically(i10) ? 1.0f : 0.0f, kh0Var.D);
            float f18 = textX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, T13 + 1.0f, getWidth(), T15 - 1.0f, org.telegram.messenger.zs.e4, 31);
            if (kh0Var.R != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f13, f14);
                canvas2.translate((-kh0Var.R.getX()) - kh0Var.R.getPaddingLeft(), ((-kh0Var.R.getY()) - kh0Var.R.getPaddingTop()) + kh0Var.R.getScrollY());
                float alpha = kh0Var.R.getAlpha();
                kh0Var.R.setAlpha(1.0f);
                if (kh0Var.D >= 0.001f) {
                    f15 = alpha;
                } else if (kh0Var.U != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, kh0Var.R.getY());
                    canvas2.saveLayerAlpha(kh0Var.R.getX() + kh0Var.R.getPaddingLeft(), 0.0f, ((kh0Var.R.getX() + kh0Var.R.getPaddingLeft()) + kh0Var.R.getWidth()) - kh0Var.R.getPaddingRight(), kh0Var.R.getHeight(), (int) org.telegram.messenger.z20.x(kh0Var.D, 0.1f, 1.0f, f10), 31);
                    kh0Var.U.a(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f15 = alpha;
                } else {
                    f15 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, this.l0));
                    paint.setAlpha((int) org.telegram.messenger.z20.x(kh0Var.D, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(kh0Var.R.getPaddingLeft(), kh0Var.R.getY(), ((kh0Var.R.getX() + kh0Var.R.getPaddingLeft()) + kh0Var.R.getWidth()) - kh0Var.R.getPaddingRight(), kh0Var.R.getY() + kh0Var.R.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = kh0Var.T;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.i20() { // from class: org.telegram.ui.eh0
                        @Override // org.telegram.messenger.i20
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            kh0 kh0Var2 = fh0.this.m0;
                            canvas3.translate(kh0Var2.R.getX(), kh0Var2.R.getY() - kh0Var2.R.getScrollY());
                            float textSize3 = f11 / kh0Var2.R.getTextSize();
                            canvas3.scale(textSize3, textSize3, kh0Var2.R.getPaddingLeft(), kh0Var2.R.getPaddingTop());
                            kh0Var2.R.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                kh0Var.R.setAlpha(f15);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            kh0Var.P.getTransitionParams().y0 = true;
            org.telegram.ui.Cells.q1 q1Var2 = kh0Var.q0;
            if (q1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f13, f14);
                canvas2.translate(-f18, -f19);
                float T17 = org.telegram.messenger.i0.T1(1.0f, gh0Var.getScaleX(), kh0Var.D);
                canvas2.scale(T17, T17, (-kh0Var.P.getX()) + gh0Var.getWidth(), (-kh0Var.P.getY()) + gh0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (kh0Var.P.J0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, kh0Var.P.getPaddingTop());
                    kh0Var.P.K0(canvas2, true, z10);
                    canvas2.restore();
                }
                kh0Var.P.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.g0;
                q1Var2.getLocationInWindow(iArr4);
                int translationY = kh0Var.q0.getParent() instanceof View ? (int) ((View) kh0Var.q0.getParent()).getTranslationY() : 0;
                int i14 = this.h0;
                int[] iArr5 = this.i0;
                if (i14 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.h0 = translationY;
                float T18 = org.telegram.messenger.i0.T1(kh0Var.P.getX() + gh0Var.getX(), iArr5[c11], 1.0f - kh0Var.D);
                float T19 = org.telegram.messenger.i0.T1(kh0Var.P.getY() + gh0Var.getY(), iArr5[1], 1.0f - kh0Var.D);
                canvas2.save();
                canvas2.translate(T18, T19);
                float T110 = org.telegram.messenger.i0.T1(1.0f, gh0Var.getScaleX(), kh0Var.D);
                canvas2.scale(T110, T110, (-kh0Var.P.getX()) + gh0Var.getWidth(), (-kh0Var.P.getY()) + gh0Var.getHeight());
                kh0Var.P.getTransitionParams().L1 = 1.0f - kh0Var.D;
                kh0Var.P.getTransitionParams().h0 = rect.left * kh0Var.D;
                kh0Var.P.getTransitionParams().k0 = rect.top * kh0Var.D;
                kh0Var.P.getTransitionParams().i0 = rect.right * kh0Var.D;
                org.telegram.ui.Cells.x1 transitionParams = kh0Var.P.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = kh0Var.D;
                transitionParams.j0 = f21 * f22;
                kh0Var.P.setTimeAlpha(1.0f - f22);
                if (kh0Var.P.J0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, kh0Var.q0.getWidth(), kh0Var.q0.getHeight(), (int) (kh0Var.D * 255.0f), 31);
                    canvas2.translate(0.0f, kh0Var.P.getPaddingTop());
                    kh0Var.P.K0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, kh0Var.q0.getWidth(), kh0Var.q0.getHeight(), (int) ((1.0f - kh0Var.D) * 255.0f), 31);
                    canvas2.translate(0.0f, kh0Var.q0.getPaddingTop());
                    kh0Var.q0.K0(canvas2, true, false);
                    canvas2.restore();
                }
                kh0Var.P.draw(canvas2);
                if (kh0Var.P.getTransitionParams().x0) {
                    kh0Var.P.f1(canvas2, 1.0f);
                    kh0Var.P.v1(1.0f - kh0Var.D, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, T13, getWidth(), org.telegram.messenger.i0.L(14.0f) + T13);
            li.k kVar = this.j0;
            kVar.o(canvas2, rectF, 1, T14);
            rectF.set(0.0f, T15 - org.telegram.messenger.i0.L(14.0f), getWidth(), T15);
            kVar.o(canvas2, rectF, 3, T16);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (kh0Var.w) {
            if (kh0Var.y) {
                org.telegram.ui.Components.zf zfVar = kh0Var.V;
                if (zfVar != null) {
                    zfVar.setAlpha(0.0f);
                }
                c10 = 0;
                kh0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i15 = iArr[c10];
            int width = kh0Var.W.getWidth();
            kh0Var.W.getHeight();
            canvas2.translate(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(6.0f) + (i15 - (width - r4.m())), kh0Var.W.getX(), kh0Var.D), org.telegram.messenger.i0.T1(iArr[1], kh0Var.W.getY(), kh0Var.D));
            if (kh0Var.s && kh0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, kh0Var.W.getWidth(), kh0Var.W.getHeight(), (int) (kh0Var.D * 255.0f), 31);
            }
            kh0Var.W.draw(canvas2);
            if (kh0Var.s && kh0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (kh0Var.k0 != null) {
            if (kh0Var.I == null) {
                kh0Var.I = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.i0.Q;
            rect2.set((int) ((kh0Var.k0.right - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(24.0f)), (int) ((kh0Var.k0.bottom - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(24.0f)), (int) (kh0Var.k0.right - org.telegram.messenger.i0.L(12.0f)), (int) (kh0Var.k0.bottom - org.telegram.messenger.i0.L(12.0f)));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(rect2);
            rectF2.inset(-org.telegram.messenger.i0.L(12.0f), -org.telegram.messenger.i0.L(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.k0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (kh0Var.I.e() * 30.0f * kh0Var.D));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            kh0Var.I.setBounds(rect2);
            org.telegram.ui.Components.d5 d5Var = kh0Var.I;
            d5Var.w = (int) (kh0Var.D * 255.0f);
            d5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kh0 kh0Var = this.m0;
        if (kh0Var.w) {
            if (view == kh0Var.W) {
                return false;
            }
            org.telegram.ui.Cells.q1 q1Var = kh0Var.P;
            if (view == q1Var && q1Var != null && q1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
