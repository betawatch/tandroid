package d4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import b4.l;
import b4.m;
import g2.k;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements m {
    public static final byte[] n = {0, 7, 8, 15};
    public static final byte[] r = {0, 119, -120, -1};
    public static final byte[] s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap h;

    public i(List list) {
        y yVar = new y((byte[]) list.get(0));
        int H = yVar.H();
        int H2 = yVar.H();
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
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f = new h(H, H2);
    }

    public static byte[] a(int i3, int i10, c4.f fVar) {
        byte[] bArr = new byte[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            bArr[i11] = (byte) fVar.j(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i3 = 1; i3 < 16; i3++) {
            if (i3 < 8) {
                iArr[i3] = d(hs.e4, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) != 0 ? 255 : 0);
            } else {
                int i10 = i3 & 1;
                int i11 = hs.L1;
                int i12 = i10 != 0 ? 127 : 0;
                int i13 = (i3 & 2) != 0 ? 127 : 0;
                if ((i3 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i3] = d(hs.e4, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i3;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = hs.e4;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = d(63, i12, i13, i11);
            } else {
                int i14 = i10 & hs.S1;
                int i15 = hs.A2;
                if (i14 == 0) {
                    int i16 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i17 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    i3 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = d(hs.e4, i16, i17, i3 + i15);
                } else if (i14 == 8) {
                    int i18 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i19 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    i3 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = d(hs.L1, i18, i19, i3 + i15);
                } else if (i14 == 128) {
                    iArr[i10] = d(hs.e4, ((i10 & 1) != 0 ? 43 : 0) + hs.L1 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + hs.L1 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + hs.L1 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = d(hs.e4, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i3, int i10, int i11, int i12) {
        return (i3 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i3, int i10, int i11, Paint paint, Canvas canvas) {
        char c2;
        char c10;
        boolean z10;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        boolean z11;
        int i15;
        int j10;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        int j11;
        int i20;
        Paint paint2 = paint;
        c4.f fVar = new c4.f(bArr, bArr.length);
        int i21 = i10;
        int i22 = i11;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (fVar.b() != 0) {
            int i23 = 8;
            int j12 = fVar.j(8);
            if (j12 != 240) {
                int i24 = 3;
                int i25 = 2;
                int i26 = 4;
                switch (j12) {
                    case 16:
                        byte[] bArr6 = i3 == 3 ? bArr3 == null ? r : bArr3 : i3 == 2 ? bArr5 == null ? n : bArr5 : null;
                        boolean z13 = false;
                        while (true) {
                            int j13 = fVar.j(2);
                            if (j13 != 0) {
                                z10 = z13;
                                i12 = j13;
                                i13 = 1;
                            } else if (fVar.i()) {
                                int j14 = fVar.j(3) + 3;
                                z10 = z13;
                                i12 = fVar.j(2);
                                i13 = j14;
                            } else {
                                if (fVar.i()) {
                                    z10 = z13;
                                    i13 = 1;
                                    c2 = '\b';
                                    c10 = 4;
                                } else {
                                    int j15 = fVar.j(2);
                                    if (j15 == 0) {
                                        c2 = '\b';
                                        c10 = 4;
                                        z10 = true;
                                    } else if (j15 == 1) {
                                        c2 = '\b';
                                        c10 = 4;
                                        z10 = z13;
                                        i13 = 2;
                                    } else if (j15 == 2) {
                                        c2 = '\b';
                                        c10 = 4;
                                        i13 = fVar.j(4) + 12;
                                        i12 = fVar.j(2);
                                        z10 = z13;
                                        if (i13 != 0) {
                                        }
                                        i14 = i21;
                                        i21 = i14 + i13;
                                        if (z10) {
                                        }
                                    } else if (j15 != 3) {
                                        z10 = z13;
                                        c2 = '\b';
                                        c10 = 4;
                                    } else {
                                        c2 = '\b';
                                        int j16 = fVar.j(8) + 29;
                                        i12 = fVar.j(2);
                                        z10 = z13;
                                        i13 = j16;
                                        c10 = 4;
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
                                        if (z10) {
                                            fVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z13 = z10;
                                        }
                                    }
                                    i12 = 0;
                                    i13 = 0;
                                    if (i13 != 0) {
                                    }
                                    i14 = i21;
                                    i21 = i14 + i13;
                                    if (z10) {
                                    }
                                }
                                i12 = 0;
                                if (i13 != 0) {
                                }
                                i14 = i21;
                                i21 = i14 + i13;
                                if (z10) {
                                }
                            }
                            c2 = '\b';
                            c10 = 4;
                            if (i13 != 0) {
                            }
                            i14 = i21;
                            i21 = i14 + i13;
                            if (z10) {
                            }
                        }
                    case 17:
                        if (i3 == 3) {
                            bArr2 = bArr4 == null ? s : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z14 = false;
                        while (true) {
                            int j17 = fVar.j(i26);
                            if (j17 != 0) {
                                z11 = z14;
                                i16 = j17;
                                i15 = 1;
                            } else if (fVar.i()) {
                                if (fVar.i()) {
                                    int j18 = fVar.j(i25);
                                    if (j18 == 0) {
                                        z11 = z14;
                                        i15 = 1;
                                    } else if (j18 != 1) {
                                        if (j18 == i25) {
                                            i15 = fVar.j(i26) + 9;
                                            j10 = fVar.j(i26);
                                        } else if (j18 != i24) {
                                            z11 = z14;
                                            i15 = 0;
                                        } else {
                                            i15 = fVar.j(i23) + 25;
                                            j10 = fVar.j(i26);
                                        }
                                        i16 = j10;
                                    } else {
                                        z11 = z14;
                                        i15 = i25;
                                    }
                                    i16 = 0;
                                } else {
                                    i15 = fVar.j(i25) + 4;
                                    i16 = fVar.j(i26);
                                }
                                z11 = z14;
                            } else {
                                int j19 = fVar.j(i24);
                                if (j19 != 0) {
                                    i15 = j19 + 2;
                                    z11 = z14;
                                    i16 = 0;
                                } else {
                                    z11 = true;
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
                            if (z11) {
                                fVar.c();
                                break;
                            } else {
                                z14 = z11;
                                i24 = i18;
                                i25 = i19;
                                i26 = 4;
                                i23 = 8;
                            }
                        }
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int j20 = fVar.j(8);
                            if (j20 != 0) {
                                z12 = z15;
                                j11 = 1;
                            } else if (fVar.i()) {
                                z12 = z15;
                                j11 = fVar.j(7);
                                j20 = fVar.j(8);
                            } else {
                                int j21 = fVar.j(7);
                                if (j21 != 0) {
                                    z12 = z15;
                                    j11 = j21;
                                    j20 = 0;
                                } else {
                                    z12 = true;
                                    j20 = 0;
                                    j11 = 0;
                                }
                            }
                            if (j11 == 0 || paint2 == null) {
                                i20 = i21;
                            } else {
                                paint2.setColor(iArr[j20]);
                                i20 = i21;
                                canvas.drawRect(i21, i22, i21 + j11, i22 + 1, paint2);
                            }
                            i21 = i20 + j11;
                            if (z12) {
                                break;
                            } else {
                                z15 = z12;
                            }
                        }
                        break;
                    default:
                        switch (j12) {
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

    public static a f(c4.f fVar, int i3) {
        int j10;
        int i10;
        int j11;
        int i11;
        int i12;
        int i13 = 8;
        int j12 = fVar.j(8);
        fVar.L(8);
        int i14 = 2;
        int i15 = i3 - 2;
        int i16 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c2 = c();
        while (i15 > 0) {
            int j13 = fVar.j(i13);
            int j14 = fVar.j(i13);
            int[] iArr2 = (j14 & 128) != 0 ? iArr : (j14 & 64) != 0 ? b10 : c2;
            if ((j14 & 1) != 0) {
                i11 = fVar.j(i13);
                i12 = fVar.j(i13);
                j10 = fVar.j(i13);
                j11 = fVar.j(i13);
                i10 = i15 - 6;
            } else {
                int j15 = fVar.j(6) << i14;
                int j16 = fVar.j(4) << 4;
                j10 = fVar.j(4) << 4;
                i10 = i15 - 4;
                j11 = fVar.j(i14) << 6;
                i11 = j15;
                i12 = j16;
            }
            if (i11 == 0) {
                i12 = i16;
                j10 = i12;
                j11 = 255;
            }
            double d = i11;
            double d10 = i12 - 128;
            double d11 = j10 - 128;
            iArr2[j13] = d((byte) (255 - (j11 & hs.e4)), n0.i((int) ((1.402d * d10) + d), 0, hs.e4), n0.i((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, hs.e4), n0.i((int) ((d11 * 1.772d) + d), 0, hs.e4));
            i15 = i10;
            i16 = 0;
            j12 = j12;
            c2 = c2;
            i13 = 8;
            i14 = 2;
        }
        return new a(j12, iArr, b10, c2);
    }

    public static c g(c4.f fVar) {
        byte[] bArr;
        int j10 = fVar.j(16);
        fVar.L(4);
        int j11 = fVar.j(2);
        boolean i3 = fVar.i();
        fVar.L(1);
        byte[] bArr2 = n0.b;
        if (j11 == 1) {
            fVar.L(fVar.j(8) * 16);
        } else if (j11 == 0) {
            int j12 = fVar.j(16);
            int j13 = fVar.j(16);
            if (j12 > 0) {
                bArr2 = new byte[j12];
                fVar.o(j12, bArr2);
            }
            if (j13 > 0) {
                bArr = new byte[j13];
                fVar.o(j13, bArr);
                return new c(j10, i3, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(j10, i3, bArr2, bArr);
    }

    @Override // b4.m
    public final /* synthetic */ b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    @Override // b4.m
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        h hVar;
        boolean z10;
        b4.a aVar;
        char c2;
        char c10;
        char c11;
        int i11;
        ArrayList arrayList;
        int i12;
        b bVar;
        h hVar2;
        f fVar;
        int i13;
        int i14;
        int i15;
        int i16;
        f fVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        c4.f fVar3 = new c4.f(bArr, i3 + i10);
        fVar3.J(i3);
        while (true) {
            int b10 = fVar3.b();
            hVar = this.f;
            z10 = true;
            if (b10 >= 48 && fVar3.j(8) == 15) {
                int j10 = fVar3.j(8);
                int j11 = fVar3.j(16);
                int j12 = fVar3.j(16);
                int d = fVar3.d() + j12;
                if (j12 * 8 > fVar3.b()) {
                    g2.a.l("DvbParser", "Data field length exceeds limit");
                    fVar3.L(fVar3.b());
                } else {
                    switch (j10) {
                        case 16:
                            if (j11 == hVar.a) {
                                d dVar = hVar.i;
                                fVar3.j(8);
                                int j13 = fVar3.j(4);
                                int j14 = fVar3.j(2);
                                fVar3.L(2);
                                int i21 = j12 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i21 > 0) {
                                    int j15 = fVar3.j(8);
                                    fVar3.L(8);
                                    i21 -= 6;
                                    sparseArray.put(j15, new e(fVar3.j(16), fVar3.j(16)));
                                }
                                d dVar2 = new d(j13, j14, sparseArray);
                                if (j14 != 0) {
                                    hVar.i = dVar2;
                                    hVar.c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.b != j13) {
                                    hVar.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            SparseArray sparseArray2 = hVar.c;
                            if (j11 == hVar.a && dVar3 != null) {
                                int j16 = fVar3.j(8);
                                fVar3.L(4);
                                boolean i22 = fVar3.i();
                                fVar3.L(3);
                                int j17 = fVar3.j(16);
                                int j18 = fVar3.j(16);
                                fVar3.j(3);
                                int j19 = fVar3.j(3);
                                fVar3.L(2);
                                int j20 = fVar3.j(8);
                                int j21 = fVar3.j(8);
                                int j22 = fVar3.j(4);
                                int j23 = fVar3.j(2);
                                fVar3.L(2);
                                int i23 = j12 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int j24 = fVar3.j(16);
                                    int j25 = fVar3.j(2);
                                    fVar3.j(2);
                                    int j26 = fVar3.j(12);
                                    fVar3.L(4);
                                    int j27 = fVar3.j(12);
                                    int i24 = i23 - 6;
                                    if (j25 == 1 || j25 == 2) {
                                        fVar3.j(8);
                                        fVar3.j(8);
                                        i23 -= 8;
                                    } else {
                                        i23 = i24;
                                    }
                                    sparseArray3.put(j24, new g(j26, j27));
                                }
                                f fVar4 = new f(j16, i22, j17, j18, j19, j20, j21, j22, j23, sparseArray3);
                                if (dVar3.c == 0 && (fVar2 = (f) sparseArray2.get(j16)) != null) {
                                    SparseArray sparseArray4 = fVar2.j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        fVar4.j.put(sparseArray4.keyAt(i25), (g) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(fVar4.a, fVar4);
                                break;
                            }
                            break;
                        case 18:
                            if (j11 == hVar.a) {
                                a f10 = f(fVar3, j12);
                                hVar.d.put(f10.a, f10);
                                break;
                            } else if (j11 == hVar.b) {
                                a f11 = f(fVar3, j12);
                                hVar.f.put(f11.a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (j11 == hVar.a) {
                                c g7 = g(fVar3);
                                hVar.e.put(g7.a, g7);
                                break;
                            } else if (j11 == hVar.b) {
                                c g10 = g(fVar3);
                                hVar.g.put(g10.a, g10);
                                break;
                            }
                            break;
                        case 20:
                            if (j11 == hVar.a) {
                                fVar3.L(4);
                                boolean i26 = fVar3.i();
                                fVar3.L(3);
                                int j28 = fVar3.j(16);
                                int j29 = fVar3.j(16);
                                if (i26) {
                                    int j30 = fVar3.j(16);
                                    i17 = fVar3.j(16);
                                    i20 = fVar3.j(16);
                                    i18 = fVar3.j(16);
                                    i19 = j30;
                                } else {
                                    i17 = j28;
                                    i18 = j29;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                hVar.h = new b(j28, j29, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    fVar3.M(d - fVar3.d());
                }
            }
        }
        d dVar4 = hVar.i;
        if (dVar4 == null) {
            g0 g0Var = i0.b;
            aVar = new b4.a(-9223372036854775807L, -9223372036854775807L, s1.e);
        } else {
            b bVar2 = hVar.h;
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
            SparseArray sparseArray5 = (SparseArray) dVar4.d;
            int i27 = 0;
            while (i27 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i27);
                f fVar5 = (f) hVar.c.get(sparseArray5.keyAt(i27));
                int i28 = eVar.a + bVar2.c;
                int i29 = eVar.b + bVar2.e;
                int i30 = fVar5.c;
                int i31 = fVar5.f;
                int i32 = fVar5.d;
                boolean z11 = z10;
                int i33 = i28 + i30;
                int i34 = i29 + i32;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i28, i29, Math.min(i33, bVar2.d), Math.min(i34, bVar2.f));
                a aVar2 = (a) hVar.d.get(i31);
                if (aVar2 == null && (aVar2 = (a) hVar.f.get(i31)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = fVar5.j;
                int i35 = i27;
                int i36 = 0;
                while (i36 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i36);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar = (g) sparseArray7.valueAt(i36);
                    int i37 = i29;
                    c cVar = (c) hVar.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.b ? null : this.a;
                        int i38 = i28;
                        int i39 = fVar5.e;
                        hVar2 = hVar;
                        int i40 = i38 + gVar.a;
                        int i41 = i37 + gVar.b;
                        int i42 = i32;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i14 = i30;
                        i13 = i38;
                        arrayList = arrayList2;
                        i12 = i37;
                        f fVar6 = fVar5;
                        int[] iArr = i39 == 3 ? aVar2.d : i39 == 2 ? aVar2.c : aVar2.b;
                        fVar = fVar6;
                        i15 = i36;
                        i16 = i42;
                        e(cVar2.c, iArr, i39, i40, i41, paint2, canvas);
                        e(cVar2.d, iArr, i39, i40, i41 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i12 = i37;
                        bVar = bVar2;
                        hVar2 = hVar;
                        fVar = fVar5;
                        i13 = i28;
                        i14 = i30;
                        i15 = i36;
                        i16 = i32;
                    }
                    i36 = i15 + 1;
                    i30 = i14;
                    i29 = i12;
                    fVar5 = fVar;
                    i28 = i13;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    hVar = hVar2;
                    i32 = i16;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i43 = i29;
                f fVar7 = fVar5;
                int i44 = i28;
                int i45 = i30;
                int i46 = i32;
                if (fVar7.b) {
                    int i47 = fVar7.e;
                    if (i47 == 3) {
                        i11 = aVar2.d[fVar7.g];
                        c11 = 2;
                    } else {
                        c11 = 2;
                        i11 = i47 == 2 ? aVar2.c[fVar7.h] : aVar2.b[fVar7.i];
                    }
                    Paint paint3 = this.b;
                    paint3.setColor(i11);
                    c2 = c11;
                    c10 = 3;
                    canvas.drawRect(i44, i43, i33, i34, paint3);
                } else {
                    c2 = 2;
                    c10 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i44, i43, i45, i46);
                float f12 = bVar3.a;
                float f13 = bVar3.b;
                arrayList3.add(new f2.b(null, null, null, createBitmap2, i43 / f13, 0, 0, i44 / f12, 0, TLObject.FLAG_31, -3.4028235E38f, i45 / f12, i46 / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i27 = i35 + 1;
                z10 = z11;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                hVar = hVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new b4.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        kVar.accept(aVar);
    }

    @Override // b4.m
    public final int Y() {
        return 2;
    }

    @Override // b4.m
    public final void reset() {
        h hVar = this.f;
        hVar.c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f.clear();
        hVar.g.clear();
        hVar.h = null;
        hVar.i = null;
    }
}
