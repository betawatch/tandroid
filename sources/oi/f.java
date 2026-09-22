package oi;

import a0.m;
import ai.m3;
import ai.u2;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.k0;
import androidx.fragment.app.n0;
import androidx.fragment.app.q0;
import androidx.fragment.app.s;
import b2.p;
import b2.u0;
import b2.x0;
import ci.h4;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.t;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.m0;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.b0;
import l.l;
import m4.a0;
import m4.h1;
import m4.l1;
import m4.r;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.r91;
import org.telegram.ui.web.m1;
import org.telegram.ui.web.n1;
import v7.j0;
import y9.t0;
import y9.z0;
import zd.e0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        hashMap.putAll(J(bufferedReader));
        n1 n1Var = (n1) hashMap.get("content-type");
        String str = n1Var == null ? null : (String) n1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            m1 m1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (m1Var != null) {
                        m1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(m1Var);
                        n1 n1Var2 = (n1) m1Var.a.get("content-location");
                        hashMap2.put(n1Var2 == null ? null : n1Var2.a, m1Var);
                    }
                    m1Var = new m1();
                    m1Var.b = (File) this.a;
                    m1Var.a.putAll(J(bufferedReader));
                    m1Var.c = jArr[0];
                }
            }
            if (m1Var != null && m1Var.c != 0 && m1Var.d != 0) {
                arrayList.add(m1Var);
                n1 n1Var3 = (n1) m1Var.a.get("content-location");
                hashMap2.put(n1Var3 != null ? n1Var3.a : null, m1Var);
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
        n1 n1Var = new n1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    n1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.i(1, 1, trim3);
                    }
                    n1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), n1Var);
    }

    public boolean A(r rVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(rVar) != null;
        }
        return z10;
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        return eVar != null && eVar.e.a(i10) && a0Var != null && a0Var.t.t().a(i10);
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        if (eVar != null) {
            m4.m1 m1Var = eVar.d;
            m1Var.getClass();
            e2.d.a("Use contains(Command) for custom command", i10 != 0);
            Iterator<E> it = m1Var.a.iterator();
            while (it.hasNext()) {
                if (((l1) it.next()).a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean D(r rVar, l1 l1Var) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        if (eVar == null) {
            return false;
        }
        m0 m0Var = eVar.d.a;
        l1Var.getClass();
        return m0Var.contains(l1Var);
    }

    public void E(q0 q0Var) {
        s sVar = q0Var.c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, q0Var);
        if (k0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void F(q0 q0Var) {
        HashMap hashMap = (HashMap) this.b;
        s sVar = q0Var.c;
        if (sVar.S) {
            ((n0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == q0Var && ((q0) hashMap.put(sVar.e, null)) != null && k0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(o(aVar), new l.s((Context) this.b, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        k.e o9 = o(aVar);
        m mVar = (m) this.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.b, (l) menu);
            mVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(o9, menu2);
    }

    public bf.f I(String str) {
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
        List list = dVar.k;
        LinkedHashMap linkedHashMap = dVar.m;
        cf.a c02 = dVar.j.c0(new f3(list, linkedHashMap, false, 24));
        Iterator it = dVar.o.iterator();
        while (it.hasNext()) {
            ((df.a) it.next()).g(c02);
        }
        bf.f fVar = (bf.f) dVar.l.b;
        Iterator it2 = ((ArrayList) this.d).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap J(BufferedReader bufferedReader) {
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

    public void K() {
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
        lf.h i10 = k.i(str);
        byte[] d = k.d(str2);
        int i11 = 0;
        if (i10 != null && d != null && k.h()) {
            synchronized (k.v) {
                k kVar = k.x;
                if (kVar != null) {
                    kVar.n();
                    k.x = null;
                }
                try {
                    k kVar2 = new k(i10, str2, d);
                    k.x = kVar2;
                    kVar2.u = dVar;
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null) {
                        g10Var.addListener(kVar2);
                    }
                    kVar2.j.execute(new g(kVar2, 1));
                    AndroidUtilities.runOnUIThread(new g(kVar2, 2));
                    i11 = k.x.i.getLocalPort();
                } catch (Exception e7) {
                    FileLog.e(e7);
                    k kVar3 = k.x;
                    if (kVar3 != null) {
                        kVar3.n();
                        k.x = null;
                    }
                }
            }
        }
        eVar.d = i11;
        if (i11 == 0) {
            j(eVar);
        }
    }

    public void L(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void M(r rVar) {
        synchronized (this.a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.b).remove(eVar.a);
                eVar.b.g();
                a0 a0Var = (a0) ((WeakReference) this.d).get();
                if (a0Var == null || a0Var.j()) {
                    return;
                }
                d0.U(a0Var.l, new m4.b(a0Var, rVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.a), new bb.i(this, arrayList, null, 6));
    }

    public Bundle O(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void P(View view) {
        u2 u2Var = (u2) this.d;
        if (((View) this.b) == view) {
            return;
        }
        Q(null);
        View view2 = (View) this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(u2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(u2Var);
            if (view.isAttachedToWindow()) {
                Q(view.getViewTreeObserver());
            }
        }
        this.b = view;
    }

    public void Q(ViewTreeObserver viewTreeObserver) {
        h4 h4Var = (h4) this.a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.c).removeOnGlobalLayoutListener(h4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(h4Var);
        }
        this.c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, m4.m1 m1Var, x0 x0Var) {
        synchronized (this.a) {
            try {
                r t10 = t(obj);
                if (t10 == null) {
                    ((a0.f) this.b).put(obj, rVar);
                    a0.f fVar = (a0.f) this.c;
                    v vVar = new v();
                    vVar.c = new Object();
                    vVar.d = new a0.f(0);
                    fVar.put(rVar, new m4.e(obj, vVar, m1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.c).get(t10);
                    e2.d.h(eVar);
                    eVar.d = m1Var;
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
            str = j0.s(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = j0.s(str, " defaultProcess");
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
            str = j0.s(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = j0.s(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.a).intValue(), (String) this.b, (String) this.c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // fd.a
    public Object get() {
        return new t((Executor) ((fd.a) this.a).get(), (s5.d) ((fd.a) this.b).get(), (lf.h) ((lf.h) this.c).get(), (t5.c) ((fd.a) this.d).get(), 9);
    }

    public void h(String str, String[] strArr) {
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
        synchronized (k.v) {
            try {
                k kVar = k.x;
                if (kVar != null) {
                    kVar.n();
                    k.x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b = null;
        eVar.c.run(-1L);
        K();
    }

    public s k(String str) {
        q0 q0Var = (q0) ((HashMap) this.b).get(str);
        if (q0Var != null) {
            return q0Var.c;
        }
        return null;
    }

    public s l(String str) {
        for (q0 q0Var : ((HashMap) this.b).values()) {
            if (q0Var != null) {
                s sVar = q0Var.c;
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
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (a0Var == null) {
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
            d0.U(a0Var.l, new ki.l(a0Var, t(eVar.a), new m3(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
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
                        a0 a0Var = (a0) ((WeakReference) oi.f.this.d).get();
                        if (a0Var != null) {
                            a0Var.p(this.b);
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

    public k.e o(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 r(r rVar) {
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

    public i0 s() {
        i0 v;
        synchronized (this.a) {
            v = i0.v(((a0.f) this.b).values());
        }
        return v;
    }

    public r t(Object obj) {
        r rVar;
        synchronized (this.a) {
            rVar = (r) ((a0.f) this.b).get(obj);
        }
        return rVar;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public u0 v(r rVar) {
        synchronized (this.a) {
            try {
                return ((m4.e) ((a0.f) this.c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h1 w(r rVar) {
        synchronized (this.a) {
            try {
                return ((m4.e) ((a0.f) this.c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v x(r rVar) {
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
    
        throw new java.lang.Exception(v7.j0.g("Premature end of parens in ", r13));
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
            Matcher matcher = r91.z0.matcher(trim);
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
            String[] strArr = (String[]) this.d;
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
                                z(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.j("Premature left-side return of ", str5, " in ", trim));
                                }
                                z(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.j("Premature right-side return of ", str5, " in ", trim));
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
        Matcher matcher = r91.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = r91.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        y(i10, trim, hashMap);
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

    public f(a0 a0Var) {
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.a = new Object();
        this.d = new WeakReference(a0Var);
    }

    public f(String str) {
        this.a = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public f(a1 a1Var, f2.i iVar, of.b bVar, f2.i iVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            g0 g0Var = i0.b;
            obj = a1.e;
        }
        this.a = obj;
        this.b = iVar;
        this.c = bVar;
        this.d = iVar2;
    }
}
