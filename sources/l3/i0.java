package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ j0 a;

    public i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.a.c.v) && (tVar = (k0Var = this.a.c).r) != null && k0Var.V) {
            tVar.F();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.a.c.v) && (tVar = (k0Var = this.a.c).r) != null && k0Var.V) {
            tVar.F();
        }
    }
}
