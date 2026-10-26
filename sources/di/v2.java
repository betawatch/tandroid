package di;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.t40;
import org.telegram.ui.kn;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v2 implements og {
    public final /* synthetic */ q4 a;

    public v2(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.og
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        q4 q4Var = this.a;
        if (q4Var.v2) {
            AndroidUtilities.runOnUIThread(new bi.r3(this, j10, 3), 200L);
        } else {
            q4Var.i0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers B() {
        h1 h1Var;
        q4 q4Var = this.a;
        if (!q4Var.D1.f) {
            return null;
        }
        y9 y9Var = q4Var.y0;
        if (y9Var != null && (h1Var = y9Var.A0) != null) {
            if (h1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return q4Var.D3;
    }

    @Override // org.telegram.ui.Components.og
    public final void G(float f7, int i10) {
        o60 o60Var = this.a.y2;
        if (o60Var != null) {
            o60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int N0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final void N1() {
        String str;
        q4 q4Var = this.a;
        if (q4Var.t1) {
            q4.f0(q4Var);
            return;
        }
        if (q4Var.L2 == null) {
            t40 t40Var = new t40(9, q4Var.getContext(), q4Var.q0, false);
            q4Var.L2 = t40Var;
            t40Var.setVisibility(8);
            q4Var.addView(q4Var.L2, gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (q4Var.q1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(q4Var.q1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q4Var.r2).getChat(Long.valueOf(-q4Var.q1));
            str = chat != null ? chat.title : "";
        }
        q4Var.L2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(q4Var.Q1.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        q4Var.L2.f(q4Var.Q1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.og
    public final TL_stories.StoryItem P0() {
        return this.a.D1.a;
    }

    @Override // org.telegram.ui.Components.og
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        q4 q4Var = this.a;
        if (q4Var.y2 == null && CameraView.isCameraAllowed()) {
            q4Var.y2 = new o60(q4Var.getContext(), new j3(q4Var), q4Var.q0, false);
            q4Var.addView(q4Var.y2, Math.min(q4Var.indexOfChild(q4Var.Q1.getRecordCircle()), q4Var.indexOfChild(q4Var.Q1.O1)), gb1.i(-1, -1, 51));
        }
        o60 o60Var = q4Var.y2;
        if (o60Var != null) {
            if (i10 == 0) {
                o60Var.h(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                o60Var.f(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                o60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean R0(long j10) {
        q4 q4Var = this.a;
        o4 o4Var = q4Var.D1;
        TL_stories.StoryItem storyItem = o4Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) o4Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(q4Var.r2).getInputPeer(j10);
            ConnectionsManager.getInstance(q4Var.r2).sendRequest(savedefaultsendas, null);
            h1 h1Var = q4Var.y0.A0;
            if (h1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(q4Var.r2).getPeer(j10);
                TLRPC.GroupCall groupCall = h1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    h1Var.v.default_send_as = peer;
                }
            }
            q4Var.p0(true);
            q4Var.Q1.M1(true);
            q4Var.Q1.G(true);
            q4Var.d1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean T0() {
        o60 o60Var = this.a.y2;
        return (o60Var == null || o60Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        q4 q4Var = this.a;
        if (q4Var.S2 == null) {
            w2 w2Var = new w2(q4Var, q4Var.getContext(), q4Var.q1, q4Var.y0.f, q4Var.q0);
            q4Var.S2 = w2Var;
            w2Var.p(new z2(q4Var));
            q4Var.addView(q4Var.S2, gb1.i(-1, -1, 83));
        }
        if (q4Var.S2.getAdapter() != null) {
            q4Var.S2.setDialogId(q4Var.q1);
            if (q4Var.D1.f) {
                ig.j1 adapter = q4Var.S2.getAdapter();
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
                ig.j1 adapter2 = q4Var.S2.getAdapter();
                MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(q4Var.q1));
                TLRPC.Chat chat = MessagesController.getInstance(q4Var.r2).getChat(Long.valueOf(-q4Var.q1));
                adapter2.getClass();
                adapter2.l0 = chat;
                q4Var.S2.getAdapter().U(charSequence, q4Var.Q1.getCursorPosition(), null, false, false);
            }
        }
        q4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.og
    public final void X0() {
        o60 o60Var = this.a.y2;
        if (o60Var != null) {
            o60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean Y0() {
        TLRPC.User user;
        q4 q4Var = this.a;
        return (q4Var.q1 < 0 || (user = MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(q4Var.q1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void a1() {
        this.a.M0();
    }

    @Override // org.telegram.ui.Components.og
    public final void c1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.og
    public final void c2() {
        this.a.N0();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int g() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ kn i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.Peer k() {
        h1 h1Var;
        y9 y9Var = this.a.y0;
        if (y9Var == null || (h1Var = y9Var.A0) == null) {
            return null;
        }
        if (h1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return h1Var.i();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void L1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void M0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void O1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void R(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void t(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void b() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void z() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void v0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }
}
