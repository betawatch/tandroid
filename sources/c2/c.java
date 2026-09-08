package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final b2.e d;
    public final boolean e;
    public final Object f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.a = i10;
        this.c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.e == cVar.e && Objects.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c) && Objects.equals(this.d, cVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
