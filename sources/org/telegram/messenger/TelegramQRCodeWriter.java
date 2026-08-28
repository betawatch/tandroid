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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private rb.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f10, float f11, Paint paint, float f12, float f13, int i9, float f14, float f15, float[] fArr, boolean z10) {
        float f16;
        float f17;
        Path path = new Path();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                f16 = i9;
                f17 = f16;
            } else if (i10 == 1) {
                f17 = i9;
                f16 = (f14 - (f12 * f13)) - f17;
            } else {
                f16 = i9;
                f17 = (f14 - (f12 * f13)) - f16;
            }
            float f18 = f16 + f10;
            float f19 = f17 + f11;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f20 = (f12 - 1.0f) * f13;
                rectF.set(f18 + f13, f19 + f13, f18 + f20, f20 + f19);
                float f21 = ((f12 * f13) / 4.0f) * f15;
                path.reset();
                path.addRoundRect(rectF, f21, f21, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f22 = f12 * f13;
            float f23 = (f22 / 3.0f) * f15;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f18, f19, f18 + f22, f22 + f19);
            canvas.drawRoundRect(rectF2, f23, f23, paint);
            if (z10) {
                canvas.restore();
            }
            float f24 = (f12 - 2.0f) * f13;
            float f25 = (f24 / 4.0f) * f15;
            float f26 = 2.0f * f13;
            rectF2.set(f18 + f26, f26 + f19, f18 + f24, f19 + f24);
            canvas.drawRoundRect(rectF2, f25, f25, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f10, float f11, int i9, float f12, float f13, float[] fArr, int i10, int i11) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10 = Color.alpha(i10) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0) {
                f17 = i9;
                f16 = f17;
            } else {
                if (i12 == 1) {
                    f15 = i9;
                    f14 = (f12 - (f10 * f11)) - f15;
                } else {
                    f14 = i9;
                    f15 = (f12 - (f10 * f11)) - f14;
                }
                f16 = f14;
                f17 = f15;
            }
            if (z10) {
                float f19 = (f10 - 1.0f) * f11;
                f18 = 1.0f;
                rectF.set(f16 + f11, f17 + f11, f16 + f19, f19 + f17);
                float f20 = ((f10 * f11) / 4.0f) * f13;
                path.reset();
                path.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f18 = 1.0f;
            }
            float f21 = f10 * f11;
            Arrays.fill(fArr, (f21 / 3.0f) * f13);
            gradientDrawable.setColor(i11);
            gradientDrawable.setBounds((int) f16, (int) f17, (int) (f16 + f21), (int) (f17 + f21));
            gradientDrawable.draw(canvas);
            float f22 = f17;
            float f23 = f16 + f11;
            float f24 = f22 + f11;
            float f25 = (f10 - f18) * f11;
            float f26 = f16 + f25;
            float f27 = f25 + f22;
            canvas.drawRect(f23, f24, f26, f27, paint);
            if (z10) {
                canvas.restore();
            }
            if (!z10) {
                Arrays.fill(fArr, (f21 / 4.0f) * f13);
                gradientDrawable.setColor(i10);
                gradientDrawable.setBounds((int) f23, (int) f24, (int) f26, (int) f27);
                gradientDrawable.draw(canvas);
            }
            float f28 = (f10 - 2.0f) * f11;
            Arrays.fill(fArr, (f28 / 4.0f) * f13);
            gradientDrawable.setColor(i11);
            float f29 = 2.0f * f11;
            gradientDrawable.setBounds((int) (f16 + f29), (int) (f22 + f29), (int) (f16 + f28), (int) (f22 + f28));
            gradientDrawable.draw(canvas);
        }
    }

    private boolean has(int i9, int i10) {
        int i11 = this.imageBlockX;
        if (i9 >= i11) {
            int i12 = this.imageBloks;
            if (i9 < i11 + i12 && i10 >= i11 && i10 < i11 + i12) {
                return false;
            }
        }
        int i13 = this.sideQuadSize;
        if ((i9 < i13 || i9 >= this.input.b - i13) && i10 < i13) {
            return false;
        }
        if ((i9 >= i13 || i10 < this.input.c - i13) && i9 >= 0 && i10 >= 0) {
            rb.b bVar = this.input;
            if (i9 < bVar.b && i10 < bVar.c && bVar.a(i9, i10) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i9, int i10, Map<kb.b, ?> map, Bitmap bitmap) {
        return encode(str, i9, i10, map, bitmap, 1.0f, -1, -16777216);
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
    public Bitmap encode(String str, int i9, int i10, Map<kb.b, ?> map, Bitmap bitmap, float f10, int i11, int i12) {
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        Charset forName;
        pb.d dVar;
        int i14;
        pb.e eVar;
        int i15;
        int i16;
        int e10;
        int i17;
        pb.e eVar2;
        lb.a aVar;
        lb.c cVar;
        int i18;
        int i19;
        int i20;
        Paint paint;
        int i21;
        Bitmap bitmap2;
        char c10;
        Canvas canvas;
        boolean z13;
        boolean z14;
        float f11;
        Canvas canvas2;
        Paint paint2;
        byte[][] bArr;
        int i22;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        char c11;
        int i23;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i9 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i9 + 'x' + i10);
        }
        pb.b bVar = pb.b.b;
        if (map != null) {
            kb.b bVar2 = kb.b.a;
            if (map.containsKey(bVar2)) {
                bVar = pb.b.valueOf(map.get(bVar2).toString());
            }
            kb.b bVar3 = kb.b.c;
            if (map.containsKey(bVar3)) {
                i13 = Integer.parseInt(map.get(bVar3).toString());
                Charset charset = rb.c.b;
                if (map != null) {
                    kb.b bVar4 = kb.b.h;
                    if (map.containsKey(bVar4) && Boolean.parseBoolean(map.get(bVar4).toString())) {
                        z10 = true;
                        if (map != null) {
                            kb.b bVar5 = kb.b.f;
                            if (map.containsKey(bVar5) && Boolean.parseBoolean(map.get(bVar5).toString())) {
                                z11 = true;
                                kb.b bVar6 = kb.b.b;
                                z12 = map == null && map.containsKey(bVar6);
                                if (z12) {
                                    try {
                                        forName = Charset.forName(map.get(bVar6).toString());
                                    } catch (UnsupportedCharsetException unused) {
                                    }
                                    int i24 = i13;
                                    if (!z11) {
                                        Charset charset2 = lb.h.b;
                                        pb.d dVar2 = pb.d.h;
                                        if (charset2 != null && charset2.equals(forName) && rb.c.b(str)) {
                                            dVar = pb.d.r;
                                        } else {
                                            boolean z19 = false;
                                            boolean z20 = false;
                                            int i25 = 0;
                                            while (true) {
                                                if (i25 < str.length()) {
                                                    char charAt = str.charAt(i25);
                                                    if (charAt < '0' || charAt > '9') {
                                                        if ((charAt < '`' ? rb.c.a[charAt] : -1) == -1) {
                                                            break;
                                                        }
                                                        z19 = true;
                                                    } else {
                                                        z20 = true;
                                                    }
                                                    i25++;
                                                } else if (z19) {
                                                    dVar = pb.d.e;
                                                } else if (z20) {
                                                    dVar = pb.d.d;
                                                }
                                            }
                                            dVar = dVar2;
                                        }
                                        lb.a aVar2 = new lb.a();
                                        if (dVar == dVar2 && z12 && (cVar = (lb.c) lb.c.d.get(forName.name())) != null) {
                                            i14 = 4;
                                            aVar2.b(7, 4);
                                            aVar2.b(cVar.a[0], 8);
                                        } else {
                                            i14 = 4;
                                        }
                                        if (z10) {
                                            aVar2.b(5, i14);
                                        }
                                        aVar2.b(dVar.b, i14);
                                        lb.a aVar3 = new lb.a();
                                        rb.c.a(str, dVar, aVar3, forName);
                                        if (map != null) {
                                            kb.b bVar7 = kb.b.d;
                                            if (map.containsKey(bVar7)) {
                                                eVar = pb.e.c(Integer.parseInt(map.get(bVar7).toString()));
                                                if (!rb.c.c(dVar.a(eVar) + aVar2.b + aVar3.b, eVar, bVar)) {
                                                    throw new com.google.firebase.messaging.s("Data too big for requested version");
                                                }
                                                lb.a aVar4 = new lb.a();
                                                i15 = aVar2.b;
                                                aVar4.c(i15);
                                                for (i16 = 0; i16 < i15; i16++) {
                                                    aVar4.a(aVar2.d(i16));
                                                }
                                                e10 = dVar != dVar2 ? aVar3.e() : str.length();
                                                int a2 = dVar.a(eVar);
                                                i17 = 1 << a2;
                                                if (e10 < i17) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(e10);
                                                    sb2.append(" is bigger than ");
                                                    sb2.append(i17 - 1);
                                                    throw new com.google.firebase.messaging.s(sb2.toString());
                                                }
                                                aVar4.b(e10, a2);
                                                int i26 = aVar3.b;
                                                aVar4.c(aVar4.b + i26);
                                                for (int i27 = 0; i27 < i26; i27++) {
                                                    aVar4.a(aVar3.d(i27));
                                                }
                                                eVar2 = eVar;
                                                aVar = aVar4;
                                            }
                                        }
                                        int a3 = dVar.a(pb.e.c(1)) + aVar2.b + aVar3.b;
                                        int i28 = 1;
                                        while (i28 <= 40) {
                                            pb.e c12 = pb.e.c(i28);
                                            if (rb.c.c(a3, c12, bVar)) {
                                                int a10 = dVar.a(c12) + aVar2.b + aVar3.b;
                                                int i29 = 1;
                                                while (i29 <= 40) {
                                                    pb.e c13 = pb.e.c(i29);
                                                    if (rb.c.c(a10, c13, bVar)) {
                                                        eVar = c13;
                                                        lb.a aVar42 = new lb.a();
                                                        i15 = aVar2.b;
                                                        aVar42.c(i15);
                                                        while (i16 < i15) {
                                                        }
                                                        if (dVar != dVar2) {
                                                        }
                                                        int a22 = dVar.a(eVar);
                                                        i17 = 1 << a22;
                                                        if (e10 < i17) {
                                                        }
                                                    } else {
                                                        i29++;
                                                        bVar = bVar;
                                                    }
                                                }
                                                throw new com.google.firebase.messaging.s("Data too big");
                                            }
                                            i28++;
                                            a3 = a3;
                                            bVar = bVar;
                                        }
                                        throw new com.google.firebase.messaging.s("Data too big");
                                    }
                                    if (forName.equals(charset)) {
                                        forName = null;
                                    }
                                    com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
                                    lVar.b = str;
                                    lVar.a = z10;
                                    lVar.c = new lb.e(str, forName);
                                    lVar.d = bVar;
                                    pb.b bVar8 = (pb.b) lVar.d;
                                    pb.e[] eVarArr = {com.google.firebase.messaging.l.j(1), com.google.firebase.messaging.l.j(2), com.google.firebase.messaging.l.j(3)};
                                    j4.c[] cVarArr = {lVar.h(eVarArr[0]), lVar.h(eVarArr[1]), lVar.h(eVarArr[2])};
                                    int i30 = 0;
                                    int i31 = -1;
                                    int i32 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i33 = 3; i30 < i33; i33 = 3) {
                                        j4.c cVar2 = cVarArr[i30];
                                        int A = cVar2.A((pb.e) cVar2.c);
                                        if (rb.c.c(A, eVarArr[i30], bVar8) && A < i32) {
                                            i32 = A;
                                            i31 = i30;
                                        }
                                        i30++;
                                    }
                                    if (i31 < 0) {
                                        throw new com.google.firebase.messaging.s("Data too big for any version");
                                    }
                                    j4.c cVar3 = cVarArr[i31];
                                    aVar = new lb.a();
                                    ArrayList arrayList = (ArrayList) cVar3.b;
                                    int size = arrayList.size();
                                    int i34 = 0;
                                    while (i34 < size) {
                                        Object obj = arrayList.get(i34);
                                        int i35 = i34 + 1;
                                        rb.f fVar = (rb.f) obj;
                                        int i36 = fVar.c;
                                        j4.c cVar4 = fVar.e;
                                        com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) cVar4.d;
                                        ArrayList arrayList2 = arrayList;
                                        pb.d dVar3 = fVar.a;
                                        int i37 = size;
                                        aVar.b(dVar3.b, 4);
                                        int i38 = fVar.d;
                                        if (i38 > 0) {
                                            aVar.b(fVar.a(), dVar3.a((pb.e) cVar4.c));
                                        }
                                        if (dVar3 == pb.d.n) {
                                            aVar.b(((lb.c) lb.c.d.get(((lb.e) lVar2.c).a[i36].charset().name())).a[0], 8);
                                        } else if (i38 > 0) {
                                            String str2 = (String) lVar2.b;
                                            int i39 = fVar.b;
                                            rb.c.a(str2.substring(i39, i38 + i39), dVar3, aVar, ((lb.e) lVar2.c).a[i36].charset());
                                        }
                                        arrayList = arrayList2;
                                        size = i37;
                                        i34 = i35;
                                    }
                                    eVar2 = (pb.e) cVar3.c;
                                    n2.w wVar = eVar2.c[bVar.ordinal()];
                                    int i40 = eVar2.d;
                                    int i41 = wVar.b;
                                    d5.p[] pVarArr = (d5.p[]) wVar.c;
                                    int i42 = 0;
                                    for (d5.p pVar : pVarArr) {
                                        i42 += pVar.a;
                                    }
                                    int i43 = i40 - (i42 * i41);
                                    i18 = i43 * 8;
                                    if (aVar.b > i18) {
                                        throw new com.google.firebase.messaging.s("data bits cannot fit in the QR Code" + aVar.b + " > " + i18);
                                    }
                                    for (int i44 = 0; i44 < 4 && aVar.b < i18; i44++) {
                                        aVar.a(false);
                                    }
                                    boolean z21 = false;
                                    int i45 = aVar.b & 7;
                                    if (i45 > 0) {
                                        while (i45 < 8) {
                                            aVar.a(z21);
                                            i45++;
                                            z21 = false;
                                        }
                                    }
                                    int e11 = i43 - aVar.e();
                                    int i46 = 0;
                                    while (i46 < e11) {
                                        int i47 = e11;
                                        aVar.b((i46 & 1) == 0 ? 236 : 17, 8);
                                        i46++;
                                        e11 = i47;
                                    }
                                    if (aVar.b != i18) {
                                        throw new com.google.firebase.messaging.s("Bits size does not equal capacity");
                                    }
                                    int i48 = 0;
                                    for (d5.p pVar2 : pVarArr) {
                                        i48 += pVar2.a;
                                    }
                                    if (aVar.e() != i43) {
                                        throw new com.google.firebase.messaging.s("Number of bits and data bytes does not match");
                                    }
                                    ArrayList arrayList3 = new ArrayList(i48);
                                    int i49 = 0;
                                    int i50 = 0;
                                    int i51 = 0;
                                    int i52 = 0;
                                    while (i50 < i48) {
                                        int[] iArr = new int[1];
                                        int[] iArr2 = new int[1];
                                        if (i50 >= i48) {
                                            throw new com.google.firebase.messaging.s("Block ID too large");
                                        }
                                        int i53 = i40 % i48;
                                        int i54 = i48 - i53;
                                        int i55 = i40 / i48;
                                        int i56 = i43 / i48;
                                        int i57 = i56 + 1;
                                        int i58 = i55 - i56;
                                        int i59 = (i55 + 1) - i57;
                                        if (i58 != i59) {
                                            throw new com.google.firebase.messaging.s("EC bytes mismatch");
                                        }
                                        if (i48 != i54 + i53) {
                                            throw new com.google.firebase.messaging.s("RS blocks mismatch");
                                        }
                                        if (i40 != ((i57 + i59) * i53) + ((i56 + i58) * i54)) {
                                            throw new com.google.firebase.messaging.s("Total bytes mismatch");
                                        }
                                        if (i50 < i54) {
                                            c11 = 0;
                                            iArr[0] = i56;
                                            iArr2[0] = i58;
                                        } else {
                                            c11 = 0;
                                            iArr[0] = i57;
                                            iArr2[0] = i59;
                                        }
                                        int i60 = iArr[c11];
                                        byte[] bArr2 = new byte[i60];
                                        int i61 = i51 * 8;
                                        int i62 = 0;
                                        while (i62 < i60) {
                                            int i63 = i62;
                                            int i64 = i48;
                                            int i65 = i61;
                                            int i66 = i50;
                                            int i67 = 0;
                                            for (int i68 = 0; i68 < 8; i68++) {
                                                if (aVar.d(i65)) {
                                                    i67 = (1 << (7 - i68)) | i67;
                                                }
                                                i65++;
                                            }
                                            bArr2[i63] = (byte) i67;
                                            i62 = i63 + 1;
                                            i50 = i66;
                                            i61 = i65;
                                            i48 = i64;
                                        }
                                        int i69 = i50;
                                        int i70 = i48;
                                        int i71 = iArr2[0];
                                        int i72 = i60 + i71;
                                        int[] iArr3 = new int[i72];
                                        int i73 = 0;
                                        while (i73 < i60) {
                                            iArr3[i73] = bArr2[i73] & 255;
                                            i73++;
                                            i72 = i72;
                                        }
                                        int i74 = i72;
                                        nb.a aVar5 = nb.a.h;
                                        ArrayList arrayList4 = new ArrayList();
                                        lb.a aVar6 = aVar;
                                        pb.b bVar9 = bVar;
                                        arrayList4.add(new nb.b(aVar5, new int[]{1}));
                                        if (i71 == 0) {
                                            throw new IllegalArgumentException("No error correction bytes");
                                        }
                                        int i75 = i74 - i71;
                                        if (i75 <= 0) {
                                            throw new IllegalArgumentException("No data bytes provided");
                                        }
                                        if (i71 >= arrayList4.size()) {
                                            nb.b bVar10 = (nb.b) j3.r0.j(1, arrayList4);
                                            int size2 = arrayList4.size();
                                            nb.b bVar11 = bVar10;
                                            while (size2 <= i71) {
                                                int i76 = size2;
                                                bVar11 = bVar11.g(new nb.b(aVar5, new int[]{1, aVar5.a[(i76 - 1) + aVar5.g]}));
                                                arrayList4.add(bVar11);
                                                size2 = i76 + 1;
                                                i40 = i40;
                                                eVar2 = eVar2;
                                            }
                                        }
                                        pb.e eVar3 = eVar2;
                                        int i77 = i40;
                                        nb.b bVar12 = (nb.b) arrayList4.get(i71);
                                        int[] iArr4 = new int[i75];
                                        System.arraycopy(iArr3, 0, iArr4, 0, i75);
                                        if (i75 == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (i75 > 1 && iArr4[0] == 0) {
                                            int i78 = 1;
                                            while (i78 < i75 && iArr4[i78] == 0) {
                                                i78++;
                                            }
                                            if (i78 == i75) {
                                                iArr4 = new int[]{0};
                                            } else {
                                                int i79 = i75 - i78;
                                                i23 = i75;
                                                int[] iArr5 = new int[i79];
                                                System.arraycopy(iArr4, i78, iArr5, 0, i79);
                                                iArr4 = iArr5;
                                                if (i71 >= 0) {
                                                    throw new IllegalArgumentException();
                                                }
                                                int length = iArr4.length;
                                                int[] iArr6 = new int[length + i71];
                                                int i80 = 0;
                                                while (i80 < length) {
                                                    iArr6[i80] = aVar5.c(iArr4[i80], 1);
                                                    i80++;
                                                    iArr4 = iArr4;
                                                }
                                                nb.b bVar13 = new nb.b(aVar5, iArr6);
                                                if (!aVar5.equals(bVar12.a)) {
                                                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                }
                                                if (bVar12.e()) {
                                                    throw new IllegalArgumentException("Divide by 0");
                                                }
                                                nb.b bVar14 = aVar5.c;
                                                int b10 = aVar5.b(bVar12.c(bVar12.d()));
                                                while (bVar13.d() >= bVar12.d() && !bVar13.e()) {
                                                    int d = bVar13.d() - bVar12.d();
                                                    int c14 = aVar5.c(bVar13.c(bVar13.d()), b10);
                                                    int i81 = b10;
                                                    nb.b h = bVar12.h(d, c14);
                                                    bVar14 = bVar14.a(aVar5.a(d, c14));
                                                    bVar13 = bVar13.a(h);
                                                    b10 = i81;
                                                }
                                                int[] iArr7 = new nb.b[]{bVar14, bVar13}[1].b;
                                                int length2 = i71 - iArr7.length;
                                                for (int i82 = 0; i82 < length2; i82++) {
                                                    iArr3[i23 + i82] = 0;
                                                }
                                                System.arraycopy(iArr7, 0, iArr3, i23 + length2, iArr7.length);
                                                byte[] bArr3 = new byte[i71];
                                                for (int i83 = 0; i83 < i71; i83++) {
                                                    bArr3[i83] = (byte) iArr3[i60 + i83];
                                                }
                                                arrayList3.add(new rb.a(bArr2, bArr3));
                                                i52 = Math.max(i52, i60);
                                                i49 = Math.max(i49, i71);
                                                i51 += iArr[0];
                                                i50 = i69 + 1;
                                                aVar = aVar6;
                                                i48 = i70;
                                                i40 = i77;
                                                bVar = bVar9;
                                                eVar2 = eVar3;
                                            }
                                        }
                                        i23 = i75;
                                        if (i71 >= 0) {
                                        }
                                    }
                                    pb.e eVar4 = eVar2;
                                    pb.b bVar15 = bVar;
                                    int i84 = i40;
                                    if (i43 != i51) {
                                        throw new com.google.firebase.messaging.s("Data bytes does not match offset");
                                    }
                                    lb.a aVar7 = new lb.a();
                                    for (int i85 = 0; i85 < i52; i85++) {
                                        int size3 = arrayList3.size();
                                        int i86 = 0;
                                        while (i86 < size3) {
                                            Object obj2 = arrayList3.get(i86);
                                            i86++;
                                            byte[] bArr4 = ((rb.a) obj2).a;
                                            if (i85 < bArr4.length) {
                                                aVar7.b(bArr4[i85], 8);
                                            }
                                        }
                                    }
                                    for (int i87 = 0; i87 < i49; i87++) {
                                        int size4 = arrayList3.size();
                                        int i88 = 0;
                                        while (i88 < size4) {
                                            Object obj3 = arrayList3.get(i88);
                                            i88++;
                                            byte[] bArr5 = ((rb.a) obj3).b;
                                            if (i87 < bArr5.length) {
                                                aVar7.b(bArr5[i87], 8);
                                            }
                                        }
                                    }
                                    if (i84 != aVar7.e()) {
                                        StringBuilder p6 = j3.r0.p(i84, "Interleaving error: ", " and ");
                                        p6.append(aVar7.e());
                                        p6.append(" differ.");
                                        throw new com.google.firebase.messaging.s(p6.toString());
                                    }
                                    int i89 = (eVar4.a * 4) + 17;
                                    rb.b bVar16 = new rb.b(i89, i89);
                                    if (map != null) {
                                        kb.b bVar17 = kb.b.e;
                                        if (map.containsKey(bVar17)) {
                                            i19 = Integer.parseInt(map.get(bVar17).toString());
                                        }
                                    }
                                    i19 = -1;
                                    int i90 = bVar16.c;
                                    int i91 = bVar16.b;
                                    int i92 = -1;
                                    if (i19 == -1) {
                                        int i93 = 0;
                                        int i94 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        while (i93 < 8) {
                                            pb.b bVar18 = bVar15;
                                            rb.d.b(aVar7, bVar18, eVar4, i93, bVar16);
                                            int a11 = rb.d.a(bVar16, false) + rb.d.a(bVar16, true);
                                            int i95 = 0;
                                            int i96 = 0;
                                            while (true) {
                                                int i97 = i90 - 1;
                                                bArr = bVar16.a;
                                                if (i95 >= i97) {
                                                    break;
                                                }
                                                byte[] bArr6 = bArr[i95];
                                                int i98 = 0;
                                                while (i98 < i91 - 1) {
                                                    byte b11 = bArr6[i98];
                                                    int i99 = i98 + 1;
                                                    int i100 = i92;
                                                    if (b11 == bArr6[i99]) {
                                                        byte[] bArr7 = bArr[i95 + 1];
                                                        if (b11 == bArr7[i98] && b11 == bArr7[i99]) {
                                                            i96++;
                                                        }
                                                    }
                                                    i92 = i100;
                                                    i98 = i99;
                                                }
                                                i95++;
                                            }
                                            int i101 = i92;
                                            int i102 = (i96 * 3) + a11;
                                            int i103 = 0;
                                            for (int i104 = 0; i104 < i90; i104++) {
                                                int i105 = 0;
                                                while (i105 < i91) {
                                                    byte[] bArr8 = bArr[i104];
                                                    int i106 = i105 + 6;
                                                    if (i106 < i91) {
                                                        i22 = i93;
                                                        byte b12 = 1;
                                                        if (bArr8[i105] == 1 && bArr8[i105 + 1] == 0 && bArr8[i105 + 2] == 1 && bArr8[i105 + 3] == 1 && bArr8[i105 + 4] == 1 && bArr8[i105 + 5] == 0 && bArr8[i106] == 1) {
                                                            int i107 = i105 - 4;
                                                            if (i107 >= 0 && bArr8.length >= i105) {
                                                                while (i107 < i105) {
                                                                    if (bArr8[i107] != b12) {
                                                                        i107++;
                                                                        b12 = 1;
                                                                    }
                                                                }
                                                                z17 = true;
                                                                if (!z17) {
                                                                    int i108 = i105 + 7;
                                                                    int i109 = i105 + 11;
                                                                    if (i108 >= 0 && bArr8.length >= i109) {
                                                                        while (i108 < i109) {
                                                                            int i110 = i108;
                                                                            if (bArr8[i108] != 1) {
                                                                                i108 = i110 + 1;
                                                                            }
                                                                        }
                                                                        z18 = true;
                                                                    }
                                                                    z18 = false;
                                                                    break;
                                                                }
                                                                i103++;
                                                            }
                                                            z17 = false;
                                                            if (!z17) {
                                                            }
                                                            i103++;
                                                        }
                                                    } else {
                                                        i22 = i93;
                                                    }
                                                    int i111 = i104 + 6;
                                                    if (i111 < i90) {
                                                        byte b13 = 1;
                                                        if (bArr[i104][i105] == 1 && bArr[i104 + 1][i105] == 0 && bArr[i104 + 2][i105] == 1 && bArr[i104 + 3][i105] == 1 && bArr[i104 + 4][i105] == 1 && bArr[i104 + 5][i105] == 0 && bArr[i111][i105] == 1) {
                                                            int i112 = i104 - 4;
                                                            if (i112 >= 0 && bArr.length >= i104) {
                                                                while (i112 < i104) {
                                                                    if (bArr[i112][i105] != b13) {
                                                                        i112++;
                                                                        b13 = 1;
                                                                    }
                                                                }
                                                                z15 = true;
                                                                if (!z15) {
                                                                    int i113 = i104 + 7;
                                                                    int i114 = i104 + 11;
                                                                    if (i113 >= 0 && bArr.length >= i114) {
                                                                        while (i113 < i114) {
                                                                            if (bArr[i113][i105] != 1) {
                                                                                i113++;
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
                                                                i103++;
                                                            }
                                                            z15 = false;
                                                            if (!z15) {
                                                            }
                                                            i103++;
                                                        }
                                                    }
                                                    i105++;
                                                    i93 = i22;
                                                }
                                            }
                                            int i115 = i93;
                                            int i116 = (i103 * 40) + i102;
                                            int i117 = 0;
                                            for (int i118 = 0; i118 < i90; i118++) {
                                                byte[] bArr9 = bArr[i118];
                                                for (int i119 = 0; i119 < i91; i119++) {
                                                    if (bArr9[i119] == 1) {
                                                        i117++;
                                                    }
                                                }
                                            }
                                            int i120 = i90 * i91;
                                            int abs = (((Math.abs((i117 * 2) - i120) * 10) / i120) * 10) + i116;
                                            if (abs < i94) {
                                                i94 = abs;
                                                i92 = i115;
                                            } else {
                                                i92 = i101;
                                            }
                                            i93 = i115 + 1;
                                            bVar15 = bVar18;
                                        }
                                        i19 = i92;
                                    }
                                    rb.d.b(aVar7, bVar15, eVar4, i19, bVar16);
                                    this.input = bVar16;
                                    for (int i121 = 0; i121 < i91 && has(i121, 0); i121++) {
                                        this.sideQuadSize++;
                                    }
                                    int i122 = i24 * 2;
                                    int i123 = i91 + i122;
                                    int i124 = i122 + i90;
                                    int min = Math.min(Math.max(i9, i123) / i123, Math.max(i10, i124) / i124);
                                    int i125 = min * i91;
                                    int i126 = i125 + 32;
                                    Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i126) ? Bitmap.createBitmap(i126, i126, Bitmap.Config.ARGB_8888) : bitmap;
                                    Canvas canvas3 = new Canvas(createBitmap);
                                    canvas3.drawColor(i11);
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(i12);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setCornerRadii(this.radii);
                                    float f12 = i125 / 4.65f;
                                    Canvas canvas4 = canvas3;
                                    float f13 = min;
                                    int round = Math.round(f12 / f13);
                                    this.imageBloks = round;
                                    if (round % 2 != i91 % 2) {
                                        this.imageBloks = round + 1;
                                    }
                                    int i127 = this.imageBloks;
                                    this.imageBlockX = (i91 - i127) / 2;
                                    int i128 = (i127 * min) - 24;
                                    this.imageSize = i128;
                                    int i129 = (i126 - i128) / 2;
                                    if (this.includeSideQuads) {
                                        paint3.setColor(i12);
                                        paint = paint3;
                                        i20 = min;
                                        i21 = i129;
                                        bitmap2 = createBitmap;
                                        c10 = 3;
                                        drawSideQuadsGradient(canvas4, paint, gradientDrawable, this.sideQuadSize, f13, 16, i126, f10, this.radii, i11, i12);
                                    } else {
                                        i20 = min;
                                        paint = paint3;
                                        i21 = i129;
                                        bitmap2 = createBitmap;
                                        c10 = 3;
                                    }
                                    boolean z22 = Color.alpha(i11) == 0;
                                    float f14 = (f13 / 2.0f) * f10;
                                    int i130 = 16;
                                    int i131 = 0;
                                    while (i131 < i90) {
                                        int i132 = 0;
                                        int i133 = 16;
                                        while (i132 < i91) {
                                            if (has(i132, i131)) {
                                                Arrays.fill(this.radii, f14);
                                                if (has(i132, i131 - 1)) {
                                                    float[] fArr = this.radii;
                                                    fArr[1] = 0.0f;
                                                    fArr[0] = 0.0f;
                                                    fArr[c10] = 0.0f;
                                                    fArr[2] = 0.0f;
                                                }
                                                if (has(i132, i131 + 1)) {
                                                    float[] fArr2 = this.radii;
                                                    fArr2[7] = 0.0f;
                                                    fArr2[6] = 0.0f;
                                                    fArr2[5] = 0.0f;
                                                    fArr2[4] = 0.0f;
                                                }
                                                if (has(i132 - 1, i131)) {
                                                    float[] fArr3 = this.radii;
                                                    fArr3[1] = 0.0f;
                                                    fArr3[0] = 0.0f;
                                                    fArr3[7] = 0.0f;
                                                    fArr3[6] = 0.0f;
                                                }
                                                if (has(i132 + 1, i131)) {
                                                    float[] fArr4 = this.radii;
                                                    fArr4[c10] = 0.0f;
                                                    fArr4[2] = 0.0f;
                                                    fArr4[5] = 0.0f;
                                                    fArr4[4] = 0.0f;
                                                }
                                                gradientDrawable.setColor(i12);
                                                gradientDrawable.setBounds(i133, i130, i133 + i20, i130 + i20);
                                                gradientDrawable.draw(canvas4);
                                                paint2 = paint;
                                                canvas2 = canvas4;
                                                f11 = f14;
                                            } else {
                                                Paint paint4 = paint;
                                                Arrays.fill(this.radii, 0.0f);
                                                int i134 = i132 - 1;
                                                int i135 = i131 - 1;
                                                if (has(i134, i135) && has(i134, i131) && has(i132, i135)) {
                                                    canvas = canvas4;
                                                    float[] fArr5 = this.radii;
                                                    fArr5[1] = f14;
                                                    fArr5[0] = f14;
                                                    z13 = true;
                                                } else {
                                                    canvas = canvas4;
                                                    z13 = false;
                                                }
                                                boolean z23 = z13;
                                                int i136 = i132 + 1;
                                                if (has(i136, i135) && has(i136, i131) && has(i132, i135)) {
                                                    float[] fArr6 = this.radii;
                                                    fArr6[c10] = f14;
                                                    fArr6[2] = f14;
                                                    z14 = true;
                                                } else {
                                                    z14 = z23;
                                                }
                                                f11 = f14;
                                                int i137 = i131 + 1;
                                                if (has(i134, i137) && has(i134, i131) && has(i132, i137)) {
                                                    float[] fArr7 = this.radii;
                                                    fArr7[7] = f11;
                                                    fArr7[6] = f11;
                                                    z14 = true;
                                                }
                                                if (has(i136, i137) && has(i136, i131) && has(i132, i137)) {
                                                    float[] fArr8 = this.radii;
                                                    fArr8[5] = f11;
                                                    fArr8[4] = f11;
                                                    z14 = true;
                                                }
                                                if (!z14 || z22) {
                                                    canvas2 = canvas;
                                                    paint2 = paint4;
                                                } else {
                                                    int i138 = i133 + i20;
                                                    int i139 = i130 + i20;
                                                    canvas.drawRect(i133, i130, i138, i139, paint4);
                                                    canvas2 = canvas;
                                                    paint2 = paint4;
                                                    gradientDrawable.setColor(i11);
                                                    gradientDrawable.setBounds(i133, i130, i138, i139);
                                                    gradientDrawable.draw(canvas2);
                                                }
                                            }
                                            i132++;
                                            i133 += i20;
                                            canvas4 = canvas2;
                                            paint = paint2;
                                            f14 = f11;
                                        }
                                        i131++;
                                        i130 += i20;
                                        paint = paint;
                                    }
                                    Canvas canvas5 = canvas4;
                                    String readRes = AndroidUtilities.readRes(R.raw.qr_logo);
                                    int i140 = this.imageSize;
                                    Bitmap bitmap3 = SvgHelper.getBitmap(readRes, i140, i140, false);
                                    float f15 = i21;
                                    canvas5.drawBitmap(bitmap3, f15, f15, (Paint) null);
                                    bitmap3.recycle();
                                    canvas5.setBitmap(null);
                                    return bitmap2;
                                }
                                forName = charset;
                                int i242 = i13;
                                if (!z11) {
                                }
                                n2.w wVar2 = eVar2.c[bVar.ordinal()];
                                int i402 = eVar2.d;
                                int i412 = wVar2.b;
                                d5.p[] pVarArr2 = (d5.p[]) wVar2.c;
                                int i422 = 0;
                                while (r13 < r12) {
                                }
                                int i432 = i402 - (i422 * i412);
                                i18 = i432 * 8;
                                if (aVar.b > i18) {
                                }
                            }
                        }
                        z11 = false;
                        kb.b bVar62 = kb.b.b;
                        if (map == null) {
                        }
                        if (z12) {
                        }
                        forName = charset;
                        int i2422 = i13;
                        if (!z11) {
                        }
                        n2.w wVar22 = eVar2.c[bVar.ordinal()];
                        int i4022 = eVar2.d;
                        int i4122 = wVar22.b;
                        d5.p[] pVarArr22 = (d5.p[]) wVar22.c;
                        int i4222 = 0;
                        while (r13 < r12) {
                        }
                        int i4322 = i4022 - (i4222 * i4122);
                        i18 = i4322 * 8;
                        if (aVar.b > i18) {
                        }
                    }
                }
                z10 = false;
                if (map != null) {
                }
                z11 = false;
                kb.b bVar622 = kb.b.b;
                if (map == null) {
                }
                if (z12) {
                }
                forName = charset;
                int i24222 = i13;
                if (!z11) {
                }
                n2.w wVar222 = eVar2.c[bVar.ordinal()];
                int i40222 = eVar2.d;
                int i41222 = wVar222.b;
                d5.p[] pVarArr222 = (d5.p[]) wVar222.c;
                int i42222 = 0;
                while (r13 < r12) {
                }
                int i43222 = i40222 - (i42222 * i41222);
                i18 = i43222 * 8;
                if (aVar.b > i18) {
                }
            }
        }
        i13 = 4;
        Charset charset3 = rb.c.b;
        if (map != null) {
        }
        z10 = false;
        if (map != null) {
        }
        z11 = false;
        kb.b bVar6222 = kb.b.b;
        if (map == null) {
        }
        if (z12) {
        }
        forName = charset3;
        int i242222 = i13;
        if (!z11) {
        }
        n2.w wVar2222 = eVar2.c[bVar.ordinal()];
        int i402222 = eVar2.d;
        int i412222 = wVar2222.b;
        d5.p[] pVarArr2222 = (d5.p[]) wVar2222.c;
        int i422222 = 0;
        while (r13 < r12) {
        }
        int i432222 = i402222 - (i422222 * i412222);
        i18 = i432222 * 8;
        if (aVar.b > i18) {
        }
    }
}
