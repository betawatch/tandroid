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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f41 extends Dialog {
    public final org.telegram.ui.Components.tt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.u6 L;
    public MessageObject M;
    public d41 N;
    public org.telegram.ui.Cells.s1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.n8 V;
    public boolean W;
    public te X;
    public a3.i0 Y;
    public final a41 Z;
    public final Context a;
    public float a0;
    public final k0 b;
    public boolean b0;
    public final bh.p c;
    public org.telegram.ui.ActionBar.e2 c0;
    public org.telegram.ui.Components.h21 d;
    public ValueAnimator d0;
    public i0.b e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.t81 w;
    public fi.v3 x;
    public TextView y;

    public f41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i10 = 0;
        this.Z = new a41(this, i10);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 23);
        this.b = k0Var;
        k0Var.setOnClickListener(new b41(this, i10));
        bh.p pVar = new bh.p(this, activity);
        this.c = pVar;
        pVar.setClipToPadding(false);
        k0Var.addView(pVar, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        c41 c41Var = new c41(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, c41Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.tt();
        }
    }

    public final void c(boolean z10, a41 a41Var) {
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
        ofFloat.addUpdateListener(new bh.a0(11, this, z10));
        this.d0.addListener(new ai.l0(this, z10, a41Var, 13));
        long j10 = (z10 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.d0.setDuration(j10);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new x11(this, 4));
        this.e0.addListener(new s40(8, this, z10));
        this.e0.setDuration((long) (j10 * 1.5f));
        this.e0.setInterpolator(dsVar);
        this.e0.start();
    }

    public final void d() {
        if (this.H) {
            return;
        }
        k0 k0Var = this.b;
        if (k0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.O;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            float f7 = iArr[0] - this.e.a;
            int width = k0Var.getWidth();
            i0.b bVar = this.e;
            this.F = f7 - ((((width - bVar.a) - bVar.c) - this.O.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = k0Var.getHeight();
            i0.b bVar2 = this.e;
            this.G = org.telegram.messenger.t.y(((height - bVar2.b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, f10);
            if (!this.J) {
                this.J = true;
                float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.O.getHeight()) / 2.0f);
                this.I = clamp;
                if (this.S) {
                    this.I = 0.0f;
                } else {
                    this.I = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
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
        d41 d41Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.c0;
        if (e2Var != null) {
            e2Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        fi.v3 v3Var = this.x;
        if (v3Var != null) {
            v3Var.e(true);
        }
        org.telegram.ui.Components.t81 t81Var = this.w;
        if (t81Var != null) {
            t81Var.B();
            this.w.H();
            this.w = null;
        }
        if (!this.S && (d41Var = this.N) != null && d41Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.qp0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new a41(this, 3));
        k0 k0Var = this.b;
        k0Var.invalidate();
        a3.i0 i0Var = this.Y;
        if (i0Var != null) {
            org.telegram.ui.Cells.s1 s1Var2 = this.O;
            if (s1Var2 != null) {
                s1Var2.fd = true;
            }
            AndroidUtilities.runOnUIThread(i0Var);
            this.Y = null;
            org.telegram.ui.Components.h21 h21Var = new org.telegram.ui.Components.h21(this.a, null);
            this.d = h21Var;
            k0Var.addView(h21Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
            org.telegram.ui.Components.h21 h21Var2 = this.d;
            d41 d41Var2 = this.N;
            a41 a41Var = new a41(this, 1);
            org.telegram.ui.Components.f21 f21Var = h21Var2.a;
            if (f21Var != null) {
                f21Var.d(d41Var2, 1.5f, a41Var);
                Choreographer.getInstance().postFrameCallback(h21Var2.b);
            } else {
                org.telegram.ui.Components.g21 g21Var = new org.telegram.ui.Components.g21(d41Var2, a41Var);
                g21Var.g = 1.5f;
                h21Var2.c.add(g21Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.tt ttVar = this.E;
        if (ttVar != null) {
            PowerManager.WakeLock wakeLock = ttVar.h;
            SensorManager sensorManager = ttVar.a;
            if (ttVar.n) {
                Sensor sensor = ttVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(ttVar, sensor);
                }
                Sensor sensor2 = ttVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(ttVar, sensor2);
                }
                Sensor sensor3 = ttVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(ttVar, sensor3);
                }
                sensorManager.unregisterListener(ttVar, ttVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                ttVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
        this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        fi.v3 v3Var = this.x;
        if (v3Var != null) {
            v3Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
            this.x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.e2 e2Var = this.c0;
        if (e2Var != null) {
            e2Var.dismiss();
            this.c0 = null;
            return;
        }
        if (this.b0 || (messageObject = this.M) == null || messageObject.isOutOwner()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
        alertDialog$Builder.a.R = LocaleController.getString(this.S ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle);
        alertDialog$Builder.a.T = LocaleController.getString(this.S ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new c41(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new c41(this, 2));
        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
        this.c0 = e2Var2;
        e2Var2.show();
        TextView textView = (TextView) this.c0.d(-2);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
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
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.s1 s1Var = this.O;
            if (s1Var != null) {
                s1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.oy(24, this, s1Var), 14.0f);
            this.W = true;
            c(true, null);
            te teVar = this.X;
            if (teVar != null) {
                AndroidUtilities.runOnUIThread(teVar);
                this.X = null;
            }
            org.telegram.ui.Components.tt ttVar = this.E;
            if (ttVar != null) {
                PowerManager.WakeLock wakeLock = ttVar.h;
                SensorManager sensorManager = ttVar.a;
                if (ttVar.n) {
                    return;
                }
                Sensor sensor = ttVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(ttVar, sensor, 30000);
                }
                Sensor sensor2 = ttVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(ttVar, sensor2, 30000);
                }
                Sensor sensor3 = ttVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(ttVar, sensor3, 30000);
                }
                sensorManager.registerListener(ttVar, ttVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                ttVar.n = true;
            }
        }
    }
}
