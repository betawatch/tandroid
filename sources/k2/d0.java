package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class d0 {
    public final Handler a = new Handler(Looper.myLooper());
    public final c0 b = new c0(this);
    public final /* synthetic */ e0 c;

    public d0(e0 e0Var) {
        this.c = e0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
