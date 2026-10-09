package b4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        v vVar = new v((byte[]) list.get(0));
        int D = vVar.D();
        int D2 = vVar.D();
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
        this.f = new h(D, D2);
    }

    public static byte[] a(int i10, int i11, a4.g gVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gVar.i(i11);
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        int i22;
        int i23;
        Paint paint2 = paint;
        a4.g gVar = new a4.g(bArr, bArr.length);
        int i24 = i11;
        int i25 = i12;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (gVar.b() != 0) {
            int i26 = 8;
            int i27 = gVar.i(8);
            if (i27 != 240) {
                int i28 = 3;
                int i29 = 2;
                int i30 = 4;
                switch (i27) {
                    case 16:
                        byte[] bArr6 = i10 == 3 ? bArr3 == null ? r : bArr3 : i10 == 2 ? bArr5 == null ? n : bArr5 : null;
                        boolean z13 = false;
                        while (true) {
                            int i31 = gVar.i(2);
                            if (i31 != 0) {
                                z10 = z13;
                                i13 = i31;
                                i14 = 1;
                            } else if (gVar.h()) {
                                int i32 = gVar.i(3) + 3;
                                z10 = z13;
                                i13 = gVar.i(2);
                                i14 = i32;
                            } else {
                                if (gVar.h()) {
                                    z10 = z13;
                                    i14 = 1;
                                    c10 = '\b';
                                    c11 = 4;
                                } else {
                                    int i33 = gVar.i(2);
                                    if (i33 == 0) {
                                        c10 = '\b';
                                        c11 = 4;
                                        z10 = true;
                                    } else if (i33 == 1) {
                                        c10 = '\b';
                                        c11 = 4;
                                        z10 = z13;
                                        i14 = 2;
                                    } else if (i33 == 2) {
                                        c10 = '\b';
                                        c11 = 4;
                                        i14 = gVar.i(4) + 12;
                                        i13 = gVar.i(2);
                                        z10 = z13;
                                        if (i14 != 0) {
                                        }
                                        i15 = i24;
                                        i24 = i15 + i14;
                                        if (z10) {
                                        }
                                    } else if (i33 != 3) {
                                        z10 = z13;
                                        c10 = '\b';
                                        c11 = 4;
                                    } else {
                                        c10 = '\b';
                                        int i34 = gVar.i(8) + 29;
                                        i13 = gVar.i(2);
                                        z10 = z13;
                                        i14 = i34;
                                        c11 = 4;
                                        if (i14 != 0 || paint2 == null) {
                                            i15 = i24;
                                        } else {
                                            if (bArr6 != 0) {
                                                i13 = bArr6[i13];
                                            }
                                            paint2.setColor(iArr[i13]);
                                            i15 = i24;
                                            canvas.drawRect(i24, i25, i24 + i14, i25 + 1, paint2);
                                        }
                                        i24 = i15 + i14;
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
                                    i15 = i24;
                                    i24 = i15 + i14;
                                    if (z10) {
                                    }
                                }
                                i13 = 0;
                                if (i14 != 0) {
                                }
                                i15 = i24;
                                i24 = i15 + i14;
                                if (z10) {
                                }
                            }
                            c10 = '\b';
                            c11 = 4;
                            if (i14 != 0) {
                            }
                            i15 = i24;
                            i24 = i15 + i14;
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
                            int i35 = gVar.i(i30);
                            if (i35 != 0) {
                                z11 = z14;
                                i18 = i35;
                                i16 = 1;
                            } else if (gVar.h()) {
                                if (gVar.h()) {
                                    int i36 = gVar.i(i29);
                                    if (i36 == 0) {
                                        z11 = z14;
                                        i16 = 1;
                                    } else if (i36 != 1) {
                                        if (i36 == i29) {
                                            i16 = gVar.i(i30) + 9;
                                            i17 = gVar.i(i30);
                                        } else if (i36 != i28) {
                                            z11 = z14;
                                            i16 = 0;
                                        } else {
                                            i16 = gVar.i(i26) + 25;
                                            i17 = gVar.i(i30);
                                        }
                                        i18 = i17;
                                    } else {
                                        z11 = z14;
                                        i16 = i29;
                                    }
                                    i18 = 0;
                                } else {
                                    i16 = gVar.i(i29) + 4;
                                    i18 = gVar.i(i30);
                                }
                                z11 = z14;
                            } else {
                                int i37 = gVar.i(i28);
                                if (i37 != 0) {
                                    i16 = i37 + 2;
                                    z11 = z14;
                                    i18 = 0;
                                } else {
                                    z11 = true;
                                    i16 = 0;
                                    i18 = 0;
                                }
                            }
                            if (i16 == 0 || paint2 == null) {
                                i19 = i24;
                                i20 = i28;
                                i21 = i29;
                            } else {
                                if (bArr2 != 0) {
                                    i18 = bArr2[i18];
                                }
                                paint2.setColor(iArr[i18]);
                                i20 = i28;
                                i21 = 2;
                                i19 = i24;
                                canvas.drawRect(i24, i25, i24 + i16, i25 + 1, paint2);
                            }
                            i24 = i19 + i16;
                            if (z11) {
                                gVar.c();
                                break;
                            } else {
                                z14 = z11;
                                i28 = i20;
                                i29 = i21;
                                i30 = 4;
                                i26 = 8;
                            }
                        }
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int i38 = gVar.i(8);
                            if (i38 != 0) {
                                z12 = z15;
                                i22 = 1;
                            } else if (gVar.h()) {
                                z12 = z15;
                                i22 = gVar.i(7);
                                i38 = gVar.i(8);
                            } else {
                                int i39 = gVar.i(7);
                                if (i39 != 0) {
                                    z12 = z15;
                                    i22 = i39;
                                    i38 = 0;
                                } else {
                                    z12 = true;
                                    i38 = 0;
                                    i22 = 0;
                                }
                            }
                            if (i22 == 0 || paint2 == null) {
                                i23 = i24;
                            } else {
                                paint2.setColor(iArr[i38]);
                                i23 = i24;
                                canvas.drawRect(i24, i25, i24 + i22, i25 + 1, paint2);
                            }
                            i24 = i23 + i22;
                            if (z12) {
                                break;
                            } else {
                                z15 = z12;
                            }
                        }
                        break;
                    default:
                        switch (i27) {
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
                i25 += 2;
                i24 = i11;
            }
            paint2 = paint;
        }
    }

    public static a f(a4.g gVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = gVar.i(8);
        gVar.t(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i19 > 0) {
            int i21 = gVar.i(i16);
            int i22 = gVar.i(i16);
            int[] iArr2 = (i22 & 128) != 0 ? iArr : (i22 & 64) != 0 ? b10 : c10;
            if ((i22 & 1) != 0) {
                i14 = gVar.i(i16);
                i15 = gVar.i(i16);
                i11 = gVar.i(i16);
                i13 = gVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i23 = gVar.i(6) << i18;
                int i24 = gVar.i(4) << 4;
                i11 = gVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = gVar.i(i18) << 6;
                i14 = i23;
                i15 = i24;
            }
            if (i14 == 0) {
                i15 = i20;
                i11 = i15;
                i13 = 255;
            }
            double d = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr2[i21] = d((byte) (255 - (i13 & 255)), d0.h((int) ((1.402d * d10) + d), 0, 255), d0.h((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), d0.h((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i20 = 0;
            i17 = i17;
            c10 = c10;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr, b10, c10);
    }

    public static c g(a4.g gVar) {
        byte[] bArr;
        int i10 = gVar.i(16);
        gVar.t(4);
        int i11 = gVar.i(2);
        boolean h = gVar.h();
        gVar.t(1);
        byte[] bArr2 = d0.b;
        if (i11 == 1) {
            gVar.t(gVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = gVar.i(16);
            int i13 = gVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                gVar.l(i12, bArr2);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                gVar.l(i13, bArr);
                return new c(bArr2, bArr, h, i10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h, i10);
    }

    @Override // z3.m
    public final int O() {
        return 2;
    }

    @Override // z3.m
    public final void P(byte[] bArr, int i10, int i11, l lVar, e2.h hVar) {
        h hVar2;
        boolean z10;
        z3.a aVar;
        char c10;
        char c11;
        char c12;
        int i12;
        ArrayList arrayList;
        int i13;
        b bVar;
        h hVar3;
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
        gVar.q(i10);
        while (true) {
            int b10 = gVar.b();
            hVar2 = this.f;
            z10 = true;
            if (b10 >= 48 && gVar.i(8) == 15) {
                int i22 = gVar.i(8);
                int i23 = gVar.i(16);
                int i24 = gVar.i(16);
                int f7 = gVar.f() + i24;
                if (i24 * 8 > gVar.b()) {
                    e2.a.n("DvbParser", "Data field length exceeds limit");
                    gVar.t(gVar.b());
                } else {
                    switch (i22) {
                        case 16:
                            if (i23 == hVar2.a) {
                                d dVar = hVar2.i;
                                gVar.i(8);
                                int i25 = gVar.i(4);
                                int i26 = gVar.i(2);
                                gVar.t(2);
                                int i27 = i24 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i27 > 0) {
                                    int i28 = gVar.i(8);
                                    gVar.t(8);
                                    i27 -= 6;
                                    sparseArray.put(i28, new e(gVar.i(16), gVar.i(16)));
                                }
                                d dVar2 = new d(i25, i26, sparseArray);
                                if (i26 != 0) {
                                    hVar2.i = dVar2;
                                    hVar2.c.clear();
                                    hVar2.d.clear();
                                    hVar2.e.clear();
                                    break;
                                } else if (dVar != null && dVar.a != i25) {
                                    hVar2.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar2.i;
                            SparseArray sparseArray2 = hVar2.c;
                            if (i23 == hVar2.a && dVar3 != null) {
                                int i29 = gVar.i(8);
                                gVar.t(4);
                                boolean h = gVar.h();
                                gVar.t(3);
                                int i30 = gVar.i(16);
                                int i31 = gVar.i(16);
                                gVar.i(3);
                                int i32 = gVar.i(3);
                                gVar.t(2);
                                int i33 = gVar.i(8);
                                int i34 = gVar.i(8);
                                int i35 = gVar.i(4);
                                int i36 = gVar.i(2);
                                gVar.t(2);
                                int i37 = i24 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i37 > 0) {
                                    int i38 = gVar.i(16);
                                    int i39 = gVar.i(2);
                                    gVar.i(2);
                                    int i40 = gVar.i(12);
                                    gVar.t(4);
                                    int i41 = gVar.i(12);
                                    int i42 = i37 - 6;
                                    if (i39 == 1 || i39 == 2) {
                                        gVar.i(8);
                                        gVar.i(8);
                                        i37 -= 8;
                                    } else {
                                        i37 = i42;
                                    }
                                    sparseArray3.put(i38, new g(i40, i41));
                                }
                                f fVar3 = new f(i29, h, i30, i31, i32, i33, i34, i35, i36, sparseArray3);
                                if (dVar3.b == 0 && (fVar2 = (f) sparseArray2.get(i29)) != null) {
                                    SparseArray sparseArray4 = fVar2.j;
                                    for (int i43 = 0; i43 < sparseArray4.size(); i43++) {
                                        fVar3.j.put(sparseArray4.keyAt(i43), (g) sparseArray4.valueAt(i43));
                                    }
                                }
                                sparseArray2.put(fVar3.a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i23 == hVar2.a) {
                                a f10 = f(gVar, i24);
                                hVar2.d.put(f10.a, f10);
                                break;
                            } else if (i23 == hVar2.b) {
                                a f11 = f(gVar, i24);
                                hVar2.f.put(f11.a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (i23 == hVar2.a) {
                                c g10 = g(gVar);
                                hVar2.e.put(g10.a, g10);
                                break;
                            } else if (i23 == hVar2.b) {
                                c g11 = g(gVar);
                                hVar2.g.put(g11.a, g11);
                                break;
                            }
                            break;
                        case 20:
                            if (i23 == hVar2.a) {
                                gVar.t(4);
                                boolean h10 = gVar.h();
                                gVar.t(3);
                                int i44 = gVar.i(16);
                                int i45 = gVar.i(16);
                                if (h10) {
                                    int i46 = gVar.i(16);
                                    i18 = gVar.i(16);
                                    i21 = gVar.i(16);
                                    i19 = gVar.i(16);
                                    i20 = i46;
                                } else {
                                    i18 = i44;
                                    i19 = i45;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                hVar2.h = new b(i44, i45, i20, i18, i21, i19);
                                break;
                            }
                            break;
                    }
                    gVar.u(f7 - gVar.f());
                }
            }
        }
        d dVar4 = hVar2.i;
        if (dVar4 == null) {
            g0 g0Var = i0.b;
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, a1.e);
        } else {
            b bVar2 = hVar2.h;
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
            SparseArray sparseArray5 = (SparseArray) dVar4.c;
            int i47 = 0;
            while (i47 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i47);
                f fVar4 = (f) hVar2.c.get(sparseArray5.keyAt(i47));
                int i48 = eVar.a + bVar2.c;
                int i49 = eVar.b + bVar2.e;
                int i50 = fVar4.c;
                int i51 = fVar4.f;
                int i52 = fVar4.d;
                boolean z11 = z10;
                int i53 = i48 + i50;
                int i54 = i49 + i52;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i48, i49, Math.min(i53, bVar2.d), Math.min(i54, bVar2.f));
                a aVar2 = (a) hVar2.d.get(i51);
                if (aVar2 == null && (aVar2 = (a) hVar2.f.get(i51)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = fVar4.j;
                int i55 = i47;
                int i56 = 0;
                while (i56 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i56);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar2 = (g) sparseArray7.valueAt(i56);
                    int i57 = i49;
                    c cVar = (c) hVar2.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar2.g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.b ? null : this.a;
                        int i58 = i48;
                        int i59 = fVar4.e;
                        hVar3 = hVar2;
                        int i60 = i58 + gVar2.a;
                        int i61 = i57 + gVar2.b;
                        int i62 = i52;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i15 = i50;
                        i14 = i58;
                        arrayList = arrayList2;
                        i13 = i57;
                        f fVar5 = fVar4;
                        int[] iArr = i59 == 3 ? aVar2.d : i59 == 2 ? aVar2.c : aVar2.b;
                        fVar = fVar5;
                        i16 = i56;
                        i17 = i62;
                        e(cVar2.c, iArr, i59, i60, i61, paint2, canvas);
                        e(cVar2.d, iArr, i59, i60, i61 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i57;
                        bVar = bVar2;
                        hVar3 = hVar2;
                        fVar = fVar4;
                        i14 = i48;
                        i15 = i50;
                        i16 = i56;
                        i17 = i52;
                    }
                    i56 = i16 + 1;
                    i50 = i15;
                    i49 = i13;
                    fVar4 = fVar;
                    i48 = i14;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    hVar2 = hVar3;
                    i52 = i17;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar4 = hVar2;
                int i63 = i49;
                f fVar6 = fVar4;
                int i64 = i48;
                int i65 = i50;
                int i66 = i52;
                if (fVar6.b) {
                    int i67 = fVar6.e;
                    if (i67 == 3) {
                        i12 = aVar2.d[fVar6.g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i67 == 2 ? aVar2.c[fVar6.h] : aVar2.b[fVar6.i];
                    }
                    Paint paint3 = this.b;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i64, i63, i53, i54, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i64, i63, i65, i66);
                float f12 = bVar3.a;
                float f13 = bVar3.b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i63 / f13, 0, 0, i64 / f12, 0, TLObject.FLAG_31, -3.4028235E38f, i65 / f12, i66 / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i47 = i55 + 1;
                z10 = z11;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                hVar2 = hVar4;
                sparseArray5 = sparseArray6;
            }
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        hVar.accept(aVar);
    }

    @Override // z3.m
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

    @Override // z3.m
    public final /* synthetic */ z3.d s(int i10, int i11, byte[] bArr) {
        return sc.v.a(this, bArr, i11);
    }
}
