package ci;

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
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.r40;
import org.telegram.ui.in;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class w2 implements og {
    public final /* synthetic */ q4 a;

    public w2(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        q4 q4Var = this.a;
        if (q4Var.G2) {
            AndroidUtilities.runOnUIThread(new ai.r3(this, j10, 3), 200L);
        } else {
            q4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers O() {
        h1 h1Var;
        q4 q4Var = this.a;
        if (!q4Var.O1.f) {
            return null;
        }
        aa aaVar = q4Var.J0;
        if (aaVar != null && (h1Var = aaVar.A0) != null) {
            if (h1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return q4Var.O3;
    }

    @Override // org.telegram.ui.Components.og
    public final void U(float f7, int i10) {
        m60 m60Var = this.a.J2;
        if (m60Var != null) {
            m60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int Y0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
        String str;
        q4 q4Var = this.a;
        if (q4Var.E1) {
            q4.h0(q4Var);
            return;
        }
        if (q4Var.W2 == null) {
            r40 r40Var = new r40(9, q4Var.getContext(), q4Var.B0, false);
            q4Var.W2 = r40Var;
            r40Var.setVisibility(8);
            q4Var.addView(q4Var.W2, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
        if (q4Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1));
            str = chat != null ? chat.title : "";
        }
        q4Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(q4Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        q4Var.W2.f(q4Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.og
    public final TL_stories.StoryItem a1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.og
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        q4 q4Var = this.a;
        if (q4Var.J2 == null && CameraView.isCameraAllowed()) {
            q4Var.J2 = new m60(q4Var.getContext(), new k3(q4Var), q4Var.B0, false);
            q4Var.addView(q4Var.J2, Math.min(q4Var.indexOfChild(q4Var.b2.getRecordCircle()), q4Var.indexOfChild(q4Var.b2.O1)), w7.z5.e(-1, -1, 51));
        }
        m60 m60Var = q4Var.J2;
        if (m60Var != null) {
            if (i10 == 0) {
                m60Var.h(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                m60Var.f(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                m60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean b1(long j10) {
        q4 q4Var = this.a;
        o4 o4Var = q4Var.O1;
        TL_stories.StoryItem storyItem = o4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) o4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(q4Var.C2).getInputPeer(j10);
            ConnectionsManager.getInstance(q4Var.C2).sendRequest(savedefaultsendas, null);
            h1 h1Var = q4Var.J0.A0;
            if (h1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(q4Var.C2).getPeer(j10);
                TLRPC.GroupCall groupCall = h1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    h1Var.v.default_send_as = peer;
                }
            }
            q4Var.r0(true);
            q4Var.b2.O1(true);
            q4Var.b2.I(true);
            q4Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e1() {
        m60 m60Var = this.a.J2;
        return (m60Var == null || m60Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        q4 q4Var = this.a;
        if (q4Var.d3 == null) {
            x2 x2Var = new x2(q4Var, q4Var.getContext(), q4Var.B1, q4Var.J0.f, q4Var.B0);
            q4Var.d3 = x2Var;
            x2Var.p(new a3(q4Var));
            q4Var.addView(q4Var.d3, w7.z5.e(-1, -1, 83));
        }
        if (q4Var.d3.getAdapter() != null) {
            q4Var.d3.setDialogId(q4Var.B1);
            if (q4Var.O1.f) {
                hg.j1 adapter = q4Var.d3.getAdapter();
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
                hg.j1 adapter2 = q4Var.d3.getAdapter();
                MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                q4Var.d3.getAdapter().U(charSequence, q4Var.b2.getCursorPosition(), null, false, false);
            }
        }
        q4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.og
    public final void i1() {
        m60 m60Var = this.a.J2;
        if (m60Var != null) {
            m60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean j1() {
        TLRPC.User user;
        q4 q4Var = this.a;
        return (q4Var.B1 < 0 || (user = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void l1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ in p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void q2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.Peer x() {
        h1 h1Var;
        aa aaVar = this.a.J0;
        if (aaVar == null || (h1Var = aaVar.A0) == null) {
            return null;
        }
        if (h1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return h1Var.i();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void H() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Z1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void e2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void q1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void u1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void y() {
    }

    @Override // org.telegram.ui.Components.og
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final void D0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }
}
