// default package

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ie7 implements rw2, Continuation, yyb, vyc, al0, SuccessContinuation, pma, p30, k13, dk6, ti2 {
    public final /* synthetic */ byte a;
    public static final ie7 b = new ie7(1);
    public static final ie7 c = new ie7(2);
    public static final ie7 d = new ie7(3);
    public static final /* synthetic */ ie7 e = new ie7(4);
    public static final ie7 f = new ie7(5);
    public static final ie7 h = new ie7(6);
    public static final ie7 n = new ie7(7);
    public static final ie7 r = new ie7(8);
    public static final ie7 s = new ie7(9);
    public static final ie7 w = new ie7(10);
    public static final /* synthetic */ ie7 x = new ie7(11);
    public static final ie7 y = new ie7(12);
    public static final /* synthetic */ ie7 E = new ie7(13);

    public /* synthetic */ ie7(byte b2) {
        this.a = b2;
    }

    public static MediaCodec b(ep epVar) {
        String str = ((ik6) epVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // al0
    public final int L() {
        return 0;
    }

    @Override // al0
    public final float U0() {
        return 0.0f;
    }

    @Override // dk6
    public final ek6 a(ep epVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(epVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) epVar.d;
            mediaCodec.configure((MediaFormat) epVar.b, surface, (MediaCrypto) epVar.e, (surface == null && ((ik6) epVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new zcb(mediaCodec, (bg6) epVar.f);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    @Override // al0
    public final int a1() {
        return 0;
    }

    @Override // yyb
    public final Object apply(Object obj) {
        switch (this.a) {
        }
        return (byte[]) obj;
    }

    public boolean c(CharSequence charSequence) {
        return false;
    }

    @Override // al0
    public final int d1() {
        return 0;
    }

    @Override // ti2
    public final long e() {
        return System.currentTimeMillis();
    }

    @Override // p30
    public final void i(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            w26.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override // pma
    public final StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // al0
    public final int j0() {
        return 0;
    }

    @Override // al0
    public final int m0() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23, types: [ewa] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v5, types: [pj0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // vyc
    public final qj0 n(String str, ze0 ze0Var, EnumMap enumMap) {
        int i;
        int i2;
        int i3;
        int i4;
        pj0 pj0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        pj0 b2;
        int i9;
        int i10;
        int i11;
        int length;
        kia kiaVar;
        n24 n24Var = n24.b;
        qj0 qj0Var = null;
        Charset forName = enumMap.containsKey(n24Var) ? Charset.forName(enumMap.get(n24Var).toString()) : null;
        n24 n24Var2 = n24.a;
        int parseInt = enumMap.containsKey(n24Var2) ? Integer.parseInt(enumMap.get(n24Var2).toString()) : 33;
        n24 n24Var3 = n24.n;
        byte b3 = 0;
        int parseInt2 = enumMap.containsKey(n24Var3) ? Integer.parseInt(enumMap.get(n24Var3).toString()) : 0;
        if (ze0Var != ze0.a) {
            w26.i(ze0Var, "Can only encode AZTEC, but got ");
            return null;
        }
        byte[] bytes = str.getBytes(forName != null ? forName : StandardCharsets.ISO_8859_1);
        ewa ewaVar = ewa.f;
        int i12 = 4;
        int i13 = 2;
        byte b4 = 46;
        int i14 = 3;
        if (forName != null) {
            ak1 a = ak1.a(forName);
            if (a == null) {
                w26.i(forName, "No ECI code for character set ");
                return null;
            }
            int i15 = a.a[0];
            wpb wpbVar = ewaVar.e(4, 0).b;
            if (i15 < 0) {
                wpbVar.getClass();
                kiaVar = new kia(wpbVar, 0, 3);
                length = 3;
            } else {
                if (i15 > 999999) {
                    w26.j("ECI code must be between 0 and 999999");
                    return null;
                }
                byte[] bytes2 = Integer.toString(i15).getBytes(StandardCharsets.ISO_8859_1);
                int length2 = bytes2.length;
                wpbVar.getClass();
                kia kiaVar2 = new kia(wpbVar, length2, 3);
                int length3 = bytes2.length;
                int i16 = 0;
                while (i16 < length3) {
                    kia kiaVar3 = new kia(kiaVar2, bytes2[i16] - 46, 4);
                    i16++;
                    kiaVar2 = kiaVar3;
                }
                length = (bytes2.length << 2) + 3;
                kiaVar = kiaVar2;
            }
            ewaVar = new ewa(kiaVar, ewaVar.a, 0, ewaVar.d + length);
        }
        List<ewa> singletonList = Collections.singletonList(ewaVar);
        int i17 = 0;
        while (true) {
            boolean z = true;
            if (i17 >= bytes.length) {
                break;
            }
            int i18 = i17 + 1;
            qj0 qj0Var2 = qj0Var;
            byte b5 = i18 < bytes.length ? bytes[i18] : b3;
            byte b6 = bytes[i17];
            if (b6 == 13) {
                if (b5 == 10) {
                    i11 = i13;
                }
                i11 = 0;
            } else if (b6 == 44) {
                if (b5 == 32) {
                    i11 = i12;
                }
                i11 = 0;
            } else if (b6 != b4) {
                if (b6 == 58 && b5 == 32) {
                    i11 = 5;
                }
                i11 = 0;
            } else {
                if (b5 == 32) {
                    i11 = 3;
                }
                i11 = 0;
            }
            if (i11 > 0) {
                LinkedList linkedList = new LinkedList();
                for (ewa ewaVar2 : singletonList) {
                    ewa b7 = ewaVar2.b(i17);
                    linkedList.add(b7.d(i12, i11));
                    if (ewaVar2.a != i12) {
                        linkedList.add(b7.e(i12, i11));
                    }
                    if (i11 == 3 || i11 == i12) {
                        linkedList.add(b7.d(i13, 16 - i11).d(i13, 1));
                    }
                    if (ewaVar2.c > 0) {
                        linkedList.add(ewaVar2.a(i17).a(i18));
                    }
                }
                singletonList = ae5.a(linkedList);
                i17 = i18;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (ewa ewaVar3 : singletonList) {
                    char c2 = (char) (bytes[i17] & 255);
                    int[][] iArr = ae5.c;
                    int i19 = ewaVar3.a;
                    boolean z2 = iArr[i19][c2] > 0 ? z : false;
                    Object obj = qj0Var2;
                    int i20 = 0;
                    while (i20 <= i12) {
                        boolean z3 = z;
                        int i21 = iArr[i20][c2];
                        Object obj2 = obj;
                        if (i21 > 0) {
                            if (obj == null) {
                                obj2 = ewaVar3.b(i17);
                            }
                            ?? r6 = obj2;
                            if (!z2 || i20 == i19 || i20 == i13) {
                                linkedList2.add(r6.d(i20, i21));
                            }
                            if (!z2 && ae5.d[i19][i20] >= 0) {
                                linkedList2.add(r6.e(i20, i21));
                            }
                            obj = r6;
                        }
                        i20++;
                        z = z3;
                        i12 = 4;
                        i13 = 2;
                        obj = obj;
                    }
                    boolean z4 = z;
                    if (ewaVar3.c > 0 || iArr[i19][c2] == 0) {
                        linkedList2.add(ewaVar3.a(i17));
                    }
                    z = z4;
                    i12 = 4;
                    i13 = 2;
                }
                singletonList = ae5.a(linkedList2);
            }
            i17++;
            i12 = 4;
            b3 = 0;
            i13 = 2;
            b4 = 46;
            qj0Var = qj0Var2;
        }
        qj0 qj0Var3 = qj0Var;
        int i22 = 1;
        ewa ewaVar4 = (ewa) Collections.min(singletonList, new is6((byte) 8));
        ewaVar4.getClass();
        ArrayList arrayList = new ArrayList();
        for (wpb wpbVar2 = ewaVar4.b(bytes.length).b; wpbVar2 != null; wpbVar2 = wpbVar2.a) {
            arrayList.add(wpbVar2);
        }
        pj0 pj0Var2 = new pj0();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((wpb) arrayList.get(size)).a(pj0Var2, bytes);
        }
        int i23 = pj0Var2.b;
        int i24 = 11;
        int y2 = ls6.y(i23, parseInt, 100, 11);
        int i25 = i23 + y2;
        int[] iArr2 = w8d.a;
        if (parseInt2 == 0) {
            ?? r8 = qj0Var3;
            int i26 = 0;
            int i27 = 0;
            while (i26 <= 32) {
                int i28 = i26 <= i14 ? i22 : 0;
                if (i28 != 0) {
                    i = i26 + 1;
                    i2 = 88;
                } else {
                    i = i26;
                    i2 = kk7.w1;
                }
                int i29 = (i2 + (i << 4)) * i;
                if (i25 > i29) {
                    i8 = i22;
                    i3 = i27;
                } else {
                    if (r8 == 0 || i27 != iArr2[i]) {
                        i3 = iArr2[i];
                        r8 = w8d.c(pj0Var2, i3);
                    } else {
                        i3 = i27;
                        r8 = r8;
                    }
                    int i30 = i29 - (i29 % i3);
                    if ((i28 == 0 || r8.b <= (i3 << 6)) && r8.b + y2 <= i30) {
                        i4 = i3;
                        pj0Var = r8;
                        i5 = i28;
                        i6 = i;
                        i7 = i29;
                    } else {
                        i8 = i22;
                    }
                }
                i26++;
                i22 = i8;
                i14 = 3;
                i27 = i3;
                r8 = r8;
            }
            w26.j("Data too large for an Aztec code");
            return qj0Var3;
        }
        i5 = parseInt2 < 0 ? 1 : 0;
        i6 = Math.abs(parseInt2);
        if (i6 > (i5 != 0 ? 4 : 32)) {
            w26.j(tb4.n(parseInt2, "Illegal value ", " for layers"));
            return qj0Var3;
        }
        i7 = ((i5 != 0 ? 88 : kk7.w1) + (i6 << 4)) * i6;
        i4 = iArr2[i6];
        int i31 = i7 - (i7 % i4);
        pj0Var = w8d.c(pj0Var2, i4);
        int i32 = pj0Var.b;
        if (y2 + i32 > i31) {
            w26.j("Data to large for user specified layer");
            return qj0Var3;
        }
        if (i5 != 0 && i32 > (i4 << 6)) {
            w26.j("Data to large for user specified layer");
            return qj0Var3;
        }
        pj0 b8 = w8d.b(pj0Var, i7, i4);
        int i33 = pj0Var.b / i4;
        pj0 pj0Var3 = new pj0();
        if (i5 != 0) {
            pj0Var3.b(i6 - 1, 2);
            pj0Var3.b(i33 - 1, 6);
            b2 = w8d.b(pj0Var3, 28, 4);
        } else {
            pj0Var3.b(i6 - 1, 5);
            pj0Var3.b(i33 - 1, 11);
            b2 = w8d.b(pj0Var3, 40, 4);
            i24 = 14;
        }
        int i34 = i24 + (i6 << 2);
        int[] iArr3 = new int[i34];
        if (i5 != 0) {
            for (int i35 = 0; i35 < i34; i35++) {
                iArr3[i35] = i35;
            }
            i9 = i34;
        } else {
            int i36 = i34 / 2;
            i9 = i34 + 1 + (((i36 - 1) / 15) << 1);
            int i37 = i9 / 2;
            for (int i38 = 0; i38 < i36; i38++) {
                iArr3[(i36 - i38) - 1] = (i37 - r10) - 1;
                iArr3[i36 + i38] = (i38 / 15) + i38 + i37 + 1;
            }
        }
        qj0 qj0Var4 = new qj0(i9, i9);
        int i39 = 0;
        int i40 = 0;
        while (i39 < i6) {
            int i41 = ((i6 - i39) << 2) + (i5 != 0 ? 9 : 12);
            int i42 = 0;
            while (i42 < i41) {
                int i43 = i42 << 1;
                int i44 = 0;
                while (i44 < 2) {
                    if (b8.d(i40 + i43 + i44)) {
                        int i45 = i39 << 1;
                        qj0Var4.c(iArr3[i45 + i44], iArr3[i45 + i42]);
                    }
                    if (b8.d((i41 << 1) + i40 + i43 + i44)) {
                        int i46 = i39 << 1;
                        i10 = i5;
                        qj0Var4.c(iArr3[i46 + i42], iArr3[tb4.f(i34, i22, i46, i44)]);
                    } else {
                        i10 = i5;
                    }
                    if (b8.d((i41 << 2) + i40 + i43 + i44)) {
                        int i47 = (i34 - 1) - (i39 << 1);
                        qj0Var4.c(iArr3[i47 - i44], iArr3[i47 - i42]);
                    }
                    if (b8.d((i41 * 6) + i40 + i43 + i44)) {
                        int i48 = i39 << 1;
                        qj0Var4.c(iArr3[((i34 - 1) - i48) - i42], iArr3[i48 + i44]);
                    }
                    i44++;
                    i5 = i10;
                    i22 = 1;
                }
                i42++;
                i22 = 1;
            }
            i40 += i41 << 3;
            i39++;
            i22 = 1;
        }
        int i49 = i5;
        int i50 = i9 / 2;
        int i51 = 0;
        if (i49 != 0) {
            while (i51 < 7) {
                int i52 = (i50 - 3) + i51;
                if (b2.d(i51)) {
                    qj0Var4.c(i52, i50 - 5);
                }
                if (b2.d(i51 + 7)) {
                    qj0Var4.c(i50 + 5, i52);
                }
                if (b2.d(20 - i51)) {
                    qj0Var4.c(i52, i50 + 5);
                }
                if (b2.d(27 - i51)) {
                    qj0Var4.c(i50 - 5, i52);
                }
                i51++;
            }
        } else {
            while (i51 < 10) {
                int i53 = (i51 / 5) + (i50 - 5) + i51;
                if (b2.d(i51)) {
                    qj0Var4.c(i53, i50 - 7);
                }
                if (b2.d(i51 + 10)) {
                    qj0Var4.c(i50 + 7, i53);
                }
                if (b2.d(29 - i51)) {
                    qj0Var4.c(i53, i50 + 7);
                }
                if (b2.d(39 - i51)) {
                    qj0Var4.c(i50 - 7, i53);
                }
                i51++;
            }
        }
        if (i49 != 0) {
            w8d.a(qj0Var4, i50, 5);
        } else {
            w8d.a(qj0Var4, i50, 7);
            int i54 = 0;
            int i55 = 0;
            while (i54 < (i34 / 2) - 1) {
                for (int i56 = i50 & 1; i56 < i9; i56 += 2) {
                    int i57 = i50 - i55;
                    qj0Var4.c(i57, i56);
                    int i58 = i50 + i55;
                    qj0Var4.c(i58, i56);
                    qj0Var4.c(i56, i57);
                    qj0Var4.c(i56, i58);
                }
                i54 += 15;
                i55 += 16;
            }
        }
        int i59 = qj0Var4.a;
        int i60 = qj0Var4.b;
        int max = Math.max(0, i59);
        int max2 = Math.max(0, i60);
        int min = Math.min(max / i59, max2 / i60);
        int i61 = (max - (i59 * min)) / 2;
        int i62 = (max2 - (i60 * min)) / 2;
        qj0 qj0Var5 = new qj0(max, max2);
        int i63 = 0;
        while (i63 < i60) {
            int i64 = i61;
            int i65 = 0;
            while (i65 < i59) {
                if (qj0Var4.b(i65, i63)) {
                    qj0Var5.d(i64, i62, min, min);
                }
                i65++;
                i64 += min;
            }
            i63++;
            i62 += min;
        }
        return qj0Var5;
    }

    @Override // al0
    public final float p0() {
        return -1.0f;
    }

    @Override // al0
    public final float s0() {
        return -1.0f;
    }

    @Override // al0
    public final int t1() {
        return 0;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        yn ynVar = u84.r;
        return null;
    }
}
