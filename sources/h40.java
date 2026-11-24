// default package

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h40 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ i40 a;

    public h40(i40 i40Var) {
        this.a = i40Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new wz((byte) 4));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new wz((byte) 5));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new wz((byte) 4));
    }
}
