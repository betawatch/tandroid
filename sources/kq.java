// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class kq implements nj0, ts4 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    public kq(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.c = new sk0();
                break;
            case 17:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                int i = dl0.y;
                this.c = new do5[i];
                this.d = new Bitmap[i];
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e9, code lost:
    
        r0 = new wm4(r6, r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ef, code lost:
    
        r0 = new wm4(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01da, code lost:
    
        if (r9.size() <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dc, code lost:
    
        r0 = new wm4(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e3, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f5, code lost:
    
        if (r10 == 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f8, code lost:
    
        if (r10 == 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fa, code lost:
    
        r17 = (int[]) r0.b;
        r18 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0208, code lost:
    
        if (r13 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x020a, code lost:
    
        if (r13 == 2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021d, code lost:
    
        r12 = new android.graphics.LinearGradient(r21, r24, r25, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0268, code lost:
    
        return new kq(r12, (java.lang.Object) null, 0, (byte) 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0217, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021a, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0221, code lost:
    
        r12 = new android.graphics.SweepGradient(r8, r12, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0234, code lost:
    
        if (r23 <= 0.0f) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0236, code lost:
    
        r21 = (int[]) r0.b;
        r22 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0246, code lost:
    
        if (r13 == 1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0248, code lost:
    
        if (r13 == 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024a, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025b, code lost:
    
        r12 = new android.graphics.RadialGradient(r8, r12, r23, r21, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0255, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0258, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e7, code lost:
    
        if (r19 == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kq g(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                String name = xml.getName();
                name.getClass();
                byte b = 3;
                Object obj = null;
                if (!name.equals("gradient")) {
                    if (name.equals("selector")) {
                        ColorStateList b2 = nn2.b(resources, xml, asAttributeSet, theme);
                        return new kq(obj, b2, b2.getDefaultColor(), b);
                    }
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                }
                String name2 = xml.getName();
                if (!name2.equals("gradient")) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                }
                TypedArray d = dye.d(resources, theme, asAttributeSet, h09.d);
                float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? d.getFloat(8, 0.0f) : 0.0f;
                float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? d.getFloat(9, 0.0f) : 0.0f;
                float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? d.getFloat(10, 0.0f) : 0.0f;
                float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? d.getFloat(11, 0.0f) : 0.0f;
                float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? d.getFloat(3, 0.0f) : 0.0f;
                float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? d.getFloat(4, 0.0f) : 0.0f;
                int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? d.getInt(2, 0) : 0;
                int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? d.getColor(0, 0) : 0;
                boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
                int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? d.getColor(7, 0) : 0;
                int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? d.getColor(1, 0) : 0;
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
                    f = f3;
                    i2 = d.getInt(6, 0);
                } else {
                    f = f3;
                    i2 = 0;
                }
                float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? d.getFloat(5, 0.0f) : 0.0f;
                d.recycle();
                int depth = xml.getDepth() + 1;
                ArrayList arrayList = new ArrayList(20);
                float f10 = f9;
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    float f11 = f4;
                    if (next2 == 1) {
                        f2 = f5;
                        break;
                    }
                    int depth2 = xml.getDepth();
                    f2 = f5;
                    if (depth2 < depth && next2 == 3) {
                        break;
                    }
                    if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                        TypedArray d2 = dye.d(resources, theme, asAttributeSet, h09.e);
                        boolean hasValue = d2.hasValue(0);
                        boolean hasValue2 = d2.hasValue(1);
                        if (!hasValue || !hasValue2) {
                            break;
                        }
                        int color4 = d2.getColor(0, 0);
                        float f12 = d2.getFloat(1, 0.0f);
                        d2.recycle();
                        arrayList2.add(Integer.valueOf(color4));
                        arrayList.add(Float.valueOf(f12));
                    }
                    f4 = f11;
                    f5 = f2;
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public final void A(long j, int i, long j2) {
        ft6 ft6Var = new ft6(1, i, null, 3, null, hac.i0(j), hac.i0(j2));
        rz6 rz6Var = (rz6) this.c;
        rz6Var.getClass();
        h(new wu2((Object) this, (Object) rz6Var, (Object) ft6Var, (byte) 18));
    }

    public final void B(String str, o94 o94Var) {
        int i = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i2 = i << 1;
        if (i2 > length) {
            if (i2 < 0) {
                bh7.j("cannot store more than MAX_VALUE elements");
                return;
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            objArr = Arrays.copyOf(objArr, i3);
            this.c = objArr;
        }
        int i4 = this.b;
        int i5 = i4 << 1;
        objArr[i5] = str;
        objArr[i5 + 1] = o94Var;
        this.b = i4 + 1;
    }

    public final void a(int i, int i2) {
        int i3 = (i2 << 16) + i;
        boolean z = this.b != i3;
        this.b = i3;
        for (int i4 = 0; i4 < dl0.y; i4++) {
            if (z || ((Bitmap[]) this.d)[i4] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i4];
                if (bitmap != null) {
                    Utilities.e.c(new f00(bitmap, (byte) 10));
                }
                ((Bitmap[]) this.d)[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            do5[] do5VarArr = (do5[]) this.c;
            if (do5VarArr[i4] == null) {
                do5VarArr[i4] = new do5((i2 * i) << 1);
            }
        }
    }

    @Override // nj0
    public final mj0 b(vb3 vb3Var, long j) {
        long j2;
        switch (this.a) {
            case 4:
                long j3 = vb3Var.d;
                long k = k(vb3Var);
                long f = vb3Var.f();
                vb3Var.a(Math.max(6, ((gk4) this.c).c), false);
                long k2 = k(vb3Var);
                return (k > j || k2 <= j) ? k2 <= j ? new mj0(k2, -2, vb3Var.f()) : new mj0(k, -1, j3) : new mj0(-9223372036854775807L, 0, f);
            default:
                long j4 = vb3Var.d;
                int min = (int) Math.min(112800L, vb3Var.c - j4);
                yw7 yw7Var = (yw7) this.d;
                yw7Var.K(min);
                vb3Var.d(yw7Var.a, 0, min, false);
                int i = yw7Var.c;
                long j5 = -1;
                long j6 = -1;
                long j7 = -9223372036854775807L;
                while (true) {
                    if (yw7Var.a() >= 188) {
                        byte[] bArr = yw7Var.a;
                        int i2 = yw7Var.b;
                        while (true) {
                            if (i2 < i) {
                                j2 = -9223372036854775807L;
                                if (bArr[i2] != 71) {
                                    i2++;
                                }
                            } else {
                                j2 = -9223372036854775807L;
                            }
                        }
                        int i3 = i2 + nm7.R2;
                        if (i3 <= i) {
                            long a = bye.a(yw7Var, i2, this.b);
                            if (a != j2) {
                                long b = ((vqb) this.c).b(a);
                                if (b > j) {
                                    return j7 == j2 ? new mj0(b, -1, j4) : new mj0(-9223372036854775807L, 0, j4 + j6);
                                }
                                j7 = b;
                                if (100000 + j7 > j) {
                                    return new mj0(-9223372036854775807L, 0, j4 + i2);
                                }
                                j6 = i2;
                            }
                            yw7Var.N(i3);
                            j5 = i3;
                        }
                    } else {
                        j2 = -9223372036854775807L;
                    }
                }
                return j7 != j2 ? new mj0(j7, -2, j4 + j5) : mj0.d;
        }
    }

    @Override // nj0
    public final void c() {
        switch (this.a) {
            case 4:
                break;
            default:
                yw7 yw7Var = (yw7) this.d;
                byte[] bArr = hac.b;
                yw7Var.L(bArr.length, bArr);
                break;
        }
    }

    public final void d() {
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            vr3.a(drawable);
            s34 s34Var = (s34) this.d;
            if (s34Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = fq.b;
                hc9.n(drawable, s34Var, drawableState);
            }
        }
    }

    public final d89 e(boolean z) {
        po5 po5Var;
        po5 po5Var2;
        if (z && (po5Var2 = (po5) this.d) != null) {
            throw po5Var2.a();
        }
        d89 g = d89.g(this.b, (Object[]) this.c, this);
        if (!z || (po5Var = (po5) this.d) == null) {
            return g;
        }
        throw po5Var.a();
    }

    public qo5 f() {
        return e(false);
    }

    public final void h(fu2 fu2Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            uz6 uz6Var = (uz6) it.next();
            hac.X(uz6Var.a, new lj6((Object) fu2Var, (Object) uz6Var.b, (byte) 18));
        }
    }

    public final void i(int i, go4 go4Var, int i2, Object obj, long j) {
        h(new cz6((Object) this, (Object) new ft6(1, i, go4Var, i2, obj, hac.i0(j), -9223372036854775807L), (byte) 3));
    }

    public final long k(vb3 vb3Var) {
        long j;
        boolean a;
        int h;
        long j2 = vb3Var.c;
        u21 u21Var = (u21) this.d;
        gk4 gk4Var = (gk4) this.c;
        while (true) {
            if (vb3Var.f() >= j2 - 6) {
                j = 6;
                break;
            }
            int i = this.b;
            long f = vb3Var.f();
            yw7 yw7Var = new yw7(17);
            vb3Var.d(yw7Var.a, 0, 2, false);
            if (yw7Var.g(0, ByteOrder.BIG_ENDIAN) != i) {
                vb3Var.f = 0;
                vb3Var.a((int) (f - vb3Var.d), false);
                a = false;
                j = 6;
            } else {
                byte[] bArr = yw7Var.a;
                int i2 = 0;
                j = 6;
                while (i2 < 15 && (h = vb3Var.h(2 + i2, 15 - i2, bArr)) != -1) {
                    i2 += h;
                }
                yw7Var.M(i2 + 2);
                vb3Var.f = 0;
                vb3Var.a((int) (f - vb3Var.d), false);
                a = oie.a(yw7Var, gk4Var, i, u21Var);
            }
            if (a) {
                break;
            }
            vb3Var.a(1, false);
        }
        if (vb3Var.f() < j2 - j) {
            return u21Var.a;
        }
        vb3Var.a((int) (j2 - vb3Var.f()), false);
        return gk4Var.j;
    }

    public final Object l(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public final String m() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof y6a) {
                y6a y6aVar = (y6a) obj;
                boolean a = rr5.a(y6aVar.e(), xbb.c);
                int[] iArr = (int[]) this.d;
                if (!a) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(y6aVar.g(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != kg7.c) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final boolean n() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public final void o(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2) {
        h(new tz6(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), (byte) 1));
    }

    @Override // ts4
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        ly6 ly6Var = (ly6) this.d;
        tx6 tx6Var = ly6Var.j;
        sw6 sw6Var = (sw6) this.c;
        int i = this.b;
        tx6Var.getClass();
        tx6 tx6Var2 = ly6Var.j;
        if (i == -1) {
            tx6Var2.t();
            tx6Var2.t.w0(list);
        } else {
            tx6Var2.t();
            tx6Var2.t.Z(i, list);
        }
        me8 me8Var = new me8();
        me8Var.a.b(20);
        me8Var.b();
        tx6Var2.n(sw6Var);
    }

    public final void p(ea6 ea6Var, int i) {
        q(ea6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void q(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2) {
        h(new tz6(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), (byte) 0));
    }

    public final void r(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new og(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), iOException, z));
    }

    public final void s(ea6 ea6Var, int i, IOException iOException, boolean z) {
        r(ea6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void t(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = k09.f;
        wm9 v = wm9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        kfc.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = kod.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vr3.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(v.i(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(vr3.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            v.y();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return m();
            default:
                return super.toString();
        }
    }

    public final void u(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2, int i4) {
        h(new zn((Object) this, (Object) ea6Var, (Object) new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), i4, (byte) 5));
    }

    public kq w(Object obj, Object obj2) {
        int i = (this.b + 1) << 1;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, fo5.b(objArr.length, i));
        }
        ntd.a(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 << 1;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public kq x(Set set) {
        if (wi8.A(set)) {
            int size = (set.size() + this.b) << 1;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, fo5.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final void y(int i) {
        z(i, 200L, d53.f);
    }

    public final void z(int i, long j, d53 d53Var) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.c = ofInt;
        ofInt.addUpdateListener(new pl(this, iArr, (byte) 24));
        ((ValueAnimator) this.c).addListener(new q12(this, i, iArr, (byte) 1));
        ((ValueAnimator) this.c).setDuration(j);
        ((ValueAnimator) this.c).setInterpolator(d53Var);
        ((ValueAnimator) this.c).start();
    }

    private final void v() {
    }

    @Override // ts4
    public final void j(Throwable th) {
    }

    public kq(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 18;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public /* synthetic */ kq(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public kq(r59 r59Var) {
        this.a = (byte) 12;
        this.d = r59Var;
    }

    public kq(ImageView imageView) {
        this.a = (byte) 0;
        this.b = 0;
        this.c = imageView;
    }

    public kq(dq9 dq9Var) {
        this.a = (byte) 14;
        this.c = new SparseArray();
        this.d = dq9Var;
        this.b = -1;
    }

    public kq(gk4 gk4Var, int i) {
        this.a = (byte) 4;
        this.c = gk4Var;
        this.b = i;
        this.d = new u21();
    }

    public kq(int i, vqb vqbVar) {
        this.a = (byte) 16;
        this.b = i;
        this.c = vqbVar;
        this.d = new yw7();
    }

    public kq(CopyOnWriteArrayList copyOnWriteArrayList, int i, rz6 rz6Var) {
        this.a = (byte) 9;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = rz6Var;
    }

    public kq(int i) {
        this.a = (byte) 5;
        this.c = new Object[i << 1];
        this.b = 0;
    }

    public /* synthetic */ kq(byte b, boolean z) {
        this.a = b;
    }

    public kq(go4 go4Var, int i, String str) {
        this.a = (byte) 7;
        this.c = go4Var;
        this.b = i;
        this.d = str;
    }

    public kq(ly6 ly6Var, sw6 sw6Var, int i) {
        this.a = (byte) 8;
        this.d = ly6Var;
        this.c = sw6Var;
        this.b = i;
    }
}
