package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gi.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ e6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ i3(gi.d dVar, dy0 dy0Var, hp hpVar, long j10, TLRPC.User user, String[] strArr, int i3, org.telegram.ui.ActionBar.t2 t2Var, boolean z10, e6 e6Var) {
        this.b = dVar;
        this.r = dy0Var;
        this.s = hpVar;
        this.c = j10;
        this.d = user;
        this.w = strArr;
        this.e = i3;
        this.f = t2Var;
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
                final gi.d dVar = this.b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i3 = this.e;
                    connectstarrefbot.bot = hp.s1(i3).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = hp.s1(i3).j1(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                    final org.telegram.ui.ActionBar.t2 t2Var = this.f;
                    final long j11 = this.c;
                    final boolean z10 = this.h;
                    final e6 e6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ii.c3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new g3(gi.d.this, tLObject, i3, j10, t2Var, starrefprogram, j11, z10, context, e6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                dy0 dy0Var = (dy0) this.r;
                z5 z5Var = dy0Var.h;
                final hp hpVar = (hp) this.s;
                String[] strArr = (String[]) this.w;
                final gi.d dVar2 = this.b;
                if (!dVar2.R) {
                    EditTextBoldCursor textView = z5Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -dy0Var.E;
                        dy0Var.E = f10;
                        org.telegram.messenger.g0.G3(f10, textView, null);
                        org.telegram.messenger.p2.E.a();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(z5Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.c;
                        tL_messages_editChatParticipantRank.peer = hpVar.j1(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = hp.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        c3.b bVar = new c3.b(1);
                        final org.telegram.ui.ActionBar.t2 t2Var2 = this.f;
                        final boolean z11 = this.h;
                        final e6 e6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new n10() { // from class: org.telegram.ui.Components.tx0
                            @Override // org.telegram.messenger.n10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.t2 t2Var3 = t2Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.f1.v(t2Var3.F, e6Var2, tL_error, false);
                                        dVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j13 = -j12;
                                long j14 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                org.telegram.messenger.hp hpVar2 = org.telegram.messenger.hp.this;
                                hpVar2.p5(j13, str, j14);
                                hpVar2.O3(updates, false);
                                t2Var3.dismiss();
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || T == null) {
                                    return;
                                }
                                ac I = fc.a0(T).I(R.raw.contact_check, org.telegram.messenger.bd.M0(z11 ? 2131744298 : 2131744297, null), tL_messages_editChatParticipantRank2.rank);
                                fb fbVar = I.e;
                                if (fbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) fbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) fbVar.getLayoutParams()).gravity |= 1;
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

    public /* synthetic */ i3(gi.d dVar, long[] jArr, int i3, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.t2 t2Var, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i3;
        this.s = starrefprogram;
        this.f = t2Var;
        this.c = j10;
        this.h = z10;
        this.w = context;
        this.n = e6Var;
        this.d = user;
    }
}
