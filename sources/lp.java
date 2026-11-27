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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class lp implements oi0, ws4, aea {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    public lp(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.c = new tj0();
                break;
            case 18:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                int i = ek0.y;
                this.c = new go5[i];
                this.d = new Bitmap[i];
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e9, code lost:
    
        r0 = new um4(r6, r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ef, code lost:
    
        r0 = new um4(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01da, code lost:
    
        if (r9.size() <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dc, code lost:
    
        r0 = new um4(r9, r7);
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
    
        return new lp(r12, (java.lang.Object) null, 0, (byte) 3);
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
    public static lp g(Resources resources, int i, Resources.Theme theme) {
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
                        ColorStateList b2 = um2.b(resources, xml, asAttributeSet, theme);
                        return new lp(obj, b2, b2.getDefaultColor(), b);
                    }
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                }
                String name2 = xml.getName();
                if (!name2.equals("gradient")) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                }
                TypedArray d = m1f.d(resources, theme, asAttributeSet, t19.d);
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
                        TypedArray d2 = m1f.d(resources, theme, asAttributeSet, t19.e);
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

    public final void A(int i, long j, k43 k43Var) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.c = ofInt;
        ofInt.addUpdateListener(new lk(this, iArr, (byte) 24));
        ((ValueAnimator) this.c).addListener(new v02(this, i, iArr, (byte) 1));
        ((ValueAnimator) this.c).setDuration(j);
        ((ValueAnimator) this.c).setInterpolator(k43Var);
        ((ValueAnimator) this.c).start();
    }

    public final void B(long j, int i, long j2) {
        jt6 jt6Var = new jt6(1, i, null, 3, null, gcc.i0(j), gcc.i0(j2));
        vz6 vz6Var = (vz6) this.c;
        vz6Var.getClass();
        h(new fu2((Object) this, (Object) vz6Var, (Object) jt6Var, (byte) 18));
    }

    public final void C(String str, a94 a94Var) {
        int i = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i2 = i << 1;
        if (i2 > length) {
            if (i2 < 0) {
                hz6.e("cannot store more than MAX_VALUE elements");
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
        objArr[i5 + 1] = a94Var;
        this.b = i4 + 1;
    }

    @Override // aea
    public final boolean E() {
        lm7 lm7Var = (lm7) this.d;
        lm7Var.F0(lm7Var.n0(this.b, (r47) this.c, "forward", "copy_link"));
        return false;
    }

    public final void a(int i, int i2) {
        int i3 = (i2 << 16) + i;
        boolean z = this.b != i3;
        this.b = i3;
        for (int i4 = 0; i4 < ek0.y; i4++) {
            if (z || ((Bitmap[]) this.d)[i4] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i4];
                if (bitmap != null) {
                    Utilities.e.c(new pz(bitmap, (byte) 8));
                }
                ((Bitmap[]) this.d)[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            go5[] go5VarArr = (go5[]) this.c;
            if (go5VarArr[i4] == null) {
                go5VarArr[i4] = new go5((i2 * i) << 1);
            }
        }
    }

    public final void b() {
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            cr3.a(drawable);
            c34 c34Var = (c34) this.d;
            if (c34Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = gp.b;
                vd9.n(drawable, c34Var, drawableState);
            }
        }
    }

    @Override // oi0
    public final ni0 c(cb3 cb3Var, long j) {
        long j2;
        switch (this.a) {
            case 4:
                long j3 = cb3Var.d;
                long j4 = j(cb3Var);
                long e = cb3Var.e();
                cb3Var.a(Math.max(6, ((gk4) this.c).c), false);
                long j5 = j(cb3Var);
                return (j4 > j || j5 <= j) ? j5 <= j ? new ni0(j5, -2, cb3Var.e()) : new ni0(j4, -1, j3) : new ni0(-9223372036854775807L, 0, e);
            default:
                long j6 = cb3Var.d;
                int min = (int) Math.min(112800L, cb3Var.c - j6);
                ey7 ey7Var = (ey7) this.d;
                ey7Var.K(min);
                cb3Var.d(ey7Var.a, 0, min, false);
                int i = ey7Var.c;
                long j7 = -1;
                long j8 = -1;
                long j9 = -9223372036854775807L;
                while (true) {
                    if (ey7Var.a() >= 188) {
                        byte[] bArr = ey7Var.a;
                        int i2 = ey7Var.b;
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
                        int i3 = i2 + jn7.R2;
                        if (i3 <= i) {
                            long a = r0f.a(ey7Var, i2, this.b);
                            if (a != j2) {
                                long b = ((usb) this.c).b(a);
                                if (b > j) {
                                    return j9 == j2 ? new ni0(b, -1, j6) : new ni0(-9223372036854775807L, 0, j6 + j8);
                                }
                                j9 = b;
                                if (100000 + j9 > j) {
                                    return new ni0(-9223372036854775807L, 0, j6 + i2);
                                }
                                j8 = i2;
                            }
                            ey7Var.N(i3);
                            j7 = i3;
                        }
                    } else {
                        j2 = -9223372036854775807L;
                    }
                }
                return j9 != j2 ? new ni0(j9, -2, j6 + j7) : ni0.d;
        }
    }

    public final o99 d(boolean z) {
        so5 so5Var;
        so5 so5Var2;
        if (z && (so5Var2 = (so5) this.d) != null) {
            throw so5Var2.a();
        }
        o99 g = o99.g(this.b, (Object[]) this.c, this);
        if (!z || (so5Var = (so5) this.d) == null) {
            return g;
        }
        throw so5Var.a();
    }

    public to5 e() {
        return d(false);
    }

    @Override // oi0
    public final void f() {
        switch (this.a) {
            case 4:
                break;
            default:
                ey7 ey7Var = (ey7) this.d;
                byte[] bArr = gcc.b;
                ey7Var.L(bArr.length, bArr);
                break;
        }
    }

    public final void h(ot2 ot2Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            yz6 yz6Var = (yz6) it.next();
            gcc.X(yz6Var.a, new mn6((Object) ot2Var, (Object) yz6Var.b, (byte) 14));
        }
    }

    public final void i(int i, ko4 ko4Var, int i2, Object obj, long j) {
        h(new rm6(this, new jt6(1, i, ko4Var, i2, obj, gcc.i0(j), -9223372036854775807L), (byte) 7));
    }

    public final long j(cb3 cb3Var) {
        long j;
        boolean a;
        int i;
        long j2 = cb3Var.c;
        v11 v11Var = (v11) this.d;
        gk4 gk4Var = (gk4) this.c;
        while (true) {
            if (cb3Var.e() >= j2 - 6) {
                j = 6;
                break;
            }
            int i2 = this.b;
            long e = cb3Var.e();
            ey7 ey7Var = new ey7(17);
            cb3Var.d(ey7Var.a, 0, 2, false);
            if (ey7Var.g(0, ByteOrder.BIG_ENDIAN) != i2) {
                cb3Var.f = 0;
                cb3Var.a((int) (e - cb3Var.d), false);
                a = false;
                j = 6;
            } else {
                byte[] bArr = ey7Var.a;
                int i3 = 0;
                j = 6;
                while (i3 < 15 && (i = cb3Var.i(2 + i3, 15 - i3, bArr)) != -1) {
                    i3 += i;
                }
                ey7Var.M(i3 + 2);
                cb3Var.f = 0;
                cb3Var.a((int) (e - cb3Var.d), false);
                a = hle.a(ey7Var, gk4Var, i2, v11Var);
            }
            if (a) {
                break;
            }
            cb3Var.a(1, false);
        }
        if (cb3Var.e() < j2 - j) {
            return v11Var.a;
        }
        cb3Var.a((int) (j2 - cb3Var.e()), false);
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
            if (obj instanceof o8a) {
                o8a o8aVar = (o8a) obj;
                boolean a = ur5.a(o8aVar.e(), tdb.c);
                int[] iArr = (int[]) this.d;
                if (!a) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(o8aVar.g(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != rg7.c) {
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

    public final void o(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2) {
        h(new xz6(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), (byte) 1));
    }

    @Override // ws4
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        qy6 qy6Var = (qy6) this.d;
        yx6 yx6Var = qy6Var.j;
        xw6 xw6Var = (xw6) this.c;
        int i = this.b;
        yx6Var.getClass();
        yx6 yx6Var2 = qy6Var.j;
        if (i == -1) {
            yx6Var2.t();
            yx6Var2.t.w0(list);
        } else {
            yx6Var2.t();
            yx6Var2.t.Z(i, list);
        }
        yf8 yf8Var = new yf8();
        yf8Var.a.b(20);
        yf8Var.b();
        yx6Var2.n(xw6Var);
    }

    public final void p(ja6 ja6Var, int i) {
        q(ja6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void q(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2) {
        h(new xz6(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), (byte) 0));
    }

    public final void r(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new sf(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), iOException, z));
    }

    public final void s(ja6 ja6Var, int i, IOException iOException, boolean z) {
        r(ja6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void t(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = w19.f;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        ihc.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = yqd.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                cr3.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(v.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(cr3.b(typedArray.getInt(3, -1), null));
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

    public final void v(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2, int i4) {
        h(new an((Object) this, (Object) ja6Var, (Object) new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), i4, (byte) 5));
    }

    public lp x(Object obj, Object obj2) {
        int i = (this.b + 1) << 1;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, io5.b(objArr.length, i));
        }
        awd.a(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 << 1;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public lp y(Set set) {
        if (ik8.A(set)) {
            int size = (set.size() + this.b) << 1;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, io5.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final void z(int i) {
        A(i, 200L, k43.f);
    }

    private final void w() {
    }

    @Override // aea
    public final void u() {
    }

    @Override // ws4
    public final void k(Throwable th) {
    }

    public lp(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 19;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public /* synthetic */ lp(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ lp(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public lp(d79 d79Var) {
        this.a = (byte) 13;
        this.d = d79Var;
    }

    public lp(ImageView imageView) {
        this.a = (byte) 0;
        this.b = 0;
        this.c = imageView;
    }

    public lp(vr9 vr9Var) {
        this.a = (byte) 15;
        this.c = new SparseArray();
        this.d = vr9Var;
        this.b = -1;
    }

    public lp(gk4 gk4Var, int i) {
        this.a = (byte) 4;
        this.c = gk4Var;
        this.b = i;
        this.d = new v11();
    }

    public lp(int i, usb usbVar) {
        this.a = (byte) 17;
        this.b = i;
        this.c = usbVar;
        this.d = new ey7();
    }

    public lp(int i) {
        this.a = (byte) 5;
        this.c = new Object[i << 1];
        this.b = 0;
    }

    public /* synthetic */ lp(byte b, boolean z) {
        this.a = b;
    }

    public lp(ko4 ko4Var, int i, String str) {
        this.a = (byte) 7;
        this.c = ko4Var;
        this.b = i;
        this.d = str;
    }

    public lp(qy6 qy6Var, xw6 xw6Var, int i) {
        this.a = (byte) 8;
        this.d = qy6Var;
        this.c = xw6Var;
        this.b = i;
    }
}
