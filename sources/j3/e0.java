package j3;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e0 {
    public final h3.t0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final j[] i;

    public e0(h3.t0 t0Var, int i9, int i10, int i11, int i12, int i13, int i14, int i15, j[] jVarArr) {
        this.a = t0Var;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = i14;
        this.h = i15;
        this.i = jVarArr;
    }

    public static AudioAttributes c(e eVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) eVar.a().b;
    }

    public final AudioTrack a(boolean z10, e eVar, int i9) {
        int i10 = this.c;
        try {
            AudioTrack b10 = b(z10, eVar, i9);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            throw new p(state, this.e, this.f, this.h, this.a, i10 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new p(0, this.e, this.f, this.h, this.a, i10 == 1, e10);
        }
    }

    public final AudioTrack b(boolean z10, e eVar, int i9) {
        int i10 = d5.f0.a;
        int i11 = this.g;
        int i12 = this.f;
        int i13 = this.e;
        if (i10 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(eVar, z10)).setAudioFormat(i0.f(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i9).setOffloadedPlayback(this.c == 1).build();
        }
        if (i10 >= 21) {
            return new AudioTrack(c(eVar, z10), i0.f(i13, i12, i11), this.h, 1, i9);
        }
        int y10 = d5.f0.y(eVar.c);
        if (i9 == 0) {
            return new AudioTrack(y10, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(y10, this.e, this.f, this.g, this.h, 1, i9);
    }
}
