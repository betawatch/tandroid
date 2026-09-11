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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    public static byte[] a(int i10, int i11, a4.h hVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) hVar.i(i11);
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

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206 A[LOOP:3: B:86:0x0155->B:97:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int i13;
        boolean z10;
        int i14;
        int i15;
        byte[] bArr2;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        int i20;
        int i21;
        Paint paint2 = paint;
        a4.h hVar = new a4.h(bArr, bArr.length);
        int i22 = i11;
        int i23 = i12;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (hVar.b() != 0) {
            int i24 = 8;
            int i25 = hVar.i(8);
            if (i25 != 240) {
                int i26 = 3;
                int i27 = 2;
                int i28 = 4;
                switch (i25) {
                    case 16:
                        byte[] bArr6 = i10 == 3 ? bArr3 == null ? r : bArr3 : i10 == 2 ? bArr5 == null ? n : bArr5 : null;
                        boolean z13 = false;
                        while (true) {
                            int i29 = hVar.i(2);
                            if (i29 != 0) {
                                z10 = z13;
                                i13 = i29;
                            } else {
                                if (hVar.h()) {
                                    int i30 = hVar.i(3) + 3;
                                    z10 = z13;
                                    i13 = hVar.i(2);
                                    i14 = i30;
                                } else if (hVar.h()) {
                                    z10 = z13;
                                    i13 = 0;
                                } else {
                                    int i31 = hVar.i(2);
                                    if (i31 != 0) {
                                        if (i31 == 1) {
                                            z10 = z13;
                                            i13 = 0;
                                            i14 = 2;
                                        } else if (i31 == 2) {
                                            i14 = hVar.i(4) + 12;
                                            i13 = hVar.i(2);
                                            z10 = z13;
                                        } else if (i31 != 3) {
                                            z10 = z13;
                                            i13 = 0;
                                        } else {
                                            int i32 = hVar.i(8) + 29;
                                            i13 = hVar.i(2);
                                            z10 = z13;
                                            i14 = i32;
                                        }
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
                                        if (!z10) {
                                            hVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z13 = z10;
                                        }
                                    } else {
                                        i13 = 0;
                                        z10 = true;
                                    }
                                    i14 = 0;
                                    if (i14 != 0) {
                                    }
                                    i15 = i22;
                                    i22 = i15 + i14;
                                    if (!z10) {
                                    }
                                }
                                if (i14 != 0) {
                                }
                                i15 = i22;
                                i22 = i15 + i14;
                                if (!z10) {
                                }
                            }
                            i14 = 1;
                            if (i14 != 0) {
                            }
                            i15 = i22;
                            i22 = i15 + i14;
                            if (!z10) {
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
                            int i33 = hVar.i(i28);
                            if (i33 != 0) {
                                z11 = z14;
                                i18 = i33;
                                i16 = 1;
                            } else if (hVar.h()) {
                                if (hVar.h()) {
                                    int i34 = hVar.i(i27);
                                    if (i34 == 0) {
                                        z11 = z14;
                                        i16 = 1;
                                    } else if (i34 != 1) {
                                        if (i34 == i27) {
                                            i16 = hVar.i(i28) + 9;
                                            i17 = hVar.i(i28);
                                        } else if (i34 != i26) {
                                            z11 = z14;
                                            i16 = 0;
                                        } else {
                                            i16 = hVar.i(i24) + 25;
                                            i17 = hVar.i(i28);
                                        }
                                        i18 = i17;
                                    } else {
                                        z11 = z14;
                                        i16 = 2;
                                    }
                                    i18 = 0;
                                } else {
                                    i16 = hVar.i(i27) + 4;
                                    i18 = hVar.i(i28);
                                }
                                z11 = z14;
                            } else {
                                int i35 = hVar.i(i26);
                                if (i35 != 0) {
                                    i16 = i35 + 2;
                                    z11 = z14;
                                    i18 = 0;
                                } else {
                                    z11 = true;
                                    i16 = 0;
                                    i18 = 0;
                                }
                            }
                            if (i16 == 0 || paint2 == null) {
                                i19 = i22;
                            } else {
                                if (bArr2 != 0) {
                                    i18 = bArr2[i18];
                                }
                                paint2.setColor(iArr[i18]);
                                i19 = i22;
                                canvas.drawRect(i22, i23, i22 + i16, i23 + 1, paint2);
                            }
                            i22 = i19 + i16;
                            if (z11) {
                                hVar.c();
                                break;
                            } else {
                                z14 = z11;
                                i26 = 3;
                                i27 = 2;
                                i28 = 4;
                                i24 = 8;
                            }
                        }
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int i36 = hVar.i(8);
                            if (i36 != 0) {
                                z12 = z15;
                                i20 = 1;
                            } else if (hVar.h()) {
                                z12 = z15;
                                i20 = hVar.i(7);
                                i36 = hVar.i(8);
                            } else {
                                int i37 = hVar.i(7);
                                if (i37 != 0) {
                                    z12 = z15;
                                    i20 = i37;
                                    i36 = 0;
                                } else {
                                    i36 = 0;
                                    z12 = true;
                                    i20 = 0;
                                }
                            }
                            if (i20 == 0 || paint2 == null) {
                                i21 = i22;
                            } else {
                                paint2.setColor(iArr[i36]);
                                i21 = i22;
                                canvas.drawRect(i22, i23, i22 + i20, i23 + 1, paint2);
                            }
                            i22 = i21 + i20;
                            if (z12) {
                                break;
                            } else {
                                z15 = z12;
                            }
                        }
                        break;
                    default:
                        switch (i25) {
                            case 32:
                                bArr5 = a(4, 4, hVar);
                                break;
                            case 33:
                                bArr3 = a(4, 8, hVar);
                                break;
                            case 34:
                                bArr4 = a(16, 8, hVar);
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

    public static a f(a4.h hVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = hVar.i(8);
        hVar.t(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i19 > 0) {
            int i20 = hVar.i(i16);
            int i21 = hVar.i(i16);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? b10 : c10;
            if ((i21 & 1) != 0) {
                i14 = hVar.i(i16);
                i15 = hVar.i(i16);
                i11 = hVar.i(i16);
                i13 = hVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i22 = hVar.i(6) << i18;
                int i23 = hVar.i(4) << 4;
                i11 = hVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = hVar.i(i18) << 6;
                i14 = i22;
                i15 = i23;
            }
            if (i14 == 0) {
                i15 = 0;
                i11 = 0;
                i13 = 255;
            }
            double d = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr2[i20] = d((byte) (255 - (i13 & 255)), d0.h((int) ((1.402d * d10) + d), 0, 255), d0.h((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), d0.h((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i17 = i17;
            c10 = c10;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr, b10, c10);
    }

    public static c g(a4.h hVar) {
        byte[] bArr;
        int i10 = hVar.i(16);
        hVar.t(4);
        int i11 = hVar.i(2);
        boolean h = hVar.h();
        hVar.t(1);
        byte[] bArr2 = d0.b;
        if (i11 == 1) {
            hVar.t(hVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = hVar.i(16);
            int i13 = hVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                hVar.l(i12, bArr2);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                hVar.l(i13, bArr);
                return new c(bArr2, bArr, h, i10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h, i10);
    }

    @Override // z3.m
    public final int U() {
        return 2;
    }

    @Override // z3.m
    public final void e0(byte[] bArr, int i10, int i11, l lVar, e2.h hVar) {
        h hVar2;
        z3.a aVar;
        ArrayList arrayList;
        int i12;
        b bVar;
        h hVar3;
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
        a4.h hVar4 = new a4.h(bArr, i10 + i11);
        hVar4.q(i10);
        while (true) {
            int b10 = hVar4.b();
            hVar2 = this.f;
            if (b10 >= 48 && hVar4.i(8) == 15) {
                int i21 = hVar4.i(8);
                int i22 = hVar4.i(16);
                int i23 = hVar4.i(16);
                int f7 = hVar4.f() + i23;
                if (i23 * 8 > hVar4.b()) {
                    e2.a.n("DvbParser", "Data field length exceeds limit");
                    hVar4.t(hVar4.b());
                } else {
                    switch (i21) {
                        case 16:
                            if (i22 == hVar2.a) {
                                d dVar = hVar2.i;
                                hVar4.i(8);
                                int i24 = hVar4.i(4);
                                int i25 = hVar4.i(2);
                                hVar4.t(2);
                                int i26 = i23 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i26 > 0) {
                                    int i27 = hVar4.i(8);
                                    hVar4.t(8);
                                    i26 -= 6;
                                    sparseArray.put(i27, new e(hVar4.i(16), hVar4.i(16)));
                                }
                                d dVar2 = new d(i24, i25, sparseArray);
                                if (i25 != 0) {
                                    hVar2.i = dVar2;
                                    hVar2.c.clear();
                                    hVar2.d.clear();
                                    hVar2.e.clear();
                                    break;
                                } else if (dVar != null && dVar.a != i24) {
                                    hVar2.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar2.i;
                            SparseArray sparseArray2 = hVar2.c;
                            if (i22 == hVar2.a && dVar3 != null) {
                                int i28 = hVar4.i(8);
                                hVar4.t(4);
                                boolean h = hVar4.h();
                                hVar4.t(3);
                                int i29 = hVar4.i(16);
                                int i30 = hVar4.i(16);
                                hVar4.i(3);
                                int i31 = hVar4.i(3);
                                hVar4.t(2);
                                int i32 = hVar4.i(8);
                                int i33 = hVar4.i(8);
                                int i34 = hVar4.i(4);
                                int i35 = hVar4.i(2);
                                hVar4.t(2);
                                int i36 = i23 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i36 > 0) {
                                    int i37 = hVar4.i(16);
                                    int i38 = hVar4.i(2);
                                    hVar4.i(2);
                                    int i39 = hVar4.i(12);
                                    hVar4.t(4);
                                    int i40 = hVar4.i(12);
                                    int i41 = i36 - 6;
                                    if (i38 == 1 || i38 == 2) {
                                        hVar4.i(8);
                                        hVar4.i(8);
                                        i36 -= 8;
                                    } else {
                                        i36 = i41;
                                    }
                                    sparseArray3.put(i37, new g(i39, i40));
                                }
                                f fVar3 = new f(i28, h, i29, i30, i31, i32, i33, i34, i35, sparseArray3);
                                if (dVar3.b == 0 && (fVar2 = (f) sparseArray2.get(i28)) != null) {
                                    SparseArray sparseArray4 = fVar2.j;
                                    for (int i42 = 0; i42 < sparseArray4.size(); i42++) {
                                        fVar3.j.put(sparseArray4.keyAt(i42), (g) sparseArray4.valueAt(i42));
                                    }
                                }
                                sparseArray2.put(fVar3.a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i22 == hVar2.a) {
                                a f10 = f(hVar4, i23);
                                hVar2.d.put(f10.a, f10);
                                break;
                            } else if (i22 == hVar2.b) {
                                a f11 = f(hVar4, i23);
                                hVar2.f.put(f11.a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (i22 == hVar2.a) {
                                c g10 = g(hVar4);
                                hVar2.e.put(g10.a, g10);
                                break;
                            } else if (i22 == hVar2.b) {
                                c g11 = g(hVar4);
                                hVar2.g.put(g11.a, g11);
                                break;
                            }
                            break;
                        case 20:
                            if (i22 == hVar2.a) {
                                hVar4.t(4);
                                boolean h10 = hVar4.h();
                                hVar4.t(3);
                                int i43 = hVar4.i(16);
                                int i44 = hVar4.i(16);
                                if (h10) {
                                    int i45 = hVar4.i(16);
                                    i17 = hVar4.i(16);
                                    i20 = hVar4.i(16);
                                    i18 = hVar4.i(16);
                                    i19 = i45;
                                } else {
                                    i17 = i43;
                                    i18 = i44;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                hVar2.h = new b(i43, i44, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    hVar4.u(f7 - hVar4.f());
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
            int i46 = 0;
            while (i46 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i46);
                f fVar4 = (f) hVar2.c.get(sparseArray5.keyAt(i46));
                int i47 = eVar.a + bVar2.c;
                int i48 = eVar.b + bVar2.e;
                int i49 = fVar4.c;
                int i50 = fVar4.f;
                int i51 = fVar4.d;
                int i52 = i47 + i49;
                int i53 = i48 + i51;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i47, i48, Math.min(i52, bVar2.d), Math.min(i53, bVar2.f));
                a aVar2 = (a) hVar2.d.get(i50);
                if (aVar2 == null && (aVar2 = (a) hVar2.f.get(i50)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = fVar4.j;
                int i54 = i46;
                int i55 = 0;
                while (i55 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i55);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar = (g) sparseArray7.valueAt(i55);
                    int i56 = i48;
                    c cVar = (c) hVar2.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar2.g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.b ? null : this.a;
                        int i57 = i47;
                        int i58 = fVar4.e;
                        hVar3 = hVar2;
                        int i59 = i57 + gVar.a;
                        int i60 = i56 + gVar.b;
                        int i61 = i51;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i14 = i49;
                        i13 = i57;
                        arrayList = arrayList2;
                        i12 = i56;
                        f fVar5 = fVar4;
                        int[] iArr = i58 == 3 ? aVar2.d : i58 == 2 ? aVar2.c : aVar2.b;
                        fVar = fVar5;
                        i15 = i55;
                        i16 = i61;
                        e(cVar2.c, iArr, i58, i59, i60, paint2, canvas);
                        e(cVar2.d, iArr, i58, i59, i60 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i12 = i56;
                        bVar = bVar2;
                        hVar3 = hVar2;
                        fVar = fVar4;
                        i13 = i47;
                        i14 = i49;
                        i15 = i55;
                        i16 = i51;
                    }
                    i55 = i15 + 1;
                    i49 = i14;
                    i48 = i12;
                    fVar4 = fVar;
                    i47 = i13;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    hVar2 = hVar3;
                    i51 = i16;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar5 = hVar2;
                int i62 = i48;
                f fVar6 = fVar4;
                int i63 = i47;
                int i64 = i49;
                int i65 = i51;
                if (fVar6.b) {
                    int i66 = fVar6.e;
                    int i67 = i66 == 3 ? aVar2.d[fVar6.g] : i66 == 2 ? aVar2.c[fVar6.h] : aVar2.b[fVar6.i];
                    Paint paint3 = this.b;
                    paint3.setColor(i67);
                    canvas.drawRect(i63, i62, i52, i53, paint3);
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i63, i62, i64, i65);
                float f12 = bVar3.a;
                float f13 = bVar3.b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i62 / f13, 0, 0, i63 / f12, 0, TLObject.FLAG_31, -3.4028235E38f, i64 / f12, i65 / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i46 = i54 + 1;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                sparseArray5 = sparseArray6;
                hVar2 = hVar5;
            }
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        hVar.accept(aVar);
    }

    @Override // z3.m
    public final /* synthetic */ z3.d p(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
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
}
