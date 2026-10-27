package jg;

import a8.fg;
import a8.lg;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import li.m4;
import li.o4;
import li.r3;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.Components.yl;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.pi0;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class i implements ri, m.e2, y2.g, ip0, e5, li.i0, l.w, l.i, o0.a, u2.e1, lp0, oe.f, tb, q81, zu0, t91, com.google.android.gms.common.api.internal.r, r2.m, s4.j1, com.google.android.gms.common.api.internal.o, sg.w1 {
    public final Object a;

    public /* synthetic */ i(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.ui.Components.ri
    public void A(gh ghVar) {
        int i10;
        i10 = ((r2) ((n) this.a)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(ghVar);
    }

    @Override // y2.g
    public void B(y2.i iVar, long j10, long j11) {
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.a;
        long j13 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        gVar.m.getClass();
        gVar.q.q(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f;
        m2.c cVar2 = gVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j14 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && gVar.G.b(i10).b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = gVar.M;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || cVar.h * 1000 > j15) {
                    gVar.L = 0;
                } else {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.M);
                }
            }
            int i11 = gVar.L;
            gVar.L = i11 + 1;
            if (i11 < gVar.m.B0(oVar.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.L - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new w4();
                return;
            }
        }
        j12 = -9223372036854775807L;
        gVar.G = cVar;
        gVar.H = cVar.d & gVar.H;
        gVar.I = j10 - j11;
        gVar.J = j10;
        gVar.N += i10;
        synchronized (gVar.t) {
            try {
                if (oVar.b.a.equals(gVar.E)) {
                    Uri uri = gVar.G.k;
                    if (uri == null) {
                        uri = w7.i0.a(oVar.d.c);
                    }
                    gVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.G;
        if (!cVar3.d || gVar.K != j12) {
            gVar.z(true);
            return;
        }
        m2.t tVar = cVar3.i;
        if (tVar == null) {
            gVar.w();
            return;
        }
        String str = tVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.K = e2.n0.V(tVar.c) - gVar.J;
                gVar.z(true);
                return;
            } catch (b2.x0 e) {
                gVar.y(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            gVar.A(tVar, new l2.f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            gVar.A(tVar, new qb.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.w();
        } else {
            gVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // li.i0
    public s9 C() {
        m4 m4Var = ((o4) this.a).G;
        if (m4Var != null) {
            return ((r3) m4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // o0.a
    public Cursor D(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // l.i
    public boolean F(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.a).getClass();
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        li.b2 b2Var = (li.b2) this.a;
        b2Var.t0(i10, i11, z10);
        pi0 pi0Var = b2Var.O0;
        if (pi0Var != null) {
            pi0Var.h();
            b2Var.O0 = null;
        }
    }

    @Override // li.i0
    public void I(CharSequence charSequence) {
        m4 m4Var = ((o4) this.a).G;
        if (m4Var != null) {
            r3 r3Var = (r3) m4Var;
            r3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            r3Var.a.z4(charSequence.toString());
        }
    }

    @Override // s4.j1
    public int J() {
        s4.p0 p0Var = (s4.p0) this.a;
        return p0Var.m - p0Var.E();
    }

    @Override // li.i0
    public r9 K() {
        return (o4) this.a;
    }

    @Override // li.i0
    public li.a L() {
        return ((o4) this.a).a;
    }

    @Override // li.i0
    public boolean M() {
        o4 o4Var = (o4) this.a;
        m4 m4Var = o4Var.G;
        if (m4Var == null) {
            return false;
        }
        li.a aVar = o4Var.a;
        return ((r3) m4Var).a.Y4();
    }

    @Override // li.i0
    public void O(int i10, int i11) {
        o4 o4Var = (o4) this.a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.a;
            li.f2 f2Var = ((r3) m4Var).a.R3;
            if (f2Var != null) {
                f2Var.f(i10, i11);
            }
        }
    }

    @Override // oe.f
    public void P() {
        ((o9) this.a).a.invalidate();
    }

    @Override // m.e2
    public void Q(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.a;
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
        handler.postAtTime(new fg(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, false, 2), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // org.telegram.ui.Components.tb
    public void Q0(ub ubVar, fb fbVar, pg pgVar, yl ylVar) {
        rg0.e((rg0) this.a, true, fbVar, pgVar, ylVar);
    }

    @Override // li.i0
    public void S() {
        o4 o4Var = (o4) this.a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.a;
            v3 v3Var = ((r3) m4Var).a;
            li.f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.p3.onContentChanged();
        }
    }

    @Override // org.telegram.ui.Components.lp0
    public void U(float f7, boolean z10) {
        ya1 ya1Var = (ya1) ((org.telegram.ui.Cells.j0) this.a);
        int i10 = (int) (y6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        y6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = ya1Var.f.e;
            wl0 wl0Var = (wl0) themeActivity.b.K(themeActivity.f0);
            if (wl0Var != null) {
                ((i9) wl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (y6.q * 100.0f))));
            }
            y6.E(true);
        }
    }

    @Override // sg.w1
    public void V(float f7) {
        sg.w0 w0Var = (sg.w0) this.a;
        rg.s0.e(w0Var.a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override // s4.j1
    public View W(int i10) {
        return ((s4.p0) this.a).q(i10);
    }

    @Override // s4.j1
    public int X(View view) {
        return s4.p0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).rightMargin;
    }

    @Override // org.telegram.ui.Components.zu0
    public org.telegram.ui.ActionBar.g1 Z(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        bw0 bw0Var = (bw0) this.a;
        org.telegram.ui.ActionBar.g1 e = bw0Var.I.e(0, i10, str);
        if (z10) {
            int i11 = y6.p7;
            e.d(bw0Var.p0(i11), bw0Var.p0(i11));
        }
        e.setOnClickListener(new qc0(this, z11, runnable));
        return e;
    }

    @Override // li.i0
    public void a0() {
        o4 o4Var = (o4) this.a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.a;
            v3.U1(((r3) m4Var).a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q6.a aVar = (q6.a) ((q6.c) obj).u();
        o6.o oVar = (o6.o) this.a;
        Parcel H0 = aVar.H0();
        l7.a.c(H0, oVar);
        try {
            aVar.b.transact(1, H0, null, 1);
            H0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            H0.recycle();
            throw th2;
        }
    }

    @Override // li.i0
    public void b(li.g1 g1Var) {
        m4 m4Var = ((o4) this.a).G;
        if (m4Var != null) {
            v3 v3Var = ((r3) m4Var).a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    public boolean b0(int i10) {
        n91 n91Var = ((v91) this.a).L;
        if (n91Var == null) {
            return false;
        }
        return n91Var.c(i10);
    }

    @Override // org.telegram.ui.Components.ip0
    public void c(float f7) {
        li.y yVar = (li.y) this.a;
        MessageObject messageObject = yVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(yVar.P, f7);
    }

    public s0.d c0(int i10) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                f4.e((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // r2.m
    public void d(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.a).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public s0.d d0(int i10) {
        return null;
    }

    @Override // r2.m
    public void e(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i10, 0, dVar.i, j10, i11);
    }

    public void e0(float f7) {
        v91 v91Var = (v91) this.a;
        View[] viewArr = v91Var.e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                v91Var.G();
                v91Var.h.put(v91Var.f[1], viewArr[1]);
                v91Var.removeView(viewArr[1]);
                v91Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            v91Var.A(v91Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (v91Var.y) {
            v91Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            v91Var.F(viewArr[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            v91Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            v91Var.F(viewArr[0], r1.getMeasuredWidth() * f7);
        }
        v91Var.x(false);
    }

    @Override // org.telegram.ui.Components.ip0
    public void f(float f7) {
        MessageObject messageObject = ((li.y) this.a).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    public void f0() {
        o2.k kVar = (o2.k) this.a;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                q1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.r1(q1VarArr);
        kVar.G.n(kVar);
    }

    @Override // l.w
    public void g(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((m.h) this.a).e;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g0(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        w20 w20Var;
        boolean z11;
        v20 v20Var = (v20) this.a;
        int i10 = v20.w;
        w20 w20Var2 = v20Var.f;
        androidx.mediarouter.app.c cVar = v20Var.e;
        int action = motionEvent.getAction();
        if (v20Var.v == null) {
            v20Var.v = VelocityTracker.obtain();
        }
        v20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 = motionEvent.getX(i12) + f7;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (v20Var.g != null && w20Var2.a()) {
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = v20Var.m;
                if (motionEvent4 != null && (motionEvent3 = v20Var.n) != null && hasMessages && v20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x9 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x9 * x9) < v20Var.b) {
                        v20Var.o = true;
                        z10 = v20Var.g.onDoubleTap(v20Var.m) | v20Var.g.onDoubleTapEvent(motionEvent);
                        v20Var.p = f12;
                        v20Var.r = f12;
                        v20Var.q = f13;
                        v20Var.s = f13;
                        motionEvent2 = v20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        v20Var.m = MotionEvent.obtain(motionEvent);
                        v20Var.k = true;
                        v20Var.l = true;
                        v20Var.h = true;
                        v20Var.j = false;
                        v20Var.i = false;
                        if (v20Var.t) {
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, v20Var.m.getDownTime() + i10 + v20Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, v20Var.m.getDownTime() + i10);
                        return w20Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            v20Var.p = f12;
            v20Var.r = f12;
            v20Var.q = f13;
            v20Var.s = f13;
            motionEvent2 = v20Var.m;
            if (motionEvent2 != null) {
            }
            v20Var.m = MotionEvent.obtain(motionEvent);
            v20Var.k = true;
            v20Var.l = true;
            v20Var.h = true;
            v20Var.j = false;
            v20Var.i = false;
            if (v20Var.t) {
            }
            cVar.sendEmptyMessageAtTime(1, v20Var.m.getDownTime() + i10);
            return w20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            v20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (v20Var.o) {
                onFling = v20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (v20Var.j) {
                    cVar.removeMessages(3);
                    v20Var.j = false;
                } else if (v20Var.k) {
                    boolean onSingleTapUp = w20Var2.onSingleTapUp(motionEvent);
                    if (v20Var.i && (w20Var = v20Var.g) != null) {
                        w20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = v20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, v20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > v20Var.c || Math.abs(xVelocity) > v20Var.c) {
                        onFling = w20Var2.onFling(v20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = v20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            v20Var.n = obtain;
            VelocityTracker velocityTracker2 = v20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                v20Var.v = null;
            }
            v20Var.o = false;
            v20Var.i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                v20Var.v.recycle();
                v20Var.v = null;
                v20Var.o = false;
                v20Var.h = false;
                v20Var.k = false;
                v20Var.l = false;
                v20Var.i = false;
                if (v20Var.j) {
                    v20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                v20Var.p = f12;
                v20Var.r = f12;
                v20Var.q = f13;
                v20Var.s = f13;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                v20Var.o = false;
                v20Var.k = false;
                v20Var.l = false;
                v20Var.i = false;
                if (v20Var.j) {
                    v20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                v20Var.p = f12;
                v20Var.r = f12;
                v20Var.q = f13;
                v20Var.s = f13;
                v20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, v20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = v20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = v20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((v20Var.v.getYVelocity(pointerId3) * yVelocity2) + (v20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            v20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!v20Var.j) {
            float f14 = v20Var.p - f12;
            float f15 = v20Var.q - f13;
            if (v20Var.o) {
                return v20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (v20Var.k) {
                int i14 = (int) (f12 - v20Var.r);
                int i15 = (int) (f13 - v20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > v20Var.a) {
                    z11 = w20Var2.onScroll(v20Var.m, motionEvent, f14, f15);
                    v20Var.p = f12;
                    v20Var.q = f13;
                    v20Var.k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > v20Var.a) {
                    v20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = w20Var2.onScroll(v20Var.m, motionEvent, f14, f15);
                v20Var.p = f12;
                v20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // sg.w1
    public float get() {
        sg.w0 w0Var = (sg.w0) this.a;
        int i10 = w0Var.a;
        rg.m currentBrush = w0Var.e.getCurrentBrush();
        return currentBrush == null ? rg.s0.e(i10).i : rg.s0.e(i10).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.lp0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // li.i0
    public void h() {
        o4 o4Var = (o4) this.a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            v3.V1(((r3) m4Var).a, o4Var.a);
        }
    }

    public boolean h0(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void i0(s4.e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        boolean z10;
        s4.e1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.b.k(e1Var);
        recyclerView.h(e1Var);
        e1Var.q(false);
        s4.g1 g1Var = (s4.g1) recyclerView.c0;
        g1Var.getClass();
        int i11 = v0Var.a;
        int i12 = v0Var.b;
        View view = e1Var.a;
        int left = v0Var2 == null ? view.getLeft() : v0Var2.a;
        int top = v0Var2 == null ? view.getTop() : v0Var2.b;
        if (e1Var.j() || (i11 == left && i12 == top)) {
            int i13 = e1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            e1Var.i = (e1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            g1Var.s(e1Var, v0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = g1Var.r(e1Var, v0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    @Override // oe.f
    public /* synthetic */ boolean j() {
        return false;
    }

    public void j0(s4.e1 e1Var) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        s4.p0 p0Var = recyclerView.x;
        View view = e1Var.a;
        rf.e eVar = recyclerView.b;
        s4.d dVar = p0Var.a;
        s0 s0Var = (s0) dVar.b;
        int indexOfChild = ((RecyclerView) s0Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((lg) dVar.c).D(indexOfChild)) {
                dVar.u(view);
            }
            s0Var.h0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // oe.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.lp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // y2.g
    public void l0(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.g) this.a).x((y2.o) iVar, j10, j11);
    }

    @Override // s4.j1
    public int m(View view) {
        return s4.p0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).leftMargin;
    }

    public void m0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + o0());
    }

    public void n0(long j10) {
        long o02 = o0();
        if (o02 != j10) {
            if (o02 != -1) {
                if (o02 != -2) {
                    return;
                } else {
                    o02 = -2;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(o02);
            throw new IOException(t10.toString());
        }
    }

    @Override // org.telegram.ui.Components.tb
    public void o(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        rg0.e((rg0) this.a, false, fbVar, dbVar, gbVar);
    }

    public long o0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.a;
        if (z10 && hl0Var.n.n() >= 0) {
            hl0Var.w = true;
        }
        eh0 eh0Var = hl0Var.f;
        xa0 xa0Var = hl0Var.x;
        eh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(xa0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void p(Object obj) {
        ((h8.c) obj).onLocationAvailability((LocationAvailability) this.a);
    }

    @Override // m.e2
    public void q(l.k kVar, MenuItem menuItem) {
        ((l.e) this.a).f.removeCallbacksAndMessages(kVar);
    }

    @Override // l.i
    public void r(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.a;
        m.h hVar = toolbar.a.J;
        if (hVar == null || !hVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.a0) it.next()).a.t();
            }
        }
    }

    @Override // s4.j1
    public int s() {
        return ((s4.p0) this.a).D();
    }

    @Override // r2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // l.w
    public boolean t(l.k kVar) {
        m.h hVar = (m.h) this.a;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.e;
        if (wVar != null) {
            return wVar.t(kVar);
        }
        return false;
    }

    @Override // u2.e1
    public void u(u2.f1 f1Var) {
        o2.k kVar = (o2.k) this.a;
        kVar.G.u(kVar);
    }

    @Override // org.telegram.ui.Components.zu0
    public void v() {
        ((bw0) this.a).I.a(-1);
    }

    @Override // y2.g
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.a;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        int i11 = oVar.c;
        gVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
        k4.d dVar = min == -9223372036854775807L ? y2.l.f : new k4.d(0, min, false);
        gVar.q.s(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // org.telegram.ui.Components.zu0
    public org.telegram.ui.ActionBar.g1 x(String str) {
        y5 y5Var = ((bw0) this.a).I;
        return y5Var.d(0, 0, null, str, true, true, y5Var.m0);
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean x0() {
        return false;
    }

    @Override // y2.g
    public void z(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.a;
        if (i10 == 0) {
            long j12 = oVar.a;
            uVar = new u2.u(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            g2.m mVar = oVar.b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        gVar.q.u(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public i(y6.a aVar) {
        o6.l.h(aVar);
        this.a = aVar;
    }

    @Override // org.telegram.ui.Components.q81
    public void onRenderedFirstFrame() {
    }

    public i(int i10) {
        switch (i10) {
            case 13:
                this.a = new ArrayDeque(16);
                break;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.a = new s0.e(this);
                    break;
                } else {
                    this.a = new yh0(this);
                    break;
                }
            default:
                this.a = f9.i0.t();
                break;
        }
    }

    public i(Context context, Uri uri) {
        this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public i(Context context, w20 w20Var) {
        this.a = new v20(context, w20Var);
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void H() {
    }

    @Override // r2.m
    public void N() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void R() {
    }

    @Override // oe.f
    public /* synthetic */ void a() {
    }

    @Override // r2.m
    public void flush() {
    }

    @Override // oe.f
    public /* synthetic */ void l() {
    }

    @Override // r2.m
    public void shutdown() {
    }

    @Override // r2.m
    public void start() {
    }

    @Override // org.telegram.ui.Components.lp0
    public void y() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void T(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void Y(TLRPC.User user) {
    }

    @Override // oe.f
    public /* synthetic */ void i(boolean z10) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onError(t81 t81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ri
    public void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
