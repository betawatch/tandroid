package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c0 {
    public final Handler a = new Handler(Looper.myLooper());
    public final b0 b = new b0(this);
    public final /* synthetic */ d0 c;

    public c0(d0 d0Var) {
        this.c = d0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
