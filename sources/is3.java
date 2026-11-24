// default package

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class is3 extends rf0 {
    public static final Logger p = Logger.getLogger(is3.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public v83 m;
    public fo9 n;
    public ArrayList o;

    @Override // rf0
    public final void b(ByteBuffer byteBuffer) {
        this.d = hle.f(byteBuffer);
        int a = hle.a(byteBuffer.get());
        int i = a >>> 7;
        this.e = i;
        this.f = (a >>> 6) & 1;
        this.g = (a >>> 5) & 1;
        this.h = a & 31;
        if (i == 1) {
            this.k = hle.f(byteBuffer);
        }
        if (this.f == 1) {
            int a2 = hle.a(byteBuffer.get());
            this.i = a2;
            byte[] bArr = new byte[a2];
            byteBuffer.get(bArr);
            try {
                this.j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.g == 1) {
            this.l = hle.f(byteBuffer);
        }
        int i2 = this.c + 4 + (this.e == 1 ? 2 : 0) + (this.f == 1 ? this.i + 1 : 0) + (this.g == 1 ? 2 : 0);
        int position = byteBuffer.position();
        int a3 = a();
        int i3 = i2 + 2;
        Logger logger = p;
        if (a3 > i3) {
            rf0 a4 = yn7.a(-1, byteBuffer);
            logger.finer(a4 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a4.a()));
            int a5 = a4.a();
            byteBuffer.position(position + a5);
            i2 += a5;
            if (a4 instanceof v83) {
                this.m = (v83) a4;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i2 + 2) {
            rf0 a6 = yn7.a(-1, byteBuffer);
            logger.finer(a6 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a6.a()));
            int a7 = a6.a();
            byteBuffer.position(position2 + a7);
            i2 += a7;
            if (a6 instanceof fo9) {
                this.n = (fo9) a6;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i2 > 2) {
            int position3 = byteBuffer.position();
            rf0 a8 = yn7.a(-1, byteBuffer);
            logger.finer(a8 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a8.a()));
            int a9 = a8.a();
            byteBuffer.position(position3 + a9);
            i2 += a9;
            this.o.add(a8);
        }
    }

    public final int c() {
        int i = this.e > 0 ? 7 : 5;
        if (this.f > 0) {
            i += this.i + 1;
        }
        if (this.g > 0) {
            i += 2;
        }
        y30 y30Var = this.m.j;
        int i2 = 0;
        if (y30Var != null) {
            if (y30Var.e != 2) {
                fyb.i("can't serialize that yet");
                return 0;
            }
            i2 = 4;
        }
        this.n.getClass();
        return i2 + 15 + i + 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && is3.class == obj.getClass()) {
            is3 is3Var = (is3) obj;
            if (this.f == is3Var.f && this.i == is3Var.i && this.k == is3Var.k && this.d == is3Var.d && this.l == is3Var.l && this.g == is3Var.g && this.e == is3Var.e && this.h == is3Var.h) {
                String str = this.j;
                String str2 = is3Var.j;
                if (str == null ? str2 == null : str.equals(str2)) {
                    v83 v83Var = this.m;
                    v83 v83Var2 = is3Var.m;
                    if (v83Var != null) {
                        if (v83Var != v83Var2) {
                            return false;
                        }
                    }
                    ArrayList arrayList = this.o;
                    ArrayList arrayList2 = is3Var.o;
                    if (arrayList == null ? arrayList2 == null : arrayList.equals(arrayList2)) {
                        fo9 fo9Var = this.n;
                        fo9 fo9Var2 = is3Var.n;
                        if (fo9Var != null) {
                            if (fo9Var.equals(fo9Var2)) {
                                return true;
                            }
                        } else if (fo9Var2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 961) + this.k) * 31) + this.l) * 31;
        v83 v83Var = this.m;
        int hashCode2 = (hashCode + (v83Var != null ? v83Var.hashCode() : 0)) * 31;
        fo9 fo9Var = this.n;
        int i2 = (hashCode2 + (fo9Var != null ? fo9Var.d : 0)) * 31;
        ArrayList arrayList = this.o;
        return i2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}
