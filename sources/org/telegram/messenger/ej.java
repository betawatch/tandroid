package org.telegram.messenger;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ej {
    public long a;
    public boolean b;
    public boolean c;
    public jj h;
    public boolean i;
    public boolean j;
    public final dj m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final a0.h g = new a0.h();
    public int k = -1;
    public int l = 800;

    public ej() {
        dj djVar = new dj();
        djVar.n = 1.0f;
        this.m = djVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x07e4, code lost:
    
        if (r13[2] > r13[r15]) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if ((org.telegram.messenger.jj.o1(r13.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        bj bjVar;
        float f7;
        int i13;
        int i14;
        int i15;
        float f10;
        byte b10;
        boolean z11;
        jj jjVar;
        TLRPC.Message message;
        float f11;
        float f12;
        this.e.clear();
        this.f.clear();
        this.g.b();
        this.h = null;
        this.l = 800;
        int size = this.d.size();
        boolean z12 = 0;
        boolean z13 = true;
        if (size == 1) {
            this.h = (jj) this.d.get(0);
            return;
        }
        if (size < 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        this.b = false;
        this.c = false;
        this.j = false;
        int i16 = this.n ? size - 1 : 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        float f13 = 1.0f;
        while (true) {
            if (this.n) {
                if (i16 < 0) {
                    break;
                }
                jjVar = (jj) this.d.get(i16);
                if (i16 == (!this.n ? size - 1 : z12)) {
                    jjVar.R2 = null;
                    z16 = jjVar.P3();
                    if (!z16) {
                        TLRPC.Message message2 = jjVar.k;
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null) {
                            if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                TLRPC.Peer peer = message2.peer_id;
                                if (peer.channel_id == 0) {
                                    if (peer.chat_id == 0) {
                                        if (!(jj.o1(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                        }
                                    }
                                }
                            }
                        }
                        z14 = z13;
                        if (!jjVar.I3() || jjVar.U2()) {
                            this.i = z13;
                        }
                    }
                    z14 = z12;
                    if (!jjVar.I3()) {
                    }
                    this.i = z13;
                }
                message = jjVar.k;
                if (message != null && message.invert_media) {
                    this.j = z13;
                }
                TLRPC.PhotoSize w9 = b8.w(jjVar.n0, i0.Z0(z12), z12, null, z12);
                bj bjVar2 = new bj();
                bjVar2.h = (this.n ? i16 != size + (-1) : i16 != 0) ? z12 : z13;
                f11 = w9 != null ? 1.0f : w9.w / w9.h;
                bjVar2.g = f11;
                if (f11 <= 1.2f) {
                    sb2.append("w");
                } else if (f11 < 0.8f) {
                    sb2.append("n");
                } else {
                    sb2.append("q");
                }
                f12 = bjVar2.g;
                f13 += f12;
                if (f12 > 2.0f) {
                    z15 = z13;
                }
                this.f.put(jjVar, bjVar2);
                this.g.k(bjVar2, jjVar.f1());
                this.e.add(bjVar2);
                if (jjVar.z != null) {
                    if (z17 && this.h == null) {
                        this.h = jjVar;
                        z17 = false;
                    } else if (!this.i) {
                        this.h = null;
                    }
                    this.c = true;
                }
                i16 = !this.n ? i16 - 1 : i16 + 1;
                z12 = 0;
                z13 = true;
            } else {
                if (i16 >= size) {
                    break;
                }
                jjVar = (jj) this.d.get(i16);
                if (i16 == (!this.n ? size - 1 : z12)) {
                }
                message = jjVar.k;
                if (message != null) {
                    this.j = z13;
                }
                TLRPC.PhotoSize w92 = b8.w(jjVar.n0, i0.Z0(z12), z12, null, z12);
                bj bjVar22 = new bj();
                bjVar22.h = (this.n ? i16 != size + (-1) : i16 != 0) ? z12 : z13;
                if (w92 != null) {
                }
                bjVar22.g = f11;
                if (f11 <= 1.2f) {
                }
                f12 = bjVar22.g;
                f13 += f12;
                if (f12 > 2.0f) {
                }
                this.f.put(jjVar, bjVar22);
                this.g.k(bjVar22, jjVar.f1());
                this.e.add(bjVar22);
                if (jjVar.z != null) {
                }
                if (!this.n) {
                }
                z12 = 0;
                z13 = true;
            }
        }
        int i17 = 3;
        if (this.i) {
            for (int i18 = 0; i18 < size; i18++) {
                bj bjVar3 = (bj) this.e.get(i18);
                bjVar3.l = 3;
                if (i18 == 0) {
                    bjVar3.l = 7;
                    b10 = 0;
                    bjVar3.h = false;
                    z11 = true;
                } else {
                    b10 = 0;
                    if (i18 == size - 1) {
                        bjVar3.l = 11;
                        z11 = true;
                        bjVar3.h = true;
                    } else {
                        z11 = true;
                        bjVar3.h = false;
                    }
                }
                bjVar3.k = z11;
                bjVar3.g = 1.0f;
                bjVar3.a = b10;
                bjVar3.b = b10;
                byte b11 = (byte) i18;
                bjVar3.c = b11;
                bjVar3.d = b11;
                bjVar3.i = 1000;
                bjVar3.e = this.l;
                bjVar3.f = 100.0f;
            }
            return;
        }
        if (z14) {
            this.l -= 50;
            i10 = zs.Z3;
        } else {
            i10 = zs.e3;
        }
        int L = i0.L(120.0f);
        float L2 = i0.L(120.0f);
        Point point = i0.q;
        int min = (int) (L2 / (Math.min(point.x, point.y) / this.l));
        float L3 = i0.L(40.0f);
        float min2 = Math.min(point.x, point.y);
        float f14 = this.l;
        int i19 = (int) (L3 / (min2 / f14));
        float f15 = f14 / 814.0f;
        float f16 = f13 / size;
        float L4 = i0.L(100.0f) / 814.0f;
        if (size == 1) {
            bj bjVar4 = (bj) this.e.get(0);
            float f17 = this.l / bjVar4.g;
            bjVar4.a(Math.round(Math.min(f17, Math.min(f17, 407.0f))) / 814.0f, 0, 0, 0, 0, this.l, 15);
            i11 = i10;
            z10 = z16;
            i12 = 0;
        } else if (z15 || !(size == 2 || size == 3 || size == 4)) {
            int i20 = 2;
            z10 = z16;
            int size2 = this.e.size();
            float[] fArr = new float[size2];
            for (int i21 = 0; i21 < size; i21++) {
                if (f16 > 1.1f) {
                    fArr[i21] = Math.max(1.0f, ((bj) this.e.get(i21)).g);
                } else {
                    fArr[i21] = Math.min(1.0f, ((bj) this.e.get(i21)).g);
                }
                fArr[i21] = Math.max(0.66667f, Math.min(1.7f, fArr[i21]));
            }
            ArrayList arrayList = new ArrayList();
            int i22 = 1;
            while (i22 < size2) {
                int i23 = size2 - i22;
                if (i22 <= 3 && i23 <= 3) {
                    float e = e(0, i22, fArr);
                    float e7 = e(i22, size2, fArr);
                    cj cjVar = new cj();
                    cjVar.a = new int[]{i22, i23};
                    float[] fArr2 = new float[i20];
                    fArr2[0] = e;
                    fArr2[1] = e7;
                    cjVar.b = fArr2;
                    arrayList.add(cjVar);
                }
                i22++;
                i20 = 2;
            }
            for (int i24 = 1; i24 < size2 - 1; i24++) {
                int i25 = 1;
                while (true) {
                    int i26 = size2 - i24;
                    if (i25 < i26) {
                        int i27 = i26 - i25;
                        if (i24 <= 3) {
                            if (i25 <= (f16 < 0.85f ? 4 : 3) && i27 <= 3) {
                                float e10 = e(0, i24, fArr);
                                int i28 = i24 + i25;
                                float e11 = e(i24, i28, fArr);
                                float e12 = e(i28, size2, fArr);
                                cj cjVar2 = new cj();
                                cjVar2.a = new int[]{i24, i25, i27};
                                cjVar2.b = new float[]{e10, e11, e12};
                                arrayList.add(cjVar2);
                            }
                        }
                        i25++;
                    }
                }
            }
            for (int i29 = 1; i29 < size2 - 2; i29++) {
                int i30 = 1;
                while (true) {
                    int i31 = size2 - i29;
                    if (i30 < i31) {
                        int i32 = 1;
                        while (true) {
                            int i33 = i31 - i30;
                            if (i32 < i33) {
                                int i34 = i33 - i32;
                                if (i29 > i17 || i30 > i17 || i32 > i17 || i34 > i17) {
                                    i14 = i10;
                                    i15 = i17;
                                } else {
                                    i15 = i17;
                                    float e13 = e(0, i29, fArr);
                                    int i35 = i29 + i30;
                                    float e14 = e(i29, i35, fArr);
                                    int i36 = i35 + i32;
                                    float e15 = e(i35, i36, fArr);
                                    float e16 = e(i36, size2, fArr);
                                    cj cjVar3 = new cj();
                                    cjVar3.a = new int[]{i29, i30, i32, i34};
                                    i14 = i10;
                                    float[] fArr3 = new float[4];
                                    fArr3[0] = e13;
                                    fArr3[1] = e14;
                                    fArr3[2] = e15;
                                    fArr3[i15] = e16;
                                    cjVar3.b = fArr3;
                                    arrayList.add(cjVar3);
                                }
                                i32++;
                                i17 = i15;
                                i10 = i14;
                            }
                        }
                        i30++;
                    }
                }
            }
            i11 = i10;
            int i37 = i17;
            float f18 = (this.l / 3) * 4;
            int i38 = 0;
            cj cjVar4 = null;
            float f19 = 0.0f;
            while (i38 < arrayList.size()) {
                cj cjVar5 = (cj) arrayList.get(i38);
                float f20 = Float.MAX_VALUE;
                int i39 = 0;
                float f21 = 0.0f;
                while (true) {
                    float[] fArr4 = cjVar5.b;
                    if (i39 >= fArr4.length) {
                        break;
                    }
                    float f22 = fArr4[i39];
                    f21 += f22;
                    if (f22 < f20) {
                        f20 = f22;
                    }
                    i39++;
                }
                float abs = Math.abs(f21 - f18);
                int[] iArr = cjVar5.a;
                if (iArr.length > 1) {
                    int i40 = iArr[0];
                    int i41 = iArr[1];
                    if (i40 <= i41) {
                        f7 = f18;
                        if (iArr.length <= 2 || i41 <= iArr[2]) {
                            i13 = i37;
                            if (iArr.length > i13) {
                            }
                        }
                    } else {
                        f7 = f18;
                    }
                    i13 = i37;
                    abs *= 1.2f;
                } else {
                    f7 = f18;
                    i13 = i37;
                }
                if (f20 < min) {
                    abs *= 1.5f;
                }
                if (cjVar4 == null || abs < f19) {
                    cjVar4 = cjVar5;
                    f19 = abs;
                }
                i38++;
                i37 = i13;
                f18 = f7;
            }
            if (cjVar4 == null) {
                return;
            }
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            while (true) {
                int[] iArr2 = cjVar4.a;
                if (i44 >= iArr2.length) {
                    break;
                }
                int i45 = iArr2[i44];
                float f23 = cjVar4.b[i44];
                int i46 = this.l;
                int i47 = i45 - 1;
                i42 = Math.max(i42, i47);
                int i48 = 0;
                bj bjVar5 = null;
                while (i48 < i45) {
                    int i49 = (int) (fArr[i43] * f23);
                    int i50 = i46 - i49;
                    bj bjVar6 = (bj) this.e.get(i43);
                    int i51 = i44 == 0 ? 4 : 0;
                    if (i44 == cjVar4.a.length - 1) {
                        i51 |= 8;
                    }
                    if (i48 == 0) {
                        i51 |= 1;
                        if (z10) {
                            bjVar5 = bjVar6;
                        }
                    }
                    if (i48 == i47) {
                        i51 |= 2;
                        if (!z10) {
                            bjVar = bjVar6;
                            bjVar6.a(Math.max(L4, f23 / 814.0f), i48, i48, i44, i44, i49, i51);
                            i43++;
                            i48++;
                            i46 = i50;
                            bjVar5 = bjVar;
                            i47 = i47;
                        }
                    }
                    bjVar = bjVar5;
                    bjVar6.a(Math.max(L4, f23 / 814.0f), i48, i48, i44, i44, i49, i51);
                    i43++;
                    i48++;
                    i46 = i50;
                    bjVar5 = bjVar;
                    i47 = i47;
                }
                bjVar5.e += i46;
                bjVar5.i += i46;
                i44++;
            }
            i12 = i42;
        } else if (size == 2) {
            bj bjVar7 = (bj) this.e.get(0);
            bj bjVar8 = (bj) this.e.get(1);
            String sb3 = sb2.toString();
            if (sb3.equals("ww")) {
                z10 = z16;
                f10 = 0.4f;
                if (f16 > f15 * 1.4d) {
                    float f24 = bjVar7.g;
                    float f25 = bjVar8.g;
                    if (f24 - f25 < 0.2d) {
                        float f26 = this.l;
                        float round = Math.round(Math.min(f26 / f24, Math.min(f26 / f25, 407.0f))) / 814.0f;
                        bjVar7.a(round, 0, 0, 0, 0, this.l, 7);
                        bjVar8.a(round, 0, 0, 1, 1, this.l, 11);
                        i12 = 0;
                        i11 = i10;
                    }
                }
            } else {
                z10 = z16;
                f10 = 0.4f;
            }
            if (sb3.equals("ww") || sb3.equals("qq")) {
                int i52 = this.l / 2;
                float f27 = i52;
                float round2 = Math.round(Math.min(f27 / bjVar7.g, Math.min(f27 / bjVar8.g, 814.0f))) / 814.0f;
                bjVar7.a(round2, 0, 0, 0, 0, i52, 13);
                bjVar8.a(round2, 1, 1, 0, 0, i52, 14);
            } else {
                float f28 = this.l;
                float f29 = bjVar7.g;
                int max = (int) Math.max(f28 * f10, Math.round((f28 / f29) / ((1.0f / bjVar8.g) + (1.0f / f29))));
                int i53 = this.l - max;
                if (i53 < min) {
                    max -= min - i53;
                } else {
                    min = i53;
                }
                float min3 = Math.min(814.0f, Math.round(Math.min(min / bjVar7.g, max / bjVar8.g))) / 814.0f;
                bjVar7.a(min3, 0, 0, 0, 0, min, 13);
                bjVar8.a(min3, 1, 1, 0, 0, max, 14);
            }
            i12 = 1;
            i11 = i10;
        } else {
            z10 = z16;
            if (size == 3) {
                bj bjVar9 = (bj) this.e.get(0);
                bj bjVar10 = (bj) this.e.get(1);
                bj bjVar11 = (bj) this.e.get(2);
                if (sb2.charAt(0) == 'n') {
                    float f30 = bjVar10.g;
                    float min4 = Math.min(407.0f, Math.round((this.l * f30) / (bjVar11.g + f30)));
                    int max2 = (int) Math.max(min, Math.min(this.l * 0.5f, Math.round(Math.min(bjVar11.g * min4, bjVar10.g * r14))));
                    int round3 = Math.round(Math.min((bjVar9.g * 814.0f) + i19, this.l - max2));
                    bjVar9.a(1.0f, 0, 0, 0, 1, round3, 13);
                    float f31 = (814.0f - min4) / 814.0f;
                    bjVar10.a(f31, 1, 1, 0, 0, max2, 6);
                    float f32 = min4 / 814.0f;
                    bjVar11.a(f32, 0, 1, 1, 1, max2, 10);
                    int i54 = this.l;
                    bjVar11.i = i54;
                    bjVar9.m = new float[]{f32, f31};
                    if (z10) {
                        bjVar9.i = i54 - max2;
                    } else {
                        bjVar10.i = i54 - round3;
                        bjVar11.j = round3;
                    }
                    this.b = true;
                } else {
                    float round4 = Math.round(Math.min(this.l / bjVar9.g, 537.24005f)) / 814.0f;
                    bjVar9.a(round4, 0, 1, 0, 0, this.l, 7);
                    int i55 = this.l / 2;
                    float f33 = i55;
                    float min5 = Math.min(814.0f - round4, Math.round(Math.min(f33 / bjVar10.g, f33 / bjVar11.g))) / 814.0f;
                    float f34 = min5 < L4 ? L4 : min5;
                    bjVar10.a(f34, 0, 0, 1, 1, i55, 9);
                    bjVar11.a(f34, 1, 1, 1, 1, i55, 10);
                }
                i11 = i10;
                i12 = 1;
            } else {
                bj bjVar12 = (bj) this.e.get(0);
                bj bjVar13 = (bj) this.e.get(1);
                bj bjVar14 = (bj) this.e.get(2);
                bj bjVar15 = (bj) this.e.get(3);
                if (sb2.charAt(0) == 'w') {
                    float round5 = Math.round(Math.min(this.l / bjVar12.g, 537.24005f)) / 814.0f;
                    bjVar12.a(round5, 0, 2, 0, 0, this.l, 7);
                    float round6 = Math.round(this.l / ((bjVar13.g + bjVar14.g) + bjVar15.g));
                    float f35 = min;
                    int max3 = (int) Math.max(f35, Math.min(this.l * 0.4f, bjVar13.g * round6));
                    int max4 = (int) Math.max(Math.max(f35, this.l * 0.33f), bjVar15.g * round6);
                    int i56 = (this.l - max3) - max4;
                    if (i56 < i0.L(58.0f)) {
                        int L5 = i0.L(58.0f) - i56;
                        i56 = i0.L(58.0f);
                        int i57 = L5 / 2;
                        max3 -= i57;
                        max4 -= L5 - i57;
                    }
                    int i58 = max3;
                    float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                    float f36 = min6 < L4 ? L4 : min6;
                    bjVar13.a(f36, 0, 0, 1, 1, i58, 9);
                    bjVar14.a(f36, 1, 1, 1, 1, i56, 8);
                    bjVar15.a(f36, 2, 2, 1, 1, max4, 10);
                    i12 = 2;
                    i11 = i10;
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / bjVar15.g) + ((1.0f / bjVar14.g) + (1.0f / bjVar13.g)))));
                    float f37 = L;
                    float f38 = max5;
                    float min7 = Math.min(0.33f, Math.max(f37, f38 / bjVar13.g) / 814.0f);
                    float min8 = Math.min(0.33f, Math.max(f37, f38 / bjVar14.g) / 814.0f);
                    float f39 = (1.0f - min7) - min8;
                    int round7 = Math.round(Math.min((bjVar12.g * 814.0f) + i19, this.l - max5));
                    bjVar12.a(min7 + min8 + f39, 0, 0, 0, 2, round7, 13);
                    bjVar13.a(min7, 1, 1, 0, 0, max5, 6);
                    bjVar14.a(min8, 0, 1, 1, 1, max5, 2);
                    bjVar14.i = this.l;
                    bjVar15.a(f39, 0, 1, 2, 2, max5, 10);
                    int i59 = this.l;
                    bjVar15.i = i59;
                    if (z10) {
                        bjVar12.i = i59 - max5;
                    } else {
                        bjVar13.i = i59 - round7;
                        bjVar14.j = round7;
                        bjVar15.j = round7;
                    }
                    bjVar12.m = new float[]{min7, min8, f39};
                    this.b = true;
                    i12 = 1;
                    i11 = i10;
                }
            }
        }
        boolean z18 = (z10 || this.d.isEmpty() || !((jj) this.d.get(0)).P2()) ? false : true;
        for (int i60 = 0; i60 < size; i60++) {
            bj bjVar16 = (bj) this.e.get(i60);
            if (z10) {
                if (bjVar16.a == 0) {
                    bjVar16.i += i11;
                }
                if ((bjVar16.l & 2) != 0) {
                    bjVar16.k = true;
                }
            } else {
                if (bjVar16.b == i12 || (bjVar16.l & 2) != 0) {
                    bjVar16.i += i11;
                }
                if ((bjVar16.l & 1) != 0) {
                    bjVar16.k = true;
                }
            }
            jj jjVar2 = (jj) this.d.get(i60);
            if (!z10 && !z18 && jjVar2.l5()) {
                if (bjVar16.k) {
                    int i61 = bjVar16.i;
                    if (i61 != 1000) {
                        bjVar16.i = i61 + zs.t1;
                    }
                    bjVar16.e += zs.t1;
                } else if ((bjVar16.l & 2) != 0) {
                    int i62 = bjVar16.i;
                    if (i62 != 1000) {
                        bjVar16.i = i62 - 108;
                    } else {
                        int i63 = bjVar16.j;
                        if (i63 != 0) {
                            bjVar16.j = i63 + zs.t1;
                        }
                    }
                }
            }
        }
        if (!z18 || this.b) {
            return;
        }
        int i64 = i0.q.x;
        if (!i0.E && i0.Q1() && (!i0.P1() || w0.b.getResources().getConfiguration().orientation == 2)) {
            i64 -= i0.l1(i64, 0, 0);
        }
        float L6 = i0.L(16.0f);
        float L7 = i0.L(3.0f);
        float f40 = i64;
        int i65 = 0;
        float L8 = (f40 - (L6 * 2.0f)) - (((jj) this.d.get(0)).P2 ? i0.L(71.0f) : 0);
        int i66 = 0;
        while (i66 < size) {
            bj bjVar17 = (bj) this.e.get(i66);
            if ((bjVar17.l & 1) != 0) {
                int i67 = i65;
                int i68 = i67;
                while (i67 < size) {
                    bj bjVar18 = (bj) this.e.get(i67);
                    if (bjVar18.c == bjVar17.c) {
                        i68 += bjVar18.e;
                    }
                    i67++;
                }
                if (i68 > 0) {
                    float f41 = L8 / i68;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i69 = i65; i69 < size; i69++) {
                        bj bjVar19 = (bj) this.e.get(i69);
                        if (bjVar19.c == bjVar17.c) {
                            arrayList2.add(bjVar19);
                        }
                    }
                    Collections.sort(arrayList2, new a4.d(29));
                    int i70 = i65;
                    int i71 = i70;
                    int i72 = i71;
                    while (i70 < arrayList2.size()) {
                        bj bjVar20 = (bj) arrayList2.get(i70);
                        int i73 = i70 == arrayList2.size() + (-1) ? 1 : i65;
                        bjVar20.u = f41;
                        bjVar20.r = (i71 * f41) + L6;
                        int i74 = bjVar20.e;
                        i71 += i74;
                        bjVar20.s = (i74 * f41) - (i73 != 0 ? 0.0f : L7);
                        int round8 = i73 != 0 ? 1000 : Math.round(((((i71 * f41) + L6) - (L7 / 2.0f)) * 1000.0f) / f40);
                        bjVar20.i = round8 - i72;
                        bjVar20.t = (i72 * i64) / 1000.0f;
                        i70++;
                        i72 = round8;
                        i65 = 0;
                    }
                }
            }
            i66++;
            i65 = 0;
        }
    }

    public final jj b(int i10) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jj jjVar = (jj) arrayList.get(i11);
            bj bjVar = (bj) hashMap.get(jjVar);
            if (bjVar != null && (bjVar.l & i10) == i10) {
                return jjVar;
            }
        }
        return null;
    }

    public final jj c() {
        return b(this.n ? 10 : 5);
    }

    public final bj d(jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        bj bjVar = (bj) this.f.get(jjVar);
        if (bjVar != null) {
            return bjVar;
        }
        return (bj) this.g.f(jjVar.f1());
    }

    public final float e(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.l / f7;
    }
}
