package j3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 {
    public final Handler a = new Handler(Looper.myLooper());
    public final h0 b = new h0(this);
    public final /* synthetic */ j0 c;

    public i0(j0 j0Var) {
        this.c = j0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
