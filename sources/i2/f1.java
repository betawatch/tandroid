package i2;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.de;
import org.telegram.ui.fo;
import org.telegram.ui.hu;
import org.telegram.ui.kp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.qe;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
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
        int i10;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.c;
                Pair pair = (Pair) this.d;
                g1Var.b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f, (IOException) this.h, this.b);
                break;
            case 1:
                ((ContactsController) this.c).lambda$mergePhonebookAndTelegramContacts$41(this.b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f, (ArrayList) this.h);
                break;
            case 2:
                ((FileLoadOperation) this.c).lambda$onFinishLoadingFile$21((File) this.d, (File) this.e, (File) this.f, (File) this.h, this.b);
                break;
            case 3:
                ((MessagesController) this.c).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) this.d, (a0.h) this.e, (a0.h) this.f, this.b, (LongSparseIntArray) this.h);
                break;
            case 4:
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$39((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.e, (fo) this.f, (String) this.h, this.b);
                break;
            case 5:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 6:
                qe qeVar = (qe) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.b;
                if (tL_error == null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        pf.d.s(qeVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z10) {
                            qeVar.c0(true);
                        }
                    }
                    qeVar.e0();
                    break;
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if (!"SRP_ID_INVALID".equals(tL_error.text)) {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        zc.d0(tL_error);
                        break;
                    } else {
                        ConnectionsManager.getInstance(qeVar.y0).sendRequest(new TL_account.getPassword(), new di.u1(qeVar, twoStepVerificationActivity, z10, 2), 8);
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
                    int i11 = g6.j5;
                    textView.setTextColor(g6.x0(null, i11, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, a6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    int x02 = g6.x0(null, i11, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(g6.x0(null, i11, false));
                    textView2.setTextSize(1, 16.0f);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.messenger.q.o(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, a6.n(-1, -2));
                        linearLayout2.addView(imageView, a6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, a6.n(-2, -2));
                        linearLayout2.addView(textView2, a6.n(-1, -2));
                    }
                    LinearLayout f7 = org.telegram.messenger.q.f(activity, 0);
                    linearLayout.addView(f7, a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i11, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(g6.x0(null, i11, false));
                    textView3.setTextSize(1, 16.0f);
                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.messenger.q.o(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f7.addView(textView3, a6.n(-1, -2));
                        i10 = 5;
                        f7.addView(imageView2, a6.q(-2, -2, 5));
                    } else {
                        i10 = 5;
                        f7.addView(imageView2, a6.n(-2, -2));
                        f7.addView(textView3, a6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new de(qeVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(g6.x0(null, i11, false));
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity == null) {
                        qeVar.w0.showDialog(alertDialog$Builder.a);
                        break;
                    } else {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                        break;
                    }
                }
                break;
            case 7:
                fo.h1((fo) this.c, (org.telegram.ui.Cells.u1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 8:
                fo foVar = (fo) this.c;
                a2 a2Var = (a2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    a2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.b) {
                        foVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, foVar.getParentActivity(), foVar.ea, false);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            foVar.C6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 9:
                kp kpVar = (kp) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                mp mpVar = kpVar.a;
                np npVar = mpVar.Y2;
                npVar.P.remove(tL_channels_toggleUsername.username);
                boolean z11 = tLObject2 instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.b;
                if (z11) {
                    mpVar.x1(tL_username, !z12, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    mpVar.x1(tL_username, z12, true);
                    npVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new di.x0(kpVar, tL_username, z12, 16));
                }
                npVar.getMessagesController().updateUsernameActiveness(npVar.X, tL_username.username, tL_username.active);
                break;
            case 10:
                ((wz) this.c).J((oh.b) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                break;
            default:
                hu.R((hu) this.c, (TLObject) this.d, (di.d) this.e, this.b, (HashSet) this.f, (TLRPC.TL_error) this.h);
                break;
        }
    }

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
        this.h = tLObject;
    }

    public /* synthetic */ f1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 1;
        this.c = contactsController;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ f1(fo foVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 7;
        this.c = foVar;
        this.d = u1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }
}
