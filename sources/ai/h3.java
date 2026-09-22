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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g01;
import org.telegram.ui.h01;
import org.telegram.ui.i60;
import org.telegram.ui.nq;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h3(f6 f6Var, MessagesController messagesController, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = f6Var;
        this.e = messagesController;
        this.c = j3;
        this.b = z10;
        this.f = str;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.c;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                l9 storiesController = messagesController.getStoriesController();
                final long j10 = this.c;
                final boolean z11 = this.b;
                storiesController.i0(j10, z11, false);
                m5.e eVar = new m5.e((char) 0, 7);
                final int i11 = 0;
                eVar.b = new Runnable() { // from class: ai.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                messagesController.getStoriesController().i0(j10, !z11, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j10, z11, true);
                                break;
                        }
                    }
                };
                final int i12 = 1;
                eVar.c = new Runnable() { // from class: ai.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                messagesController.getStoriesController().i0(j10, !z11, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j10, z11, true);
                                break;
                        }
                    }
                };
                org.telegram.ui.Components.pc V = new xc(f6Var.d1, f6Var.B0).V(Arrays.asList(tLObject), !z11 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, eVar);
                V.a = 2;
                V.k(true);
                return;
            case 1:
                l9 l9Var = (l9) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                e2.h hVar = (e2.h) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                if (tL_error == null) {
                    hVar.accept(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        hVar.accept(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(l9Var.a);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j11 = this.c;
                    boostsController.getBoostsStats(j11, new l(l9Var, hVar, messagesController2, j11, 1));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (z10 && R != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, f6Var2);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                    }
                    hVar.accept(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    xc X = xc.X();
                    if (X != null) {
                        X.d0(tL_error, false);
                    }
                    hVar.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (z10 && R2 != null) {
                    R2.showDialog(new rg.x0(R2, 14, true));
                }
                hVar.accept(Boolean.FALSE);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
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
                        org.telegram.ui.Components.y5 y5Var = document != null ? new org.telegram.ui.Components.y5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.y5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            y5Var.fromEmojiKeyboard = true;
                        }
                        y5Var.cacheType = org.telegram.ui.Components.p5.g();
                        spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
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
                i60.y((i60) obj4, (org.telegram.ui.ActionBar.b2[]) obj3, this.b, (TLRPC.TL_error) obj, this.c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                h01 h01Var = (h01) obj4;
                ProfileActivity profileActivity = h01Var.b;
                nq nqVar = new nq(profileActivity.e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                nqVar.X0 = new g01(h01Var, (uy) obj2);
                profileActivity.presentFragment(nqVar);
                return;
            default:
                yh.g gVar = (yh.g) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.b, this.c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h3(l9 l9Var, TLRPC.TL_error tL_error, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = l9Var;
        this.e = tL_error;
        this.b = z10;
        this.c = j3;
        this.f = hVar;
        this.h = f6Var;
    }

    public /* synthetic */ h3(gg ggVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = ggVar;
        this.e = editTextBoldCursor;
        this.f = str;
        this.h = document;
        this.c = j3;
        this.b = z10;
    }

    public /* synthetic */ h3(i60 i60Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = i60Var;
        this.e = b2VarArr;
        this.b = z10;
        this.f = tL_error;
        this.c = j3;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ h3(h01 h01Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, uy uyVar) {
        this.d = h01Var;
        this.c = j3;
        this.e = tL_chatAdminRights;
        this.f = str;
        this.b = z10;
        this.h = uyVar;
    }

    public /* synthetic */ h3(yh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = gVar;
        this.e = tL_error;
        this.h = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z10;
        this.c = j3;
    }
}
