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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k51 extends Dialog {
    public final org.telegram.ui.Components.zt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.e6 L;
    public MessageObject M;
    public i51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.m8 V;
    public boolean W;
    public ve X;
    public a3.h0 Y;
    public final f51 Z;
    public final Context a;
    public float a0;
    public final k0 b;
    public boolean b0;
    public final ci.m6 c;
    public org.telegram.ui.ActionBar.b2 c0;
    public org.telegram.ui.Components.c21 d;
    public ValueAnimator d0;
    public i0.b e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.k81 w;
    public ci.d4 x;
    public TextView y;

    public k51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i10 = 0;
        this.Z = new f51(this, i10);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.b = k0Var;
        k0Var.setOnClickListener(new g51(this, i10));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.c = m6Var;
        m6Var.setClipToPadding(false);
        k0Var.addView(m6Var, w7.x5.e(-1, -1, 119));
        h51 h51Var = new h51(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, h51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.zt();
        }
    }

    public final void c(boolean z10, f51 f51Var) {
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
        ofFloat.addUpdateListener(new ai.cb(i10, this, z10));
        this.d0.addListener(new androidx.fragment.app.g(this, z10, f51Var, i10));
        long j3 = (z10 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        valueAnimator3.setInterpolator(hsVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        int i11 = 7;
        ofFloat2.addUpdateListener(new y11(this, i11));
        this.e0.addListener(new f70(i11, this, z10));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(hsVar);
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
        org.telegram.ui.Cells.u1 u1Var = this.O;
        if (u1Var != null) {
            int[] iArr = new int[2];
            u1Var.getLocationOnScreen(iArr);
            float f7 = iArr[0] - this.e.a;
            int width = k0Var.getWidth();
            i0.b bVar = this.e;
            this.F = f7 - ((((width - bVar.a) - bVar.c) - this.O.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = k0Var.getHeight();
            i0.b bVar2 = this.e;
            this.G = org.telegram.messenger.q.x(((height - bVar2.b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, f10);
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
        i51 i51Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        ci.d4 d4Var = this.x;
        if (d4Var != null) {
            d4Var.e(true);
        }
        org.telegram.ui.Components.k81 k81Var = this.w;
        if (k81Var != null) {
            k81Var.B();
            this.w.H();
            this.w = null;
        }
        if (!this.S && (i51Var = this.N) != null && i51Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.np0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new f51(this, 3));
        k0 k0Var = this.b;
        k0Var.invalidate();
        a3.h0 h0Var = this.Y;
        if (h0Var != null) {
            org.telegram.ui.Cells.u1 u1Var2 = this.O;
            if (u1Var2 != null) {
                u1Var2.fd = true;
            }
            AndroidUtilities.runOnUIThread(h0Var);
            this.Y = null;
            org.telegram.ui.Components.c21 c21Var = new org.telegram.ui.Components.c21(this.a, null);
            this.d = c21Var;
            k0Var.addView(c21Var, w7.x5.e(-1, -1, 119));
            org.telegram.ui.Components.c21 c21Var2 = this.d;
            i51 i51Var2 = this.N;
            f51 f51Var = new f51(this, 1);
            org.telegram.ui.Components.a21 a21Var = c21Var2.a;
            if (a21Var != null) {
                a21Var.e(i51Var2, 1.5f, f51Var);
                Choreographer.getInstance().postFrameCallback(c21Var2.b);
            } else {
                org.telegram.ui.Components.b21 b21Var = new org.telegram.ui.Components.b21(i51Var2, f51Var);
                b21Var.g = 1.5f;
                c21Var2.c.add(b21Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.zt ztVar = this.E;
        if (ztVar != null) {
            PowerManager.WakeLock wakeLock = ztVar.h;
            SensorManager sensorManager = ztVar.a;
            if (ztVar.n) {
                Sensor sensor = ztVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(ztVar, sensor);
                }
                Sensor sensor2 = ztVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(ztVar, sensor2);
                }
                Sensor sensor3 = ztVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(ztVar, sensor3);
                }
                sensorManager.unregisterListener(ztVar, ztVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                ztVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
        this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        ci.d4 d4Var = this.x;
        if (d4Var != null) {
            d4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new h51(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new h51(this, 2));
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        this.c0 = b2Var2;
        b2Var2.show();
        TextView textView = (TextView) this.c0.d(-2);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
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
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new ft(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            ve veVar = this.X;
            if (veVar != null) {
                AndroidUtilities.runOnUIThread(veVar);
                this.X = null;
            }
            org.telegram.ui.Components.zt ztVar = this.E;
            if (ztVar != null) {
                PowerManager.WakeLock wakeLock = ztVar.h;
                SensorManager sensorManager = ztVar.a;
                if (ztVar.n) {
                    return;
                }
                Sensor sensor = ztVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(ztVar, sensor, 30000);
                }
                Sensor sensor2 = ztVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(ztVar, sensor2, 30000);
                }
                Sensor sensor3 = ztVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(ztVar, sensor3, 30000);
                }
                sensorManager.registerListener(ztVar, ztVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                ztVar.n = true;
            }
        }
    }
}
