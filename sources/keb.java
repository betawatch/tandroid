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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class keb extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas a;
    public Bitmap b;
    public final meb c;
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

    public keb(int i, int i2, Integer num, boolean z, float f, int i3) {
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
            this.c = new meb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xab xabVar, Integer num, boolean z) {
        Float valueOf;
        Paint paint = this.h;
        Integer num2 = this.s;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        } else {
            paint.setColor((num.intValue() & 16777215) | (-16777216));
        }
        String j = xabVar.j("opacity");
        Float f = null;
        if (j != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(j));
            } catch (NumberFormatException unused) {
            }
            if (valueOf == null) {
                String j2 = xabVar.j(z ? "fill-opacity" : "stroke-opacity");
                if (j2 != null) {
                    try {
                        f = Float.valueOf(Float.parseFloat(j2));
                    } catch (NumberFormatException unused2) {
                    }
                }
                valueOf = f;
            }
            if (valueOf != null) {
                paint.setAlpha(nm7.d4);
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

    public final boolean b(xab xabVar) {
        if (!"none".equals(xabVar.j("display"))) {
            String j = xabVar.j("fill");
            if (j != null && j.startsWith("url(#")) {
                j.substring(5, j.length() - 1);
                return false;
            }
            Integer k = xabVar.k("fill");
            Paint paint = this.h;
            if (k != null) {
                a(xabVar, k, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (xabVar.j("fill") == null && xabVar.j("stroke") == null) {
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
    public final boolean c(xab xabVar) {
        Integer k;
        Float valueOf;
        String j;
        String j2;
        if ("none".equals(xabVar.j("display")) || (k = xabVar.k("stroke")) == null) {
            return false;
        }
        a(xabVar, k, false);
        String j3 = xabVar.j("stroke-width");
        if (j3 != null) {
            try {
                valueOf = Float.valueOf(Float.parseFloat(j3));
            } catch (NumberFormatException unused) {
            }
            Paint paint = this.h;
            if (valueOf != null) {
                paint.setStrokeWidth(valueOf.floatValue());
            }
            j = xabVar.j("stroke-linecap");
            if (!"round".equals(j)) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(j)) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(j)) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            j2 = xabVar.j("stroke-linejoin");
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
        j = xabVar.j("stroke-linecap");
        if (!"round".equals(j)) {
        }
        j2 = xabVar.j("stroke-linejoin");
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
                        if (replace.length() != 0 && split[i2].charAt(0) == '.' && (indexOf = split[i2].indexOf(nm7.G1)) >= 0) {
                            this.E.put(split[i2].substring(1, indexOf).trim(), new leb(split[i2].substring(indexOf + 1)));
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
            meb mebVar = this.c;
            if (mebVar == null) {
                this.a.restore();
            } else {
                int[] iArr = meb.u;
                mebVar.a.add(null);
            }
        }
    }

    public final void g(Attributes attributes) {
        String k = neb.k("transform", attributes);
        boolean z = k != null;
        this.y = z;
        if (z) {
            Matrix n = neb.n(k);
            meb mebVar = this.c;
            if (mebVar != null) {
                int[] iArr = meb.u;
                mebVar.a.add(n);
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
        wsc wscVar;
        jk4 jk4Var;
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
                        Matrix n = neb.n(attributes.getValue("transform"));
                        n.postScale(f, f);
                        wscVar = new wsc(rectF, n);
                    } catch (Exception e) {
                        fc4.g(e, true);
                        wscVar = null;
                    }
                    if (wscVar != null) {
                        ArrayList arrayList = this.K;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.K = arrayList;
                        }
                        arrayList.add(wscVar);
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
                case nm7.n1 /* 103 */:
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
            meb mebVar = this.c;
            Paint paint2 = this.h;
            switch (c2) {
                case 0:
                    Float j = neb.j("cx", attributes);
                    Float j2 = neb.j("cy", attributes);
                    Float j3 = neb.j("rx", attributes);
                    Float j4 = neb.j("ry", attributes);
                    if (j != null && j2 != null && j3 != null && j4 != null) {
                        g(attributes);
                        xab xabVar = new xab(attributes, hashMap);
                        float floatValue = j.floatValue() - j3.floatValue();
                        float floatValue2 = j2.floatValue() - j4.floatValue();
                        float floatValue3 = j3.floatValue() + j.floatValue();
                        float floatValue4 = j4.floatValue() + j2.floatValue();
                        RectF rectF2 = this.n;
                        rectF2.set(floatValue, floatValue2, floatValue3, floatValue4);
                        if (b(xabVar)) {
                            if (mebVar != null) {
                                heb hebVar = new heb(rectF2);
                                int[] iArr = meb.u;
                                mebVar.a(hebVar, paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        if (c(xabVar)) {
                            if (mebVar != null) {
                                heb hebVar2 = new heb(rectF2);
                                int[] iArr2 = meb.u;
                                mebVar.a(hebVar2, paint2);
                            } else {
                                this.a.drawOval(rectF2, paint2);
                            }
                        }
                        f();
                        break;
                    }
                    break;
                case 1:
                    Float j5 = neb.j("cx", attributes);
                    Float j6 = neb.j("cy", attributes);
                    Float j7 = neb.j("r", attributes);
                    if (j5 != null && j6 != null && j7 != null) {
                        g(attributes);
                        xab xabVar2 = new xab(attributes, hashMap);
                        if (b(xabVar2)) {
                            if (mebVar != null) {
                                feb febVar = new feb(j5.floatValue(), j6.floatValue(), j7.floatValue());
                                int[] iArr3 = meb.u;
                                mebVar.a(febVar, paint2);
                            } else {
                                this.a.drawCircle(j5.floatValue(), j6.floatValue(), j7.floatValue(), paint2);
                            }
                        }
                        if (c(xabVar2)) {
                            if (mebVar != null) {
                                feb febVar2 = new feb(j5.floatValue(), j6.floatValue(), j7.floatValue());
                                int[] iArr4 = meb.u;
                                mebVar.a(febVar2, paint2);
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
                            jk4Var = null;
                        } else if (attributes.getLocalName(i).equals("points")) {
                            jk4Var = neb.m(attributes.getValue(i));
                        } else {
                            i++;
                        }
                    }
                    if (jk4Var != null) {
                        Path path = new Path();
                        ArrayList arrayList2 = jk4Var.a;
                        if (arrayList2.size() > 1) {
                            g(attributes);
                            xab xabVar3 = new xab(attributes, hashMap);
                            path.moveTo(((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(1)).floatValue());
                            for (int i2 = 2; i2 < arrayList2.size(); i2 += 2) {
                                path.lineTo(((Float) arrayList2.get(i2)).floatValue(), ((Float) arrayList2.get(i2 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (b(xabVar3)) {
                                if (mebVar != null) {
                                    int[] iArr5 = meb.u;
                                    mebVar.a(path, paint2);
                                } else {
                                    this.a.drawPath(path, paint2);
                                }
                            }
                            if (c(xabVar3)) {
                                if (mebVar != null) {
                                    int[] iArr6 = meb.u;
                                    mebVar.a(path, paint2);
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
                    if ("bounds".equalsIgnoreCase(neb.k("id", attributes))) {
                        this.G = true;
                        break;
                    }
                    break;
                case 4:
                    Float j8 = neb.j("width", attributes);
                    Float j9 = neb.j("height", attributes);
                    if ((j8 == null || j9 == null) && (k = neb.k("viewBox", attributes)) != null) {
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
                    if (mebVar == null) {
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
                        mebVar.e = i4;
                        mebVar.f = i3;
                        break;
                    }
                    break;
                case 5:
                case 11:
                    this.G = true;
                    break;
                case 6:
                    Float j10 = neb.j("x1", attributes);
                    Float j11 = neb.j("x2", attributes);
                    Float j12 = neb.j("y1", attributes);
                    Float j13 = neb.j("y2", attributes);
                    if (c(new xab(attributes, hashMap))) {
                        g(attributes);
                        if (mebVar != null) {
                            float floatValue5 = j10.floatValue();
                            float floatValue6 = j12.floatValue();
                            float floatValue7 = j11.floatValue();
                            float floatValue8 = j13.floatValue();
                            geb gebVar = new geb();
                            gebVar.a = floatValue5;
                            gebVar.b = floatValue6;
                            gebVar.c = floatValue7;
                            gebVar.d = floatValue8;
                            int[] iArr7 = meb.u;
                            mebVar.a(gebVar, paint2);
                        } else {
                            this.a.drawLine(j10.floatValue(), j12.floatValue(), j11.floatValue(), j13.floatValue(), paint2);
                        }
                        f();
                        break;
                    }
                    break;
                case 7:
                    Path b = neb.b(neb.k("d", attributes));
                    g(attributes);
                    xab xabVar4 = new xab(attributes, hashMap);
                    if (b(xabVar4)) {
                        if (mebVar != null) {
                            int[] iArr8 = meb.u;
                            mebVar.a(b, paint2);
                        } else {
                            this.a.drawPath(b, paint2);
                        }
                    }
                    if (c(xabVar4)) {
                        if (mebVar != null) {
                            int[] iArr9 = meb.u;
                            mebVar.a(b, paint2);
                        } else {
                            this.a.drawPath(b, paint2);
                        }
                    }
                    f();
                    break;
                case '\b':
                    Float j14 = neb.j("x", attributes);
                    if (j14 == null) {
                        j14 = valueOf;
                    }
                    Float j15 = neb.j("y", attributes);
                    if (j15 != null) {
                        valueOf = j15;
                    }
                    Float j16 = neb.j("width", attributes);
                    Float j17 = neb.j("height", attributes);
                    Float j18 = neb.j("rx", attributes);
                    g(attributes);
                    xab xabVar5 = new xab(attributes, hashMap);
                    boolean b2 = b(xabVar5);
                    RectF rectF3 = this.r;
                    if (b2) {
                        if (mebVar == null) {
                            if (j18 == null) {
                                this.a.drawRect(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue(), paint2);
                                paint = paint2;
                                if (c(xabVar5)) {
                                    if (mebVar != null) {
                                        if (j18 != null) {
                                            jeb jebVar = new jeb(new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue()), j18.floatValue());
                                            int[] iArr10 = meb.u;
                                            mebVar.a(jebVar, paint);
                                        } else {
                                            RectF rectF4 = new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                                            int[] iArr11 = meb.u;
                                            mebVar.a(rectF4, paint);
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
                            jeb jebVar2 = new jeb(new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue()), j18.floatValue());
                            int[] iArr12 = meb.u;
                            mebVar.a(jebVar2, paint2);
                        } else {
                            RectF rectF5 = new RectF(j14.floatValue(), valueOf.floatValue(), j16.floatValue() + j14.floatValue(), j17.floatValue() + valueOf.floatValue());
                            int[] iArr13 = meb.u;
                            mebVar.a(rectF5, paint2);
                        }
                    }
                    paint = paint2;
                    if (c(xabVar5)) {
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

    public keb(int i, int i2, Integer num, boolean z) {
        this(i, i2, num, z, 1.0f, 1);
    }
}
