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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class mv6 implements n86, v02, p3b, s09, s58 {
    public static int e;
    public static volatile mv6 f;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object h = new Object();
    public static final yx2 n = new yx2(0);
    public static final sa r = new sa(29);
    public static final rz2 s = new rz2();
    public static final byte[] w = new byte[0];
    public static final i86 x = new i86(0, -9223372036854775807L);
    public static final i86 y = new i86(2, -9223372036854775807L);
    public static final i86 E = new i86(3, -9223372036854775807L);

    public mv6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        zu6 zu6Var;
        this.a = (byte) 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context == null) {
            w26.j("context must not be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            w26.j("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = idb.b;
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
            zu6Var = new fv6(context, str);
            this.b = zu6Var;
        } else if (i2 >= 28) {
            zu6Var = new dv6(context, str);
            this.b = zu6Var;
        } else {
            zu6Var = new zu6(context, str);
            this.b = zu6Var;
        }
        zu6 zu6Var2 = zu6Var;
        k0(new wu6((byte) 1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        zu6Var.a.setMediaButtonReceiver(pendingIntent);
        this.c = new wk4(context, zu6Var2.c);
        if (e == 0) {
            e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void B(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(mv6.class.getClassLoader());
        }
    }

    public static mv6 N(Context context) {
        if (f == null) {
            synchronized (h) {
                if (f == null) {
                    f = new mv6(context);
                }
            }
        }
        return f;
    }

    public static void a0(jb4 jb4Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            jb4Var.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }

    public static void h0(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static final void s() {
        if (((Boolean) new qz2(0, s, rz2.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void t() {
        if (((Boolean) new qz2(0, s, rz2.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static da3 v(uq6 uq6Var) {
        xf4 xf4Var = new xf4((byte) 5);
        xf4Var.d = null;
        Uri uri = uq6Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z = uq6Var.f;
        xf4 xf4Var2 = new xf4();
        gre.f((z && TextUtils.isEmpty(uri2)) ? false : true);
        xf4Var2.b = xf4Var;
        xf4Var2.c = uri2;
        xf4Var2.a = z;
        xf4Var2.d = new HashMap();
        qm5 qm5Var = uq6Var.c;
        ym5 ym5Var = qm5Var.a;
        if (ym5Var == null) {
            ym5Var = qm5Var.c();
            qm5Var.a = ym5Var;
        }
        v5c it = ym5Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) xf4Var2.d)) {
                ((HashMap) xf4Var2.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i = g51.a;
        i2f i2fVar = new i2f((byte) 17);
        UUID uuid = uq6Var.a;
        uuid.getClass();
        boolean z2 = uq6Var.d;
        boolean z3 = uq6Var.e;
        int[] e2 = gle.e(uq6Var.g);
        int length = e2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = e2[i2];
            gre.f(i3 == 2 || i3 == 1);
        }
        da3 da3Var = new da3(uuid, xf4Var2, hashMap, z2, (int[]) e2.clone(), z3, i2fVar);
        byte[] bArr = uq6Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        gre.p(da3Var.x.isEmpty());
        da3Var.L = copyOf;
        return da3Var;
    }

    public static Bundle v0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        B(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final Object A(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (wve.b()) {
            try {
                wve.a(cls.getSimpleName());
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
                pn5 pn5Var = (pn5) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = pn5Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            A(cls2, hashSet);
                        }
                    }
                }
                obj = pn5Var.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new gp2(th);
            }
        }
        return obj;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        s7b s7bVar;
        String str = (String) this.c;
        kr0 kr0Var = (kr0) this.d;
        long j3 = kr0Var.d;
        x02 x02Var = (x02) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() == 1) {
            Object next = selectedPhotos.values().iterator().next();
            if (next instanceof jm6) {
                f4b l = f4b.l((jm6) next);
                l.J0 = j3;
                l.K0 = str;
                l.z();
                t7b C = t7b.C(kr0Var.a.getParentActivity(), kr0Var.b);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                int i4 = C.c;
                WindowManager windowManager = C.f;
                byte b = 0;
                if (!C.d) {
                    if (na7.q1(i4).t2()) {
                        h5.b(i4);
                    } else {
                        C.w0 = j3;
                        C.x0 = str;
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (s7bVar = C.n) != null && s7bVar.getParent() == null) {
                            gl.t3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = l;
                        l.J0 = j3;
                        l.K0 = str;
                        C.P1 = l.K ? 1 : 0;
                        C.t0.g = false;
                        C.K = false;
                        float L = gl.L(100.0f);
                        Point point = gl.q;
                        rectF.set(0.0f, L, point.x, gl.L(100.0f) + point.y);
                        C.H = gl.L(8.0f);
                        C.r.c();
                        g7b g7bVar = C.i0;
                        boolean z5 = C.K;
                        g7bVar.setBackgroundColor((z5 || !z5) ? 0 : -14737633);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        gl.e2(C.b);
                        f4b f4bVar = C.L1;
                        if (f4bVar != null) {
                            C.d1.setText(f4bVar.C0);
                        }
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.c1.b(false, false);
                        C.c1.b(true, true);
                        C.d(1.0f, true, new d6b(C, (byte) 6));
                        C.a();
                    }
                }
                gl.e3(new vq0(x02Var, b), 400L);
            }
        }
    }

    @Override // s09
    public final boolean C() {
        return false;
    }

    public final void D(bs2 bs2Var) {
        t56 t56Var;
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (tv6Var == null) {
            return;
        }
        x0();
        do {
            as2 as2Var = (as2) bs2Var.c.poll();
            if (as2Var == null) {
                bs2Var.f = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            L(bs2Var.a);
            atomicReference.set(as2Var.run());
            t56Var = (t56) atomicReference.get();
        } while (t56Var.isDone());
        t56Var.b(new jn1(this, tv6Var, bs2Var, (byte) 23), vn3.a);
    }

    public final void E(final su6 su6Var) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            final kc8 kc8Var = bs2Var.g;
            bs2Var.g = kc8.b;
            bs2Var.c.add(new as2(su6Var, kc8Var) { // from class: zr2
                public final /* synthetic */ su6 b;

                @Override // as2
                public final t56 run() {
                    tv6 tv6Var = (tv6) ((WeakReference) mv6.this.d).get();
                    if (tv6Var != null) {
                        tv6Var.n(this.b);
                    }
                    return am5.b;
                }
            });
            if (bs2Var.f) {
                return;
            }
            bs2Var.f = true;
            D(bs2Var);
        }
    }

    public final yq3 F(br6 br6Var) {
        da3 da3Var;
        br6Var.b.getClass();
        uq6 uq6Var = br6Var.b.c;
        if (uq6Var == null) {
            return yq3.u;
        }
        synchronized (this.b) {
            if (!uq6Var.equals((uq6) this.c)) {
                this.c = uq6Var;
                this.d = v(uq6Var);
            }
            da3Var = (da3) this.d;
            da3Var.getClass();
        }
        return da3Var;
    }

    public final Object G(Bitmap bitmap) {
        sj0 sj0Var = (sj0) this.b;
        if (sj0Var.a(bitmap)) {
            this.d = ((xj0) this.c).a(bitmap);
            sj0Var.b(bitmap);
        }
        return this.d;
    }

    public qj0 H() {
        int[] iArr;
        gg6 gg6Var = (gg6) this.b;
        int i = gg6Var.a;
        int i2 = gg6Var.b;
        qj0 qj0Var = new qj0(i, i2);
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
            byte[] b = gg6Var.b((i2 * i4) / 5, (byte[]) this.c);
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
            throw uj7.a();
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
        byte[] a = gg6Var.a();
        for (int i25 = 0; i25 < i2; i25++) {
            int i26 = i25 * i;
            for (int i27 = 0; i27 < i; i27++) {
                if ((a[i26 + i27] & 255) < i24) {
                    qj0Var.c(i27, i25);
                }
            }
        }
        return qj0Var;
    }

    public final View I(int i) {
        return ((RecyclerView) ((ln8) this.b).b).getChildAt(O(i));
    }

    public final int J() {
        return ((RecyclerView) ((ln8) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public final mm5 K() {
        x0();
        return mm5.q(((ps) this.b).values());
    }

    public final su6 L(Object obj) {
        x0();
        return (su6) ((ps) this.b).get(obj);
    }

    public final long M() {
        ja3 ja3Var = (ja3) this.d;
        if (ja3Var != null) {
            return ja3Var.d;
        }
        return -1L;
    }

    public final int O(int i) {
        hg2 hg2Var = (hg2) this.c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((ln8) this.b).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int s2 = i - (i2 - hg2Var.s(i2));
            if (s2 == 0) {
                while (hg2Var.x(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += s2;
        }
        return -1;
    }

    public final ny0 P(su6 su6Var) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            return bs2Var.b;
        }
        return null;
    }

    public final View Q(int i) {
        return ((RecyclerView) ((ln8) this.b).b).getChildAt(i);
    }

    public final int R() {
        return ((RecyclerView) ((ln8) this.b).b).getChildCount();
    }

    public final boolean S() {
        return ((IOException) this.d) != null;
    }

    public final void T(View view) {
        ((ArrayList) this.d).add(view);
        ln8 ln8Var = (ln8) this.b;
        s49 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) ln8Var.b;
            int i = U.s;
            if (i != -1) {
                U.r = i;
            } else {
                WeakHashMap weakHashMap = jdc.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.d0()) {
                U.s = 4;
                recyclerView.L0.add(U);
            } else {
                WeakHashMap weakHashMap2 = jdc.a;
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
    public final void U(g63 g63Var, Uri uri, Map map, long j, long j2, ts8 ts8Var) {
        j74 j74Var;
        ja3 ja3Var = new ja3(g63Var, j, j2);
        this.d = ja3Var;
        if (((j74) this.c) != null) {
            return;
        }
        j74[] f2 = ((m74) this.b).f(uri, map);
        int length = f2.length;
        km5 km5Var = mm5.b;
        krd.b(length, "expectedSize");
        jm5 jm5Var = new jm5(length);
        boolean z = true;
        byte b = 0;
        if (f2.length == 1) {
            j74Var = f2[0];
            this.c = j74Var;
        } else {
            int length2 = f2.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                j74 j74Var2 = f2[i];
                try {
                } catch (EOFException unused) {
                    if (((j74) this.c) == null) {
                    }
                } catch (Throwable th) {
                    if (((j74) this.c) == null && ja3Var.d != j) {
                        z = false;
                    }
                    gre.p(z);
                    ja3Var.f = 0;
                    throw th;
                }
                if (j74Var2.c(ja3Var)) {
                    this.c = j74Var2;
                    ja3Var.f = 0;
                    break;
                }
                jm5Var.d(j74Var2.e());
                if (((j74) this.c) == null) {
                }
                boolean z2 = true;
                gre.p(z2);
                ja3Var.f = 0;
                i++;
            }
            j74 j74Var3 = (j74) this.c;
            if (j74Var3 == null) {
                String str = "None of the available extractors (" + new zb3(", ").e(tne.b(mm5.r(f2), new g31(b))) + ") could read the stream.";
                uri.getClass();
                throw new z5c(str, jm5Var.f());
            }
            j74Var = j74Var3;
        }
        j74Var.f(ts8Var);
    }

    public final boolean V(su6 su6Var) {
        x0();
        return ((ps) this.c).get(su6Var) != null;
    }

    @Override // v02
    public final boolean V1() {
        return true;
    }

    public final boolean W() {
        return ((j86) this.c) != null;
    }

    public final boolean X(su6 su6Var, int i) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (bs2Var == null || !bs2Var.e.a(i) || tv6Var == null) {
            return false;
        }
        tv6Var.t();
        return tv6Var.t.q().a(i);
    }

    public final boolean Y(su6 su6Var, int i) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            q5a q5aVar = bs2Var.d;
            q5aVar.getClass();
            gre.e("Use contains(Command) for custom command", i != 0);
            Iterator<E> it = q5aVar.a.iterator();
            while (it.hasNext()) {
                if (((p5a) it.next()).a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Z(su6 su6Var, p5a p5aVar) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var == null) {
            return false;
        }
        ym5 ym5Var = bs2Var.d.a;
        p5aVar.getClass();
        return ym5Var.contains(p5aVar) || hm2.i(p5aVar.b);
    }

    @Override // p3b
    public final void a(ArrayList arrayList) {
        cc1 cc1Var = (cc1) this.c;
        if (cc1Var.getParent() == null) {
            ((yb1) this.d).b.i();
        } else {
            cc1Var.setSegments(arrayList);
        }
    }

    @Override // n86
    public final void b() {
        IOException iOException = (IOException) this.d;
        if (iOException != null) {
            throw iOException;
        }
        j86 j86Var = (j86) this.c;
        if (j86Var != null) {
            int i = j86Var.a;
            IOException iOException2 = j86Var.e;
            if (iOException2 != null && j86Var.f > i) {
                throw iOException2;
            }
        }
    }

    public final void b0(l86 l86Var) {
        e69 e69Var = (e69) this.b;
        j86 j86Var = (j86) this.c;
        if (j86Var != null) {
            j86Var.a(true);
        }
        if (l86Var != null) {
            e69Var.execute(new ez3(l86Var, (byte) 22));
        }
        w26 w26Var = e69Var.b;
        e69Var.a.shutdown();
    }

    @Override // s58
    public final boolean c() {
        return true;
    }

    public final void c0(mj mjVar) {
        uc8 uc8Var = (uc8) ((HashMap) this.b).remove(mjVar);
        uc8Var.getClass();
        kb3 kb3Var = (kb3) ((lb3) this.d).o.get(uc8Var);
        if (kb3Var != null) {
            synchronized (kb3Var) {
                kb3Var.d--;
            }
        }
    }

    @Override // p3b
    public final void d(long j, long j2, boolean z) {
        ((jb4) this.b).f(j, j2, z);
    }

    public final void d0() {
        RecyclerView recyclerView;
        int i;
        ((hg2) this.c).A();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) ((ln8) this.b).b;
            if (size < 0) {
                break;
            }
            s49 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i2 = U.r;
                if (recyclerView.d0()) {
                    U.s = i2;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = jdc.a;
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

    public final void e0(su6 su6Var) {
        ArrayList arrayList;
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).remove(su6Var);
        if (bs2Var != null) {
            ((ps) this.b).remove(bs2Var.a);
            ny0 ny0Var = bs2Var.b;
            synchronized (ny0Var.c) {
                ny0Var.b = true;
                arrayList = new ArrayList(((ps) ny0Var.d).values());
                ((ps) ny0Var.d).clear();
            }
            int size = arrayList.size();
            byte b = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r4a) obj).o();
            }
            tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
            if (tv6Var == null || tv6Var.i()) {
                return;
            }
            g8c.X(tv6Var.l, new yr2(tv6Var, su6Var, b));
        }
    }

    @Override // p3b
    public final void f() {
        yb1 yb1Var = (yb1) this.d;
        xb1 xb1Var = yb1Var.a;
        jb4 jb4Var = yb1Var.c;
        if (jb4Var != null) {
            jb4Var.f = null;
            m21 m21Var = (m21) jb4Var.g;
            if (m21Var != null) {
                m21Var.b();
                jb4Var.g = null;
            }
            yb1Var.c = null;
        }
        cc1 cc1Var = (cc1) this.c;
        if (cc1Var.getParent() != null) {
            xb1Var.Q(cc1Var);
        }
        new u21(xb1Var.m(), xb1Var.o()).Q(R.raw.error, 36, k96.M0(2131744469, null)).k(true);
    }

    @Override // v02
    public final boolean f0() {
        return false;
    }

    public final void g(Object obj, su6 su6Var, q5a q5aVar, kc8 kc8Var) {
        ps psVar = (ps) this.c;
        x0();
        su6 L = L(obj);
        if (L != null) {
            bs2 bs2Var = (bs2) psVar.get(L);
            bs2Var.getClass();
            bs2Var.d = q5aVar;
            bs2Var.e = kc8Var;
            return;
        }
        ((ps) this.b).put(obj, su6Var);
        aob aobVar = aob.a;
        eyb eybVar = eyb.b;
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (tv6Var != null) {
            tv6Var.t();
            ad8 ad8Var = tv6Var.t;
            aobVar = ad8Var.T0();
            if (ad8Var.m0(30)) {
                eybVar = ad8Var.f0();
            }
        }
        ny0 ny0Var = new ny0();
        ny0Var.c = new Object();
        ny0Var.d = new ps(0);
        psVar.put(su6Var, new bs2(obj, ny0Var, q5aVar, kc8Var, aobVar, eybVar));
    }

    public final void g0(yg2 yg2Var) {
        if (((vg2) this.b) != null) {
            for (int i = 0; i < yg2Var.b.size(); i++) {
                vg2 vg2Var = (vg2) this.b;
                vg2Var.h.remove(yg2Var.h(i).d);
                vg2Var.g();
            }
        }
    }

    public final void h(su6 su6Var, int i, as2 as2Var) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            kc8 kc8Var = bs2Var.g;
            kc8Var.getClass();
            jc8 jc8Var = new jc8(kc8Var);
            jc8Var.a.b(i);
            bs2Var.g = jc8Var.b();
            bs2Var.c.add(as2Var);
        }
    }

    public final void i(yg2 yg2Var) {
        if (((vg2) this.b) == null) {
            this.b = new vg2();
        }
        for (int i = 0; i < yg2Var.b.size(); i++) {
            vg2 vg2Var = (vg2) this.b;
            xg2 h2 = yg2Var.h(i);
            vg2Var.h.put(h2.d, h2);
            vg2Var.g();
        }
    }

    public final void i0(boolean z) {
        ((zu6) this.b).a.setActive(z);
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            throw ls6.l(it);
        }
    }

    public final void j0(String str) {
        if (str != null) {
            this.b = str;
        } else {
            fvc.f("Null backendName");
        }
    }

    @Override // s58
    public final void k() {
        ((d32) this.c).R.z();
    }

    public final void k0(yu6 yu6Var, Handler handler) {
        zu6 zu6Var = (zu6) this.b;
        if (yu6Var == null) {
            zu6Var.d(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        zu6Var.d(yu6Var, handler);
    }

    @Override // s58
    public final void l(int i, boolean z, boolean z2) {
        if (z) {
            return;
        }
        d32 d32Var = (d32) this.c;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        x02 x02Var = d32Var.b;
        if (hashMap.isEmpty() || d32Var.R == null || d32Var.L) {
            return;
        }
        d32Var.L = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = hashMap.get(arrayList.get(i2));
            y3a y3aVar = new y3a();
            arrayList2.add(y3aVar);
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                String str = jm6Var.h;
                if (str != null) {
                    y3aVar.c = str;
                } else {
                    y3aVar.c = jm6Var.I;
                }
                y3aVar.e = jm6Var.c;
                y3aVar.f = jm6Var.g;
                y3aVar.k = jm6Var.s;
                y3aVar.o = jm6Var.b;
                CharSequence charSequence = jm6Var.a;
                y3aVar.d = charSequence != null ? charSequence.toString() : null;
                y3aVar.i = jm6Var.n;
                y3aVar.j = jm6Var.r;
                y3aVar.h = jm6Var.x;
            }
        }
        ij.X(x02Var.G3, x02Var.V0(), arrayList2.size() + x02Var.R0(), new p22(d32Var, i, arrayList2, z2, (byte) 0));
    }

    public final void l0(sg2 sg2Var) {
        yg2 yg2Var;
        yg2 yg2Var2 = (yg2) this.c;
        if (yg2Var2 != null && ((sg2) this.d) == null && sg2Var != null) {
            i(yg2Var2);
        }
        if (((sg2) this.d) != null && (yg2Var = (yg2) this.c) != null && sg2Var == null) {
            g0(yg2Var);
        }
        sg2 sg2Var2 = (sg2) this.d;
        if (sg2Var2 != null) {
            i69 i69Var = sg2Var2.a;
            fre.e("Must be called from the main thread.");
            i69Var.i.remove(sg2Var2);
        }
        if (sg2Var != null) {
            sg2Var.a.p(sg2Var);
            yg2 yg2Var3 = (yg2) this.c;
            if (yg2Var3 != null) {
                sg2Var.d = yg2Var3;
                sg2Var.g = 0;
                sg2Var.h = 0;
                sg2Var.p();
            }
        }
        this.d = sg2Var;
    }

    public final void m(int i, View view, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((ln8) this.b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : O(i);
        ((hg2) this.c).y(childCount, z);
        if (z) {
            T(view);
        }
        recyclerView.addView(view, childCount);
        s49 U = RecyclerView.U(view);
        recyclerView.h0(view);
        w39 w39Var = recyclerView.x;
        if (w39Var != null && U != null) {
            w39Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f49) recyclerView.Q.get(size)).c();
            }
        }
    }

    public final void m0(MediaMetadataCompat mediaMetadataCompat) {
        zu6 zu6Var = (zu6) this.b;
        zu6Var.h = mediaMetadataCompat;
        MediaSession mediaSession = zu6Var.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public final void n(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((ln8) this.b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : O(i);
        ((hg2) this.c).y(childCount, z);
        if (z) {
            T(view);
        }
        s49 U = RecyclerView.U(view);
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
    public final void n0(android.support.v4.media.session.PlaybackStateCompat r9) {
        /*
            r8 = this;
            java.lang.Object r8 = r8.b
            zu6 r8 = (zu6) r8
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
            ii5 r2 = (ii5) r2     // Catch: java.lang.Throwable -> L8b
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
            android.media.session.PlaybackState$Builder r1 = ac8.d()
            int r2 = r9.a
            long r3 = r9.b
            float r5 = r9.d
            long r6 = r9.n
            ac8.x(r1, r2, r3, r5, r6)
            long r2 = r9.c
            ac8.u(r1, r2)
            long r2 = r9.e
            ac8.s(r1, r2)
            java.lang.CharSequence r0 = r9.h
            ac8.v(r1, r0)
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
            android.media.session.PlaybackState$CustomAction$Builder r5 = ac8.e(r5, r6, r7)
            android.os.Bundle r4 = r4.d
            ac8.w(r5, r4)
            android.media.session.PlaybackState$CustomAction r5 = ac8.b(r5)
        L71:
            ac8.a(r1, r5)
            goto L50
        L75:
            long r2 = r9.s
            ac8.t(r1, r2)
            android.os.Bundle r0 = r9.w
            bc8.b(r1, r0)
            android.media.session.PlaybackState r0 = ac8.c(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: mv6.n0(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    public final ra0 o() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((cj8) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new ra0((String) this.b, (byte[]) this.c, (cj8) this.d);
        }
        sc8.j("Missing required properties:".concat(str));
        return null;
    }

    public final void o0(ArrayList arrayList) {
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
                    w26.j("queue shouldn't have null items");
                    return;
                }
                long j = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", ls6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        zu6 zu6Var = (zu6) this.b;
        MediaSession mediaSession = zu6Var.a;
        zu6Var.g = arrayList;
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
                queueItem = iv6.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void p() {
        j86 j86Var = (j86) this.c;
        j86Var.getClass();
        j86Var.a(false);
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
    public final void p0(int r4) {
        /*
            r3 = this;
            java.lang.Object r3 = r3.b
            zu6 r3 = (zu6) r3
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
            ii5 r2 = (ii5) r2     // Catch: java.lang.Throwable -> L2c
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
        throw new UnsupportedOperationException("Method not decompiled: mv6.p0(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    @Override // s09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        float f2;
        i19 i19Var;
        f19 k;
        float f3;
        int i;
        float f4;
        mu1 mu1Var = (mu1) this.d;
        hf0 C6 = mu1Var.C6(((k27) this.b).e1(), true);
        float f5 = 0.0f;
        if (C6 instanceof gb2) {
            i19 i19Var2 = ((gb2) C6).O;
            f19 k2 = i19Var2.k(h19Var);
            if (k2 == null) {
                f4 = 0.0f;
                f2 = f5;
                f5 = f4;
                mu1Var.jb(C6, (k27) this.b, (t09) this.c, view, f2, f5, h19Var, false, (h19Var == null && h19Var.a) ? true : z, z2, false);
            }
            f5 = i19Var2.b + k2.w + (k2.z / 2.0f);
            f3 = i19Var2.c + k2.x;
            i = k2.A;
        } else if (!(C6 instanceof uk1) || (k = (i19Var = ((uk1) C6).F0).k(h19Var)) == null) {
            f2 = 0.0f;
            mu1Var.jb(C6, (k27) this.b, (t09) this.c, view, f2, f5, h19Var, false, (h19Var == null && h19Var.a) ? true : z, z2, false);
        } else {
            f5 = i19Var.b + k.w + (k.z / 2.0f);
            f3 = i19Var.c + k.x;
            i = k.A;
        }
        f4 = f3 + (i / 2.0f);
        f2 = f5;
        f5 = f4;
        mu1Var.jb(C6, (k27) this.b, (t09) this.c, view, f2, f5, h19Var, false, (h19Var == null && h19Var.a) ? true : z, z2, false);
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
    public final void q0(int r4) {
        /*
            r3 = this;
            java.lang.Object r3 = r3.b
            zu6 r3 = (zu6) r3
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
            ii5 r2 = (ii5) r2     // Catch: java.lang.Throwable -> L2c
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
        throw new UnsupportedOperationException("Method not decompiled: mv6.q0(int):void");
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    public final void r0(k86 k86Var, h86 h86Var, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        j86 j86Var = new j86(this, myLooper, k86Var, h86Var, i, SystemClock.elapsedRealtime());
        gre.p(((j86) this.c) == null);
        this.c = j86Var;
        j86Var.b();
    }

    public final FileOutputStream s0() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            h0(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                ag.e(file, "Failed to create directory for ");
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + file, e2);
            }
        }
    }

    public final synchronized void t0() {
        ((lb3) this.d).c.E();
    }

    public final String toString() {
        switch (this.a) {
            case 21:
                return ((hg2) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    @Override // s09
    public final boolean u() {
        return false;
    }

    public final void u0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ln8 ln8Var = (ln8) this.b;
            s49 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) ln8Var.b;
                int i = U.r;
                if (recyclerView.d0()) {
                    U.s = i;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = jdc.a;
                    view2.setImportantForAccessibility(i);
                }
                U.r = 0;
            }
        }
    }

    public final void w(int i) {
        s49 U;
        int O = O(i);
        ((hg2) this.c).z(O);
        RecyclerView recyclerView = (RecyclerView) ((ln8) this.b).b;
        View childAt = recyclerView.getChildAt(O);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(O);
    }

    public final void w0(boolean z, float f2) {
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

    public final void x0() {
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (tv6Var != null) {
            gre.p(Looper.myLooper() == tv6Var.l.getLooper());
        }
    }

    public final void y(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pn5.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    A((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new gp2(e2);
            }
        }
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // v02
    public final void I0() {
    }

    @Override // s58
    public final void e() {
    }

    @Override // v02
    public final void y0() {
    }

    @Override // s09
    public final void z() {
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // s58
    public final void j(Editable editable) {
    }

    public /* synthetic */ mv6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ mv6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mv6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public mv6(CastDevice castDevice, uhf uhfVar) {
        this.a = (byte) 15;
        fre.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = uhfVar;
    }

    public mv6(xj0 xj0Var) {
        this.a = (byte) 9;
        this.b = new sj0();
        this.c = xj0Var;
    }

    public mv6(ExecutorService executorService, ExecutorService executorService2) {
        this.a = (byte) 3;
        executorService.getClass();
        executorService2.getClass();
        this.b = new pz2(executorService);
        this.c = new pz2(executorService);
        Tasks.forResult(null);
        this.d = new pz2(executorService2);
    }

    public mv6(gg6 gg6Var) {
        this.a = (byte) 4;
        this.b = gg6Var;
        this.c = w;
        this.d = new int[32];
    }

    public mv6() {
        this.a = (byte) 28;
        this.b = new Object();
    }

    public mv6(ln8 ln8Var) {
        this.a = (byte) 21;
        this.b = ln8Var;
        this.c = new hg2((byte) 0);
        this.d = new ArrayList();
    }

    public mv6(jb4 jb4Var) {
        this.a = (byte) 2;
        this.c = null;
        this.d = null;
        this.b = jb4Var;
    }

    public mv6(File file) {
        this.a = (byte) 7;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public mv6(tv6 tv6Var) {
        this.a = (byte) 25;
        this.b = new ps(0);
        this.c = new ps(0);
        this.d = new WeakReference(tv6Var);
    }

    public mv6(Context context) {
        this.a = (byte) 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public mv6(byte[] bArr, t56 t56Var) {
        this.a = (byte) 12;
        this.b = bArr;
        this.c = null;
        this.d = t56Var;
    }

    public mv6(jr6 jr6Var, t56 t56Var) {
        this.a = (byte) 12;
        this.b = jr6Var.k;
        this.c = jr6Var.n;
        this.d = t56Var;
    }

    public mv6(p20[] p20VarArr) {
        this.a = (byte) 27;
        lha lhaVar = new lha();
        lhaVar.m = 0;
        lhaVar.o = 0;
        lhaVar.p = 0;
        byte[] bArr = g8c.b;
        lhaVar.n = bArr;
        lhaVar.q = bArr;
        mka mkaVar = new mka();
        mkaVar.b = 1.0f;
        mkaVar.c = 1.0f;
        l20 l20Var = l20.e;
        mkaVar.d = l20Var;
        mkaVar.e = l20Var;
        mkaVar.f = l20Var;
        mkaVar.g = l20Var;
        ByteBuffer byteBuffer = p20.a;
        mkaVar.j = byteBuffer;
        mkaVar.k = byteBuffer;
        p20[] p20VarArr2 = new p20[p20VarArr.length + 2];
        this.b = p20VarArr2;
        System.arraycopy(p20VarArr, 0, p20VarArr2, 0, p20VarArr.length);
        this.c = lhaVar;
        this.d = mkaVar;
        p20VarArr2[p20VarArr.length] = lhaVar;
        p20VarArr2[p20VarArr.length + 1] = mkaVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mv6(String str) {
        this((Object) new e69(Executors.newSingleThreadExecutor(new sq2(r4, (byte) 1)), new w26((byte) 1)), (byte) 5);
        this.a = (byte) 5;
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = g8c.a;
    }

    public mv6(qx4 qx4Var) {
        this.a = (byte) 6;
        this.b = qx4Var;
        this.c = Choreographer.getInstance();
        this.d = new mn(this, (byte) 0);
    }

    public mv6(d32 d32Var, HashMap hashMap, ArrayList arrayList) {
        this.a = (byte) 19;
        this.c = d32Var;
        this.b = hashMap;
        this.d = arrayList;
    }

    public /* synthetic */ mv6(byte b) {
        this.a = b;
    }

    public mv6(lb3 lb3Var, uc8 uc8Var) {
        this.a = (byte) 29;
        this.d = lb3Var;
        this.b = new HashMap();
        this.c = uc8Var;
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
