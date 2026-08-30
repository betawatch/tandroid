package nh;

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
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.x50;
import org.telegram.ui.nn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p2 implements eg {
    public final /* synthetic */ d4 a;

    public p2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.eg
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        d4 d4Var = this.a;
        if (d4Var.D2) {
            AndroidUtilities.runOnUIThread(new gg.y1(this, j10, 5), 200L);
        } else {
            d4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.TL_channels_sendAsPeers G() {
        e1 e1Var;
        d4 d4Var = this.a;
        if (!d4Var.L1.f) {
            return null;
        }
        i9 i9Var = d4Var.G0;
        if (i9Var != null && (e1Var = i9Var.x0) != null) {
            if (e1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return d4Var.L3;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(float f10, int i10) {
        x50 x50Var = this.a.G2;
        if (x50Var != null) {
            x50Var.e(f10, i10);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final int c1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.eg
    public final TL_stories.StoryItem e1() {
        return this.a.L1.a;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean g1(long j10) {
        d4 d4Var = this.a;
        b4 b4Var = d4Var.L1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) b4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(d4Var.z2).getInputPeer(j10);
            ConnectionsManager.getInstance(d4Var.z2).sendRequest(savedefaultsendas, null);
            e1 e1Var = d4Var.G0.x0;
            if (e1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(d4Var.z2).getPeer(j10);
                TLRPC.GroupCall groupCall = e1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    e1Var.v.default_send_as = peer;
                }
            }
            d4Var.r0(true);
            d4Var.Y1.P1(true);
            d4Var.Y1.J(true);
            d4Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean k1() {
        x50 x50Var = this.a.G2;
        return (x50Var == null || x50Var.b0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final void m2() {
        String str;
        d4 d4Var = this.a;
        if (d4Var.B1) {
            d4.h0(d4Var);
            return;
        }
        if (d4Var.T2 == null) {
            k40 k40Var = new k40(9, d4Var.getContext(), d4Var.y0, false);
            d4Var.T2 = k40Var;
            k40Var.setVisibility(8);
            d4Var.addView(d4Var.T2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (d4Var.y1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(d4Var.z2).getChat(Long.valueOf(-d4Var.y1));
            str = chat != null ? chat.title : "";
        }
        d4Var.T2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(d4Var.Y1.Z0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        d4Var.T2.f(d4Var.Y1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        d4 d4Var = this.a;
        if (d4Var.a3 == null) {
            q2 q2Var = new q2(d4Var, d4Var.getContext(), d4Var.y1, d4Var.G0.f, d4Var.y0);
            d4Var.a3 = q2Var;
            q2Var.p(new s2(d4Var));
            d4Var.addView(d4Var.a3, k7.b6.e(-1, -1, 83));
        }
        if (d4Var.a3.getAdapter() != null) {
            d4Var.a3.setDialogId(d4Var.y1);
            if (d4Var.L1.f) {
                tf.u0 adapter = d4Var.a3.getAdapter();
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
                tf.u0 adapter2 = d4Var.a3.getAdapter();
                MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1));
                TLRPC.Chat chat = MessagesController.getInstance(d4Var.z2).getChat(Long.valueOf(-d4Var.y1));
                adapter2.getClass();
                adapter2.i0 = chat;
                d4Var.a3.getAdapter().U(charSequence, d4Var.Y1.getCursorPosition(), null, false, false);
            }
        }
        d4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        d4 d4Var = this.a;
        if (d4Var.G2 == null && CameraView.isCameraAllowed()) {
            d4Var.G2 = new x50(d4Var.getContext(), new c3(d4Var), d4Var.y0, false);
            d4Var.addView(d4Var.G2, Math.min(d4Var.indexOfChild(d4Var.Y1.getRecordCircle()), d4Var.indexOfChild(d4Var.Y1.K1)), k7.b6.e(-1, -1, 51));
        }
        x50 x50Var = d4Var.G2;
        if (x50Var != null) {
            if (i10 == 0) {
                x50Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                x50Var.k(i10, i11, i12, j10, j11, z4);
            } else if (i10 == 2 || i10 == 5) {
                x50Var.d(i10 == 2);
            }
        }
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
    public final void p1() {
        x50 x50Var = this.a.G2;
        if (x50Var != null) {
            x50Var.q();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean q1() {
        TLRPC.User user;
        d4 d4Var = this.a;
        return (d4Var.y1 < 0 || (user = MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ nn r0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void s1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void C() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void C1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void N0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void V0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void z2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void j2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void z(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void I0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }
}
