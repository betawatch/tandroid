package j3;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
