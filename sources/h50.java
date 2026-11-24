// default package

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h50 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ i50 a;

    public h50(i50 i50Var) {
        this.a = i50Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new w00((byte) 4));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new w00((byte) 5));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new w00((byte) 4));
    }
}
