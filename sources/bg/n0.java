package bg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(tL_error, (z0) this.e, tLObject, (List) this.b, (n2.g) this.c, (z0) this.f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.g, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new p0(tL_error, (Utilities.Callback) this.e, tLObject, (List) this.b, (n2.g) this.c, (Utilities.Callback) this.f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.g, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new p0(tLObject, (n2.l) this.e, (n2.g) this.c, (Utilities.Callback2) this.f, (Activity) this.d, (TLRPC.InputStorePaymentPurpose) this.g, (List) this.b, tL_error, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new p0(tLObject, (n2.l) this.e, (n2.g) this.c, (Utilities.Callback2) this.f, (Activity) this.d, (TLRPC.InputStorePaymentPurpose) this.g, (List) this.b, tL_error, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new p0((UserInfoActivity) this.e, tL_error, (TLObject) this.b, (TL_account.TL_birthday) this.c, (TLRPC.UserFull) this.f, tLObject, (int[]) this.d, (ArrayList) this.g));
                break;
        }
    }

    public /* synthetic */ n0(n2.l lVar, n2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i9) {
        this.a = i9;
        this.e = lVar;
        this.c = gVar;
        this.f = callback2;
        this.d = activity;
        this.g = inputStorePaymentPurpose;
        this.b = list;
    }
}
