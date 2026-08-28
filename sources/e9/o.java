package e9;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f7.f8;
import g9.a0;
import g9.a1;
import g9.b0;
import g9.b1;
import g9.c0;
import g9.c1;
import g9.d1;
import g9.d2;
import g9.e1;
import g9.e2;
import g9.g0;
import g9.h0;
import g9.i0;
import g9.l0;
import g9.m0;
import g9.n0;
import g9.q0;
import g9.t0;
import j$.util.DesugarCollections;
import j3.r0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o {
    public static final i r = new i(1);
    public final Context a;
    public final t b;
    public final we.b c;
    public final t3 d;
    public final com.google.firebase.messaging.t e;
    public final x f;
    public final j9.c g;
    public final a h;
    public final f9.e i;
    public final b9.b j;
    public final c9.a k;
    public final k l;
    public final com.google.firebase.messaging.m m;
    public s n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public o(Context context, com.google.firebase.messaging.t tVar, x xVar, t tVar2, j9.c cVar, we.b bVar, a aVar, t3 t3Var, f9.e eVar, com.google.firebase.messaging.m mVar, b9.b bVar2, c9.a aVar2, k kVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = tVar;
        this.f = xVar;
        this.b = tVar2;
        this.g = cVar;
        this.c = bVar;
        this.h = aVar;
        this.d = t3Var;
        this.i = eVar;
        this.j = bVar2;
        this.k = aVar2;
        this.l = kVar;
        this.m = mVar;
    }

    public static void a(o oVar, String str, Boolean bool) {
        int i9;
        long j10;
        Integer num;
        oVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String d = ta.b.d("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d, null);
        }
        Locale locale = Locale.US;
        x xVar = oVar.f;
        a aVar = oVar.h;
        c1 c1Var = new c1(xVar.c, aVar.f, aVar.g, xVar.b().a, e2.c.c(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = oVar.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.a;
        String str4 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str4)) {
            i9 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i9 = 3;
            g gVar2 = (g) g.b.get(str4.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g10 = h.g();
        int d9 = h.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        oVar.j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d9, b10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            j10 = currentTimeMillis;
        } else {
            t3 t3Var = oVar.d;
            synchronized (((String) t3Var.c)) {
                try {
                    t3Var.c = str;
                    Map a2 = ((f9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).b).getReference()).a();
                    List f10 = ((n2.w) t3Var.f).f();
                    if (((String) ((AtomicMarkableReference) t3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((f9.g) t3Var.a).i(str, (String) ((AtomicMarkableReference) t3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((f9.g) t3Var.a).g(str, a2, false);
                    }
                    if (!f10.isEmpty()) {
                        ((f9.g) t3Var.a).h(str, f10);
                    }
                } finally {
                }
            }
        }
        f9.e eVar = oVar.i;
        ((f9.c) eVar.b).b();
        eVar.b = f9.e.c;
        if (str != null) {
            eVar.b = new f9.m(((j9.c) eVar.a).b(str, "userlog"));
        }
        oVar.l.b(str);
        com.google.firebase.messaging.m mVar = oVar.m;
        r rVar = (r) mVar.a;
        Charset charset = e2.a;
        f8 f8Var = new f8();
        f8Var.a = "18.6.0";
        a aVar2 = rVar.c;
        String str8 = aVar2.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        f8Var.b = str8;
        x xVar2 = rVar.b;
        String str9 = xVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        f8Var.c = str9;
        f8Var.d = xVar2.b().b;
        String str10 = aVar2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        f8Var.k = str10;
        String str11 = aVar2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        f8Var.f = str11;
        f8Var.i = 4;
        g0 g0Var = new g0();
        g0Var.f = Boolean.FALSE;
        g0Var.d = Long.valueOf(j10);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        g0Var.b = str;
        String str12 = r.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        g0Var.a = str12;
        String str13 = xVar2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = xVar2.b().a;
        we.b bVar = aVar2.h;
        if (((b9.c) bVar.c) == null) {
            bVar.c = new b9.c(bVar);
        }
        b9.c cVar = (b9.c) bVar.c;
        String str15 = cVar.b;
        if (cVar == null) {
            bVar.c = new b9.c(bVar);
        }
        g0Var.g = new i0(str13, str10, str11, str14, str15, ((b9.c) bVar.c).c);
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(10, false);
        Integer valueOf = Integer.valueOf(i9);
        tVar.d = valueOf;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        tVar.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        tVar.e = str3;
        tVar.c = Boolean.valueOf(h.h());
        g0Var.i = tVar.m();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i10 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) r.f.get(str4.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(rVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g11 = h.g();
        int d10 = h.d();
        c3.h hVar = new c3.h();
        hVar.a = Integer.valueOf(i10);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        hVar.b = str5;
        hVar.c = Integer.valueOf(availableProcessors2);
        hVar.d = Long.valueOf(b11);
        hVar.e = Long.valueOf(blockCount2);
        hVar.f = Boolean.valueOf(g11);
        hVar.g = Integer.valueOf(d10);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        hVar.h = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        hVar.i = str7;
        g0Var.j = hVar.b();
        g0Var.l = valueOf;
        f8Var.g = g0Var.a();
        a0 a3 = f8Var.a();
        j9.c cVar2 = ((j9.b) mVar.b).b;
        d2 d2Var = a3.j;
        if (d2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((h0) d2Var).b;
        try {
            j9.b.g.getClass();
            j9.b.f(cVar2.b(str16, "report"), h9.c.a.u(a3));
            File b12 = cVar2.b(str16, "start-time");
            long j11 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), j9.b.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j11 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String d11 = ta.b.d("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", d11, e10);
            }
        }
    }

    public static Task b(o oVar) {
        Task call;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : j9.c.e(oVar.g.b.listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new n(oVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f() {
        InputStream resourceAsStream;
        ClassLoader classLoader = o.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Log.i("FirebaseCrashlytics", "No version control information found", null);
            }
            if (resourceAsStream != null) {
                return null;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, c3.h hVar) {
        String str;
        String str2;
        boolean z11;
        ?? r52;
        List list;
        ApplicationExitInfo applicationExitInfo;
        String str3;
        String processName;
        int i9;
        long j10;
        List list2;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        ArrayList arrayList = new ArrayList(((j9.b) this.m.b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList.get(z10 == true ? 1 : 0);
        if (hVar.d().b.b) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    j9.c cVar = this.g;
                    f9.e eVar = new f9.e(cVar);
                    eVar.b = f9.e.c;
                    if (str4 != null) {
                        eVar.b = new f9.m(cVar.b(str4, "userlog"));
                    }
                    j9.c cVar2 = this.g;
                    com.google.firebase.messaging.t tVar = this.e;
                    f9.g gVar = new f9.g(cVar2);
                    t3 t3Var = new t3(str4, cVar2, tVar);
                    ((f9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).b).getReference()).d(gVar.c(str4, false));
                    ((f9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.e).b).getReference()).d(gVar.c(str4, true));
                    ((AtomicMarkableReference) t3Var.h).set(gVar.d(str4), false);
                    n2.w wVar = (n2.w) t3Var.f;
                    File b10 = cVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        f9.g.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = f9.g.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    f9.g.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (wVar) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            h.c(fileInputStream2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (wVar) {
                        ((ArrayList) wVar.c).clear();
                        if (list.size() > wVar.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + wVar.b, null);
                            ((ArrayList) wVar.c).addAll(list.subList(0, wVar.b));
                        } else {
                            ((ArrayList) wVar.c).addAll(list);
                        }
                    }
                    com.google.firebase.messaging.m mVar = this.m;
                    j9.b bVar = (j9.b) mVar.b;
                    long lastModified = bVar.b.b(str4, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        applicationExitInfo = it.next();
                        if (applicationExitInfo.getTimestamp() < lastModified) {
                            break;
                        }
                        if (applicationExitInfo.getReason() == 6) {
                            break;
                        }
                    }
                    applicationExitInfo = null;
                    if (applicationExitInfo == null) {
                        String d = ta.b.d("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", d, null);
                        }
                    } else {
                        r rVar = (r) mVar.a;
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e12) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e12, null);
                        }
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = traceInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            str3 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            c3.h hVar2 = new c3.h();
                            hVar2.d = Integer.valueOf(applicationExitInfo.getImportance());
                            processName = applicationExitInfo.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            hVar2.b = processName;
                            hVar2.c = Integer.valueOf(applicationExitInfo.getReason());
                            hVar2.g = Long.valueOf(applicationExitInfo.getTimestamp());
                            hVar2.a = Integer.valueOf(applicationExitInfo.getPid());
                            hVar2.e = Long.valueOf(applicationExitInfo.getPss());
                            hVar2.f = Long.valueOf(applicationExitInfo.getRss());
                            hVar2.h = str3;
                            b0 a2 = hVar2.a();
                            int i11 = rVar.a.getResources().getConfiguration().orientation;
                            com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                            mVar2.b = "anr";
                            long j11 = a2.g;
                            mVar2.a = Long.valueOf(j11);
                            a aVar = rVar.c;
                            if (!rVar.e.d().b.c || aVar.c.size() <= 0) {
                                i9 = i11;
                                j10 = j11;
                                list2 = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = aVar.c;
                                int size = arrayList3.size();
                                i9 = i11;
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList3.get(i12);
                                    int i13 = i12 + 1;
                                    int i14 = size;
                                    e eVar2 = (e) obj;
                                    String str6 = eVar2.a;
                                    if (str6 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    ArrayList arrayList4 = arrayList3;
                                    String str7 = eVar2.b;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    String str8 = eVar2.c;
                                    if (str8 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    arrayList2.add(new c0(str7, str6, str8));
                                    i12 = i13;
                                    size = i14;
                                    arrayList3 = arrayList4;
                                    j11 = j11;
                                }
                                j10 = j11;
                                list2 = DesugarCollections.unmodifiableList(arrayList2);
                            }
                            c3.h hVar3 = new c3.h();
                            hVar3.d = Integer.valueOf(a2.d);
                            String str9 = a2.b;
                            if (str9 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            hVar3.b = str9;
                            hVar3.c = Integer.valueOf(a2.c);
                            hVar3.g = Long.valueOf(j10);
                            hVar3.a = Integer.valueOf(a2.a);
                            hVar3.e = Long.valueOf(a2.e);
                            hVar3.f = Long.valueOf(a2.f);
                            hVar3.h = a2.h;
                            hVar3.i = list2;
                            b0 a3 = hVar3.a();
                            Boolean valueOf = Boolean.valueOf(a3.d != 100);
                            String processName2 = a3.b;
                            int i15 = a3.a;
                            int i16 = a3.d;
                            kotlin.jvm.internal.i.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i16 = 0;
                            }
                            com.google.firebase.messaging.t tVar2 = new com.google.firebase.messaging.t(8, false);
                            tVar2.b = processName2;
                            tVar2.d = Integer.valueOf(i15);
                            tVar2.e = Integer.valueOf(i16);
                            tVar2.c = Boolean.FALSE;
                            t0 k10 = tVar2.k();
                            q0 q0Var = new q0(0L, "0", "0");
                            List a10 = rVar.a();
                            if (a10 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            mVar2.c = new m0(new n0(null, null, a3, q0Var, a10), null, null, valueOf, k10, null, i9);
                            mVar2.d = rVar.b(i9);
                            l0 g10 = mVar2.g();
                            String d9 = ta.b.d("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", d9, null);
                            }
                            bVar.d(com.google.firebase.messaging.m.d(com.google.firebase.messaging.m.b(g10, eVar, t3Var), t3Var), str4, true);
                        }
                        str3 = null;
                        c3.h hVar22 = new c3.h();
                        hVar22.d = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    String d10 = ta.b.d("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", d10, null);
                    }
                }
            } else {
                String l10 = r0.l(i10, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", l10, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.j.c(str4)) {
            String d11 = ta.b.d("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", d11, null);
            } else {
                r52 = 0;
            }
            this.j.a(str4).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str4, r52);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str4, r52);
            Log.w("FirebaseCrashlytics", "No native core present", r52);
            str = r52;
        } else {
            str = null;
        }
        if (z10 != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.l.b(str);
            str2 = null;
        }
        com.google.firebase.messaging.m mVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        j9.b bVar2 = (j9.b) mVar3.b;
        j9.c cVar3 = bVar2.b;
        cVar3.getClass();
        File file = cVar3.a;
        j9.c.a(new File(file, ".com.google.firebase.crashlytics"));
        j9.c.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            j9.c.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c10 = bVar2.c();
        if (str2 != null) {
            c10.remove(str2);
        }
        if (c10.size() > 8) {
            while (c10.size() > 8) {
                String str10 = (String) c10.last();
                String d12 = ta.b.d("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", d12, null);
                }
                j9.c.d(new File(cVar3.c, str10));
                c10.remove(str10);
            }
        }
        for (String str11 : c10) {
            String d13 = ta.b.d("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", d13, null);
            }
            h9.c cVar4 = j9.b.g;
            i iVar = j9.b.i;
            File file2 = new File(cVar3.c, str11);
            file2.mkdirs();
            List<File> e13 = j9.c.e(file2.listFiles(iVar));
            if (e13.isEmpty()) {
                String o6 = aa.d.o("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", o6, null);
                }
            } else {
                Collections.sort(e13);
                ArrayList arrayList5 = new ArrayList();
                boolean z12 = false;
                for (File file3 : e13) {
                    try {
                        String e14 = j9.b.e(file3);
                        cVar4.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e14));
                            try {
                                l0 e15 = h9.c.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(e15);
                            } finally {
                            }
                        } catch (IllegalStateException e16) {
                            throw new IOException(e16);
                        }
                    } catch (IOException e17) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e17);
                    }
                    if (!z12) {
                        String name = file3.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z11 = false;
                            z12 = z11;
                        }
                    }
                    z11 = true;
                    z12 = z11;
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String d14 = new f9.g(cVar3).d(str11);
                    String a11 = bVar2.d.a(str11);
                    File b11 = cVar3.b(str11, "report");
                    try {
                        String e18 = j9.b.e(b11);
                        cVar4.getClass();
                        a0 i17 = h9.c.i(e18);
                        f8 a12 = i17.a();
                        d2 d2Var = i17.j;
                        if (d2Var != null) {
                            g0 a13 = d2Var.a();
                            a13.e = Long.valueOf(currentTimeMillis);
                            a13.f = Boolean.valueOf(z12);
                            if (d14 != null) {
                                a13.h = new a1(d14);
                            }
                            a12.g = a13.a();
                        }
                        a0 a14 = a12.a();
                        f8 a15 = a14.a();
                        a15.e = a11;
                        d2 d2Var2 = a14.j;
                        if (d2Var2 != null) {
                            g0 a16 = d2Var2.a();
                            a16.c = a11;
                            a15.g = a16.a();
                        }
                        a0 a17 = a15.a();
                        d2 d2Var3 = a17.j;
                        if (d2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        f8 a18 = a17.a();
                        g0 a19 = d2Var3.a();
                        a19.k = arrayList5;
                        a18.g = a19.a();
                        a0 a20 = a18.a();
                        d2 d2Var4 = a20.j;
                        if (d2Var4 != null) {
                            String str12 = "appQualitySessionId: " + a11;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e19) {
                                        e = e19;
                                    }
                                }
                                j9.b.f(z12 ? new File(cVar3.e, ((h0) d2Var4).b) : new File(cVar3.d, ((h0) d2Var4).b), h9.c.a.u(a20));
                            } catch (IOException e20) {
                                e = e20;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                j9.c.d(new File(cVar3.c, str11));
                            }
                        }
                        e = e19;
                    } catch (IOException e21) {
                        e = e21;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                j9.c.d(new File(cVar3.c, str11));
            }
            j9.c.d(new File(cVar3.c, str11));
        }
        com.google.android.gms.internal.cast.a aVar2 = bVar2.c.d().a;
        ArrayList b12 = bVar2.b();
        int size2 = b12.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = b12.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(c3.h hVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        s sVar = this.n;
        if (sVar != null && sVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, hVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String e() {
        NavigableSet c10 = ((j9.b) this.m.b).c();
        if (c10.isEmpty()) {
            return null;
        }
        return (String) c10.first();
    }

    public final void g() {
        try {
            String f10 = f();
            if (f10 != null) {
                try {
                    ((com.google.firebase.messaging.l) this.d.e).r("com.crashlytics.version-control-info", f10);
                } catch (IllegalArgumentException e10) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.o;
        j9.c cVar = ((j9.b) this.m.b).b;
        if (j9.c.e(cVar.d.listFiles()).isEmpty() && j9.c.e(cVar.e.listFiles()).isEmpty() && j9.c.e(cVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        b9.d dVar = b9.d.a;
        dVar.c("Crash reports are available to be sent.");
        t tVar = this.b;
        if (tVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.c) {
                task2 = tVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new wa.a(6));
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = z.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            y yVar = new y(1, taskCompletionSource2);
            onSuccessTask.continueWith(yVar);
            task4.continueWith(yVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new we.b(23, this, task));
    }
}
