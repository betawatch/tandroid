package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class d0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        f0 f0Var;
        o oVar;
        if (audioTrack.equals(this.a.c.x) && (oVar = (f0Var = this.a.c).t) != null && f0Var.X) {
            oVar.a0();
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
        f0 f0Var;
        o oVar;
        if (audioTrack.equals(this.a.c.x) && (oVar = (f0Var = this.a.c).t) != null && f0Var.X) {
            oVar.a0();
        }
    }
}
