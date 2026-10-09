package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y {
    public final AudioTrack a;
    public final e7 b;
    public x c = new AudioRouting.OnRoutingChangedListener() { // from class: k2.x
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            y.a(y.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [k2.x] */
    public y(AudioTrack audioTrack, e7 e7Var) {
        this.a = audioTrack;
        this.b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    public static void a(y yVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (yVar.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        yVar.b.c(routedDevice);
    }

    public final void b() {
        x xVar = this.c;
        xVar.getClass();
        this.a.removeOnRoutingChangedListener(xVar);
        this.c = null;
    }
}
