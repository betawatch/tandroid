package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            tVar.G();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.a.c.v) && (tVar = (k0Var = this.a.c).r) != null && k0Var.V) {
            tVar.G();
        }
    }
}
