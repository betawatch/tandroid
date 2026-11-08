package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ f6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ i3(fi.d dVar, ey0 ey0Var, qp qpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, f6 f6Var) {
        this.b = dVar;
        this.r = ey0Var;
        this.s = qpVar;
        this.c = j3;
        this.d = user;
        this.w = strArr;
        this.e = i7;
        this.f = v2Var;
        this.h = z9;
        this.n = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.w;
                final fi.d dVar = this.b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.e;
                    connectstarrefbot.bot = qp.s1(i7).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = qp.s1(i7).j1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.v2 v2Var = this.f;
                    final long j10 = this.c;
                    final boolean z9 = this.h;
                    final f6 f6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: hi.c3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new g3(fi.d.this, tLObject, i7, j3, v2Var, starrefprogram, j10, z9, context, f6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                ey0 ey0Var = (ey0) this.r;
                a6 a6Var = ey0Var.h;
                final qp qpVar = (qp) this.s;
                String[] strArr = (String[]) this.w;
                final fi.d dVar2 = this.b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -ey0Var.D;
                        ey0Var.D = f10;
                        org.telegram.messenger.g0.G3(f10, textView, null);
                        org.telegram.messenger.p2.D.a();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.c;
                        tL_messages_editChatParticipantRank.peer = qpVar.j1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = qp.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.v2 v2Var2 = this.f;
                        final boolean z10 = this.h;
                        final f6 f6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new v10() { // from class: org.telegram.ui.Components.vx0
                            @Override // org.telegram.messenger.v10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.v2 v2Var3 = v2Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.f1.r(v2Var3.E, f6Var2, tL_error, false);
                                        dVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j12 = -j11;
                                long j13 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                org.telegram.messenger.qp qpVar2 = org.telegram.messenger.qp.this;
                                qpVar2.p5(j12, str, j13);
                                qpVar2.O3(updates, false);
                                v2Var3.dismiss();
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || T == null) {
                                    return;
                                }
                                cc I = hc.a0(T).I(R.raw.contact_check, org.telegram.messenger.id.M0(z10 ? 2131744291 : 2131744290, null), tL_messages_editChatParticipantRank2.rank);
                                gb gbVar = I.e;
                                if (gbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) gbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) gbVar.getLayoutParams()).gravity |= 1;
                                }
                                I.j();
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i3(fi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.v2 v2Var, long j3, boolean z9, Context context, f6 f6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i7;
        this.s = starrefprogram;
        this.f = v2Var;
        this.c = j3;
        this.h = z9;
        this.w = context;
        this.n = f6Var;
        this.d = user;
    }
}
