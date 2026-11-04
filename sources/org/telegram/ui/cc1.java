package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cc1 implements ze0 {
    public final org.telegram.ui.Cells.q1 a;
    public final org.telegram.ui.Components.tj0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.ai i;
    public final org.telegram.ui.ActionBar.e6 j;
    public float k;
    public float l;

    public cc1(org.telegram.ui.Cells.q1 q1Var, mj mjVar, org.telegram.ui.Components.tj0 tj0Var, org.telegram.ui.Components.ai aiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.j = e6Var;
        this.a = q1Var;
        this.i = aiVar;
        this.b = tj0Var;
        q1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = mjVar.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.M;
            recordCircle.N = true;
            recordCircle.O = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = q1Var.getMessageObject().k1;
        ((ArrayList) aiVar.c).add(this);
        aiVar.a();
        ((ViewGroup) aiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ci.uc(25, this, aiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new bc1(this, q1Var, aiVar));
        if (q1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.sm0 seekBarWaveform = q1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.n;
            if (q1Var2 != null) {
                q1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ze0
    public final void a(final Canvas canvas) {
        float y9;
        float x10;
        float f10;
        final float f11 = this.d;
        float f12 = f11 > 0.6f ? 1.0f : f11 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.ai aiVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.K) - aiVar.getX();
        final float y10 = recordCircle != null ? (recordCircle.getY() + recordCircle.L) - aiVar.getY() : 0.0f;
        org.telegram.ui.Cells.q1 q1Var = this.a;
        int i3 = q1Var.getMessageObject().k1;
        int i10 = this.h;
        org.telegram.ui.Components.tj0 tj0Var = this.b;
        if (i3 != i10) {
            x10 = this.k;
            y9 = this.l;
        } else {
            y9 = (tj0Var.getY() + (q1Var.getY() + q1Var.getRadialProgress().a.centerY())) - aiVar.getY();
            x10 = (tj0Var.getX() + (q1Var.getX() + q1Var.getRadialProgress().a.centerX())) - aiVar.getX();
        }
        this.k = x10;
        this.l = y9;
        float interpolation = org.telegram.ui.Components.xq.f.getInterpolation(f11);
        float interpolation2 = org.telegram.ui.Components.xq.h.getInterpolation(f11);
        final float f13 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f14 = 1.0f - interpolation;
        final float f15 = (y9 * interpolation) + (y10 * f14);
        float height = q1Var.getRadialProgress().a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.c * f14);
        tj0Var.getY();
        aiVar.getY();
        tj0Var.getMeasuredHeight();
        if (aiVar.getMeasuredHeight() > 0) {
            aiVar.getMeasuredHeight();
        }
        int i11 = q1Var.getRadialProgress().p;
        int i12 = org.telegram.ui.ActionBar.k6.Rf;
        org.telegram.ui.ActionBar.e6 e6Var = this.j;
        float f17 = f12;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f18 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        Paint paint = this.e;
        paint.setColor(f18);
        if (recordCircle != null) {
            float f19 = 1.0f - f17;
            org.telegram.ui.Components.q9 q9Var = recordCircle.h;
            org.telegram.ui.Components.q9 q9Var2 = recordCircle.n;
            f10 = x11;
            float interpolation3 = org.telegram.ui.Components.xq.g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f20 = chatActivityEnterView.k4;
            float f21 = f20 > 0.7f ? 1.0f : f20 / 0.7f;
            canvas.save();
            float f22 = ((q9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.i4 * f21 * interpolation3 * f19;
            canvas.scale(f22, f22, f13, f15);
            q9Var2.a(f13, f15, canvas, q9Var2.d);
            canvas.restore();
            float f23 = ((q9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.i4 * f21 * interpolation3 * f19;
            canvas.save();
            canvas.scale(f23, f23, f13, f15);
            q9Var.a(f13, f15, canvas, q9Var.d);
            canvas.restore();
        } else {
            f10 = x11;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f24 = f16 / height;
        canvas.scale(f24, f24, f13, f15);
        final float centerX = f13 - q1Var.getRadialProgress().a.centerX();
        final float centerY = f15 - q1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        q1Var.getRadialProgress().E = interpolation;
        q1Var.getRadialProgress().B = false;
        final float f25 = f10;
        q1Var.B1(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.ac1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f26;
                Drawable drawable;
                cc1 cc1Var = cc1.this;
                RadialProgress2 radialProgress = cc1Var.a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f27 = centerX;
                float f28 = centerY;
                canvas3.translate(-f27, -f28);
                float f29 = f24;
                float f30 = 1.0f / f29;
                float f31 = f13;
                float f32 = f15;
                canvas3.scale(f30, f30, f31, f32);
                ChatActivityEnterView.RecordCircle recordCircle2 = cc1Var.g;
                if (recordCircle2 != null) {
                    int i13 = (int) f25;
                    int i14 = (int) y10;
                    float f33 = 1.0f - f11;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.t4;
                    Rect rect = chatActivityEnterView2.U3;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.d1 ? chatActivityEnterView2.R3 : chatActivityEnterView2.Q3;
                        }
                        drawable = chatActivityEnterView2.S3;
                        canvas2 = canvas3;
                        f26 = f33;
                        rect.set(org.telegram.ui.Cells.f1.C(2, i13, drawable), org.telegram.ui.Cells.f1.B(2, i14, drawable), org.telegram.ui.Cells.f1.z(2, i13, drawable), org.telegram.ui.Cells.f1.i(2, i14, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.ui.Cells.f1.C(2, i13, drawable2), org.telegram.ui.Cells.f1.B(2, i14, drawable2), org.telegram.ui.Cells.f1.z(2, i13, drawable2), org.telegram.ui.Cells.f1.i(2, i14, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f26 = f33;
                        drawable = chatActivityEnterView2.d1 ? chatActivityEnterView2.R3 : chatActivityEnterView2.Q3;
                        rect.set(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + i13, org.telegram.messenger.g0.L(12.0f) + i14);
                    }
                    Drawable drawable3 = drawable;
                    Drawable drawable4 = drawable2;
                    drawable3.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable3, drawable4, recordCircle2.f, (int) (255.0f * f26));
                }
                canvas3.scale(f29, f29, f31, f32);
                canvas3.translate(f27, f28);
            }
        });
        q1Var.getRadialProgress().B = true;
        q1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
