package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class g0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ h0 a;

    public g0(h0 h0Var) {
        this.a = h0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.a.c.j.e(-1, new j2.e(29));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new f0(0));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new j2.e(29));
    }
}
