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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class kg7 implements by2, Continuation, z0c, w0d, am0, SuccessContinuation, qoa, p40, w23, gm6, hk2 {
    public final /* synthetic */ byte a;
    public static final kg7 b = new kg7(1);
    public static final kg7 c = new kg7(2);
    public static final kg7 d = new kg7(3);
    public static final /* synthetic */ kg7 e = new kg7(4);
    public static final kg7 f = new kg7(5);
    public static final kg7 h = new kg7(6);
    public static final kg7 n = new kg7(7);
    public static final kg7 r = new kg7(8);
    public static final kg7 s = new kg7(9);
    public static final kg7 w = new kg7(10);
    public static final /* synthetic */ kg7 x = new kg7(11);
    public static final kg7 y = new kg7(12);
    public static final /* synthetic */ kg7 E = new kg7(13);

    public /* synthetic */ kg7(byte b2) {
        this.a = b2;
    }

    public static MediaCodec c(eq eqVar) {
        String str = ((lm6) eqVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // am0
    public final int K1() {
        return 0;
    }

    @Override // am0
    public final int V() {
        return 0;
    }

    @Override // hk2
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // z0c
    public final Object apply(Object obj) {
        switch (this.a) {
        }
        return (byte[]) obj;
    }

    @Override // gm6
    public final hm6 b(eq eqVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c(eqVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) eqVar.d;
            mediaCodec.configure((MediaFormat) eqVar.b, surface, (MediaCrypto) eqVar.e, (surface == null && ((lm6) eqVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new afb(mediaCodec, (bi6) eqVar.f);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    public boolean d(CharSequence charSequence) {
        return false;
    }

    @Override // am0
    public final int g0() {
        return 0;
    }

    @Override // am0
    public final float g1() {
        return 0.0f;
    }

    @Override // am0
    public final int h1() {
        return 0;
    }

    @Override // qoa
    public final StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23, types: [hya] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v5, types: [pk0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // w0d
    public final qk0 r(String str, zf0 zf0Var, EnumMap enumMap) {
        int i;
        int i2;
        int i3;
        int i4;
        pk0 pk0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        pk0 b2;
        int i9;
        int i10;
        int i11;
        int length;
        mka mkaVar;
        y34 y34Var = y34.b;
        qk0 qk0Var = null;
        Charset forName = enumMap.containsKey(y34Var) ? Charset.forName(enumMap.get(y34Var).toString()) : null;
        y34 y34Var2 = y34.a;
        int parseInt = enumMap.containsKey(y34Var2) ? Integer.parseInt(enumMap.get(y34Var2).toString()) : 33;
        y34 y34Var3 = y34.n;
        byte b3 = 0;
        int parseInt2 = enumMap.containsKey(y34Var3) ? Integer.parseInt(enumMap.get(y34Var3).toString()) : 0;
        if (zf0Var != zf0.a) {
            u36.i(zf0Var, "Can only encode AZTEC, but got ");
            return null;
        }
        byte[] bytes = str.getBytes(forName != null ? forName : StandardCharsets.ISO_8859_1);
        hya hyaVar = hya.f;
        int i12 = 4;
        int i13 = 2;
        byte b4 = 46;
        int i14 = 3;
        if (forName != null) {
            il1 a = il1.a(forName);
            if (a == null) {
                u36.i(forName, "No ECI code for character set ");
                return null;
            }
            int i15 = a.a[0];
            xrb xrbVar = hyaVar.e(4, 0).b;
            if (i15 < 0) {
                xrbVar.getClass();
                mkaVar = new mka(xrbVar, 0, 3);
                length = 3;
            } else {
                if (i15 > 999999) {
                    u36.j("ECI code must be between 0 and 999999");
                    return null;
                }
                byte[] bytes2 = Integer.toString(i15).getBytes(StandardCharsets.ISO_8859_1);
                int length2 = bytes2.length;
                xrbVar.getClass();
                mka mkaVar2 = new mka(xrbVar, length2, 3);
                int length3 = bytes2.length;
                int i16 = 0;
                while (i16 < length3) {
                    mka mkaVar3 = new mka(mkaVar2, bytes2[i16] - 46, 4);
                    i16++;
                    mkaVar2 = mkaVar3;
                }
                length = (bytes2.length << 2) + 3;
                mkaVar = mkaVar2;
            }
            hyaVar = new hya(mkaVar, hyaVar.a, 0, hyaVar.d + length);
        }
        List<hya> singletonList = Collections.singletonList(hyaVar);
        int i17 = 0;
        while (true) {
            boolean z = true;
            if (i17 >= bytes.length) {
                break;
            }
            int i18 = i17 + 1;
            qk0 qk0Var2 = qk0Var;
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
                for (hya hyaVar2 : singletonList) {
                    hya b7 = hyaVar2.b(i17);
                    linkedList.add(b7.d(i12, i11));
                    if (hyaVar2.a != i12) {
                        linkedList.add(b7.e(i12, i11));
                    }
                    if (i11 == 3 || i11 == i12) {
                        linkedList.add(b7.d(i13, 16 - i11).d(i13, 1));
                    }
                    if (hyaVar2.c > 0) {
                        linkedList.add(hyaVar2.a(i17).a(i18));
                    }
                }
                singletonList = yf5.a(linkedList);
                i17 = i18;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (hya hyaVar3 : singletonList) {
                    char c2 = (char) (bytes[i17] & 255);
                    int[][] iArr = yf5.c;
                    int i19 = hyaVar3.a;
                    boolean z2 = iArr[i19][c2] > 0 ? z : false;
                    Object obj = qk0Var2;
                    int i20 = 0;
                    while (i20 <= i12) {
                        boolean z3 = z;
                        int i21 = iArr[i20][c2];
                        Object obj2 = obj;
                        if (i21 > 0) {
                            if (obj == null) {
                                obj2 = hyaVar3.b(i17);
                            }
                            ?? r6 = obj2;
                            if (!z2 || i20 == i19 || i20 == i13) {
                                linkedList2.add(r6.d(i20, i21));
                            }
                            if (!z2 && yf5.d[i19][i20] >= 0) {
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
                    if (hyaVar3.c > 0 || iArr[i19][c2] == 0) {
                        linkedList2.add(hyaVar3.a(i17));
                    }
                    z = z4;
                    i12 = 4;
                    i13 = 2;
                }
                singletonList = yf5.a(linkedList2);
            }
            i17++;
            i12 = 4;
            b3 = 0;
            i13 = 2;
            b4 = 46;
            qk0Var = qk0Var2;
        }
        qk0 qk0Var3 = qk0Var;
        int i22 = 1;
        hya hyaVar4 = (hya) Collections.min(singletonList, new ju6((byte) 8));
        hyaVar4.getClass();
        ArrayList arrayList = new ArrayList();
        for (xrb xrbVar2 = hyaVar4.b(bytes.length).b; xrbVar2 != null; xrbVar2 = xrbVar2.a) {
            arrayList.add(xrbVar2);
        }
        pk0 pk0Var2 = new pk0();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((xrb) arrayList.get(size)).a(pk0Var2, bytes);
        }
        int i23 = pk0Var2.b;
        int i24 = 11;
        int z5 = kt6.z(i23, parseInt, 100, 11);
        int i25 = i23 + z5;
        int[] iArr2 = yad.a;
        if (parseInt2 == 0) {
            ?? r8 = qk0Var3;
            int i26 = 0;
            int i27 = 0;
            while (i26 <= 32) {
                int i28 = i26 <= i14 ? i22 : 0;
                if (i28 != 0) {
                    i = i26 + 1;
                    i2 = 88;
                } else {
                    i = i26;
                    i2 = nm7.w1;
                }
                int i29 = (i2 + (i << 4)) * i;
                if (i25 > i29) {
                    i8 = i22;
                    i3 = i27;
                } else {
                    if (r8 == 0 || i27 != iArr2[i]) {
                        i3 = iArr2[i];
                        r8 = yad.c(pk0Var2, i3);
                    } else {
                        i3 = i27;
                        r8 = r8;
                    }
                    int i30 = i29 - (i29 % i3);
                    if ((i28 == 0 || r8.b <= (i3 << 6)) && r8.b + z5 <= i30) {
                        i4 = i3;
                        pk0Var = r8;
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
            u36.j("Data too large for an Aztec code");
            return qk0Var3;
        }
        i5 = parseInt2 < 0 ? 1 : 0;
        i6 = Math.abs(parseInt2);
        if (i6 > (i5 != 0 ? 4 : 32)) {
            u36.j(td4.o(parseInt2, "Illegal value ", " for layers"));
            return qk0Var3;
        }
        i7 = ((i5 != 0 ? 88 : nm7.w1) + (i6 << 4)) * i6;
        i4 = iArr2[i6];
        int i31 = i7 - (i7 % i4);
        pk0Var = yad.c(pk0Var2, i4);
        int i32 = pk0Var.b;
        if (z5 + i32 > i31) {
            u36.j("Data to large for user specified layer");
            return qk0Var3;
        }
        if (i5 != 0 && i32 > (i4 << 6)) {
            u36.j("Data to large for user specified layer");
            return qk0Var3;
        }
        pk0 b8 = yad.b(pk0Var, i7, i4);
        int i33 = pk0Var.b / i4;
        pk0 pk0Var3 = new pk0();
        if (i5 != 0) {
            pk0Var3.b(i6 - 1, 2);
            pk0Var3.b(i33 - 1, 6);
            b2 = yad.b(pk0Var3, 28, 4);
        } else {
            pk0Var3.b(i6 - 1, 5);
            pk0Var3.b(i33 - 1, 11);
            b2 = yad.b(pk0Var3, 40, 4);
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
        qk0 qk0Var4 = new qk0(i9, i9);
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
                        qk0Var4.c(iArr3[i45 + i44], iArr3[i45 + i42]);
                    }
                    if (b8.d((i41 << 1) + i40 + i43 + i44)) {
                        int i46 = i39 << 1;
                        i10 = i5;
                        qk0Var4.c(iArr3[i46 + i42], iArr3[td4.f(i34, i22, i46, i44)]);
                    } else {
                        i10 = i5;
                    }
                    if (b8.d((i41 << 2) + i40 + i43 + i44)) {
                        int i47 = (i34 - 1) - (i39 << 1);
                        qk0Var4.c(iArr3[i47 - i44], iArr3[i47 - i42]);
                    }
                    if (b8.d((i41 * 6) + i40 + i43 + i44)) {
                        int i48 = i39 << 1;
                        qk0Var4.c(iArr3[((i34 - 1) - i48) - i42], iArr3[i48 + i44]);
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
                    qk0Var4.c(i52, i50 - 5);
                }
                if (b2.d(i51 + 7)) {
                    qk0Var4.c(i50 + 5, i52);
                }
                if (b2.d(20 - i51)) {
                    qk0Var4.c(i52, i50 + 5);
                }
                if (b2.d(27 - i51)) {
                    qk0Var4.c(i50 - 5, i52);
                }
                i51++;
            }
        } else {
            while (i51 < 10) {
                int i53 = (i51 / 5) + (i50 - 5) + i51;
                if (b2.d(i51)) {
                    qk0Var4.c(i53, i50 - 7);
                }
                if (b2.d(i51 + 10)) {
                    qk0Var4.c(i50 + 7, i53);
                }
                if (b2.d(29 - i51)) {
                    qk0Var4.c(i53, i50 + 7);
                }
                if (b2.d(39 - i51)) {
                    qk0Var4.c(i50 - 7, i53);
                }
                i51++;
            }
        }
        if (i49 != 0) {
            yad.a(qk0Var4, i50, 5);
        } else {
            yad.a(qk0Var4, i50, 7);
            int i54 = 0;
            int i55 = 0;
            while (i54 < (i34 / 2) - 1) {
                for (int i56 = i50 & 1; i56 < i9; i56 += 2) {
                    int i57 = i50 - i55;
                    qk0Var4.c(i57, i56);
                    int i58 = i50 + i55;
                    qk0Var4.c(i58, i56);
                    qk0Var4.c(i56, i57);
                    qk0Var4.c(i56, i58);
                }
                i54 += 15;
                i55 += 16;
            }
        }
        int i59 = qk0Var4.a;
        int i60 = qk0Var4.b;
        int max = Math.max(0, i59);
        int max2 = Math.max(0, i60);
        int min = Math.min(max / i59, max2 / i60);
        int i61 = (max - (i59 * min)) / 2;
        int i62 = (max2 - (i60 * min)) / 2;
        qk0 qk0Var5 = new qk0(max, max2);
        int i63 = 0;
        while (i63 < i60) {
            int i64 = i61;
            int i65 = 0;
            while (i65 < i59) {
                if (qk0Var4.b(i65, i63)) {
                    qk0Var5.d(i64, i62, min, min);
                }
                i65++;
                i64 += min;
            }
            i63++;
            i62 += min;
        }
        return qk0Var5;
    }

    @Override // am0
    public final int r1() {
        return 0;
    }

    @Override // p40
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            u36.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // am0
    public final int u0() {
        return 0;
    }

    @Override // am0
    public final float w0() {
        return -1.0f;
    }

    @Override // am0
    public final float y0() {
        return -1.0f;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zo zoVar = ua4.r;
        return null;
    }
}
