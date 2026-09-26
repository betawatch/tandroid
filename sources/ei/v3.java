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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l01;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ci.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ d6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ v3(ci.d dVar, l01 l01Var, MessagesController messagesController, long j3, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, d6 d6Var) {
        this.b = dVar;
        this.r = l01Var;
        this.s = messagesController;
        this.c = j3;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f = e3Var;
        this.h = z10;
        this.n = d6Var;
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
                    final org.telegram.ui.ActionBar.e3 e3Var = this.f;
                    final long j10 = this.c;
                    final boolean z10 = this.h;
                    final d6 d6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ei.o3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new t3(ci.d.this, tLObject, i10, j3, e3Var, starrefprogram, j10, z10, context, d6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                l01 l01Var = (l01) this.r;
                org.telegram.ui.Cells.d6 d6Var2 = l01Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final ci.d dVar2 = this.b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = d6Var2.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f7 = -l01Var.y;
                        l01Var.y = f7;
                        AndroidUtilities.shakeViewSpring(textView, f7);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(d6Var2);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.e3 e3Var2 = this.f;
                        final boolean z11 = this.h;
                        final d6 d6Var3 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.b01
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.c1.r(e3Var3.topBulletinContainer, d6Var3, tL_error, false);
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
                                e3Var3.dismiss();
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || U == null) {
                                    return;
                                }
                                qc M = xc.a0(U).M(LocaleController.getString(z11 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                ub ubVar = M.e;
                                if (ubVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).gravity |= 1;
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

    public /* synthetic */ v3(ci.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.e3 e3Var, long j3, boolean z10, Context context, d6 d6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i10;
        this.s = starrefprogram;
        this.f = e3Var;
        this.c = j3;
        this.h = z10;
        this.v = context;
        this.n = d6Var;
        this.d = user;
    }
}
