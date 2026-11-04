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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class hz extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas a;
    public Bitmap b;
    public final jz c;
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

    public hz(int i3, int i10, Integer num, boolean z10) {
        this(i3, i10, num, z10, 1.0f, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mi.h0 h0Var, Integer num, boolean z10) {
        Float valueOf;
        Paint paint = this.h;
        Integer num2 = this.s;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        } else {
            paint.setColor((num.intValue() & 16777215) | (-16777216));
        }
        String E = h0Var.E("opacity");
        Float f10 = null;
        if (E != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(E));
            } catch (NumberFormatException unused) {
            }
            if (valueOf == null) {
                String E2 = h0Var.E(z10 ? "fill-opacity" : "stroke-opacity");
                if (E2 != null) {
                    try {
                        f10 = Float.valueOf(Float.parseFloat(E2));
                    } catch (NumberFormatException unused2) {
                    }
                }
                valueOf = f10;
            }
            if (valueOf != null) {
                paint.setAlpha(hs.e4);
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

    public final boolean b(mi.h0 h0Var) {
        if (!"none".equals(h0Var.E("display"))) {
            String E = h0Var.E("fill");
            if (E != null && E.startsWith("url(#")) {
                E.substring(5, E.length() - 1);
                return false;
            }
            Integer G = h0Var.G("fill");
            Paint paint = this.h;
            if (G != null) {
                a(h0Var, G, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (h0Var.E("fill") == null && h0Var.E("stroke") == null) {
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
    public final boolean c(mi.h0 h0Var) {
        Integer G;
        Float valueOf;
        String E;
        String E2;
        if ("none".equals(h0Var.E("display")) || (G = h0Var.G("stroke")) == null) {
            return false;
        }
        a(h0Var, G, false);
        String E3 = h0Var.E("stroke-width");
        if (E3 != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(E3));
            } catch (NumberFormatException unused) {
            }
            Paint paint = this.h;
            if (valueOf != null) {
                paint.setStrokeWidth(valueOf.floatValue());
            }
            E = h0Var.E("stroke-linecap");
            if (!"round".equals(E)) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(E)) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(E)) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            E2 = h0Var.E("stroke-linejoin");
            if (!"miter".equals(E2)) {
                paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(E2)) {
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(E2)) {
                paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            paint.setStyle(Paint.Style.STROKE);
            return true;
        }
        valueOf = null;
        Paint paint2 = this.h;
        if (valueOf != null) {
        }
        E = h0Var.E("stroke-linecap");
        if (!"round".equals(E)) {
        }
        E2 = h0Var.E("stroke-linejoin");
        if (!"miter".equals(E2)) {
        }
        paint2.setStyle(Paint.Style.STROKE);
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i3, int i10) {
        StringBuilder sb2 = this.H;
        if (sb2 != null) {
            sb2.append(cArr, i3, i10);
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
            int i3 = this.J - 1;
            this.J = i3;
            if (i3 == 0) {
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
                        if (replace.length() != 0 && split[i10].charAt(0) == '.' && (indexOf = split[i10].indexOf(hs.H1)) >= 0) {
                            this.E.put(split[i10].substring(1, indexOf).trim(), new iz(split[i10].substring(indexOf + 1)));
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
            jz jzVar = this.c;
            if (jzVar != null) {
                jzVar.a.add(null);
            } else {
                this.a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        String l10 = kz.l("transform", attributes);
        boolean z10 = l10 != null;
        this.y = z10;
        if (z10) {
            Matrix o10 = kz.o(l10);
            jz jzVar = this.c;
            if (jzVar != null) {
                jzVar.a.add(o10);
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
        hg.c cVar;
        mi.z3 z3Var;
        String l10;
        Paint paint;
        char c2;
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
                        Matrix o10 = kz.o(attributes.getValue("transform"));
                        o10.postScale(f10, f10);
                        cVar = new hg.c(rectF, o10);
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
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1656480802:
                    if (str2.equals("ellipse")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1360216880:
                    if (str2.equals("circle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -397519558:
                    if (str2.equals("polygon")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case hs.o1 /* 103 */:
                    if (str2.equals("g")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 114276:
                    if (str2.equals("svg")) {
                        c2 = 4;
                        c10 = c2;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c2 = 5;
                        c10 = c2;
                        break;
                    }
                    break;
                case 3321844:
                    if (str2.equals("line")) {
                        c2 = 6;
                        c10 = c2;
                        break;
                    }
                    break;
                case 3433509:
                    if (str2.equals("path")) {
                        c2 = 7;
                        c10 = c2;
                        break;
                    }
                    break;
                case 3496420:
                    if (str2.equals("rect")) {
                        c2 = '\b';
                        c10 = c2;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c2 = '\t';
                        c10 = c2;
                        break;
                    }
                    break;
                case 561938880:
                    if (str2.equals("polyline")) {
                        c2 = '\n';
                        c10 = c2;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c2 = 11;
                        c10 = c2;
                        break;
                    }
                    break;
            }
            HashMap hashMap = this.E;
            jz jzVar = this.c;
            Paint paint2 = this.h;
            switch (c10) {
                case 0:
                    Float k10 = kz.k("cx", attributes);
                    Float k11 = kz.k("cy", attributes);
                    Float k12 = kz.k("rx", attributes);
                    Float k13 = kz.k("ry", attributes);
                    if (k10 != null && k11 != null && k12 != null && k13 != null) {
                        g(attributes);
                        mi.h0 h0Var = new mi.h0(attributes, hashMap);
                        float floatValue = k10.floatValue() - k12.floatValue();
                        float floatValue2 = k11.floatValue() - k13.floatValue();
                        float floatValue3 = k12.floatValue() + k10.floatValue();
                        float floatValue4 = k13.floatValue() + k11.floatValue();
                        RectF rectF2 = this.n;
                        rectF2.set(floatValue, floatValue2, floatValue3, floatValue4);
                        if (b(h0Var)) {
                            if (jzVar != null) {
                                jz.a(jzVar, new ez(rectF2), paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        if (c(h0Var)) {
                            if (jzVar != null) {
                                jz.a(jzVar, new ez(rectF2), paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 1:
                    Float k14 = kz.k("cx", attributes);
                    Float k15 = kz.k("cy", attributes);
                    Float k16 = kz.k("r", attributes);
                    if (k14 != null && k15 != null && k16 != null) {
                        g(attributes);
                        mi.h0 h0Var2 = new mi.h0(attributes, hashMap);
                        if (b(h0Var2)) {
                            if (jzVar != null) {
                                jz.a(jzVar, new cz(k14.floatValue(), k15.floatValue(), k16.floatValue()), paint2);
                            } else {
                                this.a.drawCircle(k14.floatValue(), k15.floatValue(), k16.floatValue(), paint2);
                            }
                        }
                        if (c(h0Var2)) {
                            if (jzVar != null) {
                                jz.a(jzVar, new cz(k14.floatValue(), k15.floatValue(), k16.floatValue()), paint2);
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
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z3Var = null;
                        } else if (attributes.getLocalName(i3).equals("points")) {
                            z3Var = kz.n(attributes.getValue(i3));
                        } else {
                            i3++;
                        }
                    }
                    if (z3Var != null) {
                        Path path = new Path();
                        ArrayList arrayList = z3Var.a;
                        if (arrayList.size() > 1) {
                            g(attributes);
                            mi.h0 h0Var3 = new mi.h0(attributes, hashMap);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            for (int i10 = 2; i10 < arrayList.size(); i10 += 2) {
                                path.lineTo(((Float) arrayList.get(i10)).floatValue(), ((Float) arrayList.get(i10 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (b(h0Var3)) {
                                if (jzVar != null) {
                                    jz.a(jzVar, path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            if (c(h0Var3)) {
                                if (jzVar != null) {
                                    jz.a(jzVar, path, paint2);
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
                    if ("bounds".equalsIgnoreCase(kz.l("id", attributes))) {
                        this.G = true;
                        break;
                    }
                    break;
                case 4:
                    Float k17 = kz.k("width", attributes);
                    Float k18 = kz.k("height", attributes);
                    if ((k17 == null || k18 == null) && (l10 = kz.l("viewBox", attributes)) != null) {
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
                    if (jzVar == null) {
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
                        jzVar.e = i12;
                        jzVar.f = i11;
                        break;
                    }
                    break;
                case 5:
                case 11:
                    this.G = true;
                    break;
                case 6:
                    Float k19 = kz.k("x1", attributes);
                    Float k20 = kz.k("x2", attributes);
                    Float k21 = kz.k("y1", attributes);
                    Float k22 = kz.k("y2", attributes);
                    if (c(new mi.h0(attributes, hashMap))) {
                        g(attributes);
                        if (jzVar != null) {
                            float floatValue5 = k19.floatValue();
                            float floatValue6 = k21.floatValue();
                            float floatValue7 = k20.floatValue();
                            float floatValue8 = k22.floatValue();
                            dz dzVar = new dz();
                            dzVar.a = floatValue5;
                            dzVar.b = floatValue6;
                            dzVar.c = floatValue7;
                            dzVar.d = floatValue8;
                            jz.a(jzVar, dzVar, paint2);
                        } else {
                            this.a.drawLine(k19.floatValue(), k21.floatValue(), k20.floatValue(), k22.floatValue(), paint2);
                        }
                        f();
                        break;
                    }
                    break;
                case 7:
                    Path b10 = kz.b(kz.l("d", attributes));
                    g(attributes);
                    mi.h0 h0Var4 = new mi.h0(attributes, hashMap);
                    if (b(h0Var4)) {
                        if (jzVar != null) {
                            jz.a(jzVar, b10, paint2);
                        } else {
                            this.a.drawPath(b10, paint2);
                        }
                    }
                    if (c(h0Var4)) {
                        if (jzVar != null) {
                            jz.a(jzVar, b10, paint2);
                        } else {
                            this.a.drawPath(b10, paint2);
                        }
                    }
                    f();
                    break;
                case '\b':
                    Float k23 = kz.k("x", attributes);
                    if (k23 == null) {
                        k23 = valueOf;
                    }
                    Float k24 = kz.k("y", attributes);
                    if (k24 != null) {
                        valueOf = k24;
                    }
                    Float k25 = kz.k("width", attributes);
                    Float k26 = kz.k("height", attributes);
                    Float k27 = kz.k("rx", attributes);
                    g(attributes);
                    mi.h0 h0Var5 = new mi.h0(attributes, hashMap);
                    boolean b11 = b(h0Var5);
                    RectF rectF3 = this.r;
                    if (b11) {
                        if (jzVar == null) {
                            if (k27 == null) {
                                this.a.drawRect(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue(), paint2);
                                paint = paint2;
                                if (c(h0Var5)) {
                                    if (jzVar != null) {
                                        if (k27 != null) {
                                            jz.a(jzVar, new gz(new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), k27.floatValue()), paint);
                                        } else {
                                            jz.a(jzVar, new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), paint);
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
                            jz.a(jzVar, new gz(new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), k27.floatValue()), paint2);
                        } else {
                            jz.a(jzVar, new RectF(k23.floatValue(), valueOf.floatValue(), k25.floatValue() + k23.floatValue(), k26.floatValue() + valueOf.floatValue()), paint2);
                        }
                    }
                    paint = paint2;
                    if (c(h0Var5)) {
                    }
                    f();
                case '\t':
                    this.H = new StringBuilder();
                    break;
            }
        }
    }

    public hz(int i3, int i10, Integer num, boolean z10, float f10, int i11) {
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
        this.d = i3;
        this.e = i10;
        this.s = num;
        this.x = i11;
        if (z10) {
            this.c = new jz();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }
}
