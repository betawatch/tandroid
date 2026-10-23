package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ei0 extends org.telegram.ui.Components.lw0 {
    public final s10 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 C0;
    public final /* synthetic */ mi0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei0(mi0 mi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = mi0Var;
        this.C0 = d6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new s10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0380, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
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
        mi0 mi0Var = this.D0;
        int[] iArr2 = mi0Var.n0;
        Paint paint = mi0Var.S;
        Rect rect = mi0Var.t0;
        fi0 fi0Var = mi0Var.J;
        if (mi0Var.v && (u1Var = mi0Var.P) != null && u1Var.getCurrentPosition() == null) {
            if (mi0Var.w) {
                org.telegram.ui.Components.pf pfVar = mi0Var.R;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                mi0Var.w = false;
            }
            boolean z11 = mi0Var.P.getMessageObject() != null && mi0Var.P.getMessageObject().type == 15;
            float imageX = z11 ? mi0Var.P.getPhotoImage().getImageX() : mi0Var.P.getTextX();
            float imageY = z11 ? mi0Var.P.getPhotoImage().getImageY() : mi0Var.P.getTextY();
            float x10 = mi0Var.P.getX() + fi0Var.getX() + imageX;
            float y3 = mi0Var.P.getY() + fi0Var.getY() + imageY;
            float textSize = (mi0Var.P.getMessageObject() != null ? mi0Var.P.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.h6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = mi0Var.R;
            if (pfVar2 != null) {
                z10 = false;
                int[] iArr3 = this.w0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = mi0Var.R.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (mi0Var.R.getPaddingTop() + iArr3[1]) - mi0Var.R.getScrollY();
                float textSize2 = mi0Var.R.getTextSize();
                int i11 = iArr3[1];
                f7 = imageY;
                height = mi0Var.R.getMeasuredHeight() + i11;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, mi0Var.y);
                y3 = AndroidUtilities.lerp(paddingTop, y3, mi0Var.y);
                f11 = AndroidUtilities.lerp(textSize2, textSize, mi0Var.y);
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
            float f16 = mi0Var.y;
            if (mi0Var.q0 != null) {
                f12 = mi0Var.r0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - fi0Var.getScaleY()) * fi0Var.getHeight()) + fi0Var.getY(), mi0Var.y);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, fi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, mi0Var.y);
            float lerp3 = AndroidUtilities.lerp(mi0Var.q0 != null ? mi0Var.s0 : f17, fi0Var.getY() + fi0Var.getHeight(), mi0Var.y);
            float lerp4 = AndroidUtilities.lerp(0.0f, fi0Var.canScrollVertically(i10) ? 1.0f : 0.0f, mi0Var.y);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (mi0Var.R != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-mi0Var.R.getX()) - mi0Var.R.getPaddingLeft(), ((-mi0Var.R.getY()) - mi0Var.R.getPaddingTop()) + mi0Var.R.getScrollY());
                float alpha = mi0Var.R.getAlpha();
                mi0Var.R.setAlpha(1.0f);
                if (mi0Var.y >= 0.001f) {
                    f13 = alpha;
                } else if (mi0Var.U != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, mi0Var.R.getY());
                    canvas2.saveLayerAlpha(mi0Var.R.getX() + mi0Var.R.getPaddingLeft(), 0.0f, ((mi0Var.R.getX() + mi0Var.R.getPaddingLeft()) + mi0Var.R.getWidth()) - mi0Var.R.getPaddingRight(), mi0Var.R.getHeight(), (int) org.telegram.messenger.nk.z(mi0Var.y, 0.1f, 1.0f, f10), 31);
                    mi0Var.U.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.nk.z(mi0Var.y, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(mi0Var.R.getPaddingLeft(), mi0Var.R.getY(), ((mi0Var.R.getX() + mi0Var.R.getPaddingLeft()) + mi0Var.R.getWidth()) - mi0Var.R.getPaddingRight(), mi0Var.R.getY() + mi0Var.R.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = mi0Var.T;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.di0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            mi0 mi0Var2 = ei0.this.D0;
                            canvas3.translate(mi0Var2.R.getX(), mi0Var2.R.getY() - mi0Var2.R.getScrollY());
                            float textSize3 = f11 / mi0Var2.R.getTextSize();
                            canvas3.scale(textSize3, textSize3, mi0Var2.R.getPaddingLeft(), mi0Var2.R.getPaddingTop());
                            mi0Var2.R.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                mi0Var.R.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            mi0Var.P.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.u1 u1Var2 = mi0Var.q0;
            if (u1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, fi0Var.getScaleX(), mi0Var.y);
                canvas2.scale(lerp5, lerp5, (-mi0Var.P.getX()) + fi0Var.getWidth(), (-mi0Var.P.getY()) + fi0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (mi0Var.P.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, mi0Var.P.getPaddingTop());
                    mi0Var.P.D1(canvas2, true, z10);
                    canvas2.restore();
                }
                mi0Var.P.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                u1Var2.getLocationInWindow(iArr4);
                int translationY = mi0Var.q0.getParent() instanceof View ? (int) ((View) mi0Var.q0.getParent()).getTranslationY() : 0;
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
                float lerp6 = AndroidUtilities.lerp(mi0Var.P.getX() + fi0Var.getX(), iArr5[c11], 1.0f - mi0Var.y);
                float lerp7 = AndroidUtilities.lerp(mi0Var.P.getY() + fi0Var.getY(), iArr5[1], 1.0f - mi0Var.y);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, fi0Var.getScaleX(), mi0Var.y);
                canvas2.scale(lerp8, lerp8, (-mi0Var.P.getX()) + fi0Var.getWidth(), (-mi0Var.P.getY()) + fi0Var.getHeight());
                mi0Var.P.getTransitionParams().K1 = 1.0f - mi0Var.y;
                mi0Var.P.getTransitionParams().g0 = rect.left * mi0Var.y;
                mi0Var.P.getTransitionParams().j0 = rect.top * mi0Var.y;
                mi0Var.P.getTransitionParams().h0 = rect.right * mi0Var.y;
                org.telegram.ui.Cells.t1 transitionParams = mi0Var.P.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = mi0Var.y;
                transitionParams.i0 = f21 * f22;
                mi0Var.P.setTimeAlpha(1.0f - f22);
                if (mi0Var.P.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, mi0Var.q0.getWidth(), mi0Var.q0.getHeight(), (int) (mi0Var.y * 255.0f), 31);
                    canvas2.translate(0.0f, mi0Var.P.getPaddingTop());
                    mi0Var.P.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, mi0Var.q0.getWidth(), mi0Var.q0.getHeight(), (int) ((1.0f - mi0Var.y) * 255.0f), 31);
                    canvas2.translate(0.0f, mi0Var.q0.getPaddingTop());
                    mi0Var.q0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                mi0Var.P.draw(canvas2);
                if (mi0Var.P.getTransitionParams().w0) {
                    mi0Var.P.W1(canvas2, 1.0f);
                    mi0Var.P.m2(1.0f - mi0Var.y, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            s10 s10Var = this.A0;
            s10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            s10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (mi0Var.v) {
            if (mi0Var.x) {
                org.telegram.ui.Components.vg vgVar = mi0Var.V;
                if (vgVar != null) {
                    vgVar.setAlpha(0.0f);
                }
                c10 = 0;
                mi0Var.x = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i13 = iArr[c10];
            int width = mi0Var.W.getWidth();
            mi0Var.W.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i13 - (width - r4.m())), mi0Var.W.getX(), mi0Var.y), AndroidUtilities.lerp(iArr[1], mi0Var.W.getY(), mi0Var.y));
            if (mi0Var.s && mi0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, mi0Var.W.getWidth(), mi0Var.W.getHeight(), (int) (mi0Var.y * 255.0f), 31);
            }
            mi0Var.W.draw(canvas2);
            if (mi0Var.s && mi0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (mi0Var.k0 != null) {
            if (mi0Var.I == null) {
                mi0Var.I = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((mi0Var.k0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((mi0Var.k0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (mi0Var.k0.right - AndroidUtilities.dp(12.0f)), (int) (mi0Var.k0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (mi0Var.I.e() * 30.0f * mi0Var.y));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            mi0Var.I.setBounds(rect2);
            org.telegram.ui.Components.p5 p5Var = mi0Var.I;
            p5Var.v = (int) (mi0Var.y * 255.0f);
            p5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mi0 mi0Var = this.D0;
        if (mi0Var.v) {
            if (view == mi0Var.W) {
                return false;
            }
            org.telegram.ui.Cells.u1 u1Var = mi0Var.P;
            if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
