package aa;

import a8.p0;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.a1;
import da.e1;
import da.h0;
import da.h1;
import da.i1;
import da.j2;
import da.k1;
import da.l1;
import da.q2;
import da.s0;
import da.t0;
import da.u0;
import da.v0;
import da.w0;
import da.y0;
import da.z0;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;
import m.o3;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e0 {
    public final u a;
    public final ga.b b;
    public final ha.a c;
    public final ca.f d;
    public final o3 e;
    public final a0 f;
    public final ba.e g;

    public e0(u uVar, ga.b bVar, ha.a aVar, ca.f fVar, o3 o3Var, a0 a0Var, ba.e eVar) {
        this.a = uVar;
        this.b = bVar;
        this.c = aVar;
        this.d = fVar;
        this.e = o3Var;
        this.f = a0Var;
        this.g = eVar;
    }

    public static t0 a(t0 t0Var, ca.f fVar, o3 o3Var, Map map) {
        Map unmodifiableMap;
        s0 a10 = t0Var.a();
        String l10 = ((ca.d) fVar.b).l();
        if (l10 != null) {
            a10.e = new h1(l10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ab.q qVar = (ab.q) o3Var.d;
        if (map.isEmpty()) {
            unmodifiableMap = ((ca.e) ((AtomicMarkableReference) qVar.b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((ca.e) ((AtomicMarkableReference) qVar.b).getReference()).a());
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b10 = ca.e.b(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(b10)) {
                    hashMap.put(b10, ca.e.b(1024, (String) entry.getValue()));
                } else {
                    i7++;
                }
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f10 = f(unmodifiableMap);
        List f11 = f(((ca.e) ((AtomicMarkableReference) ((ab.q) o3Var.e).b).getReference()).a());
        if (!f10.isEmpty() || !f11.isEmpty()) {
            u0 a11 = t0Var.c.a();
            a11.b = f10;
            a11.c = f11;
            a10.c = a11.a();
        }
        return a10.a();
    }

    public static q2 b(t0 t0Var, o3 o3Var) {
        List a10 = ((ca.q) o3Var.f).a();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < a10.size(); i7++) {
            ca.p pVar = (ca.p) a10.get(i7);
            pVar.getClass();
            i1 i1Var = new i1();
            ca.b bVar = (ca.b) pVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            i1Var.a = new k1(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            i1Var.b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            i1Var.c = str4;
            i1Var.d = bVar.f;
            i1Var.e = (byte) (i1Var.e | 1);
            arrayList.add(i1Var.a());
        }
        if (arrayList.isEmpty()) {
            return t0Var;
        }
        s0 a11 = t0Var.a();
        a11.f = new l1(arrayList);
        return a11.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static e0 d(Context context, a0 a0Var, ga.d dVar, a aVar, ca.f fVar, o3 o3Var, wf.b bVar, ia.c cVar, q4.q qVar, j jVar, ba.e eVar) {
        u uVar = new u(context, a0Var, aVar, bVar, cVar);
        ga.b bVar2 = new ga.b(dVar, cVar, jVar);
        ea.a aVar2 = ha.a.b;
        o5.t.b(context);
        return new e0(uVar, bVar2, new ha.a(new ha.b(o5.t.a().c(new m5.a(ha.a.c, ha.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new l5.c("json"), ha.a.e), cVar.b(), qVar)), fVar, o3Var, a0Var, eVar);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new h0(str, str2));
        }
        Collections.sort(arrayList, new a3.c(9));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.b.b.b(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it.next();
            if (applicationExitInfo.getTimestamp() >= lastModified && predicate.test(applicationExitInfo)) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public final void g(Throwable th2, Thread thread, String str, ca.c cVar, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b10;
        boolean equals = str.equals("crash");
        long j3 = cVar.b;
        u uVar = this.a;
        Context context = uVar.a;
        int i7 = context.getResources().getConfiguration().orientation;
        wf.b bVar = uVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        ab.c0 c0Var = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            c0Var = new ab.c0(th4.getLocalizedMessage(), th4.getClass().getName(), bVar.h(th4.getStackTrace()), c0Var, 4);
        }
        ab.c0 c0Var2 = c0Var;
        s0 s0Var = new s0();
        s0Var.b = str;
        s0Var.a = j3;
        s0Var.g = (byte) (s0Var.g | 1);
        j2 b11 = x9.c.a.b(context);
        int i10 = ((e1) b11).c;
        Boolean valueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList a10 = x9.c.a(context);
        byte b12 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c0Var2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b13 = (byte) 1;
        List d = u.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        if (b13 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b13 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(p0.q("Missing required properties:", sb2));
        }
        arrayList.add(new a1(name, 4, d));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b10 = b13;
                } else {
                    StackTraceElement[] h = bVar.h(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d2 = u.d(h, 0);
                    if (d2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b13 != 1) {
                        byte b14 = b13;
                        StringBuilder sb3 = new StringBuilder();
                        if (b14 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(p0.q("Missing required properties:", sb3));
                    }
                    b10 = b13;
                    arrayList.add(new a1(name2, 0, d2));
                }
                it2 = it;
                b13 = b10;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        y0 c10 = u.c(c0Var2, 0);
        z0 e10 = u.e();
        List a11 = uVar.a();
        if (a11 == null) {
            throw new NullPointerException("Null binaries");
        }
        w0 w0Var = new w0(unmodifiableList, c10, null, null, e10, a11);
        if (b12 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b12 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(p0.q("Missing required properties:", sb4));
        }
        s0Var.c = new v0(w0Var, null, null, valueOf, b11, a10, i7);
        s0Var.d = uVar.b(i7);
        t0 a12 = s0Var.a();
        Map map = cVar.c;
        ca.f fVar = this.d;
        o3 o3Var = this.e;
        q2 b15 = b(a(a12, fVar, o3Var, map), o3Var);
        if (z10) {
            this.b.e(b15, cVar.a, equals);
        } else {
            this.g.b.a(new c0(this, b15, cVar, equals, 0));
        }
    }

    public final Task h(String str, Executor executor) {
        b bVar;
        TaskCompletionSource taskCompletionSource;
        ArrayList c10 = this.b.c();
        ArrayList arrayList = new ArrayList();
        int size = c10.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            File file = (File) c10.get(i7);
            try {
                ea.a aVar = ga.b.g;
                String f10 = ga.b.f(file);
                aVar.getClass();
                arrayList.add(new b(ea.a.j(f10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i7 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar2 = (b) obj;
            if (str == null || str.equals(bVar2.b)) {
                ha.a aVar2 = this.c;
                da.d0 d0Var = bVar2.a;
                if (d0Var.f == null || d0Var.g == null) {
                    z b10 = this.f.b(true);
                    da.d0 d0Var2 = bVar2.a;
                    String str2 = b10.a;
                    da.c0 a10 = d0Var2.a();
                    a10.e = str2;
                    da.d0 a11 = a10.a();
                    String str3 = b10.b;
                    da.c0 a12 = a11.a();
                    a12.f = str3;
                    bVar = new b(a12.a(), bVar2.b, bVar2.c);
                } else {
                    bVar = bVar2;
                }
                boolean z10 = str != null;
                ha.b bVar3 = aVar2.a;
                synchronized (bVar3.f) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) bVar3.i.b).getAndIncrement();
                            if (bVar3.f.size() < bVar3.e) {
                                x9.b bVar4 = x9.b.a;
                                bVar4.b("Enqueueing report: " + bVar.b);
                                bVar4.b("Queue size: " + bVar3.f.size());
                                taskCompletionSource = taskCompletionSource2;
                                bVar3.g.execute(new a9.h(bVar3, bVar, taskCompletionSource2, false, 5));
                                bVar4.b("Closing task for report: " + bVar.b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                taskCompletionSource = taskCompletionSource2;
                                bVar3.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) bVar3.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            taskCompletionSource = taskCompletionSource2;
                            bVar3.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new a3.l(this, 5)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
