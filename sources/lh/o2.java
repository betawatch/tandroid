package lh;

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
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.s50;
import org.telegram.ui.jn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o2 implements hg {
    public final /* synthetic */ d4 a;

    public o2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        d4 d4Var = this.a;
        if (d4Var.C2) {
            AndroidUtilities.runOnUIThread(new eg.z1(this, j10, 5), 200L);
        } else {
            d4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final TLRPC.TL_channels_sendAsPeers G() {
        d1 d1Var;
        d4 d4Var = this.a;
        if (!d4Var.K1.f) {
            return null;
        }
        i9 i9Var = d4Var.F0;
        if (i9Var != null && (d1Var = i9Var.w0) != null) {
            if (d1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return d4Var.K3;
    }

    @Override // org.telegram.ui.Components.hg
    public final void I(float f9, int i10) {
        s50 s50Var = this.a.F2;
        if (s50Var != null) {
            s50Var.e(f9, i10);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final int b1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.hg
    public final TL_stories.StoryItem d1() {
        return this.a.K1.a;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean f1(long j10) {
        d4 d4Var = this.a;
        b4 b4Var = d4Var.K1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) b4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(d4Var.y2).getInputPeer(j10);
            ConnectionsManager.getInstance(d4Var.y2).sendRequest(savedefaultsendas, null);
            d1 d1Var = d4Var.F0.w0;
            if (d1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(d4Var.y2).getPeer(j10);
                TLRPC.GroupCall groupCall = d1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    d1Var.v.default_send_as = peer;
                }
            }
            d4Var.r0(true);
            d4Var.X1.P1(true);
            d4Var.X1.J(true);
            d4Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean i1() {
        s50 s50Var = this.a.F2;
        return (s50Var == null || s50Var.a0) ? false : true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void i2() {
        String str;
        d4 d4Var = this.a;
        if (d4Var.A1) {
            d4.h0(d4Var);
            return;
        }
        if (d4Var.S2 == null) {
            g40 g40Var = new g40(9, d4Var.getContext(), d4Var.x0, false);
            d4Var.S2 = g40Var;
            g40Var.setVisibility(8);
            d4Var.addView(d4Var.S2, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (d4Var.x1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(d4Var.y2).getUser(Long.valueOf(d4Var.x1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(d4Var.y2).getChat(Long.valueOf(-d4Var.x1));
            str = chat != null ? chat.title : "";
        }
        d4Var.S2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(d4Var.X1.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        d4Var.S2.f(d4Var.X1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        d4 d4Var = this.a;
        if (d4Var.Z2 == null) {
            p2 p2Var = new p2(d4Var, d4Var.getContext(), d4Var.x1, d4Var.F0.f, d4Var.x0);
            d4Var.Z2 = p2Var;
            p2Var.p(new r2(d4Var));
            d4Var.addView(d4Var.Z2, i7.f6.e(-1, -1, 83));
        }
        if (d4Var.Z2.getAdapter() != null) {
            d4Var.Z2.setDialogId(d4Var.x1);
            if (d4Var.K1.f) {
                rf.v0 adapter = d4Var.Z2.getAdapter();
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
                rf.v0 adapter2 = d4Var.Z2.getAdapter();
                MessagesController.getInstance(d4Var.y2).getUser(Long.valueOf(d4Var.x1));
                TLRPC.Chat chat = MessagesController.getInstance(d4Var.y2).getChat(Long.valueOf(-d4Var.x1));
                adapter2.getClass();
                adapter2.h0 = chat;
                d4Var.Z2.getAdapter().U(charSequence, d4Var.X1.getCursorPosition(), null, false, false);
            }
        }
        d4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.hg
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        d4 d4Var = this.a;
        if (d4Var.F2 == null && CameraView.isCameraAllowed()) {
            d4Var.F2 = new s50(d4Var.getContext(), new b3(d4Var), d4Var.x0, false);
            d4Var.addView(d4Var.F2, Math.min(d4Var.indexOfChild(d4Var.X1.getRecordCircle()), d4Var.indexOfChild(d4Var.X1.J1)), i7.f6.e(-1, -1, 51));
        }
        s50 s50Var = d4Var.F2;
        if (s50Var != null) {
            if (i10 == 0) {
                s50Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                s50Var.k(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                s50Var.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ int m() {
        return 0;
    }

    @Override // org.telegram.ui.Components.hg
    public final void n1() {
        s50 s50Var = this.a.F2;
        if (s50Var != null) {
            s50Var.q();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ jn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean o1() {
        TLRPC.User user;
        d4 d4Var = this.a;
        return (d4Var.x1 < 0 || (user = MessagesController.getInstance(d4Var.y2).getUser(Long.valueOf(d4Var.x1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.hg
    public final TLRPC.Peer q() {
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

    @Override // org.telegram.ui.Components.hg
    public final void q1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.hg
    public final void s1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final void z2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.hg
    public final void B() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void e() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void k0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void v2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void U(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void k2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void v(float f9) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }
}
