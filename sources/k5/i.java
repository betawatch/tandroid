package k5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import bg.i2;
import c2.t;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.u;
import f2.a1;
import f2.v1;
import f2.z0;
import f7.h5;
import g7.y5;
import i8.e0;
import ih.i9;
import ih.j9;
import ih.k4;
import ih.n3;
import j3.m;
import j3.m0;
import j3.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kh.ya;
import m.f2;
import m.j1;
import m6.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
import x6.l1;
import x6.m1;
import xf.q1;
import xf.s0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements a0, androidx.activity.result.b, o, s, k0, v0, l0, v1, j1, OnCompleteListener, i9, q, kd.b, yf.v1, f2, m.l {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i9, boolean z10) {
        this.a = i9;
    }

    public static boolean L(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String P(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static synchronized i Q(Context context) {
        i S;
        synchronized (i.class) {
            S = S(context.getApplicationContext());
        }
        return S;
    }

    public static synchronized i S(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            c = iVar2;
            return iVar2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean A() {
        return true;
    }

    @Override // f2.v1
    public int B(View view) {
        return z0.v(view) + ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).bottomMargin;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e C(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // j3.q
    public void D() {
        h3.l0 l0Var = ((m0) this.b).O0;
        if (l0Var != null) {
            l0Var.a.n.d(2);
        }
    }

    @Override // androidx.lifecycle.a0
    public void E(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.w0;
        androidx.activity.i iVar = f0Var.x0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public void F(int i9, boolean z10) {
        t tVar = (t) this.b;
        if (z10) {
            tVar.b(i9);
        } else {
            tVar.getClass();
        }
    }

    public boolean G(String str) {
        String K = K(str);
        return "1".equals(K) || Boolean.parseBoolean(K);
    }

    public Integer H(String str) {
        String K = K(str);
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(K));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + P(str) + "(" + K + ") into an int");
            return null;
        }
    }

    public JSONArray I(String str) {
        String K = K(str);
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        try {
            return new JSONArray(K);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + P(str) + ": " + K + ", falling back to default");
            return null;
        }
    }

    public String J(Resources resources, String str, String str2) {
        String[] strArr;
        String K = K(str2);
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        String K2 = K(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(K2)) {
            return null;
        }
        int identifier = resources.getIdentifier(K2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", P(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray I = I(str2.concat("_loc_args"));
        if (I == null) {
            strArr = null;
        } else {
            int length = I.length();
            strArr = new String[length];
            for (int i9 = 0; i9 < length; i9++) {
                strArr[i9] = I.optString(i9);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + P(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    public String K(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle M() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public l9.a N(JSONObject jSONObject) {
        l9.b uVar;
        int i9 = jSONObject.getInt("settings_version");
        if (i9 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i9 + ". Using default settings values.", null);
            uVar = new za.a(13);
        } else {
            uVar = new u(14);
        }
        return uVar.t((ya.b) this.b, jSONObject);
    }

    public void O(int i9) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i9);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i9);
    }

    public synchronized void R() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ih.i9
    public void T(long j10, int i9, n3 n3Var) {
        oy0 oy0Var = (oy0) this.b;
        int i10 = ProfileStoriesView.o0;
        oy0Var.f(true, false);
        n3Var.run();
    }

    @Override // j3.q
    public void a(long j10) {
        m mVar = ((m0) this.b).F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new i2(mVar, j10, 8));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        Parcel obtain;
        switch (this.a) {
            case 7:
                c6.f fVar = new c6.f(0, (TaskCompletionSource) obj2);
                c6.e eVar = (c6.e) ((c6.h) obj).u();
                c6.a aVar = (c6.a) this.b;
                Parcel G0 = eVar.G0();
                u6.a.d(G0, fVar);
                u6.a.c(G0, aVar);
                eVar.H0(G0, 1);
                return;
            case 14:
                f8.e eVar2 = (f8.e) this.b;
                o7.b bVar = (o7.b) obj;
                bVar.getClass();
                o7.a aVar2 = new o7.a(1, (TaskCompletionSource) obj2);
                try {
                    o7.i iVar = (o7.i) bVar.u();
                    Bundle G = bVar.G();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i9 = o7.c.a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } finally {
                        obtain.recycle();
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
                    Bundle bundle = Bundle.EMPTY;
                    h5.a(Status.h, Boolean.FALSE, aVar2.b);
                    return;
                }
            default:
                l6.b bVar2 = new l6.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.b);
                int i10 = x6.j.a;
                obtain2.writeStrongBinder(bVar2);
                obtain2.writeInt(1);
                vVar.writeToParcel(obtain2, 0);
                obtain = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain2, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    obtain2.recycle();
                }
        }
    }

    @Override // f2.v1
    public int c(View view) {
        return z0.z(view) - ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 3:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    iArr[i9] = ((Boolean) arrayList.get(i9)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = f0Var.a;
                    if (j0Var.c.q(str) == null) {
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
                int i10 = aVar.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.K;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // j3.q
    public void g() {
        h3.l0 l0Var = ((m0) this.b).O0;
        if (l0Var != null) {
            l0Var.a.S = true;
        }
    }

    @Override // yf.v1
    public void g0(float f10) {
        ya yaVar = (ya) this.b;
        s0.e(yaVar.B1).k(String.valueOf(xf.m.a.indexOf(yaVar.K0.getCurrentBrush())), f10);
        q1 q1Var = yaVar.w1;
        q1Var.c = f10;
        yaVar.E0(q1Var, null, false);
    }

    @Override // yf.v1
    public float get() {
        ya yaVar = (ya) this.b;
        int i9 = yaVar.B1;
        xf.m currentBrush = yaVar.K0.getCurrentBrush();
        return currentBrush == null ? s0.e(i9).i : s0.e(i9).f(String.valueOf(xf.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i9) {
        m4.g gVar = ((m4.d) this.b).a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return q0.e;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void i(Object obj) {
        n nVar;
        androidx.activity.o oVar = ((b7.k) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((p) oVar.b).c;
        }
        if (nVar != null) {
            ((b7.e) oVar.c).c(nVar, 2441);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void j() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.v();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // m.f2
    public void k(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // f2.v1
    public int l() {
        return ((z0) this.b).G();
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void m(n0 n0Var, long j10, long j11) {
        boolean z10;
        m4.d dVar = (m4.d) this.b;
        synchronized (d5.a.i) {
            z10 = d5.a.j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        m4.g gVar = dVar.a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void n(int i9) {
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                x.k(xVar, i9);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i9);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // j3.q
    public void o(int i9, long j10, long j11) {
        m mVar = ((m0) this.b).F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(mVar, i9, j10, j11, 1));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.b;
        if (task.isSuccessful()) {
            h8.m.K0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            h8.m.K0(e0Var, false, null);
        }
    }

    @Override // j3.q
    public void onSkipSilenceEnabledChanged(boolean z10) {
        m mVar = ((m0) this.b).F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new eh.f(5, mVar, z10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(kd.c cVar, sc.c cVar2) {
        kd.a aVar;
        int i9;
        Throwable th;
        ld.g gVar;
        if (cVar2 instanceof kd.a) {
            aVar = (kd.a) cVar2;
            int i10 = aVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                aVar.d = i10 - TLObject.FLAG_31;
                Object obj = aVar.b;
                rc.a aVar2 = rc.a.a;
                i9 = aVar.d;
                oc.i iVar = oc.i.a;
                if (i9 != 0) {
                    y5.b(obj);
                    ld.g gVar2 = new ld.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.n) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        y5.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.releaseIntercepted();
                        throw th;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new kd.a(this, cVar2);
        Object obj2 = aVar.b;
        rc.a aVar22 = rc.a.a;
        i9 = aVar.d;
        oc.i iVar2 = oc.i.a;
        if (i9 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void s(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = u5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void t(u5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // f2.v1
    public int u() {
        z0 z0Var = (z0) this.b;
        return z0Var.n - z0Var.C();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void v() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.B = Collections.EMPTY_SET;
    }

    @Override // j3.q
    public void w(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        m mVar = ((m0) this.b).F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new j3.k(mVar, exc, 1));
        }
    }

    @Override // j3.q
    public void x() {
        ((m0) this.b).M0 = true;
    }

    @Override // m.f2
    public void y(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i9)).b) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 == -1) {
            return;
        }
        int i10 = i9 + 1;
        handler.postAtTime(new af.f(this, i10 < arrayList.size() ? (l.d) arrayList.get(i10) : null, mVar, kVar, 7), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // ih.i9
    public boolean y0(long j10, int i9, int i10, int i11, j9 j9Var) {
        ImageReceiver imageReceiver;
        k4 k4Var;
        k4 k4Var2;
        j9Var.b = null;
        j9Var.c = null;
        oy0 oy0Var = (oy0) this.b;
        iz0 iz0Var = oy0Var.h;
        ArrayList arrayList = oy0Var.w;
        if (oy0Var.J < 0.2f) {
            j9Var.b = iz0Var.getImageReceiver();
            j9Var.c = null;
            j9Var.a = iz0Var;
            j9Var.h = 0.0f;
            j9Var.i = AndroidUtilities.displaySize.y;
            j9Var.g = (View) oy0Var.getParent();
            j9Var.d = oy0Var.y;
            j9Var.n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                imageReceiver = null;
                k4Var = null;
                k4Var2 = null;
                break;
            }
            k4 k4Var3 = (k4) arrayList.get(i12);
            if (k4Var3.e >= 1.0f && k4Var3.a == i10) {
                int i13 = i12 - 1;
                int i14 = i12 - 2;
                k4 d = ProfileStoriesView.d(i13 >= 0 ? (k4) arrayList.get(i13) : null, i14 >= 0 ? (k4) arrayList.get(i14) : null, k4Var3);
                imageReceiver = k4Var3.b;
                k4Var2 = d;
                k4Var = k4Var3;
            }
            i12++;
        }
        if (imageReceiver == null) {
            return false;
        }
        j9Var.c = imageReceiver;
        j9Var.b = null;
        j9Var.a = oy0Var;
        j9Var.h = 0.0f;
        j9Var.i = AndroidUtilities.displaySize.y;
        j9Var.g = (View) oy0Var.getParent();
        if (k4Var == null || k4Var2 == null) {
            j9Var.f = null;
            return true;
        }
        j9Var.f = new f1.a(this, new RectF(k4Var.m), k4Var, new RectF(k4Var2.m), k4Var2);
        return true;
    }

    @Override // f2.v1
    public View z(int i9) {
        return ((z0) this.b).q(i9);
    }

    public /* synthetic */ i(com.google.android.gms.common.api.j jVar, y5.a aVar, int i9) {
        this.a = i9;
        this.b = aVar;
    }

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public i(Context context) {
        String d;
        this.a = 0;
        b a2 = b.a(context);
        this.b = a2;
        a2.b();
        String d9 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d9) || (d = a2.d(b.f("googleSignInOptions", d9))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i9) {
        this.a = i9;
        switch (i9) {
            case 16:
                this.b = new t();
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public i(Bundle bundle) {
        this.a = 10;
        this.b = new Bundle(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void b(Bundle bundle) {
    }

    @Override // ih.i9
    public /* synthetic */ void d(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void r(int i9) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void p(u5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void e(n0 n0Var, long j10, long j11, boolean z10) {
    }
}
