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
import org.telegram.messenger.DispatchQueue;
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
import org.telegram.ui.qn;
import org.telegram.ui.qt;
import org.telegram.ui.to;
import org.telegram.ui.vo;
import org.telegram.ui.wo;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i10) {
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
        char c10;
        int i11 = this.a;
        char c11 = '\b';
        int i12 = 0;
        boolean z10 = this.b;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i11) {
            case 0:
                l7.v0((l7) obj5, (TLRPC.TL_error) obj, (Utilities.Callback) obj4, (TwoStepVerificationActivity) obj3, this.b, (TLObject) obj2);
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((i2.f1) obj5).b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj4, (u2.c0) obj3, (IOException) obj2, this.b);
                break;
            case 2:
                ((ContactsController) obj5).lambda$mergePhonebookAndTelegramContacts$41(this.b, (ArrayList) obj, (HashMap) obj4, (HashMap) obj3, (ArrayList) obj2);
                break;
            case 3:
                ((FileLoadOperation) obj5).lambda$onFinishLoadingFile$21((File) obj, (File) obj4, (File) obj3, (File) obj2, this.b);
                break;
            case 4:
                ((MessagesController) obj5).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) obj, (a0.h) obj4, (a0.h) obj3, this.b, (LongSparseIntArray) obj2);
                break;
            case 5:
                ((SendMessagesHelper) obj5).lambda$requestUrlAuth$39((TLObject) obj2, (TLRPC.TL_messages_requestUrlAuth) obj, (qn) obj4, (String) obj3, this.b);
                break;
            case 6:
                ((CameraController) obj5).lambda$recordVideo$13(this.d, (CameraController.ICameraView) obj4, (File) obj3, this.b, (Runnable) obj2);
                break;
            case 7:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                Activity activity = (Activity) obj4;
                TLObject tLObject = (TLObject) obj2;
                if (tL_error != null) {
                    int i13 = 3;
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(ieVar.y0).sendRequest(new TL_account.getPassword(), new w9(ieVar, twoStepVerificationActivity, z10, i13), 8);
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
                        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.n(linearLayout);
                        TextView textView = new TextView(activity);
                        int i14 = org.telegram.ui.ActionBar.h6.j5;
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
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
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        TextView textView2 = new TextView(activity);
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
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
                        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), mode));
                        TextView textView3 = new TextView(activity);
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
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
                            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.xd(ieVar));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                            textView4.setTextSize(1, 16.0f);
                            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
                            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.showDialog(b2Var);
                            break;
                        } else {
                            ieVar.w0.showDialog(b2Var);
                            break;
                        }
                    }
                } else {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        pf.d.r(ieVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z10) {
                            ieVar.c0(true);
                        }
                    }
                    ieVar.e0();
                    break;
                }
                break;
            case 8:
                qn.h1((qn) obj5, (org.telegram.ui.Cells.u1) obj, this.b, (String) obj4, (TLRPC.User[]) obj3, (CharacterStyle) obj2);
                break;
            case 9:
                qn qnVar = (qn) obj5;
                boolean[] zArr = (boolean[]) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z10) {
                        qnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, qnVar.getParentActivity(), qnVar.ea, false);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            qnVar.C6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 10:
                to toVar = (to) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                vo voVar = toVar.a;
                wo woVar = voVar.Y2;
                woVar.P.remove(((TLRPC.TL_channels_toggleUsername) obj4).username);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    voVar.x1(tL_username, !z10, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    voVar.x1(tL_username, z10, true);
                    woVar.V();
                } else {
                    AndroidUtilities.runOnUIThread(new y7(toVar, tL_username, z10, 17));
                }
                woVar.getMessagesController().updateUsernameActiveness(woVar.X, tL_username.username, tL_username.active);
                break;
            case 11:
                ((tz) obj5).J((oh.b) obj, (TLObject) obj2, (TLRPC.StickerSet) obj4, (TLRPC.Document) obj3, this.b, true);
                break;
            case 12:
                qt.R((qt) obj5, (TLObject) obj2, (ei.d) obj4, this.b, (HashSet) obj3, (TLRPC.TL_error) obj);
                break;
            default:
                org.telegram.ui.Wallet.s7 s7Var = (org.telegram.ui.Wallet.s7) obj5;
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj4;
                int[] iArr3 = (int[]) obj3;
                int[] iArr4 = (int[]) obj2;
                DispatchQueue dispatchQueue = org.telegram.ui.Wallet.w9.a;
                int i15 = 0;
                while (true) {
                    int i16 = 287;
                    if (i15 < 288) {
                        int i17 = i15 * 288;
                        int i18 = 8;
                        for (int i19 = 0; i19 < 288; i19++) {
                            int i20 = i17 + i19;
                            i18 = (iArr[i20] >>> 24) >= 128 ? 0 : Math.min(i18 + 1, 8);
                            iArr3[i20] = i18;
                        }
                        int i21 = 8;
                        while (i16 >= 0) {
                            int i22 = i17 + i16;
                            i21 = iArr3[i22] == 0 ? 0 : Math.min(i21 + 1, 8);
                            if (i21 < iArr3[i22]) {
                                iArr3[i22] = i21;
                            }
                            i16--;
                        }
                        i15++;
                    } else {
                        int i23 = 0;
                        while (i23 < 288) {
                            for (int i24 = i12; i24 < 288; i24++) {
                                iArr4[i24] = iArr3[(i24 * 288) + i23];
                            }
                            int i25 = i12;
                            while (i25 < 288) {
                                int min = Math.min(i16, i25 + 8);
                                int i26 = 128;
                                for (int max = Math.max(i12, i25 - 8); max <= min; max++) {
                                    int i27 = iArr4[max];
                                    if (i27 < 8) {
                                        int i28 = max - i25;
                                        int i29 = (i28 * i28) + (i27 * i27);
                                        if (i29 < i26) {
                                            i26 = i29;
                                        }
                                    }
                                }
                                iArr3[(i25 * 288) + i23] = org.telegram.ui.Wallet.w9.b[i26];
                                i25++;
                                i12 = 0;
                                i16 = 287;
                            }
                            i23++;
                            i12 = 0;
                            i16 = 287;
                        }
                        int i30 = 0;
                        while (i30 < 82944) {
                            int i31 = iArr[i30];
                            int i32 = i31 >>> 24;
                            int max2 = Math.max(iArr3[i30], i32);
                            if (i32 != 255) {
                                if (i32 == 0) {
                                    i31 = (max2 << 24) | 16777215;
                                } else {
                                    int i33 = ((255 - i32) * max2) / 255;
                                    int i34 = i32 + i33;
                                    int i35 = i33 * 255;
                                    c10 = c11;
                                    i31 = ((((i31 & 255) * i32) + i35) / i34) | ((((((i31 >> 8) & 255) * i32) + i35) / i34) << 8) | (i34 << 24) | ((((((i31 >> 16) & 255) * i32) + i35) / i34) << 16);
                                    iArr2[i30] = i31;
                                    i30++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i30] = i31;
                            i30++;
                            c11 = c10;
                        }
                        if (z10) {
                            int i36 = 0;
                            for (int i37 = 0; i37 < 82944; i37 += 7) {
                                if ((iArr2[i37] >>> 24) > 0) {
                                    i36++;
                                }
                            }
                            if (i36 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, 288, 288, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                Bitmap createBitmap2 = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(createBitmap2).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                bitmap = createBitmap2;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s7Var, iArr2, bitmap, 18));
                                break;
                            }
                        }
                        bitmap = null;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s7Var, iArr2, bitmap, 18));
                    }
                }
        }
    }

    public /* synthetic */ p4(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ p4(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 2;
        this.c = contactsController;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ p4(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, qn qnVar, String str, boolean z10) {
        this.a = 5;
        this.c = sendMessagesHelper;
        this.h = tLObject;
        this.d = tL_messages_requestUrlAuth;
        this.e = qnVar;
        this.f = str;
        this.b = z10;
    }

    public /* synthetic */ p4(org.telegram.ui.ie ieVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.a = 7;
        this.c = ieVar;
        this.d = tL_error;
        this.f = twoStepVerificationActivity;
        this.e = activity;
        this.b = z10;
        this.h = tLObject;
    }

    public /* synthetic */ p4(qn qnVar, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, boolean z10, MessageObject messageObject, TLRPC.TL_webPage tL_webPage) {
        this.a = 9;
        this.c = qnVar;
        this.d = b2Var;
        this.e = zArr;
        this.b = z10;
        this.f = messageObject;
        this.h = tL_webPage;
    }

    public /* synthetic */ p4(qn qnVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 8;
        this.c = qnVar;
        this.d = u1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }

    public /* synthetic */ p4(to toVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.a = 10;
        this.c = toVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f = tL_username;
        this.b = z10;
        this.d = tL_error;
    }

    public /* synthetic */ p4(tz tzVar, oh.b bVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.a = 11;
        this.c = tzVar;
        this.d = bVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f = document;
        this.b = z10;
    }

    public /* synthetic */ p4(qt qtVar, TLObject tLObject, ei.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.c = qtVar;
        this.h = tLObject;
        this.e = dVar;
        this.b = z10;
        this.f = hashSet;
        this.d = tL_error;
    }
}
