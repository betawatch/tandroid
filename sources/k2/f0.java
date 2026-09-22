package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
