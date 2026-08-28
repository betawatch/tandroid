package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ kh.d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ b6 n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ l3(kh.d dVar, iz0 iz0Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i9, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, b6 b6Var) {
        this.b = dVar;
        this.r = iz0Var;
        this.s = messagesController;
        this.c = j10;
        this.d = user;
        this.v = strArr;
        this.e = i9;
        this.f = f3Var;
        this.h = z10;
        this.n = b6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.v;
                final kh.d dVar = this.b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i9 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i9).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
                    final org.telegram.ui.ActionBar.f3 f3Var = this.f;
                    final long j11 = this.c;
                    final boolean z10 = this.h;
                    final b6 b6Var = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: mh.e3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new i3(kh.d.this, tLObject, i9, j10, f3Var, starrefprogram, j11, z10, context, b6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                iz0 iz0Var = (iz0) this.r;
                c6 c6Var = iz0Var.h;
                final MessagesController messagesController = (MessagesController) this.s;
                String[] strArr = (String[]) this.v;
                final kh.d dVar2 = this.b;
                if (!dVar2.J) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -iz0Var.y;
                        iz0Var.y = f10;
                        AndroidUtilities.shakeViewSpring(textView, f10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        break;
                    } else {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.f3 f3Var2 = this.f;
                        final boolean z11 = this.h;
                        final b6 b6Var2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.yy0
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.j2.s(f3Var3.topBulletinContainer, b6Var2, tL_error, false);
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
                                messagesController2.processUpdates(updates, false);
                                f3Var3.dismiss();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || U == null) {
                                    return;
                                }
                                gc M = oc.a0(U).M(LocaleController.getString(z11 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                lb lbVar = M.e;
                                if (lbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).gravity |= 1;
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

    public /* synthetic */ l3(kh.d dVar, long[] jArr, int i9, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.f3 f3Var, long j10, boolean z10, Context context, b6 b6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.e = i9;
        this.s = starrefprogram;
        this.f = f3Var;
        this.c = j10;
        this.h = z10;
        this.v = context;
        this.n = b6Var;
        this.d = user;
    }
}
