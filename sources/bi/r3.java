package bi;

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
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.v40;
import org.telegram.ui.un;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class r3 implements pg {
    public final /* synthetic */ q5 a;

    public r3(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        q5 q5Var = this.a;
        if (q5Var.G2) {
            AndroidUtilities.runOnUIThread(new g(this, j10, 1), 200L);
        } else {
            q5Var.k0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final TLRPC.TL_channels_sendAsPeers K() {
        t1 t1Var;
        q5 q5Var = this.a;
        if (!q5Var.O1.f) {
            return null;
        }
        sb sbVar = q5Var.J0;
        if (sbVar != null && (t1Var = sbVar.A0) != null) {
            if (t1Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return q5Var.O3;
    }

    @Override // org.telegram.ui.Components.pg
    public final void U(float f7, int i10) {
        p60 p60Var = this.a.J2;
        if (p60Var != null) {
            p60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final int Y0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.pg
    public final void Y1() {
        String str;
        q5 q5Var = this.a;
        if (q5Var.E1) {
            q5.h0(q5Var);
            return;
        }
        if (q5Var.W2 == null) {
            v40 v40Var = new v40(9, q5Var.getContext(), q5Var.B0, false);
            q5Var.W2 = v40Var;
            v40Var.setVisibility(8);
            q5Var.addView(q5Var.W2, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
        if (q5Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1));
            str = chat != null ? chat.title : "";
        }
        q5Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(q5Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        q5Var.W2.f(q5Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.pg
    public final TL_stories.StoryItem a1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.pg
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        q5 q5Var = this.a;
        if (q5Var.J2 == null && CameraView.isCameraAllowed()) {
            q5Var.J2 = new p60(q5Var.getContext(), new g4(q5Var), q5Var.B0, false);
            q5Var.addView(q5Var.J2, Math.min(q5Var.indexOfChild(q5Var.b2.getRecordCircle()), q5Var.indexOfChild(q5Var.b2.O1)), w7.a6.e(-1, -1, 51));
        }
        p60 p60Var = q5Var.J2;
        if (p60Var != null) {
            if (i10 == 0) {
                p60Var.h(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                p60Var.f(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                p60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean b1(long j10) {
        q5 q5Var = this.a;
        o5 o5Var = q5Var.O1;
        TL_stories.StoryItem storyItem = o5Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) o5Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(q5Var.C2).getInputPeer(j10);
            ConnectionsManager.getInstance(q5Var.C2).sendRequest(savedefaultsendas, null);
            t1 t1Var = q5Var.J0.A0;
            if (t1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(q5Var.C2).getPeer(j10);
                TLRPC.GroupCall groupCall = t1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    t1Var.v.default_send_as = peer;
                }
            }
            q5Var.r0(true);
            q5Var.b2.O1(true);
            q5Var.b2.I(true);
            q5Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean e1() {
        p60 p60Var = this.a.J2;
        return (p60Var == null || p60Var.j0) ? false : true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        q5 q5Var = this.a;
        if (q5Var.d3 == null) {
            s3 s3Var = new s3(q5Var, q5Var.getContext(), q5Var.B1, q5Var.J0.f, q5Var.B0);
            q5Var.d3 = s3Var;
            s3Var.p(new v3(q5Var));
            q5Var.addView(q5Var.d3, w7.a6.e(-1, -1, 83));
        }
        if (q5Var.d3.getAdapter() != null) {
            q5Var.d3.setDialogId(q5Var.B1);
            if (q5Var.O1.f) {
                hg.j1 adapter = q5Var.d3.getAdapter();
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
                hg.j1 adapter2 = q5Var.d3.getAdapter();
                MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                q5Var.d3.getAdapter().U(charSequence, q5Var.b2.getCursorPosition(), null, false, false);
            }
        }
        q5Var.invalidate();
    }

    @Override // org.telegram.ui.Components.pg
    public final void i1() {
        p60 p60Var = this.a.J2;
        if (p60Var != null) {
            p60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean j1() {
        TLRPC.User user;
        q5 q5Var = this.a;
        return (q5Var.B1 < 0 || (user = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final void l1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.pg
    public final void n1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ un p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pg
    public final void q2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final TLRPC.Peer x() {
        t1 t1Var;
        sb sbVar = this.a.J0;
        if (sbVar == null || (t1Var = sbVar.A0) == null) {
            return null;
        }
        if (t1Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return t1Var.i();
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void G() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void e2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void u1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void y() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void V1(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void X0(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void Z1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void q1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void z(float f7) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void D0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }
}
