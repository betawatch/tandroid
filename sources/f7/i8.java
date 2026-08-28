package f7;

import android.graphics.Path;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i8 {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            i0.d dVar = dVarArr[i9];
            char c10 = dVar.a;
            i0.d dVar2 = dVarArr2[i9];
            if (c10 != dVar2.a || dVar.b.length != dVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i9, length);
        float[] fArr2 = new float[i9];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:35:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i0.d[] c(String str) {
        int i9;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            while (i11 < str.length()) {
                char charAt = str.charAt(i11);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i11++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i12, i11).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i10) == 'z' || trim.charAt(i10) == 'Z') {
                            fArr = new float[i10];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i13 = 1;
                                int i14 = 0;
                                while (i13 < length) {
                                    boolean z10 = false;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    for (int i15 = i13; i15 < trim.length(); i15++) {
                                        char charAt2 = trim.charAt(i15);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                        if (i15 != i13 && !z10) {
                                                            z10 = false;
                                                            z12 = true;
                                                            z13 = true;
                                                            break;
                                                        }
                                                        z10 = false;
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                        if (!z11) {
                                                            z10 = false;
                                                            z11 = true;
                                                            break;
                                                        }
                                                        z10 = false;
                                                        z12 = true;
                                                        z13 = true;
                                                        break;
                                                    default:
                                                        z10 = false;
                                                        break;
                                                }
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z12) {
                                                if (i13 < i15) {
                                                    fArr2[i14] = Float.parseFloat(trim.substring(i13, i15));
                                                    i14++;
                                                }
                                                i13 = !z13 ? i15 : i15 + 1;
                                            }
                                        }
                                        z10 = false;
                                        z12 = true;
                                        if (!z12) {
                                        }
                                    }
                                    if (i13 < i15) {
                                    }
                                    if (!z13) {
                                    }
                                }
                                fArr = b(fArr2, i14);
                                i10 = 0;
                            } catch (NumberFormatException e10) {
                                throw new RuntimeException(aa.d.o("error in parsing \"", trim, "\""), e10);
                            }
                        }
                        arrayList.add(new i0.d(trim.charAt(i10), fArr));
                    }
                    i12 = i11;
                    i11++;
                    i10 = 0;
                }
                i11++;
            }
            trim = str.substring(i12, i11).trim();
            if (!trim.isEmpty()) {
            }
            i12 = i11;
            i11++;
            i10 = 0;
        }
        if (i11 - i12 != 1 || i12 >= str.length()) {
            i9 = 0;
        } else {
            i9 = 0;
            arrayList.add(new i0.d(str.charAt(i12), new float[0]));
        }
        return (i0.d[]) arrayList.toArray(new i0.d[i9]);
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
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            dVarArr2[i9] = new i0.d(dVarArr[i9]);
        }
        return dVarArr2;
    }
}
