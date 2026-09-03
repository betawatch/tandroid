package l3;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g0 {
    public final j3.n0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final k i;
    public final boolean j;

    public g0(j3.n0 n0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, k kVar, boolean z4) {
        this.a = n0Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = i15;
        this.h = i16;
        this.i = kVar;
        this.j = z4;
    }

    public static AudioAttributes c(d dVar, boolean z4) {
        return z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) dVar.a().b;
    }

    public final AudioTrack a(boolean z4, d dVar, int i10) {
        int i11 = this.c;
        try {
            AudioTrack b10 = b(z4, dVar, i10);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            throw new s(state, this.e, this.f, this.h, this.a, i11 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new s(0, this.e, this.f, this.h, this.a, i11 == 1, e);
        }
    }

    public final AudioTrack b(boolean z4, d dVar, int i10) {
        int i11;
        int i12 = h5.d0.a;
        int i13 = this.g;
        int i14 = this.f;
        int i15 = this.e;
        if (i12 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(dVar, z4)).setAudioFormat(k0.g(i15, i14, i13)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i10).setOffloadedPlayback(this.c == 1).build();
        }
        if (i12 >= 21) {
            return new AudioTrack(c(dVar, z4), k0.g(i15, i14, i13), this.h, 1, i10);
        }
        int i16 = dVar.c;
        if (i16 != 13) {
            switch (i16) {
                case 2:
                    i11 = 0;
                    break;
                case 3:
                    i11 = 8;
                    break;
                case 4:
                    i11 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i11 = 5;
                    break;
                case 6:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 1;
        }
        if (i10 == 0) {
            return new AudioTrack(i11, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(i11, this.e, this.f, this.g, this.h, 1, i10);
    }
}
