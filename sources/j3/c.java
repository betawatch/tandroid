package j3;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ d b;

    public c(d dVar, Handler handler) {
        this.b = dVar;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.a.post(new bg.f(this, i10, 4));
    }
}
