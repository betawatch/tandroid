package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hi.e b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ i6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ a3(hi.e eVar, oy0 oy0Var, mp mpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.w2 w2Var, boolean z10, i6 i6Var) {
        this.b = eVar;
        this.r = oy0Var;
        this.s = mpVar;
        this.c = j3;
        this.d = user;
        this.w = strArr;
        this.e = i7;
        this.f = w2Var;
        this.h = z10;
        this.n = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.w;
                final hi.e eVar = this.b;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.e;
                    connectstarrefbot.bot = mp.u1(i7).q1(starrefprogram.bot_id);
                    connectstarrefbot.peer = mp.u1(i7).l1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.w2 w2Var = this.f;
                    final long j10 = this.c;
                    final boolean z10 = this.h;
                    final i6 i6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ki.v2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new y2(hi.e.this, tLObject, i7, j3, w2Var, starrefprogram, j10, z10, context, i6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                oy0 oy0Var = (oy0) this.r;
                a6 a6Var = oy0Var.h;
                final mp mpVar = (mp) this.s;
                String[] strArr = (String[]) this.w;
                final hi.e eVar2 = this.b;
                if (!eVar2.R) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -oy0Var.E;
                        oy0Var.E = f10;
                        org.telegram.messenger.g0.E3(f10, textView, null);
                        org.telegram.messenger.q2.E.a();
                        break;
                    } else {
                        eVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.c;
                        tL_messages_editChatParticipantRank.peer = mpVar.l1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = mp.p1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.w2 w2Var2 = this.f;
                        final boolean z11 = this.h;
                        final i6 i6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new p10() { // from class: org.telegram.ui.Components.fy0
                            @Override // org.telegram.messenger.p10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.c0.t(w2Var3.F, i6Var2, tL_error, false);
                                        eVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j12 = -j11;
                                long j13 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                org.telegram.messenger.mp mpVar2 = org.telegram.messenger.mp.this;
                                mpVar2.B5(j12, str, j13);
                                mpVar2.V3(updates, false);
                                w2Var3.dismiss();
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || T == null) {
                                    return;
                                }
                                fc I = kc.b0(T).I(R.raw.contact_check, org.telegram.messenger.gd.N0(z11 ? 2131744043 : 2131744042, null), tL_messages_editChatParticipantRank2.rank);
                                kb kbVar = I.e;
                                if (kbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) kbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) kbVar.getLayoutParams()).gravity |= 1;
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

    public /* synthetic */ a3(hi.e eVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.w2 w2Var, long j3, boolean z10, Context context, i6 i6Var, TLRPC.User user) {
        this.b = eVar;
        this.r = jArr;
        this.e = i7;
        this.s = starrefprogram;
        this.f = w2Var;
        this.c = j3;
        this.h = z10;
        this.w = context;
        this.n = i6Var;
        this.d = user;
    }
}
