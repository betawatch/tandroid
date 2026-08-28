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
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.y11;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends r2 {
    public float c0;
    public final /* synthetic */ ChatObject.Call d0;
    public final /* synthetic */ k0 e0;
    public final /* synthetic */ TextPaint f0;
    public final /* synthetic */ StaticLayout g0;
    public final /* synthetic */ TextPaint h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ float j0;
    public final /* synthetic */ StaticLayout k0;
    public final /* synthetic */ o50 l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ float n0;
    public final /* synthetic */ t o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, Context context, ChatObject.Call call, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, o50 o50Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.o0 = tVar;
        this.d0 = call;
        this.e0 = k0Var;
        this.f0 = textPaint;
        this.g0 = staticLayout;
        this.h0 = textPaint2;
        this.i0 = str;
        this.j0 = f10;
        this.k0 = staticLayout2;
        this.l0 = o50Var;
        this.m0 = str2;
        this.n0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.r2
    public final void a() {
        super.a();
        this.c0 = this.o0.s0;
    }

    @Override // org.telegram.ui.Components.voip.r2
    public final void b() {
        int i9;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.o0;
        TextView textView = tVar.K;
        o oVar = tVar.a;
        invalidate();
        ChatObject.Call call = this.d0;
        if (call != null && call.call.rtmp_stream && tVar.v0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.w0);
            tVar.v0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.o0;
        q2 q2Var = this.d;
        if (!z10 && q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.t0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.t0.getAlpha() == 1.0f) {
                tVar.t0.animate().alpha(0.0f).setDuration(300L).setListener(new y11(this, 9)).start();
            } else if (tVar.t0.getParent() != null) {
                oVar.removeView(tVar.t0);
            }
        }
        int i10 = q2Var.rotatedFrameHeight;
        if (i10 == 0 || (i9 = q2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i9, i10, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0463  */
    @Override // org.telegram.ui.Components.voip.r2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        dr drVar;
        float f11;
        int w8;
        float f12;
        int i9;
        float f13;
        float f14;
        float f15;
        t tVar = this.o0;
        dr drVar2 = tVar.q0;
        Drawable drawable = tVar.r0;
        o oVar = tVar.a;
        ImageReceiver imageReceiver = tVar.h0;
        TextView textView = tVar.K;
        q qVar = tVar.J;
        q2 q2Var = this.d;
        boolean isFirstFrameRendered = q2Var.isFirstFrameRendered();
        TextPaint textPaint = this.f0;
        ChatObject.Call call = this.d0;
        k0 k0Var = this.e0;
        if (!isFirstFrameRendered || (!(q2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || tVar.o0)) {
            float f16 = tVar.g0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                tVar.g0 = f17;
                if (f17 > 1.0f) {
                    tVar.g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (tVar.m0 != null) {
                canvas.save();
                float f18 = this.S;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (tVar.n0 == null) {
                    Paint paint = new Paint(1);
                    tVar.n0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(tVar.m0, (getMeasuredWidth() - tVar.m0.getWidth()) / 2.0f, (getMeasuredHeight() - tVar.m0.getHeight()) / 2.0f, tVar.n0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.setImageCoords(this.K, this.J, getMeasuredWidth() - (this.K * 2.0f), getMeasuredHeight() - (this.J * 2.0f));
                imageReceiver.setAlpha(tVar.g0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = tVar.w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (tVar.b || !k0Var.b) {
                    float dp = AndroidUtilities.dp(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((dp / 2.0f) + (((getMeasuredWidth() - dp) / 2.0f) - (AndroidUtilities.dp(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - dp) + dp + AndroidUtilities.dp(10.0f));
                    this.g0.draw(canvas);
                    canvas.restore();
                }
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                drVar = drVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (qVar.getVisibility() != 0) {
                    qVar.setVisibility(0);
                    qVar.setScaleX(1.0f);
                    qVar.setScaleY(1.0f);
                }
                float f19 = tVar.u0 ? 0.0f : k0Var.c;
                int dp2 = AndroidUtilities.dp(33.0f);
                if (tVar.r || tVar.b) {
                    f11 = 10.0f;
                    w8 = (int) aa.d.w(AndroidUtilities.dp(39.0f), k0Var.c, AndroidUtilities.dp(10.0f), dp2);
                } else {
                    f11 = 10.0f;
                    w8 = (int) ((Math.max(1.0f - k0Var.c, (tVar.h || tVar.f) ? k0Var.n : 0.0f) * AndroidUtilities.dp(10.0f)) + dp2);
                }
                int measuredWidth = (getMeasuredWidth() - w8) / 2;
                boolean z10 = tVar.h;
                float f20 = (z10 || tVar.f) ? k0Var.n : 0.0f;
                float f21 = f19;
                if (tVar.b) {
                    f12 = f21;
                } else {
                    f12 = tVar.r ? k0Var.c : f20;
                    f21 = (z10 || tVar.f) ? k0Var.n : k0Var.c;
                }
                float f22 = f12;
                int dp3 = (int) ((AndroidUtilities.dp(17.0f) * f21) + ((((getMeasuredHeight() - w8) / 2) - AndroidUtilities.dp(28.0f)) - (((((tVar.b || tVar.r) ? k0Var.c : 0.0f) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f22)));
                drVar = drVar2;
                int i10 = dp3 + w8;
                drawable.setBounds(measuredWidth, dp3, measuredWidth + w8, i10);
                drawable.draw(canvas);
                float f23 = k0Var.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.h0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (tVar.r || tVar.b) {
                        qVar.setAlpha((1.0f - f20) * max);
                    } else {
                        qVar.setAlpha(0.0f);
                    }
                    i9 = i10;
                    canvas.drawText(this.i0, (w8 / 2.0f) + (measuredWidth - (this.j0 / 2.0f)), AndroidUtilities.dp(32.0f) + i10, textPaint2);
                } else {
                    qVar.setAlpha(0.0f);
                    i9 = i10;
                }
                qVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i9) + tVar.l0) - this.J);
                qVar.setTranslationX(((getMeasuredWidth() - qVar.getMeasuredWidth()) / 2.0f) - this.K);
                if (k0Var.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((w8 / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f11) + i9);
                    this.k0.draw(canvas);
                    canvas.restore();
                }
            } else {
                drVar = drVar2;
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                h hVar = this.l0.n2;
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
                            pf.o1 o1Var = hVar.p;
                            if (o1Var != null) {
                                o1Var.run();
                            }
                        }
                        hVar.h = currentTimeMillis;
                    }
                } else {
                    hVar.h = currentTimeMillis;
                }
                float f25 = hVar.g;
                if (f25 <= 1.0f) {
                    int i11 = hVar.f;
                    matrix.setTranslate(((((r10 * 2) + i11) * f25) - hVar.e) - tVar.getX(), 0.0f);
                    hVar.b.setLocalMatrix(matrix);
                    hVar.d.setLocalMatrix(matrix);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(oVar.K, oVar.J, oVar.getMeasuredWidth() - oVar.K, oVar.getMeasuredHeight() - oVar.J);
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
            drVar = drVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + tVar.l0) - this.J);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.K);
        ImageView imageView = tVar.t0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.t0.setScaleX(oVar.d.getScaleX());
            tVar.t0.setScaleY(oVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.J) - AndroidUtilities.dp(80.0f);
        if (tVar.w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((tVar.b || tVar.r) && !o50.B3 && !o50.C3) {
                measuredHeight = j3.r0.C(1.0f, k0Var.S, AndroidUtilities.dp(90.0f) * k0Var.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(tVar.y);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z11 = tVar.o0;
        if (!z11 && tVar.p0 == f13) {
            return;
        }
        if (z11) {
            float f27 = tVar.p0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                tVar.p0 = f28;
                if (f28 > 1.0f) {
                    tVar.p0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = tVar.p0;
                if (this.U == null) {
                    float f30 = this.c0;
                    float f31 = this.W;
                    f14 = (tVar.s0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = tVar.s0;
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
                    dr drVar3 = drVar;
                    drVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    drVar3.draw(canvas);
                    canvas.restore();
                    float f33 = f15 * k0Var.c;
                    if (f33 <= 0.0f || tVar.w == call.videoNotAvailableParticipant) {
                        return;
                    }
                    textPaint.setAlpha((int) (f33 * 255.0f));
                    canvas.drawText(this.m0, (dp4 / 2.0f) + (measuredWidth2 - (this.n0 / 2.0f)), f32 + AndroidUtilities.dp(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z11) {
            float f34 = tVar.p0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                tVar.p0 = f35;
                if (f35 < 0.0f) {
                    tVar.p0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = tVar.p0;
        if (this.U == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.r2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.o0;
        if (!tVar.f0 || view != tVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = tVar.a0;
        canvas.scale(f10, f10, tVar.b0, tVar.c0);
        canvas.translate(tVar.d0, tVar.e0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.r2
    public final void e() {
        super.e();
        t tVar = this.o0;
        o oVar = tVar.a;
        ImageView imageView = tVar.t0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        tVar.t0.getLayoutParams().width = oVar.d.getMeasuredWidth();
        tVar.t0.getLayoutParams().height = oVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        t tVar = this.o0;
        tVar.M = true;
        tVar.invalidate();
        tVar.M = false;
    }

    @Override // org.telegram.ui.Components.voip.r2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.o0;
        o oVar = tVar.a;
        boolean z11 = tVar.v;
        q2 q2Var = this.d;
        if (z11 && tVar.N && q2Var.rotatedFrameHeight != 0 && q2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.T = 1;
            } else if (tVar.b) {
                oVar.T = 1;
            } else if (this.e0.b) {
                oVar.T = 0;
            } else if (tVar.w.presentation) {
                oVar.T = 1;
            } else {
                oVar.T = 2;
            }
            tVar.N = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        int i14 = q2Var.rotatedFrameHeight;
        if (i14 == 0 || (i13 = q2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i13, i14, this.d0);
    }

    @Override // org.telegram.ui.Components.voip.r2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.o0.requestLayout();
        super.requestLayout();
    }
}
