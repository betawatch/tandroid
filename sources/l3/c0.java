package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(v vVar, Object obj) {
        f0 f0Var;
        AudioDeviceInfo b10 = k3.e.b(obj);
        k0 k0Var = (k0) vVar;
        if (b10 == null) {
            f0Var = null;
        } else {
            k0Var.getClass();
            f0Var = new f0(b10);
        }
        k0Var.Z = f0Var;
        AudioTrack audioTrack = k0Var.v;
        if (audioTrack != null) {
            d0.a(audioTrack, f0Var);
        }
    }
}
