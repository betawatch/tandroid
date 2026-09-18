package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
