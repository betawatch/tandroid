package hi;

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
import android.text.style.CharacterStyle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.j10;
import org.telegram.messenger.kc;
import org.telegram.messenger.mu;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.b00;
import org.telegram.ui.eg0;
import org.telegram.ui.fr0;
import org.telegram.ui.ke;
import org.telegram.ui.mw;
import org.telegram.ui.r00;
import org.telegram.ui.vz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public class w4 implements tg.m1, g61, wa, i6.a, qt0, com.google.android.gms.common.api.internal.q, jg.y1, b00, m.x0, OnCompleteListener, n2.v, oi.h0, org.telegram.ui.Components.a5, oi.e1, org.telegram.messenger.ua, kc, z51, org.telegram.ui.Cells.m1, te.d {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w4(int i7, boolean z10) {
        this.a = i7;
    }

    public void A2(ke keVar) {
        ((org.telegram.ui.ActionBar.w2) this.b).I0 = keVar;
    }

    public void B2() {
        t5 t5Var = (t5) this.b;
        t5Var.getClass();
        try {
            l8.b bVar = (l8.b) t5Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // te.d
    public /* synthetic */ boolean C() {
        return false;
    }

    public void C2() {
        ((org.telegram.ui.ActionBar.w2) this.b).show();
    }

    @Override // te.d
    public /* synthetic */ boolean D(float f10) {
        return false;
    }

    @Override // n2.v
    public void D1() {
        l2.i0 i0Var = ((n2.u0) this.b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // oi.e1
    public /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public void G(boolean z10) {
        ii.t tVar = (ii.t) this.b;
        te.a aVar = tVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        r00 r00Var = tVar.s;
        if (r00Var != null) {
            r00Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // oi.e1
    public /* synthetic */ boolean J(oi.f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // n2.v
    public void M0() {
        a3.s sVar;
        n2.u0 u0Var = (n2.u0) this.b;
        synchronized (u0Var.a) {
            sVar = u0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        oi.b2 b2Var = (oi.b2) this.b;
        b2Var.x0(i7, i10, z10);
        eg0 eg0Var = b2Var.P0;
        if (eg0Var != null) {
            eg0Var.i();
            b2Var.P0 = null;
        }
    }

    @Override // oi.h0
    public org.telegram.ui.Cells.j9 P0() {
        oi.n3 n3Var = ((oi.x) this.b).P;
        if (n3Var != null) {
            return n3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // jg.y1
    public void P1(ArrayList arrayList) {
        switch (this.a) {
            case 6:
                nm0 nm0Var = (nm0) this.b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    nm0Var.K.add(((jg.x1) arrayList.get(i7)).a);
                }
                mw mwVar = nm0Var.V;
                if (mwVar != null) {
                    mwVar.d(nm0Var.E0 > 0, false);
                }
                nm0Var.f();
                break;
        }
    }

    @Override // n2.v
    public void Q() {
        ((n2.u0) this.b).m1 = true;
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // oi.h0
    public void S0(CharSequence charSequence) {
        oi.n3 n3Var = ((oi.x) this.b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            n3Var.a.w4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.b;
        org.telegram.ui.Cells.f fVar = baVar.E;
        if (baVar.a()) {
            baVar.y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(org.telegram.ui.Cells.r1 r1Var, gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean U(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((ii.t) this.b).c0), 0);
    }

    @Override // org.telegram.messenger.kc
    public void V(ImageReceiver imageReceiver) {
        ((mu) this.b).t0(true);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean V0(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.b00
    public boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // n2.v
    public void W1(long j3, int i7, long j10) {
        k8.a aVar = ((n2.u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override // n2.v
    public void Y0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((n2.u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int Z() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // n2.v
    public void a0() {
        l2.i0 i0Var = ((n2.u0) this.b).Z;
        if (i0Var != null) {
            i0Var.a.j0 = true;
        }
    }

    @Override // oi.h0
    public org.telegram.ui.Cells.i9 a1() {
        return (oi.x) this.b;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                j6.r rVar = new j6.r(2, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.t) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 7);
                break;
            default:
                l7.b bVar = (l7.b) this.b;
                l7.a aVar = new l7.a((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                String str = bVar.l;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.a;
                l1.writeStrongBinder(aVar);
                l1.writeString(str);
                iVar2.m1(l1, 2);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean b() {
        return ((org.telegram.ui.Cells.ba) this.b).a();
    }

    @Override // n2.v
    public void b0(n2.s0 s0Var) {
        k8.a aVar = ((n2.u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a c0() {
        return null;
    }

    @Override // oi.h0
    public oi.a c1() {
        return ((oi.x) this.b).a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // n2.v
    public void d(int i7) {
        u2.j jVar;
        n2.u0 u0Var = (n2.u0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = u0Var.d1) != null) {
            jVar.d(i7);
        }
        k8.a aVar = u0Var.b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ai.c1(aVar, i7, 18));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // oi.e1
    public /* synthetic */ boolean d2(oi.f1 f1Var) {
        return false;
    }

    @Override // oi.h0
    public void e(oi.f1 f1Var) {
        switch (this.a) {
            case 17:
                oi.n3 n3Var = ((oi.x) this.b).P;
                if (n3Var != null) {
                    oi.t3 t3Var = n3Var.a;
                    oi.t3.Q1(t3Var, f1Var);
                    t3Var.p3.k(f1Var, true);
                    break;
                }
                break;
            default:
                oi.c5 c5Var = ((oi.e5) this.b).s;
                if (c5Var != null) {
                    oi.t3 t3Var2 = ((oi.a3) c5Var).a;
                    oi.t3.Q1(t3Var2, f1Var);
                    t3Var2.p3.k(f1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // n2.v
    public void f(boolean z10) {
        k8.a aVar = ((n2.u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ch.k(12, aVar, z10));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f1(gj gjVar) {
        return org.telegram.ui.Cells.c0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // hi.wa
    public void g0(boolean z10, float f10) {
        ((d7) this.b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override // oi.h0
    public boolean g1() {
        oi.x xVar = (oi.x) this.b;
        oi.n3 n3Var = xVar.P;
        if (n3Var == null) {
            return false;
        }
        oi.a aVar = xVar.a;
        return n3Var.a.V4();
    }

    @Override // org.telegram.ui.Cells.m1
    public void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.b;
        org.telegram.ui.Cells.f fVar = baVar.E;
        if (baVar.a()) {
            baVar.y = 0;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override // tg.m1
    public float get() {
        u9 u9Var = (u9) this.b;
        int i7 = u9Var.p1;
        sg.h currentBrush = u9Var.y0.getCurrentBrush();
        return currentBrush == null ? sg.k0.e(i7).i : sg.k0.e(i7).f(String.valueOf(sg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean h2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String i(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.z51
    public void invalidate() {
        ((org.telegram.ui.Cells.r1) ((org.telegram.ui.Cells.k1) this.b).b).invalidate();
    }

    @Override // n2.v
    public void j(long j3) {
        n2.u0 u0Var = (n2.u0) this.b;
        u0Var.n1 = true;
        k8.a aVar = u0Var.b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new bi.c4(aVar, j3, 14));
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public int j1() {
        return ((ii.t) this.b).d0;
    }

    @Override // n2.v
    public void k(n2.s0 s0Var) {
        k8.a aVar = ((n2.u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int k0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override // oi.h0
    public void k2() {
        oi.x xVar = (oi.x) this.b;
        oi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.a;
            oi.t3.S1(n3Var.a);
        }
    }

    @Override // oi.h0
    public void l1(int i7, int i10) {
        oi.x xVar = (oi.x) this.b;
        oi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.a;
            oi.g2 g2Var = n3Var.a.R3;
            if (g2Var != null) {
                g2Var.f(i7, i10);
            }
        }
    }

    @Override // te.d
    public void m1() {
        ((org.telegram.ui.Components.g9) this.b).a.invalidate();
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean n0() {
        return b();
    }

    public long n2(TimeUnit timeUnit) {
        return timeUnit.convert(((org.telegram.messenger.l0) this.b).c, TimeUnit.SECONDS);
    }

    @Override // oi.e1
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // n2.v
    public void o1() {
        ((n2.u0) this.b).k1 = true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onStateChanged(boolean z10, int i7) {
        v5 v5Var = (v5) this.b;
        s5 s5Var = v5Var.M;
        org.telegram.messenger.g0.r(s5Var);
        i61 i61Var = v5Var.E;
        if (i61Var == null || !i61Var.d0()) {
            return;
        }
        org.telegram.messenger.g0.g3(s5Var);
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((v5) this.b).i();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.b;
        org.telegram.ui.Cells.f fVar = baVar.E;
        if (baVar.a()) {
            baVar.y = 2;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // jg.y1
    public void r(int i7) {
        switch (this.a) {
            case 6:
                nm0 nm0Var = (nm0) this.b;
                nm0Var.E0--;
                nm0Var.f0 = i7;
                if (nm0Var.g0 != i7) {
                    nm0Var.s.clear();
                }
                if (nm0Var.h0 != i7) {
                    nm0Var.J.clear();
                }
                nm0Var.O = true;
                mw mwVar = nm0Var.V;
                if (mwVar != null) {
                    mwVar.d(nm0Var.E0 > 0, true);
                }
                nm0Var.f();
                mw mwVar2 = nm0Var.V;
                if (mwVar2 != null) {
                    mwVar2.c();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new kg.i0(this, 1));
                break;
        }
    }

    @Override // org.telegram.ui.b00
    public boolean r0(vz vzVar) {
        return false;
    }

    @Override // oi.e1
    public void r1(oi.f1 f1Var, int i7, int i10) {
        oi.c5 c5Var;
        org.telegram.ui.Cells.j9 textSelectionHelper;
        oi.e5 e5Var = (oi.e5) this.b;
        if (e5Var.x || i7 == i10 || (c5Var = e5Var.s) == null || (textSelectionHelper = ((oi.a3) c5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        f1Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 3));
    }

    public void r2() {
        t5 t5Var = (t5) this.b;
        t5Var.getClass();
        try {
            l8.b bVar = (l8.b) t5Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // oi.e1
    public void s1(Editable editable) {
        ((oi.e5) this.b).g();
    }

    @Override // org.telegram.ui.b00
    public void t0(gj gjVar) {
        li.d0 d0Var = (li.d0) this.b;
        d0Var.u1.presentFragment(um0.I(d0Var.a, gjVar));
        d0Var.dismiss();
    }

    @Override // oi.h0
    public void u() {
        oi.x xVar = (oi.x) this.b;
        oi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.t3.T1(n3Var.a, xVar.a);
        }
    }

    @Override // oi.h0
    public void u1() {
        oi.x xVar = (oi.x) this.b;
        oi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.a;
            oi.t3 t3Var = n3Var.a;
            oi.g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
    }

    public void u2() {
        ((org.telegram.ui.ActionBar.w2) this.b).p0 = false;
    }

    @Override // i6.a
    public void v0(Bitmap bitmap) {
        j6.b bVar = i6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) a8.p0.f(f10, 9.0f, 16.0f, 0.5f);
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
        ((i6.h) this.b).e(0, bitmap2);
    }

    @Override // jg.y1
    public boolean v1(int i7) {
        switch (this.a) {
            case 6:
                return i7 == ((nm0) this.b).e0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    public void w2() {
        t5 t5Var = (t5) this.b;
        t5Var.getClass();
        try {
            l8.b bVar = (l8.b) t5Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // oi.e1
    public void x0(oi.f1 f1Var) {
        oi.a aVar;
        oi.e5 e5Var = (oi.e5) this.b;
        oi.c5 c5Var = e5Var.s;
        if (c5Var == null || (aVar = e5Var.a) == null) {
            return;
        }
        oi.t3 t3Var = ((oi.a3) c5Var).a;
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
        oi.g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a8.p0.z(1, arrayList3);
        }
        arrayList.add(i7 + 1, aVar2);
        t3Var.v4();
        t3Var.g3.O(false);
        oi.g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.post(new oi.n2(t3Var, aVar2, 26));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y0(gj gjVar) {
        return true;
    }

    @Override // tg.m1
    public void y1(float f10) {
        u9 u9Var = (u9) this.b;
        sg.k0.e(u9Var.p1).k(String.valueOf(sg.h.a.indexOf(u9Var.y0.getCurrentBrush())), f10);
        sg.h1 h1Var = u9Var.k1;
        h1Var.c = f10;
        u9Var.B0(h1Var, null, false);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String z(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return i7 == ((org.telegram.ui.Cells.ba) this.b).y;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ org.telegram.ui.Cells.k9 z2() {
        return null;
    }

    public /* synthetic */ w4(j6.s sVar, String[] strArr) {
        this.a = 5;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.g61
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ w4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public w4(a7.a aVar) {
        this.a = 7;
        q6.m.h(aVar);
        this.b = aVar;
    }

    public w4(int i7) {
        this.a = i7;
        switch (i7) {
            case 20:
                this.b = new org.telegram.messenger.i0();
                break;
            case 21:
                this.b = new org.telegram.messenger.m0();
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    public w4(String str, long j3) {
        this.a = 22;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = new org.telegram.messenger.l0(str, j3);
    }

    public w4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = 26;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
        this.b = w2Var;
        w2Var.O();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0() {
    }

    @Override // oi.e1
    public /* synthetic */ void E0() {
    }

    @Override // te.d
    public /* synthetic */ void H() {
    }

    @Override // hi.wa
    public /* synthetic */ void N1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c() {
    }

    @Override // hi.wa
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.b00
    public void n() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x2() {
    }

    private final /* synthetic */ void o2(ArrayList arrayList) {
    }

    @Override // m.x0
    public void A1(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void B(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void D0(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void E(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void F(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(dj djVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void M1(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void Q0(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(gj gjVar) {
    }

    @Override // m.x0
    public void R0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // oi.e1
    public /* synthetic */ void b1(CharSequence charSequence) {
    }

    @Override // hi.wa
    public /* synthetic */ void b2(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void e1(long j3) {
    }

    @Override // hi.wa
    public /* synthetic */ void g(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void h0(int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void h1(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void j2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void m2(long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void q1(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void s0(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void t(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // hi.wa
    public /* synthetic */ void w1(float f10) {
    }

    @Override // te.d
    public /* synthetic */ void x(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // oi.e1
    public /* synthetic */ void A(int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // hi.wa
    public /* synthetic */ void G1(float f10, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // hi.wa
    public /* synthetic */ void J0(float f10, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void M(long j3, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a2(org.telegram.ui.Cells.r1 r1Var, j10 j10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // hi.wa
    public /* synthetic */ void i2(int i7, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override // hi.wa
    public /* synthetic */ void n1(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onError(i61 i61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.b00
    public void Z0(gj gjVar, View view, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}
