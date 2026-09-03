package androidx.biometric;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import cg.f1;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.q1;
import dg.s2;
import f2.p1;
import f2.w0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import k7.p7;
import lh.g5;
import m.f2;
import nh.d4;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y50;
import org.telegram.ui.v61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e0 implements androidx.lifecycle.a0, v0, s2, v4.f, p1, com.google.android.gms.common.api.internal.s, l.w, f2, aq0, m.k, v61, o2.o, od.b, y4, ng.g, f71 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e0(g6.g gVar, g6.a aVar) {
        this.a = 14;
        this.b = aVar;
    }

    public static com.google.android.gms.common.api.internal.p i(Looper looper, Object obj, String str) {
        b6.m.i(obj, "Listener must not be null");
        b6.m.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override // dg.s2
    public void A(float f10) {
        q1 q1Var = (q1) this.b;
        f1.e(q1Var.a).k("-1", f10);
        q1Var.e.setBrushSize(f10);
    }

    @Override // f2.p1
    public View B(int i10) {
        return ((f2.v0) this.b).q(i10);
    }

    @Override // ng.g
    public void D(Canvas canvas) {
        li liVar = (li) this.b;
        canvas.drawColor(liVar.getThemedColor(j6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            liVar.z2.b(canvas, -3);
        }
    }

    @Override // ng.g
    public void D1(g.x xVar) {
        xVar.a(((li) this.b).getThemedColor(j6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // f2.p1
    public int E(View view) {
        return f2.v0.y(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).rightMargin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(Object obj) {
        Integer num = (Integer) obj;
        h0 h0Var = (h0) this.b;
        Handler handler = h0Var.x0;
        androidx.activity.i iVar = h0Var.y0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (h0Var.C0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = h0Var.z0.y;
            Context n10 = h0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                h0Var.C0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    f0.a(drawable);
                }
                h0Var.z0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = h0Var.D0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? h0Var.A0 : h0Var.B0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
        f0Var.l0(i10, i11, z4);
        f0Var.dismiss();
    }

    @Override // org.telegram.ui.Components.aq0
    public /* synthetic */ void V() {
        int i10 = this.a;
    }

    @Override // o2.o
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                u7.e eVar = (u7.e) this.b;
                f7.a0 a0Var = (f7.a0) ((f7.l) obj).u();
                f7.g gVar = new f7.g(1, (TaskCompletionSource) obj2);
                Parcel M0 = a0Var.M0();
                f7.e.c(M0, eVar);
                f7.e.d(M0, gVar);
                M0.writeString(null);
                a0Var.Q0(M0, 63);
                break;
            default:
                g6.f fVar = new g6.f(1, (TaskCompletionSource) obj2);
                g6.e eVar2 = (g6.e) ((g6.h) obj).u();
                g6.a aVar = (g6.a) this.b;
                Parcel G0 = eVar2.G0();
                y6.a.d(G0, fVar);
                y6.a.c(G0, aVar);
                G0.writeStrongBinder(null);
                eVar2.H0(G0, 2);
                break;
        }
    }

    public void b(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override // l.w
    public void c(l.k kVar, boolean z4) {
        g.p pVar;
        g.q qVar = (g.q) this.b;
        l.k k10 = kVar.k();
        int i10 = 0;
        boolean z10 = k10 != kVar;
        if (z10) {
            kVar = k10;
        }
        g.p[] pVarArr = qVar.R;
        int length = pVarArr != null ? pVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                pVar = pVarArr[i10];
                if (pVar != null && pVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar != null) {
            if (!z10) {
                qVar.h(pVar, z4);
            } else {
                qVar.f(pVar.a, pVar, k10);
                qVar.h(pVar, true);
            }
        }
    }

    @Override // o2.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ee.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // m.f2
    public void d(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // v4.f
    public int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // f2.p1
    public int f(View view) {
        return f2.v0.x(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).leftMargin;
    }

    public void g() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // dg.s2
    public float get() {
        q1 q1Var = (q1) this.b;
        int i10 = q1Var.a;
        cg.m currentBrush = q1Var.e.getCurrentBrush();
        return currentBrush == null ? f1.e(i10).i : f1.e(i10).f("-1", currentBrush.d());
    }

    @Override // o2.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ee.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // v4.f
    public long h(int i10) {
        h5.a.f(i10 == 0);
        return 0L;
    }

    @Override // f2.p1
    public int j() {
        return ((f2.v0) this.b).D();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void m(int i10) {
        y5.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.f()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // m.f2
    public void n(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new c2.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, 5), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = y5.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(i71 i71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        y50 y50Var;
        VideoEditedInfo videoEditedInfo;
        x50 x50Var = (x50) this.b;
        i71 i71Var = x50Var.E0.L;
        if (i71Var != null && i71Var.y() && i10 == 4 && (videoEditedInfo = (y50Var = x50Var.E0).K) != null) {
            i71 i71Var2 = y50Var.L;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            i71Var2.K(j10);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // l.w
    public boolean p(l.k kVar) {
        Window.Callback callback;
        g.q qVar = (g.q) this.b;
        if (kVar != kVar.k() || !qVar.L || (callback = qVar.f.getCallback()) == null || qVar.W) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // v4.f
    public List q(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // org.telegram.ui.Components.aq0
    public void q0() {
        switch (this.a) {
            case 18:
                ic k10 = ((g5) this.b).getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                d4.j0((d4) this.b);
                break;
        }
    }

    @Override // v4.f
    public int r() {
        return 1;
    }

    @Override // f2.p1
    public int s() {
        f2.v0 v0Var = (f2.v0) this.b;
        return v0Var.m - v0Var.E();
    }

    public void t() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    public void u(c2.r rVar, c2.n nVar, Collection collection) {
        c2.e eVar = (c2.e) this.b;
        if (rVar != eVar.y || nVar == null) {
            if (rVar == eVar.e) {
                if (nVar != null) {
                    eVar.n(eVar.d, nVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        c2.a0 a0Var = eVar.x.a;
        String d = nVar.d();
        c2.b0 b0Var = new c2.b0(a0Var, d, eVar.b(a0Var, d), false);
        b0Var.i(nVar);
        if (eVar.d == b0Var) {
            return;
        }
        eVar.h(eVar, b0Var, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void v(y5.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // od.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(od.c cVar, wc.c cVar2) {
        od.a aVar;
        int i10;
        Throwable th2;
        pd.g gVar;
        if (cVar2 instanceof od.a) {
            aVar = (od.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                vc.a aVar2 = vc.a.a;
                i10 = aVar.d;
                sc.i iVar = sc.i.a;
                if (i10 != 0) {
                    p7.b(obj);
                    pd.g gVar2 = new pd.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.p) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        p7.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new od.a(this, cVar2);
        Object obj2 = aVar.b;
        vc.a aVar22 = vc.a.a;
        i10 = aVar.d;
        sc.i iVar2 = sc.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.f71
    public void onRenderedFirstFrame() {
    }

    public e0(int i10) {
        this.a = i10;
        switch (i10) {
            case 29:
                this.b = new HashMap();
                break;
            default:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    public e0(ArrayList arrayList) {
        this.a = 9;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    private final /* synthetic */ void k() {
    }

    private final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
