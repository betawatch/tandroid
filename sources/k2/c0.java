package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class c0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ d0 a;

    public c0(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (e0Var = this.a.c).t) != null && e0Var.X) {
            nVar.f0();
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
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (e0Var = this.a.c).t) != null && e0Var.X) {
            nVar.f0();
        }
    }
}
