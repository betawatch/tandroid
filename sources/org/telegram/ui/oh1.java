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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class oh1 implements nh0 {
    public final org.telegram.ui.Cells.s1 a;
    public final org.telegram.ui.Components.zk0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.fi i;
    public final org.telegram.ui.ActionBar.c6 j;
    public float k;
    public float l;

    public oh1(org.telegram.ui.Cells.s1 s1Var, ck ckVar, org.telegram.ui.Components.zk0 zk0Var, org.telegram.ui.Components.fi fiVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.j = c6Var;
        this.a = s1Var;
        this.i = fiVar;
        this.b = zk0Var;
        s1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = ckVar.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.H;
            recordCircle.I = true;
            recordCircle.J = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = s1Var.getMessageObject().stableId;
        ((ArrayList) fiVar.c).add(this);
        fiVar.a();
        ((ViewGroup) fiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ag.t2(22, this, fiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new nh1(this, s1Var, fiVar));
        if (s1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.sn0 seekBarWaveform = s1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
            if (s1Var2 != null) {
                s1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.nh0
    public final void a(final Canvas canvas) {
        float y10;
        float x8;
        float f10;
        final float f11 = this.d;
        float f12 = f11 > 0.6f ? 1.0f : f11 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.fi fiVar = this.i;
        float x10 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.F) - fiVar.getX();
        final float y11 = recordCircle == null ? 0.0f : (recordCircle.getY() + recordCircle.G) - fiVar.getY();
        org.telegram.ui.Cells.s1 s1Var = this.a;
        int i10 = s1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.zk0 zk0Var = this.b;
        if (i10 != i11) {
            x8 = this.k;
            y10 = this.l;
        } else {
            y10 = (zk0Var.getY() + (s1Var.getY() + s1Var.getRadialProgress().a.centerY())) - fiVar.getY();
            x8 = (zk0Var.getX() + (s1Var.getX() + s1Var.getRadialProgress().a.centerX())) - fiVar.getX();
        }
        this.k = x8;
        this.l = y10;
        float interpolation = org.telegram.ui.Components.er.f.getInterpolation(f11);
        float interpolation2 = org.telegram.ui.Components.er.h.getInterpolation(f11);
        final float f13 = (x8 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y11 * f14);
        float height = s1Var.getRadialProgress().a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.c * f14);
        zk0Var.getY();
        fiVar.getY();
        zk0Var.getMeasuredHeight();
        if (fiVar.getMeasuredHeight() > 0) {
            fiVar.getMeasuredHeight();
        }
        int i12 = s1Var.getRadialProgress().p;
        int i13 = org.telegram.ui.ActionBar.g6.cf;
        org.telegram.ui.ActionBar.c6 c6Var = this.j;
        float f17 = f12;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.b.d(interpolation, v02, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.s9 s9Var = recordCircle.h;
            org.telegram.ui.Components.s9 s9Var2 = recordCircle.n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.er.g.getInterpolation(recordCircle.D);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.e4;
            float f20 = f19 > 0.7f ? 1.0f : f19 / 0.7f;
            canvas.save();
            float f21 = ((s9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.c4 * f20 * interpolation3 * f18;
            canvas.scale(f21, f21, f13, f15);
            s9Var2.a(f13, f15, canvas, s9Var2.d);
            canvas.restore();
            float f22 = ((s9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.c4 * f20 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f22, f22, f13, f15);
            s9Var.a(f13, f15, canvas, s9Var.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f23 = f16 / height;
        canvas.scale(f23, f23, f13, f15);
        final float centerX = f13 - s1Var.getRadialProgress().a.centerX();
        final float centerY = f15 - s1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        s1Var.getRadialProgress().E = interpolation;
        s1Var.getRadialProgress().B = false;
        final float f24 = f10;
        s1Var.p2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.mh1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f25;
                Drawable drawable;
                oh1 oh1Var = oh1.this;
                RadialProgress2 radialProgress = oh1Var.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = oh1Var.g;
                if (recordCircle2 != null) {
                    int i14 = (int) f24;
                    int i15 = (int) y11;
                    float f32 = 1.0f - f11;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.n4;
                    Rect rect = chatActivityEnterView2.O3;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
                        }
                        drawable = chatActivityEnterView2.M3;
                        canvas2 = canvas3;
                        f25 = f32;
                        rect.set(org.telegram.messenger.rl.v(2, i14, drawable), org.telegram.messenger.rl.e(2, i15, drawable), org.telegram.messenger.rl.A(2, i14, drawable), org.telegram.messenger.rl.y(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.messenger.rl.v(2, i14, drawable2), org.telegram.messenger.rl.e(2, i15, drawable2), org.telegram.messenger.rl.A(2, i14, drawable2), org.telegram.messenger.rl.y(2, i15, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f25 = f32;
                        drawable = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
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
        s1Var.getRadialProgress().B = true;
        s1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
