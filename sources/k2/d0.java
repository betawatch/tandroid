package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
