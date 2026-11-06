package ni;

import com.google.android.gms.internal.play_billing.s0;
import f5.u;
import java.util.Arrays;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        a(hashMap, qs.g4, "important");
        b = hashMap;
    }

    public t(String[] strArr) {
        this.a = new int[strArr.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            int i10 = 0;
            for (String str : strArr[i7].split("\\s+")) {
                Integer num = (Integer) b.get(str);
                if (num != null) {
                    i10 = ((i10 & qs.e4) == 0 ? i10 | (num.intValue() & qs.e4) : i10) | (num.intValue() & (-256));
                }
            }
            this.a[i7] = i10;
        }
    }

    public static void a(HashMap hashMap, int i7, String... strArr) {
        for (String str : strArr) {
            hashMap.put(str, Integer.valueOf(i7));
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
        boolean z9 = false;
        u uVar = new u(8, z9, z9);
        uVar.c = new int[48];
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 * 5;
            int i13 = iArr[i12];
            int i14 = iArr[i12 + 1];
            while (i7 >= 0) {
                int i15 = iArr3[i7];
                if (i15 > i13) {
                    break;
                }
                uVar.b(i11, i15, iArr4[i7]);
                i11 = iArr3[i7];
                i7--;
            }
            if (i7 >= 0) {
                uVar.b(i11, i13, iArr4[i7]);
            }
            int i16 = iArr[i12 + 4];
            int i17 = i16 < 0 ? 0 : iArr2[i16];
            int i18 = iArr[i12 + 2];
            int[] iArr5 = this.a;
            int i19 = iArr5[i18];
            int i20 = iArr5[iArr[i12 + 3]];
            int i21 = i20 & qs.e4;
            if (i21 == 0) {
                i21 = i19 & qs.e4;
            }
            if (i21 == 0) {
                i21 = i17 & qs.e4;
            }
            int i22 = ((i17 | i19 | i20) & (-256)) | i21;
            iArr2[i10] = i22;
            i7++;
            iArr3[i7] = i14;
            iArr4[i7] = i22;
            i10++;
            i11 = i13;
        }
        while (i7 >= 0) {
            uVar.b(i11, iArr3[i7], iArr4[i7]);
            i11 = iArr3[i7];
            i7--;
        }
        return Arrays.copyOf((int[]) uVar.c, uVar.b);
    }
}
