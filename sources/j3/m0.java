package j3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class m0 {
    public static void a(t tVar, Object obj) {
        e0 e0Var;
        AudioDeviceInfo d = ia.l.d(obj);
        j0 j0Var = (j0) tVar;
        if (d == null) {
            e0Var = null;
        } else {
            j0Var.getClass();
            e0Var = new e0(d);
        }
        j0Var.Y = e0Var;
        AudioTrack audioTrack = j0Var.u;
        if (audioTrack != null) {
            c0.a(audioTrack, e0Var);
        }
    }
}
