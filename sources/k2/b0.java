package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
