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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class DictationAsr {
    public static boolean c;
    public static int i;
    public static volatile nm3[] a = new nm3[0];
    public static volatile String[] b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static final ArrayList g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(String str) {
        String string = uc7.e1().getString("asr_langs", null);
        if (string != null) {
            return qd4.y(",", string, ",").contains("," + str + ",");
        }
        for (nm3 nm3Var : O()) {
            if (nm3Var.c(str) && z(nm3Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(nm3 nm3Var) {
        return (nm3Var == null || nm3Var.f == 0) ? false : true;
    }

    public static boolean C(int i2) {
        if (yac.h(i2).p()) {
            return uc7.e1().getBoolean("asr_local_premium", false);
        }
        return true;
    }

    public static boolean D(nm3 nm3Var) {
        if (nm3Var != null) {
            if (uc7.e1().getBoolean("tinyasr_manual_" + nm3Var.a, false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E() {
        boolean z = f11.a;
        return uc7.e1().getBoolean("asr_show_detected", false);
    }

    public static boolean F() {
        return x(yac.t0) && qn3.h();
    }

    public static boolean G() {
        if (F()) {
            return l() || qn3.b();
        }
        return false;
    }

    public static void H(String str, boolean[] zArr, s2c s2cVar, pm3 pm3Var) {
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
                pm3Var = r(fArr, pm3Var);
            }
            hl.c3(new fm3(zArr, pm3Var, s2cVar, fArr));
        } else {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            hl.c3(new em3(zArr, s2cVar, b2));
        }
    }

    public static String[] I() {
        if (!c) {
            T();
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(nm3 nm3Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(s(), nm3Var.b());
        File file2 = new File(s(), "silero_vad.onnx");
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + nm3Var.a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                qn3.g(file);
                SharedPreferences.Editor edit = uc7.e1().edit();
                StringBuilder sb = new StringBuilder("tinyasr_checked_");
                sb.append(nm3Var.a);
                edit.remove(sb.toString()).apply();
                nm3Var.i = false;
                if (nm3Var.f == 0) {
                    hl.c3(new hm3(z, nm3Var, objArr4 == true ? 1 : 0));
                }
                o();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                nm3Var.d = nativeLangs;
            }
            synchronized (nm3Var) {
                long j = nm3Var.f;
                nm3Var.f = nativeLoad;
                if (j != 0) {
                    if (nm3Var.g > 0) {
                        nm3Var.h.add(Long.valueOf(j));
                    } else {
                        nativeFree(j);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + nm3Var.a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            hl.c3(new hm3(true, nm3Var, objArr3 == true ? 1 : 0));
        } catch (Throwable th) {
            Log.e("Dictation", "tinyasr: load failed", th);
            nm3Var.i = false;
            hl.c3(new hm3(objArr2 == true ? 1 : 0, nm3Var, objArr == true ? 1 : 0));
        }
    }

    public static void K(String str) {
        if (h.remove(str) != null) {
            o();
        }
    }

    public static boolean L(long[] jArr) {
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

    public static nm3 M(String str, pm3 pm3Var, boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2 = z ? null : (ArrayList) pm3Var.d;
        nm3 nm3Var = (nm3) pm3Var.b;
        if (nm3Var.c(str) && k(str, nm3Var, arrayList2)) {
            return nm3Var;
        }
        boolean z3 = z || z2 || (arrayList2 != null && arrayList2.contains(str)) || (!y() && A(str));
        for (nm3 nm3Var2 : O()) {
            if (nm3Var2.c(str) && z(nm3Var2) && ((z3 || D(nm3Var2)) && k(str, nm3Var2, arrayList2))) {
                return nm3Var2;
            }
        }
        nm3 N = N(str);
        if (N == null || (((arrayList = (ArrayList) pm3Var.d) == null || !arrayList.contains(str)) && !(z2 && k(str, N, arrayList2)))) {
            return null;
        }
        return N;
    }

    public static nm3 N(String str) {
        nm3 nm3Var = null;
        for (nm3 nm3Var2 : O()) {
            if (nm3Var2.c(str) && (nm3Var == null || S(nm3Var2, str) > S(nm3Var, str))) {
                nm3Var = nm3Var2;
            }
        }
        return nm3Var;
    }

    public static nm3[] O() {
        if (!c) {
            T();
        }
        return a;
    }

    public static String P(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void Q() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void R(mm3 mm3Var, boolean[] zArr, String str, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        hl.c3(new va7((Object) zArr, (Object) mm3Var, (Object) str, (Object) iArr, z, (byte) 9));
    }

    public static int S(nm3 nm3Var, String str) {
        String[] d2 = nm3Var.d(str);
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

    public static synchronized void T() {
        nm3 nm3Var;
        int i2;
        String[] strArr;
        synchronized (DictationAsr.class) {
            c = true;
            nm3[] nm3VarArr = a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            File[] listFiles = s().listFiles();
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
            ArrayList a2 = qn3.a();
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
                            if (a0(strArr4, strArr2)) {
                                strArr3 = strArr4;
                            }
                        }
                        j(arrayList, nm3VarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
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
                    z |= a0(((nm3) obj2).c, strArr5);
                }
                if (!z) {
                    j(arrayList, nm3VarArr, strArr5, strArr5, new File(s(), P(strArr5) + ".tzf").length());
                }
                i8 = i9;
            }
            loop6: while (true) {
                int size5 = arrayList.size();
                int i11 = i3;
                while (i11 < size5) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    nm3Var = (nm3) obj3;
                    String[] strArr6 = nm3Var.b;
                    int length2 = strArr6.length;
                    int i12 = i3;
                    int i13 = i12;
                    while (i12 < length2) {
                        String str = strArr6[i12];
                        int S = S(nm3Var, str);
                        int size6 = arrayList.size();
                        int i14 = i3;
                        int i15 = i14;
                        while (i15 < size6) {
                            Object obj4 = arrayList.get(i15);
                            i15++;
                            nm3 nm3Var2 = (nm3) obj4;
                            if (nm3Var2 != nm3Var) {
                                i14 = Math.max(i14, S(nm3Var2, str));
                            }
                        }
                        if (i14 < S || i14 == 0) {
                            i2 = i3;
                            break;
                        } else {
                            i13 |= i14 > S ? 1 : i3;
                            i12++;
                        }
                    }
                    i2 = 1;
                    int size7 = arrayList.size();
                    int i16 = i3;
                    while (i16 < size7) {
                        Object obj5 = arrayList.get(i16);
                        i16++;
                        nm3 nm3Var3 = (nm3) obj5;
                        if (i13 == 0 && nm3Var3 != nm3Var) {
                            int length3 = nm3Var3.b.length;
                            String[] strArr7 = nm3Var.b;
                            if (length3 > strArr7.length) {
                                int length4 = strArr7.length;
                                boolean z2 = true;
                                for (int i17 = i3; i17 < length4; i17++) {
                                    String str2 = strArr7[i17];
                                    z2 &= S(nm3Var3, str2) >= S(nm3Var, str2);
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
                arrayList.remove(nm3Var);
                i3 = 0;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size8 = arrayList.size();
            int i18 = 0;
            while (i18 < size8) {
                Object obj6 = arrayList.get(i18);
                i18++;
                Collections.addAll(linkedHashSet, ((nm3) obj6).b);
            }
            a = (nm3[]) arrayList.toArray(new nm3[0]);
            b = (String[]) linkedHashSet.toArray(new String[0]);
        }
    }

    public static void U(nm3 nm3Var) {
        synchronized (nm3Var) {
            int i2 = nm3Var.g - 1;
            nm3Var.g = i2;
            if (i2 > 0) {
                return;
            }
            ArrayList arrayList = nm3Var.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                nativeFree(((Long) obj).longValue());
            }
            nm3Var.h.clear();
        }
    }

    public static void V(Runnable runnable) {
        g.remove(runnable);
    }

    public static pm3 W(String str, ArrayList arrayList, ArrayList arrayList2) {
        nm3 N = N(str);
        byte b2 = 0;
        if (N != null) {
            int i2 = -1;
            for (nm3 nm3Var : O()) {
                if (nm3Var.c(str)) {
                    int S = (z(nm3Var) ? 1 : 0) + (S(nm3Var, str) * 1000);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && nm3Var.c(str2)) {
                            S += 10;
                        }
                    }
                    if (S > i2) {
                        N = nm3Var;
                        i2 = S;
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
            if (!str3.equals(str) && N.c(str3)) {
                sb.append(',');
                sb.append(str3);
            }
        }
        return new pm3(N, sb.toString(), arrayList2, b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pm3 X(ArrayList arrayList) {
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
        if (!y()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : I()) {
                if (A(str)) {
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
                return W(str2, arrayList3, arrayList2);
            }
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            String str4 = (String) obj3;
            if (N(str4) != null) {
                return W(str4, arrayList2, arrayList2);
            }
        }
        nm3[] O = O();
        nm3 nm3Var = null;
        if (O.length == 0) {
            qn3.j();
            return null;
        }
        int length = O.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            nm3 nm3Var2 = O[i5];
            if (z(nm3Var2) && D(nm3Var2)) {
                nm3Var = nm3Var2;
                break;
            }
            i5++;
        }
        for (nm3 nm3Var3 : O) {
            if (nm3Var == null && z(nm3Var3)) {
                nm3Var = nm3Var3;
            }
        }
        if (nm3Var == null) {
            nm3Var = O[0];
        }
        return new pm3((Object) nm3Var, (Object) TextUtils.join(",", nm3Var.b), (Object) arrayList2, (byte) (objArr == true ? 1 : 0));
    }

    public static pm3 Y(String[] strArr, float[] fArr, pm3 pm3Var, boolean z) {
        if (strArr == null || fArr == null || strArr.length != fArr.length) {
            return null;
        }
        nm3[] O = O();
        if (O.length == 0) {
            return null;
        }
        nm3[] nm3VarArr = new nm3[fArr.length];
        float[] fArr2 = new float[O.length];
        byte b2 = 0;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2] >= 0.1f) {
                nm3 M = M(strArr[i2], pm3Var, z, false);
                nm3VarArr[i2] = M;
                if (M != null) {
                    for (int i3 = 0; i3 < O.length; i3++) {
                        if (O[i3] == nm3VarArr[i2]) {
                            fArr2[i3] = fArr2[i3] + fArr[i2];
                        }
                    }
                }
            }
        }
        int i4 = 0;
        for (int i5 = 1; i5 < O.length; i5++) {
            if (fArr2[i5] > fArr2[i4]) {
                i4 = i5;
            }
        }
        if (fArr2[i4] == 0.0f) {
            return null;
        }
        nm3 nm3Var = O[i4];
        StringBuilder sb = new StringBuilder();
        int length = fArr.length;
        Integer[] numArr = new Integer[length];
        for (int i6 = 0; i6 < length; i6++) {
            numArr[i6] = Integer.valueOf(i6);
        }
        Arrays.sort(numArr, new gm3(fArr, b2));
        for (int i7 = 0; i7 < length; i7++) {
            int intValue = numArr[i7].intValue();
            if (fArr[intValue] >= 0.1f && nm3VarArr[intValue] == nm3Var) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(strArr[intValue]);
            }
        }
        String t = pm3Var.t();
        if (nm3Var.c(t)) {
            if (!("," + ((Object) sb) + ",").contains("," + t + ",")) {
                sb.append(',');
                sb.append(t);
            }
        }
        return new pm3(nm3Var, sb.toString(), (ArrayList) pm3Var.d, b2);
    }

    public static pm3 Z(String str, pm3 pm3Var, boolean z) {
        nm3 M = M(str, pm3Var, z, true);
        if (M == null) {
            return null;
        }
        return new pm3((Object) M, (Object) str, pm3Var.d, (byte) 0);
    }

    public static boolean a0(String[] strArr, String[] strArr2) {
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

    public static void b0(String str) {
        uc7.e1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void c0(boolean z) {
        uc7.e1().edit().putBoolean("asr_auto", z).apply();
    }

    public static void d0(String str, String str2) {
        uc7.e1().edit().putString("asr_variant_" + str, str2).apply();
    }

    public static String e0() {
        if (y()) {
            return null;
        }
        String str = null;
        for (String str2 : I()) {
            if (A(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void f0(float[] fArr, pm3 pm3Var, mm3 mm3Var, boolean[] zArr) {
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        nm3 nm3Var = (nm3) pm3Var.b;
        long h2 = h(nm3Var);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (h2 == 0) {
            nativeFileNew = 0;
        } else {
            nativeFileNew = nativeFileNew(h2, fArr, nm3Var.a((String) pm3Var.c), xea.o() == 0 ? 2 : 4);
        }
        if (nativeFileNew == 0) {
            if (h2 != 0) {
                U(nm3Var);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            hl.c3(new wd3(zArr, mm3Var, (byte) 14));
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    m(sb, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e2) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e2);
                }
                R(mm3Var, zArr, sb.toString(), arrayList, false);
            } catch (Throwable th) {
                nativeFileFree(nativeFileNew);
                U(nm3Var);
                throw th;
            }
        }
        Log.d("Dictation", "tinyasr: file " + pm3Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        U(nm3Var);
        R(mm3Var, zArr, sb.toString(), arrayList, true);
    }

    public static nm3 g0(String str) {
        for (nm3 nm3Var : O()) {
            if (nm3Var.c(str) && z(nm3Var)) {
                ArrayList a2 = qn3.a();
                if (qn3.i(qn3.f(a2, nm3Var.c), new File(s(), nm3Var.b())) || qn3.i(qn3.f(a2, "silero-vad"), new File(s(), "silero_vad.onnx"))) {
                    return nm3Var;
                }
            }
        }
        return null;
    }

    public static long h(nm3 nm3Var) {
        long j;
        synchronized (nm3Var) {
            if (nm3Var.f != 0) {
                nm3Var.g++;
            }
            j = nm3Var.f;
        }
        return j;
    }

    public static String h0(ArrayList arrayList) {
        if (arrayList.size() < 2 || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        int i2 = 0;
        String script = ULocale.addLikelySubtags(a3.a(n((String) arrayList.get(0)))).getScript();
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

    public static void i(Runnable runnable) {
        g.add(runnable);
    }

    public static String i0(nm3 nm3Var, String str) {
        String[] d2 = nm3Var.d(str);
        if (d2.length == 0) {
            return str;
        }
        String string = uc7.e1().getString("asr_variant_" + str, null);
        int length = d2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = d2[i2];
            if (str2.equalsIgnoreCase(string)) {
                return str2;
            }
        }
        return d2[0];
    }

    public static void j(ArrayList arrayList, nm3[] nm3VarArr, String[] strArr, String[] strArr2, long j) {
        String P = P(strArr);
        List asList = Arrays.asList(strArr2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(n((String) it.next()));
        }
        String[] strArr3 = (String[]) linkedHashSet.toArray(new String[0]);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((nm3) obj).a.equals(P)) {
                return;
            }
        }
        for (nm3 nm3Var : nm3VarArr) {
            if (nm3Var.a.equals(P)) {
                if (j > 0) {
                    nm3Var.e = j;
                }
                nm3Var.c = strArr2;
                arrayList.add(nm3Var);
                return;
            }
        }
        arrayList.add(new nm3(P, strArr3, strArr2, j));
    }

    public static int j0() {
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

    public static boolean k(String str, nm3 nm3Var, ArrayList arrayList) {
        if (arrayList == null || "en".equals(str) || arrayList.contains(str)) {
            return true;
        }
        if (!y() && A(str)) {
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            if (!"en".equals(str2) && nm3Var.c(str2)) {
                return false;
            }
        }
        return true;
    }

    public static void k0(nm3 nm3Var, boolean z, om3 om3Var) {
        if (nm3Var.f != 0) {
            om3Var.a(true);
            return;
        }
        byte b2 = 0;
        if (!z(nm3Var) && !z && !qn3.b()) {
            om3Var.a(false);
            return;
        }
        nm3Var.l.add(om3Var);
        if (!z(nm3Var)) {
            u(nm3Var, false);
        } else {
            if (nm3Var.i) {
                return;
            }
            nm3Var.i = true;
            d.execute(new km3(nm3Var, b2));
        }
    }

    public static boolean l() {
        for (nm3 nm3Var : O()) {
            if (z(nm3Var)) {
                return true;
            }
        }
        return false;
    }

    public static void m(StringBuilder sb, JSONArray jSONArray, ArrayList arrayList) {
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

    public static String n(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.toLowerCase(Locale.ROOT);
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

    public static void o() {
        hl.c3(new jm3((byte) 0));
    }

    public static String p(String str, String str2, boolean z) {
        return str.isEmpty() ? str2 : str2.isEmpty() ? str : z ? str.concat(str2) : qd4.y(str, " ", str2);
    }

    public static void q() {
        for (nm3 nm3Var : O()) {
            synchronized (nm3Var) {
                if (nm3Var.f != 0) {
                    if (nm3Var.g > 0) {
                        nm3Var.h.add(Long.valueOf(nm3Var.f));
                    } else {
                        nativeFree(nm3Var.f);
                    }
                    nm3Var.f = 0L;
                }
                nm3Var.i = false;
            }
        }
        File[] listFiles = s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = a.b;
        ExecutorService executorService = DictationLid.a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        qn3.g(file2);
        uc7.e1().edit().remove("tinylid_etag").remove("tinylid_checked").remove("tinylid_lang").apply();
        DictationLid.e = false;
        DictationLid.a.execute(new jm3((byte) 2));
        SharedPreferences.Editor edit = uc7.e1().edit();
        for (String str : uc7.e1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_") || str.startsWith("tinyasr_manual_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = uc7.e1().edit();
        for (String str2 : uc7.e1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        T();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pm3 r(float[] fArr, pm3 pm3Var) {
        float[] fArr2;
        mn3 l;
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
        pm3 pm3Var2 = null;
        if (DictationLid.c != 0) {
            try {
                fArr2 = (float[]) DictationLid.a.submit(new i73(bArr, iArr)).get();
            } catch (Exception unused2) {
            }
            l = DictationLid.l(0.6f, fArr2);
            if (l != null) {
                boolean z = l.c;
                String str = l.a;
                if (z) {
                    pm3Var2 = Z(str, pm3Var, true);
                } else if (!"other".equals(str) || l.b < 0.6f) {
                    pm3Var2 = Y(DictationLid.d, fArr2, pm3Var, true);
                }
            }
            if (pm3Var2 == null || (l != null && !"nospeech".equals(l.a))) {
                pm3Var = pm3Var2;
            }
            StringBuilder sb = new StringBuilder("tinylid: file, ");
            sb.append(iArr[0]);
            sb.append(" ms speech in ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb.append(" ms: ");
            sb.append(l);
            sb.append(" → ");
            sb.append(pm3Var == null ? pm3Var : "unknown language");
            Log.d("Dictation", sb.toString());
            return pm3Var;
        }
        fArr2 = null;
        l = DictationLid.l(0.6f, fArr2);
        if (l != null) {
        }
        if (pm3Var2 == null) {
        }
        pm3Var = pm3Var2;
        StringBuilder sb2 = new StringBuilder("tinylid: file, ");
        sb2.append(iArr[0]);
        sb2.append(" ms speech in ");
        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        sb2.append(" ms: ");
        sb2.append(l);
        sb2.append(" → ");
        sb2.append(pm3Var == null ? pm3Var : "unknown language");
        Log.d("Dictation", sb2.toString());
        return pm3Var;
    }

    public static File s() {
        return new File(a.b.getFilesDir(), "tinyasr");
    }

    public static void t(nm3 nm3Var) {
        if (nm3Var == null || z(nm3Var)) {
            return;
        }
        uc7.e1().edit().putBoolean("tinyasr_manual_" + nm3Var.a, true).apply();
        u(nm3Var, false);
    }

    public static void u(nm3 nm3Var, boolean z) {
        long j;
        if (nm3Var.j) {
            return;
        }
        byte b2 = 1;
        nm3Var.j = true;
        nm3Var.k = 0.0f;
        if (!new File(s(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f2 = qn3.f(qn3.a(), "silero-vad");
            if ((f2 != null ? f2.document.size : 0L) > 0) {
                TLRPC.TL_transcriptionModel f3 = qn3.f(qn3.a(), "silero-vad");
                j = f3 != null ? f3.document.size : 0L;
            } else {
                j = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j});
            o();
        }
        if (!new File(s(), nm3Var.b()).exists()) {
            h.putIfAbsent(nm3Var.b(), new long[]{0, nm3Var.e});
            o();
        }
        o();
        e.execute(new hm3(z, nm3Var, b2));
    }

    public static int v(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, nm3 nm3Var, boolean z) {
        File file = new File(s(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return qn3.c(tL_transcriptionModel, file, z, new fu2((Object) str, (Object) nm3Var, (Object) new long[]{0}, (byte) 7));
        } finally {
            K(str);
        }
    }

    public static boolean w(JSONArray jSONArray, JSONArray jSONArray2) {
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
    public static boolean x(int i2) {
        boolean z;
        if (yac.q(i2)) {
            uc7 s1 = uc7.s1(i2);
            String str = s1.k4.m0.f;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1609594047) {
                    if (hashCode != -318452137) {
                        if (hashCode == 270940796) {
                            str.equals("disabled");
                        }
                    } else if (str.equals("premium")) {
                        z = s1.getUserConfig().p();
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

    public static boolean y() {
        return uc7.e1().getBoolean("asr_auto", true);
    }

    public static boolean z(nm3 nm3Var) {
        return nm3Var != null && new File(s(), nm3Var.b()).exists() && new File(s(), "silero_vad.onnx").exists();
    }
}
