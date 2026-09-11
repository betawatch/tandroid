package fg;

import a0.l;
import android.content.Context;
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
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import b2.p;
import b2.u0;
import b2.x0;
import bi.i2;
import bi.z2;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.vision.e2;
import di.h4;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.m0;
import e9.q;
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
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ji.b5;
import l.b0;
import l.s;
import m2.t;
import m4.a0;
import m4.h1;
import m4.l1;
import m4.r;
import n7.z0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.g10;
import org.telegram.ui.web.m1;
import org.telegram.ui.web.n1;
import y9.t0;
import zd.e0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
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
        hashMap.putAll(K(bufferedReader));
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
                    m1Var.a.putAll(K(bufferedReader));
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

    public static void O(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
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

    public void A(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = b91.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = b91.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        z(i10, trim, hashMap);
    }

    public boolean B(r rVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(rVar) != null;
        }
        return z10;
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.a) {
            eVar = (m4.e) ((a0.f) this.c).get(rVar);
        }
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        return eVar != null && eVar.e.a(i10) && a0Var != null && a0Var.t.t().a(i10);
    }

    public boolean D(r rVar, int i10) {
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

    public boolean E(r rVar, l1 l1Var) {
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

    public void F(o0 o0Var) {
        androidx.fragment.app.r rVar = o0Var.c;
        String str = rVar.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void G(o0 o0Var) {
        HashMap hashMap = (HashMap) this.b;
        androidx.fragment.app.r rVar = o0Var.c;
        if (rVar.S) {
            ((l0) this.d).f(rVar);
        }
        if (hashMap.get(rVar.e) == o0Var && ((o0) hashMap.put(rVar.e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    public boolean H(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(p(aVar), new s((Context) this.b, (l0.a) menuItem));
    }

    public boolean I(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        k.e p5 = p(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(p5, menu2);
    }

    public bf.f J(String str) {
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
        cf.a y12 = dVar.j.y1(new z0(27, dVar.k, dVar.m));
        Iterator it = dVar.o.iterator();
        while (it.hasNext()) {
            ((df.a) it.next()).g(y12);
        }
        bf.f fVar = (bf.f) dVar.l.b;
        Iterator it2 = ((ArrayList) this.d).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap K(BufferedReader bufferedReader) {
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

    public void L() {
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
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null) {
                        g10Var.addListener(kVar2);
                    }
                    kVar2.h.execute(new g(kVar2, 2));
                    AndroidUtilities.runOnUIThread(new g(kVar2, 1));
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
            k(eVar);
        }
    }

    public void M(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void N(r rVar) {
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

    public m2.b P(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList f7 = f(list);
        if (f7.size() < 2) {
            return (m2.b) q.k(f7, null);
        }
        Collections.sort(f7, new a4.e(22));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) f7.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= f7.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) f7.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) f7.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = f7.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((m2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (m2.b) q.l(subList);
                break;
            }
            bVar = (m2.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public void Q(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.a), new bb.j(this, arrayList, null, 6));
    }

    public Bundle R(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void S(View view) {
        i2 i2Var = (i2) this.d;
        if (((View) this.b) == view) {
            return;
        }
        T(null);
        View view2 = (View) this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(i2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(i2Var);
            if (view.isAttachedToWindow()) {
                T(view.getViewTreeObserver());
            }
        }
        this.b = view;
    }

    public void T(ViewTreeObserver viewTreeObserver) {
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
                r u10 = u(obj);
                if (u10 == null) {
                    ((a0.f) this.b).put(obj, rVar);
                    a0.f fVar = (a0.f) this.c;
                    v vVar = new v();
                    vVar.c = new Object();
                    vVar.d = new a0.f(0);
                    fVar.put(rVar, new m4.e(obj, vVar, m1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.c).get(u10);
                    e2.d.h(eVar);
                    eVar.d = m1Var;
                    eVar.e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(androidx.fragment.app.r rVar) {
        if (((ArrayList) this.a).contains(rVar)) {
            throw new IllegalStateException("Fragment already added: " + rVar);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(rVar);
        }
        rVar.v = true;
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

    public ArrayList f(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        O(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        O(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public t0 g() {
        String str = ((String) this.a) == null ? " processName" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.c) == null) {
            str = p6.t(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = p6.t(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // fd.a
    public Object get() {
        return new com.google.firebase.messaging.s((Executor) ((fd.a) this.a).get(), (s5.d) ((fd.a) this.b).get(), (t) ((t) this.c).get(), (t5.c) ((fd.a) this.d).get(), 9);
    }

    public y9.z0 h() {
        String str = ((Integer) this.a) == null ? " platform" : "";
        if (((String) this.b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.c) == null) {
            str = p6.t(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = p6.t(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new y9.z0(((Integer) this.a).intValue(), (String) this.b, (String) this.c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void i(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            A(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String j(String str) {
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
                i(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void k(e eVar) {
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
        L();
    }

    public androidx.fragment.app.r l(String str) {
        o0 o0Var = (o0) ((HashMap) this.b).get(str);
        if (o0Var != null) {
            return o0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.r m(String str) {
        for (o0 o0Var : ((HashMap) this.b).values()) {
            if (o0Var != null) {
                androidx.fragment.app.r rVar = o0Var.c;
                if (!str.equals(rVar.e)) {
                    rVar = rVar.L.c.m(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public void n(m4.e eVar) {
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
            d0.U(a0Var.l, new b5(a0Var, u(eVar.a), new z2(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
            atomicBoolean2.set(false);
            eVar = eVar2;
        }
    }

    public void o(final r rVar) {
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
                        a0 a0Var = (a0) ((WeakReference) fg.f.this.d).get();
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
                n(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e p(k.a aVar) {
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

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.b).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.b).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 s(r rVar) {
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

    public e9.i0 t() {
        e9.i0 v;
        synchronized (this.a) {
            v = e9.i0.v(((a0.f) this.b).values());
        }
        return v;
    }

    public r u(Object obj) {
        r rVar;
        synchronized (this.a) {
            rVar = (r) ((a0.f) this.b).get(obj);
        }
        return rVar;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public u0 w(r rVar) {
        synchronized (this.a) {
            try {
                return ((m4.e) ((a0.f) this.c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h1 x(r rVar) {
        synchronized (this.a) {
            try {
                return ((m4.e) ((a0.f) this.c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v y(r rVar) {
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
    
        throw new java.lang.Exception(org.telegram.ui.Cells.p6.i("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = b91.z0.matcher(trim);
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
                        z(i10, trim.substring(1, matcher.start()), hashMap);
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
                    z(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        z(i10, group, hashMap);
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
                            z(i10 - 1, matcher3.group(2), hashMap);
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
                                    i(matcher6.group(3), matcher6.group(2).split(","));
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
                                    z(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            z(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    j(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                A(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(e2.j("Premature left-side return of ", str5, " in ", trim));
                                }
                                A(matcher9.group(2), hashMap, zArr, i14);
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

    public f(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 5:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
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

    public f(a1 a1Var, f2.j jVar, pf.b bVar, f2.j jVar2) {
        Object obj;
        if (a1Var != null) {
            obj = e9.i0.v(a1Var);
        } else {
            g0 g0Var = e9.i0.b;
            obj = a1.e;
        }
        this.a = obj;
        this.b = jVar;
        this.c = bVar;
        this.d = jVar2;
    }
}
