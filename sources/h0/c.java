package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import b8.be;
import java.lang.reflect.Array;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f10;
        int attributeCount;
        int i3;
        char c2;
        int[] iArr;
        int i10;
        int d;
        float f11;
        int i11;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = d0.a.a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i12, i12);
                int resourceId = obtainAttributes.getResourceId(i12, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z10);
                    int i14 = typedValue.type;
                    if (i14 < 28 || i14 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i12, -65281);
                        }
                        f10 = !obtainAttributes.hasValue(z10) ? obtainAttributes.getFloat(z10, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c10 = z10;
                        float f12 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i3 = i12;
                        int i15 = i3;
                        while (i3 < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i16 = i15 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i15] = attributeNameResource;
                                i15 = i16;
                            }
                            i3++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i15);
                        float f13 = 0.0f;
                        float f14 = 100.0f;
                        c2 = (f12 >= 0.0f || f12 > 100.0f) ? (char) 0 : c10;
                        if (f10 == 1.0f || c2 != 0) {
                            int b10 = be.b((int) ((Color.alpha(color) * f10) + 0.5f), 0, hs.e4);
                            if (c2 == 0) {
                                a a10 = a.a(color);
                                float f15 = a10.a;
                                float f16 = a10.b;
                                k kVar = k.k;
                                if (f16 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i10 = depth2;
                                    d = b.d(f12);
                                } else {
                                    float min = f15 < 0.0f ? 0.0f : Math.min(360.0f, f15);
                                    float f17 = f16;
                                    char c11 = c10;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f13 - f16) >= 0.4f) {
                                            float f18 = 1000.0f;
                                            iArr = trimStateSet;
                                            float f19 = f14;
                                            float f20 = 0.0f;
                                            float f21 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f20 - f19) <= 0.01f) {
                                                    i10 = depth2;
                                                    break;
                                                }
                                                float z11 = com.google.android.recaptcha.internal.a.z(f19, f20, 2.0f, f20);
                                                float f22 = f19;
                                                int c12 = a.b(z11, f17, min).c(k.k);
                                                float e10 = b.e(Color.red(c12));
                                                float e11 = b.e(Color.green(c12));
                                                float e12 = b.e(Color.blue(c12));
                                                float[] fArr = b.d[c10];
                                                float f23 = (e11 * fArr[c10]) + (e10 * fArr[0]);
                                                float f24 = fArr[2];
                                                i10 = depth2;
                                                float x10 = com.google.android.recaptcha.internal.a.x(e12, f24, f23, 100.0f);
                                                float cbrt = x10 <= 0.008856452f ? x10 * 903.2963f : (((float) Math.cbrt(x10)) * 116.0f) - 16.0f;
                                                float abs = Math.abs(f12 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a11 = a.a(c12);
                                                    f11 = cbrt;
                                                    a b11 = a.b(a11.c, a11.b, min);
                                                    float f25 = a11.d - b11.d;
                                                    float f26 = a11.e - b11.e;
                                                    float f27 = a11.f - b11.f;
                                                    float pow = (float) (Math.pow(Math.sqrt((f27 * f27) + (f26 * f26) + (f25 * f25)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f21 = pow;
                                                        f18 = abs;
                                                        aVar2 = a11;
                                                    }
                                                } else {
                                                    f11 = cbrt;
                                                }
                                                if (f18 == 0.0f && f21 == 0.0f) {
                                                    break;
                                                }
                                                if (f11 < f12) {
                                                    f19 = f22;
                                                    f20 = z11;
                                                } else {
                                                    f19 = z11;
                                                }
                                                depth2 = i10;
                                            }
                                            a aVar3 = aVar2;
                                            if (c11 == 0) {
                                                if (aVar3 == null) {
                                                    f16 = f17;
                                                } else {
                                                    aVar = aVar3;
                                                    f13 = f17;
                                                }
                                                f17 = com.google.android.recaptcha.internal.a.z(f16, f13, 2.0f, f13);
                                                trimStateSet = iArr;
                                                depth2 = i10;
                                                f14 = 100.0f;
                                            } else {
                                                if (aVar3 != null) {
                                                    d = aVar3.c(kVar);
                                                    break;
                                                }
                                                f17 = com.google.android.recaptcha.internal.a.z(f16, f13, 2.0f, f13);
                                                trimStateSet = iArr;
                                                depth2 = i10;
                                                f14 = 100.0f;
                                                c11 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i10 = depth2;
                                            d = aVar == null ? b.d(f12) : aVar.c(kVar);
                                        }
                                    }
                                }
                                color = d;
                            } else {
                                iArr = trimStateSet;
                                i10 = depth2;
                            }
                            color = (16777215 & color) | (b10 << 24);
                        } else {
                            iArr = trimStateSet;
                            i10 = depth2;
                        }
                        i11 = i13 + 1;
                        if (i11 > iArr3.length) {
                            int[] iArr6 = new int[i13 <= 4 ? 8 : i13 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i13);
                            iArr3 = iArr6;
                        }
                        iArr3[i13] = color;
                        if (i11 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i13 > 4 ? i13 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i13);
                            iArr2 = r12;
                        }
                        iArr2[i13] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i13 = i11;
                        z10 = c10;
                        depth2 = i10;
                        i12 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i12, -65281);
                if (!obtainAttributes.hasValue(z10)) {
                }
                char c102 = z10;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i3 = i12;
                int i152 = i3;
                while (i3 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i152);
                float f132 = 0.0f;
                float f142 = 100.0f;
                if (f12 >= 0.0f) {
                }
                if (f10 == 1.0f) {
                }
                int b102 = be.b((int) ((Color.alpha(color) * f10) + 0.5f), 0, hs.e4);
                if (c2 == 0) {
                }
                color = (16777215 & color) | (b102 << 24);
                i11 = i13 + 1;
                if (i11 > iArr3.length) {
                }
                iArr3[i13] = color;
                if (i11 > iArr2.length) {
                }
                iArr2[i13] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i13 = i11;
                z10 = c102;
                depth2 = i10;
                i12 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z10 = z10;
                depth2 = depth2;
                i12 = 0;
            }
        }
        int[] iArr7 = new int[i13];
        int[][] iArr8 = new int[i13][];
        System.arraycopy(iArr3, 0, iArr7, 0, i13);
        System.arraycopy(iArr2, 0, iArr8, 0, i13);
        return new ColorStateList(iArr8, iArr7);
    }
}
