package c8;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class i0 {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            i0.d dVar = dVarArr[i7];
            char c10 = dVar.a;
            i0.d dVar2 = dVarArr2[i7];
            if (c10 != dVar2.a || dVar.b.length != dVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(int i7, float[] fArr) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i0.d[] c(String str) {
        int i7;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char charAt = str.charAt(i12);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i12++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i11, i12).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i10) == 'z' || trim.charAt(i10) == 'Z') {
                            fArr = new float[i10];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i13 = i10;
                                int i14 = 1;
                                while (i14 < length) {
                                    int i15 = i10;
                                    int i16 = i15;
                                    int i17 = i16;
                                    int i18 = i17;
                                    for (int i19 = i14; i19 < trim.length(); i19++) {
                                        char charAt2 = trim.charAt(i19);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i19 != i14 && i15 == 0) {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                            break;
                                                        }
                                                        i15 = 0;
                                                        break;
                                                    case '.':
                                                        if (i16 == 0) {
                                                            i15 = 0;
                                                            i16 = 1;
                                                            break;
                                                        }
                                                        i15 = 0;
                                                        i17 = 1;
                                                        i18 = 1;
                                                        break;
                                                    default:
                                                        i15 = 0;
                                                        break;
                                                }
                                            } else {
                                                i15 = 1;
                                            }
                                            if (i17 == 0) {
                                                if (i14 < i19) {
                                                    fArr2[i13] = Float.parseFloat(trim.substring(i14, i19));
                                                    i13++;
                                                }
                                                i14 = i18 == 0 ? i19 : i19 + 1;
                                                i10 = 0;
                                            }
                                        }
                                        i15 = 0;
                                        i17 = 1;
                                        if (i17 == 0) {
                                        }
                                    }
                                    if (i14 < i19) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    i10 = 0;
                                }
                                fArr = b(i13, fArr2);
                                i10 = 0;
                            } catch (NumberFormatException e10) {
                                throw new RuntimeException(a8.p0.p("error in parsing \"", trim, "\""), e10);
                            }
                        }
                        arrayList.add(new i0.d(trim.charAt(i10), fArr));
                    }
                    i11 = i12;
                    i12++;
                    i10 = 0;
                }
                i12++;
            }
            trim = str.substring(i11, i12).trim();
            if (!trim.isEmpty()) {
            }
            i11 = i12;
            i12++;
            i10 = 0;
        }
        if (i12 - i11 != 1 || i11 >= str.length()) {
            i7 = 0;
        } else {
            i7 = 0;
            arrayList.add(new i0.d(str.charAt(i11), new float[0]));
        }
        return (i0.d[]) arrayList.toArray(new i0.d[i7]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.d.b(c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static i0.d[] e(i0.d[] dVarArr) {
        i0.d[] dVarArr2 = new i0.d[dVarArr.length];
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7] = new i0.d(dVarArr[i7]);
        }
        return dVarArr2;
    }
}
