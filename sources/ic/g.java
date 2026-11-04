package ic;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends b {
    public static final Logger p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public d m;
    public m n;
    public ArrayList o;

    @Override // ic.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = g5.b.h(byteBuffer);
        int a10 = g5.b.a(byteBuffer.get());
        int i3 = a10 >>> 7;
        this.e = i3;
        this.f = (a10 >>> 6) & 1;
        this.g = (a10 >>> 5) & 1;
        this.h = a10 & 31;
        if (i3 == 1) {
            this.k = g5.b.h(byteBuffer);
        }
        if (this.f == 1) {
            int a11 = g5.b.a(byteBuffer.get());
            this.i = a11;
            byte[] bArr = new byte[a11];
            byteBuffer.get(bArr);
            try {
                this.j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        if (this.g == 1) {
            this.l = g5.b.h(byteBuffer);
        }
        int i10 = this.c + 4 + (this.e == 1 ? 2 : 0) + (this.f == 1 ? this.i + 1 : 0) + (this.g == 1 ? 2 : 0);
        int position = byteBuffer.position();
        int a12 = a();
        int i11 = i10 + 2;
        Logger logger = p;
        if (a12 > i11) {
            b a13 = k.a(-1, byteBuffer);
            logger.finer(a13 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a13.a()));
            int a14 = a13.a();
            byteBuffer.position(position + a14);
            i10 += a14;
            if (a13 instanceof d) {
                this.m = (d) a13;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i10 + 2) {
            b a15 = k.a(-1, byteBuffer);
            logger.finer(a15 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a15.a()));
            int a16 = a15.a();
            byteBuffer.position(position2 + a16);
            i10 += a16;
            if (a15 instanceof m) {
                this.n = (m) a15;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i10 > 2) {
            int position3 = byteBuffer.position();
            b a17 = k.a(-1, byteBuffer);
            logger.finer(a17 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a17.a()));
            int a18 = a17.a();
            byteBuffer.position(position3 + a18);
            i10 += a18;
            this.o.add(a17);
        }
    }

    public final int c() {
        int i3;
        int i10 = this.e > 0 ? 7 : 5;
        if (this.f > 0) {
            i10 += this.i + 1;
        }
        if (this.g > 0) {
            i10 += 2;
        }
        a aVar = this.m.j;
        if (aVar == null) {
            i3 = 0;
        } else {
            if (aVar.e != 2) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            i3 = 4;
        }
        int i11 = i3 + 15 + i10;
        this.n.getClass();
        return i11 + 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        ArrayList arrayList = gVar.o;
        if (this.f != gVar.f || this.i != gVar.i || this.k != gVar.k || this.d != gVar.d || this.l != gVar.l || this.g != gVar.g || this.e != gVar.e || this.h != gVar.h) {
            return false;
        }
        String str = this.j;
        if (str != null) {
            if (!str.equals(gVar.j)) {
                return false;
            }
        } else if (gVar.j != null) {
            return false;
        }
        d dVar = this.m;
        if (dVar != null) {
            if (!dVar.equals(gVar.m)) {
                return false;
            }
        } else if (gVar.m != null) {
            return false;
        }
        ArrayList arrayList2 = this.o;
        if (arrayList2 != null) {
            if (!arrayList2.equals(arrayList)) {
                return false;
            }
        } else if (arrayList != null) {
            return false;
        }
        m mVar = this.n;
        m mVar2 = gVar.n;
        return mVar != null ? mVar.equals(mVar2) : mVar2 == null;
    }

    public final int hashCode() {
        int i3 = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int hashCode = (((((i3 + (str != null ? str.hashCode() : 0)) * 961) + this.k) * 31) + this.l) * 31;
        d dVar = this.m;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        m mVar = this.n;
        int i10 = (hashCode2 + (mVar != null ? mVar.d : 0)) * 31;
        ArrayList arrayList = this.o;
        return i10 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}
