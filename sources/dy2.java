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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dy2 {
    public static final yx2 r = new yx2((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final w53 b;
    public final tg2 c;
    public final jb4 d;
    public final mv6 e;
    public final wj5 f;
    public final jb4 g;
    public final dr h;
    public final tg2 i;
    public final fy2 j;
    public final rj k;
    public final zx2 l;
    public final n6a m;
    public oz2 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public dy2(Context context, wj5 wj5Var, w53 w53Var, jb4 jb4Var, tg2 tg2Var, dr drVar, jb4 jb4Var2, tg2 tg2Var2, n6a n6aVar, fy2 fy2Var, rj rjVar, zx2 zx2Var, mv6 mv6Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = wj5Var;
        this.b = w53Var;
        this.g = jb4Var;
        this.c = tg2Var;
        this.h = drVar;
        this.d = jb4Var2;
        this.i = tg2Var2;
        this.j = fy2Var;
        this.k = rjVar;
        this.l = zx2Var;
        this.m = n6aVar;
        this.e = mv6Var;
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
    public final void a(boolean z, dv8 dv8Var, boolean z2) {
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
        mv6.s();
        ArrayList arrayList2 = new ArrayList(this.m.b.d());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str3 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && dv8Var.c().b.b) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    jb4 jb4Var = this.g;
                    tg2 tg2Var = new tg2(jb4Var);
                    tg2Var.c = tg2.f;
                    if (str3 != null) {
                        tg2Var.c = new dx8(jb4Var.b(str3, "userlog"));
                    }
                    jb4 jb4Var2 = this.g;
                    mv6 mv6Var = this.e;
                    hd7 hd7Var = new hd7(jb4Var2);
                    i = 8;
                    jb4 jb4Var3 = new jb4(str3, jb4Var2, mv6Var);
                    b = 4;
                    ((qv5) ((AtomicMarkableReference) ((xf4) jb4Var3.d).b).getReference()).d(hd7Var.c(str3, false));
                    ((qv5) ((AtomicMarkableReference) ((xf4) jb4Var3.e).b).getReference()).d(hd7Var.c(str3, true));
                    ((AtomicMarkableReference) jb4Var3.g).set(hd7Var.d(str3), false);
                    yg2 yg2Var = (yg2) jb4Var3.f;
                    File b2 = jb4Var2.b(str3, "rollouts-state");
                    if (!b2.exists() || b2.length() == 0) {
                        hd7.g(b2, "The file has a length of zero for session: " + str3);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(b2);
                            try {
                                try {
                                    list2 = hd7.b(pm2.l(fileInputStream2));
                                    String str4 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str3;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str4, null);
                                    }
                                    pm2.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    hd7.f(b2);
                                    pm2.b(fileInputStream2, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    synchronized (yg2Var) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                pm2.b(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            pm2.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (yg2Var) {
                        yg2Var.b.clear();
                        if (list2.size() > 128) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: 128", null);
                            yg2Var.b.addAll(list2.subList(0, 128));
                        } else {
                            yg2Var.b.addAll(list2);
                        }
                    }
                    n6a n6aVar = this.m;
                    ApplicationExitInfo e3 = n6aVar.e(str3, historicalProcessExitReasons, new sd((byte) 6));
                    if (e3 == null) {
                        String h = b00.h("No relevant ApplicationExitInfo occurred during session: ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", h, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        iz2 iz2Var = n6aVar.a;
                        try {
                            traceInputStream = e3.getTraceInputStream();
                        } catch (IOException e4) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + e3.toString() + " Error: " + e4, null);
                        }
                        if (traceInputStream != null) {
                            str2 = n6a.c(traceInputStream);
                            c80 c80Var = new c80();
                            c80Var.d = e3.getImportance();
                            c80Var.j = (byte) (c80Var.j | 4);
                            processName = e3.getProcessName();
                            if (processName != null) {
                                fvc.f("Null processName");
                                return;
                            }
                            c80Var.b = processName;
                            c80Var.c = e3.getReason();
                            c80Var.j = (byte) (c80Var.j | 2);
                            c80Var.g = e3.getTimestamp();
                            c80Var.j = (byte) (c80Var.j | 32);
                            c80Var.a = e3.getPid();
                            c80Var.j = (byte) (c80Var.j | 1);
                            c80Var.e = e3.getPss();
                            c80Var.j = (byte) (c80Var.j | 8);
                            c80Var.f = e3.getRss();
                            c80Var.j = (byte) (c80Var.j | 16);
                            c80Var.h = str2;
                            d80 a = c80Var.a();
                            int i4 = iz2Var.a.getResources().getConfiguration().orientation;
                            q80 q80Var = new q80();
                            q80Var.b = "anr";
                            long j = a.g;
                            q80Var.a = j;
                            q80Var.g = (byte) (q80Var.g | 1);
                            dr drVar = iz2Var.c;
                            if (!iz2Var.e.c().b.c || drVar.c.size() <= 0) {
                                arrayList = arrayList2;
                                i2 = i4;
                                list3 = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = drVar.c;
                                int size = arrayList4.size();
                                i2 = i4;
                                int i5 = 0;
                                while (i5 < size) {
                                    Object obj = arrayList4.get(i5);
                                    int i6 = i5 + 1;
                                    int i7 = size;
                                    u01 u01Var = (u01) obj;
                                    String str5 = u01Var.a;
                                    if (str5 == null) {
                                        fvc.f("Null libraryName");
                                        return;
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    String str6 = u01Var.b;
                                    if (str6 == null) {
                                        fvc.f("Null arch");
                                        return;
                                    }
                                    String str7 = u01Var.c;
                                    if (str7 == null) {
                                        fvc.f("Null buildId");
                                        return;
                                    }
                                    arrayList3.add(new e80(str6, str5, str7));
                                    size = i7;
                                    i5 = i6;
                                    arrayList4 = arrayList5;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                list3 = DesugarCollections.unmodifiableList(arrayList3);
                            }
                            c80 c80Var2 = new c80();
                            c80Var2.d = a.d;
                            byte b3 = (byte) (c80Var2.j | 4);
                            c80Var2.j = b3;
                            String str8 = a.b;
                            if (str8 == null) {
                                fvc.f("Null processName");
                                return;
                            }
                            c80Var2.b = str8;
                            c80Var2.c = a.c;
                            c80Var2.g = j;
                            c80Var2.a = a.a;
                            c80Var2.e = a.e;
                            c80Var2.f = a.f;
                            c80Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b3 | 2)) | 32)) | 1)) | 8)) | 16);
                            c80Var2.h = a.h;
                            c80Var2.i = list3;
                            d80 a2 = c80Var2.a();
                            int i8 = a2.d;
                            Boolean valueOf = Boolean.valueOf(i8 != 100);
                            String str9 = a2.b;
                            int i9 = a2.a;
                            str9.getClass();
                            zb5 zb5Var = new zb5();
                            zb5Var.e = str9;
                            zb5Var.a = i9;
                            byte b4 = (byte) (zb5Var.d | 1);
                            zb5Var.b = i8;
                            zb5Var.c = false;
                            zb5Var.d = (byte) (((byte) (b4 | 2)) | 4);
                            b90 a3 = zb5Var.a();
                            x80 e5 = iz2.e();
                            List a4 = iz2Var.a();
                            if (a4 == null) {
                                fvc.f("Null binaries");
                                return;
                            }
                            q80Var.c = new t80(new u80(null, null, a2, null, e5, a4), null, null, valueOf, a3, null, i2);
                            q80Var.d = iz2Var.b(i2);
                            r80 a5 = q80Var.a();
                            String h2 = b00.h("Persisting anr for session ", str3);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", h2, null);
                            }
                            n6aVar.b.e(n6a.b(n6a.a(a5, tg2Var, jb4Var3, Collections.EMPTY_MAP), jb4Var3), str3, true);
                        }
                        str2 = null;
                        c80 c80Var3 = new c80();
                        c80Var3.d = e3.getImportance();
                        c80Var3.j = (byte) (c80Var3.j | 4);
                        processName = e3.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i = 8;
                    b = 4;
                    String h3 = b00.h("No ApplicationExitInfo available. Session: ", str3);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", h3, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 8;
                b = 4;
                String k = de9.k(i3, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", k, null);
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
            String h4 = b00.h("Finalizing native report for session ", str3);
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
            jb4 jb4Var4 = this.g;
            yx2 yx2Var = new yx2((byte) 2);
            File file = new File((File) jb4Var4.d, str3);
            file.mkdirs();
            List list4 = (List) Collection.-EL.stream(jb4.e(file.listFiles(yx2Var))).map(new xz(b)).filter(new sd((byte) 3)).collect(Collectors.toList());
            final List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            final n6a n6aVar2 = this.m;
            Collection.-EL.stream(list4).findFirst().or(new Supplier() { // from class: m6a
                @Override // java.util.function.Supplier
                public final Object get() {
                    return n6a.this.e(str3, historicalProcessExitReasons2, new sd((byte) 7)) != null ? Optional.of(7) : Optional.empty();
                }
            }).ifPresent(new ay2(n6aVar2, str3, (byte) 3));
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.l.b(null);
            str = null;
        }
        n6a n6aVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        nz2 nz2Var = n6aVar3.b;
        jb4 jb4Var5 = nz2Var.b;
        jb4Var5.a(".com.google.firebase.crashlytics");
        jb4Var5.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) jb4Var5.a).isEmpty()) {
            jb4Var5.a(".com.google.firebase.crashlytics.files.v1");
            final String str10 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) jb4Var5.b;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: ib4
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str11) {
                    return str11.startsWith(str10);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z3; r10 < length; r10++) {
                    jb4Var5.a(list[r10]);
                }
            }
        }
        NavigableSet<String> d = nz2Var.d();
        if (str != null) {
            d.remove(str);
        }
        int i10 = i;
        if (d.size() > i10) {
            while (d.size() > i10) {
                String str11 = (String) d.last();
                String h5 = b00.h("Removing session over cap: ", str11);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", h5, null);
                }
                jb4.d(new File((File) jb4Var5.d, str11));
                d.remove(str11);
            }
        }
        for (String str12 : d) {
            String h6 = b00.h("Finalizing report for session ", str12);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", h6, null);
            }
            lz2 lz2Var = nz2.g;
            yx2 yx2Var2 = nz2.i;
            File file3 = new File((File) jb4Var5.d, str12);
            file3.mkdirs();
            List<File> e6 = jb4.e(file3.listFiles(yx2Var2));
            if (e6.isEmpty()) {
                String y = tb4.y("Session ", str12, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", y, null);
                }
            } else {
                Collections.sort(e6);
                ArrayList arrayList6 = new ArrayList();
                boolean z5 = z3;
                for (File file4 : e6) {
                    try {
                        String f = nz2.f(file4);
                        lz2Var.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(f));
                            try {
                                r80 d2 = lz2.d(jsonReader);
                                jsonReader.close();
                                arrayList6.add(nz2Var.a(str12, d2));
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
                    String d3 = new hd7(jb4Var5).d(str12);
                    String a6 = nz2Var.d.a(str12);
                    File b5 = jb4Var5.b(str12, "report");
                    try {
                        String f2 = nz2.f(b5);
                        lz2Var.getClass();
                        a80 j2 = lz2.j(f2);
                        z70 a7 = j2.a();
                        l80 l80Var = j2.k;
                        if (l80Var != null) {
                            k80 a8 = l80Var.a();
                            a8.e = Long.valueOf(currentTimeMillis);
                            a8.f = z5;
                            a8.m = (byte) (a8.m | 2);
                            if (d3 != null) {
                                a8.h = new l90(d3);
                            }
                            a7.j = a8.a();
                        }
                        a80 a9 = a7.a();
                        z70 a10 = a9.a();
                        a10.g = a6;
                        l80 l80Var2 = a9.k;
                        if (l80Var2 != null) {
                            k80 a11 = l80Var2.a();
                            a11.c = a6;
                            a10.j = a11.a();
                        }
                        a80 a12 = a10.a();
                        l80 l80Var3 = a12.k;
                        if (l80Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        z70 a13 = a12.a();
                        k80 a14 = l80Var3.a();
                        a14.k = arrayList6;
                        a13.j = a14.a();
                        a80 a15 = a13.a();
                        l80 l80Var4 = a15.k;
                        if (l80Var4 != null) {
                            String str13 = "appQualitySessionId: " + a6;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str13, null);
                            }
                            nz2.g(z5 ? new File((File) jb4Var5.f, l80Var4.b) : new File((File) jb4Var5.e, l80Var4.b), lz2.a.q(a15));
                        }
                    } catch (IOException e9) {
                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b5, e9);
                    }
                }
            }
            jb4.d(new File((File) jb4Var5.d, str12));
            z3 = false;
        }
        g30 g30Var = nz2Var.c.c().a;
        ArrayList c = nz2Var.c();
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
        String h = b00.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        wj5 wj5Var = this.f;
        dr drVar = this.h;
        na0 na0Var = new na0(wj5Var.c, drVar.f, drVar.g, wj5Var.c().a, ir2.h(drVar.d != null ? 4 : 1), drVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        pa0 pa0Var = new pa0(pm2.i());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        nm2 nm2Var = nm2.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            nm2 nm2Var2 = (nm2) nm2.b.get(str8.toLowerCase(locale));
            if (nm2Var2 != null) {
                nm2Var = nm2Var2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = nm2Var.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = pm2.a(context);
        boolean h2 = pm2.h();
        int d = pm2.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new ma0(na0Var, pa0Var, new oa0(ordinal, availableProcessors, d, a, blockCount, h2)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            jb4 jb4Var = this.d;
            synchronized (((String) jb4Var.a)) {
                jb4Var.a = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i = 4;
                ((pz2) ((mv6) jb4Var.c).c).a(new exa((Object) jb4Var, str, (Object) ((qv5) ((AtomicMarkableReference) ((xf4) jb4Var.d).b).getReference()).a(), (Object) ((yg2) jb4Var.f).g(), (byte) 20));
            }
        }
        tg2 tg2Var = this.i;
        ((ga4) tg2Var.c).a();
        tg2Var.c = tg2.f;
        if (str != null) {
            tg2Var.c = new dx8(((jb4) tg2Var.b).b(str, "userlog"));
        }
        this.l.b(str);
        n6a n6aVar = this.m;
        iz2 iz2Var = n6aVar.a;
        Charset charset = hz2.a;
        z70 z70Var = new z70();
        z70Var.a = "20.1.1";
        dr drVar2 = iz2Var.c;
        String str12 = drVar2.a;
        if (str12 == null) {
            fvc.f("Null gmpAppId");
            return;
        }
        z70Var.b = str12;
        wj5 wj5Var2 = iz2Var.b;
        String str13 = wj5Var2.c().a;
        if (str13 == null) {
            fvc.f("Null installationUuid");
            return;
        }
        z70Var.d = str13;
        z70Var.e = wj5Var2.c().b;
        z70Var.f = wj5Var2.c().c;
        String str14 = drVar2.f;
        if (str14 == null) {
            fvc.f("Null buildVersion");
            return;
        }
        z70Var.h = str14;
        String str15 = drVar2.g;
        if (str15 == null) {
            fvc.f("Null displayVersion");
            return;
        }
        z70Var.i = str15;
        z70Var.c = i;
        z70Var.m = (byte) (z70Var.m | 1);
        k80 k80Var = new k80();
        k80Var.f = false;
        byte b = (byte) (k80Var.m | 2);
        k80Var.d = currentTimeMillis;
        k80Var.m = (byte) (b | 1);
        if (str == null) {
            fvc.f("Null identifier");
            return;
        }
        k80Var.b = str;
        String str16 = iz2.g;
        if (str16 == null) {
            fvc.f("Null generator");
            return;
        }
        k80Var.a = str16;
        String str17 = wj5Var2.c;
        if (str17 == null) {
            fvc.f("Null identifier");
            return;
        }
        lv6 lv6Var = drVar2.h;
        String str18 = wj5Var2.c().a;
        ce3 ce3Var = (ce3) lv6Var.c;
        if (ce3Var == null) {
            ce3Var = new ce3(lv6Var);
            lv6Var.c = ce3Var;
        }
        ce3 ce3Var2 = ce3Var;
        String str19 = ce3Var.b;
        if (ce3Var2 == null) {
            ce3Var2 = new ce3(lv6Var);
            lv6Var.c = ce3Var2;
        }
        k80Var.g = new m80(str17, str14, str15, str18, str19, ce3Var2.c);
        j90 j90Var = new j90();
        j90Var.a = 3;
        j90Var.e = (byte) (j90Var.e | 1);
        if (str6 == null) {
            fvc.f("Null version");
            return;
        }
        j90Var.b = str6;
        if (str2 == null) {
            fvc.f("Null buildVersion");
            return;
        }
        j90Var.c = str2;
        j90Var.d = pm2.i();
        j90Var.e = (byte) (j90Var.e | 2);
        k80Var.i = j90Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) iz2.f.get(str8.toLowerCase(locale))) != null) {
            i2 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a2 = pm2.a(iz2Var.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean h3 = pm2.h();
        int d2 = pm2.d();
        o80 o80Var = new o80();
        o80Var.a = i2;
        byte b2 = (byte) (o80Var.j | 1);
        o80Var.j = b2;
        if (str5 == null) {
            fvc.f("Null model");
            return;
        }
        o80Var.b = str5;
        o80Var.c = availableProcessors2;
        o80Var.d = a2;
        o80Var.e = blockCount2;
        o80Var.f = h3;
        o80Var.g = d2;
        o80Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            fvc.f("Null manufacturer");
            return;
        }
        o80Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            fvc.f("Null modelClass");
            return;
        }
        o80Var.i = str21;
        k80Var.j = o80Var.a();
        k80Var.l = 3;
        k80Var.m = (byte) (k80Var.m | 4);
        z70Var.j = k80Var.a();
        a80 a3 = z70Var.a();
        jb4 jb4Var2 = n6aVar.b.b;
        l80 l80Var = a3.k;
        if (l80Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = l80Var.b;
        try {
            nz2.g.getClass();
            nz2.g(jb4Var2.b(str22, "report"), lz2.a.q(a3));
            File b3 = jb4Var2.b(str22, "start-time");
            long j = l80Var.d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b3), nz2.e);
            try {
                outputStreamWriter.write("");
                b3.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String h4 = b00.h("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", h4, e);
            }
        }
    }

    public final void c(String str) {
        ExecutorService executorService = ((pz2) this.e.c).a;
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
        profilingManager.registerForAllProfilingResults(executorService, new ay2(this, str, b));
    }

    public final boolean d(dv8 dv8Var) {
        mv6.s();
        oz2 oz2Var = this.n;
        boolean z = oz2Var != null && oz2Var.e.get();
        c6e c6eVar = c6e.b;
        if (z) {
            c6eVar.l("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        c6eVar.k("Finalizing previously open sessions.");
        try {
            a(true, dv8Var, true);
            c6eVar.k("Closed all previously open sessions.");
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
        int e = pm2.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e == 0 ? null : context.getResources().getString(e);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = dy2.class.getClassLoader();
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
        for (File file : jb4.e(((File) this.g.c).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new cy2(this, parseLong));
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
                    ((xf4) this.d.e).H("com.crashlytics.version-control-info", f);
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
        jb4 jb4Var = this.m.b.b;
        if (jb4.e(((File) jb4Var.e).listFiles()).isEmpty() && jb4.e(((File) jb4Var.f).listFiles()).isEmpty() && jb4.e(((File) jb4Var.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        c6e c6eVar = c6e.b;
        c6eVar.k("Crash reports are available to be sent.");
        w53 w53Var = this.b;
        byte b = 16;
        if (w53Var.a()) {
            c6eVar.g("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            c = Tasks.forResult(Boolean.TRUE);
        } else {
            c6eVar.g("Automatic data collection is disabled.");
            c6eVar.k("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (w53Var.c) {
                task2 = w53Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new ie7(b));
            c6eVar.g("Waiting for send/deleteUnsentReports to be called.");
            c = rp5.c(onSuccessTask, this.p.getTask());
        }
        c.onSuccessTask((pz2) this.e.b, new lv6(this, task, b));
    }
}
