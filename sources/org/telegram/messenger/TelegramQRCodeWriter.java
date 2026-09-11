package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private jc.b input;
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
            jc.b bVar = this.input;
            if (i10 < bVar.b && i11 < bVar.c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<cc.b, ?> map, Bitmap bitmap) {
        return encode(str, i10, i11, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0641, code lost:
    
        if ((r13 >= 0 && r13 < 8) != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0706, code lost:
    
        if (r3 == false) goto L360;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x057c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x077c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x02aa A[LOOP:35: B:541:0x02a8->B:542:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f8 A[LOOP:2: B:68:0x02f6->B:69:0x02f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap encode(String str, int i10, int i11, Map<cc.b, ?> map, Bitmap bitmap, float f7, int i12, int i13) {
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        Charset forName;
        hc.e eVar;
        int i15;
        hc.f fVar;
        int i16;
        int i17;
        int e7;
        int i18;
        hc.f fVar2;
        dc.a aVar;
        dc.c cVar;
        int i19;
        int i20;
        int i21;
        Paint paint;
        int i22;
        Bitmap bitmap2;
        char c10;
        Canvas canvas;
        boolean z13;
        boolean z14;
        float f10;
        Canvas canvas2;
        Paint paint2;
        byte[][] bArr;
        int i23;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        char c11;
        int i24;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        hc.c cVar2 = hc.c.b;
        if (map != null) {
            cc.b bVar = cc.b.a;
            if (map.containsKey(bVar)) {
                cVar2 = hc.c.valueOf(map.get(bVar).toString());
            }
            cc.b bVar2 = cc.b.c;
            if (map.containsKey(bVar2)) {
                i14 = Integer.parseInt(map.get(bVar2).toString());
                Charset charset = jc.c.b;
                if (map != null) {
                    cc.b bVar3 = cc.b.h;
                    if (map.containsKey(bVar3) && Boolean.parseBoolean(map.get(bVar3).toString())) {
                        z10 = true;
                        if (map != null) {
                            cc.b bVar4 = cc.b.f;
                            if (map.containsKey(bVar4) && Boolean.parseBoolean(map.get(bVar4).toString())) {
                                z11 = true;
                                cc.b bVar5 = cc.b.b;
                                z12 = map == null && map.containsKey(bVar5);
                                if (z12) {
                                    try {
                                        forName = Charset.forName(map.get(bVar5).toString());
                                    } catch (UnsupportedCharsetException unused) {
                                    }
                                    int i25 = i14;
                                    if (!z11) {
                                        Charset charset2 = dc.h.b;
                                        hc.e eVar2 = hc.e.h;
                                        if (charset2 != null && charset2.equals(forName) && jc.c.b(str)) {
                                            eVar = hc.e.r;
                                        } else {
                                            boolean z19 = false;
                                            boolean z20 = false;
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 < str.length()) {
                                                    char charAt = str.charAt(i26);
                                                    if (charAt < '0' || charAt > '9') {
                                                        if ((charAt < '`' ? jc.c.a[charAt] : -1) == -1) {
                                                            break;
                                                        }
                                                        z19 = true;
                                                    } else {
                                                        z20 = true;
                                                    }
                                                    i26++;
                                                } else if (z19) {
                                                    eVar = hc.e.e;
                                                } else if (z20) {
                                                    eVar = hc.e.d;
                                                }
                                            }
                                            eVar = eVar2;
                                        }
                                        dc.a aVar2 = new dc.a();
                                        if (eVar == eVar2 && z12 && (cVar = (dc.c) dc.c.d.get(forName.name())) != null) {
                                            i15 = 4;
                                            aVar2.b(7, 4);
                                            aVar2.b(cVar.a[0], 8);
                                        } else {
                                            i15 = 4;
                                        }
                                        if (z10) {
                                            aVar2.b(5, i15);
                                        }
                                        aVar2.b(eVar.b, i15);
                                        dc.a aVar3 = new dc.a();
                                        jc.c.a(str, eVar, aVar3, forName);
                                        if (map != null) {
                                            cc.b bVar6 = cc.b.d;
                                            if (map.containsKey(bVar6)) {
                                                fVar = hc.f.c(Integer.parseInt(map.get(bVar6).toString()));
                                                if (!jc.c.c(eVar.a(fVar) + aVar2.b + aVar3.b, fVar, cVar2)) {
                                                    throw new cc.k("Data too big for requested version");
                                                }
                                                dc.a aVar4 = new dc.a();
                                                i16 = aVar2.b;
                                                aVar4.c(i16);
                                                for (i17 = 0; i17 < i16; i17++) {
                                                    aVar4.a(aVar2.d(i17));
                                                }
                                                e7 = eVar != eVar2 ? aVar3.e() : str.length();
                                                int a2 = eVar.a(fVar);
                                                i18 = 1 << a2;
                                                if (e7 < i18) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(e7);
                                                    sb2.append(" is bigger than ");
                                                    sb2.append(i18 - 1);
                                                    throw new cc.k(sb2.toString());
                                                }
                                                aVar4.b(e7, a2);
                                                int i27 = aVar3.b;
                                                aVar4.c(aVar4.b + i27);
                                                for (int i28 = 0; i28 < i27; i28++) {
                                                    aVar4.a(aVar3.d(i28));
                                                }
                                                fVar2 = fVar;
                                                aVar = aVar4;
                                            }
                                        }
                                        int a10 = eVar.a(hc.f.c(1)) + aVar2.b + aVar3.b;
                                        int i29 = 1;
                                        while (i29 <= 40) {
                                            hc.f c12 = hc.f.c(i29);
                                            if (jc.c.c(a10, c12, cVar2)) {
                                                int a11 = eVar.a(c12) + aVar2.b + aVar3.b;
                                                int i30 = 1;
                                                while (i30 <= 40) {
                                                    hc.f c13 = hc.f.c(i30);
                                                    if (jc.c.c(a11, c13, cVar2)) {
                                                        fVar = c13;
                                                        dc.a aVar42 = new dc.a();
                                                        i16 = aVar2.b;
                                                        aVar42.c(i16);
                                                        while (i17 < i16) {
                                                        }
                                                        if (eVar != eVar2) {
                                                        }
                                                        int a22 = eVar.a(fVar);
                                                        i18 = 1 << a22;
                                                        if (e7 < i18) {
                                                        }
                                                    } else {
                                                        i30++;
                                                        cVar2 = cVar2;
                                                    }
                                                }
                                                throw new cc.k("Data too big");
                                            }
                                            i29++;
                                            a10 = a10;
                                            cVar2 = cVar2;
                                        }
                                        throw new cc.k("Data too big");
                                    }
                                    if (forName.equals(charset)) {
                                        forName = null;
                                    }
                                    com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                                    mVar.b = str;
                                    mVar.a = z10;
                                    mVar.c = new dc.e(str, forName);
                                    mVar.d = cVar2;
                                    hc.c cVar3 = (hc.c) mVar.d;
                                    hc.f[] fVarArr = {com.google.firebase.messaging.m.l(1), com.google.firebase.messaging.m.l(2), com.google.firebase.messaging.m.l(3)};
                                    aa.a[] aVarArr = {mVar.h(fVarArr[0]), mVar.h(fVarArr[1]), mVar.h(fVarArr[2])};
                                    int i31 = 0;
                                    int i32 = -1;
                                    int i33 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i34 = 3; i31 < i34; i34 = 3) {
                                        aa.a aVar5 = aVarArr[i31];
                                        int v = aVar5.v((hc.f) aVar5.c);
                                        if (jc.c.c(v, fVarArr[i31], cVar3) && v < i33) {
                                            i33 = v;
                                            i32 = i31;
                                        }
                                        i31++;
                                    }
                                    if (i32 < 0) {
                                        throw new cc.k("Data too big for any version");
                                    }
                                    aa.a aVar6 = aVarArr[i32];
                                    aVar = new dc.a();
                                    ArrayList arrayList = (ArrayList) aVar6.b;
                                    int size = arrayList.size();
                                    int i35 = 0;
                                    while (i35 < size) {
                                        Object obj = arrayList.get(i35);
                                        int i36 = i35 + 1;
                                        jc.f fVar3 = (jc.f) obj;
                                        int i37 = fVar3.c;
                                        aa.a aVar7 = fVar3.e;
                                        com.google.firebase.messaging.m mVar2 = (com.google.firebase.messaging.m) aVar7.d;
                                        ArrayList arrayList2 = arrayList;
                                        hc.e eVar3 = fVar3.a;
                                        int i38 = size;
                                        aVar.b(eVar3.b, 4);
                                        int i39 = fVar3.d;
                                        if (i39 > 0) {
                                            aVar.b(fVar3.a(), eVar3.a((hc.f) aVar7.c));
                                        }
                                        if (eVar3 == hc.e.n) {
                                            aVar.b(((dc.c) dc.c.d.get(((dc.e) mVar2.c).a[i37].charset().name())).a[0], 8);
                                        } else if (i39 > 0) {
                                            String str2 = (String) mVar2.b;
                                            int i40 = fVar3.b;
                                            jc.c.a(str2.substring(i40, i39 + i40), eVar3, aVar, ((dc.e) mVar2.c).a[i37].charset());
                                        }
                                        arrayList = arrayList2;
                                        size = i38;
                                        i35 = i36;
                                    }
                                    fVar2 = (hc.f) aVar6.c;
                                    c5.b0 b0Var = fVar2.c[cVar2.ordinal()];
                                    int i41 = fVar2.d;
                                    int i42 = b0Var.b;
                                    b2.q0[] q0VarArr = (b2.q0[]) b0Var.c;
                                    int i43 = 0;
                                    for (b2.q0 q0Var : q0VarArr) {
                                        i43 += q0Var.a;
                                    }
                                    int i44 = i41 - (i43 * i42);
                                    i19 = i44 * 8;
                                    if (aVar.b > i19) {
                                        throw new cc.k("data bits cannot fit in the QR Code" + aVar.b + " > " + i19);
                                    }
                                    for (int i45 = 0; i45 < 4 && aVar.b < i19; i45++) {
                                        aVar.a(false);
                                    }
                                    boolean z21 = false;
                                    int i46 = aVar.b & 7;
                                    if (i46 > 0) {
                                        while (i46 < 8) {
                                            aVar.a(z21);
                                            i46++;
                                            z21 = false;
                                        }
                                    }
                                    int e10 = i44 - aVar.e();
                                    int i47 = 0;
                                    while (i47 < e10) {
                                        int i48 = e10;
                                        aVar.b((i47 & 1) == 0 ? 236 : 17, 8);
                                        i47++;
                                        e10 = i48;
                                    }
                                    if (aVar.b != i19) {
                                        throw new cc.k("Bits size does not equal capacity");
                                    }
                                    int i49 = 0;
                                    for (b2.q0 q0Var2 : q0VarArr) {
                                        i49 += q0Var2.a;
                                    }
                                    if (aVar.e() != i44) {
                                        throw new cc.k("Number of bits and data bytes does not match");
                                    }
                                    ArrayList arrayList3 = new ArrayList(i49);
                                    int i50 = 0;
                                    int i51 = 0;
                                    int i52 = 0;
                                    int i53 = 0;
                                    while (i51 < i49) {
                                        int[] iArr = new int[1];
                                        int[] iArr2 = new int[1];
                                        if (i51 >= i49) {
                                            throw new cc.k("Block ID too large");
                                        }
                                        int i54 = i41 % i49;
                                        int i55 = i49 - i54;
                                        int i56 = i41 / i49;
                                        int i57 = i44 / i49;
                                        int i58 = i57 + 1;
                                        int i59 = i56 - i57;
                                        int i60 = (i56 + 1) - i58;
                                        if (i59 != i60) {
                                            throw new cc.k("EC bytes mismatch");
                                        }
                                        if (i49 != i55 + i54) {
                                            throw new cc.k("RS blocks mismatch");
                                        }
                                        if (i41 != ((i58 + i60) * i54) + ((i57 + i59) * i55)) {
                                            throw new cc.k("Total bytes mismatch");
                                        }
                                        if (i51 < i55) {
                                            c11 = 0;
                                            iArr[0] = i57;
                                            iArr2[0] = i59;
                                        } else {
                                            c11 = 0;
                                            iArr[0] = i58;
                                            iArr2[0] = i60;
                                        }
                                        int i61 = iArr[c11];
                                        byte[] bArr2 = new byte[i61];
                                        int i62 = i52 * 8;
                                        int i63 = 0;
                                        while (i63 < i61) {
                                            int i64 = i63;
                                            int i65 = i49;
                                            int i66 = i62;
                                            int i67 = i51;
                                            int i68 = 0;
                                            for (int i69 = 0; i69 < 8; i69++) {
                                                if (aVar.d(i66)) {
                                                    i68 = (1 << (7 - i69)) | i68;
                                                }
                                                i66++;
                                            }
                                            bArr2[i64] = (byte) i68;
                                            i63 = i64 + 1;
                                            i51 = i67;
                                            i62 = i66;
                                            i49 = i65;
                                        }
                                        int i70 = i51;
                                        int i71 = i49;
                                        int i72 = iArr2[0];
                                        int i73 = i61 + i72;
                                        int[] iArr3 = new int[i73];
                                        int i74 = 0;
                                        while (i74 < i61) {
                                            iArr3[i74] = bArr2[i74] & 255;
                                            i74++;
                                            i73 = i73;
                                        }
                                        int i75 = i73;
                                        fc.a aVar8 = fc.a.h;
                                        ArrayList arrayList4 = new ArrayList();
                                        dc.a aVar9 = aVar;
                                        hc.c cVar4 = cVar2;
                                        arrayList4.add(new fc.b(aVar8, new int[]{1}));
                                        if (i72 == 0) {
                                            throw new IllegalArgumentException("No error correction bytes");
                                        }
                                        int i76 = i75 - i72;
                                        if (i76 <= 0) {
                                            throw new IllegalArgumentException("No data bytes provided");
                                        }
                                        if (i72 >= arrayList4.size()) {
                                            fc.b bVar7 = (fc.b) i2.g.h(1, arrayList4);
                                            int size2 = arrayList4.size();
                                            fc.b bVar8 = bVar7;
                                            while (size2 <= i72) {
                                                int i77 = size2;
                                                bVar8 = bVar8.g(new fc.b(aVar8, new int[]{1, aVar8.a[(i77 - 1) + aVar8.g]}));
                                                arrayList4.add(bVar8);
                                                size2 = i77 + 1;
                                                i41 = i41;
                                                fVar2 = fVar2;
                                            }
                                        }
                                        hc.f fVar4 = fVar2;
                                        int i78 = i41;
                                        fc.b bVar9 = (fc.b) arrayList4.get(i72);
                                        int[] iArr4 = new int[i76];
                                        System.arraycopy(iArr3, 0, iArr4, 0, i76);
                                        if (i76 == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (i76 > 1 && iArr4[0] == 0) {
                                            int i79 = 1;
                                            while (i79 < i76 && iArr4[i79] == 0) {
                                                i79++;
                                            }
                                            if (i79 == i76) {
                                                iArr4 = new int[]{0};
                                            } else {
                                                int i80 = i76 - i79;
                                                i24 = i76;
                                                int[] iArr5 = new int[i80];
                                                System.arraycopy(iArr4, i79, iArr5, 0, i80);
                                                iArr4 = iArr5;
                                                if (i72 >= 0) {
                                                    throw new IllegalArgumentException();
                                                }
                                                int length = iArr4.length;
                                                int[] iArr6 = new int[length + i72];
                                                int i81 = 0;
                                                while (i81 < length) {
                                                    iArr6[i81] = aVar8.c(iArr4[i81], 1);
                                                    i81++;
                                                    iArr4 = iArr4;
                                                }
                                                fc.b bVar10 = new fc.b(aVar8, iArr6);
                                                if (!aVar8.equals(bVar9.a)) {
                                                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                }
                                                if (bVar9.e()) {
                                                    throw new IllegalArgumentException("Divide by 0");
                                                }
                                                fc.b bVar11 = aVar8.c;
                                                int b10 = aVar8.b(bVar9.c(bVar9.d()));
                                                while (bVar10.d() >= bVar9.d() && !bVar10.e()) {
                                                    int d = bVar10.d() - bVar9.d();
                                                    int c14 = aVar8.c(bVar10.c(bVar10.d()), b10);
                                                    int i82 = b10;
                                                    fc.b h = bVar9.h(d, c14);
                                                    bVar11 = bVar11.a(aVar8.a(d, c14));
                                                    bVar10 = bVar10.a(h);
                                                    b10 = i82;
                                                }
                                                int[] iArr7 = new fc.b[]{bVar11, bVar10}[1].b;
                                                int length2 = i72 - iArr7.length;
                                                for (int i83 = 0; i83 < length2; i83++) {
                                                    iArr3[i24 + i83] = 0;
                                                }
                                                System.arraycopy(iArr7, 0, iArr3, i24 + length2, iArr7.length);
                                                byte[] bArr3 = new byte[i72];
                                                for (int i84 = 0; i84 < i72; i84++) {
                                                    bArr3[i84] = (byte) iArr3[i61 + i84];
                                                }
                                                arrayList3.add(new jc.a(bArr2, bArr3));
                                                i53 = Math.max(i53, i61);
                                                i50 = Math.max(i50, i72);
                                                i52 += iArr[0];
                                                i51 = i70 + 1;
                                                aVar = aVar9;
                                                i49 = i71;
                                                i41 = i78;
                                                cVar2 = cVar4;
                                                fVar2 = fVar4;
                                            }
                                        }
                                        i24 = i76;
                                        if (i72 >= 0) {
                                        }
                                    }
                                    hc.f fVar5 = fVar2;
                                    hc.c cVar5 = cVar2;
                                    int i85 = i41;
                                    if (i44 != i52) {
                                        throw new cc.k("Data bytes does not match offset");
                                    }
                                    dc.a aVar10 = new dc.a();
                                    for (int i86 = 0; i86 < i53; i86++) {
                                        int size3 = arrayList3.size();
                                        int i87 = 0;
                                        while (i87 < size3) {
                                            Object obj2 = arrayList3.get(i87);
                                            i87++;
                                            byte[] bArr4 = ((jc.a) obj2).a;
                                            if (i86 < bArr4.length) {
                                                aVar10.b(bArr4[i86], 8);
                                            }
                                        }
                                    }
                                    for (int i88 = 0; i88 < i50; i88++) {
                                        int size4 = arrayList3.size();
                                        int i89 = 0;
                                        while (i89 < size4) {
                                            Object obj3 = arrayList3.get(i89);
                                            i89++;
                                            byte[] bArr5 = ((jc.a) obj3).b;
                                            if (i88 < bArr5.length) {
                                                aVar10.b(bArr5[i88], 8);
                                            }
                                        }
                                    }
                                    if (i85 != aVar10.e()) {
                                        StringBuilder l4 = i2.g.l(i85, "Interleaving error: ", " and ");
                                        l4.append(aVar10.e());
                                        l4.append(" differ.");
                                        throw new cc.k(l4.toString());
                                    }
                                    int i90 = (fVar5.a * 4) + 17;
                                    jc.b bVar12 = new jc.b(i90, i90);
                                    if (map != null) {
                                        cc.b bVar13 = cc.b.e;
                                        if (map.containsKey(bVar13)) {
                                            i20 = Integer.parseInt(map.get(bVar13).toString());
                                        }
                                    }
                                    i20 = -1;
                                    int i91 = bVar12.c;
                                    int i92 = bVar12.b;
                                    int i93 = -1;
                                    if (i20 == -1) {
                                        int i94 = 0;
                                        int i95 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        while (i94 < 8) {
                                            hc.c cVar6 = cVar5;
                                            jc.d.b(aVar10, cVar6, fVar5, i94, bVar12);
                                            int a12 = jc.d.a(bVar12, false) + jc.d.a(bVar12, true);
                                            int i96 = 0;
                                            int i97 = 0;
                                            while (true) {
                                                int i98 = i91 - 1;
                                                bArr = bVar12.a;
                                                if (i96 >= i98) {
                                                    break;
                                                }
                                                byte[] bArr6 = bArr[i96];
                                                int i99 = 0;
                                                while (i99 < i92 - 1) {
                                                    byte b11 = bArr6[i99];
                                                    int i100 = i99 + 1;
                                                    int i101 = i93;
                                                    if (b11 == bArr6[i100]) {
                                                        byte[] bArr7 = bArr[i96 + 1];
                                                        if (b11 == bArr7[i99] && b11 == bArr7[i100]) {
                                                            i97++;
                                                        }
                                                    }
                                                    i93 = i101;
                                                    i99 = i100;
                                                }
                                                i96++;
                                            }
                                            int i102 = i93;
                                            int i103 = (i97 * 3) + a12;
                                            int i104 = 0;
                                            for (int i105 = 0; i105 < i91; i105++) {
                                                int i106 = 0;
                                                while (i106 < i92) {
                                                    byte[] bArr8 = bArr[i105];
                                                    int i107 = i106 + 6;
                                                    if (i107 < i92) {
                                                        i23 = i94;
                                                        byte b12 = 1;
                                                        if (bArr8[i106] == 1 && bArr8[i106 + 1] == 0 && bArr8[i106 + 2] == 1 && bArr8[i106 + 3] == 1 && bArr8[i106 + 4] == 1 && bArr8[i106 + 5] == 0 && bArr8[i107] == 1) {
                                                            int i108 = i106 - 4;
                                                            if (i108 >= 0 && bArr8.length >= i106) {
                                                                while (i108 < i106) {
                                                                    if (bArr8[i108] != b12) {
                                                                        i108++;
                                                                        b12 = 1;
                                                                    }
                                                                }
                                                                z17 = true;
                                                                if (!z17) {
                                                                    int i109 = i106 + 7;
                                                                    int i110 = i106 + 11;
                                                                    if (i109 >= 0 && bArr8.length >= i110) {
                                                                        while (i109 < i110) {
                                                                            int i111 = i109;
                                                                            if (bArr8[i109] != 1) {
                                                                                i109 = i111 + 1;
                                                                            }
                                                                        }
                                                                        z18 = true;
                                                                    }
                                                                    z18 = false;
                                                                    break;
                                                                }
                                                                i104++;
                                                            }
                                                            z17 = false;
                                                            if (!z17) {
                                                            }
                                                            i104++;
                                                        }
                                                    } else {
                                                        i23 = i94;
                                                    }
                                                    int i112 = i105 + 6;
                                                    if (i112 < i91) {
                                                        byte b13 = 1;
                                                        if (bArr[i105][i106] == 1 && bArr[i105 + 1][i106] == 0 && bArr[i105 + 2][i106] == 1 && bArr[i105 + 3][i106] == 1 && bArr[i105 + 4][i106] == 1 && bArr[i105 + 5][i106] == 0 && bArr[i112][i106] == 1) {
                                                            int i113 = i105 - 4;
                                                            if (i113 >= 0 && bArr.length >= i105) {
                                                                while (i113 < i105) {
                                                                    if (bArr[i113][i106] != b13) {
                                                                        i113++;
                                                                        b13 = 1;
                                                                    }
                                                                }
                                                                z15 = true;
                                                                if (!z15) {
                                                                    int i114 = i105 + 7;
                                                                    int i115 = i105 + 11;
                                                                    if (i114 >= 0 && bArr.length >= i115) {
                                                                        while (i114 < i115) {
                                                                            if (bArr[i114][i106] != 1) {
                                                                                i114++;
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
                                                                i104++;
                                                            }
                                                            z15 = false;
                                                            if (!z15) {
                                                            }
                                                            i104++;
                                                        }
                                                    }
                                                    i106++;
                                                    i94 = i23;
                                                }
                                            }
                                            int i116 = i94;
                                            int i117 = (i104 * 40) + i103;
                                            int i118 = 0;
                                            for (int i119 = 0; i119 < i91; i119++) {
                                                byte[] bArr9 = bArr[i119];
                                                for (int i120 = 0; i120 < i92; i120++) {
                                                    if (bArr9[i120] == 1) {
                                                        i118++;
                                                    }
                                                }
                                            }
                                            int i121 = i91 * i92;
                                            int abs = (((Math.abs((i118 * 2) - i121) * 10) / i121) * 10) + i117;
                                            if (abs < i95) {
                                                i95 = abs;
                                                i93 = i116;
                                            } else {
                                                i93 = i102;
                                            }
                                            i94 = i116 + 1;
                                            cVar5 = cVar6;
                                        }
                                        i20 = i93;
                                    }
                                    jc.d.b(aVar10, cVar5, fVar5, i20, bVar12);
                                    this.input = bVar12;
                                    for (int i122 = 0; i122 < i92 && has(i122, 0); i122++) {
                                        this.sideQuadSize++;
                                    }
                                    int i123 = i25 * 2;
                                    int i124 = i92 + i123;
                                    int i125 = i123 + i91;
                                    int min = Math.min(Math.max(i10, i124) / i124, Math.max(i11, i125) / i125);
                                    int i126 = min * i92;
                                    int i127 = i126 + 32;
                                    Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i127) ? Bitmap.createBitmap(i127, i127, Bitmap.Config.ARGB_8888) : bitmap;
                                    Canvas canvas3 = new Canvas(createBitmap);
                                    canvas3.drawColor(i12);
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(i13);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setCornerRadii(this.radii);
                                    float f11 = i126 / 4.65f;
                                    Canvas canvas4 = canvas3;
                                    float f12 = min;
                                    int round = Math.round(f11 / f12);
                                    this.imageBloks = round;
                                    if (round % 2 != i92 % 2) {
                                        this.imageBloks = round + 1;
                                    }
                                    int i128 = this.imageBloks;
                                    this.imageBlockX = (i92 - i128) / 2;
                                    int i129 = (i128 * min) - 24;
                                    this.imageSize = i129;
                                    int i130 = (i127 - i129) / 2;
                                    if (this.includeSideQuads) {
                                        paint3.setColor(i13);
                                        paint = paint3;
                                        i21 = min;
                                        i22 = i130;
                                        bitmap2 = createBitmap;
                                        c10 = 3;
                                        drawSideQuadsGradient(canvas4, paint, gradientDrawable, this.sideQuadSize, f12, 16, i127, f7, this.radii, i12, i13);
                                    } else {
                                        i21 = min;
                                        paint = paint3;
                                        i22 = i130;
                                        bitmap2 = createBitmap;
                                        c10 = 3;
                                    }
                                    boolean z22 = Color.alpha(i12) == 0;
                                    float f13 = (f12 / 2.0f) * f7;
                                    int i131 = 16;
                                    int i132 = 0;
                                    while (i132 < i91) {
                                        int i133 = 0;
                                        int i134 = 16;
                                        while (i133 < i92) {
                                            if (has(i133, i132)) {
                                                Arrays.fill(this.radii, f13);
                                                if (has(i133, i132 - 1)) {
                                                    float[] fArr = this.radii;
                                                    fArr[1] = 0.0f;
                                                    fArr[0] = 0.0f;
                                                    fArr[c10] = 0.0f;
                                                    fArr[2] = 0.0f;
                                                }
                                                if (has(i133, i132 + 1)) {
                                                    float[] fArr2 = this.radii;
                                                    fArr2[7] = 0.0f;
                                                    fArr2[6] = 0.0f;
                                                    fArr2[5] = 0.0f;
                                                    fArr2[4] = 0.0f;
                                                }
                                                if (has(i133 - 1, i132)) {
                                                    float[] fArr3 = this.radii;
                                                    fArr3[1] = 0.0f;
                                                    fArr3[0] = 0.0f;
                                                    fArr3[7] = 0.0f;
                                                    fArr3[6] = 0.0f;
                                                }
                                                if (has(i133 + 1, i132)) {
                                                    float[] fArr4 = this.radii;
                                                    fArr4[c10] = 0.0f;
                                                    fArr4[2] = 0.0f;
                                                    fArr4[5] = 0.0f;
                                                    fArr4[4] = 0.0f;
                                                }
                                                gradientDrawable.setColor(i13);
                                                gradientDrawable.setBounds(i134, i131, i134 + i21, i131 + i21);
                                                gradientDrawable.draw(canvas4);
                                                paint2 = paint;
                                                canvas2 = canvas4;
                                                f10 = f13;
                                            } else {
                                                Paint paint4 = paint;
                                                Arrays.fill(this.radii, 0.0f);
                                                int i135 = i133 - 1;
                                                int i136 = i132 - 1;
                                                if (has(i135, i136) && has(i135, i132) && has(i133, i136)) {
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
                                                int i137 = i133 + 1;
                                                if (has(i137, i136) && has(i137, i132) && has(i133, i136)) {
                                                    float[] fArr6 = this.radii;
                                                    fArr6[c10] = f13;
                                                    fArr6[2] = f13;
                                                    z14 = true;
                                                } else {
                                                    z14 = z23;
                                                }
                                                f10 = f13;
                                                int i138 = i132 + 1;
                                                if (has(i135, i138) && has(i135, i132) && has(i133, i138)) {
                                                    float[] fArr7 = this.radii;
                                                    fArr7[7] = f10;
                                                    fArr7[6] = f10;
                                                    z14 = true;
                                                }
                                                if (has(i137, i138) && has(i137, i132) && has(i133, i138)) {
                                                    float[] fArr8 = this.radii;
                                                    fArr8[5] = f10;
                                                    fArr8[4] = f10;
                                                    z14 = true;
                                                }
                                                if (!z14 || z22) {
                                                    canvas2 = canvas;
                                                    paint2 = paint4;
                                                } else {
                                                    int i139 = i134 + i21;
                                                    int i140 = i131 + i21;
                                                    canvas.drawRect(i134, i131, i139, i140, paint4);
                                                    canvas2 = canvas;
                                                    paint2 = paint4;
                                                    gradientDrawable.setColor(i12);
                                                    gradientDrawable.setBounds(i134, i131, i139, i140);
                                                    gradientDrawable.draw(canvas2);
                                                }
                                            }
                                            i133++;
                                            i134 += i21;
                                            canvas4 = canvas2;
                                            paint = paint2;
                                            f13 = f10;
                                        }
                                        i132++;
                                        i131 += i21;
                                        paint = paint;
                                    }
                                    Canvas canvas5 = canvas4;
                                    String readRes = AndroidUtilities.readRes(R.raw.qr_logo);
                                    int i141 = this.imageSize;
                                    Bitmap bitmap3 = SvgHelper.getBitmap(readRes, i141, i141, false);
                                    float f14 = i22;
                                    canvas5.drawBitmap(bitmap3, f14, f14, (Paint) null);
                                    bitmap3.recycle();
                                    canvas5.setBitmap(null);
                                    return bitmap2;
                                }
                                forName = charset;
                                int i252 = i14;
                                if (!z11) {
                                }
                                c5.b0 b0Var2 = fVar2.c[cVar2.ordinal()];
                                int i412 = fVar2.d;
                                int i422 = b0Var2.b;
                                b2.q0[] q0VarArr2 = (b2.q0[]) b0Var2.c;
                                int i432 = 0;
                                while (r13 < r12) {
                                }
                                int i442 = i412 - (i432 * i422);
                                i19 = i442 * 8;
                                if (aVar.b > i19) {
                                }
                            }
                        }
                        z11 = false;
                        cc.b bVar52 = cc.b.b;
                        if (map == null) {
                        }
                        if (z12) {
                        }
                        forName = charset;
                        int i2522 = i14;
                        if (!z11) {
                        }
                        c5.b0 b0Var22 = fVar2.c[cVar2.ordinal()];
                        int i4122 = fVar2.d;
                        int i4222 = b0Var22.b;
                        b2.q0[] q0VarArr22 = (b2.q0[]) b0Var22.c;
                        int i4322 = 0;
                        while (r13 < r12) {
                        }
                        int i4422 = i4122 - (i4322 * i4222);
                        i19 = i4422 * 8;
                        if (aVar.b > i19) {
                        }
                    }
                }
                z10 = false;
                if (map != null) {
                }
                z11 = false;
                cc.b bVar522 = cc.b.b;
                if (map == null) {
                }
                if (z12) {
                }
                forName = charset;
                int i25222 = i14;
                if (!z11) {
                }
                c5.b0 b0Var222 = fVar2.c[cVar2.ordinal()];
                int i41222 = fVar2.d;
                int i42222 = b0Var222.b;
                b2.q0[] q0VarArr222 = (b2.q0[]) b0Var222.c;
                int i43222 = 0;
                while (r13 < r12) {
                }
                int i44222 = i41222 - (i43222 * i42222);
                i19 = i44222 * 8;
                if (aVar.b > i19) {
                }
            }
        }
        i14 = 4;
        Charset charset3 = jc.c.b;
        if (map != null) {
        }
        z10 = false;
        if (map != null) {
        }
        z11 = false;
        cc.b bVar5222 = cc.b.b;
        if (map == null) {
        }
        if (z12) {
        }
        forName = charset3;
        int i252222 = i14;
        if (!z11) {
        }
        c5.b0 b0Var2222 = fVar2.c[cVar2.ordinal()];
        int i412222 = fVar2.d;
        int i422222 = b0Var2222.b;
        b2.q0[] q0VarArr2222 = (b2.q0[]) b0Var2222.c;
        int i432222 = 0;
        while (r13 < r12) {
        }
        int i442222 = i412222 - (i432222 * i422222);
        i19 = i442222 * 8;
        if (aVar.b > i19) {
        }
    }
}
