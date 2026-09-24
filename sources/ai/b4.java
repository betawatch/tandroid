package ai;

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
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.og;
import org.telegram.ui.mn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class b4 implements og {
    public final /* synthetic */ e6 a;

    public b4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.og
    public final void A2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        e6 e6Var = this.a;
        if (e6Var.G2) {
            AndroidUtilities.runOnUIThread(new j(this, j3, 1), 200L);
        } else {
            e6Var.k0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers J() {
        d2 d2Var;
        e6 e6Var = this.a;
        if (!e6Var.O1.f) {
            return null;
        }
        jc jcVar = e6Var.J0;
        if (jcVar != null && (d2Var = jcVar.A0) != null) {
            if (d2Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return e6Var.O3;
    }

    @Override // org.telegram.ui.Components.og
    public final void K(float f7, int i10) {
        c60 c60Var = this.a.J2;
        if (c60Var != null) {
            c60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int b1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final TL_stories.StoryItem d1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f1(long j3) {
        e6 e6Var = this.a;
        c6 c6Var = e6Var.O1;
        TL_stories.StoryItem storyItem = c6Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) c6Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(e6Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(e6Var.C2).sendRequest(savedefaultsendas, null);
            d2 d2Var = e6Var.J0.A0;
            if (d2Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(e6Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = d2Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    d2Var.v.default_send_as = peer;
                }
            }
            e6Var.r0(true);
            e6Var.b2.P1(true);
            e6Var.b2.K(true);
            e6Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean i1() {
        c60 c60Var = this.a.J2;
        return (c60Var == null || c60Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void i2() {
        String str;
        e6 e6Var = this.a;
        if (e6Var.E1) {
            e6.h0(e6Var);
            return;
        }
        if (e6Var.W2 == null) {
            j40 j40Var = new j40(9, e6Var.getContext(), e6Var.B0, false);
            e6Var.W2 = j40Var;
            j40Var.setVisibility(8);
            e6Var.addView(e6Var.W2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (e6Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1));
            str = chat != null ? chat.title : "";
        }
        e6Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(e6Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        e6Var.W2.f(e6Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.og
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        e6 e6Var = this.a;
        if (e6Var.J2 == null && CameraView.isCameraAllowed()) {
            e6Var.J2 = new c60(e6Var.getContext(), new r4(e6Var), e6Var.B0, false);
            e6Var.addView(e6Var.J2, Math.min(e6Var.indexOfChild(e6Var.b2.getRecordCircle()), e6Var.indexOfChild(e6Var.b2.O1)), w7.y5.e(-1, -1, 51));
        }
        c60 c60Var = e6Var.J2;
        if (c60Var != null) {
            if (i10 == 0) {
                c60Var.h(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                c60Var.f(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                c60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        e6 e6Var = this.a;
        if (e6Var.d3 == null) {
            c4 c4Var = new c4(e6Var, e6Var.getContext(), e6Var.B1, e6Var.J0.f, e6Var.B0);
            e6Var.d3 = c4Var;
            c4Var.p(new f4(e6Var));
            e6Var.addView(e6Var.d3, w7.y5.e(-1, -1, 83));
        }
        if (e6Var.d3.getAdapter() != null) {
            e6Var.d3.setDialogId(e6Var.B1);
            if (e6Var.O1.f) {
                gg.k1 adapter = e6Var.d3.getAdapter();
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
                gg.k1 adapter2 = e6Var.d3.getAdapter();
                MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                e6Var.d3.getAdapter().U(charSequence, e6Var.b2.getCursorPosition(), null, false, false);
            }
        }
        e6Var.invalidate();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
        c60 c60Var = this.a.J2;
        if (c60Var != null) {
            c60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean o1() {
        TLRPC.User user;
        e6 e6Var = this.a;
        return (e6Var.B1 < 0 || (user = MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ mn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final void q1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.og
    public final void s1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.Peer v() {
        d2 d2Var;
        jc jcVar = this.a.J0;
        if (jcVar == null || (d2Var = jcVar.A0) == null) {
            return null;
        }
        if (d2Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return d2Var.i();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final void D() {
    }

    @Override // org.telegram.ui.Components.og
    public final void E1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void g() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void x() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }
}
