package l2;

import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import m.x0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ab;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.j0;
import org.telegram.messenger.jj;
import org.telegram.messenger.mc;
import org.telegram.messenger.p0;
import org.telegram.messenger.ru;
import org.telegram.messenger.su;
import org.telegram.messenger.vv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o0;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.x51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bq0;
import org.telegram.ui.k9;
import org.telegram.ui.qe;
import org.telegram.ui.t9;
import org.telegram.ui.web.z0;
import org.telegram.ui.xn0;
import org.telegram.ui.yt;
import qh.i0;
import qh.m0;
import r7.x;
import s4.c0;
import s4.c1;
import s4.g0;
import t7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class f implements x0, n5.b, ab, ge.a, mn0, xn0, eg.p, mc, t9, s, c0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f(int i10, boolean z10) {
        this.a = i10;
    }

    public void B(int i10) {
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        m0 m0Var = ((i0) this.b).e;
        if (m0Var == null || m0Var.d == i10) {
            return;
        }
        if (m0Var.c.d && i10 == 2) {
            i10 = 1;
        }
        m0Var.d = i10;
        m0Var.f().edit().putBoolean("qrNoPaidPermanent", m0Var.d == 2).apply();
        int i11 = m0Var.d;
        if (i11 == 0) {
            if (m0Var.n != 0) {
                ConnectionsManager.getInstance(m0Var.a).cancelRequest(m0Var.n, true);
                m0Var.n = 0;
                return;
            }
            return;
        }
        if (i11 == 2 && (c10 = m0Var.c()) != null) {
            m0Var.f = c10;
            m0Var.b.setFreeLink(m0Var.d(c10));
        }
        m0Var.n(false, m0Var.d == 1);
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
        int i10 = this.a;
    }

    @Override // s4.c0
    public void E(int i10, int i11) {
        ((g0) this.b).j(i10, i11);
    }

    @Override // ge.a
    public void G0() {
        switch (this.a) {
            case 11:
                su suVar = (su) this.b;
                su.i0(suVar, null);
                suVar.a0 = null;
                break;
            default:
                ((x51) this.b).h.c(false);
                break;
        }
    }

    @Override // ge.a
    public boolean I1() {
        switch (this.a) {
            case 11:
                return true;
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.t9
    public void L(String str) {
        z0 z0Var = (z0) this.b;
        try {
            z0Var.P = System.currentTimeMillis();
            z0Var.x("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            f8.g(e, true);
        }
    }

    @Override // ge.a
    public void N(float f7, float f10) {
        vv vvVar;
        l1 l1Var;
        switch (this.a) {
            case 11:
                su suVar = (su) this.b;
                ru ruVar = suVar.a0;
                if (ruVar != null && (l1Var = (vvVar = suVar.a).F) != null) {
                    l1Var.W0(vvVar.E, ruVar.c);
                    break;
                }
                break;
            default:
                Runnable runnable = ((x51) this.b).j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public void O(long j10, long j11, long j12, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j10, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j11);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
        }
        longSparseArray3.get(j12);
        longSparseArray3.put(j12, obj);
    }

    public Object P(long j10, long j11, long j12) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j10);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j11)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j12);
        longSparseArray.remove(j12);
        return obj;
    }

    @Override // org.telegram.ui.t9
    public String P0() {
        return ((z0) this.b).i0;
    }

    public void Q() {
        ((z2) this.b).o0 = false;
    }

    @Override // s4.c0
    public void Q0(int i10, int i11) {
        ((g0) this.b).p(i10, i11);
    }

    public void R(qe qeVar) {
        ((z2) this.b).H0 = qeVar;
    }

    public void S() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + U());
    }

    public void T(long j10) {
        long U = U();
        if (U != j10) {
            if (U != -1) {
                if (U != -2) {
                    return;
                } else {
                    U = -2;
                }
            }
            StringBuilder s10 = a1.g.s(j10, "expected non-string scope or scope ", " but found ");
            s10.append(U);
            throw new IOException(s10.toString());
        }
    }

    public long U() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.xn0
    public void V() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((b40) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // ge.a
    public boolean V0(float f7, float f10) {
        switch (this.a) {
            case 11:
                su suVar = (su) this.b;
                ru h02 = su.h0(suVar, f7, f10);
                if (h02 == null || h02.b) {
                    h02 = null;
                }
                suVar.a0 = h02;
                return h02 != null;
            default:
                int L = org.telegram.messenger.i0.L(9.0f);
                RectF rectF = ((x51) this.b).g;
                float f11 = -L;
                rectF.inset(f11, f11);
                boolean contains = rectF.contains(f7, f10);
                float f12 = L;
                rectF.inset(f12, f12);
                return contains;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        g8.c cVar = (g8.c) this.b;
        x xVar = (x) ((r7.k) obj).v();
        r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
        Parcel P0 = xVar.P0();
        int i10 = r7.d.a;
        P0.writeInt(1);
        cVar.writeToParcel(P0, 0);
        r7.d.c(P0, fVar);
        P0.writeString(null);
        xVar.T0(P0, 63);
    }

    @Override // org.telegram.ui.xn0
    public void b(ArrayList arrayList) {
        b40.a((b40) this.b, false, arrayList);
    }

    @Override // eg.p
    public void d() {
        ae0 ae0Var = ((be0) this.b).a;
        if (ae0Var != null) {
            ((bq0) ae0Var).a.e0.invalidate();
        }
    }

    @Override // ge.a
    public boolean d1(View view, float f7, float f10) {
        switch (this.a) {
            case 11:
                su suVar = (su) this.b;
                if (suVar.a0 != null) {
                    ru h02 = su.h0(suVar, f7, f10);
                    ru ruVar = suVar.a0;
                    if (h02 == ruVar) {
                        vv vvVar = suVar.a;
                        l1 l1Var = vvVar.F;
                        if (l1Var != null) {
                            l1Var.q1(vvVar.E, ruVar.c);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public f e(float f7) {
        j8.f fVar = (j8.f) this.b;
        fVar.e = 0.5f;
        fVar.f = f7;
        return this;
    }

    @Override // eg.p
    public void g(boolean z10) {
        ((be0) this.b).c.setAspectLock(z10);
    }

    @Override // zc.a
    public Object get() {
        switch (this.a) {
            case 3:
                return new li.k((Context) ((k2.m0) this.b).a, new u(21), new oa.d(21), 5);
            default:
                String packageName = ((Context) ((zc.a) this.b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 13:
                StringBuilder sb2 = new StringBuilder();
                yt ytVar = (yt) this.b;
                sb2.append((Object) ytVar.a.getText());
                sb2.append(" ");
                sb2.append((Object) ytVar.b.getText());
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                w7 w7Var = (w7) this.b;
                sb3.append(cd.G(w7Var.t2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(cd.G(w7Var.t2 % 60, "Seconds", new Object[0]));
                return cd.a0("AccDescrPlayerDuration", null, 2131754806, sb3.toString(), cd.G(w7Var.u2 / 60, "Minutes", new Object[0]) + ' ' + cd.G(w7Var.u2 % 60, "Seconds", new Object[0]));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ge.a
    public long getLongPressDuration() {
        switch (this.a) {
        }
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.messenger.mc
    public void j(ImageReceiver imageReceiver) {
        switch (this.a) {
            case 18:
                qg0 qg0Var = ((tg0) this.b).h.G0;
                if (qg0Var != null) {
                    qg0Var.d();
                    break;
                }
                break;
        }
    }

    @Override // ge.a
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        float c10;
        int i10;
        switch (this.a) {
            case 13:
                yt ytVar = (yt) this.b;
                if (f7 <= 0.25f) {
                    c10 = a1.g.c(f7, 0.25f, 536576.0f, 512000);
                } else {
                    float f10 = f7 - 0.25f;
                    if (f10 < 0.25f) {
                        c10 = a1.g.c(f10, 0.25f, 9437184.0f, TLObject.FLAG_20);
                    } else {
                        float f11 = f10 - 0.25f;
                        c10 = f11 <= 0.25f ? a1.g.c(f11, 0.25f, 9.437184E7f, 10485760) : a1.g.c(f11 - 0.25f, 0.25f, 2097152000 - 104857600, 104857600);
                    }
                }
                int i11 = (int) c10;
                long j10 = i11;
                ytVar.b.setText(cd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.i0.i0(j10, false, false)));
                ytVar.d = j10;
                t8[] t8VarArr = ytVar.h;
                AnimatorSet[] animatorSetArr = ytVar.n;
                int i12 = ytVar.e;
                i10 = ytVar.r.videosRow;
                if (i12 == i10) {
                    ytVar.f.setText(cd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.i0.i0(j10, false, false)));
                    boolean z11 = i11 > 2097152;
                    if (z11 != t8VarArr[0].isEnabled()) {
                        ArrayList arrayList = new ArrayList();
                        t8VarArr[0].e(arrayList, z11);
                        AnimatorSet animatorSet = animatorSetArr[0];
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            animatorSetArr[0] = null;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSetArr[0] = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        animatorSetArr[0].addListener(new h2(ytVar, 3));
                        animatorSetArr[0].setDuration(150L);
                        animatorSetArr[0].start();
                        break;
                    }
                }
                break;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().u0, f7);
                }
                jj jjVar = MediaController.B().u0;
                if (jjVar != null && jjVar.I3()) {
                    ((w7) this.b).b1(jjVar, false);
                    break;
                }
                break;
        }
    }

    @Override // eg.p
    public void l(boolean z10) {
        be0 be0Var = (be0) this.b;
        be0Var.getClass();
        ae0 ae0Var = be0Var.a;
        if (ae0Var != null) {
            ((bq0) ae0Var).b(z10);
        }
    }

    @Override // ge.a
    public /* synthetic */ void m(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // eg.p
    public void n() {
        ae0 ae0Var = ((be0) this.b).a;
        if (ae0Var != null) {
            PhotoViewer photoViewer = ((bq0) ae0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.t3();
            }
        }
    }

    @Override // s4.c0
    public void n0(int i10, int i11) {
        ((g0) this.b).o(i10, i11);
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bi0 B;
        switch (this.a) {
            case 18:
                break;
            default:
                boolean[] zArr = (boolean[]) this.b;
                if (z10 && (B = imageReceiver.B()) != null && !zArr[0]) {
                    B.N(0, false, false);
                    org.telegram.messenger.i0.g3(new o0(B, 0));
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    @Override // ge.a
    public /* synthetic */ void o1(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.t9
    public void onDismiss() {
        z0 z0Var = (z0) this.b;
        z0Var.x("scan_qr_popup_closed", null);
        z0Var.h0 = false;
    }

    public void p(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.y.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.y.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.y.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.y.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
        int i11 = this.a;
    }

    @Override // ge.a
    public void r(float f7, float f10) {
        switch (this.a) {
            case 11:
                su suVar = (su) this.b;
                ru h02 = su.h0(suVar, f7, f10);
                ru ruVar = suVar.a0;
                if (h02 != ruVar) {
                    ruVar = null;
                }
                su.i0(suVar, ruVar);
                break;
        }
    }

    public LongSparseArray s(long j10, long j11) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j10);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j11);
    }

    public boolean t() {
        return ((j0) this.b).c;
    }

    @Override // ge.a
    public void t0() {
        switch (this.a) {
            case 11:
                su suVar = (su) this.b;
                su.i0(suVar, suVar.a0);
                break;
            default:
                ((x51) this.b).h.c(true);
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 22:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // ge.a
    public /* synthetic */ void u(View view, float f7, float f10) {
        int i10 = this.a;
    }

    public SparseIntArray v(long j10) {
        return (SparseIntArray) ((a0.h) this.b).f(j10);
    }

    public void w(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int r10 = recyclerView.e.r();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < r10; i15++) {
            View q6 = recyclerView.e.q(i15);
            c1 U = RecyclerView.U(q6);
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
                ((s4.o0) q6.getLayoutParams()).c = true;
            }
        }
        hf.e eVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.y0 = true;
    }

    public void x(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int r10 = recyclerView.e.r();
        for (int i12 = 0; i12 < r10; i12++) {
            c1 U = RecyclerView.U(recyclerView.e.q(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    @Override // s4.c0
    public void x1(int i10, int i11) {
        ((g0) this.b).n(i10, i11, null);
    }

    public void y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int r10 = recyclerView.e.r();
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
        for (int i20 = 0; i20 < r10; i20++) {
            c1 U = RecyclerView.U(recyclerView.e.q(i20));
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
            c1 c1Var = (c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public f(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = new p0();
                break;
            case 9:
                this.b = new LongSparseArray();
                break;
            case 25:
                this.b = new a0.h();
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public f(String str, boolean z10) {
        this.a = 7;
        this.b = new j0(str, z10);
    }

    public f(Context context, p6 p6Var) {
        this.a = 12;
        z2 z2Var = new z2(1, context, p6Var, false);
        this.b = z2Var;
        z2Var.O();
    }

    private final void K() {
    }

    private final void M() {
    }

    private final /* synthetic */ void z(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void X0(is isVar) {
    }

    @Override // m.x0
    public void a(int i10) {
    }

    @Override // m.x0
    public void c(int i10) {
    }

    private final /* synthetic */ void A(float f7, float f10) {
    }

    private final /* synthetic */ void h(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void i(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void D(View view, float f7, float f10) {
    }

    private final /* synthetic */ void F(View view, float f7, float f10) {
    }

    private final /* synthetic */ void G(View view, float f7, float f10) {
    }

    private final /* synthetic */ void H(View view, float f7, float f10) {
    }

    private final /* synthetic */ void I(View view, float f7, float f10) {
    }

    private final /* synthetic */ void J(View view, float f7, float f10) {
    }

    private final void f(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
