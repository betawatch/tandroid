package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ c0 a;

    public b0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (d0Var = this.a.c).t) != null && d0Var.X) {
            nVar.T();
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
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (d0Var = this.a.c).t) != null && d0Var.X) {
            nVar.T();
        }
    }
}
