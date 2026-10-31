package c2;

import ag.d3;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.l0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final void onAudioFocusChange(int i10) {
        l0.W(this.a, new d3(this, i10, 2));
    }
}
