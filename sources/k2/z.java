package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import bi.h8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class z {
    public final AudioTrack a;
    public final h8 b;
    public y c = new AudioRouting.OnRoutingChangedListener() { // from class: k2.y
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            z.a(z.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [k2.y] */
    public z(AudioTrack audioTrack, h8 h8Var) {
        this.a = audioTrack;
        this.b = h8Var;
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
