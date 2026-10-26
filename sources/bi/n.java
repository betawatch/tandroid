package bi;

import android.text.SpannableString;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.gq;
import org.telegram.ui.lb0;
import org.telegram.ui.qz0;
import org.telegram.ui.rz0;
import org.telegram.ui.v50;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n(y yVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = yVar;
        this.f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.b;
        boolean z10 = this.c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                y yVar = (y) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.n0(password);
                    yVar.q0(this.c, this.b, twoStepVerificationActivity.m0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                di.q4 q4Var = (di.q4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                di.h7 storiesController = messagesController.getStoriesController();
                final long j11 = this.b;
                final boolean z11 = this.c;
                storiesController.i0(j11, z11, false);
                m4.c cVar = new m4.c(9, false);
                final int i11 = 0;
                cVar.b = new Runnable() { // from class: di.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z11, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j11, z11, true);
                                break;
                        }
                    }
                };
                final int i12 = 1;
                cVar.c = new Runnable() { // from class: di.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z11, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j11, z11, true);
                                break;
                        }
                    }
                };
                org.telegram.ui.Components.qc W = new org.telegram.ui.Components.wc(q4Var.S0, q4Var.q0).W(Arrays.asList(tLObject2), !z11 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, cVar);
                W.a = 2;
                W.k(true);
                return;
            case 2:
                di.h7 h7Var = (di.h7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                if (tL_error == null) {
                    callback.run(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(h7Var.a);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j12 = this.b;
                    boostsController.getBoostsStats(j12, new t2(h7Var, callback, messagesController2, j12, 2));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                    if (z10 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, u6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    }
                    callback.run(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    org.telegram.ui.Components.wc Y = org.telegram.ui.Components.wc.Y();
                    if (Y != null) {
                        Y.g0(tL_error, false);
                    }
                    callback.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (z10 && R2 != null) {
                    R2.showDialog(new tg.y0(R2, 14, true));
                }
                callback.run(Boolean.FALSE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((gg) obj4).a;
                if (editTextBoldCursor == null) {
                    return;
                }
                int selectionEnd = editTextBoldCursor.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    try {
                        chatActivityEnterView.S2 = 2;
                        if (str2 == null) {
                            str2 = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str2);
                        org.telegram.ui.Components.c6 c6Var = document != null ? new org.telegram.ui.Components.c6(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.c6(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            c6Var.fromEmojiKeyboard = true;
                        }
                        c6Var.cacheType = org.telegram.ui.Components.t5.g();
                        spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    chatActivityEnterView.S2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.S2 = 0;
                    throw th2;
                }
            case 4:
                v50.y((v50) obj4, (org.telegram.ui.ActionBar.e2[]) obj2, this.c, (TLRPC.TL_error) obj3, this.b, (TL_phone.inviteToGroupCall) obj);
                return;
            case 5:
                lb0 lb0Var = (lb0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i13 = lb0Var.b;
                lb0Var.c();
                if (!(tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer)) {
                    if (tL_error2 != null) {
                        lb0.d().g0(tL_error2, false);
                        return;
                    }
                    return;
                }
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                if (user != null) {
                    org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(user);
                    i9Var.s = j10;
                    i9Var.g0 = str3;
                    i9Var.h0 = z10;
                    i9Var.f0 = true;
                    lb0Var.u(i9Var, false);
                    return;
                }
                return;
            default:
                rz0 rz0Var = (rz0) obj4;
                ProfileActivity profileActivity = rz0Var.b;
                gq gqVar = new gq(profileActivity.e1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                gqVar.X0 = new qz0(rz0Var, (cy) obj);
                profileActivity.presentFragment(gqVar);
                return;
        }
    }

    public /* synthetic */ n(di.q4 q4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = q4Var;
        this.f = messagesController;
        this.b = j10;
        this.c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ n(di.h7 h7Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = h7Var;
        this.f = tL_error;
        this.c = z10;
        this.b = j10;
        this.d = callback;
        this.h = u6Var;
    }

    public /* synthetic */ n(gg ggVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = ggVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j10;
        this.c = z10;
    }

    public /* synthetic */ n(v50 v50Var, org.telegram.ui.ActionBar.e2[] e2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = v50Var;
        this.d = e2VarArr;
        this.c = z10;
        this.f = tL_error;
        this.b = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ n(lb0 lb0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.e = lb0Var;
        this.d = tLObject;
        this.b = j10;
        this.h = str;
        this.c = z10;
        this.f = tL_error;
    }

    public /* synthetic */ n(rz0 rz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, cy cyVar) {
        this.e = rz0Var;
        this.b = j10;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z10;
        this.h = cyVar;
    }
}
