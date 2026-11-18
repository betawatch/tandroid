package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class jz extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas a;
    public Bitmap b;
    public final lz c;
    public final int d;
    public final int e;
    public float f;
    public final Paint h;
    public final RectF n;
    public final RectF r;
    public final Integer s;
    public final float w;
    public final int x;
    public boolean y;

    public jz(int i7, int i10, Integer num, boolean z10) {
        this(i7, i10, num, z10, 1.0f, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ji.j jVar, Integer num, boolean z10) {
        Float valueOf;
        Paint paint = this.h;
        Integer num2 = this.s;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        } else {
            paint.setColor((num.intValue() & 16777215) | (-16777216));
        }
        String L = jVar.L("opacity");
        Float f10 = null;
        if (L != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(L));
            } catch (NumberFormatException unused) {
            }
            if (valueOf == null) {
                String L2 = jVar.L(z10 ? "fill-opacity" : "stroke-opacity");
                if (L2 != null) {
                    try {
                        f10 = Float.valueOf(Float.parseFloat(L2));
                    } catch (NumberFormatException unused2) {
                    }
                }
                valueOf = f10;
            }
            if (valueOf != null) {
                paint.setAlpha(ks.e4);
                return;
            } else {
                paint.setAlpha((int) (valueOf.floatValue() * 255.0f));
                return;
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
        if (valueOf != null) {
        }
    }

    public final boolean b(ji.j jVar) {
        if (!"none".equals(jVar.L("display"))) {
            String L = jVar.L("fill");
            if (L != null && L.startsWith("url(#")) {
                L.substring(5, L.length() - 1);
                return false;
            }
            Integer N = jVar.N("fill");
            Paint paint = this.h;
            if (N != null) {
                a(jVar, N, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (jVar.L("fill") == null && jVar.L("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.s;
                if (num != null) {
                    paint.setColor(num.intValue());
                    return true;
                }
                paint.setColor(-16777216);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(ji.j jVar) {
        Integer N;
        Float valueOf;
        String L;
        String L2;
        if ("none".equals(jVar.L("display")) || (N = jVar.N("stroke")) == null) {
            return false;
        }
        a(jVar, N, false);
        String L3 = jVar.L("stroke-width");
        if (L3 != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(L3));
            } catch (NumberFormatException unused) {
            }
            Paint paint = this.h;
            if (valueOf != null) {
                paint.setStrokeWidth(valueOf.floatValue());
            }
            L = jVar.L("stroke-linecap");
            if (!"round".equals(L)) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(L)) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(L)) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            L2 = jVar.L("stroke-linejoin");
            if (!"miter".equals(L2)) {
                paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(L2)) {
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(L2)) {
                paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            paint.setStyle(Paint.Style.STROKE);
            return true;
        }
        valueOf = null;
        Paint paint2 = this.h;
        if (valueOf != null) {
        }
        L = jVar.L("stroke-linecap");
        if (!"round".equals(L)) {
        }
        L2 = jVar.L("stroke-linejoin");
        if (!"miter".equals(L2)) {
        }
        paint2.setStyle(Paint.Style.STROKE);
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i7, int i10) {
        StringBuilder sb2 = this.H;
        if (sb2 != null) {
            sb2.append(cArr, i7, i10);
        }
    }

    public final Bitmap d() {
        return this.b;
    }

    public final ArrayList e() {
        return this.K;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.I) {
            int i7 = this.J - 1;
            this.J = i7;
            if (i7 == 0) {
                this.I = false;
            }
            return;
        }
        str2.getClass();
        switch (str2) {
            case "g":
            case "defs":
            case "clipPath":
                this.G = false;
                break;
            case "style":
                StringBuilder sb2 = this.H;
                if (sb2 != null) {
                    String[] split = sb2.toString().split("\\}");
                    for (int i10 = 0; i10 < split.length; i10++) {
                        String replace = split[i10].trim().replace("\t", "").replace("\n", "");
                        split[i10] = replace;
                        if (replace.length() != 0 && split[i10].charAt(0) == '.' && (indexOf = split[i10].indexOf(ks.H1)) >= 0) {
                            this.E.put(split[i10].substring(1, indexOf).trim(), new kz(split[i10].substring(indexOf + 1)));
                        }
                    }
                    this.H = null;
                    break;
                }
                break;
        }
    }

    public final void f() {
        if (this.y) {
            lz lzVar = this.c;
            if (lzVar != null) {
                lzVar.a.add(null);
            } else {
                this.a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        String l10 = mz.l("transform", attributes);
        boolean z10 = l10 != null;
        this.y = z10;
        if (z10) {
            Matrix o4 = mz.o(l10);
            lz lzVar = this.c;
            if (lzVar != null) {
                lzVar.a.add(o4);
            } else {
                this.a.save();
                this.a.concat(o4);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023d  */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        gg.c cVar;
        fz fzVar;
        String l10;
        Paint paint;
        char c10;
        Float valueOf = Float.valueOf(0.0f);
        if (!"g".equals(str3) || this.I) {
            if (this.I) {
                this.J++;
                if ("rect".equals(str3)) {
                    float f10 = this.f;
                    try {
                        float parseFloat = Float.parseFloat(attributes.getValue("x"));
                        float parseFloat2 = Float.parseFloat(attributes.getValue("y"));
                        RectF rectF = new RectF(parseFloat, parseFloat2, Float.parseFloat(attributes.getValue("width")) + parseFloat, Float.parseFloat(attributes.getValue("height")) + parseFloat2);
                        Matrix o4 = mz.o(attributes.getValue("transform"));
                        o4.postScale(f10, f10);
                        cVar = new gg.c(rectF, o4);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        cVar = null;
                    }
                    if (cVar != null) {
                        if (this.K == null) {
                            this.K = new ArrayList();
                        }
                        this.K.add(cVar);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if ("GiftPatterns".equals(attributes.getValue("id"))) {
            this.I = true;
            this.J = 1;
        }
        if (!this.G || str2.equals("style")) {
            str2.getClass();
            char c11 = 65535;
            switch (str2.hashCode()) {
                case -1656480802:
                    if (str2.equals("ellipse")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1360216880:
                    if (str2.equals("circle")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -397519558:
                    if (str2.equals("polygon")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case ks.o1 /* 103 */:
                    if (str2.equals("g")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 114276:
                    if (str2.equals("svg")) {
                        c10 = 4;
                        c11 = c10;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c10 = 5;
                        c11 = c10;
                        break;
                    }
                    break;
                case 3321844:
                    if (str2.equals("line")) {
                        c10 = 6;
                        c11 = c10;
                        break;
                    }
                    break;
                case 3433509:
                    if (str2.equals("path")) {
                        c10 = 7;
                        c11 = c10;
                        break;
                    }
                    break;
                case 3496420:
                    if (str2.equals("rect")) {
                        c10 = '\b';
                        c11 = c10;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c10 = '\t';
                        c11 = c10;
                        break;
                    }
                    break;
                case 561938880:
                    if (str2.equals("polyline")) {
                        c10 = '\n';
                        c11 = c10;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c10 = 11;
                        c11 = c10;
                        break;
                    }
                    break;
            }
            HashMap hashMap = this.E;
            lz lzVar = this.c;
            Paint paint2 = this.h;
            switch (c11) {
                case 0:
                    Float k10 = mz.k("cx", attributes);
                    Float k11 = mz.k("cy", attributes);
                    Float k12 = mz.k("rx", attributes);
                    Float k13 = mz.k("ry", attributes);
                    if (k10 != null && k11 != null && k12 != null && k13 != null) {
                        g(attributes);
                        ji.j jVar = new ji.j(attributes, hashMap);
                        float floatValue = k10.floatValue() - k12.floatValue();
                        float floatValue2 = k11.floatValue() - k13.floatValue();
                        float floatValue3 = k12.floatValue() + k10.floatValue();
                        float floatValue4 = k13.floatValue() + k11.floatValue();
                        RectF rectF2 = this.n;
                        rectF2.set(floatValue, floatValue2, floatValue3, floatValue4);
                        if (b(jVar)) {
                            if (lzVar != null) {
                                lz.a(lzVar, new gz(rectF2), paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        if (c(jVar)) {
                            if (lzVar != null) {
                                lz.a(lzVar, new gz(rectF2), paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 1:
                    Float k14 = mz.k("cx", attributes);
                    Float k15 = mz.k("cy", attributes);
                    Float k16 = mz.k("r", attributes);
                    if (k14 != null && k15 != null && k16 != null) {
                        g(attributes);
                        ji.j jVar2 = new ji.j(attributes, hashMap);
                        if (b(jVar2)) {
                            if (lzVar != null) {
                                lz.a(lzVar, new dz(k14.floatValue(), k15.floatValue(), k16.floatValue()), paint2);
                            } else {
                                this.a.drawCircle(k14.floatValue(), k15.floatValue(), k16.floatValue(), paint2);
                            }
                        }
                        if (c(jVar2)) {
                            if (lzVar != null) {
                                lz.a(lzVar, new dz(k14.floatValue(), k15.floatValue(), k16.floatValue()), paint2);
                            } else {
                                this.a.drawCircle(k14.floatValue(), k15.floatValue(), k16.floatValue(), paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 2:
                case '\n':
                    int length = attributes.getLength();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            fzVar = null;
                        } else if (attributes.getLocalName(i7).equals("points")) {
                            fzVar = mz.n(attributes.getValue(i7));
                        } else {
                            i7++;
                        }
                    }
                    if (fzVar != null) {
                        Path path = new Path();
                        ArrayList arrayList = fzVar.a;
                        if (arrayList.size() > 1) {
                            g(attributes);
                            ji.j jVar3 = new ji.j(attributes, hashMap);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            for (int i10 = 2; i10 < arrayList.size(); i10 += 2) {
                                path.lineTo(((Float) arrayList.get(i10)).floatValue(), ((Float) arrayList.get(i10 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (b(jVar3)) {
                                if (lzVar != null) {
                                    lz.a(lzVar, path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            if (c(jVar3)) {
                                if (lzVar != null) {
                                    lz.a(lzVar, path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            f();
                            break;
                        }
                    }
                    break;
                case 3:
                    if ("bounds".equalsIgnoreCase(mz.l("id", attributes))) {
                        this.G = true;
                        break;
                    }
                    break;
                case 4:
                    Float k17 = mz.k("width", attributes);
                    Float k18 = mz.k("height", attributes);
                    if ((k17 == null || k18 == null) && (l10 = mz.l("viewBox", attributes)) != null) {
                        String[] split = l10.split(" ");
                        Float valueOf2 = Float.valueOf(Float.parseFloat(split[2]));
                        k18 = Float.valueOf(Float.parseFloat(split[3]));
                        k17 = valueOf2;
                    }
                    int i11 = this.e;
                    int i12 = this.d;
                    if (k17 == null || k18 == null) {
                        k17 = Float.valueOf(i12);
                        k18 = Float.valueOf(i11);
                    }
                    int ceil = (int) Math.ceil(k17.floatValue());
                    int ceil2 = (int) Math.ceil(k18.floatValue());
                    if (ceil != 0 && ceil2 != 0) {
                        if (i12 == 0 || i11 == 0) {
                            i12 = ceil;
                            i11 = ceil2;
                        } else {
                            if (this.x == 2) {
                                this.f = i12 / ceil;
                            } else {
                                this.f = Math.min(i12 / ceil, i11 / ceil2);
                            }
                            float f11 = this.f;
                            i12 = (int) (ceil * f11);
                            i11 = (int) (ceil2 * f11);
                        }
                    }
                    if (lzVar == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(i12, i11, this.F ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                        this.b = createBitmap;
                        createBitmap.eraseColor(0);
                        Canvas canvas = new Canvas(this.b);
                        this.a = canvas;
                        float f12 = this.f;
                        if (f12 != 0.0f) {
                            float f13 = this.w * f12;
                            canvas.scale(f13, f13);
                            break;
                        }
                    } else {
                        lzVar.e = i12;
                        lzVar.f = i11;
                        break;
                    }
                    break;
                case 5:
                case 11:
                    this.G = true;
                    break;
                case 6:
                    Float k19 = mz.k("x1", attributes);
                    Float k20 = mz.k("x2", attributes);
                    Float k21 = mz.k("y1", attributes);
                    Float k22 = mz.k("y2", attributes);
                    if (c(new ji.j(attributes, hashMap))) {
                        g(attributes);
                        if (lzVar != null) {
                            float floatValue5 = k19.floatValue();
                            float floatValue6 = k21.floatValue();
                            float floatValue7 = k20.floatValue();
                            float floatValue8 = k22.floatValue();
                            ez ezVar = new ez();
                            ezVar.a = floatValue5;
                            ezVar.b = floatValue6;
                            ezVar.c = floatValue7;
                            ezVar.d = floatValue8;
                            lz.a(lzVar, ezVar, paint2);
                        } else {
                            this.a.drawLine(k19.floatValue(), k21.floatValue(), k20.floatValue(), k22.floatValue(), paint2);
                        }
                        f();
                        break;
                    }
                    break;
                case 7:
                    Path b10 = mz.b(mz.l("d", attributes));
                    g(attributes);
                    ji.j jVar4 = new ji.j(attributes, hashMap);
                    if (b(jVar4)) {
                        if (lzVar != null) {
                            lz.a(lzVar, b10, paint2);
                        } else {
                            this.a.drawPath(b10, paint2);
                        }
                    }
                    if (c(jVar4)) {
                        if (lzVar != null) {
                            lz.a(lzVar, b10, paint2);
                        } else {
                            this.a.drawPath(b10, paint2);
                        }
                    }
                    f();
                    break;
                case '\b':
                    Float k23 = mz.k("x", attributes);
                    if (k23 == null) {
                        k23 = valueOf;
                    }
                    Float k24 = mz.k("y", attributes);
                    if (k24 != null) {
                        valueOf = k24;
                    }
                    Float k25 = mz.k("width", attributes);
                    Float k26 = mz.k("height", attributes);
                    Float k27 = mz.k("rx", attributes);
                    g(attributes);
                    ji.j jVar5 = new ji.j(attributes, hashMap);
                    boolean b11 = b(jVar5);
                    RectF rectF3 = this.r;
                    if (b11) {
                        if (lzVar == null) {
                            if (k27 == null) {
                                this.a.drawRect(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue(), paint2);
                                paint = paint2;
                                if (c(jVar5)) {
                                    if (lzVar != null) {
                                        if (k27 != null) {
                                            lz.a(lzVar, new iz(new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), k27.floatValue()), paint);
                                        } else {
                                            lz.a(lzVar, new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), paint);
                                        }
                                    } else if (k27 != null) {
                                        rectF3.set(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue());
                                        this.a.drawRoundRect(rectF3, k27.floatValue(), k27.floatValue(), paint);
                                    } else {
                                        this.a.drawRect(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue(), paint);
                                    }
                                }
                                f();
                                break;
                            } else {
                                rectF3.set(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue());
                                this.a.drawRoundRect(rectF3, k27.floatValue(), k27.floatValue(), paint2);
                            }
                        } else if (k27 != null) {
                            lz.a(lzVar, new iz(new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), k27.floatValue()), paint2);
                        } else {
                            lz.a(lzVar, new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), paint2);
                        }
                    }
                    paint = paint2;
                    if (c(jVar5)) {
                    }
                    f();
                case '\t':
                    this.H = new StringBuilder();
                    break;
            }
        }
    }

    public jz(int i7, int i10, Integer num, boolean z10, float f10, int i11) {
        this.f = 1.0f;
        this.h = new Paint(1);
        this.n = new RectF();
        this.r = new RectF();
        this.w = 1.0f;
        this.y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.w = f10;
        this.d = i7;
        this.e = i10;
        this.s = num;
        this.x = i11;
        if (z10) {
            this.c = new lz();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }
}
