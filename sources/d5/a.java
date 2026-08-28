package d5;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j3.r0;
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
import o8.l0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static void A(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static r B(int i9, int i10, byte[] bArr) {
        int i11;
        int i12;
        x xVar = new x(bArr, i9 + 2, i10);
        int i13 = 4;
        xVar.s(4);
        int i14 = xVar.i(3);
        xVar.r();
        int i15 = xVar.i(2);
        boolean h10 = xVar.h();
        int i16 = xVar.i(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (xVar.h()) {
                i17 |= 1 << i18;
            }
        }
        int i19 = 6;
        int[] iArr = new int[6];
        for (int i20 = 0; i20 < 6; i20++) {
            iArr[i20] = xVar.i(8);
        }
        int i21 = i17;
        int i22 = xVar.i(8);
        int i23 = 0;
        for (int i24 = 0; i24 < i14; i24++) {
            if (xVar.h()) {
                i23 += 89;
            }
            if (xVar.h()) {
                i23 += 8;
            }
        }
        xVar.s(i23);
        if (i14 > 0) {
            xVar.s((8 - i14) * 2);
        }
        xVar.l();
        int l10 = xVar.l();
        if (l10 == 3) {
            xVar.r();
        }
        int l11 = xVar.l();
        int l12 = xVar.l();
        if (xVar.h()) {
            int l13 = xVar.l();
            int l14 = xVar.l();
            int l15 = xVar.l();
            int l16 = xVar.l();
            l11 -= (l13 + l14) * ((l10 == 1 || l10 == 2) ? 2 : 1);
            l12 -= (l15 + l16) * (l10 == 1 ? 2 : 1);
        }
        xVar.l();
        xVar.l();
        int l17 = xVar.l();
        for (int i25 = xVar.h() ? 0 : i14; i25 <= i14; i25++) {
            xVar.l();
            xVar.l();
            xVar.l();
        }
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        if (xVar.h() && xVar.h()) {
            int i26 = 0;
            while (i26 < i13) {
                int i27 = 0;
                while (i27 < i19) {
                    if (xVar.h()) {
                        int min = Math.min(64, 1 << ((i26 << 1) + 4));
                        if (i26 > 1) {
                            xVar.m();
                        }
                        for (int i28 = 0; i28 < min; i28++) {
                            xVar.m();
                        }
                    } else {
                        xVar.l();
                    }
                    i27 += i26 == 3 ? 3 : 1;
                    i19 = 6;
                }
                i26++;
                i13 = 4;
                i19 = 6;
            }
        }
        xVar.s(2);
        if (xVar.h()) {
            xVar.s(8);
            xVar.l();
            xVar.l();
            xVar.r();
        }
        int l18 = xVar.l();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i29 = -1;
        int i30 = -1;
        int i31 = 0;
        while (i31 < l18) {
            if (i31 == 0 || !xVar.h()) {
                i11 = l18;
                i12 = l17;
                int l19 = xVar.l();
                int l20 = xVar.l();
                int[] iArr4 = new int[l19];
                for (int i32 = 0; i32 < l19; i32++) {
                    iArr4[i32] = xVar.l() + 1;
                    xVar.r();
                }
                int[] iArr5 = new int[l20];
                for (int i33 = 0; i33 < l20; i33++) {
                    iArr5[i33] = xVar.l() + 1;
                    xVar.r();
                }
                i29 = l19;
                iArr3 = iArr5;
                iArr2 = iArr4;
                i30 = l20;
            } else {
                int i34 = i29 + i30;
                int l21 = (1 - ((xVar.h() ? 1 : 0) * 2)) * (xVar.l() + 1);
                i11 = l18;
                int i35 = i34 + 1;
                int[] iArr6 = iArr2;
                boolean[] zArr = new boolean[i35];
                for (int i36 = 0; i36 <= i34; i36++) {
                    if (xVar.h()) {
                        zArr[i36] = true;
                    } else {
                        zArr[i36] = xVar.h();
                    }
                }
                int[] iArr7 = new int[i35];
                int[] iArr8 = new int[i35];
                int i37 = 0;
                for (int i38 = i30 - 1; i38 >= 0; i38--) {
                    int i39 = iArr3[i38] + l21;
                    if (i39 < 0 && zArr[i29 + i38]) {
                        iArr7[i37] = i39;
                        i37++;
                    }
                }
                if (l21 < 0 && zArr[i34]) {
                    iArr7[i37] = l21;
                    i37++;
                }
                int i40 = i37;
                i12 = l17;
                for (int i41 = 0; i41 < i29; i41++) {
                    int i42 = iArr6[i41] + l21;
                    if (i42 < 0 && zArr[i41]) {
                        iArr7[i40] = i42;
                        i40++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr7, i40);
                int i43 = 0;
                for (int i44 = i29 - 1; i44 >= 0; i44--) {
                    int i45 = iArr6[i44] + l21;
                    if (i45 > 0 && zArr[i44]) {
                        iArr8[i43] = i45;
                        i43++;
                    }
                }
                if (l21 > 0 && zArr[i34]) {
                    iArr8[i43] = l21;
                    i43++;
                }
                int i46 = i40;
                int i47 = i43;
                for (int i48 = 0; i48 < i30; i48++) {
                    int i49 = iArr3[i48] + l21;
                    if (i49 > 0 && zArr[i29 + i48]) {
                        iArr8[i47] = i49;
                        i47++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr8, i47);
                i30 = i47;
                i29 = i46;
            }
            i31++;
            l18 = i11;
            l17 = i12;
        }
        int i50 = l17;
        if (xVar.h()) {
            for (int i51 = 0; i51 < xVar.l(); i51++) {
                xVar.s(i50 + 5);
            }
        }
        xVar.s(2);
        float f10 = 1.0f;
        if (xVar.h()) {
            if (xVar.h()) {
                int i52 = xVar.i(8);
                if (i52 == 255) {
                    int i53 = xVar.i(16);
                    int i54 = xVar.i(16);
                    if (i53 != 0 && i54 != 0) {
                        f10 = i53 / i54;
                    }
                } else if (i52 < 17) {
                    f10 = e[i52];
                } else {
                    e2.c.t(i52, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (xVar.h()) {
                xVar.r();
            }
            if (xVar.h()) {
                xVar.s(4);
                if (xVar.h()) {
                    xVar.s(24);
                }
            }
            if (xVar.h()) {
                xVar.l();
                xVar.l();
            }
            xVar.r();
            if (xVar.h()) {
                l12 *= 2;
            }
        }
        return new r(i15, h10, i16, i21, iArr, i22, l11, l12, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t C(int i9, int i10, byte[] bArr) {
        int l10;
        boolean h10;
        x xVar;
        int i11;
        boolean z10;
        boolean h11;
        int i12;
        x xVar2 = new x(bArr, i9 + 1, i10);
        int i13 = 8;
        int i14 = xVar2.i(8);
        int i15 = xVar2.i(8);
        int i16 = xVar2.i(8);
        int l11 = xVar2.l();
        if (i14 == 100 || i14 == 110 || i14 == 122 || i14 == 244 || i14 == 44 || i14 == 83 || i14 == 86 || i14 == 118 || i14 == 128 || i14 == 138) {
            l10 = xVar2.l();
            h10 = l10 == 3 ? xVar2.h() : false;
            xVar2.l();
            xVar2.l();
            xVar2.r();
            if (xVar2.h()) {
                int i17 = l10 != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (xVar2.h()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int i20 = 8;
                        int i21 = 8;
                        for (int i22 = 0; i22 < i19; i22++) {
                            if (i20 != 0) {
                                i20 = ((xVar2.m() + i21) + 256) % 256;
                            }
                            if (i20 != 0) {
                                i21 = i20;
                            }
                        }
                    }
                    i18++;
                }
            }
        } else {
            l10 = 1;
            h10 = false;
        }
        int l12 = xVar2.l() + 4;
        int l13 = xVar2.l();
        if (l13 == 0) {
            i11 = xVar2.l() + 4;
            xVar = xVar2;
        } else {
            if (l13 == 1) {
                boolean h12 = xVar2.h();
                xVar2.m();
                xVar2.m();
                long l14 = xVar2.l();
                xVar = xVar2;
                for (int i23 = 0; i23 < l14; i23++) {
                    xVar.l();
                }
                z10 = h12;
                i13 = 8;
                i11 = 0;
                xVar.l();
                xVar.r();
                int l15 = xVar.l() + 1;
                int l16 = xVar.l() + 1;
                h11 = xVar.h();
                int i24 = 2 - (h11 ? 1 : 0);
                int i25 = l16 * i24;
                if (!h11) {
                    xVar.r();
                }
                xVar.r();
                int i26 = l15 * 16;
                int i27 = i25 * 16;
                if (xVar.h()) {
                    int l17 = xVar.l();
                    int l18 = xVar.l();
                    int l19 = xVar.l();
                    int l20 = xVar.l();
                    if (l10 != 0) {
                        int i28 = l10 == 3 ? 1 : 2;
                        i24 *= l10 == 1 ? 2 : 1;
                        r0 = i28;
                    }
                    i26 -= (l17 + l18) * r0;
                    i27 -= (l19 + l20) * i24;
                }
                int i29 = i26;
                float f10 = 1.0f;
                if (xVar.h() && xVar.h()) {
                    i12 = xVar.i(i13);
                    if (i12 != 255) {
                        int i30 = xVar.i(16);
                        int i31 = xVar.i(16);
                        if (i30 != 0 && i31 != 0) {
                            f10 = i30 / i31;
                        }
                    } else if (i12 < 17) {
                        f10 = e[i12];
                    } else {
                        e2.c.t(i12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                return new t(i14, i15, i16, l11, i29, i27, f10, h10, h11, l12, l13, i11, z10);
            }
            xVar = xVar2;
            i11 = 0;
        }
        z10 = false;
        xVar.l();
        xVar.r();
        int l152 = xVar.l() + 1;
        int l162 = xVar.l() + 1;
        h11 = xVar.h();
        int i242 = 2 - (h11 ? 1 : 0);
        int i252 = l162 * i242;
        if (!h11) {
        }
        xVar.r();
        int i262 = l152 * 16;
        int i272 = i252 * 16;
        if (xVar.h()) {
        }
        int i292 = i262;
        float f102 = 1.0f;
        if (xVar.h()) {
            i12 = xVar.i(i13);
            if (i12 != 255) {
            }
        }
        return new t(i14, i15, i16, l11, i292, i272, f102, h10, h11, l12, l13, i11, z10);
    }

    public static long D(int i9, byte[] bArr) {
        int i10 = bArr[i9];
        int i11 = bArr[i9 + 1];
        int i12 = bArr[i9 + 2];
        int i13 = bArr[i9 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long E(int i9, byte[] bArr) {
        long D = D(i9, bArr);
        long D2 = D(i9 + 4, bArr);
        if (D == 0 && D2 == 0) {
            return 0L;
        }
        return ((D2 * 1000) / 4294967296L) + ((D - 2208988800L) * 1000);
    }

    public static String F(StringBuilder sb2, int i9, int i10) {
        int i11;
        int i12;
        if (i9 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i9) == '/') {
            i9++;
        }
        int i13 = i9;
        int i14 = i13;
        while (i13 <= i10) {
            if (i13 == i10) {
                i11 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i11 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i11);
                i10 -= i11 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    i12 = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = i12 > i9 ? i12 : i9;
                    sb2.delete(i16, i11);
                    i10 -= i11 - i16;
                } else {
                    i12 = i13 + 1;
                }
                i14 = i12;
            }
            i13 = i14;
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
        int i9 = u10[1];
        if (i9 != 0) {
            int i10 = u11[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return F(sb2, u10[1] + i10, i10 + u10[2]);
        }
        if (str2.charAt(i9) == '/') {
            sb2.append((CharSequence) str, 0, u11[1]);
            sb2.append(str2);
            int i11 = u11[1];
            return F(sb2, i11, u10[2] + i11);
        }
        int i12 = u11[0] + 2;
        int i13 = u11[1];
        if (i12 >= i13 || i13 != u11[2]) {
            int lastIndexOf = str.lastIndexOf(47, u11[2] - 1);
            int i14 = lastIndexOf == -1 ? u11[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return F(sb2, u11[1], i14 + u10[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = u11[1];
        return F(sb2, i15, u10[2] + i15 + 1);
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer(r0.l(i9, "csd-"), ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }

    public static int J(int i9, byte[] bArr) {
        int i10;
        synchronized (f) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                while (true) {
                    if (i11 >= i9 - 2) {
                        i11 = i9;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i9) {
                    int[] iArr = g;
                    if (iArr.length <= i12) {
                        g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    g[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i9 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = g[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
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
        char c10;
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
                c10 = 0;
            } else {
                long j11 = currentTimeMillis / 1000;
                Long.signum(j11);
                long j12 = currentTimeMillis - (j11 * 1000);
                long j13 = j11 + 2208988800L;
                j10 = currentTimeMillis;
                c10 = 0;
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
            byte b10 = bArr[c10];
            byte b11 = (byte) ((b10 >> 6) & 3);
            byte b12 = (byte) (b10 & 7);
            int i9 = bArr[1] & 255;
            long E = E(24, bArr);
            long E2 = E(32, bArr);
            datagramSocket = datagramSocket2;
            try {
                long E3 = E(40, bArr);
                l(b11, b12, i9, E3);
                long j16 = (j15 + (((E3 - j15) + (E2 - E)) / 2)) - elapsedRealtime2;
                datagramSocket.close();
                return j16;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    datagramSocket.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th) {
        String replace;
        synchronized (c) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
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
        StringBuilder e10 = ta.b.e(str, "\n  ");
        e10.append(replace.replace("\n", "\n  "));
        e10.append('\n');
        return e10.toString();
    }

    public static void c(String str) {
        if (f0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i9, int i10, int i11, int i12, boolean z10, int[] iArr) {
        Object[] objArr = {b[i9], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = f0.a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
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

    public static void h(int i9, int i10) {
        if (i9 < 0 || i9 >= i10) {
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

    public static void l(byte b10, byte b11, int i9, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(r0.l(b11, "SNTP: Untrusted mode: "));
        }
        if (i9 == 0 || i9 > 15) {
            throw new IOException(r0.l(i9, "SNTP: Untrusted stratum: "));
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

    public static void p(String str, String str2, Throwable th) {
        o(str, b(str2, th));
    }

    public static void q() {
        if (f0.a >= 18) {
            Trace.endSection();
        }
    }

    public static int r(byte[] bArr, int i9, int i10, boolean[] zArr) {
        int i11 = i10 - i9;
        i(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            m(zArr);
            return i9 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i9] == 1) {
            m(zArr);
            return i9 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i9] == 0 && bArr[i9 + 1] == 1) {
            m(zArr);
            return i9 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i9 + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    m(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static l0 s(h3.f fVar, ArrayList arrayList) {
        o8.x xVar = o8.z.b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i9);
            bundle.getClass();
            h3.g c10 = fVar.c(bundle);
            c10.getClass();
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i11));
            }
            objArr[i10] = c10;
            i9++;
            i10 = i11;
        }
        return o8.z.s(i10, objArr);
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            if (xmlPullParser.getAttributeName(i9).equals(str)) {
                return xmlPullParser.getAttributeValue(i9);
            }
        }
        return null;
    }

    public static int[] u(String str) {
        int i9;
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
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i9 = str.indexOf(47, indexOf4 + 3);
            if (i9 == -1 || i9 > indexOf2) {
                i9 = indexOf2;
            }
        } else {
            i9 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i9;
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
        char c10;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = q.a;
        char c11 = 2;
        switch (str2.hashCode()) {
            case -1007807498:
                if (str2.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -586683234:
                if (str2.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 187090231:
                if (str2.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
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
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1662384011:
                if (str2.equals("video/mp2p")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1662384007:
                break;
            case -1662095187:
                if (str2.equals("video/webm")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1606874997:
                if (str2.equals("audio/amr-wb")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1487394660:
                if (str2.equals("image/jpeg")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1248337486:
                if (str2.equals("application/mp4")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -1079884372:
                if (str2.equals("video/x-msvideo")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -1004728940:
                if (str2.equals("text/vtt")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -387023398:
                if (str2.equals("audio/x-matroska")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -43467528:
                if (str2.equals("application/webm")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 13915911:
                if (str2.equals("video/x-flv")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 187078296:
                if (str2.equals("audio/ac3")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 187078297:
                if (str2.equals("audio/ac4")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 187078669:
                if (str2.equals("audio/amr")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 187090232:
                if (str2.equals("audio/mp4")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 187091926:
                if (str2.equals("audio/ogg")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 187099443:
                if (str2.equals("audio/wav")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 1331848029:
                if (str2.equals("video/mp4")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 1503095341:
                if (str2.equals("audio/3gpp")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 1504578661:
                if (str2.equals("audio/eac3")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 1504824762:
                if (str2.equals("audio/midi")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 1504831518:
                if (str2.equals("audio/mpeg")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case 1505118770:
                if (str2.equals("audio/webm")) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 2039520277:
                if (str2.equals("video/x-matroska")) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
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
