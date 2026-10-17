package i2;

import ai.w9;
import ai.x7;
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
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.v7;
import org.telegram.ui.ke;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;
import org.telegram.ui.zd;
import w7.k6;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
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
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                Pair pair = (Pair) this.d;
                e1Var.b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f, (IOException) this.h, this.b);
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
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$39((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.e, (sn) this.f, (String) this.h, this.b);
                break;
            case 5:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 6:
                ke keVar = (ke) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f;
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
                            xc.d0(tL_error);
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
                        int i11 = h6.j5;
                        textView.setTextColor(h6.x0(null, i11, false));
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
                        int x02 = h6.x0(null, i11, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        TextView textView2 = new TextView(activity);
                        textView2.setTextColor(h6.x0(null, i11, false));
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText1, textView2);
                        if (LocaleController.isRTL) {
                            linearLayout2.addView(textView2, z5.n(-1, -2));
                            linearLayout2.addView(imageView, z5.q(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, z5.n(-2, -2));
                            linearLayout2.addView(textView2, z5.n(-1, -2));
                        }
                        LinearLayout e = org.telegram.messenger.q.e(activity, 0);
                        linearLayout.addView(e, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                        imageView2.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i11, false), mode));
                        TextView textView3 = new TextView(activity);
                        textView3.setTextColor(h6.x0(null, i11, false));
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText2, textView3);
                        if (LocaleController.isRTL) {
                            e.addView(textView3, z5.n(-1, -2));
                            i10 = 5;
                            e.addView(imageView2, z5.q(-2, -2, 5));
                        } else {
                            i10 = 5;
                            e.addView(imageView2, z5.n(-2, -2));
                            e.addView(textView3, z5.n(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error.text)) {
                            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new zd(keVar));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            textView4.setTextColor(h6.x0(null, i11, false));
                            textView4.setTextSize(1, 16.0f);
                            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
                            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                            linearLayout.addView(textView4, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            case 7:
                sn.h1((sn) this.c, (u1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 8:
                sn snVar = (sn) this.c;
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
            case 9:
                vo voVar = (vo) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
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
            case 10:
                ((tz) this.c).J((oh.b) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                break;
            case 11:
                st.R((st) this.c, (TLObject) this.d, (ei.d) this.e, this.b, (HashSet) this.f, (TLRPC.TL_error) this.h);
                break;
            default:
                v7 v7Var = (v7) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                for (int i12 = 0; i12 < 82944; i12++) {
                    iArr3[i12] = iArr[i12] >>> 24;
                }
                for (int i13 = 0; i13 < 288; i13++) {
                    k6.a(i13 * 288, 1, iArr3, iArr4);
                }
                for (int i14 = 0; i14 < 288; i14++) {
                    k6.a(i14, 288, iArr3, iArr4);
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(v7Var, iArr2, bitmap, 17));
                        break;
                    }
                }
                bitmap = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(v7Var, iArr2, bitmap, 17));
        }
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
        this.h = tLObject;
    }

    public /* synthetic */ d1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 1;
        this.c = contactsController;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ d1(sn snVar, u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 7;
        this.c = snVar;
        this.d = u1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }
}
