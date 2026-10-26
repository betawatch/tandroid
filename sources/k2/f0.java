package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import hi.u2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f0 {
    public final AudioTrack a;
    public final jg.s0 b;
    public final Handler c;
    public d0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, k2.d0] */
    public f0(AudioTrack audioTrack, jg.s0 s0Var) {
        this.a = audioTrack;
        this.b = s0Var;
        Handler q5 = e2.n0.q(null);
        this.c = q5;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: k2.d0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                f0 f0Var = f0.this;
                if (f0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new u2(29, f0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q5);
    }

    public static /* synthetic */ void a(f0 f0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            f0Var.c.post(new e0(0, f0Var, routedDevice));
        }
    }

    public static void b(f0 f0Var) {
        AudioTrack audioTrack = f0Var.a;
        d0 d0Var = f0Var.d;
        d0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(d0Var);
        f0Var.d = null;
    }
}
