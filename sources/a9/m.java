package a9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaRoute2Info;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b5.w;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import e7.v;
import f9.a0;
import f9.b0;
import f9.s;
import f9.t;
import f9.x;
import j4.i1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.t3;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.bc0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements z8.d, a2, h3.f, y9.a, bc0, Continuation, t2.e, d3.f, e4.g {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // h3.f
    public h3.g a(Bundle bundle) {
        switch (this.a) {
            case 9:
                Bundle bundle2 = bundle.getBundle(w.c);
                bundle2.getClass();
                i1 i1Var = (i1) i1.n.a(bundle2);
                int[] intArray = bundle.getIntArray(w.d);
                intArray.getClass();
                return new w(i1Var, intArray.length == 0 ? Collections.EMPTY_LIST : new r8.a(0, intArray.length, intArray));
            default:
                return new e5.b(bundle.getInt(e5.b.f, -1), bundle.getInt(e5.b.h, -1), bundle.getInt(e5.b.n, -1), bundle.getByteArray(e5.b.r));
        }
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        switch (this.a) {
            case 24:
                fa.e eVar = (fa.e) obj;
                eVar.getClass();
                u2.b bVar = com.google.firebase.messaging.p.a;
                bVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bVar.e(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        u2.b a2 = w2.i.a();
                        a2.h(rawQuery.getString(1));
                        a2.d = g3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
        }
    }

    @Override // y9.a
    public void b(y9.b bVar) {
        switch (this.a) {
            case 10:
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

    @Override // e4.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                b2Var.dismiss();
                break;
            case 5:
                b2Var.dismiss();
                break;
            case 14:
                break;
            case 17:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bc0
    public String g(int i10) {
        switch (this.a) {
            case 15:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 20:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:41|42|43|(1:45)|46|(1:48)|(1:50)(1:164)|51|(4:54|(2:56|57)(1:59)|58|52)|60|61|(1:63)|64|65|(1:67)(1:163)|(1:69)(1:162)|70|(5:149|(1:151)|152|3ad|157)(1:74)|75|(25:79|(1:81)(2:145|(1:147))|82|83|(2:85|(1:87))(2:141|(2:143|144))|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(4:122|(1:124)|119|120)(6:114|(1:116)|117|118|119|120))|148|83|(0)(0)|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:108|110)|122|(0)|119|120) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:6|(1:8)(1:179)|9|(1:11)|(1:13)(1:178)|14|(3:173|174|(1:176)(1:177))(3:18|(3:169|(1:171)|172)(3:22|(2:25|23)|26)|27)|28|(1:30)|31|(3:33|(2:35|36)(1:38)|37)|39|40|41|42|43|(1:45)|46|(1:48)|(1:50)(1:164)|51|(4:54|(2:56|57)(1:59)|58|52)|60|61|(1:63)|64|65|(1:67)(1:163)|(1:69)(1:162)|70|(5:149|(1:151)|152|3ad|157)(1:74)|75|(25:79|(1:81)(2:145|(1:147))|82|83|(2:85|(1:87))(2:141|(2:143|144))|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(4:122|(1:124)|119|120)(6:114|(1:116)|117|118|119|120))|148|83|(0)(0)|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:108|110)|122|(0)|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0559, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0578, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0569, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x056a, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x056d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x056e, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0570, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0574, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0575, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x041e  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // z8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u0(af.h hVar) {
        String str;
        int i10;
        ?? r22;
        Task task;
        Task onSuccessTask;
        f9.a aVar;
        boolean z10;
        String str2;
        c3.g gVar;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        m9.a c10;
        String str3;
        FirebaseMessaging lambda$getComponents$0;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 3:
                z8.m mVar = ExecutorsRegistrar.a;
                return r.a;
            case 11:
                int i11 = CrashlyticsRegistrar.a;
                t8.h hVar2 = (t8.h) hVar.a(t8.h.class);
                z8.o v = hVar.v(c9.a.class);
                z8.o v4 = hVar.v(u8.a.class);
                z9.d dVar = (z9.d) hVar.a(z9.d.class);
                z8.o v10 = hVar.v(ha.a.class);
                hVar2.a();
                Context context = hVar2.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                k9.c cVar = new k9.c(context);
                t tVar = new t(hVar2);
                x xVar = new x(context, packageName, dVar, tVar);
                c9.a aVar2 = new c9.a(v);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(v4);
                ExecutorService a2 = f9.h.a("Crashlytics Exception Handler");
                f9.k kVar = new f9.k(tVar, cVar);
                ja.c cVar2 = ja.c.a;
                ja.d dVar2 = ja.d.a;
                ja.c cVar3 = ja.c.a;
                ja.a a3 = ja.c.a(dVar2);
                if (a3.b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
                    str = null;
                } else {
                    a3.b = kVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
                    str = null;
                    a3.a.e(null);
                }
                ga.c cVar4 = new ga.c(v10, 7);
                b9.a aVar3 = new b9.a(fVar);
                b9.a aVar4 = new b9.a(fVar);
                String str4 = str;
                f9.q qVar = new f9.q(hVar2, xVar, aVar2, tVar, aVar3, aVar4, cVar, a2, kVar, cVar4);
                hVar2.a();
                String str5 = hVar2.c.b;
                int e9 = f9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e9 == 0) {
                    e9 = f9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e9 != 0 ? context.getResources().getString(e9) : str4;
                ArrayList arrayList = new ArrayList();
                int e10 = f9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e11 = f9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e12 = f9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e10 == 0 || e11 == 0 || e12 == 0) {
                    i10 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e10), Integer.valueOf(e11), Integer.valueOf(e12));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        r22 = 0;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        r22 = 0;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(e10);
                    String[] stringArray2 = context.getResources().getStringArray(e11);
                    String[] stringArray3 = context.getResources().getStringArray(e12);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        str3 = str4;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new f9.e(stringArray[i12], stringArray2[i12], stringArray3[i13]));
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
                String e13 = s3.c.e("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", e13, r22);
                }
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    f9.e eVar = (f9.e) obj;
                    String str6 = eVar.a;
                    String str7 = eVar.b;
                    String str8 = eVar.c;
                    int i15 = size;
                    StringBuilder p6 = i0.a.p("Build id for ", str6, " on ", str7, ": ");
                    p6.append(str8);
                    String sb2 = p6.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i15;
                }
                try {
                    f9.a a10 = f9.a.a(context, xVar, str5, string, arrayList, new xe.b((Object) context, 9));
                    String str9 = "Installer package name is: " + a10.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str9, null);
                    }
                    ExecutorService a11 = f9.h.a("com.google.firebase.crashlytics.startup");
                    xa.a aVar5 = new xa.a(10);
                    String str10 = a10.f;
                    String str11 = a10.g;
                    String c11 = xVar.c();
                    ab.a aVar6 = new ab.a(7);
                    ga.c cVar5 = new ga.c(aVar6, 26);
                    k5.i iVar = new k5.i(cVar);
                    Locale locale = Locale.US;
                    ec.a aVar7 = new ec.a(p.m("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), aVar5);
                    String str12 = Build.MANUFACTURER;
                    String str13 = x.h;
                    String w10 = p.w(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e14 = f9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e14 == 0) {
                        e14 = f9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e14 != 0 ? context.getResources().getString(e14) : null, str5, str11, str10};
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
                    m9.c cVar6 = new m9.c(str5, w10, replaceAll, replaceAll2, xVar, sb4.length() > 0 ? f9.h.i(sb4) : null, str11, str10, com.google.android.recaptcha.internal.a.c(c11 != null ? 4 : 1));
                    c3.g gVar2 = new c3.g();
                    AtomicReference atomicReference = new AtomicReference();
                    gVar2.h = atomicReference;
                    gVar2.i = new AtomicReference(new TaskCompletionSource());
                    gVar2.a = context;
                    gVar2.b = cVar6;
                    gVar2.d = aVar6;
                    gVar2.c = cVar5;
                    gVar2.e = iVar;
                    gVar2.f = aVar7;
                    gVar2.g = tVar;
                    atomicReference.set(ab.a.C(aVar6));
                    AtomicReference atomicReference2 = (AtomicReference) gVar2.i;
                    AtomicReference atomicReference3 = (AtomicReference) gVar2.h;
                    if (!((Context) gVar2.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((m9.c) gVar2.b).f) || (c10 = gVar2.c(1)) == null) {
                        m9.a c12 = gVar2.c(3);
                        if (c12 != null) {
                            atomicReference3.set(c12);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                        }
                        t tVar2 = (t) gVar2.g;
                        Task task2 = tVar2.h.getTask();
                        synchronized (tVar2.c) {
                            task = tVar2.d.getTask();
                        }
                        ExecutorService executorService = b0.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        a0 a0Var = new a0(0, taskCompletionSource);
                        task2.continueWith(a11, a0Var);
                        task.continueWith(a11, a0Var);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a11, new ae.b(gVar2, 29));
                    } else {
                        atomicReference3.set(c10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a11, new v(3));
                    com.google.firebase.messaging.t tVar3 = qVar.l;
                    k9.c cVar7 = qVar.h;
                    Context context2 = qVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e15 = f9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e15 > 0) {
                            z10 = resources.getBoolean(e15);
                        } else {
                            int e16 = f9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e16 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(e16));
                            }
                        }
                        aVar = a10;
                        String str15 = aVar.b;
                        if (z10) {
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
                        new f9.f(qVar.g);
                        String str16 = f9.f.b;
                        int i18 = 27;
                        boolean z12 = false;
                        qVar.e = new xe.b("crash_marker", cVar7, z12, i18);
                        qVar.d = new xe.b("initialization_marker", cVar7, z12, i18);
                        t3 t3Var = new t3(str16, cVar7, tVar3);
                        g9.e eVar2 = new g9.e(cVar7);
                        n9.a[] aVarArr = new n9.a[1];
                        aVarArr[0] = new v(16);
                        g5.b bVar = new g5.b(aVarArr);
                        ((z8.o) qVar.o.b).a(new m(13));
                        f9.a aVar8 = aVar;
                        com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k(qVar.a, qVar.g, qVar.h, aVar8, eVar2, t3Var, bVar, gVar2, qVar.c, qVar.m);
                        gVar = gVar2;
                        qVar.f = new f9.o(qVar.a, qVar.l, qVar.g, qVar.b, qVar.h, qVar.e, aVar8, t3Var, eVar2, k10, qVar.n, qVar.j, qVar.m);
                        xe.b bVar2 = qVar.d;
                        k9.c cVar8 = (k9.c) bVar2.c;
                        String str17 = (String) bVar2.b;
                        cVar8.getClass();
                        exists = new File(cVar8.b, str17).exists();
                        Boolean.TRUE.equals((Boolean) b0.a(tVar3.Q(new f9.p(qVar, 1))));
                        f9.o oVar = qVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        z11 = true;
                        z11 = true;
                        oVar.e.Q(new f9.m(z11 ? 1 : 0, oVar, str16));
                        s sVar = new s(new ga.c(oVar, 13), gVar, defaultUncaughtExceptionHandler, oVar.j);
                        oVar.n = sVar;
                        Thread.setDefaultUncaughtExceptionHandler(sVar);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            Tasks.call(a11, new b9.b(z11, qVar, gVar));
                            return new b9.c(qVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        qVar.b(gVar);
                        z11 = false;
                        Tasks.call(a11, new b9.b(z11, qVar, gVar));
                        return new b9.c(qVar);
                    }
                    aVar = a10;
                    z10 = true;
                    String str152 = aVar.b;
                    if (z10) {
                    }
                    new f9.f(qVar.g);
                    String str162 = f9.f.b;
                    int i182 = 27;
                    boolean z122 = false;
                    qVar.e = new xe.b("crash_marker", cVar7, z122, i182);
                    qVar.d = new xe.b("initialization_marker", cVar7, z122, i182);
                    t3 t3Var2 = new t3(str162, cVar7, tVar3);
                    g9.e eVar22 = new g9.e(cVar7);
                    n9.a[] aVarArr2 = new n9.a[1];
                    aVarArr2[0] = new v(16);
                    g5.b bVar3 = new g5.b(aVarArr2);
                    ((z8.o) qVar.o.b).a(new m(13));
                    f9.a aVar82 = aVar;
                    com.google.firebase.messaging.m k102 = com.google.firebase.messaging.m.k(qVar.a, qVar.g, qVar.h, aVar82, eVar22, t3Var2, bVar3, gVar2, qVar.c, qVar.m);
                    gVar = gVar2;
                    qVar.f = new f9.o(qVar.a, qVar.l, qVar.g, qVar.b, qVar.h, qVar.e, aVar82, t3Var2, eVar22, k102, qVar.n, qVar.j, qVar.m);
                    xe.b bVar22 = qVar.d;
                    k9.c cVar82 = (k9.c) bVar22.c;
                    String str172 = (String) bVar22.b;
                    cVar82.getClass();
                    exists = new File(cVar82.b, str172).exists();
                    Boolean.TRUE.equals((Boolean) b0.a(tVar3.Q(new f9.p(qVar, 1))));
                    f9.o oVar2 = qVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    z11 = true;
                    z11 = true;
                    oVar2.e.Q(new f9.m(z11 ? 1 : 0, oVar2, str162));
                    s sVar2 = new s(new ga.c(oVar2, 13), gVar, defaultUncaughtExceptionHandler2, oVar2.j);
                    oVar2.n = sVar2;
                    Thread.setDefaultUncaughtExceptionHandler(sVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a11, new b9.b(z11, qVar, gVar));
                    return new b9.c(qVar);
                } catch (PackageManager.NameNotFoundException e17) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e17);
                    return null;
                }
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(hVar);
                return lambda$getComponents$0;
        }
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
    }

    private final void i(b2 b2Var, int i10) {
    }
}
