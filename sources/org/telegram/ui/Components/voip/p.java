package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p11;
import org.telegram.ui.r50;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p extends u2 {
    public float c0;
    public final /* synthetic */ ChatObject.Call d0;
    public final /* synthetic */ l0 e0;
    public final /* synthetic */ TextPaint f0;
    public final /* synthetic */ StaticLayout g0;
    public final /* synthetic */ TextPaint h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ float j0;
    public final /* synthetic */ StaticLayout k0;
    public final /* synthetic */ r50 l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ float n0;
    public final /* synthetic */ u o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f9, StaticLayout staticLayout2, r50 r50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.o0 = uVar;
        this.d0 = call;
        this.e0 = l0Var;
        this.f0 = textPaint;
        this.g0 = staticLayout;
        this.h0 = textPaint2;
        this.i0 = str;
        this.j0 = f9;
        this.k0 = staticLayout2;
        this.l0 = r50Var;
        this.m0 = str2;
        this.n0 = f10;
    }

    @Override // org.telegram.ui.Components.voip.u2
    public final void a() {
        super.a();
        this.c0 = this.o0.s0;
    }

    @Override // org.telegram.ui.Components.voip.u2
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.o0;
        TextView textView = uVar.K;
        p pVar = uVar.a;
        invalidate();
        ChatObject.Call call = this.d0;
        if (call != null && call.call.rtmp_stream && uVar.v0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.w0);
            uVar.v0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = uVar.o0;
        t2 t2Var = this.d;
        if (!z10 && t2Var.getAlpha() != 1.0f) {
            t2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.t0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.t0.getAlpha() == 1.0f) {
                uVar.t0.animate().alpha(0.0f).setDuration(300L).setListener(new p11(this, 11)).start();
            } else if (uVar.t0.getParent() != null) {
                pVar.removeView(uVar.t0);
            }
        }
        int i11 = t2Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = t2Var.rotatedFrameWidth) == 0 || (videoParticipant = uVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i10, i11, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0463  */
    @Override // org.telegram.ui.Components.voip.u2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        gr grVar;
        float f10;
        int d;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        u uVar = this.o0;
        gr grVar2 = uVar.q0;
        Drawable drawable = uVar.r0;
        p pVar = uVar.a;
        ImageReceiver imageReceiver = uVar.h0;
        TextView textView = uVar.K;
        r rVar = uVar.J;
        t2 t2Var = this.d;
        boolean isFirstFrameRendered = t2Var.isFirstFrameRendered();
        TextPaint textPaint = this.f0;
        ChatObject.Call call = this.d0;
        l0 l0Var = this.e0;
        if (!isFirstFrameRendered || (!(t2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || uVar.o0)) {
            float f15 = uVar.g0;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                uVar.g0 = f16;
                if (f16 > 1.0f) {
                    uVar.g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (uVar.m0 != null) {
                canvas.save();
                float f17 = this.S;
                canvas.scale(f17, f17, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (uVar.n0 == null) {
                    Paint paint = new Paint(1);
                    uVar.n0 = paint;
                    paint.setFilterBitmap(true);
                }
                f9 = 0.0f;
                canvas.drawBitmap(uVar.m0, (getMeasuredWidth() - uVar.m0.getWidth()) / 2.0f, (getMeasuredHeight() - uVar.m0.getHeight()) / 2.0f, uVar.n0);
                canvas.restore();
            } else {
                f9 = 0.0f;
                imageReceiver.setImageCoords(this.K, this.J, getMeasuredWidth() - (this.K * 2.0f), getMeasuredHeight() - (this.J * 2.0f));
                imageReceiver.setAlpha(uVar.g0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = uVar.w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (uVar.b || !l0Var.b) {
                    float dp = AndroidUtilities.dp(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((dp / 2.0f) + (((getMeasuredWidth() - dp) / 2.0f) - (AndroidUtilities.dp(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - dp) + dp + AndroidUtilities.dp(10.0f));
                    this.g0.draw(canvas);
                    canvas.restore();
                }
                if (rVar.getVisibility() != 4) {
                    rVar.setVisibility(4);
                }
                grVar = grVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (rVar.getVisibility() != 0) {
                    rVar.setVisibility(0);
                    rVar.setScaleX(1.0f);
                    rVar.setScaleY(1.0f);
                }
                float f18 = uVar.u0 ? 0.0f : l0Var.c;
                int dp2 = AndroidUtilities.dp(33.0f);
                if (uVar.r || uVar.b) {
                    f10 = 10.0f;
                    d = (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(39.0f), l0Var.c, AndroidUtilities.dp(10.0f), dp2);
                } else {
                    f10 = 10.0f;
                    d = (int) ((Math.max(1.0f - l0Var.c, (uVar.h || uVar.f) ? l0Var.n : 0.0f) * AndroidUtilities.dp(10.0f)) + dp2);
                }
                int measuredWidth = (getMeasuredWidth() - d) / 2;
                boolean z10 = uVar.h;
                float f19 = (z10 || uVar.f) ? l0Var.n : 0.0f;
                float f20 = f18;
                if (uVar.b) {
                    f11 = f20;
                } else {
                    f11 = uVar.r ? l0Var.c : f19;
                    f20 = (z10 || uVar.f) ? l0Var.n : l0Var.c;
                }
                float f21 = f11;
                int dp3 = (int) ((AndroidUtilities.dp(17.0f) * f20) + ((((getMeasuredHeight() - d) / 2) - AndroidUtilities.dp(28.0f)) - (((((uVar.b || uVar.r) ? l0Var.c : 0.0f) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f21)));
                grVar = grVar2;
                int i11 = dp3 + d;
                drawable.setBounds(measuredWidth, dp3, measuredWidth + d, i11);
                drawable.draw(canvas);
                float f22 = l0Var.c;
                if (f22 > f9 || f19 > f9) {
                    float max = Math.max(f22, f19) * f21;
                    TextPaint textPaint2 = this.h0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (uVar.r || uVar.b) {
                        rVar.setAlpha((1.0f - f19) * max);
                    } else {
                        rVar.setAlpha(0.0f);
                    }
                    i10 = i11;
                    canvas.drawText(this.i0, (d / 2.0f) + (measuredWidth - (this.j0 / 2.0f)), AndroidUtilities.dp(32.0f) + i11, textPaint2);
                } else {
                    rVar.setAlpha(0.0f);
                    i10 = i11;
                }
                rVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i10) + uVar.l0) - this.J);
                rVar.setTranslationX(((getMeasuredWidth() - rVar.getMeasuredWidth()) / 2.0f) - this.K);
                if (l0Var.c < 1.0f && f19 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f19)) * 255.0d));
                    canvas.save();
                    canvas.translate((d / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f10) + i10);
                    this.k0.draw(canvas);
                    canvas.restore();
                }
            } else {
                grVar = grVar2;
                if (rVar.getVisibility() != 4) {
                    rVar.setVisibility(4);
                }
                h hVar = this.l0.n2;
                Paint paint2 = hVar.c;
                Matrix matrix = hVar.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = hVar.h;
                if (j10 != 0) {
                    long j11 = currentTimeMillis - j10;
                    if (j11 > 10) {
                        float f23 = (j11 / 500.0f) + hVar.g;
                        hVar.g = f23;
                        if (f23 > 4.0f) {
                            hVar.g = 0.0f;
                            a4.g gVar = hVar.p;
                            if (gVar != null) {
                                gVar.run();
                            }
                        }
                        hVar.h = currentTimeMillis;
                    }
                } else {
                    hVar.h = currentTimeMillis;
                }
                float f24 = hVar.g;
                if (f24 <= 1.0f) {
                    int i12 = hVar.f;
                    matrix.setTranslate(((((r10 * 2) + i12) * f24) - hVar.e) - uVar.getX(), 0.0f);
                    hVar.b.setLocalMatrix(matrix);
                    hVar.d.setLocalMatrix(matrix);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(pVar.K, pVar.J, pVar.getMeasuredWidth() - pVar.K, pVar.getMeasuredHeight() - pVar.J);
                    canvas.drawRect(rectF, hVar.a);
                    if (hVar.k) {
                        if (hVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f25 = pVar.b;
                        canvas.drawRoundRect(rectF, f25, f25, paint2);
                    }
                }
            }
            invalidate();
        } else {
            grVar = grVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + uVar.l0) - this.J);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.K);
        ImageView imageView = uVar.t0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.t0.setScaleX(pVar.d.getScaleX());
            uVar.t0.setScaleY(pVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.J) - AndroidUtilities.dp(80.0f);
        if (uVar.w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((uVar.b || uVar.r) && !r50.B3 && !r50.C3) {
                measuredHeight = th.b(1.0f, l0Var.S, AndroidUtilities.dp(90.0f) * l0Var.c, measuredHeight);
            }
            f12 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(uVar.y);
            canvas.restore();
        } else {
            f12 = 0.0f;
        }
        boolean z11 = uVar.o0;
        if (!z11 && uVar.p0 == f12) {
            return;
        }
        if (z11) {
            float f26 = uVar.p0;
            if (f26 != 1.0f) {
                float f27 = f26 + 0.064f;
                uVar.p0 = f27;
                if (f27 > 1.0f) {
                    uVar.p0 = 1.0f;
                } else {
                    invalidate();
                }
                float f28 = uVar.p0;
                if (this.U == null) {
                    float f29 = this.c0;
                    float f30 = this.W;
                    f13 = (uVar.s0 * f30) + ((1.0f - f30) * f29);
                } else {
                    f13 = uVar.s0;
                }
                f14 = f28 * f13;
                if (f14 <= 0.0f) {
                    float dp4 = AndroidUtilities.dp(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - dp4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - dp4) / 2.0f;
                    if (uVar.w == call.videoNotAvailableParticipant) {
                        measuredHeight2 -= dp4 / 2.5f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f31 = measuredHeight2 + dp4;
                    rectF2.set((int) measuredWidth2, (int) measuredHeight2, (int) (measuredWidth2 + dp4), (int) f31);
                    if (f14 != 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (f14 * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    gr grVar3 = grVar;
                    grVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    grVar3.draw(canvas);
                    canvas.restore();
                    float f32 = f14 * l0Var.c;
                    if (f32 <= 0.0f || uVar.w == call.videoNotAvailableParticipant) {
                        return;
                    }
                    textPaint.setAlpha((int) (f32 * 255.0f));
                    canvas.drawText(this.m0, (dp4 / 2.0f) + (measuredWidth2 - (this.n0 / 2.0f)), f31 + AndroidUtilities.dp(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z11) {
            float f33 = uVar.p0;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.064f;
                uVar.p0 = f34;
                if (f34 < 0.0f) {
                    uVar.p0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f282 = uVar.p0;
        if (this.U == null) {
        }
        f14 = f282 * f13;
        if (f14 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.u2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u uVar = this.o0;
        if (!uVar.f0 || view != uVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f9 = uVar.a0;
        canvas.scale(f9, f9, uVar.b0, uVar.c0);
        canvas.translate(uVar.d0, uVar.e0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.u2
    public final void e() {
        super.e();
        u uVar = this.o0;
        p pVar = uVar.a;
        ImageView imageView = uVar.t0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        uVar.t0.getLayoutParams().width = pVar.d.getMeasuredWidth();
        uVar.t0.getLayoutParams().height = pVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        u uVar = this.o0;
        uVar.M = true;
        uVar.invalidate();
        uVar.M = false;
    }

    @Override // org.telegram.ui.Components.voip.u2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.o0;
        p pVar = uVar.a;
        boolean z11 = uVar.v;
        t2 t2Var = this.d;
        if (z11 && uVar.N && t2Var.rotatedFrameHeight != 0 && t2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.T = 1;
            } else if (uVar.b) {
                pVar.T = 1;
            } else if (this.e0.b) {
                pVar.T = 0;
            } else if (uVar.w.presentation) {
                pVar.T = 1;
            } else {
                pVar.T = 2;
            }
            uVar.N = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = t2Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = t2Var.rotatedFrameWidth) == 0 || (videoParticipant = uVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i14, i15, this.d0);
    }

    @Override // org.telegram.ui.Components.voip.u2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.o0.requestLayout();
        super.requestLayout();
    }
}
