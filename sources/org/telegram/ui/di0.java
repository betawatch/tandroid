package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class di0 extends org.telegram.ui.Components.xu0 {
    public final int[] s0;
    public final int[] t0;
    public int u0;
    public final int[] v0;
    public final s10 w0;
    public final Paint x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 y0;
    public final /* synthetic */ li0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(li0 li0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null);
        this.z0 = li0Var;
        this.y0 = b6Var;
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = 0;
        this.v0 = new int[2];
        this.w0 = new s10();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        this.x0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.t1 t1Var;
        float f10;
        float f11;
        float height;
        final float f12;
        float f13;
        char c11;
        float f14;
        li0 li0Var = this.z0;
        int[] iArr2 = li0Var.k0;
        Paint paint = li0Var.P;
        Rect rect = li0Var.q0;
        ei0 ei0Var = li0Var.G;
        if (li0Var.w && (t1Var = li0Var.M) != null && t1Var.getCurrentPosition() == null) {
            if (li0Var.x) {
                org.telegram.ui.Components.ff ffVar = li0Var.O;
                if (ffVar != null) {
                    ffVar.setAlpha(0.0f);
                }
                li0Var.x = false;
            }
            boolean z10 = li0Var.M.getMessageObject() != null && li0Var.M.getMessageObject().type == 15;
            float imageX = z10 ? li0Var.M.getPhotoImage().getImageX() : li0Var.M.getTextX();
            float imageY = z10 ? li0Var.M.getPhotoImage().getImageY() : li0Var.M.getTextY();
            float x10 = li0Var.M.getX() + ei0Var.getX() + imageX;
            float y10 = li0Var.M.getY() + ei0Var.getY() + imageY;
            float textSize = (li0Var.M.getMessageObject() != null ? li0Var.M.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.f6.o2).getTextSize();
            org.telegram.ui.Components.ff ffVar2 = li0Var.O;
            if (ffVar2 != null) {
                int[] iArr3 = this.s0;
                ffVar2.getLocationOnScreen(iArr3);
                f11 = 255.0f;
                float paddingLeft = li0Var.O.getPaddingLeft() + iArr3[0];
                float paddingTop = (li0Var.O.getPaddingTop() + iArr3[1]) - li0Var.O.getScrollY();
                float textSize2 = li0Var.O.getTextSize();
                int i9 = iArr3[1];
                f10 = imageY;
                height = li0Var.O.getMeasuredHeight() + i9;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, li0Var.A);
                y10 = AndroidUtilities.lerp(paddingTop, y10, li0Var.A);
                f12 = AndroidUtilities.lerp(textSize2, textSize, li0Var.A);
                f13 = i9;
            } else {
                f10 = imageY;
                f11 = 255.0f;
                height = getHeight();
                f12 = textSize;
                f13 = 0.0f;
            }
            float f15 = x10;
            float f16 = y10;
            float f17 = li0Var.A;
            if (li0Var.n0 != null) {
                f13 = li0Var.o0;
            }
            float lerp = AndroidUtilities.lerp(f13, ((1.0f - ei0Var.getScaleY()) * ei0Var.getHeight()) + ei0Var.getY(), li0Var.A);
            float f18 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, ei0Var.canScrollVertically(-1) ? 1.0f : 0.0f, li0Var.A);
            float lerp3 = AndroidUtilities.lerp(li0Var.n0 != null ? li0Var.p0 : f18, ei0Var.getY() + ei0Var.getHeight(), li0Var.A);
            float lerp4 = AndroidUtilities.lerp(0.0f, ei0Var.canScrollVertically(1) ? 1.0f : 0.0f, li0Var.A);
            float f19 = imageX;
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (li0Var.O != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f17) * f11), 31);
                canvas2.translate(f15, f16);
                canvas2.translate((-li0Var.O.getX()) - li0Var.O.getPaddingLeft(), ((-li0Var.O.getY()) - li0Var.O.getPaddingTop()) + li0Var.O.getScrollY());
                float alpha = li0Var.O.getAlpha();
                li0Var.O.setAlpha(1.0f);
                if (li0Var.A >= 0.001f) {
                    f14 = alpha;
                } else if (li0Var.R != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, li0Var.O.getY());
                    canvas2.saveLayerAlpha(li0Var.O.getX() + li0Var.O.getPaddingLeft(), 0.0f, ((li0Var.O.getX() + li0Var.O.getPaddingLeft()) + li0Var.O.getWidth()) - li0Var.O.getPaddingRight(), li0Var.O.getHeight(), (int) org.telegram.messenger.ll.v(li0Var.A, 0.1f, 1.0f, 255.0f), 31);
                    li0Var.R.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f14 = alpha;
                } else {
                    f14 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sd, this.y0));
                    paint.setAlpha((int) org.telegram.messenger.ll.v(li0Var.A, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(li0Var.O.getPaddingLeft(), li0Var.O.getY(), ((li0Var.O.getX() + li0Var.O.getPaddingLeft()) + li0Var.O.getWidth()) - li0Var.O.getPaddingRight(), li0Var.O.getY() + li0Var.O.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = li0Var.Q;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ci0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            li0 li0Var2 = di0.this.z0;
                            canvas3.translate(li0Var2.O.getX(), li0Var2.O.getY() - li0Var2.O.getScrollY());
                            float textSize3 = f12 / li0Var2.O.getTextSize();
                            canvas3.scale(textSize3, textSize3, li0Var2.O.getPaddingLeft(), li0Var2.O.getPaddingTop());
                            li0Var2.O.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                li0Var.O.setAlpha(f14);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            li0Var.M.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.t1 t1Var2 = li0Var.n0;
            if (t1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f17 * 255.0f), 31);
                canvas2.translate(f15, f16);
                canvas2.translate(-f19, -f20);
                float lerp5 = AndroidUtilities.lerp(1.0f, ei0Var.getScaleX(), li0Var.A);
                canvas2.scale(lerp5, lerp5, (-li0Var.M.getX()) + ei0Var.getWidth(), (-li0Var.M.getY()) + ei0Var.getHeight());
                float f21 = f12 / textSize;
                canvas2.scale(f21, f21, f19, f20);
                if (li0Var.M.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, li0Var.M.getPaddingTop());
                    li0Var.M.D1(canvas2, true, false);
                    canvas2.restore();
                }
                li0Var.M.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.t0;
                t1Var2.getLocationInWindow(iArr4);
                int translationY = li0Var.n0.getParent() instanceof View ? (int) ((View) li0Var.n0.getParent()).getTranslationY() : 0;
                int i10 = this.u0;
                int[] iArr5 = this.v0;
                if (i10 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.u0 = translationY;
                float lerp6 = AndroidUtilities.lerp(li0Var.M.getX() + ei0Var.getX(), iArr5[c11], 1.0f - li0Var.A);
                float lerp7 = AndroidUtilities.lerp(li0Var.M.getY() + ei0Var.getY(), iArr5[1], 1.0f - li0Var.A);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, ei0Var.getScaleX(), li0Var.A);
                canvas2.scale(lerp8, lerp8, (-li0Var.M.getX()) + ei0Var.getWidth(), (-li0Var.M.getY()) + ei0Var.getHeight());
                li0Var.M.getTransitionParams().K1 = 1.0f - li0Var.A;
                li0Var.M.getTransitionParams().g0 = rect.left * li0Var.A;
                li0Var.M.getTransitionParams().j0 = rect.top * li0Var.A;
                li0Var.M.getTransitionParams().h0 = rect.right * li0Var.A;
                org.telegram.ui.Cells.s1 transitionParams = li0Var.M.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = li0Var.A;
                transitionParams.i0 = f22 * f23;
                li0Var.M.setTimeAlpha(1.0f - f23);
                if (li0Var.M.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, li0Var.n0.getWidth(), li0Var.n0.getHeight(), (int) (li0Var.A * 255.0f), 31);
                    canvas2.translate(0.0f, li0Var.M.getPaddingTop());
                    li0Var.M.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, li0Var.n0.getWidth(), li0Var.n0.getHeight(), (int) ((1.0f - li0Var.A) * 255.0f), 31);
                    canvas2.translate(0.0f, li0Var.n0.getPaddingTop());
                    li0Var.n0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                li0Var.M.draw(canvas2);
                if (li0Var.M.getTransitionParams().w0) {
                    li0Var.M.W1(canvas2, 1.0f);
                    li0Var.M.m2(1.0f - li0Var.A, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            s10 s10Var = this.w0;
            s10Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            s10Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (li0Var.w) {
            if (li0Var.y) {
                org.telegram.ui.Components.lg lgVar = li0Var.S;
                if (lgVar != null) {
                    lgVar.setAlpha(0.0f);
                }
                c10 = 0;
                li0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i11 = iArr[c10];
            int width = li0Var.T.getWidth();
            li0Var.T.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i11 - (width - r4.m())), li0Var.T.getX(), li0Var.A), AndroidUtilities.lerp(iArr[1], li0Var.T.getY(), li0Var.A));
            if (li0Var.v && li0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, li0Var.T.getWidth(), li0Var.T.getHeight(), (int) (li0Var.A * 255.0f), 31);
            }
            li0Var.T.draw(canvas2);
            if (li0Var.v && li0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (li0Var.h0 != null) {
            if (li0Var.F == null) {
                li0Var.F = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((li0Var.h0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((li0Var.h0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (li0Var.h0.right - AndroidUtilities.dp(12.0f)), (int) (li0Var.h0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.x0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (li0Var.F.e() * 30.0f * li0Var.A));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            li0Var.F.setBounds(rect2);
            org.telegram.ui.Components.i5 i5Var = li0Var.F;
            i5Var.v = (int) (li0Var.A * 255.0f);
            i5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        li0 li0Var = this.z0;
        if (li0Var.w) {
            if (view == li0Var.T) {
                return false;
            }
            org.telegram.ui.Cells.t1 t1Var = li0Var.M;
            if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
