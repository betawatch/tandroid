package a5;

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
import android.support.v4.media.session.d0;
import android.support.v4.media.session.w;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.r;
import androidx.biometric.s;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
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
import com.google.firebase.messaging.n;
import d5.f0;
import e0.t;
import f2.h0;
import f2.q1;
import f2.r0;
import f7.o;
import f7.q;
import g.x;
import j$.util.DesugarCollections;
import j3.i0;
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
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class m implements r4.f, y2.b, r9.a {
    public static m e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ m(int i9, boolean z10) {
        this.a = i9;
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
            return aa.d.z(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return ta.b.j(str, sb3);
    }

    public void A(w2.i iVar, int i9, boolean z10) {
        char c10;
        c3.a aVar = (c3.a) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        t2.d dVar = iVar.c;
        adler32.update(allocate.putInt(g3.a.a(dVar)).array());
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
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i9) {
                        a.a.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((d3.h) ((d3.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(g3.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i9));
            Set set = ((c3.b) aVar.b.get(dVar)).c;
            if (set.contains(c3.c.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(c3.c.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(c3.c.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i9);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", g3.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i9));
            Integer valueOf4 = Integer.valueOf(i9);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c11 = a.a.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void B(View view) {
        if (((ArrayList) this.d).remove(view)) {
            k5.i iVar = (k5.i) this.b;
            q1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) iVar.b;
                int i9 = U.r;
                if (recyclerView.b0()) {
                    U.s = i9;
                    recyclerView.F0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = j0.a;
                    view2.setImportantForAccessibility(i9);
                }
                U.r = 0;
            }
        }
    }

    public void a(View view, int i9, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.b).b;
        int childCount = i9 < 0 ? recyclerView.getChildCount() : t(i9);
        ((f2.d) this.c).J(childCount, z10);
        if (z10) {
            y(view);
        }
        recyclerView.addView(view, childCount);
        q1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        r0 r0Var = recyclerView.w;
        if (r0Var != null && U != null) {
            r0Var.y(U);
        }
        ArrayList arrayList = recyclerView.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h0) recyclerView.L.get(size)).getClass();
            }
        }
    }

    @Override // r4.f
    public int b(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = f0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    public void c(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.b).b;
        int childCount = i9 < 0 ? recyclerView.getChildCount() : t(i9);
        ((f2.d) this.c).J(childCount, z10);
        if (z10) {
            y(view);
        }
        q1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public i0 d() {
        if (((m) this.c) == null) {
            this.c = new m(new j3.j[0]);
        }
        return new i0(this);
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
    public int e(int i9) {
        BiometricManager biometricManager;
        BiometricPrompt.CryptoObject b10;
        u5.h hVar = (u5.h) this.b;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 1;
        if (i10 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return s.a(biometricManager2, i9);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!f7.m.b(i9)) {
            return -2;
        }
        if (i9 != 0) {
            Context context = hVar.a;
            if (q.a(context) != null) {
                int i12 = 0;
                if (f7.m.a(i9)) {
                    return q.b(context) ? 0 : 11;
                }
                if (i10 != 29) {
                    if (i10 != 28) {
                        return f();
                    }
                    if (i10 < 23 || context == null || context.getPackageManager() == null || !androidx.biometric.i0.a(context.getPackageManager())) {
                        return 12;
                    }
                    return !q.b(hVar.a) ? f() : f() == 0 ? 0 : -1;
                }
                if ((i9 & 255) == 255) {
                    BiometricManager biometricManager3 = (BiometricManager) this.c;
                    if (biometricManager3 != null) {
                        return r.a(biometricManager3);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c10 = r.c();
                if (c10 != null && (b10 = o.b(o.a())) != null) {
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
                            while (r4 < r2) {
                            }
                        }
                        if (i11 == 0) {
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
                        if (i11 == 0) {
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
                        if (i11 == 0) {
                        }
                    }
                }
                biometricManager = (BiometricManager) this.c;
                if (biometricManager != null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    i11 = r.a(biometricManager);
                }
                String str222 = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str222 != null) {
                    for (String str3 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                        if (str222.equals(str3)) {
                            return i11;
                        }
                    }
                }
                if (i11 == 0) {
                    return i11;
                }
                if (!q.b(hVar.a)) {
                    i12 = f();
                } else if (f() != 0) {
                    i12 = -1;
                }
                return i12;
            }
        }
        return 12;
    }

    public int f() {
        FingerprintManager f10;
        FingerprintManager f11;
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.a;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23 || (f10 = e0.b.f(context)) == null || !e0.b.n(f10)) {
            return 12;
        }
        return (i9 < 23 || (f11 = e0.b.f(context)) == null || !e0.b.k(f11)) ? 11 : 0;
    }

    public void g() {
        d0 d0Var = (d0) this.b;
        if (d0Var != null) {
            int i9 = ((c2.e) this.d).n.d;
            w wVar = d0Var.a;
            wVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i9);
            wVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // nc.a
    public Object get() {
        return new m((Context) ((nc.a) this.b).get(), (d3.d) ((nc.a) this.c).get(), (c3.a) ((v9.d) this.d).get(), 7);
    }

    @Override // r4.f
    public long h(int i9) {
        long[] jArr = (long[]) this.d;
        d5.a.f(i9 >= 0);
        d5.a.f(i9 < jArr.length);
        return jArr[i9];
    }

    public void j(int i9) {
        q1 U;
        int t10 = t(i9);
        ((f2.d) this.c).K(t10);
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.b).b;
        View childAt = recyclerView.getChildAt(t10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(t10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a1 k() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        String i9;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                i9 = i((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + i9;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(i9).openConnection();
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
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new a1(responseCode, sb2);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
            httpsURLConnection = null;
            if (inputStream != null) {
            }
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }

    @Override // r9.a
    public /* bridge */ /* synthetic */ r9.a l(Class cls, q9.d dVar) {
        switch (this.a) {
            case 12:
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

    @Override // r4.f
    public List m(long j10) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            long[] jArr = (long[]) this.c;
            int i10 = i9 * 2;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                d dVar = (d) list.get(i9);
                r4.b bVar = dVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new e(1));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            r4.b bVar2 = ((d) arrayList2.get(i11)).a;
            arrayList.add(new r4.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i11, 1, bVar2.h, bVar2.n, bVar2.r, bVar2.y, bVar2.A, bVar2.s, bVar2.v, bVar2.w, bVar2.x, bVar2.B, bVar2.C));
        }
        return arrayList;
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
            v1.b bVar = new v1.b((a8.a) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.o(cls, bVar);
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
                g2.e eVar = n0Var.e;
                kotlin.jvm.internal.i.b(eVar);
                androidx.lifecycle.j0.a(p0Var, eVar, oVar);
            }
        }
        kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public View p(int i9) {
        return ((RecyclerView) ((k5.i) this.b).b).getChildAt(t(i9));
    }

    public int q() {
        return ((RecyclerView) ((k5.i) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override // r4.f
    public int r() {
        return ((long[]) this.d).length;
    }

    public ByteBuffer s() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i9 = width * height;
        ((Bitmap) this.d).getPixels(new int[i9], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((Color.blue(r2[i10]) * 0.114f) + (Color.green(r2[i10]) * 0.587f) + (Color.red(r2[i10]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public int t(int i9) {
        f2.d dVar = (f2.d) this.c;
        if (i9 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((k5.i) this.b).b).getChildCount();
        int i10 = i9;
        while (i10 < childCount) {
            int E = i9 - (i10 - dVar.E(i10));
            if (E == 0) {
                while (dVar.H(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += E;
        }
        return -1;
    }

    public String toString() {
        String str = "";
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
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                return ((f2.d) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                m mVar = (m) ((m) this.c).d;
                while (mVar != null) {
                    Object obj2 = mVar.c;
                    sb3.append(str);
                    String str2 = (String) mVar.b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    mVar = (m) mVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 26:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                m mVar2 = (m) ((m) this.c).d;
                while (mVar2 != null) {
                    Object obj3 = mVar2.c;
                    sb4.append(str);
                    String str3 = (String) mVar2.b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r5.length() - 1);
                    }
                    mVar2 = (m) mVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i9) {
        return ((RecyclerView) ((k5.i) this.b).b).getChildAt(i9);
    }

    public int v() {
        return ((RecyclerView) ((k5.i) this.b).b).getChildCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean w() {
        n nVar;
        if (((k5.i) this.d).G("gcm.n.noui")) {
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
        String K = ((k5.i) this.d).K("gcm.n.image");
        if (!TextUtils.isEmpty(K)) {
            try {
                nVar = new n(new URL(K));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + K);
            }
            if (nVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                nVar.b = executorService.submit(new a1.e(23, nVar, taskCompletionSource));
                nVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.i a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (k5.i) this.d);
            t tVar = (t) a2.a;
            if (nVar != null) {
                try {
                    Task task = nVar.c;
                    x5.l.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    tVar.j(bitmap);
                    e0.n nVar2 = new e0.n();
                    nVar2.e = bitmap == null ? null : IconCompat.c(bitmap);
                    nVar2.f = null;
                    nVar2.g = true;
                    tVar.n(nVar2);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    nVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e10) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    nVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.b, 0, ((t) a2.a).b());
            return true;
        }
        nVar = null;
        if (nVar != null) {
        }
        com.google.firebase.messaging.i a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (k5.i) this.d);
        t tVar2 = (t) a22.a;
        if (nVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((t) a22.a).b());
        return true;
    }

    public void x(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void y(View view) {
        ((ArrayList) this.d).add(view);
        k5.i iVar = (k5.i) this.b;
        q1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) iVar.b;
            int i9 = U.s;
            if (i9 != -1) {
                U.r = i9;
            } else {
                WeakHashMap weakHashMap = j0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.s = 4;
                recyclerView.F0.add(U);
            } else {
                WeakHashMap weakHashMap2 = j0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void z() {
        int i9;
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.b).b;
        ((f2.d) this.c).L();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            q1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.r;
                if (recyclerView.b0()) {
                    U.s = i10;
                    recyclerView.F0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = j0.a;
                    view.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public m(String str, int i9) {
        this.a = i9;
        switch (i9) {
            case 14:
                m mVar = new m(13, false);
                this.c = mVar;
                this.d = mVar;
                this.b = str;
                break;
            case 26:
                m mVar2 = new m(25, false);
                this.c = mVar2;
                this.d = mVar2;
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

    public m(int i9) {
        this.a = i9;
        switch (i9) {
            case 12:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = f7.j.c;
                break;
            case 18:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = g7.e.c;
                break;
            case 21:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = h7.i0.c;
                break;
            case 28:
                this.b = j3.g.c;
                this.d = j3.j0.a;
                break;
            default:
                this.b = new a8.b();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public m(String str, Boolean bool, cc.a aVar, String str2) {
        this.a = 8;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public m(ArrayList arrayList) {
        this.a = 0;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            d dVar = (d) arrayList.get(i9);
            int i10 = i9 * 2;
            long[] jArr = (long[]) this.c;
            jArr[i10] = dVar.b;
            jArr[i10 + 1] = dVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public m(String str, HashMap hashMap) {
        this.a = 27;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public m(t0 store, s0 factory, a8.a defaultCreationExtras) {
        this.a = 4;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    public m(k5.i iVar) {
        this.a = 11;
        this.b = iVar;
        this.c = new f2.d(0);
        this.d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 4;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public m(FirebaseMessagingService firebaseMessagingService, k5.i iVar, ExecutorService executorService) {
        this.a = 10;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = iVar;
    }

    public m(Context context, LocationManager locationManager) {
        this.a = 17;
        this.d = new x();
        this.b = context;
        this.c = locationManager;
    }

    public m(androidx.biometric.w wVar) {
        this.a = 2;
        this.d = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 4;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public m(j3.j[] jVarArr) {
        this.a = 29;
        j3.p0 p0Var = new j3.p0();
        j3.s0 s0Var = new j3.s0();
        s0Var.c = 1.0f;
        s0Var.d = 1.0f;
        j3.h hVar = j3.h.e;
        s0Var.e = hVar;
        s0Var.f = hVar;
        s0Var.g = hVar;
        s0Var.h = hVar;
        ByteBuffer byteBuffer = j3.j.a;
        s0Var.k = byteBuffer;
        s0Var.l = byteBuffer.asShortBuffer();
        s0Var.m = byteBuffer;
        s0Var.b = -1;
        j3.j[] jVarArr2 = new j3.j[jVarArr.length + 2];
        this.b = jVarArr2;
        System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
        this.c = p0Var;
        this.d = s0Var;
        jVarArr2[jVarArr.length] = p0Var;
        jVarArr2[jVarArr.length + 1] = s0Var;
    }

    public m(u5.h hVar) {
        this.a = 3;
        Context context = hVar.a;
        this.b = hVar;
        int i9 = Build.VERSION.SDK_INT;
        this.c = i9 >= 29 ? r.b(context) : null;
        this.d = i9 <= 29 ? new k0.b(context) : null;
    }

    public m(c2.e eVar, d0 d0Var) {
        this.a = 6;
        this.d = eVar;
        this.b = d0Var;
    }
}
