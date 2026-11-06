package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.a.c.j.e(-1, new m2.d(25));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new m2.d(26));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new m2.d(25));
    }
}
