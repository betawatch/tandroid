package f5;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j7.l1;
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
import org.xmlpull.v1.XmlPullParser;
import q8.l0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public static p B(int i10, int i11, byte[] bArr) {
        int i12;
        int i13;
        v vVar = new v(bArr, i10 + 2, i11);
        int i14 = 4;
        vVar.s(4);
        int i15 = vVar.i(3);
        vVar.r();
        int i16 = vVar.i(2);
        boolean h10 = vVar.h();
        int i17 = vVar.i(5);
        int i18 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (vVar.h()) {
                i18 |= 1 << i19;
            }
        }
        int i20 = 6;
        int[] iArr = new int[6];
        for (int i21 = 0; i21 < 6; i21++) {
            iArr[i21] = vVar.i(8);
        }
        int i22 = i18;
        int i23 = vVar.i(8);
        int i24 = 0;
        for (int i25 = 0; i25 < i15; i25++) {
            if (vVar.h()) {
                i24 += 89;
            }
            if (vVar.h()) {
                i24 += 8;
            }
        }
        vVar.s(i24);
        if (i15 > 0) {
            vVar.s((8 - i15) * 2);
        }
        vVar.l();
        int l10 = vVar.l();
        if (l10 == 3) {
            vVar.r();
        }
        int l11 = vVar.l();
        int l12 = vVar.l();
        if (vVar.h()) {
            int l13 = vVar.l();
            int l14 = vVar.l();
            int l15 = vVar.l();
            int l16 = vVar.l();
            l11 -= (l13 + l14) * ((l10 == 1 || l10 == 2) ? 2 : 1);
            l12 -= (l15 + l16) * (l10 == 1 ? 2 : 1);
        }
        vVar.l();
        vVar.l();
        int l17 = vVar.l();
        for (int i26 = vVar.h() ? 0 : i15; i26 <= i15; i26++) {
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
            int i27 = 0;
            while (i27 < i14) {
                int i28 = 0;
                while (i28 < i20) {
                    if (vVar.h()) {
                        int min = Math.min(64, 1 << ((i27 << 1) + 4));
                        if (i27 > 1) {
                            vVar.m();
                        }
                        for (int i29 = 0; i29 < min; i29++) {
                            vVar.m();
                        }
                    } else {
                        vVar.l();
                    }
                    i28 += i27 == 3 ? 3 : 1;
                    i20 = 6;
                }
                i27++;
                i14 = 4;
                i20 = 6;
            }
        }
        vVar.s(2);
        if (vVar.h()) {
            vVar.s(8);
            vVar.l();
            vVar.l();
            vVar.r();
        }
        int l18 = vVar.l();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i30 = -1;
        int i31 = -1;
        int i32 = 0;
        while (i32 < l18) {
            if (i32 == 0 || !vVar.h()) {
                i12 = l18;
                i13 = l17;
                int l19 = vVar.l();
                int l20 = vVar.l();
                int[] iArr4 = new int[l19];
                for (int i33 = 0; i33 < l19; i33++) {
                    iArr4[i33] = vVar.l() + 1;
                    vVar.r();
                }
                int[] iArr5 = new int[l20];
                for (int i34 = 0; i34 < l20; i34++) {
                    iArr5[i34] = vVar.l() + 1;
                    vVar.r();
                }
                i30 = l19;
                iArr3 = iArr5;
                iArr2 = iArr4;
                i31 = l20;
            } else {
                int i35 = i30 + i31;
                int l21 = (1 - ((vVar.h() ? 1 : 0) * 2)) * (vVar.l() + 1);
                i12 = l18;
                int i36 = i35 + 1;
                int[] iArr6 = iArr2;
                boolean[] zArr = new boolean[i36];
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (vVar.h()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = vVar.h();
                    }
                }
                int[] iArr7 = new int[i36];
                int[] iArr8 = new int[i36];
                int i38 = 0;
                for (int i39 = i31 - 1; i39 >= 0; i39--) {
                    int i40 = iArr3[i39] + l21;
                    if (i40 < 0 && zArr[i30 + i39]) {
                        iArr7[i38] = i40;
                        i38++;
                    }
                }
                if (l21 < 0 && zArr[i35]) {
                    iArr7[i38] = l21;
                    i38++;
                }
                int i41 = i38;
                i13 = l17;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr6[i42] + l21;
                    if (i43 < 0 && zArr[i42]) {
                        iArr7[i41] = i43;
                        i41++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr7, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr6[i45] + l21;
                    if (i46 > 0 && zArr[i45]) {
                        iArr8[i44] = i46;
                        i44++;
                    }
                }
                if (l21 > 0 && zArr[i35]) {
                    iArr8[i44] = l21;
                    i44++;
                }
                int i47 = i41;
                int i48 = i44;
                for (int i49 = 0; i49 < i31; i49++) {
                    int i50 = iArr3[i49] + l21;
                    if (i50 > 0 && zArr[i30 + i49]) {
                        iArr8[i48] = i50;
                        i48++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr8, i48);
                i31 = i48;
                i30 = i47;
            }
            i32++;
            l18 = i12;
            l17 = i13;
        }
        int i51 = l17;
        if (vVar.h()) {
            for (int i52 = 0; i52 < vVar.l(); i52++) {
                vVar.s(i51 + 5);
            }
        }
        vVar.s(2);
        float f9 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i53 = vVar.i(8);
                if (i53 == 255) {
                    int i54 = vVar.i(16);
                    int i55 = vVar.i(16);
                    if (i54 != 0 && i55 != 0) {
                        f9 = i54 / i55;
                    }
                } else if (i53 < 17) {
                    f9 = e[i53];
                } else {
                    com.google.android.recaptcha.internal.a.s(i53, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (vVar.h()) {
                vVar.r();
            }
            if (vVar.h()) {
                vVar.s(4);
                if (vVar.h()) {
                    vVar.s(24);
                }
            }
            if (vVar.h()) {
                vVar.l();
                vVar.l();
            }
            vVar.r();
            if (vVar.h()) {
                l12 *= 2;
            }
        }
        return new p(i16, h10, i17, i22, iArr, i23, l11, l12, f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r C(int i10, int i11, byte[] bArr) {
        int l10;
        boolean h10;
        v vVar;
        int i12;
        boolean z10;
        boolean h11;
        int i13;
        v vVar2 = new v(bArr, i10 + 1, i11);
        int i14 = 8;
        int i15 = vVar2.i(8);
        int i16 = vVar2.i(8);
        int i17 = vVar2.i(8);
        int l11 = vVar2.l();
        if (i15 == 100 || i15 == 110 || i15 == 122 || i15 == 244 || i15 == 44 || i15 == 83 || i15 == 86 || i15 == 118 || i15 == 128 || i15 == 138) {
            l10 = vVar2.l();
            h10 = l10 == 3 ? vVar2.h() : false;
            vVar2.l();
            vVar2.l();
            vVar2.r();
            if (vVar2.h()) {
                int i18 = l10 != 3 ? 8 : 12;
                int i19 = 0;
                while (i19 < i18) {
                    if (vVar2.h()) {
                        int i20 = i19 < 6 ? 16 : 64;
                        int i21 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i20; i23++) {
                            if (i21 != 0) {
                                i21 = ((vVar2.m() + i22) + 256) % 256;
                            }
                            if (i21 != 0) {
                                i22 = i21;
                            }
                        }
                    }
                    i19++;
                }
            }
        } else {
            l10 = 1;
            h10 = false;
        }
        int l12 = vVar2.l() + 4;
        int l13 = vVar2.l();
        if (l13 == 0) {
            i12 = vVar2.l() + 4;
            vVar = vVar2;
        } else {
            if (l13 == 1) {
                boolean h12 = vVar2.h();
                vVar2.m();
                vVar2.m();
                long l14 = vVar2.l();
                vVar = vVar2;
                for (int i24 = 0; i24 < l14; i24++) {
                    vVar.l();
                }
                z10 = h12;
                i14 = 8;
                i12 = 0;
                vVar.l();
                vVar.r();
                int l15 = vVar.l() + 1;
                int l16 = vVar.l() + 1;
                h11 = vVar.h();
                int i25 = 2 - (h11 ? 1 : 0);
                int i26 = l16 * i25;
                if (!h11) {
                    vVar.r();
                }
                vVar.r();
                int i27 = l15 * 16;
                int i28 = i26 * 16;
                if (vVar.h()) {
                    int l17 = vVar.l();
                    int l18 = vVar.l();
                    int l19 = vVar.l();
                    int l20 = vVar.l();
                    if (l10 != 0) {
                        int i29 = l10 == 3 ? 1 : 2;
                        i25 *= l10 == 1 ? 2 : 1;
                        r0 = i29;
                    }
                    i27 -= (l17 + l18) * r0;
                    i28 -= (l19 + l20) * i25;
                }
                int i30 = i27;
                float f9 = 1.0f;
                if (vVar.h() && vVar.h()) {
                    i13 = vVar.i(i14);
                    if (i13 != 255) {
                        int i31 = vVar.i(16);
                        int i32 = vVar.i(16);
                        if (i31 != 0 && i32 != 0) {
                            f9 = i31 / i32;
                        }
                    } else if (i13 < 17) {
                        f9 = e[i13];
                    } else {
                        com.google.android.recaptcha.internal.a.s(i13, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                return new r(i15, i16, i17, l11, i30, i28, f9, h10, h11, l12, l13, i12, z10);
            }
            vVar = vVar2;
            i12 = 0;
        }
        z10 = false;
        vVar.l();
        vVar.r();
        int l152 = vVar.l() + 1;
        int l162 = vVar.l() + 1;
        h11 = vVar.h();
        int i252 = 2 - (h11 ? 1 : 0);
        int i262 = l162 * i252;
        if (!h11) {
        }
        vVar.r();
        int i272 = l152 * 16;
        int i282 = i262 * 16;
        if (vVar.h()) {
        }
        int i302 = i272;
        float f92 = 1.0f;
        if (vVar.h()) {
            i13 = vVar.i(i14);
            if (i13 != 255) {
            }
        }
        return new r(i15, i16, i17, l11, i302, i282, f92, h10, h11, l12, l13, i12, z10);
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

    public static String F(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i14 = i10;
        int i15 = i14;
        while (i14 <= i11) {
            if (i14 == i11) {
                i12 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i12 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i12);
                i11 -= i12 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    i13 = sb2.lastIndexOf("/", i15 - 2) + 1;
                    int i17 = i13 > i10 ? i13 : i10;
                    sb2.delete(i17, i12);
                    i11 -= i12 - i17;
                } else {
                    i13 = i14 + 1;
                }
                i15 = i13;
            }
            i14 = i15;
        }
        return sb2.toString();
    }

    public static String G(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] u10 = u(str2);
        if (u10[0] != -1) {
            sb2.append(str2);
            F(sb2, u10[1], u10[2]);
            return sb2.toString();
        }
        int[] u11 = u(str);
        if (u10[3] == 0) {
            sb2.append((CharSequence) str, 0, u11[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (u10[2] == 0) {
            sb2.append((CharSequence) str, 0, u11[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = u10[1];
        if (i10 != 0) {
            int i11 = u11[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return F(sb2, u10[1] + i11, i11 + u10[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, u11[1]);
            sb2.append(str2);
            int i12 = u11[1];
            return F(sb2, i12, u10[2] + i12);
        }
        int i13 = u11[0] + 2;
        int i14 = u11[1];
        if (i13 >= i14 || i14 != u11[2]) {
            int lastIndexOf = str.lastIndexOf(47, u11[2] - 1);
            int i15 = lastIndexOf == -1 ? u11[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return F(sb2, u11[1], i15 + u10[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = u11[1];
        return F(sb2, i16, u10[2] + i16 + 1);
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(l1.k(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
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
        StringBuilder f9 = u3.c.f(str, "\n  ");
        f9.append(replace.replace("\n", "\n  "));
        f9.append('\n');
        return f9.toString();
    }

    public static void c(String str) {
        if (d0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        Object[] objArr = {b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = d0.a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static void e(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new h(str);
        }
    }

    public static void h(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void i(boolean z10) {
        if (!z10) {
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
            throw new IOException(l1.k(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(l1.k(i10, "SNTP: Untrusted stratum: "));
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

    public static l0 s(j3.f fVar, ArrayList arrayList) {
        q8.x xVar = q8.z.b;
        q8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            j3.g c3 = fVar.c(bundle);
            c3.getClass();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i12));
            }
            objArr[i11] = c3;
            i10++;
            i11 = i12;
        }
        return q8.z.s(i11, objArr);
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
        char c6 = 2;
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
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -1662384011:
                if (str2.equals("video/mp2p")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case -1662384007:
                break;
            case -1662095187:
                if (str2.equals("video/webm")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case -1606874997:
                if (str2.equals("audio/amr-wb")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case -1487394660:
                if (str2.equals("image/jpeg")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case -1248337486:
                if (str2.equals("application/mp4")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case -1079884372:
                if (str2.equals("video/x-msvideo")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case -1004728940:
                if (str2.equals("text/vtt")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case -387023398:
                if (str2.equals("audio/x-matroska")) {
                    c6 = '\t';
                    break;
                }
                c6 = 65535;
                break;
            case -43467528:
                if (str2.equals("application/webm")) {
                    c6 = '\n';
                    break;
                }
                c6 = 65535;
                break;
            case 13915911:
                if (str2.equals("video/x-flv")) {
                    c6 = 11;
                    break;
                }
                c6 = 65535;
                break;
            case 187078296:
                if (str2.equals("audio/ac3")) {
                    c6 = '\f';
                    break;
                }
                c6 = 65535;
                break;
            case 187078297:
                if (str2.equals("audio/ac4")) {
                    c6 = '\r';
                    break;
                }
                c6 = 65535;
                break;
            case 187078669:
                if (str2.equals("audio/amr")) {
                    c6 = 14;
                    break;
                }
                c6 = 65535;
                break;
            case 187090232:
                if (str2.equals("audio/mp4")) {
                    c6 = 15;
                    break;
                }
                c6 = 65535;
                break;
            case 187091926:
                if (str2.equals("audio/ogg")) {
                    c6 = 16;
                    break;
                }
                c6 = 65535;
                break;
            case 187099443:
                if (str2.equals("audio/wav")) {
                    c6 = 17;
                    break;
                }
                c6 = 65535;
                break;
            case 1331848029:
                if (str2.equals("video/mp4")) {
                    c6 = 18;
                    break;
                }
                c6 = 65535;
                break;
            case 1503095341:
                if (str2.equals("audio/3gpp")) {
                    c6 = 19;
                    break;
                }
                c6 = 65535;
                break;
            case 1504578661:
                if (str2.equals("audio/eac3")) {
                    c6 = 20;
                    break;
                }
                c6 = 65535;
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c6 = 21;
                    break;
                }
                c6 = 65535;
                break;
            case 1504824762:
                if (str2.equals("audio/midi")) {
                    c6 = 22;
                    break;
                }
                c6 = 65535;
                break;
            case 1504831518:
                if (str2.equals("audio/mpeg")) {
                    c6 = 23;
                    break;
                }
                c6 = 65535;
                break;
            case 1505118770:
                if (str2.equals("audio/webm")) {
                    c6 = 24;
                    break;
                }
                c6 = 65535;
                break;
            case 2039520277:
                if (str2.equals("video/x-matroska")) {
                    c6 = 25;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
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
