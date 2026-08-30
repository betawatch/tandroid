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
import org.telegram.ui.Components.kr;
import org.telegram.ui.c60;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o extends s2 {
    public float d0;
    public final /* synthetic */ ChatObject.Call e0;
    public final /* synthetic */ k0 f0;
    public final /* synthetic */ TextPaint g0;
    public final /* synthetic */ StaticLayout h0;
    public final /* synthetic */ TextPaint i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ float k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ c60 m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ t p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, Context context, ChatObject.Call call, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, c60 c60Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.p0 = tVar;
        this.e0 = call;
        this.f0 = k0Var;
        this.g0 = textPaint;
        this.h0 = staticLayout;
        this.i0 = textPaint2;
        this.j0 = str;
        this.k0 = f10;
        this.l0 = staticLayout2;
        this.m0 = c60Var;
        this.n0 = str2;
        this.o0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.s2
    public final void a() {
        super.a();
        this.d0 = this.p0.t0;
    }

    @Override // org.telegram.ui.Components.voip.s2
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.p0;
        TextView textView = tVar.L;
        o oVar = tVar.a;
        invalidate();
        ChatObject.Call call = this.e0;
        if (call != null && call.call.rtmp_stream && tVar.w0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.x0);
            tVar.w0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z4 = tVar.p0;
        r2 r2Var = this.d;
        if (!z4 && r2Var.getAlpha() != 1.0f) {
            r2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.u0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.u0.getAlpha() == 1.0f) {
                tVar.u0.animate().alpha(0.0f).setDuration(300L).setListener(new f91(this, 2)).start();
            } else if (tVar.u0.getParent() != null) {
                oVar.removeView(tVar.u0);
            }
        }
        int i11 = r2Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = r2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.w) == null) {
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
        float f10;
        kr krVar;
        float f11;
        int A;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        t tVar = this.p0;
        kr krVar2 = tVar.r0;
        Drawable drawable = tVar.s0;
        o oVar = tVar.a;
        ImageReceiver imageReceiver = tVar.i0;
        TextView textView = tVar.L;
        q qVar = tVar.K;
        r2 r2Var = this.d;
        boolean isFirstFrameRendered = r2Var.isFirstFrameRendered();
        TextPaint textPaint = this.g0;
        ChatObject.Call call = this.e0;
        k0 k0Var = this.f0;
        if (!isFirstFrameRendered || (!(r2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || tVar.p0)) {
            float f16 = tVar.h0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                tVar.h0 = f17;
                if (f17 > 1.0f) {
                    tVar.h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (tVar.n0 != null) {
                canvas.save();
                float f18 = this.T;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (tVar.o0 == null) {
                    Paint paint = new Paint(1);
                    tVar.o0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(tVar.n0, (getMeasuredWidth() - tVar.n0.getWidth()) / 2.0f, (getMeasuredHeight() - tVar.n0.getHeight()) / 2.0f, tVar.o0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.setImageCoords(this.L, this.K, getMeasuredWidth() - (this.L * 2.0f), getMeasuredHeight() - (this.K * 2.0f));
                imageReceiver.setAlpha(tVar.h0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = tVar.w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (tVar.b || !k0Var.b) {
                    float dp = AndroidUtilities.dp(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((dp / 2.0f) + (((getMeasuredWidth() - dp) / 2.0f) - (AndroidUtilities.dp(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - dp) + dp + AndroidUtilities.dp(10.0f));
                    this.h0.draw(canvas);
                    canvas.restore();
                }
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                krVar = krVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (qVar.getVisibility() != 0) {
                    qVar.setVisibility(0);
                    qVar.setScaleX(1.0f);
                    qVar.setScaleY(1.0f);
                }
                float f19 = tVar.v0 ? 0.0f : k0Var.c;
                int dp2 = AndroidUtilities.dp(33.0f);
                if (tVar.r || tVar.b) {
                    f11 = 10.0f;
                    A = (int) e2.c.A(AndroidUtilities.dp(39.0f), k0Var.c, AndroidUtilities.dp(10.0f), dp2);
                } else {
                    f11 = 10.0f;
                    A = (int) ((Math.max(1.0f - k0Var.c, (tVar.h || tVar.f) ? k0Var.n : 0.0f) * AndroidUtilities.dp(10.0f)) + dp2);
                }
                int measuredWidth = (getMeasuredWidth() - A) / 2;
                boolean z4 = tVar.h;
                float f20 = (z4 || tVar.f) ? k0Var.n : 0.0f;
                float f21 = f19;
                if (tVar.b) {
                    f12 = f21;
                } else {
                    f12 = tVar.r ? k0Var.c : f20;
                    f21 = (z4 || tVar.f) ? k0Var.n : k0Var.c;
                }
                float f22 = f12;
                int dp3 = (int) ((AndroidUtilities.dp(17.0f) * f21) + ((((getMeasuredHeight() - A) / 2) - AndroidUtilities.dp(28.0f)) - (((((tVar.b || tVar.r) ? k0Var.c : 0.0f) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f22)));
                krVar = krVar2;
                int i11 = dp3 + A;
                drawable.setBounds(measuredWidth, dp3, measuredWidth + A, i11);
                drawable.draw(canvas);
                float f23 = k0Var.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.i0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (tVar.r || tVar.b) {
                        qVar.setAlpha((1.0f - f20) * max);
                    } else {
                        qVar.setAlpha(0.0f);
                    }
                    i10 = i11;
                    canvas.drawText(this.j0, (A / 2.0f) + (measuredWidth - (this.k0 / 2.0f)), AndroidUtilities.dp(32.0f) + i11, textPaint2);
                } else {
                    qVar.setAlpha(0.0f);
                    i10 = i11;
                }
                qVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i10) + tVar.m0) - this.K);
                qVar.setTranslationX(((getMeasuredWidth() - qVar.getMeasuredWidth()) / 2.0f) - this.L);
                if (k0Var.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((A / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f11) + i10);
                    this.l0.draw(canvas);
                    canvas.restore();
                }
            } else {
                krVar = krVar2;
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
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
                            ef.e eVar = hVar.p;
                            if (eVar != null) {
                                eVar.run();
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
                    matrix.setTranslate(((((r10 * 2) + i12) * f25) - hVar.e) - tVar.getX(), 0.0f);
                    hVar.b.setLocalMatrix(matrix);
                    hVar.d.setLocalMatrix(matrix);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(oVar.L, oVar.K, oVar.getMeasuredWidth() - oVar.L, oVar.getMeasuredHeight() - oVar.K);
                    canvas.drawRect(rectF, hVar.a);
                    if (hVar.k) {
                        if (hVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f26 = oVar.b;
                        canvas.drawRoundRect(rectF, f26, f26, paint2);
                    }
                }
            }
            invalidate();
        } else {
            krVar = krVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + tVar.m0) - this.K);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.L);
        ImageView imageView = tVar.u0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.u0.setScaleX(oVar.d.getScaleX());
            tVar.u0.setScaleY(oVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.K) - AndroidUtilities.dp(80.0f);
        if (tVar.w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((tVar.b || tVar.r) && !c60.C3 && !c60.D3) {
                measuredHeight = yh.c(1.0f, k0Var.T, AndroidUtilities.dp(90.0f) * k0Var.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(tVar.y);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z10 = tVar.p0;
        if (!z10 && tVar.q0 == f13) {
            return;
        }
        if (z10) {
            float f27 = tVar.q0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                tVar.q0 = f28;
                if (f28 > 1.0f) {
                    tVar.q0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = tVar.q0;
                if (this.V == null) {
                    float f30 = this.d0;
                    float f31 = this.a0;
                    f14 = (tVar.t0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = tVar.t0;
                }
                f15 = f29 * f14;
                if (f15 <= 0.0f) {
                    float dp4 = AndroidUtilities.dp(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - dp4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - dp4) / 2.0f;
                    if (tVar.w == call.videoNotAvailableParticipant) {
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
                    kr krVar3 = krVar;
                    krVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    krVar3.draw(canvas);
                    canvas.restore();
                    float f33 = f15 * k0Var.c;
                    if (f33 <= 0.0f || tVar.w == call.videoNotAvailableParticipant) {
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
            float f34 = tVar.q0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                tVar.q0 = f35;
                if (f35 < 0.0f) {
                    tVar.q0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = tVar.q0;
        if (this.V == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.s2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.p0;
        if (!tVar.g0 || view != tVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = tVar.b0;
        canvas.scale(f10, f10, tVar.c0, tVar.d0);
        canvas.translate(tVar.e0, tVar.f0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.s2
    public final void e() {
        super.e();
        t tVar = this.p0;
        o oVar = tVar.a;
        ImageView imageView = tVar.u0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        tVar.u0.getLayoutParams().width = oVar.d.getMeasuredWidth();
        tVar.u0.getLayoutParams().height = oVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        t tVar = this.p0;
        tVar.N = true;
        tVar.invalidate();
        tVar.N = false;
    }

    @Override // org.telegram.ui.Components.voip.s2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.p0;
        o oVar = tVar.a;
        boolean z10 = tVar.v;
        r2 r2Var = this.d;
        if (z10 && tVar.O && r2Var.rotatedFrameHeight != 0 && r2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.U = 1;
            } else if (tVar.b) {
                oVar.U = 1;
            } else if (this.f0.b) {
                oVar.U = 0;
            } else if (tVar.w.presentation) {
                oVar.U = 1;
            } else {
                oVar.U = 2;
            }
            tVar.O = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = r2Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = r2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i14, i15, this.e0);
    }

    @Override // org.telegram.ui.Components.voip.s2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.p0.requestLayout();
        super.requestLayout();
    }
}
