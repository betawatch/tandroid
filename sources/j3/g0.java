package j3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ h0 a;

    public g0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i9) {
        i0 i0Var;
        q qVar;
        if (audioTrack.equals(this.a.c.u) && (qVar = (i0Var = this.a.c).r) != null && i0Var.U) {
            qVar.D();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        i0 i0Var;
        q qVar;
        if (audioTrack.equals(this.a.c.u) && (qVar = (i0Var = this.a.c).r) != null && i0Var.U) {
            qVar.D();
        }
    }
}
