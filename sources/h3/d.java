package h3;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public d(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
    }

    public final int a() {
        int i7 = this.a;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        h2.a.l("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i7));
        return -1;
    }

    @Override // h3.a
    public final int getType() {
        return 1752331379;
    }
}
