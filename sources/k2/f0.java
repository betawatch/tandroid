package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 {
    public final AudioTrack a;
    public final m0 b;
    public final Handler c;
    public e0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, k2.e0] */
    public f0(AudioTrack audioTrack, m0 m0Var) {
        this.a = audioTrack;
        this.b = m0Var;
        Handler q6 = e2.l0.q(null);
        this.c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: k2.e0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                f0 f0Var = f0.this;
                if (f0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new u(2, f0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static /* synthetic */ void a(f0 f0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            f0Var.c.post(new u(3, f0Var, routedDevice));
        }
    }

    public static void b(f0 f0Var) {
        AudioTrack audioTrack = f0Var.a;
        e0 e0Var = f0Var.d;
        e0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(e0Var);
        f0Var.d = null;
    }
}
