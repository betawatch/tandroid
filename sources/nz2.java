// default package

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
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nz2 {
    public static final iz2 r = new iz2((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final i73 b;
    public final lx6 c;
    public final jd4 d;
    public final mx6 e;
    public final vl5 f;
    public final jd4 g;
    public final ds h;
    public final hi2 i;
    public final qz2 j;
    public final rk k;
    public final jz2 l;
    public final p8a m;
    public z03 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public nz2(Context context, vl5 vl5Var, i73 i73Var, jd4 jd4Var, lx6 lx6Var, ds dsVar, jd4 jd4Var2, hi2 hi2Var, p8a p8aVar, qz2 qz2Var, rk rkVar, jz2 jz2Var, mx6 mx6Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = vl5Var;
        this.b = i73Var;
        this.g = jd4Var;
        this.c = lx6Var;
        this.h = dsVar;
        this.d = jd4Var2;
        this.i = hi2Var;
        this.j = qz2Var;
        this.k = rkVar;
        this.l = jz2Var;
        this.m = p8aVar;
        this.e = mx6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [int] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, ex8 ex8Var, boolean z2) {
        ArrayList arrayList;
        int i;
        byte b;
        boolean z3;
        String str;
        boolean z4;
        String[] list;
        List list2;
        String str2;
        String processName;
        int i2;
        List list3;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        mx6.w();
        ArrayList arrayList2 = new ArrayList(this.m.b.d());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str3 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && ex8Var.c().b.b) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    jd4 jd4Var = this.g;
                    hi2 hi2Var = new hi2(jd4Var);
                    hi2Var.c = hi2.f;
                    if (str3 != null) {
                        hi2Var.c = new ez8(jd4Var.b(str3, "userlog"));
                    }
                    jd4 jd4Var2 = this.g;
                    mx6 mx6Var = this.e;
                    jf7 jf7Var = new jf7(jd4Var2);
                    i = 8;
                    jd4 jd4Var3 = new jd4(str3, jd4Var2, mx6Var);
                    b = 4;
                    ((qx5) ((AtomicMarkableReference) ((yh4) jd4Var3.d).b).getReference()).d(jf7Var.c(str3, false));
                    ((qx5) ((AtomicMarkableReference) ((yh4) jd4Var3.e).b).getReference()).d(jf7Var.c(str3, true));
                    ((AtomicMarkableReference) jd4Var3.g).set(jf7Var.d(str3), false);
                    xv6 xv6Var = (xv6) jd4Var3.f;
                    File b2 = jd4Var2.b(str3, "rollouts-state");
                    if (!b2.exists() || b2.length() == 0) {
                        jf7.g(b2, "The file has a length of zero for session: " + str3);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(b2);
                            try {
                                try {
                                    list2 = jf7.b(bo2.l(fileInputStream2));
                                    String str4 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str3;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str4, null);
                                    }
                                    bo2.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    jf7.f(b2);
                                    bo2.b(fileInputStream2, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    synchronized (xv6Var) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                bo2.b(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            bo2.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (xv6Var) {
                        xv6Var.a.clear();
                        if (list2.size() > 128) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: 128", null);
                            xv6Var.a.addAll(list2.subList(0, 128));
                        } else {
                            xv6Var.a.addAll(list2);
                        }
                    }
                    p8a p8aVar = this.m;
                    ApplicationExitInfo e3 = p8aVar.e(str3, historicalProcessExitReasons, new se((byte) 6));
                    if (e3 == null) {
                        String h = b10.h("No relevant ApplicationExitInfo occurred during session: ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", h, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        t03 t03Var = p8aVar.a;
                        try {
                            traceInputStream = e3.getTraceInputStream();
                        } catch (IOException e4) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + e3.toString() + " Error: " + e4, null);
                        }
                        if (traceInputStream != null) {
                            str2 = p8a.c(traceInputStream);
                            c90 c90Var = new c90();
                            c90Var.d = e3.getImportance();
                            c90Var.j = (byte) (c90Var.j | 4);
                            processName = e3.getProcessName();
                            if (processName != null) {
                                gxc.d("Null processName");
                                return;
                            }
                            c90Var.b = processName;
                            c90Var.c = e3.getReason();
                            c90Var.j = (byte) (c90Var.j | 2);
                            c90Var.g = e3.getTimestamp();
                            c90Var.j = (byte) (c90Var.j | 32);
                            c90Var.a = e3.getPid();
                            c90Var.j = (byte) (c90Var.j | 1);
                            c90Var.e = e3.getPss();
                            c90Var.j = (byte) (c90Var.j | 8);
                            c90Var.f = e3.getRss();
                            c90Var.j = (byte) (c90Var.j | 16);
                            c90Var.h = str2;
                            d90 a = c90Var.a();
                            int i4 = t03Var.a.getResources().getConfiguration().orientation;
                            q90 q90Var = new q90();
                            q90Var.b = "anr";
                            long j = a.g;
                            q90Var.a = j;
                            q90Var.g = (byte) (q90Var.g | 1);
                            ds dsVar = t03Var.c;
                            if (!t03Var.e.c().b.c || dsVar.c.size() <= 0) {
                                arrayList = arrayList2;
                                i2 = i4;
                                list3 = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = dsVar.c;
                                int size = arrayList4.size();
                                i2 = i4;
                                int i5 = 0;
                                while (i5 < size) {
                                    Object obj = arrayList4.get(i5);
                                    int i6 = i5 + 1;
                                    int i7 = size;
                                    c21 c21Var = (c21) obj;
                                    String str5 = c21Var.a;
                                    if (str5 == null) {
                                        gxc.d("Null libraryName");
                                        return;
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    String str6 = c21Var.b;
                                    if (str6 == null) {
                                        gxc.d("Null arch");
                                        return;
                                    }
                                    String str7 = c21Var.c;
                                    if (str7 == null) {
                                        gxc.d("Null buildId");
                                        return;
                                    }
                                    arrayList3.add(new e90(str6, str5, str7));
                                    size = i7;
                                    i5 = i6;
                                    arrayList4 = arrayList5;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                list3 = DesugarCollections.unmodifiableList(arrayList3);
                            }
                            c90 c90Var2 = new c90();
                            c90Var2.d = a.d;
                            byte b3 = (byte) (c90Var2.j | 4);
                            c90Var2.j = b3;
                            String str8 = a.b;
                            if (str8 == null) {
                                gxc.d("Null processName");
                                return;
                            }
                            c90Var2.b = str8;
                            c90Var2.c = a.c;
                            c90Var2.g = j;
                            c90Var2.a = a.a;
                            c90Var2.e = a.e;
                            c90Var2.f = a.f;
                            c90Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b3 | 2)) | 32)) | 1)) | 8)) | 16);
                            c90Var2.h = a.h;
                            c90Var2.i = list3;
                            d90 a2 = c90Var2.a();
                            int i8 = a2.d;
                            Boolean valueOf = Boolean.valueOf(i8 != 100);
                            String str9 = a2.b;
                            int i9 = a2.a;
                            str9.getClass();
                            xd5 xd5Var = new xd5();
                            xd5Var.e = str9;
                            xd5Var.a = i9;
                            byte b4 = (byte) (xd5Var.d | 1);
                            xd5Var.b = i8;
                            xd5Var.c = false;
                            xd5Var.d = (byte) (((byte) (b4 | 2)) | 4);
                            ba0 a3 = xd5Var.a();
                            x90 e5 = t03.e();
                            List a4 = t03Var.a();
                            if (a4 == null) {
                                gxc.d("Null binaries");
                                return;
                            }
                            q90Var.c = new t90(new u90(null, null, a2, null, e5, a4), null, null, valueOf, a3, null, i2);
                            q90Var.d = t03Var.b(i2);
                            r90 a5 = q90Var.a();
                            String h2 = b10.h("Persisting anr for session ", str3);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", h2, null);
                            }
                            p8aVar.b.e(p8a.b(p8a.a(a5, hi2Var, jd4Var3, Collections.EMPTY_MAP), jd4Var3), str3, true);
                        }
                        str2 = null;
                        c90 c90Var3 = new c90();
                        c90Var3.d = e3.getImportance();
                        c90Var3.j = (byte) (c90Var3.j | 4);
                        processName = e3.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i = 8;
                    b = 4;
                    String h3 = b10.h("No ApplicationExitInfo available. Session: ", str3);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", h3, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 8;
                b = 4;
                String j2 = hg9.j(i3, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", j2, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i = 8;
            b = 4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && this.j.c()) {
            String h4 = b10.h("Finalizing native report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", h4, null);
            }
            this.j.a().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str3, null);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, null);
            Log.w("FirebaseCrashlytics", "No native core present", null);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            jd4 jd4Var4 = this.g;
            iz2 iz2Var = new iz2((byte) 2);
            File file = new File((File) jd4Var4.d, str3);
            file.mkdirs();
            List list4 = (List) Collection.-EL.stream(jd4.e(file.listFiles(iz2Var))).map(new x00(b)).filter(new se((byte) 3)).collect(Collectors.toList());
            final List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            final p8a p8aVar2 = this.m;
            Collection.-EL.stream(list4).findFirst().or(new Supplier() { // from class: o8a
                @Override // java.util.function.Supplier
                public final Object get() {
                    return p8a.this.e(str3, historicalProcessExitReasons2, new se((byte) 7)) != null ? Optional.of(7) : Optional.empty();
                }
            }).ifPresent(new kz2(p8aVar2, str3, (byte) 3));
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.l.b(null);
            str = null;
        }
        p8a p8aVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        y03 y03Var = p8aVar3.b;
        jd4 jd4Var5 = y03Var.b;
        jd4Var5.a(".com.google.firebase.crashlytics");
        jd4Var5.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) jd4Var5.a).isEmpty()) {
            jd4Var5.a(".com.google.firebase.crashlytics.files.v1");
            final String str10 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) jd4Var5.b;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: id4
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str11) {
                    return str11.startsWith(str10);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z3; r10 < length; r10++) {
                    jd4Var5.a(list[r10]);
                }
            }
        }
        NavigableSet<String> d = y03Var.d();
        if (str != null) {
            d.remove(str);
        }
        int i10 = i;
        if (d.size() > i10) {
            while (d.size() > i10) {
                String str11 = (String) d.last();
                String h5 = b10.h("Removing session over cap: ", str11);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", h5, null);
                }
                jd4.d(new File((File) jd4Var5.d, str11));
                d.remove(str11);
            }
        }
        for (String str12 : d) {
            String h6 = b10.h("Finalizing report for session ", str12);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", h6, null);
            }
            w03 w03Var = y03.g;
            iz2 iz2Var2 = y03.i;
            File file3 = new File((File) jd4Var5.d, str12);
            file3.mkdirs();
            List<File> e6 = jd4.e(file3.listFiles(iz2Var2));
            if (e6.isEmpty()) {
                String o = kt6.o("Session ", str12, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", o, null);
                }
            } else {
                Collections.sort(e6);
                ArrayList arrayList6 = new ArrayList();
                boolean z5 = z3;
                for (File file4 : e6) {
                    try {
                        String f = y03.f(file4);
                        w03Var.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(f));
                            try {
                                r90 d2 = w03.d(jsonReader);
                                jsonReader.close();
                                arrayList6.add(y03Var.a(str12, d2));
                            } finally {
                            }
                        } catch (IllegalStateException e7) {
                            throw new IOException(e7);
                        }
                    } catch (IOException e8) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e8);
                    }
                    if (!z5) {
                        String name = file4.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z4 = z3;
                            z5 = z4;
                        }
                    }
                    z4 = true;
                    z5 = z4;
                }
                if (arrayList6.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str12, null);
                } else {
                    String d3 = new jf7(jd4Var5).d(str12);
                    String a6 = y03Var.d.a(str12);
                    File b5 = jd4Var5.b(str12, "report");
                    try {
                        String f2 = y03.f(b5);
                        w03Var.getClass();
                        a90 j3 = w03.j(f2);
                        z80 a7 = j3.a();
                        l90 l90Var = j3.k;
                        if (l90Var != null) {
                            k90 a8 = l90Var.a();
                            a8.e = Long.valueOf(currentTimeMillis);
                            a8.f = z5;
                            a8.m = (byte) (a8.m | 2);
                            if (d3 != null) {
                                a8.h = new la0(d3);
                            }
                            a7.j = a8.a();
                        }
                        a90 a9 = a7.a();
                        z80 a10 = a9.a();
                        a10.g = a6;
                        l90 l90Var2 = a9.k;
                        if (l90Var2 != null) {
                            k90 a11 = l90Var2.a();
                            a11.c = a6;
                            a10.j = a11.a();
                        }
                        a90 a12 = a10.a();
                        l90 l90Var3 = a12.k;
                        if (l90Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        z80 a13 = a12.a();
                        k90 a14 = l90Var3.a();
                        a14.k = arrayList6;
                        a13.j = a14.a();
                        a90 a15 = a13.a();
                        l90 l90Var4 = a15.k;
                        if (l90Var4 != null) {
                            String str13 = "appQualitySessionId: " + a6;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str13, null);
                            }
                            y03.g(z5 ? new File((File) jd4Var5.f, l90Var4.b) : new File((File) jd4Var5.e, l90Var4.b), w03.a.s(a15));
                        }
                    } catch (IOException e9) {
                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b5, e9);
                    }
                }
            }
            jd4.d(new File((File) jd4Var5.d, str12));
            z3 = false;
        }
        g40 g40Var = y03Var.c.c().a;
        ArrayList c = y03Var.c();
        int size2 = c.size();
        if (size2 > 4) {
            Iterator it = c.subList(4, size2).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }

    public final void b(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String h = b10.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        vl5 vl5Var = this.f;
        ds dsVar = this.h;
        nb0 nb0Var = new nb0(vl5Var.c, dsVar.f, dsVar.g, vl5Var.c().a, ts2.h(dsVar.d != null ? 4 : 1), dsVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        pb0 pb0Var = new pb0(bo2.i());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        zn2 zn2Var = zn2.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            zn2 zn2Var2 = (zn2) zn2.b.get(str8.toLowerCase(locale));
            if (zn2Var2 != null) {
                zn2Var = zn2Var2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = zn2Var.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = bo2.a(context);
        boolean h2 = bo2.h();
        int d = bo2.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new mb0(nb0Var, pb0Var, new ob0(ordinal, availableProcessors, d, a, blockCount, h2)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            jd4 jd4Var = this.d;
            synchronized (((String) jd4Var.a)) {
                jd4Var.a = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i = 4;
                ((a13) ((mx6) jd4Var.c).c).a(new hza((Object) jd4Var, str, (Object) ((qx5) ((AtomicMarkableReference) ((yh4) jd4Var.d).b).getReference()).a(), (Object) ((xv6) jd4Var.f).i(), (byte) 20));
            }
        }
        hi2 hi2Var = this.i;
        ((gc4) hi2Var.c).a();
        hi2Var.c = hi2.f;
        if (str != null) {
            hi2Var.c = new ez8(((jd4) hi2Var.b).b(str, "userlog"));
        }
        this.l.b(str);
        p8a p8aVar = this.m;
        t03 t03Var = p8aVar.a;
        Charset charset = s03.a;
        z80 z80Var = new z80();
        z80Var.a = "20.1.1";
        ds dsVar2 = t03Var.c;
        String str12 = dsVar2.a;
        if (str12 == null) {
            gxc.d("Null gmpAppId");
            return;
        }
        z80Var.b = str12;
        vl5 vl5Var2 = t03Var.b;
        String str13 = vl5Var2.c().a;
        if (str13 == null) {
            gxc.d("Null installationUuid");
            return;
        }
        z80Var.d = str13;
        z80Var.e = vl5Var2.c().b;
        z80Var.f = vl5Var2.c().c;
        String str14 = dsVar2.f;
        if (str14 == null) {
            gxc.d("Null buildVersion");
            return;
        }
        z80Var.h = str14;
        String str15 = dsVar2.g;
        if (str15 == null) {
            gxc.d("Null displayVersion");
            return;
        }
        z80Var.i = str15;
        z80Var.c = i;
        z80Var.m = (byte) (z80Var.m | 1);
        k90 k90Var = new k90();
        k90Var.f = false;
        byte b = (byte) (k90Var.m | 2);
        k90Var.d = currentTimeMillis;
        k90Var.m = (byte) (b | 1);
        if (str == null) {
            gxc.d("Null identifier");
            return;
        }
        k90Var.b = str;
        String str16 = t03.g;
        if (str16 == null) {
            gxc.d("Null generator");
            return;
        }
        k90Var.a = str16;
        String str17 = vl5Var2.c;
        if (str17 == null) {
            gxc.d("Null identifier");
            return;
        }
        hi2 hi2Var2 = dsVar2.h;
        String str18 = vl5Var2.c().a;
        i5 i5Var = (i5) hi2Var2.c;
        if (i5Var == null) {
            i5Var = new i5(hi2Var2);
            hi2Var2.c = i5Var;
        }
        i5 i5Var2 = i5Var;
        String str19 = i5Var.a;
        if (i5Var2 == null) {
            i5Var2 = new i5(hi2Var2);
            hi2Var2.c = i5Var2;
        }
        k90Var.g = new m90(str17, str14, str15, str18, str19, i5Var2.b);
        ja0 ja0Var = new ja0();
        ja0Var.a = 3;
        ja0Var.e = (byte) (ja0Var.e | 1);
        if (str6 == null) {
            gxc.d("Null version");
            return;
        }
        ja0Var.b = str6;
        if (str2 == null) {
            gxc.d("Null buildVersion");
            return;
        }
        ja0Var.c = str2;
        ja0Var.d = bo2.i();
        ja0Var.e = (byte) (ja0Var.e | 2);
        k90Var.i = ja0Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) t03.f.get(str8.toLowerCase(locale))) != null) {
            i2 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a2 = bo2.a(t03Var.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean h3 = bo2.h();
        int d2 = bo2.d();
        o90 o90Var = new o90();
        o90Var.a = i2;
        byte b2 = (byte) (o90Var.j | 1);
        o90Var.j = b2;
        if (str5 == null) {
            gxc.d("Null model");
            return;
        }
        o90Var.b = str5;
        o90Var.c = availableProcessors2;
        o90Var.d = a2;
        o90Var.e = blockCount2;
        o90Var.f = h3;
        o90Var.g = d2;
        o90Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            gxc.d("Null manufacturer");
            return;
        }
        o90Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            gxc.d("Null modelClass");
            return;
        }
        o90Var.i = str21;
        k90Var.j = o90Var.a();
        k90Var.l = 3;
        k90Var.m = (byte) (k90Var.m | 4);
        z80Var.j = k90Var.a();
        a90 a3 = z80Var.a();
        jd4 jd4Var2 = p8aVar.b.b;
        l90 l90Var = a3.k;
        if (l90Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = l90Var.b;
        try {
            y03.g.getClass();
            y03.g(jd4Var2.b(str22, "report"), w03.a.s(a3));
            File b3 = jd4Var2.b(str22, "start-time");
            long j = l90Var.d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b3), y03.e);
            try {
                outputStreamWriter.write("");
                b3.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String h4 = b10.h("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", h4, e);
            }
        }
    }

    public final void c(String str) {
        ExecutorService executorService = ((a13) this.e.c).a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        byte b = 0;
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new kz2(this, str, b));
    }

    public final boolean d(ex8 ex8Var) {
        mx6.w();
        z03 z03Var = this.n;
        boolean z = z03Var != null && z03Var.e.get();
        f8e f8eVar = f8e.b;
        if (z) {
            f8eVar.l("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        f8eVar.k("Finalizing previously open sessions.");
        try {
            a(true, ex8Var, true);
            f8eVar.k("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet d = this.m.b.d();
        if (d.isEmpty()) {
            return null;
        }
        return (String) d.first();
    }

    public final String f() {
        InputStream resourceAsStream;
        Context context = this.a;
        int e = bo2.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e == 0 ? null : context.getResources().getString(e);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = nz2.class.getClassLoader();
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
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(String str, ProfilingResult profilingResult) {
        int triggerType = profilingResult.getTriggerType();
        String str2 = triggerType == 8 ? "trigger-type-anomaly" : triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
        try {
            if (this.g.b(str, str2).createNewFile()) {
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

    public final Task h() {
        Task call;
        ArrayList arrayList = new ArrayList();
        for (File file : jd4.e(((File) this.g.c).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new mz2(this, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void i() {
        try {
            String f = f();
            if (f != null) {
                try {
                    ((yh4) this.d.e).H("com.crashlytics.version-control-info", f);
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
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task c;
        TaskCompletionSource taskCompletionSource = this.o;
        jd4 jd4Var = this.m.b.b;
        if (jd4.e(((File) jd4Var.e).listFiles()).isEmpty() && jd4.e(((File) jd4Var.f).listFiles()).isEmpty() && jd4.e(((File) jd4Var.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        f8e f8eVar = f8e.b;
        f8eVar.k("Crash reports are available to be sent.");
        i73 i73Var = this.b;
        if (i73Var.a()) {
            f8eVar.f("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            c = Tasks.forResult(Boolean.TRUE);
        } else {
            f8eVar.f("Automatic data collection is disabled.");
            f8eVar.k("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (i73Var.c) {
                task2 = i73Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new kg7((byte) 16));
            f8eVar.f("Waiting for send/deleteUnsentReports to be called.");
            c = rr5.c(onSuccessTask, this.p.getTask());
        }
        c.onSuccessTask((a13) this.e.b, new hi2(this, task, false, (byte) 18));
    }
}
