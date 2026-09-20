package k2;

import ai.n8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vi;
import pg.u0;
import qg.w1;
import qg.x0;
import v7.u7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class u implements n, l.x, l.j, k1.f, c5, ah.k, q71, me.a, w1, com.google.android.gms.common.api.internal.o, s4.e0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // k2.n
    public void G() {
        x2.q qVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            qVar = ffmpegAudioRenderer.H;
        }
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // ah.k
    public void K(ah.a aVar) {
        switch (this.a) {
            case 12:
                aVar.a(((vi) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((uq0) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // s4.e0
    public void M0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // k2.n
    public void P(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override // k2.n
    public void S() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // k2.n
    public void V(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    @Override // k1.f
    public Object a(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
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
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override // k2.n
    public void b(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    public l5.j c() {
        Context context = (Context) this.b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l5.j jVar = new l5.j();
        jVar.a = n5.a.a(l5.m.a);
        a9.r rVar = new a9.r(context);
        jVar.b = rVar;
        jVar.c = n5.a.a(new m5.e(0, rVar, new a4.m(rVar, 29)));
        a9.r rVar2 = jVar.b;
        jVar.d = new l.d(rVar2);
        fd.a a2 = n5.a.a(new m5.e(20, jVar.d, n5.a.a(new u(rVar2, 25))));
        jVar.e = a2;
        qb.b bVar = new qb.b(19);
        a9.r rVar3 = jVar.b;
        lf.h hVar = new lf.h(rVar3, a2, bVar, 21);
        fd.a aVar = jVar.a;
        fd.a aVar2 = jVar.c;
        cf.c cVar = new cf.c(aVar, aVar2, hVar, a2, a2);
        p3 p3Var = new p3();
        p3Var.a = rVar3;
        p3Var.b = aVar2;
        p3Var.c = a2;
        p3Var.d = hVar;
        p3Var.e = aVar;
        p3Var.f = a2;
        p3Var.h = a2;
        oi.f fVar = new oi.f();
        fVar.a = aVar;
        fVar.b = a2;
        fVar.c = hVar;
        fVar.d = a2;
        jVar.f = n5.a.a(new aa.a(cVar, p3Var, fVar, false, 28));
        return jVar;
    }

    @Override // ah.k
    public void d(Canvas canvas) {
        switch (this.a) {
            case 12:
                vi viVar = (vi) this.b;
                canvas.drawColor(viVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    break;
                }
                break;
            default:
                uq0 uq0Var = (uq0) this.b;
                canvas.drawColor(uq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    uq0Var.O0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    public void e() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + h());
    }

    public void f(long j3) {
        long h = h();
        if (h != j3) {
            if (h != -1) {
                if (h != -2) {
                    return;
                } else {
                    h = -2;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(h);
            throw new IOException(t10.toString());
        }
    }

    @Override // me.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // l.x
    public void g(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).z.k().c(false);
        }
        l.x xVar = ((m.h) this.b).e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override // fd.a
    public Object get() {
        String packageName = ((Context) ((fd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // k1.f
    public ce.b getData() {
        return ((k1.a0) this.b).c;
    }

    @Override // me.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public long h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // k2.n
    public void j0(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // s4.e0
    public void k1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void l(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // me.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // me.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        v61 v61Var = (v61) this.b;
        float f11 = -dp;
        v61Var.g.inset(f11, f11);
        boolean contains = v61Var.g.contains(f7, f10);
        float f12 = dp;
        v61Var.g.inset(f12, f12);
        return contains;
    }

    @Override // me.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // k2.n
    public void o() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new n8(yVar, i10, 11));
        }
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((v61) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // me.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((v61) this.b).h.c(true);
    }

    @Override // me.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((v61) this.b).h.c(false);
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(u7.a(e));
        }
    }

    @Override // me.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        a60 a60Var;
        VideoEditedInfo videoEditedInfo;
        u50 u50Var = (u50) this.b;
        t71 t71Var = u50Var.H0.R;
        if (t71Var != null && t71Var.y() && i10 == 4 && (videoEditedInfo = (a60Var = u50Var.H0).Q) != null) {
            t71 t71Var2 = a60Var.R;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            t71Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // l.j
    public void r(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.h hVar = toolbar.a.J;
        if (hVar == null || !hVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.c0) it.next()).a.t();
            }
        }
    }

    @Override // l.j
    public boolean t(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // l.x
    public boolean v(l.l lVar) {
        m.h hVar = (m.h) this.b;
        if (lVar == hVar.c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        l.x xVar = hVar.e;
        if (xVar != null) {
            return xVar.v(lVar);
        }
        return false;
    }

    @Override // k2.n
    public void x(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.a;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    @Override // qg.w1
    public void y(float f7) {
        x0 x0Var = (x0) this.b;
        u0.e(x0Var.a).k("-1", f7);
        x0Var.e.setBrushSize(f7);
    }

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
    }

    public u(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.b = new SparseArray();
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // qg.w1
    public float get() {
        x0 x0Var = (x0) this.b;
        int i10 = x0Var.a;
        pg.m currentBrush = x0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
    }

    public u(TextView textView) {
        this.a = 19;
        this.b = new q1.g(textView);
    }

    public u(Context context, n4.y yVar) {
        this.a = 7;
        n4.x xVar = ((n4.r) yVar.a).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, xVar);
        } else {
            this.b = new n4.j(context, xVar);
        }
    }

    public u(int i10, int i11) {
        this.a = 14;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a4.a.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // k2.n
    public /* synthetic */ void e0() {
    }

    @Override // k2.n
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // me.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
