package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
            oVar.D();
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
            oVar.D();
        }
    }
}
