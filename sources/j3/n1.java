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
import k7.c6;
import mh.k7;
import mh.r5;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap;
import org.telegram.ui.bu;
import org.telegram.ui.dp;
import org.telegram.ui.ep;
import org.telegram.ui.ke;
import org.telegram.ui.xn;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((SendMessagesHelper) this.f).lambda$requestUrlAuth$36((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.b, (xn) this.c, (String) this.d, this.e);
                break;
            case 6:
                ((CameraController) this.f).lambda$recordVideo$13(this.h, (CameraController.ICameraView) this.b, (File) this.c, this.e, (Runnable) this.d);
                break;
            case 7:
                ke keVar = (ke) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                Activity activity = (Activity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z4 = this.e;
                if (tL_error == null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        af.g.s(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z4) {
                            keVar.c0(true);
                        }
                    }
                    keVar.e0();
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
                        ConnectionsManager.getInstance(keVar.v0).sendRequest(new TL_account.getPassword(), new k7(keVar, twoStepVerificationActivity, z4, 1), 8);
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
                    int i10 = k6.j5;
                    textView.setTextColor(k6.w0(null, i10, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, c6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    int w02 = k6.w0(null, i10, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(k6.w0(null, i10, false));
                    textView2.setTextSize(1, 16.0f);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    y3.q(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, c6.n(-1, -2));
                        linearLayout2.addView(imageView, c6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c6.n(-2, -2));
                        linearLayout2.addView(textView2, c6.n(-1, -2));
                    }
                    LinearLayout h = l.d.h(activity, 0);
                    linearLayout.addView(h, c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(k6.w0(null, i10, false));
                    textView3.setTextSize(1, 16.0f);
                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    y3.q(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        h.addView(textView3, c6.n(-1, -2));
                        h.addView(imageView2, c6.q(-2, -2, 5));
                    } else {
                        h.addView(imageView2, c6.n(-2, -2));
                        h.addView(textView3, c6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new zd(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(k6.w0(null, i10, false));
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity == null) {
                        keVar.t0.showDialog(alertDialog$Builder.a);
                        break;
                    } else {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                        break;
                    }
                }
            case 8:
                xn xnVar = (xn) this.f;
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
                        xnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, xnVar.getParentActivity(), xnVar.ba, false);
                            break;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            xnVar.z6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 9:
                ap apVar = (ap) this.f;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.h;
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                dp dpVar = apVar.a;
                ep epVar = dpVar.X2;
                epVar.M.remove(tL_channels_toggleUsername.username);
                boolean z10 = tLObject2 instanceof TLRPC.TL_boolTrue;
                boolean z11 = this.e;
                if (z10) {
                    dpVar.v1(tL_username, !z11, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    dpVar.v1(tL_username, z11, true);
                    epVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new r5(apVar, tL_username, z11, 10));
                }
                epVar.getMessagesController().updateUsernameActiveness(epVar.U, tL_username.username, tL_username.active);
                break;
            case 10:
                ((mz) this.f).K((bh.c) this.h, (TLObject) this.b, (TLRPC.StickerSet) this.c, (TLRPC.Document) this.d, this.e, true);
                break;
            default:
                bu.Q((bu) this.f, (TLObject) this.h, (qh.d) this.b, this.e, (HashSet) this.c, (TLRPC.TL_error) this.d);
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
