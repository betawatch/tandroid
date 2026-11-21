package c8;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;
import org.telegram.ui.Components.jx0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class ta {
    public static int[] a(int i7, int i10, int i11, ArrayList arrayList) {
        int[] iArr = null;
        for (int i12 = 1; i12 <= 4; i12++) {
            iArr = c(i7, i12, i11, arrayList);
            int i13 = 0;
            for (int i14 : iArr) {
                i13 += i14;
            }
            if (i13 <= i10) {
                break;
            }
        }
        if (iArr == null) {
            return new int[Math.max(0, i7)];
        }
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        int i17 = i10 - i15;
        if (i17 > 0) {
            int[] c10 = c(i7, 1, i11, arrayList);
            int i18 = 0;
            for (int i19 = 0; i19 < i7; i19++) {
                i18 += Math.max(0, c10[i19] - iArr[i19]);
            }
            if (i18 > 0) {
                float min = Math.min(1.0f, i17 / i18);
                for (int i20 = 0; i20 < i7; i20++) {
                    iArr[i20] = iArr[i20] + ((int) Math.floor(Math.max(0, c10[i20] - r1) * min));
                }
            }
        }
        return iArr;
    }

    public static jx0 b(CharSequence charSequence, TextPaint textPaint, int i7, int i10, int i11, int i12, int i13) {
        float f10;
        float measureText;
        float measureText2;
        jx0 jx0Var = new jx0();
        jx0Var.a = i7;
        int i14 = 1;
        jx0Var.b = Math.max(1, i10);
        jx0Var.c = i11;
        int i15 = 0;
        jx0Var.e = Math.max(0, Math.min(i12, i13));
        if (charSequence == null || charSequence.length() == 0 || textPaint == null) {
            jx0Var.d = jx0Var.e;
            jx0Var.g = true;
            return jx0Var;
        }
        int length = charSequence.length();
        for (int i16 = 0; i16 < length; i16++) {
            if (charSequence.charAt(i16) == '\n') {
                i14++;
            }
        }
        jx0Var.f = new float[i14];
        int length2 = charSequence.length();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            f10 = 0.0f;
            if (i15 > length2) {
                break;
            }
            if (i15 == length2 || charSequence.charAt(i15) == '\n') {
                float[] fArr = jx0Var.f;
                int i19 = i18 + 1;
                if (i15 > i17) {
                    try {
                        measureText2 = Layout.getDesiredWidth(charSequence, i17, i15, textPaint);
                    } catch (Exception unused) {
                        measureText2 = textPaint.measureText(charSequence, i17, i15);
                    }
                    f10 = measureText2;
                }
                fArr[i18] = f10;
                i17 = i15 + 1;
                i18 = i19;
            }
            i15++;
        }
        String charSequence2 = charSequence.toString();
        BreakIterator lineInstance = BreakIterator.getLineInstance();
        lineInstance.setText(charSequence2);
        int first = lineInstance.first();
        while (true) {
            int i20 = first;
            first = lineInstance.next();
            if (first == -1) {
                jx0Var.d = Math.min(jx0Var.e, (int) Math.ceil(f10));
                return jx0Var;
            }
            int i21 = first;
            while (i21 > i20 && Character.isWhitespace(charSequence2.charAt(i21 - 1))) {
                i21--;
            }
            if (i21 > i20) {
                try {
                    measureText = Layout.getDesiredWidth(charSequence, i20, i21, textPaint);
                } catch (Exception unused2) {
                    measureText = textPaint.measureText(charSequence, i20, i21);
                }
                f10 = Math.max(f10, measureText);
            }
        }
    }

    public static int[] c(int i7, int i10, int i11, ArrayList arrayList) {
        int i12;
        int i13;
        int max = Math.max(0, i7);
        int[] iArr = new int[max];
        for (int i14 = 0; i14 < max; i14++) {
            iArr[i14] = i11;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            jx0 jx0Var = (jx0) arrayList.get(i15);
            if (jx0Var.b == 1 && (i13 = jx0Var.a) >= 0 && i13 < i7) {
                iArr[i13] = Math.max(iArr[i13], jx0Var.b(i10));
            }
        }
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            jx0 jx0Var2 = (jx0) arrayList.get(i16);
            int i17 = jx0Var2.b;
            if (i17 > 1 && (i12 = jx0Var2.a) >= 0 && i12 < i7) {
                int min = Math.min(i7, i12 + i17);
                int i18 = 0;
                for (int i19 = jx0Var2.a; i19 < min; i19++) {
                    i18 += iArr[i19];
                }
                int b10 = jx0Var2.b(i10) - i18;
                for (int i20 = jx0Var2.a; i20 < min && b10 > 0; i20++) {
                    int i21 = min - i20;
                    int i22 = ((b10 + i21) - 1) / i21;
                    iArr[i20] = iArr[i20] + i22;
                    b10 -= i22;
                }
            }
        }
        return iArr;
    }
}
