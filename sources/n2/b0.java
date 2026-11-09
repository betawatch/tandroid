package n2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import li.j3;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b0 {
    public final AudioTrack a;
    public final gf.g b;
    public final Handler c;
    public a0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, n2.a0] */
    public b0(AudioTrack audioTrack, gf.g gVar) {
        this.a = audioTrack;
        this.b = gVar;
        Handler q10 = h2.m0.q(null);
        this.c = q10;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() { // from class: n2.a0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                b0 b0Var = b0.this;
                if (b0Var.d == null) {
                    return;
                }
                h2.a.e().execute(new j3(11, b0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q10);
    }

    public static /* synthetic */ void a(b0 b0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            b0Var.c.post(new j3(12, b0Var, routedDevice));
        }
    }

    public static void b(b0 b0Var) {
        AudioTrack audioTrack = b0Var.a;
        a0 a0Var = b0Var.d;
        a0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(a0Var);
        b0Var.d = null;
    }
}
