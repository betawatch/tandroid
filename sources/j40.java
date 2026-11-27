// default package

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j40 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ k40 a;

    public j40(k40 k40Var) {
        this.a = k40Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new xz((byte) 4));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new xz((byte) 5));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new xz((byte) 4));
    }
}
