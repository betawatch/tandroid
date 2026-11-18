package n2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import hi.u5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c0 {
    public final AudioTrack a;
    public final u5 b;
    public final Handler c;
    public b0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, n2.b0] */
    public c0(AudioTrack audioTrack, u5 u5Var) {
        this.a = audioTrack;
        this.b = u5Var;
        Handler q10 = h2.l0.q(null);
        this.c = q10;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: n2.b0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                c0 c0Var = c0.this;
                if (c0Var.d == null) {
                    return;
                }
                h2.a.e().execute(new kg.h0(25, c0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q10);
    }

    public static /* synthetic */ void a(c0 c0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            c0Var.c.post(new kg.h0(26, c0Var, routedDevice));
        }
    }

    public static void b(c0 c0Var) {
        AudioTrack audioTrack = c0Var.a;
        b0 b0Var = c0Var.d;
        b0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(b0Var);
        c0Var.d = null;
    }
}
