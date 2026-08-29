package a9;

import ag.o1;
import ag.s0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import bg.c2;
import bg.u3;
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
import g9.a0;
import g9.y;
import g9.z;
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
import l4.j1;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements g, z9.a, e, s0, OnFailureListener, b2, Continuation, v2.e, j3.f {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:49|(1:51)|(1:53)(1:158)|54|(4:57|(2:59|60)(1:62)|61|55)|63|64|(1:66)|67|68|(1:70)(1:157)|(1:72)(1:156)|73|(5:143|(1:145)|146|3b1|151)(1:77)|78|(21:82|(1:84)(2:139|(1:141))|85|86|(2:88|(1:90))(2:135|(2:137|138))|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|(5:121|(1:123)|124|118|119)(6:113|(1:115)|116|117|118|119))|142|86|(0)(0)|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|(2:107|109)|121|(0)|124|118|119) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x056d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x056e, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0574, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x055c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0571, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0422  */
    @Override // a9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I0(a5.j jVar) {
        aa.d lambda$getComponents$0;
        String str;
        y yVar;
        int i10;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        g9.a aVar;
        boolean z10;
        String str2;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        n9.a c3;
        FirebaseMessaging lambda$getComponents$02;
        switch (this.a) {
            case 2:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(jVar);
                return lambda$getComponents$0;
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 15:
                q qVar = ExecutorsRegistrar.a;
                return b9.m.a;
            case 19:
                int i11 = CrashlyticsRegistrar.a;
                u8.g gVar = (u8.g) jVar.a(u8.g.class);
                t n10 = jVar.n(d9.b.class);
                t n11 = jVar.n(v8.a.class);
                aa.d dVar = (aa.d) jVar.a(aa.d.class);
                t n12 = jVar.n(ia.a.class);
                gVar.a();
                Context context = gVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                l9.b bVar = new l9.b(context);
                g9.u uVar = new g9.u(gVar);
                y yVar2 = new y(context, packageName, dVar, uVar);
                d9.b bVar2 = new d9.b(n10);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(n11);
                ExecutorService a2 = g9.h.a("Crashlytics Exception Handler");
                g9.k kVar = new g9.k(uVar, bVar);
                ka.c cVar = ka.c.a;
                ka.d dVar2 = ka.d.a;
                ka.c cVar2 = ka.c.a;
                ka.a a10 = ka.c.a(dVar2);
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
                y yVar3 = yVar2;
                g9.r rVar = new g9.r(gVar, yVar3, bVar2, uVar, new c9.a(fVar), new c9.a(fVar), bVar, a2, kVar, new o1(n12, 10));
                gVar.a();
                String str4 = gVar.c.b;
                int e10 = g9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = g9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e10 != 0 ? context.getResources().getString(e10) : str3;
                ArrayList arrayList = new ArrayList();
                int e11 = g9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = g9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = g9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    yVar = yVar3;
                    i10 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e11), Integer.valueOf(e12), Integer.valueOf(e13));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(e11);
                    String[] stringArray2 = context.getResources().getStringArray(e12);
                    String[] stringArray3 = context.getResources().getStringArray(e13);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new g9.e(stringArray[i12], stringArray2[i13], stringArray3[i13]));
                            i12 = i13 + 1;
                            yVar3 = yVar3;
                        }
                        yVar = yVar3;
                    } else {
                        yVar = yVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i10 = 3;
                }
                String e14 = u3.c.e("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", e14, th2);
                }
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    g9.e eVar = (g9.e) obj;
                    String str5 = eVar.a;
                    String str6 = eVar.b;
                    String str7 = eVar.c;
                    int i15 = size;
                    StringBuilder k9 = th.k("Build id for ", str5, " on ", str6, ": ");
                    k9.append(str7);
                    String sb2 = k9.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i15;
                }
                y yVar4 = yVar;
                try {
                    g9.a a11 = g9.a.a(context, yVar4, str4, string, arrayList, new ze.b((Object) context, false));
                    String str8 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    ExecutorService a12 = g9.h.a("com.google.firebase.crashlytics.startup");
                    new ab.b(11);
                    String str9 = a11.f;
                    String str10 = a11.g;
                    String c6 = yVar4.c();
                    ya.a aVar2 = new ya.a(7);
                    o1 o1Var = new o1(aVar2, 26);
                    za.c cVar3 = new za.c(bVar);
                    Locale locale = Locale.US;
                    String n13 = a4.w.n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
                    g5.c cVar4 = new g5.c();
                    if (n13 == null) {
                        throw new IllegalArgumentException("url must not be null.");
                    }
                    cVar4.a = n13;
                    String str11 = Build.MANUFACTURER;
                    String str12 = y.h;
                    String y8 = a4.w.y(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
                    int e15 = g9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e15 == 0) {
                        e15 = g9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e15 != 0 ? context.getResources().getString(e15) : null, str4, str10, str9};
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
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = arrayList2.get(i17);
                        i17++;
                        sb3.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    n9.c cVar5 = new n9.c(str4, y8, replaceAll, replaceAll2, yVar4, sb4.length() > 0 ? g9.h.i(sb4) : null, str10, str9, com.google.android.recaptcha.internal.a.c(c6 != null ? 4 : 1));
                    e3.f fVar2 = new e3.f();
                    AtomicReference atomicReference = new AtomicReference();
                    fVar2.h = atomicReference;
                    fVar2.i = new AtomicReference(new TaskCompletionSource());
                    fVar2.a = context;
                    fVar2.b = cVar5;
                    fVar2.d = aVar2;
                    fVar2.c = o1Var;
                    fVar2.e = cVar3;
                    fVar2.f = cVar4;
                    fVar2.g = uVar;
                    atomicReference.set(f7.v.r(aVar2));
                    AtomicReference atomicReference2 = (AtomicReference) fVar2.i;
                    AtomicReference atomicReference3 = (AtomicReference) fVar2.h;
                    if (!((Context) fVar2.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((n9.c) fVar2.b).f) || (c3 = fVar2.c(1)) == null) {
                        n9.a c10 = fVar2.c(3);
                        if (c10 != null) {
                            atomicReference3.set(c10);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        }
                        g9.u uVar2 = (g9.u) fVar2.g;
                        Task task2 = uVar2.h.getTask();
                        synchronized (uVar2.c) {
                            task = uVar2.d.getTask();
                        }
                        ExecutorService executorService = a0.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        z zVar = new z(0, taskCompletionSource);
                        task2.continueWith(a12, zVar);
                        task.continueWith(a12, zVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new m5.i(fVar2, 26));
                    } else {
                        atomicReference3.set(c3);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c3);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new ab.b(4));
                    com.google.firebase.messaging.s sVar = rVar.l;
                    l9.b bVar3 = rVar.h;
                    Context context2 = rVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e16 = g9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e16 > 0) {
                            z10 = resources.getBoolean(e16);
                        } else {
                            int e17 = g9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e17 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(e17));
                            }
                        }
                        aVar = a11;
                        String str14 = aVar.b;
                        if (z10) {
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
                        new g9.f(rVar.g);
                        String str15 = g9.f.b;
                        int i18 = 3;
                        boolean z12 = false;
                        rVar.e = new g9.l("crash_marker", bVar3, z12, i18);
                        rVar.d = new g9.l("initialization_marker", bVar3, z12, i18);
                        s3 s3Var = new s3(str15, bVar3, sVar);
                        h9.e eVar2 = new h9.e(bVar3);
                        o9.a[] aVarArr = new o9.a[1];
                        aVarArr[0] = new x9.d(16);
                        g9.l lVar = new g9.l(aVarArr);
                        ((t) rVar.o.b).a(new f(29));
                        g9.a aVar3 = aVar;
                        c2 k10 = c2.k(rVar.a, rVar.g, rVar.h, aVar3, eVar2, s3Var, lVar, fVar2, rVar.c, rVar.m);
                        fVar2 = fVar2;
                        rVar.f = new g9.p(rVar.a, rVar.l, rVar.g, rVar.b, rVar.h, rVar.e, aVar3, s3Var, eVar2, k10, rVar.n, rVar.j, rVar.m);
                        g9.l lVar2 = rVar.d;
                        l9.b bVar4 = (l9.b) lVar2.c;
                        String str16 = (String) lVar2.b;
                        bVar4.getClass();
                        exists = new File(bVar4.b, str16).exists();
                        Boolean.TRUE.equals((Boolean) a0.a(sVar.Q(new g9.q(rVar, 1))));
                        g9.p pVar = rVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        pVar.e.Q(new g9.n(1, pVar, str15));
                        g9.t tVar = new g9.t(new za.c(pVar, 17), fVar2, defaultUncaughtExceptionHandler, pVar.j);
                        pVar.n = tVar;
                        Thread.setDefaultUncaughtExceptionHandler(tVar);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            z11 = true;
                            Tasks.call(a12, new c9.b(z11, rVar, fVar2));
                            return new c9.c(rVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        rVar.b(fVar2);
                        z11 = false;
                        Tasks.call(a12, new c9.b(z11, rVar, fVar2));
                        return new c9.c(rVar);
                    }
                    aVar = a11;
                    z10 = true;
                    String str142 = aVar.b;
                    if (z10) {
                    }
                    new g9.f(rVar.g);
                    String str152 = g9.f.b;
                    int i182 = 3;
                    boolean z122 = false;
                    rVar.e = new g9.l("crash_marker", bVar3, z122, i182);
                    rVar.d = new g9.l("initialization_marker", bVar3, z122, i182);
                    s3 s3Var2 = new s3(str152, bVar3, sVar);
                    h9.e eVar22 = new h9.e(bVar3);
                    o9.a[] aVarArr2 = new o9.a[1];
                    aVarArr2[0] = new x9.d(16);
                    g9.l lVar3 = new g9.l(aVarArr2);
                    ((t) rVar.o.b).a(new f(29));
                    g9.a aVar32 = aVar;
                    c2 k102 = c2.k(rVar.a, rVar.g, rVar.h, aVar32, eVar22, s3Var2, lVar3, fVar2, rVar.c, rVar.m);
                    fVar2 = fVar2;
                    rVar.f = new g9.p(rVar.a, rVar.l, rVar.g, rVar.b, rVar.h, rVar.e, aVar32, s3Var2, eVar22, k102, rVar.n, rVar.j, rVar.m);
                    g9.l lVar22 = rVar.d;
                    l9.b bVar42 = (l9.b) lVar22.c;
                    String str162 = (String) lVar22.b;
                    bVar42.getClass();
                    exists = new File(bVar42.b, str162).exists();
                    Boolean.TRUE.equals((Boolean) a0.a(sVar.Q(new g9.q(rVar, 1))));
                    g9.p pVar2 = rVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    pVar2.e.Q(new g9.n(1, pVar2, str152));
                    g9.t tVar2 = new g9.t(new za.c(pVar2, 17), fVar2, defaultUncaughtExceptionHandler2, pVar2.j);
                    pVar2.n = tVar2;
                    Thread.setDefaultUncaughtExceptionHandler(tVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    z11 = true;
                    Tasks.call(a12, new c9.b(z11, rVar, fVar2));
                    return new c9.c(rVar);
                } catch (PackageManager.NameNotFoundException e18) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e18);
                    return null;
                }
            default:
                lambda$getComponents$02 = FirebaseMessagingRegistrar.lambda$getComponents$0(jVar);
                return lambda$getComponents$02;
        }
    }

    @Override // ag.s0
    public Typeface a() {
        switch (this.a) {
            case 3:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 4:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 5:
                return Typeface.create("serif", 1);
            case 6:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 7:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // v2.e
    public Object apply(Object obj) {
        ga.e eVar = (ga.e) obj;
        eVar.getClass();
        v5.c cVar = com.google.firebase.messaging.o.a;
        cVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cVar.e(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(d5.v.c);
        bundle2.getClass();
        j1 j1Var = (j1) j1.n.c(bundle2);
        int[] intArray = bundle.getIntArray(d5.v.d);
        intArray.getClass();
        return new d5.v(j1Var, intArray.length == 0 ? Collections.EMPTY_LIST : new s8.a(0, intArray.length, intArray));
    }

    @Override // a9.g
    public List e(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 20:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // z9.a
    public void j(z9.b bVar) {
        switch (this.a) {
            case 1:
                return;
            case 18:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = u3.n0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 23:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
    }

    private final void b(z9.b bVar) {
    }
}
