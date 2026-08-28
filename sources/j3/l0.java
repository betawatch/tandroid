package j3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l0 {
    public static void a(s sVar, Object obj) {
        d0 d0Var;
        AudioDeviceInfo d = i3.i.d(obj);
        i0 i0Var = (i0) sVar;
        if (d == null) {
            d0Var = null;
        } else {
            i0Var.getClass();
            d0Var = new d0(d);
        }
        i0Var.Y = d0Var;
        AudioTrack audioTrack = i0Var.u;
        if (audioTrack != null) {
            b0.a(audioTrack, d0Var);
        }
    }
}
