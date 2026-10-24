package ai;

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
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.mz0;
import org.telegram.ui.nz0;
import org.telegram.ui.ob0;
import org.telegram.ui.u50;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m(x xVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = xVar;
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
                x xVar = (x) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    xVar.h0(this.c, this.b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ci.p4 p4Var = (ci.p4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                ci.h7 storiesController = messagesController.getStoriesController();
                final long j11 = this.b;
                final boolean z11 = this.c;
                storiesController.i0(j11, z11, false);
                mi.q qVar = new mi.q(9, (byte) 0);
                final int i11 = 0;
                qVar.b = new Runnable() { // from class: ci.i2
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
                qVar.c = new Runnable() { // from class: ci.i2
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
                org.telegram.ui.Components.qc V = new org.telegram.ui.Components.xc(p4Var.d1, p4Var.B0).V(Arrays.asList(tLObject2), !z11 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, qVar);
                V.a = 2;
                V.k(true);
                return;
            case 2:
                ci.h7 h7Var = (ci.h7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
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
                    boostsController.getBoostsStats(j12, new x2(h7Var, callback, messagesController2, j12, 2));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (z10 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, g6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                    }
                    callback.run(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        X.f0(tL_error, false);
                    }
                    callback.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (z10 && R2 != null) {
                    R2.showDialog(new sg.y0(R2, 14, true));
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
                        org.telegram.ui.Components.a6 a6Var = document != null ? new org.telegram.ui.Components.a6(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.a6(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            a6Var.fromEmojiKeyboard = true;
                        }
                        a6Var.cacheType = org.telegram.ui.Components.r5.g();
                        spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
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
                u50.z((u50) obj4, (org.telegram.ui.ActionBar.c2[]) obj2, this.c, (TLRPC.TL_error) obj3, this.b, (TL_phone.inviteToGroupCall) obj);
                return;
            case 5:
                ob0 ob0Var = (ob0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i13 = ob0Var.b;
                ob0Var.c();
                if (!(tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer)) {
                    if (tL_error2 != null) {
                        ob0.d().f0(tL_error2, false);
                        return;
                    }
                    return;
                }
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                if (user != null) {
                    org.telegram.ui.Wallet.j9 j9Var = new org.telegram.ui.Wallet.j9(user);
                    j9Var.r = j10;
                    j9Var.f0 = str3;
                    j9Var.g0 = z10;
                    j9Var.e0 = true;
                    ob0Var.u(j9Var, false);
                    return;
                }
                return;
            default:
                nz0 nz0Var = (nz0) obj4;
                ProfileActivity profileActivity = nz0Var.b;
                dq dqVar = new dq(profileActivity.f1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                dqVar.Y0 = new mz0(nz0Var, (ey) obj);
                profileActivity.presentFragment(dqVar);
                return;
        }
    }

    public /* synthetic */ m(ci.p4 p4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = p4Var;
        this.f = messagesController;
        this.b = j10;
        this.c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ m(ci.h7 h7Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = h7Var;
        this.f = tL_error;
        this.c = z10;
        this.b = j10;
        this.d = callback;
        this.h = g6Var;
    }

    public /* synthetic */ m(gg ggVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = ggVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j10;
        this.c = z10;
    }

    public /* synthetic */ m(u50 u50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = u50Var;
        this.d = c2VarArr;
        this.c = z10;
        this.f = tL_error;
        this.b = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ m(ob0 ob0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.e = ob0Var;
        this.d = tLObject;
        this.b = j10;
        this.h = str;
        this.c = z10;
        this.f = tL_error;
    }

    public /* synthetic */ m(nz0 nz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, ey eyVar) {
        this.e = nz0Var;
        this.b = j10;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z10;
        this.h = eyVar;
    }
}
