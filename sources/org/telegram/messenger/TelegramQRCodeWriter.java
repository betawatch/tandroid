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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private vb.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f10, float f11, Paint paint, float f12, float f13, int i10, float f14, float f15, float[] fArr, boolean z4) {
        float f16;
        float f17;
        Path path = new Path();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                f16 = i10;
                f17 = f16;
            } else if (i11 == 1) {
                f17 = i10;
                f16 = (f14 - (f12 * f13)) - f17;
            } else {
                f16 = i10;
                f17 = (f14 - (f12 * f13)) - f16;
            }
            float f18 = f16 + f10;
            float f19 = f17 + f11;
            if (z4) {
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
            if (z4) {
                canvas.restore();
            }
            float f24 = (f12 - 2.0f) * f13;
            float f25 = (f24 / 4.0f) * f15;
            float f26 = 2.0f * f13;
            rectF2.set(f18 + f26, f26 + f19, f18 + f24, f19 + f24);
            canvas.drawRoundRect(rectF2, f25, f25, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f10, float f11, int i10, float f12, float f13, float[] fArr, int i11, int i12) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z4 = Color.alpha(i11) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0) {
                f17 = i10;
                f16 = f17;
            } else {
                if (i13 == 1) {
                    f15 = i10;
                    f14 = (f12 - (f10 * f11)) - f15;
                } else {
                    f14 = i10;
                    f15 = (f12 - (f10 * f11)) - f14;
                }
                f16 = f14;
                f17 = f15;
            }
            if (z4) {
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
            gradientDrawable.setColor(i12);
            gradientDrawable.setBounds((int) f16, (int) f17, (int) (f16 + f21), (int) (f17 + f21));
            gradientDrawable.draw(canvas);
            float f22 = f17;
            float f23 = f16 + f11;
            float f24 = f22 + f11;
            float f25 = (f10 - f18) * f11;
            float f26 = f16 + f25;
            float f27 = f25 + f22;
            canvas.drawRect(f23, f24, f26, f27, paint);
            if (z4) {
                canvas.restore();
            }
            if (!z4) {
                Arrays.fill(fArr, (f21 / 4.0f) * f13);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f23, (int) f24, (int) f26, (int) f27);
                gradientDrawable.draw(canvas);
            }
            float f28 = (f10 - 2.0f) * f11;
            Arrays.fill(fArr, (f28 / 4.0f) * f13);
            gradientDrawable.setColor(i12);
            float f29 = 2.0f * f11;
            gradientDrawable.setBounds((int) (f16 + f29), (int) (f22 + f29), (int) (f16 + f28), (int) (f22 + f28));
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
            vb.b bVar = this.input;
            if (i10 < bVar.b && i11 < bVar.c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<ob.b, ?> map, Bitmap bitmap) {
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
    public Bitmap encode(String str, int i10, int i11, Map<ob.b, ?> map, Bitmap bitmap, float f10, int i12, int i13) {
        int i14;
        boolean z4;
        boolean z10;
        boolean z11;
        Charset forName;
        tb.d dVar;
        int i15;
        tb.e eVar;
        int i16;
        int i17;
        int e;
        int i18;
        tb.e eVar2;
        pb.a aVar;
        pb.c cVar;
        int i19;
        int i20;
        int i21;
        Paint paint;
        int i22;
        Bitmap bitmap2;
        char c3;
        Canvas canvas;
        boolean z12;
        boolean z13;
        float f11;
        Canvas canvas2;
        Paint paint2;
        byte[][] bArr;
        int i23;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        char c10;
        int i24;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        tb.b bVar = tb.b.b;
        if (map != null) {
            ob.b bVar2 = ob.b.a;
            if (map.containsKey(bVar2)) {
                bVar = tb.b.valueOf(map.get(bVar2).toString());
            }
            ob.b bVar3 = ob.b.c;
            if (map.containsKey(bVar3)) {
                i14 = Integer.parseInt(map.get(bVar3).toString());
                Charset charset = vb.c.b;
                if (map != null) {
                    ob.b bVar4 = ob.b.h;
                    if (map.containsKey(bVar4) && Boolean.parseBoolean(map.get(bVar4).toString())) {
                        z4 = true;
                        if (map != null) {
                            ob.b bVar5 = ob.b.f;
                            if (map.containsKey(bVar5) && Boolean.parseBoolean(map.get(bVar5).toString())) {
                                z10 = true;
                                ob.b bVar6 = ob.b.b;
                                z11 = map == null && map.containsKey(bVar6);
                                if (z11) {
                                    try {
                                        forName = Charset.forName(map.get(bVar6).toString());
                                    } catch (UnsupportedCharsetException unused) {
                                    }
                                    int i25 = i14;
                                    if (!z10) {
                                        Charset charset2 = pb.h.b;
                                        tb.d dVar2 = tb.d.h;
                                        if (charset2 != null && charset2.equals(forName) && vb.c.b(str)) {
                                            dVar = tb.d.r;
                                        } else {
                                            boolean z18 = false;
                                            boolean z19 = false;
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 < str.length()) {
                                                    char charAt = str.charAt(i26);
                                                    if (charAt < '0' || charAt > '9') {
                                                        if ((charAt < '`' ? vb.c.a[charAt] : -1) == -1) {
                                                            break;
                                                        }
                                                        z18 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    i26++;
                                                } else if (z18) {
                                                    dVar = tb.d.e;
                                                } else if (z19) {
                                                    dVar = tb.d.d;
                                                }
                                            }
                                            dVar = dVar2;
                                        }
                                        pb.a aVar2 = new pb.a();
                                        if (dVar == dVar2 && z11 && (cVar = (pb.c) pb.c.d.get(forName.name())) != null) {
                                            i15 = 4;
                                            aVar2.b(7, 4);
                                            aVar2.b(cVar.a[0], 8);
                                        } else {
                                            i15 = 4;
                                        }
                                        if (z4) {
                                            aVar2.b(5, i15);
                                        }
                                        aVar2.b(dVar.b, i15);
                                        pb.a aVar3 = new pb.a();
                                        vb.c.a(str, dVar, aVar3, forName);
                                        if (map != null) {
                                            ob.b bVar7 = ob.b.d;
                                            if (map.containsKey(bVar7)) {
                                                eVar = tb.e.c(Integer.parseInt(map.get(bVar7).toString()));
                                                if (!vb.c.c(dVar.a(eVar) + aVar2.b + aVar3.b, eVar, bVar)) {
                                                    throw new b7.a("Data too big for requested version");
                                                }
                                                pb.a aVar4 = new pb.a();
                                                i16 = aVar2.b;
                                                aVar4.c(i16);
                                                for (i17 = 0; i17 < i16; i17++) {
                                                    aVar4.a(aVar2.d(i17));
                                                }
                                                e = dVar != dVar2 ? aVar3.e() : str.length();
                                                int a2 = dVar.a(eVar);
                                                i18 = 1 << a2;
                                                if (e < i18) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(e);
                                                    sb.append(" is bigger than ");
                                                    sb.append(i18 - 1);
                                                    throw new b7.a(sb.toString());
                                                }
                                                aVar4.b(e, a2);
                                                int i27 = aVar3.b;
                                                aVar4.c(aVar4.b + i27);
                                                for (int i28 = 0; i28 < i27; i28++) {
                                                    aVar4.a(aVar3.d(i28));
                                                }
                                                eVar2 = eVar;
                                                aVar = aVar4;
                                            }
                                        }
                                        int a10 = dVar.a(tb.e.c(1)) + aVar2.b + aVar3.b;
                                        int i29 = 1;
                                        while (i29 <= 40) {
                                            tb.e c11 = tb.e.c(i29);
                                            if (vb.c.c(a10, c11, bVar)) {
                                                int a11 = dVar.a(c11) + aVar2.b + aVar3.b;
                                                int i30 = 1;
                                                while (i30 <= 40) {
                                                    tb.e c12 = tb.e.c(i30);
                                                    if (vb.c.c(a11, c12, bVar)) {
                                                        eVar = c12;
                                                        pb.a aVar42 = new pb.a();
                                                        i16 = aVar2.b;
                                                        aVar42.c(i16);
                                                        while (i17 < i16) {
                                                        }
                                                        if (dVar != dVar2) {
                                                        }
                                                        int a22 = dVar.a(eVar);
                                                        i18 = 1 << a22;
                                                        if (e < i18) {
                                                        }
                                                    } else {
                                                        i30++;
                                                        bVar = bVar;
                                                    }
                                                }
                                                throw new b7.a("Data too big");
                                            }
                                            i29++;
                                            a10 = a10;
                                            bVar = bVar;
                                        }
                                        throw new b7.a("Data too big");
                                    }
                                    if (forName.equals(charset)) {
                                        forName = null;
                                    }
                                    cb.m mVar = new cb.m();
                                    mVar.b = str;
                                    mVar.a = z4;
                                    mVar.c = new pb.e(str, forName);
                                    mVar.d = bVar;
                                    tb.b bVar8 = (tb.b) mVar.d;
                                    tb.e[] eVarArr = {cb.m.m(1), cb.m.m(2), cb.m.m(3)};
                                    s5.m[] mVarArr = {mVar.h(eVarArr[0]), mVar.h(eVarArr[1]), mVar.h(eVarArr[2])};
                                    int i31 = 0;
                                    int i32 = -1;
                                    int i33 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i34 = 3; i31 < i34; i34 = 3) {
                                        s5.m mVar2 = mVarArr[i31];
                                        int k10 = mVar2.k((tb.e) mVar2.c);
                                        if (vb.c.c(k10, eVarArr[i31], bVar8) && k10 < i33) {
                                            i33 = k10;
                                            i32 = i31;
                                        }
                                        i31++;
                                    }
                                    if (i32 < 0) {
                                        throw new b7.a("Data too big for any version");
                                    }
                                    s5.m mVar3 = mVarArr[i32];
                                    aVar = new pb.a();
                                    ArrayList arrayList = (ArrayList) mVar3.b;
                                    int size = arrayList.size();
                                    int i35 = 0;
                                    while (i35 < size) {
                                        Object obj = arrayList.get(i35);
                                        int i36 = i35 + 1;
                                        vb.f fVar = (vb.f) obj;
                                        int i37 = fVar.c;
                                        s5.m mVar4 = fVar.e;
                                        cb.m mVar5 = (cb.m) mVar4.d;
                                        ArrayList arrayList2 = arrayList;
                                        tb.d dVar3 = fVar.a;
                                        int i38 = size;
                                        aVar.b(dVar3.b, 4);
                                        int i39 = fVar.d;
                                        if (i39 > 0) {
                                            aVar.b(fVar.a(), dVar3.a((tb.e) mVar4.c));
                                        }
                                        if (dVar3 == tb.d.n) {
                                            aVar.b(((pb.c) pb.c.d.get(((pb.e) mVar5.c).a[i37].charset().name())).a[0], 8);
                                        } else if (i39 > 0) {
                                            String str2 = (String) mVar5.b;
                                            int i40 = fVar.b;
                                            vb.c.a(str2.substring(i40, i39 + i40), dVar3, aVar, ((pb.e) mVar5.c).a[i37].charset());
                                        }
                                        arrayList = arrayList2;
                                        size = i38;
                                        i35 = i36;
                                    }
                                    eVar2 = (tb.e) mVar3.c;
                                    p2.w wVar = eVar2.c[bVar.ordinal()];
                                    int i41 = eVar2.d;
                                    int i42 = wVar.b;
                                    c5.e[] eVarArr2 = (c5.e[]) wVar.c;
                                    int i43 = 0;
                                    for (c5.e eVar3 : eVarArr2) {
                                        i43 += eVar3.a;
                                    }
                                    int i44 = i41 - (i43 * i42);
                                    i19 = i44 * 8;
                                    if (aVar.b > i19) {
                                        throw new b7.a("data bits cannot fit in the QR Code" + aVar.b + " > " + i19);
                                    }
                                    for (int i45 = 0; i45 < 4 && aVar.b < i19; i45++) {
                                        aVar.a(false);
                                    }
                                    boolean z20 = false;
                                    int i46 = aVar.b & 7;
                                    if (i46 > 0) {
                                        while (i46 < 8) {
                                            aVar.a(z20);
                                            i46++;
                                            z20 = false;
                                        }
                                    }
                                    int e6 = i44 - aVar.e();
                                    int i47 = 0;
                                    while (i47 < e6) {
                                        int i48 = e6;
                                        aVar.b((i47 & 1) == 0 ? 236 : 17, 8);
                                        i47++;
                                        e6 = i48;
                                    }
                                    if (aVar.b != i19) {
                                        throw new b7.a("Bits size does not equal capacity");
                                    }
                                    int i49 = 0;
                                    for (c5.e eVar4 : eVarArr2) {
                                        i49 += eVar4.a;
                                    }
                                    if (aVar.e() != i44) {
                                        throw new b7.a("Number of bits and data bytes does not match");
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
                                            throw new b7.a("Block ID too large");
                                        }
                                        int i54 = i41 % i49;
                                        int i55 = i49 - i54;
                                        int i56 = i41 / i49;
                                        int i57 = i44 / i49;
                                        int i58 = i57 + 1;
                                        int i59 = i56 - i57;
                                        int i60 = (i56 + 1) - i58;
                                        if (i59 != i60) {
                                            throw new b7.a("EC bytes mismatch");
                                        }
                                        if (i49 != i55 + i54) {
                                            throw new b7.a("RS blocks mismatch");
                                        }
                                        if (i41 != ((i58 + i60) * i54) + ((i57 + i59) * i55)) {
                                            throw new b7.a("Total bytes mismatch");
                                        }
                                        if (i51 < i55) {
                                            c10 = 0;
                                            iArr[0] = i57;
                                            iArr2[0] = i59;
                                        } else {
                                            c10 = 0;
                                            iArr[0] = i58;
                                            iArr2[0] = i60;
                                        }
                                        int i61 = iArr[c10];
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
                                        rb.a aVar5 = rb.a.h;
                                        ArrayList arrayList4 = new ArrayList();
                                        pb.a aVar6 = aVar;
                                        tb.b bVar9 = bVar;
                                        arrayList4.add(new rb.b(aVar5, new int[]{1}));
                                        if (i72 == 0) {
                                            throw new IllegalArgumentException("No error correction bytes");
                                        }
                                        int i76 = i75 - i72;
                                        if (i76 <= 0) {
                                            throw new IllegalArgumentException("No data bytes provided");
                                        }
                                        if (i72 >= arrayList4.size()) {
                                            rb.b bVar10 = (rb.b) kh.a2.i(1, arrayList4);
                                            int size2 = arrayList4.size();
                                            rb.b bVar11 = bVar10;
                                            while (size2 <= i72) {
                                                int i77 = size2;
                                                bVar11 = bVar11.g(new rb.b(aVar5, new int[]{1, aVar5.a[(i77 - 1) + aVar5.g]}));
                                                arrayList4.add(bVar11);
                                                size2 = i77 + 1;
                                                i41 = i41;
                                                eVar2 = eVar2;
                                            }
                                        }
                                        tb.e eVar5 = eVar2;
                                        int i78 = i41;
                                        rb.b bVar12 = (rb.b) arrayList4.get(i72);
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
                                                    iArr6[i81] = aVar5.c(iArr4[i81], 1);
                                                    i81++;
                                                    iArr4 = iArr4;
                                                }
                                                rb.b bVar13 = new rb.b(aVar5, iArr6);
                                                if (!aVar5.equals(bVar12.a)) {
                                                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                }
                                                if (bVar12.e()) {
                                                    throw new IllegalArgumentException("Divide by 0");
                                                }
                                                rb.b bVar14 = aVar5.c;
                                                int b10 = aVar5.b(bVar12.c(bVar12.d()));
                                                while (bVar13.d() >= bVar12.d() && !bVar13.e()) {
                                                    int d = bVar13.d() - bVar12.d();
                                                    int c13 = aVar5.c(bVar13.c(bVar13.d()), b10);
                                                    int i82 = b10;
                                                    rb.b h = bVar12.h(d, c13);
                                                    bVar14 = bVar14.a(aVar5.a(d, c13));
                                                    bVar13 = bVar13.a(h);
                                                    b10 = i82;
                                                }
                                                int[] iArr7 = new rb.b[]{bVar14, bVar13}[1].b;
                                                int length2 = i72 - iArr7.length;
                                                for (int i83 = 0; i83 < length2; i83++) {
                                                    iArr3[i24 + i83] = 0;
                                                }
                                                System.arraycopy(iArr7, 0, iArr3, i24 + length2, iArr7.length);
                                                byte[] bArr3 = new byte[i72];
                                                for (int i84 = 0; i84 < i72; i84++) {
                                                    bArr3[i84] = (byte) iArr3[i61 + i84];
                                                }
                                                arrayList3.add(new vb.a(bArr2, bArr3));
                                                i53 = Math.max(i53, i61);
                                                i50 = Math.max(i50, i72);
                                                i52 += iArr[0];
                                                i51 = i70 + 1;
                                                aVar = aVar6;
                                                i49 = i71;
                                                i41 = i78;
                                                bVar = bVar9;
                                                eVar2 = eVar5;
                                            }
                                        }
                                        i24 = i76;
                                        if (i72 >= 0) {
                                        }
                                    }
                                    tb.e eVar6 = eVar2;
                                    tb.b bVar15 = bVar;
                                    int i85 = i41;
                                    if (i44 != i52) {
                                        throw new b7.a("Data bytes does not match offset");
                                    }
                                    pb.a aVar7 = new pb.a();
                                    for (int i86 = 0; i86 < i53; i86++) {
                                        int size3 = arrayList3.size();
                                        int i87 = 0;
                                        while (i87 < size3) {
                                            Object obj2 = arrayList3.get(i87);
                                            i87++;
                                            byte[] bArr4 = ((vb.a) obj2).a;
                                            if (i86 < bArr4.length) {
                                                aVar7.b(bArr4[i86], 8);
                                            }
                                        }
                                    }
                                    for (int i88 = 0; i88 < i50; i88++) {
                                        int size4 = arrayList3.size();
                                        int i89 = 0;
                                        while (i89 < size4) {
                                            Object obj3 = arrayList3.get(i89);
                                            i89++;
                                            byte[] bArr5 = ((vb.a) obj3).b;
                                            if (i88 < bArr5.length) {
                                                aVar7.b(bArr5[i88], 8);
                                            }
                                        }
                                    }
                                    if (i85 != aVar7.e()) {
                                        StringBuilder m9 = kh.a2.m(i85, "Interleaving error: ", " and ");
                                        m9.append(aVar7.e());
                                        m9.append(" differ.");
                                        throw new b7.a(m9.toString());
                                    }
                                    int i90 = (eVar6.a * 4) + 17;
                                    vb.b bVar16 = new vb.b(i90, i90);
                                    if (map != null) {
                                        ob.b bVar17 = ob.b.e;
                                        if (map.containsKey(bVar17)) {
                                            i20 = Integer.parseInt(map.get(bVar17).toString());
                                        }
                                    }
                                    i20 = -1;
                                    int i91 = bVar16.c;
                                    int i92 = bVar16.b;
                                    int i93 = -1;
                                    if (i20 == -1) {
                                        int i94 = 0;
                                        int i95 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        while (i94 < 8) {
                                            tb.b bVar18 = bVar15;
                                            vb.d.b(aVar7, bVar18, eVar6, i94, bVar16);
                                            int a12 = vb.d.a(bVar16, false) + vb.d.a(bVar16, true);
                                            int i96 = 0;
                                            int i97 = 0;
                                            while (true) {
                                                int i98 = i91 - 1;
                                                bArr = bVar16.a;
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
                                                                z16 = true;
                                                                if (!z16) {
                                                                    int i109 = i106 + 7;
                                                                    int i110 = i106 + 11;
                                                                    if (i109 >= 0 && bArr8.length >= i110) {
                                                                        while (i109 < i110) {
                                                                            int i111 = i109;
                                                                            if (bArr8[i109] != 1) {
                                                                                i109 = i111 + 1;
                                                                            }
                                                                        }
                                                                        z17 = true;
                                                                    }
                                                                    z17 = false;
                                                                    break;
                                                                }
                                                                i104++;
                                                            }
                                                            z16 = false;
                                                            if (!z16) {
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
                                                                z14 = true;
                                                                if (!z14) {
                                                                    int i114 = i105 + 7;
                                                                    int i115 = i105 + 11;
                                                                    if (i114 >= 0 && bArr.length >= i115) {
                                                                        while (i114 < i115) {
                                                                            if (bArr[i114][i106] != 1) {
                                                                                i114++;
                                                                            }
                                                                        }
                                                                        z15 = true;
                                                                        if (!z15) {
                                                                        }
                                                                    }
                                                                    z15 = false;
                                                                    if (!z15) {
                                                                    }
                                                                }
                                                                i104++;
                                                            }
                                                            z14 = false;
                                                            if (!z14) {
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
                                            bVar15 = bVar18;
                                        }
                                        i20 = i93;
                                    }
                                    vb.d.b(aVar7, bVar15, eVar6, i20, bVar16);
                                    this.input = bVar16;
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
                                    float f12 = i126 / 4.65f;
                                    Canvas canvas4 = canvas3;
                                    float f13 = min;
                                    int round = Math.round(f12 / f13);
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
                                        c3 = 3;
                                        drawSideQuadsGradient(canvas4, paint, gradientDrawable, this.sideQuadSize, f13, 16, i127, f10, this.radii, i12, i13);
                                    } else {
                                        i21 = min;
                                        paint = paint3;
                                        i22 = i130;
                                        bitmap2 = createBitmap;
                                        c3 = 3;
                                    }
                                    boolean z21 = Color.alpha(i12) == 0;
                                    float f14 = (f13 / 2.0f) * f10;
                                    int i131 = 16;
                                    int i132 = 0;
                                    while (i132 < i91) {
                                        int i133 = 0;
                                        int i134 = 16;
                                        while (i133 < i92) {
                                            if (has(i133, i132)) {
                                                Arrays.fill(this.radii, f14);
                                                if (has(i133, i132 - 1)) {
                                                    float[] fArr = this.radii;
                                                    fArr[1] = 0.0f;
                                                    fArr[0] = 0.0f;
                                                    fArr[c3] = 0.0f;
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
                                                    fArr4[c3] = 0.0f;
                                                    fArr4[2] = 0.0f;
                                                    fArr4[5] = 0.0f;
                                                    fArr4[4] = 0.0f;
                                                }
                                                gradientDrawable.setColor(i13);
                                                gradientDrawable.setBounds(i134, i131, i134 + i21, i131 + i21);
                                                gradientDrawable.draw(canvas4);
                                                paint2 = paint;
                                                canvas2 = canvas4;
                                                f11 = f14;
                                            } else {
                                                Paint paint4 = paint;
                                                Arrays.fill(this.radii, 0.0f);
                                                int i135 = i133 - 1;
                                                int i136 = i132 - 1;
                                                if (has(i135, i136) && has(i135, i132) && has(i133, i136)) {
                                                    canvas = canvas4;
                                                    float[] fArr5 = this.radii;
                                                    fArr5[1] = f14;
                                                    fArr5[0] = f14;
                                                    z12 = true;
                                                } else {
                                                    canvas = canvas4;
                                                    z12 = false;
                                                }
                                                boolean z22 = z12;
                                                int i137 = i133 + 1;
                                                if (has(i137, i136) && has(i137, i132) && has(i133, i136)) {
                                                    float[] fArr6 = this.radii;
                                                    fArr6[c3] = f14;
                                                    fArr6[2] = f14;
                                                    z13 = true;
                                                } else {
                                                    z13 = z22;
                                                }
                                                f11 = f14;
                                                int i138 = i132 + 1;
                                                if (has(i135, i138) && has(i135, i132) && has(i133, i138)) {
                                                    float[] fArr7 = this.radii;
                                                    fArr7[7] = f11;
                                                    fArr7[6] = f11;
                                                    z13 = true;
                                                }
                                                if (has(i137, i138) && has(i137, i132) && has(i133, i138)) {
                                                    float[] fArr8 = this.radii;
                                                    fArr8[5] = f11;
                                                    fArr8[4] = f11;
                                                    z13 = true;
                                                }
                                                if (!z13 || z21) {
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
                                            f14 = f11;
                                        }
                                        i132++;
                                        i131 += i21;
                                        paint = paint;
                                    }
                                    Canvas canvas5 = canvas4;
                                    String readRes = AndroidUtilities.readRes(R.raw.qr_logo);
                                    int i141 = this.imageSize;
                                    Bitmap bitmap3 = SvgHelper.getBitmap(readRes, i141, i141, false);
                                    float f15 = i22;
                                    canvas5.drawBitmap(bitmap3, f15, f15, (Paint) null);
                                    bitmap3.recycle();
                                    canvas5.setBitmap(null);
                                    return bitmap2;
                                }
                                forName = charset;
                                int i252 = i14;
                                if (!z10) {
                                }
                                p2.w wVar2 = eVar2.c[bVar.ordinal()];
                                int i412 = eVar2.d;
                                int i422 = wVar2.b;
                                c5.e[] eVarArr22 = (c5.e[]) wVar2.c;
                                int i432 = 0;
                                while (r13 < r12) {
                                }
                                int i442 = i412 - (i432 * i422);
                                i19 = i442 * 8;
                                if (aVar.b > i19) {
                                }
                            }
                        }
                        z10 = false;
                        ob.b bVar62 = ob.b.b;
                        if (map == null) {
                        }
                        if (z11) {
                        }
                        forName = charset;
                        int i2522 = i14;
                        if (!z10) {
                        }
                        p2.w wVar22 = eVar2.c[bVar.ordinal()];
                        int i4122 = eVar2.d;
                        int i4222 = wVar22.b;
                        c5.e[] eVarArr222 = (c5.e[]) wVar22.c;
                        int i4322 = 0;
                        while (r13 < r12) {
                        }
                        int i4422 = i4122 - (i4322 * i4222);
                        i19 = i4422 * 8;
                        if (aVar.b > i19) {
                        }
                    }
                }
                z4 = false;
                if (map != null) {
                }
                z10 = false;
                ob.b bVar622 = ob.b.b;
                if (map == null) {
                }
                if (z11) {
                }
                forName = charset;
                int i25222 = i14;
                if (!z10) {
                }
                p2.w wVar222 = eVar2.c[bVar.ordinal()];
                int i41222 = eVar2.d;
                int i42222 = wVar222.b;
                c5.e[] eVarArr2222 = (c5.e[]) wVar222.c;
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
        Charset charset3 = vb.c.b;
        if (map != null) {
        }
        z4 = false;
        if (map != null) {
        }
        z10 = false;
        ob.b bVar6222 = ob.b.b;
        if (map == null) {
        }
        if (z11) {
        }
        forName = charset3;
        int i252222 = i14;
        if (!z10) {
        }
        p2.w wVar2222 = eVar2.c[bVar.ordinal()];
        int i412222 = eVar2.d;
        int i422222 = wVar2222.b;
        c5.e[] eVarArr22222 = (c5.e[]) wVar2222.c;
        int i432222 = 0;
        while (r13 < r12) {
        }
        int i442222 = i412222 - (i432222 * i422222);
        i19 = i442222 * 8;
        if (aVar.b > i19) {
        }
    }
}
