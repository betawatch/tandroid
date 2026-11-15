package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ f0 a;

    public e0(f0 f0Var) {
        this.a = f0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.a.c.j.e(-1, new a0(1));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new a0(2));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new a0(1));
    }
}
