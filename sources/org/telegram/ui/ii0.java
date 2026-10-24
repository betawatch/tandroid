package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ii0 extends org.telegram.ui.Components.ow0 {
    public final w10 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 C0;
    public final /* synthetic */ qi0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(qi0 qi0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.D0 = qi0Var;
        this.C0 = g6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new w10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0380, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.t1 t1Var;
        float f7;
        int i10;
        boolean z10;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        qi0 qi0Var = this.D0;
        int[] iArr2 = qi0Var.n0;
        Paint paint = qi0Var.S;
        Rect rect = qi0Var.t0;
        ji0 ji0Var = qi0Var.J;
        if (qi0Var.v && (t1Var = qi0Var.P) != null && t1Var.getCurrentPosition() == null) {
            if (qi0Var.w) {
                org.telegram.ui.Components.pf pfVar = qi0Var.R;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                qi0Var.w = false;
            }
            boolean z11 = qi0Var.P.getMessageObject() != null && qi0Var.P.getMessageObject().type == 15;
            float imageX = z11 ? qi0Var.P.getPhotoImage().getImageX() : qi0Var.P.getTextX();
            float imageY = z11 ? qi0Var.P.getPhotoImage().getImageY() : qi0Var.P.getTextY();
            float x10 = qi0Var.P.getX() + ji0Var.getX() + imageX;
            float y3 = qi0Var.P.getY() + ji0Var.getY() + imageY;
            float textSize = (qi0Var.P.getMessageObject() != null ? qi0Var.P.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.k6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = qi0Var.R;
            if (pfVar2 != null) {
                z10 = false;
                int[] iArr3 = this.w0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = qi0Var.R.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (qi0Var.R.getPaddingTop() + iArr3[1]) - qi0Var.R.getScrollY();
                float textSize2 = qi0Var.R.getTextSize();
                int i11 = iArr3[1];
                f7 = imageY;
                height = qi0Var.R.getMeasuredHeight() + i11;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, qi0Var.y);
                y3 = AndroidUtilities.lerp(paddingTop, y3, qi0Var.y);
                f11 = AndroidUtilities.lerp(textSize2, textSize, qi0Var.y);
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
            float f16 = qi0Var.y;
            if (qi0Var.q0 != null) {
                f12 = qi0Var.r0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - ji0Var.getScaleY()) * ji0Var.getHeight()) + ji0Var.getY(), qi0Var.y);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, ji0Var.canScrollVertically(-1) ? 1.0f : 0.0f, qi0Var.y);
            float lerp3 = AndroidUtilities.lerp(qi0Var.q0 != null ? qi0Var.s0 : f17, ji0Var.getY() + ji0Var.getHeight(), qi0Var.y);
            float lerp4 = AndroidUtilities.lerp(0.0f, ji0Var.canScrollVertically(i10) ? 1.0f : 0.0f, qi0Var.y);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (qi0Var.R != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-qi0Var.R.getX()) - qi0Var.R.getPaddingLeft(), ((-qi0Var.R.getY()) - qi0Var.R.getPaddingTop()) + qi0Var.R.getScrollY());
                float alpha = qi0Var.R.getAlpha();
                qi0Var.R.setAlpha(1.0f);
                if (qi0Var.y >= 0.001f) {
                    f13 = alpha;
                } else if (qi0Var.U != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, qi0Var.R.getY());
                    canvas2.saveLayerAlpha(qi0Var.R.getX() + qi0Var.R.getPaddingLeft(), 0.0f, ((qi0Var.R.getX() + qi0Var.R.getPaddingLeft()) + qi0Var.R.getWidth()) - qi0Var.R.getPaddingRight(), qi0Var.R.getHeight(), (int) org.telegram.messenger.sl.z(qi0Var.y, 0.1f, 1.0f, f10), 31);
                    qi0Var.U.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.sl.z(qi0Var.y, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(qi0Var.R.getPaddingLeft(), qi0Var.R.getY(), ((qi0Var.R.getX() + qi0Var.R.getPaddingLeft()) + qi0Var.R.getWidth()) - qi0Var.R.getPaddingRight(), qi0Var.R.getY() + qi0Var.R.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = qi0Var.T;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.hi0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            qi0 qi0Var2 = ii0.this.D0;
                            canvas3.translate(qi0Var2.R.getX(), qi0Var2.R.getY() - qi0Var2.R.getScrollY());
                            float textSize3 = f11 / qi0Var2.R.getTextSize();
                            canvas3.scale(textSize3, textSize3, qi0Var2.R.getPaddingLeft(), qi0Var2.R.getPaddingTop());
                            qi0Var2.R.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                qi0Var.R.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            qi0Var.P.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.t1 t1Var2 = qi0Var.q0;
            if (t1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, ji0Var.getScaleX(), qi0Var.y);
                canvas2.scale(lerp5, lerp5, (-qi0Var.P.getX()) + ji0Var.getWidth(), (-qi0Var.P.getY()) + ji0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (qi0Var.P.B1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, qi0Var.P.getPaddingTop());
                    qi0Var.P.C1(canvas2, true, z10);
                    canvas2.restore();
                }
                qi0Var.P.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                t1Var2.getLocationInWindow(iArr4);
                int translationY = qi0Var.q0.getParent() instanceof View ? (int) ((View) qi0Var.q0.getParent()).getTranslationY() : 0;
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
                float lerp6 = AndroidUtilities.lerp(qi0Var.P.getX() + ji0Var.getX(), iArr5[c11], 1.0f - qi0Var.y);
                float lerp7 = AndroidUtilities.lerp(qi0Var.P.getY() + ji0Var.getY(), iArr5[1], 1.0f - qi0Var.y);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, ji0Var.getScaleX(), qi0Var.y);
                canvas2.scale(lerp8, lerp8, (-qi0Var.P.getX()) + ji0Var.getWidth(), (-qi0Var.P.getY()) + ji0Var.getHeight());
                qi0Var.P.getTransitionParams().K1 = 1.0f - qi0Var.y;
                qi0Var.P.getTransitionParams().g0 = rect.left * qi0Var.y;
                qi0Var.P.getTransitionParams().j0 = rect.top * qi0Var.y;
                qi0Var.P.getTransitionParams().h0 = rect.right * qi0Var.y;
                org.telegram.ui.Cells.s1 transitionParams = qi0Var.P.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = qi0Var.y;
                transitionParams.i0 = f21 * f22;
                qi0Var.P.setTimeAlpha(1.0f - f22);
                if (qi0Var.P.B1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, qi0Var.q0.getWidth(), qi0Var.q0.getHeight(), (int) (qi0Var.y * 255.0f), 31);
                    canvas2.translate(0.0f, qi0Var.P.getPaddingTop());
                    qi0Var.P.C1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, qi0Var.q0.getWidth(), qi0Var.q0.getHeight(), (int) ((1.0f - qi0Var.y) * 255.0f), 31);
                    canvas2.translate(0.0f, qi0Var.q0.getPaddingTop());
                    qi0Var.q0.C1(canvas2, true, false);
                    canvas2.restore();
                }
                qi0Var.P.draw(canvas2);
                if (qi0Var.P.getTransitionParams().w0) {
                    qi0Var.P.V1(canvas2, 1.0f);
                    qi0Var.P.l2(1.0f - qi0Var.y, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            w10 w10Var = this.A0;
            w10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            w10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (qi0Var.v) {
            if (qi0Var.x) {
                org.telegram.ui.Components.vg vgVar = qi0Var.V;
                if (vgVar != null) {
                    vgVar.setAlpha(0.0f);
                }
                c10 = 0;
                qi0Var.x = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i13 = iArr[c10];
            int width = qi0Var.W.getWidth();
            qi0Var.W.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i13 - (width - r4.m())), qi0Var.W.getX(), qi0Var.y), AndroidUtilities.lerp(iArr[1], qi0Var.W.getY(), qi0Var.y));
            if (qi0Var.s && qi0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, qi0Var.W.getWidth(), qi0Var.W.getHeight(), (int) (qi0Var.y * 255.0f), 31);
            }
            qi0Var.W.draw(canvas2);
            if (qi0Var.s && qi0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (qi0Var.k0 != null) {
            if (qi0Var.I == null) {
                qi0Var.I = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((qi0Var.k0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((qi0Var.k0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (qi0Var.k0.right - AndroidUtilities.dp(12.0f)), (int) (qi0Var.k0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (qi0Var.I.e() * 30.0f * qi0Var.y));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            qi0Var.I.setBounds(rect2);
            org.telegram.ui.Components.p5 p5Var = qi0Var.I;
            p5Var.v = (int) (qi0Var.y * 255.0f);
            p5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        qi0 qi0Var = this.D0;
        if (qi0Var.v) {
            if (view == qi0Var.W) {
                return false;
            }
            org.telegram.ui.Cells.t1 t1Var = qi0Var.P;
            if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
