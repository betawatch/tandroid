package e4;

import a8.p0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c4.l;
import c4.m;
import h2.j;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class h implements m {
    public static final byte[] n = {0, 7, 8, 15};
    public static final byte[] r = {0, 119, -120, -1};
    public static final byte[] s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final g f;
    public Bitmap h;

    public h(List list) {
        x xVar = new x((byte[]) list.get(0));
        int H = xVar.H();
        int H2 = xVar.H();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), d());
        this.f = new g(H, H2);
    }

    public static byte[] a(int i7, int i10, d4.f fVar) {
        byte[] bArr = new byte[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) fVar.j(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = e(qs.e4, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                int i10 = i7 & 1;
                int i11 = qs.L1;
                int i12 = i10 != 0 ? 127 : 0;
                int i13 = (i7 & 2) != 0 ? 127 : 0;
                if ((i7 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i7] = e(qs.e4, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int i7;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = qs.e4;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = e(63, i12, i13, i11);
            } else {
                int i14 = i10 & qs.S1;
                int i15 = qs.A2;
                if (i14 == 0) {
                    int i16 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i17 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    i7 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = e(qs.e4, i16, i17, i7 + i15);
                } else if (i14 == 8) {
                    int i18 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i19 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    i7 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = e(qs.L1, i18, i19, i7 + i15);
                } else if (i14 == 128) {
                    iArr[i10] = e(qs.e4, ((i10 & 1) != 0 ? 43 : 0) + qs.L1 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + qs.L1 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + qs.L1 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = e(qs.e4, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int e(int i7, int i10, int i11, int i12) {
        return (i7 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(byte[] bArr, int[] iArr, int i7, int i10, int i11, Paint paint, Canvas canvas) {
        char c10;
        char c11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        boolean z10;
        int i15;
        int j3;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int j10;
        int i20;
        Paint paint2 = paint;
        d4.f fVar = new d4.f(bArr, bArr.length);
        int i21 = i10;
        int i22 = i11;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (fVar.b() != 0) {
            int i23 = 8;
            int j11 = fVar.j(8);
            if (j11 != 240) {
                int i24 = 3;
                int i25 = 2;
                int i26 = 4;
                switch (j11) {
                    case 16:
                        byte[] bArr6 = i7 == 3 ? bArr3 == null ? r : bArr3 : i7 == 2 ? bArr5 == null ? n : bArr5 : null;
                        boolean z12 = false;
                        while (true) {
                            int j12 = fVar.j(2);
                            if (j12 != 0) {
                                z9 = z12;
                                i12 = j12;
                                i13 = 1;
                            } else if (fVar.i()) {
                                int j13 = fVar.j(3) + 3;
                                z9 = z12;
                                i12 = fVar.j(2);
                                i13 = j13;
                            } else {
                                if (fVar.i()) {
                                    z9 = z12;
                                    i13 = 1;
                                    c10 = '\b';
                                    c11 = 4;
                                } else {
                                    int j14 = fVar.j(2);
                                    if (j14 == 0) {
                                        c10 = '\b';
                                        c11 = 4;
                                        z9 = true;
                                    } else if (j14 == 1) {
                                        c10 = '\b';
                                        c11 = 4;
                                        z9 = z12;
                                        i13 = 2;
                                    } else if (j14 == 2) {
                                        c10 = '\b';
                                        c11 = 4;
                                        i13 = fVar.j(4) + 12;
                                        i12 = fVar.j(2);
                                        z9 = z12;
                                        if (i13 != 0) {
                                        }
                                        i14 = i21;
                                        i21 = i14 + i13;
                                        if (z9) {
                                        }
                                    } else if (j14 != 3) {
                                        z9 = z12;
                                        c10 = '\b';
                                        c11 = 4;
                                    } else {
                                        c10 = '\b';
                                        int j15 = fVar.j(8) + 29;
                                        i12 = fVar.j(2);
                                        z9 = z12;
                                        i13 = j15;
                                        c11 = 4;
                                        if (i13 != 0 || paint2 == null) {
                                            i14 = i21;
                                        } else {
                                            if (bArr6 != 0) {
                                                i12 = bArr6[i12];
                                            }
                                            paint2.setColor(iArr[i12]);
                                            i14 = i21;
                                            canvas.drawRect(i21, i22, i21 + i13, i22 + 1, paint2);
                                        }
                                        i21 = i14 + i13;
                                        if (z9) {
                                            fVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z12 = z9;
                                        }
                                    }
                                    i12 = 0;
                                    i13 = 0;
                                    if (i13 != 0) {
                                    }
                                    i14 = i21;
                                    i21 = i14 + i13;
                                    if (z9) {
                                    }
                                }
                                i12 = 0;
                                if (i13 != 0) {
                                }
                                i14 = i21;
                                i21 = i14 + i13;
                                if (z9) {
                                }
                            }
                            c10 = '\b';
                            c11 = 4;
                            if (i13 != 0) {
                            }
                            i14 = i21;
                            i21 = i14 + i13;
                            if (z9) {
                            }
                        }
                    case 17:
                        if (i7 == 3) {
                            bArr2 = bArr4 == null ? s : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z13 = false;
                        while (true) {
                            int j16 = fVar.j(i26);
                            if (j16 != 0) {
                                z10 = z13;
                                i16 = j16;
                                i15 = 1;
                            } else if (fVar.i()) {
                                if (fVar.i()) {
                                    int j17 = fVar.j(i25);
                                    if (j17 == 0) {
                                        z10 = z13;
                                        i15 = 1;
                                    } else if (j17 != 1) {
                                        if (j17 == i25) {
                                            i15 = fVar.j(i26) + 9;
                                            j3 = fVar.j(i26);
                                        } else if (j17 != i24) {
                                            z10 = z13;
                                            i15 = 0;
                                        } else {
                                            i15 = fVar.j(i23) + 25;
                                            j3 = fVar.j(i26);
                                        }
                                        i16 = j3;
                                    } else {
                                        z10 = z13;
                                        i15 = i25;
                                    }
                                    i16 = 0;
                                } else {
                                    i15 = fVar.j(i25) + 4;
                                    i16 = fVar.j(i26);
                                }
                                z10 = z13;
                            } else {
                                int j18 = fVar.j(i24);
                                if (j18 != 0) {
                                    i15 = j18 + 2;
                                    z10 = z13;
                                    i16 = 0;
                                } else {
                                    z10 = true;
                                    i15 = 0;
                                    i16 = 0;
                                }
                            }
                            if (i15 == 0 || paint2 == null) {
                                i17 = i21;
                                i18 = i24;
                                i19 = i25;
                            } else {
                                if (bArr2 != 0) {
                                    i16 = bArr2[i16];
                                }
                                paint2.setColor(iArr[i16]);
                                i18 = i24;
                                i19 = 2;
                                i17 = i21;
                                canvas.drawRect(i21, i22, i21 + i15, i22 + 1, paint2);
                            }
                            i21 = i17 + i15;
                            if (z10) {
                                fVar.c();
                                break;
                            } else {
                                z13 = z10;
                                i24 = i18;
                                i25 = i19;
                                i26 = 4;
                                i23 = 8;
                            }
                        }
                    case 18:
                        boolean z14 = false;
                        while (true) {
                            int j19 = fVar.j(8);
                            if (j19 != 0) {
                                z11 = z14;
                                j10 = 1;
                            } else if (fVar.i()) {
                                z11 = z14;
                                j10 = fVar.j(7);
                                j19 = fVar.j(8);
                            } else {
                                int j20 = fVar.j(7);
                                if (j20 != 0) {
                                    z11 = z14;
                                    j10 = j20;
                                    j19 = 0;
                                } else {
                                    z11 = true;
                                    j19 = 0;
                                    j10 = 0;
                                }
                            }
                            if (j10 == 0 || paint2 == null) {
                                i20 = i21;
                            } else {
                                paint2.setColor(iArr[j19]);
                                i20 = i21;
                                canvas.drawRect(i21, i22, i21 + j10, i22 + 1, paint2);
                            }
                            i21 = i20 + j10;
                            if (z11) {
                                break;
                            } else {
                                z14 = z11;
                            }
                        }
                        break;
                    default:
                        switch (j11) {
                            case 32:
                                bArr5 = a(4, 4, fVar);
                                break;
                            case 33:
                                bArr3 = a(4, 8, fVar);
                                break;
                            case 34:
                                bArr4 = a(16, 8, fVar);
                                break;
                        }
                }
            } else {
                i22 += 2;
                i21 = i10;
            }
            paint2 = paint;
        }
    }

    public static a g(d4.f fVar, int i7) {
        int j3;
        int i10;
        int j10;
        int i11;
        int i12;
        int i13 = 8;
        int j11 = fVar.j(8);
        fVar.L(8);
        int i14 = 2;
        int i15 = i7 - 2;
        int i16 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] d = d();
        while (i15 > 0) {
            int j12 = fVar.j(i13);
            int j13 = fVar.j(i13);
            int[] iArr2 = (j13 & 128) != 0 ? iArr : (j13 & 64) != 0 ? b10 : d;
            if ((j13 & 1) != 0) {
                i11 = fVar.j(i13);
                i12 = fVar.j(i13);
                j3 = fVar.j(i13);
                j10 = fVar.j(i13);
                i10 = i15 - 6;
            } else {
                int j14 = fVar.j(6) << i14;
                int j15 = fVar.j(4) << 4;
                j3 = fVar.j(4) << 4;
                i10 = i15 - 4;
                j10 = fVar.j(i14) << 6;
                i11 = j14;
                i12 = j15;
            }
            if (i11 == 0) {
                i12 = i16;
                j3 = i12;
                j10 = 255;
            }
            double d2 = i11;
            double d10 = i12 - 128;
            double d11 = j3 - 128;
            iArr2[j12] = e((byte) (255 - (j10 & qs.e4)), m0.i((int) ((1.402d * d10) + d2), 0, qs.e4), m0.i((int) ((d2 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, qs.e4), m0.i((int) ((d11 * 1.772d) + d2), 0, qs.e4));
            i15 = i10;
            i16 = 0;
            j11 = j11;
            d = d;
            i13 = 8;
            i14 = 2;
        }
        return new a(j11, iArr, b10, d);
    }

    public static c h(d4.f fVar) {
        byte[] bArr;
        int j3 = fVar.j(16);
        fVar.L(4);
        int j10 = fVar.j(2);
        boolean i7 = fVar.i();
        fVar.L(1);
        byte[] bArr2 = m0.b;
        if (j10 == 1) {
            fVar.L(fVar.j(8) * 16);
        } else if (j10 == 0) {
            int j11 = fVar.j(16);
            int j12 = fVar.j(16);
            if (j11 > 0) {
                bArr2 = new byte[j11];
                fVar.o(j11, bArr2);
            }
            if (j12 > 0) {
                bArr = new byte[j12];
                fVar.o(j12, bArr);
                return new c(j3, i7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(j3, i7, bArr2, bArr);
    }

    @Override // c4.m
    public final int P() {
        return 2;
    }

    @Override // c4.m
    public final /* synthetic */ c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override // c4.m
    public final void reset() {
        g gVar = this.f;
        gVar.c.clear();
        gVar.d.clear();
        gVar.e.clear();
        gVar.f.clear();
        gVar.g.clear();
        gVar.h = null;
        gVar.i = null;
    }

    @Override // c4.m
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        g gVar;
        boolean z9;
        c4.a aVar;
        char c10;
        char c11;
        char c12;
        int i11;
        ArrayList arrayList;
        int i12;
        b bVar;
        g gVar2;
        e eVar;
        int i13;
        int i14;
        int i15;
        int i16;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        d4.f fVar = new d4.f(bArr, i7 + i10);
        fVar.J(i7);
        while (true) {
            int b10 = fVar.b();
            gVar = this.f;
            z9 = true;
            if (b10 >= 48 && fVar.j(8) == 15) {
                int j3 = fVar.j(8);
                int j10 = fVar.j(16);
                int j11 = fVar.j(16);
                int d = fVar.d() + j11;
                if (j11 * 8 > fVar.b()) {
                    h2.a.l("DvbParser", "Data field length exceeds limit");
                    fVar.L(fVar.b());
                } else {
                    switch (j3) {
                        case 16:
                            if (j10 == gVar.a) {
                                cc.c cVar = gVar.i;
                                fVar.j(8);
                                int j12 = fVar.j(4);
                                int j13 = fVar.j(2);
                                fVar.L(2);
                                int i21 = j11 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i21 > 0) {
                                    int j14 = fVar.j(8);
                                    fVar.L(8);
                                    i21 -= 6;
                                    sparseArray.put(j14, new d(fVar.j(16), fVar.j(16)));
                                }
                                cc.c cVar2 = new cc.c(j12, j13, sparseArray);
                                if (j13 != 0) {
                                    gVar.i = cVar2;
                                    gVar.c.clear();
                                    gVar.d.clear();
                                    gVar.e.clear();
                                    break;
                                } else if (cVar != null && cVar.b != j12) {
                                    gVar.i = cVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            cc.c cVar3 = gVar.i;
                            SparseArray sparseArray2 = gVar.c;
                            if (j10 == gVar.a && cVar3 != null) {
                                int j15 = fVar.j(8);
                                fVar.L(4);
                                boolean i22 = fVar.i();
                                fVar.L(3);
                                int j16 = fVar.j(16);
                                int j17 = fVar.j(16);
                                fVar.j(3);
                                int j18 = fVar.j(3);
                                fVar.L(2);
                                int j19 = fVar.j(8);
                                int j20 = fVar.j(8);
                                int j21 = fVar.j(4);
                                int j22 = fVar.j(2);
                                fVar.L(2);
                                int i23 = j11 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int j23 = fVar.j(16);
                                    int j24 = fVar.j(2);
                                    fVar.j(2);
                                    int j25 = fVar.j(12);
                                    fVar.L(4);
                                    int j26 = fVar.j(12);
                                    int i24 = i23 - 6;
                                    if (j24 == 1 || j24 == 2) {
                                        fVar.j(8);
                                        fVar.j(8);
                                        i23 -= 8;
                                    } else {
                                        i23 = i24;
                                    }
                                    sparseArray3.put(j23, new f(j25, j26));
                                }
                                e eVar3 = new e(j15, i22, j16, j17, j18, j19, j20, j21, j22, sparseArray3);
                                if (cVar3.c == 0 && (eVar2 = (e) sparseArray2.get(j15)) != null) {
                                    SparseArray sparseArray4 = eVar2.j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        eVar3.j.put(sparseArray4.keyAt(i25), (f) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(eVar3.a, eVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (j10 == gVar.a) {
                                a g10 = g(fVar, j11);
                                gVar.d.put(g10.a, g10);
                                break;
                            } else if (j10 == gVar.b) {
                                a g11 = g(fVar, j11);
                                gVar.f.put(g11.a, g11);
                                break;
                            }
                            break;
                        case 19:
                            if (j10 == gVar.a) {
                                c h = h(fVar);
                                gVar.e.put(h.a, h);
                                break;
                            } else if (j10 == gVar.b) {
                                c h7 = h(fVar);
                                gVar.g.put(h7.a, h7);
                                break;
                            }
                            break;
                        case 20:
                            if (j10 == gVar.a) {
                                fVar.L(4);
                                boolean i26 = fVar.i();
                                fVar.L(3);
                                int j27 = fVar.j(16);
                                int j28 = fVar.j(16);
                                if (i26) {
                                    int j29 = fVar.j(16);
                                    i17 = fVar.j(16);
                                    i20 = fVar.j(16);
                                    i18 = fVar.j(16);
                                    i19 = j29;
                                } else {
                                    i17 = j27;
                                    i18 = j28;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                gVar.h = new b(j27, j28, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    fVar.M(d - fVar.d());
                }
            }
        }
        cc.c cVar4 = gVar.i;
        if (cVar4 == null) {
            g0 g0Var = i0.b;
            aVar = new c4.a(-9223372036854775807L, -9223372036854775807L, t1.e);
        } else {
            b bVar2 = gVar.h;
            if (bVar2 == null) {
                bVar2 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.c;
            if (bitmap == null || bVar2.a + 1 != bitmap.getWidth() || bVar2.b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.a + 1, bVar2.b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) cVar4.d;
            int i27 = 0;
            while (i27 < sparseArray5.size()) {
                canvas.save();
                d dVar = (d) sparseArray5.valueAt(i27);
                e eVar4 = (e) gVar.c.get(sparseArray5.keyAt(i27));
                int i28 = dVar.a + bVar2.c;
                int i29 = dVar.b + bVar2.e;
                int i30 = eVar4.c;
                int i31 = eVar4.f;
                int i32 = eVar4.d;
                boolean z10 = z9;
                int i33 = i28 + i30;
                int i34 = i29 + i32;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i28, i29, Math.min(i33, bVar2.d), Math.min(i34, bVar2.f));
                a aVar2 = (a) gVar.d.get(i31);
                if (aVar2 == null && (aVar2 = (a) gVar.f.get(i31)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = eVar4.j;
                int i35 = i27;
                int i36 = 0;
                while (i36 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i36);
                    SparseArray sparseArray8 = sparseArray7;
                    f fVar2 = (f) sparseArray7.valueAt(i36);
                    int i37 = i29;
                    c cVar5 = (c) gVar.e.get(keyAt);
                    if (cVar5 == null) {
                        cVar5 = (c) gVar.g.get(keyAt);
                    }
                    c cVar6 = cVar5;
                    if (cVar6 != null) {
                        Paint paint = cVar6.b ? null : this.a;
                        int i38 = i28;
                        int i39 = eVar4.e;
                        gVar2 = gVar;
                        int i40 = i38 + fVar2.a;
                        int i41 = i37 + fVar2.b;
                        int i42 = i32;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i14 = i30;
                        i13 = i38;
                        arrayList = arrayList2;
                        i12 = i37;
                        e eVar5 = eVar4;
                        int[] iArr = i39 == 3 ? aVar2.d : i39 == 2 ? aVar2.c : aVar2.b;
                        eVar = eVar5;
                        i15 = i36;
                        i16 = i42;
                        f(cVar6.c, iArr, i39, i40, i41, paint2, canvas);
                        f(cVar6.d, iArr, i39, i40, i41 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i12 = i37;
                        bVar = bVar2;
                        gVar2 = gVar;
                        eVar = eVar4;
                        i13 = i28;
                        i14 = i30;
                        i15 = i36;
                        i16 = i32;
                    }
                    i36 = i15 + 1;
                    i30 = i14;
                    i29 = i12;
                    eVar4 = eVar;
                    i28 = i13;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    gVar = gVar2;
                    i32 = i16;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                g gVar3 = gVar;
                int i43 = i29;
                e eVar6 = eVar4;
                int i44 = i28;
                int i45 = i30;
                int i46 = i32;
                if (eVar6.b) {
                    int i47 = eVar6.e;
                    if (i47 == 3) {
                        i11 = aVar2.d[eVar6.g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i11 = i47 == 2 ? aVar2.c[eVar6.h] : aVar2.b[eVar6.i];
                    }
                    Paint paint3 = this.b;
                    paint3.setColor(i11);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i44, i43, i33, i34, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i44, i43, i45, i46);
                float f10 = bVar3.a;
                float f11 = bVar3.b;
                arrayList3.add(new g2.b(null, null, null, createBitmap2, i43 / f11, 0, 0, i44 / f10, 0, TLObject.FLAG_31, -3.4028235E38f, i45 / f10, i46 / f11, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i27 = i35 + 1;
                z9 = z10;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                gVar = gVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        jVar.accept(aVar);
    }
}
