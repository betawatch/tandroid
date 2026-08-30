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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class di1 implements sh0 {
    public final org.telegram.ui.Cells.t1 a;
    public final org.telegram.ui.Components.sl0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.ki i;
    public final org.telegram.ui.ActionBar.f6 j;
    public float k;
    public float l;

    public di1(org.telegram.ui.Cells.t1 t1Var, jk jkVar, org.telegram.ui.Components.sl0 sl0Var, org.telegram.ui.Components.ki kiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.j = f6Var;
        this.a = t1Var;
        this.i = kiVar;
        this.b = sl0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = jkVar.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.I;
            recordCircle.J = true;
            recordCircle.K = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) kiVar.c).add(this);
        kiVar.a();
        ((ViewGroup) kiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ag.a(24, this, kiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new ci1(this, t1Var, kiVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.mo0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
            if (t1Var2 != null) {
                t1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.sh0
    public final void a(final Canvas canvas) {
        float y10;
        float x10;
        float f10;
        final float f11 = this.d;
        float f12 = f11 > 0.6f ? 1.0f : f11 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.ki kiVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.G) - kiVar.getX();
        final float y11 = recordCircle == null ? 0.0f : (recordCircle.getY() + recordCircle.H) - kiVar.getY();
        org.telegram.ui.Cells.t1 t1Var = this.a;
        int i10 = t1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.sl0 sl0Var = this.b;
        if (i10 != i11) {
            x10 = this.k;
            y10 = this.l;
        } else {
            y10 = (sl0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().a.centerY())) - kiVar.getY();
            x10 = (sl0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().a.centerX())) - kiVar.getX();
        }
        this.k = x10;
        this.l = y10;
        float interpolation = org.telegram.ui.Components.nr.f.getInterpolation(f11);
        float interpolation2 = org.telegram.ui.Components.nr.h.getInterpolation(f11);
        final float f13 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y11 * f14);
        float height = t1Var.getRadialProgress().a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.c * f14);
        sl0Var.getY();
        kiVar.getY();
        sl0Var.getMeasuredHeight();
        if (kiVar.getMeasuredHeight() > 0) {
            kiVar.getMeasuredHeight();
        }
        int i12 = t1Var.getRadialProgress().p;
        int i13 = org.telegram.ui.ActionBar.j6.cf;
        org.telegram.ui.ActionBar.f6 f6Var = this.j;
        float f17 = f12;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.u9 u9Var = recordCircle.h;
            org.telegram.ui.Components.u9 u9Var2 = recordCircle.n;
            f10 = x11;
            float interpolation3 = org.telegram.ui.Components.nr.g.getInterpolation(recordCircle.E);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f4;
            float f20 = f19 > 0.7f ? 1.0f : f19 / 0.7f;
            canvas.save();
            float f21 = ((u9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.d4 * f20 * interpolation3 * f18;
            canvas.scale(f21, f21, f13, f15);
            u9Var2.a(f13, f15, canvas, u9Var2.d);
            canvas.restore();
            float f22 = ((u9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.d4 * f20 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f22, f22, f13, f15);
            u9Var.a(f13, f15, canvas, u9Var.d);
            canvas.restore();
        } else {
            f10 = x11;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f23 = f16 / height;
        canvas.scale(f23, f23, f13, f15);
        final float centerX = f13 - t1Var.getRadialProgress().a.centerX();
        final float centerY = f15 - t1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        t1Var.getRadialProgress().E = interpolation;
        t1Var.getRadialProgress().B = false;
        final float f24 = f10;
        t1Var.q2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.bi1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f25;
                Drawable drawable;
                di1 di1Var = di1.this;
                RadialProgress2 radialProgress = di1Var.a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f26 = centerX;
                float f27 = centerY;
                canvas3.translate(-f26, -f27);
                float f28 = f23;
                float f29 = 1.0f / f28;
                float f30 = f13;
                float f31 = f15;
                canvas3.scale(f29, f29, f30, f31);
                ChatActivityEnterView.RecordCircle recordCircle2 = di1Var.g;
                if (recordCircle2 != null) {
                    int i14 = (int) f24;
                    int i15 = (int) y11;
                    float f32 = 1.0f - f11;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z4 = chatActivityEnterView2.o4;
                    Rect rect = chatActivityEnterView2.P3;
                    Drawable drawable2 = null;
                    if (z4) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.Z0 ? chatActivityEnterView2.M3 : chatActivityEnterView2.L3;
                        }
                        drawable = chatActivityEnterView2.N3;
                        canvas2 = canvas3;
                        f25 = f32;
                        rect.set(b.u(2, i14, drawable), b.f(2, i15, drawable), b.A(2, i14, drawable), b.y(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(b.u(2, i14, drawable2), b.f(2, i15, drawable2), b.A(2, i14, drawable2), b.y(2, i15, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f25 = f32;
                        drawable = chatActivityEnterView2.Z0 ? chatActivityEnterView2.M3 : chatActivityEnterView2.L3;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable3 = drawable;
                    Drawable drawable4 = drawable2;
                    drawable3.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable3, drawable4, recordCircle2.f, (int) (255.0f * f25));
                }
                canvas3.scale(f28, f28, f30, f31);
                canvas3.translate(f26, f27);
            }
        });
        t1Var.getRadialProgress().B = true;
        t1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
