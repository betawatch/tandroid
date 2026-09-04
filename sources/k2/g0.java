package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.wp0;
import zh.w3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g0 implements n, l.j, l2.h, k1.f, d5, bh.h, d71, g81, com.google.android.gms.common.api.internal.s, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener, wp0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void A(float f7) {
        i81 i81Var = (i81) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = i81Var.e;
            View[] viewArr2 = i81Var.e;
            if (viewArr[1] != null) {
                i81Var.F();
                i81Var.h.put(i81Var.f[1], viewArr2[1]);
                i81Var.removeView(viewArr2[1]);
                i81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            i81Var.z(i81Var.b);
            return;
        }
        View[] viewArr3 = i81Var.e;
        View[] viewArr4 = i81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (i81Var.y) {
            i81Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            i81Var.E(viewArr4[0], (-r2.getMeasuredWidth()) * f7);
        } else {
            i81Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            i81Var.E(viewArr4[0], r2.getMeasuredWidth() * f7);
        }
        i81Var.w(false);
    }

    public void B() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + D());
    }

    public void C(long j3) {
        long D = D();
        if (D != j3) {
            if (D != -1) {
                if (D != -2) {
                    return;
                } else {
                    D = -2;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(D);
            throw new IOException(t10.toString());
        }
    }

    public long D() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
        f0Var.l0(i10, i11, z10);
        f0Var.dismiss();
    }

    @Override // k2.n
    public void K() {
        ((h0) this.b).h1 = true;
    }

    @Override // k2.n
    public void O(k kVar) {
        n4.y yVar = ((h0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    @Override // k2.n
    public void T() {
        i2.i0 i0Var = ((h0) this.b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // k2.n
    public void V(k kVar) {
        n4.y yVar = ((h0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override // l2.h
    public long a(long j3) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        n6.o oVar = (n6.o) this.b;
        Parcel I0 = aVar.I0();
        k7.a.c(I0, oVar);
        try {
            aVar.b.transact(1, I0, null, 1);
            I0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            I0.recycle();
            throw th2;
        }
    }

    @Override // k2.n
    public void b(long j3) {
        n4.y yVar = ((h0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new bi.g(yVar, j3, 12));
        }
    }

    @Override // k2.n
    public void d() {
        ((h0) this.b).j1 = true;
    }

    @Override // l2.h
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // l2.h
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // l2.h
    public m2.j g(long j3) {
        return (m2.j) this.b;
    }

    @Override // fd.a
    public Object get() {
        return new s5.i((Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override // k1.f
    public ce.b getData() {
        return ((k1.a0) this.b).c;
    }

    @Override // k1.f
    public Object h(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.b).h(new n1.c(pVar, null, 0), cVar);
    }

    public boolean i(int i10) {
        a81 a81Var = ((i81) this.b).L;
        if (a81Var == null) {
            return false;
        }
        return a81Var.c(i10);
    }

    public void j(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        switch (this.a) {
            case 9:
                vi viVar = (vi) this.b;
                canvas.drawColor(viVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    break;
                }
                break;
            default:
                hq0 hq0Var = (hq0) this.b;
                canvas.drawColor(hq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    hq0Var.O0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    @Override // k2.n
    public void l() {
        i2.i0 i0Var = ((h0) this.b).W;
        if (i0Var != null) {
            i0Var.a.g0 = true;
        }
    }

    public void m() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // l.j
    public void n(l.l lVar) {
        xa.c cVar = ((ActionMenuView) this.b).K;
        if (cVar != null) {
            cVar.n(lVar);
        }
    }

    @Override // l2.h
    public long o(long j3, long j10) {
        return 0L;
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        h0 h0Var = (h0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = h0Var.a1) != null) {
            jVar.d(i10);
        }
        n4.y yVar = h0Var.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ah.g(yVar, i10, 12));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.M0(e0Var, false, null);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((h0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ah.u(8, yVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        w50 w50Var;
        VideoEditedInfo videoEditedInfo;
        v50 v50Var = (v50) this.b;
        g71 g71Var = v50Var.H0.O;
        if (g71Var != null && g71Var.y() && i10 == 4 && (videoEditedInfo = (w50Var = v50Var.H0).N) != null) {
            g71 g71Var2 = w50Var.O;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            g71Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void p(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // k2.n
    public void q(int i10, long j3, long j10) {
        n4.y yVar = ((h0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    public StringBuilder r() {
        df.a aVar = (df.a) this.b;
        if (!(aVar instanceof ye.m)) {
            return null;
        }
        StringBuilder sb2 = ((ye.m) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // l.j
    public boolean s(l.l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.b).P;
        if (kVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((l.d) kVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // l2.h
    public boolean t() {
        return true;
    }

    @Override // l2.h
    public long u() {
        return 0L;
    }

    @Override // bh.h
    public void v(bh.a aVar) {
        switch (this.a) {
            case 9:
                aVar.a(((vi) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((hq0) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // l2.h
    public long w(long j3) {
        return 1L;
    }

    @Override // k2.n
    public void x() {
        x2.p pVar;
        h0 h0Var = (h0) this.b;
        synchronized (h0Var.a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // l2.h
    public long y(long j3, long j10) {
        return 1L;
    }

    @Override // k2.n
    public void z(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((h0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override // org.telegram.ui.Components.wp0
    public void z0() {
        qc k10 = ((w3) this.b).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public g0(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new SparseArray();
                break;
            case 11:
                this.b = new HashMap();
                break;
            case 19:
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
    }

    public g0(Context context, n4.y yVar) {
        this.a = 4;
        n4.x xVar = ((n4.r) yVar.b).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, xVar);
        } else {
            this.b = new n4.j(context, xVar);
        }
    }

    @Override // org.telegram.ui.Components.wp0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // l2.h
    public long c(long j3, long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
