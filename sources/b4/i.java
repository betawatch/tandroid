package b4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import z3.m;
import z3.n;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i implements n {
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
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f = new h(H, H2);
    }

    public static byte[] a(int i10, int i11, a4.g gVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gVar.g(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        char c10;
        char c11;
        boolean z10;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        boolean z11;
        int i16;
        int g10;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z12;
        int g11;
        int i21;
        Paint paint2 = paint;
        a4.g gVar = new a4.g(bArr, bArr.length);
        int i22 = i11;
        int i23 = i12;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (gVar.b() != 0) {
            int i24 = 8;
            int g12 = gVar.g(8);
            if (g12 != 240) {
                int i25 = 3;
                int i26 = 2;
                int i27 = 4;
                switch (g12) {
                    case 16:
                        byte[] bArr6 = i10 == 3 ? bArr3 == null ? r : bArr3 : i10 == 2 ? bArr5 == null ? n : bArr5 : null;
                        boolean z13 = false;
                        while (true) {
                            int g13 = gVar.g(2);
                            if (g13 != 0) {
                                z10 = z13;
                                i13 = g13;
                                i14 = 1;
                            } else if (gVar.f()) {
                                int g14 = gVar.g(3) + 3;
                                z10 = z13;
                                i13 = gVar.g(2);
                                i14 = g14;
                            } else {
                                if (gVar.f()) {
                                    z10 = z13;
                                    i14 = 1;
                                    c10 = '\b';
                                    c11 = 4;
                                } else {
                                    int g15 = gVar.g(2);
                                    if (g15 == 0) {
                                        c10 = '\b';
                                        c11 = 4;
                                        z10 = true;
                                    } else if (g15 == 1) {
                                        c10 = '\b';
                                        c11 = 4;
                                        z10 = z13;
                                        i14 = 2;
                                    } else if (g15 == 2) {
                                        c10 = '\b';
                                        c11 = 4;
                                        i14 = gVar.g(4) + 12;
                                        i13 = gVar.g(2);
                                        z10 = z13;
                                        if (i14 != 0) {
                                        }
                                        i15 = i22;
                                        i22 = i15 + i14;
                                        if (z10) {
                                        }
                                    } else if (g15 != 3) {
                                        z10 = z13;
                                        c10 = '\b';
                                        c11 = 4;
                                    } else {
                                        c10 = '\b';
                                        int g16 = gVar.g(8) + 29;
                                        i13 = gVar.g(2);
                                        z10 = z13;
                                        i14 = g16;
                                        c11 = 4;
                                        if (i14 != 0 || paint2 == null) {
                                            i15 = i22;
                                        } else {
                                            if (bArr6 != 0) {
                                                i13 = bArr6[i13];
                                            }
                                            paint2.setColor(iArr[i13]);
                                            i15 = i22;
                                            canvas.drawRect(i22, i23, i22 + i14, i23 + 1, paint2);
                                        }
                                        i22 = i15 + i14;
                                        if (z10) {
                                            gVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z13 = z10;
                                        }
                                    }
                                    i13 = 0;
                                    i14 = 0;
                                    if (i14 != 0) {
                                    }
                                    i15 = i22;
                                    i22 = i15 + i14;
                                    if (z10) {
                                    }
                                }
                                i13 = 0;
                                if (i14 != 0) {
                                }
                                i15 = i22;
                                i22 = i15 + i14;
                                if (z10) {
                                }
                            }
                            c10 = '\b';
                            c11 = 4;
                            if (i14 != 0) {
                            }
                            i15 = i22;
                            i22 = i15 + i14;
                            if (z10) {
                            }
                        }
                    case 17:
                        if (i10 == 3) {
                            bArr2 = bArr4 == null ? s : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z14 = false;
                        while (true) {
                            int g17 = gVar.g(i27);
                            if (g17 != 0) {
                                z11 = z14;
                                i17 = g17;
                                i16 = 1;
                            } else if (gVar.f()) {
                                if (gVar.f()) {
                                    int g18 = gVar.g(i26);
                                    if (g18 == 0) {
                                        z11 = z14;
                                        i16 = 1;
                                    } else if (g18 != 1) {
                                        if (g18 == i26) {
                                            i16 = gVar.g(i27) + 9;
                                            g10 = gVar.g(i27);
                                        } else if (g18 != i25) {
                                            z11 = z14;
                                            i16 = 0;
                                        } else {
                                            i16 = gVar.g(i24) + 25;
                                            g10 = gVar.g(i27);
                                        }
                                        i17 = g10;
                                    } else {
                                        z11 = z14;
                                        i16 = i26;
                                    }
                                    i17 = 0;
                                } else {
                                    i16 = gVar.g(i26) + 4;
                                    i17 = gVar.g(i27);
                                }
                                z11 = z14;
                            } else {
                                int g19 = gVar.g(i25);
                                if (g19 != 0) {
                                    i16 = g19 + 2;
                                    z11 = z14;
                                    i17 = 0;
                                } else {
                                    z11 = true;
                                    i16 = 0;
                                    i17 = 0;
                                }
                            }
                            if (i16 == 0 || paint2 == null) {
                                i18 = i22;
                                i19 = i25;
                                i20 = i26;
                            } else {
                                if (bArr2 != 0) {
                                    i17 = bArr2[i17];
                                }
                                paint2.setColor(iArr[i17]);
                                i19 = i25;
                                i20 = 2;
                                i18 = i22;
                                canvas.drawRect(i22, i23, i22 + i16, i23 + 1, paint2);
                            }
                            i22 = i18 + i16;
                            if (z11) {
                                gVar.c();
                                break;
                            } else {
                                z14 = z11;
                                i25 = i19;
                                i26 = i20;
                                i27 = 4;
                                i24 = 8;
                            }
                        }
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int g20 = gVar.g(8);
                            if (g20 != 0) {
                                z12 = z15;
                                g11 = 1;
                            } else if (gVar.f()) {
                                z12 = z15;
                                g11 = gVar.g(7);
                                g20 = gVar.g(8);
                            } else {
                                int g21 = gVar.g(7);
                                if (g21 != 0) {
                                    z12 = z15;
                                    g11 = g21;
                                    g20 = 0;
                                } else {
                                    z12 = true;
                                    g20 = 0;
                                    g11 = 0;
                                }
                            }
                            if (g11 == 0 || paint2 == null) {
                                i21 = i22;
                            } else {
                                paint2.setColor(iArr[g20]);
                                i21 = i22;
                                canvas.drawRect(i22, i23, i22 + g11, i23 + 1, paint2);
                            }
                            i22 = i21 + g11;
                            if (z12) {
                                break;
                            } else {
                                z15 = z12;
                            }
                        }
                        break;
                    default:
                        switch (g12) {
                            case 32:
                                bArr5 = a(4, 4, gVar);
                                break;
                            case 33:
                                bArr3 = a(4, 8, gVar);
                                break;
                            case 34:
                                bArr4 = a(16, 8, gVar);
                                break;
                        }
                }
            } else {
                i23 += 2;
                i22 = i11;
            }
            paint2 = paint;
        }
    }

    public static a f(a4.g gVar, int i10) {
        int g10;
        int i11;
        int g11;
        int i12;
        int i13;
        int i14 = 8;
        int g12 = gVar.g(8);
        gVar.o(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int i17 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i16 > 0) {
            int g13 = gVar.g(i14);
            int g14 = gVar.g(i14);
            int[] iArr2 = (g14 & 128) != 0 ? iArr : (g14 & 64) != 0 ? b10 : c10;
            if ((g14 & 1) != 0) {
                i12 = gVar.g(i14);
                i13 = gVar.g(i14);
                g10 = gVar.g(i14);
                g11 = gVar.g(i14);
                i11 = i16 - 6;
            } else {
                int g15 = gVar.g(6) << i15;
                int g16 = gVar.g(4) << 4;
                g10 = gVar.g(4) << 4;
                i11 = i16 - 4;
                g11 = gVar.g(i15) << 6;
                i12 = g15;
                i13 = g16;
            }
            if (i12 == 0) {
                i13 = i17;
                g10 = i13;
                g11 = 255;
            }
            double d = i12;
            double d10 = i13 - 128;
            double d11 = g10 - 128;
            iArr2[g13] = d((byte) (255 - (g11 & 255)), m0.i((int) ((1.402d * d10) + d), 0, 255), m0.i((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), m0.i((int) ((d11 * 1.772d) + d), 0, 255));
            i16 = i11;
            i17 = 0;
            g12 = g12;
            c10 = c10;
            i14 = 8;
            i15 = 2;
        }
        return new a(g12, iArr, b10, c10);
    }

    public static c g(a4.g gVar) {
        byte[] bArr;
        int g10 = gVar.g(16);
        gVar.o(4);
        int g11 = gVar.g(2);
        boolean f7 = gVar.f();
        gVar.o(1);
        byte[] bArr2 = m0.b;
        if (g11 == 1) {
            gVar.o(gVar.g(8) * 16);
        } else if (g11 == 0) {
            int g12 = gVar.g(16);
            int g13 = gVar.g(16);
            if (g12 > 0) {
                bArr2 = new byte[g12];
                gVar.j(g12, bArr2);
            }
            if (g13 > 0) {
                bArr = new byte[g13];
                gVar.j(g13, bArr);
                return new c(bArr2, bArr, f7, g10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, f7, g10);
    }

    @Override // z3.n
    public final int h0() {
        return 2;
    }

    @Override // z3.n
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

    @Override // z3.n
    public final void u0(byte[] bArr, int i10, int i11, m mVar, j jVar) {
        h hVar;
        boolean z10;
        z3.b bVar;
        char c10;
        char c11;
        char c12;
        int i12;
        ArrayList arrayList;
        int i13;
        b bVar2;
        h hVar2;
        f fVar;
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        a4.g gVar = new a4.g(bArr, i10 + i11);
        gVar.m(i10);
        while (true) {
            int b10 = gVar.b();
            hVar = this.f;
            z10 = true;
            if (b10 >= 48 && gVar.g(8) == 15) {
                int g10 = gVar.g(8);
                int g11 = gVar.g(16);
                int g12 = gVar.g(16);
                int d = gVar.d() + g12;
                if (g12 * 8 > gVar.b()) {
                    e2.a.l("DvbParser", "Data field length exceeds limit");
                    gVar.o(gVar.b());
                } else {
                    switch (g10) {
                        case 16:
                            if (g11 == hVar.a) {
                                d dVar = hVar.i;
                                gVar.g(8);
                                int g13 = gVar.g(4);
                                int g14 = gVar.g(2);
                                gVar.o(2);
                                int i22 = g12 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i22 > 0) {
                                    int g15 = gVar.g(8);
                                    gVar.o(8);
                                    i22 -= 6;
                                    sparseArray.put(g15, new e(gVar.g(16), gVar.g(16)));
                                }
                                d dVar2 = new d(g13, g14, sparseArray);
                                if (g14 != 0) {
                                    hVar.i = dVar2;
                                    hVar.c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.a != g13) {
                                    hVar.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            SparseArray sparseArray2 = hVar.c;
                            if (g11 == hVar.a && dVar3 != null) {
                                int g16 = gVar.g(8);
                                gVar.o(4);
                                boolean f7 = gVar.f();
                                gVar.o(3);
                                int g17 = gVar.g(16);
                                int g18 = gVar.g(16);
                                gVar.g(3);
                                int g19 = gVar.g(3);
                                gVar.o(2);
                                int g20 = gVar.g(8);
                                int g21 = gVar.g(8);
                                int g22 = gVar.g(4);
                                int g23 = gVar.g(2);
                                gVar.o(2);
                                int i23 = g12 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int g24 = gVar.g(16);
                                    int g25 = gVar.g(2);
                                    gVar.g(2);
                                    int g26 = gVar.g(12);
                                    gVar.o(4);
                                    int g27 = gVar.g(12);
                                    int i24 = i23 - 6;
                                    if (g25 == 1 || g25 == 2) {
                                        gVar.g(8);
                                        gVar.g(8);
                                        i23 -= 8;
                                    } else {
                                        i23 = i24;
                                    }
                                    sparseArray3.put(g24, new g(g26, g27));
                                }
                                f fVar3 = new f(g16, f7, g17, g18, g19, g20, g21, g22, g23, sparseArray3);
                                if (dVar3.b == 0 && (fVar2 = (f) sparseArray2.get(g16)) != null) {
                                    SparseArray sparseArray4 = fVar2.j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        fVar3.j.put(sparseArray4.keyAt(i25), (g) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(fVar3.a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (g11 == hVar.a) {
                                a f10 = f(gVar, g12);
                                hVar.d.put(f10.a, f10);
                                break;
                            } else if (g11 == hVar.b) {
                                a f11 = f(gVar, g12);
                                hVar.f.put(f11.a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (g11 == hVar.a) {
                                c g28 = g(gVar);
                                hVar.e.put(g28.a, g28);
                                break;
                            } else if (g11 == hVar.b) {
                                c g29 = g(gVar);
                                hVar.g.put(g29.a, g29);
                                break;
                            }
                            break;
                        case 20:
                            if (g11 == hVar.a) {
                                gVar.o(4);
                                boolean f12 = gVar.f();
                                gVar.o(3);
                                int g30 = gVar.g(16);
                                int g31 = gVar.g(16);
                                if (f12) {
                                    int g32 = gVar.g(16);
                                    i18 = gVar.g(16);
                                    i21 = gVar.g(16);
                                    i19 = gVar.g(16);
                                    i20 = g32;
                                } else {
                                    i18 = g30;
                                    i19 = g31;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                hVar.h = new b(g30, g31, i20, i18, i21, i19);
                                break;
                            }
                            break;
                    }
                    gVar.p(d - gVar.d());
                }
            }
        }
        d dVar4 = hVar.i;
        if (dVar4 == null) {
            l0 l0Var = n0.b;
            bVar = new z3.b(-9223372036854775807L, -9223372036854775807L, x1.e);
        } else {
            b bVar3 = hVar.h;
            if (bVar3 == null) {
                bVar3 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.c;
            if (bitmap == null || bVar3.a + 1 != bitmap.getWidth() || bVar3.b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar3.a + 1, bVar3.b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.c;
            int i26 = 0;
            while (i26 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i26);
                f fVar4 = (f) hVar.c.get(sparseArray5.keyAt(i26));
                int i27 = eVar.a + bVar3.c;
                int i28 = eVar.b + bVar3.e;
                int i29 = fVar4.c;
                int i30 = fVar4.f;
                int i31 = fVar4.d;
                boolean z11 = z10;
                int i32 = i27 + i29;
                int i33 = i28 + i31;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i27, i28, Math.min(i32, bVar3.d), Math.min(i33, bVar3.f));
                a aVar = (a) hVar.d.get(i30);
                if (aVar == null && (aVar = (a) hVar.f.get(i30)) == null) {
                    aVar = this.e;
                }
                SparseArray sparseArray7 = fVar4.j;
                int i34 = i26;
                int i35 = 0;
                while (i35 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i35);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar2 = (g) sparseArray7.valueAt(i35);
                    int i36 = i28;
                    c cVar = (c) hVar.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.b ? null : this.a;
                        int i37 = i27;
                        int i38 = fVar4.e;
                        hVar2 = hVar;
                        int i39 = i37 + gVar2.a;
                        int i40 = i36 + gVar2.b;
                        int i41 = i31;
                        Paint paint2 = paint;
                        bVar2 = bVar3;
                        i15 = i29;
                        i14 = i37;
                        arrayList = arrayList2;
                        i13 = i36;
                        f fVar5 = fVar4;
                        int[] iArr = i38 == 3 ? aVar.d : i38 == 2 ? aVar.c : aVar.b;
                        fVar = fVar5;
                        i16 = i35;
                        i17 = i41;
                        e(cVar2.c, iArr, i38, i39, i40, paint2, canvas);
                        e(cVar2.d, iArr, i38, i39, i40 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i36;
                        bVar2 = bVar3;
                        hVar2 = hVar;
                        fVar = fVar4;
                        i14 = i27;
                        i15 = i29;
                        i16 = i35;
                        i17 = i31;
                    }
                    i35 = i16 + 1;
                    i29 = i15;
                    i28 = i13;
                    fVar4 = fVar;
                    i27 = i14;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar3 = bVar2;
                    hVar = hVar2;
                    i31 = i17;
                }
                b bVar4 = bVar3;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i42 = i28;
                f fVar6 = fVar4;
                int i43 = i27;
                int i44 = i29;
                int i45 = i31;
                if (fVar6.b) {
                    int i46 = fVar6.e;
                    if (i46 == 3) {
                        i12 = aVar.d[fVar6.g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i46 == 2 ? aVar.c[fVar6.h] : aVar.b[fVar6.i];
                    }
                    Paint paint3 = this.b;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i43, i42, i32, i33, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i43, i42, i44, i45);
                float f13 = bVar4.a;
                float f14 = bVar4.b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i42 / f14, 0, 0, i43 / f13, 0, TLObject.FLAG_31, -3.4028235E38f, i44 / f13, i45 / f14, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i26 = i34 + 1;
                z10 = z11;
                bVar3 = bVar4;
                arrayList2 = arrayList3;
                hVar = hVar3;
                sparseArray5 = sparseArray6;
            }
            bVar = new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        jVar.accept(bVar);
    }

    @Override // z3.n
    public final /* synthetic */ z3.e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }
}
