package f2;

import ai.w0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.a;
        this.a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        l0.W(this.a, new w0(this, i7, 4));
    }
}
