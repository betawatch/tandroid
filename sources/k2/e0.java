package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e0 {
    public final AudioTrack a;
    public final a6.i b;
    public final Handler c;
    public d0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, k2.d0] */
    public e0(AudioTrack audioTrack, a6.i iVar) {
        this.a = audioTrack;
        this.b = iVar;
        Handler q6 = e2.m0.q(null);
        this.c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: k2.d0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                e0 e0Var = e0.this;
                if (e0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new hi.t(17, e0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static /* synthetic */ void a(e0 e0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            e0Var.c.post(new hi.t(18, e0Var, routedDevice));
        }
    }

    public static void b(e0 e0Var) {
        AudioTrack audioTrack = e0Var.a;
        d0 d0Var = e0Var.d;
        d0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(d0Var);
        e0Var.d = null;
    }
}
