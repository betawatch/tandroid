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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.ps F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.e6 M;
    public org.telegram.messenger.gj N;
    public nz0 O;
    public org.telegram.ui.Cells.q1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.z7 W;
    public boolean X;
    public fe Y;
    public bi.m1 Z;
    public final Context a;
    public final kz0 a0;
    public final k0 b;
    public float b0;
    public final ai.j0 c;
    public boolean c0;
    public org.telegram.ui.Components.fz0 d;
    public org.telegram.ui.ActionBar.t1 d0;
    public i0.c e;
    public ValueAnimator e0;
    public Bitmap f;
    public ValueAnimator f0;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public org.telegram.ui.Components.u51 x;
    public hi.l3 y;

    public pz0(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.c.e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        int i7 = 0;
        this.a0 = new kz0(this, i7);
        this.b0 = 0.0f;
        this.c0 = false;
        this.a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.b = k0Var;
        k0Var.setOnClickListener(new lz0(this, i7));
        ai.j0 j0Var = new ai.j0(this, activity);
        this.c = j0Var;
        j0Var.setClipToPadding(false);
        k0Var.addView(j0Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        mz0 mz0Var = new mz0(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, mz0Var);
        if (org.telegram.messenger.gz.s0) {
            this.F = new org.telegram.ui.Components.ps();
        }
    }

    public final void c(boolean z10, kz0 kz0Var) {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(11, this, z10));
        this.e0.addListener(new androidx.fragment.app.g(this, z10, kz0Var, 13));
        long j3 = (z10 || this.Z != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.e0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.e0.setDuration(j3);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ez0(this, 3));
        this.f0.addListener(new z20(8, this, z10));
        this.f0.setDuration((long) (j3 * 1.5f));
        this.f0.setInterpolator(erVar);
        this.f0.start();
    }

    public final void d() {
        if (this.I) {
            return;
        }
        k0 k0Var = this.b;
        if (k0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.P;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            float f10 = iArr[0] - this.e.a;
            int width = k0Var.getWidth();
            i0.c cVar = this.e;
            this.G = f10 - ((((width - cVar.a) - cVar.c) - this.P.getWidth()) / 2.0f);
            float f11 = iArr[1] - this.e.b;
            int height = k0Var.getHeight();
            i0.c cVar2 = this.e;
            this.H = org.telegram.messenger.k5.y(((height - cVar2.b) - cVar2.d) - this.P.getHeight(), this.L, 2.0f, f11);
            if (!this.K) {
                this.K = true;
                float i7 = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.P.getHeight()) / 2.0f);
                this.J = i7;
                if (this.T) {
                    this.J = 0.0f;
                } else {
                    this.J = org.telegram.messenger.g0.T1(0.0f, i7, 0.78f);
                }
            }
            e();
        } else {
            this.H = 0.0f;
            this.G = 0.0f;
        }
        this.I = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        nz0 nz0Var;
        if (this.c0) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.d0 = null;
        }
        this.c0 = true;
        hi.l3 l3Var = this.y;
        if (l3Var != null) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.u51 u51Var = this.x;
        if (u51Var != null) {
            u51Var.g0();
            this.x.m0();
            this.x = null;
        }
        if (!this.T && (nz0Var = this.O) != null && nz0Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.tm0 seekBarWaveform = this.O.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
        this.I = false;
        d();
        c(false, new kz0(this, 3));
        k0 k0Var = this.b;
        k0Var.invalidate();
        bi.m1 m1Var = this.Z;
        if (m1Var != null) {
            org.telegram.ui.Cells.q1 q1Var2 = this.P;
            if (q1Var2 != null) {
                q1Var2.ob = true;
            }
            org.telegram.messenger.g0.h3(m1Var);
            this.Z = null;
            org.telegram.ui.Components.fz0 fz0Var = new org.telegram.ui.Components.fz0(this.a, null);
            this.d = fz0Var;
            k0Var.addView(fz0Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
            org.telegram.ui.Components.fz0 fz0Var2 = this.d;
            nz0 nz0Var2 = this.O;
            kz0 kz0Var = new kz0(this, 1);
            org.telegram.ui.Components.dz0 dz0Var = fz0Var2.a;
            if (dz0Var != null) {
                dz0Var.b(1.5f, nz0Var2, kz0Var);
                Choreographer.getInstance().postFrameCallback(fz0Var2.b);
            } else {
                org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0(nz0Var2, kz0Var);
                ez0Var.g = 1.5f;
                fz0Var2.c.add(ez0Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.ps psVar = this.F;
        if (psVar != null) {
            PowerManager.WakeLock wakeLock = psVar.h;
            SensorManager sensorManager = psVar.a;
            if (psVar.n) {
                Sensor sensor = psVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(psVar, sensor);
                }
                Sensor sensor2 = psVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(psVar, sensor2);
                }
                Sensor sensor3 = psVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(psVar, sensor3);
                }
                sensorManager.unregisterListener(psVar, psVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                psVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.s));
        this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.s));
        hi.l3 l3Var = this.y;
        if (l3Var != null) {
            l3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.s));
            this.y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.ActionBar.t1 t1Var = this.d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.d0 = null;
            return;
        }
        if (this.c0 || (gjVar = this.N) == null || gjVar.P3()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
        String M0 = org.telegram.messenger.hd.M0(this.T ? 2131743592 : 2131743517, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
        t1Var2.S = M0;
        t1Var2.U = org.telegram.messenger.hd.M0(this.T ? 2131743593 : 2131743518, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new mz0(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751598, null), new mz0(this, 2));
        this.d0 = t1Var2;
        t1Var2.show();
        TextView textView = (TextView) this.d0.d(-2);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        k0 k0Var = this.b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.ns.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.r2.a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(k0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.gh(29, this, q1Var), 14.0f);
            this.X = true;
            c(true, null);
            fe feVar = this.Y;
            if (feVar != null) {
                org.telegram.messenger.g0.h3(feVar);
                this.Y = null;
            }
            org.telegram.ui.Components.ps psVar = this.F;
            if (psVar != null) {
                PowerManager.WakeLock wakeLock = psVar.h;
                SensorManager sensorManager = psVar.a;
                if (psVar.n) {
                    return;
                }
                Sensor sensor = psVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(psVar, sensor, 30000);
                }
                Sensor sensor2 = psVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(psVar, sensor2, 30000);
                }
                Sensor sensor3 = psVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(psVar, sensor3, 30000);
                }
                sensorManager.registerListener(psVar, psVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                psVar.n = true;
            }
        }
    }
}
