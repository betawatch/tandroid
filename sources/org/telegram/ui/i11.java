package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i11 extends Dialog {
    public TextView D;
    public final org.telegram.ui.Components.us E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.p6 L;
    public org.telegram.messenger.jj M;
    public g11 N;
    public org.telegram.ui.Cells.q1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.x7 V;
    public boolean W;
    public ue X;
    public a3.i0 Y;
    public final c11 Z;
    public final Context a;
    public float a0;
    public final l0 b;
    public boolean b0;
    public final fg.i c;
    public org.telegram.ui.ActionBar.x1 c0;
    public org.telegram.ui.Components.h01 d;
    public ValueAnimator d0;
    public i0.c e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public org.telegram.ui.Components.u61 x;
    public vh.p2 y;

    public i11(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.c.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i10 = 0;
        this.Z = new c11(this, i10);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        org.telegram.messenger.i0.S(getWindow());
        l0 l0Var = new l0(this, activity, 24);
        this.b = l0Var;
        l0Var.setOnClickListener(new d11(this, i10));
        fg.i iVar = new fg.i(this, activity);
        this.c = iVar;
        iVar.setClipToPadding(false);
        l0Var.addView(iVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        e11 e11Var = new e11(this, i10);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(l0Var, e11Var);
        if (org.telegram.messenger.tz.s0) {
            this.E = new org.telegram.ui.Components.us();
        }
    }

    public final void c(boolean z10, c11 c11Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(9, this, z10));
        this.d0.addListener(new androidx.fragment.app.g(this, z10, c11Var, 10));
        long j10 = (z10 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.d0.setDuration(j10);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new u01(this, 3));
        this.e0.addListener(new org.telegram.ui.Components.ha0(23, this, z10));
        this.e0.setDuration((long) (j10 * 1.5f));
        this.e0.setInterpolator(grVar);
        this.e0.start();
    }

    public final void d() {
        if (this.H) {
            return;
        }
        l0 l0Var = this.b;
        if (l0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.O;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            float f7 = iArr[0] - this.e.a;
            int width = l0Var.getWidth();
            i0.c cVar = this.e;
            this.F = f7 - ((((width - cVar.a) - cVar.c) - this.O.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = l0Var.getHeight();
            i0.c cVar2 = this.e;
            this.G = org.telegram.messenger.m5.y(((height - cVar2.b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, f10);
            if (!this.J) {
                this.J = true;
                float i10 = (Utilities.i((this.O.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.O.getHeight()) / 2.0f);
                this.I = i10;
                if (this.S) {
                    this.I = 0.0f;
                } else {
                    this.I = org.telegram.messenger.i0.T1(0.0f, i10, 0.78f);
                }
            }
            e();
        } else {
            this.G = 0.0f;
            this.F = 0.0f;
        }
        this.H = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        g11 g11Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.c0;
        if (x1Var != null) {
            x1Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        vh.p2 p2Var = this.y;
        if (p2Var != null) {
            p2Var.e(true);
        }
        org.telegram.ui.Components.u61 u61Var = this.x;
        if (u61Var != null) {
            u61Var.g0();
            this.x.m0();
            this.x = null;
        }
        if (!this.S && (g11Var = this.N) != null && g11Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.qn0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new c11(this, 3));
        l0 l0Var = this.b;
        l0Var.invalidate();
        a3.i0 i0Var = this.Y;
        if (i0Var != null) {
            org.telegram.ui.Cells.q1 q1Var2 = this.O;
            if (q1Var2 != null) {
                q1Var2.mb = true;
            }
            org.telegram.messenger.i0.g3(i0Var);
            this.Y = null;
            org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01(this.a, null);
            this.d = h01Var;
            l0Var.addView(h01Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
            org.telegram.ui.Components.h01 h01Var2 = this.d;
            g11 g11Var2 = this.N;
            c11 c11Var = new c11(this, 1);
            org.telegram.ui.Components.f01 f01Var = h01Var2.a;
            if (f01Var != null) {
                f01Var.b(1.5f, g11Var2, c11Var);
                Choreographer.getInstance().postFrameCallback(h01Var2.b);
            } else {
                org.telegram.ui.Components.g01 g01Var = new org.telegram.ui.Components.g01(g11Var2, c11Var);
                g01Var.g = 1.5f;
                h01Var2.c.add(g01Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.us usVar = this.E;
        if (usVar != null) {
            PowerManager.WakeLock wakeLock = usVar.h;
            SensorManager sensorManager = usVar.a;
            if (usVar.n) {
                Sensor sensor = usVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(usVar, sensor);
                }
                Sensor sensor2 = usVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(usVar, sensor2);
                }
                Sensor sensor3 = usVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(usVar, sensor3);
                }
                sensorManager.unregisterListener(usVar, usVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                usVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(org.telegram.messenger.i0.T1(this.F, 0.0f, this.s));
        this.N.setTranslationY(org.telegram.messenger.i0.T1(this.G, this.I, this.s));
        vh.p2 p2Var = this.y;
        if (p2Var != null) {
            p2Var.setTranslationX(org.telegram.messenger.i0.T1(this.F, 0.0f, this.s));
            this.y.setTranslationY(org.telegram.messenger.i0.T1(this.G, this.I, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        org.telegram.messenger.jj jjVar;
        org.telegram.ui.ActionBar.x1 x1Var = this.c0;
        if (x1Var != null) {
            x1Var.dismiss();
            this.c0 = null;
            return;
        }
        if (this.b0 || (jjVar = this.M) == null || jjVar.P3()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.L);
        String L0 = org.telegram.messenger.cd.L0(this.S ? 2131743618 : 2131743543, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
        x1Var2.R = L0;
        x1Var2.T = org.telegram.messenger.cd.L0(this.S ? 2131743619 : 2131743544, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new e11(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751599, null), new e11(this, 2));
        this.c0 = x1Var2;
        x1Var2.show();
        TextView textView = (TextView) this.c0.d(-2);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        l0 l0Var = this.b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.zs.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        boolean z10 = org.telegram.messenger.v2.a;
        attributes.flags = i10 | (-2013060864);
        org.telegram.messenger.i0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.i0.n3(l0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.O;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.i0.l2(new f11(0, this, q1Var), 14.0f);
            this.W = true;
            c(true, null);
            ue ueVar = this.X;
            if (ueVar != null) {
                org.telegram.messenger.i0.g3(ueVar);
                this.X = null;
            }
            org.telegram.ui.Components.us usVar = this.E;
            if (usVar != null) {
                PowerManager.WakeLock wakeLock = usVar.h;
                SensorManager sensorManager = usVar.a;
                if (usVar.n) {
                    return;
                }
                Sensor sensor = usVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(usVar, sensor, 30000);
                }
                Sensor sensor2 = usVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(usVar, sensor2, 30000);
                }
                Sensor sensor3 = usVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(usVar, sensor3, 30000);
                }
                sensorManager.registerListener(usVar, usVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                usVar.n = true;
            }
        }
    }
}
