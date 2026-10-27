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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.i31;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o extends t2 {
    public float g0;
    public final /* synthetic */ ChatObject.Call h0;
    public final /* synthetic */ l0 i0;
    public final /* synthetic */ TextPaint j0;
    public final /* synthetic */ StaticLayout k0;
    public final /* synthetic */ TextPaint l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ float n0;
    public final /* synthetic */ StaticLayout o0;
    public final /* synthetic */ x50 p0;
    public final /* synthetic */ String q0;
    public final /* synthetic */ float r0;
    public final /* synthetic */ t s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, x50 x50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.s0 = tVar;
        this.h0 = call;
        this.i0 = l0Var;
        this.j0 = textPaint;
        this.k0 = staticLayout;
        this.l0 = textPaint2;
        this.m0 = str;
        this.n0 = f7;
        this.o0 = staticLayout2;
        this.p0 = x50Var;
        this.q0 = str2;
        this.r0 = f10;
    }

    @Override // org.telegram.ui.Components.voip.t2
    public final void a() {
        super.a();
        this.g0 = this.s0.w0;
    }

    @Override // org.telegram.ui.Components.voip.t2
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.s0;
        TextView textView = tVar.O;
        o oVar = tVar.a;
        invalidate();
        ChatObject.Call call = this.h0;
        if (call != null && call.call.rtmp_stream && tVar.z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.x0.getAlpha() == 1.0f) {
                tVar.x0.animate().alpha(0.0f).setDuration(300L).setListener(new i31(this, 11)).start();
            } else if (tVar.x0.getParent() != null) {
                oVar.removeView(tVar.x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = s2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i10, i11, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0461  */
    @Override // org.telegram.ui.Components.voip.t2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        as asVar;
        float f10;
        int e;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        t tVar = this.s0;
        as asVar2 = tVar.u0;
        Drawable drawable = tVar.v0;
        o oVar = tVar.a;
        ImageReceiver imageReceiver = tVar.l0;
        TextView textView = tVar.O;
        q qVar = tVar.N;
        s2 s2Var = this.d;
        boolean isFirstFrameRendered = s2Var.isFirstFrameRendered();
        TextPaint textPaint = this.j0;
        ChatObject.Call call = this.h0;
        l0 l0Var = this.i0;
        if (!isFirstFrameRendered || (!(s2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || tVar.s0)) {
            float f15 = tVar.k0;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                tVar.k0 = f16;
                if (f16 > 1.0f) {
                    tVar.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (tVar.q0 != null) {
                canvas.save();
                float f17 = this.W;
                canvas.scale(f17, f17, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (tVar.r0 == null) {
                    Paint paint = new Paint(1);
                    tVar.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f7 = 0.0f;
                canvas.drawBitmap(tVar.q0, (getMeasuredWidth() - tVar.q0.getWidth()) / 2.0f, (getMeasuredHeight() - tVar.q0.getHeight()) / 2.0f, tVar.r0);
                canvas.restore();
            } else {
                f7 = 0.0f;
                imageReceiver.setImageCoords(this.O, this.N, getMeasuredWidth() - (this.O * 2.0f), getMeasuredHeight() - (this.N * 2.0f));
                imageReceiver.setAlpha(tVar.k0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = tVar.w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (tVar.b || !l0Var.b) {
                    float dp = AndroidUtilities.dp(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((dp / 2.0f) + (((getMeasuredWidth() - dp) / 2.0f) - (AndroidUtilities.dp(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - dp) + dp + AndroidUtilities.dp(10.0f));
                    this.k0.draw(canvas);
                    canvas.restore();
                }
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                asVar = asVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (qVar.getVisibility() != 0) {
                    qVar.setVisibility(0);
                    qVar.setScaleX(1.0f);
                    qVar.setScaleY(1.0f);
                }
                float f18 = tVar.y0 ? f7 : l0Var.c;
                int dp2 = AndroidUtilities.dp(33.0f);
                if (tVar.r || tVar.b) {
                    f10 = 10.0f;
                    e = (int) b10.e(AndroidUtilities.dp(39.0f), l0Var.c, AndroidUtilities.dp(10.0f), dp2);
                } else {
                    f10 = 10.0f;
                    e = (int) ((Math.max(1.0f - l0Var.c, (tVar.h || tVar.f) ? l0Var.n : f7) * AndroidUtilities.dp(10.0f)) + dp2);
                }
                int measuredWidth = (getMeasuredWidth() - e) / 2;
                boolean z10 = tVar.h;
                float f19 = (z10 || tVar.f) ? l0Var.n : f7;
                float f20 = f18;
                if (tVar.b) {
                    f11 = f20;
                } else {
                    f11 = tVar.r ? l0Var.c : f19;
                    f20 = (z10 || tVar.f) ? l0Var.n : l0Var.c;
                }
                float f21 = f11;
                int dp3 = (int) ((AndroidUtilities.dp(17.0f) * f20) + ((((getMeasuredHeight() - e) / 2) - AndroidUtilities.dp(28.0f)) - (((((tVar.b || tVar.r) ? l0Var.c : f7) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f21)));
                asVar = asVar2;
                int i11 = dp3 + e;
                drawable.setBounds(measuredWidth, dp3, measuredWidth + e, i11);
                drawable.draw(canvas);
                float f22 = l0Var.c;
                if (f22 > f7 || f19 > f7) {
                    float max = Math.max(f22, f19) * f21;
                    TextPaint textPaint2 = this.l0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (tVar.r || tVar.b) {
                        qVar.setAlpha((1.0f - f19) * max);
                    } else {
                        qVar.setAlpha(0.0f);
                    }
                    i10 = i11;
                    canvas.drawText(this.m0, (e / 2.0f) + (measuredWidth - (this.n0 / 2.0f)), AndroidUtilities.dp(32.0f) + i11, textPaint2);
                } else {
                    qVar.setAlpha(f7);
                    i10 = i11;
                }
                qVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i10) + tVar.p0) - this.N);
                qVar.setTranslationX(((getMeasuredWidth() - qVar.getMeasuredWidth()) / 2.0f) - this.O);
                if (l0Var.c < 1.0f && f19 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f19)) * 255.0d));
                    canvas.save();
                    canvas.translate((e / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f10) + i10);
                    this.o0.draw(canvas);
                    canvas.restore();
                }
            } else {
                asVar = asVar2;
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                h hVar = this.p0.r2;
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
                            org.telegram.ui.web.h1 h1Var = hVar.p;
                            if (h1Var != null) {
                                h1Var.run();
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
                    matrix.setTranslate(((((r10 * 2) + i12) * f24) - hVar.e) - tVar.getX(), 0.0f);
                    hVar.b.setLocalMatrix(matrix);
                    hVar.d.setLocalMatrix(matrix);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(oVar.O, oVar.N, oVar.getMeasuredWidth() - oVar.O, oVar.getMeasuredHeight() - oVar.N);
                    canvas.drawRect(rectF, hVar.a);
                    if (hVar.k) {
                        if (hVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f25 = oVar.b;
                        canvas.drawRoundRect(rectF, f25, f25, paint2);
                    }
                }
            }
            invalidate();
        } else {
            asVar = asVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + tVar.p0) - this.N);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.O);
        ImageView imageView = tVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.x0.setScaleX(oVar.d.getScaleX());
            tVar.x0.setScaleY(oVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.N) - AndroidUtilities.dp(80.0f);
        if (tVar.w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((tVar.b || tVar.r) && !x50.F3 && !x50.G3) {
                measuredHeight = ic.a.d(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.c, measuredHeight);
            }
            f12 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(tVar.y);
            canvas.restore();
        } else {
            f12 = 0.0f;
        }
        boolean z11 = tVar.s0;
        if (!z11 && tVar.t0 == f12) {
            return;
        }
        if (z11) {
            float f26 = tVar.t0;
            if (f26 != 1.0f) {
                float f27 = f26 + 0.064f;
                tVar.t0 = f27;
                if (f27 > 1.0f) {
                    tVar.t0 = 1.0f;
                } else {
                    invalidate();
                }
                float f28 = tVar.t0;
                if (this.b0 == null) {
                    float f29 = this.g0;
                    float f30 = this.d0;
                    f13 = (tVar.w0 * f30) + ((1.0f - f30) * f29);
                } else {
                    f13 = tVar.w0;
                }
                f14 = f28 * f13;
                if (f14 <= 0.0f) {
                    float dp4 = AndroidUtilities.dp(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - dp4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - dp4) / 2.0f;
                    if (tVar.w == call.videoNotAvailableParticipant) {
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
                    as asVar3 = asVar;
                    asVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    asVar3.draw(canvas);
                    canvas.restore();
                    float f32 = f14 * l0Var.c;
                    if (f32 <= 0.0f || tVar.w == call.videoNotAvailableParticipant) {
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
            float f33 = tVar.t0;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.064f;
                tVar.t0 = f34;
                if (f34 < 0.0f) {
                    tVar.t0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f282 = tVar.t0;
        if (this.b0 == null) {
        }
        f14 = f282 * f13;
        if (f14 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.t2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.s0;
        if (!tVar.j0 || view != tVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = tVar.e0;
        canvas.scale(f7, f7, tVar.f0, tVar.g0);
        canvas.translate(tVar.h0, tVar.i0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.t2
    public final void e() {
        super.e();
        t tVar = this.s0;
        o oVar = tVar.a;
        ImageView imageView = tVar.x0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        tVar.x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
        tVar.x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        t tVar = this.s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override // org.telegram.ui.Components.voip.t2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.s0;
        o oVar = tVar.a;
        boolean z11 = tVar.v;
        s2 s2Var = this.d;
        if (z11 && tVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.a0 = 1;
            } else if (tVar.b) {
                oVar.a0 = 1;
            } else if (this.i0.b) {
                oVar.a0 = 0;
            } else if (tVar.w.presentation) {
                oVar.a0 = 1;
            } else {
                oVar.a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = s2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i14, i15, this.h0);
    }

    @Override // org.telegram.ui.Components.voip.t2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.s0.requestLayout();
        super.requestLayout();
    }
}
