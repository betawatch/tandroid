// default package

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class at3 extends tf0 {
    public static final Logger p = Logger.getLogger(at3.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public o93 m;
    public zr9 n;
    public ArrayList o;

    @Override // tf0
    public final void b(ByteBuffer byteBuffer) {
        this.d = zpe.f(byteBuffer);
        int a = zpe.a(byteBuffer.get());
        int i = a >>> 7;
        this.e = i;
        this.f = (a >>> 6) & 1;
        this.g = (a >>> 5) & 1;
        this.h = a & 31;
        if (i == 1) {
            this.k = zpe.f(byteBuffer);
        }
        if (this.f == 1) {
            int a2 = zpe.a(byteBuffer.get());
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
            this.l = zpe.f(byteBuffer);
        }
        int i2 = this.c + 4 + (this.e == 1 ? 2 : 0) + (this.f == 1 ? this.i + 1 : 0) + (this.g == 1 ? 2 : 0);
        int position = byteBuffer.position();
        int a3 = a();
        int i3 = i2 + 2;
        Logger logger = p;
        if (a3 > i3) {
            tf0 a4 = yq7.a(-1, byteBuffer);
            logger.finer(a4 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a4.a()));
            int a5 = a4.a();
            byteBuffer.position(position + a5);
            i2 += a5;
            if (a4 instanceof o93) {
                this.m = (o93) a4;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i2 + 2) {
            tf0 a6 = yq7.a(-1, byteBuffer);
            logger.finer(a6 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a6.a()));
            int a7 = a6.a();
            byteBuffer.position(position2 + a7);
            i2 += a7;
            if (a6 instanceof zr9) {
                this.n = (zr9) a6;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i2 > 2) {
            int position3 = byteBuffer.position();
            tf0 a8 = yq7.a(-1, byteBuffer);
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
        z30 z30Var = this.m.j;
        int i2 = 0;
        if (z30Var != null) {
            if (z30Var.e != 2) {
                qyc.c("can't serialize that yet");
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
        if (obj != null && at3.class == obj.getClass()) {
            at3 at3Var = (at3) obj;
            if (this.f == at3Var.f && this.i == at3Var.i && this.k == at3Var.k && this.d == at3Var.d && this.l == at3Var.l && this.g == at3Var.g && this.e == at3Var.e && this.h == at3Var.h) {
                String str = this.j;
                String str2 = at3Var.j;
                if (str == null ? str2 == null : str.equals(str2)) {
                    o93 o93Var = this.m;
                    o93 o93Var2 = at3Var.m;
                    if (o93Var != null) {
                        if (o93Var != o93Var2) {
                            return false;
                        }
                    }
                    ArrayList arrayList = this.o;
                    ArrayList arrayList2 = at3Var.o;
                    if (arrayList == null ? arrayList2 == null : arrayList.equals(arrayList2)) {
                        zr9 zr9Var = this.n;
                        zr9 zr9Var2 = at3Var.n;
                        if (zr9Var != null) {
                            if (zr9Var.equals(zr9Var2)) {
                                return true;
                            }
                        } else if (zr9Var2 == null) {
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
        o93 o93Var = this.m;
        int hashCode2 = (hashCode + (o93Var != null ? o93Var.hashCode() : 0)) * 31;
        zr9 zr9Var = this.n;
        int i2 = (hashCode2 + (zr9Var != null ? zr9Var.d : 0)) * 31;
        ArrayList arrayList = this.o;
        return i2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}
