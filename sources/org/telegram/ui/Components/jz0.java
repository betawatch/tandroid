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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nh.d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 h;
    public final /* synthetic */ TLRPC.User n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ jz0(nh.d dVar, uz0 uz0Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = dVar;
        this.r = uz0Var;
        this.s = messagesController;
        this.e = j10;
        this.n = user;
        this.v = strArr;
        this.c = i10;
        this.d = f3Var;
        this.f = z10;
        this.h = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uz0 uz0Var = (uz0) this.r;
                org.telegram.ui.Cells.a6 a6Var = uz0Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final nh.d dVar = this.b;
                if (!dVar.J) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f9 = -uz0Var.y;
                        uz0Var.y = f9;
                        AndroidUtilities.shakeViewSpring(textView, f9);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        break;
                    } else {
                        dVar.setLoading(true);
                        AndroidUtilities.hideKeyboard(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.e;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j10);
                        final TLRPC.User user = this.n;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.c);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.f3 f3Var = this.d;
                        final boolean z10 = this.f;
                        final org.telegram.ui.ActionBar.c6 c6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.kz0
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.th.t(f3Var2.topBulletinContainer, c6Var, tL_error, false);
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
                                f3Var2.dismiss();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || U == null) {
                                    return;
                                }
                                mc M = tc.a0(U).M(LocaleController.getString(z10 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                rb rbVar = M.e;
                                if (rbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) rbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) rbVar.getLayoutParams()).gravity |= 1;
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
                final nh.d dVar2 = this.b;
                if (!dVar2.J) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.f3 f3Var2 = this.d;
                    final long j12 = this.e;
                    final boolean z11 = this.f;
                    final org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                    final TLRPC.User user2 = this.n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ph.r2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new fk(nh.d.this, tLObject, i10, j11, f3Var2, starrefprogram, j12, z11, context, c6Var2, user2, tL_error));
                        }
                    });
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jz0(nh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.f3 f3Var, long j10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.c = i10;
        this.s = starrefprogram;
        this.d = f3Var;
        this.e = j10;
        this.f = z10;
        this.v = context;
        this.h = c6Var;
        this.n = user;
    }
}
