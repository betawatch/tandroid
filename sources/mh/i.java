package mh;

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
import org.telegram.ui.d60;
import org.telegram.ui.kq;
import org.telegram.ui.py;
import org.telegram.ui.pz0;
import org.telegram.ui.qz0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i(p pVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, long j10) {
        this.e = pVar;
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
                p pVar = (p) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    pVar.h0(this.c, this.b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                oh.f4 f4Var = (oh.f4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                oh.t6 storiesController = messagesController.getStoriesController();
                final long j11 = this.b;
                final boolean z10 = this.c;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                final int i11 = 0;
                qaVar.b = new Runnable() { // from class: oh.d2
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
                qaVar.c = new Runnable() { // from class: oh.d2
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
                ic V = new qc(f4Var.a1, f4Var.y0).V(Arrays.asList(tLObject2), !z10 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, qaVar);
                V.a = 2;
                V.k(true);
                return;
            case 2:
                oh.t6 t6Var = (oh.t6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                h5.d dVar = (h5.d) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
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
                    boostsController.getBoostsStats(j12, new v1(t6Var, dVar, messagesController2, j12));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (z4 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, g6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        l.d.C(R.string.OK, alertDialog$Builder, null);
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
                    R2.showDialog(new fg.n1(R2, 14, true));
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    chatActivityEnterView.O2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.O2 = 0;
                    throw th2;
                }
            case 4:
                d60.y((d60) obj4, (org.telegram.ui.ActionBar.d2[]) obj2, this.c, (TLRPC.TL_error) obj3, this.b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                qz0 qz0Var = (qz0) obj4;
                ProfileActivity profileActivity = qz0Var.b;
                kq kqVar = new kq(profileActivity.b1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z4, null);
                kqVar.U0 = new pz0(qz0Var, (py) obj);
                profileActivity.presentFragment(kqVar);
                return;
        }
    }

    public /* synthetic */ i(oh.f4 f4Var, MessagesController messagesController, long j10, boolean z4, String str, TLObject tLObject) {
        this.e = f4Var;
        this.f = messagesController;
        this.b = j10;
        this.c = z4;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ i(oh.t6 t6Var, TLRPC.TL_error tL_error, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = t6Var;
        this.f = tL_error;
        this.c = z4;
        this.b = j10;
        this.d = dVar;
        this.h = g6Var;
    }

    public /* synthetic */ i(xf xfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z4) {
        this.e = xfVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j10;
        this.c = z4;
    }

    public /* synthetic */ i(d60 d60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = d60Var;
        this.d = d2VarArr;
        this.c = z4;
        this.f = tL_error;
        this.b = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ i(qz0 qz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z4, py pyVar) {
        this.e = qz0Var;
        this.b = j10;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z4;
        this.h = pyVar;
    }
}
