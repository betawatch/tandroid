package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(AudioTrack audioTrack, e0 e0Var) {
        audioTrack.setPreferredDevice(e0Var == null ? null : e0Var.a);
    }
}
