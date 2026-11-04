package g2;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Bundle;
import android.text.TextUtils;
import g9.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class f {
    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        g9.g0 g0Var = g9.i0.b;
        throw new n(str, s1.e);
    }

    public static s1 b(f9.k kVar, ArrayList arrayList) {
        g9.f0 p10 = g9.i0.p();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Bundle bundle = (Bundle) arrayList.get(i3);
            bundle.getClass();
            p10.c(kVar.apply(bundle));
        }
        return p10.f();
    }

    public static int[] c(String str) {
        int i3;
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
            i3 = str.indexOf(47, indexOf4 + 3);
            if (i3 == -1 || i3 > indexOf2) {
                i3 = indexOf2;
            }
        } else {
            i3 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i3;
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
        throw new n("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), g9.i0.u(Integer.valueOf(eglGetError)));
    }

    public static String e(StringBuilder sb2, int i3, int i10) {
        int i11;
        int i12;
        if (i3 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i3) == '/') {
            i3++;
        }
        int i13 = i3;
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
                    int i16 = i12 > i3 ? i12 : i3;
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
        int[] c2 = c(str2);
        if (c2[0] != -1) {
            sb2.append(str2);
            e(sb2, c2[1], c2[2]);
            return sb2.toString();
        }
        int[] c10 = c(str);
        if (c2[3] == 0) {
            sb2.append((CharSequence) str, 0, c10[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (c2[2] == 0) {
            sb2.append((CharSequence) str, 0, c10[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i3 = c2[1];
        if (i3 != 0) {
            int i10 = c10[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return e(sb2, c2[1] + i10, i10 + c2[2]);
        }
        if (str2.charAt(i3) == '/') {
            sb2.append((CharSequence) str, 0, c10[1]);
            sb2.append(str2);
            int i11 = c10[1];
            return e(sb2, i11, c2[2] + i11);
        }
        int i12 = c10[0] + 2;
        int i13 = c10[1];
        if (i12 >= i13 || i13 != c10[2]) {
            int lastIndexOf = str.lastIndexOf(47, c10[2] - 1);
            int i14 = lastIndexOf == -1 ? c10[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return e(sb2, c10[1], i14 + c2[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = c10[1];
        return e(sb2, i15, c2[2] + i15 + 1);
    }

    public static Uri g(String str, String str2) {
        return Uri.parse(f(str, str2));
    }

    public static ArrayList h(Collection collection, f9.k kVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) kVar.apply(it.next()));
        }
        return arrayList;
    }
}
