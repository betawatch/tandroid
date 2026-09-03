package j3;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import k7.b6;
import lh.k7;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.be;
import org.telegram.ui.cp;
import org.telegram.ui.cu;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.me;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z4, int i10) {
        this.a = i10;
        this.f = obj;
        this.h = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = z4;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o4.z] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f7.b bVar = (f7.b) this.f;
                Pair pair = (Pair) this.h;
                ((q1) bVar.c).h.g(((Integer) pair.first).intValue(), (o4.v) pair.second, (o4.j) this.b, (o4.r) this.c, (IOException) this.d, this.e);
                break;
            case 1:
                b4.e0 e0Var = (b4.e0) this.f;
                this.h.g(e0Var.b, (o4.v) e0Var.c, (o4.j) this.b, (o4.r) this.c, (IOException) this.d, this.e);
                break;
            case 2:
                ((ContactsController) this.f).lambda$mergePhonebookAndTelegramContacts$41(this.e, (ArrayList) this.h, (HashMap) this.b, (HashMap) this.c, (ArrayList) this.d);
                break;
            case 3:
                ((FileLoadOperation) this.f).lambda$onFinishLoadingFile$20((File) this.h, (File) this.b, (File) this.c, (File) this.d, this.e);
                break;
            case 4:
                ((MessagesController) this.f).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.h, (a0.h) this.b, (a0.h) this.c, this.e, (LongSparseIntArray) this.d);
                break;
            case 5:
                ((SendMessagesHelper) this.f).lambda$requestUrlAuth$36((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.b, (zn) this.c, (String) this.d, this.e);
                break;
            case 6:
                ((CameraController) this.f).lambda$recordVideo$13(this.h, (CameraController.ICameraView) this.b, (File) this.c, this.e, (Runnable) this.d);
                break;
            case 7:
                me meVar = (me) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                Activity activity = (Activity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z4 = this.e;
                if (tL_error == null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        ze.d.s(meVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z4) {
                            meVar.c0(true);
                        }
                    }
                    meVar.e0();
                    break;
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if (!"SRP_ID_INVALID".equals(tL_error.text)) {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        qc.b0(tL_error);
                        break;
                    } else {
                        ConnectionsManager.getInstance(meVar.v0).sendRequest(new TL_account.getPassword(), new k7(meVar, twoStepVerificationActivity, z4, 1), 8);
                        break;
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i10 = j6.j5;
                    textView.setTextColor(j6.w0(null, i10, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, b6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    int w02 = j6.w0(null, i10, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(j6.w0(null, i10, false));
                    textView2.setTextSize(1, 16.0f);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    y3.q(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, b6.n(-1, -2));
                        linearLayout2.addView(imageView, b6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, b6.n(-2, -2));
                        linearLayout2.addView(textView2, b6.n(-1, -2));
                    }
                    LinearLayout h = kf.k0.h(activity, 0);
                    linearLayout.addView(h, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(j6.w0(null, i10, false));
                    textView3.setTextSize(1, 16.0f);
                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    y3.q(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        h.addView(textView3, b6.n(-1, -2));
                        h.addView(imageView2, b6.q(-2, -2, 5));
                    } else {
                        h.addView(imageView2, b6.n(-2, -2));
                        h.addView(textView3, b6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new be(meVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(j6.w0(null, i10, false));
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity == null) {
                        meVar.t0.showDialog(alertDialog$Builder.a);
                        break;
                    } else {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                        break;
                    }
                }
            case 8:
                zn znVar = (zn) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                boolean[] zArr = (boolean[]) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.d;
                try {
                    d2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.e) {
                        znVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, znVar.getParentActivity(), znVar.ba, false);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            znVar.z6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 9:
                cp cpVar = (cp) this.f;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.h;
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                ep epVar = cpVar.a;
                fp fpVar = epVar.X2;
                fpVar.M.remove(tL_channels_toggleUsername.username);
                boolean z10 = tLObject2 instanceof TLRPC.TL_boolTrue;
                boolean z11 = this.e;
                if (z10) {
                    epVar.v1(tL_username, !z11, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    epVar.v1(tL_username, z11, true);
                    fpVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new r5(cpVar, tL_username, z11, 10));
                }
                fpVar.getMessagesController().updateUsernameActiveness(fpVar.U, tL_username.username, tL_username.active);
                break;
            case 10:
                ((kz) this.f).K((ah.d) this.h, (TLObject) this.b, (TLRPC.StickerSet) this.c, (TLRPC.Document) this.d, this.e, true);
                break;
            default:
                cu.Q((cu) this.f, (TLObject) this.h, (ph.d) this.b, this.e, (HashSet) this.c, (TLRPC.TL_error) this.d);
                break;
        }
    }

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, Object obj5, int i10) {
        this.a = i10;
        this.f = obj;
        this.h = obj2;
        this.b = obj3;
        this.c = obj4;
        this.e = z4;
        this.d = obj5;
    }

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, boolean z4, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.f = obj;
        this.h = obj2;
        this.b = obj3;
        this.e = z4;
        this.c = obj4;
        this.d = tLObject;
    }

    public /* synthetic */ n1(ContactsController contactsController, boolean z4, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 2;
        this.f = contactsController;
        this.e = z4;
        this.h = arrayList;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = arrayList2;
    }
}
