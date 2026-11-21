package org.telegram.ui.Dictation;

import a3.h;
import a8.p0;
import ai.f1;
import ai.i;
import ai.j;
import ai.k;
import ai.l;
import ai.l1;
import ai.n;
import ai.o;
import ai.p;
import ai.t;
import ai.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.icu.util.ULocale;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
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
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h21;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class DictationAsr {
    public static boolean c;
    public static int i;
    public static volatile t[] a = new t[0];
    public static volatile String[] b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static final ArrayList g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(String str) {
        String string = mp.g1().getString("asr_langs", null);
        if (string != null) {
            return p0.p(",", string, ",").contains("," + str + ",");
        }
        for (t tVar : K()) {
            if (tVar.c(str) && y(tVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(int i7) {
        return mp.g1().getBoolean(j10.i(i7).q() ? "asr_local_premium" : "asr_local_free", !j10.i(i7).q());
    }

    public static boolean C() {
        return w(j10.t0) && l1.h();
    }

    public static boolean D() {
        if (C()) {
            for (t tVar : K()) {
                if (y(tVar)) {
                    return true;
                }
            }
            if (l1.b()) {
                return true;
            }
        }
        return false;
    }

    public static String[] E() {
        if (!c) {
            P();
        }
        return b;
    }

    public static void F(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(s(), tVar.b());
        File file2 = new File(s(), "silero_vad.onnx");
        boolean z10 = false;
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + tVar.a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                l1.g(file);
                SharedPreferences.Editor edit = mp.g1().edit();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(tVar.a);
                edit.remove(sb2.toString()).apply();
                tVar.i = false;
                if (tVar.f == 0) {
                    g0.g3(new p(z10, tVar, 1));
                }
                p();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                tVar.d = nativeLangs;
            }
            synchronized (tVar) {
                try {
                    long j3 = tVar.f;
                    tVar.f = nativeLoad;
                    if (j3 != 0) {
                        if (tVar.g > 0) {
                            tVar.h.add(Long.valueOf(j3));
                        } else {
                            nativeFree(j3);
                        }
                    }
                } finally {
                }
            }
            Log.d("Dictation", "tinyasr: " + tVar.a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            g0.g3(new p(true, tVar, 1));
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            tVar.i = false;
            g0.g3(new p(z10, tVar, 1));
        }
    }

    public static void G(String str) {
        if (h.remove(str) != null) {
            p();
        }
    }

    public static boolean H(long[] jArr) {
        long j3 = 0;
        long j10 = 0;
        for (long[] jArr2 : h.values()) {
            long j11 = jArr2[0];
            j3 += j11;
            j10 += Math.max(j11, jArr2[1]);
        }
        jArr[0] = j3;
        jArr[1] = j10;
        return !r0.isEmpty();
    }

    public static t I(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        List list2 = z10 ? null : (List) a0Var.d;
        t tVar = (t) a0Var.b;
        if (tVar.c(str) && m(str, tVar, list2)) {
            return tVar;
        }
        for (t tVar2 : K()) {
            if (tVar2.c(str) && y(tVar2) && m(str, tVar2, list2)) {
                return tVar2;
            }
        }
        t J = J(str);
        if (J != null && (((list = (List) a0Var.d) != null && list.contains(str)) || (z11 && m(str, J, list2)))) {
            return J;
        }
        return null;
    }

    public static t J(String str) {
        t tVar = null;
        for (t tVar2 : K()) {
            if (tVar2.c(str) && (tVar == null || O(tVar2, str) > O(tVar, str))) {
                tVar = tVar2;
            }
        }
        return tVar;
    }

    public static t[] K() {
        if (!c) {
            P();
        }
        return a;
    }

    public static String L(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void M() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void N(h21 h21Var, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.g3(new i(zArr, h21Var, str, iArr, z10, 0));
    }

    public static int O(t tVar, String str) {
        String[] d2 = tVar.d(str);
        int i7 = 0;
        for (String str2 : d2) {
            i7 |= str2.indexOf(45) >= 0 ? 1 : 0;
        }
        return (d2.length * 2) + i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        if (r10 == false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void P() {
        t tVar;
        String[] strArr;
        synchronized (DictationAsr.class) {
            try {
                c = true;
                t[] tVarArr = a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = s().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (name.endsWith(".tzf")) {
                            String substring = name.substring(0, name.length() - 4);
                            if (substring.indexOf(43) < 0) {
                                String[] split = substring.split("-");
                                int length = split.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= length) {
                                        strArr = split;
                                        break;
                                    } else {
                                        if (!split[i7].matches("[a-z]{2,3}")) {
                                            strArr = new String[]{substring};
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                            } else {
                                strArr = substring.split("\\+");
                            }
                            arrayList2.add(strArr);
                        }
                    }
                }
                ArrayList a10 = l1.a();
                if (a10 != null) {
                    int size = a10.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) a10.get(i10);
                        if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                            String[] strArr2 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
                            int size2 = arrayList2.size();
                            String[] strArr3 = strArr2;
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                String[] strArr4 = (String[]) obj;
                                if (W(strArr4, strArr2)) {
                                    strArr3 = strArr4;
                                }
                            }
                            l(arrayList, tVarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
                        }
                        i10 = i11;
                    }
                }
                int size3 = arrayList2.size();
                int i13 = 0;
                while (i13 < size3) {
                    int i14 = i13 + 1;
                    String[] strArr5 = (String[]) arrayList2.get(i13);
                    int size4 = arrayList.size();
                    boolean z10 = false;
                    int i15 = 0;
                    while (i15 < size4) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        z10 |= W(((t) obj2).c, strArr5);
                    }
                    if (!z10) {
                        l(arrayList, tVarArr, strArr5, strArr5, new File(s(), L(strArr5) + ".tzf").length());
                    }
                    i13 = i14;
                }
                loop6: while (true) {
                    int size5 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size5) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        tVar = (t) obj3;
                        String[] strArr6 = tVar.b;
                        int length2 = strArr6.length;
                        int i17 = 0;
                        boolean z11 = false;
                        while (true) {
                            if (i17 >= length2) {
                                break;
                            }
                            String str = strArr6[i17];
                            int O = O(tVar, str);
                            int size6 = arrayList.size();
                            int i18 = 0;
                            int i19 = 0;
                            while (i19 < size6) {
                                Object obj4 = arrayList.get(i19);
                                i19++;
                                t tVar2 = (t) obj4;
                                if (tVar2 != tVar) {
                                    i18 = Math.max(i18, O(tVar2, str));
                                }
                            }
                            if (i18 >= O && i18 != 0) {
                                z11 |= i18 > O;
                                i17++;
                            }
                        }
                    }
                    arrayList.remove(tVar);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size7 = arrayList.size();
                int i20 = 0;
                while (i20 < size7) {
                    Object obj5 = arrayList.get(i20);
                    i20++;
                    Collections.addAll(linkedHashSet, ((t) obj5).b);
                }
                a = (t[]) arrayList.toArray(new t[0]);
                b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void Q(t tVar) {
        synchronized (tVar) {
            try {
                int i7 = tVar.g - 1;
                tVar.g = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = tVar.h;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                tVar.h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void R(Runnable runnable) {
        g.remove(runnable);
    }

    public static a0 S(String str, ArrayList arrayList, ArrayList arrayList2) {
        t J = J(str);
        int i7 = 0;
        if (J != null) {
            int i10 = -1;
            for (t tVar : K()) {
                if (tVar.c(str)) {
                    int O = (y(tVar) ? 1 : 0) + (O(tVar, str) * 1000);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && tVar.c(str2)) {
                            O += 10;
                        }
                    }
                    if (O > i10) {
                        J = tVar;
                        i10 = O;
                    }
                }
            }
        }
        t tVar2 = J;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && tVar2.c(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(tVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 T(ArrayList arrayList, boolean z10) {
        t tVar;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String language = Locale.forLanguageTag((String) obj).getLanguage();
            if (!TextUtils.isEmpty(language) && !arrayList2.contains(language)) {
                arrayList2.add(language);
            }
        }
        if (!x()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : E()) {
                if (A(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                String str2 = (String) arrayList3.get(0);
                int size2 = arrayList2.size();
                while (true) {
                    if (i7 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    String str3 = (String) obj2;
                    if (arrayList3.contains(str3)) {
                        str2 = str3;
                        break;
                    }
                }
                return S(str2, arrayList3, arrayList2);
            }
        }
        if (z10 && z() && (arrayList2.isEmpty() || J((String) arrayList2.get(0)) == null)) {
            return null;
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str4 = (String) obj3;
            if (J(str4) != null) {
                return S(str4, arrayList2, arrayList2);
            }
        }
        t[] K = K();
        if (K.length == 0) {
            l1.j();
            return null;
        }
        t tVar2 = K[0];
        int length = K.length;
        while (true) {
            if (i7 >= length) {
                tVar = tVar2;
                break;
            }
            t tVar3 = K[i7];
            if (y(tVar3)) {
                tVar = tVar3;
                break;
            }
            i7++;
        }
        return new a0(tVar, TextUtils.join(",", tVar.b), arrayList2, false, 7);
    }

    public static a0 U(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr == null || fArr == null || strArr.length != fArr.length) {
            return null;
        }
        t[] K = K();
        if (K.length == 0) {
            return null;
        }
        t[] tVarArr = new t[fArr.length];
        float[] fArr2 = new float[K.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            if (fArr[i7] >= 0.1f) {
                t I = I(strArr[i7], a0Var, z10, false);
                tVarArr[i7] = I;
                if (I != null) {
                    for (int i10 = 0; i10 < K.length; i10++) {
                        if (K[i10] == tVarArr[i7]) {
                            fArr2[i10] = fArr2[i10] + fArr[i7];
                        }
                    }
                }
            }
        }
        int i11 = 0;
        for (int i12 = 1; i12 < K.length; i12++) {
            if (fArr2[i12] > fArr2[i11]) {
                i11 = i12;
            }
        }
        if (fArr2[i11] == 0.0f) {
            return null;
        }
        t tVar = K[i11];
        StringBuilder sb2 = new StringBuilder();
        int length = fArr.length;
        Integer[] numArr = new Integer[length];
        for (int i13 = 0; i13 < length; i13++) {
            numArr[i13] = Integer.valueOf(i13);
        }
        Arrays.sort(numArr, new l(0, fArr));
        for (int i14 = 0; i14 < length; i14++) {
            int intValue = numArr[i14].intValue();
            if (fArr[intValue] >= 0.1f && tVarArr[intValue] == tVar) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(strArr[intValue]);
            }
        }
        String i15 = a0Var.i();
        if (tVar.c(i15)) {
            if (!("," + ((Object) sb2) + ",").contains("," + i15 + ",")) {
                sb2.append(',');
                sb2.append(i15);
            }
        }
        return new a0(tVar, sb2.toString(), (List) a0Var.d, false, 7);
    }

    public static a0 V(String str, a0 a0Var, boolean z10) {
        t I = I(str, a0Var, z10, true);
        if (I == null) {
            return null;
        }
        return new a0(I, str, (List) a0Var.d, false, 7);
    }

    public static boolean W(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length];
        String[] strArr4 = new String[strArr2.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            strArr3[i7] = strArr[i7].toLowerCase(Locale.ROOT);
        }
        for (int i10 = 0; i10 < strArr2.length; i10++) {
            strArr4[i10] = strArr2[i10].toLowerCase(Locale.ROOT);
        }
        Arrays.sort(strArr3);
        Arrays.sort(strArr4);
        return Arrays.equals(strArr3, strArr4);
    }

    public static void X(String str) {
        mp.g1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void Y(boolean z10) {
        mp.g1().edit().putBoolean("asr_auto", z10).apply();
    }

    public static void Z(String str, String str2) {
        mp.g1().edit().putString("asr_variant_" + str, str2).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, boolean[] zArr, h21 h21Var, a0 a0Var) {
        float[] fArr;
        int i7;
        float[] fArr2;
        a0 V;
        a0 a0Var2 = a0Var;
        try {
            fArr = nativeDecode(str);
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: decode failed", th2);
            fArr = null;
        }
        int i10 = 0;
        if (fArr == null) {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            g0.g3(new j(zArr, h21Var, i10));
            return;
        }
        if (!zArr[0]) {
            int min = Math.min(fArr.length, 1440000);
            byte[] bArr = new byte[min * 2];
            int i11 = 0;
            while (true) {
                i7 = 1;
                if (i11 >= min) {
                    break;
                }
                int max = Math.max(-32768, Math.min(32767, Math.round(fArr[i11] * 32768.0f)));
                int i12 = i11 * 2;
                bArr[i12] = (byte) max;
                bArr[i12 + 1] = (byte) (max >> 8);
                i11++;
            }
            int[] iArr = {0};
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ExecutorService executorService = DictationLid.a;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() + 30000;
            synchronized (DictationLid.h) {
                while (DictationLid.c == 0 && (DictationLid.f || DictationLid.g)) {
                    try {
                        long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                        if (elapsedRealtime3 <= 0) {
                            break;
                        } else {
                            try {
                                DictationLid.h.wait(elapsedRealtime3);
                            } catch (InterruptedException unused) {
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            ExecutorService executorService2 = DictationLid.a;
            if (DictationLid.c != 0) {
                try {
                    fArr2 = (float[]) DictationLid.a.submit(new ab.i(i7, bArr, iArr)).get();
                } catch (Exception unused2) {
                }
                f1 n10 = DictationLid.n(0.6f, fArr2);
                V = (n10 == null && n10.c) ? V(n10.a, a0Var2, true) : n10 == null ? U(DictationLid.d, fArr2, a0Var2, true) : null;
                StringBuilder sb2 = new StringBuilder("tinylid: file, ");
                sb2.append(iArr[0]);
                sb2.append(" ms speech in ");
                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                sb2.append(" ms: ");
                sb2.append(n10);
                sb2.append(" → ");
                sb2.append(V == null ? V : a0Var2);
                Log.d("Dictation", sb2.toString());
                if (V != null) {
                    a0Var2 = V;
                }
            }
            fArr2 = null;
            f1 n102 = DictationLid.n(0.6f, fArr2);
            if (n102 == null) {
            }
            StringBuilder sb22 = new StringBuilder("tinylid: file, ");
            sb22.append(iArr[0]);
            sb22.append(" ms speech in ");
            sb22.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb22.append(" ms: ");
            sb22.append(n102);
            sb22.append(" → ");
            sb22.append(V == null ? V : a0Var2);
            Log.d("Dictation", sb22.toString());
            if (V != null) {
            }
        }
        g0.g3(new k(zArr, a0Var2, h21Var, fArr));
    }

    public static String a0() {
        if (x()) {
            return null;
        }
        String str = null;
        for (String str2 : E()) {
            if (A(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static String b(ArrayList arrayList) {
        if (arrayList.size() < 2 || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        int i7 = 0;
        String script = ULocale.addLikelySubtags(new ULocale(o((String) arrayList.get(0)))).getScript();
        if (TextUtils.isEmpty(script)) {
            return null;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str = (String) obj;
            String[] split = str.split("-");
            if (split.length == 2 && split[1].equalsIgnoreCase(script)) {
                return str;
            }
        }
        return null;
    }

    public static void b0(float[] fArr, a0 a0Var, h21 h21Var, boolean[] zArr) {
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        t tVar = (t) a0Var.b;
        long k10 = k(tVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k10 == 0) {
            nativeFileNew = 0;
        } else {
            nativeFileNew = nativeFileNew(k10, fArr, tVar.a((String) a0Var.c), bz.o() == 0 ? 2 : 4);
        }
        if (nativeFileNew == 0) {
            if (k10 != 0) {
                Q(tVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.g3(new j(zArr, h21Var, 2));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    n(sb2, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e10) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                }
                N(h21Var, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                Q(tVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        Q(tVar);
        N(h21Var, zArr, sb2.toString(), arrayList, true);
    }

    public static t c0(String str) {
        for (t tVar : K()) {
            if (tVar.c(str) && y(tVar)) {
                ArrayList a10 = l1.a();
                if (l1.i(l1.f(a10, tVar.c), new File(s(), tVar.b())) || l1.i(l1.f(a10, "silero-vad"), new File(s(), "silero_vad.onnx"))) {
                    return tVar;
                }
            }
        }
        return null;
    }

    public static String d0(t tVar, String str) {
        String[] d2 = tVar.d(str);
        if (d2.length == 0) {
            return str;
        }
        String string = mp.g1().getString("asr_variant_" + str, null);
        int length = d2.length;
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = d2[i7];
            if (str2.equalsIgnoreCase(string)) {
                return str2;
            }
        }
        return d2[0];
    }

    public static int e0() {
        if (i == 0) {
            try {
                i = nativeVersion();
            } catch (Throwable unused) {
                i = 1;
            }
        }
        return i;
    }

    public static void f0(t tVar, u uVar) {
        if (tVar.f != 0) {
            uVar.a(true);
            return;
        }
        if (!y(tVar) && !l1.b()) {
            uVar.a(false);
            return;
        }
        tVar.l.add(uVar);
        if (!y(tVar)) {
            u(tVar, false);
        } else {
            if (tVar.i) {
                return;
            }
            tVar.i = true;
            d.execute(new o(tVar, 0));
        }
    }

    public static boolean j(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            jSONArray = jSONArray2;
        }
        JSONObject optJSONObject = jSONArray != null ? jSONArray.optJSONObject(0) : null;
        return optJSONObject != null && optJSONObject.optBoolean("join");
    }

    public static long k(t tVar) {
        long j3;
        synchronized (tVar) {
            if (tVar.f != 0) {
                tVar.g++;
            }
            j3 = tVar.f;
        }
        return j3;
    }

    public static void l(ArrayList arrayList, t[] tVarArr, String[] strArr, String[] strArr2, long j3) {
        String L = L(strArr);
        List asList = Arrays.asList(strArr2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(o((String) it.next()));
        }
        String[] strArr3 = (String[]) linkedHashSet.toArray(new String[0]);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((t) obj).a.equals(L)) {
                return;
            }
        }
        for (t tVar : tVarArr) {
            if (tVar.a.equals(L)) {
                if (j3 > 0) {
                    tVar.e = j3;
                }
                tVar.c = strArr2;
                arrayList.add(tVar);
                return;
            }
        }
        arrayList.add(new t(L, strArr3, strArr2, j3));
    }

    public static boolean m(String str, t tVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!x() && A(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && tVar.c(str2)) {
                return false;
            }
        }
        return true;
    }

    public static void n(StringBuilder sb2, JSONArray jSONArray, ArrayList arrayList) {
        if (jSONArray == null) {
            return;
        }
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i7);
            String optString = optJSONObject != null ? optJSONObject.optString("text") : "";
            if (!optString.isEmpty()) {
                if (sb2.length() > 0 && !optJSONObject.optBoolean("join")) {
                    sb2.append(' ');
                }
                if (arrayList != null) {
                    arrayList.add(Integer.valueOf(sb2.length()));
                    arrayList.add(Integer.valueOf(optString.length() + sb2.length()));
                    arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("start")) * 1000.0f)));
                    arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("end")) * 1000.0f)));
                }
                sb2.append(optString);
            }
        }
    }

    private static native float[] nativeDecode(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFileFree(long j3);

    private static native String nativeFileLang(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeFileNew(long j3, float[] fArr, String str, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeFileNext(long j3);

    private static native void nativeFree(long j3);

    private static native String[] nativeLangs(long j3);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeSessionFinish(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSessionFree(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeSessionNew(long j3, String str, String str2, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeSessionPush(long j3, byte[] bArr, int i7, int i10);

    private static native int nativeVersion();

    public static String o(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static void p() {
        g0.g3(new n(0));
    }

    public static String q(String str, String str2, boolean z10) {
        return str.isEmpty() ? str2 : str2.isEmpty() ? str : z10 ? str.concat(str2) : p0.E(str, " ", str2);
    }

    public static void r() {
        for (t tVar : K()) {
            synchronized (tVar) {
                try {
                    if (tVar.f != 0) {
                        if (tVar.g > 0) {
                            tVar.h.add(Long.valueOf(tVar.f));
                        } else {
                            nativeFree(tVar.f);
                        }
                        tVar.f = 0L;
                    }
                    tVar.i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.b;
        ExecutorService executorService = DictationLid.a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        l1.g(file2);
        mp.g1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.e = false;
        DictationLid.a.execute(new n(2));
        SharedPreferences.Editor edit = mp.g1().edit();
        for (String str : mp.g1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = mp.g1().edit();
        for (String str2 : mp.g1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        P();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        p();
    }

    public static File s() {
        return new File(t0.b.getFilesDir(), "tinyasr");
    }

    public static void t(t tVar) {
        if (tVar == null || y(tVar)) {
            return;
        }
        u(tVar, false);
    }

    public static void u(t tVar, boolean z10) {
        long j3;
        if (tVar.j) {
            return;
        }
        tVar.j = true;
        tVar.k = 0.0f;
        int i7 = 0;
        if (!new File(s(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = l1.f(l1.a(), "silero-vad");
            if ((f10 != null ? f10.document.size : 0L) > 0) {
                TLRPC.TL_transcriptionModel f11 = l1.f(l1.a(), "silero-vad");
                j3 = f11 != null ? f11.document.size : 0L;
            } else {
                j3 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j3});
            p();
        }
        if (!new File(s(), tVar.b()).exists()) {
            h.putIfAbsent(tVar.b(), new long[]{0, tVar.e});
            p();
        }
        p();
        e.execute(new p(z10, tVar, i7));
    }

    public static int v(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, t tVar, boolean z10) {
        File file = new File(s(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return l1.c(tL_transcriptionModel, file, z10, new h(str, tVar, new long[]{0}));
        } finally {
            G(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean w(int i7) {
        boolean z10;
        if (j10.r(i7)) {
            mp u12 = mp.u1(i7);
            String str = ((n0) u12.A7.g0.b).c;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1609594047) {
                    if (hashCode != -318452137) {
                        if (hashCode == 270940796) {
                            str.equals("disabled");
                        }
                    } else if (str.equals("premium")) {
                        z10 = u12.getUserConfig().q();
                        if (z10) {
                            return true;
                        }
                    }
                } else if (str.equals("enabled")) {
                    z10 = true;
                    if (z10) {
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return false;
    }

    public static boolean x() {
        return mp.g1().getBoolean("asr_auto", true);
    }

    public static boolean y(t tVar) {
        return tVar != null && new File(s(), tVar.b()).exists() && new File(s(), "silero_vad.onnx").exists();
    }

    public static boolean z() {
        return mp.g1().getBoolean("asr_google", false);
    }
}
