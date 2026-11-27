// default package

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m47 {
    public long a;
    public boolean b;
    public boolean c;
    public r47 h;
    public boolean i;
    public boolean j;
    public final l47 m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final zh6 g = new zh6();
    public int k = -1;
    public int l = 800;

    public m47() {
        l47 l47Var = new l47();
        l47Var.n = 1.0f;
        this.m = l47Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x07b5, code lost:
    
        if (r15 > r13[2]) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x07bf, code lost:
    
        if (r13[2] > r13[3]) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if ((r47.n1(r13.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        int i5;
        byte b;
        boolean z;
        r47 r47Var;
        TLRPC.Message message;
        float f4;
        float f5;
        this.e.clear();
        this.f.clear();
        this.g.b();
        this.h = null;
        this.l = 800;
        int size = this.d.size();
        boolean z2 = 0;
        boolean z3 = true;
        if (size == 1) {
            this.h = (r47) this.d.get(0);
            return;
        }
        if (size >= 1) {
            StringBuilder sb = new StringBuilder();
            this.b = false;
            this.c = false;
            this.j = false;
            int i6 = this.n ? size - 1 : 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = true;
            float f6 = 1.0f;
            while (true) {
                if (this.n) {
                    if (i6 < 0) {
                        break;
                    }
                    r47Var = (r47) this.d.get(i6);
                    if (i6 == (!this.n ? size - 1 : z2)) {
                        r47Var.W2 = null;
                        z6 = r47Var.O3();
                        if (!z6) {
                            TLRPC.Message message2 = r47Var.k;
                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                            if (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null) {
                                if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                    TLRPC.Peer peer = message2.peer_id;
                                    if (peer.channel_id == 0) {
                                        if (peer.chat_id == 0) {
                                            if (!(r47.n1(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = z3;
                            if (!r47Var.I3() || r47Var.U2()) {
                                this.i = z3;
                            }
                        }
                        z4 = z2;
                        if (!r47Var.I3()) {
                        }
                        this.i = z3;
                    }
                    message = r47Var.k;
                    if (message != null && message.invert_media) {
                        this.j = z3;
                    }
                    TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(z2), z2, null, z2);
                    j47 j47Var = new j47();
                    j47Var.h = (this.n ? i6 != size + (-1) : i6 != 0) ? z2 : z3;
                    f4 = w != null ? 1.0f : w.w / w.h;
                    j47Var.g = f4;
                    if (f4 <= 1.2f) {
                        sb.append("w");
                    } else if (f4 < 0.8f) {
                        sb.append("n");
                    } else {
                        sb.append("q");
                    }
                    f5 = j47Var.g;
                    f6 += f5;
                    if (f5 > 2.0f) {
                        z5 = z3;
                    }
                    this.f.put(r47Var, j47Var);
                    this.g.k(r47Var.e1(), j47Var);
                    this.e.add(j47Var);
                    if (r47Var.z != null) {
                        if (z7 && this.h == null) {
                            this.h = r47Var;
                            z7 = false;
                        } else if (!this.i) {
                            this.h = null;
                        }
                        this.c = true;
                    }
                    i6 = !this.n ? i6 - 1 : i6 + 1;
                    z2 = 0;
                    z3 = true;
                } else {
                    if (i6 >= size) {
                        break;
                    }
                    r47Var = (r47) this.d.get(i6);
                    if (i6 == (!this.n ? size - 1 : z2)) {
                    }
                    message = r47Var.k;
                    if (message != null) {
                        this.j = z3;
                    }
                    TLRPC.PhotoSize w2 = xb4.w(r47Var.p0, hl.Y0(z2), z2, null, z2);
                    j47 j47Var2 = new j47();
                    j47Var2.h = (this.n ? i6 != size + (-1) : i6 != 0) ? z2 : z3;
                    if (w2 != null) {
                    }
                    j47Var2.g = f4;
                    if (f4 <= 1.2f) {
                    }
                    f5 = j47Var2.g;
                    f6 += f5;
                    if (f5 > 2.0f) {
                    }
                    this.f.put(r47Var, j47Var2);
                    this.g.k(r47Var.e1(), j47Var2);
                    this.e.add(j47Var2);
                    if (r47Var.z != null) {
                    }
                    if (!this.n) {
                    }
                    z2 = 0;
                    z3 = true;
                }
            }
            if (this.i) {
                for (int i7 = 0; i7 < size; i7++) {
                    j47 j47Var3 = (j47) this.e.get(i7);
                    j47Var3.l = 3;
                    if (i7 == 0) {
                        j47Var3.l = 7;
                        b = 0;
                        j47Var3.h = false;
                        z = true;
                    } else {
                        b = 0;
                        if (i7 == size - 1) {
                            j47Var3.l = 11;
                            z = true;
                            j47Var3.h = true;
                        } else {
                            z = true;
                            j47Var3.h = false;
                        }
                    }
                    j47Var3.k = z;
                    j47Var3.g = 1.0f;
                    j47Var3.a = b;
                    j47Var3.b = b;
                    byte b2 = (byte) i7;
                    j47Var3.c = b2;
                    j47Var3.d = b2;
                    j47Var3.i = 1000;
                    j47Var3.e = this.l;
                    j47Var3.f = 100.0f;
                }
                return;
            }
            if (z4) {
                this.l -= 50;
                i = jn7.Y3;
            } else {
                i = jn7.d3;
            }
            int L = hl.L(120.0f);
            float L2 = hl.L(120.0f);
            Point point = hl.q;
            int min = (int) (L2 / (Math.min(point.x, point.y) / this.l));
            float L3 = hl.L(40.0f);
            float min2 = Math.min(point.x, point.y);
            float f7 = this.l;
            int i8 = (int) (L3 / (min2 / f7));
            float f8 = f7 / 814.0f;
            float f9 = f6 / size;
            float L4 = hl.L(100.0f) / 814.0f;
            if (size == 1) {
                j47 j47Var4 = (j47) this.e.get(0);
                float f10 = this.l / j47Var4.g;
                j47Var4.a(Math.round(Math.min(f10, Math.min(f10, 407.0f))) / 814.0f, 0, 0, 0, 0, this.l, 15);
                i2 = i;
                i3 = 0;
            } else {
                int i9 = 4;
                if (z5 || !(size == 2 || size == 3 || size == 4)) {
                    int i10 = 2;
                    int size2 = this.e.size();
                    float[] fArr = new float[size2];
                    for (int i11 = 0; i11 < size; i11++) {
                        ArrayList arrayList = this.e;
                        if (f9 > 1.1f) {
                            fArr[i11] = Math.max(1.0f, ((j47) arrayList.get(i11)).g);
                        } else {
                            fArr[i11] = Math.min(1.0f, ((j47) arrayList.get(i11)).g);
                        }
                        fArr[i11] = Math.max(0.66667f, Math.min(1.7f, fArr[i11]));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 1;
                    while (i12 < size2) {
                        int i13 = size2 - i12;
                        if (i12 <= 3 && i13 <= 3) {
                            float e = e(0, i12, fArr);
                            float e2 = e(i12, size2, fArr);
                            k47 k47Var = new k47();
                            k47Var.a = new int[]{i12, i13};
                            float[] fArr2 = new float[i10];
                            fArr2[0] = e;
                            fArr2[1] = e2;
                            k47Var.b = fArr2;
                            arrayList2.add(k47Var);
                        }
                        i12++;
                        i10 = 2;
                    }
                    int i14 = 1;
                    while (i14 < size2 - 1) {
                        int i15 = 1;
                        while (true) {
                            int i16 = size2 - i14;
                            if (i15 < i16) {
                                int i17 = i16 - i15;
                                if (i14 <= 3) {
                                    if (i15 <= (f9 < 0.85f ? i9 : 3) && i17 <= 3) {
                                        float e3 = e(0, i14, fArr);
                                        int i18 = i14 + i15;
                                        float e4 = e(i14, i18, fArr);
                                        float e5 = e(i18, size2, fArr);
                                        k47 k47Var2 = new k47();
                                        k47Var2.a = new int[]{i14, i15, i17};
                                        k47Var2.b = new float[]{e3, e4, e5};
                                        arrayList2.add(k47Var2);
                                    }
                                }
                                i15++;
                                i9 = 4;
                            }
                        }
                        i14++;
                        i9 = 4;
                    }
                    for (int i19 = 1; i19 < size2 - 2; i19++) {
                        int i20 = 1;
                        while (true) {
                            int i21 = size2 - i19;
                            if (i20 < i21) {
                                int i22 = 1;
                                while (true) {
                                    int i23 = i21 - i20;
                                    if (i22 < i23) {
                                        int i24 = i23 - i22;
                                        if (i19 > 3 || i20 > 3 || i22 > 3 || i24 > 3) {
                                            i5 = i;
                                        } else {
                                            float e6 = e(0, i19, fArr);
                                            int i25 = i19 + i20;
                                            float e7 = e(i19, i25, fArr);
                                            i5 = i;
                                            int i26 = i25 + i22;
                                            float e8 = e(i25, i26, fArr);
                                            float e9 = e(i26, size2, fArr);
                                            k47 k47Var3 = new k47();
                                            k47Var3.a = new int[]{i19, i20, i22, i24};
                                            k47Var3.b = new float[]{e6, e7, e8, e9};
                                            arrayList2.add(k47Var3);
                                        }
                                        i22++;
                                        i = i5;
                                    }
                                }
                                i20++;
                            }
                        }
                    }
                    i2 = i;
                    float f11 = (this.l / 3) << 2;
                    int i27 = 0;
                    k47 k47Var4 = null;
                    float f12 = 0.0f;
                    while (i27 < arrayList2.size()) {
                        k47 k47Var5 = (k47) arrayList2.get(i27);
                        float f13 = Float.MAX_VALUE;
                        int i28 = 0;
                        float f14 = 0.0f;
                        while (true) {
                            float[] fArr3 = k47Var5.b;
                            f = f11;
                            if (i28 >= fArr3.length) {
                                break;
                            }
                            float f15 = fArr3[i28];
                            f14 += f15;
                            if (f15 < f13) {
                                f13 = f15;
                            }
                            i28++;
                            f11 = f;
                        }
                        float abs = Math.abs(f14 - f);
                        int[] iArr = k47Var5.a;
                        if (iArr.length > 1) {
                            int i29 = iArr[0];
                            int i30 = iArr[1];
                            if (i29 <= i30) {
                                f2 = abs;
                                if (iArr.length > 2) {
                                }
                                if (iArr.length > 3) {
                                }
                            } else {
                                f2 = abs;
                            }
                            f3 = f2 * 1.2f;
                            if (f13 < min) {
                                f3 *= 1.5f;
                            }
                            if (k47Var4 != null || f3 < f12) {
                                f12 = f3;
                                k47Var4 = k47Var5;
                            }
                            i27++;
                            f11 = f;
                        } else {
                            f2 = abs;
                        }
                        f3 = f2;
                        if (f13 < min) {
                        }
                        if (k47Var4 != null) {
                        }
                        f12 = f3;
                        k47Var4 = k47Var5;
                        i27++;
                        f11 = f;
                    }
                    if (k47Var4 == null) {
                        return;
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    while (true) {
                        int[] iArr2 = k47Var4.a;
                        if (i32 >= iArr2.length) {
                            break;
                        }
                        int i34 = iArr2[i32];
                        float f16 = k47Var4.b[i32];
                        int i35 = this.l;
                        int i36 = i34 - 1;
                        int max = Math.max(i31, i36);
                        int i37 = 0;
                        j47 j47Var5 = null;
                        while (i37 < i34) {
                            int i38 = (int) (fArr[i33] * f16);
                            i35 -= i38;
                            int i39 = max;
                            j47 j47Var6 = (j47) this.e.get(i33);
                            int i40 = i32 == 0 ? 4 : 0;
                            int i41 = i32 == k47Var4.a.length + (-1) ? i40 | 8 : i40;
                            if (i37 == 0) {
                                i41 |= 1;
                                if (z6) {
                                    j47Var5 = j47Var6;
                                }
                            }
                            if (i37 == i36) {
                                i41 |= 2;
                                if (!z6) {
                                    i4 = i41;
                                    j47Var5 = j47Var6;
                                    int i42 = i37;
                                    j47Var6.a(Math.max(L4, f16 / 814.0f), i42, i37, i32, i32, i38, i4);
                                    i33++;
                                    i37 = i42 + 1;
                                    max = i39;
                                }
                            }
                            i4 = i41;
                            int i422 = i37;
                            j47Var6.a(Math.max(L4, f16 / 814.0f), i422, i37, i32, i32, i38, i4);
                            i33++;
                            i37 = i422 + 1;
                            max = i39;
                        }
                        j47Var5.e += i35;
                        j47Var5.i += i35;
                        i32++;
                        i31 = max;
                    }
                    i3 = i31;
                } else {
                    ArrayList arrayList3 = this.e;
                    if (size == 2) {
                        j47 j47Var7 = (j47) arrayList3.get(0);
                        j47 j47Var8 = (j47) this.e.get(1);
                        String sb2 = sb.toString();
                        if (sb2.equals("ww") && f9 > f8 * 1.4d) {
                            float f17 = j47Var7.g;
                            float f18 = j47Var8.g;
                            if (f17 - f18 < 0.2d) {
                                float f19 = this.l;
                                float round = Math.round(Math.min(f19 / f17, Math.min(f19 / f18, 407.0f))) / 814.0f;
                                j47Var7.a(round, 0, 0, 0, 0, this.l, 7);
                                j47Var8.a(round, 0, 0, 1, 1, this.l, 11);
                                i3 = 0;
                                i2 = i;
                            }
                        }
                        if (sb2.equals("ww") || sb2.equals("qq")) {
                            int i43 = this.l / 2;
                            float f20 = i43;
                            float round2 = Math.round(Math.min(f20 / j47Var7.g, Math.min(f20 / j47Var8.g, 814.0f))) / 814.0f;
                            j47Var7.a(round2, 0, 0, 0, 0, i43, 13);
                            j47Var8.a(round2, 1, 1, 0, 0, i43, 14);
                        } else {
                            float f21 = this.l;
                            float f22 = j47Var7.g;
                            int max2 = (int) Math.max(f21 * 0.4f, Math.round((f21 / f22) / ((1.0f / j47Var8.g) + (1.0f / f22))));
                            int i44 = this.l - max2;
                            if (i44 < min) {
                                max2 -= min - i44;
                            } else {
                                min = i44;
                            }
                            float min3 = Math.min(814.0f, Math.round(Math.min(min / j47Var7.g, max2 / j47Var8.g))) / 814.0f;
                            j47Var7.a(min3, 0, 0, 0, 0, min, 13);
                            j47Var8.a(min3, 1, 1, 0, 0, max2, 14);
                        }
                        i3 = 1;
                        i2 = i;
                    } else if (size == 3) {
                        j47 j47Var9 = (j47) arrayList3.get(0);
                        j47 j47Var10 = (j47) this.e.get(1);
                        j47 j47Var11 = (j47) this.e.get(2);
                        if (sb.charAt(0) == 'n') {
                            float f23 = j47Var10.g;
                            float min4 = Math.min(407.0f, Math.round((this.l * f23) / (j47Var11.g + f23)));
                            int max3 = (int) Math.max(min, Math.min(this.l * 0.5f, Math.round(Math.min(j47Var11.g * min4, j47Var10.g * r14))));
                            int round3 = Math.round(Math.min((j47Var9.g * 814.0f) + i8, this.l - max3));
                            j47Var9.a(1.0f, 0, 0, 0, 1, round3, 13);
                            float f24 = (814.0f - min4) / 814.0f;
                            j47Var10.a(f24, 1, 1, 0, 0, max3, 6);
                            float f25 = min4 / 814.0f;
                            j47Var11.a(f25, 0, 1, 1, 1, max3, 10);
                            int i45 = this.l;
                            j47Var11.i = i45;
                            j47Var9.m = new float[]{f25, f24};
                            if (z6) {
                                j47Var9.i = i45 - max3;
                            } else {
                                j47Var10.i = i45 - round3;
                                j47Var11.j = round3;
                            }
                            this.b = true;
                        } else {
                            float round4 = Math.round(Math.min(this.l / j47Var9.g, 537.24005f)) / 814.0f;
                            j47Var9.a(round4, 0, 1, 0, 0, this.l, 7);
                            int i46 = this.l / 2;
                            float f26 = i46;
                            float min5 = Math.min(814.0f - round4, Math.round(Math.min(f26 / j47Var10.g, f26 / j47Var11.g))) / 814.0f;
                            float f27 = min5 < L4 ? L4 : min5;
                            j47Var10.a(f27, 0, 0, 1, 1, i46, 9);
                            j47Var11.a(f27, 1, 1, 1, 1, i46, 10);
                        }
                        i2 = i;
                        i3 = 1;
                    } else {
                        j47 j47Var12 = (j47) arrayList3.get(0);
                        j47 j47Var13 = (j47) this.e.get(1);
                        j47 j47Var14 = (j47) this.e.get(2);
                        j47 j47Var15 = (j47) this.e.get(3);
                        if (sb.charAt(0) == 'w') {
                            float round5 = Math.round(Math.min(this.l / j47Var12.g, 537.24005f)) / 814.0f;
                            j47Var12.a(round5, 0, 2, 0, 0, this.l, 7);
                            float round6 = Math.round(this.l / ((j47Var13.g + j47Var14.g) + j47Var15.g));
                            float f28 = min;
                            int max4 = (int) Math.max(f28, Math.min(this.l * 0.4f, j47Var13.g * round6));
                            int max5 = (int) Math.max(Math.max(f28, this.l * 0.33f), j47Var15.g * round6);
                            int i47 = (this.l - max4) - max5;
                            if (i47 < hl.L(58.0f)) {
                                int L5 = hl.L(58.0f) - i47;
                                i47 = hl.L(58.0f);
                                int i48 = L5 / 2;
                                max4 -= i48;
                                max5 -= L5 - i48;
                            }
                            int i49 = max4;
                            float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                            float f29 = min6 < L4 ? L4 : min6;
                            j47Var13.a(f29, 0, 0, 1, 1, i49, 9);
                            j47Var14.a(f29, 1, 1, 1, 1, i47, 8);
                            j47Var15.a(f29, 2, 2, 1, 1, max5, 10);
                            i3 = 2;
                            i2 = i;
                        } else {
                            int max6 = Math.max(min, Math.round(814.0f / ((1.0f / j47Var15.g) + ((1.0f / j47Var14.g) + (1.0f / j47Var13.g)))));
                            float f30 = L;
                            float f31 = max6;
                            float min7 = Math.min(0.33f, Math.max(f30, f31 / j47Var13.g) / 814.0f);
                            float min8 = Math.min(0.33f, Math.max(f30, f31 / j47Var14.g) / 814.0f);
                            float f32 = (1.0f - min7) - min8;
                            int round7 = Math.round(Math.min((814.0f * j47Var12.g) + i8, this.l - max6));
                            j47Var12.a(min7 + min8 + f32, 0, 0, 0, 2, round7, 13);
                            j47Var13.a(min7, 1, 1, 0, 0, max6, 6);
                            j47Var14.a(min8, 0, 1, 1, 1, max6, 2);
                            j47Var14.i = this.l;
                            j47Var15.a(f32, 0, 1, 2, 2, max6, 10);
                            int i50 = this.l;
                            j47Var15.i = i50;
                            if (z6) {
                                j47Var12.i = i50 - max6;
                            } else {
                                j47Var13.i = i50 - round7;
                                j47Var14.j = round7;
                                j47Var15.j = round7;
                            }
                            j47Var12.m = new float[]{min7, min8, f32};
                            this.b = true;
                            i3 = 1;
                            i2 = i;
                        }
                    }
                }
            }
            boolean z8 = (z6 || this.d.isEmpty() || !((r47) this.d.get(0)).P2()) ? false : true;
            for (int i51 = 0; i51 < size; i51++) {
                j47 j47Var16 = (j47) this.e.get(i51);
                if (z6) {
                    if (j47Var16.a == 0) {
                        j47Var16.i += i2;
                    }
                    if ((j47Var16.l & 2) != 0) {
                        j47Var16.k = true;
                    }
                } else {
                    if (j47Var16.b == i3 || (j47Var16.l & 2) != 0) {
                        j47Var16.i += i2;
                    }
                    if ((j47Var16.l & 1) != 0) {
                        j47Var16.k = true;
                    }
                }
                r47 r47Var2 = (r47) this.d.get(i51);
                if (!z6 && !z8 && r47Var2.k5()) {
                    if (j47Var16.k) {
                        int i52 = j47Var16.i;
                        if (i52 != 1000) {
                            j47Var16.i = i52 + jn7.s1;
                        }
                        j47Var16.e += jn7.s1;
                    } else if ((j47Var16.l & 2) != 0) {
                        int i53 = j47Var16.i;
                        if (i53 != 1000) {
                            j47Var16.i = i53 - 108;
                        } else {
                            int i54 = j47Var16.j;
                            if (i54 != 0) {
                                j47Var16.j = i54 + jn7.s1;
                            }
                        }
                    }
                }
            }
            if (!z8 || this.b) {
                return;
            }
            int i55 = hl.q.x;
            if (!hl.E && hl.O1() && (!hl.N1() || a.b.getResources().getConfiguration().orientation == 2)) {
                i55 -= hl.k1(i55, 0, 0);
            }
            float L6 = hl.L(16.0f);
            float L7 = hl.L(3.0f);
            float f33 = i55;
            int i56 = 0;
            float L8 = (f33 - (L6 * 2.0f)) - (((r47) this.d.get(0)).U2 ? hl.L(71.0f) : 0);
            int i57 = 0;
            while (i57 < size) {
                j47 j47Var17 = (j47) this.e.get(i57);
                if ((j47Var17.l & 1) != 0) {
                    int i58 = i56;
                    int i59 = i58;
                    while (i58 < size) {
                        j47 j47Var18 = (j47) this.e.get(i58);
                        if (j47Var18.c == j47Var17.c) {
                            i59 += j47Var18.e;
                        }
                        i58++;
                    }
                    if (i59 > 0) {
                        float f34 = L8 / i59;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i60 = i56; i60 < size; i60++) {
                            j47 j47Var19 = (j47) this.e.get(i60);
                            if (j47Var19.c == j47Var17.c) {
                                arrayList4.add(j47Var19);
                            }
                        }
                        Collections.sort(arrayList4, new vk6((byte) 12));
                        int i61 = i56;
                        int i62 = i61;
                        int i63 = i62;
                        while (i61 < arrayList4.size()) {
                            j47 j47Var20 = (j47) arrayList4.get(i61);
                            int i64 = i61 == arrayList4.size() + (-1) ? 1 : i56;
                            j47Var20.s = f34;
                            j47Var20.p = (i62 * f34) + L6;
                            int i65 = j47Var20.e;
                            i62 += i65;
                            j47Var20.q = (i65 * f34) - (i64 != 0 ? 0.0f : L7);
                            int round8 = i64 != 0 ? 1000 : Math.round(((((i62 * f34) + L6) - (L7 / 2.0f)) * 1000.0f) / f33);
                            j47Var20.i = round8 - i63;
                            j47Var20.r = (i63 * i55) / 1000.0f;
                            i61++;
                            i63 = round8;
                            i56 = 0;
                        }
                    }
                }
                i57++;
                i56 = 0;
            }
        }
    }

    public final r47 b(int i) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            r47 r47Var = (r47) arrayList.get(i2);
            j47 j47Var = (j47) hashMap.get(r47Var);
            if (j47Var != null && (j47Var.l & i) == i) {
                return r47Var;
            }
        }
        return null;
    }

    public final r47 c() {
        return b(this.n ? 10 : 5);
    }

    public final j47 d(r47 r47Var) {
        if (r47Var == null) {
            return null;
        }
        j47 j47Var = (j47) this.f.get(r47Var);
        if (j47Var != null) {
            return j47Var;
        }
        return (j47) this.g.f(r47Var.e1());
    }

    public final float e(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return this.l / f;
    }
}
