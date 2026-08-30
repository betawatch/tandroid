package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.f0;
import cg.r0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import dg.q3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.yh;
import q5.g0;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements g5.l, c9.f, ba.a, c9.e, r0, Continuation, v2.e, OnFailureListener, c2 {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // cg.r0
    public Typeface a() {
        switch (this.a) {
            case 9:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 10:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 11:
                return Typeface.create("serif", 1);
            case 12:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 13:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // v2.e
    public Object apply(Object obj) {
        ia.e eVar = (ia.e) obj;
        eVar.getClass();
        s5.m mVar = com.google.firebase.messaging.o.a;
        mVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mVar.g(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // c9.f
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // g5.l
    public g5.m createDataSource() {
        return new g5.c(ApplicationLoader.applicationContext);
    }

    @Override // ba.a
    public void f(ba.b bVar) {
        switch (this.a) {
            case 7:
                return;
            default:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:39|40|41|(1:43)|44|(1:46)|(1:48)(1:163)|49|(4:52|(2:54|55)(1:57)|56|50)|58|59|(1:61)|62|63|(1:65)(1:162)|(1:67)(1:161)|68|(5:148|(1:150)|151|3a9|156)(1:72)|73|(25:77|(1:79)(2:144|(1:146))|80|81|(2:83|(1:85))(2:140|(2:142|143))|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(4:121|(1:123)|117|118)(6:112|(1:114)|115|116|117|118))|147|81|(0)(0)|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(2:106|108)|121|(0)|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0553, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0572, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0563, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0564, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0567, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0568, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x056a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x056f, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x041a  */
    @Override // c9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f0(c5.j jVar) {
        ca.d lambda$getComponents$0;
        FirebaseMessaging lambda$getComponents$02;
        String str;
        i9.w wVar;
        int i10;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        i9.a aVar;
        boolean z4;
        String str2;
        e3.g gVar;
        boolean z10;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        p9.a c3;
        switch (this.a) {
            case 8:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(jVar);
                return lambda$getComponents$0;
            case 19:
                lambda$getComponents$02 = FirebaseMessagingRegistrar.lambda$getComponents$0(jVar);
                return lambda$getComponents$02;
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 24:
                c9.p pVar = ExecutorsRegistrar.a;
                return d9.l.a;
            default:
                int i11 = CrashlyticsRegistrar.a;
                w8.g gVar2 = (w8.g) jVar.a(w8.g.class);
                c9.r u10 = jVar.u(f9.a.class);
                c9.r u11 = jVar.u(x8.a.class);
                ca.d dVar = (ca.d) jVar.a(ca.d.class);
                c9.r u12 = jVar.u(ka.a.class);
                gVar2.a();
                Context context = gVar2.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                n9.b bVar = new n9.b(context);
                i9.s sVar = new i9.s(gVar2);
                i9.w wVar2 = new i9.w(context, packageName, dVar, sVar);
                f9.a aVar2 = new f9.a(u10);
                f fVar = new f(u11);
                ExecutorService a2 = i9.h.a("Crashlytics Exception Handler");
                i9.k kVar = new i9.k(sVar, bVar);
                ma.c cVar = ma.c.a;
                ma.d dVar2 = ma.d.a;
                ma.c cVar2 = ma.c.a;
                ma.a a10 = ma.c.a(dVar2);
                if (a10.b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
                    str = null;
                } else {
                    a10.b = kVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
                    str = null;
                    a10.a.e(null);
                }
                String str3 = str;
                i9.w wVar3 = wVar2;
                i9.p pVar2 = new i9.p(gVar2, wVar3, aVar2, sVar, new e9.a(fVar), new e9.a(fVar), bVar, a2, kVar, new f0(u12, 13));
                gVar2.a();
                String str4 = gVar2.c.b;
                int e = i9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e == 0) {
                    e = i9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e != 0 ? context.getResources().getString(e) : str3;
                ArrayList arrayList = new ArrayList();
                int e6 = i9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e10 = i9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e11 = i9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e6 == 0 || e10 == 0 || e11 == 0) {
                    wVar = wVar3;
                    i10 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e6), Integer.valueOf(e10), Integer.valueOf(e11));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(e6);
                    String[] stringArray2 = context.getResources().getStringArray(e10);
                    String[] stringArray3 = context.getResources().getStringArray(e11);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new i9.e(stringArray[i12], stringArray2[i13], stringArray3[i13]));
                            i12 = i13 + 1;
                            wVar3 = wVar3;
                        }
                        wVar = wVar3;
                    } else {
                        wVar = wVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i10 = 3;
                }
                String e12 = v2.e("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", e12, th2);
                }
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    i9.e eVar = (i9.e) obj;
                    String str5 = eVar.a;
                    String str6 = eVar.b;
                    String str7 = eVar.c;
                    int i15 = size;
                    StringBuilder m9 = yh.m("Build id for ", str5, " on ", str6, ": ");
                    m9.append(str7);
                    String sb = m9.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb, null);
                    }
                    size = i15;
                }
                i9.w wVar4 = wVar;
                try {
                    i9.a a11 = i9.a.a(context, wVar4, str4, string, arrayList, new f7.b(context, 1));
                    String str8 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    ExecutorService a12 = i9.h.a("com.google.firebase.crashlytics.startup");
                    db.a aVar3 = new db.a(12);
                    String str9 = a11.f;
                    String str10 = a11.g;
                    String c10 = wVar4.c();
                    db.a aVar4 = new db.a(9);
                    qk0 qk0Var = new qk0(aVar4, 5);
                    f1 f1Var = new f1(bVar);
                    Locale locale = Locale.US;
                    com.google.android.gms.internal.clearcut.e eVar2 = new com.google.android.gms.internal.clearcut.e(android.support.v4.media.a.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings"), aVar3);
                    String str11 = Build.MANUFACTURER;
                    String str12 = i9.w.h;
                    String z11 = android.support.v4.media.a.z(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
                    int e13 = i9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e13 == 0) {
                        e13 = i9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e13 != 0 ? context.getResources().getString(e13) : null, str4, str10, str9};
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < 4) {
                        String str13 = strArr[i16];
                        String[] strArr2 = strArr;
                        if (str13 != null) {
                            arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                        }
                        i16++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb2 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = arrayList2.get(i17);
                        i17++;
                        sb2.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb3 = sb2.toString();
                    p9.c cVar3 = new p9.c(str4, z11, replaceAll, replaceAll2, wVar4, sb3.length() > 0 ? i9.h.i(sb3) : null, str10, str9, e2.c.c(c10 != null ? 4 : 1));
                    e3.g gVar3 = new e3.g();
                    AtomicReference atomicReference = new AtomicReference();
                    gVar3.h = atomicReference;
                    gVar3.i = new AtomicReference(new TaskCompletionSource());
                    gVar3.a = context;
                    gVar3.b = cVar3;
                    gVar3.d = aVar4;
                    gVar3.c = qk0Var;
                    gVar3.e = f1Var;
                    gVar3.f = eVar2;
                    gVar3.g = sVar;
                    atomicReference.set(z9.d.G(aVar4));
                    AtomicReference atomicReference2 = (AtomicReference) gVar3.i;
                    AtomicReference atomicReference3 = (AtomicReference) gVar3.h;
                    if (!((Context) gVar3.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((p9.c) gVar3.b).f) || (c3 = gVar3.c(1)) == null) {
                        p9.a c11 = gVar3.c(3);
                        if (c11 != null) {
                            atomicReference3.set(c11);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c11);
                        }
                        i9.s sVar2 = (i9.s) gVar3.g;
                        Task task2 = sVar2.h.getTask();
                        synchronized (sVar2.c) {
                            task = sVar2.d.getTask();
                        }
                        ExecutorService executorService = i9.y.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        i9.x xVar = new i9.x(0, taskCompletionSource);
                        task2.continueWith(a12, xVar);
                        task.continueWith(a12, xVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new o2.o(gVar3, 11));
                    } else {
                        atomicReference3.set(c3);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c3);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new ab.a(6));
                    com.google.firebase.messaging.r rVar = pVar2.l;
                    n9.b bVar2 = pVar2.h;
                    Context context2 = pVar2.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e14 = i9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e14 > 0) {
                            z4 = resources.getBoolean(e14);
                        } else {
                            int e15 = i9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e15 > 0) {
                                z4 = Boolean.parseBoolean(context2.getString(e15));
                            }
                        }
                        aVar = a11;
                        String str14 = aVar.b;
                        if (z4) {
                            str2 = "FirebaseCrashlytics";
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Configured not to require a build ID.", null);
                            }
                        } else {
                            str2 = "FirebaseCrashlytics";
                            if (TextUtils.isEmpty(str14)) {
                                Log.e(str2, ".");
                                Log.e(str2, ".     |  | ");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".   \\ |  | /");
                                Log.e(str2, ".    \\    /");
                                Log.e(str2, ".     \\  /");
                                Log.e(str2, ".      \\/");
                                Log.e(str2, ".");
                                Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e(str2, ".");
                                Log.e(str2, ".      /\\");
                                Log.e(str2, ".     /  \\");
                                Log.e(str2, ".    /    \\");
                                Log.e(str2, ".   / |  | \\");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".");
                                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            }
                        }
                        new i9.f(pVar2.g);
                        String str15 = i9.f.b;
                        int i18 = 14;
                        pVar2.e = new f7.b(i18, "crash_marker", bVar2);
                        pVar2.d = new f7.b(i18, "initialization_marker", bVar2);
                        s3 s3Var = new s3(str15, bVar2, rVar);
                        j9.e eVar3 = new j9.e(bVar2);
                        q9.a[] aVarArr = new q9.a[1];
                        aVarArr[0] = new z9.d(20);
                        g0 g0Var = new g0(aVarArr);
                        ((c9.r) pVar2.o.b).a(new f0.d(3));
                        i9.a aVar5 = aVar;
                        a9.a k10 = a9.a.k(pVar2.a, pVar2.g, pVar2.h, aVar5, eVar3, s3Var, g0Var, gVar3, pVar2.c, pVar2.m);
                        gVar = gVar3;
                        pVar2.f = new i9.n(pVar2.a, pVar2.l, pVar2.g, pVar2.b, pVar2.h, pVar2.e, aVar5, s3Var, eVar3, k10, pVar2.n, pVar2.j, pVar2.m);
                        f7.b bVar3 = pVar2.d;
                        n9.b bVar4 = (n9.b) bVar3.c;
                        String str16 = (String) bVar3.b;
                        bVar4.getClass();
                        exists = new File(bVar4.b, str16).exists();
                        z10 = true;
                        z10 = true;
                        Boolean.TRUE.equals((Boolean) i9.y.a(rVar.V(new i9.o(pVar2, z10 ? 1 : 0))));
                        i9.n nVar = pVar2.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        nVar.e.V(new h2.g(2, nVar, str15));
                        i9.r rVar2 = new i9.r(new o5.i(nVar, 21), gVar, defaultUncaughtExceptionHandler, nVar.j);
                        nVar.n = rVar2;
                        Thread.setDefaultUncaughtExceptionHandler(rVar2);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            Tasks.call(a12, new e9.b(z10, pVar2, gVar));
                            return new e9.c(pVar2);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        pVar2.b(gVar);
                        z10 = false;
                        Tasks.call(a12, new e9.b(z10, pVar2, gVar));
                        return new e9.c(pVar2);
                    }
                    aVar = a11;
                    z4 = true;
                    String str142 = aVar.b;
                    if (z4) {
                    }
                    new i9.f(pVar2.g);
                    String str152 = i9.f.b;
                    int i182 = 14;
                    pVar2.e = new f7.b(i182, "crash_marker", bVar2);
                    pVar2.d = new f7.b(i182, "initialization_marker", bVar2);
                    s3 s3Var2 = new s3(str152, bVar2, rVar);
                    j9.e eVar32 = new j9.e(bVar2);
                    q9.a[] aVarArr2 = new q9.a[1];
                    aVarArr2[0] = new z9.d(20);
                    g0 g0Var2 = new g0(aVarArr2);
                    ((c9.r) pVar2.o.b).a(new f0.d(3));
                    i9.a aVar52 = aVar;
                    a9.a k102 = a9.a.k(pVar2.a, pVar2.g, pVar2.h, aVar52, eVar32, s3Var2, g0Var2, gVar3, pVar2.c, pVar2.m);
                    gVar = gVar3;
                    pVar2.f = new i9.n(pVar2.a, pVar2.l, pVar2.g, pVar2.b, pVar2.h, pVar2.e, aVar52, s3Var2, eVar32, k102, pVar2.n, pVar2.j, pVar2.m);
                    f7.b bVar32 = pVar2.d;
                    n9.b bVar42 = (n9.b) bVar32.c;
                    String str162 = (String) bVar32.b;
                    bVar42.getClass();
                    exists = new File(bVar42.b, str162).exists();
                    z10 = true;
                    z10 = true;
                    Boolean.TRUE.equals((Boolean) i9.y.a(rVar.V(new i9.o(pVar2, z10 ? 1 : 0))));
                    i9.n nVar2 = pVar2.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    nVar2.e.V(new h2.g(2, nVar2, str152));
                    i9.r rVar22 = new i9.r(new o5.i(nVar2, 21), gVar, defaultUncaughtExceptionHandler2, nVar2.j);
                    nVar2.n = rVar22;
                    Thread.setDefaultUncaughtExceptionHandler(rVar22);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a12, new e9.b(z10, pVar2, gVar));
                    return new e9.c(pVar2);
                } catch (PackageManager.NameNotFoundException e16) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e16);
                    return null;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
        d2Var.dismiss();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = q3.o0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 16:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    public /* synthetic */ w(Object obj, int i10) {
        this.a = i10;
    }

    private final void c(ba.b bVar) {
    }
}
