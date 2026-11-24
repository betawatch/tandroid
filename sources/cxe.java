// default package

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class cxe {
    public static int[] a(int i, int i2, int i3, ArrayList arrayList) {
        int[] iArr = null;
        for (int i4 = 1; i4 <= 4; i4++) {
            iArr = c(i, i4, i3, arrayList);
            int i5 = 0;
            for (int i6 : iArr) {
                i5 += i6;
            }
            if (i5 <= i2) {
                break;
            }
        }
        if (iArr == null) {
            return new int[Math.max(0, i)];
        }
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        int i9 = i2 - i7;
        if (i9 > 0) {
            int[] c = c(i, 1, i3, arrayList);
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                i10 += Math.max(0, c[i11] - iArr[i11]);
            }
            if (i10 > 0) {
                float min = Math.min(1.0f, i9 / i10);
                for (int i12 = 0; i12 < i; i12++) {
                    iArr[i12] = iArr[i12] + ((int) Math.floor(Math.max(0, c[i12] - r1) * min));
                }
            }
        }
        return iArr;
    }

    public static ogb b(CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, int i4, int i5) {
        float f;
        float measureText;
        float measureText2;
        ogb ogbVar = new ogb();
        ogbVar.a = i;
        int i6 = 1;
        ogbVar.b = Math.max(1, i2);
        ogbVar.c = i3;
        int i7 = 0;
        ogbVar.e = Math.max(0, Math.min(i4, i5));
        if (charSequence == null || charSequence.length() == 0 || textPaint == null) {
            ogbVar.d = ogbVar.e;
            ogbVar.g = true;
            return ogbVar;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (charSequence.charAt(i8) == '\n') {
                i6++;
            }
        }
        ogbVar.f = new float[i6];
        int length2 = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            f = 0.0f;
            if (i7 > length2) {
                break;
            }
            if (i7 == length2 || charSequence.charAt(i7) == '\n') {
                float[] fArr = ogbVar.f;
                int i11 = i10 + 1;
                if (i7 > i9) {
                    try {
                        measureText2 = Layout.getDesiredWidth(charSequence, i9, i7, textPaint);
                    } catch (Exception unused) {
                        measureText2 = textPaint.measureText(charSequence, i9, i7);
                    }
                    f = measureText2;
                }
                fArr[i10] = f;
                i9 = i7 + 1;
                i10 = i11;
            }
            i7++;
        }
        String charSequence2 = charSequence.toString();
        BreakIterator lineInstance = BreakIterator.getLineInstance();
        lineInstance.setText(charSequence2);
        int first = lineInstance.first();
        while (true) {
            int i12 = first;
            first = lineInstance.next();
            if (first == -1) {
                ogbVar.d = Math.min(ogbVar.e, (int) Math.ceil(f));
                return ogbVar;
            }
            int i13 = first;
            while (true) {
                if (i13 <= i12) {
                    break;
                }
                if (!Character.isWhitespace(charSequence2.charAt(i13 - 1))) {
                    try {
                        measureText = Layout.getDesiredWidth(charSequence, i12, i13, textPaint);
                    } catch (Exception unused2) {
                        measureText = textPaint.measureText(charSequence, i12, i13);
                    }
                    f = Math.max(f, measureText);
                    break;
                }
                i13--;
            }
        }
    }

    public static int[] c(int i, int i2, int i3, ArrayList arrayList) {
        int i4;
        int i5;
        int max = Math.max(0, i);
        int[] iArr = new int[max];
        for (int i6 = 0; i6 < max; i6++) {
            iArr[i6] = i3;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ogb ogbVar = (ogb) arrayList.get(i7);
            if (ogbVar.b == 1 && (i5 = ogbVar.a) >= 0 && i5 < i) {
                iArr[i5] = Math.max(iArr[i5], ogbVar.b(i2));
            }
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ogb ogbVar2 = (ogb) arrayList.get(i8);
            int i9 = ogbVar2.b;
            if (i9 > 1 && (i4 = ogbVar2.a) >= 0 && i4 < i) {
                int min = Math.min(i, i4 + i9);
                int i10 = 0;
                for (int i11 = ogbVar2.a; i11 < min; i11++) {
                    i10 += iArr[i11];
                }
                int b = ogbVar2.b(i2) - i10;
                for (int i12 = ogbVar2.a; i12 < min && b > 0; i12++) {
                    int i13 = min - i12;
                    int i14 = ((b + i13) - 1) / i13;
                    iArr[i12] = iArr[i12] + i14;
                    b -= i14;
                }
            }
        }
        return iArr;
    }
}
