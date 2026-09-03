package l3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
