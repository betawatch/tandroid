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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n51 extends Dialog {
    public final org.telegram.ui.Components.ot E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public MessageObject M;
    public l51 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.k8 V;
    public boolean W;
    public ve X;
    public a3.h0 Y;
    public final i51 Z;
    public final Context a;
    public float a0;
    public final k0 b;
    public boolean b0;
    public final bi.n7 c;
    public org.telegram.ui.ActionBar.d2 c0;
    public org.telegram.ui.Components.k11 d;
    public ValueAnimator d0;
    public i0.c e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.t71 w;
    public bi.x4 x;
    public TextView y;

    public n51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.c.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i10 = 0;
        this.Z = new i51(this, i10);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.b = k0Var;
        k0Var.setOnClickListener(new j51(this, i10));
        bi.n7 n7Var = new bi.n7(this, activity);
        this.c = n7Var;
        n7Var.setClipToPadding(false);
        k0Var.addView(n7Var, w7.a6.e(-1, -1, 119));
        k51 k51Var = new k51(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(k0Var, k51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.ot();
        }
    }

    public final void c(boolean z10, i51 i51Var) {
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
        ofFloat.addUpdateListener(new bi.m7(9, this, z10));
        this.d0.addListener(new androidx.fragment.app.g(this, z10, i51Var, 10));
        long j3 = (z10 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        valueAnimator3.setInterpolator(wrVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new f21(this, 7));
        this.e0.addListener(new iw0(3, this, z10));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(wrVar);
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
        org.telegram.ui.Cells.t1 t1Var = this.O;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            float f7 = iArr[0] - this.e.a;
            int width = k0Var.getWidth();
            i0.c cVar = this.e;
            this.F = f7 - ((((width - cVar.a) - cVar.c) - this.O.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = k0Var.getHeight();
            i0.c cVar2 = this.e;
            this.G = org.telegram.messenger.a2.y(((height - cVar2.b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, f10);
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
        l51 l51Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.c0;
        if (d2Var != null) {
            d2Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        bi.x4 x4Var = this.x;
        if (x4Var != null) {
            x4Var.e(true);
        }
        org.telegram.ui.Components.t71 t71Var = this.w;
        if (t71Var != null) {
            t71Var.B();
            this.w.H();
            this.w = null;
        }
        if (!this.S && (l51Var = this.N) != null && l51Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.ro0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
            if (t1Var != null) {
                t1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new i51(this, 3));
        k0 k0Var = this.b;
        k0Var.invalidate();
        a3.h0 h0Var = this.Y;
        if (h0Var != null) {
            org.telegram.ui.Cells.t1 t1Var2 = this.O;
            if (t1Var2 != null) {
                t1Var2.fd = true;
            }
            AndroidUtilities.runOnUIThread(h0Var);
            this.Y = null;
            org.telegram.ui.Components.k11 k11Var = new org.telegram.ui.Components.k11(this.a, null);
            this.d = k11Var;
            k0Var.addView(k11Var, w7.a6.e(-1, -1, 119));
            org.telegram.ui.Components.k11 k11Var2 = this.d;
            l51 l51Var2 = this.N;
            i51 i51Var = new i51(this, 1);
            org.telegram.ui.Components.i11 i11Var = k11Var2.a;
            if (i11Var != null) {
                i11Var.e(l51Var2, 1.5f, i51Var);
                Choreographer.getInstance().postFrameCallback(k11Var2.b);
            } else {
                org.telegram.ui.Components.j11 j11Var = new org.telegram.ui.Components.j11(l51Var2, i51Var);
                j11Var.g = 1.5f;
                k11Var2.c.add(j11Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.ot otVar = this.E;
        if (otVar != null) {
            PowerManager.WakeLock wakeLock = otVar.h;
            SensorManager sensorManager = otVar.a;
            if (otVar.n) {
                Sensor sensor = otVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(otVar, sensor);
                }
                Sensor sensor2 = otVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(otVar, sensor2);
                }
                Sensor sensor3 = otVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(otVar, sensor3);
                }
                sensorManager.unregisterListener(otVar, otVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                otVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
        this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        bi.x4 x4Var = this.x;
        if (x4Var != null) {
            x4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
            this.x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.d2 d2Var = this.c0;
        if (d2Var != null) {
            d2Var.dismiss();
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new k51(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new k51(this, 2));
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        this.c0 = d2Var2;
        d2Var2.show();
        TextView textView = (TextView) this.c0.d(-2);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
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
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.O;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new nj0(8, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            ve veVar = this.X;
            if (veVar != null) {
                AndroidUtilities.runOnUIThread(veVar);
                this.X = null;
            }
            org.telegram.ui.Components.ot otVar = this.E;
            if (otVar != null) {
                PowerManager.WakeLock wakeLock = otVar.h;
                SensorManager sensorManager = otVar.a;
                if (otVar.n) {
                    return;
                }
                Sensor sensor = otVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(otVar, sensor, 30000);
                }
                Sensor sensor2 = otVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(otVar, sensor2, 30000);
                }
                Sensor sensor3 = otVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(otVar, sensor3, 30000);
                }
                sensorManager.registerListener(otVar, otVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                otVar.n = true;
            }
        }
    }
}
