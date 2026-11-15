package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ e6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ f3(hi.d dVar, gy0 gy0Var, np npVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.u2 u2Var, boolean z10, e6 e6Var) {
        this.b = dVar;
        this.r = gy0Var;
        this.s = npVar;
        this.c = j3;
        this.d = user;
        this.w = strArr;
        this.e = i7;
        this.f = u2Var;
        this.h = z10;
        this.n = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.w;
                final hi.d dVar = this.b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.e;
                    connectstarrefbot.bot = np.s1(i7).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = np.s1(i7).j1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.u2 u2Var = this.f;
                    final long j10 = this.c;
                    final boolean z10 = this.h;
                    final e6 e6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ki.z2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new d3(hi.d.this, tLObject, i7, j3, u2Var, starrefprogram, j10, z10, context, e6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                gy0 gy0Var = (gy0) this.r;
                z5 z5Var = gy0Var.h;
                final np npVar = (np) this.s;
                String[] strArr = (String[]) this.w;
                final hi.d dVar2 = this.b;
                if (!dVar2.R) {
                    EditTextBoldCursor textView = z5Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -gy0Var.E;
                        gy0Var.E = f10;
                        org.telegram.messenger.g0.F3(f10, textView, null);
                        org.telegram.messenger.p2.E.a();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(z5Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.c;
                        tL_messages_editChatParticipantRank.peer = npVar.j1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = np.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.u2 u2Var2 = this.f;
                        final boolean z11 = this.h;
                        final e6 e6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new s10() { // from class: org.telegram.ui.Components.xx0
                            @Override // org.telegram.messenger.s10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.u2 u2Var3 = u2Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.y0.q(u2Var3.F, e6Var2, tL_error, false);
                                        dVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j12 = -j11;
                                long j13 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                org.telegram.messenger.np npVar2 = org.telegram.messenger.np.this;
                                npVar2.q5(j12, str, j13);
                                npVar2.O3(updates, false);
                                u2Var3.dismiss();
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || T == null) {
                                    return;
                                }
                                xb I = cc.a0(T).I(R.raw.contact_check, org.telegram.messenger.hd.M0(z11 ? 2131744288 : 2131744287, null), tL_messages_editChatParticipantRank2.rank);
                                cb cbVar = I.e;
                                if (cbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) cbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) cbVar.getLayoutParams()).gravity |= 1;
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

    public /* synthetic */ f3(hi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.u2 u2Var, long j3, boolean z10, Context context, e6 e6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i7;
        this.s = starrefprogram;
        this.f = u2Var;
        this.c = j3;
        this.h = z10;
        this.w = context;
        this.n = e6Var;
        this.d = user;
    }
}
