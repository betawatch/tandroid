package j3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        j0 j0Var;
        r rVar;
        if (audioTrack.equals(this.a.c.u) && (rVar = (j0Var = this.a.c).r) != null && j0Var.U) {
            rVar.E();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        j0 j0Var;
        r rVar;
        if (audioTrack.equals(this.a.c.u) && (rVar = (j0Var = this.a.c).r) != null && j0Var.U) {
            rVar.E();
        }
    }
}
