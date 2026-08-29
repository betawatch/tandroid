package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ j0 a;

    public i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        k0 k0Var;
        r rVar;
        if (audioTrack.equals(this.a.c.u) && (rVar = (k0Var = this.a.c).r) != null && k0Var.U) {
            rVar.A();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        k0 k0Var;
        r rVar;
        if (audioTrack.equals(this.a.c.u) && (rVar = (k0Var = this.a.c).r) != null && k0Var.U) {
            rVar.A();
        }
    }
}
