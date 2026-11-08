package h2;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class e {
    public static void a(String str, boolean z9) {
        if (z9) {
            return;
        }
        h9.g0 g0Var = h9.i0.b;
        throw new m(str, t1.e);
    }

    public static t1 b(g9.k kVar, ArrayList arrayList) {
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Bundle bundle = (Bundle) arrayList.get(i7);
            bundle.getClass();
            p10.c(kVar.apply(bundle));
        }
        return p10.f();
    }

    public static int[] c(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean d(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        a("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new m("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), h9.i0.u(Integer.valueOf(eglGetError)));
    }

    public static String e(StringBuilder sb2, int i7, int i10) {
        int i11;
        int i12;
        if (i7 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i7) == '/') {
            i7++;
        }
        int i13 = i7;
        int i14 = i13;
        while (i13 <= i10) {
            if (i13 == i10) {
                i11 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i11 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i11);
                i10 -= i11 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    i12 = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = i12 > i7 ? i12 : i7;
                    sb2.delete(i16, i11);
                    i10 -= i11 - i16;
                } else {
                    i12 = i13 + 1;
                }
                i14 = i12;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] c10 = c(str2);
        if (c10[0] != -1) {
            sb2.append(str2);
            e(sb2, c10[1], c10[2]);
            return sb2.toString();
        }
        int[] c11 = c(str);
        if (c10[3] == 0) {
            sb2.append((CharSequence) str, 0, c11[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (c10[2] == 0) {
            sb2.append((CharSequence) str, 0, c11[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i7 = c10[1];
        if (i7 != 0) {
            int i10 = c11[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return e(sb2, c10[1] + i10, i10 + c10[2]);
        }
        if (str2.charAt(i7) == '/') {
            sb2.append((CharSequence) str, 0, c11[1]);
            sb2.append(str2);
            int i11 = c11[1];
            return e(sb2, i11, c10[2] + i11);
        }
        int i12 = c11[0] + 2;
        int i13 = c11[1];
        if (i12 >= i13 || i13 != c11[2]) {
            int lastIndexOf = str.lastIndexOf(47, c11[2] - 1);
            int i14 = lastIndexOf == -1 ? c11[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return e(sb2, c11[1], i14 + c10[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = c11[1];
        return e(sb2, i15, c10[2] + i15 + 1);
    }

    public static Uri g(String str, String str2) {
        return Uri.parse(f(str, str2));
    }

    public static ArrayList h(Collection collection, g9.k kVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) kVar.apply(it.next()));
        }
        return arrayList;
    }
}
