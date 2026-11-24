// default package

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f27 {
    public long a;
    public boolean b;
    public boolean c;
    public k27 h;
    public boolean i;
    public boolean j;
    public final e27 m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final vf6 g = new vf6();
    public int k = -1;
    public int l = 800;

    public f27() {
        e27 e27Var = new e27();
        e27Var.n = 1.0f;
        this.m = e27Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x07bb, code lost:
    
        if (r15 > r13[2]) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x07c5, code lost:
    
        if (r13[2] > r13[3]) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if ((k27.n1(r13.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07d6  */
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
        k27 k27Var;
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
            this.h = (k27) this.d.get(0);
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
                    k27Var = (k27) this.d.get(i6);
                    if (i6 == (!this.n ? size - 1 : z2)) {
                        k27Var.W2 = null;
                        z6 = k27Var.O3();
                        if (!z6) {
                            TLRPC.Message message2 = k27Var.k;
                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                            if (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null) {
                                if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                    TLRPC.Peer peer = message2.peer_id;
                                    if (peer.channel_id == 0) {
                                        if (peer.chat_id == 0) {
                                            if (!(k27.n1(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = z3;
                            if (!k27Var.I3() || k27Var.U2()) {
                                this.i = z3;
                            }
                        }
                        z4 = z2;
                        if (!k27Var.I3()) {
                        }
                        this.i = z3;
                    }
                    message = k27Var.k;
                    if (message != null && message.invert_media) {
                        this.j = z3;
                    }
                    TLRPC.PhotoSize w = ba4.w(k27Var.p0, gl.Y0(z2), z2, null, z2);
                    c27 c27Var = new c27();
                    c27Var.h = (this.n ? i6 != size + (-1) : i6 != 0) ? z2 : z3;
                    f4 = w != null ? 1.0f : w.w / w.h;
                    c27Var.g = f4;
                    if (f4 <= 1.2f) {
                        sb.append("w");
                    } else if (f4 < 0.8f) {
                        sb.append("n");
                    } else {
                        sb.append("q");
                    }
                    f5 = c27Var.g;
                    f6 += f5;
                    if (f5 > 2.0f) {
                        z5 = z3;
                    }
                    this.f.put(k27Var, c27Var);
                    this.g.k(c27Var, k27Var.e1());
                    this.e.add(c27Var);
                    if (k27Var.z != null) {
                        if (z7 && this.h == null) {
                            this.h = k27Var;
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
                    k27Var = (k27) this.d.get(i6);
                    if (i6 == (!this.n ? size - 1 : z2)) {
                    }
                    message = k27Var.k;
                    if (message != null) {
                        this.j = z3;
                    }
                    TLRPC.PhotoSize w2 = ba4.w(k27Var.p0, gl.Y0(z2), z2, null, z2);
                    c27 c27Var2 = new c27();
                    c27Var2.h = (this.n ? i6 != size + (-1) : i6 != 0) ? z2 : z3;
                    if (w2 != null) {
                    }
                    c27Var2.g = f4;
                    if (f4 <= 1.2f) {
                    }
                    f5 = c27Var2.g;
                    f6 += f5;
                    if (f5 > 2.0f) {
                    }
                    this.f.put(k27Var, c27Var2);
                    this.g.k(c27Var2, k27Var.e1());
                    this.e.add(c27Var2);
                    if (k27Var.z != null) {
                    }
                    if (!this.n) {
                    }
                    z2 = 0;
                    z3 = true;
                }
            }
            if (this.i) {
                for (int i7 = 0; i7 < size; i7++) {
                    c27 c27Var3 = (c27) this.e.get(i7);
                    c27Var3.l = 3;
                    if (i7 == 0) {
                        c27Var3.l = 7;
                        b = 0;
                        c27Var3.h = false;
                        z = true;
                    } else {
                        b = 0;
                        if (i7 == size - 1) {
                            c27Var3.l = 11;
                            z = true;
                            c27Var3.h = true;
                        } else {
                            z = true;
                            c27Var3.h = false;
                        }
                    }
                    c27Var3.k = z;
                    c27Var3.g = 1.0f;
                    c27Var3.a = b;
                    c27Var3.b = b;
                    byte b2 = (byte) i7;
                    c27Var3.c = b2;
                    c27Var3.d = b2;
                    c27Var3.i = 1000;
                    c27Var3.e = this.l;
                    c27Var3.f = 100.0f;
                }
                return;
            }
            if (z4) {
                this.l -= 50;
                i = kk7.Y3;
            } else {
                i = kk7.d3;
            }
            int L = gl.L(120.0f);
            float L2 = gl.L(120.0f);
            Point point = gl.q;
            int min = (int) (L2 / (Math.min(point.x, point.y) / this.l));
            float L3 = gl.L(40.0f);
            float min2 = Math.min(point.x, point.y);
            float f7 = this.l;
            int i8 = (int) (L3 / (min2 / f7));
            float f8 = f7 / 814.0f;
            float f9 = f6 / size;
            float L4 = gl.L(100.0f) / 814.0f;
            if (size == 1) {
                c27 c27Var4 = (c27) this.e.get(0);
                float f10 = this.l / c27Var4.g;
                c27Var4.a(Math.round(Math.min(f10, Math.min(f10, 407.0f))) / 814.0f, 0, 0, 0, 0, this.l, 15);
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
                            fArr[i11] = Math.max(1.0f, ((c27) arrayList.get(i11)).g);
                        } else {
                            fArr[i11] = Math.min(1.0f, ((c27) arrayList.get(i11)).g);
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
                            d27 d27Var = new d27();
                            d27Var.a = new int[]{i12, i13};
                            float[] fArr2 = new float[i10];
                            fArr2[0] = e;
                            fArr2[1] = e2;
                            d27Var.b = fArr2;
                            arrayList2.add(d27Var);
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
                                        d27 d27Var2 = new d27();
                                        d27Var2.a = new int[]{i14, i15, i17};
                                        d27Var2.b = new float[]{e3, e4, e5};
                                        arrayList2.add(d27Var2);
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
                                            d27 d27Var3 = new d27();
                                            d27Var3.a = new int[]{i19, i20, i22, i24};
                                            d27Var3.b = new float[]{e6, e7, e8, e9};
                                            arrayList2.add(d27Var3);
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
                    float f12 = 0.0f;
                    int i27 = 0;
                    d27 d27Var4 = null;
                    while (i27 < arrayList2.size()) {
                        d27 d27Var5 = (d27) arrayList2.get(i27);
                        float f13 = Float.MAX_VALUE;
                        float f14 = 0.0f;
                        int i28 = 0;
                        while (true) {
                            float[] fArr3 = d27Var5.b;
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
                        int[] iArr = d27Var5.a;
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
                            if (d27Var4 != null || f3 < f12) {
                                f12 = f3;
                                d27Var4 = d27Var5;
                            }
                            i27++;
                            f11 = f;
                        } else {
                            f2 = abs;
                        }
                        f3 = f2;
                        if (f13 < min) {
                        }
                        if (d27Var4 != null) {
                        }
                        f12 = f3;
                        d27Var4 = d27Var5;
                        i27++;
                        f11 = f;
                    }
                    if (d27Var4 == null) {
                        return;
                    }
                    i3 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        int[] iArr2 = d27Var4.a;
                        if (i31 >= iArr2.length) {
                            break;
                        }
                        int i33 = iArr2[i31];
                        float f16 = d27Var4.b[i31];
                        int i34 = this.l;
                        int i35 = i33 - 1;
                        int max = Math.max(i3, i35);
                        int i36 = 0;
                        c27 c27Var5 = null;
                        while (i36 < i33) {
                            int i37 = (int) (fArr[i32] * f16);
                            i34 -= i37;
                            int i38 = max;
                            c27 c27Var6 = (c27) this.e.get(i32);
                            int i39 = i31 == 0 ? 4 : 0;
                            int i40 = i31 == d27Var4.a.length + (-1) ? i39 | 8 : i39;
                            if (i36 == 0) {
                                i40 |= 1;
                                if (z6) {
                                    c27Var5 = c27Var6;
                                }
                            }
                            if (i36 == i35) {
                                i40 |= 2;
                                if (!z6) {
                                    i4 = i40;
                                    c27Var5 = c27Var6;
                                    int i41 = i36;
                                    c27Var6.a(Math.max(L4, f16 / 814.0f), i41, i36, i31, i31, i37, i4);
                                    i32++;
                                    i36 = i41 + 1;
                                    max = i38;
                                }
                            }
                            i4 = i40;
                            int i412 = i36;
                            c27Var6.a(Math.max(L4, f16 / 814.0f), i412, i36, i31, i31, i37, i4);
                            i32++;
                            i36 = i412 + 1;
                            max = i38;
                        }
                        c27Var5.e += i34;
                        c27Var5.i += i34;
                        i31++;
                        i3 = max;
                    }
                } else {
                    ArrayList arrayList3 = this.e;
                    if (size == 2) {
                        c27 c27Var7 = (c27) arrayList3.get(0);
                        c27 c27Var8 = (c27) this.e.get(1);
                        String sb2 = sb.toString();
                        if (sb2.equals("ww") && f9 > f8 * 1.4d) {
                            float f17 = c27Var7.g;
                            float f18 = c27Var8.g;
                            if (f17 - f18 < 0.2d) {
                                float f19 = this.l;
                                float round = Math.round(Math.min(f19 / f17, Math.min(f19 / f18, 407.0f))) / 814.0f;
                                c27Var7.a(round, 0, 0, 0, 0, this.l, 7);
                                c27Var8.a(round, 0, 0, 1, 1, this.l, 11);
                                i3 = 0;
                                i2 = i;
                            }
                        }
                        if (sb2.equals("ww") || sb2.equals("qq")) {
                            int i42 = this.l / 2;
                            float f20 = i42;
                            float round2 = Math.round(Math.min(f20 / c27Var7.g, Math.min(f20 / c27Var8.g, 814.0f))) / 814.0f;
                            c27Var7.a(round2, 0, 0, 0, 0, i42, 13);
                            c27Var8.a(round2, 1, 1, 0, 0, i42, 14);
                        } else {
                            float f21 = this.l;
                            float f22 = c27Var7.g;
                            int max2 = (int) Math.max(f21 * 0.4f, Math.round((f21 / f22) / ((1.0f / c27Var8.g) + (1.0f / f22))));
                            int i43 = this.l - max2;
                            if (i43 < min) {
                                max2 -= min - i43;
                            } else {
                                min = i43;
                            }
                            float min3 = Math.min(814.0f, Math.round(Math.min(min / c27Var7.g, max2 / c27Var8.g))) / 814.0f;
                            c27Var7.a(min3, 0, 0, 0, 0, min, 13);
                            c27Var8.a(min3, 1, 1, 0, 0, max2, 14);
                        }
                        i3 = 1;
                        i2 = i;
                    } else if (size == 3) {
                        c27 c27Var9 = (c27) arrayList3.get(0);
                        c27 c27Var10 = (c27) this.e.get(1);
                        c27 c27Var11 = (c27) this.e.get(2);
                        if (sb.charAt(0) == 'n') {
                            float f23 = c27Var10.g;
                            float min4 = Math.min(407.0f, Math.round((this.l * f23) / (c27Var11.g + f23)));
                            int max3 = (int) Math.max(min, Math.min(this.l * 0.5f, Math.round(Math.min(c27Var11.g * min4, c27Var10.g * r14))));
                            int round3 = Math.round(Math.min((c27Var9.g * 814.0f) + i8, this.l - max3));
                            c27Var9.a(1.0f, 0, 0, 0, 1, round3, 13);
                            float f24 = (814.0f - min4) / 814.0f;
                            c27Var10.a(f24, 1, 1, 0, 0, max3, 6);
                            float f25 = min4 / 814.0f;
                            c27Var11.a(f25, 0, 1, 1, 1, max3, 10);
                            int i44 = this.l;
                            c27Var11.i = i44;
                            c27Var9.m = new float[]{f25, f24};
                            if (z6) {
                                c27Var9.i = i44 - max3;
                            } else {
                                c27Var10.i = i44 - round3;
                                c27Var11.j = round3;
                            }
                            this.b = true;
                        } else {
                            float round4 = Math.round(Math.min(this.l / c27Var9.g, 537.24005f)) / 814.0f;
                            c27Var9.a(round4, 0, 1, 0, 0, this.l, 7);
                            int i45 = this.l / 2;
                            float f26 = i45;
                            float min5 = Math.min(814.0f - round4, Math.round(Math.min(f26 / c27Var10.g, f26 / c27Var11.g))) / 814.0f;
                            float f27 = min5 < L4 ? L4 : min5;
                            c27Var10.a(f27, 0, 0, 1, 1, i45, 9);
                            c27Var11.a(f27, 1, 1, 1, 1, i45, 10);
                        }
                        i2 = i;
                        i3 = 1;
                    } else {
                        c27 c27Var12 = (c27) arrayList3.get(0);
                        c27 c27Var13 = (c27) this.e.get(1);
                        c27 c27Var14 = (c27) this.e.get(2);
                        c27 c27Var15 = (c27) this.e.get(3);
                        if (sb.charAt(0) == 'w') {
                            float round5 = Math.round(Math.min(this.l / c27Var12.g, 537.24005f)) / 814.0f;
                            c27Var12.a(round5, 0, 2, 0, 0, this.l, 7);
                            float round6 = Math.round(this.l / ((c27Var13.g + c27Var14.g) + c27Var15.g));
                            float f28 = min;
                            int max4 = (int) Math.max(f28, Math.min(this.l * 0.4f, c27Var13.g * round6));
                            int max5 = (int) Math.max(Math.max(f28, this.l * 0.33f), c27Var15.g * round6);
                            int i46 = (this.l - max4) - max5;
                            if (i46 < gl.L(58.0f)) {
                                int L5 = gl.L(58.0f) - i46;
                                i46 = gl.L(58.0f);
                                int i47 = L5 / 2;
                                max4 -= i47;
                                max5 -= L5 - i47;
                            }
                            int i48 = max4;
                            float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                            float f29 = min6 < L4 ? L4 : min6;
                            c27Var13.a(f29, 0, 0, 1, 1, i48, 9);
                            c27Var14.a(f29, 1, 1, 1, 1, i46, 8);
                            c27Var15.a(f29, 2, 2, 1, 1, max5, 10);
                            i3 = 2;
                            i2 = i;
                        } else {
                            int max6 = Math.max(min, Math.round(814.0f / ((1.0f / c27Var15.g) + ((1.0f / c27Var14.g) + (1.0f / c27Var13.g)))));
                            float f30 = L;
                            float f31 = max6;
                            float min7 = Math.min(0.33f, Math.max(f30, f31 / c27Var13.g) / 814.0f);
                            float min8 = Math.min(0.33f, Math.max(f30, f31 / c27Var14.g) / 814.0f);
                            float f32 = (1.0f - min7) - min8;
                            int round7 = Math.round(Math.min((814.0f * c27Var12.g) + i8, this.l - max6));
                            c27Var12.a(min7 + min8 + f32, 0, 0, 0, 2, round7, 13);
                            c27Var13.a(min7, 1, 1, 0, 0, max6, 6);
                            c27Var14.a(min8, 0, 1, 1, 1, max6, 2);
                            c27Var14.i = this.l;
                            c27Var15.a(f32, 0, 1, 2, 2, max6, 10);
                            int i49 = this.l;
                            c27Var15.i = i49;
                            if (z6) {
                                c27Var12.i = i49 - max6;
                            } else {
                                c27Var13.i = i49 - round7;
                                c27Var14.j = round7;
                                c27Var15.j = round7;
                            }
                            c27Var12.m = new float[]{min7, min8, f32};
                            this.b = true;
                            i3 = 1;
                            i2 = i;
                        }
                    }
                }
            }
            boolean z8 = (z6 || this.d.isEmpty() || !((k27) this.d.get(0)).P2()) ? false : true;
            for (int i50 = 0; i50 < size; i50++) {
                c27 c27Var16 = (c27) this.e.get(i50);
                if (z6) {
                    if (c27Var16.a == 0) {
                        c27Var16.i += i2;
                    }
                    if ((c27Var16.l & 2) != 0) {
                        c27Var16.k = true;
                    }
                } else {
                    if (c27Var16.b == i3 || (c27Var16.l & 2) != 0) {
                        c27Var16.i += i2;
                    }
                    if ((c27Var16.l & 1) != 0) {
                        c27Var16.k = true;
                    }
                }
                k27 k27Var2 = (k27) this.d.get(i50);
                if (!z6 && !z8 && k27Var2.k5()) {
                    if (c27Var16.k) {
                        int i51 = c27Var16.i;
                        if (i51 != 1000) {
                            c27Var16.i = i51 + kk7.s1;
                        }
                        c27Var16.e += kk7.s1;
                    } else if ((c27Var16.l & 2) != 0) {
                        int i52 = c27Var16.i;
                        if (i52 != 1000) {
                            c27Var16.i = i52 - 108;
                        } else {
                            int i53 = c27Var16.j;
                            if (i53 != 0) {
                                c27Var16.j = i53 + kk7.s1;
                            }
                        }
                    }
                }
            }
            if (!z8 || this.b) {
                return;
            }
            int i54 = gl.q.x;
            if (!gl.E && gl.O1() && (!gl.N1() || a.b.getResources().getConfiguration().orientation == 2)) {
                i54 -= gl.k1(i54, 0, 0);
            }
            float L6 = gl.L(16.0f);
            float L7 = gl.L(3.0f);
            float f33 = i54;
            int i55 = 0;
            float L8 = (f33 - (L6 * 2.0f)) - (((k27) this.d.get(0)).U2 ? gl.L(71.0f) : 0);
            int i56 = 0;
            while (i56 < size) {
                c27 c27Var17 = (c27) this.e.get(i56);
                if ((c27Var17.l & 1) != 0) {
                    int i57 = i55;
                    int i58 = i57;
                    while (i57 < size) {
                        c27 c27Var18 = (c27) this.e.get(i57);
                        if (c27Var18.c == c27Var17.c) {
                            i58 += c27Var18.e;
                        }
                        i57++;
                    }
                    if (i58 > 0) {
                        float f34 = L8 / i58;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i59 = i55; i59 < size; i59++) {
                            c27 c27Var19 = (c27) this.e.get(i59);
                            if (c27Var19.c == c27Var17.c) {
                                arrayList4.add(c27Var19);
                            }
                        }
                        Collections.sort(arrayList4, new el6((byte) 11));
                        int i60 = i55;
                        int i61 = i60;
                        int i62 = i61;
                        while (i60 < arrayList4.size()) {
                            c27 c27Var20 = (c27) arrayList4.get(i60);
                            int i63 = i60 == arrayList4.size() + (-1) ? 1 : i55;
                            c27Var20.s = f34;
                            c27Var20.p = (i61 * f34) + L6;
                            int i64 = c27Var20.e;
                            i61 += i64;
                            c27Var20.q = (i64 * f34) - (i63 != 0 ? 0.0f : L7);
                            int round8 = i63 != 0 ? 1000 : Math.round(((((i61 * f34) + L6) - (L7 / 2.0f)) * 1000.0f) / f33);
                            c27Var20.i = round8 - i62;
                            c27Var20.r = (i62 * i54) / 1000.0f;
                            i60++;
                            i62 = round8;
                            i55 = 0;
                        }
                    }
                }
                i56++;
                i55 = 0;
            }
        }
    }

    public final k27 b(int i) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            k27 k27Var = (k27) arrayList.get(i2);
            c27 c27Var = (c27) hashMap.get(k27Var);
            if (c27Var != null && (c27Var.l & i) == i) {
                return k27Var;
            }
        }
        return null;
    }

    public final k27 c() {
        return b(this.n ? 10 : 5);
    }

    public final c27 d(k27 k27Var) {
        if (k27Var == null) {
            return null;
        }
        c27 c27Var = (c27) this.f.get(k27Var);
        if (c27Var != null) {
            return c27Var;
        }
        return (c27) this.g.f(k27Var.e1());
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
