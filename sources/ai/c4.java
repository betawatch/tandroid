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
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.z40;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c4 implements qg {
    public final /* synthetic */ f6 a;

    public c4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean C1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void F2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        f6 f6Var = this.a;
        if (f6Var.G2) {
            AndroidUtilities.runOnUIThread(new j(this, j3, 1), 200L);
        } else {
            f6Var.k0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.TL_channels_sendAsPeers P() {
        d2 d2Var;
        f6 f6Var = this.a;
        if (!f6Var.O1.f) {
            return null;
        }
        kc kcVar = f6Var.J0;
        if (kcVar != null && (d2Var = kcVar.A0) != null) {
            if (d2Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return f6Var.O3;
    }

    @Override // org.telegram.ui.Components.qg
    public final void V(float f7, int i10) {
        t60 t60Var = this.a.J2;
        if (t60Var != null) {
            t60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final int h1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.qg
    public final TL_stories.StoryItem j1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean l1(long j3) {
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
            f6Var.b2.O1(true);
            f6Var.b2.I(true);
            f6Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean o1() {
        t60 t60Var = this.a.J2;
        return (t60Var == null || t60Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void o2() {
        String str;
        f6 f6Var = this.a;
        if (f6Var.E1) {
            f6.h0(f6Var);
            return;
        }
        if (f6Var.W2 == null) {
            z40 z40Var = new z40(9, f6Var.getContext(), f6Var.B0, false);
            f6Var.W2 = z40Var;
            z40Var.setVisibility(8);
            f6Var.addView(f6Var.W2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
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

    @Override // org.telegram.ui.Components.qg
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        f6 f6Var = this.a;
        if (f6Var.J2 == null && CameraView.isCameraAllowed()) {
            f6Var.J2 = new t60(f6Var.getContext(), new s4(f6Var), f6Var.B0, false);
            f6Var.addView(f6Var.J2, Math.min(f6Var.indexOfChild(f6Var.b2.getRecordCircle()), f6Var.indexOfChild(f6Var.b2.O1)), w7.x5.e(-1, -1, 51));
        }
        t60 t60Var = f6Var.J2;
        if (t60Var != null) {
            if (i10 == 0) {
                t60Var.h(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                t60Var.f(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                t60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        f6 f6Var = this.a;
        if (f6Var.d3 == null) {
            d4 d4Var = new d4(f6Var, f6Var.getContext(), f6Var.B1, f6Var.J0.f, f6Var.B0);
            f6Var.d3 = d4Var;
            d4Var.p(new g4(f6Var));
            f6Var.addView(f6Var.d3, w7.x5.e(-1, -1, 83));
        }
        if (f6Var.d3.getAdapter() != null) {
            f6Var.d3.setDialogId(f6Var.B1);
            if (f6Var.O1.f) {
                gg.j1 adapter = f6Var.d3.getAdapter();
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
                gg.j1 adapter2 = f6Var.d3.getAdapter();
                MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                f6Var.d3.getAdapter().U(charSequence, f6Var.b2.getCursorPosition(), null, false, false);
            }
        }
        f6Var.invalidate();
    }

    @Override // org.telegram.ui.Components.qg
    public final void t1() {
        t60 t60Var = this.a.J2;
        if (t60Var != null) {
            t60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ pn u0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean u1() {
        TLRPC.User user;
        f6 f6Var = this.a;
        return (f6Var.B1 < 0 || (user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int v() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final void w1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.Peer x() {
        d2 d2Var;
        kc kcVar = this.a.J0;
        if (kcVar == null || (d2Var = kcVar.A0) == null) {
            return null;
        }
        if (d2Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return d2Var.i();
    }

    @Override // org.telegram.ui.Components.qg
    public final void y1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.qg
    public final void B1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void g1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void l2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void p2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void z(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void B2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void J() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void L1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void M0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void K0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }
}
