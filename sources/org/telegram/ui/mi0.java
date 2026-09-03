package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mi0 extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ ui0 A0;
    public final int[] t0;
    public final int[] u0;
    public int v0;
    public final int[] w0;
    public final i20 x0;
    public final Paint y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(ui0 ui0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.A0 = ui0Var;
        this.z0 = f6Var;
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = 0;
        this.w0 = new int[2];
        this.x0 = new i20();
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
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
        org.telegram.ui.Cells.s1 s1Var;
        float f10;
        float f11;
        float height;
        final float f12;
        float f13;
        char c10;
        float f14;
        ui0 ui0Var = this.A0;
        int[] iArr2 = ui0Var.l0;
        Paint paint = ui0Var.Q;
        Rect rect = ui0Var.r0;
        ni0 ni0Var = ui0Var.H;
        if (ui0Var.w && (s1Var = ui0Var.N) != null && s1Var.getCurrentPosition() == null) {
            if (ui0Var.x) {
                org.telegram.ui.Components.ff ffVar = ui0Var.P;
                if (ffVar != null) {
                    ffVar.setAlpha(0.0f);
                }
                ui0Var.x = false;
            }
            boolean z4 = ui0Var.N.getMessageObject() != null && ui0Var.N.getMessageObject().type == 15;
            float imageX = z4 ? ui0Var.N.getPhotoImage().getImageX() : ui0Var.N.getTextX();
            float imageY = z4 ? ui0Var.N.getPhotoImage().getImageY() : ui0Var.N.getTextY();
            float x10 = ui0Var.N.getX() + ni0Var.getX() + imageX;
            float y10 = ui0Var.N.getY() + ni0Var.getY() + imageY;
            float textSize = (ui0Var.N.getMessageObject() != null ? ui0Var.N.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.j6.o2).getTextSize();
            org.telegram.ui.Components.ff ffVar2 = ui0Var.P;
            if (ffVar2 != null) {
                int[] iArr3 = this.t0;
                ffVar2.getLocationOnScreen(iArr3);
                f11 = 255.0f;
                float paddingLeft = ui0Var.P.getPaddingLeft() + iArr3[0];
                float paddingTop = (ui0Var.P.getPaddingTop() + iArr3[1]) - ui0Var.P.getScrollY();
                float textSize2 = ui0Var.P.getTextSize();
                int i10 = iArr3[1];
                f10 = imageY;
                height = ui0Var.P.getMeasuredHeight() + i10;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, ui0Var.B);
                y10 = AndroidUtilities.lerp(paddingTop, y10, ui0Var.B);
                f12 = AndroidUtilities.lerp(textSize2, textSize, ui0Var.B);
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
            float f17 = ui0Var.B;
            if (ui0Var.o0 != null) {
                f13 = ui0Var.p0;
            }
            float lerp = AndroidUtilities.lerp(f13, ((1.0f - ni0Var.getScaleY()) * ni0Var.getHeight()) + ni0Var.getY(), ui0Var.B);
            float f18 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, ni0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ui0Var.B);
            float lerp3 = AndroidUtilities.lerp(ui0Var.o0 != null ? ui0Var.q0 : f18, ni0Var.getY() + ni0Var.getHeight(), ui0Var.B);
            float lerp4 = AndroidUtilities.lerp(0.0f, ni0Var.canScrollVertically(1) ? 1.0f : 0.0f, ui0Var.B);
            float f19 = imageX;
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (ui0Var.P != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f17) * f11), 31);
                canvas2.translate(f15, f16);
                canvas2.translate((-ui0Var.P.getX()) - ui0Var.P.getPaddingLeft(), ((-ui0Var.P.getY()) - ui0Var.P.getPaddingTop()) + ui0Var.P.getScrollY());
                float alpha = ui0Var.P.getAlpha();
                ui0Var.P.setAlpha(1.0f);
                if (ui0Var.B >= 0.001f) {
                    f14 = alpha;
                } else if (ui0Var.S != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ui0Var.P.getY());
                    canvas2.saveLayerAlpha(ui0Var.P.getX() + ui0Var.P.getPaddingLeft(), 0.0f, ((ui0Var.P.getX() + ui0Var.P.getPaddingLeft()) + ui0Var.P.getWidth()) - ui0Var.P.getPaddingRight(), ui0Var.P.getHeight(), (int) b.c(ui0Var.B, 0.1f, 1.0f, 255.0f), 31);
                    ui0Var.S.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f14 = alpha;
                } else {
                    f14 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.z0));
                    paint.setAlpha((int) b.c(ui0Var.B, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ui0Var.P.getPaddingLeft(), ui0Var.P.getY(), ((ui0Var.P.getX() + ui0Var.P.getPaddingLeft()) + ui0Var.P.getWidth()) - ui0Var.P.getPaddingRight(), ui0Var.P.getY() + ui0Var.P.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ui0Var.R;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.li0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ui0 ui0Var2 = mi0.this.A0;
                            canvas3.translate(ui0Var2.P.getX(), ui0Var2.P.getY() - ui0Var2.P.getScrollY());
                            float textSize3 = f12 / ui0Var2.P.getTextSize();
                            canvas3.scale(textSize3, textSize3, ui0Var2.P.getPaddingLeft(), ui0Var2.P.getPaddingTop());
                            ui0Var2.P.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ui0Var.P.setAlpha(f14);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ui0Var.N.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.s1 s1Var2 = ui0Var.o0;
            if (s1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f17 * 255.0f), 31);
                canvas2.translate(f15, f16);
                canvas2.translate(-f19, -f20);
                float lerp5 = AndroidUtilities.lerp(1.0f, ni0Var.getScaleX(), ui0Var.B);
                canvas2.scale(lerp5, lerp5, (-ui0Var.N.getX()) + ni0Var.getWidth(), (-ui0Var.N.getY()) + ni0Var.getHeight());
                float f21 = f12 / textSize;
                canvas2.scale(f21, f21, f19, f20);
                if (ui0Var.N.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ui0Var.N.getPaddingTop());
                    ui0Var.N.D1(canvas2, true, false);
                    canvas2.restore();
                }
                ui0Var.N.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.u0;
                s1Var2.getLocationInWindow(iArr4);
                int translationY = ui0Var.o0.getParent() instanceof View ? (int) ((View) ui0Var.o0.getParent()).getTranslationY() : 0;
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
                float lerp6 = AndroidUtilities.lerp(ui0Var.N.getX() + ni0Var.getX(), iArr5[c10], 1.0f - ui0Var.B);
                float lerp7 = AndroidUtilities.lerp(ui0Var.N.getY() + ni0Var.getY(), iArr5[1], 1.0f - ui0Var.B);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, ni0Var.getScaleX(), ui0Var.B);
                canvas2.scale(lerp8, lerp8, (-ui0Var.N.getX()) + ni0Var.getWidth(), (-ui0Var.N.getY()) + ni0Var.getHeight());
                ui0Var.N.getTransitionParams().K1 = 1.0f - ui0Var.B;
                ui0Var.N.getTransitionParams().g0 = rect.left * ui0Var.B;
                ui0Var.N.getTransitionParams().j0 = rect.top * ui0Var.B;
                ui0Var.N.getTransitionParams().h0 = rect.right * ui0Var.B;
                org.telegram.ui.Cells.r1 transitionParams = ui0Var.N.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = ui0Var.B;
                transitionParams.i0 = f22 * f23;
                ui0Var.N.setTimeAlpha(1.0f - f23);
                if (ui0Var.N.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ui0Var.o0.getWidth(), ui0Var.o0.getHeight(), (int) (ui0Var.B * 255.0f), 31);
                    canvas2.translate(0.0f, ui0Var.N.getPaddingTop());
                    ui0Var.N.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ui0Var.o0.getWidth(), ui0Var.o0.getHeight(), (int) ((1.0f - ui0Var.B) * 255.0f), 31);
                    canvas2.translate(0.0f, ui0Var.o0.getPaddingTop());
                    ui0Var.o0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                ui0Var.N.draw(canvas2);
                if (ui0Var.N.getTransitionParams().w0) {
                    ui0Var.N.W1(canvas2, 1.0f);
                    ui0Var.N.m2(1.0f - ui0Var.B, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            i20 i20Var = this.x0;
            i20Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            i20Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (ui0Var.w) {
            if (ui0Var.y) {
                org.telegram.ui.Components.lg lgVar = ui0Var.T;
                if (lgVar != null) {
                    lgVar.setAlpha(0.0f);
                }
                c3 = 0;
                ui0Var.y = false;
            } else {
                c3 = 0;
            }
            canvas2.save();
            int i12 = iArr[c3];
            int width = ui0Var.U.getWidth();
            ui0Var.U.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), ui0Var.U.getX(), ui0Var.B), AndroidUtilities.lerp(iArr[1], ui0Var.U.getY(), ui0Var.B));
            if (ui0Var.v && ui0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ui0Var.U.getWidth(), ui0Var.U.getHeight(), (int) (ui0Var.B * 255.0f), 31);
            }
            ui0Var.U.draw(canvas2);
            if (ui0Var.v && ui0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ui0Var.i0 != null) {
            if (ui0Var.G == null) {
                ui0Var.G = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((ui0Var.i0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((ui0Var.i0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (ui0Var.i0.right - AndroidUtilities.dp(12.0f)), (int) (ui0Var.i0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.y0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ui0Var.G.e() * 30.0f * ui0Var.B));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            ui0Var.G.setBounds(rect2);
            org.telegram.ui.Components.j5 j5Var = ui0Var.G;
            j5Var.v = (int) (ui0Var.B * 255.0f);
            j5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ui0 ui0Var = this.A0;
        if (ui0Var.w) {
            if (view == ui0Var.U) {
                return false;
            }
            org.telegram.ui.Cells.s1 s1Var = ui0Var.N;
            if (view == s1Var && s1Var != null && s1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
