package com.google.firebase.messaging;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import j3.p0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.w0;
import k9.x0;
import l3.l0;
import ld.i2;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f91;
import org.telegram.ui.du;
import org.telegram.ui.web.j1;
import org.telegram.ui.web.k1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s {
    public static s e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public s(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(l(bufferedReader));
        k1 k1Var = (k1) hashMap.get("content-type");
        String str = k1Var == null ? null : (String) k1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            j1 j1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (j1Var != null) {
                        j1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(j1Var);
                        k1 k1Var2 = (k1) j1Var.a.get("content-location");
                        hashMap2.put(k1Var2 == null ? null : k1Var2.a, j1Var);
                    }
                    j1Var = new j1();
                    j1Var.b = (File) this.a;
                    j1Var.a.putAll(l(bufferedReader));
                    j1Var.c = jArr[0];
                }
            }
            if (j1Var != null && j1Var.c != 0 && j1Var.d != 0) {
                arrayList.add(j1Var);
                k1 k1Var3 = (k1) j1Var.a.get("content-location");
                hashMap2.put(k1Var3 != null ? k1Var3.a : null, j1Var);
            }
        }
        bufferedReader.close();
    }

    public static void a(String str, String str2, HashMap hashMap) {
        k1 k1Var = new k1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    k1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.c.j(trim3, 1, 1);
                    }
                    k1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), k1Var);
    }

    public static synchronized s f() {
        s sVar;
        synchronized (s.class) {
            try {
                if (e == null) {
                    e = new s(0);
                }
                sVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static void m(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    public ArrayList b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        m(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        m(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            s4.b bVar = (s4.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public w0 c() {
        String str = ((x0) this.b) == null ? " rolloutVariant" : "";
        if (((String) this.a) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.c) == null) {
            str = w.c.e(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = w.c.e(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.b, (String) this.a, (String) this.c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void d(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            j(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String e(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.a);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                d(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e6) {
            arrayList.clear();
            FileLog.e(e6);
        }
        return TextUtils.join("", arrayList);
    }

    public boolean g(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean h(Context context) {
        if (((Boolean) this.b) == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(org.telegram.ui.yh.k("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = f91.w0.matcher(trim);
            int i11 = 0;
            while (true) {
                if (!matcher.find()) {
                    break;
                }
                if (matcher.group(0).indexOf(48) == 40) {
                    i11++;
                } else {
                    i11--;
                    if (i11 == 0) {
                        i(i10, trim.substring(1, matcher.start()), hashMap);
                        trim = trim.substring(matcher.end()).trim();
                        if (TextUtils.isEmpty(trim)) {
                            return;
                        }
                    }
                }
            }
        }
        int i12 = 0;
        while (true) {
            String[] strArr = (String[]) this.d;
            if (i12 < strArr.length) {
                String str2 = strArr[i12];
                Locale locale = Locale.US;
                Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(trim);
                if (matcher2.find()) {
                    i(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        i(i10, group, hashMap);
                        return;
                    }
                }
                i12++;
            } else {
                try {
                    Integer.parseInt(trim);
                    return;
                } catch (Exception unused) {
                    Locale locale2 = Locale.US;
                    if (Pattern.compile("(?!if|return|true|false)([a-zA-Z_$][a-zA-Z_$0-9]*)$").matcher(trim).find()) {
                        return;
                    }
                    if (trim.charAt(0) == '\"' && trim.charAt(trim.length() - 1) == '\"') {
                        return;
                    }
                    try {
                        new JSONObject(trim).toString();
                        return;
                    } catch (Exception unused2) {
                        Locale locale3 = Locale.US;
                        Matcher matcher3 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher3.find()) {
                            matcher3.group(1);
                            i(i10 - 1, matcher3.group(2), hashMap);
                            return;
                        }
                        Matcher matcher4 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\.([^(]+)|\\[([^]]+)\\])\\s*(?:\\(+([^()]*)\\))?$").matcher(trim);
                        if (matcher4.find()) {
                            String group2 = matcher4.group(1);
                            String group3 = matcher4.group(2);
                            String group4 = matcher4.group(3);
                            if (TextUtils.isEmpty(group3)) {
                                group3 = group4;
                            }
                            group3.replace("\"", "");
                            String group5 = matcher4.group(4);
                            if (hashMap.get(group2) == null) {
                                ArrayList arrayList = (ArrayList) this.b;
                                new HashMap();
                                Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.a);
                                String str3 = null;
                                while (true) {
                                    if (!matcher5.find()) {
                                        break;
                                    }
                                    String group6 = matcher5.group();
                                    String group7 = matcher5.group(2);
                                    if (TextUtils.isEmpty(group7)) {
                                        str3 = group7;
                                    } else {
                                        if (!arrayList.contains(group6)) {
                                            arrayList.add(matcher5.group());
                                        }
                                        str3 = group7;
                                    }
                                }
                                Matcher matcher6 = Pattern.compile("((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+'))\\s*:\\s*function\\(([a-z,]+)\\)\\{([^}]+)\\}").matcher(str3);
                                while (matcher6.find()) {
                                    d(matcher6.group(3), matcher6.group(2).split(","));
                                }
                            }
                            if (group5 == null) {
                                return;
                            }
                            if (trim.charAt(trim.length() - 1) != ')') {
                                throw new Exception("last char not ')'");
                            }
                            if (group5.length() != 0) {
                                for (String str4 : group5.split(",")) {
                                    i(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            i(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    e(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                j(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.c.k("Premature left-side return of ", str5, " in ", trim));
                                }
                                j(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.c.k("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public void j(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = f91.u0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = f91.v0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        i(i10, trim, hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0245, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(k1.m mVar) {
        int i10;
        nd.b bVar;
        int i11;
        int i12;
        com.google.android.gms.internal.clearcut.e eVar;
        nd.h hVar;
        long j10;
        boolean z4;
        int i13;
        int i14;
        Object obj;
        Object a2;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        int i15;
        nd.h hVar2;
        k1.m mVar2 = mVar;
        nd.b bVar2 = (nd.b) this.c;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = nd.b.b;
        boolean z10 = false;
        long j12 = 1152921504606846975L;
        boolean z11 = bVar2.i(atomicLongFieldUpdater2.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = nd.g.a;
        if (!z11) {
            com.google.android.gms.internal.clearcut.e eVar2 = nd.d.j;
            nd.h hVar3 = (nd.h) nd.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar2);
                long j13 = andIncrement & j12;
                boolean i16 = bVar2.i(andIncrement, z10);
                int i17 = nd.d.b;
                long j14 = i17;
                long j15 = j13 / j14;
                int i18 = (int) (j13 % j14);
                long j16 = j12;
                if (hVar3.c != j15) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = nd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.b.f;
                    nd.h hVar4 = nd.d.a;
                    nd.c cVar = nd.c.a;
                    while (true) {
                        a2 = qd.a.a(hVar3, j15, cVar);
                        if (!qd.a.d(a2)) {
                            qd.t b10 = qd.a.b(a2);
                            while (true) {
                                qd.t tVar = (qd.t) atomicReferenceFieldUpdater.get(bVar2);
                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                j11 = j15;
                                i15 = i18;
                                if (tVar.c >= b10.c) {
                                    break;
                                }
                                if (!b10.j()) {
                                    break;
                                }
                                while (!atomicReferenceFieldUpdater.compareAndSet(bVar2, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(bVar2) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        i18 = i15;
                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        j15 = j11;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            j11 = j15;
                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                            i15 = i18;
                            break;
                        }
                        i18 = i15;
                        atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                        j15 = j11;
                    }
                    if (qd.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * nd.d.b < atomicLongFieldUpdater.get(bVar2)) {
                            hVar3.b();
                            hVar2 = hVar3;
                            i10 = i17;
                            hVar3 = null;
                            bVar = bVar2;
                            i11 = i15;
                            if (hVar3 == null) {
                                if (i16) {
                                    obj = new nd.e(bVar.f());
                                    break;
                                }
                                bVar2 = bVar;
                                j12 = j16;
                                hVar3 = hVar2;
                                z10 = false;
                            }
                        } else {
                            hVar2 = hVar3;
                            i10 = i17;
                            bVar = bVar2;
                            i11 = i15;
                            hVar3 = null;
                            if (hVar3 == null) {
                            }
                        }
                    } else {
                        AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater;
                        nd.h hVar5 = (nd.h) qd.a.b(a2);
                        long j17 = hVar5.c;
                        if (j17 > j11) {
                            long j18 = j17 * nd.d.b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater5 = nd.b.b;
                            while (true) {
                                long j19 = atomicLongFieldUpdater5.get(bVar2);
                                long j20 = j19 & j16;
                                if (j20 >= j18) {
                                    hVar2 = hVar3;
                                    i10 = i17;
                                    bVar = bVar2;
                                    i11 = i15;
                                    break;
                                }
                                long j21 = (((int) (j19 >> 60)) << 60) + j20;
                                hVar2 = hVar3;
                                int i19 = i17;
                                bVar = bVar2;
                                i11 = i15;
                                i10 = i19;
                                if (nd.b.b.compareAndSet(bVar, j19, j21)) {
                                    break;
                                }
                                i15 = i11;
                                bVar2 = bVar;
                                i17 = i10;
                                hVar3 = hVar2;
                            }
                            if (j17 * nd.d.b < atomicLongFieldUpdater4.get(bVar)) {
                                hVar5.b();
                            }
                            hVar3 = null;
                            if (hVar3 == null) {
                            }
                        } else {
                            hVar2 = hVar3;
                            i10 = i17;
                            bVar = bVar2;
                            i11 = i15;
                            hVar3 = hVar5;
                            if (hVar3 == null) {
                            }
                        }
                    }
                } else {
                    i10 = i17;
                    bVar = bVar2;
                    i11 = i18;
                }
                hVar3.n(i11, mVar2);
                if (i16) {
                    i12 = i11;
                    eVar = eVar2;
                    hVar = hVar3;
                    bVar2 = bVar;
                    j10 = j13;
                    z4 = i16;
                    i14 = bVar2.p(hVar, i12, mVar2, j10, eVar, z4);
                    i13 = 1;
                } else {
                    i12 = i11;
                    eVar = eVar2;
                    hVar = hVar3;
                    bVar2 = bVar;
                    j10 = j13;
                    z4 = i16;
                    Object l10 = hVar.l(i12);
                    if (l10 != null) {
                        if (l10 instanceof i2) {
                            hVar.n(i12, null);
                            if (bVar2.m(l10, mVar2)) {
                                hVar.o(i12, nd.d.i);
                                i13 = 1;
                                i14 = 0;
                            } else {
                                com.google.android.gms.internal.clearcut.e eVar3 = nd.d.k;
                                if (hVar.f.getAndSet((i12 * 2) + 1, eVar3) != eVar3) {
                                    i13 = 1;
                                    hVar.m(i12, true);
                                } else {
                                    i13 = 1;
                                }
                                i14 = 5;
                            }
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i12, mVar2, j10, eVar, z4);
                    } else if (bVar2.a(j10)) {
                        if (hVar.k(i12, null, nd.d.d)) {
                            i13 = 1;
                            i14 = 1;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i12, mVar2, j10, eVar, z4);
                    } else if (eVar == null) {
                        i13 = 1;
                        i14 = 3;
                    } else {
                        if (hVar.k(i12, null, eVar)) {
                            i13 = 1;
                            i14 = 2;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i12, mVar2, j10, eVar, z4);
                    }
                }
                Object obj3 = sc.i.a;
                if (i14 == 0) {
                    hVar.b();
                    break;
                }
                if (i14 == i13) {
                    break;
                }
                if (i14 != 2) {
                    if (i14 == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (i14 != 4) {
                        if (i14 == 5) {
                            hVar.b();
                        }
                        mVar2 = mVar;
                        hVar3 = hVar;
                        eVar2 = eVar;
                        j12 = j16;
                        z10 = false;
                    } else {
                        if (j10 < nd.b.c.get(bVar2)) {
                            hVar.b();
                        }
                        obj = new nd.e(bVar2.f());
                    }
                } else if (z4) {
                    hVar.i();
                    obj = new nd.e(bVar2.f());
                } else {
                    i2 i2Var = eVar instanceof i2 ? (i2) eVar : null;
                    if (i2Var != null) {
                        i2Var.a(hVar, i12 + i10);
                    }
                    hVar.i();
                }
            }
            if (!(obj instanceof nd.e)) {
                Throwable th2 = ((nd.e) obj).a;
                if (th2 != null) {
                    throw th2;
                }
                throw new p0("Channel was closed normally");
            }
            if (obj instanceof nd.f) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) this.d).getAndIncrement() == 0) {
                ld.e0.q((ld.c0) this.a, new k1.c(this, (uc.c) null, 1));
                return;
            }
            return;
        }
        obj = obj2;
        if (!(obj instanceof nd.e)) {
        }
    }

    public HashMap l(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.d;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                }
                if (str == null || sb == null) {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb = e2.c.l(trim3);
                            str = trim2;
                        } else {
                            a(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            a(str, sb.toString(), hashMap);
        }
        if (str != null && sb != null) {
            a(str, sb.toString(), hashMap);
        }
        return hashMap;
    }

    public s4.b n(List list) {
        s4.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList b10 = b(list);
        if (b10.size() < 2) {
            return (s4.b) s8.l.g(b10, null);
        }
        Collections.sort(b10, new du(18));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((s4.b) b10.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= b10.size()) {
                break;
            }
            s4.b bVar2 = (s4.b) b10.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (s4.b) b10.get(0);
            }
        }
        s4.b bVar3 = (s4.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = b10.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((s4.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (s4.b) s8.l.h(subList);
                break;
            }
            bVar = (s4.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public void o(View view) {
        ff.b bVar = (ff.b) this.d;
        if (((View) this.b) == view) {
            return;
        }
        p(null);
        View view2 = (View) this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(bVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(bVar);
            if (view.isAttachedToWindow()) {
                p(view.getViewTreeObserver());
            }
        }
        this.b = view;
    }

    public void p(ViewTreeObserver viewTreeObserver) {
        cf.d dVar = (cf.d) this.a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.c).removeOnGlobalLayoutListener(dVar);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
        }
        this.c = viewTreeObserver;
    }

    public s(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.d = typeface;
        this.a = bVar;
        this.c = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.b = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.b, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.c;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public s(int i10) {
        switch (i10) {
            case 8:
                this.a = null;
                this.b = l3.g.c;
                this.d = l0.a;
                break;
            case 13:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
        }
    }

    public s(String str) {
        this.b = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.a = str;
    }
}
