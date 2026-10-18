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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class v2 implements og {
    public final /* synthetic */ p4 a;

    public v2(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        p4 p4Var = this.a;
        if (p4Var.G2) {
            AndroidUtilities.runOnUIThread(new ai.t3(this, j10, 3), 200L);
        } else {
            p4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers O() {
        h1 h1Var;
        p4 p4Var = this.a;
        if (!p4Var.O1.f) {
            return null;
        }
        z9 z9Var = p4Var.J0;
        if (z9Var != null && (h1Var = z9Var.A0) != null) {
            if (h1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return p4Var.O3;
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
        p4 p4Var = this.a;
        if (p4Var.E1) {
            p4.h0(p4Var);
            return;
        }
        if (p4Var.W2 == null) {
            r40 r40Var = new r40(9, p4Var.getContext(), p4Var.B0, false);
            p4Var.W2 = r40Var;
            r40Var.setVisibility(8);
            p4Var.addView(p4Var.W2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (p4Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1));
            str = chat != null ? chat.title : "";
        }
        p4Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(p4Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        p4Var.W2.f(p4Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.og
    public final TL_stories.StoryItem a1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.og
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        p4 p4Var = this.a;
        if (p4Var.J2 == null && CameraView.isCameraAllowed()) {
            p4Var.J2 = new m60(p4Var.getContext(), new j3(p4Var), p4Var.B0, false);
            p4Var.addView(p4Var.J2, Math.min(p4Var.indexOfChild(p4Var.b2.getRecordCircle()), p4Var.indexOfChild(p4Var.b2.O1)), w7.z5.e(-1, -1, 51));
        }
        m60 m60Var = p4Var.J2;
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
        p4 p4Var = this.a;
        n4 n4Var = p4Var.O1;
        TL_stories.StoryItem storyItem = n4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) n4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(p4Var.C2).getInputPeer(j10);
            ConnectionsManager.getInstance(p4Var.C2).sendRequest(savedefaultsendas, null);
            h1 h1Var = p4Var.J0.A0;
            if (h1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(p4Var.C2).getPeer(j10);
                TLRPC.GroupCall groupCall = h1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    h1Var.v.default_send_as = peer;
                }
            }
            p4Var.r0(true);
            p4Var.b2.O1(true);
            p4Var.b2.I(true);
            p4Var.f1(false);
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
        p4 p4Var = this.a;
        if (p4Var.d3 == null) {
            w2 w2Var = new w2(p4Var, p4Var.getContext(), p4Var.B1, p4Var.J0.f, p4Var.B0);
            p4Var.d3 = w2Var;
            w2Var.p(new z2(p4Var));
            p4Var.addView(p4Var.d3, w7.z5.e(-1, -1, 83));
        }
        if (p4Var.d3.getAdapter() != null) {
            p4Var.d3.setDialogId(p4Var.B1);
            if (p4Var.O1.f) {
                hg.j1 adapter = p4Var.d3.getAdapter();
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
                hg.j1 adapter2 = p4Var.d3.getAdapter();
                MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                p4Var.d3.getAdapter().U(charSequence, p4Var.b2.getCursorPosition(), null, false, false);
            }
        }
        p4Var.invalidate();
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
        p4 p4Var = this.a;
        return (p4Var.B1 < 0 || (user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
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
        z9 z9Var = this.a.J0;
        if (z9Var == null || (h1Var = z9Var.A0) == null) {
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
