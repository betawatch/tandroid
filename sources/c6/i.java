package c6;

import a3.q;
import a9.w0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.f0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import bi.o0;
import c3.j0;
import ci.l6;
import ci.r6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.a2;
import d2.t0;
import d5.o;
import e6.e0;
import ei.l4;
import ei.n9;
import ei.o3;
import ei.o9;
import g.s;
import g9.g1;
import gi.x9;
import i6.n;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k2.l0;
import l.w;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nv0;
import org.telegram.ui.tu0;
import p6.m;
import tg.h1;
import tg.k0;
import ug.k1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements a0, androidx.activity.result.b, a3.k, j0, p, eo0, p0, o, fb.b, qe.b, n9, OnCompleteListener, w, n, g1, z80, k1 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public i(d0 d0Var) {
        this.a = 12;
        this.b = new WeakReference(d0Var);
    }

    public static synchronized i D(Context context) {
        i H;
        synchronized (i.class) {
            H = H(context.getApplicationContext());
        }
        return H;
    }

    public static synchronized i H(Context context) {
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

    public static com.google.android.gms.common.api.internal.o x(Looper looper, Object obj, String str) {
        m.h(obj, "Listener must not be null");
        m.h(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.o(looper, obj, str);
    }

    public void A() {
        ((u) this.b).d.R();
    }

    public void B(int i3) {
        TLRPC.TL_exportedNoPaidMessagesToken c2;
        o0 o0Var = ((bi.j0) this.b).e;
        if (o0Var == null || o0Var.d == i3) {
            return;
        }
        if (o0Var.c.d && i3 == 2) {
            i3 = 1;
        }
        o0Var.d = i3;
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
        if (i10 == 2 && (c2 = o0Var.c()) != null) {
            o0Var.f = c2;
            o0Var.b.setFreeLink(o0Var.d(c2));
        }
        o0Var.n(false, o0Var.d == 1);
    }

    public void C() {
        d0 d0Var = (d0) ((WeakReference) this.b).get();
        if (d0Var == null) {
            return;
        }
        d0Var.k();
    }

    @Override // org.telegram.ui.Components.eo0
    public void C0() {
        ac k10 = ((l6) this.b).k().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // l.w
    public boolean E(l.k kVar) {
        Window.Callback callback = ((s) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(hs.t1, kVar);
        return true;
    }

    @Override // qe.b
    public void F(float f10, int i3) {
        dh.o oVar = (dh.o) this.b;
        oVar.c.setLayerType(0, null);
        if (f10 == 0.0f && !oVar.P) {
            oVar.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.F.setFocusableInTouchMode(false);
            }
        }
        hs.e().k(hs.k1, 512);
    }

    public synchronized void G() {
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

    public void I(IBinder iBinder) {
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

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((dh.o) this.b).j0(f10);
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public void a(m6.a aVar) {
        com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.b;
        g1Var.o.lock();
        try {
            g1Var.m = aVar;
            g1Var.j();
        } finally {
            g1Var.o.unlock();
        }
    }

    @Override // c3.j0
    public void a0() {
        c3.l lVar = (c3.l) this.b;
        if (lVar.s1 != null) {
            lVar.R0(0, 1);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                n8.a aVar = (n8.a) this.b;
                c8.d dVar = new c8.d(0, (TaskCompletionSource) obj2);
                c8.c cVar = (c8.c) ((c8.f) obj).m();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i3 = c8.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.H0(obtain, 2);
                break;
            default:
                i6.w wVar = (i6.w) obj;
                i6.f fVar = (i6.f) wVar.m();
                e6.d0 d0Var = ((e0) this.b).l;
                Parcel P0 = fVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, d0Var);
                fVar.U0(P0, 18);
                i6.f fVar2 = (i6.f) wVar.m();
                fVar2.U0(fVar2.P0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
        }
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
        ((s) this.b).h(kVar);
    }

    @Override // d5.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) xe.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public void d(int i3) {
        com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.b;
        Lock lock = g1Var.o;
        Lock lock2 = g1Var.o;
        lock.lock();
        try {
            if (g1Var.n) {
                g1Var.n = false;
                g1Var.b.d(i3);
                g1Var.m = null;
                g1Var.l = null;
            } else {
                g1Var.n = true;
                g1Var.d.onConnectionSuspended(i3);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // androidx.activity.result.b
    public void g(Object obj) {
        switch (this.a) {
            case 4:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i3 = f0Var.b;
                    androidx.fragment.app.s n4 = j0Var.c.n(str);
                    if (n4 != null) {
                        n4.x(i3, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.a;
                if (i11 != -1 || i10 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // cd.a
    public Object get() {
        n9.h firebaseApp = (n9.h) ((e.a) this.b).a;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        db.p0 p0Var = db.p0.a;
        return db.p0.a(firebaseApp);
    }

    @Override // d5.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) xe.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // a3.k
    public void h(a3.m mVar, long j10, long j11) {
        boolean z10;
        n2.d dVar = (n2.d) this.b;
        synchronized (b3.b.b) {
            z10 = b3.b.c;
        }
        if (z10) {
            dVar.b();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // i6.n
    public void i(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.b;
        try {
            nVar.a(new g6.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            i6.b bVar = g6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((g6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // c3.j0
    public void i0() {
        l0 l0Var = ((c3.l) this.b).Z;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override // ei.n9
    public boolean j(long j10, int i3, int i10, int i11, o9 o9Var) {
        ImageReceiver imageReceiver;
        l4 l4Var;
        l4 l4Var2;
        o9Var.b = null;
        o9Var.c = null;
        tu0 tu0Var = (tu0) this.b;
        nv0 nv0Var = tu0Var.h;
        ArrayList arrayList = tu0Var.x;
        if (tu0Var.O < 0.2f) {
            o9Var.b = nv0Var.getImageReceiver();
            o9Var.c = null;
            o9Var.a = nv0Var;
            o9Var.h = 0.0f;
            o9Var.i = g0.q.y;
            o9Var.g = (View) tu0Var.getParent();
            o9Var.d = tu0Var.E;
            o9Var.n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                imageReceiver = null;
                l4Var = null;
                l4Var2 = null;
                break;
            }
            l4 l4Var3 = (l4) arrayList.get(i12);
            if (l4Var3.e < 1.0f || l4Var3.a != i10) {
                i12++;
            } else {
                int i13 = i12 - 1;
                int i14 = i12 - 2;
                l4 d = ProfileStoriesView.d(i13 >= 0 ? (l4) arrayList.get(i13) : null, i14 >= 0 ? (l4) arrayList.get(i14) : null, l4Var3);
                imageReceiver = l4Var3.b;
                l4Var2 = d;
                l4Var = l4Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        o9Var.c = imageReceiver;
        o9Var.b = null;
        o9Var.a = tu0Var;
        o9Var.h = 0.0f;
        o9Var.i = g0.q.y;
        o9Var.g = (View) tu0Var.getParent();
        if (l4Var == null || l4Var2 == null) {
            o9Var.f = null;
            return true;
        }
        o9Var.f = new r6(this, new RectF(l4Var.m), l4Var, new RectF(l4Var2.m), l4Var2);
        return true;
    }

    @Override // a3.k
    public a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        ((n2.d) this.b).a.y(iOException);
        return q.e;
    }

    @Override // g9.g1
    public Object l(Object obj, Object obj2) {
        return ((f9.k) this.b).apply(obj2);
    }

    @Override // d5.o
    public String[] m() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // org.telegram.ui.Components.z80
    public Paint.FontMetricsInt n() {
        return ((gi.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.b;
        g1Var.o.lock();
        try {
            g1Var.m = m6.a.f;
            g1Var.j();
        } finally {
            g1Var.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        f6.c.h((f6.c) ((f6.j) this.b).c, "launchApplication", task);
    }

    @Override // c3.j0
    public void onFirstFrameRendered() {
        c3.l lVar = (c3.l) this.b;
        Surface surface = lVar.s1;
        if (surface != null) {
            lVar.c1.y(surface);
            lVar.v1 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // i6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(String str, long j10, int i3, Object obj, long j11, long j12) {
        int i10;
        Iterator it;
        g6.n nVar = (g6.n) this.b;
        try {
            i10 = i3;
            try {
                Status status = new Status(i10, null, null, null);
                Object obj2 = true == (obj instanceof i6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                nVar.a(new g6.m(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                i6.b bVar = g6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = nVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i10 = i3;
        }
        it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((g6.g) it.next()).h(str, j10, i10, j11, j12);
            i10 = i3;
        }
    }

    @Override // ei.n9
    public void r(long j10, int i3, o3 o3Var) {
        tu0 tu0Var = (tu0) this.b;
        int i10 = ProfileStoriesView.t0;
        tu0Var.f(true, false);
        o3Var.run();
    }

    @Override // ug.k1
    public void s(float f10) {
        x9 x9Var = (x9) this.b;
        k0.e(x9Var.p1).k(String.valueOf(tg.h.a.indexOf(x9Var.y0.getCurrentBrush())), f10);
        h1 h1Var = x9Var.k1;
        h1Var.c = f10;
        x9Var.B0(h1Var, null, false);
    }

    @Override // org.telegram.ui.Components.z80
    public void t(int i3, int i10, CharSequence charSequence, boolean z10) {
        gi.g gVar = ((gi.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i3, i10 + i3, charSequence);
            if (z10) {
                i6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i3 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public void u(StringBuilder sb2, Iterator it) {
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(com.google.android.gms.internal.clearcut.e.d(entry.getKey()));
            sb2.append("=");
            sb2.append(com.google.android.gms.internal.clearcut.e.d(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) eVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(com.google.android.gms.internal.clearcut.e.d(entry2.getKey()));
                sb2.append("=");
                sb2.append(com.google.android.gms.internal.clearcut.e.d(entry2.getValue()));
            }
        }
    }

    @Override // androidx.lifecycle.a0
    public void v(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
        Handler handler = g0Var.B0;
        a3.o oVar = g0Var.C0;
        handler.removeCallbacks(oVar);
        TextView textView = g0Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(oVar, 2000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw yb.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e2.q y(b4.n nVar) {
        int f10;
        dc.d dVar;
        dc.b bVar;
        int i3;
        int i10;
        zb.c cVar;
        int f11;
        dc.e x10 = nVar.x();
        dc.b bVar2 = nVar.w().a;
        dc.c w10 = nVar.w();
        dc.e x11 = nVar.x();
        int i11 = o1.g.d(8)[w10.b];
        zb.b bVar3 = (zb.b) nVar.b;
        int i12 = bVar3.b;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                if (com.google.android.recaptcha.internal.a.b(i11, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = x11.a * 4;
        int i17 = i16 + 17;
        int i18 = x11.d;
        zb.b bVar4 = new zb.b(i17, i17);
        bVar4.d(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar4.d(i19, 0, 8, 9);
        bVar4.d(0, i19, 9, 8);
        int[] iArr = x11.b;
        int length = iArr.length;
        int i20 = 0;
        while (i20 < length) {
            int i21 = iArr[i20] - 2;
            for (int i22 = i13; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar4.d(iArr[i22] - 2, i21, 5, 5);
                }
            }
            i20++;
            i13 = 0;
        }
        int i23 = 2;
        int i24 = 6;
        int i25 = 1;
        bVar4.d(6, 9, 1, i16);
        bVar4.d(9, 6, i16, 1);
        if (x11.a > 6) {
            int i26 = i16 + 6;
            bVar4.d(i26, 0, 3, 6);
            bVar4.d(0, i26, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i27 = i12 - 1;
        int i28 = i27;
        boolean z10 = true;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i28 > 0) {
            if (i28 == i24) {
                i28--;
            }
            int i32 = 0;
            while (i32 < i12) {
                int i33 = z10 ? i27 - i32 : i32;
                int i34 = i25;
                int i35 = 0;
                for (int i36 = i23; i35 < i36; i36 = 2) {
                    int i37 = i28 - i35;
                    if (!bVar4.b(i37, i33)) {
                        i30++;
                        i31 <<= 1;
                        if (bVar3.b(i37, i33)) {
                            i31 |= 1;
                        }
                        if (i30 == 8) {
                            bArr[i29] = (byte) i31;
                            i29++;
                            i30 = 0;
                            i31 = 0;
                        }
                    }
                    i35++;
                }
                i32++;
                i25 = i34;
                i23 = 2;
            }
            z10 = !z10;
            i28 -= 2;
            i24 = 6;
            i23 = 2;
        }
        int i38 = i25;
        if (i29 != i18) {
            throw yb.c.a();
        }
        if (i18 != x10.d) {
            throw new IllegalArgumentException();
        }
        e5.u uVar = x10.c[bVar2.ordinal()];
        t0[] t0VarArr = (t0[]) uVar.c;
        int i39 = uVar.b;
        int i40 = 0;
        for (t0 t0Var : t0VarArr) {
            i40 += t0Var.a;
        }
        ba.n[] nVarArr = new ba.n[i40];
        int i41 = 0;
        for (t0 t0Var2 : t0VarArr) {
            int i42 = 0;
            while (i42 < t0Var2.a) {
                int i43 = t0Var2.b;
                nVarArr[i41] = new ba.n(i43, new byte[i39 + i43]);
                i42++;
                i41++;
            }
        }
        int length2 = nVarArr[0].b.length;
        int i44 = i40 - 1;
        while (i44 >= 0 && nVarArr[i44].b.length != length2) {
            i44--;
        }
        int i45 = i44 + 1;
        int i46 = length2 - i39;
        int i47 = 0;
        int i48 = 0;
        while (i47 < i46) {
            int i49 = i48;
            int i50 = 0;
            while (i50 < i41) {
                nVarArr[i50].b[i47] = bArr[i49];
                i50++;
                i49++;
            }
            i47++;
            i48 = i49;
        }
        int i51 = i45;
        while (i51 < i41) {
            nVarArr[i51].b[i46] = bArr[i48];
            i51++;
            i48++;
        }
        boolean z11 = false;
        int length3 = nVarArr[0].b.length;
        while (i46 < length3) {
            int i52 = i48;
            int i53 = 0;
            while (i53 < i41) {
                nVarArr[i53].b[i53 < i45 ? i46 : i46 + 1] = bArr[i52];
                i53++;
                i52++;
            }
            i46++;
            i48 = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i40; i55++) {
            i54 += nVarArr[i55].a;
        }
        byte[] bArr2 = new byte[i54];
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        while (i57 < i40) {
            ba.n nVar2 = nVarArr[i57];
            byte[] bArr3 = nVar2.b;
            int i59 = nVar2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i60 = 0; i60 < length4; i60++) {
                iArr2[i60] = bArr3[i60] & 255;
            }
            try {
                int e02 = ((android.support.v4.media.c) this.b).e0(iArr2, bArr3.length - i59);
                for (int i61 = 0; i61 < i59; i61++) {
                    bArr3[i61] = (byte) iArr2[i61];
                }
                i56 += e02;
                int i62 = i58;
                int i63 = 0;
                while (i63 < i59) {
                    bArr2[i62] = bArr3[i63];
                    i63++;
                    i62++;
                }
                i57++;
                i58 = i62;
            } catch (bc.c unused) {
                yb.a aVar = yb.a.c;
                if (yb.h.a) {
                    throw new yb.a();
                }
                throw yb.a.c;
            }
        }
        char[] cArr = dc.a.a;
        d4.d dVar2 = new d4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i38);
        int i64 = -1;
        int i65 = -1;
        boolean z12 = false;
        boolean z13 = false;
        zb.c cVar2 = null;
        while (true) {
            try {
                int d = dVar2.d();
                dc.d dVar3 = dc.d.c;
                if (d < 4 || (f10 = dVar2.f(4)) == 0) {
                    dVar = dVar3;
                } else if (f10 == 1) {
                    dVar = dc.d.d;
                } else if (f10 == 2) {
                    dVar = dc.d.e;
                } else if (f10 == 3) {
                    dVar = dc.d.f;
                } else if (f10 == 4) {
                    dVar = dc.d.h;
                } else if (f10 == 5) {
                    dVar = dc.d.s;
                } else if (f10 == 7) {
                    dVar = dc.d.n;
                } else if (f10 == 8) {
                    dVar = dc.d.r;
                } else if (f10 == 9) {
                    dVar = dc.d.w;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = dc.d.x;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i3 = i56;
                            i10 = 1;
                            int f12 = dVar2.f(8);
                            if ((f12 & 128) == 0) {
                                f11 = f12 & hs.L1;
                            } else if ((f12 & hs.W2) == 128) {
                                f11 = ((f12 & 63) << 8) | dVar2.f(8);
                            } else {
                                if ((f12 & hs.B3) != 192) {
                                    throw yb.c.a();
                                }
                                f11 = ((f12 & 31) << 16) | dVar2.f(16);
                            }
                            HashMap hashMap = zb.c.c;
                            if (f11 < 0 || f11 >= 900) {
                                break;
                            }
                            zb.c cVar3 = (zb.c) zb.c.c.get(Integer.valueOf(f11));
                            if (cVar3 == null) {
                                throw yb.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i3 = i56;
                            i10 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i3 = i56;
                            i10 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z13 = true;
                            int i66 = i64;
                            if (dVar != dVar3) {
                                if (cVar != null) {
                                    i10 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i10 = 3;
                                } else if (z13) {
                                    i10 = 5;
                                }
                                e2.q qVar = new e2.q(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i66, i65, i10);
                                qVar.g = Integer.valueOf(i3);
                                return qVar;
                            }
                            i64 = i66;
                            bVar2 = bVar;
                            cVar2 = cVar;
                            i56 = i3;
                        } else if (ordinal != 9) {
                            int f13 = dVar2.f(dVar.a(x10));
                            int ordinal2 = dVar.ordinal();
                            i3 = i56;
                            if (ordinal2 == 1) {
                                dc.a.e(dVar2, sb2, f13);
                            } else if (ordinal2 == 2) {
                                dc.a.a(dVar2, sb2, f13, z12);
                            } else if (ordinal2 == 4) {
                                dc.a.b(dVar2, sb2, f13, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw yb.c.a();
                                }
                                dc.a.d(dVar2, sb2, f13);
                            }
                        } else {
                            i3 = i56;
                            int f14 = dVar2.f(4);
                            int f15 = dVar2.f(dVar.a(x10));
                            i10 = 1;
                            if (f14 == 1) {
                                dc.a.c(dVar2, sb2, f15);
                            }
                        }
                        int i662 = i64;
                        if (dVar != dVar3) {
                        }
                    } else {
                        i3 = i56;
                        i10 = 1;
                        if (dVar2.d() < 16) {
                            throw yb.c.a();
                        }
                        i64 = dVar2.f(8);
                        i65 = dVar2.f(8);
                    }
                    cVar = cVar2;
                    int i6622 = i64;
                    if (dVar != dVar3) {
                    }
                } else {
                    bVar = bVar2;
                    i3 = i56;
                }
                i10 = 1;
                cVar = cVar2;
                int i66222 = i64;
                if (dVar != dVar3) {
                }
            } catch (IllegalArgumentException unused2) {
                throw yb.c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05ea A[Catch: a | c -> 0x0687, TryCatch #2 {a | c -> 0x0687, blocks: (B:297:0x05d0, B:298:0x05e6, B:300:0x05ea, B:301:0x05ed, B:303:0x05f1, B:305:0x05fb, B:307:0x0601, B:312:0x0606), top: B:296:0x05d0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p7.d z(ua.b bVar) {
        int i3;
        int i10;
        ArrayList arrayList;
        ec.c cVar;
        ec.c cVar2;
        ec.c cVar3;
        float f10;
        float f11;
        ec.a aVar;
        float f12;
        float f13;
        float f14;
        int i11;
        int i12;
        yb.j[] jVarArr;
        yb.a aVar2;
        zb.b bVar2;
        int i13;
        e2.q qVar;
        int i14;
        p7.d dVar;
        List list;
        String str;
        int i15;
        boolean z10;
        double d;
        double abs;
        int i16;
        int i17;
        int i18;
        i iVar = (i) this.b;
        if (((zb.b) bVar.c) == null) {
            bVar.c = ((zb.e) bVar.b).a();
        }
        zb.b bVar3 = (zb.b) bVar.c;
        android.support.v4.media.c cVar4 = new android.support.v4.media.c(bVar3, 20);
        ec.e eVar = new ec.e(bVar3);
        int i19 = bVar3.b;
        int i20 = bVar3.a;
        int i21 = (i19 * 3) / 388;
        int i22 = 3;
        if (i21 < 3) {
            i21 = 3;
        }
        int i23 = 5;
        int[] iArr = new int[5];
        int i24 = i21 - 1;
        int i25 = 0;
        boolean z11 = false;
        while (true) {
            i3 = i23;
            int i26 = 1;
            i10 = i22;
            arrayList = eVar.b;
            if (i24 >= i19 || z11) {
                break;
            }
            Arrays.fill(iArr, i25);
            int i27 = i25;
            while (i27 < i20) {
                if (bVar3.b(i27, i24)) {
                    if ((i25 & 1) == i26) {
                        i25++;
                    }
                    iArr[i25] = iArr[i25] + i26;
                    i16 = i19;
                } else if ((i25 & 1) != 0) {
                    i16 = i19;
                    iArr[i25] = iArr[i25] + 1;
                } else if (i25 == 4) {
                    if (!ec.e.b(iArr)) {
                        i16 = i19;
                        int i28 = i26;
                        iArr[0] = iArr[2];
                        iArr[i28] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = i28;
                        iArr[4] = 0;
                    } else if (eVar.c(i24, i27, iArr)) {
                        if (eVar.c) {
                            z11 = eVar.d();
                            i16 = i19;
                            i17 = 2;
                        } else {
                            if (arrayList.size() > i26) {
                                int size = arrayList.size();
                                int i29 = 0;
                                ec.c cVar5 = null;
                                while (true) {
                                    if (i29 >= size) {
                                        i16 = i19;
                                        i17 = 2;
                                        i18 = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i29);
                                    i29++;
                                    ec.c cVar6 = (ec.c) obj;
                                    i16 = i19;
                                    if (cVar6.d >= 2) {
                                        if (cVar5 != null) {
                                            eVar.c = true;
                                            i17 = 2;
                                            i18 = ((int) (Math.abs(cVar5.a - cVar6.a) - Math.abs(cVar5.b - cVar6.b))) / 2;
                                            break;
                                        }
                                        cVar5 = cVar6;
                                    }
                                    i19 = i16;
                                }
                            } else {
                                i16 = i19;
                                i18 = 0;
                                i17 = 2;
                            }
                            if (i18 > iArr[i17]) {
                                i24 += (i18 - r5) - 2;
                                i27 = i20 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i25 = 0;
                        i21 = i17;
                    } else {
                        i16 = i19;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = 1;
                        iArr[4] = 0;
                    }
                    i25 = i10;
                } else {
                    i16 = i19;
                    int i30 = i25 + 1;
                    iArr[i30] = iArr[i30] + 1;
                    i25 = i30;
                }
                i27++;
                i19 = i16;
                i26 = 1;
            }
            int i31 = i19;
            if (ec.e.b(iArr) && eVar.c(i24, i20, iArr)) {
                int i32 = iArr[0];
                if (eVar.c) {
                    i21 = i32;
                    z11 = eVar.d();
                } else {
                    i21 = i32;
                }
            }
            i24 += i21;
            i23 = i3;
            i22 = i10;
            i19 = i31;
            i25 = 0;
        }
        if (arrayList.size() < i10) {
            throw yb.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ec.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ec.e.e);
        ec.c[] cVarArr = new ec.c[3];
        int i33 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i34 = 2; i33 < arrayList.size() - i34; i34 = 2) {
            ec.c cVar7 = (ec.c) arrayList.get(i33);
            float f15 = cVar7.c;
            i33++;
            int i35 = i33;
            while (i35 < arrayList.size() - 1) {
                ec.c cVar8 = (ec.c) arrayList.get(i35);
                double e10 = ec.e.e(cVar7, cVar8);
                i35++;
                for (int i36 = i35; i36 < arrayList.size(); i36++) {
                    ec.c cVar9 = (ec.c) arrayList.get(i36);
                    if (cVar9.c <= 1.4f * f15) {
                        double e11 = ec.e.e(cVar8, cVar9);
                        double e12 = ec.e.e(cVar7, cVar9);
                        if (e10 < e11) {
                            if (e11 <= e12) {
                                e12 = e11;
                                e11 = e12;
                            } else if (e10 >= e12) {
                                d = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar7;
                                    cVarArr[1] = cVar8;
                                    cVarArr[2] = cVar9;
                                    d10 = abs;
                                }
                            }
                            d = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d10) {
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
                                if (abs >= d10) {
                                }
                            } else {
                                d = e11;
                            }
                            e11 = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw yb.e.a();
        }
        float a10 = yb.j.a(cVarArr[0], cVarArr[1]);
        float a11 = yb.j.a(cVarArr[1], cVarArr[2]);
        float a12 = yb.j.a(cVarArr[0], cVarArr[2]);
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
        if (a1.g.D(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            ec.c cVar10 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar10;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float c02 = cVar4.c0(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float c03 = cVar4.c0(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (c03 + c02) / 2.0f;
        if (f23 < 1.0f) {
            throw yb.e.a();
        }
        float a13 = yb.j.a(cVar, cVar3) / f23;
        int i37 = (int) (a13 + (a13 < 0.0f ? -0.5f : 0.5f));
        float a14 = yb.j.a(cVar, cVar2) / f23;
        int i38 = (((int) (a14 + (a14 >= 0.0f ? 0.5f : -0.5f))) + i37) / 2;
        int i39 = i38 + 7;
        int i40 = i39 & 3;
        if (i40 == 0) {
            i39 = i38 + 8;
        } else if (i40 == 2) {
            i39 = i38 + 6;
        } else if (i40 == 3) {
            i39 = i38 + 5;
        }
        int i41 = i39;
        int[] iArr2 = dc.e.e;
        if (i41 % 4 != 1) {
            throw yb.c.a();
        }
        try {
            dc.e c2 = dc.e.c((i41 - 17) / 4);
            int i42 = (c2.a * 4) + 10;
            if (c2.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i42);
                int y9 = (int) com.google.android.recaptcha.internal.a.y(f24, f18, f26, f18);
                int y10 = (int) com.google.android.recaptcha.internal.a.y(f25, f17, f26, f17);
                f10 = f18;
                for (int i43 = 4; i43 <= 16; i43 <<= 1) {
                    try {
                        aVar = cVar4.f0(f23, i43, y9, y10);
                        break;
                    } catch (yb.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i41 - 3.5f;
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
            zb.g a15 = zb.g.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            ec.a aVar3 = aVar;
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
            zb.g a16 = zb.g.a(f29, f30, f31, f32, f12, f28, f33, f34);
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
            if (i41 <= 0 || i41 <= 0) {
                throw yb.e.a();
            }
            zb.b bVar4 = new zb.b(i41, i41);
            int i44 = i41 * 2;
            ec.c cVar11 = cVar;
            float[] fArr = new float[i44];
            int i45 = 0;
            while (i45 < i41) {
                int i46 = i41;
                float f74 = i45 + 0.5f;
                int i47 = 0;
                while (i47 < i44) {
                    int i48 = i47;
                    fArr[i48] = (i48 / 2) + 0.5f;
                    fArr[i48 + 1] = f74;
                    i47 = i48 + 2;
                }
                int i49 = i44 - 1;
                ec.c cVar12 = cVar2;
                int i50 = 0;
                while (i50 < i49) {
                    float f75 = fArr[i50];
                    int i51 = i50 + 1;
                    int i52 = i50;
                    float f76 = fArr[i51];
                    ec.c cVar13 = cVar3;
                    float c10 = t4.c.c(f72, f76, f71 * f75, f73);
                    fArr[i52] = (((f60 * f76) + (f59 * f75)) + f61) / c10;
                    fArr[i51] = (((f76 * f66) + (f75 * f65)) + f67) / c10;
                    i50 = i52 + 2;
                    cVar3 = cVar13;
                }
                ec.c cVar14 = cVar3;
                int i53 = bVar3.b;
                float f77 = f72;
                int i54 = 0;
                boolean z12 = true;
                while (i54 < i49 && z12) {
                    int i55 = (int) fArr[i54];
                    int i56 = i54 + 1;
                    int i57 = i49;
                    int i58 = (int) fArr[i56];
                    int i59 = i54;
                    if (i55 < -1 || i55 > i20 || i58 < -1 || i58 > i53) {
                        throw yb.e.a();
                    }
                    if (i55 == -1) {
                        fArr[i59] = 0.0f;
                    } else if (i55 == i20) {
                        fArr[i59] = i20 - 1;
                    } else {
                        z10 = false;
                        if (i58 != -1) {
                            fArr[i56] = 0.0f;
                        } else if (i58 == i53) {
                            fArr[i56] = i53 - 1;
                        } else {
                            z12 = z10;
                            i54 = i59 + 2;
                            i49 = i57;
                        }
                        z12 = true;
                        i54 = i59 + 2;
                        i49 = i57;
                    }
                    z10 = true;
                    if (i58 != -1) {
                    }
                    z12 = true;
                    i54 = i59 + 2;
                    i49 = i57;
                }
                int i60 = i44 - 2;
                boolean z13 = true;
                while (i60 >= 0 && z13) {
                    int i61 = (int) fArr[i60];
                    int i62 = i60 + 1;
                    int i63 = i60;
                    int i64 = (int) fArr[i62];
                    if (i61 < -1 || i61 > i20 || i64 < -1 || i64 > i53) {
                        throw yb.e.a();
                    }
                    if (i61 == -1) {
                        fArr[i63] = 0.0f;
                    } else if (i61 == i20) {
                        fArr[i63] = i20 - 1;
                    } else {
                        z13 = false;
                        if (i64 != -1) {
                            fArr[i62] = 0.0f;
                        } else if (i64 == i53) {
                            fArr[i62] = i53 - 1;
                        } else {
                            i60 = i63 - 2;
                        }
                        z13 = true;
                        i60 = i63 - 2;
                    }
                    z13 = true;
                    if (i64 != -1) {
                    }
                    z13 = true;
                    i60 = i63 - 2;
                }
                for (int i65 = 0; i65 < i44; i65 += 2) {
                    try {
                        if (bVar3.b((int) fArr[i65], (int) fArr[i65 + 1])) {
                            bVar4.c(i65 / 2, i45);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw yb.e.a();
                    }
                }
                i45++;
                i41 = i46;
                cVar2 = cVar12;
                f72 = f77;
                cVar3 = cVar14;
            }
            ec.c cVar15 = cVar2;
            ec.c cVar16 = cVar3;
            if (aVar3 == null) {
                i12 = 3;
                i11 = 1;
                jVarArr = new yb.j[]{cVar15, cVar11, cVar16};
            } else {
                i11 = 1;
                i12 = 3;
                jVarArr = new yb.j[]{cVar15, cVar11, cVar16, aVar3};
            }
            yb.j[] jVarArr2 = jVarArr;
            iVar.getClass();
            b4.n nVar = new b4.n();
            int i66 = bVar4.b;
            if (i66 < 21 || (i66 & i12) != i11) {
                throw yb.c.a();
            }
            nVar.b = bVar4;
            try {
                qVar = iVar.y(nVar);
            } catch (yb.a e13) {
                aVar2 = e13;
                e = null;
                try {
                    nVar.y();
                    nVar.c = null;
                    nVar.d = null;
                    nVar.a = true;
                    nVar.x();
                    nVar.w();
                    bVar2 = (zb.b) nVar.b;
                    i13 = 0;
                    while (i13 < bVar2.a) {
                        int i67 = i13 + 1;
                        for (int i68 = i67; i68 < bVar2.b; i68++) {
                            if (bVar2.b(i13, i68) != bVar2.b(i68, i13)) {
                                bVar2.a(i68, i13);
                                bVar2.a(i13, i68);
                            }
                        }
                        i13 = i67;
                    }
                    e2.q y11 = iVar.y(nVar);
                    y11.h = new nb.a(i3);
                    qVar = y11;
                    i14 = qVar.a;
                    if (com.google.android.recaptcha.internal.a.u((nb.a) qVar.h)) {
                        yb.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    dVar = new p7.d((String) qVar.d, jVarArr2);
                    list = (List) qVar.e;
                    if (list != null) {
                    }
                    str = (String) qVar.f;
                    if (str != null) {
                    }
                    if (i14 >= 0) {
                        dVar.A(yb.i.d, Integer.valueOf(i15));
                        dVar.A(yb.i.e, Integer.valueOf(i14));
                    }
                    dVar.A(yb.i.c, (Integer) qVar.g);
                    dVar.A(yb.i.f, "]Q" + qVar.c);
                    return dVar;
                } catch (yb.a | yb.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (yb.c e14) {
                e = e14;
                aVar2 = null;
                nVar.y();
                nVar.c = null;
                nVar.d = null;
                nVar.a = true;
                nVar.x();
                nVar.w();
                bVar2 = (zb.b) nVar.b;
                i13 = 0;
                while (i13 < bVar2.a) {
                }
                e2.q y112 = iVar.y(nVar);
                y112.h = new nb.a(i3);
                qVar = y112;
                i14 = qVar.a;
                if (com.google.android.recaptcha.internal.a.u((nb.a) qVar.h)) {
                }
                dVar = new p7.d((String) qVar.d, jVarArr2);
                list = (List) qVar.e;
                if (list != null) {
                }
                str = (String) qVar.f;
                if (str != null) {
                }
                if (i14 >= 0) {
                }
                dVar.A(yb.i.c, (Integer) qVar.g);
                dVar.A(yb.i.f, "]Q" + qVar.c);
                return dVar;
            }
            i14 = qVar.a;
            if (com.google.android.recaptcha.internal.a.u((nb.a) qVar.h) && jVarArr2.length >= 3) {
                yb.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            dVar = new p7.d((String) qVar.d, jVarArr2);
            list = (List) qVar.e;
            if (list != null) {
                dVar.A(yb.i.a, list);
            }
            str = (String) qVar.f;
            if (str != null) {
                dVar.A(yb.i.b, str);
            }
            if (i14 >= 0 && (i15 = qVar.b) >= 0) {
                dVar.A(yb.i.d, Integer.valueOf(i15));
                dVar.A(yb.i.e, Integer.valueOf(i14));
            }
            dVar.A(yb.i.c, (Integer) qVar.g);
            dVar.A(yb.i.f, "]Q" + qVar.c);
            return dVar;
        } catch (IllegalArgumentException unused4) {
            throw yb.c.a();
        }
    }

    public /* synthetic */ i(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public i(int i3) {
        this.a = i3;
        switch (i3) {
            case 9:
                this.b = new i(17);
                break;
            case 11:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 17:
                this.b = new android.support.v4.media.c(bc.a.h, 4);
                break;
            case 19:
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    @Override // ug.k1
    public float get() {
        x9 x9Var = (x9) this.b;
        int i3 = x9Var.p1;
        tg.h currentBrush = x9Var.y0.getCurrentBrush();
        if (currentBrush == null) {
            return k0.e(i3).i;
        }
        return k0.e(i3).f(String.valueOf(tg.h.a.indexOf(currentBrush)), currentBrush.d());
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

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ void W() {
    }

    @Override // ei.n9
    public /* synthetic */ void c(boolean z10) {
    }

    @Override // c3.j0
    public void f(a2 a2Var) {
    }

    @Override // org.telegram.ui.Components.z80
    public /* synthetic */ void w(String str) {
    }

    @Override // org.telegram.ui.Components.z80
    public /* synthetic */ void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3) {
    }

    @Override // org.telegram.ui.Components.z80
    public /* synthetic */ void q(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // a3.k
    public /* synthetic */ void M(a3.m mVar, long j10, long j11, int i3) {
    }

    @Override // a3.k
    public void q0(a3.m mVar, long j10, long j11, boolean z10) {
    }
}
