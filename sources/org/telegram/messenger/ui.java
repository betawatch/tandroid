package org.telegram.messenger;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ui {
    public long a;
    public boolean b;
    public boolean c;
    public zi h;
    public boolean i;
    public boolean j;
    public final ti m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final a0.h g = new a0.h();
    public int k = -1;
    public int l = 800;

    public ui() {
        ti tiVar = new ti();
        tiVar.n = 1.0f;
        this.m = tiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x07e4, code lost:
    
        if (r13[2] > r13[r15]) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if ((org.telegram.messenger.zi.o1(r13.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L41;
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
        int i3;
        boolean z10;
        int i10;
        int i11;
        ri riVar;
        float f10;
        int i12;
        int i13;
        int i14;
        float f11;
        byte b10;
        boolean z11;
        zi ziVar;
        TLRPC.Message message;
        float f12;
        float f13;
        this.e.clear();
        this.f.clear();
        this.g.b();
        this.h = null;
        this.l = 800;
        int size = this.d.size();
        boolean z12 = 0;
        boolean z13 = true;
        if (size == 1) {
            this.h = (zi) this.d.get(0);
            return;
        }
        if (size < 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        this.b = false;
        this.c = false;
        this.j = false;
        int i15 = this.n ? size - 1 : 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        float f14 = 1.0f;
        while (true) {
            if (this.n) {
                if (i15 < 0) {
                    break;
                }
                ziVar = (zi) this.d.get(i15);
                if (i15 == (!this.n ? size - 1 : z12)) {
                    ziVar.U2 = null;
                    z16 = ziVar.Q3();
                    if (!z16) {
                        TLRPC.Message message2 = ziVar.k;
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null) {
                            if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                TLRPC.Peer peer = message2.peer_id;
                                if (peer.channel_id == 0) {
                                    if (peer.chat_id == 0) {
                                        if (!(zi.o1(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                        }
                                    }
                                }
                            }
                        }
                        z14 = z13;
                        if (!ziVar.J3() || ziVar.V2()) {
                            this.i = z13;
                        }
                    }
                    z14 = z12;
                    if (!ziVar.J3()) {
                    }
                    this.i = z13;
                }
                message = ziVar.k;
                if (message != null && message.invert_media) {
                    this.j = z13;
                }
                TLRPC.PhotoSize w10 = w7.w(ziVar.n0, g0.Z0(z12), z12, null, z12);
                ri riVar2 = new ri();
                riVar2.h = (this.n ? i15 != size + (-1) : i15 != 0) ? z12 : z13;
                f12 = w10 != null ? 1.0f : w10.w / w10.h;
                riVar2.g = f12;
                if (f12 <= 1.2f) {
                    sb2.append("w");
                } else if (f12 < 0.8f) {
                    sb2.append("n");
                } else {
                    sb2.append("q");
                }
                f13 = riVar2.g;
                f14 += f13;
                if (f13 > 2.0f) {
                    z15 = z13;
                }
                this.f.put(ziVar, riVar2);
                this.g.k(riVar2, ziVar.f1());
                this.e.add(riVar2);
                if (ziVar.z != null) {
                    if (z17 && this.h == null) {
                        this.h = ziVar;
                        z17 = false;
                    } else if (!this.i) {
                        this.h = null;
                    }
                    this.c = true;
                }
                i15 = !this.n ? i15 - 1 : i15 + 1;
                z12 = 0;
                z13 = true;
            } else {
                if (i15 >= size) {
                    break;
                }
                ziVar = (zi) this.d.get(i15);
                if (i15 == (!this.n ? size - 1 : z12)) {
                }
                message = ziVar.k;
                if (message != null) {
                    this.j = z13;
                }
                TLRPC.PhotoSize w102 = w7.w(ziVar.n0, g0.Z0(z12), z12, null, z12);
                ri riVar22 = new ri();
                riVar22.h = (this.n ? i15 != size + (-1) : i15 != 0) ? z12 : z13;
                if (w102 != null) {
                }
                riVar22.g = f12;
                if (f12 <= 1.2f) {
                }
                f13 = riVar22.g;
                f14 += f13;
                if (f13 > 2.0f) {
                }
                this.f.put(ziVar, riVar22);
                this.g.k(riVar22, ziVar.f1());
                this.e.add(riVar22);
                if (ziVar.z != null) {
                }
                if (!this.n) {
                }
                z12 = 0;
                z13 = true;
            }
        }
        int i16 = 3;
        if (this.i) {
            for (int i17 = 0; i17 < size; i17++) {
                ri riVar3 = (ri) this.e.get(i17);
                riVar3.l = 3;
                if (i17 == 0) {
                    riVar3.l = 7;
                    b10 = 0;
                    riVar3.h = false;
                    z11 = true;
                } else {
                    b10 = 0;
                    if (i17 == size - 1) {
                        riVar3.l = 11;
                        z11 = true;
                        riVar3.h = true;
                    } else {
                        z11 = true;
                        riVar3.h = false;
                    }
                }
                riVar3.k = z11;
                riVar3.g = 1.0f;
                riVar3.a = b10;
                riVar3.b = b10;
                byte b11 = (byte) i17;
                riVar3.c = b11;
                riVar3.d = b11;
                riVar3.i = 1000;
                riVar3.e = this.l;
                riVar3.f = 100.0f;
            }
            return;
        }
        if (z14) {
            this.l -= 50;
            i3 = hs.Z3;
        } else {
            i3 = hs.e3;
        }
        int L = g0.L(120.0f);
        float L2 = g0.L(120.0f);
        Point point = g0.q;
        int min = (int) (L2 / (Math.min(point.x, point.y) / this.l));
        float L3 = g0.L(40.0f);
        float min2 = Math.min(point.x, point.y);
        float f15 = this.l;
        int i18 = (int) (L3 / (min2 / f15));
        float f16 = f15 / 814.0f;
        float f17 = f14 / size;
        float L4 = g0.L(100.0f) / 814.0f;
        if (size == 1) {
            ri riVar4 = (ri) this.e.get(0);
            float f18 = this.l / riVar4.g;
            riVar4.a(Math.round(Math.min(f18, Math.min(f18, 407.0f))) / 814.0f, 0, 0, 0, 0, this.l, 15);
            i10 = i3;
            z10 = z16;
            i11 = 0;
        } else if (z15 || !(size == 2 || size == 3 || size == 4)) {
            int i19 = 2;
            z10 = z16;
            int size2 = this.e.size();
            float[] fArr = new float[size2];
            for (int i20 = 0; i20 < size; i20++) {
                if (f17 > 1.1f) {
                    fArr[i20] = Math.max(1.0f, ((ri) this.e.get(i20)).g);
                } else {
                    fArr[i20] = Math.min(1.0f, ((ri) this.e.get(i20)).g);
                }
                fArr[i20] = Math.max(0.66667f, Math.min(1.7f, fArr[i20]));
            }
            ArrayList arrayList = new ArrayList();
            int i21 = 1;
            while (i21 < size2) {
                int i22 = size2 - i21;
                if (i21 <= 3 && i22 <= 3) {
                    float e10 = e(0, i21, fArr);
                    float e11 = e(i21, size2, fArr);
                    si siVar = new si();
                    siVar.a = new int[]{i21, i22};
                    float[] fArr2 = new float[i19];
                    fArr2[0] = e10;
                    fArr2[1] = e11;
                    siVar.b = fArr2;
                    arrayList.add(siVar);
                }
                i21++;
                i19 = 2;
            }
            for (int i23 = 1; i23 < size2 - 1; i23++) {
                int i24 = 1;
                while (true) {
                    int i25 = size2 - i23;
                    if (i24 < i25) {
                        int i26 = i25 - i24;
                        if (i23 <= 3) {
                            if (i24 <= (f17 < 0.85f ? 4 : 3) && i26 <= 3) {
                                float e12 = e(0, i23, fArr);
                                int i27 = i23 + i24;
                                float e13 = e(i23, i27, fArr);
                                float e14 = e(i27, size2, fArr);
                                si siVar2 = new si();
                                siVar2.a = new int[]{i23, i24, i26};
                                siVar2.b = new float[]{e12, e13, e14};
                                arrayList.add(siVar2);
                            }
                        }
                        i24++;
                    }
                }
            }
            for (int i28 = 1; i28 < size2 - 2; i28++) {
                int i29 = 1;
                while (true) {
                    int i30 = size2 - i28;
                    if (i29 < i30) {
                        int i31 = 1;
                        while (true) {
                            int i32 = i30 - i29;
                            if (i31 < i32) {
                                int i33 = i32 - i31;
                                if (i28 > i16 || i29 > i16 || i31 > i16 || i33 > i16) {
                                    i13 = i3;
                                    i14 = i16;
                                } else {
                                    i14 = i16;
                                    float e15 = e(0, i28, fArr);
                                    int i34 = i28 + i29;
                                    float e16 = e(i28, i34, fArr);
                                    int i35 = i34 + i31;
                                    float e17 = e(i34, i35, fArr);
                                    float e18 = e(i35, size2, fArr);
                                    si siVar3 = new si();
                                    siVar3.a = new int[]{i28, i29, i31, i33};
                                    i13 = i3;
                                    float[] fArr3 = new float[4];
                                    fArr3[0] = e15;
                                    fArr3[1] = e16;
                                    fArr3[2] = e17;
                                    fArr3[i14] = e18;
                                    siVar3.b = fArr3;
                                    arrayList.add(siVar3);
                                }
                                i31++;
                                i16 = i14;
                                i3 = i13;
                            }
                        }
                        i29++;
                    }
                }
            }
            i10 = i3;
            int i36 = i16;
            float f19 = (this.l / 3) * 4;
            int i37 = 0;
            si siVar4 = null;
            float f20 = 0.0f;
            while (i37 < arrayList.size()) {
                si siVar5 = (si) arrayList.get(i37);
                float f21 = Float.MAX_VALUE;
                int i38 = 0;
                float f22 = 0.0f;
                while (true) {
                    float[] fArr4 = siVar5.b;
                    if (i38 >= fArr4.length) {
                        break;
                    }
                    float f23 = fArr4[i38];
                    f22 += f23;
                    if (f23 < f21) {
                        f21 = f23;
                    }
                    i38++;
                }
                float abs = Math.abs(f22 - f19);
                int[] iArr = siVar5.a;
                if (iArr.length > 1) {
                    int i39 = iArr[0];
                    int i40 = iArr[1];
                    if (i39 <= i40) {
                        f10 = f19;
                        if (iArr.length <= 2 || i40 <= iArr[2]) {
                            i12 = i36;
                            if (iArr.length > i12) {
                            }
                        }
                    } else {
                        f10 = f19;
                    }
                    i12 = i36;
                    abs *= 1.2f;
                } else {
                    f10 = f19;
                    i12 = i36;
                }
                if (f21 < min) {
                    abs *= 1.5f;
                }
                if (siVar4 == null || abs < f20) {
                    siVar4 = siVar5;
                    f20 = abs;
                }
                i37++;
                i36 = i12;
                f19 = f10;
            }
            if (siVar4 == null) {
                return;
            }
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            while (true) {
                int[] iArr2 = siVar4.a;
                if (i43 >= iArr2.length) {
                    break;
                }
                int i44 = iArr2[i43];
                float f24 = siVar4.b[i43];
                int i45 = this.l;
                int i46 = i44 - 1;
                i41 = Math.max(i41, i46);
                int i47 = 0;
                ri riVar5 = null;
                while (i47 < i44) {
                    int i48 = (int) (fArr[i42] * f24);
                    int i49 = i45 - i48;
                    ri riVar6 = (ri) this.e.get(i42);
                    int i50 = i43 == 0 ? 4 : 0;
                    if (i43 == siVar4.a.length - 1) {
                        i50 |= 8;
                    }
                    if (i47 == 0) {
                        i50 |= 1;
                        if (z10) {
                            riVar5 = riVar6;
                        }
                    }
                    if (i47 == i46) {
                        i50 |= 2;
                        if (!z10) {
                            riVar = riVar6;
                            riVar6.a(Math.max(L4, f24 / 814.0f), i47, i47, i43, i43, i48, i50);
                            i42++;
                            i47++;
                            i45 = i49;
                            riVar5 = riVar;
                            i46 = i46;
                        }
                    }
                    riVar = riVar5;
                    riVar6.a(Math.max(L4, f24 / 814.0f), i47, i47, i43, i43, i48, i50);
                    i42++;
                    i47++;
                    i45 = i49;
                    riVar5 = riVar;
                    i46 = i46;
                }
                riVar5.e += i45;
                riVar5.i += i45;
                i43++;
            }
            i11 = i41;
        } else if (size == 2) {
            ri riVar7 = (ri) this.e.get(0);
            ri riVar8 = (ri) this.e.get(1);
            String sb3 = sb2.toString();
            if (sb3.equals("ww")) {
                z10 = z16;
                f11 = 0.4f;
                if (f17 > f16 * 1.4d) {
                    float f25 = riVar7.g;
                    float f26 = riVar8.g;
                    if (f25 - f26 < 0.2d) {
                        float f27 = this.l;
                        float round = Math.round(Math.min(f27 / f25, Math.min(f27 / f26, 407.0f))) / 814.0f;
                        riVar7.a(round, 0, 0, 0, 0, this.l, 7);
                        riVar8.a(round, 0, 0, 1, 1, this.l, 11);
                        i11 = 0;
                        i10 = i3;
                    }
                }
            } else {
                z10 = z16;
                f11 = 0.4f;
            }
            if (sb3.equals("ww") || sb3.equals("qq")) {
                int i51 = this.l / 2;
                float f28 = i51;
                float round2 = Math.round(Math.min(f28 / riVar7.g, Math.min(f28 / riVar8.g, 814.0f))) / 814.0f;
                riVar7.a(round2, 0, 0, 0, 0, i51, 13);
                riVar8.a(round2, 1, 1, 0, 0, i51, 14);
            } else {
                float f29 = this.l;
                float f30 = riVar7.g;
                int max = (int) Math.max(f29 * f11, Math.round((f29 / f30) / ((1.0f / riVar8.g) + (1.0f / f30))));
                int i52 = this.l - max;
                if (i52 < min) {
                    max -= min - i52;
                } else {
                    min = i52;
                }
                float min3 = Math.min(814.0f, Math.round(Math.min(min / riVar7.g, max / riVar8.g))) / 814.0f;
                riVar7.a(min3, 0, 0, 0, 0, min, 13);
                riVar8.a(min3, 1, 1, 0, 0, max, 14);
            }
            i11 = 1;
            i10 = i3;
        } else {
            z10 = z16;
            if (size == 3) {
                ri riVar9 = (ri) this.e.get(0);
                ri riVar10 = (ri) this.e.get(1);
                ri riVar11 = (ri) this.e.get(2);
                if (sb2.charAt(0) == 'n') {
                    float f31 = riVar10.g;
                    float min4 = Math.min(407.0f, Math.round((this.l * f31) / (riVar11.g + f31)));
                    int max2 = (int) Math.max(min, Math.min(this.l * 0.5f, Math.round(Math.min(riVar11.g * min4, riVar10.g * r14))));
                    int round3 = Math.round(Math.min((riVar9.g * 814.0f) + i18, this.l - max2));
                    riVar9.a(1.0f, 0, 0, 0, 1, round3, 13);
                    float f32 = (814.0f - min4) / 814.0f;
                    riVar10.a(f32, 1, 1, 0, 0, max2, 6);
                    float f33 = min4 / 814.0f;
                    riVar11.a(f33, 0, 1, 1, 1, max2, 10);
                    int i53 = this.l;
                    riVar11.i = i53;
                    riVar9.m = new float[]{f33, f32};
                    if (z10) {
                        riVar9.i = i53 - max2;
                    } else {
                        riVar10.i = i53 - round3;
                        riVar11.j = round3;
                    }
                    this.b = true;
                } else {
                    float round4 = Math.round(Math.min(this.l / riVar9.g, 537.24005f)) / 814.0f;
                    riVar9.a(round4, 0, 1, 0, 0, this.l, 7);
                    int i54 = this.l / 2;
                    float f34 = i54;
                    float min5 = Math.min(814.0f - round4, Math.round(Math.min(f34 / riVar10.g, f34 / riVar11.g))) / 814.0f;
                    float f35 = min5 < L4 ? L4 : min5;
                    riVar10.a(f35, 0, 0, 1, 1, i54, 9);
                    riVar11.a(f35, 1, 1, 1, 1, i54, 10);
                }
                i10 = i3;
                i11 = 1;
            } else {
                ri riVar12 = (ri) this.e.get(0);
                ri riVar13 = (ri) this.e.get(1);
                ri riVar14 = (ri) this.e.get(2);
                ri riVar15 = (ri) this.e.get(3);
                if (sb2.charAt(0) == 'w') {
                    float round5 = Math.round(Math.min(this.l / riVar12.g, 537.24005f)) / 814.0f;
                    riVar12.a(round5, 0, 2, 0, 0, this.l, 7);
                    float round6 = Math.round(this.l / ((riVar13.g + riVar14.g) + riVar15.g));
                    float f36 = min;
                    int max3 = (int) Math.max(f36, Math.min(this.l * 0.4f, riVar13.g * round6));
                    int max4 = (int) Math.max(Math.max(f36, this.l * 0.33f), riVar15.g * round6);
                    int i55 = (this.l - max3) - max4;
                    if (i55 < g0.L(58.0f)) {
                        int L5 = g0.L(58.0f) - i55;
                        i55 = g0.L(58.0f);
                        int i56 = L5 / 2;
                        max3 -= i56;
                        max4 -= L5 - i56;
                    }
                    int i57 = max3;
                    float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                    float f37 = min6 < L4 ? L4 : min6;
                    riVar13.a(f37, 0, 0, 1, 1, i57, 9);
                    riVar14.a(f37, 1, 1, 1, 1, i55, 8);
                    riVar15.a(f37, 2, 2, 1, 1, max4, 10);
                    i11 = 2;
                    i10 = i3;
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / riVar15.g) + ((1.0f / riVar14.g) + (1.0f / riVar13.g)))));
                    float f38 = L;
                    float f39 = max5;
                    float min7 = Math.min(0.33f, Math.max(f38, f39 / riVar13.g) / 814.0f);
                    float min8 = Math.min(0.33f, Math.max(f38, f39 / riVar14.g) / 814.0f);
                    float f40 = (1.0f - min7) - min8;
                    int round7 = Math.round(Math.min((riVar12.g * 814.0f) + i18, this.l - max5));
                    riVar12.a(min7 + min8 + f40, 0, 0, 0, 2, round7, 13);
                    riVar13.a(min7, 1, 1, 0, 0, max5, 6);
                    riVar14.a(min8, 0, 1, 1, 1, max5, 2);
                    riVar14.i = this.l;
                    riVar15.a(f40, 0, 1, 2, 2, max5, 10);
                    int i58 = this.l;
                    riVar15.i = i58;
                    if (z10) {
                        riVar12.i = i58 - max5;
                    } else {
                        riVar13.i = i58 - round7;
                        riVar14.j = round7;
                        riVar15.j = round7;
                    }
                    riVar12.m = new float[]{min7, min8, f40};
                    this.b = true;
                    i11 = 1;
                    i10 = i3;
                }
            }
        }
        boolean z18 = (z10 || this.d.isEmpty() || !((zi) this.d.get(0)).Q2()) ? false : true;
        for (int i59 = 0; i59 < size; i59++) {
            ri riVar16 = (ri) this.e.get(i59);
            if (z10) {
                if (riVar16.a == 0) {
                    riVar16.i += i10;
                }
                if ((riVar16.l & 2) != 0) {
                    riVar16.k = true;
                }
            } else {
                if (riVar16.b == i11 || (riVar16.l & 2) != 0) {
                    riVar16.i += i10;
                }
                if ((riVar16.l & 1) != 0) {
                    riVar16.k = true;
                }
            }
            zi ziVar2 = (zi) this.d.get(i59);
            if (!z10 && !z18 && ziVar2.m5()) {
                if (riVar16.k) {
                    int i60 = riVar16.i;
                    if (i60 != 1000) {
                        riVar16.i = i60 + hs.t1;
                    }
                    riVar16.e += hs.t1;
                } else if ((riVar16.l & 2) != 0) {
                    int i61 = riVar16.i;
                    if (i61 != 1000) {
                        riVar16.i = i61 - 108;
                    } else {
                        int i62 = riVar16.j;
                        if (i62 != 0) {
                            riVar16.j = i62 + hs.t1;
                        }
                    }
                }
            }
        }
        if (!z18 || this.b) {
            return;
        }
        int i63 = g0.q.x;
        if (!g0.E && g0.Q1() && (!g0.P1() || t0.b.getResources().getConfiguration().orientation == 2)) {
            i63 -= g0.l1(i63, 0, 0);
        }
        float L6 = g0.L(16.0f);
        float L7 = g0.L(3.0f);
        float f41 = i63;
        int i64 = 0;
        float L8 = (f41 - (L6 * 2.0f)) - (((zi) this.d.get(0)).S2 ? g0.L(71.0f) : 0);
        int i65 = 0;
        while (i65 < size) {
            ri riVar17 = (ri) this.e.get(i65);
            if ((riVar17.l & 1) != 0) {
                int i66 = i64;
                int i67 = i66;
                while (i66 < size) {
                    ri riVar18 = (ri) this.e.get(i66);
                    if (riVar18.c == riVar17.c) {
                        i67 += riVar18.e;
                    }
                    i66++;
                }
                if (i67 > 0) {
                    float f42 = L8 / i67;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i68 = i64; i68 < size; i68++) {
                        ri riVar19 = (ri) this.e.get(i68);
                        if (riVar19.c == riVar17.c) {
                            arrayList2.add(riVar19);
                        }
                    }
                    Collections.sort(arrayList2, new o0.a(17));
                    int i69 = i64;
                    int i70 = i69;
                    int i71 = i70;
                    while (i69 < arrayList2.size()) {
                        ri riVar20 = (ri) arrayList2.get(i69);
                        int i72 = i69 == arrayList2.size() + (-1) ? 1 : i64;
                        riVar20.u = f42;
                        riVar20.r = (i70 * f42) + L6;
                        int i73 = riVar20.e;
                        i70 += i73;
                        riVar20.s = (i73 * f42) - (i72 != 0 ? 0.0f : L7);
                        int round8 = i72 != 0 ? 1000 : Math.round(((((i70 * f42) + L6) - (L7 / 2.0f)) * 1000.0f) / f41);
                        riVar20.i = round8 - i71;
                        riVar20.t = (i71 * i63) / 1000.0f;
                        i69++;
                        i71 = round8;
                        i64 = 0;
                    }
                }
            }
            i65++;
            i64 = 0;
        }
    }

    public final zi b(int i3) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zi ziVar = (zi) arrayList.get(i10);
            ri riVar = (ri) hashMap.get(ziVar);
            if (riVar != null && (riVar.l & i3) == i3) {
                return ziVar;
            }
        }
        return null;
    }

    public final zi c() {
        return b(this.n ? 10 : 5);
    }

    public final ri d(zi ziVar) {
        if (ziVar == null) {
            return null;
        }
        ri riVar = (ri) this.f.get(ziVar);
        if (riVar != null) {
            return riVar;
        }
        return (ri) this.g.f(ziVar.f1());
    }

    public final float e(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return this.l / f10;
    }
}
