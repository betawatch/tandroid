package af;

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
import androidx.biometric.e0;
import c9.q;
import c9.s;
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
import com.google.firebase.messaging.o;
import dg.q3;
import g5.l;
import h7.u;
import i9.k;
import i9.n;
import i9.p;
import i9.r;
import i9.w;
import i9.x;
import i9.y;
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
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ai;
import q5.c0;
import s5.m;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements l, c9.g, ba.a, c9.f, r0, Continuation, v2.e, OnFailureListener, c2 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
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
        m mVar = o.a;
        mVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mVar.g(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // c9.g
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // g5.l
    public g5.m createDataSource() {
        return new g5.c(ApplicationLoader.applicationContext);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:38|39|40|(1:42)|43|(1:45)|(1:47)(1:162)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:161)|(1:66)(1:160)|67|(5:147|(1:149)|150|3a5|155)(1:71)|72|(25:76|(1:78)(2:143|(1:145))|79|80|(2:82|(1:84))(2:139|(2:141|142))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(4:120|(1:122)|116|117)(6:111|(1:113)|114|115|116|117))|146|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(2:105|107)|120|(0)|116|117) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:3|(1:5)(1:177)|6|(1:8)|(1:10)(1:176)|11|(3:171|172|(1:174)(1:175))(3:15|(3:167|(1:169)|170)(3:19|(2:22|20)|23)|24)|25|(1:27)|28|(3:30|(2:32|33)(1:35)|34)|36|37|38|39|40|(1:42)|43|(1:45)|(1:47)(1:162)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:161)|(1:66)(1:160)|67|(5:147|(1:149)|150|3a5|155)(1:71)|72|(25:76|(1:78)(2:143|(1:145))|79|80|(2:82|(1:84))(2:139|(2:141|142))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(4:120|(1:122)|116|117)(6:111|(1:113)|114|115|116|117))|146|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(2:105|107)|120|(0)|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x054e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x056d, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x055e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x055f, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0562, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0563, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0565, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0569, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056a, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0415  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // c9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d0(c5.j jVar) {
        ca.d lambda$getComponents$0;
        FirebaseMessaging lambda$getComponents$02;
        String str;
        int i10;
        ?? r22;
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
        p9.b c3;
        String str3;
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
                q qVar = ExecutorsRegistrar.a;
                return d9.l.a;
            default:
                int i11 = CrashlyticsRegistrar.a;
                w8.g gVar2 = (w8.g) jVar.a(w8.g.class);
                s u10 = jVar.u(f9.a.class);
                s u11 = jVar.u(x8.a.class);
                ca.d dVar = (ca.d) jVar.a(ca.d.class);
                s u12 = jVar.u(ka.a.class);
                gVar2.a();
                Context context = gVar2.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                n9.b bVar = new n9.b(context);
                i9.s sVar = new i9.s(gVar2);
                w wVar = new w(context, packageName, dVar, sVar);
                f9.a aVar2 = new f9.a(u10);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(u11);
                ExecutorService a2 = i9.h.a("Crashlytics Exception Handler");
                k kVar = new k(sVar, bVar);
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
                e0 e0Var = new e0(u12, 12);
                e9.a aVar3 = new e9.a(fVar);
                e9.a aVar4 = new e9.a(fVar);
                String str4 = str;
                p pVar = new p(gVar2, wVar, aVar2, sVar, aVar3, aVar4, bVar, a2, kVar, e0Var);
                gVar2.a();
                String str5 = gVar2.c.b;
                int e = i9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e == 0) {
                    e = i9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e != 0 ? context.getResources().getString(e) : str4;
                ArrayList arrayList = new ArrayList();
                int e6 = i9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e10 = i9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e11 = i9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e6 == 0 || e10 == 0 || e11 == 0) {
                    i10 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e6), Integer.valueOf(e10), Integer.valueOf(e11));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        r22 = 0;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        r22 = 0;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(e6);
                    String[] stringArray2 = context.getResources().getStringArray(e10);
                    String[] stringArray3 = context.getResources().getStringArray(e11);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        str3 = str4;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new i9.e(stringArray[i12], stringArray2[i12], stringArray3[i13]));
                            i12 = i13 + 1;
                            str3 = null;
                        }
                    } else {
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                        str3 = null;
                    }
                    i10 = 3;
                    r22 = str3;
                }
                String e12 = w2.e("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", e12, r22);
                }
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    i9.e eVar = (i9.e) obj;
                    String str6 = eVar.a;
                    String str7 = eVar.b;
                    String str8 = eVar.c;
                    int i15 = size;
                    StringBuilder l10 = ai.l("Build id for ", str6, " on ", str7, ": ");
                    l10.append(str8);
                    String sb = l10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb, null);
                    }
                    size = i15;
                }
                try {
                    i9.a a11 = i9.a.a(context, wVar, str5, string, arrayList, new f7.b(context, 1));
                    String str9 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str9, null);
                    }
                    ExecutorService a12 = i9.h.a("com.google.firebase.crashlytics.startup");
                    cb.b bVar2 = new cb.b(12);
                    String str10 = a11.f;
                    String str11 = a11.g;
                    String c10 = wVar.c();
                    cb.b bVar3 = new cb.b(9);
                    o3.c cVar3 = new o3.c(bVar3, 11);
                    zz zzVar = new zz(bVar);
                    Locale locale = Locale.US;
                    p9.a aVar5 = new p9.a(android.support.v4.media.a.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), bVar2);
                    String str12 = Build.MANUFACTURER;
                    String str13 = w.h;
                    String z11 = android.support.v4.media.a.z(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e13 = i9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e13 == 0) {
                        e13 = i9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e13 != 0 ? context.getResources().getString(e13) : null, str5, str11, str10};
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < 4) {
                        String str14 = strArr[i16];
                        String[] strArr2 = strArr;
                        if (str14 != null) {
                            arrayList2.add(str14.replace("-", "").toLowerCase(Locale.US));
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
                    p9.d dVar3 = new p9.d(str5, z11, replaceAll, replaceAll2, wVar, sb3.length() > 0 ? i9.h.i(sb3) : null, str11, str10, e2.c.c(c10 != null ? 4 : 1));
                    e3.g gVar3 = new e3.g();
                    AtomicReference atomicReference = new AtomicReference();
                    gVar3.h = atomicReference;
                    gVar3.i = new AtomicReference(new TaskCompletionSource());
                    gVar3.a = context;
                    gVar3.b = dVar3;
                    gVar3.d = bVar3;
                    gVar3.c = cVar3;
                    gVar3.e = zzVar;
                    gVar3.f = aVar5;
                    gVar3.g = sVar;
                    atomicReference.set(db.a.n0(bVar3));
                    AtomicReference atomicReference2 = (AtomicReference) gVar3.i;
                    AtomicReference atomicReference3 = (AtomicReference) gVar3.h;
                    if (!((Context) gVar3.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((p9.d) gVar3.b).f) || (c3 = gVar3.c(1)) == null) {
                        p9.b c11 = gVar3.c(3);
                        if (c11 != null) {
                            atomicReference3.set(c11);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c11);
                        }
                        i9.s sVar2 = (i9.s) gVar3.g;
                        Task task2 = sVar2.h.getTask();
                        synchronized (sVar2.c) {
                            task = sVar2.d.getTask();
                        }
                        ExecutorService executorService = y.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        x xVar = new x(0, taskCompletionSource);
                        task2.continueWith(a12, xVar);
                        task.continueWith(a12, xVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new tp0(gVar3, 4));
                    } else {
                        atomicReference3.set(c3);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c3);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new z9.d(5));
                    rf.f fVar2 = pVar.l;
                    n9.b bVar4 = pVar.h;
                    Context context2 = pVar.a;
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
                        String str15 = aVar.b;
                        if (z4) {
                            str2 = "FirebaseCrashlytics";
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Configured not to require a build ID.", null);
                            }
                        } else {
                            str2 = "FirebaseCrashlytics";
                            if (TextUtils.isEmpty(str15)) {
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
                        new i9.f(pVar.g);
                        String str16 = i9.f.b;
                        int i18 = 14;
                        pVar.e = new f7.b(i18, "crash_marker", bVar4);
                        pVar.d = new f7.b(i18, "initialization_marker", bVar4);
                        s3 s3Var = new s3(str16, bVar4, fVar2);
                        j9.e eVar2 = new j9.e(bVar4);
                        q9.a[] aVarArr = new q9.a[1];
                        aVarArr[0] = new u(20);
                        c0 c0Var = new c0(aVarArr);
                        ((s) pVar.o.b).a(new f0.d(3));
                        i9.a aVar6 = aVar;
                        a9.a k10 = a9.a.k(pVar.a, pVar.g, pVar.h, aVar6, eVar2, s3Var, c0Var, gVar3, pVar.c, pVar.m);
                        gVar = gVar3;
                        pVar.f = new n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar6, s3Var, eVar2, k10, pVar.n, pVar.j, pVar.m);
                        f7.b bVar5 = pVar.d;
                        n9.b bVar6 = (n9.b) bVar5.c;
                        String str17 = (String) bVar5.b;
                        bVar6.getClass();
                        exists = new File(bVar6.b, str17).exists();
                        z10 = true;
                        z10 = true;
                        Boolean.TRUE.equals((Boolean) y.a(fVar2.H(new i9.o(pVar, z10 ? 1 : 0))));
                        n nVar = pVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        nVar.e.H(new h2.g(2, nVar, str16));
                        r rVar = new r(new o5.i(nVar, 21), gVar, defaultUncaughtExceptionHandler, nVar.j);
                        nVar.n = rVar;
                        Thread.setDefaultUncaughtExceptionHandler(rVar);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            Tasks.call(a12, new e9.b(z10, pVar, gVar));
                            return new e9.c(pVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        pVar.b(gVar);
                        z10 = false;
                        Tasks.call(a12, new e9.b(z10, pVar, gVar));
                        return new e9.c(pVar);
                    }
                    aVar = a11;
                    z4 = true;
                    String str152 = aVar.b;
                    if (z4) {
                    }
                    new i9.f(pVar.g);
                    String str162 = i9.f.b;
                    int i182 = 14;
                    pVar.e = new f7.b(i182, "crash_marker", bVar4);
                    pVar.d = new f7.b(i182, "initialization_marker", bVar4);
                    s3 s3Var2 = new s3(str162, bVar4, fVar2);
                    j9.e eVar22 = new j9.e(bVar4);
                    q9.a[] aVarArr2 = new q9.a[1];
                    aVarArr2[0] = new u(20);
                    c0 c0Var2 = new c0(aVarArr2);
                    ((s) pVar.o.b).a(new f0.d(3));
                    i9.a aVar62 = aVar;
                    a9.a k102 = a9.a.k(pVar.a, pVar.g, pVar.h, aVar62, eVar22, s3Var2, c0Var2, gVar3, pVar.c, pVar.m);
                    gVar = gVar3;
                    pVar.f = new n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar62, s3Var2, eVar22, k102, pVar.n, pVar.j, pVar.m);
                    f7.b bVar52 = pVar.d;
                    n9.b bVar62 = (n9.b) bVar52.c;
                    String str172 = (String) bVar52.b;
                    bVar62.getClass();
                    exists = new File(bVar62.b, str172).exists();
                    z10 = true;
                    z10 = true;
                    Boolean.TRUE.equals((Boolean) y.a(fVar2.H(new i9.o(pVar, z10 ? 1 : 0))));
                    n nVar2 = pVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    nVar2.e.H(new h2.g(2, nVar2, str162));
                    r rVar2 = new r(new o5.i(nVar2, 21), gVar, defaultUncaughtExceptionHandler2, nVar2.j);
                    nVar2.n = rVar2;
                    Thread.setDefaultUncaughtExceptionHandler(rVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a12, new e9.b(z10, pVar, gVar));
                    return new e9.c(pVar);
                } catch (PackageManager.NameNotFoundException e16) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e16);
                    return null;
                }
        }
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

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
        switch (this.a) {
            case 28:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
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

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
    }

    private final void c(ba.b bVar) {
    }
}
