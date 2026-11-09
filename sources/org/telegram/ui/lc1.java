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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lc1 implements hf0 {
    public final org.telegram.ui.Cells.q1 a;
    public final org.telegram.ui.Components.qj0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.ci i;
    public final org.telegram.ui.ActionBar.g6 j;
    public float k;
    public float l;

    public lc1(org.telegram.ui.Cells.q1 q1Var, sj sjVar, org.telegram.ui.Components.qj0 qj0Var, org.telegram.ui.Components.ci ciVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.j = g6Var;
        this.a = q1Var;
        this.i = ciVar;
        this.b = qj0Var;
        q1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = sjVar.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = q1Var.getMessageObject().k1;
        ((ArrayList) ciVar.c).add(this);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new bi.de(25, this, ciVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new kc1(this, q1Var, ciVar));
        if (q1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.qm0 seekBarWaveform = q1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.n;
            if (q1Var2 != null) {
                q1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.hf0
    public final void a(final Canvas canvas) {
        float y10;
        float x10;
        float f10;
        final float f11 = this.d;
        float f12 = f11 > 0.6f ? 1.0f : f11 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.ci ciVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.J) - ciVar.getX();
        final float y11 = recordCircle != null ? (recordCircle.getY() + recordCircle.K) - ciVar.getY() : 0.0f;
        org.telegram.ui.Cells.q1 q1Var = this.a;
        int i7 = q1Var.getMessageObject().k1;
        int i10 = this.h;
        org.telegram.ui.Components.qj0 qj0Var = this.b;
        if (i7 != i10) {
            x10 = this.k;
            y10 = this.l;
        } else {
            y10 = (qj0Var.getY() + (q1Var.getY() + q1Var.getRadialProgress().a.centerY())) - ciVar.getY();
            x10 = (qj0Var.getX() + (q1Var.getX() + q1Var.getRadialProgress().a.centerX())) - ciVar.getX();
        }
        this.k = x10;
        this.l = y10;
        float interpolation = org.telegram.ui.Components.xq.f.getInterpolation(f11);
        float interpolation2 = org.telegram.ui.Components.xq.h.getInterpolation(f11);
        final float f13 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y11 * f14);
        float height = q1Var.getRadialProgress().a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.c * f14);
        qj0Var.getY();
        ciVar.getY();
        qj0Var.getMeasuredHeight();
        if (ciVar.getMeasuredHeight() > 0) {
            ciVar.getMeasuredHeight();
        }
        int i11 = q1Var.getRadialProgress().p;
        int i12 = org.telegram.ui.ActionBar.l6.Rf;
        org.telegram.ui.ActionBar.g6 g6Var = this.j;
        float f17 = f12;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i12, g6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f18 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        Paint paint = this.e;
        paint.setColor(f18);
        if (recordCircle != null) {
            float f19 = 1.0f - f17;
            org.telegram.ui.Components.r9 r9Var = recordCircle.h;
            org.telegram.ui.Components.r9 r9Var2 = recordCircle.n;
            f10 = x11;
            float interpolation3 = org.telegram.ui.Components.xq.g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f20 = chatActivityEnterView.j4;
            float f21 = f20 > 0.7f ? 1.0f : f20 / 0.7f;
            canvas.save();
            float f22 = ((r9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.h4 * f21 * interpolation3 * f19;
            canvas.scale(f22, f22, f13, f15);
            r9Var2.a(f13, f15, canvas, r9Var2.d);
            canvas.restore();
            float f23 = ((r9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.h4 * f21 * interpolation3 * f19;
            canvas.save();
            canvas.scale(f23, f23, f13, f15);
            r9Var.a(f13, f15, canvas, r9Var.d);
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
        q1Var.B1(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.jc1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f26;
                Drawable drawable;
                lc1 lc1Var = lc1.this;
                RadialProgress2 radialProgress = lc1Var.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = lc1Var.g;
                if (recordCircle2 != null) {
                    int i13 = (int) f25;
                    int i14 = (int) y11;
                    float f33 = 1.0f - f11;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z9 = chatActivityEnterView2.s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable2 = null;
                    if (z9) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.c1 ? chatActivityEnterView2.Q3 : chatActivityEnterView2.P3;
                        }
                        drawable = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f26 = f33;
                        rect.set(org.telegram.ui.Cells.f1.z(2, i13, drawable), org.telegram.ui.Cells.f1.y(2, i14, drawable), org.telegram.ui.Cells.f1.w(2, i13, drawable), org.telegram.ui.Cells.f1.f(2, i14, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.ui.Cells.f1.z(2, i13, drawable2), org.telegram.ui.Cells.f1.y(2, i14, drawable2), org.telegram.ui.Cells.f1.w(2, i13, drawable2), org.telegram.ui.Cells.f1.f(2, i14, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f26 = f33;
                        drawable = chatActivityEnterView2.c1 ? chatActivityEnterView2.Q3 : chatActivityEnterView2.P3;
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
