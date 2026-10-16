package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import ji.h5;
import ji.v2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d0 {
    public final AudioTrack a;
    public final h5 b;
    public final Handler c;
    public c0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, k2.c0] */
    public d0(AudioTrack audioTrack, h5 h5Var) {
        this.a = audioTrack;
        this.b = h5Var;
        Handler q6 = e2.m0.q(null);
        this.c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: k2.c0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                d0 d0Var = d0.this;
                if (d0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new v2(7, d0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static /* synthetic */ void a(d0 d0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            d0Var.c.post(new v2(8, d0Var, routedDevice));
        }
    }

    public static void b(d0 d0Var) {
        AudioTrack audioTrack = d0Var.a;
        c0 c0Var = d0Var.d;
        c0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(c0Var);
        d0Var.d = null;
    }
}
