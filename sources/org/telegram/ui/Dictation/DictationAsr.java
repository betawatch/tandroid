package org.telegram.ui.Dictation;

import a3.h;
import a8.p0;
import ab.i;
import ai.c1;
import ai.e1;
import ai.i1;
import ai.j;
import ai.k;
import ai.l;
import ai.m;
import ai.o;
import ai.p;
import ai.q;
import ai.s;
import ai.t;
import android.content.Context;
import android.content.SharedPreferences;
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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ki.r1;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.g0;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class DictationAsr {
    public static boolean c;
    public static volatile s[] a = new s[0];
    public static volatile String[] b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static final ArrayList g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = i1.d;
        if (j3 == 0 || elapsedRealtime - j3 > 60000) {
            i1.d = elapsedRealtime;
            if (i1.d()) {
                i1.e();
            }
        }
        ArrayList a10 = i1.a();
        if (a10 != null) {
            int size = a10.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = a10.get(i7);
                i7++;
                TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean B() {
        if (A()) {
            for (s sVar : I()) {
                if (w(sVar)) {
                    return true;
                }
            }
            if (i1.b()) {
                return true;
            }
        }
        return false;
    }

    public static String[] C() {
        if (!c) {
            L();
        }
        return b;
    }

    public static void D(s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(r(), sVar.a());
        File file2 = new File(r(), "silero_vad.onnx");
        boolean z10 = false;
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad != 0) {
                synchronized (sVar) {
                    try {
                        long j3 = sVar.d;
                        sVar.d = nativeLoad;
                        if (j3 != 0) {
                            if (sVar.e > 0) {
                                sVar.f.add(Long.valueOf(j3));
                            } else {
                                nativeFree(j3);
                            }
                        }
                    } finally {
                    }
                }
                Log.d("Dictation", "tinyasr: " + sVar.a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
                g0.h3(new q(true, sVar));
                return;
            }
            Log.e("Dictation", "tinyasr: " + sVar.a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
            file.delete();
            i1.g(file);
            SharedPreferences.Editor edit = np.e1().edit();
            StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
            sb2.append(sVar.a);
            edit.remove(sb2.toString()).apply();
            sVar.g = false;
            if (sVar.d == 0) {
                g0.h3(new q(z10, sVar));
            }
            o();
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            sVar.g = false;
            g0.h3(new q(z10, sVar));
        }
    }

    public static void E(String str) {
        if (h.remove(str) != null) {
            o();
        }
    }

    public static boolean F(long[] jArr) {
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

    public static s G(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        List list2 = z10 ? null : (List) a0Var.d;
        s sVar = (s) a0Var.b;
        if (sVar.b(str) && m(str, sVar, list2)) {
            return sVar;
        }
        for (s sVar2 : I()) {
            if (sVar2.b(str) && w(sVar2) && m(str, sVar2, list2)) {
                return sVar2;
            }
        }
        s H = H(str);
        if (H != null && (((list = (List) a0Var.d) != null && list.contains(str)) || (z11 && m(str, H, list2)))) {
            return H;
        }
        return null;
    }

    public static s H(String str) {
        for (s sVar : I()) {
            if (sVar.b(str)) {
                return sVar;
            }
        }
        return null;
    }

    public static s[] I() {
        if (!c) {
            L();
        }
        return a;
    }

    public static void J() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void K(r1 r1Var, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.h3(new j(zArr, r1Var, str, iArr, z10, 0));
    }

    public static synchronized void L() {
        synchronized (DictationAsr.class) {
            try {
                c = true;
                s[] sVarArr = a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = r().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (name.endsWith(".tzf")) {
                            arrayList2.add(name.substring(0, name.length() - 4).split("-"));
                        }
                    }
                }
                ArrayList a10 = i1.a();
                if (a10 != null) {
                    int size = a10.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = a10.get(i7);
                        i7++;
                        TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                        if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                            String[] strArr = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            String[] strArr2 = strArr;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                String[] strArr3 = (String[]) obj2;
                                String[] strArr4 = (String[]) strArr3.clone();
                                String[] strArr5 = (String[]) strArr.clone();
                                Arrays.sort(strArr4);
                                Arrays.sort(strArr5);
                                if (Arrays.equals(strArr4, strArr5)) {
                                    strArr2 = strArr3;
                                }
                            }
                            l(arrayList, sVarArr, strArr2, tL_transcriptionModel.document.size);
                        }
                    }
                }
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    String[] strArr6 = (String[]) obj3;
                    int size4 = arrayList.size();
                    boolean z10 = false;
                    int i12 = 0;
                    while (i12 < size4) {
                        Object obj4 = arrayList.get(i12);
                        i12++;
                        String[] strArr7 = (String[]) ((s) obj4).b.clone();
                        String[] strArr8 = (String[]) strArr6.clone();
                        Arrays.sort(strArr7);
                        Arrays.sort(strArr8);
                        z10 |= Arrays.equals(strArr7, strArr8);
                    }
                    if (!z10) {
                        l(arrayList, sVarArr, strArr6, new File(r(), TextUtils.join("-", strArr6) + ".tzf").length());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size5 = arrayList.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    Collections.addAll(linkedHashSet, ((s) obj5).b);
                }
                a = (s[]) arrayList.toArray(new s[0]);
                b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(s sVar) {
        synchronized (sVar) {
            try {
                int i7 = sVar.e - 1;
                sVar.e = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = sVar.f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                sVar.f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void N(Runnable runnable) {
        g.remove(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    public static a0 O(String str, ArrayList arrayList, ArrayList arrayList2) {
        s H = H(str);
        int i7 = 0;
        if (H != null) {
            char c10 = 65535;
            for (s sVar : I()) {
                if (sVar.b(str)) {
                    int w10 = w(sVar);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && sVar.b(str2)) {
                            w10 += 10;
                        }
                    }
                    if (w10 > c10) {
                        H = sVar;
                        c10 = w10;
                    }
                }
            }
        }
        s sVar2 = H;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && sVar2.b(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(sVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 P(ArrayList arrayList, boolean z10) {
        s sVar;
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
        if (!v()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : C()) {
                if (y(str)) {
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
                return O(str2, arrayList3, arrayList2);
            }
        }
        if (z10 && x() && (arrayList2.isEmpty() || H((String) arrayList2.get(0)) == null)) {
            return null;
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str4 = (String) obj3;
            if (H(str4) != null) {
                return O(str4, arrayList2, arrayList2);
            }
        }
        s[] I = I();
        if (I.length == 0) {
            CountDownLatch e10 = i1.e();
            if (e10 != null) {
                new Thread(new e1(e10, 0), "DictationModels").start();
            }
            return null;
        }
        s sVar2 = I[0];
        int length = I.length;
        while (true) {
            if (i7 >= length) {
                sVar = sVar2;
                break;
            }
            s sVar3 = I[i7];
            if (w(sVar3)) {
                sVar = sVar3;
                break;
            }
            i7++;
        }
        return new a0(sVar, TextUtils.join(",", sVar.b), arrayList2, false, 7);
    }

    public static a0 Q(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr == null || fArr == null || strArr.length != fArr.length) {
            return null;
        }
        s[] I = I();
        if (I.length == 0) {
            return null;
        }
        s[] sVarArr = new s[fArr.length];
        float[] fArr2 = new float[I.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            if (fArr[i7] >= 0.1f) {
                s G = G(strArr[i7], a0Var, z10, false);
                sVarArr[i7] = G;
                if (G != null) {
                    for (int i10 = 0; i10 < I.length; i10++) {
                        if (I[i10] == sVarArr[i7]) {
                            fArr2[i10] = fArr2[i10] + fArr[i7];
                        }
                    }
                }
            }
        }
        int i11 = 0;
        for (int i12 = 1; i12 < I.length; i12++) {
            if (fArr2[i12] > fArr2[i11]) {
                i11 = i12;
            }
        }
        if (fArr2[i11] == 0.0f) {
            return null;
        }
        s sVar = I[i11];
        StringBuilder sb2 = new StringBuilder();
        int length = fArr.length;
        Integer[] numArr = new Integer[length];
        for (int i13 = 0; i13 < length; i13++) {
            numArr[i13] = Integer.valueOf(i13);
        }
        Arrays.sort(numArr, new k(0, fArr));
        for (int i14 = 0; i14 < length; i14++) {
            int intValue = numArr[i14].intValue();
            if (fArr[intValue] >= 0.1f && sVarArr[intValue] == sVar) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(strArr[intValue]);
            }
        }
        String i15 = a0Var.i();
        if (sVar.b(i15)) {
            if (!("," + ((Object) sb2) + ",").contains("," + i15 + ",")) {
                sb2.append(',');
                sb2.append(i15);
            }
        }
        return new a0(sVar, sb2.toString(), (List) a0Var.d, false, 7);
    }

    public static a0 R(String str, a0 a0Var, boolean z10) {
        s G = G(str, a0Var, z10, true);
        if (G == null) {
            return null;
        }
        return new a0(G, str, (List) a0Var.d, false, 7);
    }

    public static void S(String str) {
        np.e1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void T(boolean z10) {
        np.e1().edit().putBoolean("asr_auto", z10).apply();
    }

    public static String U() {
        if (v()) {
            return null;
        }
        String str = null;
        for (String str2 : C()) {
            if (y(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void V(s sVar, t tVar) {
        if (sVar.d != 0) {
            tVar.a(true);
            return;
        }
        if (!w(sVar) && !i1.b()) {
            tVar.a(false);
            return;
        }
        sVar.j.add(tVar);
        if (!w(sVar)) {
            t(sVar);
        } else {
            if (sVar.g) {
                return;
            }
            sVar.g = true;
            d.execute(new p(sVar, 0));
        }
    }

    public static void a(float[] fArr, a0 a0Var, r1 r1Var, boolean[] zArr) {
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        s sVar = (s) a0Var.b;
        long k10 = k(sVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long nativeFileNew = k10 == 0 ? 0L : nativeFileNew(k10, fArr, (String) a0Var.c);
        if (nativeFileNew == 0) {
            if (k10 != 0) {
                M(sVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.h3(new l(zArr, r1Var, 1));
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
                K(r1Var, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                M(sVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        M(sVar);
        K(r1Var, zArr, sb2.toString(), arrayList, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(String str, boolean[] zArr, r1 r1Var, boolean z10, a0 a0Var) {
        int i7;
        int i10;
        float[] fArr;
        c1 n10;
        a0 a0Var2 = a0Var;
        float[] nativeDecode = nativeDecode(str);
        int i11 = 0;
        if (nativeDecode == null) {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            g0.h3(new l(zArr, r1Var, i11));
            return;
        }
        if (z10 && !zArr[0]) {
            int min = Math.min(nativeDecode.length, 1440000);
            byte[] bArr = new byte[min * 2];
            int i12 = 0;
            while (true) {
                i7 = 1;
                if (i12 >= min) {
                    break;
                }
                int max = Math.max(-32768, Math.min(32767, Math.round(nativeDecode[i12] * 32768.0f)));
                int i13 = i12 * 2;
                bArr[i13] = (byte) max;
                bArr[i13 + 1] = (byte) (max >> 8);
                i12++;
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
                        }
                        i10 = i11;
                        try {
                            DictationLid.h.wait(elapsedRealtime3);
                            i11 = i10;
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                i10 = i11;
            }
            ExecutorService executorService2 = DictationLid.a;
            a0 a0Var3 = null;
            if (DictationLid.c != 0) {
                try {
                    fArr = (float[]) DictationLid.a.submit(new i(i7, bArr, iArr)).get();
                } catch (Exception unused2) {
                }
                if (!v()) {
                    String[] strArr = DictationLid.d;
                    if (fArr != null && strArr != null && strArr.length == fArr.length) {
                        float f10 = 0.0f;
                        for (int i14 = i10; i14 < fArr.length; i14++) {
                            if (y(strArr[i14])) {
                                f10 += fArr[i14];
                            }
                        }
                        if (f10 > 0.0f) {
                            for (int i15 = i10; i15 < fArr.length; i15++) {
                                fArr[i15] = y(strArr[i15]) ? fArr[i15] / f10 : 0.0f;
                            }
                        }
                    }
                }
                n10 = DictationLid.n(0.6f, fArr);
                if (n10 == null && n10.c) {
                    a0Var3 = R(n10.a, a0Var2, true);
                } else if (n10 != null) {
                    a0Var3 = Q(DictationLid.d, fArr, a0Var2, true);
                }
                StringBuilder sb2 = new StringBuilder("tinylid: file, ");
                sb2.append(iArr[i10]);
                sb2.append(" ms speech in ");
                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                sb2.append(" ms: ");
                sb2.append(n10);
                sb2.append(" → ");
                sb2.append(a0Var3 == null ? a0Var3 : a0Var2);
                Log.d("Dictation", sb2.toString());
                if (a0Var3 != null) {
                    a0Var2 = a0Var3;
                }
            }
            fArr = null;
            if (!v()) {
            }
            n10 = DictationLid.n(0.6f, fArr);
            if (n10 == null) {
            }
            if (n10 != null) {
            }
            StringBuilder sb22 = new StringBuilder("tinylid: file, ");
            sb22.append(iArr[i10]);
            sb22.append(" ms speech in ");
            sb22.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb22.append(" ms: ");
            sb22.append(n10);
            sb22.append(" → ");
            sb22.append(a0Var3 == null ? a0Var3 : a0Var2);
            Log.d("Dictation", sb22.toString());
            if (a0Var3 != null) {
            }
        }
        g0.h3(new m(zArr, a0Var2, r1Var, nativeDecode));
    }

    public static boolean h(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            jSONArray = jSONArray2;
        }
        JSONObject optJSONObject = jSONArray != null ? jSONArray.optJSONObject(0) : null;
        return optJSONObject != null && optJSONObject.optBoolean("join");
    }

    public static long k(s sVar) {
        long j3;
        synchronized (sVar) {
            if (sVar.d != 0) {
                sVar.e++;
            }
            j3 = sVar.d;
        }
        return j3;
    }

    public static void l(ArrayList arrayList, s[] sVarArr, String[] strArr, long j3) {
        String join = TextUtils.join("-", strArr);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((s) obj).a.equals(join)) {
                return;
            }
        }
        for (s sVar : sVarArr) {
            if (sVar.a.equals(join)) {
                if (j3 > 0) {
                    sVar.c = j3;
                }
                arrayList.add(sVar);
                return;
            }
        }
        arrayList.add(new s(join, strArr, j3));
    }

    public static boolean m(String str, s sVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!v() && y(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && sVar.b(str2)) {
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
    public static native long nativeFileNew(long j3, float[] fArr, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeFileNext(long j3);

    private static native void nativeFree(long j3);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeSessionFinish(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSessionFree(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeSessionNew(long j3, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeSessionPush(long j3, byte[] bArr, int i7, int i10);

    public static void o() {
        g0.h3(new o(0));
    }

    public static String p(String str, String str2, boolean z10) {
        return str.isEmpty() ? str2 : str2.isEmpty() ? str : z10 ? str.concat(str2) : p0.E(str, " ", str2);
    }

    public static void q() {
        for (s sVar : I()) {
            synchronized (sVar) {
                try {
                    if (sVar.d != 0) {
                        if (sVar.e > 0) {
                            sVar.f.add(Long.valueOf(sVar.d));
                        } else {
                            nativeFree(sVar.d);
                        }
                        sVar.d = 0L;
                    }
                    sVar.g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = r().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.b;
        ExecutorService executorService = DictationLid.a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        i1.g(file2);
        np.e1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.e = false;
        DictationLid.a.execute(new o(2));
        SharedPreferences.Editor edit = np.e1().edit();
        for (String str : np.e1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = np.e1().edit();
        for (String str2 : np.e1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        L();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        o();
    }

    public static File r() {
        return new File(t0.b.getFilesDir(), "tinyasr");
    }

    public static void s(s sVar) {
        if (sVar == null || w(sVar)) {
            return;
        }
        t(sVar);
    }

    public static void t(s sVar) {
        long j3;
        if (sVar.h) {
            return;
        }
        int i7 = 1;
        sVar.h = true;
        sVar.i = 0.0f;
        if (!new File(r(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = i1.f(i1.a(), "silero-vad");
            if ((f10 != null ? f10.document.size : 0L) > 0) {
                TLRPC.TL_transcriptionModel f11 = i1.f(i1.a(), "silero-vad");
                j3 = f11 != null ? f11.document.size : 0L;
            } else {
                j3 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j3});
            o();
        }
        if (!new File(r(), sVar.a()).exists()) {
            h.putIfAbsent(sVar.a(), new long[]{0, sVar.c});
            o();
        }
        o();
        e.execute(new p(sVar, i7));
    }

    public static int u(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, s sVar) {
        File file = new File(r(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return i1.c(tL_transcriptionModel, file, new h(str, sVar, new long[]{0}));
        } finally {
            E(str);
        }
    }

    public static boolean v() {
        return np.e1().getBoolean("asr_auto", true);
    }

    public static boolean w(s sVar) {
        return sVar != null && new File(r(), sVar.a()).exists() && new File(r(), "silero_vad.onnx").exists();
    }

    public static boolean x() {
        return np.e1().getBoolean("asr_google", false);
    }

    public static boolean y(String str) {
        String string = np.e1().getString("asr_langs", null);
        if (string != null) {
            return p0.p(",", string, ",").contains("," + str + ",");
        }
        for (s sVar : I()) {
            if (sVar.b(str) && w(sVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(int i7) {
        return np.e1().getBoolean(m10.i(i7).q() ? "asr_local_premium" : "asr_local_free", !m10.i(i7).q());
    }
}
