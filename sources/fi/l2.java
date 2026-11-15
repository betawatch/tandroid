package fi;

import android.view.View;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.r40;
import org.telegram.ui.qm;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l2 implements cg {
    public final /* synthetic */ b4 a;

    public l2(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.cg
    public final void B2() {
        this.a.N0();
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        b4 b4Var = this.a;
        if (b4Var.q2) {
            org.telegram.messenger.g0.i3(new di.x2(this, j3, 3), 200L);
        } else {
            b4Var.i0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final TLRPC.TL_channels_sendAsPeers O() {
        e1 e1Var;
        b4 b4Var = this.a;
        if (!b4Var.y1.f) {
            return null;
        }
        i9 i9Var = b4Var.t0;
        if (i9Var != null && (e1Var = i9Var.B0) != null) {
            if (e1Var.w == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return b4Var.y3;
    }

    @Override // org.telegram.ui.Components.cg
    public final void W(float f10, int i7) {
        r40 r40Var = this.a.t2;
        if (r40Var != null) {
            r40Var.b(f10, i7);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final int b1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.cg
    public final TL_stories.StoryItem c1() {
        return this.a.y1.a;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean e1(long j3) {
        b4 b4Var = this.a;
        z3 z3Var = b4Var.y1;
        TL_stories.StoryItem storyItem = z3Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) z3Var.a.media).call;
            savedefaultsendas.send_as = np.s1(b4Var.m2).j1(j3);
            ConnectionsManager.getInstance(b4Var.m2).sendRequest(savedefaultsendas, null);
            e1 e1Var = b4Var.t0.B0;
            if (e1Var != null) {
                TLRPC.Peer z12 = np.s1(b4Var.m2).z1(j3);
                TLRPC.GroupCall groupCall = e1Var.w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, true);
                    e1Var.w.default_send_as = z12;
                }
            }
            b4Var.p0(true);
            b4Var.L1.j2(true);
            b4Var.L1.N(true);
            b4Var.d1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean g1() {
        r40 r40Var = this.a.t2;
        return (r40Var == null || r40Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        b4 b4Var = this.a;
        if (b4Var.N2 == null) {
            m2 m2Var = new m2(b4Var, b4Var.getContext(), b4Var.l1, b4Var.t0.f, b4Var.l0);
            b4Var.N2 = m2Var;
            m2Var.p(new o2(b4Var));
            b4Var.addView(b4Var.N2, ja.e(-1, -1, 83));
        }
        if (b4Var.N2.getAdapter() != null) {
            b4Var.N2.setDialogId(b4Var.l1);
            if (b4Var.y1.f) {
                jg.h1 adapter = b4Var.N2.getAdapter();
                if (adapter.k0 == 0 && adapter.v0 == 0 && adapter.u0 == 0 && adapter.F0 == 0) {
                    adapter.x0 = null;
                    adapter.G = null;
                    ArrayList arrayList = adapter.B0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.S;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.U = null;
                    adapter.V = null;
                    ArrayList arrayList3 = adapter.y;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.J;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.K;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.N;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.O;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.f();
                }
            } else {
                jg.h1 adapter2 = b4Var.N2.getAdapter();
                np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1));
                TLRPC.Chat M0 = np.s1(b4Var.m2).M0(Long.valueOf(-b4Var.l1));
                adapter2.getClass();
                adapter2.m0 = M0;
                b4Var.N2.getAdapter().U(charSequence, b4Var.L1.getCursorPosition(), null, false, false);
            }
        }
        b4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final void l1() {
        r40 r40Var = this.a.t2;
        if (r40Var != null) {
            r40Var.k();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean m1() {
        TLRPC.User a22;
        b4 b4Var = this.a;
        return (b4Var.l1 < 0 || (a22 = np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1))) == null || q10.B(a22) || a22.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void m2() {
        String str;
        b4 b4Var = this.a;
        if (b4Var.o1) {
            b4.f0(b4Var);
            return;
        }
        if (b4Var.G2 == null) {
            b30 b30Var = new b30(9, b4Var.getContext(), b4Var.l0, false);
            b4Var.G2 = b30Var;
            b30Var.setVisibility(8);
            b4Var.addView(b4Var.G2, ja.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (b4Var.l1 >= 0) {
            str = q10.j(np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1)), true);
        } else {
            TLRPC.Chat M0 = np.s1(b4Var.m2).M0(Long.valueOf(-b4Var.l1));
            str = M0 != null ? M0.title : "";
        }
        b4Var.G2.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, b4Var.L1.d1 ? 2131743594 : 2131743520, str)));
        b4Var.G2.c(b4Var.L1.getAudioVideoButtonContainer());
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.cg
    public final void n1() {
        this.a.M0();
    }

    @Override // org.telegram.ui.Components.cg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        b4 b4Var = this.a;
        if (b4Var.t2 == null && CameraView.isCameraAllowed()) {
            b4Var.t2 = new r40(b4Var.getContext(), new x2(b4Var), b4Var.l0, false);
            b4Var.addView(b4Var.t2, Math.min(b4Var.indexOfChild(b4Var.L1.getRecordCircle()), b4Var.indexOfChild(b4Var.L1.w2)), ja.e(-1, -1, 51));
        }
        r40 r40Var = b4Var.t2;
        if (r40Var != null) {
            if (i7 == 0) {
                r40Var.j(false);
                return;
            }
            if (i7 == 1 || i7 == 3 || i7 == 4) {
                r40Var.h(i7, i10, i11, j3, j10, z10);
            } else if (i7 == 2 || i7 == 5) {
                r40Var.a(i7 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ qm p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public final void q1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.cg
    public final TLRPC.Peer s() {
        e1 e1Var;
        i9 i9Var = this.a.t0;
        if (i9Var == null || (e1Var = i9Var.B0) == null) {
            return null;
        }
        if (e1Var.w == null ? false : !r1.messages_enabled) {
            return null;
        }
        return e1Var.i();
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void a1(int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void b0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void k2(int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void y(float f10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void E() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void I() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void b() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void v() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }
}
