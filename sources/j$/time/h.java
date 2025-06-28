package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class h implements j$.time.temporal.k, Comparable, Serializable {
    public static final h e;
    public static final h f;
    public static final h g;
    private static final h[] h = new h[24];
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            h[] hVarArr = h;
            if (i >= hVarArr.length) {
                h hVar = hVarArr[0];
                g = hVar;
                h hVar2 = hVarArr[12];
                e = hVar;
                f = new h(23, 59, 59, 999999999);
                return;
            }
            hVarArr[i] = new h(i, 0, 0, 0);
            i++;
        }
    }

    private h(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private int n(j$.time.temporal.l lVar) {
        int i = g.a[((j$.time.temporal.a) lVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / MediaDataController.MAX_STYLE_RUNS_COUNT;
            case 4:
                throw new p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / MediaController.VIDEO_BITRATE_480;
            case 6:
                return (int) (s() / 1000000);
            case 7:
                return this.c;
            case 8:
                return t();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new p("Unsupported field: " + lVar);
        }
    }

    public static h q() {
        j$.time.temporal.a.HOUR_OF_DAY.n(0);
        return h[0];
    }

    public static h r(long j) {
        j$.time.temporal.a.NANO_OF_DAY.n(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        int i4 = (int) (j3 - (i3 * 1000000000));
        return ((i2 | i3) | i4) == 0 ? h[i] : new h(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d;
    }

    @Override // j$.time.temporal.k
    public final q f(j$.time.temporal.l lVar) {
        return j$.time.temporal.j.c(this, lVar);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.NANO_OF_DAY ? s() : lVar == j$.time.temporal.a.MICRO_OF_DAY ? s() / 1000 : n(lVar) : lVar.h(this);
    }

    public final int hashCode() {
        long s = s();
        return (int) (s ^ (s >>> 32));
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.d() || nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g()) {
            return null;
        }
        if (nVar == j$.time.temporal.j.f()) {
            return this;
        }
        if (nVar == j$.time.temporal.j.e()) {
            return null;
        }
        return nVar == j$.time.temporal.j.h() ? j$.time.temporal.b.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final int j(j$.time.temporal.a aVar) {
        return aVar instanceof j$.time.temporal.a ? n(aVar) : j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).o() : lVar != null && lVar.i(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        int compare = Integer.compare(this.a, hVar.a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.b, hVar.b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.c, hVar.c);
        return compare3 == 0 ? Integer.compare(this.d, hVar.d) : compare3;
    }

    public final int o() {
        return this.d;
    }

    public final int p() {
        return this.c;
    }

    public final long s() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int t() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i2 = this.d;
        if (b3 > 0 || i2 > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = MediaController.VIDEO_BITRATE_480;
                if (i2 % MediaController.VIDEO_BITRATE_480 == 0) {
                    i = (i2 / MediaController.VIDEO_BITRATE_480) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                } else {
                    if (i2 % MediaDataController.MAX_STYLE_RUNS_COUNT == 0) {
                        i2 /= MediaDataController.MAX_STYLE_RUNS_COUNT;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }
}
