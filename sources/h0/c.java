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
import h7.n;
import java.lang.reflect.Array;
import org.telegram.messenger.beta.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    /* JADX WARN: Removed duplicated region for block: B:157:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
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
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f10;
        int attributeCount;
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int d;
        float f11;
        int i12;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r42 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r42 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = d0.a.a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i13, i13);
                int resourceId = obtainAttributes.getResourceId(i13, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r42);
                    int i15 = typedValue.type;
                    if (i15 < 28 || i15 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i13, -65281);
                        }
                        f10 = !obtainAttributes.hasValue(r42) ? obtainAttributes.getFloat(r42, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f12 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i16 = 0;
                        for (i10 = 0; i10 < attributeCount; i10++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i10);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i17 = i16 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i16] = attributeNameResource;
                                i16 = i17;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i16);
                        float f13 = 0.0f;
                        z10 = f12 < 0.0f && f12 <= 100.0f;
                        if (f10 == 1.0f || z10) {
                            int b10 = n.b((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                            if (z10) {
                                iArr = trimStateSet;
                                i11 = depth2;
                            } else {
                                a a2 = a.a(color);
                                float f14 = a2.a;
                                float f15 = a2.b;
                                l lVar = l.k;
                                if (f15 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i11 = depth2;
                                    d = b.d(f12);
                                } else {
                                    float min = f14 < 0.0f ? 0.0f : Math.min(360.0f, f14);
                                    float f16 = f15;
                                    a aVar = null;
                                    boolean z11 = true;
                                    while (true) {
                                        if (Math.abs(f13 - f15) >= 0.4f) {
                                            float f17 = 1000.0f;
                                            iArr = trimStateSet;
                                            float f18 = 100.0f;
                                            float f19 = 0.0f;
                                            float f20 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f19 - f18) <= 0.01f) {
                                                    i11 = depth2;
                                                    break;
                                                }
                                                float A = com.google.android.recaptcha.internal.a.A(f18, f19, 2.0f, f19);
                                                float f21 = f18;
                                                int c10 = a.b(A, f16, min).c(l.k);
                                                float e9 = b.e(Color.red(c10));
                                                float e10 = b.e(Color.green(c10));
                                                float e11 = b.e(Color.blue(c10));
                                                float[] fArr = b.d[1];
                                                float f22 = (e10 * fArr[1]) + (e9 * fArr[0]);
                                                float f23 = fArr[2];
                                                i11 = depth2;
                                                float y10 = com.google.android.recaptcha.internal.a.y(e11, f23, f22, 100.0f);
                                                float cbrt = y10 <= 0.008856452f ? y10 * 903.2963f : (((float) Math.cbrt(y10)) * 116.0f) - 16.0f;
                                                float abs = Math.abs(f12 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a3 = a.a(c10);
                                                    f11 = cbrt;
                                                    a b11 = a.b(a3.c, a3.b, min);
                                                    float f24 = a3.d - b11.d;
                                                    float f25 = a3.e - b11.e;
                                                    float f26 = a3.f - b11.f;
                                                    float pow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f20 = pow;
                                                        f17 = abs;
                                                        aVar2 = a3;
                                                    }
                                                } else {
                                                    f11 = cbrt;
                                                }
                                                if (f17 == 0.0f && f20 == 0.0f) {
                                                    break;
                                                }
                                                if (f11 < f12) {
                                                    f18 = f21;
                                                    f19 = A;
                                                } else {
                                                    f18 = A;
                                                }
                                                depth2 = i11;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z11) {
                                                if (aVar3 == null) {
                                                    f15 = f16;
                                                } else {
                                                    aVar = aVar3;
                                                    f13 = f16;
                                                }
                                                f16 = com.google.android.recaptcha.internal.a.A(f15, f13, 2.0f, f13);
                                                trimStateSet = iArr;
                                                depth2 = i11;
                                            } else {
                                                if (aVar3 != null) {
                                                    d = aVar3.c(lVar);
                                                    break;
                                                }
                                                f16 = com.google.android.recaptcha.internal.a.A(f15, f13, 2.0f, f13);
                                                trimStateSet = iArr;
                                                depth2 = i11;
                                                z11 = false;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i11 = depth2;
                                            d = aVar == null ? b.d(f12) : aVar.c(lVar);
                                        }
                                    }
                                }
                                color = d;
                            }
                            color = (16777215 & color) | (b10 << 24);
                        } else {
                            iArr = trimStateSet;
                            i11 = depth2;
                        }
                        i12 = i14 + 1;
                        if (i12 > iArr3.length) {
                            int[] iArr6 = new int[i14 <= 4 ? 8 : i14 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i14);
                            iArr3 = iArr6;
                        }
                        iArr3[i14] = color;
                        if (i12 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i14 > 4 ? i14 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i14);
                            iArr2 = r12;
                        }
                        iArr2[i14] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i14 = i12;
                        depth2 = i11;
                        r42 = 1;
                        i13 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i13, -65281);
                if (!obtainAttributes.hasValue(r42)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i162 = 0;
                while (i10 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i162);
                float f132 = 0.0f;
                if (f12 < 0.0f) {
                }
                if (f10 == 1.0f) {
                }
                int b102 = n.b((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                if (z10) {
                }
                color = (16777215 & color) | (b102 << 24);
                i12 = i14 + 1;
                if (i12 > iArr3.length) {
                }
                iArr3[i14] = color;
                if (i12 > iArr2.length) {
                }
                iArr2[i14] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i14 = i12;
                depth2 = i11;
                r42 = 1;
                i13 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                depth2 = depth2;
                r42 = 1;
                i13 = 0;
            }
        }
        int[] iArr7 = new int[i14];
        int[][] iArr8 = new int[i14][];
        System.arraycopy(iArr3, 0, iArr7, 0, i14);
        System.arraycopy(iArr2, 0, iArr8, 0, i14);
        return new ColorStateList(iArr8, iArr7);
    }
}
