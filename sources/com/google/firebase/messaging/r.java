package com.google.firebase.messaging;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.b6;
import k9.t0;
import k9.w0;
import k9.x0;
import k9.z0;
import l3.l0;
import ld.f1;
import ld.i2;
import o4.v0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.t5;
import org.telegram.ui.cu;
import org.telegram.ui.web.i1;
import org.telegram.ui.web.j1;
import q5.g0;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r implements a3.b, o4.z, o3.m {
    public static r f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ r(int i10, boolean z4) {
        this.a = i10;
    }

    public static synchronized r A() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f == null) {
                    f = new r(0);
                }
                rVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static void P(long j10, HashMap hashMap) {
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

    public static final Message l(r rVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static void n(String str, String str2, HashMap hashMap) {
        j1 j1Var = new j1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    j1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.c.j(trim3, 1, 1);
                    }
                    j1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), j1Var);
    }

    public boolean B(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean C(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(vh.v2.e("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = e91.w0.matcher(trim);
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
                        D(i10, trim.substring(1, matcher.start()), hashMap);
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
            String[] strArr = (String[]) this.e;
            if (i12 < strArr.length) {
                String str2 = strArr[i12];
                Locale locale = Locale.US;
                Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(trim);
                if (matcher2.find()) {
                    D(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        D(i10, group, hashMap);
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
                            D(i10 - 1, matcher3.group(2), hashMap);
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
                                ArrayList arrayList = (ArrayList) this.c;
                                new HashMap();
                                Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.b);
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
                                    s(matcher6.group(3), matcher6.group(2).split(","));
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
                                    D(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            D(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.d;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    t(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                E(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.c.k("Premature left-side return of ", str5, " in ", trim));
                                }
                                E(matcher9.group(2), hashMap, zArr, i14);
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

    public void E(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = e91.u0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = e91.v0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        D(i10, trim, hashMap);
    }

    public void F(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void G(p0 p0Var) {
        HashMap hashMap = (HashMap) this.c;
        androidx.fragment.app.s sVar = p0Var.c;
        if (sVar.P) {
            ((m0) this.e).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean H(int i10, o4.v vVar) {
        o4.v vVar2;
        Object obj = this.b;
        v0 v0Var = (v0) this.e;
        if (vVar != null) {
            v0Var.getClass();
            vVar2 = v0Var.s(vVar);
            if (vVar2 == null) {
                return false;
            }
        } else {
            vVar2 = null;
        }
        v0Var.getClass();
        b4.e0 e0Var = (b4.e0) this.c;
        if (e0Var.b != i10 || !h5.d0.a((o4.v) e0Var.c, vVar2)) {
            this.c = new b4.e0((CopyOnWriteArrayList) v0Var.c.d, i10, vVar2);
        }
        o3.l lVar = (o3.l) this.d;
        if (lVar.a == i10 && h5.d0.a(lVar.b, vVar2)) {
            return true;
        }
        this.d = new o3.l(v0Var.d.c, i10, vVar2);
        return true;
    }

    public o4.r I(o4.r rVar) {
        v0 v0Var = (v0) this.e;
        Object obj = this.b;
        long j10 = rVar.f;
        v0Var.t(obj, j10);
        long j11 = rVar.g;
        v0Var.t(obj, j11);
        return (j10 == j10 && j11 == j11) ? rVar : new o4.r(rVar.a, rVar.b, rVar.c, rVar.d, rVar.e, j10, j11);
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
    public void J(k1.m mVar) {
        int i10;
        nd.b bVar;
        int i11;
        int i12;
        i5.c cVar;
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
        nd.b bVar2 = (nd.b) this.d;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = nd.b.b;
        boolean z10 = false;
        long j12 = 1152921504606846975L;
        boolean z11 = bVar2.i(atomicLongFieldUpdater2.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = nd.g.a;
        if (!z11) {
            i5.c cVar2 = nd.d.j;
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
                    nd.c cVar3 = nd.c.a;
                    while (true) {
                        a2 = qd.a.a(hVar3, j15, cVar3);
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
                    cVar = cVar2;
                    hVar = hVar3;
                    bVar2 = bVar;
                    j10 = j13;
                    z4 = i16;
                    i14 = bVar2.p(hVar, i12, mVar2, j10, cVar, z4);
                    i13 = 1;
                } else {
                    i12 = i11;
                    cVar = cVar2;
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
                                i5.c cVar4 = nd.d.k;
                                if (hVar.f.getAndSet((i12 * 2) + 1, cVar4) != cVar4) {
                                    i13 = 1;
                                    hVar.m(i12, true);
                                } else {
                                    i13 = 1;
                                }
                                i14 = 5;
                            }
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i12, mVar2, j10, cVar, z4);
                    } else if (bVar2.a(j10)) {
                        if (hVar.k(i12, null, nd.d.d)) {
                            i13 = 1;
                            i14 = 1;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i12, mVar2, j10, cVar, z4);
                    } else if (cVar == null) {
                        i13 = 1;
                        i14 = 3;
                    } else {
                        if (hVar.k(i12, null, cVar)) {
                            i13 = 1;
                            i14 = 2;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i12, mVar2, j10, cVar, z4);
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
                        cVar2 = cVar;
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
                    i2 i2Var = cVar instanceof i2 ? (i2) cVar : null;
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
                throw new j3.p0("Channel was closed normally");
            }
            if (obj instanceof nd.f) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) this.e).getAndIncrement() == 0) {
                ld.e0.q((ld.c0) this.b, new k1.c(this, (uc.c) null, 1));
                return;
            }
            return;
        }
        obj = obj2;
        if (!(obj instanceof nd.e)) {
        }
    }

    public boolean K(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(w(aVar), new l.r((Context) this.c, (l0.a) menuItem));
    }

    public boolean L(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e w10 = w(aVar);
        a0.k kVar = (a0.k) this.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(w10, menu2);
    }

    public ne.f M(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        ke.e eVar = new ke.e((ArrayList) this.b, (oe.b) this.d, (ArrayList) this.c);
        int i10 = 0;
        while (true) {
            int length = str.length();
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                char charAt = str.charAt(i11);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                break;
            }
            eVar.i(str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            eVar.i(str.substring(i10));
        }
        eVar.f(eVar.n);
        oe.a z4 = eVar.j.z(new f7.b(22, eVar.k, eVar.m));
        Iterator it = eVar.o.iterator();
        while (it.hasNext()) {
            ((pe.a) it.next()).g(z4);
        }
        ne.f fVar = (ne.f) eVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap N(BufferedReader bufferedReader) {
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
                long[] jArr = (long[]) this.e;
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
                            n(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            n(str, sb.toString(), hashMap);
        }
        if (str != null && sb != null) {
            n(str, sb.toString(), hashMap);
        }
        return hashMap;
    }

    public void O(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public s4.b Q(List list) {
        s4.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList o10 = o(list);
        if (o10.size() < 2) {
            return (s4.b) s8.l.g(o10, null);
        }
        Collections.sort(o10, new cu(18));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((s4.b) o10.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= o10.size()) {
                break;
            }
            s4.b bVar2 = (s4.b) o10.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (s4.b) o10.get(0);
            }
        }
        s4.b bVar3 = (s4.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = o10.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((s4.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i13);
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

    public void R(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.j.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        ld.e0.q(ld.e0.b((uc.h) this.b), new k1.c(this, arrayList, null, 5));
    }

    public Bundle S(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void T(View view) {
        ff.b bVar = (ff.b) this.e;
        if (((View) this.c) == view) {
            return;
        }
        U(null);
        View view2 = (View) this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(bVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(bVar);
            if (view.isAttachedToWindow()) {
                U(view.getViewTreeObserver());
            }
        }
        this.c = view;
    }

    public void U(ViewTreeObserver viewTreeObserver) {
        cf.d dVar = (cf.d) this.b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(dVar);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
        }
        this.d = viewTreeObserver;
    }

    public Task V(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new ja.c(callable, 12));
            this.c = continueWith.continueWith((Executor) this.b, new ab.a(9));
        }
        return continueWith;
    }

    public Task W(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new ja.c(callable, 12));
            this.c = continueWithTask.continueWith((Executor) this.b, new ab.a(9));
        }
        return continueWithTask;
    }

    @Override // o4.z
    public void a(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        if (H(i10, vVar)) {
            ((b4.e0) this.c).p(jVar, I(rVar));
        }
    }

    @Override // o3.m
    public void b(int i10, o4.v vVar) {
        if (H(i10, vVar)) {
            ((o3.l) this.d).a();
        }
    }

    @Override // o3.m
    public void c(int i10, o4.v vVar, int i11) {
        if (H(i10, vVar)) {
            ((o3.l) this.d).c(i11);
        }
    }

    @Override // o4.z
    public void d(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        if (H(i10, vVar)) {
            ((b4.e0) this.c).m(jVar, I(rVar));
        }
    }

    @Override // o3.m
    public void e(int i10, o4.v vVar, Exception exc) {
        if (H(i10, vVar)) {
            ((o3.l) this.d).d(exc);
        }
    }

    @Override // o4.z
    public void f(int i10, o4.v vVar, o4.r rVar) {
        if (H(i10, vVar)) {
            ((b4.e0) this.c).h(I(rVar));
        }
    }

    @Override // o4.z
    public void g(int i10, o4.v vVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        if (H(i10, vVar)) {
            ((b4.e0) this.c).s(jVar, I(rVar), iOException, z4);
        }
    }

    @Override // rc.a
    public Object get() {
        return new r((Executor) ((rc.a) this.b).get(), (f3.d) ((rc.a) this.c).get(), (androidx.biometric.e) ((androidx.biometric.e) this.d).get(), (g3.c) ((rc.a) this.e).get(), 5);
    }

    @Override // o4.z
    public void h(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        if (H(i10, vVar)) {
            ((b4.e0) this.c).u(jVar, I(rVar));
        }
    }

    @Override // o4.z
    public void i(int i10, o4.v vVar, o4.r rVar) {
        if (H(i10, vVar)) {
            ((b4.e0) this.c).A(I(rVar));
        }
    }

    @Override // o3.m
    public void j(int i10, o4.v vVar) {
        if (H(i10, vVar)) {
            ((o3.l) this.d).b();
        }
    }

    @Override // o3.m
    public void k(int i10, o4.v vVar) {
        if (H(i10, vVar)) {
            ((o3.l) this.d).e();
        }
    }

    public void m(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.b).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(sVar);
        }
        sVar.v = true;
    }

    public ArrayList o(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        P(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        P(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            s4.b bVar = (s4.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public t0 p() {
        String str = ((String) this.b) == null ? " processName" : "";
        if (((Integer) this.d) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.e) == null) {
            str = v2.k(str, " importance");
        }
        if (((Boolean) this.c) == null) {
            str = v2.k(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.b, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public w0 q() {
        String str = ((x0) this.c) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = v2.k(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = v2.k(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.c, (String) this.b, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 r() {
        String str = ((Integer) this.d) == null ? " platform" : "";
        if (((String) this.b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.e) == null) {
            str = v2.k(str, " buildVersion");
        }
        if (((Boolean) this.c) == null) {
            str = v2.k(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.d).intValue(), (String) this.b, (String) this.e, ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void s(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            E(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String t(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                s(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e) {
            arrayList.clear();
            FileLog.e(e);
        }
        return TextUtils.join("", arrayList);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((a3.c) this.e).toString();
            default:
                return super.toString();
        }
    }

    public androidx.fragment.app.s u(String str) {
        p0 p0Var = (p0) ((HashMap) this.c).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.s v(String str) {
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.I.c.v(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public k.e w(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList x() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List z() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public r(cf.d dVar) {
        this.a = 7;
        this.e = new ff.b(this, 0);
        this.b = dVar;
    }

    public r(File file) {
        this.a = 23;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        long[] jArr = new long[1];
        this.e = jArr;
        this.b = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(N(bufferedReader));
        j1 j1Var = (j1) hashMap.get("content-type");
        String str = j1Var == null ? null : (String) j1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            i1 i1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (i1Var != null) {
                        i1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(i1Var);
                        j1 j1Var2 = (j1) i1Var.a.get("content-location");
                        hashMap2.put(j1Var2 == null ? null : j1Var2.a, i1Var);
                    }
                    i1Var = new i1();
                    i1Var.b = (File) this.b;
                    i1Var.a.putAll(N(bufferedReader));
                    i1Var.c = jArr[0];
                }
            }
            if (i1Var != null && i1Var.c != 0 && i1Var.d != 0) {
                arrayList.add(i1Var);
                j1 j1Var3 = (j1) i1Var.a.get("content-location");
                hashMap2.put(j1Var3 != null ? j1Var3.a : null, i1Var);
            }
        }
        bufferedReader.close();
    }

    public r(ld.c0 c0Var, k1.o oVar, k1.p pVar) {
        this.a = 11;
        this.b = c0Var;
        this.c = pVar;
        nd.a[] aVarArr = nd.a.a;
        this.d = new nd.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i10 = 0;
        this.e = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(ld.b0.b);
        if (f1Var == null) {
            return;
        }
        f1Var.invokeOnCompletion(new k1.j(i10, oVar, this));
    }

    public r(c5.j jVar) {
        this.a = 20;
        ArrayList arrayList = (ArrayList) jVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) jVar.d;
        LinkedHashSet linkedHashSet2 = ke.e.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(ke.e.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        oe.b bVar = (g0) jVar.e;
        bVar = bVar == null ? new db.a(14) : bVar;
        this.d = bVar;
        this.e = (ArrayList) jVar.c;
        ArrayList arrayList3 = (ArrayList) jVar.b;
        this.c = arrayList3;
        bVar.z(new f7.b(22, arrayList3, Collections.EMPTY_MAP));
    }

    public r(uc.h hVar) {
        this.a = 16;
        this.b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new jf.a(this, 1);
    }

    public r(ExecutorService executorService) {
        this.a = 8;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new androidx.activity.i(this, 24));
    }

    public r(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.c = new char[i10 * 2];
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
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.c, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.d;
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

    public r(a3.c cVar, Object obj, Object obj2, Object[] objArr) {
        this.a = 4;
        this.e = cVar;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public r(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 15:
                this.b = null;
                this.c = l3.g.c;
                this.e = l0.a;
                break;
            case 25:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public r(Context context, ActionMode.Callback callback) {
        this.a = 10;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new a0.k(0);
    }

    public r(String str) {
        this.a = 21;
        this.c = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public r(v0 v0Var, Object obj) {
        this.a = 18;
        this.e = v0Var;
        this.c = v0Var.a(null);
        this.d = new o3.l(v0Var.d.c, 0, null);
        this.b = obj;
    }

    public r(Context context) {
        this.a = 15;
        this.b = context;
        this.c = l3.g.c;
        this.e = l0.a;
    }

    public r(xf.e eVar) {
        this.a = 26;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.B) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, b6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        t5 t5Var = new t5(eVar.getContext());
        this.b = t5Var;
        linearLayout.addView(t5Var, b6.n(-1, -2));
        textView2.setGravity(8388611);
        t5Var.setGravity(8388613);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public r(o4.t0 t0Var, boolean[] zArr) {
        this.a = 19;
        this.b = t0Var;
        this.c = zArr;
        int i10 = t0Var.a;
        this.d = new boolean[i10];
        this.e = new boolean[i10];
    }
}
