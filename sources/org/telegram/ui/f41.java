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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f41 extends Dialog {
    public final org.telegram.ui.Components.bt A;
    public float B;
    public float C;
    public boolean D;
    public float E;
    public boolean F;
    public float G;
    public org.telegram.ui.ActionBar.c6 H;
    public MessageObject I;
    public d41 J;
    public org.telegram.ui.Cells.s1 K;
    public TextureView L;
    public boolean M;
    public final RectF N;
    public boolean O;
    public float P;
    public float Q;
    public org.telegram.ui.Components.h8 R;
    public boolean S;
    public ke T;
    public g5.v U;
    public final a41 V;
    public float W;
    public boolean X;
    public org.telegram.ui.ActionBar.c2 Y;
    public ValueAnimator Z;
    public final Context a;
    public ValueAnimator a0;
    public final n0 b;
    public final bg.d1 c;
    public org.telegram.ui.Components.p01 d;
    public i0.b e;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.x61 w;
    public nh.t3 x;
    public TextView y;

    public f41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.N = new RectF();
        this.P = 0.0f;
        this.Q = 0.0f;
        int i10 = 0;
        this.V = new a41(this, i10);
        this.W = 0.0f;
        this.X = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        n0 n0Var = new n0(this, activity, 22);
        this.b = n0Var;
        n0Var.setOnClickListener(new b41(this, i10));
        bg.d1 d1Var = new bg.d1(this, activity);
        this.c = d1Var;
        d1Var.setClipToPadding(false);
        n0Var.addView(d1Var, i7.f6.e(-1, -1, 119));
        c41 c41Var = new c41(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var, c41Var);
        if (SharedConfig.raiseToListen) {
            this.A = new org.telegram.ui.Components.bt();
        }
    }

    public final void c(boolean z10, a41 a41Var) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
        this.Z = ofFloat;
        int i10 = 12;
        ofFloat.addUpdateListener(new bg.c1(i10, this, z10));
        this.Z.addListener(new androidx.fragment.app.g(this, z10, a41Var, i10));
        long j10 = (z10 || this.U != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        valueAnimator3.setInterpolator(jrVar);
        this.Z.setDuration(j10);
        this.Z.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.a0 = ofFloat2;
        int i11 = 7;
        ofFloat2.addUpdateListener(new w01(this, i11));
        this.a0.addListener(new p60(i11, this, z10));
        this.a0.setDuration((long) (j10 * 1.5f));
        this.a0.setInterpolator(jrVar);
        this.a0.start();
    }

    public final void d() {
        if (this.D) {
            return;
        }
        n0 n0Var = this.b;
        if (n0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.K;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            float f9 = iArr[0] - this.e.a;
            int width = n0Var.getWidth();
            i0.b bVar = this.e;
            this.B = f9 - ((((width - bVar.a) - bVar.c) - this.K.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = n0Var.getHeight();
            i0.b bVar2 = this.e;
            this.C = org.telegram.messenger.x3.a(((height - bVar2.b) - bVar2.d) - this.K.getHeight(), this.G, 2.0f, f10);
            if (!this.F) {
                this.F = true;
                float clamp = (Utilities.clamp((this.K.getHeight() / 2.0f) + iArr[1], n0Var.getHeight() * 0.7f, n0Var.getHeight() * 0.3f) - (this.K.getHeight() / 2.0f)) - ((n0Var.getHeight() - this.K.getHeight()) / 2.0f);
                this.E = clamp;
                if (this.O) {
                    this.E = 0.0f;
                } else {
                    this.E = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
                }
            }
            e();
        } else {
            this.C = 0.0f;
            this.B = 0.0f;
        }
        this.D = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        d41 d41Var;
        if (this.X) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.Y;
        if (c2Var != null) {
            c2Var.dismiss();
            this.Y = null;
        }
        this.X = true;
        nh.t3 t3Var = this.x;
        if (t3Var != null) {
            t3Var.e(true);
        }
        org.telegram.ui.Components.x61 x61Var = this.w;
        if (x61Var != null) {
            x61Var.C();
            this.w.I();
            this.w = null;
        }
        if (!this.O && (d41Var = this.J) != null && d41Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.co0 seekBarWaveform = this.J.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
        this.D = false;
        d();
        c(false, new a41(this, 3));
        n0 n0Var = this.b;
        n0Var.invalidate();
        g5.v vVar = this.U;
        if (vVar != null) {
            org.telegram.ui.Cells.s1 s1Var2 = this.K;
            if (s1Var2 != null) {
                s1Var2.bd = true;
            }
            AndroidUtilities.runOnUIThread(vVar);
            this.U = null;
            org.telegram.ui.Components.p01 p01Var = new org.telegram.ui.Components.p01(this.a, null);
            this.d = p01Var;
            n0Var.addView(p01Var, i7.f6.e(-1, -1, 119));
            org.telegram.ui.Components.p01 p01Var2 = this.d;
            d41 d41Var2 = this.J;
            a41 a41Var = new a41(this, 1);
            org.telegram.ui.Components.n01 n01Var = p01Var2.a;
            if (n01Var != null) {
                n01Var.e(d41Var2, 1.5f, a41Var);
                Choreographer.getInstance().postFrameCallback(p01Var2.b);
            } else {
                org.telegram.ui.Components.o01 o01Var = new org.telegram.ui.Components.o01(d41Var2, a41Var);
                o01Var.g = 1.5f;
                p01Var2.c.add(o01Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.bt btVar = this.A;
        if (btVar != null) {
            PowerManager.WakeLock wakeLock = btVar.h;
            SensorManager sensorManager = btVar.a;
            if (btVar.n) {
                Sensor sensor = btVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(btVar, sensor);
                }
                Sensor sensor2 = btVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(btVar, sensor2);
                }
                Sensor sensor3 = btVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(btVar, sensor3);
                }
                sensorManager.unregisterListener(btVar, btVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                btVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.B, 0.0f, this.s));
        this.J.setTranslationY(AndroidUtilities.lerp(this.C, this.E, this.s));
        nh.t3 t3Var = this.x;
        if (t3Var != null) {
            t3Var.setTranslationX(AndroidUtilities.lerp(this.B, 0.0f, this.s));
            this.x.setTranslationY(AndroidUtilities.lerp(this.C, this.E, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.c2 c2Var = this.Y;
        if (c2Var != null) {
            c2Var.dismiss();
            this.Y = null;
            return;
        }
        if (this.X || (messageObject = this.I) == null || messageObject.isOutOwner()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.H);
        alertDialog$Builder.a.N = LocaleController.getString(this.O ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle);
        alertDialog$Builder.a.P = LocaleController.getString(this.O ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new c41(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new c41(this, 2));
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
        this.Y = c2Var2;
        c2Var2.show();
        TextView textView = (TextView) this.Y.d(-2);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        n0 n0Var = this.b;
        setContentView(n0Var, layoutParams);
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
        n0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(n0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.s1 s1Var = this.K;
            if (s1Var != null) {
                s1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new yu0(4, this, s1Var), 14.0f);
            this.S = true;
            c(true, null);
            ke keVar = this.T;
            if (keVar != null) {
                AndroidUtilities.runOnUIThread(keVar);
                this.T = null;
            }
            org.telegram.ui.Components.bt btVar = this.A;
            if (btVar != null) {
                PowerManager.WakeLock wakeLock = btVar.h;
                SensorManager sensorManager = btVar.a;
                if (btVar.n) {
                    return;
                }
                Sensor sensor = btVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(btVar, sensor, 30000);
                }
                Sensor sensor2 = btVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(btVar, sensor2, 30000);
                }
                Sensor sensor3 = btVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(btVar, sensor3, 30000);
                }
                sensorManager.registerListener(btVar, btVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                btVar.n = true;
            }
        }
    }
}
