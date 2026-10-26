package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fi0 extends org.telegram.ui.Components.vw0 {
    public final int[] l0;
    public final int[] m0;
    public int n0;
    public final int[] o0;
    public final w10 p0;
    public final Paint q0;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 r0;
    public final /* synthetic */ ni0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null);
        this.s0 = ni0Var;
        this.r0 = u6Var;
        this.l0 = new int[2];
        this.m0 = new int[2];
        this.n0 = 0;
        this.o0 = new int[2];
        this.p0 = new w10();
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
        this.q0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0380, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.s1 s1Var;
        float f7;
        int i10;
        boolean z10;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        ni0 ni0Var = this.s0;
        int[] iArr2 = ni0Var.n0;
        Paint paint = ni0Var.S;
        Rect rect = ni0Var.t0;
        gi0 gi0Var = ni0Var.J;
        if (ni0Var.v && (s1Var = ni0Var.P) != null && s1Var.getCurrentPosition() == null) {
            if (ni0Var.w) {
                org.telegram.ui.Components.pf pfVar = ni0Var.R;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                ni0Var.w = false;
            }
            boolean z11 = ni0Var.P.getMessageObject() != null && ni0Var.P.getMessageObject().type == 15;
            float imageX = z11 ? ni0Var.P.getPhotoImage().getImageX() : ni0Var.P.getTextX();
            float imageY = z11 ? ni0Var.P.getPhotoImage().getImageY() : ni0Var.P.getTextY();
            float x9 = ni0Var.P.getX() + gi0Var.getX() + imageX;
            float y3 = ni0Var.P.getY() + gi0Var.getY() + imageY;
            float textSize = (ni0Var.P.getMessageObject() != null ? ni0Var.P.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.y6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = ni0Var.R;
            if (pfVar2 != null) {
                z10 = false;
                int[] iArr3 = this.l0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = ni0Var.R.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (ni0Var.R.getPaddingTop() + iArr3[1]) - ni0Var.R.getScrollY();
                float textSize2 = ni0Var.R.getTextSize();
                int i11 = iArr3[1];
                f7 = imageY;
                height = ni0Var.R.getMeasuredHeight() + i11;
                x9 = AndroidUtilities.lerp(paddingLeft, x9, ni0Var.y);
                y3 = AndroidUtilities.lerp(paddingTop, y3, ni0Var.y);
                f11 = AndroidUtilities.lerp(textSize2, textSize, ni0Var.y);
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
            float f14 = x9;
            float f15 = y3;
            float f16 = ni0Var.y;
            if (ni0Var.q0 != null) {
                f12 = ni0Var.r0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - gi0Var.getScaleY()) * gi0Var.getHeight()) + gi0Var.getY(), ni0Var.y);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ni0Var.y);
            float lerp3 = AndroidUtilities.lerp(ni0Var.q0 != null ? ni0Var.s0 : f17, gi0Var.getY() + gi0Var.getHeight(), ni0Var.y);
            float lerp4 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(i10) ? 1.0f : 0.0f, ni0Var.y);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (ni0Var.R != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-ni0Var.R.getX()) - ni0Var.R.getPaddingLeft(), ((-ni0Var.R.getY()) - ni0Var.R.getPaddingTop()) + ni0Var.R.getScrollY());
                float alpha = ni0Var.R.getAlpha();
                ni0Var.R.setAlpha(1.0f);
                if (ni0Var.y >= 0.001f) {
                    f13 = alpha;
                } else if (ni0Var.U != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.R.getY());
                    canvas2.saveLayerAlpha(ni0Var.R.getX() + ni0Var.R.getPaddingLeft(), 0.0f, ((ni0Var.R.getX() + ni0Var.R.getPaddingLeft()) + ni0Var.R.getWidth()) - ni0Var.R.getPaddingRight(), ni0Var.R.getHeight(), (int) org.telegram.messenger.vh.y(ni0Var.y, 0.1f, 1.0f, f10), 31);
                    ni0Var.U.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sd, this.r0));
                    paint.setAlpha((int) org.telegram.messenger.vh.y(ni0Var.y, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ni0Var.R.getPaddingLeft(), ni0Var.R.getY(), ((ni0Var.R.getX() + ni0Var.R.getPaddingLeft()) + ni0Var.R.getWidth()) - ni0Var.R.getPaddingRight(), ni0Var.R.getY() + ni0Var.R.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ni0Var.T;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ei0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ni0 ni0Var2 = fi0.this.s0;
                            canvas3.translate(ni0Var2.R.getX(), ni0Var2.R.getY() - ni0Var2.R.getScrollY());
                            float textSize3 = f11 / ni0Var2.R.getTextSize();
                            canvas3.scale(textSize3, textSize3, ni0Var2.R.getPaddingLeft(), ni0Var2.R.getPaddingTop());
                            ni0Var2.R.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ni0Var.R.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ni0Var.P.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.s1 s1Var2 = ni0Var.q0;
            if (s1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.y);
                canvas2.scale(lerp5, lerp5, (-ni0Var.P.getX()) + gi0Var.getWidth(), (-ni0Var.P.getY()) + gi0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (ni0Var.P.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.P.getPaddingTop());
                    ni0Var.P.D1(canvas2, true, z10);
                    canvas2.restore();
                }
                ni0Var.P.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.m0;
                s1Var2.getLocationInWindow(iArr4);
                int translationY = ni0Var.q0.getParent() instanceof View ? (int) ((View) ni0Var.q0.getParent()).getTranslationY() : 0;
                int i12 = this.n0;
                int[] iArr5 = this.o0;
                if (i12 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.n0 = translationY;
                float lerp6 = AndroidUtilities.lerp(ni0Var.P.getX() + gi0Var.getX(), iArr5[c11], 1.0f - ni0Var.y);
                float lerp7 = AndroidUtilities.lerp(ni0Var.P.getY() + gi0Var.getY(), iArr5[1], 1.0f - ni0Var.y);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.y);
                canvas2.scale(lerp8, lerp8, (-ni0Var.P.getX()) + gi0Var.getWidth(), (-ni0Var.P.getY()) + gi0Var.getHeight());
                ni0Var.P.getTransitionParams().K1 = 1.0f - ni0Var.y;
                ni0Var.P.getTransitionParams().g0 = rect.left * ni0Var.y;
                ni0Var.P.getTransitionParams().j0 = rect.top * ni0Var.y;
                ni0Var.P.getTransitionParams().h0 = rect.right * ni0Var.y;
                org.telegram.ui.Cells.r1 transitionParams = ni0Var.P.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = ni0Var.y;
                transitionParams.i0 = f21 * f22;
                ni0Var.P.setTimeAlpha(1.0f - f22);
                if (ni0Var.P.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.q0.getWidth(), ni0Var.q0.getHeight(), (int) (ni0Var.y * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.P.getPaddingTop());
                    ni0Var.P.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.q0.getWidth(), ni0Var.q0.getHeight(), (int) ((1.0f - ni0Var.y) * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.q0.getPaddingTop());
                    ni0Var.q0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                ni0Var.P.draw(canvas2);
                if (ni0Var.P.getTransitionParams().w0) {
                    ni0Var.P.W1(canvas2, 1.0f);
                    ni0Var.P.m2(1.0f - ni0Var.y, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            w10 w10Var = this.p0;
            w10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            w10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (ni0Var.v) {
            if (ni0Var.x) {
                org.telegram.ui.Components.vg vgVar = ni0Var.V;
                if (vgVar != null) {
                    vgVar.setAlpha(0.0f);
                }
                c10 = 0;
                ni0Var.x = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i13 = iArr[c10];
            int width = ni0Var.W.getWidth();
            ni0Var.W.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i13 - (width - r4.m())), ni0Var.W.getX(), ni0Var.y), AndroidUtilities.lerp(iArr[1], ni0Var.W.getY(), ni0Var.y));
            if (ni0Var.s && ni0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.W.getWidth(), ni0Var.W.getHeight(), (int) (ni0Var.y * 255.0f), 31);
            }
            ni0Var.W.draw(canvas2);
            if (ni0Var.s && ni0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ni0Var.k0 != null) {
            if (ni0Var.I == null) {
                ni0Var.I = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((ni0Var.k0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((ni0Var.k0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (ni0Var.k0.right - AndroidUtilities.dp(12.0f)), (int) (ni0Var.k0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.q0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ni0Var.I.e() * 30.0f * ni0Var.y));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            ni0Var.I.setBounds(rect2);
            org.telegram.ui.Components.r5 r5Var = ni0Var.I;
            r5Var.v = (int) (ni0Var.y * 255.0f);
            r5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ni0 ni0Var = this.s0;
        if (ni0Var.v) {
            if (view == ni0Var.W) {
                return false;
            }
            org.telegram.ui.Cells.s1 s1Var = ni0Var.P;
            if (view == s1Var && s1Var != null && s1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
