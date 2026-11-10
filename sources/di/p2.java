package di;

import android.view.View;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.y20;
import org.telegram.ui.sm;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p2 implements vf {
    public final /* synthetic */ j4 a;

    public p2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.vf
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        j4 j4Var = this.a;
        if (j4Var.p2) {
            org.telegram.messenger.g0.i3(new bi.r3(this, j3, 3), 200L);
        } else {
            j4Var.i0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.vf
    public final TLRPC.TL_channels_sendAsPeers I() {
        g1 g1Var;
        j4 j4Var = this.a;
        if (!j4Var.x1.f) {
            return null;
        }
        q9 q9Var = j4Var.s0;
        if (q9Var != null && (g1Var = q9Var.A0) != null) {
            if (g1Var.w == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return j4Var.x3;
    }

    @Override // org.telegram.ui.Components.vf
    public final void M(float f10, int i7) {
        o40 o40Var = this.a.s2;
        if (o40Var != null) {
            o40Var.b(f10, i7);
        }
    }

    @Override // org.telegram.ui.Components.vf
    public final int S0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.vf
    public final TL_stories.StoryItem T0() {
        return this.a.x1.a;
    }

    @Override // org.telegram.ui.Components.vf
    public final boolean V0(long j3) {
        j4 j4Var = this.a;
        h4 h4Var = j4Var.x1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) h4Var.a.media).call;
            savedefaultsendas.send_as = qp.s1(j4Var.l2).j1(j3);
            ConnectionsManager.getInstance(j4Var.l2).sendRequest(savedefaultsendas, null);
            g1 g1Var = j4Var.s0.A0;
            if (g1Var != null) {
                TLRPC.Peer z12 = qp.s1(j4Var.l2).z1(j3);
                TLRPC.GroupCall groupCall = g1Var.w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, true);
                    g1Var.w.default_send_as = z12;
                }
            }
            j4Var.p0(true);
            j4Var.K1.R1(true);
            j4Var.K1.E(true);
            j4Var.d1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vf
    public final boolean X0() {
        o40 o40Var = this.a.s2;
        return (o40Var == null || o40Var.i0) ? false : true;
    }

    @Override // org.telegram.ui.Components.vf
    public final void X1() {
        String str;
        j4 j4Var = this.a;
        if (j4Var.n1) {
            j4.f0(j4Var);
            return;
        }
        if (j4Var.F2 == null) {
            y20 y20Var = new y20(9, j4Var.getContext(), j4Var.k0, false);
            j4Var.F2 = y20Var;
            y20Var.setVisibility(8);
            j4Var.addView(j4Var.F2, ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (j4Var.k1 >= 0) {
            str = t10.j(qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1)), true);
        } else {
            TLRPC.Chat M0 = qp.s1(j4Var.l2).M0(Long.valueOf(-j4Var.k1));
            str = M0 != null ? M0.title : "";
        }
        j4Var.F2.setText(org.telegram.messenger.g0.X2(id.a0(null, null, j4Var.K1.c1 ? 2131743594 : 2131743520, str)));
        j4Var.F2.c(j4Var.K1.getAudioVideoButtonContainer());
    }

    @Override // org.telegram.ui.Components.vf
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        j4 j4Var = this.a;
        if (j4Var.s2 == null && CameraView.isCameraAllowed()) {
            j4Var.s2 = new o40(j4Var.getContext(), new c3(j4Var), j4Var.k0, false);
            j4Var.addView(j4Var.s2, Math.min(j4Var.indexOfChild(j4Var.K1.getRecordCircle()), j4Var.indexOfChild(j4Var.K1.O1)), ha.e(-1, -1, 51));
        }
        o40 o40Var = j4Var.s2;
        if (o40Var != null) {
            if (i7 == 0) {
                o40Var.j(false);
                return;
            }
            if (i7 == 1 || i7 == 3 || i7 == 4) {
                o40Var.h(i7, i10, i11, j3, j10, z9);
            } else if (i7 == 2 || i7 == 5) {
                o40Var.a(i7 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.vf
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        j4 j4Var = this.a;
        if (j4Var.M2 == null) {
            q2 q2Var = new q2(j4Var, j4Var.getContext(), j4Var.k1, j4Var.s0.f, j4Var.k0);
            j4Var.M2 = q2Var;
            q2Var.p(new t2(j4Var));
            j4Var.addView(j4Var.M2, ha.e(-1, -1, 83));
        }
        if (j4Var.M2.getAdapter() != null) {
            j4Var.M2.setDialogId(j4Var.k1);
            if (j4Var.x1.f) {
                jg.i1 adapter = j4Var.M2.getAdapter();
                if (adapter.j0 == 0 && adapter.u0 == 0 && adapter.t0 == 0 && adapter.E0 == 0) {
                    adapter.w0 = null;
                    adapter.F = null;
                    ArrayList arrayList = adapter.A0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.R;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.T = null;
                    adapter.U = null;
                    ArrayList arrayList3 = adapter.y;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.I;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.J;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.M;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.N;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.f();
                }
            } else {
                jg.i1 adapter2 = j4Var.M2.getAdapter();
                qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1));
                TLRPC.Chat M0 = qp.s1(j4Var.l2).M0(Long.valueOf(-j4Var.k1));
                adapter2.getClass();
                adapter2.l0 = M0;
                j4Var.M2.getAdapter().U(charSequence, j4Var.K1.getCursorPosition(), null, false, false);
            }
        }
        j4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final void c1() {
        o40 o40Var = this.a.s2;
        if (o40Var != null) {
            o40Var.k();
        }
    }

    @Override // org.telegram.ui.Components.vf
    public final boolean d1() {
        TLRPC.User a22;
        j4 j4Var = this.a;
        return (j4Var.k1 < 0 || (a22 = qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1))) == null || t10.B(a22) || a22.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.vf
    public final void e1() {
        this.a.M0();
    }

    @Override // org.telegram.ui.Components.vf
    public final void h1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final void l2() {
        this.a.N0();
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ sm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final TLRPC.Peer s() {
        g1 g1Var;
        q9 q9Var = this.a.s0;
        if (q9Var == null || (g1Var = q9Var.A0) == null) {
            return null;
        }
        if (g1Var.w == null ? false : !r1.messages_enabled) {
            return null;
        }
        return g1Var.i();
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Y1(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void k1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void w(float f10) {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void a() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void t() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }
}
