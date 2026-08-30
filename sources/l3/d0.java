package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(AudioTrack audioTrack, f0 f0Var) {
        audioTrack.setPreferredDevice(f0Var == null ? null : f0Var.a);
    }
}
