package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.w50;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class o3 implements og {
    public final /* synthetic */ o5 a;

    public o3(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.og
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        o5 o5Var = this.a;
        if (o5Var.G2) {
            AndroidUtilities.runOnUIThread(new g(this, j3, 1), 200L);
        } else {
            o5Var.k0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers H() {
        t1 t1Var;
        o5 o5Var = this.a;
        if (!o5Var.O1.f) {
            return null;
        }
        pb pbVar = o5Var.J0;
        if (pbVar != null && (t1Var = pbVar.A0) != null) {
            if (t1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return o5Var.O3;
    }

    @Override // org.telegram.ui.Components.og
    public final void J(float f7, int i10) {
        w50 w50Var = this.a.J2;
        if (w50Var != null) {
            w50Var.e(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int W0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final TL_stories.StoryItem Y0() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean a1(long j3) {
        o5 o5Var = this.a;
        m5 m5Var = o5Var.O1;
        TL_stories.StoryItem storyItem = m5Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) m5Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(o5Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(o5Var.C2).sendRequest(savedefaultsendas, null);
            t1 t1Var = o5Var.J0.A0;
            if (t1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(o5Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = t1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    t1Var.v.default_send_as = peer;
                }
            }
            o5Var.r0(true);
            o5Var.b2.P1(true);
            o5Var.b2.K(true);
            o5Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void a2() {
        String str;
        o5 o5Var = this.a;
        if (o5Var.E1) {
            o5.h0(o5Var);
            return;
        }
        if (o5Var.W2 == null) {
            i40 i40Var = new i40(9, o5Var.getContext(), o5Var.B0, false);
            o5Var.W2 = i40Var;
            i40Var.setVisibility(8);
            o5Var.addView(o5Var.W2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (o5Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
            str = chat != null ? chat.title : "";
        }
        o5Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(o5Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        o5Var.W2.f(o5Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.og
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        o5 o5Var = this.a;
        if (o5Var.J2 == null && CameraView.isCameraAllowed()) {
            o5Var.J2 = new w50(o5Var.getContext(), new d4(o5Var), o5Var.B0, false);
            o5Var.addView(o5Var.J2, Math.min(o5Var.indexOfChild(o5Var.b2.getRecordCircle()), o5Var.indexOfChild(o5Var.b2.N1)), w7.x5.e(-1, -1, 51));
        }
        w50 w50Var = o5Var.J2;
        if (w50Var != null) {
            if (i10 == 0) {
                w50Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                w50Var.k(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                w50Var.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d1() {
        w50 w50Var = this.a.J2;
        return (w50Var == null || w50Var.e0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        o5 o5Var = this.a;
        if (o5Var.d3 == null) {
            p3 p3Var = new p3(o5Var, o5Var.getContext(), o5Var.B1, o5Var.J0.f, o5Var.B0);
            o5Var.d3 = p3Var;
            p3Var.p(new s3(o5Var));
            o5Var.addView(o5Var.d3, w7.x5.e(-1, -1, 83));
        }
        if (o5Var.d3.getAdapter() != null) {
            o5Var.d3.setDialogId(o5Var.B1);
            if (o5Var.O1.f) {
                hg.k1 adapter = o5Var.d3.getAdapter();
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
                    ArrayList arrayList3 = adapter.x;
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
                    adapter.l();
                }
            } else {
                hg.k1 adapter2 = o5Var.d3.getAdapter();
                MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                o5Var.d3.getAdapter().U(charSequence, o5Var.b2.getCursorPosition(), null, false, false);
            }
        }
        o5Var.invalidate();
    }

    @Override // org.telegram.ui.Components.og
    public final void h1() {
        w50 w50Var = this.a.J2;
        if (w50Var != null) {
            w50Var.q();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean i1() {
        TLRPC.User user;
        o5 o5Var = this.a;
        return (o5Var.B1 < 0 || (user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void k1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ sn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.Peer q() {
        t1 t1Var;
        pb pbVar = this.a.J0;
        if (pbVar == null || (t1Var = pbVar.A0) == null) {
            return null;
        }
        if (t1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return t1Var.i();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void r2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean z0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void C() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void v() {
    }

    @Override // org.telegram.ui.Components.og
    public final void x1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void W(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void b2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void p1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void x(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void B0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }
}
