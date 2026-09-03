package org.telegram.ui.Components;

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
import org.telegram.ui.Components.fk;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qh.d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 h;
    public final /* synthetic */ TLRPC.User n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ uz0(qh.d dVar, f01 f01Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.h3 h3Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = dVar;
        this.r = f01Var;
        this.s = messagesController;
        this.e = j10;
        this.n = user;
        this.v = strArr;
        this.c = i10;
        this.d = h3Var;
        this.f = z4;
        this.h = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f01 f01Var = (f01) this.r;
                org.telegram.ui.Cells.c6 c6Var = f01Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final qh.d dVar = this.b;
                if (!dVar.K) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -f01Var.y;
                        f01Var.y = f10;
                        AndroidUtilities.shakeViewSpring(textView, f10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        break;
                    } else {
                        dVar.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.e;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j10);
                        final TLRPC.User user = this.n;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.c);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.h3 h3Var = this.d;
                        final boolean z4 = this.f;
                        final org.telegram.ui.ActionBar.g6 g6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.vz0
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.yh.u(h3Var2.topBulletinContainer, g6Var, tL_error, false);
                                        dVar.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j11 = -j10;
                                long j12 = user.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                MessagesController messagesController2 = MessagesController.this;
                                messagesController2.updateRank(j11, j12, str);
                                messagesController2.processUpdates(updates, false);
                                h3Var2.dismiss();
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || U == null) {
                                    return;
                                }
                                ic M = qc.a0(U).M(LocaleController.getString(z4 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                nb nbVar = M.e;
                                if (nbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) nbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) nbVar.getLayoutParams()).gravity |= 1;
                                }
                                M.j();
                            }
                        });
                        break;
                    }
                }
                break;
            default:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.v;
                final qh.d dVar2 = this.b;
                if (!dVar2.K) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.h3 h3Var2 = this.d;
                    final long j12 = this.e;
                    final boolean z10 = this.f;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = this.h;
                    final TLRPC.User user2 = this.n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: sh.r2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new fk(qh.d.this, tLObject, i10, j11, h3Var2, starrefprogram, j12, z10, context, g6Var2, user2, tL_error));
                        }
                    });
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uz0(qh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.h3 h3Var, long j10, boolean z4, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.c = i10;
        this.s = starrefprogram;
        this.d = h3Var;
        this.e = j10;
        this.f = z4;
        this.v = context;
        this.h = g6Var;
        this.n = user;
    }
}
