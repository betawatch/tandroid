package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class g0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ h0 a;

    public g0(h0 h0Var) {
        this.a = h0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.a.c.j.e(-1, new f(3));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new f(4));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new f(3));
    }
}
