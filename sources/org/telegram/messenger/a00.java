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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a00 extends DefaultHandler {
    public final HashMap D;
    public boolean E;
    public boolean F;
    public StringBuilder G;
    public boolean H;
    public int I;
    public ArrayList J;
    public Canvas a;
    public Bitmap b;
    public final c00 c;
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

    public a00(int i10, int i11, Integer num, boolean z10) {
        this(i10, i11, num, z10, 1.0f, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(m5.e eVar, Integer num, boolean z10) {
        Float valueOf;
        Paint paint = this.h;
        Integer num2 = this.s;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        } else {
            paint.setColor((num.intValue() & 16777215) | (-16777216));
        }
        String P = eVar.P("opacity");
        Float f7 = null;
        if (P != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(P));
            } catch (NumberFormatException unused) {
            }
            if (valueOf == null) {
                String P2 = eVar.P(z10 ? "fill-opacity" : "stroke-opacity");
                if (P2 != null) {
                    try {
                        f7 = Float.valueOf(Float.parseFloat(P2));
                    } catch (NumberFormatException unused2) {
                    }
                }
                valueOf = f7;
            }
            if (valueOf != null) {
                paint.setAlpha(zs.e4);
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

    public final boolean b(m5.e eVar) {
        if (!"none".equals(eVar.P("display"))) {
            String P = eVar.P("fill");
            if (P != null && P.startsWith("url(#")) {
                P.substring(5, P.length() - 1);
                return false;
            }
            Integer Q = eVar.Q("fill");
            Paint paint = this.h;
            if (Q != null) {
                a(eVar, Q, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (eVar.P("fill") == null && eVar.P("stroke") == null) {
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
    public final boolean c(m5.e eVar) {
        Integer Q;
        Float valueOf;
        String P;
        String P2;
        if ("none".equals(eVar.P("display")) || (Q = eVar.Q("stroke")) == null) {
            return false;
        }
        a(eVar, Q, false);
        String P3 = eVar.P("stroke-width");
        if (P3 != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(P3));
            } catch (NumberFormatException unused) {
            }
            Paint paint = this.h;
            if (valueOf != null) {
                paint.setStrokeWidth(valueOf.floatValue());
            }
            P = eVar.P("stroke-linecap");
            if (!"round".equals(P)) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(P)) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(P)) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            P2 = eVar.P("stroke-linejoin");
            if (!"miter".equals(P2)) {
                paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(P2)) {
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(P2)) {
                paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            paint.setStyle(Paint.Style.STROKE);
            return true;
        }
        valueOf = null;
        Paint paint2 = this.h;
        if (valueOf != null) {
        }
        P = eVar.P("stroke-linecap");
        if (!"round".equals(P)) {
        }
        P2 = eVar.P("stroke-linejoin");
        if (!"miter".equals(P2)) {
        }
        paint2.setStyle(Paint.Style.STROKE);
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i10, int i11) {
        StringBuilder sb2 = this.G;
        if (sb2 != null) {
            sb2.append(cArr, i10, i11);
        }
    }

    public final Bitmap d() {
        return this.b;
    }

    public final ArrayList e() {
        return this.J;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.H) {
            int i10 = this.I - 1;
            this.I = i10;
            if (i10 == 0) {
                this.H = false;
            }
            return;
        }
        str2.getClass();
        switch (str2) {
            case "g":
            case "defs":
            case "clipPath":
                this.F = false;
                break;
            case "style":
                StringBuilder sb2 = this.G;
                if (sb2 != null) {
                    String[] split = sb2.toString().split("\\}");
                    for (int i11 = 0; i11 < split.length; i11++) {
                        String replace = split[i11].trim().replace("\t", "").replace("\n", "");
                        split[i11] = replace;
                        if (replace.length() != 0 && split[i11].charAt(0) == '.' && (indexOf = split[i11].indexOf(zs.H1)) >= 0) {
                            this.D.put(split[i11].substring(1, indexOf).trim(), new b00(split[i11].substring(indexOf + 1)));
                        }
                    }
                    this.G = null;
                    break;
                }
                break;
        }
    }

    public final void f() {
        if (this.y) {
            c00 c00Var = this.c;
            if (c00Var != null) {
                c00Var.a.add(null);
            } else {
                this.a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        String l4 = d00.l("transform", attributes);
        boolean z10 = l4 != null;
        this.y = z10;
        if (z10) {
            Matrix o10 = d00.o(l4);
            c00 c00Var = this.c;
            if (c00Var != null) {
                c00Var.a.add(o10);
            } else {
                this.a.save();
                this.a.concat(o10);
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
        wf.c cVar;
        c5.k kVar;
        String l4;
        Paint paint;
        char c10;
        Float valueOf = Float.valueOf(0.0f);
        if (!"g".equals(str3) || this.H) {
            if (this.H) {
                this.I++;
                if ("rect".equals(str3)) {
                    float f7 = this.f;
                    try {
                        float parseFloat = Float.parseFloat(attributes.getValue("x"));
                        float parseFloat2 = Float.parseFloat(attributes.getValue("y"));
                        RectF rectF = new RectF(parseFloat, parseFloat2, Float.parseFloat(attributes.getValue("width")) + parseFloat, Float.parseFloat(attributes.getValue("height")) + parseFloat2);
                        Matrix o10 = d00.o(attributes.getValue("transform"));
                        o10.postScale(f7, f7);
                        cVar = new wf.c(rectF, o10);
                    } catch (Exception e) {
                        f8.g(e, true);
                        cVar = null;
                    }
                    if (cVar != null) {
                        if (this.J == null) {
                            this.J = new ArrayList();
                        }
                        this.J.add(cVar);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if ("GiftPatterns".equals(attributes.getValue("id"))) {
            this.H = true;
            this.I = 1;
        }
        if (!this.F || str2.equals("style")) {
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
                case zs.o1 /* 103 */:
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
            HashMap hashMap = this.D;
            c00 c00Var = this.c;
            Paint paint2 = this.h;
            switch (c11) {
                case 0:
                    Float k10 = d00.k("cx", attributes);
                    Float k11 = d00.k("cy", attributes);
                    Float k12 = d00.k("rx", attributes);
                    Float k13 = d00.k("ry", attributes);
                    if (k10 != null && k11 != null && k12 != null && k13 != null) {
                        g(attributes);
                        m5.e eVar = new m5.e(attributes, hashMap);
                        float floatValue = k10.floatValue() - k12.floatValue();
                        float floatValue2 = k11.floatValue() - k13.floatValue();
                        float floatValue3 = k12.floatValue() + k10.floatValue();
                        float floatValue4 = k13.floatValue() + k11.floatValue();
                        RectF rectF2 = this.n;
                        rectF2.set(floatValue, floatValue2, floatValue3, floatValue4);
                        if (b(eVar)) {
                            if (c00Var != null) {
                                c00.a(c00Var, new xz(rectF2), paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        if (c(eVar)) {
                            if (c00Var != null) {
                                c00.a(c00Var, new xz(rectF2), paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 1:
                    Float k14 = d00.k("cx", attributes);
                    Float k15 = d00.k("cy", attributes);
                    Float k16 = d00.k("r", attributes);
                    if (k14 != null && k15 != null && k16 != null) {
                        g(attributes);
                        m5.e eVar2 = new m5.e(attributes, hashMap);
                        if (b(eVar2)) {
                            if (c00Var != null) {
                                c00.a(c00Var, new vz(k14.floatValue(), k15.floatValue(), k16.floatValue()), paint2);
                            } else {
                                this.a.drawCircle(k14.floatValue(), k15.floatValue(), k16.floatValue(), paint2);
                            }
                        }
                        if (c(eVar2)) {
                            if (c00Var != null) {
                                c00.a(c00Var, new vz(k14.floatValue(), k15.floatValue(), k16.floatValue()), paint2);
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
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            kVar = null;
                        } else if (attributes.getLocalName(i10).equals("points")) {
                            kVar = d00.n(attributes.getValue(i10));
                        } else {
                            i10++;
                        }
                    }
                    if (kVar != null) {
                        Path path = new Path();
                        ArrayList arrayList = kVar.a;
                        if (arrayList.size() > 1) {
                            g(attributes);
                            m5.e eVar3 = new m5.e(attributes, hashMap);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            for (int i11 = 2; i11 < arrayList.size(); i11 += 2) {
                                path.lineTo(((Float) arrayList.get(i11)).floatValue(), ((Float) arrayList.get(i11 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (b(eVar3)) {
                                if (c00Var != null) {
                                    c00.a(c00Var, path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            if (c(eVar3)) {
                                if (c00Var != null) {
                                    c00.a(c00Var, path, paint2);
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
                    if ("bounds".equalsIgnoreCase(d00.l("id", attributes))) {
                        this.F = true;
                        break;
                    }
                    break;
                case 4:
                    Float k17 = d00.k("width", attributes);
                    Float k18 = d00.k("height", attributes);
                    if ((k17 == null || k18 == null) && (l4 = d00.l("viewBox", attributes)) != null) {
                        String[] split = l4.split(" ");
                        Float valueOf2 = Float.valueOf(Float.parseFloat(split[2]));
                        k18 = Float.valueOf(Float.parseFloat(split[3]));
                        k17 = valueOf2;
                    }
                    int i12 = this.e;
                    int i13 = this.d;
                    if (k17 == null || k18 == null) {
                        k17 = Float.valueOf(i13);
                        k18 = Float.valueOf(i12);
                    }
                    int ceil = (int) Math.ceil(k17.floatValue());
                    int ceil2 = (int) Math.ceil(k18.floatValue());
                    if (ceil != 0 && ceil2 != 0) {
                        if (i13 == 0 || i12 == 0) {
                            i13 = ceil;
                            i12 = ceil2;
                        } else {
                            if (this.x == 2) {
                                this.f = i13 / ceil;
                            } else {
                                this.f = Math.min(i13 / ceil, i12 / ceil2);
                            }
                            float f10 = this.f;
                            i13 = (int) (ceil * f10);
                            i12 = (int) (ceil2 * f10);
                        }
                    }
                    if (c00Var == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(i13, i12, this.E ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                        this.b = createBitmap;
                        createBitmap.eraseColor(0);
                        Canvas canvas = new Canvas(this.b);
                        this.a = canvas;
                        float f11 = this.f;
                        if (f11 != 0.0f) {
                            float f12 = this.w * f11;
                            canvas.scale(f12, f12);
                            break;
                        }
                    } else {
                        c00Var.e = i13;
                        c00Var.f = i12;
                        break;
                    }
                    break;
                case 5:
                case 11:
                    this.F = true;
                    break;
                case 6:
                    Float k19 = d00.k("x1", attributes);
                    Float k20 = d00.k("x2", attributes);
                    Float k21 = d00.k("y1", attributes);
                    Float k22 = d00.k("y2", attributes);
                    if (c(new m5.e(attributes, hashMap))) {
                        g(attributes);
                        if (c00Var != null) {
                            float floatValue5 = k19.floatValue();
                            float floatValue6 = k21.floatValue();
                            float floatValue7 = k20.floatValue();
                            float floatValue8 = k22.floatValue();
                            wz wzVar = new wz();
                            wzVar.a = floatValue5;
                            wzVar.b = floatValue6;
                            wzVar.c = floatValue7;
                            wzVar.d = floatValue8;
                            c00.a(c00Var, wzVar, paint2);
                        } else {
                            this.a.drawLine(k19.floatValue(), k21.floatValue(), k20.floatValue(), k22.floatValue(), paint2);
                        }
                        f();
                        break;
                    }
                    break;
                case 7:
                    Path b10 = d00.b(d00.l("d", attributes));
                    g(attributes);
                    m5.e eVar4 = new m5.e(attributes, hashMap);
                    if (b(eVar4)) {
                        if (c00Var != null) {
                            c00.a(c00Var, b10, paint2);
                        } else {
                            this.a.drawPath(b10, paint2);
                        }
                    }
                    if (c(eVar4)) {
                        if (c00Var != null) {
                            c00.a(c00Var, b10, paint2);
                        } else {
                            this.a.drawPath(b10, paint2);
                        }
                    }
                    f();
                    break;
                case '\b':
                    Float k23 = d00.k("x", attributes);
                    if (k23 == null) {
                        k23 = valueOf;
                    }
                    Float k24 = d00.k("y", attributes);
                    if (k24 != null) {
                        valueOf = k24;
                    }
                    Float k25 = d00.k("width", attributes);
                    Float k26 = d00.k("height", attributes);
                    Float k27 = d00.k("rx", attributes);
                    g(attributes);
                    m5.e eVar5 = new m5.e(attributes, hashMap);
                    boolean b11 = b(eVar5);
                    RectF rectF3 = this.r;
                    if (b11) {
                        if (c00Var == null) {
                            if (k27 == null) {
                                this.a.drawRect(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue(), paint2);
                                paint = paint2;
                                if (c(eVar5)) {
                                    if (c00Var != null) {
                                        if (k27 != null) {
                                            c00.a(c00Var, new zz(new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), k27.floatValue()), paint);
                                        } else {
                                            c00.a(c00Var, new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), paint);
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
                            c00.a(c00Var, new zz(new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), k27.floatValue()), paint2);
                        } else {
                            c00.a(c00Var, new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), paint2);
                        }
                    }
                    paint = paint2;
                    if (c(eVar5)) {
                    }
                    f();
                case '\t':
                    this.G = new StringBuilder();
                    break;
            }
        }
    }

    public a00(int i10, int i11, Integer num, boolean z10, float f7, int i12) {
        this.f = 1.0f;
        this.h = new Paint(1);
        this.n = new RectF();
        this.r = new RectF();
        this.w = 1.0f;
        this.y = false;
        this.D = new HashMap();
        this.H = false;
        this.I = 0;
        this.w = f7;
        this.d = i10;
        this.e = i11;
        this.s = num;
        this.x = i12;
        if (z10) {
            this.c = new c00();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }
}
