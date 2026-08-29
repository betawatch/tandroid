package jh;

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
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.dq;
import org.telegram.ui.dz0;
import org.telegram.ui.fy;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i(q qVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = qVar;
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
                q qVar = (q) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    qVar.h0(this.c, this.b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                lh.d4 d4Var = (lh.d4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                lh.s6 storiesController = messagesController.getStoriesController();
                final long j11 = this.b;
                final boolean z11 = this.c;
                storiesController.i0(j11, z11, false);
                oc.i iVar = new oc.i(4);
                final int i11 = 0;
                iVar.b = new Runnable() { // from class: lh.b2
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
                iVar.c = new Runnable() { // from class: lh.b2
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
                mc V = new tc(d4Var.Z0, d4Var.x0).V(Arrays.asList(tLObject2), !z11 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, iVar);
                V.a = 2;
                V.k(true);
                return;
            case 2:
                lh.s6 s6Var = (lh.s6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                f5.d dVar = (f5.d) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                if (tL_error == null) {
                    dVar.accept(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        dVar.accept(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(s6Var.a);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j12 = this.b;
                    boostsController.getBoostsStats(j12, new w1(s6Var, dVar, messagesController2, j12));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (z10 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        j7.l1.C(R.string.OK, alertDialog$Builder, null);
                    }
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    tc X = tc.X();
                    if (X != null) {
                        X.d0(tL_error, false);
                    }
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (z10 && R2 != null) {
                    R2.showDialog(new cg.p1(R2, 14, true));
                }
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((ag) obj4).a;
                if (editTextBoldCursor == null) {
                    return;
                }
                int selectionEnd = editTextBoldCursor.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    try {
                        chatActivityEnterView.N2 = 2;
                        if (str2 == null) {
                            str2 = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str2);
                        org.telegram.ui.Components.y5 y5Var = document != null ? new org.telegram.ui.Components.y5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.y5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            y5Var.fromEmojiKeyboard = true;
                        }
                        y5Var.cacheType = org.telegram.ui.Components.p5.g();
                        spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    chatActivityEnterView.N2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.N2 = 0;
                    throw th2;
                }
            case 4:
                r50.y((r50) obj4, (org.telegram.ui.ActionBar.c2[]) obj2, this.c, (TLRPC.TL_error) obj3, this.b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                dz0 dz0Var = (dz0) obj4;
                ProfileActivity profileActivity = dz0Var.b;
                dq dqVar = new dq(profileActivity.a1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                dqVar.T0 = new cz0(dz0Var, (fy) obj);
                profileActivity.presentFragment(dqVar);
                return;
        }
    }

    public /* synthetic */ i(lh.d4 d4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = d4Var;
        this.f = messagesController;
        this.b = j10;
        this.c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ i(lh.s6 s6Var, TLRPC.TL_error tL_error, boolean z10, long j10, f5.d dVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = s6Var;
        this.f = tL_error;
        this.c = z10;
        this.b = j10;
        this.d = dVar;
        this.h = c6Var;
    }

    public /* synthetic */ i(ag agVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = agVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j10;
        this.c = z10;
    }

    public /* synthetic */ i(r50 r50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = r50Var;
        this.d = c2VarArr;
        this.c = z10;
        this.f = tL_error;
        this.b = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ i(dz0 dz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, fy fyVar) {
        this.e = dz0Var;
        this.b = j10;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z10;
        this.h = fyVar;
    }
}
