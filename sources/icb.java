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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class icb extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas a;
    public Bitmap b;
    public final kcb c;
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

    public icb(int i, int i2, Integer num, boolean z, float f, int i3) {
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
            this.c = new kcb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(v8b v8bVar, Integer num, boolean z) {
        Float valueOf;
        Paint paint = this.h;
        Integer num2 = this.s;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        } else {
            paint.setColor((num.intValue() & 16777215) | (-16777216));
        }
        String j = v8bVar.j("opacity");
        Float f = null;
        if (j != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(j));
            } catch (NumberFormatException unused) {
            }
            if (valueOf == null) {
                String j2 = v8bVar.j(z ? "fill-opacity" : "stroke-opacity");
                if (j2 != null) {
                    try {
                        f = Float.valueOf(Float.parseFloat(j2));
                    } catch (NumberFormatException unused2) {
                    }
                }
                valueOf = f;
            }
            if (valueOf != null) {
                paint.setAlpha(kk7.d4);
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

    public final boolean b(v8b v8bVar) {
        if (!"none".equals(v8bVar.j("display"))) {
            String j = v8bVar.j("fill");
            if (j != null && j.startsWith("url(#")) {
                j.substring(5, j.length() - 1);
                return false;
            }
            Integer k = v8bVar.k("fill");
            Paint paint = this.h;
            if (k != null) {
                a(v8bVar, k, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (v8bVar.j("fill") == null && v8bVar.j("stroke") == null) {
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
    public final boolean c(v8b v8bVar) {
        Integer k;
        Float valueOf;
        String j;
        String j2;
        if ("none".equals(v8bVar.j("display")) || (k = v8bVar.k("stroke")) == null) {
            return false;
        }
        a(v8bVar, k, false);
        String j3 = v8bVar.j("stroke-width");
        if (j3 != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(j3));
            } catch (NumberFormatException unused) {
            }
            Paint paint = this.h;
            if (valueOf != null) {
                paint.setStrokeWidth(valueOf.floatValue());
            }
            j = v8bVar.j("stroke-linecap");
            if (!"round".equals(j)) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(j)) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(j)) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            j2 = v8bVar.j("stroke-linejoin");
            if (!"miter".equals(j2)) {
                paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(j2)) {
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(j2)) {
                paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            paint.setStyle(Paint.Style.STROKE);
            return true;
        }
        valueOf = null;
        Paint paint2 = this.h;
        if (valueOf != null) {
        }
        j = v8bVar.j("stroke-linecap");
        if (!"round".equals(j)) {
        }
        j2 = v8bVar.j("stroke-linejoin");
        if (!"miter".equals(j2)) {
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
                        if (replace.length() != 0 && split[i2].charAt(0) == '.' && (indexOf = split[i2].indexOf(kk7.G1)) >= 0) {
                            this.E.put(split[i2].substring(1, indexOf).trim(), new jcb(split[i2].substring(indexOf + 1)));
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
            kcb kcbVar = this.c;
            if (kcbVar == null) {
                this.a.restore();
            } else {
                int[] iArr = kcb.u;
                kcbVar.a.add(null);
            }
        }
    }

    public final void g(Attributes attributes) {
        String k = lcb.k("transform", attributes);
        boolean z = k != null;
        this.y = z;
        if (z) {
            Matrix n = lcb.n(k);
            kcb kcbVar = this.c;
            if (kcbVar != null) {
                int[] iArr = kcb.u;
                kcbVar.a.add(n);
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
        uqc uqcVar;
        il8 il8Var;
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
                        Matrix n = lcb.n(attributes.getValue("transform"));
                        n.postScale(f, f);
                        uqcVar = new uqc(rectF, n);
                    } catch (Exception e) {
                        fa4.g(e, true);
                        uqcVar = null;
                    }
                    if (uqcVar != null) {
                        ArrayList arrayList = this.K;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.K = arrayList;
                        }
                        arrayList.add(uqcVar);
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
                case kk7.n1 /* 103 */:
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
            kcb kcbVar = this.c;
            Paint paint2 = this.h;
            switch (c2) {
                case 0:
                    Float j = lcb.j("cx", attributes);
                    Float j2 = lcb.j("cy", attributes);
                    Float j3 = lcb.j("rx", attributes);
                    Float j4 = lcb.j("ry", attributes);
                    if (j != null && j2 != null && j3 != null && j4 != null) {
                        g(attributes);
                        v8b v8bVar = new v8b(attributes, hashMap);
                        float floatValue = j.floatValue() - j3.floatValue();
                        float floatValue2 = j2.floatValue() - j4.floatValue();
                        float floatValue3 = j3.floatValue() + j.floatValue();
                        float floatValue4 = j4.floatValue() + j2.floatValue();
                        RectF rectF2 = this.n;
                        rectF2.set(floatValue, floatValue2, floatValue3, floatValue4);
                        if (b(v8bVar)) {
                            if (kcbVar != null) {
                                fcb fcbVar = new fcb(rectF2);
                                int[] iArr = kcb.u;
                                kcbVar.a(fcbVar, paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        if (c(v8bVar)) {
                            if (kcbVar != null) {
                                fcb fcbVar2 = new fcb(rectF2);
                                int[] iArr2 = kcb.u;
                                kcbVar.a(fcbVar2, paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 1:
                    Float j5 = lcb.j("cx", attributes);
                    Float j6 = lcb.j("cy", attributes);
                    Float j7 = lcb.j("r", attributes);
                    if (j5 != null && j6 != null && j7 != null) {
                        g(attributes);
                        v8b v8bVar2 = new v8b(attributes, hashMap);
                        if (b(v8bVar2)) {
                            if (kcbVar != null) {
                                dcb dcbVar = new dcb(j5.floatValue(), j6.floatValue(), j7.floatValue());
                                int[] iArr3 = kcb.u;
                                kcbVar.a(dcbVar, paint2);
                            } else {
                                this.a.drawCircle(j5.floatValue(), j6.floatValue(), j7.floatValue(), paint2);
                            }
                        }
                        if (c(v8bVar2)) {
                            if (kcbVar != null) {
                                dcb dcbVar2 = new dcb(j5.floatValue(), j6.floatValue(), j7.floatValue());
                                int[] iArr4 = kcb.u;
                                kcbVar.a(dcbVar2, paint2);
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
                            il8Var = null;
                        } else if (attributes.getLocalName(i).equals("points")) {
                            il8Var = lcb.m(attributes.getValue(i));
                        } else {
                            i++;
                        }
                    }
                    if (il8Var != null) {
                        Path path = new Path();
                        ArrayList arrayList2 = il8Var.a;
                        if (arrayList2.size() > 1) {
                            g(attributes);
                            v8b v8bVar3 = new v8b(attributes, hashMap);
                            path.moveTo(((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(1)).floatValue());
                            for (int i2 = 2; i2 < arrayList2.size(); i2 += 2) {
                                path.lineTo(((Float) arrayList2.get(i2)).floatValue(), ((Float) arrayList2.get(i2 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (b(v8bVar3)) {
                                if (kcbVar != null) {
                                    int[] iArr5 = kcb.u;
                                    kcbVar.a(path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            if (c(v8bVar3)) {
                                if (kcbVar != null) {
                                    int[] iArr6 = kcb.u;
                                    kcbVar.a(path, paint2);
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
                    if ("bounds".equalsIgnoreCase(lcb.k("id", attributes))) {
                        this.G = true;
                        break;
                    }
                    break;
                case 4:
                    Float j8 = lcb.j("width", attributes);
                    Float j9 = lcb.j("height", attributes);
                    if ((j8 == null || j9 == null) && (k = lcb.k("viewBox", attributes)) != null) {
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
                    if (kcbVar == null) {
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
                        kcbVar.e = i4;
                        kcbVar.f = i3;
                        break;
                    }
                    break;
                case 5:
                case 11:
                    this.G = true;
                    break;
                case 6:
                    Float j10 = lcb.j("x1", attributes);
                    Float j11 = lcb.j("x2", attributes);
                    Float j12 = lcb.j("y1", attributes);
                    Float j13 = lcb.j("y2", attributes);
                    if (c(new v8b(attributes, hashMap))) {
                        g(attributes);
                        if (kcbVar != null) {
                            float floatValue5 = j10.floatValue();
                            float floatValue6 = j12.floatValue();
                            float floatValue7 = j11.floatValue();
                            float floatValue8 = j13.floatValue();
                            ecb ecbVar = new ecb();
                            ecbVar.a = floatValue5;
                            ecbVar.b = floatValue6;
                            ecbVar.c = floatValue7;
                            ecbVar.d = floatValue8;
                            int[] iArr7 = kcb.u;
                            kcbVar.a(ecbVar, paint2);
                        } else {
                            this.a.drawLine(j10.floatValue(), j12.floatValue(), j11.floatValue(), j13.floatValue(), paint2);
                        }
                        f();
                        break;
                    }
                    break;
                case 7:
                    Path b = lcb.b(lcb.k("d", attributes));
                    g(attributes);
                    v8b v8bVar4 = new v8b(attributes, hashMap);
                    if (b(v8bVar4)) {
                        if (kcbVar != null) {
                            int[] iArr8 = kcb.u;
                            kcbVar.a(b, paint2);
                        } else {
                            this.a.drawPath(b, paint2);
                        }
                    }
                    if (c(v8bVar4)) {
                        if (kcbVar != null) {
                            int[] iArr9 = kcb.u;
                            kcbVar.a(b, paint2);
                        } else {
                            this.a.drawPath(b, paint2);
                        }
                    }
                    f();
                    break;
                case '\b':
                    Float j14 = lcb.j("x", attributes);
                    if (j14 == null) {
                        j14 = valueOf;
                    }
                    Float j15 = lcb.j("y", attributes);
                    if (j15 != null) {
                        valueOf = j15;
                    }
                    Float j16 = lcb.j("width", attributes);
                    Float j17 = lcb.j("height", attributes);
                    Float j18 = lcb.j("rx", attributes);
                    g(attributes);
                    v8b v8bVar5 = new v8b(attributes, hashMap);
                    boolean b2 = b(v8bVar5);
                    RectF rectF3 = this.r;
                    if (b2) {
                        if (kcbVar == null) {
                            if (j18 == null) {
                                this.a.drawRect(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue(), paint2);
                                paint = paint2;
                                if (c(v8bVar5)) {
                                    if (kcbVar != null) {
                                        if (j18 != null) {
                                            hcb hcbVar = new hcb(new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue()), j18.floatValue());
                                            int[] iArr10 = kcb.u;
                                            kcbVar.a(hcbVar, paint);
                                        } else {
                                            RectF rectF4 = new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                                            int[] iArr11 = kcb.u;
                                            kcbVar.a(rectF4, paint);
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
                            hcb hcbVar2 = new hcb(new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue()), j18.floatValue());
                            int[] iArr12 = kcb.u;
                            kcbVar.a(hcbVar2, paint2);
                        } else {
                            RectF rectF5 = new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                            int[] iArr13 = kcb.u;
                            kcbVar.a(rectF5, paint2);
                        }
                    }
                    paint = paint2;
                    if (c(v8bVar5)) {
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

    public icb(int i, int i2, Integer num, boolean z) {
        this(i, i2, num, z, 1.0f, 1);
    }
}
