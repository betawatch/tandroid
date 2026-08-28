package ih;

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
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.s30;
import org.telegram.ui.gn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q2 implements eg {
    public final /* synthetic */ i4 a;

    public q2(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.TL_channels_sendAsPeers A() {
        f1 f1Var;
        i4 i4Var = this.a;
        if (!i4Var.K1.f) {
            return null;
        }
        m9 m9Var = i4Var.F0;
        if (m9Var != null && (f1Var = m9Var.w0) != null) {
            if (f1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return i4Var.K3;
    }

    @Override // org.telegram.ui.Components.eg
    public final void B(float f10, int i9) {
        f50 f50Var = this.a.F2;
        if (f50Var != null) {
            f50Var.e(f10, i9);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final int N0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.eg
    public final TL_stories.StoryItem P0() {
        return this.a.K1.a;
    }

    @Override // org.telegram.ui.Components.eg
    public final void Q1() {
        String str;
        i4 i4Var = this.a;
        if (i4Var.A1) {
            i4.h0(i4Var);
            return;
        }
        if (i4Var.S2 == null) {
            s30 s30Var = new s30(9, i4Var.getContext(), i4Var.x0, false);
            i4Var.S2 = s30Var;
            s30Var.setVisibility(8);
            i4Var.addView(i4Var.S2, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (i4Var.x1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-i4Var.x1));
            str = chat != null ? chat.title : "";
        }
        i4Var.S2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i4Var.X1.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        i4Var.S2.f(i4Var.X1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ gn T() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean T0(long j10) {
        i4 i4Var = this.a;
        g4 g4Var = i4Var.K1;
        TL_stories.StoryItem storyItem = g4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) g4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(i4Var.y2).getInputPeer(j10);
            ConnectionsManager.getInstance(i4Var.y2).sendRequest(savedefaultsendas, null);
            f1 f1Var = i4Var.F0.w0;
            if (f1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(i4Var.y2).getPeer(j10);
                TLRPC.GroupCall groupCall = f1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    f1Var.v.default_send_as = peer;
                }
            }
            i4Var.r0(true);
            i4Var.X1.P1(true);
            i4Var.X1.J(true);
            i4Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
        i4 i4Var = this.a;
        if (i4Var.F2 == null && CameraView.isCameraAllowed()) {
            i4Var.F2 = new f50(i4Var.getContext(), new d3(i4Var), i4Var.x0, false);
            i4Var.addView(i4Var.F2, Math.min(i4Var.indexOfChild(i4Var.X1.getRecordCircle()), i4Var.indexOfChild(i4Var.X1.J1)), g7.e6.e(-1, -1, 51));
        }
        f50 f50Var = i4Var.F2;
        if (f50Var != null) {
            if (i9 == 0) {
                f50Var.l(false);
                return;
            }
            if (i9 == 1 || i9 == 3 || i9 == 4) {
                f50Var.k(i9, i10, i11, j10, j11, z10);
            } else if (i9 == 2 || i9 == 5) {
                f50Var.d(i9 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean X0() {
        f50 f50Var = this.a.F2;
        return (f50Var == null || f50Var.a0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        i4 i4Var = this.a;
        if (i4Var.Z2 == null) {
            r2 r2Var = new r2(i4Var, i4Var.getContext(), i4Var.x1, i4Var.F0.f, i4Var.x0);
            i4Var.Z2 = r2Var;
            r2Var.p(new t2(i4Var));
            i4Var.addView(i4Var.Z2, g7.e6.e(-1, -1, 83));
        }
        if (i4Var.Z2.getAdapter() != null) {
            i4Var.Z2.setDialogId(i4Var.x1);
            if (i4Var.K1.f) {
                of.f1 adapter = i4Var.Z2.getAdapter();
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
                of.f1 adapter2 = i4Var.Z2.getAdapter();
                MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1));
                TLRPC.Chat chat = MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-i4Var.x1));
                adapter2.getClass();
                adapter2.h0 = chat;
                i4Var.Z2.getAdapter().U(charSequence, i4Var.X1.getCursorPosition(), null, false, false);
            }
        }
        i4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.eg
    public final void c1() {
        f50 f50Var = this.a.F2;
        if (f50Var != null) {
            f50Var.q();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void d2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean f1() {
        TLRPC.User user;
        i4 i4Var = this.a;
        return (i4Var.x1 < 0 || (user = MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void h1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final void j1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.Peer k() {
        f1 f1Var;
        m9 m9Var = this.a.F0;
        if (m9Var == null || (f1Var = m9Var.w0) == null) {
            return null;
        }
        if (f1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return f1Var.i();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        i4 i4Var = this.a;
        if (i4Var.C2) {
            AndroidUtilities.runOnUIThread(new bg.i2(this, j10, 4), 200L);
        } else {
            i4Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void G() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void X1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void h0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void K1(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void L0(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void T1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void m1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p0(int i9, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }
}
