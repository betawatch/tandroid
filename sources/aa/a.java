package aa;

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
import androidx.biometric.i0;
import androidx.car.app.j;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import b2.r;
import b2.r0;
import bi.af;
import bi.b8;
import bi.d8;
import bi.e8;
import bi.q9;
import bi.r9;
import bi.tb;
import bi.u6;
import c3.h0;
import c3.q;
import c6.e0;
import c6.i;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import e0.n;
import e0.t;
import e2.d0;
import e2.v;
import e6.h;
import g.z;
import g6.f;
import g6.w;
import j$.util.DesugarCollections;
import j4.b0;
import j4.g0;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
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
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import l2.g;
import lf.c;
import lf.e;
import m.p;
import m.r3;
import n4.y;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.yz;
import v7.m;
import v7.o;
import z3.d;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements q71, s, d, b0, OnCompleteListener, n5.b {
    public static a e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static final URL b(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        za.a aVar2 = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.c).appendQueryParameter("display_version", aVar2.b).build().toString());
    }

    public static String i(String str, HashMap hashMap) {
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
            return a4.a.C(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return r6.t(str, sb3);
    }

    @Override // j4.b0
    public void a(v vVar) {
        long d;
        e2.d.h((e2.b0) this.c);
        String str = d0.a;
        e2.b0 b0Var = (e2.b0) this.c;
        synchronized (b0Var) {
            try {
                long j3 = b0Var.c;
                d = j3 != -9223372036854775807L ? j3 + b0Var.b : b0Var.d();
            } finally {
            }
        }
        long e7 = ((e2.b0) this.c).e();
        if (d == -9223372036854775807L || e7 == -9223372036854775807L) {
            return;
        }
        b2.s sVar = (b2.s) this.b;
        if (e7 != sVar.w) {
            r a2 = sVar.a();
            a2.v = e7;
            b2.s sVar2 = new b2.s(a2);
            this.b = sVar2;
            ((h0) this.d).b(sVar2);
        }
        int a10 = vVar.a();
        ((h0) this.d).d(a10, vVar);
        ((h0) this.d).c(d, 1, a10, 0, null);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.c;
        String str = (String) this.b;
        i iVar = (i) this.d;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        l.j("Not connected to device", e0Var.F == 2);
        f fVar = (f) wVar.u();
        Parcel O0 = fVar.O0();
        O0.writeString(str);
        com.google.android.gms.internal.cast.v.c(O0, iVar);
        fVar.T0(O0, 13);
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

    @Override // j4.b0
    public void c(e2.b0 b0Var, q qVar, g0 g0Var) {
        this.c = b0Var;
        g0Var.a();
        g0Var.b();
        h0 I = qVar.I(g0Var.d, 5);
        this.d = I;
        I.b((b2.s) this.b);
    }

    @Override // z3.d
    public int d(long j3) {
        long[] jArr = (long[]) this.d;
        int a2 = d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    public l5.i e() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.b, (byte[]) this.c, (i5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int f(int i10) {
        BiometricManager biometricManager;
        BiometricPrompt.CryptoObject b10;
        androidx.biometric.s sVar = (androidx.biometric.s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 1;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return androidx.biometric.r.a(biometricManager2, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!m.b(i10)) {
            return -2;
        }
        if (i10 != 0) {
            Context context = sVar.a;
            if (v7.q.a(context) != null) {
                int i13 = 0;
                if (m.a(i10)) {
                    return v7.q.b(context) ? 0 : 11;
                }
                if (i11 != 29) {
                    if (i11 != 28) {
                        return h();
                    }
                    if (i11 < 23 || context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) {
                        return 12;
                    }
                    return !v7.q.b(sVar.a) ? h() : h() == 0 ? 0 : -1;
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
                if (c10 != null && (b10 = o.b(o.a())) != null) {
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
                            while (r4 < r2) {
                            }
                        }
                        if (i12 == 0) {
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                        biometricManager = (BiometricManager) this.c;
                        if (biometricManager != null) {
                        }
                        String str2 = Build.MODEL;
                        if (Build.VERSION.SDK_INT < 30) {
                        }
                        if (i12 == 0) {
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
                        if (i12 == 0) {
                        }
                    }
                }
                biometricManager = (BiometricManager) this.c;
                if (biometricManager != null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    i12 = androidx.biometric.q.a(biometricManager);
                }
                String str222 = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str222 != null) {
                    for (String str3 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                        if (str222.equals(str3)) {
                            return i12;
                        }
                    }
                }
                if (i12 == 0) {
                    return i12;
                }
                if (!v7.q.b(sVar.a)) {
                    i13 = h();
                } else if (h() != 0) {
                    i13 = -1;
                }
                return i13;
            }
        }
        return 12;
    }

    @Override // z3.d
    public long g(int i10) {
        long[] jArr = (long[]) this.d;
        e2.d.b(i10 >= 0);
        e2.d.b(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // fd.a
    public Object get() {
        int i10 = 23;
        return new l5.s(new rb.a(i10), new qb.b(i10), (q5.b) ((u6) this.b).get(), (da.b) ((r3) this.c).get(), (com.google.firebase.messaging.s) ((ki.f) this.d).get());
    }

    public int h() {
        FingerprintManager g10;
        FingerprintManager g11;
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (g10 = e0.b.g(context)) == null || !e0.b.q(g10)) {
            return 12;
        }
        return (i10 < 23 || (g11 = e0.b.g(context)) == null || !e0.b.m(g11)) ? 11 : 0;
    }

    public void j(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.c;
        la.f fVar = new la.f(byteArrayOutputStream, hashMap, (HashMap) this.d, (ia.d) this.b);
        if (obj == null) {
            return;
        }
        ia.d dVar = (ia.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new ia.b("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b k() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String i10;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                i10 = i((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + i10;
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
            httpsURLConnection = (HttpsURLConnection) new URL(i10).openConnection();
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
                return new b(responseCode, sb2);
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

    public e l(lf.f fVar) {
        InputStream inputStream;
        int i10 = fVar.c;
        InputStream inputStream2 = (mf.a) this.b;
        if (fVar.d) {
            g gVar = (g) this.d;
            gVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) gVar.b).read(bArr, i11, i10 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            int i12 = 0;
            boolean z10 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z10 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                z10 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (fVar.f) {
            throw new c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new e(inputStream, fVar.b, i10, (lf.i) this.c, fVar);
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
            v1.b bVar = new v1.b((b2.g) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.C(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.b(cls);
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
                p pVar = n0Var.e;
                kotlin.jvm.internal.i.b(pVar);
                j0.a(p0Var, pVar, oVar);
            }
        }
        kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public Object o(Bitmap bitmap) {
        fh.a aVar = (fh.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((fh.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.c;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.a) {
            aVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(t71 t71Var, Exception exc) {
        tb tbVar = ((e8) this.d).N;
        if (tbVar != null) {
            tbVar.run();
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        e8 e8Var = (e8) this.d;
        b8 b8Var = e8Var.K;
        t71 t71Var = e8Var.e;
        if (t71Var == null) {
            return;
        }
        if (t71Var.y()) {
            AndroidUtilities.runOnUIThread(b8Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(b8Var);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((e8) this.d).i();
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        e8 e8Var = (e8) this.d;
        r9 r9Var = (r9) this.b;
        if (r9Var != null) {
            q9 q6 = e8Var.e.q(r9Var.d1);
            r9Var.d1 = q6;
            h71 h71Var = e8Var.n;
            if (h71Var != null) {
                h71Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        e8Var.f = i13;
        int i14 = (int) (i11 * f7);
        e8Var.h = i14;
        if (r9Var != null && (r9Var.k0 != i13 || r9Var.l0 != i14)) {
            r9Var.k0 = i13;
            r9Var.l0 = i14;
            r9Var.A();
        }
        e8Var.b();
        h71 h71Var2 = e8Var.n;
        if (h71Var2 != null) {
            int i15 = e8Var.f;
            int i16 = e8Var.h;
            h71Var2.d = i15;
            h71Var2.e = i16;
            c00 c00Var = h71Var2.b;
            if (c00Var == null) {
                return;
            }
            c00Var.postRunnable(new yz(c00Var, i15, i16, 0));
        }
    }

    public void p(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.c;
            h8.i iVar = new h8.i(fVar);
            Parcel O0 = gVar.O0();
            s7.b.c(O0, iVar);
            gVar.S0(O0, 9);
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }

    @Override // z3.d
    public List q(long j3) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.e(11));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).a;
            arrayList.add(new d2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i12, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    public int r(hc.g gVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar = (jc.f) obj;
            int i12 = fVar.d;
            hc.f fVar2 = fVar.a;
            int a2 = fVar2.a(gVar);
            int i13 = a2 + 4;
            int ordinal = fVar2.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i13 = ((i12 / 2) * 11) + i13 + (i12 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i13 += fVar.a() * 8;
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
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean s() {
        com.google.firebase.messaging.o oVar;
        if (((android.support.v4.media.c) this.d).a("gcm.n.noui")) {
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
        String e7 = ((android.support.v4.media.c) this.d).e("gcm.n.image");
        if (!TextUtils.isEmpty(e7)) {
            try {
                oVar = new com.google.firebase.messaging.o(new URL(e7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + e7);
            }
            if (oVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                oVar.b = executorService.submit(new af(7, oVar, taskCompletionSource));
                oVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.j a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (android.support.v4.media.c) this.d);
            t tVar = (t) a2.a;
            if (oVar != null) {
                try {
                    Task task = oVar.c;
                    l.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    tVar.j(bitmap);
                    n nVar = new n();
                    nVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    nVar.f = null;
                    nVar.g = true;
                    tVar.n(nVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    oVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e10) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    oVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.b, 0, ((t) a2.a).b());
            return true;
        }
        oVar = null;
        if (oVar != null) {
        }
        com.google.firebase.messaging.j a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (android.support.v4.media.c) this.d);
        t tVar2 = (t) a22.a;
        if (oVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((t) a22.a).b());
        return true;
    }

    public void t(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.a) {
            case 10:
                return (String) this.b;
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                k kVar = ((k) this.c).b;
                while (kVar != null) {
                    Object obj = kVar.a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                y yVar = (y) ((y) this.c).c;
                while (yVar != null) {
                    Object obj2 = yVar.b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    yVar = (y) yVar.c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                jc.f fVar = null;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    jc.f fVar2 = (jc.f) obj3;
                    if (fVar != null) {
                        sb4.append(",");
                    }
                    sb4.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb4.toString();
            case 29:
                StringBuilder sb5 = new StringBuilder("id3v2tag[pos=");
                mf.a aVar = (mf.a) this.b;
                sb5.append(aVar.b);
                sb5.append(", ");
                sb5.append(aVar.e());
                sb5.append(" left]");
                return sb5.toString();
            default:
                return super.toString();
        }
    }

    @Override // z3.d
    public int u() {
        return ((long[]) this.d).length;
    }

    public void v(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public void w(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public void x(int i10, String str, String str2) {
        ((HashMap) this.c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.b).put(str, Integer.valueOf(i10));
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj3;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
        r9 r9Var = (r9) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        e8 e8Var = (e8) this.d;
        d8 d8Var = e8Var.H;
        if (d8Var != null && d8Var.g) {
            int i10 = e8Var.f;
            int i11 = e8Var.h;
            d8Var.d = true;
            d8Var.e = i10;
            d8Var.f = i11;
            gi.a aVar = d8Var.c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(d8Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            h71 h71Var = e8Var.n;
            if (h71Var != null) {
                if (d8Var == null || !d8Var.g) {
                    h71Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new a1.e(17, this, r9Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        e8Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = e8Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (r9Var.M0 == e8Var.a) {
                r9Var.M0 = null;
            }
            e8Var.a = null;
            e8Var.invalidate();
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    public a() {
        this.a = 9;
        this.c = new HashMap();
        this.d = new HashMap();
        this.b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.a = 7;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = d0Var;
    }

    public a(h hVar) {
        this.a = 14;
        this.d = hVar;
        this.c = new AtomicLong((g6.a.b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.a = 17;
        this.c = gVar;
        l.h(dVar);
        this.b = dVar;
    }

    public a(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                y yVar = new y(13, false);
                this.c = yVar;
                this.d = yVar;
                this.b = str;
                break;
            case 20:
                r rVar = new r();
                rVar.p = r0.n("video/mp2t");
                rVar.q = r0.n(str);
                this.b = new b2.s(rVar);
                break;
            default:
                k kVar = new k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    public a(fh.b bVar) {
        this.a = 15;
        this.b = new fh.a();
        this.c = bVar;
    }

    public a(InputStream inputStream, long j3, int i10, lf.i iVar) {
        this.a = 29;
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.b = aVar;
        this.d = new g(aVar, 1);
        this.c = iVar;
    }

    public a(ArrayList arrayList) {
        this.a = 18;
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

    public a(za.b bVar, id.h hVar) {
        this.a = 5;
        this.c = bVar;
        this.d = hVar;
        this.b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.a = 0;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, cc.j[] jVarArr) {
        this.a = 10;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, b2.g defaultCreationExtras) {
        this.a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, LocationManager locationManager) {
        this.a = 16;
        this.d = new z();
        this.b = context;
        this.c = locationManager;
    }

    public a(androidx.biometric.w wVar) {
        this.a = 1;
        this.d = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.a = 25;
        k2.j0 j0Var = new k2.j0();
        c2.k kVar = new c2.k();
        kVar.c = 1.0f;
        kVar.d = 1.0f;
        c2.f fVar = c2.f.e;
        kVar.e = fVar;
        kVar.f = fVar;
        kVar.g = fVar;
        kVar.h = fVar;
        ByteBuffer byteBuffer = c2.h.a;
        kVar.k = byteBuffer;
        kVar.l = byteBuffer.asShortBuffer();
        kVar.m = byteBuffer;
        kVar.b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.c = j0Var;
        this.d = kVar;
        hVarArr2[hVarArr.length] = j0Var;
        hVarArr2[hVarArr.length + 1] = kVar;
    }

    public a(Signature signature) {
        this.a = 24;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.a = 24;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.a = 24;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public a(androidx.biometric.s sVar) {
        this.a = 2;
        Context context = sVar.a;
        this.b = sVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context, false) : null;
    }

    public a(com.google.firebase.messaging.m mVar, hc.g gVar, jc.e eVar) {
        hc.f fVar;
        int i10;
        int i11;
        this.a = 23;
        this.d = mVar;
        this.b = new ArrayList();
        jc.e eVar2 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            fVar = hc.f.n;
            if (eVar2 == null) {
                break;
            }
            int i14 = eVar2.c;
            int i15 = i12 + eVar2.d;
            jc.e eVar3 = eVar2.e;
            int i16 = i13;
            hc.f fVar2 = eVar2.a;
            boolean z10 = (fVar2 == hc.f.h && eVar3 == null && i14 != 0) || !(eVar3 == null || i14 == eVar3.c);
            i10 = z10 ? 1 : i16;
            if (eVar3 == null || eVar3.a != fVar2 || z10) {
                ((ArrayList) this.b).add(0, new jc.f(this, fVar2, eVar2.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new jc.f(this, fVar, eVar2.b, eVar2.c, 0));
            }
            i13 = i10;
            eVar2 = eVar3;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.a;
        hc.d dVar = (hc.d) mVar.d;
        if (z11) {
            jc.f fVar3 = (jc.f) ((ArrayList) this.b).get(0);
            if (fVar3 != null && fVar3.a != fVar && i17 != 0) {
                ((ArrayList) this.b).add(0, new jc.f(this, fVar, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((jc.f) ((ArrayList) this.b).get(0)).a == fVar ? 1 : 0, new jc.f(this, hc.f.s, 0, 0, 0));
        }
        int i18 = gVar.a;
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
        int r10 = r(gVar);
        while (i18 < i19 && !jc.c.c(r10, hc.g.c(i18), dVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(r10, hc.g.c(i18 - 1), dVar)) {
            i18--;
        }
        this.c = hc.g.c(i18);
    }

    public a(e8 e8Var, r9 r9Var, Runnable[] runnableArr) {
        this.a = 6;
        this.d = e8Var;
        this.b = r9Var;
        this.c = runnableArr;
    }
}
