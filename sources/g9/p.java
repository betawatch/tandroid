package g9;

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
import bg.c2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h7.d8;
import i9.a1;
import i9.b0;
import i9.b1;
import i9.c0;
import i9.c1;
import i9.d1;
import i9.d2;
import i9.e1;
import i9.e2;
import i9.g0;
import i9.h0;
import i9.i0;
import i9.l0;
import i9.m0;
import i9.n0;
import i9.q0;
import i9.t0;
import j$.util.DesugarCollections;
import j7.l1;
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
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p {
    public static final i r = new i(1);
    public final Context a;
    public final u b;
    public final l c;
    public final s3 d;
    public final com.google.firebase.messaging.s e;
    public final y f;
    public final l9.b g;
    public final a h;
    public final h9.e i;
    public final d9.b j;
    public final e9.a k;
    public final k l;
    public final c2 m;
    public t n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public p(Context context, com.google.firebase.messaging.s sVar, y yVar, u uVar, l9.b bVar, l lVar, a aVar, s3 s3Var, h9.e eVar, c2 c2Var, d9.b bVar2, e9.a aVar2, k kVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = sVar;
        this.f = yVar;
        this.b = uVar;
        this.g = bVar;
        this.c = lVar;
        this.h = aVar;
        this.d = s3Var;
        this.i = eVar;
        this.j = bVar2;
        this.k = aVar2;
        this.l = kVar;
        this.m = c2Var;
    }

    public static void a(p pVar, String str, Boolean bool) {
        int i10;
        long j10;
        Integer num;
        pVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String e10 = u3.c.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e10, null);
        }
        Locale locale = Locale.US;
        y yVar = pVar.f;
        a aVar = pVar.h;
        c1 c1Var = new c1(yVar.c, aVar.f, aVar.g, yVar.b().a, com.google.android.recaptcha.internal.a.c(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = pVar.a;
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
        pVar.j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            j10 = currentTimeMillis;
        } else {
            s3 s3Var = pVar.d;
            synchronized (((String) s3Var.c)) {
                try {
                    s3Var.c = str;
                    Map a2 = ((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.d).b).getReference()).a();
                    List f9 = ((p2.u) s3Var.f).f();
                    if (((String) ((AtomicMarkableReference) s3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((h9.g) s3Var.a).i(str, (String) ((AtomicMarkableReference) s3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((h9.g) s3Var.a).g(str, a2, false);
                    }
                    if (!f9.isEmpty()) {
                        ((h9.g) s3Var.a).h(str, f9);
                    }
                } finally {
                }
            }
        }
        h9.e eVar = pVar.i;
        ((h9.c) eVar.b).b();
        eVar.b = h9.e.c;
        if (str != null) {
            eVar.b = new h9.m(((l9.b) eVar.a).b(str, "userlog"));
        }
        pVar.l.b(str);
        c2 c2Var = pVar.m;
        s sVar = (s) c2Var.a;
        Charset charset = e2.a;
        d8 d8Var = new d8();
        d8Var.a = "18.6.0";
        a aVar2 = sVar.c;
        String str8 = aVar2.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        d8Var.b = str8;
        y yVar2 = sVar.b;
        String str9 = yVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        d8Var.c = str9;
        d8Var.d = yVar2.b().b;
        String str10 = aVar2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        d8Var.k = str10;
        String str11 = aVar2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        d8Var.f = str11;
        d8Var.i = 4;
        g0 g0Var = new g0();
        g0Var.f = Boolean.FALSE;
        g0Var.d = Long.valueOf(j10);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        g0Var.b = str;
        String str12 = s.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        g0Var.a = str12;
        String str13 = yVar2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = yVar2.b().a;
        ze.b bVar = aVar2.h;
        if (((d9.c) bVar.b) == null) {
            bVar.b = new d9.c(bVar);
        }
        d9.c cVar = (d9.c) bVar.b;
        String str15 = cVar.b;
        if (cVar == null) {
            bVar.b = new d9.c(bVar);
        }
        g0Var.g = new i0(str13, str10, str11, str14, str15, ((d9.c) bVar.b).c);
        com.google.firebase.messaging.s sVar2 = new com.google.firebase.messaging.s(12, false);
        Integer valueOf = Integer.valueOf(i10);
        sVar2.d = valueOf;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        sVar2.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        sVar2.e = str3;
        sVar2.c = Boolean.valueOf(h.h());
        g0Var.i = sVar2.m();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i11 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) s.f.get(str4.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(sVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g11 = h.g();
        int d10 = h.d();
        e3.f fVar = new e3.f();
        fVar.a = Integer.valueOf(i11);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        fVar.b = str5;
        fVar.c = Integer.valueOf(availableProcessors2);
        fVar.d = Long.valueOf(b11);
        fVar.e = Long.valueOf(blockCount2);
        fVar.f = Boolean.valueOf(g11);
        fVar.g = Integer.valueOf(d10);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        fVar.h = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        fVar.i = str7;
        g0Var.j = fVar.b();
        g0Var.l = valueOf;
        d8Var.g = g0Var.a();
        i9.a0 a10 = d8Var.a();
        l9.b bVar2 = ((l9.a) c2Var.b).b;
        d2 d2Var = a10.j;
        if (d2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((h0) d2Var).b;
        try {
            l9.a.g.getClass();
            l9.a.f(bVar2.b(str16, "report"), j9.a.a.y(a10));
            File b12 = bVar2.b(str16, "start-time");
            long j11 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), l9.a.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j11 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e11) {
            String e12 = u3.c.e("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", e12, e11);
            }
        }
    }

    public static Task b(p pVar) {
        Task call;
        pVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : l9.b.e(pVar.g.b.listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new o(pVar, parseLong));
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
        ClassLoader classLoader = p.class.getClassLoader();
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
    public final void c(boolean z10, e3.f fVar) {
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
        ArrayList arrayList = new ArrayList(((l9.a) this.m.b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList.get(z10 == true ? 1 : 0);
        if (fVar.d().b.b) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    l9.b bVar = this.g;
                    h9.e eVar = new h9.e(bVar);
                    eVar.b = h9.e.c;
                    if (str4 != null) {
                        eVar.b = new h9.m(bVar.b(str4, "userlog"));
                    }
                    l9.b bVar2 = this.g;
                    com.google.firebase.messaging.s sVar = this.e;
                    h9.g gVar = new h9.g(bVar2);
                    s3 s3Var = new s3(str4, bVar2, sVar);
                    ((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.d).b).getReference()).d(gVar.c(str4, false));
                    ((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.e).b).getReference()).d(gVar.c(str4, true));
                    ((AtomicMarkableReference) s3Var.h).set(gVar.d(str4), false);
                    p2.u uVar = (p2.u) s3Var.f;
                    File b10 = bVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        h9.g.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = h9.g.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    h9.g.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (uVar) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            h.c(fileInputStream2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (uVar) {
                        ((ArrayList) uVar.c).clear();
                        if (list.size() > uVar.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + uVar.b, null);
                            ((ArrayList) uVar.c).addAll(list.subList(0, uVar.b));
                        } else {
                            ((ArrayList) uVar.c).addAll(list);
                        }
                    }
                    c2 c2Var = this.m;
                    l9.a aVar = (l9.a) c2Var.b;
                    long lastModified = aVar.b.b(str4, "start-time").lastModified();
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
                        String e12 = u3.c.e("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", e12, null);
                        }
                    } else {
                        s sVar2 = (s) c2Var.a;
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e13) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e13, null);
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
                            e3.f fVar2 = new e3.f();
                            fVar2.d = Integer.valueOf(applicationExitInfo.getImportance());
                            processName = applicationExitInfo.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            fVar2.b = processName;
                            fVar2.c = Integer.valueOf(applicationExitInfo.getReason());
                            fVar2.g = Long.valueOf(applicationExitInfo.getTimestamp());
                            fVar2.a = Integer.valueOf(applicationExitInfo.getPid());
                            fVar2.e = Long.valueOf(applicationExitInfo.getPss());
                            fVar2.f = Long.valueOf(applicationExitInfo.getRss());
                            fVar2.h = str3;
                            b0 a2 = fVar2.a();
                            int i12 = sVar2.a.getResources().getConfiguration().orientation;
                            c2 c2Var2 = new c2();
                            c2Var2.b = "anr";
                            long j11 = a2.g;
                            c2Var2.a = Long.valueOf(j11);
                            a aVar2 = sVar2.c;
                            if (!sVar2.e.d().b.c || aVar2.c.size() <= 0) {
                                i10 = i12;
                                j10 = j11;
                                list2 = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = aVar2.c;
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
                            e3.f fVar3 = new e3.f();
                            fVar3.d = Integer.valueOf(a2.d);
                            String str9 = a2.b;
                            if (str9 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            fVar3.b = str9;
                            fVar3.c = Integer.valueOf(a2.c);
                            fVar3.g = Long.valueOf(j10);
                            fVar3.a = Integer.valueOf(a2.a);
                            fVar3.e = Long.valueOf(a2.e);
                            fVar3.f = Long.valueOf(a2.f);
                            fVar3.h = a2.h;
                            fVar3.i = list2;
                            b0 a10 = fVar3.a();
                            Boolean valueOf = Boolean.valueOf(a10.d != 100);
                            String processName2 = a10.b;
                            int i16 = a10.a;
                            int i17 = a10.d;
                            kotlin.jvm.internal.j.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i17 = 0;
                            }
                            com.google.firebase.messaging.s sVar3 = new com.google.firebase.messaging.s(10, false);
                            sVar3.b = processName2;
                            sVar3.d = Integer.valueOf(i16);
                            sVar3.e = Integer.valueOf(i17);
                            sVar3.c = Boolean.FALSE;
                            t0 k9 = sVar3.k();
                            q0 q0Var = new q0(0L, "0", "0");
                            List a11 = sVar2.a();
                            if (a11 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            c2Var2.c = new m0(new n0(null, null, a10, q0Var, a11), null, null, valueOf, k9, null, i10);
                            c2Var2.d = sVar2.b(i10);
                            l0 g10 = c2Var2.g();
                            String e14 = u3.c.e("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", e14, null);
                            }
                            aVar.d(c2.d(c2.b(g10, eVar, s3Var), s3Var), str4, true);
                        }
                        str3 = null;
                        e3.f fVar22 = new e3.f();
                        fVar22.d = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    String e15 = u3.c.e("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", e15, null);
                    }
                }
            } else {
                String k10 = l1.k(i11, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", k10, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.j.c(str4)) {
            String e16 = u3.c.e("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", e16, null);
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
        c2 c2Var3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        l9.a aVar3 = (l9.a) c2Var3.b;
        l9.b bVar3 = aVar3.b;
        bVar3.getClass();
        File file = bVar3.a;
        l9.b.a(new File(file, ".com.google.firebase.crashlytics"));
        l9.b.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            l9.b.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c3 = aVar3.c();
        if (str2 != null) {
            c3.remove(str2);
        }
        if (c3.size() > 8) {
            while (c3.size() > 8) {
                String str10 = (String) c3.last();
                String e17 = u3.c.e("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", e17, null);
                }
                l9.b.d(new File(bVar3.c, str10));
                c3.remove(str10);
            }
        }
        for (String str11 : c3) {
            String e18 = u3.c.e("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e18, null);
            }
            j9.a aVar4 = l9.a.g;
            i iVar = l9.a.i;
            File file2 = new File(bVar3.c, str11);
            file2.mkdirs();
            List<File> e19 = l9.b.e(file2.listFiles(iVar));
            if (e19.isEmpty()) {
                String n10 = a4.w.n("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", n10, null);
                }
            } else {
                Collections.sort(e19);
                ArrayList arrayList5 = new ArrayList();
                boolean z12 = false;
                for (File file3 : e19) {
                    try {
                        String e20 = l9.a.e(file3);
                        aVar4.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e20));
                            try {
                                l0 e21 = j9.a.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(e21);
                            } finally {
                            }
                        } catch (IllegalStateException e22) {
                            throw new IOException(e22);
                        }
                    } catch (IOException e23) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e23);
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
                    String d = new h9.g(bVar3).d(str11);
                    String a12 = aVar3.d.a(str11);
                    File b11 = bVar3.b(str11, "report");
                    try {
                        String e24 = l9.a.e(b11);
                        aVar4.getClass();
                        i9.a0 i18 = j9.a.i(e24);
                        d8 a13 = i18.a();
                        d2 d2Var = i18.j;
                        if (d2Var != null) {
                            g0 a14 = d2Var.a();
                            a14.e = Long.valueOf(currentTimeMillis);
                            a14.f = Boolean.valueOf(z12);
                            if (d != null) {
                                a14.h = new a1(d);
                            }
                            a13.g = a14.a();
                        }
                        i9.a0 a15 = a13.a();
                        d8 a16 = a15.a();
                        a16.e = a12;
                        d2 d2Var2 = a15.j;
                        if (d2Var2 != null) {
                            g0 a17 = d2Var2.a();
                            a17.c = a12;
                            a16.g = a17.a();
                        }
                        i9.a0 a18 = a16.a();
                        d2 d2Var3 = a18.j;
                        if (d2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        d8 a19 = a18.a();
                        g0 a20 = d2Var3.a();
                        a20.k = arrayList5;
                        a19.g = a20.a();
                        i9.a0 a21 = a19.a();
                        d2 d2Var4 = a21.j;
                        if (d2Var4 != null) {
                            String str12 = "appQualitySessionId: " + a12;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e25) {
                                        e = e25;
                                    }
                                }
                                l9.a.f(z12 ? new File(bVar3.e, ((h0) d2Var4).b) : new File(bVar3.d, ((h0) d2Var4).b), j9.a.a.y(a21));
                            } catch (IOException e26) {
                                e = e26;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                l9.b.d(new File(bVar3.c, str11));
                            }
                        }
                        e = e25;
                    } catch (IOException e27) {
                        e = e27;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                l9.b.d(new File(bVar3.c, str11));
            }
            l9.b.d(new File(bVar3.c, str11));
        }
        a5.c cVar = aVar3.c.d().a;
        ArrayList b12 = aVar3.b();
        int size2 = b12.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = b12.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(e3.f fVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        t tVar = this.n;
        if (tVar != null && tVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, fVar);
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
        NavigableSet c3 = ((l9.a) this.m.b).c();
        if (c3.isEmpty()) {
            return null;
        }
        return (String) c3.first();
    }

    public final void g() {
        try {
            String f9 = f();
            if (f9 != null) {
                try {
                    ((ab.m) this.d.e).r("com.crashlytics.version-control-info", f9);
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
        l9.b bVar = ((l9.a) this.m.b).b;
        if (l9.b.e(bVar.d.listFiles()).isEmpty() && l9.b.e(bVar.e.listFiles()).isEmpty() && l9.b.e(bVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        d9.d dVar = d9.d.a;
        dVar.c("Crash reports are available to be sent.");
        u uVar = this.b;
        if (uVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (uVar.c) {
                task2 = uVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new x9.d(7));
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = a0.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            z zVar = new z(1, taskCompletionSource2);
            onSuccessTask.continueWith(zVar);
            task4.continueWith(zVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new l(2, this, task));
    }
}
