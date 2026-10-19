package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class d0 {
    public final AudioTrack a;
    public final a6.i b;
    public final Handler c;
    public c0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, k2.c0] */
    public d0(AudioTrack audioTrack, a6.i iVar) {
        this.a = audioTrack;
        this.b = iVar;
        Handler q6 = e2.m0.q(null);
        this.c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: k2.c0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                d0 d0Var = d0.this;
                if (d0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new hi.t(17, d0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static /* synthetic */ void a(d0 d0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            d0Var.c.post(new hi.t(18, d0Var, routedDevice));
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
