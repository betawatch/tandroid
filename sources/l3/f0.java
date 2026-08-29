package l3;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 {
    public final j3.t0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final j[] i;

    public f0(j3.t0 t0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, j[] jVarArr) {
        this.a = t0Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = i15;
        this.h = i16;
        this.i = jVarArr;
    }

    public static AudioAttributes c(e eVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) eVar.a().b;
    }

    public final AudioTrack a(boolean z10, e eVar, int i10) {
        int i11 = this.c;
        try {
            AudioTrack b10 = b(z10, eVar, i10);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            throw new q(state, this.e, this.f, this.h, this.a, i11 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new q(0, this.e, this.f, this.h, this.a, i11 == 1, e10);
        }
    }

    public final AudioTrack b(boolean z10, e eVar, int i10) {
        int i11 = f5.d0.a;
        int i12 = this.g;
        int i13 = this.f;
        int i14 = this.e;
        if (i11 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(eVar, z10)).setAudioFormat(k0.f(i14, i13, i12)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i10).setOffloadedPlayback(this.c == 1).build();
        }
        if (i11 >= 21) {
            return new AudioTrack(c(eVar, z10), k0.f(i14, i13, i12), this.h, 1, i10);
        }
        int y8 = f5.d0.y(eVar.c);
        if (i10 == 0) {
            return new AudioTrack(y8, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(y8, this.e, this.f, this.g, this.h, 1, i10);
    }
}
