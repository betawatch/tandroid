package aa;

import a4.e;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.biometric.i0;
import androidx.car.app.j;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import b2.g;
import b2.r;
import b2.r0;
import bi.s8;
import c3.h0;
import c3.q;
import c6.e0;
import c6.i;
import cf.c;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import di.b7;
import di.c7;
import di.d7;
import di.ka;
import di.n8;
import di.o8;
import di.z6;
import e0.n;
import e0.t;
import e2.b0;
import e2.d0;
import e6.h;
import fi.j4;
import g6.f;
import g6.w;
import h0.k;
import j$.util.DesugarCollections;
import j4.a0;
import j4.f0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import m.p;
import m.p3;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
import org.xmlpull.v1.XmlPullParserException;
import t7.u;
import v7.m;
import v7.o;
import v7.u7;
import z3.d;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a implements s, d71, d, a0, OnCompleteListener, n5.b {
    public static a e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static final URL a(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        za.a aVar2 = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.c).appendQueryParameter("display_version", aVar2.b).build().toString());
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
            return a4.a.C(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return p6.t(str, sb3);
    }

    public static a y(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new a(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A() {
        ((TypedArray) this.c).recycle();
    }

    public void B(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public void C(int i10, String str, String str2) {
        ((HashMap) this.c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.b).put(str, Integer.valueOf(i10));
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
        v.c(O0, iVar);
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

    @Override // j4.a0
    public void b(e2.v vVar) {
        long d;
        e2.d.h((b0) this.c);
        String str = d0.a;
        b0 b0Var = (b0) this.c;
        synchronized (b0Var) {
            try {
                long j3 = b0Var.c;
                d = j3 != -9223372036854775807L ? j3 + b0Var.b : b0Var.d();
            } finally {
            }
        }
        long e7 = ((b0) this.c).e();
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

    @Override // j4.a0
    public void c(b0 b0Var, q qVar, f0 f0Var) {
        this.c = b0Var;
        f0Var.a();
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 5);
        this.d = R1;
        R1.b((b2.s) this.b);
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

    @Override // z3.d
    public long e(int i10) {
        long[] jArr = (long[]) this.d;
        e2.d.b(i10 >= 0);
        e2.d.b(i10 < jArr.length);
        return jArr[i10];
    }

    public l5.i f() {
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
    public int g(int i10) {
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
                        return i();
                    }
                    if (i11 < 23 || context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) {
                        return 12;
                    }
                    return !v7.q.b(sVar.a) ? i() : i() == 0 ? 0 : -1;
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
                    i13 = i();
                } else if (i() != 0) {
                    i13 = -1;
                }
                return i13;
            }
        }
        return 12;
    }

    @Override // fd.a
    public Object get() {
        int i10 = 23;
        return new l5.s(new u(i10), new rb.a(i10), (q5.b) ((c) this.b).get(), (da.b) ((p3) this.c).get(), (com.google.firebase.messaging.s) ((fg.f) this.d).get());
    }

    @Override // z3.d
    public List h(long j3) {
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
        Collections.sort(arrayList2, new e(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).a;
            arrayList.add(new d2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i12, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    public int i() {
        FingerprintManager g10;
        FingerprintManager g11;
        androidx.biometric.s sVar = (androidx.biometric.s) this.d;
        if (sVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = sVar.a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (g10 = e0.b.g(context)) == null || !e0.b.q(g10)) {
            return 12;
        }
        return (i10 < 23 || (g11 = e0.b.g(context)) == null || !e0.b.m(g11)) ? 11 : 0;
    }

    @Override // z3.d
    public int k() {
        return ((long[]) this.d).length;
    }

    public void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
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
    public b m() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String j3;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                j3 = j((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + j3;
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
            httpsURLConnection = (HttpsURLConnection) new URL(j3).openConnection();
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

    public p0 n(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return o(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 o(Class cls, String key) {
        p0 viewModel;
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.b bVar = new v1.b((g) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.U(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.a(cls);
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

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
        ka kaVar = ((d7) this.d).N;
        if (kaVar != null) {
            kaVar.run();
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.d;
        z6 z6Var = d7Var.K;
        g71 g71Var = d7Var.e;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((d7) this.d).i();
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        d7 d7Var = (d7) this.d;
        o8 o8Var = (o8) this.b;
        if (o8Var != null) {
            n8 q6 = d7Var.e.q(o8Var.d1);
            o8Var.d1 = q6;
            u61 u61Var = d7Var.n;
            if (u61Var != null) {
                u61Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        d7Var.f = i13;
        int i14 = (int) (i11 * f7);
        d7Var.h = i14;
        if (o8Var != null && (o8Var.k0 != i13 || o8Var.l0 != i14)) {
            o8Var.k0 = i13;
            o8Var.l0 = i14;
            o8Var.A();
        }
        d7Var.b();
        u61 u61Var2 = d7Var.n;
        if (u61Var2 != null) {
            int i15 = d7Var.f;
            int i16 = d7Var.h;
            u61Var2.d = i15;
            u61Var2.e = i16;
            vz vzVar = u61Var2.b;
            if (vzVar == null) {
                return;
            }
            vzVar.postRunnable(new rz(vzVar, i15, i16, 0));
        }
    }

    public Object p(Bitmap bitmap) {
        hh.a aVar = (hh.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((hh.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList q(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = u7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public Drawable r(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : u7.b((Context) this.b, resourceId);
    }

    public Drawable s(int i10) {
        int resourceId;
        Drawable f7;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        m.q a2 = m.q.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f7 = a2.a.f(resourceId, context, true);
        }
        return f7;
    }

    public Typeface t(int i10, int i11, e2.a0 a0Var) {
        e2.a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = k.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    a0Var.b();
                    return null;
                }
                int i12 = typedValue.assetCookie;
                a0.k kVar = i0.f.b;
                Typeface typeface = (Typeface) kVar.a(i0.f.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 3;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new j4(i13, a0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        a0Var2 = a0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface e7 = i0.f.a.e(context, resources, resourceId, charSequence2, i11);
                            if (e7 != null) {
                                kVar.b(i0.f.b(resources, resourceId, charSequence2, i14, i11), e7);
                            }
                            if (e7 != null) {
                                new Handler(Looper.getMainLooper()).post(new j4(i13, a0Var2, e7));
                            } else {
                                a0Var2.b();
                            }
                            return e7;
                        } catch (IOException e10) {
                            e = e10;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            a0Var2.b();
                            return null;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            a0Var2.b();
                            return null;
                        }
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return i0.f.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, a0Var);
                        } catch (IOException e12) {
                            e = e12;
                            a0Var2 = a0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            a0Var2.b();
                            return null;
                        } catch (XmlPullParserException e13) {
                            e = e13;
                            a0Var2 = a0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            a0Var2.b();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        a0Var.b();
                        return null;
                    } catch (IOException e14) {
                        iOException = e14;
                        a0Var2 = a0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        a0Var2.b();
                        return null;
                    } catch (XmlPullParserException e15) {
                        xmlPullParserException = e15;
                        a0Var2 = a0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        a0Var2.b();
                        return null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    a0Var2 = a0Var;
                } catch (XmlPullParserException e17) {
                    e = e17;
                    a0Var2 = a0Var;
                }
            }
        }
        return null;
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.a) {
            case 9:
                return (String) this.b;
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
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                pf.b bVar = (pf.b) ((pf.b) this.c).c;
                while (bVar != null) {
                    Object obj2 = bVar.b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    bVar = (pf.b) bVar.c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 22:
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
            default:
                return super.toString();
        }
    }

    public void u(h8.f fVar) {
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

    public int v(hc.f fVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar2 = (jc.f) obj;
            int i12 = fVar2.d;
            hc.e eVar = fVar2.a;
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
    public boolean w() {
        com.google.firebase.messaging.o oVar;
        if (((xa.c) this.d).D("gcm.n.noui")) {
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
        String K = ((xa.c) this.d).K("gcm.n.image");
        if (!TextUtils.isEmpty(K)) {
            try {
                oVar = new com.google.firebase.messaging.o(new URL(K));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + K);
            }
            if (oVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                oVar.b = executorService.submit(new s8(20, oVar, taskCompletionSource));
                oVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.j a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (xa.c) this.d);
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
                } catch (ExecutionException e7) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
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
        com.google.firebase.messaging.j a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (xa.c) this.d);
        t tVar2 = (t) a22.a;
        if (oVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((t) a22.a).b());
        return true;
    }

    public void x(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void z(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj3;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
        o8 o8Var = (o8) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        d7 d7Var = (d7) this.d;
        c7 c7Var = d7Var.H;
        if (c7Var != null && c7Var.g) {
            int i10 = d7Var.f;
            int i11 = d7Var.h;
            c7Var.d = true;
            c7Var.e = i10;
            c7Var.f = i11;
            ii.a aVar = c7Var.c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(c7Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            u61 u61Var = d7Var.n;
            if (u61Var != null) {
                if (c7Var == null || !c7Var.g) {
                    u61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new b7(0, this, o8Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        d7Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = d7Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (o8Var.M0 == d7Var.a) {
                o8Var.M0 = null;
            }
            d7Var.a = null;
            d7Var.invalidate();
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
        this.a = 8;
        this.c = new HashMap();
        this.d = new HashMap();
        this.b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.a = 6;
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
        this.a = 16;
        this.c = gVar;
        l.h(dVar);
        this.b = dVar;
    }

    public a(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 12:
                pf.b bVar = new pf.b(13, false);
                this.c = bVar;
                this.d = bVar;
                this.b = str;
                break;
            case 19:
                r rVar = new r();
                rVar.p = r0.n("video/mp2t");
                rVar.q = r0.n(str);
                this.b = new b2.s(rVar);
                break;
            default:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    public a(hh.b bVar) {
        this.a = 17;
        this.b = new hh.a();
        this.c = bVar;
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
        this.a = 9;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, g defaultCreationExtras) {
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

    public a(Context context, TypedArray typedArray) {
        this.a = 29;
        this.b = context;
        this.c = typedArray;
    }

    public a(Context context, LocationManager locationManager) {
        this.a = 15;
        this.d = new bh.a();
        this.b = context;
        this.c = locationManager;
    }

    public a(androidx.biometric.w wVar) {
        this.a = 1;
        this.d = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.u owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.a = 24;
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
        this.a = 23;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.a = 23;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.a = 23;
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
        this.d = i10 <= 29 ? new androidx.biometric.s(context, 2) : null;
    }

    public a(com.google.firebase.messaging.m mVar, hc.f fVar, jc.e eVar) {
        hc.e eVar2;
        int i10;
        int i11;
        this.a = 22;
        this.d = mVar;
        this.b = new ArrayList();
        jc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = hc.e.n;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.c;
            int i15 = i12 + eVar3.d;
            jc.e eVar4 = eVar3.e;
            int i16 = i13;
            hc.e eVar5 = eVar3.a;
            boolean z10 = (eVar5 == hc.e.h && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.a != eVar5 || z10) {
                ((ArrayList) this.b).add(0, new jc.f(this, eVar5, eVar3.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new jc.f(this, eVar2, eVar3.b, eVar3.c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.a;
        hc.c cVar = (hc.c) mVar.d;
        if (z11) {
            jc.f fVar2 = (jc.f) ((ArrayList) this.b).get(0);
            if (fVar2 != null && fVar2.a != eVar2 && i17 != 0) {
                ((ArrayList) this.b).add(0, new jc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((jc.f) ((ArrayList) this.b).get(0)).a == eVar2 ? 1 : 0, new jc.f(this, hc.e.s, 0, 0, 0));
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
        int v = v(fVar);
        while (i18 < i19 && !jc.c.c(v, hc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(v, hc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.c = hc.f.c(i18);
    }

    public a(d7 d7Var, o8 o8Var, Runnable[] runnableArr) {
        this.a = 13;
        this.d = d7Var;
        this.b = o8Var;
        this.c = runnableArr;
    }
}
