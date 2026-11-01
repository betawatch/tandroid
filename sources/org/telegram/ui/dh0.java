package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dh0 extends org.telegram.ui.Components.vu0 {
    public final int[] f0;
    public final int[] g0;
    public int h0;
    public final int[] i0;
    public final li.k j0;
    public final Paint k0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 l0;
    public final /* synthetic */ ih0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh0(ih0 ih0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null);
        this.m0 = ih0Var;
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
    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
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
        ih0 ih0Var = this.m0;
        int[] iArr2 = ih0Var.n0;
        Paint paint = ih0Var.S;
        Rect rect = ih0Var.t0;
        eh0 eh0Var = ih0Var.J;
        if (ih0Var.w && (q1Var = ih0Var.P) != null && q1Var.getCurrentPosition() == null) {
            if (ih0Var.x) {
                org.telegram.ui.Components.se seVar = ih0Var.R;
                if (seVar != null) {
                    seVar.setAlpha(0.0f);
                }
                ih0Var.x = false;
            }
            boolean z11 = ih0Var.P.getMessageObject() != null && ih0Var.P.getMessageObject().D == 15;
            float textX = z11 ? ih0Var.P.getPhotoImage().K0 : ih0Var.P.getTextX();
            float textY = z11 ? ih0Var.P.getPhotoImage().L0 : ih0Var.P.getTextY();
            float x10 = ih0Var.P.getX() + eh0Var.getX() + textX;
            float y3 = ih0Var.P.getY() + eh0Var.getY() + textY;
            if (ih0Var.P.getMessageObject() != null) {
                org.telegram.messenger.kj messageObject = ih0Var.P.getMessageObject();
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
            org.telegram.ui.Components.se seVar2 = ih0Var.R;
            if (seVar2 != null) {
                z10 = false;
                int[] iArr3 = this.f0;
                seVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = ih0Var.R.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (ih0Var.R.getPaddingTop() + iArr3[1]) - ih0Var.R.getScrollY();
                float textSize2 = ih0Var.R.getTextSize();
                int i13 = iArr3[1];
                f7 = textY;
                height = ih0Var.R.getMeasuredHeight() + i13;
                float T1 = org.telegram.messenger.i0.T1(paddingLeft, x10, ih0Var.D);
                float T12 = org.telegram.messenger.i0.T1(paddingTop, y3, ih0Var.D);
                f11 = org.telegram.messenger.i0.T1(textSize2, textSize, ih0Var.D);
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
            float f16 = ih0Var.D;
            if (ih0Var.q0 != null) {
                f12 = ih0Var.r0;
            }
            float T13 = org.telegram.messenger.i0.T1(f12, ((1.0f - eh0Var.getScaleY()) * eh0Var.getHeight()) + eh0Var.getY(), ih0Var.D);
            float f17 = height;
            float T14 = org.telegram.messenger.i0.T1(0.0f, eh0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ih0Var.D);
            float T15 = org.telegram.messenger.i0.T1(ih0Var.q0 != null ? ih0Var.s0 : f17, eh0Var.getY() + eh0Var.getHeight(), ih0Var.D);
            float T16 = org.telegram.messenger.i0.T1(0.0f, eh0Var.canScrollVertically(i10) ? 1.0f : 0.0f, ih0Var.D);
            float f18 = textX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, T13 + 1.0f, getWidth(), T15 - 1.0f, org.telegram.messenger.at.e4, 31);
            if (ih0Var.R != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f13, f14);
                canvas2.translate((-ih0Var.R.getX()) - ih0Var.R.getPaddingLeft(), ((-ih0Var.R.getY()) - ih0Var.R.getPaddingTop()) + ih0Var.R.getScrollY());
                float alpha = ih0Var.R.getAlpha();
                ih0Var.R.setAlpha(1.0f);
                if (ih0Var.D >= 0.001f) {
                    f15 = alpha;
                } else if (ih0Var.U != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ih0Var.R.getY());
                    canvas2.saveLayerAlpha(ih0Var.R.getX() + ih0Var.R.getPaddingLeft(), 0.0f, ((ih0Var.R.getX() + ih0Var.R.getPaddingLeft()) + ih0Var.R.getWidth()) - ih0Var.R.getPaddingRight(), ih0Var.R.getHeight(), (int) org.telegram.messenger.a30.x(ih0Var.D, 0.1f, 1.0f, f10), 31);
                    ih0Var.U.a(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f15 = alpha;
                } else {
                    f15 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, this.l0));
                    paint.setAlpha((int) org.telegram.messenger.a30.x(ih0Var.D, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ih0Var.R.getPaddingLeft(), ih0Var.R.getY(), ((ih0Var.R.getX() + ih0Var.R.getPaddingLeft()) + ih0Var.R.getWidth()) - ih0Var.R.getPaddingRight(), ih0Var.R.getY() + ih0Var.R.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ih0Var.T;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.j20() { // from class: org.telegram.ui.ch0
                        @Override // org.telegram.messenger.j20
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ih0 ih0Var2 = dh0.this.m0;
                            canvas3.translate(ih0Var2.R.getX(), ih0Var2.R.getY() - ih0Var2.R.getScrollY());
                            float textSize3 = f11 / ih0Var2.R.getTextSize();
                            canvas3.scale(textSize3, textSize3, ih0Var2.R.getPaddingLeft(), ih0Var2.R.getPaddingTop());
                            ih0Var2.R.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ih0Var.R.setAlpha(f15);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ih0Var.P.getTransitionParams().y0 = true;
            org.telegram.ui.Cells.q1 q1Var2 = ih0Var.q0;
            if (q1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f13, f14);
                canvas2.translate(-f18, -f19);
                float T17 = org.telegram.messenger.i0.T1(1.0f, eh0Var.getScaleX(), ih0Var.D);
                canvas2.scale(T17, T17, (-ih0Var.P.getX()) + eh0Var.getWidth(), (-ih0Var.P.getY()) + eh0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (ih0Var.P.J0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ih0Var.P.getPaddingTop());
                    ih0Var.P.K0(canvas2, true, z10);
                    canvas2.restore();
                }
                ih0Var.P.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.g0;
                q1Var2.getLocationInWindow(iArr4);
                int translationY = ih0Var.q0.getParent() instanceof View ? (int) ((View) ih0Var.q0.getParent()).getTranslationY() : 0;
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
                float T18 = org.telegram.messenger.i0.T1(ih0Var.P.getX() + eh0Var.getX(), iArr5[c11], 1.0f - ih0Var.D);
                float T19 = org.telegram.messenger.i0.T1(ih0Var.P.getY() + eh0Var.getY(), iArr5[1], 1.0f - ih0Var.D);
                canvas2.save();
                canvas2.translate(T18, T19);
                float T110 = org.telegram.messenger.i0.T1(1.0f, eh0Var.getScaleX(), ih0Var.D);
                canvas2.scale(T110, T110, (-ih0Var.P.getX()) + eh0Var.getWidth(), (-ih0Var.P.getY()) + eh0Var.getHeight());
                ih0Var.P.getTransitionParams().L1 = 1.0f - ih0Var.D;
                ih0Var.P.getTransitionParams().h0 = rect.left * ih0Var.D;
                ih0Var.P.getTransitionParams().k0 = rect.top * ih0Var.D;
                ih0Var.P.getTransitionParams().i0 = rect.right * ih0Var.D;
                org.telegram.ui.Cells.x1 transitionParams = ih0Var.P.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = ih0Var.D;
                transitionParams.j0 = f21 * f22;
                ih0Var.P.setTimeAlpha(1.0f - f22);
                if (ih0Var.P.J0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ih0Var.q0.getWidth(), ih0Var.q0.getHeight(), (int) (ih0Var.D * 255.0f), 31);
                    canvas2.translate(0.0f, ih0Var.P.getPaddingTop());
                    ih0Var.P.K0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ih0Var.q0.getWidth(), ih0Var.q0.getHeight(), (int) ((1.0f - ih0Var.D) * 255.0f), 31);
                    canvas2.translate(0.0f, ih0Var.q0.getPaddingTop());
                    ih0Var.q0.K0(canvas2, true, false);
                    canvas2.restore();
                }
                ih0Var.P.draw(canvas2);
                if (ih0Var.P.getTransitionParams().x0) {
                    ih0Var.P.f1(canvas2, 1.0f);
                    ih0Var.P.v1(1.0f - ih0Var.D, canvas2, true);
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
        if (ih0Var.w) {
            if (ih0Var.y) {
                org.telegram.ui.Components.zf zfVar = ih0Var.V;
                if (zfVar != null) {
                    zfVar.setAlpha(0.0f);
                }
                c10 = 0;
                ih0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i15 = iArr[c10];
            int width = ih0Var.W.getWidth();
            ih0Var.W.getHeight();
            canvas2.translate(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(6.0f) + (i15 - (width - r4.m())), ih0Var.W.getX(), ih0Var.D), org.telegram.messenger.i0.T1(iArr[1], ih0Var.W.getY(), ih0Var.D));
            if (ih0Var.s && ih0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ih0Var.W.getWidth(), ih0Var.W.getHeight(), (int) (ih0Var.D * 255.0f), 31);
            }
            ih0Var.W.draw(canvas2);
            if (ih0Var.s && ih0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ih0Var.k0 != null) {
            if (ih0Var.I == null) {
                ih0Var.I = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.i0.Q;
            rect2.set((int) ((ih0Var.k0.right - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(24.0f)), (int) ((ih0Var.k0.bottom - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(24.0f)), (int) (ih0Var.k0.right - org.telegram.messenger.i0.L(12.0f)), (int) (ih0Var.k0.bottom - org.telegram.messenger.i0.L(12.0f)));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(rect2);
            rectF2.inset(-org.telegram.messenger.i0.L(12.0f), -org.telegram.messenger.i0.L(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.k0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ih0Var.I.e() * 30.0f * ih0Var.D));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            ih0Var.I.setBounds(rect2);
            org.telegram.ui.Components.d5 d5Var = ih0Var.I;
            d5Var.w = (int) (ih0Var.D * 255.0f);
            d5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ih0 ih0Var = this.m0;
        if (ih0Var.w) {
            if (view == ih0Var.W) {
                return false;
            }
            org.telegram.ui.Cells.q1 q1Var = ih0Var.P;
            if (view == q1Var && q1Var != null && q1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
