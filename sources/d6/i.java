package d6;

import a8.la;
import a8.n1;
import a8.w9;
import a8.xa;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.biometric.z;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import ch.p;
import ci.o0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.x;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.i0;
import di.l6;
import di.t;
import e2.r0;
import e2.x1;
import f6.y;
import f7.v;
import fi.b4;
import fi.b9;
import fi.c9;
import fi.e3;
import g.s;
import gb.p0;
import hi.u5;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import m6.n;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;
import org.telegram.ui.wv0;
import q6.m;
import q7.l1;
import q7.m1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class i implements SuccessContinuation, androidx.activity.result.b, b3.k, te.b, q0, i0, q, nt0, jc, WebMessageListenerBoundaryInterface, b9, w, OnSuccessListener, OnCompleteListener, ib.b {
    public static i c;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i(cb.c cVar) {
        this.a = 18;
        this.b = (r) cVar.b;
    }

    public static synchronized i B(Context context) {
        i F;
        synchronized (i.class) {
            F = F(context.getApplicationContext());
        }
        return F;
    }

    public static synchronized i F(Context context) {
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

    public static o o(Looper looper, Object obj, String str) {
        m.i(obj, "Listener must not be null");
        m.i(looper, "Looper must not be null");
        return new o(looper, obj, str);
    }

    public void A() {
        f0 f0Var = (f0) ((WeakReference) this.b).get();
        if (f0Var == null) {
            return;
        }
        f0Var.k();
    }

    @Override // l.w
    public boolean C(l.k kVar) {
        Window.Callback callback = ((s) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(ks.t1, kVar);
        return true;
    }

    @Override // te.b
    public void D(float f10, int i7) {
        p pVar = (p) this.b;
        pVar.c.setLayerType(0, null);
        if (f10 == 0.0f && !pVar.P) {
            pVar.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                pVar.F.setFocusableInTouchMode(false);
            }
        }
        ks.e().k(ks.k1, 512);
    }

    public synchronized void E() {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.nt0
    public void G(boolean z10) {
        te.a aVar = ((t) this.b).s;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((p) this.b).j0(f10);
    }

    public void I() {
        h6.h hVar = (h6.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((h6.g) it2.next()).a();
        }
    }

    @Override // org.telegram.ui.Components.nt0
    public float U0() {
        i0.b bVar;
        bVar = ((h2) ((t) this.b)).mSystemInsets;
        return i5.c.d(9.66f, ri.a.d(bVar.b), 0);
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.b;
        switch (i7) {
            case 12:
                d8.d dVar = new d8.d(0, (TaskCompletionSource) obj2);
                d8.c cVar = (d8.c) ((d8.f) obj).n();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = d8.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((o8.a) obj3).writeToParcel(obtain, 0);
                cVar.h1(obtain, 2);
                return;
            default:
                e7.b bVar = new e7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).n();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.b);
                int i11 = q7.j.a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) obj3).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    public void c(f3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        ((s) this.b).i(kVar);
    }

    @Override // fi.b9
    public void e(long j3, int i7, e3 e3Var) {
        cv0 cv0Var = (cv0) this.b;
        int i10 = ProfileStoriesView.t0;
        cv0Var.f(true, false);
        e3Var.run();
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 3:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = f0Var.a;
                    if (j0Var.c.o(str) == null) {
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
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.P;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public void g(n nVar, androidx.biometric.v vVar) {
        Object obj = this.b;
        k0 k0Var = (k0) obj;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new androidx.biometric.q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        androidx.fragment.app.v k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        z zVar = qVar.m0;
        zVar.f = nVar;
        int i7 = nVar.a;
        if (i7 == 0) {
            i7 = vVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
            zVar.g = n1.a();
        } else {
            zVar.g = vVar;
        }
        if (qVar.Q()) {
            qVar.m0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.m0.k = null;
        }
        if (qVar.Q() && new a0(new androidx.biometric.t(k10, 0)).c(ks.e4) != 0) {
            qVar.m0.n = true;
            qVar.S();
        } else if (qVar.m0.p) {
            qVar.l0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // fd.a
    public Object get() {
        o9.g firebaseApp = (o9.g) ((d9.o) this.b).a;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        p0 p0Var = p0.a;
        return p0.a(firebaseApp);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public float h(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.a;
        int i10 = (int) cVar.b;
        int i11 = (int) cVar2.a;
        int i12 = (int) cVar2.b;
        float y10 = y(i7, i10, i11, i12);
        float y11 = y((int) cVar2.a, i12, (int) cVar.a, i10);
        return Float.isNaN(y10) ? y11 / 7.0f : Float.isNaN(y11) ? y10 / 7.0f : (y10 + y11) / 14.0f;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void i(n6.a aVar) {
        h1 h1Var = (h1) this.b;
        h1Var.o.lock();
        try {
            h1Var.m = aVar;
            h1Var.j();
        } finally {
            h1Var.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void j(int i7) {
        h1 h1Var = (h1) this.b;
        Lock lock = h1Var.o;
        Lock lock2 = h1Var.o;
        lock.lock();
        try {
            if (h1Var.n) {
                h1Var.n = false;
                h1Var.b.j(i7);
                h1Var.m = null;
                h1Var.l = null;
            } else {
                h1Var.n = true;
                h1Var.d.onConnectionSuspended(i7);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.nt0
    public int j1() {
        i0.b bVar;
        bVar = ((h2) ((t) this.b)).mSystemInsets;
        return bVar.d;
    }

    @Override // fi.b9
    public boolean k(long j3, int i7, int i10, int i11, c9 c9Var) {
        ImageReceiver imageReceiver;
        b4 b4Var;
        b4 b4Var2;
        c9Var.b = null;
        c9Var.c = null;
        cv0 cv0Var = (cv0) this.b;
        wv0 wv0Var = cv0Var.h;
        ArrayList arrayList = cv0Var.x;
        if (cv0Var.O < 0.2f) {
            c9Var.b = wv0Var.getImageReceiver();
            c9Var.c = null;
            c9Var.a = wv0Var;
            c9Var.h = 0.0f;
            c9Var.i = g0.q.y;
            c9Var.g = (View) cv0Var.getParent();
            c9Var.d = cv0Var.E;
            c9Var.n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                imageReceiver = null;
                b4Var = null;
                b4Var2 = null;
                break;
            }
            b4 b4Var3 = (b4) arrayList.get(i12);
            if (b4Var3.e < 1.0f || b4Var3.a != i10) {
                i12++;
            } else {
                int i13 = i12 - 1;
                int i14 = i12 - 2;
                b4 d = ProfileStoriesView.d(i13 >= 0 ? (b4) arrayList.get(i13) : null, i14 >= 0 ? (b4) arrayList.get(i14) : null, b4Var3);
                imageReceiver = b4Var3.b;
                b4Var2 = d;
                b4Var = b4Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        c9Var.c = imageReceiver;
        c9Var.b = null;
        c9Var.a = cv0Var;
        c9Var.h = 0.0f;
        c9Var.i = g0.q.y;
        c9Var.g = (View) cv0Var.getParent();
        if (b4Var == null || b4Var2 == null) {
            c9Var.f = null;
            return true;
        }
        c9Var.f = new l6(this, new RectF(b4Var.m), b4Var, new RectF(b4Var2.m), b4Var2);
        return true;
    }

    @Override // b3.k
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        ((o2.d) this.b).a.y(iOException);
        return b3.p.e;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void m(Bundle bundle) {
        h1 h1Var = (h1) this.b;
        h1Var.o.lock();
        try {
            h1Var.m = n6.a.f;
            h1Var.j();
        } finally {
            h1Var.o.unlock();
        }
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mh0 B;
        boolean[] zArr = (boolean[]) this.b;
        if (!z10 || (B = imageReceiver.B()) == null || zArr[0]) {
            return;
        }
        B.N(0, false, false);
        g0.g3(new org.telegram.ui.Cells.p0(B, 0));
        zArr[0] = true;
    }

    @Override // d3.i0
    public void n() {
        d3.l lVar = (d3.l) this.b;
        if (lVar.s1 != null) {
            lVar.R0(0, 1);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((g6.j) this.b).c, "joinApplication", task);
    }

    @Override // d3.i0
    public void onFirstFrameRendered() {
        d3.l lVar = (d3.l) this.b;
        Surface surface = lVar.s1;
        if (surface != null) {
            lVar.c1.P(surface);
            lVar.v1 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        xa xaVar;
        xa xaVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) af.b.b(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        ob.c[] cVarArr = new ob.c[ports.length];
        for (int i7 = 0; i7 < ports.length; i7++) {
            InvocationHandler invocationHandler3 = ports[i7];
            ob.c cVar = new ob.c(17);
            cVar.b = (WebMessagePortBoundaryInterface) af.b.b(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i7] = cVar;
        }
        if (e5.k.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) af.b.b(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                xaVar = new xa(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    xaVar2 = null;
                    if (xaVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) af.b.b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((d5.a) this.b).i(webView, xaVar2, uri, z10, (e5.f) jsReplyProxyBoundaryInterface.getOrCreatePeer(new aa.s(jsReplyProxyBoundaryInterface, 1)));
                        return;
                    }
                    return;
                }
                xaVar = new xa(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            xaVar = new xa(webMessageBoundaryInterface.getData());
        }
        xaVar2 = xaVar;
        if (xaVar2 == null) {
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a2 a2Var;
        a1 b10;
        g6.a aVar = (g6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (m0.j) {
            Context context = aVar.a;
            j6.s sVar = aVar.f;
            m0 m0Var = new m0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i7 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i7 == 0) {
                if (!z10) {
                    return;
                }
                i7 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String v = p5.c.v(packageName, ".client_cast_analytics_data");
            m0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            o5.s.b(context);
            m0Var.g = o5.s.a().c(m5.a.e).a("CAST_SENDER_SDK", new l5.c("proto"), x.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i7 != 0) {
                com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
                b11.c = new u5(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 4);
                b11.d = new n6.c[]{y.c};
                b11.b = false;
                b11.a = 8426;
                Task e10 = sVar.e(0, b11.a());
                n nVar = new n();
                nVar.b = m0Var;
                nVar.c = packageName;
                nVar.a = i7;
                nVar.d = sharedPreferences;
                e10.addOnSuccessListener(nVar);
            }
            if (z10) {
                m.h(sharedPreferences);
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
                    m.h(a2Var.e);
                    m.h(a2Var.d);
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

    /* JADX WARN: Removed duplicated region for block: B:111:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05ee A[Catch: a | c -> 0x068b, TryCatch #1 {a | c -> 0x068b, blocks: (B:297:0x05d4, B:298:0x05ea, B:300:0x05ee, B:301:0x05f1, B:303:0x05f5, B:305:0x05ff, B:307:0x0605, B:312:0x060a), top: B:296:0x05d4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0 q(wf.b bVar) {
        int i7;
        ArrayList arrayList;
        hc.c cVar;
        hc.c cVar2;
        hc.c cVar3;
        float f10;
        float f11;
        hc.a aVar;
        float f12;
        float f13;
        float f14;
        int i10;
        int i11;
        bc.j[] jVarArr;
        bc.a aVar2;
        cc.b bVar2;
        int i12;
        cc.e eVar;
        int i13;
        a0 a0Var;
        List list;
        String str;
        int i14;
        boolean z10;
        double d;
        double abs;
        int i15;
        int i16;
        int i17;
        i iVar = (i) this.b;
        if (((cc.b) bVar.c) == null) {
            bVar.c = ((cc.g) bVar.b).a();
        }
        cc.b bVar3 = (cc.b) bVar.c;
        i iVar2 = new i(bVar3, 28);
        hc.e eVar2 = new hc.e(bVar3);
        int i18 = bVar3.b;
        int i19 = bVar3.a;
        int i20 = (i18 * 3) / 388;
        int i21 = 3;
        if (i20 < 3) {
            i20 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i22 = i20 - 1;
        int i23 = 0;
        boolean z11 = false;
        while (true) {
            char c11 = c10;
            int i24 = 1;
            i7 = i21;
            arrayList = eVar2.b;
            if (i22 >= i18 || z11) {
                break;
            }
            Arrays.fill(iArr, i23);
            int i25 = i23;
            while (i25 < i19) {
                if (bVar3.b(i25, i22)) {
                    if ((i23 & 1) == i24) {
                        i23++;
                    }
                    iArr[i23] = iArr[i23] + i24;
                    i15 = i18;
                } else if ((i23 & 1) != 0) {
                    i15 = i18;
                    iArr[i23] = iArr[i23] + 1;
                } else if (i23 == 4) {
                    if (!hc.e.b(iArr)) {
                        i15 = i18;
                        int i26 = i24;
                        iArr[0] = iArr[2];
                        iArr[i26] = iArr[i7];
                        iArr[2] = iArr[4];
                        iArr[i7] = i26;
                        iArr[4] = 0;
                    } else if (eVar2.c(i22, i25, iArr)) {
                        if (eVar2.c) {
                            z11 = eVar2.d();
                            i15 = i18;
                            i16 = 2;
                        } else {
                            if (arrayList.size() > i24) {
                                int size = arrayList.size();
                                int i27 = 0;
                                hc.c cVar4 = null;
                                while (true) {
                                    if (i27 >= size) {
                                        i15 = i18;
                                        i16 = 2;
                                        i17 = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i27);
                                    i27++;
                                    hc.c cVar5 = (hc.c) obj;
                                    i15 = i18;
                                    if (cVar5.d >= 2) {
                                        if (cVar4 != null) {
                                            eVar2.c = true;
                                            i16 = 2;
                                            i17 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                            break;
                                        }
                                        cVar4 = cVar5;
                                    }
                                    i18 = i15;
                                }
                            } else {
                                i15 = i18;
                                i17 = 0;
                                i16 = 2;
                            }
                            if (i17 > iArr[i16]) {
                                i22 += (i17 - r5) - 2;
                                i25 = i19 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i23 = 0;
                        i20 = i16;
                    } else {
                        i15 = i18;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i7];
                        iArr[2] = iArr[4];
                        iArr[i7] = 1;
                        iArr[4] = 0;
                    }
                    i23 = i7;
                } else {
                    i15 = i18;
                    int i28 = i23 + 1;
                    iArr[i28] = iArr[i28] + 1;
                    i23 = i28;
                }
                i25++;
                i18 = i15;
                i24 = 1;
            }
            int i29 = i18;
            if (hc.e.b(iArr) && eVar2.c(i22, i19, iArr)) {
                int i30 = iArr[0];
                if (eVar2.c) {
                    i20 = i30;
                    z11 = eVar2.d();
                } else {
                    i20 = i30;
                }
            }
            i22 += i20;
            c10 = c11;
            i21 = i7;
            i18 = i29;
            i23 = 0;
        }
        if (arrayList.size() < i7) {
            throw bc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((hc.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, hc.e.e);
        hc.c[] cVarArr = new hc.c[3];
        int i31 = 0;
        double d2 = Double.MAX_VALUE;
        for (int i32 = 2; i31 < arrayList.size() - i32; i32 = 2) {
            hc.c cVar6 = (hc.c) arrayList.get(i31);
            float f15 = cVar6.c;
            i31++;
            int i33 = i31;
            while (i33 < arrayList.size() - 1) {
                hc.c cVar7 = (hc.c) arrayList.get(i33);
                double e10 = hc.e.e(cVar6, cVar7);
                i33++;
                for (int i34 = i33; i34 < arrayList.size(); i34++) {
                    hc.c cVar8 = (hc.c) arrayList.get(i34);
                    if (cVar8.c <= 1.4f * f15) {
                        double e11 = hc.e.e(cVar7, cVar8);
                        double e12 = hc.e.e(cVar6, cVar8);
                        if (e10 < e11) {
                            if (e11 <= e12) {
                                e12 = e11;
                                e11 = e12;
                            } else if (e10 >= e12) {
                                d = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d2) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d2 = abs;
                                }
                            }
                            d = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d2) {
                            }
                        } else {
                            if (e11 >= e12) {
                                d = e12;
                                e12 = e11;
                            } else if (e10 < e12) {
                                d = e11;
                                e11 = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d2) {
                                }
                            } else {
                                d = e11;
                            }
                            e11 = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                }
            }
        }
        if (d2 == Double.MAX_VALUE) {
            throw bc.e.a();
        }
        float a10 = bc.j.a(cVarArr[0], cVarArr[1]);
        float a11 = bc.j.a(cVarArr[1], cVarArr[2]);
        float a12 = bc.j.a(cVarArr[0], cVarArr[2]);
        if (a11 >= a10 && a11 >= a12) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a12 < a11 || a12 < a10) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (e2.t(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            hc.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float h = iVar2.h(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float h7 = iVar2.h(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (h7 + h) / 2.0f;
        if (f23 < 1.0f) {
            throw bc.e.a();
        }
        float a13 = bc.j.a(cVar, cVar3) / f23;
        int i35 = (int) (a13 + (a13 < 0.0f ? -0.5f : 0.5f));
        float a14 = bc.j.a(cVar, cVar2) / f23;
        int i36 = (((int) (a14 + (a14 >= 0.0f ? 0.5f : -0.5f))) + i35) / 2;
        int i37 = i36 + 7;
        int i38 = i37 & 3;
        if (i38 == 0) {
            i37 = i36 + 8;
        } else if (i38 == 2) {
            i37 = i36 + 6;
        } else if (i38 == 3) {
            i37 = i36 + 5;
        }
        int i39 = i37;
        int[] iArr2 = gc.e.e;
        if (i39 % 4 != 1) {
            throw bc.c.a();
        }
        try {
            gc.e c12 = gc.e.c((i39 - 17) / 4);
            int i40 = 10;
            int i41 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i41);
                int z12 = (int) e2.z(f24, f18, f26, f18);
                int z13 = (int) e2.z(f25, f17, f26, f17);
                f10 = f18;
                for (int i42 = 4; i42 <= 16; i42 <<= 1) {
                    try {
                        aVar = iVar2.u(f23, i42, z12, z13);
                        break;
                    } catch (bc.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i39 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            cc.i a15 = cc.i.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            hc.a aVar3 = aVar;
            float f35 = a15.e;
            float f36 = a15.i;
            float f37 = f35 * f36;
            float f38 = a15.f;
            float f39 = a15.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a15.g;
            float f42 = f38 * f41;
            float f43 = a15.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a15.c;
            float f47 = f46 * f39;
            float f48 = a15.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a15.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            cc.i a16 = cc.i.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a16.a;
            float f57 = a16.d;
            float f58 = a16.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a16.b;
            float f63 = a16.e;
            float f64 = a16.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a16.c;
            float f69 = a16.f;
            float f70 = a16.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i39 <= 0 || i39 <= 0) {
                throw bc.e.a();
            }
            cc.b bVar4 = new cc.b(i39, i39);
            int i43 = i39 * 2;
            hc.c cVar10 = cVar;
            float[] fArr = new float[i43];
            int i44 = 0;
            while (i44 < i39) {
                int i45 = i39;
                float f74 = i44 + 0.5f;
                int i46 = 0;
                while (i46 < i43) {
                    int i47 = i46;
                    fArr[i47] = (i47 / 2) + 0.5f;
                    fArr[i47 + 1] = f74;
                    i46 = i47 + 2;
                }
                int i48 = i43 - 1;
                hc.c cVar11 = cVar2;
                int i49 = 0;
                while (i49 < i48) {
                    float f75 = fArr[i49];
                    int i50 = i49 + 1;
                    int i51 = i49;
                    float f76 = fArr[i50];
                    hc.c cVar12 = cVar3;
                    float e13 = p5.c.e(f72, f76, f71 * f75, f73);
                    fArr[i51] = (((f60 * f76) + (f59 * f75)) + f61) / e13;
                    fArr[i50] = (((f76 * f66) + (f75 * f65)) + f67) / e13;
                    i49 = i51 + 2;
                    cVar3 = cVar12;
                }
                hc.c cVar13 = cVar3;
                int i52 = bVar3.b;
                float f77 = f72;
                int i53 = 0;
                boolean z14 = true;
                while (i53 < i48 && z14) {
                    int i54 = (int) fArr[i53];
                    int i55 = i53 + 1;
                    int i56 = i48;
                    int i57 = (int) fArr[i55];
                    int i58 = i53;
                    if (i54 < -1 || i54 > i19 || i57 < -1 || i57 > i52) {
                        throw bc.e.a();
                    }
                    if (i54 == -1) {
                        fArr[i58] = 0.0f;
                    } else if (i54 == i19) {
                        fArr[i58] = i19 - 1;
                    } else {
                        z10 = false;
                        if (i57 != -1) {
                            fArr[i55] = 0.0f;
                        } else if (i57 == i52) {
                            fArr[i55] = i52 - 1;
                        } else {
                            z14 = z10;
                            i53 = i58 + 2;
                            i48 = i56;
                        }
                        z14 = true;
                        i53 = i58 + 2;
                        i48 = i56;
                    }
                    z10 = true;
                    if (i57 != -1) {
                    }
                    z14 = true;
                    i53 = i58 + 2;
                    i48 = i56;
                }
                int i59 = i43 - 2;
                boolean z15 = true;
                while (i59 >= 0 && z15) {
                    int i60 = (int) fArr[i59];
                    int i61 = i59 + 1;
                    int i62 = i59;
                    int i63 = (int) fArr[i61];
                    if (i60 < -1 || i60 > i19 || i63 < -1 || i63 > i52) {
                        throw bc.e.a();
                    }
                    if (i60 == -1) {
                        fArr[i62] = 0.0f;
                    } else if (i60 == i19) {
                        fArr[i62] = i19 - 1;
                    } else {
                        z15 = false;
                        if (i63 != -1) {
                            fArr[i61] = 0.0f;
                        } else if (i63 == i52) {
                            fArr[i61] = i52 - 1;
                        } else {
                            i59 = i62 - 2;
                        }
                        z15 = true;
                        i59 = i62 - 2;
                    }
                    z15 = true;
                    if (i63 != -1) {
                    }
                    z15 = true;
                    i59 = i62 - 2;
                }
                for (int i64 = 0; i64 < i43; i64 += 2) {
                    try {
                        if (bVar3.b((int) fArr[i64], (int) fArr[i64 + 1])) {
                            bVar4.c(i64 / 2, i44);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw bc.e.a();
                    }
                }
                i44++;
                i39 = i45;
                cVar2 = cVar11;
                f72 = f77;
                cVar3 = cVar13;
            }
            hc.c cVar14 = cVar2;
            hc.c cVar15 = cVar3;
            if (aVar3 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new bc.j[]{cVar14, cVar10, cVar15};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new bc.j[]{cVar14, cVar10, cVar15, aVar3};
            }
            bc.j[] jVarArr2 = jVarArr;
            iVar.getClass();
            ab.q qVar = new ab.q();
            int i65 = bVar4.b;
            if (i65 < 21 || (i65 & i11) != i10) {
                throw bc.c.a();
            }
            qVar.b = bVar4;
            try {
                eVar = iVar.t(qVar);
            } catch (bc.a e14) {
                aVar2 = e14;
                e = null;
                try {
                    qVar.x();
                    qVar.c = null;
                    qVar.d = null;
                    qVar.a = true;
                    qVar.w();
                    qVar.v();
                    bVar2 = (cc.b) qVar.b;
                    i12 = 0;
                    while (i12 < bVar2.a) {
                        int i66 = i12 + 1;
                        for (int i67 = i66; i67 < bVar2.b; i67++) {
                            if (bVar2.b(i12, i67) != bVar2.b(i67, i12)) {
                                bVar2.a(i67, i12);
                                bVar2.a(i12, i67);
                            }
                        }
                        i12 = i66;
                    }
                    cc.e t6 = iVar.t(qVar);
                    t6.h = new qb.a(i40);
                    eVar = t6;
                    i13 = eVar.a;
                    if (e2.s((qb.a) eVar.h)) {
                        bc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    a0Var = new a0((String) eVar.d, jVarArr2);
                    list = (List) eVar.f;
                    if (list != null) {
                    }
                    str = (String) eVar.e;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        a0Var.q(bc.i.d, Integer.valueOf(i14));
                        a0Var.q(bc.i.e, Integer.valueOf(i13));
                    }
                    a0Var.q(bc.i.c, (Integer) eVar.g);
                    a0Var.q(bc.i.f, "]Q" + eVar.c);
                    return a0Var;
                } catch (bc.a | bc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (bc.c e15) {
                e = e15;
                aVar2 = null;
                qVar.x();
                qVar.c = null;
                qVar.d = null;
                qVar.a = true;
                qVar.w();
                qVar.v();
                bVar2 = (cc.b) qVar.b;
                i12 = 0;
                while (i12 < bVar2.a) {
                }
                cc.e t62 = iVar.t(qVar);
                t62.h = new qb.a(i40);
                eVar = t62;
                i13 = eVar.a;
                if (e2.s((qb.a) eVar.h)) {
                }
                a0Var = new a0((String) eVar.d, jVarArr2);
                list = (List) eVar.f;
                if (list != null) {
                }
                str = (String) eVar.e;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                a0Var.q(bc.i.c, (Integer) eVar.g);
                a0Var.q(bc.i.f, "]Q" + eVar.c);
                return a0Var;
            }
            i13 = eVar.a;
            if (e2.s((qb.a) eVar.h) && jVarArr2.length >= 3) {
                bc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            a0Var = new a0((String) eVar.d, jVarArr2);
            list = (List) eVar.f;
            if (list != null) {
                a0Var.q(bc.i.a, list);
            }
            str = (String) eVar.e;
            if (str != null) {
                a0Var.q(bc.i.b, str);
            }
            if (i13 >= 0 && (i14 = eVar.b) >= 0) {
                a0Var.q(bc.i.d, Integer.valueOf(i14));
                a0Var.q(bc.i.e, Integer.valueOf(i13));
            }
            a0Var.q(bc.i.c, (Integer) eVar.g);
            a0Var.q(bc.i.f, "]Q" + eVar.c);
            return a0Var;
        } catch (IllegalArgumentException unused4) {
            throw bc.c.a();
        }
    }

    @Override // d3.i0
    public void r() {
        l2.i0 i0Var = ((d3.l) this.b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x033e, code lost:
    
        throw bc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a1 A[LOOP:21: B:146:0x022c->B:175:0x03a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0367 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cc.e t(ab.q qVar) {
        int f10;
        gc.d dVar;
        gc.b bVar;
        int i7;
        int f11;
        gc.e w10 = qVar.w();
        gc.b bVar2 = qVar.v().a;
        gc.c v = qVar.v();
        gc.e w11 = qVar.w();
        int i10 = p1.g.d(8)[v.b];
        cc.b bVar3 = (cc.b) qVar.b;
        int i11 = bVar3.b;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                if (e2.b(i10, i13, i14)) {
                    bVar3.a(i14, i13);
                }
            }
        }
        int i15 = w11.a * 4;
        int i16 = i15 + 17;
        int i17 = w11.d;
        cc.b bVar4 = new cc.b(i16, i16);
        bVar4.d(0, 0, 9, 9);
        int i18 = i15 + 9;
        bVar4.d(i18, 0, 8, 9);
        bVar4.d(0, i18, 9, 8);
        int[] iArr = w11.b;
        int length = iArr.length;
        int i19 = 0;
        while (i19 < length) {
            int i20 = iArr[i19] - 2;
            for (int i21 = i12; i21 < length; i21++) {
                if ((i19 != 0 || (i21 != 0 && i21 != length - 1)) && (i19 != length - 1 || i21 != 0)) {
                    bVar4.d(iArr[i21] - 2, i20, 5, 5);
                }
            }
            i19++;
            i12 = 0;
        }
        int i22 = 2;
        int i23 = 6;
        int i24 = 1;
        bVar4.d(6, 9, 1, i15);
        bVar4.d(9, 6, i15, 1);
        if (w11.a > 6) {
            int i25 = i15 + 6;
            bVar4.d(i25, 0, 3, 6);
            bVar4.d(0, i25, 6, 3);
        }
        byte[] bArr = new byte[i17];
        int i26 = i11 - 1;
        int i27 = i26;
        boolean z10 = true;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (i27 > 0) {
            if (i27 == i23) {
                i27--;
            }
            int i31 = 0;
            while (i31 < i11) {
                int i32 = z10 ? i26 - i31 : i31;
                int i33 = i24;
                int i34 = 0;
                for (int i35 = i22; i34 < i35; i35 = 2) {
                    int i36 = i27 - i34;
                    if (!bVar4.b(i36, i32)) {
                        i29++;
                        i30 <<= 1;
                        if (bVar3.b(i36, i32)) {
                            i30 |= 1;
                        }
                        if (i29 == 8) {
                            bArr[i28] = (byte) i30;
                            i28++;
                            i29 = 0;
                            i30 = 0;
                        }
                    }
                    i34++;
                }
                i31++;
                i24 = i33;
                i22 = 2;
            }
            z10 = !z10;
            i27 -= 2;
            i23 = 6;
            i22 = 2;
        }
        int i37 = i24;
        if (i28 != i17) {
            throw bc.c.a();
        }
        if (i17 != w10.d) {
            throw new IllegalArgumentException();
        }
        b3.j jVar = w10.c[bVar2.ordinal()];
        r0[] r0VarArr = (r0[]) jVar.c;
        int i38 = jVar.b;
        int i39 = 0;
        for (r0 r0Var : r0VarArr) {
            i39 += r0Var.a;
        }
        ca.n[] nVarArr = new ca.n[i39];
        int i40 = 0;
        for (r0 r0Var2 : r0VarArr) {
            int i41 = 0;
            while (i41 < r0Var2.a) {
                int i42 = r0Var2.b;
                nVarArr[i40] = new ca.n(i42, new byte[i38 + i42]);
                i41++;
                i40++;
            }
        }
        int length2 = nVarArr[0].b.length;
        int i43 = i39 - 1;
        while (i43 >= 0 && nVarArr[i43].b.length != length2) {
            i43--;
        }
        int i44 = i43 + 1;
        int i45 = length2 - i38;
        int i46 = 0;
        int i47 = 0;
        while (i46 < i45) {
            int i48 = i47;
            int i49 = 0;
            while (i49 < i40) {
                nVarArr[i49].b[i46] = bArr[i48];
                i49++;
                i48++;
            }
            i46++;
            i47 = i48;
        }
        int i50 = i44;
        while (i50 < i40) {
            nVarArr[i50].b[i45] = bArr[i47];
            i50++;
            i47++;
        }
        boolean z11 = false;
        int length3 = nVarArr[0].b.length;
        while (i45 < length3) {
            int i51 = i47;
            int i52 = 0;
            while (i52 < i40) {
                nVarArr[i52].b[i52 < i44 ? i45 : i45 + 1] = bArr[i51];
                i52++;
                i51++;
            }
            i45++;
            i47 = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i39; i54++) {
            i53 += nVarArr[i54].a;
        }
        byte[] bArr2 = new byte[i53];
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        while (i55 < i39) {
            ca.n nVar = nVarArr[i55];
            byte[] bArr3 = nVar.b;
            int i58 = nVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i59 = 0; i59 < length4; i59++) {
                iArr2[i59] = bArr3[i59] & 255;
            }
            try {
                int F = ((ob.c) this.b).F(iArr2, bArr3.length - i58);
                for (int i60 = 0; i60 < i58; i60++) {
                    bArr3[i60] = (byte) iArr2[i60];
                }
                i56 += F;
                int i61 = i57;
                int i62 = 0;
                while (i62 < i58) {
                    bArr2[i61] = bArr3[i62];
                    i62++;
                    i61++;
                }
                i55++;
                i57 = i61;
            } catch (ec.c unused) {
                bc.a aVar = bc.a.c;
                if (bc.h.a) {
                    throw new bc.a();
                }
                throw bc.a.c;
            }
        }
        char[] cArr = gc.a.a;
        cc.c cVar = new cc.c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i37);
        int i63 = -1;
        int i64 = -1;
        boolean z12 = false;
        boolean z13 = false;
        cc.d dVar2 = null;
        while (true) {
            try {
                int d = cVar.d();
                gc.d dVar3 = gc.d.c;
                if (d < 4 || (f10 = cVar.f(4)) == 0) {
                    dVar = dVar3;
                } else if (f10 == 1) {
                    dVar = gc.d.d;
                } else if (f10 == 2) {
                    dVar = gc.d.e;
                } else if (f10 == 3) {
                    dVar = gc.d.f;
                } else if (f10 == 4) {
                    dVar = gc.d.h;
                } else if (f10 == 5) {
                    dVar = gc.d.s;
                } else if (f10 == 7) {
                    dVar = gc.d.n;
                } else if (f10 == 8) {
                    dVar = gc.d.r;
                } else if (f10 == 9) {
                    dVar = gc.d.w;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = gc.d.x;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        bVar = bVar2;
                        i7 = 1;
                        if (cVar.d() < 16) {
                            throw bc.c.a();
                        }
                        int f12 = cVar.f(8);
                        i64 = cVar.f(8);
                        i63 = f12;
                    } else if (ordinal == 5) {
                        bVar = bVar2;
                        i7 = 1;
                        int f13 = cVar.f(8);
                        if ((f13 & 128) == 0) {
                            f11 = f13 & ks.L1;
                        } else if ((f13 & ks.W2) == 128) {
                            f11 = ((f13 & 63) << 8) | cVar.f(8);
                        } else {
                            if ((f13 & ks.B3) != 192) {
                                throw bc.c.a();
                            }
                            f11 = ((f13 & 31) << 16) | cVar.f(16);
                        }
                        HashMap hashMap = cc.d.c;
                        if (f11 < 0 || f11 >= 900) {
                            break;
                        }
                        dVar2 = (cc.d) cc.d.c.get(Integer.valueOf(f11));
                        if (dVar2 == null) {
                            throw bc.c.a();
                        }
                    } else if (ordinal == 7) {
                        bVar = bVar2;
                        i7 = 1;
                        z12 = true;
                        z11 = true;
                    } else if (ordinal == 8) {
                        bVar = bVar2;
                        i7 = 1;
                        z12 = true;
                        z13 = true;
                    } else if (ordinal != 9) {
                        int f14 = cVar.f(dVar.a(w10));
                        int ordinal2 = dVar.ordinal();
                        bVar = bVar2;
                        if (ordinal2 == 1) {
                            gc.a.e(cVar, sb2, f14);
                        } else if (ordinal2 == 2) {
                            gc.a.a(cVar, sb2, f14, z12);
                        } else if (ordinal2 == 4) {
                            gc.a.b(cVar, sb2, f14, dVar2, arrayList);
                        } else {
                            if (ordinal2 != 6) {
                                throw bc.c.a();
                            }
                            gc.a.d(cVar, sb2, f14);
                        }
                    } else {
                        bVar = bVar2;
                        int f15 = cVar.f(4);
                        int f16 = cVar.f(dVar.a(w10));
                        i7 = 1;
                        if (f15 == 1) {
                            gc.a.c(cVar, sb2, f16);
                        }
                    }
                    if (dVar != dVar3) {
                        if (dVar2 != null) {
                            i7 = z11 ? 4 : z13 ? 6 : 2;
                        } else if (z11) {
                            i7 = 3;
                        } else if (z13) {
                            i7 = 5;
                        }
                        String sb3 = sb2.toString();
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        String obj = bVar.toString();
                        cc.e eVar = new cc.e();
                        eVar.d = sb3;
                        eVar.f = arrayList;
                        eVar.e = obj;
                        eVar.a = i64;
                        eVar.b = i63;
                        eVar.c = i7;
                        eVar.g = Integer.valueOf(i56);
                        return eVar;
                    }
                    bVar2 = bVar;
                } else {
                    bVar = bVar2;
                }
                i7 = 1;
                if (dVar != dVar3) {
                }
            } catch (IllegalArgumentException unused2) {
                throw bc.c.a();
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q4.q qVar = (q4.q) this.b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.p pVar = (aa.p) qVar.c;
        aa.p pVar2 = (aa.p) qVar.c;
        aa.p.b(pVar);
        pVar2.m.h(null, pVar2.e.a);
        pVar2.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public hc.a u(float f10, float f11, int i7, int i10) {
        hc.a b10;
        hc.a b11;
        int i11 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i11);
        cc.b bVar = (cc.b) this.b;
        int min = Math.min(bVar.a - 1, i7 + i11) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw bc.e.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar.b - 1, i10 + i11) - max2;
        if (min2 < f12) {
            throw bc.e.a();
        }
        cc.b bVar2 = (cc.b) this.b;
        hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
        int i12 = bVar3.e;
        int i13 = bVar3.c;
        int i14 = i12 + i13;
        int i15 = bVar3.f;
        int i16 = (i15 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (i19 < i14 && !bVar2.b(i19, i18)) {
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar2.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i18, i19, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i18, i14, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw bc.e.a();
        }
        return (hc.a) arrayList.get(0);
    }

    public f3.j v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (f3.j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j3 = 0;
        for (int[] iArr2 : iArr) {
            j3 += iArr2.length;
        }
        int i7 = (int) j3;
        la.d(j3, "the total number of elements (%s) in the arrays must fit in an int", j3 == ((long) i7));
        int[] iArr3 = new int[i7];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new f3.j(iArr3, c8.l1.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), c8.l1.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), c8.l1.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void w(int i7) {
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        o0 o0Var = ((ci.j0) this.b).e;
        if (o0Var == null || o0Var.d == i7) {
            return;
        }
        if (o0Var.c.d && i7 == 2) {
            i7 = 1;
        }
        o0Var.d = i7;
        o0Var.f().edit().putBoolean("qrNoPaidPermanent", o0Var.d == 2).apply();
        int i10 = o0Var.d;
        if (i10 == 0) {
            if (o0Var.n != 0) {
                ConnectionsManager.getInstance(o0Var.a).cancelRequest(o0Var.n, true);
                o0Var.n = 0;
                return;
            }
            return;
        }
        if (i10 == 2 && (c10 = o0Var.c()) != null) {
            o0Var.f = c10;
            o0Var.b.setFreeLink(o0Var.d(c10));
        }
        o0Var.n(false, o0Var.d == 1);
    }

    public float x(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        i iVar;
        int i19;
        int i20 = 1;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z10) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = 2;
        int i22 = (-abs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i21;
                break;
            }
            int i29 = z10 ? i27 : i26;
            int i30 = z10 ? i26 : i27;
            boolean z11 = z10;
            if (i28 == i20) {
                i18 = i20;
                i19 = abs;
                iVar = this;
            } else {
                i18 = 0;
                iVar = this;
                i19 = abs;
            }
            if (i18 == ((cc.b) iVar.b).b(i29, i30)) {
                if (i28 == 2) {
                    return w9.b(i26, i27, i13, i14);
                }
                i28++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i17 = 2;
                    break;
                }
                i27 += i24;
                i22 -= i19;
            }
            i26 += i23;
            abs = i19;
            z10 = z11;
            i20 = 1;
            i21 = 2;
        }
        if (i28 == i17) {
            return w9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    public float y(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.b;
        float x10 = x(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i7) / (i13 - i7);
                int i16 = i15 - 1;
                f10 = f12;
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i10;
        int i17 = (int) (f13 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f13 / (i10 - i17);
        } else {
            int i18 = bVar.b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (x(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + x10) - 1.0f;
    }

    @Override // b3.k
    public void z(b3.m mVar, long j3, long j10) {
        boolean z10;
        o2.d dVar = (o2.d) this.b;
        synchronized (c3.b.b) {
            z10 = c3.b.c;
        }
        if (z10) {
            dVar.b();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    public i(f0 f0Var) {
        this.a = 9;
        this.b = new WeakReference(f0Var);
    }

    public /* synthetic */ i(e7.a aVar, v vVar) {
        this.a = 16;
        this.b = vVar;
    }

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public i(int i7) {
        this.a = i7;
        switch (i7) {
            case 17:
                this.b = new LinkedHashMap();
                break;
            case 20:
                this.b = new i(26);
                break;
            case 26:
                this.b = new ob.c(ec.a.h, 18);
                break;
            default:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    public i(Context context) {
        String e10;
        this.a = 0;
        b a10 = b.a(context);
        this.b = a10;
        a10.b();
        String e11 = a10.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = a10.e(b.f("googleSignInOptions", e11))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e10);
        } catch (JSONException unused) {
        }
    }

    public i(LaunchActivity launchActivity, Executor executor, a8.m1 m1Var) {
        this.a = 2;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s5 = launchActivity.s();
            z zVar = (z) new a0(launchActivity).j(z.class);
            this.b = s5;
            zVar.d = executor;
            zVar.e = m1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // d3.i0
    public void a(x1 x1Var) {
    }

    @Override // fi.b9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // b3.k
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
    }

    @Override // b3.k
    public /* synthetic */ void s(b3.m mVar, long j3, long j10, int i7) {
    }
}
