package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ f0 a;

    public e0(f0 f0Var) {
        this.a = f0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.a.c.j.e(-1, new a0(2));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new a0(3));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new a0(2));
    }
}
