package ji;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import di.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.d80;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
        this.r = obj8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final String[] strArr = (String[]) this.b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                final di.d dVar = (di.d) this.d;
                final boolean[] zArr = (boolean[]) this.e;
                ii.a aVar = (ii.a) this.f;
                final ImageView imageView = (ImageView) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.n;
                final int[] iArr = (int[]) this.r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    final boolean z10 = zArr[0];
                    final String str = strArr[0];
                    aVar.run(str, new Utilities.Callback2() { // from class: ji.c
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            Bitmap bitmap = (Bitmap) obj;
                            Boolean bool = (Boolean) obj2;
                            if (TextUtils.equals(str, strArr[0])) {
                                boolean booleanValue = bool.booleanValue();
                                ImageView imageView2 = imageView;
                                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                if (booleanValue) {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, f6Var2), PorterDuff.Mode.SRC_IN));
                                    if (!z10) {
                                        int[] iArr2 = iArr;
                                        int i10 = -iArr2[0];
                                        iArr2[0] = i10;
                                        AndroidUtilities.shakeViewSpring(imageView2, i10);
                                    }
                                } else {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), PorterDuff.Mode.SRC_IN));
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
            case 1:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$76((a0.i) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n, (HashMap) this.r);
                break;
            case 2:
                UserInfoActivity.Y((UserInfoActivity) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f, (TLObject) this.h, (int[]) this.r, (ArrayList) this.n);
                break;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                ug.w wVar = (ug.w) this.c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.h hVar = (c5.h) this.f;
                ug.w wVar2 = (ug.w) this.h;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error == null) {
                    if (tLObject != null) {
                        BillingController.getInstance().addResultListener(((c5.o) list.get(0)).c, new di.l5(3, hVar, wVar2));
                        BillingController.getInstance().setOnCanceled(new ug.s(wVar, 0));
                        BillingController billingController = BillingController.getInstance();
                        Activity parentActivity = n2Var.getParentActivity();
                        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        pf.b bVar = new pf.b(7, false);
                        bVar.h0((c5.o) list.get(0));
                        billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.w()));
                        break;
                    }
                } else {
                    wVar.run(tL_error);
                    break;
                }
                break;
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.h hVar2 = (c5.h) this.f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).c, new di.l5(2, hVar2, callback2));
                        BillingController.getInstance().setOnCanceled(new ab(1, callback));
                        BillingController billingController2 = BillingController.getInstance();
                        Activity parentActivity2 = n2Var2.getParentActivity();
                        AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        pf.b bVar2 = new pf.b(7, false);
                        bVar2.h0((c5.o) list2.get(0));
                        billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.w()));
                        break;
                    }
                } else {
                    callback.run(tL_error2);
                    break;
                }
                break;
            case 5:
                TLObject tLObject3 = (TLObject) this.b;
                c5.o oVar = (c5.o) this.c;
                c5.h hVar3 = (c5.h) this.d;
                bi.f0 f0Var = (bi.f0) this.e;
                Activity activity = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.r;
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        f0Var.run(Boolean.FALSE, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                        break;
                    } else {
                        f0Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar.c, new di.l5(5, hVar3, f0Var));
                    BillingController.getInstance().setOnCanceled(new zh.i4(f0Var, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar3 = new pf.b(7, false);
                    bVar3.h0((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.w()));
                    break;
                }
            default:
                TLObject tLObject4 = (TLObject) this.b;
                c5.o oVar2 = (c5.o) this.c;
                c5.h hVar4 = (c5.h) this.d;
                d80 d80Var = (d80) this.e;
                Activity activity2 = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.r;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                        d80Var.run(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        d80Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar2.c, new di.l5(4, hVar4, d80Var));
                    BillingController.getInstance().setOnCanceled(new zh.k4(d80Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar4 = new pf.b(7, false);
                    bVar4.h0((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.w()));
                    break;
                }
        }
    }

    public /* synthetic */ k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = 2;
        this.b = userInfoActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = tL_birthday;
        this.f = userFull;
        this.h = tLObject2;
        this.r = iArr;
        this.n = arrayList;
    }
}
