package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ag0 extends org.telegram.ui.Components.au0 {
    public final int[] g0;
    public final int[] h0;
    public int i0;
    public final int[] j0;
    public final h6.m k0;
    public final Paint l0;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 m0;
    public final /* synthetic */ fg0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(fg0 fg0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null);
        this.n0 = fg0Var;
        this.m0 = i6Var;
        this.g0 = new int[2];
        this.h0 = new int[2];
        this.i0 = 0;
        this.j0 = new int[2];
        this.k0 = new h6.m(29);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
        this.l0 = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.r1 r1Var;
        char c11;
        TextPaint textPaint;
        float f10;
        float height;
        float f11;
        float f12;
        float f13;
        final float f14;
        int i7;
        char c12;
        float f15;
        fg0 fg0Var = this.n0;
        int[] iArr2 = fg0Var.r0;
        Paint paint = fg0Var.T;
        float[] fArr = fg0Var.s0;
        Rect rect = fg0Var.y0;
        bg0 bg0Var = fg0Var.K;
        if (fg0Var.w && (r1Var = fg0Var.Q) != null && r1Var.getCurrentPosition() == null) {
            if (fg0Var.x) {
                org.telegram.ui.Components.gf gfVar = fg0Var.S;
                if (gfVar != null) {
                    gfVar.setAlpha(0.0f);
                } else {
                    ab.q qVar = fg0Var.m0;
                    if (qVar != null) {
                        qVar.C(true);
                    }
                }
                fg0Var.x = false;
            }
            boolean z10 = fg0Var.Q.getMessageObject() != null && fg0Var.Q.getMessageObject().D == 15;
            float textX = z10 ? fg0Var.Q.getPhotoImage().L0 : fg0Var.Q.getTextX();
            float textY = z10 ? fg0Var.Q.getPhotoImage().M0 : fg0Var.Q.getTextY();
            float x10 = fg0Var.Q.getX() + bg0Var.getX() + textX;
            float y10 = fg0Var.Q.getY() + bg0Var.getY() + textY;
            float f16 = textY;
            if (fg0Var.Q.getMessageObject() != null) {
                org.telegram.messenger.fj messageObject = fg0Var.Q.getMessageObject();
                c11 = 3;
                if (messageObject.P1 >= 1 && messageObject.k != null && !messageObject.u2()) {
                    int i10 = messageObject.P1;
                    int i11 = messageObject.Q1;
                    boolean z11 = i10 == i11;
                    switch (Math.max(i10, i11)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr[2];
                                break;
                            } else {
                                textPaint = textPaintArr[0];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr2[3];
                                break;
                            } else {
                                textPaint = textPaintArr2[1];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr3[4];
                                break;
                            } else {
                                textPaint = textPaintArr3[2];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr4[5];
                                break;
                            } else {
                                textPaint = textPaintArr4[3];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr5[5];
                                break;
                            } else {
                                textPaint = textPaintArr5[4];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.n6.y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.n6.o2;
                }
            } else {
                c11 = 3;
                textPaint = org.telegram.ui.ActionBar.n6.o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.gf gfVar2 = fg0Var.S;
            if (gfVar2 != null) {
                int[] iArr3 = this.g0;
                gfVar2.getLocationOnScreen(iArr3);
                float paddingLeft = fg0Var.S.getPaddingLeft() + iArr3[0];
                float paddingTop = (fg0Var.S.getPaddingTop() + iArr3[1]) - fg0Var.S.getScrollY();
                float textSize2 = fg0Var.S.getTextSize();
                int i12 = iArr3[1];
                float f17 = i12;
                height = fg0Var.S.getMeasuredHeight() + i12;
                float T1 = org.telegram.messenger.g0.T1(paddingLeft, x10, fg0Var.E);
                float T12 = org.telegram.messenger.g0.T1(paddingTop, y10, fg0Var.E);
                float T13 = org.telegram.messenger.g0.T1(textSize2, textSize, fg0Var.E);
                f10 = textX;
                f12 = T12;
                f13 = f17;
                f14 = T13;
                f11 = T1;
            } else {
                ab.q qVar2 = fg0Var.m0;
                if (qVar2 != null) {
                    float[] fArr2 = (float[]) qVar2.b;
                    if (((boolean[]) qVar2.c)[0] && qVar2.a) {
                        f10 = textX;
                        i7 = 4;
                    } else {
                        ji.e eVar = (ji.e) ((androidx.activity.n) qVar2.d).d;
                        eVar.getLocationOnScreen(eVar.p3);
                        int[] iArr4 = eVar.p3;
                        f10 = textX;
                        fArr2[0] = iArr4[0] + eVar.M2;
                        int i13 = iArr4[1];
                        fArr2[1] = i13 + eVar.N2;
                        RectF rectF = eVar.j0;
                        fArr2[2] = i13 + rectF.top;
                        fArr2[3] = i13 + rectF.bottom;
                        qVar2.a = true;
                        i7 = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i7);
                    float b10 = ((androidx.activity.n) fg0Var.m0.d).b();
                    f13 = fArr[2];
                    float f18 = fArr[c11];
                    float T14 = org.telegram.messenger.g0.T1(fArr[0], x10, fg0Var.E);
                    float T15 = org.telegram.messenger.g0.T1(fArr[1], y10, fg0Var.E);
                    height = f18;
                    f11 = T14;
                    f12 = T15;
                    f14 = org.telegram.messenger.g0.T1(b10, textSize, fg0Var.E);
                } else {
                    f10 = textX;
                    height = getHeight();
                    f11 = x10;
                    f12 = y10;
                    f13 = 0.0f;
                    f14 = textSize;
                }
            }
            float f19 = fg0Var.E;
            if (fg0Var.v0 != null) {
                f13 = fg0Var.w0;
            }
            float T16 = org.telegram.messenger.g0.T1(f13, ((1.0f - bg0Var.getScaleY()) * bg0Var.getHeight()) + bg0Var.getY(), fg0Var.E);
            float T17 = org.telegram.messenger.g0.T1(0.0f, bg0Var.canScrollVertically(-1) ? 1.0f : 0.0f, fg0Var.E);
            if (fg0Var.v0 != null) {
                height = fg0Var.x0;
            }
            float T18 = org.telegram.messenger.g0.T1(height, bg0Var.getY() + bg0Var.getHeight(), fg0Var.E);
            float T19 = org.telegram.messenger.g0.T1(0.0f, bg0Var.canScrollVertically(1) ? 1.0f : 0.0f, fg0Var.E);
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, T16 + 1.0f, getWidth(), T18 - 1.0f, org.telegram.messenger.ks.e4, 31);
            if (fg0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f19) * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate((-fg0Var.S.getX()) - fg0Var.S.getPaddingLeft(), ((-fg0Var.S.getY()) - fg0Var.S.getPaddingTop()) + fg0Var.S.getScrollY());
                float alpha = fg0Var.S.getAlpha();
                fg0Var.S.setAlpha(1.0f);
                if (fg0Var.E >= 0.001f) {
                    f15 = alpha;
                } else if (fg0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, fg0Var.S.getY());
                    f15 = alpha;
                    canvas2.saveLayerAlpha(fg0Var.S.getX() + fg0Var.S.getPaddingLeft(), 0.0f, ((fg0Var.S.getX() + fg0Var.S.getPaddingLeft()) + fg0Var.S.getWidth()) - fg0Var.S.getPaddingRight(), fg0Var.S.getHeight(), (int) org.telegram.messenger.n10.y(fg0Var.E, 0.1f, 1.0f, 255.0f), 31);
                    fg0Var.V.a(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    f15 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Je, this.m0));
                    paint.setAlpha((int) org.telegram.messenger.n10.y(fg0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(fg0Var.S.getPaddingLeft(), fg0Var.S.getY(), ((fg0Var.S.getX() + fg0Var.S.getPaddingLeft()) + fg0Var.S.getWidth()) - fg0Var.S.getPaddingRight(), fg0Var.S.getY() + fg0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = fg0Var.U;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.p10() { // from class: org.telegram.ui.zf0
                        @Override // org.telegram.messenger.p10
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            fg0 fg0Var2 = ag0.this.n0;
                            canvas3.translate(fg0Var2.S.getX(), fg0Var2.S.getY() - fg0Var2.S.getScrollY());
                            float textSize3 = f14 / fg0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, fg0Var2.S.getPaddingLeft(), fg0Var2.S.getPaddingTop());
                            fg0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                fg0Var.S.setAlpha(f15);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (fg0Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f19) * 255.0f), 31);
                    canvas2.translate(f11, f12);
                    float b11 = f14 / ((androidx.activity.n) fg0Var.m0.d).b();
                    canvas2.scale(b11, b11);
                    ab.q qVar3 = fg0Var.m0;
                    if (!((boolean[]) qVar3.c)[0]) {
                        ji.e eVar2 = (ji.e) ((androidx.activity.n) qVar3.d).d;
                        StaticLayout staticLayout = eVar2.P0;
                        TextPaint textPaint2 = eVar2.d;
                        if (staticLayout != null) {
                            int alpha2 = textPaint2.getAlpha();
                            textPaint2.setAlpha(org.telegram.messenger.ks.e4);
                            eVar2.P0.draw(canvas2);
                            textPaint2.setAlpha(alpha2);
                        }
                    }
                    canvas2.restore();
                }
            }
            r10 = 1;
            fg0Var.Q.getTransitionParams().y0 = true;
            org.telegram.ui.Cells.r1 r1Var2 = fg0Var.v0;
            if (r1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f19 * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate(-f20, -f16);
                float T110 = org.telegram.messenger.g0.T1(1.0f, bg0Var.getScaleX(), fg0Var.E);
                canvas2.scale(T110, T110, (-fg0Var.Q.getX()) + bg0Var.getWidth(), (-fg0Var.Q.getY()) + bg0Var.getHeight());
                float f21 = f14 / textSize;
                canvas2.scale(f21, f21, f20, f16);
                if (fg0Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, fg0Var.Q.getPaddingTop());
                    fg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                fg0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.h0;
                r1Var2.getLocationInWindow(iArr5);
                int translationY = fg0Var.v0.getParent() instanceof View ? (int) ((View) fg0Var.v0.getParent()).getTranslationY() : 0;
                int i14 = this.i0;
                int[] iArr6 = this.j0;
                if (i14 <= translationY || iArr6[1] - iArr5[1] <= i14) {
                    c12 = 0;
                    iArr6[0] = iArr5[0];
                    iArr6[1] = iArr5[1];
                } else {
                    c12 = 0;
                }
                this.i0 = translationY;
                float T111 = org.telegram.messenger.g0.T1(fg0Var.Q.getX() + bg0Var.getX(), iArr6[c12], 1.0f - fg0Var.E);
                float T112 = org.telegram.messenger.g0.T1(fg0Var.Q.getY() + bg0Var.getY(), iArr6[1], 1.0f - fg0Var.E);
                canvas2.save();
                canvas2.translate(T111, T112);
                float T113 = org.telegram.messenger.g0.T1(1.0f, bg0Var.getScaleX(), fg0Var.E);
                canvas2.scale(T113, T113, (-fg0Var.Q.getX()) + bg0Var.getWidth(), (-fg0Var.Q.getY()) + bg0Var.getHeight());
                fg0Var.Q.getTransitionParams().L1 = 1.0f - fg0Var.E;
                fg0Var.Q.getTransitionParams().h0 = rect.left * fg0Var.E;
                fg0Var.Q.getTransitionParams().k0 = rect.top * fg0Var.E;
                fg0Var.Q.getTransitionParams().i0 = rect.right * fg0Var.E;
                org.telegram.ui.Cells.y1 transitionParams = fg0Var.Q.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = fg0Var.E;
                transitionParams.j0 = f22 * f23;
                fg0Var.Q.setTimeAlpha(1.0f - f23);
                if (fg0Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, fg0Var.v0.getWidth(), fg0Var.v0.getHeight(), (int) (fg0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, fg0Var.Q.getPaddingTop());
                    fg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, fg0Var.v0.getWidth(), fg0Var.v0.getHeight(), (int) ((1.0f - fg0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, fg0Var.v0.getPaddingTop());
                    fg0Var.v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                fg0Var.Q.draw(canvas2);
                if (fg0Var.Q.getTransitionParams().x0) {
                    fg0Var.Q.h1(canvas2, 1.0f);
                    fg0Var.Q.y1(1.0f - fg0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, T16, getWidth(), org.telegram.messenger.g0.L(14.0f) + T16);
            h6.m mVar = this.k0;
            mVar.n(canvas2, rectF2, 1, T17);
            rectF2.set(0.0f, T18 - org.telegram.messenger.g0.L(14.0f), getWidth(), T18);
            mVar.n(canvas2, rectF2, 3, T19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (fg0Var.w) {
            if (fg0Var.y) {
                fg0Var.o(r10, 1.0f);
                c10 = 0;
                fg0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i15 = iArr[c10];
            int width = fg0Var.X.getWidth();
            fg0Var.X.getHeight();
            canvas2.translate(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(6.0f) + (i15 - (width - r4.m())), fg0Var.X.getX(), fg0Var.E), org.telegram.messenger.g0.T1(iArr[r10], fg0Var.X.getY(), fg0Var.E));
            if (fg0Var.s && fg0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, fg0Var.X.getWidth(), fg0Var.X.getHeight(), (int) (fg0Var.E * 255.0f), 31);
            }
            fg0Var.X.draw(canvas2);
            if (fg0Var.s && fg0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (fg0Var.l0 != null) {
            if (fg0Var.J == null) {
                fg0Var.J = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) ((fg0Var.l0.right - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) ((fg0Var.l0.bottom - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) (fg0Var.l0.right - org.telegram.messenger.g0.L(12.0f)), (int) (fg0Var.l0.bottom - org.telegram.messenger.g0.L(12.0f)));
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rect2);
            rectF3.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.l0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (fg0Var.J.e() * 30.0f * fg0Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            fg0Var.J.setBounds(rect2);
            org.telegram.ui.Components.m5 m5Var = fg0Var.J;
            m5Var.w = (int) (fg0Var.E * 255.0f);
            m5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fg0 fg0Var = this.n0;
        if (fg0Var.w) {
            if (view == fg0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.r1 r1Var = fg0Var.Q;
            if (view == r1Var && r1Var != null && r1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
