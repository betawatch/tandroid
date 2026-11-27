// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class h58 implements xy1 {
    public final /* synthetic */ o68 a;

    public h58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // xy1
    public final void B(float f, int i) {
        q qVar = this.a.t2;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override // xy1
    public final void D1() {
        String str;
        o68 o68Var = this.a;
        if (o68Var.o1) {
            o68Var.Y0();
            return;
        }
        if (o68Var.G2 == null) {
            lg5 lg5Var = new lg5(9, o68Var.l0, o68Var.getContext(), false);
            o68Var.G2 = lg5Var;
            lg5Var.setVisibility(8);
            o68Var.addView(o68Var.G2, tre.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        long j = o68Var.l1;
        int i = o68Var.m2;
        if (j >= 0) {
            str = lbc.k(uc7.s1(i).X1(Long.valueOf(o68Var.l1)), true);
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-o68Var.l1));
            str = M0 != null ? M0.title : "";
        }
        o68Var.G2.setText(hl.S2(ob6.a0(null, null, o68Var.L1.d1 ? 2131743249 : 2131743172, str)));
        o68Var.G2.c(o68Var.L1.getAudioVideoButtonContainer());
    }

    @Override // xy1
    public final int E0() {
        return this.a.getHeight();
    }

    @Override // xy1
    public final TL_stories.StoryItem F0() {
        return this.a.y1.a;
    }

    @Override // xy1
    public final boolean H0(long j) {
        o68 o68Var = this.a;
        n68 n68Var = o68Var.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) n68Var.a.media).call;
            savedefaultsendas.send_as = uc7.s1(o68Var.m2).j1(j);
            ConnectionsManager.getInstance(o68Var.m2).sendRequest(savedefaultsendas, null);
            w96 w96Var = o68Var.t0.B0;
            if (w96Var != null) {
                TLRPC.Peer y1 = uc7.s1(o68Var.m2).y1(j);
                TLRPC.GroupCall groupCall = w96Var.s;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, true);
                    w96Var.s.default_send_as = y1;
                }
            }
            o68Var.h0(true);
            o68Var.L1.I2(true);
            o68Var.L1.P(true);
            o68Var.c1(false);
        }
        return true;
    }

    @Override // xy1
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
        o68 o68Var = this.a;
        boolean z2 = false;
        if (o68Var.t2 == null && CameraView.isCameraAllowed()) {
            o68Var.t2 = new q(o68Var.getContext(), new p58(o68Var), o68Var.l0, false);
            o68Var.addView(o68Var.t2, Math.min(o68Var.indexOfChild(o68Var.L1.getRecordCircle()), o68Var.indexOfChild(o68Var.L1.D2)), tre.e(-1, -1, 51));
        }
        q qVar = o68Var.t2;
        if (qVar != null) {
            if (i == 0) {
                qVar.v();
                return;
            }
            if (i == 1 || i == 3 || i == 4) {
                qVar.u(i, i2, i3, j, j2, z);
                return;
            }
            if (i == 2) {
                z2 = true;
            } else if (i != 5) {
                return;
            }
            qVar.f(z2);
        }
    }

    @Override // xy1
    public final boolean L0() {
        ip9 ip9Var;
        q qVar = this.a.t2;
        if (qVar == null || (ip9Var = qVar.S) == null) {
            return false;
        }
        int i = ip9Var.a;
        return i == 4 || i == 5 || i == 6;
    }

    @Override // xy1
    public final ou1 R() {
        return null;
    }

    @Override // xy1
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
        o68 o68Var = this.a;
        if (o68Var.N2 == null) {
            i58 i58Var = new i58(o68Var, o68Var.getContext(), o68Var.l1, o68Var.t0.f, o68Var.l0);
            o68Var.N2 = i58Var;
            i58Var.p(new j58(o68Var));
            o68Var.addView(o68Var.N2, tre.e(-1, -1, 83));
        }
        if (o68Var.N2.getAdapter() != null) {
            o68Var.N2.setDialogId(o68Var.l1);
            boolean z3 = o68Var.y1.f;
            i58 i58Var2 = o68Var.N2;
            if (z3) {
                r17 adapter = i58Var2.getAdapter();
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
                r17 adapter2 = i58Var2.getAdapter();
                uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1));
                TLRPC.Chat M0 = uc7.s1(o68Var.m2).M0(Long.valueOf(-o68Var.l1));
                adapter2.getClass();
                adapter2.m0 = M0;
                o68Var.N2.getAdapter().U(charSequence, o68Var.L1.getCursorPosition(), null, false, false);
            }
        }
        o68Var.invalidate();
    }

    @Override // xy1
    public final void S0() {
        q qVar = this.a.t2;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // xy1
    public final void S1() {
        this.a.J0();
    }

    @Override // xy1
    public final boolean T0() {
        TLRPC.User X1;
        o68 o68Var = this.a;
        return (o68Var.l1 < 0 || (X1 = uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1))) == null || lbc.D(X1) || X1.bot) ? false : true;
    }

    @Override // xy1
    public final void W0() {
        this.a.H0();
    }

    @Override // xy1
    public final void Z0() {
        this.a.requestLayout();
    }

    @Override // xy1
    public final boolean e0() {
        return true;
    }

    @Override // xy1
    public final boolean e1() {
        return false;
    }

    @Override // xy1
    public final boolean g() {
        return false;
    }

    @Override // xy1
    public final int j() {
        return 0;
    }

    @Override // xy1
    public final TLRPC.Peer k() {
        w96 w96Var;
        lcb lcbVar = this.a.t0;
        if (lcbVar == null || (w96Var = lcbVar.B0) == null) {
            return null;
        }
        if (w96Var.s == null ? false : !r0.messages_enabled) {
            return null;
        }
        return w96Var.l();
    }

    @Override // xy1
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
        o68 o68Var = this.a;
        if (o68Var.q2) {
            hl.d3(new kt(this, j, (byte) 23), 200L);
        } else {
            o68Var.a0(j <= 0);
        }
    }

    @Override // xy1
    public final TLRPC.TL_channels_sendAsPeers y() {
        w96 w96Var;
        o68 o68Var = this.a;
        if (!o68Var.y1.f) {
            return null;
        }
        lcb lcbVar = o68Var.t0;
        if (lcbVar != null && (w96Var = lcbVar.B0) != null) {
            if (w96Var.s == null ? false : !r0.messages_enabled) {
                return null;
            }
        }
        return o68Var.x3;
    }

    @Override // xy1
    public final void B1() {
    }

    @Override // xy1
    public final void C() {
    }

    @Override // xy1
    public final void J() {
    }

    @Override // xy1
    public final void O1() {
    }

    @Override // xy1
    public final void P1() {
    }

    @Override // xy1
    public final void V() {
    }

    @Override // xy1
    public final void X0() {
    }

    @Override // xy1
    public final void a() {
    }

    @Override // xy1
    public final void e() {
    }

    @Override // xy1
    public final void f0() {
    }

    @Override // xy1
    public final void g1() {
    }

    @Override // xy1
    public final void i0() {
    }

    @Override // xy1
    public final void n() {
    }

    @Override // xy1
    public final void p1() {
    }

    @Override // xy1
    public final void s() {
    }

    @Override // xy1
    public final void t0() {
    }

    @Override // xy1
    public final void w() {
    }

    @Override // xy1
    public final void C1(int i) {
    }

    @Override // xy1
    public final void D(boolean z) {
    }

    @Override // xy1
    public final void E1(boolean z) {
    }

    @Override // xy1
    public final void d1(CharSequence charSequence) {
    }

    @Override // xy1
    public final void o(float f) {
    }

    @Override // xy1
    public final void p(boolean z) {
    }

    @Override // xy1
    public final void z0(int i) {
    }

    @Override // xy1
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }
}
