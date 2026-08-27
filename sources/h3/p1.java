package h3;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import hh.l7;
import hh.t5;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.yy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.rn;
import org.telegram.ui.ud;
import org.telegram.ui.uo;
import org.telegram.ui.vt;
import org.telegram.ui.wo;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.a = i10;
        this.f = obj;
        this.h = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = z10;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [j4.h0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g5.b bVar = (g5.b) this.f;
                Pair pair = (Pair) this.h;
                ((s1) bVar.c).h.d(((Integer) pair.first).intValue(), (j4.c0) pair.second, (j4.p) this.b, (j4.x) this.c, (IOException) this.d, this.e);
                break;
            case 1:
                j4.g0 g0Var = (j4.g0) this.f;
                this.h.d(g0Var.a, g0Var.b, (j4.p) this.b, (j4.x) this.c, (IOException) this.d, this.e);
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
                ((SendMessagesHelper) this.f).lambda$requestUrlAuth$36((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.b, (rn) this.c, (String) this.d, this.e);
                break;
            case 6:
                ((CameraController) this.f).lambda$recordVideo$13(this.h, (CameraController.ICameraView) this.b, (File) this.c, this.e, (Runnable) this.d);
                break;
            case 7:
                fe feVar = (fe) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                Activity activity = (Activity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z10 = this.e;
                if (tL_error == null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        we.e.s(feVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z10) {
                            feVar.c0(true);
                        }
                    }
                    feVar.e0();
                    break;
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if (!"SRP_ID_INVALID".equals(tL_error.text)) {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        mc.b0(tL_error);
                        break;
                    } else {
                        ConnectionsManager.getInstance(feVar.u0).sendRequest(new TL_account.getPassword(), new l7(feVar, twoStepVerificationActivity, z10, 2), 8);
                        break;
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i10 = g6.j5;
                    textView.setTextColor(g6.w0(null, i10, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, z5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    int w02 = g6.w0(null, i10, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(g6.w0(null, i10, false));
                    textView2.setTextSize(1, 16.0f);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                        linearLayout2.addView(imageView, z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, z5.n(-2, -2));
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                    }
                    LinearLayout f10 = org.telegram.messenger.y1.f(activity, 0);
                    linearLayout.addView(f10, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(g6.w0(null, i10, false));
                    textView3.setTextSize(1, 16.0f);
                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f10.addView(textView3, z5.n(-1, -2));
                        f10.addView(imageView2, z5.q(-2, -2, 5));
                    } else {
                        f10.addView(imageView2, z5.n(-2, -2));
                        f10.addView(textView3, z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new ud(feVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(g6.w0(null, i10, false));
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity == null) {
                        feVar.s0.showDialog(alertDialog$Builder.a);
                        break;
                    } else {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                        break;
                    }
                }
            case 8:
                rn rnVar = (rn) this.f;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.h;
                boolean[] zArr = (boolean[]) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.d;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.e) {
                        rnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, rnVar.getParentActivity(), rnVar.aa, false);
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            rnVar.z6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 9:
                uo uoVar = (uo) this.f;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.h;
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                wo woVar = uoVar.a;
                xo xoVar = woVar.W2;
                xoVar.L.remove(tL_channels_toggleUsername.username);
                boolean z11 = tLObject2 instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.e;
                if (z11) {
                    woVar.w1(tL_username, !z12, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    woVar.w1(tL_username, z12, true);
                    xoVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new t5(uoVar, tL_username, z12, 12));
                }
                xoVar.getMessagesController().updateUsernameActiveness(xoVar.T, tL_username.username, tL_username.active);
                break;
            case 10:
                ((yy) this.f).L((wg.b) this.h, (TLObject) this.b, (TLRPC.StickerSet) this.c, (TLRPC.Document) this.d, this.e, true);
                break;
            default:
                vt.Q((vt) this.f, (TLObject) this.h, (lh.d) this.b, this.e, (HashSet) this.c, (TLRPC.TL_error) this.d);
                break;
        }
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.f = obj;
        this.h = obj2;
        this.b = obj3;
        this.c = obj4;
        this.e = z10;
        this.d = obj5;
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.f = obj;
        this.h = obj2;
        this.b = obj3;
        this.e = z10;
        this.c = obj4;
        this.d = tLObject;
    }

    public /* synthetic */ p1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 2;
        this.f = contactsController;
        this.e = z10;
        this.h = arrayList;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = arrayList2;
    }
}
