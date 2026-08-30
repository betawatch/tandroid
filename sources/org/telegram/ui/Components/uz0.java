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
import org.telegram.ui.Components.dk;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ph.d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 h;
    public final /* synthetic */ TLRPC.User n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ uz0(ph.d dVar, f01 f01Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.g3 g3Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = dVar;
        this.r = f01Var;
        this.s = messagesController;
        this.e = j10;
        this.n = user;
        this.v = strArr;
        this.c = i10;
        this.d = g3Var;
        this.f = z4;
        this.h = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f01 f01Var = (f01) this.r;
                org.telegram.ui.Cells.c6 c6Var = f01Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final ph.d dVar = this.b;
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
                        final org.telegram.ui.ActionBar.g3 g3Var = this.d;
                        final boolean z4 = this.f;
                        final org.telegram.ui.ActionBar.f6 f6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.vz0
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.yh.u(g3Var2.topBulletinContainer, f6Var, tL_error, false);
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
                                g3Var2.dismiss();
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
                final ph.d dVar2 = this.b;
                if (!dVar2.K) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.g3 g3Var2 = this.d;
                    final long j12 = this.e;
                    final boolean z10 = this.f;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                    final TLRPC.User user2 = this.n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: rh.s2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new dk(ph.d.this, tLObject, i10, j11, g3Var2, starrefprogram, j12, z10, context, f6Var2, user2, tL_error));
                        }
                    });
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uz0(ph.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.g3 g3Var, long j10, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.c = i10;
        this.s = starrefprogram;
        this.d = g3Var;
        this.e = j10;
        this.f = z4;
        this.v = context;
        this.h = f6Var;
        this.n = user;
    }
}
