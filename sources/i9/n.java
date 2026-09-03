package i9;

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
import j$.util.DesugarCollections;
import j7.g8;
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
import k9.a0;
import k9.a1;
import k9.b0;
import k9.b1;
import k9.c0;
import k9.c1;
import k9.d1;
import k9.d2;
import k9.e1;
import k9.e2;
import k9.g0;
import k9.h0;
import k9.i0;
import k9.l0;
import k9.m0;
import k9.n0;
import k9.q0;
import k9.t0;
import kf.k0;
import m.s3;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n {
    public static final i r = new i(1);
    public final Context a;
    public final s b;
    public final f7.b c;
    public final s3 d;
    public final rf.f e;
    public final w f;
    public final n9.b g;
    public final a h;
    public final j9.e i;
    public final f9.a j;
    public final g9.a k;
    public final k l;
    public final a9.a m;
    public r n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public n(Context context, rf.f fVar, w wVar, s sVar, n9.b bVar, f7.b bVar2, a aVar, s3 s3Var, j9.e eVar, a9.a aVar2, f9.a aVar3, g9.a aVar4, k kVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = fVar;
        this.f = wVar;
        this.b = sVar;
        this.g = bVar;
        this.c = bVar2;
        this.h = aVar;
        this.d = s3Var;
        this.i = eVar;
        this.j = aVar3;
        this.k = aVar4;
        this.l = kVar;
        this.m = aVar2;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String e = w2.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e, null);
        }
        Locale locale = Locale.US;
        w wVar = nVar.f;
        a aVar = nVar.h;
        c1 c1Var = new c1(wVar.c, aVar.f, aVar.g, wVar.b().a, e2.c.c(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.a;
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
        nVar.j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            j10 = currentTimeMillis;
        } else {
            s3 s3Var = nVar.d;
            synchronized (((String) s3Var.c)) {
                try {
                    s3Var.c = str;
                    Map a2 = ((j9.d) ((AtomicMarkableReference) ((cb.m) s3Var.d).b).getReference()).a();
                    List h = ((p2.w) s3Var.f).h();
                    if (((String) ((AtomicMarkableReference) s3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((j9.g) s3Var.a).i(str, (String) ((AtomicMarkableReference) s3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((j9.g) s3Var.a).g(str, a2, false);
                    }
                    if (!h.isEmpty()) {
                        ((j9.g) s3Var.a).h(str, h);
                    }
                } finally {
                }
            }
        }
        j9.e eVar = nVar.i;
        ((j9.c) eVar.b).a();
        eVar.b = j9.e.c;
        if (str != null) {
            eVar.b = new j9.m(((n9.b) eVar.a).b(str, "userlog"));
        }
        nVar.l.b(str);
        a9.a aVar2 = nVar.m;
        q qVar = (q) aVar2.a;
        Charset charset = e2.a;
        g8 g8Var = new g8();
        g8Var.a = "18.6.0";
        a aVar3 = qVar.c;
        String str8 = aVar3.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        g8Var.b = str8;
        w wVar2 = qVar.b;
        String str9 = wVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        g8Var.c = str9;
        g8Var.d = wVar2.b().b;
        String str10 = aVar3.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        g8Var.k = str10;
        String str11 = aVar3.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        g8Var.f = str11;
        g8Var.i = 4;
        g0 g0Var = new g0();
        g0Var.f = Boolean.FALSE;
        g0Var.d = Long.valueOf(j10);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        g0Var.b = str;
        String str12 = q.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        g0Var.a = str12;
        String str13 = wVar2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = wVar2.b().a;
        f7.b bVar = aVar3.h;
        if (((b6.h) bVar.c) == null) {
            bVar.c = new b6.h(bVar);
        }
        b6.h hVar = (b6.h) bVar.c;
        String str15 = hVar.b;
        if (hVar == null) {
            bVar.c = new b6.h(bVar);
        }
        g0Var.g = new i0(str13, str10, str11, str14, str15, ((b6.h) bVar.c).c);
        int i11 = 7;
        rf.f fVar = new rf.f(7, false);
        Integer valueOf = Integer.valueOf(i10);
        fVar.b = valueOf;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        fVar.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        fVar.d = str3;
        fVar.e = Boolean.valueOf(h.h());
        g0Var.i = fVar.o();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        if (!TextUtils.isEmpty(str4) && (num = (Integer) q.f.get(str4.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(qVar.a);
        long blockSize = statFs2.getBlockSize() * statFs2.getBlockCount();
        boolean g11 = h.g();
        int d10 = h.d();
        e3.g gVar3 = new e3.g();
        gVar3.a = Integer.valueOf(i11);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        gVar3.b = str5;
        gVar3.c = Integer.valueOf(availableProcessors2);
        gVar3.d = Long.valueOf(b11);
        gVar3.e = Long.valueOf(blockSize);
        gVar3.f = Boolean.valueOf(g11);
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
        g8Var.g = g0Var.a();
        a0 a10 = g8Var.a();
        n9.b bVar2 = ((n9.a) aVar2.b).b;
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
            n9.a.g.getClass();
            n9.a.f(bVar2.b(str16, "report"), l9.a.a.l(a10));
            File b12 = bVar2.b(str16, "start-time");
            long j11 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), n9.a.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j11 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e6) {
            String e10 = w2.e("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", e10, e6);
            }
        }
    }

    public static Task b(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : n9.b.e(nVar.g.b.listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new m(nVar, parseLong));
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
        ClassLoader classLoader = n.class.getClassLoader();
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
    /* JADX WARN: Removed duplicated region for block: B:207:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z4, e3.g gVar) {
        String str;
        String str2;
        boolean z10;
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
        ArrayList arrayList = new ArrayList(((n9.a) this.m.b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z4) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList.get(z4 == true ? 1 : 0);
        if (gVar.d().b.b) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    n9.b bVar = this.g;
                    j9.e eVar = new j9.e(bVar);
                    eVar.b = j9.e.c;
                    if (str4 != null) {
                        eVar.b = new j9.m(bVar.b(str4, "userlog"));
                    }
                    n9.b bVar2 = this.g;
                    rf.f fVar = this.e;
                    j9.g gVar2 = new j9.g(bVar2);
                    s3 s3Var = new s3(str4, bVar2, fVar);
                    ((j9.d) ((AtomicMarkableReference) ((cb.m) s3Var.d).b).getReference()).d(gVar2.c(str4, false));
                    ((j9.d) ((AtomicMarkableReference) ((cb.m) s3Var.e).b).getReference()).d(gVar2.c(str4, true));
                    ((AtomicMarkableReference) s3Var.h).set(gVar2.d(str4), false);
                    p2.w wVar = (p2.w) s3Var.f;
                    File b10 = bVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        j9.g.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = j9.g.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    j9.g.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (wVar) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
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
                    a9.a aVar = this.m;
                    n9.a aVar2 = (n9.a) aVar.b;
                    long lastModified = aVar2.b.b(str4, "start-time").lastModified();
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
                        String e10 = w2.e("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", e10, null);
                        }
                    } else {
                        q qVar = (q) aVar.a;
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e11) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e11, null);
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
                            e3.g gVar3 = new e3.g();
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
                            b0 a2 = gVar3.a();
                            int i12 = qVar.a.getResources().getConfiguration().orientation;
                            a9.a aVar3 = new a9.a();
                            aVar3.b = "anr";
                            long j11 = a2.g;
                            aVar3.a = Long.valueOf(j11);
                            a aVar4 = qVar.c;
                            if (!qVar.e.d().b.c || aVar4.c.size() <= 0) {
                                i10 = i12;
                                j10 = j11;
                                list2 = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = aVar4.c;
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
                            e3.g gVar4 = new e3.g();
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
                            b0 a10 = gVar4.a();
                            Boolean valueOf = Boolean.valueOf(a10.d != 100);
                            String processName2 = a10.b;
                            int i16 = a10.a;
                            int i17 = a10.d;
                            kotlin.jvm.internal.j.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i17 = 0;
                            }
                            rf.f fVar2 = new rf.f(6, false);
                            fVar2.b = processName2;
                            fVar2.c = Integer.valueOf(i16);
                            fVar2.d = Integer.valueOf(i17);
                            fVar2.e = Boolean.FALSE;
                            t0 n10 = fVar2.n();
                            q0 q0Var = new q0(0L, "0", "0");
                            List a11 = qVar.a();
                            if (a11 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            aVar3.c = new m0(new n0(null, null, a10, q0Var, a11), null, null, valueOf, n10, null, i10);
                            aVar3.d = qVar.b(i10);
                            l0 h = aVar3.h();
                            String e12 = w2.e("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", e12, null);
                            }
                            aVar2.d(a9.a.d(a9.a.b(h, eVar, s3Var), s3Var), str4, true);
                        }
                        str3 = null;
                        e3.g gVar32 = new e3.g();
                        gVar32.d = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    String e13 = w2.e("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", e13, null);
                    }
                }
            } else {
                String j12 = k0.j(i11, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", j12, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.j.c(str4)) {
            String e14 = w2.e("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", e14, null);
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
        if (z4 != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.l.b(str);
            str2 = null;
        }
        a9.a aVar5 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        n9.a aVar6 = (n9.a) aVar5.b;
        n9.b bVar3 = aVar6.b;
        bVar3.getClass();
        File file = bVar3.a;
        n9.b.a(new File(file, ".com.google.firebase.crashlytics"));
        n9.b.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            n9.b.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c3 = aVar6.c();
        if (str2 != null) {
            c3.remove(str2);
        }
        if (c3.size() > 8) {
            while (c3.size() > 8) {
                String str10 = (String) c3.last();
                String e15 = w2.e("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", e15, null);
                }
                n9.b.d(new File(bVar3.c, str10));
                c3.remove(str10);
            }
        }
        for (String str11 : c3) {
            String e16 = w2.e("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e16, null);
            }
            l9.a aVar7 = n9.a.g;
            i iVar = n9.a.i;
            File file2 = new File(bVar3.c, str11);
            file2.mkdirs();
            List<File> e17 = n9.b.e(file2.listFiles(iVar));
            if (e17.isEmpty()) {
                String o10 = android.support.v4.media.a.o("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", o10, null);
                }
            } else {
                Collections.sort(e17);
                ArrayList arrayList5 = new ArrayList();
                boolean z11 = false;
                for (File file3 : e17) {
                    try {
                        String e18 = n9.a.e(file3);
                        aVar7.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e18));
                            try {
                                l0 e19 = l9.a.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(e19);
                            } finally {
                            }
                        } catch (IllegalStateException e20) {
                            throw new IOException(e20);
                        }
                    } catch (IOException e21) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e21);
                    }
                    if (!z11) {
                        String name = file3.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z10 = false;
                            z11 = z10;
                        }
                    }
                    z10 = true;
                    z11 = z10;
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String d = new j9.g(bVar3).d(str11);
                    String a12 = aVar6.d.a(str11);
                    File b11 = bVar3.b(str11, "report");
                    try {
                        String e22 = n9.a.e(b11);
                        aVar7.getClass();
                        a0 i18 = l9.a.i(e22);
                        g8 a13 = i18.a();
                        d2 d2Var = i18.j;
                        if (d2Var != null) {
                            g0 a14 = d2Var.a();
                            a14.e = Long.valueOf(currentTimeMillis);
                            a14.f = Boolean.valueOf(z11);
                            if (d != null) {
                                a14.h = new a1(d);
                            }
                            a13.g = a14.a();
                        }
                        a0 a15 = a13.a();
                        g8 a16 = a15.a();
                        a16.e = a12;
                        d2 d2Var2 = a15.j;
                        if (d2Var2 != null) {
                            g0 a17 = d2Var2.a();
                            a17.c = a12;
                            a16.g = a17.a();
                        }
                        a0 a18 = a16.a();
                        d2 d2Var3 = a18.j;
                        if (d2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        g8 a19 = a18.a();
                        g0 a20 = d2Var3.a();
                        a20.k = arrayList5;
                        a19.g = a20.a();
                        a0 a21 = a19.a();
                        d2 d2Var4 = a21.j;
                        if (d2Var4 != null) {
                            String str12 = "appQualitySessionId: " + a12;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e23) {
                                        e = e23;
                                    }
                                }
                                n9.a.f(z11 ? new File(bVar3.e, ((h0) d2Var4).b) : new File(bVar3.d, ((h0) d2Var4).b), l9.a.a.l(a21));
                            } catch (IOException e24) {
                                e = e24;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                n9.b.d(new File(bVar3.c, str11));
                            }
                        }
                        e = e23;
                    } catch (IOException e25) {
                        e = e25;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                n9.b.d(new File(bVar3.c, str11));
            }
            n9.b.d(new File(bVar3.c, str11));
        }
        c5.c cVar = aVar6.c.d().a;
        ArrayList b12 = aVar6.b();
        int size2 = b12.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = b12.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(e3.g gVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        r rVar = this.n;
        if (rVar != null && rVar.e.get()) {
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
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet c3 = ((n9.a) this.m.b).c();
        if (c3.isEmpty()) {
            return null;
        }
        return (String) c3.first();
    }

    public final void g() {
        try {
            String f10 = f();
            if (f10 != null) {
                try {
                    ((cb.m) this.d.e).u("com.crashlytics.version-control-info", f10);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e6);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.o;
        n9.b bVar = ((n9.a) this.m.b).b;
        if (n9.b.e(bVar.d.listFiles()).isEmpty() && n9.b.e(bVar.e.listFiles()).isEmpty() && n9.b.e(bVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        f9.b bVar2 = f9.b.a;
        bVar2.c("Crash reports are available to be sent.");
        s sVar = this.b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar2.b("Automatic data collection is disabled.");
            bVar2.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new ab.a(9));
            bVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = y.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            x xVar = new x(1, taskCompletionSource2);
            onSuccessTask.continueWith(xVar);
            task4.continueWith(xVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new f7.b(this, task, false, 13));
    }
}
