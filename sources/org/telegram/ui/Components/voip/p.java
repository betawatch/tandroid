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
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.mr;
import org.telegram.ui.d60;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p extends t2 {
    public float d0;
    public final /* synthetic */ ChatObject.Call e0;
    public final /* synthetic */ l0 f0;
    public final /* synthetic */ TextPaint g0;
    public final /* synthetic */ StaticLayout h0;
    public final /* synthetic */ TextPaint i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ float k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ d60 m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ u p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, d60 d60Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.p0 = uVar;
        this.e0 = call;
        this.f0 = l0Var;
        this.g0 = textPaint;
        this.h0 = staticLayout;
        this.i0 = textPaint2;
        this.j0 = str;
        this.k0 = f10;
        this.l0 = staticLayout2;
        this.m0 = d60Var;
        this.n0 = str2;
        this.o0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.t2
    public final void a() {
        super.a();
        this.d0 = this.p0.t0;
    }

    @Override // org.telegram.ui.Components.voip.t2
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.p0;
        TextView textView = uVar.L;
        p pVar = uVar.a;
        invalidate();
        ChatObject.Call call = this.e0;
        if (call != null && call.call.rtmp_stream && uVar.w0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.x0);
            uVar.w0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z4 = uVar.p0;
        s2 s2Var = this.d;
        if (!z4 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.u0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.u0.getAlpha() == 1.0f) {
                uVar.u0.animate().alpha(0.0f).setDuration(300L).setListener(new f91(this, 2)).start();
            } else if (uVar.u0.getParent() != null) {
                pVar.removeView(uVar.u0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = s2Var.rotatedFrameWidth) == 0 || (videoParticipant = uVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i10, i11, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0463  */
    @Override // org.telegram.ui.Components.voip.t2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        mr mrVar;
        float f11;
        int A;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        u uVar = this.p0;
        mr mrVar2 = uVar.r0;
        Drawable drawable = uVar.s0;
        p pVar = uVar.a;
        ImageReceiver imageReceiver = uVar.i0;
        TextView textView = uVar.L;
        r rVar = uVar.K;
        s2 s2Var = this.d;
        boolean isFirstFrameRendered = s2Var.isFirstFrameRendered();
        TextPaint textPaint = this.g0;
        ChatObject.Call call = this.e0;
        l0 l0Var = this.f0;
        if (!isFirstFrameRendered || (!(s2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || uVar.p0)) {
            float f16 = uVar.h0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                uVar.h0 = f17;
                if (f17 > 1.0f) {
                    uVar.h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (uVar.n0 != null) {
                canvas.save();
                float f18 = this.T;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (uVar.o0 == null) {
                    Paint paint = new Paint(1);
                    uVar.o0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(uVar.n0, (getMeasuredWidth() - uVar.n0.getWidth()) / 2.0f, (getMeasuredHeight() - uVar.n0.getHeight()) / 2.0f, uVar.o0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.setImageCoords(this.L, this.K, getMeasuredWidth() - (this.L * 2.0f), getMeasuredHeight() - (this.K * 2.0f));
                imageReceiver.setAlpha(uVar.h0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = uVar.w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (uVar.b || !l0Var.b) {
                    float dp = AndroidUtilities.dp(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((dp / 2.0f) + (((getMeasuredWidth() - dp) / 2.0f) - (AndroidUtilities.dp(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - dp) + dp + AndroidUtilities.dp(10.0f));
                    this.h0.draw(canvas);
                    canvas.restore();
                }
                if (rVar.getVisibility() != 4) {
                    rVar.setVisibility(4);
                }
                mrVar = mrVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (rVar.getVisibility() != 0) {
                    rVar.setVisibility(0);
                    rVar.setScaleX(1.0f);
                    rVar.setScaleY(1.0f);
                }
                float f19 = uVar.v0 ? 0.0f : l0Var.c;
                int dp2 = AndroidUtilities.dp(33.0f);
                if (uVar.r || uVar.b) {
                    f11 = 10.0f;
                    A = (int) e2.c.A(AndroidUtilities.dp(39.0f), l0Var.c, AndroidUtilities.dp(10.0f), dp2);
                } else {
                    f11 = 10.0f;
                    A = (int) ((Math.max(1.0f - l0Var.c, (uVar.h || uVar.f) ? l0Var.n : 0.0f) * AndroidUtilities.dp(10.0f)) + dp2);
                }
                int measuredWidth = (getMeasuredWidth() - A) / 2;
                boolean z4 = uVar.h;
                float f20 = (z4 || uVar.f) ? l0Var.n : 0.0f;
                float f21 = f19;
                if (uVar.b) {
                    f12 = f21;
                } else {
                    f12 = uVar.r ? l0Var.c : f20;
                    f21 = (z4 || uVar.f) ? l0Var.n : l0Var.c;
                }
                float f22 = f12;
                int dp3 = (int) ((AndroidUtilities.dp(17.0f) * f21) + ((((getMeasuredHeight() - A) / 2) - AndroidUtilities.dp(28.0f)) - (((((uVar.b || uVar.r) ? l0Var.c : 0.0f) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f22)));
                mrVar = mrVar2;
                int i11 = dp3 + A;
                drawable.setBounds(measuredWidth, dp3, measuredWidth + A, i11);
                drawable.draw(canvas);
                float f23 = l0Var.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.i0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (uVar.r || uVar.b) {
                        rVar.setAlpha((1.0f - f20) * max);
                    } else {
                        rVar.setAlpha(0.0f);
                    }
                    i10 = i11;
                    canvas.drawText(this.j0, (A / 2.0f) + (measuredWidth - (this.k0 / 2.0f)), AndroidUtilities.dp(32.0f) + i11, textPaint2);
                } else {
                    rVar.setAlpha(0.0f);
                    i10 = i11;
                }
                rVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i10) + uVar.m0) - this.K);
                rVar.setTranslationX(((getMeasuredWidth() - rVar.getMeasuredWidth()) / 2.0f) - this.L);
                if (l0Var.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((A / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f11) + i10);
                    this.l0.draw(canvas);
                    canvas.restore();
                }
            } else {
                mrVar = mrVar2;
                if (rVar.getVisibility() != 4) {
                    rVar.setVisibility(4);
                }
                h hVar = this.m0.o2;
                Paint paint2 = hVar.c;
                Matrix matrix = hVar.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = hVar.h;
                if (j10 != 0) {
                    long j11 = currentTimeMillis - j10;
                    if (j11 > 10) {
                        float f24 = (j11 / 500.0f) + hVar.g;
                        hVar.g = f24;
                        if (f24 > 4.0f) {
                            hVar.g = 0.0f;
                            eh.m mVar = hVar.p;
                            if (mVar != null) {
                                mVar.run();
                            }
                        }
                        hVar.h = currentTimeMillis;
                    }
                } else {
                    hVar.h = currentTimeMillis;
                }
                float f25 = hVar.g;
                if (f25 <= 1.0f) {
                    int i12 = hVar.f;
                    matrix.setTranslate(((((r10 * 2) + i12) * f25) - hVar.e) - uVar.getX(), 0.0f);
                    hVar.b.setLocalMatrix(matrix);
                    hVar.d.setLocalMatrix(matrix);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(pVar.L, pVar.K, pVar.getMeasuredWidth() - pVar.L, pVar.getMeasuredHeight() - pVar.K);
                    canvas.drawRect(rectF, hVar.a);
                    if (hVar.k) {
                        if (hVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f26 = pVar.b;
                        canvas.drawRoundRect(rectF, f26, f26, paint2);
                    }
                }
            }
            invalidate();
        } else {
            mrVar = mrVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + uVar.m0) - this.K);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.L);
        ImageView imageView = uVar.u0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.u0.setScaleX(pVar.d.getScaleX());
            uVar.u0.setScaleY(pVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.K) - AndroidUtilities.dp(80.0f);
        if (uVar.w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((uVar.b || uVar.r) && !d60.C3 && !d60.D3) {
                measuredHeight = yh.c(1.0f, l0Var.T, AndroidUtilities.dp(90.0f) * l0Var.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(uVar.y);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z10 = uVar.p0;
        if (!z10 && uVar.q0 == f13) {
            return;
        }
        if (z10) {
            float f27 = uVar.q0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                uVar.q0 = f28;
                if (f28 > 1.0f) {
                    uVar.q0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = uVar.q0;
                if (this.V == null) {
                    float f30 = this.d0;
                    float f31 = this.a0;
                    f14 = (uVar.t0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = uVar.t0;
                }
                f15 = f29 * f14;
                if (f15 <= 0.0f) {
                    float dp4 = AndroidUtilities.dp(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - dp4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - dp4) / 2.0f;
                    if (uVar.w == call.videoNotAvailableParticipant) {
                        measuredHeight2 -= dp4 / 2.5f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f32 = measuredHeight2 + dp4;
                    rectF2.set((int) measuredWidth2, (int) measuredHeight2, (int) (measuredWidth2 + dp4), (int) f32);
                    if (f15 != 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (f15 * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    mr mrVar3 = mrVar;
                    mrVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    mrVar3.draw(canvas);
                    canvas.restore();
                    float f33 = f15 * l0Var.c;
                    if (f33 <= 0.0f || uVar.w == call.videoNotAvailableParticipant) {
                        return;
                    }
                    textPaint.setAlpha((int) (f33 * 255.0f));
                    canvas.drawText(this.n0, (dp4 / 2.0f) + (measuredWidth2 - (this.o0 / 2.0f)), f32 + AndroidUtilities.dp(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f34 = uVar.q0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                uVar.q0 = f35;
                if (f35 < 0.0f) {
                    uVar.q0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = uVar.q0;
        if (this.V == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.t2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u uVar = this.p0;
        if (!uVar.g0 || view != uVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = uVar.b0;
        canvas.scale(f10, f10, uVar.c0, uVar.d0);
        canvas.translate(uVar.e0, uVar.f0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.t2
    public final void e() {
        super.e();
        u uVar = this.p0;
        p pVar = uVar.a;
        ImageView imageView = uVar.u0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        uVar.u0.getLayoutParams().width = pVar.d.getMeasuredWidth();
        uVar.u0.getLayoutParams().height = pVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        u uVar = this.p0;
        uVar.N = true;
        uVar.invalidate();
        uVar.N = false;
    }

    @Override // org.telegram.ui.Components.voip.t2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.p0;
        p pVar = uVar.a;
        boolean z10 = uVar.v;
        s2 s2Var = this.d;
        if (z10 && uVar.O && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.U = 1;
            } else if (uVar.b) {
                pVar.U = 1;
            } else if (this.f0.b) {
                pVar.U = 0;
            } else if (uVar.w.presentation) {
                pVar.U = 1;
            } else {
                pVar.U = 2;
            }
            uVar.O = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = s2Var.rotatedFrameWidth) == 0 || (videoParticipant = uVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i14, i15, this.e0);
    }

    @Override // org.telegram.ui.Components.voip.t2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.p0.requestLayout();
        super.requestLayout();
    }
}
