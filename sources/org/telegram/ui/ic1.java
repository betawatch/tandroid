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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ic1 implements hf0 {
    public final org.telegram.ui.Cells.r1 a;
    public final org.telegram.ui.Components.ek0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.si i;
    public final org.telegram.ui.ActionBar.i6 j;
    public float k;
    public float l;

    public ic1(org.telegram.ui.Cells.r1 r1Var, rj rjVar, org.telegram.ui.Components.ek0 ek0Var, org.telegram.ui.Components.si siVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.j = i6Var;
        this.a = r1Var;
        this.i = siVar;
        this.b = ek0Var;
        r1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = rjVar.getRecordCircle();
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
        this.h = r1Var.getMessageObject().m1;
        ((ArrayList) siVar.c).add(this);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ch.w(24, this, siVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new hc1(this, r1Var, siVar));
        if (r1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.dn0 seekBarWaveform = r1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.r1 r1Var2 = seekBarWaveform.n;
            if (r1Var2 != null) {
                r1Var2.invalidate();
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
        org.telegram.ui.Components.si siVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.K) - siVar.getX();
        final float y11 = recordCircle != null ? (recordCircle.getY() + recordCircle.L) - siVar.getY() : 0.0f;
        org.telegram.ui.Cells.r1 r1Var = this.a;
        int i7 = r1Var.getMessageObject().m1;
        int i10 = this.h;
        org.telegram.ui.Components.ek0 ek0Var = this.b;
        if (i7 != i10) {
            x10 = this.k;
            y10 = this.l;
        } else {
            y10 = (ek0Var.getY() + (r1Var.getY() + r1Var.getRadialProgress().a.centerY())) - siVar.getY();
            x10 = (ek0Var.getX() + (r1Var.getX() + r1Var.getRadialProgress().a.centerX())) - siVar.getX();
        }
        this.k = x10;
        this.l = y10;
        float interpolation = org.telegram.ui.Components.kr.f.getInterpolation(f11);
        float interpolation2 = org.telegram.ui.Components.kr.h.getInterpolation(f11);
        final float f13 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y11 * f14);
        float height = r1Var.getRadialProgress().a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.c * f14);
        ek0Var.getY();
        siVar.getY();
        ek0Var.getMeasuredHeight();
        if (siVar.getMeasuredHeight() > 0) {
            siVar.getMeasuredHeight();
        }
        int i11 = r1Var.getRadialProgress().p;
        int i12 = org.telegram.ui.ActionBar.n6.Uf;
        org.telegram.ui.ActionBar.i6 i6Var = this.j;
        float f17 = f12;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f18 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        Paint paint = this.e;
        paint.setColor(f18);
        if (recordCircle != null) {
            float f19 = 1.0f - f17;
            org.telegram.ui.Components.v9 v9Var = recordCircle.h;
            org.telegram.ui.Components.v9 v9Var2 = recordCircle.n;
            f10 = x11;
            float interpolation3 = org.telegram.ui.Components.kr.g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f20 = chatActivityEnterView.Z4;
            float f21 = f20 > 0.7f ? 1.0f : f20 / 0.7f;
            canvas.save();
            float f22 = ((v9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.X4 * f21 * interpolation3 * f19;
            canvas.scale(f22, f22, f13, f15);
            v9Var2.a(f13, f15, canvas, v9Var2.d);
            canvas.restore();
            float f23 = ((v9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.X4 * f21 * interpolation3 * f19;
            canvas.save();
            canvas.scale(f23, f23, f13, f15);
            v9Var.a(f13, f15, canvas, v9Var.d);
            canvas.restore();
        } else {
            f10 = x11;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f24 = f16 / height;
        canvas.scale(f24, f24, f13, f15);
        final float centerX = f13 - r1Var.getRadialProgress().a.centerX();
        final float centerY = f15 - r1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        r1Var.getRadialProgress().E = interpolation;
        r1Var.getRadialProgress().B = false;
        final float f25 = f10;
        r1Var.C1(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.gc1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f26;
                Drawable drawable;
                ic1 ic1Var = ic1.this;
                RadialProgress2 radialProgress = ic1Var.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = ic1Var.g;
                if (recordCircle2 != null) {
                    int i13 = (int) f25;
                    int i14 = (int) y11;
                    float f33 = 1.0f - f11;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.i5;
                    Rect rect = chatActivityEnterView2.J4;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.d1 ? chatActivityEnterView2.G4 : chatActivityEnterView2.F4;
                        }
                        drawable = chatActivityEnterView2.H4;
                        canvas2 = canvas3;
                        f26 = f33;
                        rect.set(org.telegram.ui.Cells.c0.C(2, i13, drawable), org.telegram.ui.Cells.c0.A(2, i14, drawable), org.telegram.ui.Cells.c0.y(2, i13, drawable), org.telegram.ui.Cells.c0.j(2, i14, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.ui.Cells.c0.C(2, i13, drawable2), org.telegram.ui.Cells.c0.A(2, i14, drawable2), org.telegram.ui.Cells.c0.y(2, i13, drawable2), org.telegram.ui.Cells.c0.j(2, i14, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f26 = f33;
                        drawable = chatActivityEnterView2.d1 ? chatActivityEnterView2.G4 : chatActivityEnterView2.F4;
                        rect.set(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + i13, org.telegram.messenger.g0.L(12.0f) + i14);
                    }
                    Drawable drawable3 = drawable;
                    Drawable drawable4 = drawable2;
                    drawable3.setBounds(rect);
                    float f34 = 1.0f;
                    float L = (recordCircle2.M - org.telegram.messenger.g0.L(19.0f)) / Math.max(1.0f, recordCircle2.r - org.telegram.messenger.g0.L(19.0f));
                    if (L < 0.0f) {
                        f34 = 0.0f;
                    } else if (L <= 1.0f) {
                        f34 = L;
                    }
                    recordCircle2.d0 = f34;
                    canvas3 = canvas2;
                    recordCircle2.c(canvas3, drawable3, drawable4, recordCircle2.f, (int) (255.0f * f26));
                }
                canvas3.scale(f29, f29, f31, f32);
                canvas3.translate(f27, f28);
            }
        });
        r1Var.getRadialProgress().B = true;
        r1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
