package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j11;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ u6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ u3(fi.d dVar, j11 j11Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.k3 k3Var, boolean z10, u6 u6Var) {
        this.b = dVar;
        this.r = j11Var;
        this.s = messagesController;
        this.c = j10;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f = k3Var;
        this.h = z10;
        this.n = u6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.v;
                final fi.d dVar = this.b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.k3 k3Var = this.f;
                    final long j11 = this.c;
                    final boolean z10 = this.h;
                    final u6 u6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: hi.o3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new s3(fi.d.this, tLObject, i10, j10, k3Var, starrefprogram, j11, z10, context, u6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                j11 j11Var = (j11) this.r;
                h6 h6Var = j11Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final fi.d dVar2 = this.b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = h6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f7 = -j11Var.y;
                        j11Var.y = f7;
                        AndroidUtilities.shakeViewSpring(textView, f7);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(h6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.k3 k3Var2 = this.f;
                        final boolean z11 = this.h;
                        final u6 u6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.z01
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.k3 k3Var3 = k3Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.d3.t(k3Var3.topBulletinContainer, u6Var2, tL_error, false);
                                        dVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j13 = -j12;
                                long j14 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                MessagesController messagesController2 = MessagesController.this;
                                messagesController2.updateRank(j13, j14, str);
                                messagesController2.lambda$processUpdates$379(updates, false);
                                k3Var3.dismiss();
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || U == null) {
                                    return;
                                }
                                qc M = wc.b0(U).M(LocaleController.getString(z11 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
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

    public /* synthetic */ u3(fi.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.k3 k3Var, long j10, boolean z10, Context context, u6 u6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i10;
        this.s = starrefprogram;
        this.f = k3Var;
        this.c = j10;
        this.h = z10;
        this.v = context;
        this.n = u6Var;
        this.d = user;
    }
}
