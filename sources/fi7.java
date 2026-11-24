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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fi7 implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback, ed, yc3, eia, fia, os7, ll5, dn7, ml0, no7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ fi7(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ Font f(Object obj) {
        return (Font) obj;
    }

    public static /* synthetic */ void g(Object obj) {
        throw new AssertionError(obj);
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        if (!z || z2 || (y = imageReceiver.y()) == null) {
            return;
        }
        y.start();
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        return vxc.b;
    }

    @Override // os7
    public final Typeface a() {
        switch (this.a) {
            case 14:
                return gl.n1("fonts/rmedium.ttf");
            case 15:
                return gl.n1("fonts/rmediumitalic.ttf");
            case 16:
                return Typeface.create("serif", 1);
            case 17:
                return gl.n1("fonts/rcondensedbold.ttf");
            case 18:
                return gl.n1("fonts/rmono.ttf");
            default:
                return gl.n1("fonts/mw_bold.ttf");
        }
    }

    @Override // fia
    public final void b(Object obj, float f) {
        er7 er7Var = (er7) obj;
        switch (this.a) {
            case 8:
                er7Var.f = f;
                if (!er7Var.E || er7Var.G) {
                    er7Var.c.setStrokeWidth(gl.R1(er7Var.w, er7Var.x, f));
                    er7Var.f();
                }
                er7Var.invalidate();
                break;
            case 9:
            default:
                er7Var.s = f;
                er7Var.f();
                break;
            case 10:
                er7Var.n = f;
                if (!er7Var.E || er7Var.G) {
                    er7Var.f();
                }
                er7Var.invalidate();
                break;
        }
    }

    @Override // dn7
    public final String c(int i) {
        return i == 0 ? k96.M0(2131753796, null) : i == 1 ? k96.a0("AutoLockInTime", null, 2131753795, k96.G(1, "Minutes", new Object[0])) : i == 2 ? k96.a0("AutoLockInTime", null, 2131753795, k96.G(5, "Minutes", new Object[0])) : i == 3 ? k96.a0("AutoLockInTime", null, 2131753795, k96.G(1, "Hours", new Object[0])) : i == 4 ? k96.a0("AutoLockInTime", null, 2131753795, k96.G(5, "Hours", new Object[0])) : "";
    }

    @Override // eia
    public final float get(Object obj) {
        er7 er7Var = (er7) obj;
        switch (this.a) {
            case 7:
                return er7Var.f;
            case 8:
            default:
                return er7Var.s;
            case 9:
                return er7Var.n;
        }
    }

    @Override // ml0
    public final int k(wjb wjbVar, boolean z) {
        Bitmap bitmap = uv8.a;
        return (((int) ls6.d(lcd.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.onRecordedSamples(audioSamples);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 4:
                hdVar.dismiss();
                break;
            case 5:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new hmc());
                    break;
                }
                break;
            case 25:
                hdVar.dismiss();
                break;
            case 26:
                hdVar.dismiss();
                break;
            case 27:
                Drawable[] drawableArr = PhotoViewer.d9;
                break;
            case 28:
                hdVar.dismiss();
                break;
            default:
                hdVar.dismiss();
                break;
        }
    }

    @Override // yc3
    public final void h(mt8 mt8Var) {
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}
