package h5;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kh.a2;
import org.xmlpull.v1.XmlPullParser;
import s8.i0;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Object c = new Object();
    public static final byte[] d = {0, 0, 0, 1};
    public static final float[] e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f = new Object();
    public static int[] g = new int[10];
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static boolean j;
    public static long k;

    public static void A(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p B(int i10, int i11, byte[] bArr) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int l10;
        v vVar = new v(bArr, i10 + 2, i11);
        int i20 = 4;
        vVar.s(4);
        int i21 = vVar.i(3);
        vVar.r();
        int i22 = vVar.i(2);
        boolean h9 = vVar.h();
        int i23 = vVar.i(5);
        int i24 = 0;
        for (int i25 = 0; i25 < 32; i25++) {
            if (vVar.h()) {
                i24 |= 1 << i25;
            }
        }
        int i26 = 6;
        int[] iArr = new int[6];
        for (int i27 = 0; i27 < 6; i27++) {
            iArr[i27] = vVar.i(8);
        }
        int i28 = i24;
        int i29 = vVar.i(8);
        int i30 = 0;
        for (int i31 = 0; i31 < i21; i31++) {
            if (vVar.h()) {
                i30 += 89;
            }
            if (vVar.h()) {
                i30 += 8;
            }
        }
        vVar.s(i30);
        if (i21 > 0) {
            vVar.s((8 - i21) * 2);
        }
        vVar.l();
        int l11 = vVar.l();
        if (l11 == 3) {
            vVar.r();
        }
        int l12 = vVar.l();
        int l13 = vVar.l();
        if (vVar.h()) {
            int l14 = vVar.l();
            int l15 = vVar.l();
            int l16 = vVar.l();
            int l17 = vVar.l();
            l12 -= (l14 + l15) * ((l11 == 1 || l11 == 2) ? 2 : 1);
            l13 -= (l16 + l17) * (l11 == 1 ? 2 : 1);
        }
        vVar.l();
        vVar.l();
        int l18 = vVar.l();
        for (int i32 = vVar.h() ? 0 : i21; i32 <= i21; i32++) {
            vVar.l();
            vVar.l();
            vVar.l();
        }
        vVar.l();
        vVar.l();
        vVar.l();
        vVar.l();
        vVar.l();
        vVar.l();
        if (vVar.h() && vVar.h()) {
            int i33 = 0;
            while (i33 < i20) {
                int i34 = 0;
                while (i34 < i26) {
                    if (vVar.h()) {
                        int min = Math.min(64, 1 << ((i33 << 1) + 4));
                        if (i33 > 1) {
                            vVar.m();
                        }
                        for (int i35 = 0; i35 < min; i35++) {
                            vVar.m();
                        }
                    } else {
                        vVar.l();
                    }
                    i34 += i33 == 3 ? 3 : 1;
                    i26 = 6;
                }
                i33++;
                i20 = 4;
                i26 = 6;
            }
        }
        vVar.s(2);
        if (vVar.h()) {
            vVar.s(8);
            vVar.l();
            vVar.l();
            vVar.r();
        }
        int l19 = vVar.l();
        int i36 = 0;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i37 = -1;
        int i38 = -1;
        int i39 = -1;
        while (i36 < l19) {
            if (i36 == 0 || !vVar.h()) {
                i17 = l19;
                i18 = i36;
                i19 = l18;
                l10 = vVar.l();
                int l20 = vVar.l();
                int[] iArr4 = new int[l10];
                int i40 = 0;
                while (i40 < l10) {
                    iArr4[i40] = (i40 > 0 ? iArr4[i40 - 1] : 0) - (vVar.l() + 1);
                    vVar.r();
                    i40++;
                }
                int[] iArr5 = new int[l20];
                int i41 = 0;
                while (i41 < l20) {
                    iArr5[i41] = vVar.l() + 1 + (i41 > 0 ? iArr5[i41 - 1] : 0);
                    vVar.r();
                    i41++;
                }
                iArr2 = iArr4;
                iArr3 = iArr5;
                i38 = l20;
            } else {
                int i42 = i39 + i38;
                int l21 = (1 - ((vVar.h() ? 1 : 0) * 2)) * (vVar.l() + 1);
                i17 = l19;
                int i43 = i42 + 1;
                i18 = i36;
                boolean[] zArr = new boolean[i43];
                for (int i44 = 0; i44 <= i42; i44++) {
                    if (vVar.h()) {
                        zArr[i44] = true;
                    } else {
                        zArr[i44] = vVar.h();
                    }
                }
                int[] iArr6 = new int[i43];
                int[] iArr7 = new int[i43];
                int i45 = 0;
                for (int i46 = i38 - 1; i46 >= 0; i46--) {
                    int i47 = iArr3[i46] + l21;
                    if (i47 < 0 && zArr[i39 + i46]) {
                        iArr6[i45] = i47;
                        i45++;
                    }
                }
                if (l21 < 0 && zArr[i42]) {
                    iArr6[i45] = l21;
                    i45++;
                }
                l10 = i45;
                i19 = l18;
                for (int i48 = 0; i48 < i39; i48++) {
                    int i49 = iArr2[i48] + l21;
                    if (i49 < 0 && zArr[i48]) {
                        iArr6[l10] = i49;
                        l10++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr6, l10);
                int i50 = 0;
                for (int i51 = i39 - 1; i51 >= 0; i51--) {
                    int i52 = iArr2[i51] + l21;
                    if (i52 > 0 && zArr[i51]) {
                        iArr7[i50] = i52;
                        i50++;
                    }
                }
                if (l21 > 0 && zArr[i42]) {
                    iArr7[i50] = l21;
                    i50++;
                }
                int i53 = i50;
                for (int i54 = 0; i54 < i38; i54++) {
                    int i55 = iArr3[i54] + l21;
                    if (i55 > 0 && zArr[i39 + i54]) {
                        iArr7[i53] = i55;
                        i53++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr7, i53);
                iArr2 = copyOf;
                i38 = i53;
            }
            i39 = l10;
            i36 = i18 + 1;
            l19 = i17;
            l18 = i19;
        }
        int i56 = l18;
        if (vVar.h()) {
            int l22 = vVar.l();
            for (int i57 = 0; i57 < l22; i57++) {
                vVar.s(i56 + 5);
            }
        }
        vVar.s(2);
        float f10 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i58 = vVar.i(8);
                if (i58 == 255) {
                    int i59 = vVar.i(16);
                    int i60 = vVar.i(16);
                    if (i59 != 0 && i60 != 0) {
                        f10 = i59 / i60;
                    }
                } else if (i58 < 17) {
                    f10 = e[i58];
                } else {
                    e2.c.q(i58, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (vVar.h()) {
                vVar.r();
            }
            if (vVar.h()) {
                vVar.s(3);
                i15 = vVar.h() ? 1 : 2;
                if (vVar.h()) {
                    int i61 = vVar.i(8);
                    int i62 = vVar.i(8);
                    vVar.s(8);
                    i37 = i5.b.b(i61);
                    i16 = i5.b.c(i62);
                    if (vVar.h()) {
                        vVar.l();
                        vVar.l();
                    }
                    vVar.r();
                    if (vVar.h()) {
                        l13 *= 2;
                    }
                    i12 = l13;
                    i13 = i37;
                    i14 = i15;
                    i37 = i16;
                }
            } else {
                i15 = -1;
            }
            i16 = -1;
            if (vVar.h()) {
            }
            vVar.r();
            if (vVar.h()) {
            }
            i12 = l13;
            i13 = i37;
            i14 = i15;
            i37 = i16;
        } else {
            i12 = l13;
            i13 = -1;
            i14 = -1;
        }
        return new p(i22, h9, i23, i28, iArr, i29, l12, i12, f10, i13, i14, i37);
    }

    public static r C(int i10, int i11, byte[] bArr) {
        int l10;
        boolean h9;
        v vVar;
        boolean z4;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        v vVar2 = new v(bArr, i10 + 1, i11);
        int i17 = vVar2.i(8);
        int i18 = vVar2.i(8);
        int i19 = vVar2.i(8);
        int l11 = vVar2.l();
        if (i17 == 100 || i17 == 110 || i17 == 122 || i17 == 244 || i17 == 44 || i17 == 83 || i17 == 86 || i17 == 118 || i17 == 128 || i17 == 138) {
            l10 = vVar2.l();
            h9 = l10 == 3 ? vVar2.h() : false;
            vVar2.l();
            vVar2.l();
            vVar2.r();
            if (vVar2.h()) {
                int i20 = l10 != 3 ? 8 : 12;
                int i21 = 0;
                while (i21 < i20) {
                    if (vVar2.h()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int i23 = 8;
                        int i24 = 8;
                        for (int i25 = 0; i25 < i22; i25++) {
                            if (i23 != 0) {
                                i23 = ((vVar2.m() + i24) + 256) % 256;
                            }
                            if (i23 != 0) {
                                i24 = i23;
                            }
                        }
                    }
                    i21++;
                }
            }
        } else {
            l10 = 1;
            h9 = false;
        }
        int l12 = vVar2.l() + 4;
        int l13 = vVar2.l();
        if (l13 == 0) {
            i12 = vVar2.l() + 4;
            vVar = vVar2;
            z4 = false;
        } else {
            if (l13 == 1) {
                boolean h10 = vVar2.h();
                vVar2.m();
                vVar2.m();
                long l14 = vVar2.l();
                vVar = vVar2;
                for (int i26 = 0; i26 < l14; i26++) {
                    vVar.l();
                }
                z4 = h10;
            } else {
                vVar = vVar2;
                z4 = false;
            }
            i12 = 0;
        }
        vVar.l();
        vVar.r();
        int l15 = vVar.l() + 1;
        int l16 = vVar.l() + 1;
        boolean h11 = vVar.h();
        int i27 = 2 - (h11 ? 1 : 0);
        int i28 = l16 * i27;
        if (!h11) {
            vVar.r();
        }
        vVar.r();
        int i29 = l15 * 16;
        int i30 = i28 * 16;
        if (vVar.h()) {
            int l17 = vVar.l();
            int l18 = vVar.l();
            int l19 = vVar.l();
            int l20 = vVar.l();
            if (l10 == 0) {
                i16 = 1;
            } else {
                i16 = l10 == 3 ? 1 : 2;
                i27 *= l10 == 1 ? 2 : 1;
            }
            i29 -= (l17 + l18) * i16;
            i30 -= (l19 + l20) * i27;
        }
        int i31 = -1;
        float f11 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i32 = vVar.i(8);
                if (i32 == 255) {
                    int i33 = vVar.i(16);
                    int i34 = vVar.i(16);
                    if (i33 != 0 && i34 != 0) {
                        f11 = i33 / i34;
                    }
                } else if (i32 < 17) {
                    f11 = e[i32];
                } else {
                    e2.c.q(i32, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (vVar.h()) {
                vVar.r();
            }
            if (vVar.h()) {
                vVar.s(3);
                int i35 = vVar.h() ? 1 : 2;
                if (vVar.h()) {
                    int i36 = vVar.i(8);
                    int i37 = vVar.i(8);
                    vVar.s(8);
                    i31 = i5.b.b(i36);
                    i15 = i5.b.c(i37);
                    i13 = i12;
                    f10 = f11;
                } else {
                    i13 = i12;
                    f10 = f11;
                    i15 = -1;
                }
                i14 = i35;
                return new r(i17, i18, i19, l11, i29, i30, f10, h9, h11, l12, l13, i13, z4, i31, i14, i15);
            }
            i13 = i12;
            f10 = f11;
        } else {
            i13 = i12;
            f10 = 1.0f;
        }
        i14 = -1;
        i15 = -1;
        return new r(i17, i18, i19, l11, i29, i30, f10, h9, h11, l12, l13, i13, z4, i31, i14, i15);
    }

    public static long D(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long E(int i10, byte[] bArr) {
        long D = D(i10, bArr);
        long D2 = D(i10 + 4, bArr);
        if (D == 0 && D2 == 0) {
            return 0L;
        }
        return ((D2 * 1000) / 4294967296L) + ((D - 2208988800L) * 1000);
    }

    public static String F(StringBuilder sb, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= i11) {
            return sb.toString();
        }
        if (sb.charAt(i10) == '/') {
            i10++;
        }
        int i14 = i10;
        int i15 = i14;
        while (i14 <= i11) {
            if (i14 == i11) {
                i12 = i14;
            } else if (sb.charAt(i14) == '/') {
                i12 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb.charAt(i15) == '.') {
                sb.delete(i15, i12);
                i11 -= i12 - i15;
            } else {
                if (i14 == i15 + 2 && sb.charAt(i15) == '.' && sb.charAt(i16) == '.') {
                    i13 = sb.lastIndexOf("/", i15 - 2) + 1;
                    int i17 = i13 > i10 ? i13 : i10;
                    sb.delete(i17, i12);
                    i11 -= i12 - i17;
                } else {
                    i13 = i14 + 1;
                }
                i15 = i13;
            }
            i14 = i15;
        }
        return sb.toString();
    }

    public static String G(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] u10 = u(str2);
        if (u10[0] != -1) {
            sb.append(str2);
            F(sb, u10[1], u10[2]);
            return sb.toString();
        }
        int[] u11 = u(str);
        if (u10[3] == 0) {
            sb.append((CharSequence) str, 0, u11[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (u10[2] == 0) {
            sb.append((CharSequence) str, 0, u11[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i10 = u10[1];
        if (i10 != 0) {
            int i11 = u11[0] + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return F(sb, u10[1] + i11, i11 + u10[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb.append((CharSequence) str, 0, u11[1]);
            sb.append(str2);
            int i12 = u11[1];
            return F(sb, i12, u10[2] + i12);
        }
        int i13 = u11[0] + 2;
        int i14 = u11[1];
        if (i13 >= i14 || i14 != u11[2]) {
            int lastIndexOf = str.lastIndexOf(47, u11[2] - 1);
            int i15 = lastIndexOf == -1 ? u11[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i15);
            sb.append(str2);
            return F(sb, u11[1], i15 + u10[2]);
        }
        sb.append((CharSequence) str, 0, i14);
        sb.append('/');
        sb.append(str2);
        int i16 = u11[1];
        return F(sb, i16, u10[2] + i16 + 1);
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(a2.j(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static int J(int i10, byte[] bArr) {
        int i11;
        synchronized (f) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = g;
                    if (iArr.length <= i13) {
                        g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    g[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = g[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static void K(String str, String str2) {
        synchronized (c) {
            Log.w(str, str2);
        }
    }

    public static void L(String str, String str2, Exception exc) {
        K(str, b(str2, exc));
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j10;
        char c3;
        synchronized (i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j10 = currentTimeMillis;
                c3 = 0;
            } else {
                long j11 = currentTimeMillis / 1000;
                Long.signum(j11);
                long j12 = currentTimeMillis - (j11 * 1000);
                long j13 = j11 + 2208988800L;
                j10 = currentTimeMillis;
                c3 = 0;
                bArr[40] = (byte) (j13 >> 24);
                bArr[41] = (byte) (j13 >> 16);
                bArr[42] = (byte) (j13 >> 8);
                bArr[43] = (byte) j13;
                long j14 = (j12 * 4294967296L) / 1000;
                bArr[44] = (byte) (j14 >> 24);
                bArr[45] = (byte) (j14 >> 16);
                bArr[46] = (byte) (j14 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j15 = (elapsedRealtime2 - elapsedRealtime) + j10;
            byte b10 = bArr[c3];
            byte b11 = (byte) ((b10 >> 6) & 3);
            byte b12 = (byte) (b10 & 7);
            int i10 = bArr[1] & 255;
            long E = E(24, bArr);
            long E2 = E(32, bArr);
            datagramSocket = datagramSocket2;
            try {
                long E3 = E(40, bArr);
                l(b11, b12, i10, E3);
                long j16 = (j15 + (((E3 - j15) + (E2 - E)) / 2)) - elapsedRealtime2;
                datagramSocket.close();
                return j16;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    datagramSocket.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th2) {
        String replace;
        synchronized (c) {
            try {
                if (th2 != null) {
                    Throwable th3 = th2;
                    while (true) {
                        if (th3 == null) {
                            replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                        if (th3 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th3 = th3.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder f10 = v2.f(str, "\n  ");
        f10.append(replace.replace("\n", "\n  "));
        f10.append('\n');
        return f10.toString();
    }

    public static void c(String str) {
        if (d0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i10, int i11, int i12, int i13, boolean z4, int[] iArr) {
        Object[] objArr = {b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = d0.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb.toString();
    }

    public static void e(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(String str, boolean z4) {
        if (!z4) {
            throw new h(str);
        }
    }

    public static void h(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void i(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void l(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(a2.j(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(a2.j(i10, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void n(String str, String str2) {
        synchronized (c) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, String str2) {
        synchronized (c) {
            Log.e(str, str2);
        }
    }

    public static void p(String str, String str2, Throwable th2) {
        o(str, b(str2, th2));
    }

    public static void q() {
        if (d0.a >= 18) {
            Trace.endSection();
        }
    }

    public static int r(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    m(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static i0 s(j3.f fVar, ArrayList arrayList) {
        s8.t tVar = s8.v.b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            j3.g c3 = fVar.c(bundle);
            c3.getClass();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i12));
            } else if (z4) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = c3;
                i10++;
                i11++;
            }
            z4 = false;
            objArr[i11] = c3;
            i10++;
            i11++;
        }
        return s8.v.s(i11, objArr);
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int[] u(String str) {
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void v(String str, String str2) {
        synchronized (c) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(String str) {
        char c3;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = o.a;
        char c10 = 2;
        switch (str2.hashCode()) {
            case -1007807498:
                if (str2.equals("audio/x-flac")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -586683234:
                if (str2.equals("audio/x-wav")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 187090231:
                if (str2.equals("audio/mp3")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                str2 = "audio/flac";
                break;
            case 1:
                str2 = "audio/wav";
                break;
            case 2:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2.hashCode()) {
            case -2123537834:
                if (str2.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384011:
                if (str2.equals("video/mp2p")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384007:
                break;
            case -1662095187:
                if (str2.equals("video/webm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (str2.equals("audio/amr-wb")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1487394660:
                if (str2.equals("image/jpeg")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1248337486:
                if (str2.equals("application/mp4")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1079884372:
                if (str2.equals("video/x-msvideo")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                if (str2.equals("text/vtt")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -387023398:
                if (str2.equals("audio/x-matroska")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -43467528:
                if (str2.equals("application/webm")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 13915911:
                if (str2.equals("video/x-flv")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str2.equals("audio/ac3")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (str2.equals("audio/ac4")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 187078669:
                if (str2.equals("audio/amr")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 187090232:
                if (str2.equals("audio/mp4")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 187091926:
                if (str2.equals("audio/ogg")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 187099443:
                if (str2.equals("audio/wav")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1331848029:
                if (str2.equals("video/mp4")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (str2.equals("audio/3gpp")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str2.equals("audio/eac3")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1504824762:
                if (str2.equals("audio/midi")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str2.equals("audio/mpeg")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1505118770:
                if (str2.equals("audio/webm")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 2039520277:
                if (str2.equals("video/x-matroska")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
        }
        return -1;
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
