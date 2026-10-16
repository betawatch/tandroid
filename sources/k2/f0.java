package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ g0 a;

    public f0(g0 g0Var) {
        this.a = g0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.a.c.j.e(-1, new j2.e(27));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new j2.e(28));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new j2.e(27));
    }
}
