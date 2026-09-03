package androidx.biometric;

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
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import f2.m1;
import f2.p0;
import j$.util.DesugarCollections;
import j3.m0;
import j3.n0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
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
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class e implements b4.b0, a3.b, v4.f, v9.a {
    public static e e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ e(int i10, boolean z4) {
        this.a = i10;
    }

    public void A(y2.i iVar, int i10, boolean z4) {
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
        if (!z4) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        j7.j0.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
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
            String c10 = j7.j0.c("JobInfoScheduler");
            if (Log.isLoggable(c10, 3)) {
                Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void B(bf.a aVar) {
        bf.h hVar;
        bf.h hVar2 = (bf.h) this.c;
        if (hVar2 != null && ((bf.a) this.d) == null && aVar != null) {
            e(hVar2);
        }
        if (((bf.a) this.d) != null && (hVar = (bf.h) this.c) != null && aVar == null) {
            z(hVar);
        }
        bf.a aVar2 = (bf.a) this.d;
        if (aVar2 != null) {
            s5.h hVar3 = aVar2.a;
            b6.m.e("Must be called from the main thread.");
            hVar3.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            bf.h hVar4 = (bf.h) this.c;
            if (hVar4 != null) {
                aVar.d = hVar4;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public void C(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ja.c cVar = (ja.c) this.b;
            m1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) cVar.a;
                int i10 = U.r;
                if (recyclerView.b0()) {
                    U.s = i10;
                    recyclerView.G0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.j0.a;
                    view2.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
        }
    }

    public void D(Object obj, String str) {
        e eVar = new e(6, false);
        ((e) this.d).d = eVar;
        this.d = eVar;
        eVar.c = obj;
        eVar.b = str;
    }

    @Override // b4.b0
    public void a(h5.w wVar) {
        long c3;
        h5.a.j((h5.c0) this.c);
        int i10 = h5.d0.a;
        h5.c0 c0Var = (h5.c0) this.c;
        synchronized (c0Var) {
            try {
                long j10 = c0Var.c;
                c3 = j10 != -9223372036854775807L ? j10 + c0Var.b : c0Var.c();
            } finally {
            }
        }
        long d = ((h5.c0) this.c).d();
        if (c3 == -9223372036854775807L || d == -9223372036854775807L) {
            return;
        }
        n0 n0Var = (n0) this.b;
        if (d != n0Var.G) {
            m0 a2 = n0Var.a();
            a2.s = d;
            n0 n0Var2 = new n0(a2);
            this.b = n0Var2;
            ((r3.v) this.d).b(n0Var2);
        }
        int a10 = wVar.a();
        ((r3.v) this.d).d(a10, wVar);
        ((r3.v) this.d).c(c3, 1, a10, 0, null);
    }

    @Override // v9.a
    public /* bridge */ /* synthetic */ v9.a b(Class cls, u9.d dVar) {
        switch (this.a) {
            case 20:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 26:
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

    @Override // b4.b0
    public void c(h5.c0 c0Var, r3.m mVar, b4.h0 h0Var) {
        this.c = c0Var;
        h0Var.a();
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 5);
        this.d = i22;
        i22.b((n0) this.b);
    }

    @Override // v4.f
    public int d(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = h5.d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    public void e(bf.h hVar) {
        if (((bf.e) this.b) == null) {
            this.b = new bf.e();
        }
        for (int i10 = 0; i10 < hVar.a.size(); i10++) {
            bf.e eVar = (bf.e) this.b;
            bf.g a2 = hVar.a(i10);
            eVar.h.put(a2.d, a2);
            eVar.h();
        }
    }

    public void f(View view, int i10, boolean z4) {
        RecyclerView recyclerView = (RecyclerView) ((ja.c) this.b).a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : s(i10);
        ((f2.c) this.c).E(childCount, z4);
        if (z4) {
            w(view);
        }
        recyclerView.addView(view, childCount);
        m1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        p0 p0Var = recyclerView.w;
        if (p0Var != null && U != null) {
            p0Var.y(U);
        }
        ArrayList arrayList = recyclerView.M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f2.f0) recyclerView.M.get(size)).getClass();
            }
        }
    }

    public void g(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = (RecyclerView) ((ja.c) this.b).a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : s(i10);
        ((f2.c) this.c).E(childCount, z4);
        if (z4) {
            w(view);
        }
        m1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // rc.a
    public Object get() {
        return new e((Context) ((rc.a) this.b).get(), (f3.d) ((rc.a) this.c).get(), (e3.a) ((db.a) this.d).get(), 13);
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
    public int h(int i10) {
        BiometricManager biometricManager;
        BiometricPrompt.CryptoObject b10;
        u uVar = (u) this.b;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 1;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return t.a(biometricManager2, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!s1.b(i10)) {
            return -2;
        }
        if (i10 != 0) {
            Context context = uVar.a;
            if (j7.n.a(context) != null) {
                int i13 = 0;
                if (s1.a(i10)) {
                    return j7.n.b(context) ? 0 : 11;
                }
                if (i11 != 29) {
                    if (i11 != 28) {
                        return i();
                    }
                    if (i11 < 23 || context == null || context.getPackageManager() == null || !l0.a(context.getPackageManager())) {
                        return 12;
                    }
                    return !j7.n.b(uVar.a) ? i() : i() == 0 ? 0 : -1;
                }
                if ((i10 & 255) == 255) {
                    BiometricManager biometricManager3 = (BiometricManager) this.c;
                    if (biometricManager3 != null) {
                        return s.a(biometricManager3);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c3 = s.c();
                if (c3 != null && (b10 = h7.s.b(h7.s.a())) != null) {
                    try {
                        Object invoke = c3.invoke((BiometricManager) this.c, b10);
                        if (invoke instanceof Integer) {
                            return ((Integer) invoke).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException e6) {
                        e = e6;
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
                    i12 = s.a(biometricManager);
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
                if (!j7.n.b(uVar.a)) {
                    i13 = i();
                } else if (i() != 0) {
                    i13 = -1;
                }
                return i13;
            }
        }
        return 12;
    }

    public int i() {
        FingerprintManager f10;
        FingerprintManager f11;
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (f10 = e0.b.f(context)) == null || !e0.b.n(f10)) {
            return 12;
        }
        return (i10 < 23 || (f11 = e0.b.f(context)) == null || !e0.b.k(f11)) ? 11 : 0;
    }

    public void j() {
        android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.b;
        if (c0Var != null) {
            int i10 = ((c2.e) this.d).n.d;
            android.support.v4.media.session.v vVar = c0Var.a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    public void k(int i10) {
        m1 U;
        int s6 = s(i10);
        ((f2.c) this.c).G(s6);
        RecyclerView recyclerView = (RecyclerView) ((ja.c) this.b).a;
        View childAt = recyclerView.getChildAt(s6);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(s6);
    }

    @Override // v4.f
    public long l(int i10) {
        long[] jArr = (long[]) this.d;
        h5.a.f(i10 >= 0);
        h5.a.f(i10 < jArr.length);
        return jArr[i10];
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
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.b bVar = new v1.b((cb.e) this.d);
            ((LinkedHashMap) bVar.a).put(q0.b, key);
            try {
                viewModel = s0Var.C(cls, bVar);
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
        androidx.lifecycle.n0 n0Var = s0Var instanceof androidx.lifecycle.n0 ? (androidx.lifecycle.n0) s0Var : null;
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
        return ((RecyclerView) ((ja.c) this.b).a).getChildAt(s(i10));
    }

    public int p() {
        return ((RecyclerView) ((ja.c) this.b).a).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override // v4.f
    public List q(long j10) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e5.e eVar = (e5.e) list.get(i10);
                v4.b bVar = eVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new e5.f(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            v4.b bVar2 = ((e5.e) arrayList2.get(i12)).a;
            arrayList.add(new v4.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i12, 1, bVar2.h, bVar2.n, bVar2.r, bVar2.y, bVar2.B, bVar2.s, bVar2.v, bVar2.w, bVar2.x, bVar2.C, bVar2.D));
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
        int childCount = ((RecyclerView) ((ja.c) this.b).a).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int y10 = i10 - (i11 - cVar.y(i11));
            if (y10 == 0) {
                while (cVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += y10;
        }
        return -1;
    }

    public View t(int i10) {
        return ((RecyclerView) ((ja.c) this.b).a).getChildAt(i10);
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                e eVar = (e) ((e) this.c).d;
                while (eVar != null) {
                    Object obj = eVar.c;
                    sb.append(str);
                    String str2 = (String) eVar.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    eVar = (e) eVar.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.c).b;
                while (kVar != null) {
                    Object obj2 = kVar.a;
                    sb2.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    kVar = kVar.b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 16:
                return ((f2.c) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                e eVar2 = (e) ((e) this.c).d;
                while (eVar2 != null) {
                    Object obj3 = eVar2.c;
                    sb3.append(str);
                    String str3 = (String) eVar2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb3.append(obj3);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r5.length() - 1);
                    }
                    eVar2 = (e) eVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((ja.c) this.b).a).getChildCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v() {
        com.google.firebase.messaging.m mVar;
        if (((com.google.firebase.messaging.o) this.d).a("gcm.n.noui")) {
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
        String f10 = ((com.google.firebase.messaging.o) this.d).f("gcm.n.image");
        if (!TextUtils.isEmpty(f10)) {
            try {
                mVar = new com.google.firebase.messaging.m(new URL(f10));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + f10);
            }
            if (mVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                mVar.b = executorService.submit(new a1.e(11, mVar, taskCompletionSource));
                mVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.j a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (com.google.firebase.messaging.o) this.d);
            e0.t tVar = (e0.t) a2.a;
            if (mVar != null) {
                try {
                    Task task = mVar.c;
                    b6.m.h(task);
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
                } catch (ExecutionException e6) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e6.getCause());
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
        com.google.firebase.messaging.j a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (com.google.firebase.messaging.o) this.d);
        e0.t tVar2 = (e0.t) a22.a;
        if (mVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((e0.t) a22.a).b());
        return true;
    }

    public void w(View view) {
        ((ArrayList) this.d).add(view);
        ja.c cVar = (ja.c) this.b;
        m1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) cVar.a;
            int i10 = U.s;
            if (i10 != -1) {
                U.r = i10;
            } else {
                WeakHashMap weakHashMap = r0.j0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.s = 4;
                recyclerView.G0.add(U);
            } else {
                WeakHashMap weakHashMap2 = r0.j0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    @Override // v4.f
    public int x() {
        return ((long[]) this.d).length;
    }

    public void y() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((ja.c) this.b).a;
        ((f2.c) this.c).H();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            m1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.r;
                if (recyclerView.b0()) {
                    U.s = i11;
                    recyclerView.G0.add(U);
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

    public void z(bf.h hVar) {
        if (((bf.e) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < hVar.a.size(); i10++) {
            bf.e eVar = (bf.e) this.b;
            eVar.h.remove(hVar.a(i10).d);
            eVar.h();
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = j7.j.c;
                break;
            case 26:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = k7.e.c;
                break;
            case 29:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = l7.i0.c;
                break;
            default:
                this.b = new e8.a();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public e(String str, Boolean bool, gc.a aVar, String str2) {
        this.a = 18;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public e(t0 store, s0 factory, cb.e defaultCreationExtras) {
        this.a = 2;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    public e(ArrayList arrayList) {
        this.a = 14;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e5.e eVar = (e5.e) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.c;
            jArr[i11] = eVar.b;
            jArr[i11 + 1] = eVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public e(ja.c cVar) {
        this.a = 16;
        this.b = cVar;
        this.c = new f2.c(0);
        this.d = new ArrayList();
    }

    public e(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                e eVar = new e(6, false);
                this.c = eVar;
                this.d = eVar;
                this.b = str;
                break;
            case 10:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.c = kVar;
                this.d = kVar;
                this.b = str;
                break;
            case 22:
                e eVar2 = new e(21, false);
                this.c = eVar2;
                this.d = eVar2;
                this.b = str;
                break;
            default:
                m0 m0Var = new m0();
                m0Var.o = str;
                this.b = new n0(m0Var);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 2;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public e(FirebaseMessagingService firebaseMessagingService, com.google.firebase.messaging.o oVar, ExecutorService executorService) {
        this.a = 11;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = oVar;
    }

    public e(Context context, LocationManager locationManager) {
        this.a = 17;
        this.d = new g.x();
        this.b = context;
        this.c = locationManager;
    }

    public e(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = 4;
        this.b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    public e(y yVar) {
        this.a = 0;
        this.d = yVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 2;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public e(l3.n[] nVarArr) {
        this.a = 28;
        l3.q0 q0Var = new l3.q0();
        l3.s0 s0Var = new l3.s0();
        s0Var.c = 1.0f;
        s0Var.d = 1.0f;
        l3.l lVar = l3.l.e;
        s0Var.e = lVar;
        s0Var.f = lVar;
        s0Var.g = lVar;
        s0Var.h = lVar;
        ByteBuffer byteBuffer = l3.n.a;
        s0Var.k = byteBuffer;
        s0Var.l = byteBuffer.asShortBuffer();
        s0Var.m = byteBuffer;
        s0Var.b = -1;
        l3.n[] nVarArr2 = new l3.n[nVarArr.length + 2];
        this.b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.c = q0Var;
        this.d = s0Var;
        nVarArr2[nVarArr.length] = q0Var;
        nVarArr2[nVarArr.length + 1] = s0Var;
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

    public e(u uVar) {
        this.a = 1;
        Context context = uVar.a;
        this.b = uVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? s.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context) : null;
    }

    public e(c2.e eVar, android.support.v4.media.session.c0 c0Var) {
        this.a = 9;
        this.d = eVar;
        this.b = c0Var;
    }
}
