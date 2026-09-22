package l;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import b2.s0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.g0;
import e9.i0;
import gg.b2;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.m9;
import org.telegram.ui.ts0;
import org.telegram.ui.u9;
import org.telegram.ui.web.d1;
import pg.b1;
import pg.f1;
import s4.c1;
import s4.h1;
import s4.o0;
import s4.p0;
import w7.y8;
import yh.y3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class d implements e2, y2.h, le.d, j, l2.h, to0, le.f, lg.o, s71, b2, u9, com.google.android.gms.common.api.internal.s, h1, w2.a, lq0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // le.f
    public void A() {
        ((l9) this.b).a.invalidate();
    }

    @Override // le.d
    public void C(float f7, int i10) {
        ((le.j) this.b).i(f7);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // m.e2
    public void E(l lVar, n nVar) {
        f fVar = (f) this.b;
        Handler handler = fVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, i11 < arrayList.size() ? (e) arrayList.get(i11) : null, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l2.h
    public boolean F() {
        return true;
    }

    @Override // lg.o
    public void G(boolean z10) {
        ((ff0) this.b).c.setAspectLock(z10);
    }

    @Override // le.d
    public void H(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.b).i(f7);
    }

    @Override // s4.h1
    public View I(int i10) {
        return ((o0) this.b).q(i10);
    }

    @Override // org.telegram.ui.u9
    public String I0() {
        return ((d1) this.b).i0;
    }

    @Override // w2.a
    public long J(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).b;
            if (j3 == j10) {
                return j10;
            }
            if (j3 < j10) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                return (j11 == -9223372036854775807L || j11 > j3) ? aVar.b : j11;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        return (j12 == -9223372036854775807L || j3 < j12) ? aVar2.b : j12;
    }

    @Override // org.telegram.ui.u9
    public void K(String str) {
        d1 d1Var = (d1) this.b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // gg.b2
    public boolean L(int i10) {
        return i10 == ((sq0) this.b).r;
    }

    @Override // l2.h
    public long M() {
        return 0L;
    }

    @Override // s4.h1
    public int N(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override // l2.h
    public long P(long j3) {
        return 1L;
    }

    @Override // l2.h
    public long Q(long j3, long j10) {
        return 1L;
    }

    @Override // w2.a
    public void R(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        int a02 = a0(j3);
        if (a02 == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(a02 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            a02--;
        }
        arrayList.subList(0, a02).clear();
    }

    @Override // y2.h
    public void S(y2.j jVar, long j3, long j10, boolean z10) {
        ((l2.g) this.b).w((y2.p) jVar, j10);
    }

    public void T(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    public void V() {
        pg.d1 d1Var = ((f1) this.b).d;
        if (d1Var != null) {
            b1 b1Var = d1Var.s;
            if (b1Var != null) {
                d1Var.cancelRunnable(b1Var);
                d1Var.s = null;
            }
            b1 b1Var2 = new b1(d1Var, 1);
            d1Var.s = b1Var2;
            d1Var.postRunnable(b1Var2, 1L);
        }
    }

    public s0.d W(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.to0
    public void X(float f7, boolean z10) {
        cc1 cc1Var = (cc1) ((k0) this.b);
        int i10 = (int) (j6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        j6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = cc1Var.e.e;
            il0 il0Var = (il0) themeActivity.b.L(themeActivity.f0);
            if (il0Var != null) {
                ((f9) il0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.q * 100.0f))));
            }
            j6.E(true);
        }
    }

    public s0.d Y(int i10) {
        return null;
    }

    @Override // lg.o
    public void Z(boolean z10) {
        ff0 ff0Var = (ff0) this.b;
        ff0Var.getClass();
        ef0 ef0Var = ff0Var.a;
        if (ef0Var != null) {
            ((ts0) ef0Var).a(z10);
        }
    }

    public int a0(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                g8.e eVar = (g8.e) this.b;
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, eVar);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                break;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar2 = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar2.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, aVar);
                eVar2.J0(I0, 1);
                break;
        }
    }

    @Override // l2.h
    public long b(long j3) {
        return 0L;
    }

    public void b0(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public boolean c0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // w2.a
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    @Override // w2.a
    public long d(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.b;
            long j11 = aVar.b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j12 == -9223372036854775807L || j12 <= j3 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // lg.o
    public void d0() {
        ef0 ef0Var = ((ff0) this.b).a;
        if (ef0Var != null) {
            PhotoViewer photoViewer = ((ts0) ef0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override // l2.h
    public long e(long j3, long j10) {
        return 0L;
    }

    public void e0(c1 c1Var, q0 q0Var, q0 q0Var2) {
        boolean z10;
        c1 U;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        s4.f1 f1Var = (s4.f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = c1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i10 = U.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // gg.b2
    public void f(int i10) {
        sq0 sq0Var = (sq0) this.b;
        wq0 wq0Var = sq0Var.K;
        sq0Var.s = i10;
        if (sq0Var.v != i10) {
            sq0Var.d.clear();
        }
        int i11 = sq0Var.J;
        if (sq0Var.h() != 0 || sq0Var.e.e() || sq0Var.I) {
            wq0Var.x0.b(i11);
        } else {
            wq0Var.Q.e(false, true);
        }
        sq0Var.l();
        int i12 = wq0.a1;
        wq0Var.K0(true);
    }

    public void f0(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        o0 o0Var = recyclerView.x;
        View view = c1Var.a;
        of.e eVar = recyclerView.b;
        lf.h hVar = o0Var.a;
        o0.b bVar = (o0.b) hVar.b;
        int indexOfChild = ((RecyclerView) bVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.c).B(indexOfChild)) {
                hVar.Y(view);
            }
            bVar.l(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // org.telegram.ui.Components.to0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // le.f
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // le.f
    public /* synthetic */ boolean i(float f7) {
        return false;
    }

    @Override // s4.h1
    public int k(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override // l2.h
    public long l(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // org.telegram.ui.Components.to0
    public /* synthetic */ int l0() {
        return 0;
    }

    @Override // l2.h
    public m2.j m(long j3) {
        return (m2.j) this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.b;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        int i11 = pVar.c;
        gVar.m.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.l)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k4.d dVar = j11 != -9223372036854775807L ? y2.m.f : new k4.d(0, j11, false);
            gVar.q.r(tVar, i11, iOException, !dVar.a());
            return dVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        gVar.q.r(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // y2.h
    public void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.b;
        if (i10 == 0) {
            long j11 = pVar.a;
            tVar = new u2.t(pVar.b);
        } else {
            long j12 = pVar.a;
            Uri uri = pVar.d.c;
            tVar = new u2.t(j10);
        }
        gVar.q.s(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // org.telegram.ui.u9
    public void onDismiss() {
        d1 d1Var = (d1) this.b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s71
    public void onStateChanged(boolean z10, int i10) {
        tk0 tk0Var = (tk0) this.b;
        if (z10 && tk0Var.n.n() >= 0) {
            tk0Var.w = true;
        }
        sg0 sg0Var = tk0Var.f;
        jc0 jc0Var = tk0Var.x;
        sg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(jc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(jc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // y2.h
    public void p(y2.j jVar, long j3, long j10) {
        int i10;
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.b;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        gVar.m.getClass();
        gVar.q.p(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) pVar.f;
        m2.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                    }
                } else {
                    i10 = i11;
                }
                gVar.M = 0;
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.m.L3(pVar.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new b5();
                return;
            }
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j3 - j10;
        gVar.K = j3;
        gVar.O += i10;
        synchronized (gVar.t) {
            try {
                if (pVar.b.a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.k;
                    if (uri2 == null) {
                        uri2 = y8.a(pVar.d.c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (!cVar3.d || gVar.L != j11) {
            gVar.y(true);
            return;
        }
        c5.a aVar = cVar3.i;
        if (aVar == null) {
            gVar.v();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = e2.d0.T(aVar.c) - gVar.K;
                gVar.y(true);
                return;
            } catch (s0 e) {
                gVar.x(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            gVar.z(aVar, new l2.f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            gVar.z(aVar, new ob.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.v();
        } else {
            gVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // m.e2
    public void q(l lVar, MenuItem menuItem) {
        ((f) this.b).f.removeCallbacksAndMessages(lVar);
    }

    @Override // l.j
    public void r(l lVar) {
        ki.e0 e0Var = ((ActionMenuView) this.b).K;
        if (e0Var != null) {
            e0Var.r(lVar);
        }
    }

    @Override // s4.h1
    public int s() {
        return ((o0) this.b).D();
    }

    @Override // l2.h
    public long t(long j3, long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.lq0
    public void t0() {
        pc k10 = ((y3) this.b).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // w2.a
    public i0 u(long j3) {
        int a02 = a0(j3);
        if (a02 == 0) {
            g0 g0Var = i0.b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.b).get(a02 - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        g0 g0Var2 = i0.b;
        return a1.e;
    }

    @Override // s4.h1
    public int v() {
        o0 o0Var = (o0) this.b;
        return o0Var.m - o0Var.E();
    }

    @Override // l.j
    public boolean w(l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.b).P;
        if (kVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((k2.e) kVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.c0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // lg.o
    public void x() {
        ef0 ef0Var = ((ff0) this.b).a;
        if (ef0Var != null) {
            ((ts0) ef0Var).a.e0.invalidate();
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean z(z3.a aVar, long j3) {
        boolean z10;
        int size;
        ArrayList arrayList = (ArrayList) this.b;
        long j10 = aVar.b;
        e2.d.b(j10 != -9223372036854775807L);
        if (j10 <= j3) {
            long j11 = aVar.d;
            if (j11 == -9223372036854775807L || j3 < j11) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j3) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.s71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ d(s6.g gVar, s6.a aVar) {
        this.a = 23;
        this.b = aVar;
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 17;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 26:
                this.b = new ArrayList();
                break;
            case 27:
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new mh0(this);
                    break;
                }
            case 28:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // org.telegram.ui.Components.to0
    public void B() {
    }

    @Override // org.telegram.ui.Components.lq0
    public /* synthetic */ void U() {
    }

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // le.f
    public /* synthetic */ void j() {
    }

    @Override // gg.b2
    public /* synthetic */ void O(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // le.f
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // l2.h
    public long c(long j3, long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Components.s71
    public void onError(v71 v71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.s71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
