// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class egb extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas a;
    public Bitmap b;
    public final ggb c;
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

    public egb(int i, int i2, Integer num, boolean z, float f, int i3) {
        this.f = 1.0f;
        this.h = new Paint(1);
        this.n = new RectF();
        this.r = new RectF();
        this.w = 1.0f;
        this.y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.w = f;
        this.d = i;
        this.e = i2;
        this.s = num;
        this.x = i3;
        if (z) {
            this.c = new ggb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k7b k7bVar, Integer num, boolean z) {
        Float valueOf;
        Paint paint = this.h;
        Integer num2 = this.s;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        } else {
            paint.setColor((num.intValue() & 16777215) | (-16777216));
        }
        String m = k7bVar.m("opacity");
        Float f = null;
        if (m != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(m));
            } catch (NumberFormatException unused) {
            }
            if (valueOf == null) {
                String m2 = k7bVar.m(z ? "fill-opacity" : "stroke-opacity");
                if (m2 != null) {
                    try {
                        f = Float.valueOf(Float.parseFloat(m2));
                    } catch (NumberFormatException unused2) {
                    }
                }
                valueOf = f;
            }
            if (valueOf != null) {
                paint.setAlpha(jn7.d4);
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

    public final boolean b(k7b k7bVar) {
        if (!"none".equals(k7bVar.m("display"))) {
            String m = k7bVar.m("fill");
            if (m != null && m.startsWith("url(#")) {
                m.substring(5, m.length() - 1);
                return false;
            }
            Integer n = k7bVar.n("fill");
            Paint paint = this.h;
            if (n != null) {
                a(k7bVar, n, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (k7bVar.m("fill") == null && k7bVar.m("stroke") == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(k7b k7bVar) {
        Integer n;
        Float valueOf;
        String m;
        String m2;
        if ("none".equals(k7bVar.m("display")) || (n = k7bVar.n("stroke")) == null) {
            return false;
        }
        a(k7bVar, n, false);
        String m3 = k7bVar.m("stroke-width");
        if (m3 != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(m3));
            } catch (NumberFormatException unused) {
            }
            Paint paint = this.h;
            if (valueOf != null) {
                paint.setStrokeWidth(valueOf.floatValue());
            }
            m = k7bVar.m("stroke-linecap");
            if (!"round".equals(m)) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(m)) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(m)) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            m2 = k7bVar.m("stroke-linejoin");
            if (!"miter".equals(m2)) {
                paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(m2)) {
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(m2)) {
                paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            paint.setStyle(Paint.Style.STROKE);
            return true;
        }
        valueOf = null;
        Paint paint2 = this.h;
        if (valueOf != null) {
        }
        m = k7bVar.m("stroke-linecap");
        if (!"round".equals(m)) {
        }
        m2 = k7bVar.m("stroke-linejoin");
        if (!"miter".equals(m2)) {
        }
        paint2.setStyle(Paint.Style.STROKE);
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        StringBuilder sb = this.H;
        if (sb != null) {
            sb.append(cArr, i, i2);
        }
    }

    public final Bitmap d() {
        return this.b;
    }

    public final List e() {
        return this.K;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.I) {
            int i = this.J - 1;
            this.J = i;
            if (i == 0) {
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
                StringBuilder sb = this.H;
                if (sb != null) {
                    String[] split = sb.toString().split("\\}");
                    for (int i2 = 0; i2 < split.length; i2++) {
                        String replace = split[i2].trim().replace("\t", "").replace("\n", "");
                        split[i2] = replace;
                        if (replace.length() != 0 && split[i2].charAt(0) == '.' && (indexOf = split[i2].indexOf(jn7.G1)) >= 0) {
                            this.E.put(split[i2].substring(1, indexOf).trim(), new fgb(split[i2].substring(indexOf + 1)));
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
            ggb ggbVar = this.c;
            if (ggbVar == null) {
                this.a.restore();
            } else {
                int[] iArr = ggb.u;
                ggbVar.a.add(null);
            }
        }
    }

    public final void g(Attributes attributes) {
        String k = hgb.k("transform", attributes);
        boolean z = k != null;
        this.y = z;
        if (z) {
            Matrix n = hgb.n(k);
            ggb ggbVar = this.c;
            if (ggbVar != null) {
                int[] iArr = ggb.u;
                ggbVar.a.add(n);
            } else {
                this.a.save();
                this.a.concat(n);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        ivc ivcVar;
        cw6 cw6Var;
        String k;
        float min;
        Paint paint;
        char c;
        Float valueOf = Float.valueOf(0.0f);
        if (!"g".equals(str3) || this.I) {
            if (this.I) {
                this.J++;
                if ("rect".equals(str3)) {
                    float f = this.f;
                    try {
                        float parseFloat = Float.parseFloat(attributes.getValue("x"));
                        float parseFloat2 = Float.parseFloat(attributes.getValue("y"));
                        RectF rectF = new RectF(parseFloat, parseFloat2, Float.parseFloat(attributes.getValue("width")) + parseFloat, Float.parseFloat(attributes.getValue("height")) + parseFloat2);
                        Matrix n = hgb.n(attributes.getValue("transform"));
                        n.postScale(f, f);
                        ivcVar = new ivc(rectF, n);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        ivcVar = null;
                    }
                    if (ivcVar != null) {
                        ArrayList arrayList = this.K;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.K = arrayList;
                        }
                        arrayList.add(ivcVar);
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
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1656480802:
                    if (str2.equals("ellipse")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1360216880:
                    if (str2.equals("circle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -397519558:
                    if (str2.equals("polygon")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case jn7.n1 /* 103 */:
                    if (str2.equals("g")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 114276:
                    if (str2.equals("svg")) {
                        c = 4;
                        c2 = c;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c = 5;
                        c2 = c;
                        break;
                    }
                    break;
                case 3321844:
                    if (str2.equals("line")) {
                        c = 6;
                        c2 = c;
                        break;
                    }
                    break;
                case 3433509:
                    if (str2.equals("path")) {
                        c = 7;
                        c2 = c;
                        break;
                    }
                    break;
                case 3496420:
                    if (str2.equals("rect")) {
                        c = '\b';
                        c2 = c;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c = '\t';
                        c2 = c;
                        break;
                    }
                    break;
                case 561938880:
                    if (str2.equals("polyline")) {
                        c = '\n';
                        c2 = c;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c = 11;
                        c2 = c;
                        break;
                    }
                    break;
            }
            HashMap hashMap = this.E;
            ggb ggbVar = this.c;
            Paint paint2 = this.h;
            switch (c2) {
                case 0:
                    Float j = hgb.j("cx", attributes);
                    Float j2 = hgb.j("cy", attributes);
                    Float j3 = hgb.j("rx", attributes);
                    Float j4 = hgb.j("ry", attributes);
                    if (j != null && j2 != null && j3 != null && j4 != null) {
                        g(attributes);
                        k7b k7bVar = new k7b(attributes, hashMap);
                        float floatValue = j.floatValue() - j3.floatValue();
                        float floatValue2 = j2.floatValue() - j4.floatValue();
                        float floatValue3 = j3.floatValue() + j.floatValue();
                        float floatValue4 = j4.floatValue() + j2.floatValue();
                        RectF rectF2 = this.n;
                        rectF2.set(floatValue, floatValue2, floatValue3, floatValue4);
                        if (b(k7bVar)) {
                            if (ggbVar != null) {
                                bgb bgbVar = new bgb(rectF2);
                                int[] iArr = ggb.u;
                                ggbVar.a(bgbVar, paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        if (c(k7bVar)) {
                            if (ggbVar != null) {
                                bgb bgbVar2 = new bgb(rectF2);
                                int[] iArr2 = ggb.u;
                                ggbVar.a(bgbVar2, paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 1:
                    Float j5 = hgb.j("cx", attributes);
                    Float j6 = hgb.j("cy", attributes);
                    Float j7 = hgb.j("r", attributes);
                    if (j5 != null && j6 != null && j7 != null) {
                        g(attributes);
                        k7b k7bVar2 = new k7b(attributes, hashMap);
                        if (b(k7bVar2)) {
                            if (ggbVar != null) {
                                zfb zfbVar = new zfb(j5.floatValue(), j6.floatValue(), j7.floatValue());
                                int[] iArr3 = ggb.u;
                                ggbVar.a(zfbVar, paint2);
                            } else {
                                this.a.drawCircle(j5.floatValue(), j6.floatValue(), j7.floatValue(), paint2);
                            }
                        }
                        if (c(k7bVar2)) {
                            if (ggbVar != null) {
                                zfb zfbVar2 = new zfb(j5.floatValue(), j6.floatValue(), j7.floatValue());
                                int[] iArr4 = ggb.u;
                                ggbVar.a(zfbVar2, paint2);
                            } else {
                                this.a.drawCircle(j5.floatValue(), j6.floatValue(), j7.floatValue(), paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 2:
                case '\n':
                    int length = attributes.getLength();
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            cw6Var = null;
                        } else if (attributes.getLocalName(i).equals("points")) {
                            cw6Var = hgb.m(attributes.getValue(i));
                        } else {
                            i++;
                        }
                    }
                    if (cw6Var != null) {
                        Path path = new Path();
                        ArrayList arrayList2 = cw6Var.a;
                        if (arrayList2.size() > 1) {
                            g(attributes);
                            k7b k7bVar3 = new k7b(attributes, hashMap);
                            path.moveTo(((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(1)).floatValue());
                            for (int i2 = 2; i2 < arrayList2.size(); i2 += 2) {
                                path.lineTo(((Float) arrayList2.get(i2)).floatValue(), ((Float) arrayList2.get(i2 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (b(k7bVar3)) {
                                if (ggbVar != null) {
                                    int[] iArr5 = ggb.u;
                                    ggbVar.a(path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            if (c(k7bVar3)) {
                                if (ggbVar != null) {
                                    int[] iArr6 = ggb.u;
                                    ggbVar.a(path, paint2);
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
                    if ("bounds".equalsIgnoreCase(hgb.k("id", attributes))) {
                        this.G = true;
                        break;
                    }
                    break;
                case 4:
                    Float j8 = hgb.j("width", attributes);
                    Float j9 = hgb.j("height", attributes);
                    if ((j8 == null || j9 == null) && (k = hgb.k("viewBox", attributes)) != null) {
                        String[] split = k.split(" ");
                        Float valueOf2 = Float.valueOf(Float.parseFloat(split[2]));
                        j9 = Float.valueOf(Float.parseFloat(split[3]));
                        j8 = valueOf2;
                    }
                    int i3 = this.e;
                    int i4 = this.d;
                    if (j8 == null || j9 == null) {
                        j8 = Float.valueOf(i4);
                        j9 = Float.valueOf(i3);
                    }
                    int ceil = (int) Math.ceil(j8.floatValue());
                    int ceil2 = (int) Math.ceil(j9.floatValue());
                    if (ceil != 0 && ceil2 != 0) {
                        if (i4 == 0 || i3 == 0) {
                            i4 = ceil;
                            i3 = ceil2;
                        } else {
                            if (this.x == 2) {
                                min = i4 / ceil;
                                this.f = min;
                            } else {
                                min = Math.min(i4 / ceil, i3 / ceil2);
                                this.f = min;
                            }
                            i4 = (int) (ceil * min);
                            i3 = (int) (ceil2 * min);
                        }
                    }
                    if (ggbVar == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(i4, i3, this.F ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                        this.b = createBitmap;
                        createBitmap.eraseColor(0);
                        Canvas canvas = new Canvas(this.b);
                        this.a = canvas;
                        float f2 = this.f;
                        if (f2 != 0.0f) {
                            float f3 = this.w * f2;
                            canvas.scale(f3, f3);
                            break;
                        }
                    } else {
                        ggbVar.e = i4;
                        ggbVar.f = i3;
                        break;
                    }
                    break;
                case 5:
                case 11:
                    this.G = true;
                    break;
                case 6:
                    Float j10 = hgb.j("x1", attributes);
                    Float j11 = hgb.j("x2", attributes);
                    Float j12 = hgb.j("y1", attributes);
                    Float j13 = hgb.j("y2", attributes);
                    if (c(new k7b(attributes, hashMap))) {
                        g(attributes);
                        if (ggbVar != null) {
                            float floatValue5 = j10.floatValue();
                            float floatValue6 = j12.floatValue();
                            float floatValue7 = j11.floatValue();
                            float floatValue8 = j13.floatValue();
                            agb agbVar = new agb();
                            agbVar.a = floatValue5;
                            agbVar.b = floatValue6;
                            agbVar.c = floatValue7;
                            agbVar.d = floatValue8;
                            int[] iArr7 = ggb.u;
                            ggbVar.a(agbVar, paint2);
                        } else {
                            this.a.drawLine(j10.floatValue(), j12.floatValue(), j11.floatValue(), j13.floatValue(), paint2);
                        }
                        f();
                        break;
                    }
                    break;
                case 7:
                    Path b = hgb.b(hgb.k("d", attributes));
                    g(attributes);
                    k7b k7bVar4 = new k7b(attributes, hashMap);
                    if (b(k7bVar4)) {
                        if (ggbVar != null) {
                            int[] iArr8 = ggb.u;
                            ggbVar.a(b, paint2);
                        } else {
                            this.a.drawPath(b, paint2);
                        }
                    }
                    if (c(k7bVar4)) {
                        if (ggbVar != null) {
                            int[] iArr9 = ggb.u;
                            ggbVar.a(b, paint2);
                        } else {
                            this.a.drawPath(b, paint2);
                        }
                    }
                    f();
                    break;
                case '\b':
                    Float j14 = hgb.j("x", attributes);
                    if (j14 == null) {
                        j14 = valueOf;
                    }
                    Float j15 = hgb.j("y", attributes);
                    if (j15 != null) {
                        valueOf = j15;
                    }
                    Float j16 = hgb.j("width", attributes);
                    Float j17 = hgb.j("height", attributes);
                    Float j18 = hgb.j("rx", attributes);
                    g(attributes);
                    k7b k7bVar5 = new k7b(attributes, hashMap);
                    boolean b2 = b(k7bVar5);
                    RectF rectF3 = this.r;
                    if (b2) {
                        if (ggbVar == null) {
                            if (j18 == null) {
                                this.a.drawRect(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue(), paint2);
                                paint = paint2;
                                if (c(k7bVar5)) {
                                    if (ggbVar != null) {
                                        if (j18 != null) {
                                            dgb dgbVar = new dgb(new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue()), j18.floatValue());
                                            int[] iArr10 = ggb.u;
                                            ggbVar.a(dgbVar, paint);
                                        } else {
                                            RectF rectF4 = new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                                            int[] iArr11 = ggb.u;
                                            ggbVar.a(rectF4, paint);
                                        }
                                    } else if (j18 != null) {
                                        rectF3.set(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                                        this.a.drawRoundRect(rectF3, j18.floatValue(), j18.floatValue(), paint);
                                    } else {
                                        this.a.drawRect(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue(), paint);
                                    }
                                }
                                f();
                                break;
                            } else {
                                rectF3.set(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                                this.a.drawRoundRect(rectF3, j18.floatValue(), j18.floatValue(), paint2);
                            }
                        } else if (j18 != null) {
                            dgb dgbVar2 = new dgb(new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue()), j18.floatValue());
                            int[] iArr12 = ggb.u;
                            ggbVar.a(dgbVar2, paint2);
                        } else {
                            RectF rectF5 = new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                            int[] iArr13 = ggb.u;
                            ggbVar.a(rectF5, paint2);
                        }
                    }
                    paint = paint2;
                    if (c(k7bVar5)) {
                    }
                    f();
                case '\t':
                    this.H = new StringBuilder();
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }

    public egb(int i, int i2, Integer num, boolean z) {
        this(i, i2, num, z, 1.0f, 1);
    }
}
