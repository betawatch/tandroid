package l3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j0 {
    public final Handler a = new Handler(Looper.myLooper());
    public final i0 b = new i0(this);
    public final /* synthetic */ k0 c;

    public j0(k0 k0Var) {
        this.c = k0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
