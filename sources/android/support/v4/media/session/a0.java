package android.support.v4.media.session;

import ai.z3;
import android.app.KeyguardManager;
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
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import b8.f0;
import b8.k0;
import b8.m0;
import ci.u0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import db.i1;
import ei.z5;
import gi.e7;
import gi.f7;
import gi.ha;
import gi.u5;
import gi.ua;
import gi.v8;
import gi.va;
import gi.w5;
import gi.x5;
import gi.y5;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ba;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.messenger.xy;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.zh;
import org.telegram.ui.gm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class a0 implements na.a, gm0, fb.b, com.google.android.gms.common.api.internal.p, zh, k51 {
    public static int e;
    public static a0 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a0(int i3, boolean z10) {
        this.a = i3;
    }

    public static String e(String str, HashMap hashMap) {
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
            return a1.g.C(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return t4.c.q(str, sb3);
    }

    public static void f(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a0.class.getClassLoader());
        }
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        f(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @Override // org.telegram.ui.Components.zh
    public boolean L1() {
        return true;
    }

    @Override // org.telegram.ui.Components.zh
    public void Y(ng ngVar) {
        ngVar.run();
    }

    @Override // org.telegram.ui.gm0
    public void a(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((xy) arrayList.get(0)).c : null;
        if (str == null) {
            return;
        }
        Utilities.e.c(new z3(str, (v10) this.b, (d2) this.c, (u10) this.d, 4));
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        e6.e0 e0Var = (e6.e0) this.b;
        String str = (String) this.c;
        e6.i iVar = (e6.i) this.d;
        i6.w wVar = (i6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.m.i("Not connected to device", e0Var.G == 2);
        i6.f fVar = (i6.f) wVar.m();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        com.google.android.gms.internal.cast.u.c(P0, iVar);
        fVar.U0(P0, 13);
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

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(int i3) {
        BiometricManager biometricManager;
        int a10;
        BiometricPrompt.CryptoObject b10;
        androidx.biometric.t tVar = (androidx.biometric.t) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return androidx.biometric.s.a(biometricManager2, i3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!k0.b(i3)) {
            return -2;
        }
        if (i3 == 0) {
            return 12;
        }
        Context context = tVar.a;
        if (h0.a(context) == null) {
            return 12;
        }
        int i11 = 0;
        if (k0.a(i3)) {
            KeyguardManager a11 = h0.a(context);
            return a11 == null ? false : h0.b(a11) ? 0 : 11;
        }
        if (i10 != 29) {
            if (i10 != 28) {
                return d();
            }
            if (!((context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager a12 = h0.a(tVar.a);
            return !(a12 == null ? false : h0.b(a12)) ? d() : d() == 0 ? 0 : -1;
        }
        if ((i3 & hs.e4) == 255) {
            BiometricManager biometricManager3 = (BiometricManager) this.c;
            if (biometricManager3 != null) {
                return androidx.biometric.r.a(biometricManager3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c2 = androidx.biometric.r.c();
        if (c2 != null && (b10 = m0.b(m0.a())) != null) {
            try {
                Object invoke = c2.invoke((BiometricManager) this.c, b10);
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
                i11 = d();
            } else if (d() != 0) {
                i11 = -1;
            }
            return i11;
        }
    }

    @Override // na.a
    public /* bridge */ /* synthetic */ na.a c(Class cls, ma.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    public int d() {
        androidx.biometric.t tVar = (androidx.biometric.t) this.d;
        if (tVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = tVar.a;
        FingerprintManager c2 = androidx.biometric.t.c(context);
        if (c2 == null || !c2.isHardwareDetected()) {
            return 12;
        }
        FingerprintManager c10 = androidx.biometric.t.c(context);
        return (c10 == null || !c10.hasEnrolledFingerprints()) ? 11 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ad.b g() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String e10;
        String str;
        aa.g.b();
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                e10 = e((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + e10;
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
            httpsURLConnection = (HttpsURLConnection) new URL(e10).openConnection();
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
                return new ad.b(responseCode, sb2);
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

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // cd.a
    public Object get() {
        switch (this.a) {
            case 14:
                Context appContext = (Context) ((e.a) this.b).a;
                fd.h blockingDispatcher = (fd.h) ((fb.c) this.c).get();
                db.k0 sessionDataSerializer = (db.k0) ((fb.c) this.d).get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                kotlin.jvm.internal.j.e(sessionDataSerializer, "sessionDataSerializer");
                return db.q.a(sessionDataSerializer, new w5(new c1.b(sessionDataSerializer, 2), 12), wd.b0.b(blockingDispatcher), new db.p(appContext, 1));
            default:
                return new gb.p((fd.h) ((fb.c) this.b).get(), (i1) ((fb.c) this.c).get(), (l1.g) ((fb.c) this.d).get());
        }
    }

    public p0 h(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return i(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 i(Class cls, String key) {
        p0 viewModel;
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            x1.b bVar = new x1.b((u0) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.G(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.a(cls);
            }
            kotlin.jvm.internal.j.e(viewModel, "viewModel");
            p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
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
                m.p pVar = n0Var.e;
                kotlin.jvm.internal.j.b(pVar);
                j0.a(p0Var, pVar, oVar);
            }
        }
        kotlin.jvm.internal.j.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public Object j(Bitmap bitmap) {
        jh.a aVar = (jh.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((jh.b) this.c).b(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void k(ba baVar) {
        try {
            k8.f fVar = (k8.f) this.c;
            j8.b bVar = new j8.b(baVar);
            Parcel P0 = fVar.P0();
            u7.b.c(P0, bVar);
            fVar.T0(P0, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public int l(dc.e eVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            fc.e eVar2 = (fc.e) obj;
            int i11 = eVar2.d;
            dc.d dVar = eVar2.a;
            int a10 = dVar.a(eVar);
            int i12 = a10 + 4;
            int ordinal = dVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i12 = ((i11 / 2) * 11) + i12 + (i11 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i12 += eVar2.a() * 8;
                } else if (ordinal == 5) {
                    i12 = a10 + 12;
                } else if (ordinal == 6) {
                    i12 += i11 * 13;
                }
            } else {
                int i13 = ((i11 / 3) * 10) + i12;
                int i14 = i11 % 3;
                i12 = i13 + (i14 != 1 ? i14 == 2 ? 7 : 0 : 4);
            }
            i3 += i12;
        }
        return i3;
    }

    public void n(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void o() {
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

    @Override // org.telegram.ui.Components.zh
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ua uaVar;
        String str = (String) this.c;
        fi.q qVar = (fi.q) this.d;
        long j12 = qVar.d;
        bi biVar = (bi) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() != 1) {
            return;
        }
        Object next = selectedPhotos.values().iterator().next();
        if (next instanceof ye) {
            f7 l10 = f7.l((ye) next);
            l10.J0 = j12;
            l10.K0 = str;
            l10.A();
            va D = va.D(qVar.a.getParentActivity(), qVar.b);
            RectF rectF = D.I;
            WindowManager.LayoutParams layoutParams = D.h;
            int i12 = D.c;
            WindowManager windowManager = D.f;
            if (!D.d) {
                if (hp.s1(i12).v2()) {
                    org.telegram.ui.b.b(i12);
                } else {
                    D.w0 = j12;
                    D.x0 = str;
                    D.v0 = false;
                    D.e = false;
                    D.C2 = false;
                    if (windowManager != null && (uaVar = D.n) != null && uaVar.getParent() == null) {
                        g0.y3(windowManager, D.n, layoutParams);
                        windowManager.addView(D.n, layoutParams);
                        D.f0();
                    }
                    D.L1 = l10;
                    l10.J0 = j12;
                    l10.K0 = str;
                    D.P1 = l10.K ? 1 : 0;
                    D.t0.g = false;
                    D.K = 0;
                    float L = g0.L(100.0f);
                    Point point = g0.q;
                    rectF.set(0.0f, L, point.x, g0.L(100.0f) + point.y);
                    D.H = g0.L(8.0f);
                    D.r.c();
                    ha haVar = D.i0;
                    int i13 = D.K;
                    haVar.setBackgroundColor((i13 == 1 || i13 == 0) ? 0 : -14737633);
                    D.r.setTranslationX(0.0f);
                    D.r.setTranslationY(0.0f);
                    D.r.b(0.0f);
                    D.r.setScaleX(1.0f);
                    D.r.setScaleY(1.0f);
                    D.L = 0.0f;
                    g0.g2(D.b);
                    f7 f7Var = D.L1;
                    if (f7Var != null) {
                        D.d1.setText(f7Var.C0);
                    }
                    D.J(1, false);
                    D.k0(-1, false, false);
                    D.c1.b(false, false);
                    D.c1.b(true, true);
                    D.f(1.0f, true, new v8(D, 6));
                    D.d();
                }
            }
            g0.i3(new z5(biVar, 13), 400L);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
        v8 v8Var = ((y5) this.d).O;
        if (v8Var != null) {
            v8Var.run();
        }
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        y5 y5Var = (y5) this.d;
        u5 u5Var = y5Var.L;
        m51 m51Var = y5Var.e;
        if (m51Var == null) {
            return;
        }
        if (m51Var.d0()) {
            g0.h3(u5Var);
        } else {
            g0.r(u5Var);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((y5) this.d).i();
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        y5 y5Var = (y5) this.d;
        f7 f7Var = (f7) this.b;
        if (f7Var != null) {
            e7 V = y5Var.e.V(f7Var.d1);
            f7Var.d1 = V;
            b51 b51Var = y5Var.n;
            if (b51Var != null) {
                b51Var.setHDRInfo(V);
            }
        }
        int i12 = (int) (i3 * f10);
        y5Var.f = i12;
        int i13 = (int) (i10 * f10);
        y5Var.h = i13;
        if (f7Var != null && (f7Var.k0 != i12 || f7Var.l0 != i13)) {
            f7Var.k0 = i12;
            f7Var.l0 = i13;
            f7Var.A();
        }
        y5Var.b();
        b51 b51Var2 = y5Var.n;
        if (b51Var2 != null) {
            int i14 = y5Var.f;
            int i15 = y5Var.h;
            b51Var2.d = i14;
            b51Var2.e = i15;
            py pyVar = b51Var2.b;
            if (pyVar == null) {
                return;
            }
            pyVar.postRunnable(new ly(pyVar, i14, i15, 0));
        }
    }

    public void p(a3.a aVar) {
        l2.k kVar = (l2.k) ((HashMap) this.b).remove(aVar);
        kVar.getClass();
        k2.g gVar = (k2.g) ((k2.h) this.d).p.get(kVar);
        if (gVar != null) {
            synchronized (gVar) {
                gVar.d--;
            }
        }
    }

    public void q(boolean z10) {
        ((u) this.b).a.setActive(z10);
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((r4.a) obj).getClass();
        }
    }

    public void r(s sVar, Handler handler) {
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

    public void s(MediaMetadataCompat mediaMetadataCompat) {
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

    public void t(PlaybackStateCompat playbackStateCompat) {
        u uVar = (u) this.b;
        uVar.f = playbackStateCompat;
        synchronized (uVar.d) {
            for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) uVar.e.getBroadcastItem(beginBroadcast)).F0(playbackStateCompat);
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
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
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

    public String toString() {
        String str = "";
        int i3 = 0;
        switch (this.a) {
            case 2:
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
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    a0Var = (a0) a0Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
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
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r4.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 19:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                p4.q qVar = (p4.q) ((p4.q) this.c).b;
                while (qVar != null) {
                    Object obj3 = qVar.a;
                    sb4.append(str);
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj3});
                        sb4.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    qVar = (p4.q) qVar.b;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            case 20:
                StringBuilder sb5 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                fc.e eVar = null;
                while (i3 < size) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    fc.e eVar2 = (fc.e) obj4;
                    if (eVar != null) {
                        sb5.append(",");
                    }
                    sb5.append(eVar2.toString());
                    eVar = eVar2;
                }
                return sb5.toString();
            default:
                return super.toString();
        }
    }

    public void u(ArrayList arrayList) {
        int i3 = 0;
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
                long j10 = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    Log.e("MediaSessionCompat", a1.g.p(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
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
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
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

    public void v(int i3) {
        u uVar = (u) this.b;
        if (uVar.i != i3) {
            uVar.i = i3;
            synchronized (uVar.d) {
                for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) uVar.e.getBroadcastItem(beginBroadcast)).c(i3);
                    } catch (RemoteException unused) {
                    }
                }
                uVar.e.finishBroadcast();
            }
        }
    }

    public void w(int i3) {
        u uVar = (u) this.b;
        if (uVar.j != i3) {
            uVar.j = i3;
            synchronized (uVar.d) {
                for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) uVar.e.getBroadcastItem(beginBroadcast)).i(i3);
                    } catch (RemoteException unused) {
                    }
                }
                uVar.e.finishBroadcast();
            }
        }
    }

    public synchronized void x() {
        ((k2.h) this.d).c.e();
    }

    public void z(int i3, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i3));
    }

    public /* synthetic */ a0(FrameLayout frameLayout, Object obj, Serializable serializable, int i3) {
        this.a = i3;
        this.d = frameLayout;
        this.b = obj;
        this.c = serializable;
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
        f7 f7Var = (f7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        y5 y5Var = (y5) this.d;
        x5 x5Var = y5Var.I;
        if (x5Var != null && x5Var.g) {
            int i3 = y5Var.f;
            int i10 = y5Var.h;
            x5Var.d = true;
            x5Var.e = i3;
            x5Var.f = i10;
            org.telegram.ui.web.b bVar = x5Var.c;
            if (bVar != null) {
                bVar.a(Integer.valueOf(i3), Integer.valueOf(x5Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            b51 b51Var = y5Var.n;
            if (b51Var != null) {
                if (x5Var == null || !x5Var.g) {
                    b51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new g2.c(15, this, f7Var)).start();
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
            if (f7Var.M0 == y5Var.a) {
                f7Var.M0 = null;
            }
            y5Var.a = null;
            y5Var.invalidate();
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public a0(int i3) {
        this.a = i3;
        switch (i3) {
            case 17:
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

    public a0(ai.c0 c0Var, k8.f fVar) {
        this.a = 26;
        this.c = fVar;
        p6.m.g(c0Var);
        this.b = c0Var;
    }

    public a0(CastDevice castDevice, f6.e0 e0Var) {
        this.a = 15;
        p6.m.h(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = e0Var;
    }

    public a0(g6.h hVar) {
        this.a = 23;
        this.d = hVar;
        this.c = new AtomicLong((i6.a.b.nextLong() & 65535) * 10000);
    }

    public a0(String str, int i3) {
        this.a = i3;
        switch (i3) {
            case 12:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
            case 19:
                p4.q qVar = new p4.q();
                this.c = qVar;
                this.d = qVar;
                this.b = str;
                break;
            default:
                a0 a0Var = new a0(1, false);
                this.c = a0Var;
                this.d = a0Var;
                this.b = str;
                break;
        }
    }

    @Override // org.telegram.ui.gm0
    public void m() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    public a0(jh.b bVar) {
        this.a = 27;
        this.b = new jh.a();
        this.c = bVar;
    }

    public a0(String str, HashMap hashMap) {
        this.a = 18;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public a0(t0 store, s0 factory, u0 defaultCreationExtras) {
        this.a = 5;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(t0 store, s0 s0Var) {
        this(store, s0Var, x1.a.b);
        this.a = 5;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public a0(Context context, LocationManager locationManager) {
        this.a = 22;
        this.d = new eh.a();
        this.b = context;
        this.c = locationManager;
    }

    public a0(androidx.biometric.x xVar) {
        this.a = 3;
        this.d = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 5;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public a0(Signature signature) {
        this.a = 28;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public a0(Cipher cipher) {
        this.a = 28;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public a0(Mac mac) {
        this.a = 28;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public a0(androidx.biometric.t tVar) {
        this.a = 4;
        Context context = tVar.a;
        this.b = tVar;
        int i3 = Build.VERSION.SDK_INT;
        this.c = i3 >= 29 ? androidx.biometric.r.b(context) : null;
        this.d = i3 <= 29 ? new androidx.biometric.t(context, 1) : null;
    }

    public a0(b4.n nVar, dc.e eVar, fc.d dVar) {
        dc.d dVar2;
        int i3;
        int i10;
        this.a = 20;
        this.c = nVar;
        this.d = new ArrayList();
        fc.d dVar3 = dVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dVar2 = dc.d.n;
            if (dVar3 == null) {
                break;
            }
            int i13 = dVar3.c;
            int i14 = i11 + dVar3.d;
            fc.d dVar4 = dVar3.e;
            int i15 = i12;
            dc.d dVar5 = dVar3.a;
            boolean z10 = (dVar5 == dc.d.h && dVar4 == null && i13 != 0) || !(dVar4 == null || i13 == dVar4.c);
            i3 = z10 ? 1 : i15;
            if (dVar4 == null || dVar4.a != dVar5 || z10) {
                ((ArrayList) this.d).add(0, new fc.e(this, dVar5, dVar3.b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z10) {
                ((ArrayList) this.d).add(0, new fc.e(this, dVar2, dVar3.b, dVar3.c, 0));
            }
            i12 = i3;
            dVar3 = dVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z11 = nVar.a;
        dc.b bVar = (dc.b) nVar.d;
        if (z11) {
            fc.e eVar2 = (fc.e) ((ArrayList) this.d).get(0);
            if (eVar2 != null && eVar2.a != dVar2 && i16 != 0) {
                ((ArrayList) this.d).add(0, new fc.e(this, dVar2, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((fc.e) ((ArrayList) this.d).get(0)).a == dVar2 ? 1 : 0, new fc.e(this, dc.d.s, 0, 0, 0));
        }
        int i17 = eVar.a;
        int i18 = 26;
        int c2 = o1.g.c(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (c2 == 0) {
            i18 = 9;
        } else if (c2 != 1) {
            i3 = 27;
            i18 = 40;
        } else {
            i3 = 10;
        }
        int l10 = l(eVar);
        while (i17 < i18 && !fc.b.d(l10, dc.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i3 && fc.b.d(l10, dc.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.b = dc.e.c(i17);
    }

    public a0(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = 0;
        this.d = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i3 = r4.f0.a;
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
                r(new p(0), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                ((u) this.b).a.setMediaButtonReceiver(pendingIntent);
                this.c = new p4.q(context, ((u) this.b).c);
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

    public a0(k2.h hVar, l2.k kVar) {
        this.a = 29;
        this.d = hVar;
        this.b = new HashMap();
        this.c = kVar;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
