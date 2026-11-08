package android.support.v4.media.session;

import a8.k1;
import a8.m1;
import a8.o0;
import a8.p0;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.biometric.h0;
import androidx.biometric.i0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import bi.b1;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.clearcut.z0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import di.s7;
import fi.d7;
import fi.e7;
import fi.ha;
import fi.u8;
import fi.ua;
import fi.va;
import fi.w5;
import fi.x5;
import fi.y5;
import gb.l0;
import h9.f1;
import hi.u1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.fz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gf;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t51;
import org.telegram.ui.lm0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class a0 implements oa.a, lm0, bi, com.google.android.gms.common.api.internal.p, q51, ib.b {
    public static int e;
    public static a0 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a0(int i7, boolean z9) {
        this.a = i7;
    }

    public static Object a(Task task) {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e11);
        }
    }

    public static String f(String str, HashMap hashMap) {
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
            return p0.D(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return rf.b.r(str, sb3);
    }

    public static void g(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a0.class.getClassLoader());
        }
    }

    public static boolean n() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        g(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @Override // org.telegram.ui.Components.bi
    public boolean G1() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        f6.e0 e0Var = (f6.e0) this.b;
        String str = (String) this.c;
        f6.i iVar = (f6.i) this.d;
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q6.m.i("Not connected to device", e0Var.G == 2);
        j6.f fVar = (j6.f) wVar.n();
        Parcel p12 = fVar.p1();
        p12.writeString(str);
        com.google.android.gms.internal.cast.t.c(p12, iVar);
        fVar.u1(p12, 13);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    e0Var.i(2477);
                }
                e0Var.p = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // oa.a
    public /* bridge */ /* synthetic */ oa.a b(Class cls, na.d dVar) {
        switch (this.a) {
            case 1:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
        }
        return this;
    }

    @Override // org.telegram.ui.lm0
    public void c(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((fz) arrayList.get(0)).c : null;
        if (str == null) {
            return;
        }
        Utilities.e.c(new ai.d0(str, (d20) this.b, (f2) this.c, (c20) this.d));
    }

    @Override // org.telegram.ui.Components.bi
    public void c0(qg qgVar) {
        qgVar.run();
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
    public int d(int i7) {
        BiometricManager biometricManager;
        int a10;
        BiometricPrompt.CryptoObject b10;
        androidx.biometric.t tVar = (androidx.biometric.t) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return androidx.biometric.s.a(biometricManager2, i7);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!k1.b(i7)) {
            return -2;
        }
        if (i7 == 0) {
            return 12;
        }
        Context context = tVar.a;
        if (h0.a(context) == null) {
            return 12;
        }
        int i11 = 0;
        if (k1.a(i7)) {
            KeyguardManager a11 = h0.a(context);
            return a11 == null ? false : h0.b(a11) ? 0 : 11;
        }
        if (i10 != 29) {
            if (i10 != 28) {
                return e();
            }
            if (!((context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager a12 = h0.a(tVar.a);
            return !(a12 == null ? false : h0.b(a12)) ? e() : e() == 0 ? 0 : -1;
        }
        if ((i7 & qs.e4) == 255) {
            BiometricManager biometricManager3 = (BiometricManager) this.c;
            if (biometricManager3 != null) {
                return androidx.biometric.r.a(biometricManager3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c10 = androidx.biometric.r.c();
        if (c10 != null && (b10 = m1.b(m1.a())) != null) {
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
                return r3 ? a10 : a10;
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
            a10 = 1;
        } else {
            a10 = androidx.biometric.r.a(biometricManager);
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
        if (r3 && a10 == 0) {
            KeyguardManager a13 = h0.a(tVar.a);
            if (!(a13 == null ? false : h0.b(a13))) {
                i11 = e();
            } else if (e() != 0) {
                i11 = -1;
            }
            return i11;
        }
    }

    public int e() {
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
        FingerprintManager d2 = k0.b.d(context);
        return (d2 == null || !d2.hasEnrolledFingerprints()) ? 11 : 0;
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // fd.a
    public Object get() {
        Context appContext = (Context) ((d9.o) this.b).a;
        id.h blockingDispatcher = (id.h) ((ib.c) this.c).get();
        l0 sessionDataSerializer = (l0) ((ib.c) this.d).get();
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.j.e(sessionDataSerializer, "sessionDataSerializer");
        return gb.r.a(sessionDataSerializer, new f1(new c1.b(sessionDataSerializer, 3), 15), zd.b0.b(blockingDispatcher), new gb.q(appContext, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 h() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String f10;
        String str;
        ba.e.b();
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                f10 = f((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + f10;
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
            httpsURLConnection = (HttpsURLConnection) new URL(f10).openConnection();
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
                        char[] cArr = new char[TLObject.FLAG_13];
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
                return new z0(responseCode, sb2);
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

    public androidx.lifecycle.p0 i(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return j(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public androidx.lifecycle.p0 j(Class cls, String key) {
        androidx.lifecycle.p0 viewModel;
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            y1.b bVar = new y1.b((b1) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.t(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.i(cls);
            }
            kotlin.jvm.internal.j.e(viewModel, "viewModel");
            androidx.lifecycle.p0 p0Var2 = (androidx.lifecycle.p0) linkedHashMap.put(key, viewModel);
            if (p0Var2 != null) {
                p0Var2.b();
            }
            return viewModel;
        }
        n0 n0Var = s0Var instanceof n0 ? (n0) s0Var : null;
        if (n0Var != null) {
            kotlin.jvm.internal.j.b(p0Var);
            androidx.lifecycle.o oVar = n0Var.d;
            if (oVar != null) {
                m.q qVar = n0Var.e;
                kotlin.jvm.internal.j.b(qVar);
                j0.a(p0Var, qVar, oVar);
            }
        }
        kotlin.jvm.internal.j.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k() {
        ab.u uVar;
        if (((d6.i) this.d).g0("gcm.n.noui")) {
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
        String k02 = ((d6.i) this.d).k0("gcm.n.image");
        if (!TextUtils.isEmpty(k02)) {
            try {
                uVar = new ab.u(new URL(k02));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + k02);
            }
            if (uVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                uVar.b = executorService.submit(new a1.e(7, uVar, taskCompletionSource));
                uVar.c = taskCompletionSource.getTask();
            }
            ab.k a10 = ab.e.a((FirebaseMessagingService) this.c, (d6.i) this.d);
            e0.q qVar = (e0.q) a10.a;
            if (uVar != null) {
                try {
                    Task task = uVar.c;
                    q6.m.g(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    qVar.j(bitmap);
                    e0.k kVar = new e0.k();
                    kVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    kVar.f = null;
                    kVar.g = true;
                    qVar.n(kVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    uVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e10) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    uVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a10.b, 0, ((e0.q) a10.a).b());
            return true;
        }
        uVar = null;
        if (uVar != null) {
        }
        ab.k a102 = ab.e.a((FirebaseMessagingService) this.c, (d6.i) this.d);
        e0.q qVar2 = (e0.q) a102.a;
        if (uVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a102.b, 0, ((e0.q) a102.a).b());
        return true;
    }

    public void l(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    /* JADX WARN: Finally extract failed */
    public void o(String str, String str2, String str3, String str4) {
        o9.g gVar = (o9.g) this.c;
        if (str2 == null || str3 == null) {
            throw new IOException("FIS auth token or FIS ID is empty");
        }
        gVar.a();
        o9.i iVar = gVar.c;
        String str5 = iVar.h;
        gVar.a();
        String str6 = iVar.a;
        if (str5 == null) {
            throw new IOException("Project ID or API Key is missing");
        }
        URL url = new URL(org.telegram.ui.Cells.f1.n(str, ":", str4, com.google.android.recaptcha.internal.a.n("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/")));
        if (n()) {
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Topic ", str4, " for: ", str, " with url: ");
            n10.append(url);
            Log.d("FirebaseMessaging", n10.toString());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                } catch (IOException unused2) {
                }
                httpURLConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (n()) {
                        Log.d("FirebaseMessaging", org.telegram.ui.Cells.f1.m("Topic ", str4, " for: ", str, " succeeded."));
                        return;
                    }
                    return;
                }
                if (responseCode == 404 || responseCode == 403) {
                    if (n()) {
                        Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                    }
                    throw new IOException(com.google.android.recaptcha.internal.a.l("Topic ", str4, " failed: ", responseMessage));
                }
                if (responseCode >= 500) {
                    throw new IOException("INTERNAL_SERVER_ERROR");
                }
                throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
            } catch (IOException e10) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e10);
            }
        } catch (Throwable th2) {
            try {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (IOException unused3) {
            }
            try {
                InputStream errorStream2 = httpURLConnection.getErrorStream();
                if (errorStream2 != null) {
                    errorStream2.close();
                }
            } catch (IOException unused4) {
            }
            httpURLConnection.disconnect();
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.bi
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        ua uaVar;
        String str = (String) this.c;
        ei.r rVar = (ei.r) this.d;
        long j11 = rVar.d;
        di diVar = (di) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() != 1) {
            return;
        }
        Object next = selectedPhotos.values().iterator().next();
        if (next instanceof gf) {
            e7 l10 = e7.l((gf) next);
            l10.J0 = j11;
            l10.K0 = str;
            l10.A();
            va D = va.D(rVar.a.getParentActivity(), rVar.b);
            RectF rectF = D.H;
            WindowManager.LayoutParams layoutParams = D.h;
            int i12 = D.c;
            WindowManager windowManager = D.f;
            if (!D.d) {
                if (qp.s1(i12).v2()) {
                    org.telegram.ui.b.b(i12);
                } else {
                    D.v0 = j11;
                    D.w0 = str;
                    D.u0 = false;
                    D.e = false;
                    D.B2 = false;
                    if (windowManager != null && (uaVar = D.n) != null && uaVar.getParent() == null) {
                        g0.y3(windowManager, D.n, layoutParams);
                        windowManager.addView(D.n, layoutParams);
                        D.f0();
                    }
                    D.K1 = l10;
                    l10.J0 = j11;
                    l10.K0 = str;
                    D.O1 = l10.K ? 1 : 0;
                    D.s0.g = false;
                    D.J = 0;
                    float L = g0.L(100.0f);
                    Point point = g0.q;
                    rectF.set(0.0f, L, point.x, g0.L(100.0f) + point.y);
                    D.G = g0.L(8.0f);
                    D.r.c();
                    ha haVar = D.h0;
                    int i13 = D.J;
                    haVar.setBackgroundColor((i13 == 1 || i13 == 0) ? 0 : -14737633);
                    D.r.setTranslationX(0.0f);
                    D.r.setTranslationY(0.0f);
                    D.r.b(0.0f);
                    D.r.setScaleX(1.0f);
                    D.r.setScaleY(1.0f);
                    D.K = 0.0f;
                    g0.g2(D.b);
                    e7 e7Var = D.K1;
                    if (e7Var != null) {
                        D.c1.setText(e7Var.C0);
                    }
                    D.J(1, false);
                    D.k0(-1, false, false);
                    D.b1.b(false, false);
                    D.b1.b(true, true);
                    D.f(1.0f, true, new u8(D, 6));
                    D.d();
                }
            }
            g0.i3(new s7(diVar, 8), 400L);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public void onError(t51 t51Var, Exception exc) {
        u8 u8Var = ((y5) this.d).N;
        if (u8Var != null) {
            u8Var.run();
        }
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onStateChanged(boolean z9, int i7) {
        y5 y5Var = (y5) this.d;
        w5 w5Var = y5Var.K;
        t51 t51Var = y5Var.e;
        if (t51Var == null) {
            return;
        }
        if (t51Var.d0()) {
            g0.h3(w5Var);
        } else {
            g0.r(w5Var);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((y5) this.d).i();
    }

    @Override // org.telegram.ui.Components.q51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        y5 y5Var = (y5) this.d;
        e7 e7Var = (e7) this.b;
        if (e7Var != null) {
            d7 V = y5Var.e.V(e7Var.d1);
            e7Var.d1 = V;
            h51 h51Var = y5Var.n;
            if (h51Var != null) {
                h51Var.setHDRInfo(V);
            }
        }
        int i12 = (int) (i7 * f10);
        y5Var.f = i12;
        int i13 = (int) (i10 * f10);
        y5Var.h = i13;
        if (e7Var != null && (e7Var.k0 != i12 || e7Var.l0 != i13)) {
            e7Var.k0 = i12;
            e7Var.l0 = i13;
            e7Var.A();
        }
        y5Var.b();
        h51 h51Var2 = y5Var.n;
        if (h51Var2 != null) {
            int i14 = y5Var.f;
            int i15 = y5Var.h;
            h51Var2.d = i14;
            h51Var2.e = i15;
            sy syVar = h51Var2.b;
            if (syVar == null) {
                return;
            }
            syVar.postRunnable(new oy(syVar, i14, i15, 0));
        }
    }

    public void p(bc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(bc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (bc.i) obj);
    }

    public void q() {
        u uVar = (u) this.b;
        MediaSession mediaSession = uVar.a;
        uVar.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e10) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
            }
        }
        mediaSession.setCallback(null);
        uVar.b.a.set(null);
        mediaSession.release();
    }

    public void r(boolean z9) {
        ((u) this.b).a.setActive(z9);
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((s4.a) obj).getClass();
        }
    }

    public void s(s sVar, Handler handler) {
        u uVar = (u) this.b;
        if (sVar == null) {
            uVar.e(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        uVar.e(sVar, handler);
    }

    public void t(MediaMetadataCompat mediaMetadataCompat) {
        u uVar = (u) this.b;
        uVar.h = mediaMetadataCompat;
        MediaSession mediaSession = uVar.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                a0 a0Var = (a0) ((a0) this.c).d;
                while (a0Var != null) {
                    Object obj = a0Var.c;
                    sb2.append(str);
                    String str2 = (String) a0Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    a0Var = (a0) a0Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                return (String) this.b;
            case 19:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.c).b;
                while (kVar != null) {
                    Object obj2 = kVar.a;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 28:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                wf.b bVar = (wf.b) ((wf.b) this.c).c;
                while (bVar != null) {
                    Object obj3 = bVar.b;
                    sb4.append(str);
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj3});
                        sb4.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    bVar = (wf.b) bVar.c;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public void u(PlaybackStateCompat playbackStateCompat) {
        u uVar = (u) this.b;
        uVar.f = playbackStateCompat;
        synchronized (uVar.d) {
            for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) uVar.e.getBroadcastItem(beginBroadcast)).e1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            uVar.e.finishBroadcast();
        }
        MediaSession mediaSession = uVar.a;
        if (playbackStateCompat.x == null) {
            PlaybackState.Builder d = b0.d();
            b0.x(d, playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.n);
            b0.u(d, playbackStateCompat.c);
            b0.s(d, playbackStateCompat.e);
            b0.v(d, playbackStateCompat.h);
            ArrayList arrayList = playbackStateCompat.r;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj;
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e10 = b0.e(customAction.a, customAction.b, customAction.c);
                    b0.w(e10, customAction.d);
                    customAction2 = b0.b(e10);
                }
                b0.a(d, customAction2);
            }
            b0.t(d, playbackStateCompat.s);
            c0.b(d, playbackStateCompat.w);
            playbackStateCompat.x = b0.c(d);
        }
        mediaSession.setPlaybackState(playbackStateCompat.x);
    }

    public void v(ArrayList arrayList) {
        int i7 = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) obj;
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j3 = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    Log.e("MediaSessionCompat", p0.o(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        u uVar = (u) this.b;
        MediaSession mediaSession = uVar.a;
        uVar.g = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) obj2;
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.c;
            if (queueItem == null) {
                queueItem = y.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public void w(int i7) {
        u uVar = (u) this.b;
        if (uVar.i != i7) {
            uVar.i = i7;
            synchronized (uVar.d) {
                for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) uVar.e.getBroadcastItem(beginBroadcast)).e(i7);
                    } catch (RemoteException unused) {
                    }
                }
                uVar.e.finishBroadcast();
            }
        }
    }

    public void x(int i7) {
        u uVar = (u) this.b;
        if (uVar.j != i7) {
            uVar.j = i7;
            synchronized (uVar.d) {
                for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) uVar.e.getBroadcastItem(beginBroadcast)).j(i7);
                    } catch (RemoteException unused) {
                    }
                }
                uVar.e.finishBroadcast();
            }
        }
    }

    public void z(int i7, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i7));
    }

    public /* synthetic */ a0(FrameLayout frameLayout, Object obj, Serializable serializable, int i7) {
        this.a = i7;
        this.d = frameLayout;
        this.b = obj;
        this.c = serializable;
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame() {
        e7 e7Var = (e7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        y5 y5Var = (y5) this.d;
        x5 x5Var = y5Var.H;
        if (x5Var != null && x5Var.g) {
            int i7 = y5Var.f;
            int i10 = y5Var.h;
            x5Var.d = true;
            x5Var.e = i7;
            x5Var.f = i10;
            u1 u1Var = x5Var.c;
            if (u1Var != null) {
                u1Var.a(Integer.valueOf(i7), Integer.valueOf(x5Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            h51 h51Var = y5Var.n;
            if (h51Var != null) {
                if (x5Var == null || !x5Var.g) {
                    h51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new f2.h(9, this, e7Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        y5Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = y5Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (e7Var.M0 == y5Var.a) {
                e7Var.M0 = null;
            }
            y5Var.a = null;
            y5Var.invalidate();
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj3;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public a0(int i7) {
        this.a = i7;
        switch (i7) {
            case 14:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = c8.x.c;
                break;
            case 24:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = o0.c;
                break;
        }
    }

    public a0(CastDevice castDevice, g6.e0 e0Var) {
        this.a = 22;
        q6.m.h(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = e0Var;
    }

    public a0(String str, int i7) {
        this.a = i7;
        switch (i7) {
            case 19:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
            case 28:
                wf.b bVar = new wf.b(19, false);
                this.c = bVar;
                this.d = bVar;
                this.b = str;
                break;
            default:
                a0 a0Var = new a0(11, false);
                this.c = a0Var;
                this.d = a0Var;
                this.b = str;
                break;
        }
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.lm0
    public void m() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void t0() {
    }

    public a0(String str, HashMap hashMap) {
        this.a = 25;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    public a0(String str, bc.j[] jVarArr) {
        this.a = 13;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    public a0(t0 store, s0 factory, b1 defaultCreationExtras) {
        this.a = 10;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(t0 store, s0 s0Var) {
        this(store, s0Var, y1.a.b);
        this.a = 10;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public a0(Context context, LocationManager locationManager) {
        this.a = 27;
        this.d = new dh.a();
        this.b = context;
        this.c = locationManager;
    }

    public a0(androidx.biometric.x xVar) {
        this.a = 8;
        this.d = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(androidx.fragment.app.u owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 10;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public a0(androidx.biometric.t tVar) {
        this.a = 9;
        Context context = tVar.a;
        this.b = tVar;
        int i7 = Build.VERSION.SDK_INT;
        this.c = i7 >= 29 ? androidx.biometric.r.b(context) : null;
        this.d = i7 <= 29 ? new k0.b(context, false) : null;
    }

    public a0(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = 0;
        this.d = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i7 = s4.e0.b;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (queryBroadcastReceivers.size() > 1) {
                            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
                        componentName = null;
                    }
                    if (componentName == null) {
                        Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    this.b = new x(context, str);
                } else if (i10 >= 28) {
                    this.b = new v(context, str);
                } else {
                    this.b = new u(context, str);
                }
                s(new p(0), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                ((u) this.b).a.setMediaButtonReceiver(pendingIntent);
                this.c = new wf.b(context, ((u) this.b).c);
                if (e == 0) {
                    e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
