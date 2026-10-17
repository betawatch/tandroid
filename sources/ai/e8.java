package ai;

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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = obj4;
        this.g = obj5;
        this.e = list;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l8(tLObject, (c5.o) this.b, (c5.i) this.c, (org.telegram.ui.Wallet.s1) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.g, this.e, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new l8(tLObject, (c5.o) this.b, (c5.i) this.c, (sc) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.g, this.e, tL_error, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new l8((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.g, (ArrayList) this.e));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new l8(tL_error, (Utilities.Callback) this.b, tLObject, this.e, (c5.i) this.c, (Utilities.Callback) this.f, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l8(tL_error, (Utilities.Callback) this.b, tLObject, this.e, (c5.i) this.c, (Utilities.Callback) this.f, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 10));
                break;
        }
    }

    public /* synthetic */ e8(Utilities.Callback callback, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.a = i10;
        this.b = callback;
        this.e = list;
        this.c = iVar;
        this.f = callback2;
        this.d = n2Var;
        this.g = inputStorePaymentPurpose;
    }
}
