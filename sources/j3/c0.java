package j3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(AudioTrack audioTrack, e0 e0Var) {
        audioTrack.setPreferredDevice(e0Var == null ? null : e0Var.a);
    }
}
