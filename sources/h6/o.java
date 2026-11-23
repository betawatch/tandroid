package h6;

import a8.p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import bi.e4;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h9.g1;
import hi.d6;
import hi.f6;
import hi.pa;
import hi.rb;
import hi.s0;
import hi.u0;
import hi.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.o1;
import jg.x1;
import jg.y1;
import kg.i0;
import l2.j0;
import li.c0;
import m.x0;
import n2.t0;
import n2.v;
import n2.v0;
import oi.a3;
import oi.b2;
import oi.c5;
import oi.e1;
import oi.e5;
import oi.f1;
import oi.g2;
import oi.h0;
import oi.n2;
import oi.n3;
import oi.t3;
import oi.x;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.jc;
import org.telegram.messenger.l0;
import org.telegram.messenger.lu;
import org.telegram.messenger.m0;
import org.telegram.messenger.ta;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a00;
import org.telegram.ui.dg0;
import org.telegram.ui.ke;
import org.telegram.ui.lw;
import org.telegram.ui.q00;
import org.telegram.ui.uz;
import tg.q1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class o implements j6.o, g1, og.n, q1, f61, rb, i6.a, pt0, y1, com.google.android.gms.common.api.internal.q, a00, x0, OnCompleteListener, v, h0, z4, e1, ta, jc, y51 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o(int i7, boolean z10) {
        this.a = i7;
    }

    @Override // oi.e1
    public void A(f1 f1Var) {
        oi.a aVar;
        e5 e5Var = (e5) this.b;
        c5 c5Var = e5Var.s;
        if (c5Var == null || (aVar = e5Var.a) == null) {
            return;
        }
        t3 t3Var = ((a3) c5Var).a;
        ArrayList arrayList = t3Var.t3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i7 = -1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((oi.a) arrayList.get(i10)).k.contains(Long.valueOf(j3))) {
                i7 = i10;
            }
        }
        if (i7 < 0) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            p0.z(1, arrayList3);
        }
        arrayList.add(i7 + 1, aVar2);
        t3Var.v4();
        t3Var.g3.O(false);
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.post(new n2(t3Var, aVar2, 26));
    }

    public void A0() {
        u0 u0Var = (u0) this.b;
        u0Var.getClass();
        try {
            l8.b bVar = (l8.b) u0Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.a00
    public void B(fj fjVar) {
        c0 c0Var = (c0) this.b;
        c0Var.u1.presentFragment(tm0.K(c0Var.a, fjVar));
        c0Var.dismiss();
    }

    public void B0(ke keVar) {
        ((w2) this.b).I0 = keVar;
    }

    @Override // j6.o
    public void C(String str, long j3, long j10, long j11) {
        p pVar = (p) this.b;
        try {
            pVar.a(new n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public void C0() {
        u0 u0Var = (u0) this.b;
        u0Var.getClass();
        try {
            l8.b bVar = (l8.b) u0Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void D0() {
        ((w2) this.b).show();
    }

    @Override // org.telegram.ui.Components.pt0
    public void E(boolean z10) {
        ii.t tVar = (ii.t) this.b;
        te.a aVar = tVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        q00 q00Var = tVar.s;
        if (q00Var != null) {
            q00Var.invalidate();
        }
    }

    @Override // og.n
    public void G() {
        ((s0) this.b).d.invalidate();
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        b2 b2Var = (b2) this.b;
        b2Var.x0(i7, i10, z10);
        dg0 dg0Var = b2Var.P0;
        if (dg0Var != null) {
            dg0Var.i();
            b2Var.P0 = null;
        }
    }

    @Override // oi.h0
    public i9 K() {
        n3 n3Var = ((x) this.b).P;
        if (n3Var != null) {
            return n3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.pt0
    public float K0() {
        return i5.c.d(9.66f, ri.a.d(((ii.t) this.b).c0), 0);
    }

    @Override // oi.h0
    public void M(CharSequence charSequence) {
        n3 n3Var = ((x) this.b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            n3Var.a.w4(charSequence.toString());
        }
    }

    @Override // n2.v
    public void N() {
        a3.s sVar;
        v0 v0Var = (v0) this.b;
        synchronized (v0Var.a) {
            sVar = v0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // oi.h0
    public h9 P() {
        return (x) this.b;
    }

    @Override // n2.v
    public void Q(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        jb.m mVar = ((v0) this.b).b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new n2.p(mVar, exc, 1));
        }
    }

    @Override // org.telegram.ui.Components.pt0
    public int T0() {
        return ((ii.t) this.b).d0;
    }

    @Override // oi.h0
    public oi.a V() {
        return ((x) this.b).a;
    }

    @Override // oi.h0
    public boolean W() {
        x xVar = (x) this.b;
        n3 n3Var = xVar.P;
        if (n3Var == null) {
            return false;
        }
        oi.a aVar = xVar.a;
        return n3Var.a.V4();
    }

    @Override // jg.y1
    public boolean W1(int i7) {
        switch (this.a) {
            case 8:
                return i7 == ((mm0) this.b).e0;
            default:
                return true;
        }
    }

    @Override // oi.h0
    public void Y(int i7, int i10) {
        x xVar = (x) this.b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.a;
            g2 g2Var = n3Var.a.R3;
            if (g2Var != null) {
                g2Var.f(i7, i10);
            }
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h Y0() {
        switch (this.a) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // j6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        Iterator it;
        p pVar = (p) this.b;
        try {
            i10 = i7;
            try {
                Status status = new Status(i10, null, null, null);
                Object obj2 = true == (obj instanceof j6.m) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                pVar.a(new n(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                j6.b bVar = h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = pVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i10 = i7;
        }
        it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h(str, j3, i10, j10, j11);
            i10 = i7;
        }
    }

    @Override // n2.v
    public void a(int i7) {
        u2.j jVar;
        v0 v0Var = (v0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.d1) != null) {
            jVar.d(i7);
        }
        jb.m mVar = v0Var.b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new ai.u0(mVar, i7, 20));
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        l7.b bVar = (l7.b) this.b;
        l7.a aVar = new l7.a((TaskCompletionSource) obj2);
        l7.i iVar = (l7.i) ((l7.c) obj).n();
        String str = bVar.l;
        Parcel l1 = iVar.l1();
        int i7 = l7.f.a;
        l1.writeStrongBinder(aVar);
        l1.writeString(str);
        iVar.m1(l1, 2);
    }

    @Override // n2.v
    public void b(long j3) {
        v0 v0Var = (v0) this.b;
        v0Var.n1 = true;
        jb.m mVar = v0Var.b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new e4(mVar, j3, 14));
        }
    }

    @Override // n2.v
    public void c(boolean z10) {
        jb.m mVar = ((v0) this.b).b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new ch.k(12, mVar, z10));
        }
    }

    @Override // n2.v
    public void c0() {
        ((v0) this.b).k1 = true;
    }

    @Override // oi.h0, oi.e1
    public void d(f1 f1Var) {
        switch (this.a) {
            case 19:
                n3 n3Var = ((x) this.b).P;
                if (n3Var != null) {
                    t3 t3Var = n3Var.a;
                    t3.Q1(t3Var, f1Var);
                    t3Var.p3.b(f1Var, true);
                    break;
                }
                break;
            default:
                c5 c5Var = ((e5) this.b).s;
                if (c5Var != null) {
                    t3 t3Var2 = ((a3) c5Var).a;
                    t3.Q1(t3Var2, f1Var);
                    t3Var2.p3.b(f1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // oi.e1
    public void e0(f1 f1Var, int i7, int i10) {
        c5 c5Var;
        i9 textSelectionHelper;
        e5 e5Var = (e5) this.b;
        if (e5Var.x || i7 == i10 || (c5Var = e5Var.s) == null || (textSelectionHelper = ((a3) c5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        f1Var.post(new o1(this, f1Var, i10, textSelectionHelper, i7, 3));
    }

    @Override // n2.v
    public void f(t0 t0Var) {
        jb.m mVar = ((v0) this.b).b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 0));
        }
    }

    @Override // n2.v
    public void f0() {
        j0 j0Var = ((v0) this.b).Z;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // oi.h0
    public void g() {
        x xVar = (x) this.b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            t3.T1(n3Var.a, xVar.a);
        }
    }

    @Override // oi.e1
    public void g0(Editable editable) {
        ((e5) this.b).g();
    }

    @Override // tg.q1
    public float get() {
        pa paVar = (pa) this.b;
        int i7 = paVar.p1;
        sg.h currentBrush = paVar.y0.getCurrentBrush();
        return currentBrush == null ? sg.j0.e(i7).i : sg.j0.e(i7).f(String.valueOf(sg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // oi.h0
    public void h0() {
        x xVar = (x) this.b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.a;
            t3 t3Var = n3Var.a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
    }

    @Override // tg.q1
    public void h2(float f10) {
        pa paVar = (pa) this.b;
        sg.j0.e(paVar.p1).k(String.valueOf(sg.h.a.indexOf(paVar.y0.getCurrentBrush())), f10);
        sg.g1 g1Var = paVar.k1;
        g1Var.c = f10;
        paVar.E0(g1Var, null, false);
    }

    @Override // oi.e1
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.a00
    public boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.y51
    public void invalidate() {
        ((r1) ((k1) this.b).b).invalidate();
    }

    @Override // org.telegram.ui.a00
    public boolean j(uz uzVar) {
        return false;
    }

    @Override // n2.v
    public void k0(long j3, int i7, long j10) {
        jb.m mVar = ((v0) this.b).b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new b3.b(mVar, i7, j3, j10, 1));
        }
    }

    @Override // n2.v
    public void l() {
        ((v0) this.b).m1 = true;
    }

    public long l0(TimeUnit timeUnit) {
        return timeUnit.convert(((l0) this.b).c, TimeUnit.SECONDS);
    }

    @Override // oi.e1
    public /* synthetic */ boolean m0(boolean z10) {
        return false;
    }

    @Override // jg.y1
    public void m2(ArrayList arrayList) {
        switch (this.a) {
            case 8:
                mm0 mm0Var = (mm0) this.b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    mm0Var.K.add(((x1) arrayList.get(i7)).a);
                }
                lw lwVar = mm0Var.V;
                if (lwVar != null) {
                    lwVar.d(mm0Var.E0 > 0, false);
                }
                mm0Var.f();
                break;
        }
    }

    @Override // oi.e1
    public /* synthetic */ boolean o(f1 f1Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        f6 f6Var = (f6) this.b;
        d6 d6Var = f6Var.M;
        g0.r(d6Var);
        h61 h61Var = f6Var.E;
        if (h61Var == null || !h61Var.d0()) {
            return;
        }
        g0.g3(d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((f6) this.b).i();
    }

    @Override // n2.v
    public void q() {
        j0 j0Var = ((v0) this.b).Z;
        if (j0Var != null) {
            j0Var.a.j0 = true;
        }
    }

    @Override // org.telegram.messenger.jc
    public void r(ImageReceiver imageReceiver) {
        ((lu) this.b).t0(true);
    }

    @Override // n2.v
    public void s(t0 t0Var) {
        jb.m mVar = ((v0) this.b).b1;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 1));
        }
    }

    @Override // oi.e1
    public /* synthetic */ boolean t0(f1 f1Var) {
        return false;
    }

    @Override // h9.g1
    public Object u(Object obj, Object obj2) {
        return ((g9.k) this.b).apply(obj2);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h u1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // jg.y1
    public void v(int i7) {
        switch (this.a) {
            case 8:
                mm0 mm0Var = (mm0) this.b;
                mm0Var.E0--;
                mm0Var.f0 = i7;
                if (mm0Var.g0 != i7) {
                    mm0Var.s.clear();
                }
                if (mm0Var.h0 != i7) {
                    mm0Var.J.clear();
                }
                mm0Var.O = true;
                lw lwVar = mm0Var.V;
                if (lwVar != null) {
                    lwVar.d(mm0Var.E0 > 0, true);
                }
                mm0Var.f();
                lw lwVar2 = mm0Var.V;
                if (lwVar2 != null) {
                    lwVar2.c();
                    break;
                }
                break;
            default:
                g0.g3(new i0(this, 1));
                break;
        }
    }

    @Override // i6.a
    public void w(Bitmap bitmap) {
        j6.b bVar = i6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) p0.f(f10, 9.0f, 16.0f, 0.5f);
            float f12 = (f11 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f12, f10, height + f12);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, f11, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((i6.i) this.b).e(0, bitmap2);
    }

    @Override // oi.h0
    public void w0() {
        x xVar = (x) this.b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.a;
            t3.S1(n3Var.a);
        }
    }

    @Override // hi.rb
    public void x(boolean z10, float f10) {
        ((y7) this.b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    public void x0() {
        u0 u0Var = (u0) this.b;
        u0Var.getClass();
        try {
            l8.b bVar = (l8.b) u0Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void z0() {
        ((w2) this.b).p0 = false;
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
    }

    public o(a7.a aVar) {
        this.a = 9;
        q6.m.h(aVar);
        this.b = aVar;
    }

    public o(int i7) {
        this.a = i7;
        switch (i7) {
            case 22:
                this.b = new org.telegram.messenger.i0();
                break;
            case 23:
                this.b = new m0();
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    public o(String str, long j3) {
        this.a = 24;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = new l0(str, j3);
    }

    public o(Context context, i6 i6Var) {
        this.a = 28;
        w2 w2Var = new w2(1, context, i6Var, false);
        this.b = w2Var;
        w2Var.O();
    }

    @Override // oi.e1
    public /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.a00
    public void h() {
    }

    @Override // hi.rb
    public /* synthetic */ void p0() {
    }

    @Override // hi.rb
    public /* synthetic */ void t() {
    }

    @Override // og.n
    public void v0() {
    }

    private final /* synthetic */ void s0(ArrayList arrayList) {
    }

    @Override // hi.rb
    public /* synthetic */ void D(boolean z10) {
    }

    @Override // hi.rb
    public /* synthetic */ void L(float f10) {
    }

    @Override // m.x0
    public void O(int i7) {
    }

    @Override // og.n
    public void R(boolean z10) {
    }

    @Override // oi.e1
    public /* synthetic */ void T(CharSequence charSequence) {
    }

    @Override // hi.rb
    public /* synthetic */ void U(long j3) {
    }

    @Override // hi.rb
    public /* synthetic */ void X(boolean z10) {
    }

    @Override // m.x0
    public void a0(int i7) {
    }

    @Override // hi.rb
    public /* synthetic */ void d0(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void e(int i7) {
    }

    @Override // hi.rb
    public /* synthetic */ void j0(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void k(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void n(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void o0(float f10) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // og.n
    public void q0(boolean z10) {
    }

    @Override // hi.rb
    public /* synthetic */ void r0(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void y0(long j3) {
    }

    @Override // hi.rb
    public /* synthetic */ void z(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void H(float f10, int i7) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }

    @Override // hi.rb
    public /* synthetic */ void b0(float f10, int i7) {
    }

    @Override // oi.e1
    public /* synthetic */ void m(int i7, int i10) {
    }

    @Override // hi.rb
    public /* synthetic */ void n0(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onError(h61 h61Var, Exception exc) {
    }

    @Override // hi.rb
    public /* synthetic */ void p(long j3, boolean z10) {
    }

    @Override // hi.rb
    public /* synthetic */ void u0(int i7, long j3) {
    }

    @Override // org.telegram.ui.a00
    public void S(fj fjVar, View view, int i7) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
