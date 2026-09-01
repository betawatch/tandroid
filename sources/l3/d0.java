package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(AudioTrack audioTrack, f0 f0Var) {
        audioTrack.setPreferredDevice(f0Var == null ? null : f0Var.a);
    }
}
