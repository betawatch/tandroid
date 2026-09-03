package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(AudioTrack audioTrack, f0 f0Var) {
        audioTrack.setPreferredDevice(f0Var == null ? null : f0Var.a);
    }
}
