package i2;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.v1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dp;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.je;
import org.telegram.ui.wd;
import org.telegram.ui.xn;
import org.telegram.ui.zt;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                Pair pair = (Pair) this.d;
                d1Var.b.h.f(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f, (IOException) this.h, this.b);
                break;
            case 1:
                ((ContactsController) this.c).lambda$mergePhonebookAndTelegramContacts$41(this.b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f, (ArrayList) this.h);
                break;
            case 2:
                ((FileLoadOperation) this.c).lambda$onFinishLoadingFile$20((File) this.d, (File) this.e, (File) this.f, (File) this.h, this.b);
                break;
            case 3:
                ((MessagesController) this.c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, (a0.i) this.e, (a0.i) this.f, this.b, (LongSparseIntArray) this.h);
                break;
            case 4:
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$36((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.e, (xn) this.f, (String) this.h, this.b);
                break;
            case 5:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 6:
                je jeVar = (je) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.b;
                if (tL_error == null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        nf.f.s(jeVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z10) {
                            jeVar.c0(true);
                        }
                    }
                    jeVar.e0();
                    break;
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if (!"SRP_ID_INVALID".equals(tL_error.text)) {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        xc.b0(tL_error);
                        break;
                    } else {
                        ConnectionsManager.getInstance(jeVar.y0).sendRequest(new TL_account.getPassword(), new v1(jeVar, twoStepVerificationActivity, z10, 2), 8);
                        break;
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i10 = h6.j5;
                    textView.setTextColor(h6.w0(null, i10, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, x5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    int w02 = h6.w0(null, i10, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(h6.w0(null, i10, false));
                    textView2.setTextSize(1, 16.0f);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.messenger.z0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, x5.n(-1, -2));
                        linearLayout2.addView(imageView, x5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, x5.n(-2, -2));
                        linearLayout2.addView(textView2, x5.n(-1, -2));
                    }
                    LinearLayout f7 = org.telegram.messenger.z0.f(activity, 0);
                    linearLayout.addView(f7, x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i10, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(h6.w0(null, i10, false));
                    textView3.setTextSize(1, 16.0f);
                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.messenger.z0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f7.addView(textView3, x5.n(-1, -2));
                        f7.addView(imageView2, x5.q(-2, -2, 5));
                    } else {
                        f7.addView(imageView2, x5.n(-2, -2));
                        f7.addView(textView3, x5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new wd(jeVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(h6.w0(null, i10, false));
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity == null) {
                        jeVar.w0.showDialog(alertDialog$Builder.a);
                        break;
                    } else {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                        break;
                    }
                }
            case 7:
                xn xnVar = (xn) this.c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.b) {
                        xnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, xnVar.getParentActivity(), xnVar.ea, false);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            xnVar.z6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 8:
                dp dpVar = (dp) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                fp fpVar = dpVar.a;
                gp gpVar = fpVar.a3;
                gpVar.P.remove(tL_channels_toggleUsername.username);
                boolean z11 = tLObject2 instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.b;
                if (z11) {
                    fpVar.w1(tL_username, !z12, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    fpVar.w1(tL_username, z12, true);
                    gpVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new ci.y0(dpVar, tL_username, z12, 14));
                }
                gpVar.getMessagesController().updateUsernameActiveness(gpVar.X, tL_username.username, tL_username.active);
                break;
            case 9:
                ((lz) this.c).J((nh.b) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                break;
            default:
                zt.Q((zt) this.c, (TLObject) this.d, (ci.d) this.e, this.b, (HashSet) this.f, (TLRPC.TL_error) this.h);
                break;
        }
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
        this.h = tLObject;
    }

    public /* synthetic */ c1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 1;
        this.c = contactsController;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }
}
