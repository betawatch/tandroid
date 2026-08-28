package a9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaRoute2Info;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.messaging.m;
import d7.u;
import e4.g;
import e9.k;
import e9.o;
import e9.q;
import e9.s;
import e9.t;
import e9.x;
import e9.y;
import e9.z;
import f7.d7;
import j3.r0;
import j4.i1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import k5.i;
import m.t3;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.xb0;
import s8.h;
import y8.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements x9.a, y8.d, h3.f, b2, xb0, Continuation, t2.e, d3.f, g, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i9) {
        this.a = i9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:43|(1:45)|(1:47)(1:152)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:151)|(1:66)(1:150)|67|(5:137|(1:139)|140|39d|145)(1:71)|72|(21:76|(1:78)(2:133|(1:135))|79|80|(2:82|(1:84))(2:129|(2:131|132))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(4:116|(1:118)|112|113)(6:107|(1:109)|110|111|112|113))|136|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(2:101|103)|116|(0)|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0558, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0559, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x055f, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r2.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0548, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x055c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040e  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(b3.b bVar) {
        ?? r32;
        int i9;
        ?? r12;
        Task task;
        Task onSuccessTask;
        e9.a aVar;
        boolean z10;
        String str;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        l9.a c10;
        String str2;
        int i10 = CrashlyticsRegistrar.a;
        h hVar = (h) bVar.a(h.class);
        p q10 = bVar.q(b9.b.class);
        p q11 = bVar.q(t8.a.class);
        y9.d dVar = (y9.d) bVar.a(y9.d.class);
        p q12 = bVar.q(ga.a.class);
        hVar.a();
        Context context = hVar.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
        j9.c cVar = new j9.c(context);
        t tVar = new t(hVar);
        x xVar = new x(context, packageName, dVar, tVar);
        b9.b bVar2 = new b9.b(q10);
        c cVar2 = new c(q11);
        ExecutorService a2 = e9.h.a("Crashlytics Exception Handler");
        k kVar = new k(tVar, cVar);
        ia.c cVar3 = ia.c.a;
        ia.d dVar2 = ia.d.a;
        ia.c cVar4 = ia.c.a;
        ia.a a3 = ia.c.a(dVar2);
        if (a3.b != null) {
            Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
            r32 = null;
        } else {
            a3.b = kVar;
            Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
            r32 = null;
            a3.a.e(null);
        }
        android.support.v4.media.c cVar5 = new android.support.v4.media.c(q12, 4);
        a aVar2 = new a(cVar2);
        a aVar3 = new a(cVar2);
        String str3 = r32;
        q qVar = new q(hVar, xVar, bVar2, tVar, aVar2, aVar3, cVar, a2, kVar, cVar5);
        hVar.a();
        String str4 = hVar.c.b;
        int e10 = e9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e10 == 0) {
            e10 = e9.h.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string = e10 != 0 ? context.getResources().getString(e10) : str3;
        ArrayList arrayList = new ArrayList();
        int e11 = e9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e12 = e9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e13 = e9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e11 == 0 || e12 == 0 || e13 == 0) {
            i9 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e11), Integer.valueOf(e12), Integer.valueOf(e13));
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                r12 = 0;
                Log.d("FirebaseCrashlytics", format, null);
            } else {
                r12 = 0;
            }
        } else {
            String[] stringArray = context.getResources().getStringArray(e11);
            String[] stringArray2 = context.getResources().getStringArray(e12);
            String[] stringArray3 = context.getResources().getStringArray(e13);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i11 = 0;
                str2 = str3;
                while (i11 < stringArray3.length) {
                    int i12 = i11;
                    arrayList.add(new e9.e(stringArray[i11], stringArray2[i11], stringArray3[i12]));
                    i11 = i12 + 1;
                    str2 = null;
                }
            } else {
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", format2, null);
                }
                str2 = null;
            }
            i9 = 3;
            r12 = str2;
        }
        String d = ta.b.d("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i9)) {
            Log.d("FirebaseCrashlytics", d, r12);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            e9.e eVar = (e9.e) obj;
            String str5 = eVar.a;
            String str6 = eVar.b;
            String str7 = eVar.c;
            int i14 = size;
            StringBuilder q13 = r0.q("Build id for ", str5, " on ", str6, ": ");
            q13.append(str7);
            String sb2 = q13.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            size = i14;
        }
        try {
            e9.a a10 = e9.a.a(context, xVar, str4, string, arrayList, new we.b((Object) context, 8));
            String str8 = "Installer package name is: " + a10.d;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str8, null);
            }
            ExecutorService a11 = e9.h.a("com.google.firebase.crashlytics.startup");
            new v9.d(10);
            String str9 = a10.f;
            String str10 = a10.g;
            String c11 = xVar.c();
            ya.b bVar3 = new ya.b(6);
            i iVar = new i(bVar3, 26);
            android.support.v4.media.c cVar6 = new android.support.v4.media.c(cVar);
            Locale locale = Locale.US;
            String o6 = aa.d.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
            d7 d7Var = new d7();
            if (o6 == null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            d7Var.a = o6;
            String str11 = Build.MANUFACTURER;
            String str12 = x.h;
            String z12 = aa.d.z(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
            int e14 = e9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e14 == 0) {
                e14 = e9.h.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e14 != 0 ? context.getResources().getString(e14) : null, str4, str10, str9};
            ArrayList arrayList2 = new ArrayList();
            int i15 = 0;
            while (i15 < 4) {
                String str13 = strArr[i15];
                String[] strArr2 = strArr;
                if (str13 != null) {
                    arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                }
                i15++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                sb3.append((String) obj2);
                arrayList2 = arrayList2;
            }
            String sb4 = sb3.toString();
            l9.c cVar7 = new l9.c(str4, z12, replaceAll, replaceAll2, xVar, sb4.length() > 0 ? e9.h.i(sb4) : null, str10, str9, e2.c.c(c11 != null ? 4 : 1));
            c3.h hVar2 = new c3.h();
            AtomicReference atomicReference = new AtomicReference();
            hVar2.h = atomicReference;
            hVar2.i = new AtomicReference(new TaskCompletionSource());
            hVar2.a = context;
            hVar2.b = cVar7;
            hVar2.d = bVar3;
            hVar2.c = iVar;
            hVar2.e = cVar6;
            hVar2.f = d7Var;
            hVar2.g = tVar;
            atomicReference.set(za.a.n(bVar3));
            AtomicReference atomicReference2 = (AtomicReference) hVar2.i;
            AtomicReference atomicReference3 = (AtomicReference) hVar2.h;
            if (!((Context) hVar2.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((l9.c) hVar2.b).f) || (c10 = hVar2.c(1)) == null) {
                l9.a c12 = hVar2.c(3);
                if (c12 != null) {
                    atomicReference3.set(c12);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                }
                t tVar2 = (t) hVar2.g;
                Task task2 = tVar2.h.getTask();
                synchronized (tVar2.c) {
                    task = tVar2.d.getTask();
                }
                ExecutorService executorService = z.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                y yVar = new y(0, taskCompletionSource);
                task2.continueWith(a11, yVar);
                task.continueWith(a11, yVar);
                onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a11, new fa.c(hVar2, 27));
            } else {
                atomicReference3.set(c10);
                ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.continueWith(a11, new u(1));
            com.google.firebase.messaging.t tVar3 = qVar.l;
            j9.c cVar8 = qVar.h;
            Context context2 = qVar.a;
            if (context2 != null && (resources = context2.getResources()) != null) {
                int e15 = e9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                if (e15 > 0) {
                    z10 = resources.getBoolean(e15);
                } else {
                    int e16 = e9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                    if (e16 > 0) {
                        z10 = Boolean.parseBoolean(context2.getString(e16));
                    }
                }
                aVar = a10;
                String str14 = aVar.b;
                if (z10) {
                    str = "FirebaseCrashlytics";
                    if (Log.isLoggable(str, 2)) {
                        Log.v(str, "Configured not to require a build ID.", null);
                    }
                } else {
                    str = "FirebaseCrashlytics";
                    if (TextUtils.isEmpty(str14)) {
                        Log.e(str, ".");
                        Log.e(str, ".     |  | ");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".   \\ |  | /");
                        Log.e(str, ".    \\    /");
                        Log.e(str, ".     \\  /");
                        Log.e(str, ".      \\/");
                        Log.e(str, ".");
                        Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        Log.e(str, ".");
                        Log.e(str, ".      /\\");
                        Log.e(str, ".     /  \\");
                        Log.e(str, ".    /    \\");
                        Log.e(str, ".   / |  | \\");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".");
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                }
                new e9.f(qVar.g);
                String str15 = e9.f.b;
                int i17 = 24;
                boolean z13 = false;
                qVar.e = new we.b("crash_marker", cVar8, z13, i17);
                qVar.d = new we.b("initialization_marker", cVar8, z13, i17);
                t3 t3Var = new t3(str15, cVar8, tVar3);
                f9.e eVar2 = new f9.e(cVar8);
                m9.a[] aVarArr = new m9.a[1];
                aVarArr[0] = new wa.a(15);
                g5.b bVar4 = new g5.b(aVarArr);
                ((p) qVar.o.b).a(new b(6));
                e9.a aVar4 = aVar;
                m k10 = m.k(qVar.a, qVar.g, qVar.h, aVar4, eVar2, t3Var, bVar4, hVar2, qVar.c, qVar.m);
                hVar2 = hVar2;
                qVar.f = new o(qVar.a, qVar.l, qVar.g, qVar.b, qVar.h, qVar.e, aVar4, t3Var, eVar2, k10, qVar.n, qVar.j, qVar.m);
                we.b bVar5 = qVar.d;
                j9.c cVar9 = (j9.c) bVar5.c;
                String str16 = (String) bVar5.b;
                cVar9.getClass();
                exists = new File(cVar9.b, str16).exists();
                Boolean.TRUE.equals((Boolean) z.a(tVar3.Q(new e9.p(qVar, 1))));
                o oVar = qVar.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                z11 = true;
                z11 = true;
                oVar.e.Q(new e9.m(z11 ? 1 : 0, oVar, str15));
                s sVar = new s(new fa.c(oVar, 13), hVar2, defaultUncaughtExceptionHandler, oVar.j);
                oVar.n = sVar;
                Thread.setDefaultUncaughtExceptionHandler(sVar);
                if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Successfully configured exception handler.", null);
                    }
                    Tasks.call(a11, new d(z11, qVar, hVar2));
                    return new e(qVar);
                }
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                }
                qVar.b(hVar2);
                z11 = false;
                Tasks.call(a11, new d(z11, qVar, hVar2));
                return new e(qVar);
            }
            aVar = a10;
            z10 = true;
            String str142 = aVar.b;
            if (z10) {
            }
            new e9.f(qVar.g);
            String str152 = e9.f.b;
            int i172 = 24;
            boolean z132 = false;
            qVar.e = new we.b("crash_marker", cVar8, z132, i172);
            qVar.d = new we.b("initialization_marker", cVar8, z132, i172);
            t3 t3Var2 = new t3(str152, cVar8, tVar3);
            f9.e eVar22 = new f9.e(cVar8);
            m9.a[] aVarArr2 = new m9.a[1];
            aVarArr2[0] = new wa.a(15);
            g5.b bVar42 = new g5.b(aVarArr2);
            ((p) qVar.o.b).a(new b(6));
            e9.a aVar42 = aVar;
            m k102 = m.k(qVar.a, qVar.g, qVar.h, aVar42, eVar22, t3Var2, bVar42, hVar2, qVar.c, qVar.m);
            hVar2 = hVar2;
            qVar.f = new o(qVar.a, qVar.l, qVar.g, qVar.b, qVar.h, qVar.e, aVar42, t3Var2, eVar22, k102, qVar.n, qVar.j, qVar.m);
            we.b bVar52 = qVar.d;
            j9.c cVar92 = (j9.c) bVar52.c;
            String str162 = (String) bVar52.b;
            cVar92.getClass();
            exists = new File(cVar92.b, str162).exists();
            Boolean.TRUE.equals((Boolean) z.a(tVar3.Q(new e9.p(qVar, 1))));
            o oVar2 = qVar.f;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            z11 = true;
            z11 = true;
            oVar2.e.Q(new e9.m(z11 ? 1 : 0, oVar2, str152));
            s sVar2 = new s(new fa.c(oVar2, 13), hVar2, defaultUncaughtExceptionHandler2, oVar2.j);
            oVar2.n = sVar2;
            Thread.setDefaultUncaughtExceptionHandler(sVar2);
            if (exists) {
            }
            if (Log.isLoggable(str, 3)) {
            }
            Tasks.call(a11, new d(z11, qVar, hVar2));
            return new e(qVar);
        } catch (PackageManager.NameNotFoundException e17) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e17);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ FingerprintManager d(Object obj) {
        return (FingerprintManager) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info h(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.a) {
            case 1:
                return b(bVar);
            case 17:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(bVar);
                return lambda$getComponents$0;
            default:
                Set x10 = bVar.x(fa.a.class);
                fa.c cVar = fa.c.c;
                if (cVar == null) {
                    synchronized (fa.c.class) {
                        try {
                            cVar = fa.c.c;
                            if (cVar == null) {
                                cVar = new fa.c(0);
                                fa.c.c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new fa.b(x10, cVar);
        }
    }

    @Override // e4.g
    public boolean a(int i9, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        switch (this.a) {
            case 18:
                ea.e eVar = (ea.e) obj;
                eVar.getClass();
                t5.c cVar = com.google.firebase.messaging.p.a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.c(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        t5.c a2 = w2.i.a();
                        a2.h(rawQuery.getString(1));
                        a2.d = g3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.b());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
        }
    }

    @Override // h3.f
    public h3.g c(Bundle bundle) {
        switch (this.a) {
            case 5:
                Bundle bundle2 = bundle.getBundle(b5.x.c);
                bundle2.getClass();
                i1 i1Var = (i1) i1.n.c(bundle2);
                int[] intArray = bundle.getIntArray(b5.x.d);
                intArray.getClass();
                return new b5.x(i1Var, intArray.length == 0 ? Collections.EMPTY_LIST : new q8.a(0, intArray.length, intArray));
            default:
                return new e5.b(bundle.getInt(e5.b.f, -1), bundle.getInt(e5.b.h, -1), bundle.getInt(e5.b.n, -1), bundle.getByteArray(e5.b.r));
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i9, z10);
    }

    @Override // x9.a
    public void e(x9.b bVar) {
        switch (this.a) {
            case 0:
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

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 7:
                break;
            case 10:
                c2Var.dismiss();
                break;
            case 11:
                c2Var.dismiss();
                break;
            case 28:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        switch (this.a) {
            case 8:
                return String.valueOf(i9);
            default:
                return String.format("%02d", Integer.valueOf(i9 * 5));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i9;
        boolean z10;
        switch (this.a) {
            case 14:
                i9 = 403;
                break;
            case 15:
                i9 = -1;
                break;
            default:
                if (task.isSuccessful()) {
                    e9.b bVar = (e9.b) task.getResult();
                    String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
                    b9.d dVar = b9.d.a;
                    dVar.b(str);
                    File file = bVar.c;
                    z10 = true;
                    if (file.delete()) {
                        dVar.b("Deleted report file: " + file.getPath());
                    } else {
                        dVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
        return Integer.valueOf(i9);
    }

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
    }

    private final void k(c2 c2Var, int i9) {
    }
}
