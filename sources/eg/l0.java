package eg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import ih.i5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jh.w5;
import jh.y5;
import nh.t4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.vc;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
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
                u0 u0Var = (u0) this.h;
                TLObject tLObject = (TLObject) this.c;
                List list = (List) this.d;
                p2.g gVar = (p2.g) this.e;
                u0 u0Var2 = (u0) this.n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error == null) {
                    if (tLObject != null) {
                        BillingController.getInstance().addResultListener(((p2.l) list.get(0)).c, new n0(1, gVar, u0Var2));
                        BillingController.getInstance().setOnCanceled(new p0(u0Var, 0));
                        BillingController billingController = BillingController.getInstance();
                        Activity parentActivity = o2Var.getParentActivity();
                        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        oc.i iVar = new oc.i(16);
                        iVar.i2((p2.l) list.get(0));
                        billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(iVar.M1()));
                        break;
                    }
                } else {
                    u0Var.run(tL_error);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                TLObject tLObject2 = (TLObject) this.c;
                List list2 = (List) this.d;
                p2.g gVar2 = (p2.g) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.n;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        BillingController.getInstance().addResultListener(((p2.l) list2.get(0)).c, new n0(0, gVar2, callback2));
                        BillingController.getInstance().setOnCanceled(new o0(0, callback));
                        BillingController billingController2 = BillingController.getInstance();
                        Activity parentActivity2 = o2Var2.getParentActivity();
                        AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        oc.i iVar2 = new oc.i(16);
                        iVar2.i2((p2.l) list2.get(0));
                        billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(iVar2.M1()));
                        break;
                    }
                } else {
                    callback.run(tL_error2);
                    break;
                }
                break;
            case 2:
                TLObject tLObject3 = (TLObject) this.c;
                p2.l lVar = (p2.l) this.h;
                p2.g gVar3 = (p2.g) this.e;
                bh.v vVar = (bh.v) this.n;
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
                    BillingController.getInstance().addResultListener(lVar.c, new n0(3, gVar3, vVar));
                    BillingController.getInstance().setOnCanceled(new w5(vVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    oc.i iVar3 = new oc.i(16);
                    iVar3.i2((p2.l) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(iVar3.M1()));
                    break;
                }
            case 3:
                TLObject tLObject4 = (TLObject) this.c;
                p2.l lVar2 = (p2.l) this.h;
                p2.g gVar4 = (p2.g) this.e;
                i5 i5Var = (i5) this.n;
                Activity activity2 = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list4 = (List) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                        i5Var.run(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        i5Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(lVar2.c, new n0(2, gVar4, i5Var));
                    BillingController.getInstance().setOnCanceled(new y5(i5Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    oc.i iVar4 = new oc.i(16);
                    iVar4.i2((p2.l) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(iVar4.M1()));
                    break;
                }
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.b, (vc[]) this.h, (String) this.c, (String) this.d, (String) this.e, (String) this.n, (String) this.f, (Activity) this.r);
                break;
            case 5:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$76((a0.h) this.h, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.n, (ArrayList) this.f, (HashMap) this.r);
                break;
            case 6:
                UserInfoActivity.Y((UserInfoActivity) this.h, (TLRPC.TL_error) this.b, (TLObject) this.c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, (TLObject) this.n, (int[]) this.f, (ArrayList) this.r);
                break;
            default:
                final String[] strArr = (String[]) this.b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.h;
                final nh.d dVar = (nh.d) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                t4 t4Var = (t4) this.e;
                final ImageView imageView = (ImageView) this.n;
                final c6 c6Var = (c6) this.f;
                final int[] iArr = (int[]) this.r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    final boolean z10 = zArr[0];
                    final String str = strArr[0];
                    t4Var.run(str, new Utilities.Callback2() { // from class: th.c
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            Bitmap bitmap = (Bitmap) obj;
                            Boolean bool = (Boolean) obj2;
                            if (TextUtils.equals(str, strArr[0])) {
                                boolean booleanValue = bool.booleanValue();
                                ImageView imageView2 = imageView;
                                c6 c6Var2 = c6Var;
                                if (booleanValue) {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.q7, c6Var2), PorterDuff.Mode.SRC_IN));
                                    if (!z10) {
                                        int[] iArr2 = iArr;
                                        int i10 = -iArr2[0];
                                        iArr2[0] = i10;
                                        AndroidUtilities.shakeViewSpring(imageView2, i10);
                                    }
                                } else {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.G6, c6Var2), PorterDuff.Mode.SRC_IN));
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

    public /* synthetic */ l0(TLObject tLObject, p2.l lVar, p2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.c = tLObject;
        this.h = lVar;
        this.e = gVar;
        this.n = callback2;
        this.f = activity;
        this.r = inputStorePaymentPurpose;
        this.d = list;
        this.b = tL_error;
    }

    public /* synthetic */ l0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = 6;
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
