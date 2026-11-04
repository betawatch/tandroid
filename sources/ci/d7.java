package ci;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i3) {
        this.a = i3;
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
                org.telegram.messenger.g0.h3(new o7(tLObject, (e5.l) this.b, (e5.f) this.c, (org.telegram.ui.Wallet.s1) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.g, this.e, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o7(tLObject, (e5.l) this.b, (e5.f) this.c, (ai.d6) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.g, this.e, tL_error, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new o7((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.g, (ArrayList) this.e));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new o7(tL_error, (u10) this.b, tLObject, this.e, (e5.f) this.c, (u10) this.f, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 9));
                break;
            default:
                org.telegram.messenger.g0.h3(new o7(tL_error, (u10) this.b, tLObject, this.e, (e5.f) this.c, (u10) this.f, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 10));
                break;
        }
    }

    public /* synthetic */ d7(u10 u10Var, List list, e5.f fVar, u10 u10Var2, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i3) {
        this.a = i3;
        this.b = u10Var;
        this.e = list;
        this.c = fVar;
        this.f = u10Var2;
        this.d = d2Var;
        this.g = inputStorePaymentPurpose;
    }
}
