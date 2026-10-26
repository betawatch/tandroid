package com.google.firebase.messaging;

import a8.yb;
import aa.y0;
import aa.z0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import b2.c1;
import bi.i6;
import bi.u0;
import c3.h0;
import ce.j2;
import com.google.android.gms.tasks.Task;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.s1;
import f9.t0;
import fi.x3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.e0;
import li.e3;
import m4.f0;
import m4.p1;
import m4.q1;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.web.k1;
import org.telegram.ui.web.l1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q {
    public static q e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static final Message a(q qVar, ArrayList arrayList, int i10) {
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

    public static void d(String str, String str2, HashMap hashMap) {
        l1 l1Var = new l1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    l1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = h0.l(1, 1, trim3);
                    }
                    l1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), l1Var);
    }

    public static synchronized q m() {
        q qVar;
        synchronized (q.class) {
            try {
                if (e == null) {
                    q qVar2 = new q();
                    qVar2.a = null;
                    qVar2.b = null;
                    qVar2.c = null;
                    qVar2.d = new ArrayDeque();
                    e = qVar2;
                }
                qVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public void A(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void B(m4.w wVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).remove(wVar);
                if (iVar == null) {
                    return;
                }
                ((a0.f) this.b).remove(iVar.a);
                iVar.b.g();
                f0 f0Var = (f0) ((WeakReference) this.d).get();
                if (f0Var == null || f0Var.j()) {
                    return;
                }
                n0.W(f0Var.l, new m4.f(f0Var, wVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        ce.f0.q(ce.f0.b((ld.h) this.a), new bb.l(this, arrayList, null, 2));
    }

    public void D(View view) {
        i6 i6Var = (i6) this.d;
        if (((View) this.b) == view) {
            return;
        }
        E(null);
        View view2 = (View) this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(i6Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(i6Var);
            if (view.isAttachedToWindow()) {
                E(view.getViewTreeObserver());
            }
        }
        this.b = view;
    }

    public void E(ViewTreeObserver viewTreeObserver) {
        x3 x3Var = (x3) this.a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.c).removeOnGlobalLayoutListener(x3Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(x3Var);
        }
        this.c = viewTreeObserver;
    }

    public Task F(Callable callable) {
        Task continueWith;
        synchronized (this.c) {
            continueWith = ((Task) this.b).continueWith((Executor) this.a, new e3(callable, 26));
            this.b = continueWith.continueWith((Executor) this.a, new pa.d());
        }
        return continueWith;
    }

    public Task G(Callable callable) {
        Task continueWithTask;
        synchronized (this.c) {
            continueWithTask = ((Task) this.b).continueWithTask((Executor) this.a, new e3(callable, 26));
            this.b = continueWithTask.continueWith((Executor) this.a, new pa.d());
        }
        return continueWithTask;
    }

    public void b(Object obj, m4.w wVar, q1 q1Var, c1 c1Var) {
        synchronized (this.a) {
            try {
                m4.w l4 = l(obj);
                if (l4 == null) {
                    ((a0.f) this.b).put(obj, wVar);
                    a0.f fVar = (a0.f) this.c;
                    com.google.android.gms.common.api.internal.u uVar = new com.google.android.gms.common.api.internal.u();
                    uVar.c = new Object();
                    uVar.d = new a0.f(0);
                    fVar.put(wVar, new m4.i(obj, uVar, q1Var, c1Var));
                } else {
                    m4.i iVar = (m4.i) ((a0.f) this.c).get(l4);
                    iVar.getClass();
                    iVar.d = q1Var;
                    iVar.e = c1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(m4.w wVar, int i10, m4.h hVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).get(wVar);
                if (iVar != null) {
                    c1 c1Var = iVar.g;
                    c1Var.getClass();
                    b2.u uVar = new b2.u();
                    uVar.c(c1Var.a);
                    uVar.b(i10);
                    iVar.g = new c1(uVar.d());
                    iVar.c.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public y0 e() {
        String str = ((z0) this.b) == null ? " rolloutVariant" : "";
        if (((String) this.a) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.c) == null) {
            str = b10.u(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = b10.u(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new y0((z0) this.b, (String) this.a, (String) this.c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void f(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            t(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String g(String str) {
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
                f(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            FileLog.e(e10);
        }
        return TextUtils.join("", arrayList);
    }

    public void h(m4.i iVar) {
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (f0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            m4.h hVar = (m4.h) iVar.c.poll();
            if (hVar == null) {
                iVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            m4.i iVar2 = iVar;
            n0.W(f0Var.l, new e0(f0Var, l(iVar.a), new u0(this, hVar, atomicBoolean2, iVar2, atomicBoolean, 18)));
            atomicBoolean2.set(false);
            iVar = iVar2;
        }
    }

    public void i(final m4.w wVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).get(wVar);
                if (iVar == null) {
                    return;
                }
                final c1 c1Var = iVar.g;
                iVar.g = c1.b;
                iVar.c.add(new m4.h(wVar, c1Var) { // from class: m4.g
                    public final /* synthetic */ w b;

                    @Override // m4.h
                    public final k9.y run() {
                        f0 f0Var = (f0) ((WeakReference) com.google.firebase.messaging.q.this.d).get();
                        if (f0Var != null) {
                            f0Var.p(this.b);
                        }
                        return k9.w.b;
                    }
                });
                if (iVar.f) {
                    return;
                }
                iVar.f = true;
                h(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c1 j(m4.w wVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).get(wVar);
                if (iVar == null) {
                    return null;
                }
                return iVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 k() {
        i0 u10;
        synchronized (this.a) {
            u10 = i0.u(((a0.f) this.b).values());
        }
        return u10;
    }

    public m4.w l(Object obj) {
        m4.w wVar;
        synchronized (this.a) {
            wVar = (m4.w) ((a0.f) this.b).get(obj);
        }
        return wVar;
    }

    public b2.z0 n(m4.w wVar) {
        synchronized (this.a) {
            try {
                return ((m4.i) ((a0.f) this.c).get(wVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m4.l1 o(m4.w wVar) {
        synchronized (this.a) {
            try {
                return ((m4.i) ((a0.f) this.c).get(wVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.u p(m4.w wVar) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        if (iVar != null) {
            return iVar.b;
        }
        return null;
    }

    public boolean q(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean r(Context context) {
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
    
        throw new java.lang.Exception(org.telegram.ui.Components.b10.j("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = ma1.z0.matcher(trim);
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
                        s(i10, trim.substring(1, matcher.start()), hashMap);
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
                    s(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        s(i10, group, hashMap);
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
                            s(i10 - 1, matcher3.group(2), hashMap);
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
                                    f(matcher6.group(3), matcher6.group(2).split(","));
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
                                    s(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            s(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    g(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                t(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(h0.m("Premature left-side return of ", str5, " in ", trim));
                                }
                                t(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(h0.m("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public void t(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = ma1.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = ma1.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        s(i10, trim, hashMap);
    }

    public boolean u(m4.w wVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(wVar) != null;
        }
        return z10;
    }

    public boolean v(m4.w wVar, int i10) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        return iVar != null && iVar.e.a(i10) && f0Var != null && f0Var.t.s().a(i10);
    }

    public boolean w(m4.w wVar, int i10) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        if (iVar != null) {
            q1 q1Var = iVar.d;
            q1Var.getClass();
            yb.f("Use contains(Command) for custom command", i10 != 0);
            Iterator<E> it = q1Var.a.iterator();
            while (it.hasNext()) {
                if (((p1) it.next()).a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean x(m4.w wVar, p1 p1Var) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        if (iVar == null) {
            return false;
        }
        t0 t0Var = iVar.d.a;
        p1Var.getClass();
        return t0Var.contains(p1Var) || m4.e.j(p1Var.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020d  */
    /* JADX WARN: Type inference failed for: r2v19, types: [ee.h, he.d, he.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(k1.k kVar) {
        ee.b bVar;
        he.v vVar;
        int i10;
        int i11;
        boolean z10;
        k1.k kVar2;
        ee.h hVar;
        he.v vVar2;
        long j10;
        boolean z11;
        int i12;
        int i13;
        Object obj;
        Object a2;
        long j11;
        ee.h hVar2;
        k1.k kVar3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        ee.c cVar;
        k1.k kVar4 = kVar;
        ee.b bVar2 = (ee.b) this.c;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = ee.b.b;
        boolean z12 = false;
        boolean z13 = true;
        long j12 = 1152921504606846975L;
        boolean z14 = bVar2.i(atomicLongFieldUpdater2.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = ee.g.a;
        if (z14) {
            obj = obj2;
        } else {
            he.v vVar3 = ee.d.j;
            ee.h hVar3 = (ee.h) ee.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar2);
                long j13 = andIncrement & j12;
                boolean i14 = bVar2.i(andIncrement, z12);
                int i15 = ee.d.b;
                long j14 = i15;
                long j15 = j12;
                long j16 = j13 / j14;
                int i16 = (int) (j13 % j14);
                if (hVar3.c != j16) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ee.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.b.f;
                    ee.h hVar4 = ee.d.a;
                    ee.c cVar2 = ee.c.a;
                    while (true) {
                        a2 = he.a.a(hVar3, j16, cVar2);
                        if (!he.a.d(a2)) {
                            he.t b10 = he.a.b(a2);
                            while (true) {
                                he.t tVar = (he.t) atomicReferenceFieldUpdater.get(bVar2);
                                z10 = z13;
                                j11 = j16;
                                vVar = vVar3;
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
                                        vVar3 = vVar;
                                        z13 = z10;
                                        j16 = j11;
                                        cVar2 = cVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            z10 = z13;
                            j11 = j16;
                            vVar = vVar3;
                            break;
                        }
                        vVar3 = vVar;
                        z13 = z10;
                        j16 = j11;
                        cVar2 = cVar;
                    }
                    if (he.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * ee.d.b < atomicLongFieldUpdater3.get(bVar2)) {
                            hVar3.b();
                            ee.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            i10 = i15;
                            i11 = i16;
                            kVar3 = null;
                            kVar2 = null;
                            if (kVar3 == null) {
                                hVar = kVar3;
                            } else {
                                if (i14) {
                                    obj = new ee.e(bVar.f());
                                    break;
                                }
                                ee.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                vVar3 = vVar;
                                j12 = j15;
                                z13 = z10;
                                z12 = false;
                            }
                        } else {
                            ee.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            i10 = i15;
                            i11 = i16;
                            kVar2 = null;
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        }
                    } else {
                        ?? r22 = (ee.h) he.a.b(a2);
                        long j17 = r22.c;
                        if (j17 > j11) {
                            long j18 = ee.d.b * j17;
                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = ee.b.b;
                            int i17 = i15;
                            int i18 = i16;
                            while (true) {
                                long j19 = atomicLongFieldUpdater4.get(bVar2);
                                long j20 = j19 & j15;
                                if (j20 >= j18) {
                                    ee.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    i11 = i18;
                                    kVar2 = null;
                                    i10 = i17;
                                    break;
                                }
                                ee.b bVar4 = bVar2;
                                long j21 = j18;
                                AtomicLongFieldUpdater atomicLongFieldUpdater5 = atomicLongFieldUpdater4;
                                i11 = i18;
                                kVar2 = null;
                                i10 = i17;
                                hVar2 = hVar3;
                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                bVar = bVar4;
                                if (ee.b.b.compareAndSet(bVar, j19, (((int) (j19 >> 60)) << 60) + j20)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                i17 = i10;
                                atomicLongFieldUpdater4 = atomicLongFieldUpdater5;
                                i18 = i11;
                                j18 = j21;
                            }
                            if (j17 * ee.d.b < atomicLongFieldUpdater.get(bVar)) {
                                r22.b();
                            }
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        } else {
                            ee.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            i10 = i15;
                            i11 = i16;
                            kVar2 = null;
                            kVar3 = r22;
                            if (kVar3 == null) {
                            }
                        }
                    }
                } else {
                    ee.h hVar9 = hVar3;
                    bVar = bVar2;
                    vVar = vVar3;
                    i10 = i15;
                    i11 = i16;
                    z10 = z13;
                    kVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, kVar4);
                if (i14) {
                    bVar2 = bVar;
                    vVar2 = vVar;
                    j10 = j13;
                    z11 = i14;
                    i12 = 5;
                    i13 = bVar2.p(hVar, i11, kVar4, j10, vVar2, z11);
                } else {
                    bVar2 = bVar;
                    vVar2 = vVar;
                    j10 = j13;
                    z11 = i14;
                    k1.k kVar5 = kVar2;
                    i12 = 5;
                    Object l4 = hVar.l(i11);
                    if (l4 == null) {
                        if (bVar2.a(j10)) {
                            if (hVar.k(i11, kVar5, ee.d.d)) {
                                z13 = z10;
                                i13 = z13;
                                Object obj3 = jd.i.a;
                                if (i13 == 0) {
                                    hVar.b();
                                    break;
                                }
                                if (i13 == z13) {
                                    break;
                                }
                                if (i13 != 2) {
                                    if (i13 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (i13 != 4) {
                                        if (i13 == i12) {
                                            hVar.b();
                                        }
                                        kVar4 = kVar;
                                        hVar3 = hVar;
                                        vVar3 = vVar2;
                                        j12 = j15;
                                        z12 = false;
                                    } else {
                                        if (j10 < ee.b.c.get(bVar2)) {
                                            hVar.b();
                                        }
                                        obj = new ee.e(bVar2.f());
                                    }
                                } else if (z11) {
                                    hVar.i();
                                    obj = new ee.e(bVar2.f());
                                } else {
                                    j2 j2Var = vVar2 instanceof j2 ? (j2) vVar2 : null;
                                    if (j2Var != null) {
                                        j2Var.a(hVar, i11 + i10);
                                    }
                                    hVar.i();
                                    obj = obj2;
                                }
                            }
                        } else if (vVar2 == null) {
                            i13 = 3;
                        } else if (hVar.k(i11, kVar5, vVar2)) {
                            i13 = 2;
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j10, vVar2, z11);
                        Object obj32 = jd.i.a;
                        if (i13 == 0) {
                        }
                    } else {
                        if (l4 instanceof j2) {
                            hVar.n(i11, kVar5);
                            if (bVar2.m(l4, kVar4)) {
                                hVar.o(i11, ee.d.i);
                                z13 = z10;
                                i13 = 0;
                            } else {
                                he.v vVar4 = ee.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, vVar4) != vVar4) {
                                    z13 = z10;
                                    hVar.m(i11, z13);
                                } else {
                                    z13 = z10;
                                }
                                i13 = 5;
                            }
                            Object obj322 = jd.i.a;
                            if (i13 == 0) {
                            }
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j10, vVar2, z11);
                        Object obj3222 = jd.i.a;
                        if (i13 == 0) {
                        }
                    }
                }
                z13 = z10;
                Object obj32222 = jd.i.a;
                if (i13 == 0) {
                }
            }
        }
        i12 = 5;
        if (obj instanceof ee.e) {
            Throwable th2 = ((ee.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new b2.a0("Channel was closed normally");
        }
        if (obj instanceof ee.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.d).getAndIncrement() == 0) {
            ce.f0.q((ce.c0) this.a, new bb.l(this, null, i12));
        }
    }

    public HashMap z(BufferedReader bufferedReader) {
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
                            sb2 = a1.g.u(trim3);
                            str = trim2;
                        } else {
                            d(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            d(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            d(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public q(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(z(bufferedReader));
        l1 l1Var = (l1) hashMap.get("content-type");
        String str = l1Var == null ? null : (String) l1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            k1 k1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (k1Var != null) {
                        k1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(k1Var);
                        l1 l1Var2 = (l1) k1Var.a.get("content-location");
                        hashMap2.put(l1Var2 == null ? null : l1Var2.a, k1Var);
                    }
                    k1Var = new k1();
                    k1Var.b = (File) this.a;
                    k1Var.a.putAll(z(bufferedReader));
                    k1Var.c = jArr[0];
                }
            }
            if (k1Var != null && k1Var.c != 0 && k1Var.d != 0) {
                arrayList.add(k1Var);
                l1 l1Var3 = (l1) k1Var.a.get("content-location");
                hashMap2.put(l1Var3 != null ? l1Var3.a : null, k1Var);
            }
        }
        bufferedReader.close();
    }

    public q(f0 f0Var) {
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.a = new Object();
        this.d = new WeakReference(f0Var);
    }

    public q(Typeface typeface, p1.b bVar) {
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

    public q(String str) {
        this.b = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.a = str;
    }

    public q(s1 s1Var, f2.k kVar, n4.s sVar, f2.k kVar2) {
        Object obj;
        if (s1Var != null) {
            obj = i0.u(s1Var);
        } else {
            g0 g0Var = i0.b;
            obj = s1.e;
        }
        this.a = obj;
        this.b = kVar;
        this.c = sVar;
        this.d = kVar2;
    }
}
