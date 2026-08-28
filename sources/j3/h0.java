package j3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h0 {
    public final Handler a = new Handler(Looper.myLooper());
    public final g0 b = new g0(this);
    public final /* synthetic */ i0 c;

    public h0(i0 i0Var) {
        this.c = i0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
