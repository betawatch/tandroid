package androidx.biometric;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.cast.h4;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.e1;
import eg.o1;
import eg.q2;
import f2.m1;
import f2.p1;
import f2.q1;
import f2.w0;
import f2.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import k7.q7;
import m.e2;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.hb1;
import org.telegram.ui.zr0;
import uf.j1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f0 implements androidx.lifecycle.a0, com.google.android.gms.common.api.internal.k0, v0, e2.d, q2, q1, com.google.android.gms.common.api.internal.s, l.x, e2, l.j, o0.a, o2.n, od.b, ko0, xd.d, zf.m, h71, j1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f0(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void B(y5.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void C() {
        m0 m0Var = (m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.C = Collections.EMPTY_SET;
    }

    @Override // m.e2
    public void D(l.l lVar, l.n nVar) {
        l.f fVar = (l.f) this.b;
        Handler handler = fVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((l.e) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new c2.p(this, i11 < arrayList.size() ? (l.e) arrayList.get(i11) : null, nVar, lVar, 5), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // xd.d
    public void E() {
        ((f9) this.b).a.invalidate();
    }

    @Override // zf.m
    public void F(boolean z4) {
        ((af0) this.b).c.setAspectLock(z4);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean G() {
        return true;
    }

    @Override // eg.q2
    public void H(float f10) {
        o1 o1Var = (o1) this.b;
        e1.e(o1Var.a).k("-1", f10);
        o1Var.e.setBrushSize(f10);
    }

    @Override // f2.q1
    public View I(int i10) {
        return ((w0) this.b).q(i10);
    }

    @Override // f2.q1
    public int J(View view) {
        return w0.y(view) + ((ViewGroup.MarginLayoutParams) ((x0) view.getLayoutParams())).rightMargin;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e L(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public c2.v M() {
        if (((ArrayList) this.b) == null) {
            return c2.v.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new c2.v(bundle, (ArrayList) this.b);
    }

    @Override // zf.m
    public void N(boolean z4) {
        af0 af0Var = (af0) this.b;
        af0Var.getClass();
        ze0 ze0Var = af0Var.a;
        if (ze0Var != null) {
            ((zr0) ze0Var).a(z4);
        }
    }

    public void O() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    public void P(c2.r rVar, c2.n nVar, Collection collection) {
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
        c2.z zVar = eVar.x.a;
        String d = nVar.d();
        c2.a0 a0Var = new c2.a0(zVar, d, eVar.b(zVar, d), false);
        a0Var.i(nVar);
        if (eVar.d == a0Var) {
            return;
        }
        eVar.h(eVar, a0Var, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public void Q(m1 m1Var, c5.e eVar, c5.e eVar2) {
        boolean z4;
        m1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(m1Var);
        recyclerView.h(m1Var);
        m1Var.q(false);
        p1 p1Var = (p1) recyclerView.W;
        p1Var.getClass();
        int i11 = eVar.a;
        int i12 = eVar.b;
        View view = m1Var.a;
        int left = eVar2 == null ? view.getLeft() : eVar2.a;
        int top = eVar2 == null ? view.getTop() : eVar2.b;
        if (m1Var.j() || (i11 == left && i12 == top)) {
            int i13 = m1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            m1Var.i = (m1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            p1Var.s(m1Var, eVar);
            z4 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z4 = p1Var.r(m1Var, eVar, i11, i12, left, top);
        }
        if (z4) {
            recyclerView.l0();
        }
    }

    @Override // uf.j1
    public boolean R(int i10) {
        return i10 == ((iq0) this.b).r;
    }

    @Override // zf.m
    public void S() {
        ze0 ze0Var = ((af0) this.b).a;
        if (ze0Var != null) {
            PhotoViewer photoViewer = ((zr0) ze0Var).a;
            if (photoViewer.Z1 == 1) {
                photoViewer.E2 = true;
                photoViewer.q3();
            }
        }
    }

    public void T(m1 m1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        w0 w0Var = recyclerView.x;
        View view = m1Var.a;
        bf.f fVar = recyclerView.b;
        e eVar = w0Var.a;
        ja.c cVar = (ja.c) eVar.b;
        int indexOfChild = ((RecyclerView) cVar.a).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((f2.c) eVar.c).G(indexOfChild)) {
                eVar.C(view);
            }
            cVar.D(indexOfChild);
        }
        fVar.g(view);
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
    public void W(Object obj) {
        Integer num = (Integer) obj;
        i0 i0Var = (i0) this.b;
        Handler handler = i0Var.x0;
        androidx.activity.i iVar = i0Var.y0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (i0Var.C0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = i0Var.z0.y;
            Context n10 = i0Var.n();
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
                i0Var.C0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    g0.a(drawable);
                }
                i0Var.z0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = i0Var.D0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? i0Var.A0 : i0Var.B0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // org.telegram.ui.Components.ko0
    public void X(float f10, boolean z4) {
        hb1 hb1Var = (hb1) ((org.telegram.ui.Cells.k0) this.b);
        int i10 = (int) (k6.q * 100.0f);
        int i11 = (int) (f10 * 100.0f);
        k6.q = f10;
        if (i10 != i11) {
            ThemeActivity themeActivity = hb1Var.e.e;
            fl0 fl0Var = (fl0) themeActivity.b.K(themeActivity.c0);
            if (fl0Var != null) {
                ((a9) fl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", org.telegram.messenger.R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (k6.q * 100.0f))));
            }
            k6.E(true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
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

    @Override // l.x
    public void c(l.l lVar, boolean z4) {
        g.p pVar;
        g.q qVar = (g.q) this.b;
        l.l k10 = lVar.k();
        int i10 = 0;
        boolean z10 = k10 != lVar;
        if (z10) {
            lVar = k10;
        }
        g.p[] pVarArr = qVar.R;
        int length = pVarArr != null ? pVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                pVar = pVarArr[i10];
                if (pVar != null && pVar.h == lVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                h4.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // o2.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ee.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // f2.q1
    public int d(View view) {
        return w0.x(view) - ((ViewGroup.MarginLayoutParams) ((x0) view.getLayoutParams())).leftMargin;
    }

    @Override // l.x
    public boolean d0(l.l lVar) {
        Window.Callback callback;
        g.q qVar = (g.q) this.b;
        if (lVar != lVar.k() || !qVar.L || (callback = qVar.f.getCallback()) == null || qVar.W) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void e() {
        m0 m0Var = (m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new com.google.android.gms.common.api.internal.g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.C();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // uf.j1
    public void g(int i10) {
        iq0 iq0Var = (iq0) this.b;
        mq0 mq0Var = iq0Var.H;
        iq0Var.s = i10;
        if (iq0Var.v != i10) {
            iq0Var.d.clear();
        }
        int i11 = iq0Var.G;
        if (iq0Var.h() != 0 || iq0Var.e.e() || iq0Var.F) {
            mq0Var.u0.b(i11);
        } else {
            mq0Var.N.e(false, true);
        }
        iq0Var.l();
        int i12 = mq0.X0;
        mq0Var.K0(true);
    }

    @Override // eg.q2
    public float get() {
        o1 o1Var = (o1) this.b;
        int i10 = o1Var.a;
        dg.m currentBrush = o1Var.e.getCurrentBrush();
        return currentBrush == null ? e1.e(i10).i : e1.e(i10).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.ko0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // o2.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ee.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // m.e2
    public void h(l.l lVar, MenuItem menuItem) {
        ((l.f) this.b).f.removeCallbacksAndMessages(lVar);
    }

    @Override // l.j
    public void j(l.l lVar) {
        y5.h hVar = ((ActionMenuView) this.b).H;
        if (hVar != null) {
            hVar.j(lVar);
        }
    }

    @Override // xd.d
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // xd.d
    public /* synthetic */ boolean l(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ko0
    public /* synthetic */ int m0() {
        return 0;
    }

    @Override // f2.q1
    public int n() {
        return ((w0) this.b).D();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onStateChanged(boolean z4, int i10) {
        sk0 sk0Var = (sk0) this.b;
        if (z4 && sk0Var.n.n() >= 0) {
            sk0Var.w = true;
        }
        og0 og0Var = sk0Var.f;
        ec0 ec0Var = sk0Var.x;
        og0Var.a(z4, true);
        AndroidUtilities.cancelRunOnUIThread(ec0Var);
        if (z4) {
            AndroidUtilities.runOnUIThread(ec0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // e2.d
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void q(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = y5.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // o0.a
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e6) {
            Log.w("FontsProvider", "Unable to query the content provider", e6);
            return null;
        }
    }

    @Override // l.j
    public boolean s(l.l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.b).M;
        if (kVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((o5.i) kVar).b).T.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // o2.n
    public String[] t() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    public String toString() {
        switch (this.a) {
            case 7:
                de.b bVar = de.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((da.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // e2.d
    public void u(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    @Override // f2.q1
    public int v() {
        w0 w0Var = (w0) this.b;
        return w0Var.m - w0Var.E();
    }

    @Override // zf.m
    public void w() {
        ze0 ze0Var = ((af0) this.b).a;
        if (ze0Var != null) {
            ((zr0) ze0Var).a.b0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // od.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(od.c cVar, wc.c cVar2) {
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
                    q7.b(obj);
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
                        q7.b(obj);
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

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    public /* synthetic */ f0(g6.g gVar, g6.a aVar) {
        this.a = 15;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.h71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public f0(Context context, Uri uri) {
        this.a = 20;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // org.telegram.ui.Components.ko0
    public void A() {
    }

    @Override // xd.d
    public /* synthetic */ void a() {
    }

    @Override // xd.d
    public /* synthetic */ void m() {
    }

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void b(Bundle bundle) {
    }

    @Override // xd.d
    public /* synthetic */ void i(boolean z4) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void z(int i10) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onError(k71 k71Var, Exception exc) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void f(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
