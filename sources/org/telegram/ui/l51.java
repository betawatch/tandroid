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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l51 extends Dialog {
    public final org.telegram.ui.Components.jt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public MessageObject M;
    public j51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.j8 V;
    public boolean W;
    public ue X;
    public a3.h0 Y;
    public final g51 Z;
    public final Context a;
    public float a0;
    public final j0 b;
    public boolean b0;
    public final ci.n6 c;
    public org.telegram.ui.ActionBar.b2 c0;
    public org.telegram.ui.Components.n11 d;
    public ValueAnimator d0;
    public i0.b e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.v71 w;
    public ci.f4 x;
    public TextView y;

    public l51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i10 = 0;
        this.Z = new g51(this, i10);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        j0 j0Var = new j0(this, activity, 21);
        this.b = j0Var;
        j0Var.setOnClickListener(new h51(this, i10));
        ci.n6 n6Var = new ci.n6(this, activity);
        this.c = n6Var;
        n6Var.setClipToPadding(false);
        j0Var.addView(n6Var, w7.y5.e(-1, -1, 119));
        i51 i51Var = new i51(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(j0Var, i51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.jt();
        }
    }

    public final void c(boolean z10, g51 g51Var) {
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
        int i10 = 10;
        ofFloat.addUpdateListener(new ai.bb(i10, this, z10));
        this.d0.addListener(new androidx.fragment.app.g(this, z10, g51Var, i10));
        long j3 = (z10 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new i21(this, 6));
        this.e0.addListener(new h70(7, this, z10));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(qrVar);
        this.e0.start();
    }

    public final void d() {
        if (this.H) {
            return;
        }
        j0 j0Var = this.b;
        if (j0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = this.O;
        if (u1Var != null) {
            int[] iArr = new int[2];
            u1Var.getLocationOnScreen(iArr);
            float f7 = iArr[0] - this.e.a;
            int width = j0Var.getWidth();
            i0.b bVar = this.e;
            this.F = f7 - ((((width - bVar.a) - bVar.c) - this.O.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = j0Var.getHeight();
            i0.b bVar2 = this.e;
            this.G = org.telegram.messenger.l0.x(((height - bVar2.b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, f10);
            if (!this.J) {
                this.J = true;
                float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], j0Var.getHeight() * 0.7f, j0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((j0Var.getHeight() - this.O.getHeight()) / 2.0f);
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
        j51 j51Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        ci.f4 f4Var = this.x;
        if (f4Var != null) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.v71 v71Var = this.w;
        if (v71Var != null) {
            v71Var.B();
            this.w.H();
            this.w = null;
        }
        if (!this.S && (j51Var = this.N) != null && j51Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.xo0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new g51(this, 3));
        j0 j0Var = this.b;
        j0Var.invalidate();
        a3.h0 h0Var = this.Y;
        if (h0Var != null) {
            org.telegram.ui.Cells.u1 u1Var2 = this.O;
            if (u1Var2 != null) {
                u1Var2.fd = true;
            }
            AndroidUtilities.runOnUIThread(h0Var);
            this.Y = null;
            org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(this.a, null);
            this.d = n11Var;
            j0Var.addView(n11Var, w7.y5.e(-1, -1, 119));
            org.telegram.ui.Components.n11 n11Var2 = this.d;
            j51 j51Var2 = this.N;
            g51 g51Var = new g51(this, 1);
            org.telegram.ui.Components.l11 l11Var = n11Var2.a;
            if (l11Var != null) {
                l11Var.e(j51Var2, 1.5f, g51Var);
                Choreographer.getInstance().postFrameCallback(n11Var2.b);
            } else {
                org.telegram.ui.Components.m11 m11Var = new org.telegram.ui.Components.m11(j51Var2, g51Var);
                m11Var.g = 1.5f;
                n11Var2.c.add(m11Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.jt jtVar = this.E;
        if (jtVar != null) {
            PowerManager.WakeLock wakeLock = jtVar.h;
            SensorManager sensorManager = jtVar.a;
            if (jtVar.n) {
                Sensor sensor = jtVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(jtVar, sensor);
                }
                Sensor sensor2 = jtVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(jtVar, sensor2);
                }
                Sensor sensor3 = jtVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(jtVar, sensor3);
                }
                sensorManager.unregisterListener(jtVar, jtVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                jtVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
        this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        ci.f4 f4Var = this.x;
        if (f4Var != null) {
            f4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
            this.x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.b2 b2Var = this.c0;
        if (b2Var != null) {
            b2Var.dismiss();
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i51(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new i51(this, 2));
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        this.c0 = b2Var2;
        b2Var2.show();
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
        j0 j0Var = this.b;
        setContentView(j0Var, layoutParams);
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
        j0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(j0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new pj0(8, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            ue ueVar = this.X;
            if (ueVar != null) {
                AndroidUtilities.runOnUIThread(ueVar);
                this.X = null;
            }
            org.telegram.ui.Components.jt jtVar = this.E;
            if (jtVar != null) {
                PowerManager.WakeLock wakeLock = jtVar.h;
                SensorManager sensorManager = jtVar.a;
                if (jtVar.n) {
                    return;
                }
                Sensor sensor = jtVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(jtVar, sensor, 30000);
                }
                Sensor sensor2 = jtVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(jtVar, sensor2, 30000);
                }
                Sensor sensor3 = jtVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(jtVar, sensor3, 30000);
                }
                sensorManager.registerListener(jtVar, jtVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                jtVar.n = true;
            }
        }
    }
}
