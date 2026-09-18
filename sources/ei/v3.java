package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c01;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ci.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ f6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ v3(ci.d dVar, c01 c01Var, MessagesController messagesController, long j3, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.g3 g3Var, boolean z10, f6 f6Var) {
        this.b = dVar;
        this.r = c01Var;
        this.s = messagesController;
        this.c = j3;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f = g3Var;
        this.h = z10;
        this.n = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.v;
                final ci.d dVar = this.b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.g3 g3Var = this.f;
                    final long j10 = this.c;
                    final boolean z10 = this.h;
                    final f6 f6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ei.o3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new t3(ci.d.this, tLObject, i10, j3, g3Var, starrefprogram, j10, z10, context, f6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                c01 c01Var = (c01) this.r;
                c6 c6Var = c01Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final ci.d dVar2 = this.b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f7 = -c01Var.y;
                        c01Var.y = f7;
                        AndroidUtilities.shakeViewSpring(textView, f7);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.g3 g3Var2 = this.f;
                        final boolean z11 = this.h;
                        final f6 f6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.sz0
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.g3 g3Var3 = g3Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.p6.q(g3Var3.topBulletinContainer, f6Var2, tL_error, false);
                                        dVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j12 = -j11;
                                long j13 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                MessagesController messagesController2 = MessagesController.this;
                                messagesController2.updateRank(j12, j13, str);
                                messagesController2.processUpdates(updates, false);
                                g3Var3.dismiss();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || U == null) {
                                    return;
                                }
                                oc M = vc.a0(U).M(LocaleController.getString(z11 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                sb sbVar = M.e;
                                if (sbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) sbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) sbVar.getLayoutParams()).gravity |= 1;
                                }
                                M.j();
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v3(ci.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.g3 g3Var, long j3, boolean z10, Context context, f6 f6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i10;
        this.s = starrefprogram;
        this.f = g3Var;
        this.c = j3;
        this.h = z10;
        this.v = context;
        this.n = f6Var;
        this.d = user;
    }
}
