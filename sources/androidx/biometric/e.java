package androidx.biometric;

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
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import b2.w0;
import bi.j2;
import bi.u8;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import di.a7;
import di.ga;
import di.j8;
import di.k8;
import di.x6;
import di.y6;
import di.z6;
import e2.k0;
import e2.m0;
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
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import k2.x0;
import m.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.x71;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.internal.s, e81, z3.e, j4.a0, OnCompleteListener, n5.b {
    public static e e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    public static final URL e(e eVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) eVar.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ab.b bVar = (ab.b) eVar.b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        ab.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }

    public static String k(String str, HashMap hashMap) {
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
        return t8.b.u(str, sb3);
    }

    @Override // j4.a0
    public void a(e2.x xVar) {
        long d;
        ((k0) this.c).getClass();
        String str = m0.a;
        k0 k0Var = (k0) this.c;
        synchronized (k0Var) {
            try {
                long j10 = k0Var.c;
                d = j10 != -9223372036854775807L ? j10 + k0Var.b : k0Var.d();
            } finally {
            }
        }
        long e7 = ((k0) this.c).e();
        if (d == -9223372036854775807L || e7 == -9223372036854775807L) {
            return;
        }
        b2.x xVar2 = (b2.x) this.b;
        if (e7 != xVar2.x) {
            b2.w a2 = xVar2.a();
            a2.w = e7;
            b2.x xVar3 = new b2.x(a2);
            this.b = xVar3;
            ((c3.i0) this.d).b(xVar3);
        }
        int a10 = xVar.a();
        ((c3.i0) this.d).d(a10, xVar);
        ((c3.i0) this.d).c(d, 1, a10, 0, null);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        c6.e0 e0Var = (c6.e0) this.b;
        String str = (String) this.c;
        c6.i iVar = (c6.i) this.d;
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        n6.l.j("Not connected to device", e0Var.F == 2);
        g6.f fVar = (g6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        com.google.android.gms.internal.cast.v.c(N0, iVar);
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
    public void b(k0 k0Var, c3.q qVar, j4.f0 f0Var) {
        this.c = k0Var;
        f0Var.b();
        f0Var.c();
        c3.i0 a02 = qVar.a0(f0Var.c, 5);
        this.d = a02;
        a02.b((b2.x) this.b);
    }

    @Override // z3.e
    public int c(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = m0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // z3.e
    public long d(int i10) {
        long[] jArr = (long[]) this.d;
        u6.g(i10 >= 0);
        u6.g(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // z3.e
    public List f(long j10) {
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

    public l5.i g() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.b, (byte[]) this.c, (i5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // hd.a
    public Object get() {
        int i10 = 24;
        return new l5.s(new rb.b(i10), new pb.a(i10), (q5.b) ((z5) this.b).get(), (ea.b) ((q3) this.c).get(), (com.google.firebase.messaging.s) ((qi.e) this.d).get());
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
        t tVar = (t) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return s.a(biometricManager2, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!v7.k.b(i10)) {
            return -2;
        }
        if (i10 == 0) {
            return 12;
        }
        Context context = tVar.a;
        if (h0.a(context) == null) {
            return 12;
        }
        int i12 = 0;
        if (v7.k.a(i10)) {
            KeyguardManager a10 = h0.a(context);
            return a10 == null ? false : h0.b(a10) ? 0 : 11;
        }
        if (i11 != 29) {
            if (i11 != 28) {
                return i();
            }
            if (!((context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager a11 = h0.a(tVar.a);
            return !(a11 == null ? false : h0.b(a11)) ? i() : i() == 0 ? 0 : -1;
        }
        if ((i10 & 255) == 255) {
            BiometricManager biometricManager3 = (BiometricManager) this.c;
            if (biometricManager3 != null) {
                return r.a(biometricManager3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c10 = r.c();
        if (c10 != null && (b10 = v7.m.b(v7.m.a())) != null) {
            try {
                Object invoke = c10.invoke((BiometricManager) this.c, b10);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e7) {
                e = e7;
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
            } catch (IllegalArgumentException e10) {
                e = e10;
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
            } catch (InvocationTargetException e11) {
                e = e11;
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
            a2 = r.a(biometricManager);
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
            KeyguardManager a12 = h0.a(tVar.a);
            if (!(a12 == null ? false : h0.b(a12))) {
                i12 = i();
            } else if (i() != 0) {
                i12 = -1;
            }
            return i12;
        }
    }

    public int i() {
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.a;
        FingerprintManager d = k0.b.d(context);
        if (d == null || !d.isHardwareDetected()) {
            return 12;
        }
        FingerprintManager d10 = k0.b.d(context);
        return (d10 == null || !d10.hasEnrolledFingerprints()) ? 11 : 0;
    }

    @Override // z3.e
    public int j() {
        return ((long[]) this.d).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ba.a l() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String k10;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                k10 = k((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + k10;
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
            httpsURLConnection = (HttpsURLConnection) new URL(k10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
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
                return new ba.a(responseCode, sb2);
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

    public p0 m(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 n(Class cls, String key) {
        p0 viewModel;
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.c cVar = new v1.c((b2.h) this.d);
            ((LinkedHashMap) cVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.W0(cls, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.e(cls);
            }
            kotlin.jvm.internal.i.e(viewModel, "viewModel");
            p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
            if (p0Var2 != null) {
                p0Var2.b();
            }
            return viewModel;
        }
        n0 n0Var = s0Var instanceof n0 ? (n0) s0Var : null;
        if (n0Var != null) {
            kotlin.jvm.internal.i.b(p0Var);
            androidx.lifecycle.o oVar = n0Var.d;
            if (oVar != null) {
                m.p pVar = n0Var.e;
                kotlin.jvm.internal.i.b(pVar);
                j0.a(p0Var, pVar, oVar);
            }
        }
        kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public Object o(Bitmap bitmap) {
        hh.a aVar = (hh.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((hh.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.a) {
            aVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // org.telegram.ui.Components.e81
    public void onError(h81 h81Var, Exception exc) {
        ga gaVar = ((a7) this.d).N;
        if (gaVar != null) {
            gaVar.run();
        }
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onStateChanged(boolean z10, int i10) {
        a7 a7Var = (a7) this.d;
        y6 y6Var = a7Var.K;
        h81 h81Var = a7Var.e;
        if (h81Var == null) {
            return;
        }
        if (h81Var.y()) {
            AndroidUtilities.runOnUIThread(y6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(y6Var);
        }
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.e81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((a7) this.d).i();
    }

    @Override // org.telegram.ui.Components.e81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        a7 a7Var = (a7) this.d;
        k8 k8Var = (k8) this.b;
        if (k8Var != null) {
            j8 q6 = a7Var.e.q(k8Var.d1);
            k8Var.d1 = q6;
            x71 x71Var = a7Var.n;
            if (x71Var != null) {
                x71Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        a7Var.f = i13;
        int i14 = (int) (i11 * f7);
        a7Var.h = i14;
        if (k8Var != null && (k8Var.k0 != i13 || k8Var.l0 != i14)) {
            k8Var.k0 = i13;
            k8Var.l0 = i14;
            k8Var.A();
        }
        a7Var.b();
        x71 x71Var2 = a7Var.n;
        if (x71Var2 != null) {
            int i15 = a7Var.f;
            int i16 = a7Var.h;
            x71Var2.d = i15;
            x71Var2.e = i16;
            h00 h00Var = x71Var2.b;
            if (h00Var == null) {
                return;
            }
            h00Var.postRunnable(new d00(h00Var, i15, i16, 0));
        }
    }

    public void p(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.c;
            h8.i iVar = new h8.i(fVar);
            Parcel N0 = gVar.N0();
            s7.b.c(N0, iVar);
            gVar.R0(N0, 9);
        } catch (RemoteException e7) {
            throw new androidx.car.app.j(e7);
        }
    }

    public int q(ic.f fVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            kc.f fVar2 = (kc.f) obj;
            int i12 = fVar2.d;
            ic.e eVar = fVar2.a;
            int a2 = eVar.a(fVar);
            int i13 = a2 + 4;
            int ordinal = eVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i13 = ((i12 / 2) * 11) + i13 + (i12 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i13 += fVar2.a() * 8;
                } else if (ordinal == 5) {
                    i13 = a2 + 12;
                } else if (ordinal == 6) {
                    i13 += i12 * 13;
                }
            } else {
                int i14 = ((i12 / 3) * 10) + i13;
                int i15 = i12 % 3;
                i13 = i14 + (i15 != 1 ? i15 == 2 ? 7 : 0 : 4);
            }
            i10 += i13;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean r() {
        com.google.firebase.messaging.n nVar;
        if (((qb.c) this.d).P("gcm.n.noui")) {
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
        String W = ((qb.c) this.d).W("gcm.n.image");
        if (!TextUtils.isEmpty(W)) {
            try {
                nVar = new com.google.firebase.messaging.n(new URL(W));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + W);
            }
            if (nVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                nVar.b = executorService.submit(new u8(21, nVar, taskCompletionSource));
                nVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.j a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (qb.c) this.d);
            e0.r rVar = (e0.r) a2.a;
            if (nVar != null) {
                try {
                    Task task = nVar.c;
                    n6.l.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    rVar.j(bitmap);
                    e0.l lVar = new e0.l();
                    lVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    lVar.f = null;
                    lVar.g = true;
                    rVar.n(lVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    nVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e7) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    nVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.b, 0, ((e0.r) a2.a).b());
            return true;
        }
        nVar = null;
        if (nVar != null) {
        }
        com.google.firebase.messaging.j a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (qb.c) this.d);
        e0.r rVar2 = (e0.r) a22.a;
        if (nVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((e0.r) a22.a).b());
        return true;
    }

    public void s(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void t(dc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(dc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (dc.i) obj);
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.a) {
            case 9:
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
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                qf.b bVar = (qf.b) ((qf.b) this.c).c;
                while (bVar != null) {
                    Object obj2 = bVar.b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    bVar = (qf.b) bVar.c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 12:
                return (String) this.b;
            case 26:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                kc.f fVar = null;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    kc.f fVar2 = (kc.f) obj3;
                    if (fVar != null) {
                        sb4.append(",");
                    }
                    sb4.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public void u(y2.a aVar) {
        j2.k kVar = (j2.k) ((HashMap) this.b).remove(aVar);
        kVar.getClass();
        i2.h hVar = (i2.h) ((i2.i) this.d).p.get(kVar);
        if (hVar != null) {
            synchronized (hVar) {
                hVar.d--;
            }
        }
    }

    public void v(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public synchronized void w() {
        ((i2.i) this.d).c.e();
    }

    public void x(int i10, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.e81
    public void onRenderedFirstFrame() {
        k8 k8Var = (k8) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        a7 a7Var = (a7) this.d;
        z6 z6Var = a7Var.H;
        if (z6Var != null && z6Var.g) {
            int i10 = a7Var.f;
            int i11 = a7Var.h;
            z6Var.d = true;
            z6Var.e = i10;
            z6Var.f = i11;
            ii.a aVar = z6Var.c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(z6Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            x71 x71Var = a7Var.n;
            if (x71Var != null) {
                if (z6Var == null || !z6Var.g) {
                    x71Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new x6(2, this, k8Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        a7Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = a7Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (k8Var.M0 == a7Var.a) {
                k8Var.M0 = null;
            }
            a7Var.a = null;
            a7Var.invalidate();
        }
    }

    public e() {
        this.a = 7;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public e(CastDevice castDevice, d6.d0 d0Var) {
        this.a = 5;
        n6.l.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = d0Var;
    }

    public e(e6.h hVar) {
        this.a = 14;
        this.d = hVar;
        this.c = new AtomicLong((g6.a.b.nextLong() & 65535) * 10000);
    }

    public e(h8.d dVar, i8.g gVar) {
        this.a = 16;
        this.c = gVar;
        n6.l.h(dVar);
        this.b = dVar;
    }

    public e(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                qf.b bVar = new qf.b(14);
                this.c = bVar;
                this.d = bVar;
                this.b = str;
                break;
            case 21:
                b2.w wVar = new b2.w();
                wVar.q = w0.n("video/mp2t");
                wVar.r = w0.n(str);
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

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    public e(hh.b bVar) {
        this.a = 17;
        this.b = new hh.a();
        this.c = bVar;
    }

    public e(ab.b bVar, kd.h hVar) {
        this.a = 8;
        this.b = bVar;
        this.c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public e(ArrayList arrayList) {
        this.a = 19;
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

    public e(String str, HashMap hashMap) {
        this.a = 4;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public e(String str, dc.j[] jVarArr) {
        this.a = 12;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    public e(t0 store, s0 factory, b2.h defaultCreationExtras) {
        this.a = 2;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 2;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public e(FirebaseMessagingService firebaseMessagingService, qb.c cVar, ExecutorService executorService) {
        this.a = 10;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = cVar;
    }

    public e(Context context, LocationManager locationManager) {
        this.a = 15;
        this.d = new bh.a();
        this.b = context;
        this.c = locationManager;
    }

    public e(x xVar) {
        this.a = 0;
        this.d = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.u owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 2;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public e(c2.n[] nVarArr) {
        this.a = 25;
        x0 x0Var = new x0();
        c2.t tVar = new c2.t();
        tVar.c = 1.0f;
        tVar.d = 1.0f;
        c2.k kVar = c2.k.e;
        tVar.e = kVar;
        tVar.f = kVar;
        tVar.g = kVar;
        tVar.h = kVar;
        ByteBuffer byteBuffer = c2.n.a;
        tVar.k = byteBuffer;
        tVar.l = byteBuffer;
        tVar.b = -1;
        c2.n[] nVarArr2 = new c2.n[nVarArr.length + 2];
        this.b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.c = x0Var;
        this.d = tVar;
        nVarArr2[nVarArr.length] = x0Var;
        nVarArr2[nVarArr.length + 1] = tVar;
    }

    public e(Signature signature) {
        this.a = 24;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public e(Cipher cipher) {
        this.a = 24;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public e(Mac mac) {
        this.a = 24;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public e(View view, ih.j jVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = 20;
        j2 j2Var = new j2(this, 1);
        this.b = view;
        this.c = jVar;
        view.addOnAttachStateChangeListener(j2Var);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(jVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(jVar);
        }
    }

    public e(t tVar) {
        this.a = 1;
        Context context = tVar.a;
        this.b = tVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? r.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context, false) : null;
    }

    public e(c2.b bVar, ic.f fVar, kc.e eVar) {
        ic.e eVar2;
        int i10;
        int i11;
        this.a = 26;
        this.d = bVar;
        this.b = new ArrayList();
        kc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = ic.e.n;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.c;
            int i15 = i12 + eVar3.d;
            kc.e eVar4 = eVar3.e;
            int i16 = i13;
            ic.e eVar5 = eVar3.a;
            boolean z10 = (eVar5 == ic.e.h && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.a != eVar5 || z10) {
                ((ArrayList) this.b).add(0, new kc.f(this, eVar5, eVar3.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new kc.f(this, eVar2, eVar3.b, eVar3.c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = bVar.a;
        ic.c cVar = (ic.c) bVar.d;
        if (z11) {
            kc.f fVar2 = (kc.f) ((ArrayList) this.b).get(0);
            if (fVar2 != null && fVar2.a != eVar2 && i17 != 0) {
                ((ArrayList) this.b).add(0, new kc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((kc.f) ((ArrayList) this.b).get(0)).a == eVar2 ? 1 : 0, new kc.f(this, ic.e.s, 0, 0, 0));
        }
        int i18 = fVar.a;
        int i19 = 26;
        int c10 = m1.j.c(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (c10 == 0) {
            i19 = 9;
        } else if (c10 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int q6 = q(fVar);
        while (i18 < i19 && !kc.c.c(q6, ic.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && kc.c.c(q6, ic.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.c = ic.f.c(i18);
    }

    public e(a7 a7Var, k8 k8Var, Runnable[] runnableArr) {
        this.a = 13;
        this.d = a7Var;
        this.b = k8Var;
        this.c = runnableArr;
    }

    public e(i2.i iVar, j2.k kVar) {
        this.a = 18;
        this.d = iVar;
        this.b = new HashMap();
        this.c = kVar;
    }
}
