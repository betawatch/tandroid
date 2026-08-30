package j3;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        this.a.post(new af.b(this, i10, 6));
    }
}
