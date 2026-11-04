package m2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ g0 a;

    public f0(g0 g0Var) {
        this.a = g0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i3) {
        this.a.c.j.e(-1, new l2.d(20));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new l2.d(21));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new l2.d(20));
    }
}
