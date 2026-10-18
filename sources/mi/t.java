package mi;

import com.google.android.gms.internal.play_billing.s0;
import java.util.Arrays;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class t {
    public static final HashMap b;
    public final int[] a;

    static {
        HashMap hashMap = new HashMap();
        a(hashMap, 1, "keyword");
        a(hashMap, 2, "operator", "entity");
        a(hashMap, 3, "constant", "boolean");
        a(hashMap, 4, "string", "string-literal", "char", "template-string");
        a(hashMap, 5, "number");
        a(hashMap, 6, "comment", "block-comment", "comment-multiline", "prolog", "doctype", "cdata");
        a(hashMap, 7, "function", "function-definition", "function-variable", "function-name");
        a(hashMap, 8, "builtin", TeXSymbolParser.TYPE_ATTR);
        a(hashMap, 9, "class-name");
        a(hashMap, 10, "property");
        a(hashMap, 11, "attr-name");
        a(hashMap, 12, "attr-value");
        a(hashMap, 13, "selector");
        a(hashMap, 14, "tag");
        a(hashMap, 15, "symbol");
        a(hashMap, 16, "regex");
        a(hashMap, 17, "url");
        a(hashMap, 18, "atrule");
        a(hashMap, 19, "inserted");
        a(hashMap, 20, "deleted");
        a(hashMap, 21, "punctuation");
        a(hashMap, 256, "bold");
        a(hashMap, 512, "italic");
        a(hashMap, 257, "important");
        b = hashMap;
    }

    public t(String[] strArr) {
        this.a = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int i11 = 0;
            for (String str : strArr[i10].split("\\s+")) {
                Integer num = (Integer) b.get(str);
                if (num != null) {
                    i11 = ((i11 & 255) == 0 ? i11 | (num.intValue() & 255) : i11) | (num.intValue() & (-256));
                }
            }
            this.a[i10] = i11;
        }
    }

    public static void a(HashMap hashMap, int i10, String... strArr) {
        for (String str : strArr) {
            hashMap.put(str, Integer.valueOf(i10));
        }
    }

    public final int[] b(s0 s0Var) {
        int[] iArr = (int[]) s0Var.c;
        int length = iArr.length / 5;
        if (length == 0) {
            return new int[0];
        }
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        s sVar = new s();
        sVar.b = new int[48];
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i11 * 5;
            int i14 = iArr[i13];
            int i15 = iArr[i13 + 1];
            while (i10 >= 0) {
                int i16 = iArr3[i10];
                if (i16 > i14) {
                    break;
                }
                sVar.a(i12, i16, iArr4[i10]);
                i12 = iArr3[i10];
                i10--;
            }
            if (i10 >= 0) {
                sVar.a(i12, i14, iArr4[i10]);
            }
            int i17 = iArr[i13 + 4];
            int i18 = i17 < 0 ? 0 : iArr2[i17];
            int i19 = iArr[i13 + 2];
            int[] iArr5 = this.a;
            int i20 = iArr5[i19];
            int i21 = iArr5[iArr[i13 + 3]];
            int i22 = i21 & 255;
            if (i22 == 0) {
                i22 = i20 & 255;
            }
            if (i22 == 0) {
                i22 = i18 & 255;
            }
            int i23 = ((i18 | i20 | i21) & (-256)) | i22;
            iArr2[i11] = i23;
            i10++;
            iArr3[i10] = i15;
            iArr4[i10] = i23;
            i11++;
            i12 = i14;
        }
        while (i10 >= 0) {
            sVar.a(i12, iArr3[i10], iArr4[i10]);
            i12 = iArr3[i10];
            i10--;
        }
        return Arrays.copyOf(sVar.b, sVar.a);
    }
}
