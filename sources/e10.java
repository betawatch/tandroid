// default package

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e10 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public e10(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = hac.a;
        this.a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        hac.X(this.a, new eh((Object) this, i, (byte) 3));
    }
}
