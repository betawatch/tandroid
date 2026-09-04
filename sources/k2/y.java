package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import di.g7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class y {
    public final AudioTrack a;
    public final g7 b;
    public x c = new AudioRouting.OnRoutingChangedListener() { // from class: k2.x
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            y.a(y.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [k2.x] */
    public y(AudioTrack audioTrack, g7 g7Var) {
        this.a = audioTrack;
        this.b = g7Var;
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
