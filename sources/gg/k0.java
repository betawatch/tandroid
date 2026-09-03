package gg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kh.h5;
import lh.w5;
import lh.y5;
import n7.qa;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.UserInfoActivity;
import ph.d4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.a = i10;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.n = obj6;
        this.f = obj7;
        this.r = obj8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                t0 t0Var = (t0) this.h;
                TLObject tLObject = (TLObject) this.c;
                List list = (List) this.d;
                p2.h hVar = (p2.h) this.e;
                t0 t0Var2 = (t0) this.n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error == null) {
                    if (tLObject != null) {
                        BillingController.getInstance().addResultListener(((p2.n) list.get(0)).c, new m0(1, hVar, t0Var2));
                        BillingController.getInstance().setOnCanceled(new o0(t0Var, 0));
                        BillingController billingController = BillingController.getInstance();
                        Activity parentActivity = p2Var.getParentActivity();
                        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        qa qaVar = new qa(24);
                        qaVar.L0((p2.n) list.get(0));
                        billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(qaVar.X()));
                        break;
                    }
                } else {
                    t0Var.run(tL_error);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                TLObject tLObject2 = (TLObject) this.c;
                List list2 = (List) this.d;
                p2.h hVar2 = (p2.h) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.n;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        BillingController.getInstance().addResultListener(((p2.n) list2.get(0)).c, new m0(0, hVar2, callback2));
                        BillingController.getInstance().setOnCanceled(new n0(0, callback));
                        BillingController billingController2 = BillingController.getInstance();
                        Activity parentActivity2 = p2Var2.getParentActivity();
                        AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        qa qaVar2 = new qa(24);
                        qaVar2.L0((p2.n) list2.get(0));
                        billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(qaVar2.X()));
                        break;
                    }
                } else {
                    callback.run(tL_error2);
                    break;
                }
                break;
            case 2:
                TLObject tLObject3 = (TLObject) this.c;
                p2.n nVar = (p2.n) this.h;
                p2.h hVar3 = (p2.h) this.e;
                dh.v vVar = (dh.v) this.n;
                Activity activity = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list3 = (List) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        vVar.run(Boolean.FALSE, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                        break;
                    } else {
                        vVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(nVar.c, new m0(3, hVar3, vVar));
                    BillingController.getInstance().setOnCanceled(new w5(vVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qa qaVar3 = new qa(24);
                    qaVar3.L0((p2.n) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(qaVar3.X()));
                    break;
                }
            case 3:
                TLObject tLObject4 = (TLObject) this.c;
                p2.n nVar2 = (p2.n) this.h;
                p2.h hVar4 = (p2.h) this.e;
                h5 h5Var = (h5) this.n;
                Activity activity2 = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list4 = (List) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                        h5Var.run(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        h5Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(nVar2.c, new m0(2, hVar4, h5Var));
                    BillingController.getInstance().setOnCanceled(new y5(h5Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qa qaVar4 = new qa(24);
                    qaVar4.L0((p2.n) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(qaVar4.X()));
                    break;
                }
            case 4:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$76((a0.h) this.h, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.n, (ArrayList) this.f, (HashMap) this.r);
                break;
            case 5:
                UserInfoActivity.Y((UserInfoActivity) this.h, (TLRPC.TL_error) this.b, (TLObject) this.c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, (TLObject) this.n, (int[]) this.f, (ArrayList) this.r);
                break;
            default:
                final String[] strArr = (String[]) this.b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.h;
                final ph.d dVar = (ph.d) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                d4 d4Var = (d4) this.e;
                final ImageView imageView = (ImageView) this.n;
                final f6 f6Var = (f6) this.f;
                final int[] iArr = (int[]) this.r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    final boolean z4 = zArr[0];
                    final String str = strArr[0];
                    d4Var.run(str, new Utilities.Callback2() { // from class: vh.c
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            Bitmap bitmap = (Bitmap) obj;
                            Boolean bool = (Boolean) obj2;
                            if (TextUtils.equals(str, strArr[0])) {
                                boolean booleanValue = bool.booleanValue();
                                ImageView imageView2 = imageView;
                                f6 f6Var2 = f6Var;
                                if (booleanValue) {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.q7, f6Var2), PorterDuff.Mode.SRC_IN));
                                    if (!z4) {
                                        int[] iArr2 = iArr;
                                        int i10 = -iArr2[0];
                                        iArr2[0] = i10;
                                        AndroidUtilities.shakeViewSpring(imageView2, i10);
                                    }
                                } else {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.G6, f6Var2), PorterDuff.Mode.SRC_IN));
                                }
                                if (bitmap != null) {
                                    imageView2.setImageBitmap(bitmap);
                                }
                                dVar.setEnabled(!bool.booleanValue());
                                horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                                zArr[0] = bool.booleanValue();
                            }
                        }
                    });
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
        }
    }

    public /* synthetic */ k0(TLObject tLObject, p2.n nVar, p2.h hVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.c = tLObject;
        this.h = nVar;
        this.e = hVar;
        this.n = callback2;
        this.f = activity;
        this.r = inputStorePaymentPurpose;
        this.d = list;
        this.b = tL_error;
    }

    public /* synthetic */ k0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = 5;
        this.h = userInfoActivity;
        this.b = tL_error;
        this.c = tLObject;
        this.d = tL_birthday;
        this.e = userFull;
        this.n = tLObject2;
        this.f = iArr;
        this.r = arrayList;
    }
}
