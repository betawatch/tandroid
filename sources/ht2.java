// default package

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ht2 implements ncc, nu3, qd3, tq2, Continuation, s69, OnSuccessListener, l8, yma, b86, ot2, id3, xj4, t69, fd, gc7, dj8, pn3, nr7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ht2(uj ujVar, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        this.a = (byte) 18;
        this.b = jt6Var;
    }

    @Override // s69
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        dr3 dr3Var = (dr3) this.b;
        dr3Var.e = l2dVar;
        mq5 H0 = hl.H0(l2dVar, false);
        mq5 H02 = hl.H0(l2dVar, true);
        if (!dr3Var.f.equals(H0) || !dr3Var.h.equals(H02)) {
            hl.m = H0.b;
            hl.n = H0.d;
            dr3Var.f = H0;
            dr3Var.h = H02;
            dr3Var.requestLayout();
        }
        int childCount = dr3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = dr3Var.getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                ihc.b(childAt, l2dVar);
            }
        }
        dr3Var.invalidate();
        return l2d.b;
    }

    @Override // pn3
    public final void a(long j, long j2) {
        long[] jArr = (long[]) this.b;
        ExecutorService executorService = DictationLid.a;
        long[] jArr2 = (long[]) DictationAsr.h.get("tinylid.bin");
        if (jArr2 != null) {
            jArr2[0] = j;
            if (j2 > 0) {
                jArr2[1] = j2;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - jArr[0] > 100) {
            jArr[0] = elapsedRealtime;
            DictationAsr.o();
        }
    }

    @Override // ot2
    public final void accept(Object obj) {
        ((mr3) obj).a((rj2) this.b);
    }

    @Override // gc7
    public final boolean b(TLRPC.TL_error tL_error) {
        ((o30) this.b).run();
        return true;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        String str;
        String str2;
        rx6 rx6Var;
        String str3;
        int i;
        int i2;
        int i3;
        Throwable th;
        li4 li4Var;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        hba b;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i4 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        ji4 ji4Var = (ji4) am2Var.a(ji4.class);
        ri4 ri4Var = (ri4) am2Var.a(ri4.class);
        au7 w = am2Var.w(az2.class);
        au7 w2 = am2Var.w(rj.class);
        au7 w3 = am2Var.w(ej4.class);
        ExecutorService executorService = (ExecutorService) am2Var.h(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) am2Var.h(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) am2Var.h(crashlyticsRegistrar.c);
        ji4Var.a();
        Context context = ji4Var.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        rx6 rx6Var2 = new rx6(executorService, executorService2);
        gd4 gd4Var = new gd4();
        String str4 = ((d90) no8.a.b(context)).a;
        gd4Var.a = str4;
        File filesDir = context.getFilesDir();
        gd4Var.b = filesDir;
        if (str4.isEmpty()) {
            str = "FirebaseCrashlytics";
            str2 = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            str = "FirebaseCrashlytics";
            sb.append(str4.length() > 40 ? jn2.k(str4) : str4.replaceAll("[^a-zA-Z0-9.]", "_"));
            str2 = sb.toString();
        }
        File file = new File(filesDir, str2);
        gd4.c(file);
        gd4Var.c = file;
        File file2 = new File(file, "open-sessions");
        gd4.c(file2);
        gd4Var.d = file2;
        File file3 = new File(file, "reports");
        gd4.c(file3);
        gd4Var.e = file3;
        File file4 = new File(file, "priority-reports");
        gd4.c(file4);
        gd4Var.f = file4;
        File file5 = new File(file, "native-reports");
        gd4.c(file5);
        gd4Var.g = file5;
        p63 p63Var = new p63(ji4Var);
        yl5 yl5Var = new yl5(context, packageName, ri4Var, p63Var);
        az2 az2Var = new az2(w);
        tj tjVar = new tj(w2);
        ty2 ty2Var = new ty2(p63Var, gd4Var);
        nj4 nj4Var = nj4.a;
        iaa iaaVar = iaa.a;
        nj4 nj4Var2 = nj4.a;
        lj4 a = nj4.a(iaaVar);
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + iaaVar + " already registered.");
        } else {
            a.b = ty2Var;
            Log.d("FirebaseSessions", "Subscriber " + iaaVar + " registered.");
            a.a.countDown();
        }
        String str5 = str;
        zc1 zc1Var = new zc1(ji4Var, yl5Var, az2Var, p63Var, new sj(tjVar), new sj(tjVar), gd4Var, ty2Var, new pq8((Object) w3, (byte) 5), rx6Var2);
        rx6 rx6Var3 = (rx6) zc1Var.n;
        ji4Var.a();
        String str6 = ji4Var.c.b;
        int e = jn2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = jn2.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string = e != 0 ? context.getResources().getString(e) : null;
        ArrayList arrayList = new ArrayList();
        int e2 = jn2.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = jn2.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = jn2.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e2 == 0 || e3 == 0 || e4 == 0) {
            rx6Var = rx6Var3;
            str3 = str6;
            i = 0;
            i2 = 1;
            i3 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e2), Integer.valueOf(e3), Integer.valueOf(e4));
            th = null;
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, format, null);
            }
        } else {
            i = 0;
            String[] stringArray = context.getResources().getStringArray(e2);
            String[] stringArray2 = context.getResources().getStringArray(e3);
            String[] stringArray3 = context.getResources().getStringArray(e4);
            i2 = 1;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i5 = 0;
                while (i5 < stringArray3.length) {
                    int i6 = i5;
                    arrayList.add(new d11(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                    i5 = i6 + 1;
                    str6 = str6;
                    rx6Var3 = rx6Var3;
                }
                rx6Var = rx6Var3;
                str3 = str6;
            } else {
                rx6Var = rx6Var3;
                str3 = str6;
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable(str5, 3)) {
                    Log.d(str5, format2, null);
                }
            }
            i3 = 3;
            th = null;
        }
        String i7 = c00.i("Mapping file ID is: ", string);
        if (Log.isLoggable(str5, i3)) {
            Log.d(str5, i7, th);
        }
        int size = arrayList.size();
        int i8 = i;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            d11 d11Var = (d11) obj;
            String str7 = d11Var.a;
            String str8 = d11Var.b;
            String str9 = d11Var.c;
            int i9 = size;
            StringBuilder l = xnb.l("Build id for ", str7, " on ", str8, ": ");
            l.append(str9);
            String sb2 = l.toString();
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, sb2, null);
            }
            size = i9;
        }
        String str10 = str3;
        try {
            er a2 = er.a(context, yl5Var, str10, string, arrayList, new qx6(context, (byte) 21));
            String str11 = "Installer package name is: " + a2.d;
            if (Log.isLoggable(str5, 2)) {
                Log.v(str5, str11, null);
            }
            new uif((byte) 20);
            String str12 = a2.f;
            String str13 = a2.g;
            String d = yl5Var.d();
            z3f z3fVar = new z3f((byte) 27);
            ve9 ve9Var = new ve9((Object) z3fVar, (byte) 8);
            ri6 ri6Var = new ri6(gd4Var);
            Locale locale = Locale.US;
            String y = qd4.y("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str10, "/settings");
            sc3 sc3Var = new sc3();
            sc3Var.a = y;
            String str14 = Build.MANUFACTURER;
            String str15 = yl5.h;
            String p = qd4.p(str14.replaceAll(str15, ""), "/", Build.MODEL.replaceAll(str15, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, "");
            int e5 = jn2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = jn2.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e5 != 0 ? context.getResources().getString(e5) : null, str10, str13, str12};
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (i10 < 4) {
                String str16 = strArr[i10];
                String[] strArr2 = strArr;
                if (str16 != null) {
                    arrayList2.add(str16.replace("-", "").toLowerCase(Locale.US));
                }
                i10++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                sb3.append((String) obj2);
                str12 = str12;
            }
            String str17 = str12;
            String sb4 = sb3.toString();
            oy8 oy8Var = new oy8(context, new bca(str10, p, replaceAll, replaceAll2, yl5Var, sb4.length() > 0 ? jn2.k(sb4) : null, str13, str17, bs2.h(d != null ? 4 : i2)), z3fVar, ve9Var, ri6Var, sc3Var, p63Var);
            AtomicReference atomicReference = (AtomicReference) oy8Var.h;
            AtomicReference atomicReference2 = oy8Var.a;
            byte b2 = 28;
            if (!((Context) oy8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((bca) oy8Var.c).f) || (b = oy8Var.b(i2)) == null) {
                hba b3 = oy8Var.b(3);
                if (b3 != null) {
                    atomicReference2.set(b3);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(b3);
                }
                p63 p63Var2 = (p63) oy8Var.g;
                Task task2 = p63Var2.h.getTask();
                synchronized (p63Var2.c) {
                    task = p63Var2.d.getTask();
                }
                onSuccessTask = ur5.c(task2, task).onSuccessTask((i03) rx6Var2.b, new um4(oy8Var, rx6Var2, false, b2));
            } else {
                atomicReference2.set(b);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(b);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.addOnFailureListener(executorService3, new su3(b2));
            gd4 gd4Var2 = (gd4) zc1Var.h;
            Context context2 = (Context) zc1Var.a;
            boolean c = jn2.c(context2, "com.google.firebase.crashlytics.RequireBuildId", jn2.c(context2, "com.crashlytics.RequireBuildId", true));
            String str18 = a2.b;
            if (c) {
                if (TextUtils.isEmpty(str18)) {
                    Log.e(str5, ".");
                    Log.e(str5, ".     |  | ");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".   \\ |  | /");
                    Log.e(str5, ".    \\    /");
                    Log.e(str5, ".     \\  /");
                    Log.e(str5, ".      \\/");
                    Log.e(str5, ".");
                    Log.e(str5, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    Log.e(str5, ".");
                    Log.e(str5, ".      /\\");
                    Log.e(str5, ".     /  \\");
                    Log.e(str5, ".    /    \\");
                    Log.e(str5, ".   / |  | \\");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".");
                    grb.i("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    return null;
                }
            } else if (Log.isLoggable(str5, 2)) {
                Log.v(str5, "Configured not to require a build ID.", null);
            }
            String str19 = new r51().a;
            try {
                byte b4 = 18;
                zc1Var.e = new lh2("crash_marker", gd4Var2, b4);
                zc1Var.d = new lh2("initialization_marker", gd4Var2, b4);
                rx6 rx6Var4 = rx6Var;
                gd4 gd4Var3 = new gd4(str19, gd4Var2, rx6Var4);
                lh2 lh2Var = new lh2(gd4Var2);
                ym4 ym4Var = new ym4(new mqa[]{new uif((byte) 24)});
                ((au7) ((pq8) zc1Var.m).b).a(new iy8((byte) 6));
                zc1Var.f = new yy2((Context) zc1Var.a, (yl5) zc1Var.g, (p63) zc1Var.b, (gd4) zc1Var.h, (lh2) zc1Var.e, a2, gd4Var3, lh2Var, faa.d((Context) zc1Var.a, (yl5) zc1Var.g, (gd4) zc1Var.h, a2, lh2Var, gd4Var3, ym4Var, oy8Var, (ym4) zc1Var.c, (ty2) zc1Var.k, (rx6) zc1Var.n), (az2) zc1Var.l, (sj) zc1Var.j, (ty2) zc1Var.k, (rx6) zc1Var.n);
                lh2 lh2Var2 = (lh2) zc1Var.d;
                boolean exists = new File((File) ((gd4) lh2Var2.c).c, (String) lh2Var2.b).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((i03) rx6Var4.b).a.submit(new mk(zc1Var, (byte) 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                yy2 yy2Var = (yy2) zc1Var.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                ((i03) yy2Var.e.b).a(new bv2((Object) yy2Var, (Object) str19, (byte) 5));
                h03 h03Var = new h03(new zm9((Object) yy2Var, (byte) 22), oy8Var, defaultUncaughtExceptionHandler, yy2Var.j);
                yy2Var.n = h03Var;
                Thread.setDefaultUncaughtExceptionHandler(h03Var);
                if (Build.VERSION.SDK_INT >= 37) {
                    ((yy2) zc1Var.f).c(str19);
                }
                if (!exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str5, 3)) {
                        Log.d(str5, "Successfully configured exception handler.", null);
                    }
                    ((i03) rx6Var4.b).a(new zy2(zc1Var, oy8Var, (byte) 0));
                } else {
                    if (Log.isLoggable(str5, 3)) {
                        Log.d(str5, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    }
                    zc1Var.b(oy8Var);
                }
            } catch (Exception e6) {
                Log.e(str5, "Crashlytics was not started due to an exception during initialization", e6);
                zc1Var.f = null;
            }
            li4Var = new li4(zc1Var);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(str5, "Error retrieving app package info.", e7);
            li4Var = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            String n = ik8.n(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, n, null);
            }
        }
        return li4Var;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        b8c G;
        Object obj;
        long j;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                j13 j13Var = (j13) obj2;
                HashSet hashSet = j13Var.W1;
                if (!j13Var.X1 && (G = j13Var.Y1.G(i - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                    }
                    if (view instanceof e3a) {
                        ((e3a) view).c(hashSet.contains(Long.valueOf(j)), true);
                        break;
                    }
                }
                break;
            default:
                ((DataAutoDownloadActivity) obj2).p0(f, i, view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0227  */
    @Override // t69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i, final View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.Chat chat;
        String str;
        zm2 zm2Var;
        boolean z;
        boolean z2;
        fu5 fu5Var;
        final byte b;
        int i9;
        Drawable drawable;
        final ii3 ii3Var = (ii3) this.b;
        if (ii3Var.O == 0.0f && ii3Var.o0 == 0.0f) {
            final long j = ((og3) view).F;
            uj3 uj3Var = ii3Var.P0;
            i2 = ((e) uj3Var).currentAccount;
            byte b2 = 1;
            ls6.d0(i2).O0(true);
            fu5 I = fu5.I(uj3Var, view);
            I.z.set(0, hl.L(8.0f), 0, 0);
            I.X(aob.c0(hl.L(12.0f), hl.L(12.0f), uj3Var.getThemedColor(aob.d6)));
            I.b0(0.0f, hl.L(8.0f));
            uj3Var.M0 = I;
            if (!lbc.C(j)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i3 = ((e) uj3Var).currentAccount;
                byte b3 = 2;
                byte b4 = 3;
                if (j != yac.h(i3).e()) {
                    final TLRPC.User X1 = uj3Var.getMessagesController().X1(Long.valueOf(j));
                    TLRPC.Chat M0 = uj3Var.getMessagesController().M0(Long.valueOf(-j));
                    String p = ip7.p(j, 0L, false);
                    i4 = ((e) uj3Var).currentAccount;
                    boolean c0 = NotificationsCustomSettingsActivity.c0(i4, j);
                    i5 = ((e) uj3Var).currentAccount;
                    boolean M3 = uc7.s1(i5).M3();
                    i6 = ((e) uj3Var).currentAccount;
                    boolean p2 = yac.h(i6).p();
                    i7 = ((e) uj3Var).currentAccount;
                    boolean K = uc7.s1(i7).O1().K(j);
                    i8 = ((e) uj3Var).currentAccount;
                    boolean G = uc7.s1(i8).O1().G(j);
                    if (M3 || j <= 0 || p2 || (drawable = ii3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2)) == null) {
                        chat = M0;
                        str = p;
                        zm2Var = null;
                    } else {
                        Drawable drawable2 = ii3Var.getContext().getDrawable(R.drawable.msg_stealth_locked);
                        if (drawable2 != null) {
                            chat = M0;
                            yob.x(ii3Var, drawable2, aob.F8, uj3Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = M0;
                        }
                        str = p;
                        drawable.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        zm2Var = new zm2(drawable2, drawable);
                    }
                    if (j < 0 && uj3Var.v3().i(j)) {
                        final byte b5 = 4;
                        uj3Var.M0.a(R.drawable.msg_stories_add, null, ob6.M0(2131754377, null), null, aob.F8, aob.E8, new Runnable() { // from class: ei3
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10;
                                byte b6 = b5;
                                long j2 = j;
                                ii3 ii3Var2 = ii3Var;
                                switch (b6) {
                                    case 0:
                                        ii3Var2.P0.presentFragment(zu1.ha(j2));
                                        break;
                                    case 1:
                                        hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                        break;
                                    case 2:
                                        hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                        break;
                                    case 3:
                                        uj3 uj3Var2 = ii3Var2.P0;
                                        i10 = ((e) uj3Var2).currentAccount;
                                        ls6.d0(i10).Q1(j2);
                                        uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                        break;
                                    case 4:
                                        ii3Var2.P0.F0.j(j2);
                                        break;
                                    case 5:
                                        ii3Var2.P0.presentFragment(zu1.ha(j2));
                                        break;
                                    default:
                                        ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                        break;
                                }
                            }
                        });
                    }
                    if (X1 != null && !X1.contact) {
                        i9 = ((e) uj3Var).currentAccount;
                        if (ls6.d0(i9).I(j)) {
                            z = true;
                            fu5 fu5Var2 = uj3Var.M0;
                            final byte b6 = 5;
                            fu5Var2.k(R.drawable.msg_discussion, ob6.M0(2131745329, null), new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b6;
                                    long j2 = j;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b62) {
                                        case 0:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        case 1:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            ls6.d0(i10).Q1(j2);
                                            uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            ii3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        default:
                                            ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                            break;
                                    }
                                }
                            }, j <= 0);
                            final byte b7 = 6;
                            fu5Var2.k(R.drawable.msg_openprofile, ob6.M0(2131747513, null), new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b7;
                                    long j2 = j;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b62) {
                                        case 0:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        case 1:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            ls6.d0(i10).Q1(j2);
                                            uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            ii3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        default:
                                            ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                            break;
                                    }
                                }
                            }, j <= 0);
                            final byte b8 = 0;
                            fu5Var2.k(R.drawable.msg_channel, ob6.M0(!xc2.V(chat) ? 2131747538 : 2131747526, null), new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b8;
                                    long j2 = j;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b62) {
                                        case 0:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        case 1:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            ls6.d0(i10).Q1(j2);
                                            uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            ii3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        default:
                                            ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                            break;
                                    }
                                }
                            }, j >= 0);
                            final byte b9 = 0;
                            final String str2 = str;
                            fu5Var2.k(R.drawable.msg_mute, ob6.M0(2131747590, null), new Runnable() { // from class: fi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    String trim;
                                    int i11;
                                    byte b10 = b9;
                                    TLRPC.User user = X1;
                                    String str3 = str2;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b10) {
                                        case 0:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            uc7.s1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                            uj3Var2.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            d31.b0(uj3Var2).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, trim)), null, null).j();
                                            break;
                                        default:
                                            uj3 uj3Var3 = ii3Var2.P0;
                                            i11 = ((e) uj3Var3).currentAccount;
                                            uc7.s1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                            uj3Var3.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            d31.b0(uj3Var3).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c0 && j > 0);
                            fu5Var2.F();
                            final byte b10 = 1;
                            fu5Var2.k(R.drawable.msg_unmute, ob6.M0(2131747587, null), new Runnable() { // from class: fi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    String trim;
                                    int i11;
                                    byte b102 = b10;
                                    TLRPC.User user = X1;
                                    String str3 = str2;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b102) {
                                        case 0:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            uc7.s1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                            uj3Var2.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            d31.b0(uj3Var2).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, trim)), null, null).j();
                                            break;
                                        default:
                                            uj3 uj3Var3 = ii3Var2.P0;
                                            i11 = ((e) uj3Var3).currentAccount;
                                            uc7.s1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                            uj3Var3.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            d31.b0(uj3Var3).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c0 && j > 0);
                            fu5Var2.F();
                            final byte b11 = 0;
                            fu5Var2.k(R.drawable.msg_stories_stealth2, ob6.M0(2131743214, null), new Runnable() { // from class: gi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    vnb vnbVar;
                                    int i10;
                                    vnb vnbVar2;
                                    byte b12 = b11;
                                    byte b13 = 0;
                                    View view2 = view;
                                    ii3 ii3Var2 = ii3Var;
                                    byte b14 = 1;
                                    switch (b12) {
                                        case 0:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(yac.t0).O1().B;
                                            if (tL_storiesStealthMode != null) {
                                                i10 = ((e) uj3Var2).currentAccount;
                                                if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof og3) {
                                                        uj3Var2.F0.i((og3) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = ii3Var2.getContext();
                                            vnbVar = ((e) uj3Var2).resourceProvider;
                                            g2b g2bVar = new g2b(context, 0.0f, 1, vnbVar);
                                            g2bVar.o1 = new hi3(ii3Var2, view2, b14);
                                            uj3Var2.showDialog(g2bVar);
                                            break;
                                        default:
                                            Context context2 = ii3Var2.getContext();
                                            uj3 uj3Var3 = ii3Var2.P0;
                                            vnbVar2 = ((e) uj3Var3).resourceProvider;
                                            g2b g2bVar2 = new g2b(context2, 0.0f, 1, vnbVar2);
                                            g2bVar2.o1 = new hi3(ii3Var2, view2, b13);
                                            uj3Var3.showDialog(g2bVar2);
                                            break;
                                    }
                                }
                            }, M3 && j > 0 && p2 && K && !G);
                            fu5Var2.F();
                            z2 = M3 && j > 0 && !p2 && K && !G;
                            String M02 = ob6.M0(2131743214, null);
                            final byte b12 = 1;
                            Runnable runnable = new Runnable() { // from class: gi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    vnb vnbVar;
                                    int i10;
                                    vnb vnbVar2;
                                    byte b122 = b12;
                                    byte b13 = 0;
                                    View view2 = view;
                                    ii3 ii3Var2 = ii3Var;
                                    byte b14 = 1;
                                    switch (b122) {
                                        case 0:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(yac.t0).O1().B;
                                            if (tL_storiesStealthMode != null) {
                                                i10 = ((e) uj3Var2).currentAccount;
                                                if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof og3) {
                                                        uj3Var2.F0.i((og3) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = ii3Var2.getContext();
                                            vnbVar = ((e) uj3Var2).resourceProvider;
                                            g2b g2bVar = new g2b(context, 0.0f, 1, vnbVar);
                                            g2bVar.o1 = new hi3(ii3Var2, view2, b14);
                                            uj3Var2.showDialog(g2bVar);
                                            break;
                                        default:
                                            Context context2 = ii3Var2.getContext();
                                            uj3 uj3Var3 = ii3Var2.P0;
                                            vnbVar2 = ((e) uj3Var3).resourceProvider;
                                            g2b g2bVar2 = new g2b(context2, 0.0f, 1, vnbVar2);
                                            g2bVar2.o1 = new hi3(ii3Var2, view2, b13);
                                            uj3Var3.showDialog(g2bVar2);
                                            break;
                                    }
                                }
                            };
                            if (z2) {
                                fu5Var = fu5Var2;
                            } else {
                                fu5Var2.a(R.drawable.msg_stories_stealth2, zm2Var, M02, null, aob.F8, aob.E8, runnable);
                                fu5Var = fu5Var2;
                            }
                            fu5Var.F();
                            boolean z3 = z && !uj3Var.F3();
                            String M03 = ob6.M0(2131754146, null);
                            final char c = 1 == true ? 1 : 0;
                            fu5Var.k(R.drawable.msg_archive, M03, new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = c;
                                    long j2 = j;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b62) {
                                        case 0:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        case 1:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            ls6.d0(i10).Q1(j2);
                                            uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            ii3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        default:
                                            ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                            break;
                                    }
                                }
                            }, z3);
                            fu5Var.F();
                            final byte b13 = 2;
                            fu5Var.k(R.drawable.msg_unarchive, ob6.M0(2131743569, null), new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b13;
                                    long j2 = j;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b62) {
                                        case 0:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        case 1:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            ls6.d0(i10).Q1(j2);
                                            uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            ii3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        default:
                                            ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                            break;
                                    }
                                }
                            }, z && uj3Var.F3());
                            fu5Var.F();
                            b = 3;
                            fu5Var.k(R.drawable.msg_delete, ob6.M0(2131744405, null), new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b;
                                    long j2 = j;
                                    ii3 ii3Var2 = ii3Var;
                                    switch (b62) {
                                        case 0:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        case 1:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            uj3 uj3Var2 = ii3Var2.P0;
                                            i10 = ((e) uj3Var2).currentAccount;
                                            ls6.d0(i10).Q1(j2);
                                            uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            ii3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            ii3Var2.P0.presentFragment(zu1.ha(j2));
                                            break;
                                        default:
                                            ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                            break;
                                    }
                                }
                            }, z);
                        }
                    }
                    z = false;
                    fu5 fu5Var22 = uj3Var.M0;
                    final byte b62 = 5;
                    fu5Var22.k(R.drawable.msg_discussion, ob6.M0(2131745329, null), new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b62;
                            long j2 = j;
                            ii3 ii3Var2 = ii3Var;
                            switch (b622) {
                                case 0:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                case 1:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    ls6.d0(i10).Q1(j2);
                                    uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                    break;
                                case 4:
                                    ii3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                default:
                                    ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                    break;
                            }
                        }
                    }, j <= 0);
                    final byte b72 = 6;
                    fu5Var22.k(R.drawable.msg_openprofile, ob6.M0(2131747513, null), new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b72;
                            long j2 = j;
                            ii3 ii3Var2 = ii3Var;
                            switch (b622) {
                                case 0:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                case 1:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    ls6.d0(i10).Q1(j2);
                                    uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                    break;
                                case 4:
                                    ii3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                default:
                                    ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                    break;
                            }
                        }
                    }, j <= 0);
                    final byte b82 = 0;
                    fu5Var22.k(R.drawable.msg_channel, ob6.M0(!xc2.V(chat) ? 2131747538 : 2131747526, null), new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b82;
                            long j2 = j;
                            ii3 ii3Var2 = ii3Var;
                            switch (b622) {
                                case 0:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                case 1:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    ls6.d0(i10).Q1(j2);
                                    uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                    break;
                                case 4:
                                    ii3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                default:
                                    ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                    break;
                            }
                        }
                    }, j >= 0);
                    final byte b92 = 0;
                    final String str22 = str;
                    fu5Var22.k(R.drawable.msg_mute, ob6.M0(2131747590, null), new Runnable() { // from class: fi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            String trim;
                            int i11;
                            byte b102 = b92;
                            TLRPC.User user = X1;
                            String str3 = str22;
                            ii3 ii3Var2 = ii3Var;
                            switch (b102) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    uc7.s1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                    uj3Var2.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    d31.b0(uj3Var2).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, trim)), null, null).j();
                                    break;
                                default:
                                    uj3 uj3Var3 = ii3Var2.P0;
                                    i11 = ((e) uj3Var3).currentAccount;
                                    uc7.s1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                    uj3Var3.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    d31.b0(uj3Var3).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, !c0 && j > 0);
                    fu5Var22.F();
                    final byte b102 = 1;
                    fu5Var22.k(R.drawable.msg_unmute, ob6.M0(2131747587, null), new Runnable() { // from class: fi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            String trim;
                            int i11;
                            byte b1022 = b102;
                            TLRPC.User user = X1;
                            String str3 = str22;
                            ii3 ii3Var2 = ii3Var;
                            switch (b1022) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    uc7.s1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                    uj3Var2.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    d31.b0(uj3Var2).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, trim)), null, null).j();
                                    break;
                                default:
                                    uj3 uj3Var3 = ii3Var2.P0;
                                    i11 = ((e) uj3Var3).currentAccount;
                                    uc7.s1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                    uj3Var3.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    d31.b0(uj3Var3).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, c0 && j > 0);
                    fu5Var22.F();
                    final byte b112 = 0;
                    fu5Var22.k(R.drawable.msg_stories_stealth2, ob6.M0(2131743214, null), new Runnable() { // from class: gi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            vnb vnbVar;
                            int i10;
                            vnb vnbVar2;
                            byte b122 = b112;
                            byte b132 = 0;
                            View view2 = view;
                            ii3 ii3Var2 = ii3Var;
                            byte b14 = 1;
                            switch (b122) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(yac.t0).O1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i10 = ((e) uj3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof og3) {
                                                uj3Var2.F0.i((og3) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = ii3Var2.getContext();
                                    vnbVar = ((e) uj3Var2).resourceProvider;
                                    g2b g2bVar = new g2b(context, 0.0f, 1, vnbVar);
                                    g2bVar.o1 = new hi3(ii3Var2, view2, b14);
                                    uj3Var2.showDialog(g2bVar);
                                    break;
                                default:
                                    Context context2 = ii3Var2.getContext();
                                    uj3 uj3Var3 = ii3Var2.P0;
                                    vnbVar2 = ((e) uj3Var3).resourceProvider;
                                    g2b g2bVar2 = new g2b(context2, 0.0f, 1, vnbVar2);
                                    g2bVar2.o1 = new hi3(ii3Var2, view2, b132);
                                    uj3Var3.showDialog(g2bVar2);
                                    break;
                            }
                        }
                    }, M3 && j > 0 && p2 && K && !G);
                    fu5Var22.F();
                    if (M3) {
                    }
                    String M022 = ob6.M0(2131743214, null);
                    final byte b122 = 1;
                    Runnable runnable2 = new Runnable() { // from class: gi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            vnb vnbVar;
                            int i10;
                            vnb vnbVar2;
                            byte b1222 = b122;
                            byte b132 = 0;
                            View view2 = view;
                            ii3 ii3Var2 = ii3Var;
                            byte b14 = 1;
                            switch (b1222) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(yac.t0).O1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i10 = ((e) uj3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof og3) {
                                                uj3Var2.F0.i((og3) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = ii3Var2.getContext();
                                    vnbVar = ((e) uj3Var2).resourceProvider;
                                    g2b g2bVar = new g2b(context, 0.0f, 1, vnbVar);
                                    g2bVar.o1 = new hi3(ii3Var2, view2, b14);
                                    uj3Var2.showDialog(g2bVar);
                                    break;
                                default:
                                    Context context2 = ii3Var2.getContext();
                                    uj3 uj3Var3 = ii3Var2.P0;
                                    vnbVar2 = ((e) uj3Var3).resourceProvider;
                                    g2b g2bVar2 = new g2b(context2, 0.0f, 1, vnbVar2);
                                    g2bVar2.o1 = new hi3(ii3Var2, view2, b132);
                                    uj3Var3.showDialog(g2bVar2);
                                    break;
                            }
                        }
                    };
                    if (z2) {
                    }
                    fu5Var.F();
                    if (z) {
                    }
                    String M032 = ob6.M0(2131754146, null);
                    final byte c2 = 1 == true ? 1 : 0;
                    fu5Var.k(R.drawable.msg_archive, M032, new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = c2;
                            long j2 = j;
                            ii3 ii3Var2 = ii3Var;
                            switch (b622) {
                                case 0:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                case 1:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    ls6.d0(i10).Q1(j2);
                                    uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                    break;
                                case 4:
                                    ii3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                default:
                                    ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                    break;
                            }
                        }
                    }, z3);
                    fu5Var.F();
                    final byte b132 = 2;
                    fu5Var.k(R.drawable.msg_unarchive, ob6.M0(2131743569, null), new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b132;
                            long j2 = j;
                            ii3 ii3Var2 = ii3Var;
                            switch (b622) {
                                case 0:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                case 1:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    ls6.d0(i10).Q1(j2);
                                    uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                    break;
                                case 4:
                                    ii3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                default:
                                    ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                    break;
                            }
                        }
                    }, z && uj3Var.F3());
                    fu5Var.F();
                    b = 3;
                    fu5Var.k(R.drawable.msg_delete, ob6.M0(2131744405, null), new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b;
                            long j2 = j;
                            ii3 ii3Var2 = ii3Var;
                            switch (b622) {
                                case 0:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                case 1:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    hl.d3(new ih3(ii3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    uj3 uj3Var2 = ii3Var2.P0;
                                    i10 = ((e) uj3Var2).currentAccount;
                                    ls6.d0(i10).Q1(j2);
                                    uj3Var2.getMessagesController().O1().l0(j2, true, false);
                                    break;
                                case 4:
                                    ii3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    ii3Var2.P0.presentFragment(zu1.ha(j2));
                                    break;
                                default:
                                    ii3Var2.P0.presentFragment(ProfileActivity.Q2(j2));
                                    break;
                            }
                        }
                    }, z);
                } else if (uj3Var.R3) {
                    fu5 fu5Var3 = uj3Var.M0;
                    String M04 = ob6.M0(2131754377, null);
                    int i10 = aob.F8;
                    int i11 = aob.E8;
                    fu5Var3.a(R.drawable.msg_stories_add, null, M04, null, i10, i11, new gg3(ii3Var, b2));
                    uj3Var.M0.a(R.drawable.msg_stories_archive, null, ob6.M0(2131754116, null), null, i10, i11, new gg3(ii3Var, b3));
                    uj3Var.M0.a(R.drawable.msg_stories_saved, null, ob6.M0(2131745613, null), null, i10, i11, new gg3(ii3Var, b4));
                    b = 3;
                } else {
                    ii3 ii3Var2 = uj3Var.F0;
                    if (ii3Var2 != null) {
                        ii3Var2.n();
                    }
                }
                fu5 fu5Var4 = uj3Var.M0;
                fu5Var4.i = b;
                fu5Var4.b0(hl.L(-8.0f), hl.L(-10.0f));
                fu5Var4.a0();
                return false;
            }
            yw0.E.a();
        }
        return false;
    }

    @Override // qd3
    public final void f(vw8 vw8Var) {
        az2 az2Var = (az2) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        az2Var.b.set((az2) vw8Var.get());
    }

    @Override // xj4
    public final void g(float f) {
        zec zecVar = ((uec) this.b).b;
        if (zecVar.f == f) {
            return;
        }
        zecVar.f = f;
        zecVar.c(false);
    }

    @Override // nu3
    public final void h() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                ((vj) obj).u((e64) obj2);
                break;
            case 16:
                ((vj) obj).onSeekStarted((uj) obj2);
                break;
            case 17:
                ((vj) obj).j((p93) obj2);
                break;
            default:
                ((vj) obj).i((jt6) obj2);
                break;
        }
    }

    @Override // yma
    public final void j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((t20) this.b).e;
        kq3 kq3Var = (kq3) dataAutoDownloadActivity.c.get(i);
        if (kq3Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (kq3Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (kq3Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i9 = dataAutoDownloadActivity.f;
        if (i9 == 0) {
            i8 = ((e) dataAutoDownloadActivity).currentAccount;
            lq3.q(i8).Q = dataAutoDownloadActivity.e;
        } else if (i9 == 1) {
            i3 = ((e) dataAutoDownloadActivity).currentAccount;
            lq3.q(i3).R = dataAutoDownloadActivity.e;
        } else {
            i2 = ((e) dataAutoDownloadActivity).currentAccount;
            lq3.q(i2).S = dataAutoDownloadActivity.e;
        }
        i4 = ((e) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = uc7.s1(i4).X3.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i5 = ((e) dataAutoDownloadActivity).currentAccount;
        lq3.q(i5).g();
        for (int i10 = 0; i10 < 4; i10++) {
            d79 d79Var = dataAutoDownloadActivity.b;
            i6 = dataAutoDownloadActivity.photosRow;
            f89 L = d79Var.L(i6 + i10);
            if (L != null) {
                t20 t20Var = dataAutoDownloadActivity.a;
                i7 = dataAutoDownloadActivity.photosRow;
                t20Var.t(L, i7 + i10);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        cu2 cu2Var = (cu2) this.b;
        View view = (View) obj2;
        int i = ((b8c) obj).d;
        if (i != 1) {
            if (i == 2) {
                boolean z = !cu2Var.Y;
                cu2Var.Y = z;
                ((wkb) view).setChecked(z);
                return;
            }
            return;
        }
        TLRPC.User X1 = cu2Var.getMessagesController().X1(Long.valueOf(cu2Var.I));
        if (X1 == null || cu2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cu2Var.r, cu2Var.getParentActivity());
        String M0 = ob6.M0(2131751517, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131754096, null);
        alertDialog$Builder.j(ob6.M0(2131751563, null), new q72((Object) cu2Var, (Object) X1, (byte) 10));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    @Override // id3
    public final j99 l(int i, t1c t1cVar, int[] iArr) {
        gd3 gd3Var = (gd3) this.b;
        mo5 p = po5.p();
        for (int i2 = 0; i2 < t1cVar.a; i2++) {
            p.c(new dd3(i, t1cVar, i2, gd3Var, iArr[i2]));
        }
        return p.f();
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        n8 n8Var = (n8) ((g9) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n8Var != null && n8Var.isShowing()) {
            n8Var.d(true);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                ((m13) obj2).invoke(obj);
                break;
            case 8:
                ((m23) obj2).invoke(obj);
                break;
            case 9:
                ((m23) obj2).invoke(obj);
                break;
            case 10:
                ((m23) obj2).invoke(obj);
                break;
            default:
                ((c33) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (Task) ((wy2) this.b).call();
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 23:
                ((ue2) obj).run();
                break;
            default:
                ((gu3) obj).a.d.p();
                break;
        }
    }

    public /* synthetic */ ht2(uj ujVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ ht2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // yma
    public final void m() {
    }

    private final void c(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }
}
