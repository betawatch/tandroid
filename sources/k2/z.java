package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class z {
    public final AudioTrack a;
    public final e7 b;
    public y c = new AudioRouting.OnRoutingChangedListener() { // from class: k2.y
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            z.a(z.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [k2.y] */
    public z(AudioTrack audioTrack, e7 e7Var) {
        this.a = audioTrack;
        this.b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    public static void a(z zVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zVar.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        zVar.b.c(routedDevice);
    }

    public final void b() {
        y yVar = this.c;
        yVar.getClass();
        this.a.removeOnRoutingChangedListener(yVar);
        this.c = null;
    }
}
