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
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ng;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class b4 implements ng {
    public final /* synthetic */ f6 a;

    public b4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.ng
    public final void A2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        f6 f6Var = this.a;
        if (f6Var.G2) {
            AndroidUtilities.runOnUIThread(new j(this, j3, 1), 200L);
        } else {
            f6Var.k0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final TLRPC.TL_channels_sendAsPeers J() {
        d2 d2Var;
        f6 f6Var = this.a;
        if (!f6Var.O1.f) {
            return null;
        }
        jc jcVar = f6Var.J0;
        if (jcVar != null && (d2Var = jcVar.A0) != null) {
            if (d2Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return f6Var.O3;
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
        c60 c60Var = this.a.J2;
        if (c60Var != null) {
            c60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final int c1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.ng
    public final TL_stories.StoryItem e1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean g1(long j3) {
        f6 f6Var = this.a;
        d6 d6Var = f6Var.O1;
        TL_stories.StoryItem storyItem = d6Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) d6Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(f6Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(f6Var.C2).sendRequest(savedefaultsendas, null);
            d2 d2Var = f6Var.J0.A0;
            if (d2Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(f6Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = d2Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    d2Var.v.default_send_as = peer;
                }
            }
            f6Var.r0(true);
            f6Var.b2.P1(true);
            f6Var.b2.K(true);
            f6Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void i2() {
        String str;
        f6 f6Var = this.a;
        if (f6Var.E1) {
            f6.h0(f6Var);
            return;
        }
        if (f6Var.W2 == null) {
            i40 i40Var = new i40(9, f6Var.getContext(), f6Var.B0, false);
            f6Var.W2 = i40Var;
            i40Var.setVisibility(8);
            f6Var.addView(f6Var.W2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (f6Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
            str = chat != null ? chat.title : "";
        }
        f6Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(f6Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        f6Var.W2.f(f6Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean j1() {
        c60 c60Var = this.a.J2;
        return (c60Var == null || c60Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        f6 f6Var = this.a;
        if (f6Var.J2 == null && CameraView.isCameraAllowed()) {
            f6Var.J2 = new c60(f6Var.getContext(), new r4(f6Var), f6Var.B0, false);
            f6Var.addView(f6Var.J2, Math.min(f6Var.indexOfChild(f6Var.b2.getRecordCircle()), f6Var.indexOfChild(f6Var.b2.O1)), w7.y5.e(-1, -1, 51));
        }
        c60 c60Var = f6Var.J2;
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

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        f6 f6Var = this.a;
        if (f6Var.d3 == null) {
            c4 c4Var = new c4(f6Var, f6Var.getContext(), f6Var.B1, f6Var.J0.f, f6Var.B0);
            f6Var.d3 = c4Var;
            c4Var.p(new f4(f6Var));
            f6Var.addView(f6Var.d3, w7.y5.e(-1, -1, 83));
        }
        if (f6Var.d3.getAdapter() != null) {
            f6Var.d3.setDialogId(f6Var.B1);
            if (f6Var.O1.f) {
                gg.k1 adapter = f6Var.d3.getAdapter();
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
                gg.k1 adapter2 = f6Var.d3.getAdapter();
                MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                f6Var.d3.getAdapter().U(charSequence, f6Var.b2.getCursorPosition(), null, false, false);
            }
        }
        f6Var.invalidate();
    }

    @Override // org.telegram.ui.Components.ng
    public final void o1() {
        c60 c60Var = this.a.J2;
        if (c60Var != null) {
            c60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean p1() {
        TLRPC.User user;
        f6 f6Var = this.a;
        return (f6Var.B1 < 0 || (user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ pn q0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final void r1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.ng
    public final void t1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.ng
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

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void A1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void F1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void g() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void x() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }
}
