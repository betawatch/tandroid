package f9;

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
import g7.e8;
import h9.a1;
import h9.b1;
import h9.c0;
import h9.c1;
import h9.d1;
import h9.d2;
import h9.e1;
import h9.e2;
import h9.g0;
import h9.h0;
import h9.i0;
import h9.l0;
import h9.m0;
import h9.n0;
import h9.q0;
import h9.t0;
import j$.util.DesugarCollections;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o {
    public static final i r = new i(1);
    public final Context a;
    public final t b;
    public final xe.b c;
    public final t3 d;
    public final com.google.firebase.messaging.t e;
    public final x f;
    public final k9.c g;
    public final a h;
    public final g9.e i;
    public final c9.a j;
    public final d9.a k;
    public final k l;
    public final com.google.firebase.messaging.m m;
    public s n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public o(Context context, com.google.firebase.messaging.t tVar, x xVar, t tVar2, k9.c cVar, xe.b bVar, a aVar, t3 t3Var, g9.e eVar, com.google.firebase.messaging.m mVar, c9.a aVar2, d9.a aVar3, k kVar) {
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
        this.j = aVar2;
        this.k = aVar3;
        this.l = kVar;
        this.m = mVar;
    }

    public static void a(o oVar, String str, Boolean bool) {
        int i10;
        long j10;
        Integer num;
        oVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String e9 = s3.c.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e9, null);
        }
        Locale locale = Locale.US;
        x xVar = oVar.f;
        a aVar = oVar.h;
        c1 c1Var = new c1(xVar.c, aVar.f, aVar.g, xVar.b().a, com.google.android.recaptcha.internal.a.c(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = oVar.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.a;
        String str4 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str4)) {
            i10 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i10 = 3;
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
        int d = h.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        oVar.j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            j10 = currentTimeMillis;
        } else {
            t3 t3Var = oVar.d;
            synchronized (((String) t3Var.c)) {
                try {
                    t3Var.c = str;
                    Map a2 = ((g9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).b).getReference()).a();
                    List g11 = ((n2.v) t3Var.f).g();
                    if (((String) ((AtomicMarkableReference) t3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((g9.g) t3Var.a).i(str, (String) ((AtomicMarkableReference) t3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((g9.g) t3Var.a).g(str, a2, false);
                    }
                    if (!g11.isEmpty()) {
                        ((g9.g) t3Var.a).h(str, g11);
                    }
                } finally {
                }
            }
        }
        g9.e eVar = oVar.i;
        ((g9.c) eVar.b).a();
        eVar.b = g9.e.c;
        if (str != null) {
            eVar.b = new g9.m(((k9.c) eVar.a).b(str, "userlog"));
        }
        oVar.l.b(str);
        com.google.firebase.messaging.m mVar = oVar.m;
        r rVar = (r) mVar.a;
        Charset charset = e2.a;
        e8 e8Var = new e8();
        e8Var.a = "18.6.0";
        a aVar2 = rVar.c;
        String str8 = aVar2.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        e8Var.b = str8;
        x xVar2 = rVar.b;
        String str9 = xVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        e8Var.c = str9;
        e8Var.d = xVar2.b().b;
        String str10 = aVar2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        e8Var.k = str10;
        String str11 = aVar2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        e8Var.f = str11;
        e8Var.i = 4;
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
        xe.b bVar = aVar2.h;
        if (((c9.b) bVar.c) == null) {
            bVar.c = new c9.b(bVar);
        }
        c9.b bVar2 = (c9.b) bVar.c;
        String str15 = bVar2.b;
        if (bVar2 == null) {
            bVar.c = new c9.b(bVar);
        }
        g0Var.g = new i0(str13, str10, str11, str14, str15, ((c9.b) bVar.c).c);
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(11, false);
        Integer valueOf = Integer.valueOf(i10);
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
        int i11 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) r.f.get(str4.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(rVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g12 = h.g();
        int d10 = h.d();
        c3.g gVar3 = new c3.g();
        gVar3.a = Integer.valueOf(i11);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        gVar3.b = str5;
        gVar3.c = Integer.valueOf(availableProcessors2);
        gVar3.d = Long.valueOf(b11);
        gVar3.e = Long.valueOf(blockCount2);
        gVar3.f = Boolean.valueOf(g12);
        gVar3.g = Integer.valueOf(d10);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        gVar3.h = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        gVar3.i = str7;
        g0Var.j = gVar3.b();
        g0Var.l = valueOf;
        e8Var.g = g0Var.a();
        h9.a0 a3 = e8Var.a();
        k9.c cVar = ((k9.b) mVar.b).b;
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
            k9.b.g.getClass();
            k9.b.f(cVar.b(str16, "report"), i9.a.a.h(a3));
            File b12 = cVar.b(str16, "start-time");
            long j11 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), k9.b.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j11 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String e11 = s3.c.e("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", e11, e10);
            }
        }
    }

    public static Task b(o oVar) {
        Task call;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : k9.c.e(oVar.g.b.listFiles(r))) {
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
    public final void c(boolean z10, c3.g gVar) {
        String str;
        String str2;
        boolean z11;
        ?? r52;
        List list;
        ApplicationExitInfo applicationExitInfo;
        String str3;
        String processName;
        int i10;
        long j10;
        List list2;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        ArrayList arrayList = new ArrayList(((k9.b) this.m.b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList.get(z10 == true ? 1 : 0);
        if (gVar.d().b.b) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    k9.c cVar = this.g;
                    g9.e eVar = new g9.e(cVar);
                    eVar.b = g9.e.c;
                    if (str4 != null) {
                        eVar.b = new g9.m(cVar.b(str4, "userlog"));
                    }
                    k9.c cVar2 = this.g;
                    com.google.firebase.messaging.t tVar = this.e;
                    g9.g gVar2 = new g9.g(cVar2);
                    t3 t3Var = new t3(str4, cVar2, tVar);
                    ((g9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).b).getReference()).d(gVar2.c(str4, false));
                    ((g9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.e).b).getReference()).d(gVar2.c(str4, true));
                    ((AtomicMarkableReference) t3Var.h).set(gVar2.d(str4), false);
                    n2.v vVar = (n2.v) t3Var.f;
                    File b10 = cVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        g9.g.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = g9.g.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e9) {
                                    e = e9;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    g9.g.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (vVar) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            h.c(fileInputStream2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (vVar) {
                        ((ArrayList) vVar.c).clear();
                        if (list.size() > vVar.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + vVar.b, null);
                            ((ArrayList) vVar.c).addAll(list.subList(0, vVar.b));
                        } else {
                            ((ArrayList) vVar.c).addAll(list);
                        }
                    }
                    com.google.firebase.messaging.m mVar = this.m;
                    k9.b bVar = (k9.b) mVar.b;
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
                        String e11 = s3.c.e("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", e11, null);
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
                            c3.g gVar3 = new c3.g();
                            gVar3.d = Integer.valueOf(applicationExitInfo.getImportance());
                            processName = applicationExitInfo.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            gVar3.b = processName;
                            gVar3.c = Integer.valueOf(applicationExitInfo.getReason());
                            gVar3.g = Long.valueOf(applicationExitInfo.getTimestamp());
                            gVar3.a = Integer.valueOf(applicationExitInfo.getPid());
                            gVar3.e = Long.valueOf(applicationExitInfo.getPss());
                            gVar3.f = Long.valueOf(applicationExitInfo.getRss());
                            gVar3.h = str3;
                            h9.b0 a2 = gVar3.a();
                            int i12 = rVar.a.getResources().getConfiguration().orientation;
                            com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                            mVar2.b = "anr";
                            long j11 = a2.g;
                            mVar2.a = Long.valueOf(j11);
                            a aVar = rVar.c;
                            if (!rVar.e.d().b.c || aVar.c.size() <= 0) {
                                i10 = i12;
                                j10 = j11;
                                list2 = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = aVar.c;
                                int size = arrayList3.size();
                                i10 = i12;
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList3.get(i13);
                                    int i14 = i13 + 1;
                                    int i15 = size;
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
                                    i13 = i14;
                                    size = i15;
                                    arrayList3 = arrayList4;
                                    j11 = j11;
                                }
                                j10 = j11;
                                list2 = DesugarCollections.unmodifiableList(arrayList2);
                            }
                            c3.g gVar4 = new c3.g();
                            gVar4.d = Integer.valueOf(a2.d);
                            String str9 = a2.b;
                            if (str9 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            gVar4.b = str9;
                            gVar4.c = Integer.valueOf(a2.c);
                            gVar4.g = Long.valueOf(j10);
                            gVar4.a = Integer.valueOf(a2.a);
                            gVar4.e = Long.valueOf(a2.e);
                            gVar4.f = Long.valueOf(a2.f);
                            gVar4.h = a2.h;
                            gVar4.i = list2;
                            h9.b0 a3 = gVar4.a();
                            Boolean valueOf = Boolean.valueOf(a3.d != 100);
                            String processName2 = a3.b;
                            int i16 = a3.a;
                            int i17 = a3.d;
                            kotlin.jvm.internal.j.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i17 = 0;
                            }
                            com.google.firebase.messaging.t tVar2 = new com.google.firebase.messaging.t(9, false);
                            tVar2.b = processName2;
                            tVar2.d = Integer.valueOf(i16);
                            tVar2.e = Integer.valueOf(i17);
                            tVar2.c = Boolean.FALSE;
                            t0 k10 = tVar2.k();
                            q0 q0Var = new q0(0L, "0", "0");
                            List a10 = rVar.a();
                            if (a10 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            mVar2.c = new m0(new n0(null, null, a3, q0Var, a10), null, null, valueOf, k10, null, i10);
                            mVar2.d = rVar.b(i10);
                            l0 g10 = mVar2.g();
                            String e13 = s3.c.e("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", e13, null);
                            }
                            bVar.d(com.google.firebase.messaging.m.d(com.google.firebase.messaging.m.b(g10, eVar, t3Var), t3Var), str4, true);
                        }
                        str3 = null;
                        c3.g gVar32 = new c3.g();
                        gVar32.d = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    String e14 = s3.c.e("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", e14, null);
                    }
                }
            } else {
                String k11 = i0.a.k(i11, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", k11, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.j.c(str4)) {
            String e15 = s3.c.e("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", e15, null);
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
        k9.b bVar2 = (k9.b) mVar3.b;
        k9.c cVar3 = bVar2.b;
        cVar3.getClass();
        File file = cVar3.a;
        k9.c.a(new File(file, ".com.google.firebase.crashlytics"));
        k9.c.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            k9.c.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c10 = bVar2.c();
        if (str2 != null) {
            c10.remove(str2);
        }
        if (c10.size() > 8) {
            while (c10.size() > 8) {
                String str10 = (String) c10.last();
                String e16 = s3.c.e("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", e16, null);
                }
                k9.c.d(new File(cVar3.c, str10));
                c10.remove(str10);
            }
        }
        for (String str11 : c10) {
            String e17 = s3.c.e("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e17, null);
            }
            i9.a aVar2 = k9.b.g;
            i iVar = k9.b.i;
            File file2 = new File(cVar3.c, str11);
            file2.mkdirs();
            List<File> e18 = k9.c.e(file2.listFiles(iVar));
            if (e18.isEmpty()) {
                String m10 = a9.p.m("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", m10, null);
                }
            } else {
                Collections.sort(e18);
                ArrayList arrayList5 = new ArrayList();
                boolean z12 = false;
                for (File file3 : e18) {
                    try {
                        String e19 = k9.b.e(file3);
                        aVar2.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e19));
                            try {
                                l0 e20 = i9.a.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(e20);
                            } finally {
                            }
                        } catch (IllegalStateException e21) {
                            throw new IOException(e21);
                        }
                    } catch (IOException e22) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e22);
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
                    String d = new g9.g(cVar3).d(str11);
                    String a11 = bVar2.d.a(str11);
                    File b11 = cVar3.b(str11, "report");
                    try {
                        String e23 = k9.b.e(b11);
                        aVar2.getClass();
                        h9.a0 i18 = i9.a.i(e23);
                        e8 a12 = i18.a();
                        d2 d2Var = i18.j;
                        if (d2Var != null) {
                            g0 a13 = d2Var.a();
                            a13.e = Long.valueOf(currentTimeMillis);
                            a13.f = Boolean.valueOf(z12);
                            if (d != null) {
                                a13.h = new a1(d);
                            }
                            a12.g = a13.a();
                        }
                        h9.a0 a14 = a12.a();
                        e8 a15 = a14.a();
                        a15.e = a11;
                        d2 d2Var2 = a14.j;
                        if (d2Var2 != null) {
                            g0 a16 = d2Var2.a();
                            a16.c = a11;
                            a15.g = a16.a();
                        }
                        h9.a0 a17 = a15.a();
                        d2 d2Var3 = a17.j;
                        if (d2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        e8 a18 = a17.a();
                        g0 a19 = d2Var3.a();
                        a19.k = arrayList5;
                        a18.g = a19.a();
                        h9.a0 a20 = a18.a();
                        d2 d2Var4 = a20.j;
                        if (d2Var4 != null) {
                            String str12 = "appQualitySessionId: " + a11;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e24) {
                                        e = e24;
                                    }
                                }
                                k9.b.f(z12 ? new File(cVar3.e, ((h0) d2Var4).b) : new File(cVar3.d, ((h0) d2Var4).b), i9.a.a.h(a20));
                            } catch (IOException e25) {
                                e = e25;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                k9.c.d(new File(cVar3.c, str11));
                            }
                        }
                        e = e24;
                    } catch (IOException e26) {
                        e = e26;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                k9.c.d(new File(cVar3.c, str11));
            }
            k9.c.d(new File(cVar3.c, str11));
        }
        com.google.android.gms.internal.cast.a aVar3 = bVar2.c.d().a;
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

    public final boolean d(c3.g gVar) {
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
            c(true, gVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e9) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e9);
            return false;
        }
    }

    public final String e() {
        NavigableSet c10 = ((k9.b) this.m.b).c();
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
                } catch (IllegalArgumentException e9) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e9;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.o;
        k9.c cVar = ((k9.b) this.m.b).b;
        if (k9.c.e(cVar.d.listFiles()).isEmpty() && k9.c.e(cVar.e.listFiles()).isEmpty() && k9.c.e(cVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        c9.c cVar2 = c9.c.a;
        cVar2.c("Crash reports are available to be sent.");
        t tVar = this.b;
        if (tVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar2.b("Automatic data collection is disabled.");
            cVar2.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.c) {
                task2 = tVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new za.b(6));
            cVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = b0.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            a0 a0Var = new a0(1, taskCompletionSource2);
            onSuccessTask.continueWith(a0Var);
            task4.continueWith(a0Var);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new xe.b(26, this, task));
    }
}
