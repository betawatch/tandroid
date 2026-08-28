package j3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static void a(AudioTrack audioTrack, d0 d0Var) {
        audioTrack.setPreferredDevice(d0Var == null ? null : d0Var.a);
    }
}
