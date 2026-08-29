package com.google.firebase.messaging;

import ag.j2;
import ag.o1;
import ag.q1;
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
import i7.f6;
import i9.t0;
import i9.x0;
import i9.z0;
import j3.w0;
import j7.l1;
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
import java.util.LinkedHashMap;
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
import jd.f1;
import jd.i2;
import l4.g0;
import l4.h0;
import l4.k1;
import lh.e4;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.x5;
import org.telegram.ui.web.h1;
import org.telegram.ui.web.i1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s implements a3.b, h0, n3.g {
    public static s f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ s(int i10, boolean z10) {
        this.a = i10;
    }

    public static void K(long j10, HashMap hashMap) {
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

    public static final Message d(s sVar, ArrayList arrayList, int i10) {
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

    public static void i(String str, String str2, HashMap hashMap) {
        i1 i1Var = new i1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    i1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = com.google.android.recaptcha.internal.a.m(trim3, 1, 1);
                    }
                    i1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), i1Var);
    }

    public static synchronized s v() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f == null) {
                    f = new s(0);
                }
                sVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public void A(p0 p0Var) {
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

    public void B(p0 p0Var) {
        HashMap hashMap = (HashMap) this.c;
        androidx.fragment.app.s sVar = p0Var.c;
        if (sVar.O) {
            ((m0) this.e).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean C(int i10, l4.c0 c0Var) {
        l4.c0 c0Var2;
        Object obj = this.b;
        l4.j jVar = (l4.j) this.e;
        if (c0Var != null) {
            c0Var2 = jVar.s(obj, c0Var);
            if (c0Var2 == null) {
                return false;
            }
        } else {
            c0Var2 = null;
        }
        l4.c0 c0Var3 = c0Var2;
        int u10 = jVar.u(i10, obj);
        g0 g0Var = (g0) this.c;
        if (g0Var.a != u10 || !f5.d0.a(g0Var.b, c0Var3)) {
            this.c = new g0(jVar.c.c, u10, c0Var3, 0L);
        }
        j2 j2Var = (j2) this.d;
        if (j2Var.b == u10 && f5.d0.a((l4.c0) j2Var.c, c0Var3)) {
            return true;
        }
        this.d = new j2((CopyOnWriteArrayList) jVar.d.d, u10, c0Var3);
        return true;
    }

    public l4.x D(l4.x xVar) {
        l4.j jVar = (l4.j) this.e;
        Object obj = this.b;
        long j10 = xVar.f;
        long t10 = jVar.t(obj, j10);
        long j11 = xVar.g;
        long t11 = jVar.t(obj, j11);
        return (t10 == j10 && t11 == j11) ? xVar : new l4.x(xVar.a, xVar.b, xVar.c, xVar.d, xVar.e, t10, t11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0269, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Type inference failed for: r3v8, types: [ld.h, od.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(k1.l lVar) {
        ld.b bVar;
        fc.a aVar;
        int i10;
        int i11;
        k1.l lVar2;
        ld.h hVar;
        long j10;
        boolean z10;
        fc.a aVar2;
        int i12;
        int i13;
        int i14;
        Object obj;
        Object a2;
        int i15;
        ld.h hVar2;
        k1.l lVar3;
        od.d dVar;
        long j11;
        ld.c cVar;
        k1.l lVar4 = lVar;
        ld.b bVar2 = (ld.b) this.d;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = ld.b.b;
        boolean z11 = false;
        long j12 = 1152921504606846975L;
        boolean z12 = bVar2.i(atomicLongFieldUpdater.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = ld.g.a;
        if (!z12) {
            fc.a aVar3 = ld.d.j;
            ld.h hVar3 = (ld.h) ld.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
                long j13 = andIncrement & j12;
                boolean i16 = bVar2.i(andIncrement, z11);
                int i17 = ld.d.b;
                long j14 = i17;
                long j15 = j12;
                long j16 = j13 / j14;
                int i18 = (int) (j13 % j14);
                if (hVar3.c != j16) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = ld.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ld.b.f;
                    ld.h hVar4 = ld.d.a;
                    ld.c cVar2 = ld.c.a;
                    while (true) {
                        a2 = od.a.a(hVar3, j16, cVar2);
                        if (!od.a.d(a2)) {
                            od.u b10 = od.a.b(a2);
                            while (true) {
                                od.u uVar = (od.u) atomicReferenceFieldUpdater.get(bVar2);
                                i15 = i18;
                                cVar = cVar2;
                                if (uVar.c >= b10.c) {
                                    break;
                                }
                                if (!b10.j()) {
                                    break;
                                }
                                while (!atomicReferenceFieldUpdater.compareAndSet(bVar2, uVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(bVar2) != uVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        i18 = i15;
                                        cVar2 = cVar;
                                    }
                                }
                                if (uVar.f()) {
                                    uVar.e();
                                }
                            }
                        } else {
                            i15 = i18;
                            break;
                        }
                        i18 = i15;
                        cVar2 = cVar;
                    }
                    if (od.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * ld.d.b < atomicLongFieldUpdater2.get(bVar2)) {
                            hVar3.b();
                            ld.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            aVar = aVar3;
                            i10 = i17;
                            i11 = i15;
                            lVar3 = null;
                            lVar2 = null;
                            if (lVar3 == null) {
                                hVar = lVar3;
                            } else {
                                if (i16) {
                                    obj = new ld.e(bVar.f());
                                    break;
                                }
                                ld.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                j12 = j15;
                                aVar3 = aVar;
                                z11 = false;
                            }
                        } else {
                            ld.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            aVar = aVar3;
                            i10 = i17;
                            i11 = i15;
                            lVar2 = null;
                            lVar3 = lVar2;
                            if (lVar3 == null) {
                            }
                        }
                    } else {
                        ?? r32 = (ld.h) od.a.b(a2);
                        long j17 = r32.c;
                        if (j17 > j16) {
                            long j18 = ld.d.b * j17;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = ld.b.b;
                            int i19 = i17;
                            long j19 = j17;
                            od.d dVar2 = r32;
                            while (true) {
                                long j20 = atomicLongFieldUpdater3.get(bVar2);
                                long j21 = j20 & j15;
                                if (j21 >= j18) {
                                    ld.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    aVar = aVar3;
                                    dVar = dVar2;
                                    i10 = i19;
                                    j11 = j19;
                                    i11 = i15;
                                    lVar2 = null;
                                    break;
                                }
                                ld.b bVar4 = bVar2;
                                aVar = aVar3;
                                long j22 = (((int) (j20 >> 60)) << 60) + j21;
                                i10 = i19;
                                j11 = j19;
                                lVar2 = null;
                                dVar = dVar2;
                                hVar2 = hVar3;
                                i11 = i15;
                                bVar = bVar4;
                                if (ld.b.b.compareAndSet(bVar, j20, j22)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                i15 = i11;
                                i19 = i10;
                                j19 = j11;
                                dVar2 = dVar;
                                aVar3 = aVar;
                            }
                            if (j11 * ld.d.b < atomicLongFieldUpdater2.get(bVar)) {
                                dVar.b();
                            }
                            lVar3 = lVar2;
                            if (lVar3 == null) {
                            }
                        } else {
                            ld.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            aVar = aVar3;
                            i10 = i17;
                            i11 = i15;
                            lVar2 = null;
                            lVar3 = r32;
                            if (lVar3 == null) {
                            }
                        }
                    }
                } else {
                    ld.h hVar9 = hVar3;
                    bVar = bVar2;
                    aVar = aVar3;
                    i10 = i17;
                    i11 = i18;
                    lVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, lVar4);
                if (i16) {
                    bVar2 = bVar;
                    j10 = j13;
                    z10 = i16;
                    aVar2 = aVar;
                    i12 = 4;
                    i14 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z10);
                    i13 = 1;
                } else {
                    bVar2 = bVar;
                    j10 = j13;
                    z10 = i16;
                    k1.l lVar5 = lVar2;
                    aVar2 = aVar;
                    i12 = 4;
                    Object l10 = hVar.l(i11);
                    if (l10 != null) {
                        if (l10 instanceof i2) {
                            hVar.n(i11, lVar5);
                            if (bVar2.m(l10, lVar4)) {
                                hVar.o(i11, ld.d.i);
                                i13 = 1;
                                i14 = 0;
                            } else {
                                fc.a aVar4 = ld.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, aVar4) != aVar4) {
                                    i13 = 1;
                                    hVar.m(i11, true);
                                } else {
                                    i13 = 1;
                                }
                                i14 = 5;
                            }
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z10);
                    } else if (bVar2.a(j10)) {
                        if (hVar.k(i11, lVar5, ld.d.d)) {
                            i13 = 1;
                            i14 = 1;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z10);
                    } else if (aVar2 == null) {
                        i13 = 1;
                        i14 = 3;
                    } else {
                        if (hVar.k(i11, lVar5, aVar2)) {
                            i13 = 1;
                            i14 = 2;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z10);
                    }
                }
                Object obj3 = qc.i.a;
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
                    if (i14 != i12) {
                        if (i14 == 5) {
                            hVar.b();
                        }
                        lVar4 = lVar;
                        hVar3 = hVar;
                        aVar3 = aVar2;
                        j12 = j15;
                        z11 = false;
                    } else {
                        if (j10 < ld.b.c.get(bVar2)) {
                            hVar.b();
                        }
                        obj = new ld.e(bVar2.f());
                    }
                } else if (z10) {
                    hVar.i();
                    obj = new ld.e(bVar2.f());
                } else {
                    i2 i2Var = aVar2 instanceof i2 ? (i2) aVar2 : null;
                    if (i2Var != null) {
                        i2Var.b(hVar, i11 + i10);
                    }
                    hVar.i();
                    obj = obj2;
                }
            }
        } else {
            obj = obj2;
        }
        i12 = 4;
        if (obj instanceof ld.e) {
            Throwable th2 = ((ld.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new w0("Channel was closed normally");
        }
        if (obj instanceof ld.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            jd.e0.q((jd.c0) this.b, new ja.l(this, null, i12));
        }
    }

    public boolean F(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(r(aVar), new l.r((Context) this.c, (l0.a) menuItem));
    }

    public boolean G(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e r6 = r(aVar);
        a0.k kVar = (a0.k) this.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(r6, menu2);
    }

    public le.f H(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        ie.e eVar = new ie.e((ArrayList) this.b, (me.b) this.d, (ArrayList) this.c);
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
        List list = eVar.k;
        LinkedHashMap linkedHashMap = eVar.m;
        me.a E1 = eVar.j.E1(new g9.l(list, linkedHashMap, false, 9));
        Iterator it = eVar.o.iterator();
        while (it.hasNext()) {
            ((ne.a) it.next()).g(E1);
        }
        le.f fVar = (le.f) eVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap I(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb2 = null;
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
                if (str == null || sb2 == null) {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb2 = com.google.android.recaptcha.internal.a.n(trim3);
                            str = trim2;
                        } else {
                            i(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            i(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            i(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void J(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public p4.b L(List list) {
        p4.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList j10 = j(list);
        if (j10.size() < 2) {
            return (p4.b) q8.l.f(j10, null);
        }
        Collections.sort(j10, new e4(5));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((p4.b) j10.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= j10.size()) {
                break;
            }
            p4.b bVar2 = (p4.b) j10.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (p4.b) j10.get(0);
            }
        }
        p4.b bVar3 = (p4.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = j10.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((p4.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (p4.b) q8.l.g(subList);
                break;
            }
            bVar = (p4.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public void M(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.j.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        jd.e0.q(jd.e0.b((sc.h) this.b), new ja.l(this, arrayList, null, 2));
    }

    public Bundle N(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void O(View view) {
        df.b bVar = (df.b) this.e;
        if (((View) this.c) == view) {
            return;
        }
        P(null);
        View view2 = (View) this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(bVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(bVar);
            if (view.isAttachedToWindow()) {
                P(view.getViewTreeObserver());
            }
        }
        this.c = view;
    }

    public void P(ViewTreeObserver viewTreeObserver) {
        af.e eVar = (af.e) this.b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(eVar);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
        }
        this.d = viewTreeObserver;
    }

    public Task Q(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new o1(callable, 15));
            this.c = continueWith.continueWith((Executor) this.b, new f7.v(7));
        }
        return continueWith;
    }

    public Task R(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new o1(callable, 15));
            this.c = continueWithTask.continueWith((Executor) this.b, new f7.v(7));
        }
        return continueWithTask;
    }

    @Override // l4.h0
    public void a(int i10, l4.c0 c0Var, l4.p pVar, l4.x xVar) {
        if (C(i10, c0Var)) {
            ((g0) this.c).e(pVar, D(xVar));
        }
    }

    @Override // l4.h0
    public void b(int i10, l4.c0 c0Var, l4.x xVar) {
        if (C(i10, c0Var)) {
            ((g0) this.c).m(D(xVar));
        }
    }

    @Override // l4.h0
    public void c(int i10, l4.c0 c0Var, l4.x xVar) {
        if (C(i10, c0Var)) {
            ((g0) this.c).c(D(xVar));
        }
    }

    public void e(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.b).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(sVar);
        }
        sVar.v = true;
    }

    @Override // l4.h0
    public void f(int i10, l4.c0 c0Var, l4.p pVar, l4.x xVar, IOException iOException, boolean z10) {
        if (C(i10, c0Var)) {
            ((g0) this.c).j(pVar, D(xVar), iOException, z10);
        }
    }

    @Override // l4.h0
    public void g(int i10, l4.c0 c0Var, l4.p pVar, l4.x xVar) {
        if (C(i10, c0Var)) {
            ((g0) this.c).l(pVar, D(xVar));
        }
    }

    @Override // pc.a
    public Object get() {
        return new s((Executor) ((pc.a) this.b).get(), (f3.d) ((pc.a) this.c).get(), (androidx.biometric.e) ((androidx.biometric.e) this.d).get(), (g3.c) ((pc.a) this.e).get(), 6);
    }

    @Override // l4.h0
    public void h(int i10, l4.c0 c0Var, l4.p pVar, l4.x xVar) {
        if (C(i10, c0Var)) {
            ((g0) this.c).g(pVar, D(xVar));
        }
    }

    public ArrayList j(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        K(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        K(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p4.b bVar = (p4.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public t0 k() {
        String str = ((String) this.b) == null ? " processName" : "";
        if (((Integer) this.d) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.e) == null) {
            str = u3.c.k(str, " importance");
        }
        if (((Boolean) this.c) == null) {
            str = u3.c.k(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.b, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public i9.w0 l() {
        String str = ((x0) this.c) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = u3.c.k(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = u3.c.k(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new i9.w0((x0) this.c, (String) this.b, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 m() {
        String str = ((Integer) this.d) == null ? " platform" : "";
        if (((String) this.b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.e) == null) {
            str = u3.c.k(str, " buildVersion");
        }
        if (((Boolean) this.c) == null) {
            str = u3.c.k(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.d).intValue(), (String) this.b, (String) this.e, ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void n(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            z(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String o(String str) {
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
                n(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            FileLog.e(e10);
        }
        return TextUtils.join("", arrayList);
    }

    public androidx.fragment.app.s p(String str) {
        p0 p0Var = (p0) ((HashMap) this.c).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.s q(String str) {
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.H.c.q(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public k.e r(k.a aVar) {
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

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList t() {
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

    public String toString() {
        switch (this.a) {
            case 4:
                return ((m5.i) this.e).toString();
            default:
                return super.toString();
        }
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public boolean w(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean x(Context context) {
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
    
        throw new java.lang.Exception(u3.c.e("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = s81.v0.matcher(trim);
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
                        y(i10, trim.substring(1, matcher.start()), hashMap);
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
                    y(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        y(i10, group, hashMap);
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
                            y(i10 - 1, matcher3.group(2), hashMap);
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
                                    n(matcher6.group(3), matcher6.group(2).split(","));
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
                                    y(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            y(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.d;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    o(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                z(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(l1.n("Premature left-side return of ", str5, " in ", trim));
                                }
                                z(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(l1.n("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = s81.t0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = s81.u0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        y(i10, trim, hashMap);
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public s(af.e eVar) {
        this.a = 5;
        this.e = new df.b(this, 0);
        this.b = eVar;
    }

    public s(File file) {
        this.a = 24;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        long[] jArr = new long[1];
        this.e = jArr;
        this.b = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(I(bufferedReader));
        i1 i1Var = (i1) hashMap.get("content-type");
        String str = i1Var == null ? null : (String) i1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            h1 h1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (h1Var != null) {
                        h1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(h1Var);
                        i1 i1Var2 = (i1) h1Var.a.get("content-location");
                        hashMap2.put(i1Var2 == null ? null : i1Var2.a, h1Var);
                    }
                    h1Var = new h1();
                    h1Var.b = (File) this.b;
                    h1Var.a.putAll(I(bufferedReader));
                    h1Var.c = jArr[0];
                }
            }
            if (h1Var != null && h1Var.c != 0 && h1Var.d != 0) {
                arrayList.add(h1Var);
                i1 i1Var3 = (i1) h1Var.a.get("content-location");
                hashMap2.put(i1Var3 != null ? i1Var3.a : null, h1Var);
            }
        }
        bufferedReader.close();
    }

    public s(jd.c0 c0Var, k1.n nVar, k1.o oVar) {
        this.a = 15;
        this.b = c0Var;
        this.c = oVar;
        ld.a[] aVarArr = ld.a.a;
        this.d = new ld.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i10 = 0;
        this.e = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(jd.b0.b);
        if (f1Var == null) {
            return;
        }
        f1Var.invokeOnCompletion(new k1.i(i10, nVar, this));
    }

    public s(a5.j jVar) {
        this.a = 19;
        ArrayList arrayList = (ArrayList) jVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) jVar.d;
        LinkedHashSet linkedHashSet2 = ie.e.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(ie.e.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        me.b bVar = (oc.i) jVar.e;
        bVar = bVar == null ? new ya.a(12) : bVar;
        this.d = bVar;
        this.e = (ArrayList) jVar.c;
        ArrayList arrayList3 = (ArrayList) jVar.b;
        this.c = arrayList3;
        bVar.E1(new g9.l(arrayList3, Collections.EMPTY_MAP, false, 9));
    }

    public s(sc.h hVar) {
        this.a = 13;
        this.b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new gf.a(this, 1);
    }

    public s(ExecutorService executorService) {
        this.a = 8;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new q1(this, 23));
    }

    public s(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.r(1024);
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
            androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(this, i16);
            p1.a b10 = nVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.c, i16 * 2);
            p1.a b11 = nVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.d;
                p1.a b12 = nVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                rVar.a(nVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public s(m5.i iVar, Object obj, Object obj2, Object[] objArr) {
        this.a = 4;
        this.e = iVar;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 20:
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

    public s(Context context, ActionMode.Callback callback) {
        this.a = 14;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new a0.k(0);
    }

    public s(String str) {
        this.a = 22;
        this.c = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public s(l4.j jVar, Object obj) {
        this.a = 16;
        this.e = jVar;
        this.c = jVar.a(null);
        this.d = new j2((CopyOnWriteArrayList) jVar.d.d, 0, (l4.c0) null);
        this.b = obj;
    }

    public s(vf.e eVar) {
        this.a = 25;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.A) {
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
        linearLayout.addView(textView2, f6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        x5 x5Var = new x5(eVar.getContext());
        this.b = x5Var;
        linearLayout.addView(x5Var, f6.n(-1, -2));
        textView2.setGravity(8388611);
        x5Var.setGravity(8388613);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public s(k1 k1Var, boolean[] zArr) {
        this.a = 17;
        this.b = k1Var;
        this.c = zArr;
        int i10 = k1Var.a;
        this.d = new boolean[i10];
        this.e = new boolean[i10];
    }
}
