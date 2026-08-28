package h3;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ d b;

    public c(d dVar, Handler handler) {
        this.b = dVar;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i9) {
        this.a.post(new bg.c2(this, i9, 4));
    }
}
