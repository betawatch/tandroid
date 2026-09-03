package j3;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        this.a.post(new ah.b(this, i10, 5));
    }
}
