package androidx.biometric;

import ag.o1;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.clearcut.a1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import f2.n1;
import f2.p0;
import h7.j5;
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
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import l3.k0;
import l3.l0;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class e implements t4.f, a3.b, t9.a {
    public static e e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ e(int i10, boolean z10) {
        this.a = i10;
    }

    public static String h(String str, HashMap hashMap) {
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
            return a4.w.y(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return u3.c.k(str, sb3);
    }

    public void A(y2.i iVar, int i10, boolean z10) {
        char c3;
        e3.a aVar = (e3.a) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        v2.d dVar = iVar.c;
        adler32.update(allocate.putInt(i3.a.a(dVar)).array());
        byte[] bArr = iVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        j5.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((f3.h) ((f3.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(i3.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
            Set set = ((e3.b) aVar.b.get(dVar)).c;
            if (set.contains(e3.c.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e3.c.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e3.c.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", i3.a.a(dVar));
            if (bArr != null) {
                c3 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c3 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c3] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c6 = j5.c("JobInfoScheduler");
            if (Log.isLoggable(c6, 3)) {
                Log.d(c6, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void B(View view) {
        if (((ArrayList) this.d).remove(view)) {
            o1 o1Var = (o1) this.b;
            n1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) o1Var.b;
                int i10 = U.r;
                if (recyclerView.b0()) {
                    U.s = i10;
                    recyclerView.F0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.j0.a;
                    view2.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
        }
    }

    public void a(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((o1) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : s(i10);
        ((f2.c) this.c).E(childCount, z10);
        if (z10) {
            y(view);
        }
        recyclerView.addView(view, childCount);
        n1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        p0 p0Var = recyclerView.w;
        if (p0Var != null && U != null) {
            p0Var.y(U);
        }
        ArrayList arrayList = recyclerView.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f2.e0) recyclerView.L.get(size)).getClass();
            }
        }
    }

    public void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((o1) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : s(i10);
        ((f2.c) this.c).E(childCount, z10);
        if (z10) {
            y(view);
        }
        n1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public k0 c() {
        if (((l3.g0) this.c) == null) {
            this.c = new l3.g0(new l3.j[0]);
        }
        return new k0(this);
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
    public int d(int i10) {
        BiometricManager biometricManager;
        BiometricPrompt.CryptoObject b10;
        t tVar = (t) this.b;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 1;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return s.a(biometricManager2, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!h7.u.b(i10)) {
            return -2;
        }
        if (i10 != 0) {
            Context context = tVar.a;
            if (h7.y.a(context) != null) {
                int i13 = 0;
                if (h7.u.a(i10)) {
                    return h7.y.b(context) ? 0 : 11;
                }
                if (i11 != 29) {
                    if (i11 != 28) {
                        return f();
                    }
                    if (i11 < 23 || context == null || context.getPackageManager() == null || !j0.a(context.getPackageManager())) {
                        return 12;
                    }
                    return !h7.y.b(tVar.a) ? f() : f() == 0 ? 0 : -1;
                }
                if ((i10 & 255) == 255) {
                    BiometricManager biometricManager3 = (BiometricManager) this.c;
                    if (biometricManager3 != null) {
                        return r.a(biometricManager3);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c3 = r.c();
                if (c3 != null && (b10 = h7.w.b(h7.w.a())) != null) {
                    try {
                        Object invoke = c3.invoke((BiometricManager) this.c, b10);
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
                            while (r4 < r2) {
                            }
                        }
                        if (i12 == 0) {
                        }
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                        biometricManager = (BiometricManager) this.c;
                        if (biometricManager != null) {
                        }
                        String str2 = Build.MODEL;
                        if (Build.VERSION.SDK_INT < 30) {
                        }
                        if (i12 == 0) {
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
                        if (i12 == 0) {
                        }
                    }
                }
                biometricManager = (BiometricManager) this.c;
                if (biometricManager != null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    i12 = r.a(biometricManager);
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
                if (!h7.y.b(tVar.a)) {
                    i13 = f();
                } else if (f() != 0) {
                    i13 = -1;
                }
                return i13;
            }
        }
        return 12;
    }

    @Override // t4.f
    public int e(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = f5.d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    public int f() {
        FingerprintManager f9;
        FingerprintManager f10;
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (f9 = e0.b.f(context)) == null || !e0.b.n(f9)) {
            return 12;
        }
        return (i10 < 23 || (f10 = e0.b.f(context)) == null || !e0.b.k(f10)) ? 11 : 0;
    }

    public void g() {
        android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) this.b;
        if (d0Var != null) {
            int i10 = ((c2.e) this.d).n.d;
            android.support.v4.media.session.w wVar = d0Var.a;
            wVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            wVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // pc.a
    public Object get() {
        return new e((Context) ((pc.a) this.b).get(), (f3.d) ((pc.a) this.c).get(), (e3.a) ((ya.a) this.d).get(), 9);
    }

    @Override // t9.a
    public /* bridge */ /* synthetic */ t9.a i(Class cls, s9.d dVar) {
        switch (this.a) {
            case 13:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 18:
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

    public void j(int i10) {
        n1 U;
        int s10 = s(i10);
        ((f2.c) this.c).G(s10);
        RecyclerView recyclerView = (RecyclerView) ((o1) this.b).b;
        View childAt = recyclerView.getChildAt(s10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(s10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a1 k() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String h;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                h = h((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + h;
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
            httpsURLConnection = (HttpsURLConnection) new URL(h).openConnection();
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
                return new a1(responseCode, sb2);
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

    public androidx.lifecycle.p0 l(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // t4.f
    public long m(int i10) {
        long[] jArr = (long[]) this.d;
        f5.a.f(i10 >= 0);
        f5.a.f(i10 < jArr.length);
        return jArr[i10];
    }

    public androidx.lifecycle.p0 n(Class cls, String key) {
        androidx.lifecycle.p0 viewModel;
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.b bVar = new v1.b((ab.e) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.Z0(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.h(cls);
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
                g2.e eVar = n0Var.e;
                kotlin.jvm.internal.j.b(eVar);
                androidx.lifecycle.j0.a(p0Var, eVar, oVar);
            }
        }
        kotlin.jvm.internal.j.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public View o(int i10) {
        return ((RecyclerView) ((o1) this.b).b).getChildAt(s(i10));
    }

    public int p() {
        return ((RecyclerView) ((o1) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override // t4.f
    public List q(long j10) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                c5.d dVar = (c5.d) list.get(i10);
                t4.b bVar = dVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new c5.e(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            t4.b bVar2 = ((c5.d) arrayList2.get(i12)).a;
            arrayList.add(new t4.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i12, 1, bVar2.h, bVar2.n, bVar2.r, bVar2.y, bVar2.A, bVar2.s, bVar2.v, bVar2.w, bVar2.x, bVar2.B, bVar2.C));
        }
        return arrayList;
    }

    public ByteBuffer r() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i10 = width * height;
        ((Bitmap) this.d).getPixels(new int[i10], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.blue(r2[i11]) * 0.114f) + (Color.green(r2[i11]) * 0.587f) + (Color.red(r2[i11]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public int s(int i10) {
        f2.c cVar = (f2.c) this.c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((o1) this.b).b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int A = i10 - (i11 - cVar.A(i11));
            if (A == 0) {
                while (cVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += A;
        }
        return -1;
    }

    public View t(int i10) {
        return ((RecyclerView) ((o1) this.b).b).getChildAt(i10);
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 6:
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
            case 11:
                return ((f2.c) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 15:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                e eVar = (e) ((e) this.c).d;
                while (eVar != null) {
                    Object obj2 = eVar.c;
                    sb3.append(str);
                    String str2 = (String) eVar.b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    eVar = (e) eVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 27:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                e eVar2 = (e) ((e) this.c).d;
                while (eVar2 != null) {
                    Object obj3 = eVar2.c;
                    sb4.append(str);
                    String str3 = (String) eVar2.b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r5.length() - 1);
                    }
                    eVar2 = (e) eVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((o1) this.b).b).getChildCount();
    }

    @Override // t4.f
    public int v() {
        return ((long[]) this.d).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean w() {
        com.google.firebase.messaging.m mVar;
        if (((ha.c) this.d).W("gcm.n.noui")) {
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
        String c02 = ((ha.c) this.d).c0("gcm.n.image");
        if (!TextUtils.isEmpty(c02)) {
            try {
                mVar = new com.google.firebase.messaging.m(new URL(c02));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + c02);
            }
            if (mVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                mVar.b = executorService.submit(new a1.e(22, mVar, taskCompletionSource));
                mVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.j a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (ha.c) this.d);
            e0.t tVar = (e0.t) a2.a;
            if (mVar != null) {
                try {
                    Task task = mVar.c;
                    z5.l.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    tVar.j(bitmap);
                    e0.n nVar = new e0.n();
                    nVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    nVar.f = null;
                    nVar.g = true;
                    tVar.n(nVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    mVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e10) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    mVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.b, 0, ((e0.t) a2.a).b());
            return true;
        }
        mVar = null;
        if (mVar != null) {
        }
        com.google.firebase.messaging.j a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (ha.c) this.d);
        e0.t tVar2 = (e0.t) a22.a;
        if (mVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((e0.t) a22.a).b());
        return true;
    }

    public void x(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void y(View view) {
        ((ArrayList) this.d).add(view);
        o1 o1Var = (o1) this.b;
        n1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) o1Var.b;
            int i10 = U.s;
            if (i10 != -1) {
                U.r = i10;
            } else {
                WeakHashMap weakHashMap = r0.j0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.s = 4;
                recyclerView.F0.add(U);
            } else {
                WeakHashMap weakHashMap2 = r0.j0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void z() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((o1) this.b).b;
        ((f2.c) this.c).I();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            n1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.r;
                if (recyclerView.b0()) {
                    U.s = i11;
                    recyclerView.F0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = r0.j0.a;
                    view.setImportantForAccessibility(i11);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public e(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                e eVar = new e(14, false);
                this.c = eVar;
                this.d = eVar;
                this.b = str;
                break;
            case 27:
                e eVar2 = new e(26, false);
                this.c = eVar2;
                this.d = eVar2;
                this.b = str;
                break;
            default:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
        }
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = h7.j.c;
                break;
            case 18:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = i7.e.c;
                break;
            case 21:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = j7.i0.c;
                break;
            case 29:
                this.b = l3.g.c;
                this.d = l0.a;
                break;
            default:
                this.b = new c8.a();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public e(String str, Boolean bool, ec.a aVar, String str2) {
        this.a = 10;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public e(ArrayList arrayList) {
        this.a = 4;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c5.d dVar = (c5.d) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.c;
            jArr[i11] = dVar.b;
            jArr[i11 + 1] = dVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public e(String str, HashMap hashMap) {
        this.a = 28;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public e(t0 store, s0 factory, ab.e defaultCreationExtras) {
        this.a = 2;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    public e(o1 o1Var) {
        this.a = 11;
        this.b = o1Var;
        this.c = new f2.c(0);
        this.d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 2;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public e(FirebaseMessagingService firebaseMessagingService, ha.c cVar, ExecutorService executorService) {
        this.a = 7;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = cVar;
    }

    public e(Context context, LocationManager locationManager) {
        this.a = 12;
        this.d = new g.x();
        this.b = context;
        this.c = locationManager;
    }

    public e(x xVar) {
        this.a = 0;
        this.d = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 2;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public e(Signature signature) {
        this.a = 25;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public e(Cipher cipher) {
        this.a = 25;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public e(Mac mac) {
        this.a = 25;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public e(t tVar) {
        this.a = 1;
        Context context = tVar.a;
        this.b = tVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? r.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context) : null;
    }

    public e(c2.e eVar, android.support.v4.media.session.d0 d0Var) {
        this.a = 3;
        this.d = eVar;
        this.b = d0Var;
    }
}
