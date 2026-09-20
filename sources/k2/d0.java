package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
            nVar.e0();
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
            nVar.e0();
        }
    }
}
