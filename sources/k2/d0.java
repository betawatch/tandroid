package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class d0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        f0 f0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (f0Var = this.a.c).t) != null && f0Var.X) {
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
        f0 f0Var;
        n nVar;
        if (audioTrack.equals(this.a.c.x) && (nVar = (f0Var = this.a.c).t) != null && f0Var.X) {
            nVar.h0();
        }
    }
}
