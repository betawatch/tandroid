package lh;

import android.text.SpannableString;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c60;
import org.telegram.ui.jq;
import org.telegram.ui.nz0;
import org.telegram.ui.oy;
import org.telegram.ui.oz0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(q qVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, long j10) {
        this.e = qVar;
        this.f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z4;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.b;
        boolean z4 = this.c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                q qVar = (q) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    qVar.h0(this.c, this.b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                nh.d4 d4Var = (nh.d4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                nh.t6 storiesController = messagesController.getStoriesController();
                final long j11 = this.b;
                final boolean z10 = this.c;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                final int i11 = 0;
                qaVar.b = new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z10, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j11, z10, true);
                                break;
                        }
                    }
                };
                final int i12 = 1;
                qaVar.c = new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z10, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j11, z10, true);
                                break;
                        }
                    }
                };
                ic V = new qc(d4Var.a1, d4Var.y0).V(Arrays.asList(tLObject2), !z10 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, qaVar);
                V.a = 2;
                V.k(true);
                return;
            case 2:
                nh.t6 t6Var = (nh.t6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                h5.d dVar = (h5.d) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (tL_error == null) {
                    dVar.accept(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z4) {
                        dVar.accept(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(t6Var.a);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j12 = this.b;
                    boostsController.getBoostsStats(j12, new w1(t6Var, dVar, messagesController2, j12));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (z4 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, f6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        kh.a2.C(R.string.OK, alertDialog$Builder, null);
                    }
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    qc X = qc.X();
                    if (X != null) {
                        X.d0(tL_error, false);
                    }
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (z4 && R2 != null) {
                    R2.showDialog(new eg.o1(R2, 14, true));
                }
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((xf) obj4).a;
                if (editTextBoldCursor == null) {
                    return;
                }
                int selectionEnd = editTextBoldCursor.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    try {
                        chatActivityEnterView.O2 = 2;
                        if (str2 == null) {
                            str2 = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str2);
                        org.telegram.ui.Components.u5 u5Var = document != null ? new org.telegram.ui.Components.u5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.u5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z4) {
                            u5Var.fromEmojiKeyboard = true;
                        }
                        u5Var.cacheType = org.telegram.ui.Components.l5.g();
                        spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    chatActivityEnterView.O2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.O2 = 0;
                    throw th2;
                }
            case 4:
                c60.y((c60) obj4, (org.telegram.ui.ActionBar.d2[]) obj2, this.c, (TLRPC.TL_error) obj3, this.b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                oz0 oz0Var = (oz0) obj4;
                ProfileActivity profileActivity = oz0Var.b;
                jq jqVar = new jq(profileActivity.b1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z4, null);
                jqVar.U0 = new nz0(oz0Var, (oy) obj);
                profileActivity.presentFragment(jqVar);
                return;
        }
    }

    public /* synthetic */ j(nh.d4 d4Var, MessagesController messagesController, long j10, boolean z4, String str, TLObject tLObject) {
        this.e = d4Var;
        this.f = messagesController;
        this.b = j10;
        this.c = z4;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ j(nh.t6 t6Var, TLRPC.TL_error tL_error, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = t6Var;
        this.f = tL_error;
        this.c = z4;
        this.b = j10;
        this.d = dVar;
        this.h = f6Var;
    }

    public /* synthetic */ j(xf xfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z4) {
        this.e = xfVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j10;
        this.c = z4;
    }

    public /* synthetic */ j(c60 c60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = c60Var;
        this.d = d2VarArr;
        this.c = z4;
        this.f = tL_error;
        this.b = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ j(oz0 oz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z4, oy oyVar) {
        this.e = oz0Var;
        this.b = j10;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z4;
        this.h = oyVar;
    }
}
