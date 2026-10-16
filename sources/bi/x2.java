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
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ic0;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.n60;
import org.telegram.ui.tq;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ x2(q5 q5Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.d = q5Var;
        this.e = messagesController;
        this.c = j10;
        this.b = z10;
        this.f = str;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                q5 q5Var = (q5) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                x8 storiesController = messagesController.getStoriesController();
                final long j11 = this.c;
                final boolean z11 = this.b;
                storiesController.i0(j11, z11, false);
                n3.b bVar = new n3.b(6, false);
                final int i11 = 0;
                bVar.b = new Runnable() { // from class: bi.b3
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
                bVar.c = new Runnable() { // from class: bi.b3
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
                sc V = new zc(q5Var.d1, q5Var.B0).V(Arrays.asList(tLObject), !z11 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, bVar);
                V.a = 2;
                V.k(true);
                return;
            case 1:
                x8 x8Var = (x8) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                if (tL_error == null) {
                    callback.run(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(x8Var.a);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j12 = this.c;
                    boostsController.getBoostsStats(j12, new i(x8Var, callback, messagesController2, j12, 1));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    if (z10 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                    }
                    callback.run(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    zc X = zc.X();
                    if (X != null) {
                        X.f0(tL_error, false);
                    }
                    callback.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (z10 && R2 != null) {
                    R2.showDialog(new sg.y0(R2, 14, true));
                }
                callback.run(Boolean.FALSE);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                ChatActivityEnterView chatActivityEnterView = ((ig) obj4).a;
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
                        org.telegram.ui.Components.b6 b6Var = document != null ? new org.telegram.ui.Components.b6(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.b6(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            b6Var.fromEmojiKeyboard = true;
                        }
                        b6Var.cacheType = org.telegram.ui.Components.s5.g();
                        spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
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
            case 3:
                n60.B((n60) obj4, (org.telegram.ui.ActionBar.a2[]) obj3, this.b, (TLRPC.TL_error) obj, this.c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                ic0 ic0Var = (ic0) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i13 = ic0Var.b;
                ic0Var.c();
                if (!(tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer)) {
                    if (tL_error2 != null) {
                        ic0.d().f0(tL_error2, false);
                        return;
                    }
                    return;
                }
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                if (user != null) {
                    org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(user);
                    j8Var.r = j10;
                    j8Var.d0 = str3;
                    j8Var.e0 = z10;
                    j8Var.c0 = true;
                    ic0Var.u(j8Var, false);
                    return;
                }
                return;
            case 5:
                m01 m01Var = (m01) obj4;
                ProfileActivity profileActivity = m01Var.b;
                tq tqVar = new tq(profileActivity.e1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                tqVar.X0 = new l01(m01Var, (yy) obj2);
                profileActivity.presentFragment(tqVar);
                return;
            default:
                zh.g gVar = (zh.g) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.b, this.c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ x2(x8 x8Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = x8Var;
        this.e = tL_error;
        this.b = z10;
        this.c = j10;
        this.f = callback;
        this.h = c6Var;
    }

    public /* synthetic */ x2(ig igVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.d = igVar;
        this.e = editTextBoldCursor;
        this.f = str;
        this.h = document;
        this.c = j10;
        this.b = z10;
    }

    public /* synthetic */ x2(n60 n60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = n60Var;
        this.e = a2VarArr;
        this.b = z10;
        this.f = tL_error;
        this.c = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ x2(ic0 ic0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = ic0Var;
        this.h = tLObject;
        this.c = j10;
        this.f = str;
        this.b = z10;
        this.e = tL_error;
    }

    public /* synthetic */ x2(m01 m01Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, yy yyVar) {
        this.d = m01Var;
        this.c = j10;
        this.e = tL_chatAdminRights;
        this.f = str;
        this.b = z10;
        this.h = yyVar;
    }

    public /* synthetic */ x2(zh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = gVar;
        this.e = tL_error;
        this.h = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z10;
        this.c = j10;
    }
}
