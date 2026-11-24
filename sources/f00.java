// default package

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f00 {
    public final byte a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final nz d;
    public final boolean e;
    public final Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public f00(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, nz nzVar, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = nzVar;
        this.e = z;
        if (Build.VERSION.SDK_INT < 26) {
            this.b = new e00(onAudioFocusChangeListener, handler);
            this.f = null;
        } else {
            this.b = onAudioFocusChangeListener;
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(nzVar.b()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return this.a == f00Var.a && this.e == f00Var.e && Objects.equals(this.b, f00Var.b) && this.c.equals(f00Var.c) && Objects.equals(this.d, f00Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
