package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
