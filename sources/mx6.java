// default package

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.Tasks;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class mx6 implements ma6, g22, q5b, u29, u78 {
    public static int e;
    public static volatile mx6 f;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object h = new Object();
    public static final iz2 n = new iz2(0);
    public static final sa r = new sa(29);
    public static final c13 s = new c13();
    public static final byte[] w = new byte[0];
    public static final ha6 x = new ha6(0, -9223372036854775807L);
    public static final ha6 y = new ha6(2, -9223372036854775807L);
    public static final ha6 E = new ha6(3, -9223372036854775807L);

    public mx6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        zw6 zw6Var;
        this.a = (byte) 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context == null) {
            u36.j("context must not be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            u36.j("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = jfb.b;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else if (queryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = componentName2;
            if (componentName == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            zw6Var = new fx6(context, str);
            this.b = zw6Var;
        } else if (i2 >= 28) {
            zw6Var = new dx6(context, str);
            this.b = zw6Var;
        } else {
            zw6Var = new zw6(context, str);
            this.b = zw6Var;
        }
        zw6 zw6Var2 = zw6Var;
        o0(new ww6((byte) 1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        zw6Var.a.setMediaButtonReceiver(pendingIntent);
        this.c = new wm4(context, zw6Var2.c);
        if (e == 0) {
            e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static Bundle A0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        D(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void D(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(mx6.class.getClassLoader());
        }
    }

    public static mx6 P(Context context) {
        if (f == null) {
            synchronized (h) {
                if (f == null) {
                    f = new mx6(context);
                }
            }
        }
        return f;
    }

    public static void d0(jd4 jd4Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            jd4Var.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }

    public static void k0(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static final void w() {
        if (((Boolean) new b13(0, s, c13.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void x() {
        if (((Boolean) new b13(0, s, c13.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static pb3 y(us6 us6Var) {
        yh4 yh4Var = new yh4((byte) 5);
        yh4Var.d = null;
        Uri uri = us6Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z = us6Var.f;
        yh4 yh4Var2 = new yh4();
        jte.f((z && TextUtils.isEmpty(uri2)) ? false : true);
        yh4Var2.b = yh4Var;
        yh4Var2.c = uri2;
        yh4Var2.a = z;
        yh4Var2.d = new HashMap();
        qo5 qo5Var = us6Var.c;
        yo5 yo5Var = qo5Var.a;
        if (yo5Var == null) {
            yo5Var = qo5Var.c();
            qo5Var.a = yo5Var;
        }
        v7c it = yo5Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) yh4Var2.d)) {
                ((HashMap) yh4Var2.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i = n61.a;
        k4f k4fVar = new k4f((byte) 17);
        UUID uuid = us6Var.a;
        uuid.getClass();
        boolean z2 = us6Var.d;
        boolean z3 = us6Var.e;
        int[] e2 = ine.e(us6Var.g);
        int length = e2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = e2[i2];
            jte.f(i3 == 2 || i3 == 1);
        }
        pb3 pb3Var = new pb3(uuid, yh4Var2, hashMap, z2, (int[]) e2.clone(), z3, k4fVar);
        byte[] bArr = us6Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        jte.p(pb3Var.x.isEmpty());
        pb3Var.L = copyOf;
        return pb3Var;
    }

    public final void A(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pp5.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new rq2(e2);
            }
        }
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    public final void B0(boolean z, float f2) {
        a8[] a8VarArr = (a8[]) this.d;
        for (int i = 0; i < a8VarArr.length; i++) {
            if (!z || ((i != 0 || Math.abs(f2 - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f2 - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f2 - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f2 - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f2 - 2.0f) >= 0.1f)))))) {
                a8VarArr[i].d(-328966, -328966);
            } else {
                a8VarArr[i].d(-9718023, -9718023);
            }
        }
        ((v7) this.c).e(true, f2);
    }

    public final Object C(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (yxe.b()) {
            try {
                yxe.a(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                pp5 pp5Var = (pp5) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = pp5Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            C(cls2, hashSet);
                        }
                    }
                }
                obj = pp5Var.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new rq2(th);
            }
        }
        return obj;
    }

    public final void C0() {
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (tx6Var != null) {
            jte.p(Looper.myLooper() == tx6Var.l.getLooper());
        }
    }

    public final void E(mt2 mt2Var) {
        t76 t76Var;
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (tx6Var == null) {
            return;
        }
        C0();
        do {
            lt2 lt2Var = (lt2) mt2Var.c.poll();
            if (lt2Var == null) {
                mt2Var.f = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            N(mt2Var.a);
            atomicReference.set(lt2Var.run());
            t76Var = (t76) atomicReference.get();
        } while (t76Var.isDone());
        t76Var.b(new co1((Object) this, (Object) tx6Var, (Object) mt2Var, (byte) 25), fp3.a);
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        u9b u9bVar;
        String str = (String) this.c;
        ks0 ks0Var = (ks0) this.d;
        long j3 = ks0Var.d;
        i22 i22Var = (i22) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() == 1) {
            Object next = selectedPhotos.values().iterator().next();
            if (next instanceof jo6) {
                g6b l = g6b.l((jo6) next);
                l.J0 = j3;
                l.K0 = str;
                l.z();
                v9b C = v9b.C(ks0Var.a.getParentActivity(), ks0Var.b);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                int i4 = C.c;
                WindowManager windowManager = C.f;
                byte b = 0;
                if (!C.d) {
                    if (oc7.r1(i4).u2()) {
                        h5.b(i4);
                    } else {
                        C.w0 = j3;
                        C.x0 = str;
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (u9bVar = C.n) != null && u9bVar.getParent() == null) {
                            gm.s3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = l;
                        l.J0 = j3;
                        l.K0 = str;
                        C.P1 = l.K ? 1 : 0;
                        C.t0.g = false;
                        C.K = false;
                        float L = gm.L(100.0f);
                        Point point = gm.q;
                        rectF.set(0.0f, L, point.x, gm.L(100.0f) + point.y);
                        C.H = gm.L(8.0f);
                        C.r.c();
                        i9b i9bVar = C.i0;
                        boolean z5 = C.K;
                        i9bVar.setBackgroundColor((z5 || !z5) ? 0 : -14737633);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        gm.e2(C.b);
                        g6b g6bVar = C.L1;
                        if (g6bVar != null) {
                            C.d1.setText(g6bVar.C0);
                        }
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.c1.b(false, false);
                        C.c1.b(true, true);
                        C.d(1.0f, true, new f8b(C, (byte) 6));
                        C.a();
                    }
                }
                gm.d3(new vr0(i22Var, b), 400L);
            }
        }
    }

    public final void F(final sw6 sw6Var) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            final ne8 ne8Var = mt2Var.g;
            mt2Var.g = ne8.b;
            mt2Var.c.add(new lt2(sw6Var, ne8Var) { // from class: kt2
                public final /* synthetic */ sw6 b;

                @Override // lt2
                public final t76 run() {
                    tx6 tx6Var = (tx6) ((WeakReference) mx6.this.d).get();
                    if (tx6Var != null) {
                        tx6Var.n(this.b);
                    }
                    return ao5.b;
                }
            });
            if (mt2Var.f) {
                return;
            }
            mt2Var.f = true;
            E(mt2Var);
        }
    }

    public final is3 G(bt6 bt6Var) {
        pb3 pb3Var;
        bt6Var.b.getClass();
        us6 us6Var = bt6Var.b.c;
        if (us6Var == null) {
            return is3.u;
        }
        synchronized (this.b) {
            if (!us6Var.equals((us6) this.c)) {
                this.c = us6Var;
                this.d = y(us6Var);
            }
            pb3Var = (pb3) this.d;
            pb3Var.getClass();
        }
        return pb3Var;
    }

    public final Object H(Bitmap bitmap) {
        sk0 sk0Var = (sk0) this.b;
        if (sk0Var.a(bitmap)) {
            this.d = ((xk0) this.c).b(bitmap);
            sk0Var.b(bitmap);
        }
        return this.d;
    }

    public qk0 J() {
        int[] iArr;
        gi6 gi6Var = (gi6) this.b;
        int i = gi6Var.a;
        int i2 = gi6Var.b;
        qk0 qk0Var = new qk0(i, i2);
        if (((byte[]) this.c).length < i) {
            this.c = new byte[i];
        }
        int i3 = 0;
        while (true) {
            iArr = (int[]) this.d;
            if (i3 >= 32) {
                break;
            }
            iArr[i3] = 0;
            i3++;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            byte[] b = gi6Var.b((i2 * i4) / 5, (byte[]) this.c);
            int i5 = (i << 2) / 5;
            for (int i6 = i / 5; i6 < i5; i6++) {
                int i7 = (b[i6] & 255) >> 3;
                iArr[i7] = iArr[i7] + 1;
            }
        }
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i8) {
                i10 = i11;
                i8 = i12;
            }
            if (i12 > i9) {
                i9 = i12;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 - i10;
            int i17 = iArr[i15] * i16 * i16;
            if (i17 > i14) {
                i13 = i15;
                i14 = i17;
            }
        }
        if (i10 <= i13) {
            int i18 = i10;
            i10 = i13;
            i13 = i18;
        }
        if (i10 - i13 <= length / 16) {
            throw xl7.a();
        }
        int i19 = i10 - 1;
        int i20 = -1;
        int i21 = i19;
        while (i19 > i13) {
            int i22 = i19 - i13;
            int i23 = (i9 - iArr[i19]) * (i10 - i19) * i22 * i22;
            if (i23 > i20) {
                i21 = i19;
                i20 = i23;
            }
            i19--;
        }
        int i24 = i21 << 3;
        byte[] a = gi6Var.a();
        for (int i25 = 0; i25 < i2; i25++) {
            int i26 = i25 * i;
            for (int i27 = 0; i27 < i; i27++) {
                if ((a[i26 + i27] & 255) < i24) {
                    qk0Var.c(i27, i25);
                }
            }
        }
        return qk0Var;
    }

    public final View K(int i) {
        return ((RecyclerView) ((ai4) this.b).b).getChildAt(Q(i));
    }

    @Override // g22
    public final boolean K0() {
        return true;
    }

    public final int L() {
        return ((RecyclerView) ((ai4) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public final mo5 M() {
        C0();
        return mo5.q(((qt) this.b).values());
    }

    public final sw6 N(Object obj) {
        C0();
        return (sw6) ((qt) this.b).get(obj);
    }

    public final long O() {
        vb3 vb3Var = (vb3) this.d;
        if (vb3Var != null) {
            return vb3Var.d;
        }
        return -1L;
    }

    public final int Q(int i) {
        vh2 vh2Var = (vh2) this.c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((ai4) this.b).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int n2 = i - (i2 - vh2Var.n(i2));
            if (n2 == 0) {
                while (vh2Var.x(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += n2;
        }
        return -1;
    }

    public final uz0 R(sw6 sw6Var) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            return mt2Var.b;
        }
        return null;
    }

    public final View S(int i) {
        return ((RecyclerView) ((ai4) this.b).b).getChildAt(i);
    }

    public final int T() {
        return ((RecyclerView) ((ai4) this.b).b).getChildCount();
    }

    public final boolean U() {
        return ((IOException) this.d) != null;
    }

    public final void V(View view) {
        ((ArrayList) this.d).add(view);
        ai4 ai4Var = (ai4) this.b;
        u69 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) ai4Var.b;
            int i = U.s;
            if (i != -1) {
                U.r = i;
            } else {
                WeakHashMap weakHashMap = kfc.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.d0()) {
                U.s = 4;
                recyclerView.L0.add(U);
            } else {
                WeakHashMap weakHashMap2 = kfc.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r1.d != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r1.d != r11) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(s73 s73Var, Uri uri, Map map, long j, long j2, uu8 uu8Var) {
        s84 s84Var;
        vb3 vb3Var = new vb3(s73Var, j, j2);
        this.d = vb3Var;
        if (((s84) this.c) != null) {
            return;
        }
        s84[] e2 = ((v84) this.b).e(uri, map);
        int length = e2.length;
        ko5 ko5Var = mo5.b;
        ntd.b(length, "expectedSize");
        jo5 jo5Var = new jo5(length);
        boolean z = true;
        byte b = 0;
        if (e2.length == 1) {
            s84Var = e2[0];
            this.c = s84Var;
        } else {
            int length2 = e2.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                s84 s84Var2 = e2[i];
                try {
                } catch (EOFException unused) {
                    if (((s84) this.c) == null) {
                    }
                } catch (Throwable th) {
                    if (((s84) this.c) == null && vb3Var.d != j) {
                        z = false;
                    }
                    jte.p(z);
                    vb3Var.f = 0;
                    throw th;
                }
                if (s84Var2.c(vb3Var)) {
                    this.c = s84Var2;
                    vb3Var.f = 0;
                    break;
                }
                jo5Var.d(s84Var2.e());
                if (((s84) this.c) == null) {
                }
                boolean z2 = true;
                jte.p(z2);
                vb3Var.f = 0;
                i++;
            }
            s84 s84Var3 = (s84) this.c;
            if (s84Var3 == null) {
                String str = "None of the available extractors (" + new jw5(", ", (byte) 0).b(wpe.b(mo5.r(e2), new o41(b))) + ") could read the stream.";
                uri.getClass();
                throw new z7c(str, jo5Var.f());
            }
            s84Var = s84Var3;
        }
        s84Var.f(uu8Var);
    }

    public final boolean X(sw6 sw6Var) {
        C0();
        return ((qt) this.c).get(sw6Var) != null;
    }

    public final boolean Y() {
        return ((ia6) this.c) != null;
    }

    public final boolean Z(sw6 sw6Var, int i) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (mt2Var == null || !mt2Var.e.a(i) || tx6Var == null) {
            return false;
        }
        tx6Var.t();
        return tx6Var.t.q().a(i);
    }

    @Override // q5b
    public final void a(ArrayList arrayList) {
        kd1 kd1Var = (kd1) this.c;
        if (kd1Var.getParent() == null) {
            ((gd1) this.d).b.i();
        } else {
            kd1Var.setSegments(arrayList);
        }
    }

    public final boolean a0(sw6 sw6Var, int i) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            s7a s7aVar = mt2Var.d;
            s7aVar.getClass();
            jte.e("Use contains(Command) for custom command", i != 0);
            Iterator<E> it = s7aVar.a.iterator();
            while (it.hasNext()) {
                if (((r7a) it.next()).a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    public final void b(Object obj, sw6 sw6Var, s7a s7aVar, ne8 ne8Var) {
        qt qtVar = (qt) this.c;
        C0();
        sw6 N = N(obj);
        if (N != null) {
            mt2 mt2Var = (mt2) qtVar.get(N);
            mt2Var.getClass();
            mt2Var.d = s7aVar;
            mt2Var.e = ne8Var;
            return;
        }
        ((qt) this.b).put(obj, sw6Var);
        bqb bqbVar = bqb.a;
        g0c g0cVar = g0c.b;
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (tx6Var != null) {
            tx6Var.t();
            cf8 cf8Var = tx6Var.t;
            bqbVar = cf8Var.T0();
            if (cf8Var.m0(30)) {
                g0cVar = cf8Var.f0();
            }
        }
        uz0 uz0Var = new uz0();
        uz0Var.c = new Object();
        uz0Var.d = new qt(0);
        qtVar.put(sw6Var, new mt2(obj, uz0Var, s7aVar, ne8Var, bqbVar, g0cVar));
    }

    @Override // u78
    public final boolean c() {
        return true;
    }

    public final boolean c0(sw6 sw6Var, r7a r7aVar) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var == null) {
            return false;
        }
        yo5 yo5Var = mt2Var.d.a;
        r7aVar.getClass();
        return yo5Var.contains(r7aVar) || un2.i(r7aVar.b);
    }

    @Override // ma6
    public final void d() {
        IOException iOException = (IOException) this.d;
        if (iOException != null) {
            throw iOException;
        }
        ia6 ia6Var = (ia6) this.c;
        if (ia6Var != null) {
            int i = ia6Var.a;
            IOException iOException2 = ia6Var.e;
            if (iOException2 != null && ia6Var.f > i) {
                throw iOException2;
            }
        }
    }

    public final void e0(ka6 ka6Var) {
        g89 g89Var = (g89) this.b;
        ia6 ia6Var = (ia6) this.c;
        if (ia6Var != null) {
            ia6Var.a(true);
        }
        if (ka6Var != null) {
            g89Var.execute(new o04(ka6Var, (byte) 22));
        }
        u36 u36Var = g89Var.b;
        g89Var.a.shutdown();
    }

    @Override // q5b
    public final void f(long j, long j2, boolean z) {
        ((jd4) this.b).f(j, j2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    @Override // u29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        float f2;
        l39 l39Var;
        i39 k;
        float f3;
        int i;
        float f4;
        yv1 yv1Var = (yv1) this.d;
        hg0 L6 = yv1Var.L6(((k47) this.b).e1(), true);
        float f5 = 0.0f;
        if (L6 instanceof rc2) {
            l39 l39Var2 = ((rc2) L6).O;
            i39 k2 = l39Var2.k(k39Var);
            if (k2 == null) {
                f4 = 0.0f;
                f2 = f5;
                f5 = f4;
                yv1Var.vb(L6, (k47) this.b, (v29) this.c, view, f2, f5, k39Var, false, (k39Var == null && k39Var.a) ? true : z, z2, false);
            }
            f5 = l39Var2.b + k2.w + (k2.z / 2.0f);
            f3 = l39Var2.c + k2.x;
            i = k2.A;
        } else if (!(L6 instanceof cm1) || (k = (l39Var = ((cm1) L6).F0).k(k39Var)) == null) {
            f2 = 0.0f;
            yv1Var.vb(L6, (k47) this.b, (v29) this.c, view, f2, f5, k39Var, false, (k39Var == null && k39Var.a) ? true : z, z2, false);
        } else {
            f5 = l39Var.b + k.w + (k.z / 2.0f);
            f3 = l39Var.c + k.x;
            i = k.A;
        }
        f4 = f3 + (i / 2.0f);
        f2 = f5;
        f5 = f4;
        yv1Var.vb(L6, (k47) this.b, (v29) this.c, view, f2, f5, k39Var, false, (k39Var == null && k39Var.a) ? true : z, z2, false);
    }

    public final void g0(mk mkVar) {
        we8 we8Var = (we8) ((HashMap) this.b).remove(mkVar);
        we8Var.getClass();
        wc3 wc3Var = (wc3) ((xc3) this.d).o.get(we8Var);
        if (wc3Var != null) {
            synchronized (wc3Var) {
                wc3Var.d--;
            }
        }
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    public final void h0() {
        RecyclerView recyclerView;
        int i;
        ((vh2) this.c).A();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) ((ai4) this.b).b;
            if (size < 0) {
                break;
            }
            u69 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i2 = U.r;
                if (recyclerView.d0()) {
                    U.s = i2;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = kfc.a;
                    view.setImportantForAccessibility(i2);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public final void i0(sw6 sw6Var) {
        ArrayList arrayList;
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).remove(sw6Var);
        if (mt2Var != null) {
            ((qt) this.b).remove(mt2Var.a);
            uz0 uz0Var = mt2Var.b;
            synchronized (uz0Var.c) {
                uz0Var.b = true;
                arrayList = new ArrayList(((qt) uz0Var.d).values());
                ((qt) uz0Var.d).clear();
            }
            int size = arrayList.size();
            byte b = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((t6a) obj).o();
            }
            tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
            if (tx6Var == null || tx6Var.i()) {
                return;
            }
            hac.X(tx6Var.l, new jt2(tx6Var, sw6Var, b));
        }
    }

    @Override // u78
    public final void j() {
        ((p42) this.c).R.y();
    }

    public final void j0(mi2 mi2Var) {
        if (((ji2) this.b) != null) {
            for (int i = 0; i < mi2Var.a.size(); i++) {
                ji2 ji2Var = (ji2) this.b;
                ji2Var.h.remove(mi2Var.c(i).d);
                ji2Var.g();
            }
        }
    }

    @Override // u78
    public final void k(int i, boolean z, boolean z2) {
        if (z) {
            return;
        }
        p42 p42Var = (p42) this.c;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        i22 i22Var = p42Var.b;
        if (hashMap.isEmpty() || p42Var.R == null || p42Var.L) {
            return;
        }
        p42Var.L = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = hashMap.get(arrayList.get(i2));
            z5a z5aVar = new z5a();
            arrayList2.add(z5aVar);
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                String str = jo6Var.h;
                if (str != null) {
                    z5aVar.c = str;
                } else {
                    z5aVar.c = jo6Var.I;
                }
                z5aVar.e = jo6Var.c;
                z5aVar.f = jo6Var.g;
                z5aVar.k = jo6Var.s;
                z5aVar.o = jo6Var.b;
                CharSequence charSequence = jo6Var.a;
                z5aVar.d = charSequence != null ? charSequence.toString() : null;
                z5aVar.i = jo6Var.n;
                z5aVar.j = jo6Var.r;
                z5aVar.h = jo6Var.x;
            }
        }
        ik.X(i22Var.G3, i22Var.V0(), arrayList2.size() + i22Var.R0(), new b42(p42Var, i, arrayList2, z2, (byte) 0));
    }

    @Override // u29
    public final boolean l() {
        return false;
    }

    public final void l0(boolean z) {
        ((zw6) this.b).a.setActive(z);
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            throw kt6.l(it);
        }
    }

    public final void m0(String str) {
        if (str != null) {
            this.b = str;
        } else {
            gxc.d("Null backendName");
        }
    }

    @Override // q5b
    public final void n() {
        gd1 gd1Var = (gd1) this.d;
        fd1 fd1Var = gd1Var.a;
        jd4 jd4Var = gd1Var.c;
        if (jd4Var != null) {
            jd4Var.f = null;
            u31 u31Var = (u31) jd4Var.g;
            if (u31Var != null) {
                u31Var.b();
                jd4Var.g = null;
            }
            gd1Var.c = null;
        }
        kd1 kd1Var = (kd1) this.c;
        if (kd1Var.getParent() != null) {
            fd1Var.S(kd1Var);
        }
        new c41(fd1Var.q(), fd1Var.t()).Q(R.raw.error, 36, jb6.M0(2131744395, null)).k(true);
    }

    public final void o0(yw6 yw6Var, Handler handler) {
        zw6 zw6Var = (zw6) this.b;
        if (yw6Var == null) {
            zw6Var.d(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        zw6Var.d(yw6Var, handler);
    }

    public final void p(sw6 sw6Var, int i, lt2 lt2Var) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            ne8 ne8Var = mt2Var.g;
            ne8Var.getClass();
            me8 me8Var = new me8(ne8Var);
            me8Var.a.b(i);
            mt2Var.g = me8Var.b();
            mt2Var.c.add(lt2Var);
        }
    }

    public final void p0(gi2 gi2Var) {
        mi2 mi2Var;
        mi2 mi2Var2 = (mi2) this.c;
        if (mi2Var2 != null && ((gi2) this.d) == null && gi2Var != null) {
            q(mi2Var2);
        }
        if (((gi2) this.d) != null && (mi2Var = (mi2) this.c) != null && gi2Var == null) {
            j0(mi2Var);
        }
        gi2 gi2Var2 = (gi2) this.d;
        if (gi2Var2 != null) {
            k89 k89Var = gi2Var2.a;
            ite.e("Must be called from the main thread.");
            k89Var.i.remove(gi2Var2);
        }
        if (gi2Var != null) {
            gi2Var.a.p(gi2Var);
            mi2 mi2Var3 = (mi2) this.c;
            if (mi2Var3 != null) {
                gi2Var.d = mi2Var3;
                gi2Var.g = 0;
                gi2Var.h = 0;
                gi2Var.p();
            }
        }
        this.d = gi2Var;
    }

    public final void q(mi2 mi2Var) {
        if (((ji2) this.b) == null) {
            this.b = new ji2();
        }
        for (int i = 0; i < mi2Var.a.size(); i++) {
            ji2 ji2Var = (ji2) this.b;
            li2 c = mi2Var.c(i);
            ji2Var.h.put(c.d, c);
            ji2Var.g();
        }
    }

    public final void q0(MediaMetadataCompat mediaMetadataCompat) {
        zw6 zw6Var = (zw6) this.b;
        zw6Var.h = mediaMetadataCompat;
        MediaSession mediaSession = zw6Var.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public final void r(int i, View view, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((ai4) this.b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : Q(i);
        ((vh2) this.c).y(childCount, z);
        if (z) {
            V(view);
        }
        recyclerView.addView(view, childCount);
        u69 U = RecyclerView.U(view);
        recyclerView.h0(view);
        y59 y59Var = recyclerView.x;
        if (y59Var != null && U != null) {
            y59Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h69) recyclerView.Q.get(size)).c();
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public final void r0(android.support.v4.media.session.PlaybackStateCompat r9) {
        /*
            r8 = this;
            java.lang.Object r8 = r8.b
            zw6 r8 = (zw6) r8
            r8.f = r9
            java.lang.Object r1 = r8.d
            monitor-enter(r1)
            android.os.RemoteCallbackList r0 = r8.e     // Catch: java.lang.Throwable -> L8b
            int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + (-1)
        L11:
            android.os.RemoteCallbackList r2 = r8.e     // Catch: java.lang.Throwable -> L8b
            if (r0 < 0) goto L21
            android.os.IInterface r2 = r2.getBroadcastItem(r0)     // Catch: java.lang.Throwable -> L8b
            hk5 r2 = (hk5) r2     // Catch: java.lang.Throwable -> L8b
            r2.N(r9)     // Catch: android.os.RemoteException -> L1e java.lang.Throwable -> L8b
        L1e:
            int r0 = r0 + (-1)
            goto L11
        L21:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            android.media.session.MediaSession r8 = r8.a
            android.media.session.PlaybackState r0 = r9.x
            if (r0 != 0) goto L85
            android.media.session.PlaybackState$Builder r1 = de8.d()
            int r2 = r9.a
            long r3 = r9.b
            float r5 = r9.d
            long r6 = r9.n
            de8.x(r1, r2, r3, r5, r6)
            long r2 = r9.c
            de8.u(r1, r2)
            long r2 = r9.e
            de8.s(r1, r2)
            java.lang.CharSequence r0 = r9.h
            de8.v(r1, r0)
            java.util.ArrayList r0 = r9.r
            int r2 = r0.size()
            r3 = 0
        L50:
            if (r3 >= r2) goto L75
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r4 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) r4
            android.media.session.PlaybackState$CustomAction r5 = r4.e
            if (r5 != 0) goto L71
            java.lang.String r5 = r4.a
            java.lang.CharSequence r6 = r4.b
            int r7 = r4.c
            android.media.session.PlaybackState$CustomAction$Builder r5 = de8.e(r5, r6, r7)
            android.os.Bundle r4 = r4.d
            de8.w(r5, r4)
            android.media.session.PlaybackState$CustomAction r5 = de8.b(r5)
        L71:
            de8.a(r1, r5)
            goto L50
        L75:
            long r2 = r9.s
            de8.t(r1, r2)
            android.os.Bundle r0 = r9.w
            ee8.b(r1, r0)
            android.media.session.PlaybackState r0 = de8.c(r1)
            r9.x = r0
        L85:
            r8.setPlaybackState(r0)
            return
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r8
        L8b:
            r0 = move-exception
            r8 = r0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: mx6.r0(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    @Override // u29
    public final boolean s() {
        return false;
    }

    public final void s0(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) obj;
                if (mediaSessionCompat$QueueItem == null) {
                    u36.j("queue shouldn't have null items");
                    return;
                }
                long j = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", kt6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        zw6 zw6Var = (zw6) this.b;
        MediaSession mediaSession = zw6Var.a;
        zw6Var.g = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) obj2;
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.c;
            if (queueItem == null) {
                queueItem = ix6.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void t(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((ai4) this.b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : Q(i);
        ((vh2) this.c).y(childCount, z);
        if (z) {
            V(view);
        }
        u69 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public final void t0(int r4) {
        /*
            r3 = this;
            java.lang.Object r3 = r3.b
            zw6 r3 = (zw6) r3
            byte r0 = r3.i
            if (r0 == r4) goto L2e
            r3.i = r4
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            android.os.RemoteCallbackList r1 = r3.e     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + (-1)
        L15:
            android.os.RemoteCallbackList r2 = r3.e     // Catch: java.lang.Throwable -> L2c
            if (r1 < 0) goto L25
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L2c
            hk5 r2 = (hk5) r2     // Catch: java.lang.Throwable -> L2c
            r2.g(r4)     // Catch: android.os.RemoteException -> L22 java.lang.Throwable -> L2c
        L22:
            int r1 = r1 + (-1)
            goto L15
        L25:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r3
        L2c:
            r3 = move-exception
            goto L2a
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx6.t0(int):void");
    }

    public final String toString() {
        switch (this.a) {
            case 21:
                return ((vh2) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public final rb0 u() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((fl8) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new rb0((String) this.b, (byte[]) this.c, (fl8) this.d);
        }
        dq9.m("Missing required properties:".concat(str));
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public final void u0(int r4) {
        /*
            r3 = this;
            java.lang.Object r3 = r3.b
            zw6 r3 = (zw6) r3
            int r0 = r3.j
            if (r0 == r4) goto L2e
            r3.j = r4
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            android.os.RemoteCallbackList r1 = r3.e     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + (-1)
        L15:
            android.os.RemoteCallbackList r2 = r3.e     // Catch: java.lang.Throwable -> L2c
            if (r1 < 0) goto L25
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L2c
            hk5 r2 = (hk5) r2     // Catch: java.lang.Throwable -> L2c
            r2.i(r4)     // Catch: android.os.RemoteException -> L22 java.lang.Throwable -> L2c
        L22:
            int r1 = r1 + (-1)
            goto L15
        L25:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r3
        L2c:
            r3 = move-exception
            goto L2a
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx6.u0(int):void");
    }

    public final void v() {
        ia6 ia6Var = (ia6) this.c;
        ia6Var.getClass();
        ia6Var.a(false);
    }

    public final void v0(ja6 ja6Var, ga6 ga6Var, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        ia6 ia6Var = new ia6(this, myLooper, ja6Var, ga6Var, i, SystemClock.elapsedRealtime());
        jte.p(((ia6) this.c) == null);
        this.c = ia6Var;
        ia6Var.b();
    }

    public final FileOutputStream w0() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            k0(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                zg.e(file, "Failed to create directory for ");
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + file, e2);
            }
        }
    }

    public final synchronized void x0() {
        ((xc3) this.d).c.E();
    }

    public final void y0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ai4 ai4Var = (ai4) this.b;
            u69 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) ai4Var.b;
                int i = U.r;
                if (recyclerView.d0()) {
                    U.s = i;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = kfc.a;
                    view2.setImportantForAccessibility(i);
                }
                U.r = 0;
            }
        }
    }

    public final void z(int i) {
        u69 U;
        int Q = Q(i);
        ((vh2) this.c).z(Q);
        RecyclerView recyclerView = (RecyclerView) ((ai4) this.b).b;
        View childAt = recyclerView.getChildAt(Q);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(Q);
    }

    @Override // g22
    public final void I() {
    }

    @Override // g22
    public final void b0() {
    }

    @Override // u78
    public final void e() {
    }

    @Override // u29
    public final void o() {
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // u78
    public final void i(Editable editable) {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }

    public /* synthetic */ mx6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ mx6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mx6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public mx6(CastDevice castDevice, vjf vjfVar) {
        this.a = (byte) 15;
        ite.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = vjfVar;
    }

    public mx6(xk0 xk0Var) {
        this.a = (byte) 9;
        this.b = new sk0();
        this.c = xk0Var;
    }

    public mx6(ExecutorService executorService, ExecutorService executorService2) {
        this.a = (byte) 3;
        executorService.getClass();
        executorService2.getClass();
        this.b = new a13(executorService);
        this.c = new a13(executorService);
        Tasks.forResult(null);
        this.d = new a13(executorService2);
    }

    public mx6(gi6 gi6Var) {
        this.a = (byte) 4;
        this.b = gi6Var;
        this.c = w;
        this.d = new int[32];
    }

    public mx6() {
        this.a = (byte) 28;
        this.b = new Object();
    }

    public mx6(ai4 ai4Var) {
        this.a = (byte) 21;
        this.b = ai4Var;
        this.c = new vh2((byte) 0);
        this.d = new ArrayList();
    }

    public mx6(jd4 jd4Var) {
        this.a = (byte) 2;
        this.c = null;
        this.d = null;
        this.b = jd4Var;
    }

    public mx6(File file) {
        this.a = (byte) 7;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public mx6(tx6 tx6Var) {
        this.a = (byte) 25;
        this.b = new qt(0);
        this.c = new qt(0);
        this.d = new WeakReference(tx6Var);
    }

    public mx6(Context context) {
        this.a = (byte) 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public mx6(byte[] bArr, t76 t76Var) {
        this.a = (byte) 12;
        this.b = bArr;
        this.c = null;
        this.d = t76Var;
    }

    public mx6(jt6 jt6Var, t76 t76Var) {
        this.a = (byte) 12;
        this.b = jt6Var.k;
        this.c = jt6Var.n;
        this.d = t76Var;
    }

    public mx6(p30[] p30VarArr) {
        this.a = (byte) 27;
        nja njaVar = new nja();
        njaVar.m = 0;
        njaVar.o = 0;
        njaVar.p = 0;
        byte[] bArr = hac.b;
        njaVar.n = bArr;
        njaVar.q = bArr;
        nma nmaVar = new nma();
        nmaVar.b = 1.0f;
        nmaVar.c = 1.0f;
        l30 l30Var = l30.e;
        nmaVar.d = l30Var;
        nmaVar.e = l30Var;
        nmaVar.f = l30Var;
        nmaVar.g = l30Var;
        ByteBuffer byteBuffer = p30.a;
        nmaVar.j = byteBuffer;
        nmaVar.k = byteBuffer;
        p30[] p30VarArr2 = new p30[p30VarArr.length + 2];
        this.b = p30VarArr2;
        System.arraycopy(p30VarArr, 0, p30VarArr2, 0, p30VarArr.length);
        this.c = njaVar;
        this.d = nmaVar;
        p30VarArr2[p30VarArr.length] = njaVar;
        p30VarArr2[p30VarArr.length + 1] = nmaVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mx6(String str) {
        this((Object) new g89(Executors.newSingleThreadExecutor(new ds2(r4, (byte) 1)), new u36((byte) 3)), (byte) 5);
        this.a = (byte) 5;
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = hac.a;
    }

    public mx6(sz4 sz4Var) {
        this.a = (byte) 6;
        this.b = sz4Var;
        this.c = Choreographer.getInstance();
        this.d = new no(this, (byte) 0);
    }

    public mx6(p42 p42Var, HashMap hashMap, ArrayList arrayList) {
        this.a = (byte) 19;
        this.c = p42Var;
        this.b = hashMap;
        this.d = arrayList;
    }

    public /* synthetic */ mx6(byte b) {
        this.a = b;
    }

    public mx6(xc3 xc3Var, we8 we8Var) {
        this.a = (byte) 29;
        this.d = xc3Var;
        this.b = new HashMap();
        this.c = we8Var;
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
