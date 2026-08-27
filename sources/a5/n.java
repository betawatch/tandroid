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
import android.net.Uri;
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
import androidx.biometric.i0;
import androidx.biometric.q;
import androidx.biometric.r;
import androidx.biometric.s;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import d5.g0;
import e0.t;
import f2.f0;
import f2.o1;
import f2.q0;
import g.y;
import g7.o;
import j$.util.DesugarCollections;
import j3.j0;
import j3.k0;
import j4.k1;
import j4.r0;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class n implements r4.g, y2.b, s9.a {
    public static n e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ n(int i10, boolean z10) {
        this.a = i10;
    }

    public void a(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : r(i10);
        ((f2.c) this.c).J(childCount, z10);
        if (z10) {
            v(view);
        }
        recyclerView.addView(view, childCount);
        o1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        q0 q0Var = recyclerView.w;
        if (q0Var != null && U != null) {
            q0Var.y(U);
        }
        ArrayList arrayList = recyclerView.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f0) recyclerView.L.get(size)).getClass();
            }
        }
    }

    public void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : r(i10);
        ((f2.c) this.c).J(childCount, z10);
        if (z10) {
            v(view);
        }
        o1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // r4.g
    public int c(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = g0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // s9.a
    public /* bridge */ /* synthetic */ s9.a d(Class cls, r9.d dVar) {
        switch (this.a) {
            case 13:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 19:
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

    public j0 e() {
        if (((n) this.c) == null) {
            this.c = new n(new j3.j[0]);
        }
        return new j0(this);
    }

    @Override // r4.g
    public long f(int i10) {
        long[] jArr = (long[]) this.d;
        d5.a.f(i10 >= 0);
        d5.a.f(i10 < jArr.length);
        return jArr[i10];
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
        s sVar = (s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 1;
        if (i11 >= 30) {
            BiometricManager biometricManager2 = (BiometricManager) this.c;
            if (biometricManager2 != null) {
                return r.a(biometricManager2, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!r1.b(i10)) {
            return -2;
        }
        if (i10 != 0) {
            Context context = sVar.a;
            if (o.a(context) != null) {
                int i13 = 0;
                if (r1.a(i10)) {
                    return o.b(context) ? 0 : 11;
                }
                if (i11 != 29) {
                    if (i11 != 28) {
                        return i();
                    }
                    if (i11 < 23 || context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) {
                        return 12;
                    }
                    return !o.b(sVar.a) ? i() : i() == 0 ? 0 : -1;
                }
                if ((i10 & 255) == 255) {
                    BiometricManager biometricManager3 = (BiometricManager) this.c;
                    if (biometricManager3 != null) {
                        return q.a(biometricManager3);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c10 = q.c();
                if (c10 != null && (b10 = g7.m.b(g7.m.a())) != null) {
                    try {
                        Object invoke = c10.invoke((BiometricManager) this.c, b10);
                        if (invoke instanceof Integer) {
                            return ((Integer) invoke).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException e9) {
                        e = e9;
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
                    i12 = q.a(biometricManager);
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
                if (!o.b(sVar.a)) {
                    i13 = i();
                } else if (i() != 0) {
                    i13 = -1;
                }
                return i13;
            }
        }
        return 12;
    }

    @Override // oc.a
    public Object get() {
        return new n((Context) ((oc.a) this.b).get(), (d3.d) ((oc.a) this.c).get(), (c3.a) ((za.b) this.d).get(), 7);
    }

    @Override // r4.g
    public List h(long j10) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = (e) list.get(i10);
                r4.c cVar = eVar.a;
                if (cVar.e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, new f(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            r4.c cVar2 = ((e) arrayList2.get(i12)).a;
            arrayList.add(new r4.c(cVar2.a, cVar2.b, cVar2.c, cVar2.d, (-1) - i12, 1, cVar2.h, cVar2.n, cVar2.r, cVar2.y, cVar2.A, cVar2.s, cVar2.v, cVar2.w, cVar2.x, cVar2.B, cVar2.C));
        }
        return arrayList;
    }

    public int i() {
        FingerprintManager f10;
        FingerprintManager f11;
        ae.b bVar = (ae.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = (Context) bVar.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (f10 = e0.b.f(context)) == null || !e0.b.n(f10)) {
            return 12;
        }
        return (i10 < 23 || (f11 = e0.b.f(context)) == null || !e0.b.k(f11)) ? 11 : 0;
    }

    public void j() {
        d0 d0Var = (d0) this.b;
        if (d0Var != null) {
            int i10 = ((c2.e) this.d).n.d;
            w wVar = d0Var.a;
            wVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            wVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    public void k(int i10) {
        o1 U;
        int r10 = r(i10);
        ((f2.c) this.c).K(r10);
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.b).b;
        View childAt = recyclerView.getChildAt(r10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(r10);
    }

    public p0 l(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 m(Class cls, String key) {
        p0 viewModel;
        s0 s0Var = (s0) this.c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.b bVar = new v1.b((b8.a) this.d);
            ((LinkedHashMap) bVar.a).put(androidx.lifecycle.q0.b, key);
            try {
                viewModel = s0Var.r(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.e(cls);
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
                g2.e eVar = n0Var.e;
                kotlin.jvm.internal.j.b(eVar);
                androidx.lifecycle.j0.a(p0Var, eVar, oVar);
            }
        }
        kotlin.jvm.internal.j.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public View n(int i10) {
        return ((RecyclerView) ((a9.i) this.b).b).getChildAt(r(i10));
    }

    public int o() {
        return ((RecyclerView) ((a9.i) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override // r4.g
    public int p() {
        return ((long[]) this.d).length;
    }

    public ByteBuffer q() {
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

    public int r(int i10) {
        f2.c cVar = (f2.c) this.c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((a9.i) this.b).b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int z10 = i10 - (i11 - cVar.z(i11));
            if (z10 == 0) {
                while (cVar.I(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += z10;
        }
        return -1;
    }

    public View s(int i10) {
        return ((RecyclerView) ((a9.i) this.b).b).getChildAt(i10);
    }

    public int t() {
        return ((RecyclerView) ((a9.i) this.b).b).getChildCount();
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 8:
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
                n nVar = (n) ((n) this.c).d;
                while (nVar != null) {
                    Object obj2 = nVar.c;
                    sb3.append(str);
                    String str2 = (String) nVar.b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    nVar = (n) nVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 29:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                n nVar2 = (n) ((n) this.c).d;
                while (nVar2 != null) {
                    Object obj3 = nVar2.c;
                    sb4.append(str);
                    String str3 = (String) nVar2.b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r5.length() - 1);
                    }
                    nVar2 = (n) nVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean u() {
        com.google.firebase.messaging.n nVar;
        if (((ae.b) this.d).K("gcm.n.noui")) {
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
        String O = ((ae.b) this.d).O("gcm.n.image");
        if (!TextUtils.isEmpty(O)) {
            try {
                nVar = new com.google.firebase.messaging.n(new URL(O));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + O);
            }
            if (nVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                nVar.b = executorService.submit(new a1.e(28, nVar, taskCompletionSource));
                nVar.c = taskCompletionSource.getTask();
            }
            com.google.firebase.messaging.i a2 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (ae.b) this.d);
            t tVar = (t) a2.a;
            if (nVar != null) {
                try {
                    Task task = nVar.c;
                    y5.l.h(task);
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
                } catch (ExecutionException e9) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e9.getCause());
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
        com.google.firebase.messaging.i a22 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.c, (ae.b) this.d);
        t tVar2 = (t) a22.a;
        if (nVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((t) a22.a).b());
        return true;
    }

    public void v(View view) {
        ((ArrayList) this.d).add(view);
        a9.i iVar = (a9.i) this.b;
        o1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) iVar.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:66:0x009a, code lost:
    
        if (r1.d != r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009d, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
    
        if (r1.d != r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:8:0x0016, B:10:0x002b, B:13:0x0032, B:14:0x003a, B:16:0x0041, B:17:0x0049, B:20:0x0051, B:23:0x0057, B:26:0x005d, B:28:0x0060, B:32:0x0063), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:8:0x0016, B:10:0x002b, B:13:0x0032, B:14:0x003a, B:16:0x0041, B:17:0x0049, B:20:0x0051, B:23:0x0057, B:26:0x005d, B:28:0x0060, B:32:0x0063), top: B:7:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(com.google.android.exoplayer2.upstream.m mVar, Uri uri, Map map, long j10, long j11, r0 r0Var) {
        String str;
        int w10;
        int x8;
        int i10;
        m3.k[] kVarArr;
        m3.h hVar = new m3.h(mVar, j10, j11);
        this.d = hVar;
        if (((m3.k) this.c) != null) {
            return;
        }
        m3.i iVar = (m3.i) this.b;
        synchronized (iVar) {
            try {
                int[] iArr = m3.i.b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    w10 = d5.a.w(str);
                    if (w10 != -1) {
                        iVar.a(w10, arrayList);
                    }
                    x8 = d5.a.x(uri);
                    if (x8 != -1 && x8 != w10) {
                        iVar.a(x8, arrayList);
                    }
                    for (i10 = 0; i10 < 16; i10++) {
                        int i11 = iArr[i10];
                        if (i11 != w10 && i11 != x8) {
                            iVar.a(i11, arrayList);
                        }
                    }
                    kVarArr = (m3.k[]) arrayList.toArray(new m3.k[arrayList.size()]);
                }
                str = null;
                w10 = d5.a.w(str);
                if (w10 != -1) {
                }
                x8 = d5.a.x(uri);
                if (x8 != -1) {
                    iVar.a(x8, arrayList);
                }
                while (i10 < 16) {
                }
                kVarArr = (m3.k[]) arrayList.toArray(new m3.k[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z10 = true;
        if (kVarArr.length == 1) {
            this.c = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                m3.k kVar = kVarArr[i12];
                try {
                } catch (EOFException unused) {
                    if (((m3.k) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((m3.k) this.c) == null && hVar.d != j10) {
                        z10 = false;
                    }
                    d5.a.i(z10);
                    hVar.f = 0;
                    throw th2;
                }
                if (kVar.f(hVar)) {
                    this.c = kVar;
                    hVar.f = 0;
                    break;
                } else {
                    if (((m3.k) this.c) == null) {
                    }
                    boolean z11 = true;
                    d5.a.i(z11);
                    hVar.f = 0;
                    i12++;
                }
            }
            if (((m3.k) this.c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i13 = g0.a;
                StringBuilder sb3 = new StringBuilder();
                for (int i14 = 0; i14 < kVarArr.length; i14++) {
                    sb3.append(kVarArr[i14].getClass().getSimpleName());
                    if (i14 < kVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new k1(sb2.toString(), null, false, 1);
            }
        }
        ((m3.k) this.c).c(r0Var);
    }

    public void x() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.b).b;
        ((f2.c) this.c).L();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            o1 U = RecyclerView.U((View) arrayList.get(size));
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

    public void y(w2.i iVar, int i10, boolean z10) {
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
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
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
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
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
            persistableBundle.putInt("attemptNumber", i10);
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
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf4 = Integer.valueOf(i10);
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

    public void z(View view) {
        if (((ArrayList) this.d).remove(view)) {
            a9.i iVar = (a9.i) this.b;
            o1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) iVar.b;
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

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public n(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                n nVar = new n(14, false);
                this.c = nVar;
                this.d = nVar;
                this.b = str;
                break;
            case 29:
                n nVar2 = new n(28, false);
                this.c = nVar2;
                this.d = nVar2;
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

    public n(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = g7.j.c;
                break;
            case 19:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = h7.e.c;
                break;
            case 21:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = i7.i0.c;
                break;
            case 25:
                this.b = j3.g.c;
                this.d = k0.a;
                break;
            default:
                this.b = new b8.b();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public n(String str, Boolean bool, dc.a aVar, String str2) {
        this.a = 10;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public n(ArrayList arrayList) {
        this.a = 0;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e eVar = (e) arrayList.get(i10);
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

    public n(t0 store, s0 factory, b8.a defaultCreationExtras) {
        this.a = 3;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.b = store;
        this.c = factory;
        this.d = defaultCreationExtras;
    }

    public n(a9.i iVar) {
        this.a = 11;
        this.b = iVar;
        this.c = new f2.c(0);
        this.d = new ArrayList();
    }

    public n(m3.i iVar) {
        this.a = 27;
        this.b = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.b);
        this.a = 3;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public n(FirebaseMessagingService firebaseMessagingService, ae.b bVar, ExecutorService executorService) {
        this.a = 9;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = bVar;
    }

    public n(Context context, LocationManager locationManager) {
        this.a = 12;
        this.d = new y();
        this.b = context;
        this.c = locationManager;
    }

    public n(androidx.biometric.w wVar) {
        this.a = 1;
        this.d = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.a = 3;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public n(j3.j[] jVarArr) {
        this.a = 26;
        j3.q0 q0Var = new j3.q0();
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
        this.c = q0Var;
        this.d = s0Var;
        jVarArr2[jVarArr.length] = q0Var;
        jVarArr2[jVarArr.length + 1] = s0Var;
    }

    public n(s sVar) {
        this.a = 2;
        Context context = sVar.a;
        this.b = sVar;
        int i10 = Build.VERSION.SDK_INT;
        this.c = i10 >= 29 ? q.b(context) : null;
        this.d = i10 <= 29 ? new ae.b(context, 21) : null;
    }

    public n(c2.e eVar, d0 d0Var) {
        this.a = 6;
        this.d = eVar;
        this.b = d0Var;
    }
}
