// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lc0 extends y1 {
    public static final /* synthetic */ z24 E;
    public static final /* synthetic */ z24 b;
    public static final /* synthetic */ z24 c;
    public static final /* synthetic */ z24 d;
    public static final /* synthetic */ z24 e;
    public static final /* synthetic */ z24 f;
    public static final /* synthetic */ z24 h;
    public static final /* synthetic */ z24 n;
    public static final /* synthetic */ z24 r;
    public static final /* synthetic */ z24 s;
    public static final /* synthetic */ z24 w;
    public static final /* synthetic */ z24 x;
    public static final /* synthetic */ z24 y;
    public mc0 a;

    static {
        z74 z74Var = new z74(lc0.class, "AvcConfigurationBox.java");
        z74Var.e(z74Var.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        z74Var.e(z74Var.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = z74Var.e(z74Var.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f = z74Var.e(z74Var.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = z74Var.e(z74Var.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        n = z74Var.e(z74Var.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        z74Var.e(z74Var.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        r = z74Var.e(z74Var.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        z74Var.e(z74Var.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        s = z74Var.e(z74Var.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        z74Var.e(z74Var.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        w = z74Var.e(z74Var.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        z74Var.e(z74Var.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        z74Var.e(z74Var.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        z74Var.e(z74Var.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        z74Var.e(z74Var.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        z74Var.e(z74Var.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        x = z74Var.e(z74Var.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        y = z74Var.e(z74Var.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        z74Var.e(z74Var.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        z74Var.e(z74Var.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        z74Var.e(z74Var.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        E = z74Var.e(z74Var.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        z74Var.e(z74Var.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        z74Var.e(z74Var.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        z74Var.e(z74Var.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        z74Var.e(z74Var.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        b = z74Var.e(z74Var.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        c = z74Var.e(z74Var.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = z74Var.e(z74Var.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override // y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i;
        mc0 mc0Var = new mc0();
        mc0Var.f = new ArrayList();
        mc0Var.g = new ArrayList();
        mc0Var.h = true;
        mc0Var.i = 1;
        mc0Var.j = 0;
        mc0Var.k = 0;
        mc0Var.l = new ArrayList();
        mc0Var.m = 63;
        mc0Var.n = 7;
        mc0Var.o = 31;
        mc0Var.p = 31;
        mc0Var.q = 31;
        mc0Var.a = hle.i(byteBuffer);
        mc0Var.b = hle.a(byteBuffer.get());
        mc0Var.c = hle.a(byteBuffer.get());
        mc0Var.d = hle.a(byteBuffer.get());
        io7 io7Var = new io7(byteBuffer, (byte) 1);
        mc0Var.m = io7Var.a(6);
        mc0Var.e = io7Var.a(2);
        mc0Var.n = io7Var.a(3);
        int a = io7Var.a(5);
        for (int i2 = 0; i2 < a; i2++) {
            byte[] bArr = new byte[hle.f(byteBuffer)];
            byteBuffer.get(bArr);
            mc0Var.f.add(bArr);
        }
        long a2 = hle.a(byteBuffer.get());
        for (int i3 = 0; i3 < a2; i3++) {
            byte[] bArr2 = new byte[hle.f(byteBuffer)];
            byteBuffer.get(bArr2);
            mc0Var.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            mc0Var.h = false;
        }
        if (mc0Var.h && ((i = mc0Var.b) == 100 || i == 110 || i == 122 || i == 144)) {
            io7 io7Var2 = new io7(byteBuffer, (byte) 1);
            mc0Var.o = io7Var2.a(6);
            mc0Var.i = io7Var2.a(2);
            mc0Var.p = io7Var2.a(5);
            mc0Var.j = io7Var2.a(3);
            mc0Var.q = io7Var2.a(5);
            mc0Var.k = io7Var2.a(3);
            long a3 = hle.a(byteBuffer.get());
            for (int i4 = 0; i4 < a3; i4++) {
                byte[] bArr3 = new byte[hle.f(byteBuffer)];
                byteBuffer.get(bArr3);
                mc0Var.l.add(bArr3);
            }
        } else {
            mc0Var.i = -1;
            mc0Var.j = -1;
            mc0Var.k = -1;
        }
        this.a = mc0Var;
    }

    public final void d(int i) {
        oo1.r(z74.c(e, this, this, new Integer(i)));
        this.a.d = i;
    }

    public final void e(int i) {
        oo1.r(z74.c(c, this, this, new Integer(i)));
        this.a.b = i;
    }

    @Override // y1
    public final void getContent(ByteBuffer byteBuffer) {
        oo1.r(z74.c(y, this, this, byteBuffer));
        mc0 mc0Var = this.a;
        ile.f(mc0Var.a, byteBuffer);
        byteBuffer.put((byte) (mc0Var.b & kk7.d4));
        byteBuffer.put((byte) (mc0Var.c & kk7.d4));
        byteBuffer.put((byte) (mc0Var.d & kk7.d4));
        io7 io7Var = new io7(byteBuffer, (byte) 2);
        io7Var.c(mc0Var.m, 6);
        io7Var.c(mc0Var.e, 2);
        io7Var.c(mc0Var.n, 3);
        io7Var.c(mc0Var.g.size(), 5);
        ArrayList arrayList = mc0Var.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            byte[] bArr = (byte[]) obj;
            ile.d(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (mc0Var.g.size() & kk7.d4));
        ArrayList arrayList2 = mc0Var.g;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            byte[] bArr2 = (byte[]) obj2;
            ile.d(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (mc0Var.h) {
            int i4 = mc0Var.b;
            if (i4 == 100 || i4 == 110 || i4 == 122 || i4 == 144) {
                io7 io7Var2 = new io7(byteBuffer, (byte) 2);
                io7Var2.c(mc0Var.o, 6);
                io7Var2.c(mc0Var.i, 2);
                io7Var2.c(mc0Var.p, 5);
                io7Var2.c(mc0Var.j, 3);
                io7Var2.c(mc0Var.q, 5);
                io7Var2.c(mc0Var.k, 3);
                ArrayList arrayList3 = mc0Var.l;
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    byte[] bArr3 = (byte[]) obj3;
                    ile.d(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override // y1
    public final long getContentSize() {
        int i;
        oo1.r(z74.b(x, this, this));
        mc0 mc0Var = this.a;
        ArrayList arrayList = mc0Var.f;
        int size = arrayList.size();
        long j = 6;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j = j + 2 + ((byte[]) obj).length;
        }
        long j2 = j + 1;
        ArrayList arrayList2 = mc0Var.g;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            j2 = j2 + 2 + ((byte[]) obj2).length;
        }
        if (!mc0Var.h || ((i = mc0Var.b) != 100 && i != 110 && i != 122 && i != 144)) {
            return j2;
        }
        long j3 = j2 + 4;
        ArrayList arrayList3 = mc0Var.l;
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            j3 = j3 + 2 + ((byte[]) obj3).length;
        }
        return j3;
    }

    public final String toString() {
        c5a b2 = z74.b(E, this, this);
        n89.a().getClass();
        n89.b(b2);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.a + '}';
    }
}
