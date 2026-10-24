package k2;

import ai.v3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import gi.m4;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ki.b3;
import ki.e5;
import ki.g1;
import ki.g5;
import ki.h1;
import ki.h2;
import ki.o2;
import ki.r3;
import ki.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ti;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class w0 implements y, ki.j0, g1, l.w, l.i, k1.f, d5, bh.h, g81, oe.a, com.google.android.gms.common.api.internal.r, n5.b, v0.i {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ki.j0
    public void A(CharSequence charSequence) {
        r3 r3Var = ((ki.z0) this.b).S;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            r3Var.a.z4(charSequence.toString());
        }
    }

    @Override // k2.y
    public void B() {
        x2.n nVar;
        x0 x0Var = (x0) this.b;
        synchronized (x0Var.a) {
            nVar = x0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // ki.j0
    public n9 D() {
        return (ki.z0) this.b;
    }

    @Override // ki.j0
    public ki.a F() {
        return ((ki.z0) this.b).a;
    }

    @Override // ki.g1
    public void G(Editable editable) {
        ((g5) this.b).g();
    }

    @Override // ki.j0
    public boolean H() {
        ki.z0 z0Var = (ki.z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var == null) {
            return false;
        }
        ki.a aVar = z0Var.a;
        return r3Var.a.Y4();
    }

    @Override // k2.y
    public void I(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r(bVar, exc, 1));
        }
    }

    @Override // bh.h
    public void J(bh.a aVar) {
        switch (this.a) {
            case 11:
                aVar.a(((ti) this.b).getThemedColor(k6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((ir0) this.b).getThemedColor(k6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // ki.j0
    public void K(int i10, int i11) {
        ki.z0 z0Var = (ki.z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.a;
            h2 h2Var = r3Var.a.K3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override // k2.y
    public void L() {
        ((x0) this.b).j1 = true;
    }

    @Override // ki.g1
    public /* synthetic */ boolean M(boolean z10) {
        return false;
    }

    @Override // ki.j0
    public void N() {
        ki.z0 z0Var = (ki.z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.a;
            w3 w3Var = r3Var.a;
            h2 h2Var = w3Var.K3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.i3.onContentChanged();
        }
    }

    @Override // ki.g1
    public /* synthetic */ boolean P(h1 h1Var) {
        return false;
    }

    @Override // k2.y
    public void Q(u0 u0Var) {
        qf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, u0Var, 1));
        }
    }

    @Override // ki.g1
    public void R(h1 h1Var, int i10, int i11) {
        e5 e5Var;
        o9 textSelectionHelper;
        g5 g5Var = (g5) this.b;
        if (g5Var.w || i10 == i11 || (e5Var = g5Var.s) == null || (textSelectionHelper = ((b3) e5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new m4(this, h1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // k2.y
    public void T(u0 u0Var) {
        qf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, u0Var, 0));
        }
    }

    @Override // k2.y
    public void U() {
        i2.k0 k0Var = ((x0) this.b).Y;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // ki.j0
    public void X() {
        ki.z0 z0Var = (ki.z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.a;
            w3.U1(r3Var.a);
        }
    }

    @Override // k2.y
    public void a(long j10) {
        x0 x0Var = (x0) this.b;
        x0Var.m1 = true;
        qf.b bVar = x0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new v3(bVar, j10, 13));
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                g8.e eVar = (g8.e) this.b;
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel N0 = zVar.N0();
                r7.d.c(N0, eVar);
                r7.d.d(N0, fVar);
                N0.writeString(null);
                zVar.R0(N0, 63);
                return;
            default:
                v8.j jVar = (v8.j) this.b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.O(Status.h, null);
                    return;
                }
        }
    }

    @Override // k1.f
    public Object b(td.p pVar, md.c cVar) {
        return ((k1.z) this.b).b(new n1.c(pVar, null, 0), cVar);
    }

    @Override // ki.j0
    public void c(h1 h1Var) {
        switch (this.a) {
            case 1:
                r3 r3Var = ((ki.z0) this.b).S;
                if (r3Var != null) {
                    w3 w3Var = r3Var.a;
                    w3.S1(w3Var, h1Var);
                    w3Var.i3.o(h1Var, true);
                    break;
                }
                break;
            default:
                e5 e5Var = ((g5) this.b).s;
                if (e5Var != null) {
                    w3 w3Var2 = ((b3) e5Var).a;
                    w3.S1(w3Var2, h1Var);
                    w3Var2.i3.o(h1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((m.i) this.b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override // ki.g1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // oe.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // ki.j0
    public void g() {
        ki.z0 z0Var = (ki.z0) this.b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            w3.V1(r3Var.a, z0Var.a);
        }
    }

    @Override // hd.a
    public Object get() {
        return new s5.i((Context) ((hd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override // k1.f
    public ee.b getData() {
        return ((k1.z) this.b).c;
    }

    @Override // oe.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public void h(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        p4.u uVar = eVar.x.a;
        String d = mVar.d();
        p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // l.i
    public void i(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.i iVar = toolbar.a.J;
        if (iVar == null || !iVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.b0) it.next()).a.t();
            }
        }
    }

    @Override // oe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // k2.y
    public void j() {
        ((x0) this.b).l1 = true;
    }

    @Override // ki.g1
    public void k(h1 h1Var) {
        ki.a aVar;
        g5 g5Var = (g5) this.b;
        e5 e5Var = g5Var.s;
        if (e5Var == null || (aVar = g5Var.a) == null) {
            return;
        }
        w3 w3Var = ((b3) e5Var).a;
        ArrayList arrayList = w3Var.m3;
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
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        ki.a aVar2 = new ki.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.y(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        w3Var.y4();
        w3Var.Z2.N(false);
        h2 h2Var2 = w3Var.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        w3Var.post(new o2(w3Var, aVar2, 26));
    }

    @Override // k2.y
    public void l() {
        i2.k0 k0Var = ((x0) this.b).Y;
        if (k0Var != null) {
            k0Var.a.i0 = true;
        }
    }

    public byte n() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // oe.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // oe.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        l71 l71Var = (l71) this.b;
        float f11 = -dp;
        l71Var.g.inset(f11, f11);
        boolean contains = l71Var.g.contains(f7, f10);
        float f12 = dp;
        l71Var.g.inset(f12, f12);
        return contains;
    }

    @Override // oe.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // l.w
    public boolean o(l.k kVar) {
        m.i iVar = (m.i) this.b;
        if (kVar == iVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        iVar.getClass();
        l.w wVar = iVar.e;
        if (wVar != null) {
            return wVar.o(kVar);
        }
        return false;
    }

    @Override // k2.y
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        x0 x0Var = (x0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = x0Var.c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = x0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override // oe.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((l71) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // oe.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((l71) this.b).h.c(true);
    }

    @Override // oe.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((l71) this.b).h.c(false);
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        be.m mVar = (be.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(i8.a(e));
        }
    }

    @Override // oe.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        be.m mVar = (be.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // k2.y
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.t(12, bVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.g81
    public void onStateChanged(boolean z10, int i10) {
        n60 n60Var;
        VideoEditedInfo videoEditedInfo;
        f60 f60Var = (f60) this.b;
        j81 j81Var = f60Var.H0.T;
        if (j81Var != null && j81Var.y() && i10 == 4 && (videoEditedInfo = (n60Var = f60Var.H0).S) != null) {
            j81 j81Var2 = n60Var.T;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            j81Var2.K(j10);
        }
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // l.i
    public boolean p(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    public int q() {
        return ((n() & 255) << 24) | ((n() & 255) << 16) | ((n() & 255) << 8) | (n() & 255);
    }

    public int r() {
        return ((n() & Byte.MAX_VALUE) << 21) | ((n() & Byte.MAX_VALUE) << 14) | ((n() & Byte.MAX_VALUE) << 7) | (n() & Byte.MAX_VALUE);
    }

    @Override // ki.g1
    public /* synthetic */ boolean s(h1 h1Var) {
        return false;
    }

    @Override // k2.y
    public void t(int i10, long j10, long j11) {
        qf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, i10, j10, j11, 0));
        }
    }

    public void u(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // ki.j0
    public o9 w() {
        r3 r3Var = ((ki.z0) this.b).S;
        if (r3Var == null) {
            return null;
        }
        return r3Var.a.getTextSelectionHelper();
    }

    @Override // bh.h
    public void z(Canvas canvas) {
        switch (this.a) {
            case 11:
                ti tiVar = (ti) this.b;
                canvas.drawColor(tiVar.getThemedColor(k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    tiVar.I2.b(canvas, -3);
                    break;
                }
                break;
            default:
                ir0 ir0Var = (ir0) this.b;
                canvas.drawColor(ir0Var.getThemedColor(k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ir0Var.P0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    public w0(int i10) {
        this.a = i10;
        switch (i10) {
            case 26:
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    @Override // org.telegram.ui.Components.g81
    public void onRenderedFirstFrame() {
    }

    public w0(TextView textView) {
        this.a = 17;
        this.b = new q1.g(textView);
    }

    @Override // org.telegram.ui.Components.g81
    public void onError(j81 j81Var, Exception exc) {
        FileLog.e(exc);
    }

    public w0(int i10, int i11) {
        this.a = 13;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // ki.g1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ki.g1
    public /* synthetic */ void x(CharSequence charSequence) {
    }

    @Override // ki.g1
    public /* synthetic */ void f(int i10, int i11) {
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

    @Override // org.telegram.ui.Components.g81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
