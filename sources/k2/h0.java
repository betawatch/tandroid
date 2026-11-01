package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class h0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.a.c.j.e(-1, new j2.e(28));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new j2.e(29));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new j2.e(28));
    }
}
