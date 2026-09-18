package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class f0 {
    public final Handler a = new Handler(Looper.myLooper());
    public final e0 b = new e0(this);
    public final /* synthetic */ g0 c;

    public f0(g0 g0Var) {
        this.c = g0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
