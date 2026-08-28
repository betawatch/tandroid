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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ph1 implements lh0 {
    public final org.telegram.ui.Cells.t1 a;
    public final org.telegram.ui.Components.wk0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.ji i;
    public final org.telegram.ui.ActionBar.b6 j;
    public float k;
    public float l;

    public ph1(org.telegram.ui.Cells.t1 t1Var, ak akVar, org.telegram.ui.Components.wk0 wk0Var, org.telegram.ui.Components.ji jiVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.j = b6Var;
        this.a = t1Var;
        this.i = jiVar;
        this.b = wk0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = akVar.getRecordCircle();
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
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) jiVar.c).add(this);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new f2.g(21, this, jiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new oh1(this, t1Var, jiVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.rn0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
            if (t1Var2 != null) {
                t1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.lh0
    public final void a(final Canvas canvas) {
        float y10;
        float x10;
        float f10;
        final float f11 = this.d;
        float f12 = f11 > 0.6f ? 1.0f : f11 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.ji jiVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.F) - jiVar.getX();
        final float y11 = recordCircle == null ? 0.0f : (recordCircle.getY() + recordCircle.G) - jiVar.getY();
        org.telegram.ui.Cells.t1 t1Var = this.a;
        int i9 = t1Var.getMessageObject().stableId;
        int i10 = this.h;
        org.telegram.ui.Components.wk0 wk0Var = this.b;
        if (i9 != i10) {
            x10 = this.k;
            y10 = this.l;
        } else {
            y10 = (wk0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().a.centerY())) - jiVar.getY();
            x10 = (wk0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().a.centerX())) - jiVar.getX();
        }
        this.k = x10;
        this.l = y10;
        float interpolation = org.telegram.ui.Components.gr.f.getInterpolation(f11);
        float interpolation2 = org.telegram.ui.Components.gr.h.getInterpolation(f11);
        final float f13 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y11 * f14);
        float height = t1Var.getRadialProgress().a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.c * f14);
        wk0Var.getY();
        jiVar.getY();
        wk0Var.getMeasuredHeight();
        if (jiVar.getMeasuredHeight() > 0) {
            jiVar.getMeasuredHeight();
        }
        int i11 = t1Var.getRadialProgress().p;
        int i12 = org.telegram.ui.ActionBar.f6.cf;
        org.telegram.ui.ActionBar.b6 b6Var = this.j;
        float f17 = f12;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.t9 t9Var = recordCircle.h;
            org.telegram.ui.Components.t9 t9Var2 = recordCircle.n;
            f10 = x11;
            float interpolation3 = org.telegram.ui.Components.gr.g.getInterpolation(recordCircle.D);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.e4;
            float f20 = f19 > 0.7f ? 1.0f : f19 / 0.7f;
            canvas.save();
            float f21 = ((t9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.c4 * f20 * interpolation3 * f18;
            canvas.scale(f21, f21, f13, f15);
            t9Var2.a(f13, f15, canvas, t9Var2.d);
            canvas.restore();
            float f22 = ((t9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.c4 * f20 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f22, f22, f13, f15);
            t9Var.a(f13, f15, canvas, t9Var.d);
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
        t1Var.q2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.nh1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f25;
                Drawable drawable;
                ph1 ph1Var = ph1.this;
                RadialProgress2 radialProgress = ph1Var.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = ph1Var.g;
                if (recordCircle2 != null) {
                    int i13 = (int) f24;
                    int i14 = (int) y11;
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
                        rect.set(org.telegram.messenger.ll.x(2, i13, drawable), org.telegram.messenger.ll.e(2, i14, drawable), org.telegram.messenger.ll.B(2, i13, drawable), org.telegram.messenger.ll.z(2, i14, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.messenger.ll.x(2, i13, drawable2), org.telegram.messenger.ll.e(2, i14, drawable2), org.telegram.messenger.ll.B(2, i13, drawable2), org.telegram.messenger.ll.z(2, i14, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f25 = f32;
                        drawable = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
                        rect.set(i13 - AndroidUtilities.dp(12.0f), i14 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(12.0f) + i14);
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
