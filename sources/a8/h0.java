package a8;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h0 implements la.a, com.google.android.gms.common.api.internal.r, q81, z3.d, j4.a0 {
    public static h0 e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ h0(int i10, boolean z10) {
        this.a = i10;
    }

    public static final URL f(h0 h0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) h0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        bb.b bVar = (bb.b) h0Var.b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        bb.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }

    public static String j(String str, HashMap hashMap) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return a1.g.D(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return b10.u(str, sb3);
    }

    @Override // j4.a0
    public void a(e2.x xVar) {
        long d;
        ((e2.k0) this.c).getClass();
        String str = e2.n0.a;
        e2.k0 k0Var = (e2.k0) this.c;
        synchronized (k0Var) {
            try {
                long j10 = k0Var.c;
                d = j10 != -9223372036854775807L ? j10 + k0Var.b : k0Var.d();
            } finally {
            }
        }
        long e10 = ((e2.k0) this.c).e();
        if (d == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        b2.x xVar2 = (b2.x) this.b;
        if (e10 != xVar2.x) {
            b2.w a2 = xVar2.a();
            a2.w = e10;
            b2.x xVar3 = new b2.x(a2);
            this.b = xVar3;
            ((c3.j0) this.d).b(xVar3);
        }
        int a10 = xVar.a();
        ((c3.j0) this.d).d(a10, xVar);
        ((c3.j0) this.d).c(d, 1, a10, 0, null);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        d6.e0 e0Var = (d6.e0) this.b;
        String str = (String) this.c;
        d6.i iVar = (d6.i) this.d;
        h6.w wVar = (h6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        o6.l.j("Not connected to device", e0Var.F == 2);
        h6.f fVar = (h6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        com.google.android.gms.internal.cast.t.c(N0, iVar);
        fVar.S0(N0, 13);
        synchronized (e0Var.r) {
            try {
                if (e0Var.o != null) {
                    e0Var.i(2477);
                }
                e0Var.o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j4.a0
    public void b(e2.k0 k0Var, c3.q qVar, j4.f0 f0Var) {
        this.c = k0Var;
        f0Var.b();
        f0Var.c();
        c3.j0 F1 = qVar.F1(f0Var.c, 5);
        this.d = F1;
        F1.b((b2.x) this.b);
    }

    @Override // z3.d
    public int c(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = e2.n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // la.a
    public /* bridge */ /* synthetic */ la.a d(Class cls, ka.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // z3.d
    public long e(int i10) {
        long[] jArr = (long[]) this.d;
        yb.g(i10 >= 0);
        yb.g(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // z3.d
    public List g(long j10) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.d(19));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).a;
            arrayList.add(new d2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i12, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h(int i10) {
        BiometricManager biometricManager;
        int a2;
        BiometricPrompt.CryptoObject b10;
        l6.h hVar = (l6.h) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return androidx.biometric.r.a(biometricManager2, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!z0.b(i10)) {
            return -2;
        }
        if (i10 == 0) {
            return 12;
        }
        Context context = hVar.a;
        if (androidx.biometric.f0.a(context) == null) {
            return 12;
        }
        int i12 = 0;
        if (z0.a(i10)) {
            KeyguardManager a10 = androidx.biometric.f0.a(context);
            return a10 == null ? false : androidx.biometric.f0.b(a10) ? 0 : 11;
        }
        if (i11 != 29) {
            if (i11 != 28) {
                return i();
            }
            if (!((context == null || context.getPackageManager() == null || !androidx.biometric.g0.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager a11 = androidx.biometric.f0.a(hVar.a);
            return !(a11 == null ? false : androidx.biometric.f0.b(a11)) ? i() : i() == 0 ? 0 : -1;
        }
        if ((i10 & 255) == 255) {
            BiometricManager biometricManager3 = (BiometricManager) this.c;
            if (biometricManager3 != null) {
                return androidx.biometric.q.a(biometricManager3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c10 = androidx.biometric.q.c();
        if (c10 != null && (b10 = b1.b(b1.a())) != null) {
            try {
                Object invoke = c10.invoke((BiometricManager) this.c, b10);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                biometricManager = (BiometricManager) this.c;
                if (biometricManager != null) {
                }
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30) {
                    while (r5 < r4) {
                    }
                }
                r3 = false;
                return r3 ? a2 : a2;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                biometricManager = (BiometricManager) this.c;
                if (biometricManager != null) {
                }
                String str2 = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30) {
                }
                r3 = false;
                if (r3) {
                }
            } catch (InvocationTargetException e12) {
                e = e12;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                biometricManager = (BiometricManager) this.c;
                if (biometricManager != null) {
                }
                String str22 = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30) {
                }
                r3 = false;
                if (r3) {
                }
            }
        }
        biometricManager = (BiometricManager) this.c;
        if (biometricManager != null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            a2 = 1;
        } else {
            a2 = androidx.biometric.q.a(biometricManager);
        }
        String str222 = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str222 != null) {
            for (String str3 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                if (str222.equals(str3)) {
                    break;
                }
            }
        }
        r3 = false;
        if (r3 && a2 == 0) {
            KeyguardManager a12 = androidx.biometric.f0.a(hVar.a);
            if (!(a12 == null ? false : androidx.biometric.f0.b(a12))) {
                i12 = i();
            } else if (i() != 0) {
                i12 = -1;
            }
            return i12;
        }
    }

    public int i() {
        l6.h hVar = (l6.h) this.d;
        if (hVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = hVar.a;
        FingerprintManager c10 = l6.h.c(context);
        if (c10 == null || !c10.isHardwareDetected()) {
            return 12;
        }
        FingerprintManager c11 = l6.h.c(context);
        return (c11 == null || !c11.hasEnrolledFingerprints()) ? 11 : 0;
    }

    @Override // z3.d
    public int k() {
        return ((long[]) this.d).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ca.a l() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String j10;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                j10 = j((String) this.d, (HashMap) this.b);
                str = "GET Request URL: " + j10;
            } catch (Throwable th3) {
                th2 = th3;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(j10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th5) {
                        th2 = th5;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new ca.a(responseCode, sb2);
            } catch (Throwable th6) {
                th2 = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            th2 = th;
            httpsURLConnection = null;
            if (inputStream != null) {
            }
            if (httpsURLConnection != null) {
            }
            throw th2;
        }
    }

    public androidx.lifecycle.p0 m(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public androidx.lifecycle.p0 n(Class cls, String key) {
        androidx.lifecycle.p0 viewModel;
        androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) this.c;
        kotlin.jvm.internal.i.e(key, "key");
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.b bVar = new v1.b((b2.h) this.d);
            ((LinkedHashMap) bVar.a).put(androidx.lifecycle.q0.b, key);
            try {
                viewModel = s0Var.B(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.a(cls);
            }
            kotlin.jvm.internal.i.e(viewModel, "viewModel");
            androidx.lifecycle.p0 p0Var2 = (androidx.lifecycle.p0) linkedHashMap.put(key, viewModel);
            if (p0Var2 != null) {
                p0Var2.b();
            }
            return viewModel;
        }
        androidx.lifecycle.n0 n0Var = s0Var instanceof androidx.lifecycle.n0 ? (androidx.lifecycle.n0) s0Var : null;
        if (n0Var != null) {
            kotlin.jvm.internal.i.b(p0Var);
            androidx.lifecycle.o oVar = n0Var.d;
            if (oVar != null) {
                m.p pVar = n0Var.e;
                kotlin.jvm.internal.i.b(pVar);
                androidx.lifecycle.j0.a(p0Var, pVar, oVar);
            }
        }
        kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public Object o(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override // org.telegram.ui.Components.q81
    public void onError(t81 t81Var, Exception exc) {
        fi.p9 p9Var = ((fi.o6) this.d).N;
        if (p9Var != null) {
            p9Var.run();
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onStateChanged(boolean z10, int i10) {
        fi.o6 o6Var = (fi.o6) this.d;
        fi.m6 m6Var = o6Var.K;
        t81 t81Var = o6Var.e;
        if (t81Var == null) {
            return;
        }
        if (t81Var.y()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((fi.o6) this.d).i();
    }

    @Override // org.telegram.ui.Components.q81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        fi.o6 o6Var = (fi.o6) this.d;
        fi.w7 w7Var = (fi.w7) this.b;
        if (w7Var != null) {
            fi.v7 q5 = o6Var.e.q(w7Var.d1);
            w7Var.d1 = q5;
            i81 i81Var = o6Var.n;
            if (i81Var != null) {
                i81Var.setHDRInfo(q5);
            }
        }
        int i13 = (int) (i10 * f7);
        o6Var.f = i13;
        int i14 = (int) (i11 * f7);
        o6Var.h = i14;
        if (w7Var != null && (w7Var.k0 != i13 || w7Var.l0 != i14)) {
            w7Var.k0 = i13;
            w7Var.l0 = i14;
            w7Var.A();
        }
        o6Var.b();
        i81 i81Var2 = o6Var.n;
        if (i81Var2 != null) {
            int i15 = o6Var.f;
            int i16 = o6Var.h;
            i81Var2.d = i15;
            i81Var2.e = i16;
            e00 e00Var = i81Var2.b;
            if (e00Var == null) {
                return;
            }
            e00Var.postRunnable(new a00(e00Var, i15, i16, 0));
        }
    }

    public void p(i8.f fVar) {
        try {
            j8.g gVar = (j8.g) this.c;
            i8.i iVar = new i8.i(fVar);
            Parcel N0 = gVar.N0();
            t7.b.c(N0, iVar);
            gVar.R0(N0, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean q() {
        com.google.firebase.messaging.l lVar;
        if (((b6.i) this.d).R("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String X = ((b6.i) this.d).X("gcm.n.image");
        if (!TextUtils.isEmpty(X)) {
            try {
                lVar = new com.google.firebase.messaging.l(new URL(X));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + X);
            }
            if (lVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                lVar.b = executorService.submit(new bi.f2(21, lVar, taskCompletionSource));
                lVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.i a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (b6.i) this.d);
            e0.q qVar = (e0.q) a2.a;
            if (lVar != null) {
                try {
                    Task task = lVar.c;
                    o6.l.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    qVar.j(bitmap);
                    e0.k kVar = new e0.k();
                    kVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    kVar.f = null;
                    kVar.g = true;
                    qVar.n(kVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    lVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e10) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    lVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.b, 0, ((e0.q) a2.a).b());
            return true;
        }
        lVar = null;
        if (lVar != null) {
        }
        com.google.firebase.messaging.i a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (b6.i) this.d);
        e0.q qVar2 = (e0.q) a22.a;
        if (lVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((e0.q) a22.a).b());
        return true;
    }

    public void r(String str, String str2) {
        ((HashMap) this.c).put(str, str2);
    }

    public void s(ec.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(ec.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (ec.i) obj);
    }

    public void t(y2.a aVar) {
        j2.j jVar = (j2.j) ((HashMap) this.b).remove(aVar);
        jVar.getClass();
        i2.h hVar = (i2.h) ((i2.i) this.d).p.get(jVar);
        if (hVar != null) {
            synchronized (hVar) {
                hVar.d--;
            }
        }
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.c).b;
                while (kVar != null) {
                    Object obj = kVar.a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 16:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                rf.b bVar = (rf.b) ((rf.b) this.c).c;
                while (bVar != null) {
                    Object obj2 = bVar.b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    bVar = (rf.b) bVar.c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 17:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public synchronized void u() {
        ((i2.i) this.d).c.e();
    }

    public void v(int i10, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.q81
    public void onRenderedFirstFrame() {
        fi.w7 w7Var = (fi.w7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        fi.o6 o6Var = (fi.o6) this.d;
        fi.n6 n6Var = o6Var.H;
        if (n6Var != null && n6Var.g) {
            int i10 = o6Var.f;
            int i11 = o6Var.h;
            n6Var.d = true;
            n6Var.e = i10;
            n6Var.f = i11;
            hi.e2 e2Var = n6Var.c;
            if (e2Var != null) {
                e2Var.run(Integer.valueOf(i10), Integer.valueOf(n6Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            i81 i81Var = o6Var.n;
            if (i81Var != null) {
                if (n6Var == null || !n6Var.g) {
                    i81Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new e2.q0(11, this, w7Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        o6Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = o6Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (w7Var.M0 == o6Var.a) {
                w7Var.M0 = null;
            }
            o6Var.a = null;
            o6Var.invalidate();
        }
    }

    public h0(int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = f0.c;
                break;
        }
    }

    public h0(CastDevice castDevice, e6.d0 d0Var) {
        this.a = 12;
        o6.l.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = d0Var;
    }

    public h0(f6.h hVar) {
        this.a = 18;
        this.d = hVar;
        this.c = new AtomicLong((h6.a.b.nextLong() & 65535) * 10000);
    }

    public h0(i8.d dVar, j8.g gVar) {
        this.a = 23;
        this.c = gVar;
        o6.l.h(dVar);
        this.b = dVar;
    }

    public h0(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 16:
                rf.b bVar = new rf.b(17, false);
                this.c = bVar;
                this.d = bVar;
                this.b = str;
                break;
            case 25:
                b2.w wVar = new b2.w();
                wVar.q = b2.w0.n("video/mp2t");
                wVar.r = b2.w0.n(str);
                this.b = new b2.x(wVar);
                break;
            default:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    public h0(ih.b bVar) {
        this.a = 24;
        this.b = new ih.a();
        this.c = bVar;
    }

    public h0(bb.b bVar, ld.h hVar) {
        this.a = 15;
        this.b = bVar;
        this.c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public h0(ArrayList arrayList) {
        this.a = 22;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.c;
            jArr[i11] = cVar.b;
            jArr[i11 + 1] = cVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public h0(String str, HashMap hashMap) {
        this.a = 9;
        this.d = str;
        this.b = hashMap;
        this.c = new HashMap();
    }

    public h0(String str, ec.j[] jVarArr) {
        this.a = 17;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    public h0(androidx.lifecycle.t0 store, androidx.lifecycle.s0 factory, b2.h defaultCreationExtras) {
        this.a = 7;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(androidx.lifecycle.t0 store, androidx.lifecycle.s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 7;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public h0(FirebaseMessagingService firebaseMessagingService, b6.i iVar, ExecutorService executorService) {
        this.a = 11;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = iVar;
    }

    public h0(Context context, LocationManager locationManager) {
        this.a = 20;
        this.d = new ch.a();
        this.b = context;
        this.c = locationManager;
    }

    public h0(androidx.biometric.v vVar) {
        this.a = 5;
        this.d = vVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(androidx.fragment.app.u owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 7;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public h0(c2.o[] oVarArr) {
        this.a = 28;
        k2.z0 z0Var = new k2.z0();
        c2.u uVar = new c2.u();
        uVar.c = 1.0f;
        uVar.d = 1.0f;
        c2.l lVar = c2.l.e;
        uVar.e = lVar;
        uVar.f = lVar;
        uVar.g = lVar;
        uVar.h = lVar;
        ByteBuffer byteBuffer = c2.o.a;
        uVar.k = byteBuffer;
        uVar.l = byteBuffer;
        uVar.b = -1;
        c2.o[] oVarArr2 = new c2.o[oVarArr.length + 2];
        this.b = oVarArr2;
        System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
        this.c = z0Var;
        this.d = uVar;
        oVarArr2[oVarArr.length] = z0Var;
        oVarArr2[oVarArr.length + 1] = uVar;
    }

    public h0(Signature signature) {
        this.a = 27;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public h0(Cipher cipher) {
        this.a = 27;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public h0(Mac mac) {
        this.a = 27;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public h0(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = 26;
        bi.i6 i6Var = new bi.i6(this, 2);
        this.b = view;
        this.c = kVar;
        view.addOnAttachStateChangeListener(i6Var);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(kVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(kVar);
        }
    }

    public h0(l6.h hVar) {
        this.a = 6;
        Context context = hVar.a;
        this.b = hVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new l6.h(context, 3) : null;
    }

    public h0(fi.o6 o6Var, fi.w7 w7Var, Runnable[] runnableArr) {
        this.a = 19;
        this.d = o6Var;
        this.b = w7Var;
        this.c = runnableArr;
    }

    public h0(i2.i iVar, j2.j jVar) {
        this.a = 21;
        this.d = iVar;
        this.b = new HashMap();
        this.c = jVar;
    }
}
