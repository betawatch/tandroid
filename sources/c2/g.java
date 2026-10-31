package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final b2.f d;
    public final boolean e;
    public final Object f;

    public g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.a = i10;
        this.c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.e == gVar.e && Objects.equals(this.b, gVar.b) && Objects.equals(this.c, gVar.c) && Objects.equals(this.d, gVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
