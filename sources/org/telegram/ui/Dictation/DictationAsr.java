package org.telegram.ui.Dictation;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.util.ULocale;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class DictationAsr {
    public static boolean c;
    public static int i;
    public static volatile vl3[] a = new vl3[0];
    public static volatile String[] b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static final ArrayList g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(vl3 vl3Var) {
        return (vl3Var == null || vl3Var.f == 0) ? false : true;
    }

    public static boolean B(int i2) {
        return na7.c1().getBoolean(y6c.h(i2).p() ? "asr_local_premium" : "asr_local_free", !y6c.h(i2).p());
    }

    public static boolean C(int i2) {
        return w(i2) && zm3.h();
    }

    public static boolean D() {
        return w(y6c.t0) && zm3.h();
    }

    public static boolean E() {
        if (D()) {
            for (vl3 vl3Var : M()) {
                if (y(vl3Var)) {
                    return true;
                }
            }
            if (zm3.b()) {
                return true;
            }
        }
        return false;
    }

    public static void F(String str, boolean[] zArr, syb sybVar, xl3 xl3Var) {
        float[] fArr;
        try {
            fArr = nativeDecode(str);
        } catch (Throwable th) {
            Log.e("Dictation", "tinyasr: decode failed", th);
            fArr = null;
        }
        byte b2 = 0;
        if (fArr != null) {
            if (!zArr[0]) {
                xl3Var = q(fArr, xl3Var);
            }
            gl.d3(new ol3(zArr, xl3Var, sybVar, fArr));
        } else {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            gl.d3(new nl3(zArr, sybVar, b2));
        }
    }

    public static String[] G() {
        if (!c) {
            R();
        }
        return b;
    }

    public static void H(vl3 vl3Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(r(), vl3Var.b());
        File file2 = new File(r(), "silero_vad.onnx");
        byte b2 = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        boolean z = false;
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + vl3Var.a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                zm3.g(file);
                SharedPreferences.Editor edit = na7.c1().edit();
                StringBuilder sb = new StringBuilder("tinyasr_checked_");
                sb.append(vl3Var.a);
                edit.remove(sb.toString()).apply();
                vl3Var.i = false;
                if (vl3Var.f == 0) {
                    gl.d3(new sl3(z, vl3Var, b2));
                }
                n();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                vl3Var.d = nativeLangs;
            }
            synchronized (vl3Var) {
                long j = vl3Var.f;
                vl3Var.f = nativeLoad;
                if (j != 0) {
                    if (vl3Var.g > 0) {
                        vl3Var.h.add(Long.valueOf(j));
                    } else {
                        nativeFree(j);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + vl3Var.a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            gl.d3(new sl3(c4 == true ? 1 : 0, vl3Var, c3 == true ? 1 : 0));
        } catch (Throwable th) {
            Log.e("Dictation", "tinyasr: load failed", th);
            vl3Var.i = false;
            gl.d3(new sl3(z, vl3Var, c2 == true ? 1 : 0));
        }
    }

    public static void I(String str) {
        if (h.remove(str) != null) {
            n();
        }
    }

    public static boolean J(long[] jArr) {
        long j = 0;
        long j2 = 0;
        for (long[] jArr2 : h.values()) {
            long j3 = jArr2[0];
            j += j3;
            j2 += Math.max(j3, jArr2[1]);
        }
        jArr[0] = j;
        jArr[1] = j2;
        return !r0.isEmpty();
    }

    public static vl3 K(String str, xl3 xl3Var, boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2 = z ? null : (ArrayList) xl3Var.d;
        vl3 vl3Var = (vl3) xl3Var.b;
        if (vl3Var.c(str) && k(str, vl3Var, arrayList2)) {
            return vl3Var;
        }
        for (vl3 vl3Var2 : M()) {
            if (vl3Var2.c(str) && y(vl3Var2) && k(str, vl3Var2, arrayList2)) {
                return vl3Var2;
            }
        }
        vl3 L = L(str);
        if (L == null || (((arrayList = (ArrayList) xl3Var.d) == null || !arrayList.contains(str)) && !(z2 && k(str, L, arrayList2)))) {
            return null;
        }
        return L;
    }

    public static vl3 L(String str) {
        vl3 vl3Var = null;
        for (vl3 vl3Var2 : M()) {
            if (vl3Var2.c(str) && (vl3Var == null || Q(vl3Var2, str) > Q(vl3Var, str))) {
                vl3Var = vl3Var2;
            }
        }
        return vl3Var;
    }

    public static vl3[] M() {
        if (!c) {
            R();
        }
        return a;
    }

    public static String N(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void O() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void P(ul3 ul3Var, boolean[] zArr, String str, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        gl.d3(new z77((Object) zArr, (Object) ul3Var, (Object) str, (Object) iArr, z, (byte) 9));
    }

    public static int Q(vl3 vl3Var, String str) {
        String[] d2 = vl3Var.d(str);
        int length = d2.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= length) {
                return (d2.length << 1) + i3;
            }
            if (d2[i2].indexOf(45) < 0) {
                i4 = 0;
            }
            i3 |= i4;
            i2++;
        }
    }

    public static synchronized void R() {
        vl3 vl3Var;
        int i2;
        String[] strArr;
        synchronized (DictationAsr.class) {
            c = true;
            vl3[] vl3VarArr = a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            File[] listFiles = r().listFiles();
            int i3 = 0;
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.endsWith(".tzf")) {
                        String substring = name.substring(0, name.length() - 4);
                        if (substring.indexOf(43) < 0) {
                            String[] split = substring.split("-");
                            int length = split.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    strArr = split;
                                    break;
                                } else {
                                    if (!split[i4].matches("[a-z]{2,3}")) {
                                        strArr = new String[]{substring};
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        } else {
                            strArr = substring.split("\\+");
                        }
                        arrayList2.add(strArr);
                    }
                }
            }
            ArrayList a2 = zm3.a();
            if (a2 != null) {
                int size = a2.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) a2.get(i5);
                    if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                        String[] strArr2 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
                        int size2 = arrayList2.size();
                        String[] strArr3 = strArr2;
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            String[] strArr4 = (String[]) obj;
                            if (Y(strArr4, strArr2)) {
                                strArr3 = strArr4;
                            }
                        }
                        j(arrayList, vl3VarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
                    }
                    i5 = i6;
                }
            }
            int size3 = arrayList2.size();
            int i8 = 0;
            while (i8 < size3) {
                int i9 = i8 + 1;
                String[] strArr5 = (String[]) arrayList2.get(i8);
                int size4 = arrayList.size();
                boolean z = false;
                int i10 = 0;
                while (i10 < size4) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    z |= Y(((vl3) obj2).c, strArr5);
                }
                if (!z) {
                    j(arrayList, vl3VarArr, strArr5, strArr5, new File(r(), N(strArr5) + ".tzf").length());
                }
                i8 = i9;
            }
            loop6: while (true) {
                int size5 = arrayList.size();
                int i11 = i3;
                while (i11 < size5) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    vl3Var = (vl3) obj3;
                    String[] strArr6 = vl3Var.b;
                    int length2 = strArr6.length;
                    int i12 = i3;
                    int i13 = i12;
                    while (i12 < length2) {
                        String str = strArr6[i12];
                        int Q = Q(vl3Var, str);
                        int size6 = arrayList.size();
                        int i14 = i3;
                        int i15 = i14;
                        while (i15 < size6) {
                            Object obj4 = arrayList.get(i15);
                            i15++;
                            vl3 vl3Var2 = (vl3) obj4;
                            if (vl3Var2 != vl3Var) {
                                i14 = Math.max(i14, Q(vl3Var2, str));
                            }
                        }
                        if (i14 < Q || i14 == 0) {
                            i2 = i3;
                            break;
                        } else {
                            i13 |= i14 > Q ? 1 : i3;
                            i12++;
                        }
                    }
                    i2 = 1;
                    int size7 = arrayList.size();
                    int i16 = i3;
                    while (i16 < size7) {
                        Object obj5 = arrayList.get(i16);
                        i16++;
                        vl3 vl3Var3 = (vl3) obj5;
                        if (i13 == 0 && vl3Var3 != vl3Var) {
                            int length3 = vl3Var3.b.length;
                            String[] strArr7 = vl3Var.b;
                            if (length3 > strArr7.length) {
                                int length4 = strArr7.length;
                                boolean z2 = true;
                                for (int i17 = i3; i17 < length4; i17++) {
                                    String str2 = strArr7[i17];
                                    z2 &= Q(vl3Var3, str2) >= Q(vl3Var, str2);
                                }
                                if (z2) {
                                    i2 = 1;
                                    i13 = 1;
                                }
                            }
                        }
                        i3 = 0;
                    }
                    if (i2 == 0 || i13 == 0) {
                        i3 = 0;
                    }
                }
                arrayList.remove(vl3Var);
                i3 = 0;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size8 = arrayList.size();
            int i18 = 0;
            while (i18 < size8) {
                Object obj6 = arrayList.get(i18);
                i18++;
                Collections.addAll(linkedHashSet, ((vl3) obj6).b);
            }
            a = (vl3[]) arrayList.toArray(new vl3[0]);
            b = (String[]) linkedHashSet.toArray(new String[0]);
        }
    }

    public static void S(vl3 vl3Var) {
        synchronized (vl3Var) {
            int i2 = vl3Var.g - 1;
            vl3Var.g = i2;
            if (i2 > 0) {
                return;
            }
            ArrayList arrayList = vl3Var.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                nativeFree(((Long) obj).longValue());
            }
            vl3Var.h.clear();
        }
    }

    public static void T(Runnable runnable) {
        g.remove(runnable);
    }

    public static xl3 U(String str, ArrayList arrayList, ArrayList arrayList2) {
        vl3 L = L(str);
        byte b2 = 0;
        if (L != null) {
            int i2 = -1;
            for (vl3 vl3Var : M()) {
                if (vl3Var.c(str)) {
                    int Q = (y(vl3Var) ? 1 : 0) + (Q(vl3Var, str) * 1000);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && vl3Var.c(str2)) {
                            Q += 10;
                        }
                    }
                    if (Q > i2) {
                        L = vl3Var;
                        i2 = Q;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(str);
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && L.c(str3)) {
                sb.append(',');
                sb.append(str3);
            }
        }
        return new xl3(L, sb.toString(), arrayList2, b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xl3 V(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        Object[] objArr = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList2.contains(language)) {
                    arrayList2.add(language);
                }
            }
        }
        if (!x()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : G()) {
                if (z(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                String str2 = (String) arrayList3.get(0);
                int size2 = arrayList2.size();
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj2;
                    if (arrayList3.contains(str3)) {
                        str2 = str3;
                        break;
                    }
                }
                return U(str2, arrayList3, arrayList2);
            }
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            String str4 = (String) obj3;
            if (L(str4) != null) {
                return U(str4, arrayList2, arrayList2);
            }
        }
        vl3[] M = M();
        if (M.length == 0) {
            zm3.j();
            return null;
        }
        vl3 vl3Var = M[0];
        int length = M.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            vl3 vl3Var2 = M[i5];
            if (y(vl3Var2)) {
                vl3Var = vl3Var2;
                break;
            }
            i5++;
        }
        return new xl3((Object) vl3Var, (Object) TextUtils.join(",", vl3Var.b), (Object) arrayList2, (byte) (objArr == true ? 1 : 0));
    }

    public static xl3 W(String[] strArr, float[] fArr, xl3 xl3Var, boolean z) {
        if (strArr == null || fArr == null || strArr.length != fArr.length) {
            return null;
        }
        vl3[] M = M();
        if (M.length == 0) {
            return null;
        }
        vl3[] vl3VarArr = new vl3[fArr.length];
        float[] fArr2 = new float[M.length];
        byte b2 = 0;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2] >= 0.1f) {
                vl3 K = K(strArr[i2], xl3Var, z, false);
                vl3VarArr[i2] = K;
                if (K != null) {
                    for (int i3 = 0; i3 < M.length; i3++) {
                        if (M[i3] == vl3VarArr[i2]) {
                            fArr2[i3] = fArr2[i3] + fArr[i2];
                        }
                    }
                }
            }
        }
        int i4 = 0;
        for (int i5 = 1; i5 < M.length; i5++) {
            if (fArr2[i5] > fArr2[i4]) {
                i4 = i5;
            }
        }
        if (fArr2[i4] == 0.0f) {
            return null;
        }
        vl3 vl3Var = M[i4];
        StringBuilder sb = new StringBuilder();
        int length = fArr.length;
        Integer[] numArr = new Integer[length];
        for (int i6 = 0; i6 < length; i6++) {
            numArr[i6] = Integer.valueOf(i6);
        }
        Arrays.sort(numArr, new ml3(fArr, b2));
        for (int i7 = 0; i7 < length; i7++) {
            int intValue = numArr[i7].intValue();
            if (fArr[intValue] >= 0.1f && vl3VarArr[intValue] == vl3Var) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(strArr[intValue]);
            }
        }
        String u = xl3Var.u();
        if (vl3Var.c(u)) {
            if (!("," + ((Object) sb) + ",").contains("," + u + ",")) {
                sb.append(',');
                sb.append(u);
            }
        }
        return new xl3(vl3Var, sb.toString(), (ArrayList) xl3Var.d, b2);
    }

    public static xl3 X(String str, xl3 xl3Var, boolean z) {
        vl3 K = K(str, xl3Var, z, true);
        if (K == null) {
            return null;
        }
        return new xl3((Object) K, (Object) str, xl3Var.d, (byte) 0);
    }

    public static boolean Y(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length];
        String[] strArr4 = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr3[i2] = strArr[i2].toLowerCase(Locale.ROOT);
        }
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            strArr4[i3] = strArr2[i3].toLowerCase(Locale.ROOT);
        }
        Arrays.sort(strArr3);
        Arrays.sort(strArr4);
        return Arrays.equals(strArr3, strArr4);
    }

    public static void Z(String str) {
        na7.c1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void a0(boolean z) {
        na7.c1().edit().putBoolean("asr_auto", z).apply();
    }

    public static void b0(String str, String str2) {
        na7.c1().edit().putString("asr_variant_" + str, str2).apply();
    }

    public static String c0() {
        if (x()) {
            return null;
        }
        String str = null;
        for (String str2 : G()) {
            if (z(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void d0(float[] fArr, xl3 xl3Var, ul3 ul3Var, boolean[] zArr) {
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        vl3 vl3Var = (vl3) xl3Var.b;
        long h2 = h(vl3Var);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (h2 == 0) {
            nativeFileNew = 0;
        } else {
            nativeFileNew = nativeFileNew(h2, fArr, vl3Var.a((String) xl3Var.c), gba.o() == 0 ? 2 : 4);
        }
        if (nativeFileNew == 0) {
            if (h2 != 0) {
                S(vl3Var);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            gl.d3(new wc3(zArr, ul3Var, (byte) 16));
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    l(sb, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e2) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e2);
                }
                P(ul3Var, zArr, sb.toString(), arrayList, false);
            } catch (Throwable th) {
                nativeFileFree(nativeFileNew);
                S(vl3Var);
                throw th;
            }
        }
        Log.d("Dictation", "tinyasr: file " + xl3Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        S(vl3Var);
        P(ul3Var, zArr, sb.toString(), arrayList, true);
    }

    public static vl3 e0(String str) {
        for (vl3 vl3Var : M()) {
            if (vl3Var.c(str) && y(vl3Var)) {
                ArrayList a2 = zm3.a();
                if (zm3.i(zm3.f(a2, vl3Var.c), new File(r(), vl3Var.b())) || zm3.i(zm3.f(a2, "silero-vad"), new File(r(), "silero_vad.onnx"))) {
                    return vl3Var;
                }
            }
        }
        return null;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.size() < 2 || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        int i2 = 0;
        String script = ULocale.addLikelySubtags(z2.a(m((String) arrayList.get(0)))).getScript();
        if (TextUtils.isEmpty(script)) {
            return null;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            String[] split = str.split("-");
            if (split.length == 2 && split[1].equalsIgnoreCase(script)) {
                return str;
            }
        }
        return null;
    }

    public static String g0(vl3 vl3Var, String str) {
        String[] d2 = vl3Var.d(str);
        if (d2.length == 0) {
            return str;
        }
        String string = na7.c1().getString("asr_variant_" + str, null);
        int length = d2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = d2[i2];
            if (str2.equalsIgnoreCase(string)) {
                return str2;
            }
        }
        return d2[0];
    }

    public static long h(vl3 vl3Var) {
        long j;
        synchronized (vl3Var) {
            if (vl3Var.f != 0) {
                vl3Var.g++;
            }
            j = vl3Var.f;
        }
        return j;
    }

    public static int h0() {
        int i2 = i;
        if (i2 != 0) {
            return i2;
        }
        try {
            int nativeVersion = nativeVersion();
            i = nativeVersion;
            return nativeVersion;
        } catch (Throwable unused) {
            i = 1;
            return 1;
        }
    }

    public static void i(Runnable runnable) {
        g.add(runnable);
    }

    public static void i0(vl3 vl3Var, boolean z, wl3 wl3Var) {
        if (vl3Var.f != 0) {
            wl3Var.a(true);
            return;
        }
        byte b2 = 0;
        if (!y(vl3Var) && !z && !zm3.b()) {
            wl3Var.a(false);
            return;
        }
        vl3Var.l.add(wl3Var);
        if (!y(vl3Var)) {
            t(vl3Var, false);
        } else {
            if (vl3Var.i) {
                return;
            }
            vl3Var.i = true;
            d.execute(new rl3(vl3Var, b2));
        }
    }

    public static void j(ArrayList arrayList, vl3[] vl3VarArr, String[] strArr, String[] strArr2, long j) {
        String N = N(strArr);
        List asList = Arrays.asList(strArr2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m((String) it.next()));
        }
        String[] strArr3 = (String[]) linkedHashSet.toArray(new String[0]);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((vl3) obj).a.equals(N)) {
                return;
            }
        }
        for (vl3 vl3Var : vl3VarArr) {
            if (vl3Var.a.equals(N)) {
                if (j > 0) {
                    vl3Var.e = j;
                }
                vl3Var.c = strArr2;
                arrayList.add(vl3Var);
                return;
            }
        }
        arrayList.add(new vl3(N, strArr3, strArr2, j));
    }

    public static boolean k(String str, vl3 vl3Var, ArrayList arrayList) {
        if (arrayList == null || "en".equals(str) || arrayList.contains(str)) {
            return true;
        }
        if (!x() && z(str)) {
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            if (!"en".equals(str2) && vl3Var.c(str2)) {
                return false;
            }
        }
        return true;
    }

    public static void l(StringBuilder sb, JSONArray jSONArray, ArrayList arrayList) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                String optString = optJSONObject != null ? optJSONObject.optString("text") : "";
                if (!optString.isEmpty()) {
                    if (sb.length() > 0 && !optJSONObject.optBoolean("join")) {
                        sb.append(' ');
                    }
                    if (arrayList != null) {
                        arrayList.add(Integer.valueOf(sb.length()));
                        arrayList.add(Integer.valueOf(optString.length() + sb.length()));
                        arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("start")) * 1000.0f)));
                        arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("end")) * 1000.0f)));
                    }
                    sb.append(optString);
                }
            }
        }
    }

    public static String m(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static void n() {
        gl.d3(new ql3((byte) 0));
    }

    private static native float[] nativeDecode(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFileFree(long j);

    private static native String nativeFileLang(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeFileNew(long j, float[] fArr, String str, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeFileNext(long j);

    private static native void nativeFree(long j);

    private static native String[] nativeLangs(long j);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeSessionFinish(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSessionFree(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeSessionNew(long j, String str, String str2, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeSessionPush(long j, byte[] bArr, int i2, int i3);

    private static native int nativeVersion();

    public static String o(String str, String str2, boolean z) {
        return str.isEmpty() ? str2 : str2.isEmpty() ? str : z ? str.concat(str2) : tb4.y(str, " ", str2);
    }

    public static void p() {
        for (vl3 vl3Var : M()) {
            synchronized (vl3Var) {
                if (vl3Var.f != 0) {
                    if (vl3Var.g > 0) {
                        vl3Var.h.add(Long.valueOf(vl3Var.f));
                    } else {
                        nativeFree(vl3Var.f);
                    }
                    vl3Var.f = 0L;
                }
                vl3Var.i = false;
            }
        }
        File[] listFiles = r().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = a.b;
        ExecutorService executorService = DictationLid.a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        zm3.g(file2);
        na7.c1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.e = false;
        DictationLid.a.execute(new ql3((byte) 2));
        SharedPreferences.Editor edit = na7.c1().edit();
        for (String str : na7.c1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = na7.c1().edit();
        for (String str2 : na7.c1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        R();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xl3 q(float[] fArr, xl3 xl3Var) {
        float[] fArr2;
        vm3 k;
        int min = Math.min(fArr.length, 1440000);
        byte[] bArr = new byte[min << 1];
        for (int i2 = 0; i2 < min; i2++) {
            int max = Math.max(-32768, Math.min(32767, Math.round(fArr[i2] * 32768.0f)));
            int i3 = i2 << 1;
            bArr[i3] = (byte) max;
            bArr[i3 + 1] = (byte) (max >> 8);
        }
        int[] iArr = {0};
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ExecutorService executorService = DictationLid.a;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 30000;
        synchronized (DictationLid.i) {
            while (true) {
                if ((DictationLid.c != 0 && !DictationLid.h) || (!DictationLid.f && !DictationLid.g)) {
                    break;
                }
                long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                if (elapsedRealtime3 <= 0) {
                    break;
                }
                try {
                    DictationLid.i.wait(elapsedRealtime3);
                } catch (InterruptedException unused) {
                }
            }
        }
        ExecutorService executorService2 = DictationLid.a;
        xl3 xl3Var2 = null;
        if (DictationLid.c != 0) {
            try {
                fArr2 = (float[]) DictationLid.a.submit(new p63(bArr, iArr)).get();
            } catch (Exception unused2) {
            }
            k = DictationLid.k(0.6f, fArr2);
            if (k != null) {
                boolean z = k.c;
                String str = k.a;
                if (z) {
                    xl3Var2 = X(str, xl3Var, true);
                } else if (!"other".equals(str) || k.b < 0.6f) {
                    xl3Var2 = W(DictationLid.d, fArr2, xl3Var, true);
                }
            }
            if (xl3Var2 == null || (k != null && !"nospeech".equals(k.a))) {
                xl3Var = xl3Var2;
            }
            StringBuilder sb = new StringBuilder("tinylid: file, ");
            sb.append(iArr[0]);
            sb.append(" ms speech in ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb.append(" ms: ");
            sb.append(k);
            sb.append(" → ");
            sb.append(xl3Var == null ? xl3Var : "unknown language");
            Log.d("Dictation", sb.toString());
            return xl3Var;
        }
        fArr2 = null;
        k = DictationLid.k(0.6f, fArr2);
        if (k != null) {
        }
        if (xl3Var2 == null) {
        }
        xl3Var = xl3Var2;
        StringBuilder sb2 = new StringBuilder("tinylid: file, ");
        sb2.append(iArr[0]);
        sb2.append(" ms speech in ");
        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        sb2.append(" ms: ");
        sb2.append(k);
        sb2.append(" → ");
        sb2.append(xl3Var == null ? xl3Var : "unknown language");
        Log.d("Dictation", sb2.toString());
        return xl3Var;
    }

    public static File r() {
        return new File(a.b.getFilesDir(), "tinyasr");
    }

    public static void s(vl3 vl3Var) {
        if (vl3Var == null || y(vl3Var)) {
            return;
        }
        t(vl3Var, false);
    }

    public static void t(vl3 vl3Var, boolean z) {
        long j;
        if (vl3Var.j) {
            return;
        }
        vl3Var.j = true;
        vl3Var.k = 0.0f;
        byte b2 = 0;
        if (!new File(r(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f2 = zm3.f(zm3.a(), "silero-vad");
            if ((f2 != null ? f2.document.size : 0L) > 0) {
                TLRPC.TL_transcriptionModel f3 = zm3.f(zm3.a(), "silero-vad");
                j = f3 != null ? f3.document.size : 0L;
            } else {
                j = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j});
            n();
        }
        if (!new File(r(), vl3Var.b()).exists()) {
            h.putIfAbsent(vl3Var.b(), new long[]{0, vl3Var.e});
            n();
        }
        n();
        e.execute(new sl3(z, vl3Var, b2));
    }

    public static int u(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, vl3 vl3Var, boolean z) {
        File file = new File(r(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return zm3.c(tL_transcriptionModel, file, z, new lt2((Object) str, (Object) vl3Var, (Object) new long[]{0}, (byte) 7));
        } finally {
            I(str);
        }
    }

    public static boolean v(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            jSONArray = jSONArray2;
        }
        JSONObject optJSONObject = jSONArray != null ? jSONArray.optJSONObject(0) : null;
        return optJSONObject != null && optJSONObject.optBoolean("join");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean w(int i2) {
        boolean z;
        if (y6c.q(i2)) {
            na7 q1 = na7.q1(i2);
            String str = q1.k4.f0.f;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1609594047) {
                    if (hashCode != -318452137) {
                        if (hashCode == 270940796) {
                            str.equals("disabled");
                        }
                    } else if (str.equals("premium")) {
                        z = q1.getUserConfig().p();
                        if (z) {
                            return true;
                        }
                    }
                } else if (str.equals("enabled")) {
                    z = true;
                    if (z) {
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    public static boolean x() {
        return na7.c1().getBoolean("asr_auto", true);
    }

    public static boolean y(vl3 vl3Var) {
        return vl3Var != null && new File(r(), vl3Var.b()).exists() && new File(r(), "silero_vad.onnx").exists();
    }

    public static boolean z(String str) {
        String string = na7.c1().getString("asr_langs", null);
        if (string != null) {
            return tb4.y(",", string, ",").contains("," + str + ",");
        }
        for (vl3 vl3Var : M()) {
            if (vl3Var.c(str) && y(vl3Var)) {
                return true;
            }
        }
        return false;
    }
}
