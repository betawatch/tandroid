package aa;

import a8.p0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.d1;
import da.e1;
import da.m0;
import da.m1;
import da.n0;
import da.o0;
import da.o1;
import da.p1;
import da.q0;
import da.q1;
import da.r1;
import da.s0;
import da.s1;
import da.t0;
import da.t2;
import da.u2;
import da.v0;
import da.w0;
import da.z0;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Supplier;
import m.q3;
import sg.i0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q {
    public static final h r = new h(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final x b;
    public final wf.b c;
    public final q3 d;
    public final ba.e e;
    public final b0 f;
    public final ga.d g;
    public final a h;
    public final ca.f i;
    public final x9.a j;
    public final y9.a k;
    public final j l;
    public final f0 m;
    public w n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public q(Context context, b0 b0Var, x xVar, ga.d dVar, wf.b bVar, a aVar, q3 q3Var, ca.f fVar, f0 f0Var, x9.a aVar2, y9.a aVar3, j jVar, ba.e eVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = b0Var;
        this.b = xVar;
        this.g = dVar;
        this.c = bVar;
        this.h = aVar;
        this.d = q3Var;
        this.i = fVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = jVar;
        this.m = f0Var;
        this.e = eVar;
    }

    public static void a(q qVar, String str, ProfilingResult profilingResult) {
        int triggerType = profilingResult.getTriggerType();
        String str2 = triggerType == 8 ? "trigger-type-anomaly" : triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
        try {
            if (qVar.g.b(str, str2).createNewFile()) {
                return;
            }
            String str3 = "Trigger file " + str2 + " exists for session: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        } catch (IOException unused) {
            Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
        }
    }

    public static Task b(q qVar) {
        Task call;
        qVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ga.d.i(((File) qVar.g.d).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new p(qVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [int] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z9, ia.c cVar, boolean z10) {
        ArrayList arrayList;
        int i7;
        int i10;
        boolean z11;
        String str;
        da.d0 a10;
        t2 t2Var;
        String f10;
        boolean z12;
        String[] list;
        Throwable th2;
        List list2;
        String str2;
        String processName;
        int i11;
        List list3;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ba.e.a();
        ArrayList arrayList2 = new ArrayList(this.m.b.d());
        if (arrayList2.size() <= z9) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str3 = (String) arrayList2.get(z9 == true ? 1 : 0);
        if (z10 && cVar.b().b.b) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    ga.d dVar = this.g;
                    ca.f fVar = new ca.f(dVar);
                    fVar.b = ca.f.c;
                    if (str3 != null) {
                        fVar.b = new ca.o(dVar.b(str3, "userlog"));
                    }
                    ga.d dVar2 = this.g;
                    ba.e eVar = this.e;
                    ca.h hVar = new ca.h(dVar2);
                    i7 = 4;
                    q3 q3Var = new q3(str3, dVar2, eVar);
                    i10 = 8;
                    ((ca.e) ((AtomicMarkableReference) ((ab.q) q3Var.d).b).getReference()).d(hVar.c(str3, false));
                    ((ca.e) ((AtomicMarkableReference) ((ab.q) q3Var.e).b).getReference()).d(hVar.c(str3, true));
                    ((AtomicMarkableReference) q3Var.g).set(hVar.d(str3), false);
                    f5.u uVar = (f5.u) q3Var.f;
                    File b10 = dVar2.b(str3, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        ca.h.g(b10, "The file has a length of zero for session: " + str3);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(b10);
                            try {
                                try {
                                    list2 = ca.h.b(g.j(fileInputStream2));
                                    String str4 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str3;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str4, null);
                                    }
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    ca.h.f(b10);
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    synchronized (uVar) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileInputStream = fileInputStream2;
                                g.b(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = null;
                            g.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (uVar) {
                        ((ArrayList) uVar.c).clear();
                        if (list2.size() > uVar.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + uVar.b, null);
                            ((ArrayList) uVar.c).addAll(list2.subList(0, uVar.b));
                        } else {
                            ((ArrayList) uVar.c).addAll(list2);
                        }
                    }
                    f0 f0Var = this.m;
                    ApplicationExitInfo e12 = f0Var.e(str3, historicalProcessExitReasons, new m(1));
                    if (e12 == null) {
                        String i13 = rf.b.i("No relevant ApplicationExitInfo occurred during session: ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", i13, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        v vVar = f0Var.a;
                        try {
                            traceInputStream = e12.getTraceInputStream();
                        } catch (IOException e13) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + e12.toString() + " Error: " + e13, null);
                        }
                        if (traceInputStream != null) {
                            str2 = f0.c(traceInputStream);
                            da.e0 e0Var = new da.e0();
                            e0Var.d = e12.getImportance();
                            e0Var.j = (byte) (e0Var.j | 4);
                            processName = e12.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            e0Var.b = processName;
                            e0Var.c = e12.getReason();
                            e0Var.j = (byte) (e0Var.j | 2);
                            e0Var.g = e12.getTimestamp();
                            e0Var.j = (byte) (e0Var.j | 32);
                            e0Var.a = e12.getPid();
                            e0Var.j = (byte) (e0Var.j | 1);
                            e0Var.e = e12.getPss();
                            e0Var.j = (byte) (e0Var.j | 8);
                            e0Var.f = e12.getRss();
                            e0Var.j = (byte) (e0Var.j | 16);
                            e0Var.h = str2;
                            da.f0 a11 = e0Var.a();
                            int i14 = vVar.a.getResources().getConfiguration().orientation;
                            s0 s0Var = new s0();
                            s0Var.b = "anr";
                            long j3 = a11.g;
                            s0Var.a = j3;
                            s0Var.g = (byte) (s0Var.g | 1);
                            a aVar = vVar.c;
                            if (!vVar.e.b().b.c || aVar.c.size() <= 0) {
                                arrayList = arrayList2;
                                i11 = i14;
                                list3 = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = aVar.c;
                                int size = arrayList4.size();
                                i11 = i14;
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = arrayList4.get(i15);
                                    int i16 = i15 + 1;
                                    int i17 = size;
                                    d dVar3 = (d) obj;
                                    String str5 = dVar3.a;
                                    if (str5 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    String str6 = dVar3.b;
                                    if (str6 == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    String str7 = dVar3.c;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    arrayList3.add(new da.g0(str6, str5, str7));
                                    size = i17;
                                    i15 = i16;
                                    arrayList4 = arrayList5;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                list3 = DesugarCollections.unmodifiableList(arrayList3);
                            }
                            da.e0 e0Var2 = new da.e0();
                            e0Var2.d = a11.d;
                            byte b11 = (byte) (e0Var2.j | 4);
                            e0Var2.j = b11;
                            String str8 = a11.b;
                            if (str8 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            e0Var2.b = str8;
                            e0Var2.c = a11.c;
                            e0Var2.g = j3;
                            e0Var2.a = a11.a;
                            e0Var2.e = a11.e;
                            e0Var2.f = a11.f;
                            e0Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 32)) | 1)) | 8)) | 16);
                            e0Var2.h = a11.h;
                            e0Var2.i = list3;
                            da.f0 a12 = e0Var2.a();
                            Boolean valueOf = Boolean.valueOf(a12.d != 100);
                            String processName2 = a12.b;
                            int i18 = a12.a;
                            int i19 = a12.d;
                            kotlin.jvm.internal.j.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i19 = 0;
                            }
                            d1 d1Var = new d1();
                            d1Var.a = processName2;
                            d1Var.b = i18;
                            byte b12 = (byte) (d1Var.e | 1);
                            d1Var.c = i19;
                            d1Var.d = false;
                            d1Var.e = (byte) (((byte) (b12 | 2)) | 4);
                            e1 a13 = d1Var.a();
                            byte b13 = (byte) 1;
                            z0 e14 = v.e();
                            List a14 = vVar.a();
                            if (a14 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            w0 w0Var = new w0(null, null, a12, null, e14, a14);
                            if (b13 != 1) {
                                StringBuilder sb2 = new StringBuilder();
                                if (b13 == 0) {
                                    sb2.append(" uiOrientation");
                                }
                                throw new IllegalStateException(p0.q("Missing required properties:", sb2));
                            }
                            s0Var.c = new v0(w0Var, null, null, valueOf, a13, null, i11);
                            s0Var.d = vVar.b(i11);
                            t0 a15 = s0Var.a();
                            String i20 = rf.b.i("Persisting anr for session ", str3);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", i20, null);
                            }
                            f0Var.b.e(f0.b(f0.a(a15, fVar, q3Var, Collections.EMPTY_MAP), q3Var), str3, true);
                        }
                        str2 = null;
                        da.e0 e0Var3 = new da.e0();
                        e0Var3.d = e12.getImportance();
                        e0Var3.j = (byte) (e0Var3.j | 4);
                        processName = e12.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i7 = 4;
                    i10 = 8;
                    String i21 = rf.b.i("No ApplicationExitInfo available. Session: ", str3);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", i21, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i7 = 4;
                i10 = 8;
                String j10 = jg.g.j(i12, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", j10, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i7 = 4;
            i10 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z10 && this.j.c(str3)) {
            String i22 = rf.b.i("Finalizing native report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th2 = null;
                Log.v("FirebaseCrashlytics", i22, null);
            } else {
                th2 = null;
            }
            this.j.a(str3).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str3, th2);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, th2);
            Log.w("FirebaseCrashlytics", "No native core present", th2);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            ga.d dVar4 = this.g;
            h hVar2 = new h(2);
            dVar4.getClass();
            File file = new File((File) dVar4.e, str3);
            file.mkdirs();
            Stream stream = Collection.-EL.stream(ga.d.i(file.listFiles(hVar2)));
            int i23 = 0;
            List list4 = (List) stream.map(new l(i23)).filter(new m(i23)).collect(Collectors.toList());
            final List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            final f0 f0Var2 = this.m;
            f0Var2.getClass();
            Collection.-EL.stream(list4).findFirst().or(new Supplier() { // from class: aa.e0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return f0.this.e(str3, historicalProcessExitReasons2, new m(2)) != null ? Optional.of(7) : Optional.empty();
                }
            }).ifPresent(new k(1, f0Var2, str3));
        }
        if (z9 != 0) {
            z11 = false;
            str = (String) arrayList.get(0);
        } else {
            z11 = false;
            this.l.b(null);
            str = null;
        }
        f0 f0Var3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ga.b bVar = f0Var3.b;
        ga.d dVar5 = bVar.b;
        dVar5.a(".com.google.firebase.crashlytics");
        dVar5.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) dVar5.b).isEmpty()) {
            dVar5.a(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) dVar5.c;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: ga.c
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z11; r11 < length; r11++) {
                    dVar5.a(list[r11]);
                }
            }
        }
        NavigableSet<String> d = bVar.d();
        if (str != null) {
            d.remove(str);
        }
        int i24 = i10;
        if (d.size() > i24) {
            while (d.size() > i24) {
                String str10 = (String) d.last();
                String i25 = rf.b.i("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", i25, null);
                }
                ga.d.h(new File((File) dVar5.e, str10));
                d.remove(str10);
            }
        }
        for (String str11 : d) {
            String i26 = rf.b.i("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i26, null);
            }
            ea.a aVar2 = ga.b.g;
            h hVar3 = ga.b.i;
            File file3 = new File((File) dVar5.e, str11);
            file3.mkdirs();
            List<File> i27 = ga.d.i(file3.listFiles(hVar3));
            if (i27.isEmpty()) {
                String p10 = p0.p("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", p10, null);
                }
            } else {
                Collections.sort(i27);
                ArrayList arrayList6 = new ArrayList();
                boolean z13 = z11;
                for (File file4 : i27) {
                    try {
                        f10 = ga.b.f(file4);
                        aVar2.getClass();
                    } catch (IOException e15) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e15);
                    }
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(f10));
                        try {
                            t0 e16 = ea.a.e(jsonReader);
                            jsonReader.close();
                            arrayList6.add(bVar.a(str11, e16));
                            if (!z13) {
                                String name = file4.getName();
                                if (!name.startsWith("event") || !name.endsWith("_")) {
                                    z12 = false;
                                    z13 = z12;
                                }
                            }
                            z12 = true;
                            z13 = z12;
                        } finally {
                        }
                    } catch (IllegalStateException e17) {
                        throw new IOException(e17);
                    }
                }
                if (arrayList6.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String d2 = new ca.h(dVar5).d(str11);
                    String a16 = bVar.d.a(str11);
                    File b14 = dVar5.b(str11, "report");
                    try {
                        String f11 = ga.b.f(b14);
                        aVar2.getClass();
                        da.d0 j11 = ea.a.j(f11);
                        da.c0 a17 = j11.a();
                        t2 t2Var2 = j11.k;
                        if (t2Var2 != null) {
                            try {
                                m0 a18 = t2Var2.a();
                                a18.e = Long.valueOf(currentTimeMillis);
                                a18.f = z13;
                                try {
                                    a18.m = (byte) (a18.m | 2);
                                    if (d2 != null) {
                                        a18.h = new o1(d2);
                                    }
                                    a17.j = a18.a();
                                } catch (IOException e18) {
                                    e = e18;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                                    ga.d.h(new File((File) dVar5.e, str11));
                                    z11 = false;
                                }
                            } catch (IOException e19) {
                                e = e19;
                            }
                        }
                        da.d0 a19 = a17.a();
                        da.c0 a20 = a19.a();
                        a20.g = a16;
                        t2 t2Var3 = a19.k;
                        if (t2Var3 != null) {
                            m0 a21 = t2Var3.a();
                            a21.c = a16;
                            a20.j = a21.a();
                        }
                        a10 = a20.a();
                        t2Var = a10.k;
                    } catch (IOException e20) {
                        e = e20;
                    }
                    if (t2Var == null) {
                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                    }
                    da.c0 a22 = a10.a();
                    m0 a23 = t2Var.a();
                    a23.k = arrayList6;
                    a22.j = a23.a();
                    da.d0 a24 = a22.a();
                    t2 t2Var4 = a24.k;
                    if (t2Var4 != null) {
                        String str12 = "appQualitySessionId: " + a16;
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                try {
                                    Log.d("FirebaseCrashlytics", str12, null);
                                } catch (IOException e21) {
                                    e = e21;
                                }
                            }
                            ga.b.g(z13 ? new File((File) dVar5.h, ((n0) t2Var4).b) : new File((File) dVar5.f, ((n0) t2Var4).b), ea.a.a.u(a24));
                        } catch (IOException e22) {
                            e = e22;
                        }
                    }
                    ga.d.h(new File((File) dVar5.e, str11));
                    z11 = false;
                    e = e21;
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                    ga.d.h(new File((File) dVar5.e, str11));
                    z11 = false;
                }
            }
            ga.d.h(new File((File) dVar5.e, str11));
            z11 = false;
        }
        b7.l lVar = bVar.c.b().a;
        ArrayList c10 = bVar.c();
        int size2 = c10.size();
        int i28 = i7;
        if (size2 <= i28) {
            return;
        }
        Iterator it = c10.subList(i28, size2).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final void d(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i7;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i10 = rf.b.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i10, null);
        }
        Locale locale = Locale.US;
        b0 b0Var = this.f;
        a aVar = this.h;
        q1 q1Var = new q1(b0Var.c, aVar.f, aVar.g, b0Var.c().a, p0.d(aVar.d != null ? 4 : 1), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        s1 s1Var = new s1(g.h());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            f fVar2 = (f) f.b.get(str8.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = fVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(context);
        boolean g10 = g.g();
        int d = g.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new p1(q1Var, s1Var, new r1(ordinal, availableProcessors, d, a10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i7 = 4;
        } else {
            q3 q3Var = this.d;
            synchronized (((String) q3Var.c)) {
                q3Var.c = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i7 = 4;
                ((ba.e) q3Var.b).b.a(new ai.d0(q3Var, str, ((ca.e) ((AtomicMarkableReference) ((ab.q) q3Var.d).b).getReference()).a(), ((f5.u) q3Var.f).o(), 10));
            }
        }
        ca.f fVar3 = this.i;
        ((ca.d) fVar3.b).b();
        fVar3.b = ca.f.c;
        if (str != null) {
            fVar3.b = new ca.o(((ga.d) fVar3.a).b(str, "userlog"));
        }
        this.l.b(str);
        f0 f0Var = this.m;
        v vVar = f0Var.a;
        Charset charset = u2.a;
        da.c0 c0Var = new da.c0();
        c0Var.a = "20.1.1";
        a aVar2 = vVar.c;
        String str12 = aVar2.a;
        if (str12 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c0Var.b = str12;
        b0 b0Var2 = vVar.b;
        String str13 = b0Var2.c().a;
        if (str13 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c0Var.d = str13;
        c0Var.e = b0Var2.c().b;
        c0Var.f = b0Var2.c().c;
        String str14 = aVar2.f;
        if (str14 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0Var.h = str14;
        String str15 = aVar2.g;
        if (str15 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c0Var.i = str15;
        c0Var.c = i7;
        c0Var.m = (byte) (c0Var.m | 1);
        m0 m0Var = new m0();
        m0Var.f = false;
        byte b10 = (byte) (m0Var.m | 2);
        m0Var.d = currentTimeMillis;
        m0Var.m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        m0Var.b = str;
        String str16 = v.g;
        if (str16 == null) {
            throw new NullPointerException("Null generator");
        }
        m0Var.a = str16;
        String str17 = b0Var2.c;
        if (str17 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str18 = b0Var2.c().a;
        i0 i0Var = aVar2.h;
        if (((f5.a) i0Var.c) == null) {
            i0Var.c = new f5.a(i0Var);
        }
        f5.a aVar3 = (f5.a) i0Var.c;
        String str19 = aVar3.a;
        if (aVar3 == null) {
            i0Var.c = new f5.a(i0Var);
        }
        m0Var.g = new o0(str17, str14, str15, str18, str19, ((f5.a) i0Var.c).b);
        m1 m1Var = new m1();
        m1Var.a = 3;
        m1Var.e = (byte) (m1Var.e | 1);
        if (str6 == null) {
            throw new NullPointerException("Null version");
        }
        m1Var.b = str6;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        m1Var.c = str2;
        m1Var.d = g.h();
        m1Var.e = (byte) (m1Var.e | 2);
        m0Var.i = m1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i11 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) v.f.get(str8.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a11 = g.a(vVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g11 = g.g();
        int d2 = g.d();
        q0 q0Var = new q0();
        q0Var.a = i11;
        byte b11 = (byte) (q0Var.j | 1);
        q0Var.j = b11;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        q0Var.b = str5;
        q0Var.c = availableProcessors2;
        q0Var.d = a11;
        q0Var.e = blockCount2;
        q0Var.f = g11;
        q0Var.g = d2;
        q0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        q0Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        q0Var.i = str21;
        m0Var.j = q0Var.a();
        m0Var.l = 3;
        m0Var.m = (byte) (m0Var.m | 4);
        c0Var.j = m0Var.a();
        da.d0 a12 = c0Var.a();
        ga.d dVar = f0Var.b.b;
        t2 t2Var = a12.k;
        if (t2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((n0) t2Var).b;
        try {
            ga.b.g.getClass();
            ga.b.g(dVar.b(str22, "report"), ea.a.a.u(a12));
            File b12 = dVar.b(str22, "start-time");
            long j3 = ((n0) t2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ga.b.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j3 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String i12 = rf.b.i("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", i12, e10);
            }
        }
    }

    public final void e(String str) {
        ExecutorService executorService = this.e.b.a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i7 = 0; i7 < 2; i7++) {
            Object obj = objArr[i7];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new k(0, this, str));
    }

    public final boolean f(ia.c cVar) {
        ba.e.a();
        w wVar = this.n;
        if (wVar != null && wVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, cVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String g() {
        NavigableSet d = this.m.b.d();
        if (d.isEmpty()) {
            return null;
        }
        return (String) d.first();
    }

    public final String h() {
        InputStream resourceAsStream;
        Context context = this.a;
        int e10 = g.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e10 == 0 ? null : context.getResources().getString(e10);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = q.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i() {
        try {
            String h = h();
            if (h != null) {
                try {
                    ((ab.q) this.d.e).z("com.crashlytics.version-control-info", h);
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

    public final void j(Task task) {
        Task task2;
        Task a10;
        TaskCompletionSource taskCompletionSource = this.o;
        ga.d dVar = this.m.b.b;
        if (ga.d.i(((File) dVar.f).listFiles()).isEmpty() && ga.d.i(((File) dVar.h).listFiles()).isEmpty() && ga.d.i(((File) dVar.n).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        x9.b bVar = x9.b.a;
        bVar.c("Crash reports are available to be sent.");
        x xVar = this.b;
        if (xVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a10 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (xVar.c) {
                task2 = xVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new sa.d(1));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            a10 = ba.a.a(onSuccessTask, this.p.getTask());
        }
        a10.onSuccessTask(this.e.a, new q4.q(3, this, task));
    }
}
