package k0;

import a1.g;
import a6.m;
import ai.t3;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import bh.h;
import com.google.android.gms.common.api.internal.o;
import gi.m4;
import i2.k0;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k1.f;
import k1.z;
import k2.q;
import k2.s;
import k2.t;
import k2.u0;
import k2.w0;
import k2.x;
import ki.b3;
import ki.g1;
import ki.g5;
import ki.h1;
import ki.h2;
import ki.j0;
import ki.o2;
import ki.r3;
import ki.w3;
import ki.z0;
import l.i;
import l.k;
import l.w;
import md.c;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x71;
import org.telegram.ui.n9;
import org.telegram.ui.web.b1;
import org.telegram.ui.x9;
import qf.e;
import r2.j;
import r4.d;
import rg.m2;
import rg.v1;
import s4.d0;
import s4.g0;
import s4.o0;
import td.p;
import x2.n;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b implements x, j0, g1, w, i, f, n5.b, e5, h, x71, oe.a, x9, d, o, v1, d0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static FingerprintManager w(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    @Override // k2.x
    public void A() {
        n nVar;
        w0 w0Var = (w0) this.b;
        synchronized (w0Var.a) {
            nVar = w0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // ki.j0
    public m9 B() {
        return (z0) this.b;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // org.telegram.ui.x9
    public void E(String str) {
        b1 b1Var = (b1) this.b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // ki.j0
    public ki.a F() {
        return ((z0) this.b).a;
    }

    @Override // ki.j0
    public boolean G() {
        z0 z0Var = (z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var == null) {
            return false;
        }
        ki.a aVar = z0Var.a;
        return r3Var.a.T4();
    }

    @Override // bh.h
    public void H(bh.a aVar) {
        switch (this.a) {
            case 13:
                aVar.a(((ti) this.b).getThemedColor(h6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((dr0) this.b).getThemedColor(h6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // k2.x
    public void I(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((w0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    public void J(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.e.K(i15);
            s4.b1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((o0) K.getLayoutParams()).c = true;
            }
        }
        e eVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s4.b1 b1Var = (s4.b1) arrayList2.get(size);
            if (b1Var != null && (i12 = b1Var.c) >= i10 && i12 < i14) {
                b1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.y0 = true;
    }

    @Override // ki.j0
    public void K(int i10, int i11) {
        z0 z0Var = (z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.a;
            h2 h2Var = r3Var.a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override // k2.x
    public void L() {
        ((w0) this.b).j1 = true;
    }

    @Override // ki.g1
    public void M(Editable editable) {
        ((g5) this.b).h();
    }

    @Override // ki.j0
    public void N() {
        z0 z0Var = (z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.a;
            w3 w3Var = r3Var.a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f3.onContentChanged();
        }
    }

    public void O(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        for (int i12 = 0; i12 < L; i12++) {
            s4.b1 U = RecyclerView.U(recyclerView.e.K(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            s4.b1 b1Var = (s4.b1) arrayList.get(i13);
            if (b1Var != null && b1Var.c >= i10) {
                b1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    @Override // k2.x
    public void P(u0 u0Var) {
        qf.b bVar = ((w0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 1));
        }
    }

    @Override // ki.g1
    public /* synthetic */ boolean Q(boolean z10) {
        return false;
    }

    @Override // ki.g1
    public /* synthetic */ boolean R(h1 h1Var) {
        return false;
    }

    @Override // k2.x
    public void S(u0 u0Var) {
        qf.b bVar = ((w0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 0));
        }
    }

    @Override // k2.x
    public void T() {
        k0 k0Var = ((w0) this.b).Y;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // rg.v1
    public void U(float f7) {
        ((m2) this.b).setOutlineWidth(f7);
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // ki.g1
    public void V(h1 h1Var, int i10, int i11) {
        ki.e5 e5Var;
        org.telegram.ui.Cells.n9 textSelectionHelper;
        g5 g5Var = (g5) this.b;
        if (g5Var.w || i10 == i11 || (e5Var = g5Var.s) == null || (textSelectionHelper = ((b3) e5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new m4(this, h1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // ki.j0
    public void W() {
        z0 z0Var = (z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.a;
            w3.P1(r3Var.a);
        }
    }

    @Override // s4.d0
    public void X(int i10, int i11) {
        ((g0) this.b).s(i10, i11);
    }

    public void Y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < L; i20++) {
            s4.b1 U = RecyclerView.U(recyclerView.e.K(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            s4.b1 b1Var = (s4.b1) arrayList.get(i21);
            if (b1Var != null && (i17 = b1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b1Var.n(i11 - i10, false);
                } else {
                    b1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    public byte Z() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // k1.f
    public Object a(p pVar, c cVar) {
        return ((z) this.b).a(new n1.c(pVar, null, 0), cVar);
    }

    public int a0() {
        return ((Z() & 255) << 24) | ((Z() & 255) << 16) | ((Z() & 255) << 8) | (Z() & 255);
    }

    @Override // s4.d0
    public void a1(int i10, int i11) {
        ((g0) this.b).r(i10, i11, null);
    }

    @Override // l.i
    public void b(k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.i iVar = toolbar.a.J;
        if (iVar == null || !iVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.t();
            }
        }
    }

    public int b0() {
        return ((Z() & Byte.MAX_VALUE) << 21) | ((Z() & Byte.MAX_VALUE) << 14) | ((Z() & Byte.MAX_VALUE) << 7) | (Z() & Byte.MAX_VALUE);
    }

    @Override // ki.j0
    public void c(h1 h1Var) {
        switch (this.a) {
            case 2:
                r3 r3Var = ((z0) this.b).S;
                if (r3Var != null) {
                    w3 w3Var = r3Var.a;
                    w3.N1(w3Var, h1Var);
                    w3Var.f3.n(h1Var, true);
                    break;
                }
                break;
            default:
                ki.e5 e5Var = ((g5) this.b).s;
                if (e5Var != null) {
                    w3 w3Var2 = ((b3) e5Var).a;
                    w3.N1(w3Var2, h1Var);
                    w3Var2.f3.n(h1Var, true);
                    break;
                }
                break;
        }
    }

    public void c0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // l.w
    public void d(k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        w wVar = ((m.i) this.b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override // k2.x
    public void e(long j10) {
        w0 w0Var = (w0) this.b;
        w0Var.m1 = true;
        qf.b bVar = w0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t3(bVar, j10, 13));
        }
    }

    @Override // ki.g1
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // oe.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // ki.j0
    public void g() {
        z0 z0Var = (z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            w3.Q1(r3Var.a, z0Var.a);
        }
    }

    @Override // hd.a
    public Object get() {
        switch (this.a) {
            case 8:
                return this.b;
            default:
                String packageName = ((Context) ((hd.a) this.b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // k1.f
    public ee.b getData() {
        return ((z) this.b).c;
    }

    @Override // oe.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public void i(androidx.biometric.e eVar, b2.t tVar, m mVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        tVar.c = cancellationSignal3;
                        if (tVar.b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) tVar.c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager w9 = w((Context) this.b);
        if (w9 != null) {
            if (eVar != null) {
                Mac mac = (Mac) eVar.d;
                Signature signature = (Signature) eVar.b;
                Cipher cipher = (Cipher) eVar.c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            w9.authenticate(cryptoObject, cancellationSignal, 0, new a(mVar), null);
        }
    }

    @Override // oe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // k2.x
    public void j() {
        ((w0) this.b).l1 = true;
    }

    @Override // k2.x
    public void k() {
        k0 k0Var = ((w0) this.b).Y;
        if (k0Var != null) {
            k0Var.a.i0 = true;
        }
    }

    @Override // ki.g1
    public void l(h1 h1Var) {
        ki.a aVar;
        g5 g5Var = (g5) this.b;
        ki.e5 e5Var = g5Var.s;
        if (e5Var == null || (aVar = g5Var.a) == null) {
            return;
        }
        w3 w3Var = ((b3) e5Var).a;
        ArrayList arrayList = w3Var.j3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((ki.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        h2 h2Var = w3Var.H3;
        if (h2Var != null) {
            h2Var.d();
        }
        ki.a aVar2 = new ki.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            g.y(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        w3Var.t4();
        w3Var.W2.N(false);
        h2 h2Var2 = w3Var.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        w3Var.post(new o2(w3Var, aVar2, 26));
    }

    public void n(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // oe.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // oe.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        c71 c71Var = (c71) this.b;
        float f11 = -dp;
        c71Var.g.inset(f11, f11);
        boolean contains = c71Var.g.contains(f7, f10);
        float f12 = dp;
        c71Var.g.inset(f12, f12);
        return contains;
    }

    @Override // oe.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void o(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.b).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.c).c(nVar, 2441);
        }
    }

    @Override // k2.x
    public void onAudioSessionIdChanged(int i10) {
        j jVar;
        w0 w0Var = (w0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = w0Var.c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = w0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override // oe.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((c71) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // oe.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((c71) this.b).h.c(true);
    }

    @Override // oe.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((c71) this.b).h.c(false);
    }

    @Override // org.telegram.ui.x9
    public void onDismiss() {
        b1 b1Var = (b1) this.b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.x71
    public void onError(a81 a81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // oe.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.x
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((w0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.t(12, bVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void onStateChanged(boolean z10, int i10) {
        m60 m60Var;
        VideoEditedInfo videoEditedInfo;
        f60 f60Var = (f60) this.b;
        a81 a81Var = f60Var.H0.T;
        if (a81Var != null && a81Var.y() && i10 == 4 && (videoEditedInfo = (m60Var = f60Var.H0).S) != null) {
            a81 a81Var2 = m60Var.T;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            a81Var2.K(j10);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // l.i
    public boolean p(k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // org.telegram.ui.x9
    public String p0() {
        return ((b1) this.b).i0;
    }

    @Override // ki.g1
    public /* synthetic */ boolean q(h1 h1Var) {
        return false;
    }

    @Override // bh.h
    public void r(Canvas canvas) {
        switch (this.a) {
            case 13:
                ti tiVar = (ti) this.b;
                canvas.drawColor(tiVar.getThemedColor(h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    tiVar.F2.b(canvas, -3);
                    break;
                }
                break;
            default:
                dr0 dr0Var = (dr0) this.b;
                canvas.drawColor(dr0Var.getThemedColor(h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    dr0Var.O0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // k2.x
    public void s(int i10, long j10, long j11) {
        qf.b bVar = ((w0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new s(bVar, i10, j10, j11, 0));
        }
    }

    @Override // ki.j0
    public org.telegram.ui.Cells.n9 t() {
        r3 r3Var = ((z0) this.b).S;
        if (r3Var == null) {
            return null;
        }
        return r3Var.a.getTextSelectionHelper();
    }

    @Override // s4.d0
    public void t0(int i10, int i11) {
        ((g0) this.b).t(i10, i11);
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // l.w
    public boolean u(k kVar) {
        m.i iVar = (m.i) this.b;
        if (kVar == iVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        iVar.getClass();
        w wVar = iVar.e;
        if (wVar != null) {
            return wVar.u(kVar);
        }
        return false;
    }

    @Override // ki.j0
    public void v(CharSequence charSequence) {
        r3 r3Var = ((z0) this.b).S;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            r3Var.a.u4(charSequence.toString());
        }
    }

    @Override // r4.d
    public void x() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // s4.d0
    public void y(int i10, int i11) {
        ((g0) this.b).p(i10, i11);
    }

    @Override // r4.d
    public void z(int i10, Object obj) {
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

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 29:
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void onRenderedFirstFrame() {
    }

    public b(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 21;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    @Override // rg.v1
    public float get() {
        return ((m2) this.b).F;
    }

    public b(EditText editText) {
        this.a = 20;
        this.b = new mi.q(editText);
    }

    public b(int i10, int i11) {
        this.a = 15;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // ki.g1
    public /* synthetic */ void m() {
    }

    @Override // ki.g1
    public /* synthetic */ void D(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ki.g1
    public /* synthetic */ void h(int i10, int i11) {
    }

    @Override // oe.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
