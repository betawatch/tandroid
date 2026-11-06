package cb;

import a0.f;
import a8.m1;
import a8.p0;
import a8.t6;
import ai.e;
import ai.s0;
import ai.y0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.a0;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.Window;
import androidx.biometric.q;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.z;
import androidx.emoji2.text.k;
import androidx.fragment.app.e0;
import androidx.fragment.app.j0;
import b3.i;
import b3.j;
import b9.w0;
import bi.k7;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.x;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.i0;
import d3.l;
import d8.d;
import di.g9;
import di.i4;
import e2.x1;
import f6.y;
import fi.g;
import fi.w5;
import fi.x9;
import fi.y5;
import fi.za;
import g.s;
import j$.util.DesugarCollections;
import j6.r;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import l.w;
import m.q3;
import m6.n;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dr0;
import q6.m;
import sg.h;
import sg.j1;
import sg.l0;
import tg.l1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c implements SuccessContinuation, k, androidx.activity.result.b, co0, j, te.b, o0, i0, p, dr0, d90, l1, q51, za, w, OnSuccessListener {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public c(d0 d0Var) {
        this.a = 15;
        this.b = new WeakReference(d0Var);
    }

    public static o o(Looper looper, Object obj, String str) {
        m.h(obj, "Listener must not be null");
        m.h(looper, "Looper must not be null");
        return new o(looper, obj, str);
    }

    @Override // l.w
    public boolean A(l.k kVar) {
        Window.Callback callback = ((s) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(qs.t1, kVar);
        return true;
    }

    public void B(String str, String str2) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    @Override // org.telegram.ui.Components.co0
    public void C0() {
        cc k10 = ((k7) this.b).k().k(false);
        k10.t = true;
        k10.j();
    }

    public void D() {
        d0 d0Var = (d0) ((WeakReference) this.b).get();
        if (d0Var == null) {
            return;
        }
        d0Var.l();
    }

    public void E(IBinder iBinder) {
        synchronized (((HashMap) this.b)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new w0();
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/null");
                }
            }
        }
    }

    @Override // te.b
    public void F(float f10, int i7) {
        ch.o oVar = (ch.o) this.b;
        oVar.c.setLayerType(0, null);
        if (f10 == 0.0f && !oVar.O) {
            oVar.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.E.setFocusableInTouchMode(false);
            }
        }
        qs.e().k(qs.k1, 512);
    }

    @Override // org.telegram.ui.dr0
    public void I(ij ijVar) {
        ((g9) ((i4) this.b).z1).f(false);
    }

    @Override // org.telegram.ui.dr0
    public void I0(ij ijVar) {
        ((g9) ((i4) this.b).z1).f(true);
    }

    @Override // org.telegram.ui.Components.d90
    public Paint.FontMetricsInt R0() {
        return ((fi.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // tg.l1
    public void X(float f10) {
        x9 x9Var = (x9) this.b;
        l0.e(x9Var.o1).k(String.valueOf(h.a.indexOf(x9Var.x0.getCurrentBrush())), f10);
        j1 j1Var = x9Var.j1;
        j1Var.c = f10;
        x9Var.B0(j1Var, null, false);
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((ch.o) this.b).j0(f10);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        o8.a aVar = (o8.a) this.b;
        d dVar = new d(0, (TaskCompletionSource) obj2);
        d8.c cVar = (d8.c) ((d8.f) obj).n();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i7 = d8.a.a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        aVar.writeToParcel(obtain, 0);
        cVar.H0(obtain, 2);
    }

    @Override // androidx.emoji2.text.k
    public void b(t6 t6Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new aa.s(this, t6Var, threadPoolExecutor, 6));
    }

    @Override // l.w
    public void c(l.k kVar, boolean z9) {
        ((s) this.b).g(kVar);
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public void d(n6.a aVar) {
        f1 f1Var = (f1) this.b;
        f1Var.o.lock();
        try {
            f1Var.m = aVar;
            f1Var.j();
        } finally {
            f1Var.o.unlock();
        }
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 8:
                Map map = (Map) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                e0 e0Var = (e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = e0Var.a;
                    if (i0Var.c.o(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.b;
                int i10 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar.a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // tg.l1
    public float get() {
        x9 x9Var = (x9) this.b;
        int i7 = x9Var.o1;
        h currentBrush = x9Var.x0.getCurrentBrush();
        return currentBrush == null ? l0.e(i7).i : l0.e(i7).f(String.valueOf(h.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public void i(int i7) {
        f1 f1Var = (f1) this.b;
        Lock lock = f1Var.o;
        Lock lock2 = f1Var.o;
        lock.lock();
        try {
            if (f1Var.n) {
                f1Var.n = false;
                f1Var.b.i(i7);
                f1Var.m = null;
                f1Var.l = null;
            } else {
                f1Var.n = true;
                f1Var.d.onConnectionSuspended(i7);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public void k(Bundle bundle) {
        f1 f1Var = (f1) this.b;
        f1Var.o.lock();
        try {
            f1Var.m = n6.a.f;
            f1Var.j();
        } finally {
            f1Var.o.unlock();
        }
    }

    public void l(n nVar, v vVar) {
        j0 j0Var = (j0) this.b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        j0 j0Var2 = (j0) this.b;
        q qVar = (q) j0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            j0Var2.A(true);
            j0Var2.E();
        }
        androidx.fragment.app.u k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        z zVar = qVar.l0;
        zVar.f = nVar;
        int i7 = nVar.a;
        if (i7 == 0) {
            i7 = vVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
            zVar.g = m1.a();
        } else {
            zVar.g = vVar;
        }
        if (qVar.Q()) {
            qVar.l0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.l0.k = null;
        }
        if (qVar.Q() && new a0(new t(k10, 0)).d(qs.e4) != 0) {
            qVar.l0.n = true;
            qVar.S();
        } else if (qVar.l0.p) {
            qVar.k0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView l0() {
        return null;
    }

    @Override // d3.i0
    public void m() {
        l lVar = (l) this.b;
        if (lVar.r1 != null) {
            lVar.R0(0, 1);
        }
    }

    public f6.o n() {
        f6.o oVar = (f6.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // b3.j
    public i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        ((o2.d) this.b).a.y(iOException);
        return b3.o.e;
    }

    @Override // b3.j
    public void o1(b3.l lVar, long j3, long j10) {
        boolean z9;
        o2.d dVar = (o2.d) this.b;
        synchronized (c3.b.b) {
            z9 = c3.b.c;
        }
        if (z9) {
            dVar.b();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // d3.i0
    public void onFirstFrameRendered() {
        l lVar = (l) this.b;
        Surface surface = lVar.r1;
        if (surface != null) {
            lVar.b1.g0(surface);
            lVar.u1 = true;
        }
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onStateChanged(boolean z9, int i7) {
        y5 y5Var = (y5) this.b;
        w5 w5Var = y5Var.L;
        g0.r(w5Var);
        t51 t51Var = y5Var.D;
        if (t51Var == null || !t51Var.d0()) {
            return;
        }
        g0.h3(w5Var);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a2 a2Var;
        a1 b10;
        g6.a aVar = (g6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (m0.j) {
            Context context = aVar.a;
            r rVar = aVar.f;
            m0 m0Var = new m0(context, rVar, aVar.c, aVar.j, aVar.g);
            int i7 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z9 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i7 == 0) {
                if (!z9) {
                    return;
                }
                i7 = 0;
                z9 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String q10 = rf.b.q(packageName, ".client_cast_analytics_data");
            int i10 = 2;
            m0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            o5.s.b(context);
            m0Var.g = o5.s.a().c(m5.a.e).a("CAST_SENDER_SDK", new l5.c("proto"), x.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(q10, 0);
            if (i7 != 0) {
                com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                b11.c = new h9.f1(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, i10);
                b11.d = new n6.c[]{y.c};
                b11.b = false;
                b11.a = 8426;
                Task e10 = rVar.e(0, b11.a());
                n nVar = new n();
                nVar.b = m0Var;
                nVar.c = packageName;
                nVar.a = i7;
                nVar.d = sharedPreferences;
                e10.addOnSuccessListener(nVar);
            }
            if (z9) {
                m.g(sharedPreferences);
                j6.b bVar = a2.i;
                synchronized (a2.class) {
                    try {
                        if (a2.k == null) {
                            a2.k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.c;
                SharedPreferences sharedPreferences2 = a2Var.b;
                HashSet hashSet = a2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    a2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                a1 b12 = a2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = a2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    a2Var.c(hashSet3);
                    m.g(a2Var.e);
                    m.g(a2Var.d);
                    a2Var.e.post(a2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    a2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                a2.a(a1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((y5) this.b).i();
    }

    public int p(int[] iArr, int i7) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        ec.a aVar = (ec.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i12 = 1;
            while (i12 < length && iArr[i12] == 0) {
                i12++;
            }
            if (i12 == length) {
                iArr2 = new int[]{0};
            } else {
                int i13 = length - i12;
                int[] iArr4 = new int[i13];
                System.arraycopy(iArr, i12, iArr4, 0, i13);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i7];
        boolean z9 = true;
        for (int i14 = 0; i14 < i7; i14++) {
            int i15 = aVar.a[aVar.g + i14];
            if (i15 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else {
                if (i15 == 1) {
                    i10 = 0;
                    for (int i16 : iArr2) {
                        ec.a aVar2 = ec.a.h;
                        i10 ^= i16;
                    }
                } else {
                    i10 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i17 = 1; i17 < length2; i17++) {
                        i10 = aVar.c(i15, i10) ^ iArr2[i17];
                    }
                }
                i11 = i10;
            }
            iArr5[(i7 - 1) - i14] = i11;
            if (i11 != 0) {
                z9 = false;
            }
        }
        if (z9) {
            return 0;
        }
        ec.b bVar = new ec.b(aVar, iArr5);
        ec.b a10 = aVar.a(i7, 1);
        ec.b bVar2 = aVar.c;
        if (a10.d() >= bVar.d()) {
            a10 = bVar;
            bVar = a10;
        }
        ec.b bVar3 = aVar.d;
        ec.b bVar4 = a10;
        ec.b bVar5 = bVar;
        ec.b bVar6 = bVar4;
        ec.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i7) {
            if (bVar6.e()) {
                throw new ec.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            ec.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            ec.b a11 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            ec.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a11;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new ec.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        ec.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        ec.b bVar10 = bVarArr[0];
        ec.b bVar11 = bVarArr[1];
        int d2 = bVar10.d();
        if (d2 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d2];
            int i18 = 0;
            for (int i19 = 1; i19 < aVar.e && i18 < d2; i19++) {
                if (bVar10.b(i19) == 0) {
                    iArr6[i18] = aVar.b(i19);
                    i18++;
                }
            }
            if (i18 != d2) {
                throw new ec.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i20 = 0; i20 < length3; i20++) {
            int b12 = aVar.b(iArr3[i20]);
            int i21 = 1;
            for (int i22 = 0; i22 < length3; i22++) {
                if (i20 != i22) {
                    int c12 = aVar.c(iArr3[i22], b12);
                    i21 = aVar.c(i21, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i21));
            iArr7[i20] = c13;
            if (aVar.g != 0) {
                iArr7[i20] = aVar.c(c13, b12);
            }
        }
        for (int i23 = 0; i23 < iArr3.length; i23++) {
            int length4 = iArr.length - 1;
            int i24 = iArr3[i23];
            if (i24 == 0) {
                throw new IllegalArgumentException();
            }
            int i25 = length4 - aVar.b[i24];
            if (i25 < 0) {
                throw new ec.c("Bad error location");
            }
            iArr[i25] = iArr[i25] ^ iArr7[i23];
        }
        return iArr3.length;
    }

    @Override // d3.i0
    public void q() {
        l2.l0 l0Var = ((l) this.b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    public Set s() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // fi.za
    public void t(boolean z9, float f10) {
        ((e) this.b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        aa.q qVar = ((aa.o) this.b).e;
        if (bVar != null) {
            return Tasks.whenAll((Task<?>[]) new Task[]{aa.q.b(qVar), qVar.m.h(null, qVar.e.a)});
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.forResult(null);
    }

    public void v(h6.m mVar) {
        q3 q3Var = (q3) this.b;
        q3Var.b = mVar;
        Iterator it = ((LinkedList) q3Var.c).iterator();
        while (it.hasNext()) {
            ((a7.c) it.next()).b();
        }
        ((LinkedList) q3Var.c).clear();
    }

    public void w(int i7) {
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        y0 y0Var = ((s0) this.b).e;
        if (y0Var == null || y0Var.d == i7) {
            return;
        }
        if (y0Var.c.d && i7 == 2) {
            i7 = 1;
        }
        y0Var.d = i7;
        y0Var.f().edit().putBoolean("qrNoPaidPermanent", y0Var.d == 2).apply();
        int i10 = y0Var.d;
        if (i10 == 0) {
            if (y0Var.n != 0) {
                ConnectionsManager.getInstance(y0Var.a).cancelRequest(y0Var.n, true);
                y0Var.n = 0;
                return;
            }
            return;
        }
        if (i10 == 2 && (c10 = y0Var.c()) != null) {
            y0Var.f = c10;
            y0Var.b.setFreeLink(y0Var.d(c10));
        }
        y0Var.n(false, y0Var.d == 1);
    }

    public void y(String str, Bitmap bitmap) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void z(long j3) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j3);
    }

    @Override // org.telegram.ui.Components.d90
    public void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        g gVar = ((fi.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z9) {
                i6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public c(MediaInfo mediaInfo) {
        this.a = 23;
        f6.o oVar = new f6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.a = 23;
        this.b = new f6.o(jSONObject);
    }

    public c(int i7) {
        this.a = i7;
        switch (i7) {
            case 5:
                this.b = new Bundle();
                break;
            case 10:
                this.b = new HashMap();
                break;
            case 14:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 20:
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(Context context) {
        this.a = 7;
        this.b = context.getApplicationContext();
    }

    public c(aa.o oVar, String str) {
        this.a = 2;
        this.b = oVar;
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 5;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        a0.g(bundle);
    }

    @Override // fi.za
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.co0
    public /* synthetic */ void W() {
    }

    @Override // fi.za
    public /* synthetic */ void r() {
    }

    public c(LaunchActivity launchActivity, Executor executor, a8.l1 l1Var) {
        this.a = 6;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            j0 s5 = launchActivity.s();
            z zVar = (z) new a0(launchActivity).i(z.class);
            this.b = s5;
            zVar.d = executor;
            zVar.e = l1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // fi.za
    public /* synthetic */ void G(float f10) {
    }

    @Override // org.telegram.ui.Components.d90
    public /* synthetic */ void G1(String str) {
    }

    @Override // fi.za
    public /* synthetic */ void J(long j3) {
    }

    @Override // fi.za
    public /* synthetic */ void K(boolean z9) {
    }

    @Override // fi.za
    public /* synthetic */ void O(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void Q(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void T(float f10) {
    }

    @Override // d3.i0
    public void a(x1 x1Var) {
    }

    @Override // fi.za
    public /* synthetic */ void a0(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void e(int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void e0(long j3) {
    }

    @Override // fi.za
    public /* synthetic */ void g(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void h(float f10) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // fi.za
    public /* synthetic */ void u(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void x(boolean z9) {
    }

    @Override // fi.za
    public /* synthetic */ void C(float f10, int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void N(float f10, int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void S(float f10, int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void b0(int i7, long j3) {
    }

    @Override // fi.za
    public /* synthetic */ void j(long j3, boolean z9) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onError(t51 t51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.d90
    public /* synthetic */ void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Components.d90
    public /* synthetic */ void e1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // b3.j
    public /* synthetic */ void M0(b3.l lVar, long j3, long j10, int i7) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override // b3.j
    public void q0(b3.l lVar, long j3, long j10, boolean z9) {
    }
}
