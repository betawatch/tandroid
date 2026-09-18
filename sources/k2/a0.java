package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.g7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a0 {
    public final AudioTrack a;
    public final g7 b;
    public z c = new AudioRouting.OnRoutingChangedListener() { // from class: k2.z
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            a0.a(a0.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [k2.z] */
    public a0(AudioTrack audioTrack, g7 g7Var) {
        this.a = audioTrack;
        this.b = g7Var;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    public static void a(a0 a0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (a0Var.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        a0Var.b.c(routedDevice);
    }

    public final void b() {
        z zVar = this.c;
        zVar.getClass();
        this.a.removeOnRoutingChangedListener(zVar);
        this.c = null;
    }
}
