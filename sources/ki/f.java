package ki;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.j0;
import androidx.fragment.app.p0;
import androidx.fragment.app.s;
import b2.p;
import b2.u0;
import b2.x0;
import bi.ya;
import bi.z4;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e9.g0;
import e9.i0;
import e9.m0;
import ee.t;
import ee.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.e3;
import m4.b0;
import m4.j1;
import m4.n1;
import m4.o1;
import m4.r;
import m4.w;
import n4.y;
import n7.a1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.o91;
import org.telegram.ui.web.l1;
import org.telegram.ui.web.m1;
import y9.t0;
import y9.z0;
import zd.c0;
import zd.e0;
import zd.i2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f implements n5.b {
    public static volatile f e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(H(bufferedReader));
        m1 m1Var = (m1) hashMap.get("content-type");
        String str = m1Var == null ? null : (String) m1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            l1 l1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (l1Var != null) {
                        l1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(l1Var);
                        m1 m1Var2 = (m1) l1Var.a.get("content-location");
                        hashMap2.put(m1Var2 == null ? null : m1Var2.a, l1Var);
                    }
                    l1Var = new l1();
                    l1Var.b = (File) this.a;
                    l1Var.a.putAll(H(bufferedReader));
                    l1Var.c = jArr[0];
                }
            }
            if (l1Var != null && l1Var.c != 0 && l1Var.d != 0) {
                arrayList.add(l1Var);
                m1 m1Var3 = (m1) l1Var.a.get("content-location");
                hashMap2.put(m1Var3 != null ? m1Var3.a : null, l1Var);
            }
        }
        bufferedReader.close();
    }

    public static final Message a(f fVar, ArrayList arrayList, int i10) {
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

    public static void e(String str, String str2, HashMap hashMap) {
        m1 m1Var = new m1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    m1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.h(1, 1, trim3);
                    }
                    m1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), m1Var);
    }

    public boolean A(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        b0 b0Var = (b0) ((WeakReference) this.d).get();
        return eVar != null && eVar.e.a(i10) && b0Var != null && b0Var.t.t().a(i10);
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        if (eVar != null) {
            o1 o1Var = eVar.d;
            o1Var.getClass();
            e2.d.a("Use contains(Command) for custom command", i10 != 0);
            Iterator<E> it = o1Var.a.iterator();
            while (it.hasNext()) {
                if (((n1) it.next()).a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean C(r rVar, n1 n1Var) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        if (eVar == null) {
            return false;
        }
        m0 m0Var = eVar.d.a;
        n1Var.getClass();
        return m0Var.contains(n1Var);
    }

    public void D(p0 p0Var) {
        s sVar = p0Var.c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void E(p0 p0Var) {
        HashMap hashMap = (HashMap) this.b;
        s sVar = p0Var.c;
        if (sVar.S) {
            ((androidx.fragment.app.m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0269, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v8, types: [be.h, ee.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(k1.k kVar) {
        be.b bVar;
        v vVar;
        int i10;
        int i11;
        k1.k kVar2;
        be.h hVar;
        long j3;
        boolean z10;
        v vVar2;
        int i12;
        int i13;
        int i14;
        Object obj;
        Object a2;
        int i15;
        be.h hVar2;
        k1.k kVar3;
        ee.d dVar;
        long j10;
        be.c cVar;
        k1.k kVar4 = kVar;
        be.b bVar2 = (be.b) this.c;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = be.b.b;
        boolean z11 = false;
        long j11 = 1152921504606846975L;
        boolean z12 = bVar2.i(atomicLongFieldUpdater.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = be.g.a;
        if (!z12) {
            v vVar3 = be.d.j;
            be.h hVar3 = (be.h) be.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
                long j12 = andIncrement & j11;
                boolean i16 = bVar2.i(andIncrement, z11);
                int i17 = be.d.b;
                long j13 = i17;
                long j14 = j11;
                long j15 = j12 / j13;
                int i18 = (int) (j12 % j13);
                if (hVar3.c != j15) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = be.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.f;
                    be.h hVar4 = be.d.a;
                    be.c cVar2 = be.c.a;
                    while (true) {
                        a2 = ee.a.a(hVar3, j15, cVar2);
                        if (!ee.a.d(a2)) {
                            t b10 = ee.a.b(a2);
                            while (true) {
                                t tVar = (t) atomicReferenceFieldUpdater.get(bVar2);
                                i15 = i18;
                                cVar = cVar2;
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
                                        cVar2 = cVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            i15 = i18;
                            break;
                        }
                        i18 = i15;
                        cVar2 = cVar;
                    }
                    if (ee.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * be.d.b < atomicLongFieldUpdater2.get(bVar2)) {
                            hVar3.b();
                            be.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            vVar = vVar3;
                            i10 = i17;
                            i11 = i15;
                            kVar3 = null;
                            kVar2 = null;
                            if (kVar3 == null) {
                                hVar = kVar3;
                            } else {
                                if (i16) {
                                    obj = new be.e(bVar.f());
                                    break;
                                }
                                be.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                j11 = j14;
                                vVar3 = vVar;
                                z11 = false;
                            }
                        } else {
                            be.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            vVar = vVar3;
                            i10 = i17;
                            i11 = i15;
                            kVar2 = null;
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        }
                    } else {
                        ?? r32 = (be.h) ee.a.b(a2);
                        long j16 = r32.c;
                        if (j16 > j15) {
                            long j17 = be.d.b * j16;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = be.b.b;
                            int i19 = i17;
                            long j18 = j16;
                            ee.d dVar2 = r32;
                            while (true) {
                                long j19 = atomicLongFieldUpdater3.get(bVar2);
                                long j20 = j19 & j14;
                                if (j20 >= j17) {
                                    be.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    vVar = vVar3;
                                    dVar = dVar2;
                                    i10 = i19;
                                    j10 = j18;
                                    i11 = i15;
                                    kVar2 = null;
                                    break;
                                }
                                be.b bVar4 = bVar2;
                                vVar = vVar3;
                                long j21 = (((int) (j19 >> 60)) << 60) + j20;
                                i10 = i19;
                                j10 = j18;
                                kVar2 = null;
                                dVar = dVar2;
                                hVar2 = hVar3;
                                i11 = i15;
                                bVar = bVar4;
                                if (be.b.b.compareAndSet(bVar, j19, j21)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                i15 = i11;
                                i19 = i10;
                                j18 = j10;
                                dVar2 = dVar;
                                vVar3 = vVar;
                            }
                            if (j10 * be.d.b < atomicLongFieldUpdater2.get(bVar)) {
                                dVar.b();
                            }
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        } else {
                            be.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            vVar = vVar3;
                            i10 = i17;
                            i11 = i15;
                            kVar2 = null;
                            kVar3 = r32;
                            if (kVar3 == null) {
                            }
                        }
                    }
                } else {
                    be.h hVar9 = hVar3;
                    bVar = bVar2;
                    vVar = vVar3;
                    i10 = i17;
                    i11 = i18;
                    kVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, kVar4);
                if (i16) {
                    bVar2 = bVar;
                    j3 = j12;
                    z10 = i16;
                    vVar2 = vVar;
                    i12 = 2;
                    i14 = bVar2.p(hVar, i11, kVar4, j3, vVar2, z10);
                    i13 = 1;
                } else {
                    bVar2 = bVar;
                    j3 = j12;
                    z10 = i16;
                    k1.k kVar5 = kVar2;
                    vVar2 = vVar;
                    i12 = 2;
                    Object l4 = hVar.l(i11);
                    if (l4 != null) {
                        if (l4 instanceof i2) {
                            hVar.n(i11, kVar5);
                            if (bVar2.m(l4, kVar4)) {
                                hVar.o(i11, be.d.i);
                                i13 = 1;
                                i14 = 0;
                            } else {
                                v vVar4 = be.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, vVar4) != vVar4) {
                                    i13 = 1;
                                    hVar.m(i11, true);
                                } else {
                                    i13 = 1;
                                }
                                i14 = 5;
                            }
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, kVar4, j3, vVar2, z10);
                    } else if (bVar2.a(j3)) {
                        if (hVar.k(i11, kVar5, be.d.d)) {
                            i13 = 1;
                            i14 = 1;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, kVar4, j3, vVar2, z10);
                    } else if (vVar2 == null) {
                        i13 = 1;
                        i14 = 3;
                    } else {
                        if (hVar.k(i11, kVar5, vVar2)) {
                            i13 = 1;
                            i14 = 2;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, kVar4, j3, vVar2, z10);
                    }
                }
                Object obj3 = gd.i.a;
                if (i14 == 0) {
                    hVar.b();
                    break;
                }
                if (i14 == i13) {
                    break;
                }
                if (i14 != i12) {
                    if (i14 == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (i14 != 4) {
                        if (i14 == 5) {
                            hVar.b();
                        }
                        kVar4 = kVar;
                        hVar3 = hVar;
                        vVar3 = vVar2;
                        j11 = j14;
                        z11 = false;
                    } else {
                        if (j3 < be.b.c.get(bVar2)) {
                            hVar.b();
                        }
                        obj = new be.e(bVar2.f());
                    }
                } else if (z10) {
                    hVar.i();
                    obj = new be.e(bVar2.f());
                } else {
                    i2 i2Var = vVar2 instanceof i2 ? (i2) vVar2 : null;
                    if (i2Var != null) {
                        i2Var.a(hVar, i11 + i10);
                    }
                    hVar.i();
                    obj = obj2;
                }
            }
        } else {
            obj = obj2;
        }
        i12 = 2;
        if (obj instanceof be.e) {
            Throwable th2 = ((be.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new b2.v("Channel was closed normally");
        }
        if (obj instanceof be.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.d).getAndIncrement() == 0) {
            e0.q((c0) this.a, new bb.i(this, null, i12));
        }
    }

    public bf.f G(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        ye.d dVar = new ye.d((ArrayList) this.a, (cf.b) this.c, (ArrayList) this.b);
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
            dVar.i(str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            dVar.i(str.substring(i10));
        }
        dVar.f(dVar.n);
        cf.a u10 = dVar.j.u(new a1(27, dVar.k, dVar.m));
        Iterator it = dVar.o.iterator();
        while (it.hasNext()) {
            ((df.a) it.next()).g(u10);
        }
        bf.f fVar = (bf.f) dVar.l.b;
        Iterator it2 = ((ArrayList) this.d).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap H(BufferedReader bufferedReader) {
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
                long[] jArr = (long[]) this.d;
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
                            sb2 = a4.a.u(trim3);
                            str = trim2;
                        } else {
                            e(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            e(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            e(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void I() {
        if (((e) this.b) != null) {
            return;
        }
        e eVar = (e) ((ArrayDeque) this.a).pollFirst();
        this.b = eVar;
        if (eVar == null) {
            return;
        }
        c cVar = new c(this, eVar, 0);
        this.c = cVar;
        AndroidUtilities.runOnUIThread(cVar, 10000L);
        b bVar = eVar.b;
        String str = bVar.b;
        String str2 = bVar.f;
        d dVar = new d(this, eVar);
        String i10 = k.i(str);
        byte[] d = k.d(str2);
        int i11 = 0;
        if (!TextUtils.isEmpty(i10) && d != null && k.h()) {
            synchronized (k.t) {
                k kVar = k.v;
                if (kVar != null) {
                    kVar.m();
                    k.v = null;
                }
                try {
                    k kVar2 = new k(i10, str2, d);
                    k.v = kVar2;
                    kVar2.s = dVar;
                    o10 o10Var = o10.getInstance();
                    if (o10Var != null) {
                        o10Var.addListener(kVar2);
                    }
                    kVar2.h.execute(new g(kVar2, 1));
                    AndroidUtilities.runOnUIThread(new g(kVar2, 2));
                    i11 = k.v.g.getLocalPort();
                } catch (Exception e7) {
                    FileLog.e(e7);
                    k kVar3 = k.v;
                    if (kVar3 != null) {
                        kVar3.m();
                        k.v = null;
                    }
                }
            }
        }
        eVar.d = i11;
        if (i11 == 0) {
            j(eVar);
        }
    }

    public void J(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void K(r rVar) {
        synchronized (this.a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.b).remove(eVar.a);
                eVar.b.g();
                b0 b0Var = (b0) ((WeakReference) this.d).get();
                if (b0Var == null || b0Var.j()) {
                    return;
                }
                d0.U(b0Var.l, new m4.b(b0Var, rVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void L(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.a), new bb.i(this, arrayList, null, 6));
    }

    public Bundle M(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void N(View view) {
        l.d dVar = (l.d) this.d;
        if (((View) this.b) == view) {
            return;
        }
        O(null);
        View view2 = (View) this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(dVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(dVar);
            if (view.isAttachedToWindow()) {
                O(view.getViewTreeObserver());
            }
        }
        this.b = view;
    }

    public void O(ViewTreeObserver viewTreeObserver) {
        z4 z4Var = (z4) this.a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.c).removeOnGlobalLayoutListener(z4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(z4Var);
        }
        this.c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, o1 o1Var, x0 x0Var) {
        synchronized (this.a) {
            try {
                r s10 = s(obj);
                if (s10 == null) {
                    ((a0.f) this.b).put(obj, rVar);
                    a0.f fVar = (a0.f) this.c;
                    com.google.android.gms.common.api.internal.v vVar = new com.google.android.gms.common.api.internal.v();
                    vVar.c = new Object();
                    vVar.d = new a0.f(0);
                    fVar.put(rVar, new m4.e(obj, vVar, o1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.c).get(s10);
                    e2.d.h(eVar);
                    eVar.d = o1Var;
                    eVar.e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(s sVar) {
        if (((ArrayList) this.a).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(sVar);
        }
        sVar.v = true;
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.a);
                    pVar.b(i10);
                    eVar.g = new x0(pVar.d());
                    eVar.c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0 f() {
        String str = ((String) this.a) == null ? " processName" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.c) == null) {
            str = r6.t(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = r6.t(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 g() {
        String str = ((Integer) this.a) == null ? " platform" : "";
        if (((String) this.b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.c) == null) {
            str = r6.t(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = r6.t(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.a).intValue(), (String) this.b, (String) this.c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // fd.a
    public Object get() {
        return new com.google.firebase.messaging.s((Executor) ((fd.a) this.a).get(), (s5.d) ((fd.a) this.b).get(), (e3) ((e3) this.c).get(), (t5.c) ((fd.a) this.d).get(), 9);
    }

    public void h(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            y(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String i(String str) {
        ArrayList arrayList = (ArrayList) this.a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                h(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void j(e eVar) {
        if (((e) this.b) != eVar) {
            return;
        }
        c cVar = (c) this.c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (k.t) {
            try {
                k kVar = k.v;
                if (kVar != null) {
                    kVar.m();
                    k.v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b = null;
        eVar.c.run(-1L);
        I();
    }

    public s k(String str) {
        p0 p0Var = (p0) ((HashMap) this.b).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public s l(String str) {
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.L.c.l(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void m(m4.e eVar) {
        b0 b0Var = (b0) ((WeakReference) this.d).get();
        if (b0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            m4.d dVar = (m4.d) eVar.c.poll();
            if (dVar == null) {
                eVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            m4.e eVar2 = eVar;
            d0.U(b0Var.l, new w(b0Var, s(eVar.a), new ya(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 6)));
            atomicBoolean2.set(false);
            eVar = eVar2;
        }
    }

    public void n(final r rVar) {
        synchronized (this.a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.g;
                eVar.g = x0.b;
                eVar.c.add(new m4.d(rVar, x0Var) { // from class: m4.c
                    public final /* synthetic */ r b;

                    @Override // m4.d
                    public final i9.w run() {
                        b0 b0Var = (b0) ((WeakReference) ki.f.this.d).get();
                        if (b0Var != null) {
                            b0Var.p(this.b);
                        }
                        return i9.u.b;
                    }
                });
                if (eVar.f) {
                    return;
                }
                eVar.f = true;
                m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 q(r rVar) {
        synchronized (this.a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.c).get(rVar);
                if (eVar == null) {
                    return null;
                }
                return eVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 r() {
        i0 v;
        synchronized (this.a) {
            v = i0.v(((a0.f) this.b).values());
        }
        return v;
    }

    public r s(Object obj) {
        r rVar;
        synchronized (this.a) {
            rVar = (r) ((a0.f) this.b).get(obj);
        }
        return rVar;
    }

    public List t() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public u0 u(r rVar) {
        synchronized (this.a) {
            try {
                return ((m4.e) ((a0.f) this.c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public j1 v(r rVar) {
        synchronized (this.a) {
            try {
                return ((m4.e) ((a0.f) this.c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.v w(r rVar) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        if (eVar != null) {
            return eVar.b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(org.telegram.ui.Cells.r6.i("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = o91.z0.matcher(trim);
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
                        x(i10, trim.substring(1, matcher.start()), hashMap);
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
                    x(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        x(i10, group, hashMap);
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
                            x(i10 - 1, matcher3.group(2), hashMap);
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
                                ArrayList arrayList = (ArrayList) this.a;
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
                                    h(matcher6.group(3), matcher6.group(2).split(","));
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
                                    x(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            x(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    i(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                y(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.i("Premature left-side return of ", str5, " in ", trim));
                                }
                                y(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.i("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public void y(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = o91.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = o91.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        x(i10, trim, hashMap);
    }

    public boolean z(r rVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(rVar) != null;
        }
        return z10;
    }

    public f(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public f(b0 b0Var) {
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.a = new Object();
        this.d = new WeakReference(b0Var);
    }

    public f(String str) {
        this.a = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public f(e9.a1 a1Var, f2.i iVar, y yVar, f2.i iVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            g0 g0Var = i0.b;
            obj = e9.a1.e;
        }
        this.a = obj;
        this.b = iVar;
        this.c = yVar;
        this.d = iVar2;
    }
}
