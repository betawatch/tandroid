package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.firebase.messaging.r;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private Drawable centerDrawable;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private kc.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f7, float f10, Paint paint, float f11, float f12, int i10, float f13, float f14, float[] fArr, boolean z10) {
        float f15;
        float f16;
        Path path = new Path();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                f15 = i10;
                f16 = f15;
            } else if (i11 == 1) {
                f16 = i10;
                f15 = (f13 - (f11 * f12)) - f16;
            } else {
                f15 = i10;
                f16 = (f13 - (f11 * f12)) - f15;
            }
            float f17 = f15 + f7;
            float f18 = f16 + f10;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f19 = (f11 - 1.0f) * f12;
                rectF.set(f17 + f12, f18 + f12, f17 + f19, f19 + f18);
                float f20 = ((f11 * f12) / 4.0f) * f14;
                path.reset();
                path.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f21 = f11 * f12;
            float f22 = (f21 / 3.0f) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f17, f18, f17 + f21, f21 + f18);
            canvas.drawRoundRect(rectF2, f22, f22, paint);
            if (z10) {
                canvas.restore();
            }
            float f23 = (f11 - 2.0f) * f12;
            float f24 = (f23 / 4.0f) * f14;
            float f25 = 2.0f * f12;
            rectF2.set(f17 + f25, f25 + f18, f17 + f23, f18 + f23);
            canvas.drawRoundRect(rectF2, f24, f24, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f7, float f10, int i10, float f11, float f12, float[] fArr, int i11, int i12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10 = Color.alpha(i11) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0) {
                f16 = i10;
                f15 = f16;
            } else {
                if (i13 == 1) {
                    f14 = i10;
                    f13 = (f11 - (f7 * f10)) - f14;
                } else {
                    f13 = i10;
                    f14 = (f11 - (f7 * f10)) - f13;
                }
                f15 = f13;
                f16 = f14;
            }
            if (z10) {
                float f18 = (f7 - 1.0f) * f10;
                f17 = 1.0f;
                rectF.set(f15 + f10, f16 + f10, f15 + f18, f18 + f16);
                float f19 = ((f7 * f10) / 4.0f) * f12;
                path.reset();
                path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f17 = 1.0f;
            }
            float f20 = f7 * f10;
            Arrays.fill(fArr, (f20 / 3.0f) * f12);
            gradientDrawable.setColor(i12);
            gradientDrawable.setBounds((int) f15, (int) f16, (int) (f15 + f20), (int) (f16 + f20));
            gradientDrawable.draw(canvas);
            float f21 = f16;
            float f22 = f15 + f10;
            float f23 = f21 + f10;
            float f24 = (f7 - f17) * f10;
            float f25 = f15 + f24;
            float f26 = f24 + f21;
            canvas.drawRect(f22, f23, f25, f26, paint);
            if (z10) {
                canvas.restore();
            }
            if (!z10) {
                Arrays.fill(fArr, (f20 / 4.0f) * f12);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f22, (int) f23, (int) f25, (int) f26);
                gradientDrawable.draw(canvas);
            }
            float f27 = (f7 - 2.0f) * f10;
            Arrays.fill(fArr, (f27 / 4.0f) * f12);
            gradientDrawable.setColor(i12);
            float f28 = 2.0f * f10;
            gradientDrawable.setBounds((int) (f15 + f28), (int) (f21 + f28), (int) (f15 + f27), (int) (f21 + f27));
            gradientDrawable.draw(canvas);
        }
    }

    private boolean has(int i10, int i11) {
        int i12 = this.imageBlockX;
        if (i10 >= i12) {
            int i13 = this.imageBloks;
            if (i10 < i12 + i13 && i11 >= i12 && i11 < i12 + i13) {
                return false;
            }
        }
        int i14 = this.sideQuadSize;
        if ((i10 < i14 || i10 >= this.input.b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.input.c - i14) && i10 >= 0 && i11 >= 0) {
            kc.b bVar = this.input;
            if (i10 < bVar.b && i11 < bVar.c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<dc.b, ?> map, Bitmap bitmap) {
        return encode(str, i10, i11, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    public void setCenterDrawable(Drawable drawable) {
        this.centerDrawable = drawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x064b, code lost:
    
        if ((r13 >= 0 && r13 < 8) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x070f, code lost:
    
        if (r3 == false) goto L359;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0785 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x02b0 A[LOOP:35: B:545:0x02ae->B:546:0x02b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0300 A[LOOP:2: B:68:0x02fe->B:69:0x0300, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap encode(String str, int i10, int i11, Map<dc.b, ?> map, Bitmap bitmap, float f7, int i12, int i13) {
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        Charset forName;
        int i15;
        ic.e eVar;
        int i16;
        ic.f fVar;
        int i17;
        int i18;
        int e;
        int i19;
        ic.f fVar2;
        ec.a aVar;
        ec.c cVar;
        int i20;
        int i21;
        int i22;
        Paint paint;
        int i23;
        Bitmap bitmap2;
        char c10;
        Bitmap bitmap3;
        Canvas canvas;
        boolean z13;
        boolean z14;
        float f10;
        Canvas canvas2;
        Paint paint2;
        byte[][] bArr;
        int i24;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        char c11;
        int i25;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        ic.c cVar2 = ic.c.b;
        if (map != null) {
            dc.b bVar = dc.b.a;
            if (map.containsKey(bVar)) {
                cVar2 = ic.c.valueOf(map.get(bVar).toString());
            }
            dc.b bVar2 = dc.b.c;
            if (map.containsKey(bVar2)) {
                i14 = Integer.parseInt(map.get(bVar2).toString());
                Charset charset = kc.c.b;
                if (map != null) {
                    dc.b bVar3 = dc.b.h;
                    if (map.containsKey(bVar3) && Boolean.parseBoolean(map.get(bVar3).toString())) {
                        z10 = true;
                        if (map != null) {
                            dc.b bVar4 = dc.b.f;
                            if (map.containsKey(bVar4) && Boolean.parseBoolean(map.get(bVar4).toString())) {
                                z11 = true;
                                dc.b bVar5 = dc.b.b;
                                z12 = map == null && map.containsKey(bVar5);
                                if (z12) {
                                    try {
                                        forName = Charset.forName(map.get(bVar5).toString());
                                    } catch (UnsupportedCharsetException unused) {
                                    }
                                    int i26 = 1;
                                    int i27 = i14;
                                    if (!z11) {
                                        i15 = 2;
                                        Charset charset2 = ec.g.b;
                                        ic.e eVar2 = ic.e.h;
                                        if (charset2 != null && charset2.equals(forName) && kc.c.b(str)) {
                                            eVar = ic.e.r;
                                        } else {
                                            boolean z19 = false;
                                            boolean z20 = false;
                                            int i28 = 0;
                                            while (true) {
                                                if (i28 < str.length()) {
                                                    char charAt = str.charAt(i28);
                                                    if (charAt < '0' || charAt > '9') {
                                                        if ((charAt < '`' ? kc.c.a[charAt] : -1) == -1) {
                                                            break;
                                                        }
                                                        z19 = true;
                                                    } else {
                                                        z20 = true;
                                                    }
                                                    i28++;
                                                } else if (z19) {
                                                    eVar = ic.e.e;
                                                } else if (z20) {
                                                    eVar = ic.e.d;
                                                }
                                            }
                                            eVar = eVar2;
                                        }
                                        ec.a aVar2 = new ec.a();
                                        if (eVar == eVar2 && z12 && (cVar = (ec.c) ec.c.d.get(forName.name())) != null) {
                                            i16 = 4;
                                            aVar2.b(7, 4);
                                            aVar2.b(cVar.a[0], 8);
                                        } else {
                                            i16 = 4;
                                        }
                                        if (z10) {
                                            aVar2.b(5, i16);
                                        }
                                        aVar2.b(eVar.b, i16);
                                        ec.a aVar3 = new ec.a();
                                        kc.c.a(str, eVar, aVar3, forName);
                                        if (map != null) {
                                            dc.b bVar6 = dc.b.d;
                                            if (map.containsKey(bVar6)) {
                                                fVar = ic.f.c(Integer.parseInt(map.get(bVar6).toString()));
                                                if (!kc.c.c(eVar.a(fVar) + aVar2.b + aVar3.b, fVar, cVar2)) {
                                                    throw new r("Data too big for requested version");
                                                }
                                                ec.a aVar4 = new ec.a();
                                                i17 = aVar2.b;
                                                aVar4.c(i17);
                                                for (i18 = 0; i18 < i17; i18++) {
                                                    aVar4.a(aVar2.d(i18));
                                                }
                                                e = eVar != eVar2 ? aVar3.e() : str.length();
                                                int a2 = eVar.a(fVar);
                                                i19 = 1 << a2;
                                                if (e < i19) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(e);
                                                    sb2.append(" is bigger than ");
                                                    sb2.append(i19 - 1);
                                                    throw new r(sb2.toString());
                                                }
                                                aVar4.b(e, a2);
                                                int i29 = aVar3.b;
                                                aVar4.c(aVar4.b + i29);
                                                for (int i30 = 0; i30 < i29; i30++) {
                                                    aVar4.a(aVar3.d(i30));
                                                }
                                                fVar2 = fVar;
                                                aVar = aVar4;
                                            }
                                        }
                                        int a10 = eVar.a(ic.f.c(1)) + aVar2.b + aVar3.b;
                                        int i31 = 1;
                                        while (i31 <= 40) {
                                            ic.f c12 = ic.f.c(i31);
                                            if (kc.c.c(a10, c12, cVar2)) {
                                                int a11 = eVar.a(c12) + aVar2.b + aVar3.b;
                                                for (int i32 = 1; i32 <= 40; i32++) {
                                                    ic.f c13 = ic.f.c(i32);
                                                    if (kc.c.c(a11, c13, cVar2)) {
                                                        fVar = c13;
                                                        ec.a aVar42 = new ec.a();
                                                        i17 = aVar2.b;
                                                        aVar42.c(i17);
                                                        while (i18 < i17) {
                                                        }
                                                        if (eVar != eVar2) {
                                                        }
                                                        int a22 = eVar.a(fVar);
                                                        i19 = 1 << a22;
                                                        if (e < i19) {
                                                        }
                                                    } else {
                                                        cVar2 = cVar2;
                                                    }
                                                }
                                                throw new r("Data too big");
                                            }
                                            i31++;
                                            cVar2 = cVar2;
                                            a10 = a10;
                                        }
                                        throw new r("Data too big");
                                    }
                                    if (forName.equals(charset)) {
                                        forName = null;
                                    }
                                    c2.b bVar7 = new c2.b();
                                    bVar7.b = str;
                                    bVar7.a = z10;
                                    bVar7.c = new ec.d(str, forName);
                                    bVar7.d = cVar2;
                                    ic.c cVar3 = (ic.c) bVar7.d;
                                    i15 = 2;
                                    ic.f[] fVarArr = {c2.b.o(1), c2.b.o(2), c2.b.o(3)};
                                    androidx.biometric.e[] eVarArr = {bVar7.j(fVarArr[0]), bVar7.j(fVarArr[1]), bVar7.j(fVarArr[2])};
                                    int i33 = 0;
                                    int i34 = Integer.MAX_VALUE;
                                    int i35 = -1;
                                    for (int i36 = 3; i33 < i36; i36 = 3) {
                                        androidx.biometric.e eVar3 = eVarArr[i33];
                                        int p5 = eVar3.p((ic.f) eVar3.c);
                                        if (kc.c.c(p5, fVarArr[i33], cVar3) && p5 < i34) {
                                            i34 = p5;
                                            i35 = i33;
                                        }
                                        i33++;
                                    }
                                    if (i35 < 0) {
                                        throw new r("Data too big for any version");
                                    }
                                    androidx.biometric.e eVar4 = eVarArr[i35];
                                    aVar = new ec.a();
                                    ArrayList arrayList = (ArrayList) eVar4.b;
                                    int size = arrayList.size();
                                    int i37 = 0;
                                    while (i37 < size) {
                                        Object obj = arrayList.get(i37);
                                        int i38 = i37 + 1;
                                        kc.f fVar3 = (kc.f) obj;
                                        int i39 = fVar3.c;
                                        androidx.biometric.e eVar5 = fVar3.e;
                                        c2.b bVar8 = (c2.b) eVar5.d;
                                        ArrayList arrayList2 = arrayList;
                                        ic.e eVar6 = fVar3.a;
                                        int i40 = size;
                                        aVar.b(eVar6.b, 4);
                                        int i41 = fVar3.d;
                                        if (i41 > 0) {
                                            aVar.b(fVar3.a(), eVar6.a((ic.f) eVar5.c));
                                        }
                                        if (eVar6 == ic.e.n) {
                                            aVar.b(((ec.c) ec.c.d.get(((ec.d) bVar8.c).a[i39].charset().name())).a[0], 8);
                                        } else if (i41 > 0) {
                                            String str2 = (String) bVar8.b;
                                            int i42 = fVar3.b;
                                            kc.c.a(str2.substring(i42, i41 + i42), eVar6, aVar, ((ec.d) bVar8.c).a[i39].charset());
                                        }
                                        arrayList = arrayList2;
                                        size = i40;
                                        i37 = i38;
                                    }
                                    fVar2 = (ic.f) eVar4.c;
                                    c5.c0 c0Var = fVar2.c[cVar2.ordinal()];
                                    int i43 = fVar2.d;
                                    int i44 = c0Var.b;
                                    b2.v0[] v0VarArr = (b2.v0[]) c0Var.c;
                                    int i45 = 0;
                                    for (b2.v0 v0Var : v0VarArr) {
                                        i45 += v0Var.a;
                                    }
                                    int i46 = i43 - (i45 * i44);
                                    i20 = i46 * 8;
                                    if (aVar.b > i20) {
                                        throw new r("data bits cannot fit in the QR Code" + aVar.b + " > " + i20);
                                    }
                                    for (int i47 = 0; i47 < 4 && aVar.b < i20; i47++) {
                                        aVar.a(false);
                                    }
                                    boolean z21 = false;
                                    int i48 = aVar.b & 7;
                                    if (i48 > 0) {
                                        while (i48 < 8) {
                                            aVar.a(z21);
                                            i48++;
                                            z21 = false;
                                        }
                                    }
                                    int e7 = i46 - aVar.e();
                                    int i49 = 0;
                                    while (i49 < e7) {
                                        int i50 = e7;
                                        aVar.b((i49 & 1) == 0 ? 236 : 17, 8);
                                        i49++;
                                        e7 = i50;
                                    }
                                    if (aVar.b != i20) {
                                        throw new r("Bits size does not equal capacity");
                                    }
                                    int i51 = 0;
                                    for (b2.v0 v0Var2 : v0VarArr) {
                                        i51 += v0Var2.a;
                                    }
                                    if (aVar.e() != i46) {
                                        throw new r("Number of bits and data bytes does not match");
                                    }
                                    ArrayList arrayList3 = new ArrayList(i51);
                                    int i52 = 0;
                                    int i53 = 0;
                                    int i54 = 0;
                                    int i55 = 0;
                                    while (i53 < i51) {
                                        int i56 = i26;
                                        int[] iArr = new int[i56];
                                        int[] iArr2 = new int[i56];
                                        if (i53 >= i51) {
                                            throw new r("Block ID too large");
                                        }
                                        int i57 = i43 % i51;
                                        int i58 = i51 - i57;
                                        int i59 = i43 / i51;
                                        int i60 = i46 / i51;
                                        int i61 = i60 + 1;
                                        int i62 = i59 - i60;
                                        int i63 = (i59 + 1) - i61;
                                        if (i62 != i63) {
                                            throw new r("EC bytes mismatch");
                                        }
                                        if (i51 != i58 + i57) {
                                            throw new r("RS blocks mismatch");
                                        }
                                        if (i43 != ((i61 + i63) * i57) + ((i60 + i62) * i58)) {
                                            throw new r("Total bytes mismatch");
                                        }
                                        if (i53 < i58) {
                                            c11 = 0;
                                            iArr[0] = i60;
                                            iArr2[0] = i62;
                                        } else {
                                            c11 = 0;
                                            iArr[0] = i61;
                                            iArr2[0] = i63;
                                        }
                                        int i64 = iArr[c11];
                                        byte[] bArr2 = new byte[i64];
                                        int i65 = i54 * 8;
                                        int i66 = 0;
                                        while (i66 < i64) {
                                            int i67 = i66;
                                            int i68 = i51;
                                            int i69 = i65;
                                            int i70 = i53;
                                            int i71 = 0;
                                            for (int i72 = 0; i72 < 8; i72++) {
                                                if (aVar.d(i69)) {
                                                    i71 = (1 << (7 - i72)) | i71;
                                                }
                                                i69++;
                                            }
                                            bArr2[i67] = (byte) i71;
                                            i66 = i67 + 1;
                                            i53 = i70;
                                            i65 = i69;
                                            i51 = i68;
                                        }
                                        int i73 = i53;
                                        int i74 = i51;
                                        int i75 = iArr2[0];
                                        int i76 = i64 + i75;
                                        int[] iArr3 = new int[i76];
                                        int i77 = 0;
                                        while (i77 < i64) {
                                            iArr3[i77] = bArr2[i77] & 255;
                                            i77++;
                                            i76 = i76;
                                        }
                                        int i78 = i76;
                                        gc.a aVar5 = gc.a.h;
                                        ArrayList arrayList4 = new ArrayList();
                                        ec.a aVar6 = aVar;
                                        ic.c cVar4 = cVar2;
                                        arrayList4.add(new gc.b(aVar5, new int[]{1}));
                                        if (i75 == 0) {
                                            throw new IllegalArgumentException("No error correction bytes");
                                        }
                                        int i79 = i78 - i75;
                                        if (i79 <= 0) {
                                            throw new IllegalArgumentException("No data bytes provided");
                                        }
                                        if (i75 >= arrayList4.size()) {
                                            gc.b bVar9 = (gc.b) i2.d.h(1, arrayList4);
                                            int size2 = arrayList4.size();
                                            gc.b bVar10 = bVar9;
                                            while (size2 <= i75) {
                                                int i80 = size2;
                                                bVar10 = bVar10.g(new gc.b(aVar5, new int[]{1, aVar5.a[(i80 - 1) + aVar5.g]}));
                                                arrayList4.add(bVar10);
                                                size2 = i80 + 1;
                                                i43 = i43;
                                                fVar2 = fVar2;
                                            }
                                        }
                                        ic.f fVar4 = fVar2;
                                        int i81 = i43;
                                        gc.b bVar11 = (gc.b) arrayList4.get(i75);
                                        int[] iArr4 = new int[i79];
                                        System.arraycopy(iArr3, 0, iArr4, 0, i79);
                                        if (i79 == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (i79 > 1 && iArr4[0] == 0) {
                                            int i82 = 1;
                                            while (i82 < i79 && iArr4[i82] == 0) {
                                                i82++;
                                            }
                                            if (i82 == i79) {
                                                iArr4 = new int[]{0};
                                            } else {
                                                int i83 = i79 - i82;
                                                i25 = i79;
                                                int[] iArr5 = new int[i83];
                                                System.arraycopy(iArr4, i82, iArr5, 0, i83);
                                                iArr4 = iArr5;
                                                if (i75 >= 0) {
                                                    throw new IllegalArgumentException();
                                                }
                                                int length = iArr4.length;
                                                int[] iArr6 = new int[length + i75];
                                                int i84 = 0;
                                                while (i84 < length) {
                                                    iArr6[i84] = aVar5.c(iArr4[i84], 1);
                                                    i84++;
                                                    iArr4 = iArr4;
                                                }
                                                gc.b bVar12 = new gc.b(aVar5, iArr6);
                                                if (!aVar5.equals(bVar11.a)) {
                                                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                }
                                                if (bVar11.e()) {
                                                    throw new IllegalArgumentException("Divide by 0");
                                                }
                                                gc.b bVar13 = aVar5.c;
                                                int b10 = aVar5.b(bVar11.c(bVar11.d()));
                                                while (bVar12.d() >= bVar11.d() && !bVar12.e()) {
                                                    int d = bVar12.d() - bVar11.d();
                                                    int c14 = aVar5.c(bVar12.c(bVar12.d()), b10);
                                                    int i85 = b10;
                                                    gc.b h = bVar11.h(d, c14);
                                                    bVar13 = bVar13.a(aVar5.a(d, c14));
                                                    bVar12 = bVar12.a(h);
                                                    b10 = i85;
                                                }
                                                gc.b[] bVarArr = new gc.b[i15];
                                                bVarArr[0] = bVar13;
                                                bVarArr[1] = bVar12;
                                                int[] iArr7 = bVarArr[1].b;
                                                int length2 = i75 - iArr7.length;
                                                for (int i86 = 0; i86 < length2; i86++) {
                                                    iArr3[i25 + i86] = 0;
                                                }
                                                System.arraycopy(iArr7, 0, iArr3, i25 + length2, iArr7.length);
                                                byte[] bArr3 = new byte[i75];
                                                for (int i87 = 0; i87 < i75; i87++) {
                                                    bArr3[i87] = (byte) iArr3[i64 + i87];
                                                }
                                                arrayList3.add(new kc.a(bArr2, bArr3));
                                                i55 = Math.max(i55, i64);
                                                i52 = Math.max(i52, i75);
                                                i54 += iArr[0];
                                                i53 = i73 + 1;
                                                aVar = aVar6;
                                                i51 = i74;
                                                i43 = i81;
                                                cVar2 = cVar4;
                                                fVar2 = fVar4;
                                                i26 = 1;
                                                i15 = 2;
                                            }
                                        }
                                        i25 = i79;
                                        if (i75 >= 0) {
                                        }
                                    }
                                    ic.f fVar5 = fVar2;
                                    ic.c cVar5 = cVar2;
                                    int i88 = i43;
                                    if (i46 != i54) {
                                        throw new r("Data bytes does not match offset");
                                    }
                                    ec.a aVar7 = new ec.a();
                                    for (int i89 = 0; i89 < i55; i89++) {
                                        int size3 = arrayList3.size();
                                        int i90 = 0;
                                        while (i90 < size3) {
                                            Object obj2 = arrayList3.get(i90);
                                            i90++;
                                            byte[] bArr4 = ((kc.a) obj2).a;
                                            if (i89 < bArr4.length) {
                                                aVar7.b(bArr4[i89], 8);
                                            }
                                        }
                                    }
                                    for (int i91 = 0; i91 < i52; i91++) {
                                        int size4 = arrayList3.size();
                                        int i92 = 0;
                                        while (i92 < size4) {
                                            Object obj3 = arrayList3.get(i92);
                                            i92++;
                                            byte[] bArr5 = ((kc.a) obj3).b;
                                            if (i91 < bArr5.length) {
                                                aVar7.b(bArr5[i91], 8);
                                            }
                                        }
                                    }
                                    if (i88 != aVar7.e()) {
                                        StringBuilder l4 = i2.d.l(i88, "Interleaving error: ", " and ");
                                        l4.append(aVar7.e());
                                        l4.append(" differ.");
                                        throw new r(l4.toString());
                                    }
                                    int i93 = (fVar5.a * 4) + 17;
                                    kc.b bVar14 = new kc.b(i93, i93);
                                    if (map != null) {
                                        dc.b bVar15 = dc.b.e;
                                        if (map.containsKey(bVar15)) {
                                            i21 = Integer.parseInt(map.get(bVar15).toString());
                                        }
                                    }
                                    i21 = -1;
                                    int i94 = bVar14.c;
                                    int i95 = bVar14.b;
                                    int i96 = -1;
                                    if (i21 == -1) {
                                        int i97 = Integer.MAX_VALUE;
                                        int i98 = 0;
                                        while (i98 < 8) {
                                            ic.c cVar6 = cVar5;
                                            kc.d.b(aVar7, cVar6, fVar5, i98, bVar14);
                                            int a12 = kc.d.a(bVar14, false) + kc.d.a(bVar14, true);
                                            int i99 = 0;
                                            int i100 = 0;
                                            while (true) {
                                                int i101 = i94 - 1;
                                                bArr = bVar14.a;
                                                if (i99 >= i101) {
                                                    break;
                                                }
                                                byte[] bArr6 = bArr[i99];
                                                int i102 = 0;
                                                while (i102 < i95 - 1) {
                                                    byte b11 = bArr6[i102];
                                                    int i103 = i102 + 1;
                                                    int i104 = i96;
                                                    if (b11 == bArr6[i103]) {
                                                        byte[] bArr7 = bArr[i99 + 1];
                                                        if (b11 == bArr7[i102] && b11 == bArr7[i103]) {
                                                            i100++;
                                                        }
                                                    }
                                                    i96 = i104;
                                                    i102 = i103;
                                                }
                                                i99++;
                                            }
                                            int i105 = i96;
                                            int i106 = (i100 * 3) + a12;
                                            int i107 = 0;
                                            for (int i108 = 0; i108 < i94; i108++) {
                                                int i109 = 0;
                                                while (i109 < i95) {
                                                    byte[] bArr8 = bArr[i108];
                                                    int i110 = i109 + 6;
                                                    if (i110 < i95) {
                                                        i24 = i98;
                                                        byte b12 = 1;
                                                        if (bArr8[i109] == 1 && bArr8[i109 + 1] == 0 && bArr8[i109 + 2] == 1 && bArr8[i109 + 3] == 1 && bArr8[i109 + 4] == 1 && bArr8[i109 + 5] == 0 && bArr8[i110] == 1) {
                                                            int i111 = i109 - 4;
                                                            if (i111 >= 0 && bArr8.length >= i109) {
                                                                while (i111 < i109) {
                                                                    if (bArr8[i111] != b12) {
                                                                        i111++;
                                                                        b12 = 1;
                                                                    }
                                                                }
                                                                z17 = true;
                                                                if (!z17) {
                                                                    int i112 = i109 + 7;
                                                                    int i113 = i109 + 11;
                                                                    if (i112 >= 0 && bArr8.length >= i113) {
                                                                        while (i112 < i113) {
                                                                            int i114 = i112;
                                                                            if (bArr8[i112] != 1) {
                                                                                i112 = i114 + 1;
                                                                            }
                                                                        }
                                                                        z18 = true;
                                                                    }
                                                                    z18 = false;
                                                                    break;
                                                                }
                                                                i107++;
                                                            }
                                                            z17 = false;
                                                            if (!z17) {
                                                            }
                                                            i107++;
                                                        }
                                                    } else {
                                                        i24 = i98;
                                                    }
                                                    int i115 = i108 + 6;
                                                    if (i115 < i94) {
                                                        byte b13 = 1;
                                                        if (bArr[i108][i109] == 1 && bArr[i108 + 1][i109] == 0 && bArr[i108 + 2][i109] == 1 && bArr[i108 + 3][i109] == 1 && bArr[i108 + 4][i109] == 1 && bArr[i108 + 5][i109] == 0 && bArr[i115][i109] == 1) {
                                                            int i116 = i108 - 4;
                                                            if (i116 >= 0 && bArr.length >= i108) {
                                                                while (i116 < i108) {
                                                                    if (bArr[i116][i109] != b13) {
                                                                        i116++;
                                                                        b13 = 1;
                                                                    }
                                                                }
                                                                z15 = true;
                                                                if (!z15) {
                                                                    int i117 = i108 + 7;
                                                                    int i118 = i108 + 11;
                                                                    if (i117 >= 0 && bArr.length >= i118) {
                                                                        while (i117 < i118) {
                                                                            if (bArr[i117][i109] != 1) {
                                                                                i117++;
                                                                            }
                                                                        }
                                                                        z16 = true;
                                                                        if (!z16) {
                                                                        }
                                                                    }
                                                                    z16 = false;
                                                                    if (!z16) {
                                                                    }
                                                                }
                                                                i107++;
                                                            }
                                                            z15 = false;
                                                            if (!z15) {
                                                            }
                                                            i107++;
                                                        }
                                                    }
                                                    i109++;
                                                    i98 = i24;
                                                }
                                            }
                                            int i119 = i98;
                                            int i120 = (i107 * 40) + i106;
                                            int i121 = 0;
                                            for (int i122 = 0; i122 < i94; i122++) {
                                                byte[] bArr9 = bArr[i122];
                                                for (int i123 = 0; i123 < i95; i123++) {
                                                    if (bArr9[i123] == 1) {
                                                        i121++;
                                                    }
                                                }
                                            }
                                            int i124 = i94 * i95;
                                            int abs = (((Math.abs((i121 * 2) - i124) * 10) / i124) * 10) + i120;
                                            if (abs < i97) {
                                                i97 = abs;
                                                i96 = i119;
                                            } else {
                                                i96 = i105;
                                            }
                                            i98 = i119 + 1;
                                            cVar5 = cVar6;
                                        }
                                        i21 = i96;
                                    }
                                    kc.d.b(aVar7, cVar5, fVar5, i21, bVar14);
                                    this.input = bVar14;
                                    for (int i125 = 0; i125 < i95 && has(i125, 0); i125++) {
                                        this.sideQuadSize++;
                                    }
                                    int i126 = i27 * 2;
                                    int i127 = i95 + i126;
                                    int i128 = i126 + i94;
                                    int min = Math.min(Math.max(i10, i127) / i127, Math.max(i11, i128) / i128);
                                    int i129 = min * i95;
                                    int i130 = i129 + 32;
                                    Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i130) ? Bitmap.createBitmap(i130, i130, Bitmap.Config.ARGB_8888) : bitmap;
                                    Canvas canvas3 = new Canvas(createBitmap);
                                    canvas3.drawColor(i12);
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(i13);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setCornerRadii(this.radii);
                                    float f11 = i129 / 4.65f;
                                    Canvas canvas4 = canvas3;
                                    float f12 = min;
                                    int round = Math.round(f11 / f12);
                                    this.imageBloks = round;
                                    if (round % 2 != i95 % 2) {
                                        this.imageBloks = round + 1;
                                    }
                                    int i131 = this.imageBloks;
                                    this.imageBlockX = (i95 - i131) / 2;
                                    int i132 = (i131 * min) - 24;
                                    this.imageSize = i132;
                                    int i133 = (i130 - i132) / 2;
                                    int i134 = 16;
                                    if (this.includeSideQuads) {
                                        paint3.setColor(i13);
                                        paint = paint3;
                                        i22 = min;
                                        i23 = i133;
                                        bitmap2 = createBitmap;
                                        c10 = 3;
                                        drawSideQuadsGradient(canvas4, paint, gradientDrawable, this.sideQuadSize, f12, 16, i130, f7, this.radii, i12, i13);
                                    } else {
                                        i22 = min;
                                        paint = paint3;
                                        i23 = i133;
                                        bitmap2 = createBitmap;
                                        c10 = 3;
                                    }
                                    boolean z22 = Color.alpha(i12) == 0;
                                    float f13 = (f12 / 2.0f) * f7;
                                    int i135 = 16;
                                    int i136 = 0;
                                    while (i136 < i94) {
                                        int i137 = i134;
                                        int i138 = 0;
                                        while (i138 < i95) {
                                            if (has(i138, i136)) {
                                                Arrays.fill(this.radii, f13);
                                                if (has(i138, i136 - 1)) {
                                                    float[] fArr = this.radii;
                                                    fArr[1] = 0.0f;
                                                    fArr[0] = 0.0f;
                                                    fArr[c10] = 0.0f;
                                                    fArr[2] = 0.0f;
                                                }
                                                if (has(i138, i136 + 1)) {
                                                    float[] fArr2 = this.radii;
                                                    fArr2[7] = 0.0f;
                                                    fArr2[6] = 0.0f;
                                                    fArr2[5] = 0.0f;
                                                    fArr2[4] = 0.0f;
                                                }
                                                if (has(i138 - 1, i136)) {
                                                    float[] fArr3 = this.radii;
                                                    fArr3[1] = 0.0f;
                                                    fArr3[0] = 0.0f;
                                                    fArr3[7] = 0.0f;
                                                    fArr3[6] = 0.0f;
                                                }
                                                if (has(i138 + 1, i136)) {
                                                    float[] fArr4 = this.radii;
                                                    fArr4[c10] = 0.0f;
                                                    fArr4[2] = 0.0f;
                                                    fArr4[5] = 0.0f;
                                                    fArr4[4] = 0.0f;
                                                }
                                                gradientDrawable.setColor(i13);
                                                gradientDrawable.setBounds(i137, i135, i137 + i22, i135 + i22);
                                                gradientDrawable.draw(canvas4);
                                                paint2 = paint;
                                                canvas2 = canvas4;
                                                f10 = f13;
                                            } else {
                                                Paint paint4 = paint;
                                                Arrays.fill(this.radii, 0.0f);
                                                int i139 = i138 - 1;
                                                int i140 = i136 - 1;
                                                if (has(i139, i140) && has(i139, i136) && has(i138, i140)) {
                                                    canvas = canvas4;
                                                    float[] fArr5 = this.radii;
                                                    fArr5[1] = f13;
                                                    fArr5[0] = f13;
                                                    z13 = true;
                                                } else {
                                                    canvas = canvas4;
                                                    z13 = false;
                                                }
                                                boolean z23 = z13;
                                                int i141 = i138 + 1;
                                                if (has(i141, i140) && has(i141, i136) && has(i138, i140)) {
                                                    float[] fArr6 = this.radii;
                                                    fArr6[c10] = f13;
                                                    fArr6[2] = f13;
                                                    z14 = true;
                                                } else {
                                                    z14 = z23;
                                                }
                                                f10 = f13;
                                                int i142 = i136 + 1;
                                                if (has(i139, i142) && has(i139, i136) && has(i138, i142)) {
                                                    float[] fArr7 = this.radii;
                                                    fArr7[7] = f10;
                                                    fArr7[6] = f10;
                                                    z14 = true;
                                                }
                                                if (has(i141, i142) && has(i141, i136) && has(i138, i142)) {
                                                    float[] fArr8 = this.radii;
                                                    fArr8[5] = f10;
                                                    fArr8[4] = f10;
                                                    z14 = true;
                                                }
                                                if (!z14 || z22) {
                                                    canvas2 = canvas;
                                                    paint2 = paint4;
                                                } else {
                                                    int i143 = i137 + i22;
                                                    int i144 = i135 + i22;
                                                    canvas.drawRect(i137, i135, i143, i144, paint4);
                                                    canvas2 = canvas;
                                                    paint2 = paint4;
                                                    gradientDrawable.setColor(i12);
                                                    gradientDrawable.setBounds(i137, i135, i143, i144);
                                                    gradientDrawable.draw(canvas2);
                                                }
                                            }
                                            i138++;
                                            i137 += i22;
                                            canvas4 = canvas2;
                                            paint = paint2;
                                            f13 = f10;
                                        }
                                        i136++;
                                        i135 += i22;
                                        paint = paint;
                                        i134 = 16;
                                    }
                                    Canvas canvas5 = canvas4;
                                    Drawable drawable = this.centerDrawable;
                                    if (drawable != null) {
                                        int i145 = i23 + this.imageSize;
                                        drawable.setBounds(i23, i23, i145, i145);
                                        this.centerDrawable.draw(canvas5);
                                        bitmap3 = null;
                                    } else {
                                        String readRes = AndroidUtilities.readRes(R.raw.qr_logo);
                                        int i146 = this.imageSize;
                                        Bitmap bitmap4 = SvgHelper.getBitmap(readRes, i146, i146, false);
                                        float f14 = i23;
                                        bitmap3 = null;
                                        canvas5.drawBitmap(bitmap4, f14, f14, (Paint) null);
                                        bitmap4.recycle();
                                    }
                                    canvas5.setBitmap(bitmap3);
                                    return bitmap2;
                                }
                                forName = charset;
                                int i262 = 1;
                                int i272 = i14;
                                if (!z11) {
                                }
                                c5.c0 c0Var2 = fVar2.c[cVar2.ordinal()];
                                int i432 = fVar2.d;
                                int i442 = c0Var2.b;
                                b2.v0[] v0VarArr2 = (b2.v0[]) c0Var2.c;
                                int i452 = 0;
                                while (r13 < r12) {
                                }
                                int i462 = i432 - (i452 * i442);
                                i20 = i462 * 8;
                                if (aVar.b > i20) {
                                }
                            }
                        }
                        z11 = false;
                        dc.b bVar52 = dc.b.b;
                        if (map == null) {
                        }
                        if (z12) {
                        }
                        forName = charset;
                        int i2622 = 1;
                        int i2722 = i14;
                        if (!z11) {
                        }
                        c5.c0 c0Var22 = fVar2.c[cVar2.ordinal()];
                        int i4322 = fVar2.d;
                        int i4422 = c0Var22.b;
                        b2.v0[] v0VarArr22 = (b2.v0[]) c0Var22.c;
                        int i4522 = 0;
                        while (r13 < r12) {
                        }
                        int i4622 = i4322 - (i4522 * i4422);
                        i20 = i4622 * 8;
                        if (aVar.b > i20) {
                        }
                    }
                }
                z10 = false;
                if (map != null) {
                }
                z11 = false;
                dc.b bVar522 = dc.b.b;
                if (map == null) {
                }
                if (z12) {
                }
                forName = charset;
                int i26222 = 1;
                int i27222 = i14;
                if (!z11) {
                }
                c5.c0 c0Var222 = fVar2.c[cVar2.ordinal()];
                int i43222 = fVar2.d;
                int i44222 = c0Var222.b;
                b2.v0[] v0VarArr222 = (b2.v0[]) c0Var222.c;
                int i45222 = 0;
                while (r13 < r12) {
                }
                int i46222 = i43222 - (i45222 * i44222);
                i20 = i46222 * 8;
                if (aVar.b > i20) {
                }
            }
        }
        i14 = 4;
        Charset charset3 = kc.c.b;
        if (map != null) {
        }
        z10 = false;
        if (map != null) {
        }
        z11 = false;
        dc.b bVar5222 = dc.b.b;
        if (map == null) {
        }
        if (z12) {
        }
        forName = charset3;
        int i262222 = 1;
        int i272222 = i14;
        if (!z11) {
        }
        c5.c0 c0Var2222 = fVar2.c[cVar2.ordinal()];
        int i432222 = fVar2.d;
        int i442222 = c0Var2222.b;
        b2.v0[] v0VarArr2222 = (b2.v0[]) c0Var2222.c;
        int i452222 = 0;
        while (r13 < r12) {
        }
        int i462222 = i432222 - (i452222 * i442222);
        i20 = i462222 * 8;
        if (aVar.b > i20) {
        }
    }
}
