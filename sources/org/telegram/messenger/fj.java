package org.telegram.messenger;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class fj {
    public long a;
    public boolean b;
    public boolean c;
    public kj h;
    public boolean i;
    public boolean j;
    public final ej m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final a0.h g = new a0.h();
    public int k = -1;
    public int l = 800;

    public fj() {
        ej ejVar = new ej();
        ejVar.n = 1.0f;
        this.m = ejVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x07e4, code lost:
    
        if (r13[2] > r13[r15]) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if ((org.telegram.messenger.kj.o1(r13.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L41;
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
        cj cjVar;
        float f7;
        int i13;
        int i14;
        int i15;
        float f10;
        byte b10;
        boolean z11;
        kj kjVar;
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
            this.h = (kj) this.d.get(0);
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
                kjVar = (kj) this.d.get(i16);
                if (i16 == (!this.n ? size - 1 : z12)) {
                    kjVar.R2 = null;
                    z16 = kjVar.P3();
                    if (!z16) {
                        TLRPC.Message message2 = kjVar.k;
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null) {
                            if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                TLRPC.Peer peer = message2.peer_id;
                                if (peer.channel_id == 0) {
                                    if (peer.chat_id == 0) {
                                        if (!(kj.o1(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                        }
                                    }
                                }
                            }
                        }
                        z14 = z13;
                        if (!kjVar.I3() || kjVar.U2()) {
                            this.i = z13;
                        }
                    }
                    z14 = z12;
                    if (!kjVar.I3()) {
                    }
                    this.i = z13;
                }
                message = kjVar.k;
                if (message != null && message.invert_media) {
                    this.j = z13;
                }
                TLRPC.PhotoSize w9 = b8.w(kjVar.n0, i0.Z0(z12), z12, null, z12);
                cj cjVar2 = new cj();
                cjVar2.h = (this.n ? i16 != size + (-1) : i16 != 0) ? z12 : z13;
                f11 = w9 != null ? 1.0f : w9.w / w9.h;
                cjVar2.g = f11;
                if (f11 <= 1.2f) {
                    sb2.append("w");
                } else if (f11 < 0.8f) {
                    sb2.append("n");
                } else {
                    sb2.append("q");
                }
                f12 = cjVar2.g;
                f13 += f12;
                if (f12 > 2.0f) {
                    z15 = z13;
                }
                this.f.put(kjVar, cjVar2);
                this.g.k(cjVar2, kjVar.f1());
                this.e.add(cjVar2);
                if (kjVar.z != null) {
                    if (z17 && this.h == null) {
                        this.h = kjVar;
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
                kjVar = (kj) this.d.get(i16);
                if (i16 == (!this.n ? size - 1 : z12)) {
                }
                message = kjVar.k;
                if (message != null) {
                    this.j = z13;
                }
                TLRPC.PhotoSize w92 = b8.w(kjVar.n0, i0.Z0(z12), z12, null, z12);
                cj cjVar22 = new cj();
                cjVar22.h = (this.n ? i16 != size + (-1) : i16 != 0) ? z12 : z13;
                if (w92 != null) {
                }
                cjVar22.g = f11;
                if (f11 <= 1.2f) {
                }
                f12 = cjVar22.g;
                f13 += f12;
                if (f12 > 2.0f) {
                }
                this.f.put(kjVar, cjVar22);
                this.g.k(cjVar22, kjVar.f1());
                this.e.add(cjVar22);
                if (kjVar.z != null) {
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
                cj cjVar3 = (cj) this.e.get(i18);
                cjVar3.l = 3;
                if (i18 == 0) {
                    cjVar3.l = 7;
                    b10 = 0;
                    cjVar3.h = false;
                    z11 = true;
                } else {
                    b10 = 0;
                    if (i18 == size - 1) {
                        cjVar3.l = 11;
                        z11 = true;
                        cjVar3.h = true;
                    } else {
                        z11 = true;
                        cjVar3.h = false;
                    }
                }
                cjVar3.k = z11;
                cjVar3.g = 1.0f;
                cjVar3.a = b10;
                cjVar3.b = b10;
                byte b11 = (byte) i18;
                cjVar3.c = b11;
                cjVar3.d = b11;
                cjVar3.i = 1000;
                cjVar3.e = this.l;
                cjVar3.f = 100.0f;
            }
            return;
        }
        if (z14) {
            this.l -= 50;
            i10 = at.Z3;
        } else {
            i10 = at.e3;
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
            cj cjVar4 = (cj) this.e.get(0);
            float f17 = this.l / cjVar4.g;
            cjVar4.a(Math.round(Math.min(f17, Math.min(f17, 407.0f))) / 814.0f, 0, 0, 0, 0, this.l, 15);
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
                    fArr[i21] = Math.max(1.0f, ((cj) this.e.get(i21)).g);
                } else {
                    fArr[i21] = Math.min(1.0f, ((cj) this.e.get(i21)).g);
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
                    dj djVar = new dj();
                    djVar.a = new int[]{i22, i23};
                    float[] fArr2 = new float[i20];
                    fArr2[0] = e;
                    fArr2[1] = e7;
                    djVar.b = fArr2;
                    arrayList.add(djVar);
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
                                dj djVar2 = new dj();
                                djVar2.a = new int[]{i24, i25, i27};
                                djVar2.b = new float[]{e10, e11, e12};
                                arrayList.add(djVar2);
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
                                    dj djVar3 = new dj();
                                    djVar3.a = new int[]{i29, i30, i32, i34};
                                    i14 = i10;
                                    float[] fArr3 = new float[4];
                                    fArr3[0] = e13;
                                    fArr3[1] = e14;
                                    fArr3[2] = e15;
                                    fArr3[i15] = e16;
                                    djVar3.b = fArr3;
                                    arrayList.add(djVar3);
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
            dj djVar4 = null;
            float f19 = 0.0f;
            while (i38 < arrayList.size()) {
                dj djVar5 = (dj) arrayList.get(i38);
                float f20 = Float.MAX_VALUE;
                int i39 = 0;
                float f21 = 0.0f;
                while (true) {
                    float[] fArr4 = djVar5.b;
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
                int[] iArr = djVar5.a;
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
                if (djVar4 == null || abs < f19) {
                    djVar4 = djVar5;
                    f19 = abs;
                }
                i38++;
                i37 = i13;
                f18 = f7;
            }
            if (djVar4 == null) {
                return;
            }
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            while (true) {
                int[] iArr2 = djVar4.a;
                if (i44 >= iArr2.length) {
                    break;
                }
                int i45 = iArr2[i44];
                float f23 = djVar4.b[i44];
                int i46 = this.l;
                int i47 = i45 - 1;
                i42 = Math.max(i42, i47);
                int i48 = 0;
                cj cjVar5 = null;
                while (i48 < i45) {
                    int i49 = (int) (fArr[i43] * f23);
                    int i50 = i46 - i49;
                    cj cjVar6 = (cj) this.e.get(i43);
                    int i51 = i44 == 0 ? 4 : 0;
                    if (i44 == djVar4.a.length - 1) {
                        i51 |= 8;
                    }
                    if (i48 == 0) {
                        i51 |= 1;
                        if (z10) {
                            cjVar5 = cjVar6;
                        }
                    }
                    if (i48 == i47) {
                        i51 |= 2;
                        if (!z10) {
                            cjVar = cjVar6;
                            cjVar6.a(Math.max(L4, f23 / 814.0f), i48, i48, i44, i44, i49, i51);
                            i43++;
                            i48++;
                            i46 = i50;
                            cjVar5 = cjVar;
                            i47 = i47;
                        }
                    }
                    cjVar = cjVar5;
                    cjVar6.a(Math.max(L4, f23 / 814.0f), i48, i48, i44, i44, i49, i51);
                    i43++;
                    i48++;
                    i46 = i50;
                    cjVar5 = cjVar;
                    i47 = i47;
                }
                cjVar5.e += i46;
                cjVar5.i += i46;
                i44++;
            }
            i12 = i42;
        } else if (size == 2) {
            cj cjVar7 = (cj) this.e.get(0);
            cj cjVar8 = (cj) this.e.get(1);
            String sb3 = sb2.toString();
            if (sb3.equals("ww")) {
                z10 = z16;
                f10 = 0.4f;
                if (f16 > f15 * 1.4d) {
                    float f24 = cjVar7.g;
                    float f25 = cjVar8.g;
                    if (f24 - f25 < 0.2d) {
                        float f26 = this.l;
                        float round = Math.round(Math.min(f26 / f24, Math.min(f26 / f25, 407.0f))) / 814.0f;
                        cjVar7.a(round, 0, 0, 0, 0, this.l, 7);
                        cjVar8.a(round, 0, 0, 1, 1, this.l, 11);
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
                float round2 = Math.round(Math.min(f27 / cjVar7.g, Math.min(f27 / cjVar8.g, 814.0f))) / 814.0f;
                cjVar7.a(round2, 0, 0, 0, 0, i52, 13);
                cjVar8.a(round2, 1, 1, 0, 0, i52, 14);
            } else {
                float f28 = this.l;
                float f29 = cjVar7.g;
                int max = (int) Math.max(f28 * f10, Math.round((f28 / f29) / ((1.0f / cjVar8.g) + (1.0f / f29))));
                int i53 = this.l - max;
                if (i53 < min) {
                    max -= min - i53;
                } else {
                    min = i53;
                }
                float min3 = Math.min(814.0f, Math.round(Math.min(min / cjVar7.g, max / cjVar8.g))) / 814.0f;
                cjVar7.a(min3, 0, 0, 0, 0, min, 13);
                cjVar8.a(min3, 1, 1, 0, 0, max, 14);
            }
            i12 = 1;
            i11 = i10;
        } else {
            z10 = z16;
            if (size == 3) {
                cj cjVar9 = (cj) this.e.get(0);
                cj cjVar10 = (cj) this.e.get(1);
                cj cjVar11 = (cj) this.e.get(2);
                if (sb2.charAt(0) == 'n') {
                    float f30 = cjVar10.g;
                    float min4 = Math.min(407.0f, Math.round((this.l * f30) / (cjVar11.g + f30)));
                    int max2 = (int) Math.max(min, Math.min(this.l * 0.5f, Math.round(Math.min(cjVar11.g * min4, cjVar10.g * r14))));
                    int round3 = Math.round(Math.min((cjVar9.g * 814.0f) + i19, this.l - max2));
                    cjVar9.a(1.0f, 0, 0, 0, 1, round3, 13);
                    float f31 = (814.0f - min4) / 814.0f;
                    cjVar10.a(f31, 1, 1, 0, 0, max2, 6);
                    float f32 = min4 / 814.0f;
                    cjVar11.a(f32, 0, 1, 1, 1, max2, 10);
                    int i54 = this.l;
                    cjVar11.i = i54;
                    cjVar9.m = new float[]{f32, f31};
                    if (z10) {
                        cjVar9.i = i54 - max2;
                    } else {
                        cjVar10.i = i54 - round3;
                        cjVar11.j = round3;
                    }
                    this.b = true;
                } else {
                    float round4 = Math.round(Math.min(this.l / cjVar9.g, 537.24005f)) / 814.0f;
                    cjVar9.a(round4, 0, 1, 0, 0, this.l, 7);
                    int i55 = this.l / 2;
                    float f33 = i55;
                    float min5 = Math.min(814.0f - round4, Math.round(Math.min(f33 / cjVar10.g, f33 / cjVar11.g))) / 814.0f;
                    float f34 = min5 < L4 ? L4 : min5;
                    cjVar10.a(f34, 0, 0, 1, 1, i55, 9);
                    cjVar11.a(f34, 1, 1, 1, 1, i55, 10);
                }
                i11 = i10;
                i12 = 1;
            } else {
                cj cjVar12 = (cj) this.e.get(0);
                cj cjVar13 = (cj) this.e.get(1);
                cj cjVar14 = (cj) this.e.get(2);
                cj cjVar15 = (cj) this.e.get(3);
                if (sb2.charAt(0) == 'w') {
                    float round5 = Math.round(Math.min(this.l / cjVar12.g, 537.24005f)) / 814.0f;
                    cjVar12.a(round5, 0, 2, 0, 0, this.l, 7);
                    float round6 = Math.round(this.l / ((cjVar13.g + cjVar14.g) + cjVar15.g));
                    float f35 = min;
                    int max3 = (int) Math.max(f35, Math.min(this.l * 0.4f, cjVar13.g * round6));
                    int max4 = (int) Math.max(Math.max(f35, this.l * 0.33f), cjVar15.g * round6);
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
                    cjVar13.a(f36, 0, 0, 1, 1, i58, 9);
                    cjVar14.a(f36, 1, 1, 1, 1, i56, 8);
                    cjVar15.a(f36, 2, 2, 1, 1, max4, 10);
                    i12 = 2;
                    i11 = i10;
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / cjVar15.g) + ((1.0f / cjVar14.g) + (1.0f / cjVar13.g)))));
                    float f37 = L;
                    float f38 = max5;
                    float min7 = Math.min(0.33f, Math.max(f37, f38 / cjVar13.g) / 814.0f);
                    float min8 = Math.min(0.33f, Math.max(f37, f38 / cjVar14.g) / 814.0f);
                    float f39 = (1.0f - min7) - min8;
                    int round7 = Math.round(Math.min((cjVar12.g * 814.0f) + i19, this.l - max5));
                    cjVar12.a(min7 + min8 + f39, 0, 0, 0, 2, round7, 13);
                    cjVar13.a(min7, 1, 1, 0, 0, max5, 6);
                    cjVar14.a(min8, 0, 1, 1, 1, max5, 2);
                    cjVar14.i = this.l;
                    cjVar15.a(f39, 0, 1, 2, 2, max5, 10);
                    int i59 = this.l;
                    cjVar15.i = i59;
                    if (z10) {
                        cjVar12.i = i59 - max5;
                    } else {
                        cjVar13.i = i59 - round7;
                        cjVar14.j = round7;
                        cjVar15.j = round7;
                    }
                    cjVar12.m = new float[]{min7, min8, f39};
                    this.b = true;
                    i12 = 1;
                    i11 = i10;
                }
            }
        }
        boolean z18 = (z10 || this.d.isEmpty() || !((kj) this.d.get(0)).P2()) ? false : true;
        for (int i60 = 0; i60 < size; i60++) {
            cj cjVar16 = (cj) this.e.get(i60);
            if (z10) {
                if (cjVar16.a == 0) {
                    cjVar16.i += i11;
                }
                if ((cjVar16.l & 2) != 0) {
                    cjVar16.k = true;
                }
            } else {
                if (cjVar16.b == i12 || (cjVar16.l & 2) != 0) {
                    cjVar16.i += i11;
                }
                if ((cjVar16.l & 1) != 0) {
                    cjVar16.k = true;
                }
            }
            kj kjVar2 = (kj) this.d.get(i60);
            if (!z10 && !z18 && kjVar2.l5()) {
                if (cjVar16.k) {
                    int i61 = cjVar16.i;
                    if (i61 != 1000) {
                        cjVar16.i = i61 + at.t1;
                    }
                    cjVar16.e += at.t1;
                } else if ((cjVar16.l & 2) != 0) {
                    int i62 = cjVar16.i;
                    if (i62 != 1000) {
                        cjVar16.i = i62 - 108;
                    } else {
                        int i63 = cjVar16.j;
                        if (i63 != 0) {
                            cjVar16.j = i63 + at.t1;
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
        float L8 = (f40 - (L6 * 2.0f)) - (((kj) this.d.get(0)).P2 ? i0.L(71.0f) : 0);
        int i66 = 0;
        while (i66 < size) {
            cj cjVar17 = (cj) this.e.get(i66);
            if ((cjVar17.l & 1) != 0) {
                int i67 = i65;
                int i68 = i67;
                while (i67 < size) {
                    cj cjVar18 = (cj) this.e.get(i67);
                    if (cjVar18.c == cjVar17.c) {
                        i68 += cjVar18.e;
                    }
                    i67++;
                }
                if (i68 > 0) {
                    float f41 = L8 / i68;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i69 = i65; i69 < size; i69++) {
                        cj cjVar19 = (cj) this.e.get(i69);
                        if (cjVar19.c == cjVar17.c) {
                            arrayList2.add(cjVar19);
                        }
                    }
                    Collections.sort(arrayList2, new a4.d(29));
                    int i70 = i65;
                    int i71 = i70;
                    int i72 = i71;
                    while (i70 < arrayList2.size()) {
                        cj cjVar20 = (cj) arrayList2.get(i70);
                        int i73 = i70 == arrayList2.size() + (-1) ? 1 : i65;
                        cjVar20.u = f41;
                        cjVar20.r = (i71 * f41) + L6;
                        int i74 = cjVar20.e;
                        i71 += i74;
                        cjVar20.s = (i74 * f41) - (i73 != 0 ? 0.0f : L7);
                        int round8 = i73 != 0 ? 1000 : Math.round(((((i71 * f41) + L6) - (L7 / 2.0f)) * 1000.0f) / f40);
                        cjVar20.i = round8 - i72;
                        cjVar20.t = (i72 * i64) / 1000.0f;
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

    public final kj b(int i10) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            kj kjVar = (kj) arrayList.get(i11);
            cj cjVar = (cj) hashMap.get(kjVar);
            if (cjVar != null && (cjVar.l & i10) == i10) {
                return kjVar;
            }
        }
        return null;
    }

    public final kj c() {
        return b(this.n ? 10 : 5);
    }

    public final cj d(kj kjVar) {
        if (kjVar == null) {
            return null;
        }
        cj cjVar = (cj) this.f.get(kjVar);
        if (cjVar != null) {
            return cjVar;
        }
        return (cj) this.g.f(kjVar.f1());
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
