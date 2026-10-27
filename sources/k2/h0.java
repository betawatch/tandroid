package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.a.c.j.e(-1, new jh.l(5));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new jh.l(6));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new jh.l(5));
    }
}
