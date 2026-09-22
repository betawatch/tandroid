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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.t81;
import org.telegram.ui.i60;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p extends s2 {
    public float g0;
    public final /* synthetic */ ChatObject.Call h0;
    public final /* synthetic */ m0 i0;
    public final /* synthetic */ TextPaint j0;
    public final /* synthetic */ StaticLayout k0;
    public final /* synthetic */ TextPaint l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ float n0;
    public final /* synthetic */ StaticLayout o0;
    public final /* synthetic */ i60 p0;
    public final /* synthetic */ String q0;
    public final /* synthetic */ float r0;
    public final /* synthetic */ u s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, Context context, ChatObject.Call call, m0 m0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, i60 i60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.s0 = uVar;
        this.h0 = call;
        this.i0 = m0Var;
        this.j0 = textPaint;
        this.k0 = staticLayout;
        this.l0 = textPaint2;
        this.m0 = str;
        this.n0 = f7;
        this.o0 = staticLayout2;
        this.p0 = i60Var;
        this.q0 = str2;
        this.r0 = f10;
    }

    @Override // org.telegram.ui.Components.voip.s2
    public final void a() {
        super.a();
        this.g0 = this.s0.w0;
    }

    @Override // org.telegram.ui.Components.voip.s2
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.s0;
        TextView textView = uVar.O;
        p pVar = uVar.a;
        invalidate();
        ChatObject.Call call = this.h0;
        if (call != null && call.call.rtmp_stream && uVar.z0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.A0);
            uVar.z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = uVar.s0;
        r2 r2Var = this.d;
        if (!z10 && r2Var.getAlpha() != 1.0f) {
            r2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.x0.getAlpha() == 1.0f) {
                uVar.x0.animate().alpha(0.0f).setDuration(300L).setListener(new t81(this, 4)).start();
            } else if (uVar.x0.getParent() != null) {
                pVar.removeView(uVar.x0);
            }
        }
        int i11 = r2Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = r2Var.rotatedFrameWidth) == 0 || (videoParticipant = uVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i10, i11, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0463  */
    @Override // org.telegram.ui.Components.voip.s2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        nr nrVar;
        float f10;
        int b10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        u uVar = this.s0;
        nr nrVar2 = uVar.u0;
        Drawable drawable = uVar.v0;
        p pVar = uVar.a;
        ImageReceiver imageReceiver = uVar.l0;
        TextView textView = uVar.O;
        r rVar = uVar.N;
        r2 r2Var = this.d;
        boolean isFirstFrameRendered = r2Var.isFirstFrameRendered();
        TextPaint textPaint = this.j0;
        ChatObject.Call call = this.h0;
        m0 m0Var = this.i0;
        if (!isFirstFrameRendered || (!(r2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || uVar.s0)) {
            float f15 = uVar.k0;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                uVar.k0 = f16;
                if (f16 > 1.0f) {
                    uVar.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (uVar.q0 != null) {
                canvas.save();
                float f17 = this.W;
                canvas.scale(f17, f17, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (uVar.r0 == null) {
                    Paint paint = new Paint(1);
                    uVar.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f7 = 0.0f;
                canvas.drawBitmap(uVar.q0, (getMeasuredWidth() - uVar.q0.getWidth()) / 2.0f, (getMeasuredHeight() - uVar.q0.getHeight()) / 2.0f, uVar.r0);
                canvas.restore();
            } else {
                f7 = 0.0f;
                imageReceiver.setImageCoords(this.O, this.N, getMeasuredWidth() - (this.O * 2.0f), getMeasuredHeight() - (this.N * 2.0f));
                imageReceiver.setAlpha(uVar.k0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = uVar.w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (uVar.b || !m0Var.b) {
                    float dp = AndroidUtilities.dp(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((dp / 2.0f) + (((getMeasuredWidth() - dp) / 2.0f) - (AndroidUtilities.dp(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - dp) + dp + AndroidUtilities.dp(10.0f));
                    this.k0.draw(canvas);
                    canvas.restore();
                }
                if (rVar.getVisibility() != 4) {
                    rVar.setVisibility(4);
                }
                nrVar = nrVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (rVar.getVisibility() != 0) {
                    rVar.setVisibility(0);
                    rVar.setScaleX(1.0f);
                    rVar.setScaleY(1.0f);
                }
                float f18 = uVar.y0 ? 0.0f : m0Var.c;
                int dp2 = AndroidUtilities.dp(33.0f);
                if (uVar.r || uVar.b) {
                    f10 = 10.0f;
                    b10 = (int) org.telegram.ui.Cells.c1.b(AndroidUtilities.dp(39.0f), m0Var.c, AndroidUtilities.dp(10.0f), dp2);
                } else {
                    f10 = 10.0f;
                    b10 = (int) ((Math.max(1.0f - m0Var.c, (uVar.h || uVar.f) ? m0Var.n : 0.0f) * AndroidUtilities.dp(10.0f)) + dp2);
                }
                int measuredWidth = (getMeasuredWidth() - b10) / 2;
                boolean z10 = uVar.h;
                float f19 = (z10 || uVar.f) ? m0Var.n : 0.0f;
                float f20 = f18;
                if (uVar.b) {
                    f11 = f20;
                } else {
                    f11 = uVar.r ? m0Var.c : f19;
                    f20 = (z10 || uVar.f) ? m0Var.n : m0Var.c;
                }
                float f21 = f11;
                int dp3 = (int) ((AndroidUtilities.dp(17.0f) * f20) + ((((getMeasuredHeight() - b10) / 2) - AndroidUtilities.dp(28.0f)) - (((((uVar.b || uVar.r) ? m0Var.c : 0.0f) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f21)));
                nrVar = nrVar2;
                int i11 = dp3 + b10;
                drawable.setBounds(measuredWidth, dp3, measuredWidth + b10, i11);
                drawable.draw(canvas);
                float f22 = m0Var.c;
                if (f22 > f7 || f19 > f7) {
                    float max = Math.max(f22, f19) * f21;
                    TextPaint textPaint2 = this.l0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (uVar.r || uVar.b) {
                        rVar.setAlpha((1.0f - f19) * max);
                    } else {
                        rVar.setAlpha(0.0f);
                    }
                    i10 = i11;
                    canvas.drawText(this.m0, (b10 / 2.0f) + (measuredWidth - (this.n0 / 2.0f)), AndroidUtilities.dp(32.0f) + i11, textPaint2);
                } else {
                    rVar.setAlpha(0.0f);
                    i10 = i11;
                }
                rVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i10) + uVar.p0) - this.N);
                rVar.setTranslationX(((getMeasuredWidth() - rVar.getMeasuredWidth()) / 2.0f) - this.O);
                if (m0Var.c < 1.0f && f19 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f19)) * 255.0d));
                    canvas.save();
                    canvas.translate((b10 / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f10) + i10);
                    this.o0.draw(canvas);
                    canvas.restore();
                }
            } else {
                nrVar = nrVar2;
                if (rVar.getVisibility() != 4) {
                    rVar.setVisibility(4);
                }
                h hVar = this.p0.r2;
                Paint paint2 = hVar.c;
                Matrix matrix = hVar.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = hVar.h;
                if (j3 != 0) {
                    long j10 = currentTimeMillis - j3;
                    if (j10 > 10) {
                        float f23 = (j10 / 500.0f) + hVar.g;
                        hVar.g = f23;
                        if (f23 > 4.0f) {
                            hVar.g = 0.0f;
                            org.telegram.ui.web.r0 r0Var = hVar.p;
                            if (r0Var != null) {
                                r0Var.run();
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
                    rectF.set(pVar.O, pVar.N, pVar.getMeasuredWidth() - pVar.O, pVar.getMeasuredHeight() - pVar.N);
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
            nrVar = nrVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + uVar.p0) - this.N);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.O);
        ImageView imageView = uVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.x0.setScaleX(pVar.d.getScaleX());
            uVar.x0.setScaleY(pVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.N) - AndroidUtilities.dp(80.0f);
        if (uVar.w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((uVar.b || uVar.r) && !i60.F3 && !i60.G3) {
                measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, m0Var.W, AndroidUtilities.dp(90.0f) * m0Var.c, measuredHeight);
            }
            f12 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(uVar.y);
            canvas.restore();
        } else {
            f12 = 0.0f;
        }
        boolean z11 = uVar.s0;
        if (!z11 && uVar.t0 == f12) {
            return;
        }
        if (z11) {
            float f26 = uVar.t0;
            if (f26 != 1.0f) {
                float f27 = f26 + 0.064f;
                uVar.t0 = f27;
                if (f27 > 1.0f) {
                    uVar.t0 = 1.0f;
                } else {
                    invalidate();
                }
                float f28 = uVar.t0;
                if (this.b0 == null) {
                    float f29 = this.g0;
                    float f30 = this.d0;
                    f13 = (uVar.w0 * f30) + ((1.0f - f30) * f29);
                } else {
                    f13 = uVar.w0;
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
                    nr nrVar3 = nrVar;
                    nrVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    nrVar3.draw(canvas);
                    canvas.restore();
                    float f32 = f14 * m0Var.c;
                    if (f32 <= 0.0f || uVar.w == call.videoNotAvailableParticipant) {
                        return;
                    }
                    textPaint.setAlpha((int) (f32 * 255.0f));
                    canvas.drawText(this.q0, (dp4 / 2.0f) + (measuredWidth2 - (this.r0 / 2.0f)), f31 + AndroidUtilities.dp(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z11) {
            float f33 = uVar.t0;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.064f;
                uVar.t0 = f34;
                if (f34 < 0.0f) {
                    uVar.t0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f282 = uVar.t0;
        if (this.b0 == null) {
        }
        f14 = f282 * f13;
        if (f14 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.s2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        u uVar = this.s0;
        if (!uVar.j0 || view != uVar.a.d) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = uVar.e0;
        canvas.scale(f7, f7, uVar.f0, uVar.g0);
        canvas.translate(uVar.h0, uVar.i0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.s2
    public final void e() {
        super.e();
        u uVar = this.s0;
        p pVar = uVar.a;
        ImageView imageView = uVar.x0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        uVar.x0.getLayoutParams().width = pVar.d.getMeasuredWidth();
        uVar.x0.getLayoutParams().height = pVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        u uVar = this.s0;
        uVar.Q = true;
        uVar.invalidate();
        uVar.Q = false;
    }

    @Override // org.telegram.ui.Components.voip.s2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.s0;
        p pVar = uVar.a;
        boolean z11 = uVar.v;
        r2 r2Var = this.d;
        if (z11 && uVar.R && r2Var.rotatedFrameHeight != 0 && r2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.a0 = 1;
            } else if (uVar.b) {
                pVar.a0 = 1;
            } else if (this.i0.b) {
                pVar.a0 = 0;
            } else if (uVar.w.presentation) {
                pVar.a0 = 1;
            } else {
                pVar.a0 = 2;
            }
            uVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = r2Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = r2Var.rotatedFrameWidth) == 0 || (videoParticipant = uVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i14, i15, this.h0);
    }

    @Override // org.telegram.ui.Components.voip.s2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.s0.requestLayout();
        super.requestLayout();
    }
}
