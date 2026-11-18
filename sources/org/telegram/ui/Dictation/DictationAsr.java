package org.telegram.ui.Dictation;

import a8.p0;
import ai.d1;
import ai.i;
import ai.j1;
import ai.k;
import ai.l;
import ai.n;
import ai.o;
import ai.p;
import ai.q;
import ai.t;
import ai.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import ii.h;
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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public static boolean A() {
        return u(j10.t0) && j1.h();
    }

    public static boolean B() {
        if (A()) {
            for (t tVar : I()) {
                if (w(tVar)) {
                    return true;
                }
            }
            if (j1.b()) {
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

    public static void D(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(q(), tVar.a());
        File file2 = new File(q(), "silero_vad.onnx");
        boolean z10 = false;
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad != 0) {
                synchronized (tVar) {
                    try {
                        long j3 = tVar.d;
                        tVar.d = nativeLoad;
                        if (j3 != 0) {
                            if (tVar.e > 0) {
                                tVar.f.add(Long.valueOf(j3));
                            } else {
                                nativeFree(j3);
                            }
                        }
                    } finally {
                    }
                }
                Log.d("Dictation", "tinyasr: " + tVar.a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
                g0.g3(new q(true, tVar, 1));
                return;
            }
            Log.e("Dictation", "tinyasr: " + tVar.a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
            file.delete();
            j1.g(file);
            SharedPreferences.Editor edit = mp.g1().edit();
            StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
            sb2.append(tVar.a);
            edit.remove(sb2.toString()).apply();
            tVar.g = false;
            if (tVar.d == 0) {
                g0.g3(new q(z10, tVar, 1));
            }
            n();
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            tVar.g = false;
            g0.g3(new q(z10, tVar, 1));
        }
    }

    public static void E(String str) {
        if (h.remove(str) != null) {
            n();
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

    public static t G(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        List list2 = z10 ? null : (List) a0Var.d;
        t tVar = (t) a0Var.b;
        if (tVar.b(str) && l(str, tVar, list2)) {
            return tVar;
        }
        for (t tVar2 : I()) {
            if (tVar2.b(str) && w(tVar2) && l(str, tVar2, list2)) {
                return tVar2;
            }
        }
        t H = H(str);
        if (H != null && (((list = (List) a0Var.d) != null && list.contains(str)) || (z11 && l(str, H, list2)))) {
            return H;
        }
        return null;
    }

    public static t H(String str) {
        for (t tVar : I()) {
            if (tVar.b(str)) {
                return tVar;
            }
        }
        return null;
    }

    public static t[] I() {
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

    public static void K(h hVar, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.g3(new n(zArr, hVar, str, iArr, z10, 0));
    }

    public static synchronized void L() {
        synchronized (DictationAsr.class) {
            try {
                c = true;
                t[] tVarArr = a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = q().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (name.endsWith(".tzf")) {
                            arrayList2.add(name.substring(0, name.length() - 4).split("-"));
                        }
                    }
                }
                ArrayList a10 = j1.a();
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
                            k(arrayList, tVarArr, strArr2, tL_transcriptionModel.document.size);
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
                        String[] strArr7 = (String[]) ((t) obj4).b.clone();
                        String[] strArr8 = (String[]) strArr6.clone();
                        Arrays.sort(strArr7);
                        Arrays.sort(strArr8);
                        z10 |= Arrays.equals(strArr7, strArr8);
                    }
                    if (!z10) {
                        k(arrayList, tVarArr, strArr6, new File(q(), TextUtils.join("-", strArr6) + ".tzf").length());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size5 = arrayList.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    Collections.addAll(linkedHashSet, ((t) obj5).b);
                }
                a = (t[]) arrayList.toArray(new t[0]);
                b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(t tVar) {
        synchronized (tVar) {
            try {
                int i7 = tVar.e - 1;
                tVar.e = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = tVar.f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                tVar.f.clear();
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
        t H = H(str);
        int i7 = 0;
        if (H != null) {
            char c10 = 65535;
            for (t tVar : I()) {
                if (tVar.b(str)) {
                    int w10 = w(tVar);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && tVar.b(str2)) {
                            w10 += 10;
                        }
                    }
                    if (w10 > c10) {
                        H = tVar;
                        c10 = w10;
                    }
                }
            }
        }
        t tVar2 = H;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && tVar2.b(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(tVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 P(ArrayList arrayList, boolean z10) {
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
        t[] I = I();
        if (I.length == 0) {
            j1.j();
            return null;
        }
        t tVar2 = I[0];
        int length = I.length;
        while (true) {
            if (i7 >= length) {
                tVar = tVar2;
                break;
            }
            t tVar3 = I[i7];
            if (w(tVar3)) {
                tVar = tVar3;
                break;
            }
            i7++;
        }
        return new a0(tVar, TextUtils.join(",", tVar.b), arrayList2, false, 7);
    }

    public static a0 Q(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr == null || fArr == null || strArr.length != fArr.length) {
            return null;
        }
        t[] I = I();
        if (I.length == 0) {
            return null;
        }
        t[] tVarArr = new t[fArr.length];
        float[] fArr2 = new float[I.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            if (fArr[i7] >= 0.1f) {
                t G = G(strArr[i7], a0Var, z10, false);
                tVarArr[i7] = G;
                if (G != null) {
                    for (int i10 = 0; i10 < I.length; i10++) {
                        if (I[i10] == tVarArr[i7]) {
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
        t tVar = I[i11];
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
        if (tVar.b(i15)) {
            if (!("," + ((Object) sb2) + ",").contains("," + i15 + ",")) {
                sb2.append(',');
                sb2.append(i15);
            }
        }
        return new a0(tVar, sb2.toString(), (List) a0Var.d, false, 7);
    }

    public static a0 R(String str, a0 a0Var, boolean z10) {
        t G = G(str, a0Var, z10, true);
        if (G == null) {
            return null;
        }
        return new a0(G, str, (List) a0Var.d, false, 7);
    }

    public static void S(String str) {
        mp.g1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void T(boolean z10) {
        mp.g1().edit().putBoolean("asr_auto", z10).apply();
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

    public static void V(float[] fArr, a0 a0Var, h hVar, boolean[] zArr) {
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        t tVar = (t) a0Var.b;
        long j3 = j(tVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 == 0) {
            nativeFileNew = 0;
        } else {
            nativeFileNew = nativeFileNew(j3, fArr, (String) a0Var.c, bz.o() == 0 ? 2 : 4);
        }
        if (nativeFileNew == 0) {
            if (j3 != 0) {
                M(tVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.g3(new i(zArr, hVar, 0));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    m(sb2, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e10) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                }
                K(hVar, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                M(tVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        M(tVar);
        K(hVar, zArr, sb2.toString(), arrayList, true);
    }

    public static t W(String str) {
        for (t tVar : I()) {
            if (tVar.b(str) && w(tVar)) {
                ArrayList a10 = j1.a();
                if (j1.i(j1.f(a10, tVar.b), new File(q(), tVar.a())) || j1.i(j1.f(a10, "silero-vad"), new File(q(), "silero_vad.onnx"))) {
                    return tVar;
                }
            }
        }
        return null;
    }

    public static int X() {
        if (i == 0) {
            try {
                i = nativeVersion();
            } catch (Throwable unused) {
                i = 1;
            }
        }
        return i;
    }

    public static void Y(t tVar, u uVar) {
        if (tVar.d != 0) {
            uVar.a(true);
            return;
        }
        if (!w(tVar) && !j1.b()) {
            uVar.a(false);
            return;
        }
        tVar.j.add(uVar);
        if (!w(tVar)) {
            s(tVar, false);
        } else {
            if (tVar.g) {
                return;
            }
            tVar.g = true;
            d.execute(new p(tVar, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, boolean[] zArr, h hVar, a0 a0Var) {
        float[] fArr;
        float[] fArr2;
        a0 R;
        a0 a0Var2 = a0Var;
        try {
            fArr = nativeDecode(str);
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: decode failed", th2);
            fArr = null;
        }
        int i7 = 1;
        if (fArr == null) {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            g0.g3(new i(zArr, hVar, i7));
            return;
        }
        if (!zArr[0]) {
            int min = Math.min(fArr.length, 1440000);
            byte[] bArr = new byte[min * 2];
            for (int i10 = 0; i10 < min; i10++) {
                int max = Math.max(-32768, Math.min(32767, Math.round(fArr[i10] * 32768.0f)));
                int i11 = i10 * 2;
                bArr[i11] = (byte) max;
                bArr[i11 + 1] = (byte) (max >> 8);
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
                d1 n10 = DictationLid.n(0.6f, fArr2);
                R = (n10 == null && n10.c) ? R(n10.a, a0Var2, true) : n10 == null ? Q(DictationLid.d, fArr2, a0Var2, true) : null;
                StringBuilder sb2 = new StringBuilder("tinylid: file, ");
                sb2.append(iArr[0]);
                sb2.append(" ms speech in ");
                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                sb2.append(" ms: ");
                sb2.append(n10);
                sb2.append(" → ");
                sb2.append(R == null ? R : a0Var2);
                Log.d("Dictation", sb2.toString());
                if (R != null) {
                    a0Var2 = R;
                }
            }
            fArr2 = null;
            d1 n102 = DictationLid.n(0.6f, fArr2);
            if (n102 == null) {
            }
            StringBuilder sb22 = new StringBuilder("tinylid: file, ");
            sb22.append(iArr[0]);
            sb22.append(" ms speech in ");
            sb22.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb22.append(" ms: ");
            sb22.append(n102);
            sb22.append(" → ");
            sb22.append(R == null ? R : a0Var2);
            Log.d("Dictation", sb22.toString());
            if (R != null) {
            }
        }
        g0.g3(new k(zArr, a0Var2, hVar, fArr));
    }

    public static boolean g(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            jSONArray = jSONArray2;
        }
        JSONObject optJSONObject = jSONArray != null ? jSONArray.optJSONObject(0) : null;
        return optJSONObject != null && optJSONObject.optBoolean("join");
    }

    public static long j(t tVar) {
        long j3;
        synchronized (tVar) {
            if (tVar.d != 0) {
                tVar.e++;
            }
            j3 = tVar.d;
        }
        return j3;
    }

    public static void k(ArrayList arrayList, t[] tVarArr, String[] strArr, long j3) {
        String join = TextUtils.join("-", strArr);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((t) obj).a.equals(join)) {
                return;
            }
        }
        for (t tVar : tVarArr) {
            if (tVar.a.equals(join)) {
                if (j3 > 0) {
                    tVar.c = j3;
                }
                arrayList.add(tVar);
                return;
            }
        }
        arrayList.add(new t(join, strArr, j3));
    }

    public static boolean l(String str, t tVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!v() && y(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && tVar.b(str2)) {
                return false;
            }
        }
        return true;
    }

    public static void m(StringBuilder sb2, JSONArray jSONArray, ArrayList arrayList) {
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

    public static void n() {
        g0.g3(new o(0));
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

    public static String o(String str, String str2, boolean z10) {
        return str.isEmpty() ? str2 : str2.isEmpty() ? str : z10 ? str.concat(str2) : p0.E(str, " ", str2);
    }

    public static void p() {
        for (t tVar : I()) {
            synchronized (tVar) {
                try {
                    if (tVar.d != 0) {
                        if (tVar.e > 0) {
                            tVar.f.add(Long.valueOf(tVar.d));
                        } else {
                            nativeFree(tVar.d);
                        }
                        tVar.d = 0L;
                    }
                    tVar.g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = q().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.b;
        ExecutorService executorService = DictationLid.a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        j1.g(file2);
        mp.g1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.e = false;
        DictationLid.a.execute(new o(2));
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
        L();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        n();
    }

    public static File q() {
        return new File(t0.b.getFilesDir(), "tinyasr");
    }

    public static void r(t tVar) {
        if (tVar == null || w(tVar)) {
            return;
        }
        s(tVar, false);
    }

    public static void s(t tVar, boolean z10) {
        long j3;
        if (tVar.h) {
            return;
        }
        tVar.h = true;
        tVar.i = 0.0f;
        int i7 = 0;
        if (!new File(q(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = j1.f(j1.a(), "silero-vad");
            if ((f10 != null ? f10.document.size : 0L) > 0) {
                TLRPC.TL_transcriptionModel f11 = j1.f(j1.a(), "silero-vad");
                j3 = f11 != null ? f11.document.size : 0L;
            } else {
                j3 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j3});
            n();
        }
        if (!new File(q(), tVar.a()).exists()) {
            h.putIfAbsent(tVar.a(), new long[]{0, tVar.c});
            n();
        }
        n();
        e.execute(new q(z10, tVar, i7));
    }

    public static int t(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, t tVar, boolean z10) {
        File file = new File(q(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return j1.c(tL_transcriptionModel, file, z10, new a3.h(str, tVar, new long[]{0}));
        } finally {
            E(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u(int i7) {
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

    public static boolean v() {
        return mp.g1().getBoolean("asr_auto", true);
    }

    public static boolean w(t tVar) {
        return tVar != null && new File(q(), tVar.a()).exists() && new File(q(), "silero_vad.onnx").exists();
    }

    public static boolean x() {
        return mp.g1().getBoolean("asr_google", false);
    }

    public static boolean y(String str) {
        String string = mp.g1().getString("asr_langs", null);
        if (string != null) {
            return p0.p(",", string, ",").contains("," + str + ",");
        }
        for (t tVar : I()) {
            if (tVar.b(str) && w(tVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(int i7) {
        return mp.g1().getBoolean(j10.i(i7).q() ? "asr_local_premium" : "asr_local_free", !j10.i(i7).q());
    }
}
