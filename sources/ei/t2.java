package ei;

import android.view.View;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.uf;
import org.telegram.ui.mm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t2 implements uf {
    public final /* synthetic */ j4 a;

    public t2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.uf
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        j4 j4Var = this.a;
        if (j4Var.q2) {
            org.telegram.messenger.g0.i3(new ci.e3(this, j10, 3), 200L);
        } else {
            j4Var.i0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final TLRPC.TL_channels_sendAsPeers M() {
        g1 g1Var;
        j4 j4Var = this.a;
        if (!j4Var.y1.f) {
            return null;
        }
        r9 r9Var = j4Var.t0;
        if (r9Var != null && (g1Var = r9Var.B0) != null) {
            if (g1Var.w == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return j4Var.y3;
    }

    @Override // org.telegram.ui.Components.uf
    public final void O(float f10, int i3) {
        k40 k40Var = this.a.t2;
        if (k40Var != null) {
            k40Var.b(f10, i3);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final int O0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.uf
    public final TL_stories.StoryItem R0() {
        return this.a.y1.a;
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean T0(long j10) {
        j4 j4Var = this.a;
        h4 h4Var = j4Var.y1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) h4Var.a.media).call;
            savedefaultsendas.send_as = hp.s1(j4Var.m2).j1(j10);
            ConnectionsManager.getInstance(j4Var.m2).sendRequest(savedefaultsendas, null);
            g1 g1Var = j4Var.t0.B0;
            if (g1Var != null) {
                TLRPC.Peer z12 = hp.s1(j4Var.m2).z1(j10);
                TLRPC.GroupCall groupCall = g1Var.w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, true);
                    g1Var.w.default_send_as = z12;
                }
            }
            j4Var.p0(true);
            j4Var.L1.Q1(true);
            j4Var.L1.E(true);
            j4Var.d1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean V0() {
        k40 k40Var = this.a.t2;
        return (k40Var == null || k40Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.uf
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        j4 j4Var = this.a;
        if (j4Var.N2 == null) {
            u2 u2Var = new u2(j4Var, j4Var.getContext(), j4Var.l1, j4Var.t0.f, j4Var.l0);
            j4Var.N2 = u2Var;
            u2Var.p(new w2(j4Var));
            j4Var.addView(j4Var.N2, mf.e(-1, -1, 83));
        }
        if (j4Var.N2.getAdapter() != null) {
            j4Var.N2.setDialogId(j4Var.l1);
            if (j4Var.y1.f) {
                kg.e1 adapter = j4Var.N2.getAdapter();
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
                kg.e1 adapter2 = j4Var.N2.getAdapter();
                hp.s1(j4Var.m2).a2(Long.valueOf(j4Var.l1));
                TLRPC.Chat M0 = hp.s1(j4Var.m2).M0(Long.valueOf(-j4Var.l1));
                adapter2.getClass();
                adapter2.m0 = M0;
                j4Var.N2.getAdapter().U(charSequence, j4Var.L1.getCursorPosition(), null, false, false);
            }
        }
        j4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.uf
    public final void Z0() {
        k40 k40Var = this.a.t2;
        if (k40Var != null) {
            k40Var.j();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean a1() {
        TLRPC.User a22;
        j4 j4Var = this.a;
        return (j4Var.l1 < 0 || (a22 = hp.s1(j4Var.m2).a2(Long.valueOf(j4Var.l1))) == null || l10.B(a22) || a22.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.uf
    public final void b1() {
        this.a.M0();
    }

    @Override // org.telegram.ui.Components.uf
    public final void b2() {
        String str;
        j4 j4Var = this.a;
        if (j4Var.o1) {
            j4.f0(j4Var);
            return;
        }
        if (j4Var.G2 == null) {
            u20 u20Var = new u20(9, j4Var.getContext(), j4Var.l0, false);
            j4Var.G2 = u20Var;
            u20Var.setVisibility(8);
            j4Var.addView(j4Var.G2, mf.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (j4Var.l1 >= 0) {
            str = l10.j(hp.s1(j4Var.m2).a2(Long.valueOf(j4Var.l1)), true);
        } else {
            TLRPC.Chat M0 = hp.s1(j4Var.m2).M0(Long.valueOf(-j4Var.l1));
            str = M0 != null ? M0.title : "";
        }
        j4Var.G2.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, j4Var.L1.d1 ? 2131743604 : 2131743530, str)));
        j4Var.G2.c(j4Var.L1.getAudioVideoButtonContainer());
    }

    @Override // org.telegram.ui.Components.uf
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        j4 j4Var = this.a;
        if (j4Var.t2 == null && CameraView.isCameraAllowed()) {
            j4Var.t2 = new k40(j4Var.getContext(), new f3(j4Var), j4Var.l0, false);
            j4Var.addView(j4Var.t2, Math.min(j4Var.indexOfChild(j4Var.L1.getRecordCircle()), j4Var.indexOfChild(j4Var.L1.P1)), mf.e(-1, -1, 51));
        }
        k40 k40Var = j4Var.t2;
        if (k40Var != null) {
            if (i3 == 0) {
                k40Var.i(false);
                return;
            }
            if (i3 == 1 || i3 == 3 || i3 == 4) {
                k40Var.g(i3, i10, i11, j10, j11, z10);
            } else if (i3 == 2 || i3 == 5) {
                k40Var.a(i3 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void g1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ mm i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uf
    public final void r2() {
        this.a.N0();
    }

    @Override // org.telegram.ui.Components.uf
    public final TLRPC.Peer t() {
        g1 g1Var;
        r9 r9Var = this.a.t0;
        if (r9Var == null || (g1Var = r9Var.B0) == null) {
            return null;
        }
        if (g1Var.w == null ? false : !r1.messages_enabled) {
            return null;
        }
        return g1Var.i();
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean u0() {
        return true;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void M0(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void T1(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void j1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void F() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void e() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void q0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void u() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void h1(View view, CharSequence charSequence, boolean z10) {
    }
}
