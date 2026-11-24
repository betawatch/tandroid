// default package

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh7 implements xk0, ql5, WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback, ee, ke3, gka, hka, pu7, ln5, hp7, mm0, qq7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ bh7(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel g(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ Font i(Object obj) {
        return (Font) obj;
    }

    public static /* synthetic */ void j(Object obj) {
        throw new AssertionError(obj);
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        return wzc.b;
    }

    @Override // pu7
    public final Typeface a() {
        switch (this.a) {
            case 16:
                return gm.n1("fonts/rmedium.ttf");
            case 17:
                return gm.n1("fonts/rmediumitalic.ttf");
            case 18:
                return Typeface.create("serif", 1);
            case 19:
                return gm.n1("fonts/rcondensedbold.ttf");
            case 20:
                return gm.n1("fonts/rmono.ttf");
            default:
                return gm.n1("fonts/mw_bold.ttf");
        }
    }

    @Override // xk0
    public final Object b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        p09 y;
        if (!z || z2 || (y = imageReceiver.y()) == null) {
            return;
        }
        y.start();
    }

    @Override // hp7
    public final String c(int i) {
        return i == 0 ? jb6.M0(2131753764, null) : i == 1 ? jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(1, "Minutes", new Object[0])) : i == 2 ? jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(5, "Minutes", new Object[0])) : i == 3 ? jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(1, "Hours", new Object[0])) : i == 4 ? jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(5, "Hours", new Object[0])) : "";
    }

    @Override // hka
    public final void d(Object obj, float f) {
        gt7 gt7Var = (gt7) obj;
        switch (this.a) {
            case 10:
                gt7Var.f = f;
                if (!gt7Var.E || gt7Var.G) {
                    gt7Var.c.setStrokeWidth(gm.R1(gt7Var.w, gt7Var.x, f));
                    gt7Var.f();
                }
                gt7Var.invalidate();
                break;
            case 11:
            default:
                gt7Var.s = f;
                gt7Var.f();
                break;
            case 12:
                gt7Var.n = f;
                if (!gt7Var.E || gt7Var.G) {
                    gt7Var.f();
                }
                gt7Var.invalidate();
                break;
        }
    }

    @Override // ql5
    public final boolean e(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // gka
    public final float get(Object obj) {
        gt7 gt7Var = (gt7) obj;
        switch (this.a) {
            case 9:
                return gt7Var.f;
            case 10:
            default:
                return gt7Var.s;
            case 11:
                return gt7Var.n;
        }
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        Bitmap bitmap = vx8.a;
        return (((int) kt6.d(ned.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.onRecordedSamples(audioSamples);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 6:
                heVar.dismiss();
                break;
            case 7:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new goc());
                    break;
                }
                break;
            case 27:
                heVar.dismiss();
                break;
            case 28:
                heVar.dismiss();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                break;
        }
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // ke3
    public final void f(nv8 nv8Var) {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}
