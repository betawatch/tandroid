package oh;

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
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.z50;
import org.telegram.ui.nn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q2 implements eg {
    public final /* synthetic */ f4 a;

    public q2(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // org.telegram.ui.Components.eg
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        f4 f4Var = this.a;
        if (f4Var.D2) {
            AndroidUtilities.runOnUIThread(new hg.y1(this, j10, 5), 200L);
        } else {
            f4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean D1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.TL_channels_sendAsPeers F() {
        e1 e1Var;
        f4 f4Var = this.a;
        if (!f4Var.L1.f) {
            return null;
        }
        i9 i9Var = f4Var.G0;
        if (i9Var != null && (e1Var = i9Var.x0) != null) {
            if (e1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return f4Var.L3;
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(float f10, int i10) {
        z50 z50Var = this.a.G2;
        if (z50Var != null) {
            z50Var.e(f10, i10);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean H0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void J2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.eg
    public final int f1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.eg
    public final TL_stories.StoryItem h1() {
        return this.a.L1.a;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean j1(long j10) {
        f4 f4Var = this.a;
        d4 d4Var = f4Var.L1;
        TL_stories.StoryItem storyItem = d4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) d4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(f4Var.z2).getInputPeer(j10);
            ConnectionsManager.getInstance(f4Var.z2).sendRequest(savedefaultsendas, null);
            e1 e1Var = f4Var.G0.x0;
            if (e1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(f4Var.z2).getPeer(j10);
                TLRPC.GroupCall groupCall = e1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    e1Var.v.default_send_as = peer;
                }
            }
            f4Var.r0(true);
            f4Var.Y1.P1(true);
            f4Var.Y1.J(true);
            f4Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        z50 z50Var = this.a.G2;
        return (z50Var == null || z50Var.b0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.Peer p() {
        e1 e1Var;
        i9 i9Var = this.a.G0;
        if (i9Var == null || (e1Var = i9Var.x0) == null) {
            return null;
        }
        if (e1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return e1Var.i();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ nn r0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
        f4 f4Var = this.a;
        if (f4Var.a3 == null) {
            r2 r2Var = new r2(f4Var, f4Var.getContext(), f4Var.y1, f4Var.G0.f, f4Var.y0);
            f4Var.a3 = r2Var;
            r2Var.p(new t2(f4Var));
            f4Var.addView(f4Var.a3, k7.c6.e(-1, -1, 83));
        }
        if (f4Var.a3.getAdapter() != null) {
            f4Var.a3.setDialogId(f4Var.y1);
            if (f4Var.L1.f) {
                uf.u0 adapter = f4Var.a3.getAdapter();
                if (adapter.g0 == 0 && adapter.r0 == 0 && adapter.q0 == 0 && adapter.B0 == 0) {
                    adapter.t0 = null;
                    adapter.C = null;
                    ArrayList arrayList = adapter.x0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.O;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.Q = null;
                    adapter.R = null;
                    ArrayList arrayList3 = adapter.x;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.F;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.G;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.J;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.K;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.l();
                }
            } else {
                uf.u0 adapter2 = f4Var.a3.getAdapter();
                MessagesController.getInstance(f4Var.z2).getUser(Long.valueOf(f4Var.y1));
                TLRPC.Chat chat = MessagesController.getInstance(f4Var.z2).getChat(Long.valueOf(-f4Var.y1));
                adapter2.getClass();
                adapter2.i0 = chat;
                f4Var.a3.getAdapter().U(charSequence, f4Var.Y1.getCursorPosition(), null, false, false);
            }
        }
        f4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.eg
    public final void s2() {
        String str;
        f4 f4Var = this.a;
        if (f4Var.B1) {
            f4.h0(f4Var);
            return;
        }
        if (f4Var.T2 == null) {
            m40 m40Var = new m40(9, f4Var.getContext(), f4Var.y0, false);
            f4Var.T2 = m40Var;
            m40Var.setVisibility(8);
            f4Var.addView(f4Var.T2, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (f4Var.y1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(f4Var.z2).getUser(Long.valueOf(f4Var.y1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(f4Var.z2).getChat(Long.valueOf(-f4Var.y1));
            str = chat != null ? chat.title : "";
        }
        f4Var.T2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(f4Var.Y1.Z0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        f4Var.T2.f(f4Var.Y1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void t1() {
        z50 z50Var = this.a.G2;
        if (z50Var != null) {
            z50Var.q();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean u1() {
        TLRPC.User user;
        f4 f4Var = this.a;
        return (f4Var.y1 < 0 || (user = MessagesController.getInstance(f4Var.z2).getUser(Long.valueOf(f4Var.y1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        f4 f4Var = this.a;
        if (f4Var.G2 == null && CameraView.isCameraAllowed()) {
            f4Var.G2 = new z50(f4Var.getContext(), new d3(f4Var), f4Var.y0, false);
            f4Var.addView(f4Var.G2, Math.min(f4Var.indexOfChild(f4Var.Y1.getRecordCircle()), f4Var.indexOfChild(f4Var.Y1.K1)), k7.c6.e(-1, -1, 51));
        }
        z50 z50Var = f4Var.G2;
        if (z50Var != null) {
            if (i10 == 0) {
                z50Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                z50Var.k(i10, i11, i12, j10, j11, z4);
            } else if (i10 == 2 || i10 == 5) {
                z50Var.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void w1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.eg
    public final void B() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void F2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void M1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void A(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void C1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void Y(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void e1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void t2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void z1(View view, CharSequence charSequence, boolean z4) {
    }
}
