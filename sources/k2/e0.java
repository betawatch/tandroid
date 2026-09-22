package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ f0 a;

    public e0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (g0Var = this.a.c).t) != null && g0Var.X) {
            nVar.h0();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.a.c.x)) {
            this.a.c.W = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (g0Var = this.a.c).t) != null && g0Var.X) {
            nVar.h0();
        }
    }
}
