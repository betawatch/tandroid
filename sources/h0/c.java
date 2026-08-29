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
import i7.w;
import java.lang.reflect.Array;
import org.telegram.messenger.beta.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        float f9;
        int attributeCount;
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int d;
        float f10;
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
                        f9 = !obtainAttributes.hasValue(r42) ? obtainAttributes.getFloat(r42, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f11 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
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
                        float f12 = 0.0f;
                        z10 = f11 < 0.0f && f11 <= 100.0f;
                        if (f9 == 1.0f || z10) {
                            int b10 = w.b((int) ((Color.alpha(color) * f9) + 0.5f), 0, 255);
                            if (z10) {
                                iArr = trimStateSet;
                                i11 = depth2;
                            } else {
                                a a2 = a.a(color);
                                float f13 = a2.a;
                                float f14 = a2.b;
                                l lVar = l.k;
                                if (f14 < 1.0d || Math.round(f11) <= 0.0d || Math.round(f11) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i11 = depth2;
                                    d = b.d(f11);
                                } else {
                                    float min = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
                                    float f15 = f14;
                                    a aVar = null;
                                    boolean z11 = true;
                                    while (true) {
                                        if (Math.abs(f12 - f14) >= 0.4f) {
                                            float f16 = 1000.0f;
                                            iArr = trimStateSet;
                                            float f17 = 100.0f;
                                            float f18 = 0.0f;
                                            float f19 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f18 - f17) <= 0.01f) {
                                                    i11 = depth2;
                                                    break;
                                                }
                                                float A = com.google.android.recaptcha.internal.a.A(f17, f18, 2.0f, f18);
                                                float f20 = f17;
                                                int c3 = a.b(A, f15, min).c(l.k);
                                                float e10 = b.e(Color.red(c3));
                                                float e11 = b.e(Color.green(c3));
                                                float e12 = b.e(Color.blue(c3));
                                                float[] fArr = b.d[1];
                                                float f21 = (e11 * fArr[1]) + (e10 * fArr[0]);
                                                float f22 = fArr[2];
                                                i11 = depth2;
                                                float y8 = com.google.android.recaptcha.internal.a.y(e12, f22, f21, 100.0f);
                                                float cbrt = y8 <= 0.008856452f ? y8 * 903.2963f : (((float) Math.cbrt(y8)) * 116.0f) - 16.0f;
                                                float abs = Math.abs(f11 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a10 = a.a(c3);
                                                    f10 = cbrt;
                                                    a b11 = a.b(a10.c, a10.b, min);
                                                    float f23 = a10.d - b11.d;
                                                    float f24 = a10.e - b11.e;
                                                    float f25 = a10.f - b11.f;
                                                    float pow = (float) (Math.pow(Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f19 = pow;
                                                        f16 = abs;
                                                        aVar2 = a10;
                                                    }
                                                } else {
                                                    f10 = cbrt;
                                                }
                                                if (f16 == 0.0f && f19 == 0.0f) {
                                                    break;
                                                }
                                                if (f10 < f11) {
                                                    f17 = f20;
                                                    f18 = A;
                                                } else {
                                                    f17 = A;
                                                }
                                                depth2 = i11;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z11) {
                                                if (aVar3 == null) {
                                                    f14 = f15;
                                                } else {
                                                    aVar = aVar3;
                                                    f12 = f15;
                                                }
                                                f15 = com.google.android.recaptcha.internal.a.A(f14, f12, 2.0f, f12);
                                                trimStateSet = iArr;
                                                depth2 = i11;
                                            } else {
                                                if (aVar3 != null) {
                                                    d = aVar3.c(lVar);
                                                    break;
                                                }
                                                f15 = com.google.android.recaptcha.internal.a.A(f14, f12, 2.0f, f12);
                                                trimStateSet = iArr;
                                                depth2 = i11;
                                                z11 = false;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i11 = depth2;
                                            d = aVar == null ? b.d(f11) : aVar.c(lVar);
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
                float f122 = 0.0f;
                if (f11 < 0.0f) {
                }
                if (f9 == 1.0f) {
                }
                int b102 = w.b((int) ((Color.alpha(color) * f9) + 0.5f), 0, 255);
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
