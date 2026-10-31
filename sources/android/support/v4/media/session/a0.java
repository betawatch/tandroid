package android.support.v4.media.session;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
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
import androidx.biometric.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import b2.v0;
import bi.d4;
import bi.j4;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.k0;
import e2.l0;
import j$.util.DesugarCollections;
import j4.g0;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import k2.b1;
import m.p3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ia;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import p4.f0;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 implements com.google.android.gms.common.api.internal.s, z3.d, j4.b0, OnCompleteListener, n5.b {
    public static int e;
    public static a0 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a0(int i10) {
        this.a = i10;
    }

    public static Bundle H(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        k(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final URL b(a0 a0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) a0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        bb.b bVar = (bb.b) a0Var.b;
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
            return a1.g.C(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return sc.e.A(str, sb3);
    }

    public static void k(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a0.class.getClassLoader());
        }
    }

    public void A(hf.a aVar) {
        j4 j4Var;
        j4 j4Var2 = (j4) this.c;
        if (j4Var2 != null && ((hf.a) this.d) == null && aVar != null) {
            e(j4Var2);
        }
        if (((hf.a) this.d) != null && (j4Var = (j4) this.c) != null && aVar == null) {
            w(j4Var);
        }
        hf.a aVar2 = (hf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.a;
            n6.l.d("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            j4 j4Var3 = (j4) this.c;
            if (j4Var3 != null) {
                aVar.d = j4Var3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public void B(MediaMetadataCompat mediaMetadataCompat) {
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

    public void C(PlaybackStateCompat playbackStateCompat) {
        u uVar = (u) this.b;
        uVar.f = playbackStateCompat;
        synchronized (uVar.d) {
            for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) uVar.e.getBroadcastItem(beginBroadcast)).E0(playbackStateCompat);
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj;
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e7 = b0.e(customAction.a, customAction.b, customAction.c);
                    b0.w(e7, customAction.d);
                    customAction2 = b0.b(e7);
                }
                b0.a(d, customAction2);
            }
            b0.t(d, playbackStateCompat.s);
            c0.b(d, playbackStateCompat.w);
            playbackStateCompat.x = b0.c(d);
        }
        mediaSession.setPlaybackState(playbackStateCompat.x);
    }

    public void D(ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) obj;
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j10 = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    Log.e("MediaSessionCompat", a1.g.l(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
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
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
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

    public void E(int i10) {
        u uVar = (u) this.b;
        if (uVar.i != i10) {
            uVar.i = i10;
            synchronized (uVar.d) {
                for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) uVar.e.getBroadcastItem(beginBroadcast)).c(i10);
                    } catch (RemoteException unused) {
                    }
                }
                uVar.e.finishBroadcast();
            }
        }
    }

    public void F(int i10) {
        u uVar = (u) this.b;
        if (uVar.j != i10) {
            uVar.j = i10;
            synchronized (uVar.d) {
                for (int beginBroadcast = uVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) uVar.e.getBroadcastItem(beginBroadcast)).i(i10);
                    } catch (RemoteException unused) {
                    }
                }
                uVar.e.finishBroadcast();
            }
        }
    }

    public synchronized void G() {
        ((i2.h) this.d).c.e();
    }

    public void I(int i10, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    @Override // z3.d
    public int a(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = l0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        c6.e0 e0Var = (c6.e0) this.b;
        String str = (String) this.c;
        c6.i iVar = (c6.i) this.d;
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        n6.l.i("Not connected to device", e0Var.F == 2);
        g6.f fVar = (g6.f) wVar.v();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        com.google.android.gms.internal.cast.u.c(P0, iVar);
        fVar.U0(P0, 13);
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
    public void c(e2.x xVar) {
        long d;
        ((k0) this.c).getClass();
        String str = l0.a;
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
            ((c3.k0) this.d).b(xVar3);
        }
        int a10 = xVar.a();
        ((c3.k0) this.d).d(a10, xVar);
        ((c3.k0) this.d).c(d, 1, a10, 0, null);
    }

    @Override // j4.b0
    public void d(k0 k0Var, c3.q qVar, g0 g0Var) {
        this.c = k0Var;
        g0Var.b();
        g0Var.c();
        c3.k0 I1 = qVar.I1(g0Var.c, 5);
        this.d = I1;
        I1.b((b2.x) this.b);
    }

    public void e(j4 j4Var) {
        if (((hf.d) this.b) == null) {
            this.b = new hf.d();
        }
        for (int i10 = 0; i10 < j4Var.a.size(); i10++) {
            hf.d dVar = (hf.d) this.b;
            hf.f c10 = j4Var.c(i10);
            dVar.h.put(c10.d, c10);
            dVar.h();
        }
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

    @Override // z3.d
    public long g(int i10) {
        long[] jArr = (long[]) this.d;
        t6.f(i10 >= 0);
        t6.f(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // zc.a
    public Object get() {
        int i10 = 21;
        return new l5.s(new t7.u(i10), new oa.d(i10), (q5.c) ((bh.d) this.b).get(), (ea.d) ((p3) this.c).get(), (ji.f) ((xa.n) this.d).get());
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
        androidx.biometric.s sVar = (androidx.biometric.s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return androidx.biometric.r.a(biometricManager2, i10);
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
        Context context = sVar.a;
        if (androidx.biometric.g0.a(context) == null) {
            return 12;
        }
        int i12 = 0;
        if (v7.k.a(i10)) {
            KeyguardManager a10 = androidx.biometric.g0.a(context);
            return a10 == null ? false : androidx.biometric.g0.b(a10) ? 0 : 11;
        }
        if (i11 != 29) {
            if (i11 != 28) {
                return i();
            }
            if (!((context == null || context.getPackageManager() == null || !h0.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager a11 = androidx.biometric.g0.a(sVar.a);
            return !(a11 == null ? false : androidx.biometric.g0.b(a11)) ? i() : i() == 0 ? 0 : -1;
        }
        if ((i10 & zs.e4) == 255) {
            BiometricManager biometricManager3 = (BiometricManager) this.c;
            if (biometricManager3 != null) {
                return androidx.biometric.q.a(biometricManager3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c10 = androidx.biometric.q.c();
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
            KeyguardManager a12 = androidx.biometric.g0.a(sVar.a);
            if (!(a12 == null ? false : androidx.biometric.g0.b(a12))) {
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
        FingerprintManager e7 = k0.b.e(context);
        if (e7 == null || !e7.isHardwareDetected()) {
            return 12;
        }
        FingerprintManager e10 = k0.b.e(context);
        return (e10 == null || !e10.hasEnrolledFingerprints()) ? 11 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ba.a l() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String j10;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                j10 = j((String) this.b, (HashMap) this.c);
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

    public ef.e m(ef.f fVar) {
        InputStream inputStream;
        int i10 = fVar.c;
        InputStream inputStream2 = (ff.b) this.b;
        if (fVar.d) {
            k6.h hVar = (k6.h) this.d;
            hVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((ff.a) hVar.b).read(bArr, i11, i10 - i11);
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
            throw new ef.c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new ef.e(inputStream, fVar.b, i10, (ef.h) this.c, fVar);
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
            v1.b bVar = new v1.b((b2.h) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.E0(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.d(cls);
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

    @Override // z3.d
    public List p(long j10) {
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
        Collections.sort(arrayList2, new a4.d(7));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).a;
            arrayList.add(new d2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i12, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    public void q(ia iaVar) {
        try {
            i8.g gVar = (i8.g) this.c;
            h8.b bVar = new h8.b(iaVar);
            Parcel P0 = gVar.P0();
            s7.b.c(P0, bVar);
            gVar.T0(P0, 9);
        } catch (RemoteException e7) {
            throw new ad.d(e7);
        }
    }

    public int r(ac.h hVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            cc.e eVar = (cc.e) obj;
            int i12 = eVar.d;
            ac.f fVar = eVar.a;
            int a2 = fVar.a(hVar);
            int i13 = a2 + 4;
            int ordinal = fVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i13 = ((i12 / 2) * 11) + i13 + (i12 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i13 += eVar.a() * 8;
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

    @Override // z3.d
    public int s() {
        return ((long[]) this.d).length;
    }

    public void t(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.a) {
            case 11:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                cc.e eVar = null;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    cc.e eVar2 = (cc.e) obj;
                    if (eVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(eVar2.toString());
                    eVar = eVar2;
                }
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
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r3.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 13:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                hf.b bVar = (hf.b) ((hf.b) this.c).c;
                while (bVar != null) {
                    Object obj3 = bVar.b;
                    sb4.append(str);
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj3});
                        sb4.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    bVar = (hf.b) bVar.c;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            case 14:
            case 15:
            default:
                return super.toString();
            case 16:
                StringBuilder sb5 = new StringBuilder("id3v2tag[pos=");
                ff.b bVar2 = (ff.b) this.b;
                sb5.append(bVar2.b);
                sb5.append(", ");
                sb5.append(bVar2.e());
                sb5.append(" left]");
                return sb5.toString();
        }
    }

    public void u() {
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
            } catch (Exception e7) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
            }
        }
        mediaSession.setCallback(null);
        uVar.b.a.set(null);
        mediaSession.release();
    }

    public void v(y2.a aVar) {
        j2.l lVar = (j2.l) ((HashMap) this.b).remove(aVar);
        lVar.getClass();
        i2.g gVar = (i2.g) ((i2.h) this.d).p.get(lVar);
        if (gVar != null) {
            synchronized (gVar) {
                gVar.d--;
            }
        }
    }

    public void w(j4 j4Var) {
        if (((hf.d) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < j4Var.a.size(); i10++) {
            hf.d dVar = (hf.d) this.b;
            dVar.h.remove(j4Var.c(i10).d);
            dVar.h();
        }
    }

    public void x(boolean z10) {
        ((u) this.b).a.setActive(z10);
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p4.a) obj).getClass();
        }
    }

    public void y(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public void z(s sVar, Handler handler) {
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

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public a0() {
        this.a = 10;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public a0(CastDevice castDevice, d6.d0 d0Var) {
        this.a = 8;
        n6.l.h(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = d0Var;
    }

    public a0(e6.h hVar) {
        this.a = 15;
        this.d = hVar;
        this.c = new AtomicLong((g6.a.b.nextLong() & 65535) * 10000);
    }

    public a0(fg.i iVar, i8.g gVar) {
        this.a = 18;
        this.c = gVar;
        n6.l.g(iVar);
        this.b = iVar;
    }

    public a0(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                hf.b bVar = new hf.b(14, false);
                this.c = bVar;
                this.d = bVar;
                this.b = str;
                break;
            case 22:
                b2.w wVar = new b2.w();
                wVar.q = v0.n("video/mp2t");
                wVar.r = v0.n(str);
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

    public a0(InputStream inputStream, long j10, int i10, ef.h hVar) {
        this.a = 16;
        ff.b bVar = new ff.b(inputStream, j10, i10);
        this.b = bVar;
        this.d = new k6.h(bVar, 22);
        this.c = hVar;
    }

    public a0(bb.b bVar, cd.h hVar) {
        this.a = 14;
        this.b = bVar;
        this.c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public a0(ArrayList arrayList) {
        this.a = 21;
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

    public a0(String str, HashMap hashMap) {
        this.a = 5;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public a0(t0 store, s0 factory, b2.h defaultCreationExtras) {
        this.a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a0(Context context, LocationManager locationManager) {
        this.a = 17;
        this.d = new g.y();
        this.b = context;
        this.c = locationManager;
    }

    public a0(androidx.biometric.w wVar) {
        this.a = 1;
        this.d = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a0(c2.m[] mVarArr) {
        this.a = 27;
        b1 b1Var = new b1();
        c2.s sVar = new c2.s();
        sVar.c = 1.0f;
        sVar.d = 1.0f;
        c2.j jVar = c2.j.e;
        sVar.e = jVar;
        sVar.f = jVar;
        sVar.g = jVar;
        sVar.h = jVar;
        ByteBuffer byteBuffer = c2.m.a;
        sVar.k = byteBuffer;
        sVar.l = byteBuffer;
        sVar.b = -1;
        c2.m[] mVarArr2 = new c2.m[mVarArr.length + 2];
        this.b = mVarArr2;
        System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
        this.c = b1Var;
        this.d = sVar;
        mVarArr2[mVarArr.length] = b1Var;
        mVarArr2[mVarArr.length + 1] = sVar;
    }

    public a0(Signature signature) {
        this.a = 26;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public a0(Cipher cipher) {
        this.a = 26;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public a0(Mac mac) {
        this.a = 26;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public a0(androidx.biometric.s sVar) {
        this.a = 2;
        Context context = sVar.a;
        this.b = sVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context, false) : null;
    }

    public a0(ac.a aVar, ac.h hVar, cc.d dVar) {
        ac.f fVar;
        int i10;
        int i11;
        this.a = 11;
        this.c = aVar;
        this.d = new ArrayList();
        cc.d dVar2 = dVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            fVar = ac.f.n;
            if (dVar2 == null) {
                break;
            }
            int i14 = dVar2.c;
            int i15 = i12 + dVar2.d;
            cc.d dVar3 = dVar2.e;
            int i16 = i13;
            ac.f fVar2 = dVar2.a;
            boolean z10 = (fVar2 == ac.f.h && dVar3 == null && i14 != 0) || !(dVar3 == null || i14 == dVar3.c);
            i10 = z10 ? 1 : i16;
            if (dVar3 == null || dVar3.a != fVar2 || z10) {
                ((ArrayList) this.d).add(0, new cc.e(this, fVar2, dVar2.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.d).add(0, new cc.e(this, fVar, dVar2.b, dVar2.c, 0));
            }
            i13 = i10;
            dVar2 = dVar3;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = aVar.a;
        ac.d dVar4 = (ac.d) aVar.d;
        if (z11) {
            cc.e eVar = (cc.e) ((ArrayList) this.d).get(0);
            if (eVar != null && eVar.a != fVar && i17 != 0) {
                ((ArrayList) this.d).add(0, new cc.e(this, fVar, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((cc.e) ((ArrayList) this.d).get(0)).a == fVar ? 1 : 0, new cc.e(this, ac.f.s, 0, 0, 0));
        }
        int i18 = hVar.a;
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
        int r10 = r(hVar);
        while (i18 < i19 && !cc.b.d(r10, ac.h.c(i18), dVar4)) {
            i18++;
        }
        while (i18 > i10 && cc.b.d(r10, ac.h.c(i18 - 1), dVar4)) {
            i18--;
        }
        this.b = ac.h.c(i18);
    }

    public a0(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = 0;
        this.d = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i10 = f0.b;
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
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    this.b = new x(context, str);
                } else if (i11 >= 28) {
                    this.b = new v(context, str);
                } else {
                    this.b = new u(context, str);
                }
                z(new p(0), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                ((u) this.b).a.setMediaButtonReceiver(pendingIntent);
                this.c = new hf.b(context, ((u) this.b).c);
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

    public a0(String str, String str2) {
        this.a = 25;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : a1.g.C(str, "/", str2);
    }

    public a0(i2.h hVar, j2.l lVar) {
        this.a = 20;
        this.d = hVar;
        this.b = new HashMap();
        this.c = lVar;
    }

    public a0(bi.a aVar, bi.w wVar, d4 d4Var) {
        this.a = 7;
        this.d = d4Var;
        this.b = wVar;
        this.c = aVar;
    }
}
