package ai;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                k7.k1((k7) this.c, (TLRPC.TL_error) this.d, (Utilities.Callback) this.e, (TwoStepVerificationActivity) this.f, this.b, (TLObject) this.h);
                break;
            case 1:
                i2.e1 e1Var = (i2.e1) this.c;
                Pair pair = (Pair) this.d;
                e1Var.b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f, (IOException) this.h, this.b);
                break;
            case 2:
                ((ContactsController) this.c).lambda$mergePhonebookAndTelegramContacts$41(this.b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f, (ArrayList) this.h);
                break;
            case 3:
                ((FileLoadOperation) this.c).lambda$onFinishLoadingFile$21((File) this.d, (File) this.e, (File) this.f, (File) this.h, this.b);
                break;
            case 4:
                ((MessagesController) this.c).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) this.d, (a0.h) this.e, (a0.h) this.f, this.b, (LongSparseIntArray) this.h);
                break;
            case 5:
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$39((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.d, (sn) this.e, (String) this.f, this.b);
                break;
            case 6:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 7:
                org.telegram.ui.ke keVar = (org.telegram.ui.ke) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                Activity activity = (Activity) this.e;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.y0).sendRequest(new TL_account.getPassword(), new w9(keVar, twoStepVerificationActivity, z10, 3), 8);
                            break;
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.o0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.Components.xc.d0(tL_error);
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
                        int i11 = org.telegram.ui.ActionBar.h6.j5;
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                        textView.setTextSize(1, 16.0f);
                        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                        linearLayout.addView(textView, w7.z5.n(-1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(activity);
                        linearLayout2.setOrientation(0);
                        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        TextView textView2 = new TextView(activity);
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText1, textView2);
                        if (LocaleController.isRTL) {
                            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                            linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                        }
                        LinearLayout e = org.telegram.messenger.g0.e(activity, 0);
                        linearLayout.addView(e, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), mode));
                        TextView textView3 = new TextView(activity);
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText2, textView3);
                        if (LocaleController.isRTL) {
                            e.addView(textView3, w7.z5.n(-1, -2));
                            i10 = 5;
                            e.addView(imageView2, w7.z5.q(-2, -2, 5));
                        } else {
                            i10 = 5;
                            e.addView(imageView2, w7.z5.n(-2, -2));
                            e.addView(textView3, w7.z5.n(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error.text)) {
                            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.zd(keVar));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                            textView4.setTextSize(1, 16.0f);
                            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
                            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                            break;
                        } else {
                            keVar.w0.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    }
                } else {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        pf.d.r(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z10) {
                            keVar.c0(true);
                        }
                    }
                    keVar.e0();
                    break;
                }
            case 8:
                sn.h1((sn) this.c, (org.telegram.ui.Cells.u1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 9:
                sn snVar = (sn) this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.b) {
                        snVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, snVar.getParentActivity(), snVar.ea, false);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            snVar.C6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 10:
                vo voVar = (vo) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject2 = (TLObject) this.h;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                xo xoVar = voVar.a;
                yo yoVar = xoVar.Y2;
                yoVar.P.remove(tL_channels_toggleUsername.username);
                boolean z11 = tLObject2 instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.b;
                if (z11) {
                    xoVar.x1(tL_username, !z12, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    xoVar.x1(tL_username, z12, true);
                    yoVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new x7(voVar, tL_username, z12, 17));
                }
                yoVar.getMessagesController().updateUsernameActiveness(yoVar.X, tL_username.username, tL_username.active);
                break;
            case 11:
                ((tz) this.c).J((oh.b) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.e, (TLRPC.Document) this.f, this.b, true);
                break;
            case 12:
                st.R((st) this.c, (TLObject) this.h, (ei.d) this.e, this.b, (HashSet) this.f, (TLRPC.TL_error) this.d);
                break;
            default:
                org.telegram.ui.Wallet.s7 s7Var = (org.telegram.ui.Wallet.s7) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                for (int i12 = 0; i12 < 82944; i12++) {
                    iArr3[i12] = iArr[i12] >>> 24;
                }
                for (int i13 = 0; i13 < 288; i13++) {
                    w7.i6.a(i13 * 288, 1, iArr3, iArr4);
                }
                for (int i14 = 0; i14 < 288; i14++) {
                    w7.i6.a(i14, 288, iArr3, iArr4);
                }
                for (int i15 = 0; i15 < 82944; i15++) {
                    int i16 = iArr[i15];
                    int i17 = iArr3[i15];
                    int i18 = i16 >>> 24;
                    if (i18 != 255) {
                        if (i18 == 0) {
                            i16 = (i17 << 24) | 16777215;
                        } else {
                            int i19 = ((255 - i18) * i17) / 255;
                            int i20 = i18 + i19;
                            int i21 = i19 * 255;
                            i16 = ((((i16 & 255) * i18) + i21) / i20) | ((((((i16 >> 8) & 255) * i18) + i21) / i20) << 8) | (i20 << 24) | ((((((i16 >> 16) & 255) * i18) + i21) / i20) << 16);
                        }
                    }
                    iArr2[i15] = i16;
                }
                if (this.b) {
                    int i22 = 0;
                    for (int i23 = 0; i23 < 82944; i23 += 7) {
                        if ((iArr2[i23] >>> 24) > 0) {
                            i22++;
                        }
                    }
                    if (i22 > 592) {
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, 288, 288, Bitmap.Config.ARGB_8888);
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        bitmap = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                        new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                        createBitmap.recycle();
                        createScaledBitmap.recycle();
                        extractAlpha.recycle();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s7Var, iArr2, bitmap, 19));
                        break;
                    }
                }
                bitmap = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s7Var, iArr2, bitmap, 19));
        }
    }

    public /* synthetic */ m4(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ m4(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 2;
        this.c = contactsController;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ m4(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, sn snVar, String str, boolean z10) {
        this.a = 5;
        this.c = sendMessagesHelper;
        this.h = tLObject;
        this.d = tL_messages_requestUrlAuth;
        this.e = snVar;
        this.f = str;
        this.b = z10;
    }

    public /* synthetic */ m4(org.telegram.ui.ke keVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.a = 7;
        this.c = keVar;
        this.d = tL_error;
        this.f = twoStepVerificationActivity;
        this.e = activity;
        this.b = z10;
        this.h = tLObject;
    }

    public /* synthetic */ m4(sn snVar, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, boolean z10, MessageObject messageObject, TLRPC.TL_webPage tL_webPage) {
        this.a = 9;
        this.c = snVar;
        this.d = b2Var;
        this.e = zArr;
        this.b = z10;
        this.f = messageObject;
        this.h = tL_webPage;
    }

    public /* synthetic */ m4(sn snVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 8;
        this.c = snVar;
        this.d = u1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }

    public /* synthetic */ m4(vo voVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.a = 10;
        this.c = voVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f = tL_username;
        this.b = z10;
        this.d = tL_error;
    }

    public /* synthetic */ m4(tz tzVar, oh.b bVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.a = 11;
        this.c = tzVar;
        this.d = bVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f = document;
        this.b = z10;
    }

    public /* synthetic */ m4(st stVar, TLObject tLObject, ei.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.c = stVar;
        this.h = tLObject;
        this.e = dVar;
        this.b = z10;
        this.f = hashSet;
        this.d = tL_error;
    }
}
