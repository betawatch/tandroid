package jh;

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
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.x30;
import org.telegram.ui.hn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p2 implements ag {
    public final /* synthetic */ e4 a;

    public p2(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // org.telegram.ui.Components.ag
    public final void A(float f10, int i10) {
        k50 k50Var = this.a.F2;
        if (k50Var != null) {
            k50Var.e(f10, i10);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ hn P() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final int P0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.ag
    public final TL_stories.StoryItem T0() {
        return this.a.K1.a;
    }

    @Override // org.telegram.ui.Components.ag
    public final void U1() {
        String str;
        e4 e4Var = this.a;
        if (e4Var.A1) {
            e4.h0(e4Var);
            return;
        }
        if (e4Var.S2 == null) {
            x30 x30Var = new x30(9, e4Var.getContext(), e4Var.x0, false);
            e4Var.S2 = x30Var;
            x30Var.setVisibility(8);
            e4Var.addView(e4Var.S2, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (e4Var.x1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(e4Var.x1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(e4Var.y2).getChat(Long.valueOf(-e4Var.x1));
            str = chat != null ? chat.title : "";
        }
        e4Var.S2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(e4Var.X1.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        e4Var.S2.f(e4Var.X1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean X0(long j10) {
        e4 e4Var = this.a;
        c4 c4Var = e4Var.K1;
        TL_stories.StoryItem storyItem = c4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) c4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(e4Var.y2).getInputPeer(j10);
            ConnectionsManager.getInstance(e4Var.y2).sendRequest(savedefaultsendas, null);
            d1 d1Var = e4Var.F0.w0;
            if (d1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(e4Var.y2).getPeer(j10);
                TLRPC.GroupCall groupCall = d1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    d1Var.v.default_send_as = peer;
                }
            }
            e4Var.r0(true);
            e4Var.X1.O1(true);
            e4Var.X1.K(true);
            e4Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ag
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        e4 e4Var = this.a;
        if (e4Var.F2 == null && CameraView.isCameraAllowed()) {
            e4Var.F2 = new k50(e4Var.getContext(), new c3(e4Var), e4Var.x0, false);
            e4Var.addView(e4Var.F2, Math.min(e4Var.indexOfChild(e4Var.X1.getRecordCircle()), e4Var.indexOfChild(e4Var.X1.J1)), h7.z5.e(-1, -1, 51));
        }
        k50 k50Var = e4Var.F2;
        if (k50Var != null) {
            if (i10 == 0) {
                k50Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                k50Var.k(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                k50Var.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean b1() {
        k50 k50Var = this.a.F2;
        return (k50Var == null || k50Var.a0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ag
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        e4 e4Var = this.a;
        if (e4Var.Z2 == null) {
            q2 q2Var = new q2(e4Var, e4Var.getContext(), e4Var.x1, e4Var.F0.f, e4Var.x0);
            e4Var.Z2 = q2Var;
            q2Var.p(new s2(e4Var));
            e4Var.addView(e4Var.Z2, h7.z5.e(-1, -1, 83));
        }
        if (e4Var.Z2.getAdapter() != null) {
            e4Var.Z2.setDialogId(e4Var.x1);
            if (e4Var.K1.f) {
                pf.u0 adapter = e4Var.Z2.getAdapter();
                if (adapter.f0 == 0 && adapter.q0 == 0 && adapter.p0 == 0 && adapter.A0 == 0) {
                    adapter.s0 = null;
                    adapter.B = null;
                    ArrayList arrayList = adapter.w0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.N;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.P = null;
                    adapter.Q = null;
                    ArrayList arrayList3 = adapter.x;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.E;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.F;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.I;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.J;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.l();
                }
            } else {
                pf.u0 adapter2 = e4Var.Z2.getAdapter();
                MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(e4Var.x1));
                TLRPC.Chat chat = MessagesController.getInstance(e4Var.y2).getChat(Long.valueOf(-e4Var.x1));
                adapter2.getClass();
                adapter2.h0 = chat;
                e4Var.Z2.getAdapter().U(charSequence, e4Var.X1.getCursorPosition(), null, false, false);
            }
        }
        e4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.ag
    public final void f1() {
        k50 k50Var = this.a.F2;
        if (k50Var != null) {
            k50Var.q();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean g1() {
        TLRPC.User user;
        e4 e4Var = this.a;
        return (e4Var.x1 < 0 || (user = MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(e4Var.x1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ag
    public final void i1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.ag
    public final void k1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.ag
    public final TLRPC.Peer l() {
        d1 d1Var;
        i9 i9Var = this.a.F0;
        if (i9Var == null || (d1Var = i9Var.w0) == null) {
            return null;
        }
        if (d1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return d1Var.i();
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final void q2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.ag
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        e4 e4Var = this.a;
        if (e4Var.C2) {
            AndroidUtilities.runOnUIThread(new cg.b2(this, j10, 5), 200L);
        } else {
            e4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final TLRPC.TL_channels_sendAsPeers y() {
        d1 d1Var;
        e4 e4Var = this.a;
        if (!e4Var.K1.f) {
            return null;
        }
        i9 i9Var = e4Var.F0;
        if (i9Var != null && (d1Var = i9Var.w0) != null) {
            if (d1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return e4Var.K3;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void N1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void c() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void e2() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void g0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void l2() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void m() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void s() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void w1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void G(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void N0(int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void S1(int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void W1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void n(float f10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void n1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void r(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void o0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }
}
