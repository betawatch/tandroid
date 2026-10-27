package bi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.sz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.ke;
import org.telegram.ui.tt;
import org.telegram.ui.wn;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i10) {
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
                h7.u0((h7) obj5, (TLRPC.TL_error) obj, (Utilities.Callback) obj4, (TwoStepVerificationActivity) obj3, this.b, (TLObject) obj2);
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((i2.g1) obj5).b.h.f(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj4, (u2.c0) obj3, (IOException) obj2, this.b);
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
                ((SendMessagesHelper) obj5).lambda$requestUrlAuth$39((TLObject) obj2, (TLRPC.TL_messages_requestUrlAuth) obj, (wn) obj4, (String) obj3, this.b);
                break;
            case 6:
                ((CameraController) obj5).lambda$recordVideo$13(this.d, (CameraController.ICameraView) obj4, (File) obj3, this.b, (Runnable) obj2);
                break;
            case 7:
                ke keVar = (ke) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                Activity activity = (Activity) obj4;
                TLObject tLObject = (TLObject) obj2;
                if (tL_error != null) {
                    int i13 = 3;
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.o0).sendRequest(new TL_account.getPassword(), new r9(keVar, twoStepVerificationActivity, z10, i13), 8);
                            break;
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.p0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.Components.wc.e0(tL_error);
                            break;
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.p0();
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        TextView textView = new TextView(activity);
                        int i14 = org.telegram.ui.ActionBar.y6.j5;
                        org.telegram.ui.ActionBar.f7.V(textView, i14, null);
                        textView.setTextSize(1, 16.0f);
                        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                        linearLayout.addView(textView, kb1.r(-1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(activity);
                        linearLayout2.setOrientation(0);
                        linearLayout.addView(linearLayout2, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.f7.t(imageView, i14, null, mode);
                        TextView textView2 = new TextView(activity);
                        org.telegram.ui.ActionBar.f7.V(textView2, i14, null);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
                        if (LocaleController.isRTL) {
                            linearLayout2.addView(textView2, kb1.r(-1, -2));
                            linearLayout2.addView(imageView, kb1.u(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, kb1.r(-2, -2));
                            linearLayout2.addView(textView2, kb1.r(-1, -2));
                        }
                        LinearLayout f7 = org.telegram.messenger.t.f(activity, 0);
                        linearLayout.addView(f7, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                        org.telegram.ui.ActionBar.f7.t(imageView2, i14, null, mode);
                        TextView textView3 = new TextView(activity);
                        org.telegram.ui.ActionBar.f7.V(textView3, i14, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
                        if (LocaleController.isRTL) {
                            f7.addView(textView3, kb1.r(-1, -2));
                            i10 = 5;
                            f7.addView(imageView2, kb1.u(-2, -2, 5));
                        } else {
                            i10 = 5;
                            f7.addView(imageView2, kb1.r(-2, -2));
                            f7.addView(textView3, kb1.r(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error.text)) {
                            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.od(keVar));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            org.telegram.ui.ActionBar.f7.V(textView4, i14, null);
                            textView4.setTextSize(1, 16.0f);
                            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
                            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                            linearLayout.addView(textView4, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.showDialog(e2Var);
                            break;
                        } else {
                            keVar.m0.showDialog(e2Var);
                            break;
                        }
                    }
                } else {
                    twoStepVerificationActivity.p0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        qf.d.r(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z10) {
                            keVar.H(true);
                        }
                    }
                    keVar.J();
                    break;
                }
                break;
            case 8:
                wn.z0((wn) obj5, (org.telegram.ui.Cells.s1) obj, this.b, (String) obj4, (TLRPC.User[]) obj3, (CharacterStyle) obj2);
                break;
            case 9:
                wn wnVar = (wn) obj5;
                boolean[] zArr = (boolean[]) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                try {
                    ((org.telegram.ui.ActionBar.e2) obj).dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z10) {
                        wnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        break;
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, wnVar.getParentActivity(), wnVar.ua, false);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            wnVar.F6(messageObject);
                            return;
                        }
                    }
                }
                break;
            case 10:
                int i15 = 16;
                zo zoVar = (zo) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                bp bpVar = zoVar.a;
                cp cpVar = bpVar.i3;
                cpVar.P.remove(((TLRPC.TL_channels_toggleUsername) obj4).username);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    bpVar.C1(tL_username, !z10, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    bpVar.C1(tL_username, z10, true);
                    cpVar.X();
                } else {
                    AndroidUtilities.runOnUIThread(new u7(zoVar, tL_username, z10, i15));
                }
                cpVar.getMessagesController().updateUsernameActiveness(cpVar.X, tL_username.username, tL_username.active);
                break;
            case 11:
                ((sz) obj5).K((ph.b) obj, (TLObject) obj2, (TLRPC.StickerSet) obj4, (TLRPC.Document) obj3, this.b, true);
                break;
            case 12:
                tt.Q((tt) obj5, (TLObject) obj2, (fi.d) obj4, this.b, (HashSet) obj3, (TLRPC.TL_error) obj);
                break;
            default:
                org.telegram.ui.Wallet.s7 s7Var = (org.telegram.ui.Wallet.s7) obj5;
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj4;
                int[] iArr3 = (int[]) obj3;
                int[] iArr4 = (int[]) obj2;
                DispatchQueue dispatchQueue = org.telegram.ui.Wallet.w9.a;
                int i16 = 0;
                while (true) {
                    int i17 = 287;
                    if (i16 < 288) {
                        int i18 = i16 * 288;
                        int i19 = 8;
                        for (int i20 = 0; i20 < 288; i20++) {
                            int i21 = i18 + i20;
                            i19 = (iArr[i21] >>> 24) >= 128 ? 0 : Math.min(i19 + 1, 8);
                            iArr3[i21] = i19;
                        }
                        int i22 = 8;
                        while (i17 >= 0) {
                            int i23 = i18 + i17;
                            i22 = iArr3[i23] == 0 ? 0 : Math.min(i22 + 1, 8);
                            if (i22 < iArr3[i23]) {
                                iArr3[i23] = i22;
                            }
                            i17--;
                        }
                        i16++;
                    } else {
                        int i24 = 0;
                        while (i24 < 288) {
                            for (int i25 = i12; i25 < 288; i25++) {
                                iArr4[i25] = iArr3[(i25 * 288) + i24];
                            }
                            int i26 = i12;
                            while (i26 < 288) {
                                int min = Math.min(i17, i26 + 8);
                                int i27 = 128;
                                for (int max = Math.max(i12, i26 - 8); max <= min; max++) {
                                    int i28 = iArr4[max];
                                    if (i28 < 8) {
                                        int i29 = max - i26;
                                        int i30 = (i29 * i29) + (i28 * i28);
                                        if (i30 < i27) {
                                            i27 = i30;
                                        }
                                    }
                                }
                                iArr3[(i26 * 288) + i24] = org.telegram.ui.Wallet.w9.b[i27];
                                i26++;
                                i12 = 0;
                                i17 = 287;
                            }
                            i24++;
                            i12 = 0;
                            i17 = 287;
                        }
                        int i31 = 0;
                        while (i31 < 82944) {
                            int i32 = iArr[i31];
                            int i33 = i32 >>> 24;
                            int max2 = Math.max(iArr3[i31], i33);
                            if (i33 != 255) {
                                if (i33 == 0) {
                                    i32 = (max2 << 24) | 16777215;
                                } else {
                                    int i34 = ((255 - i33) * max2) / 255;
                                    int i35 = i33 + i34;
                                    int i36 = i34 * 255;
                                    c10 = c11;
                                    i32 = ((((i32 & 255) * i33) + i36) / i35) | (i35 << 24) | ((((((i32 >> 16) & 255) * i33) + i36) / i35) << 16) | ((((((i32 >> 8) & 255) * i33) + i36) / i35) << 8);
                                    iArr2[i31] = i32;
                                    i31++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i31] = i32;
                            i31++;
                            c11 = c10;
                        }
                        if (z10) {
                            int i37 = 0;
                            for (int i38 = 0; i38 < 82944; i38 += 7) {
                                if ((iArr2[i38] >>> 24) > 0) {
                                    i37++;
                                }
                            }
                            if (i37 > 592) {
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

    public /* synthetic */ k4(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ k4(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 2;
        this.c = contactsController;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ k4(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, wn wnVar, String str, boolean z10) {
        this.a = 5;
        this.c = sendMessagesHelper;
        this.h = tLObject;
        this.d = tL_messages_requestUrlAuth;
        this.e = wnVar;
        this.f = str;
        this.b = z10;
    }

    public /* synthetic */ k4(ke keVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.a = 7;
        this.c = keVar;
        this.d = tL_error;
        this.f = twoStepVerificationActivity;
        this.e = activity;
        this.b = z10;
        this.h = tLObject;
    }

    public /* synthetic */ k4(wn wnVar, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, boolean z10, MessageObject messageObject, TLRPC.TL_webPage tL_webPage) {
        this.a = 9;
        this.c = wnVar;
        this.d = e2Var;
        this.e = zArr;
        this.b = z10;
        this.f = messageObject;
        this.h = tL_webPage;
    }

    public /* synthetic */ k4(wn wnVar, org.telegram.ui.Cells.s1 s1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 8;
        this.c = wnVar;
        this.d = s1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }

    public /* synthetic */ k4(zo zoVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.a = 10;
        this.c = zoVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f = tL_username;
        this.b = z10;
        this.d = tL_error;
    }

    public /* synthetic */ k4(sz szVar, ph.b bVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.a = 11;
        this.c = szVar;
        this.d = bVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f = document;
        this.b = z10;
    }

    public /* synthetic */ k4(tt ttVar, TLObject tLObject, fi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.c = ttVar;
        this.h = tLObject;
        this.e = dVar;
        this.b = z10;
        this.f = hashSet;
        this.d = tL_error;
    }
}
