package mg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.q70;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e0(c5.m mVar, c5.g gVar, k20 k20Var, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.a = i10;
        this.e = mVar;
        this.c = gVar;
        this.f = k20Var;
        this.d = activity;
        this.g = inputStorePaymentPurpose;
        this.b = list;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new bi.n(tL_error, (o0) this.e, tLObject, (List) this.b, (c5.g) this.c, (o0) this.f, (k2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.g, 1));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new bi.n(tL_error, (r20) this.e, tLObject, (List) this.b, (c5.g) this.c, (r20) this.f, (k2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.g, 2));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new bi.n((UserInfoActivity) this.e, tL_error, (TLObject) this.b, (TL_account.TL_birthday) this.c, (TLRPC.UserFull) this.f, tLObject, (int[]) this.d, (ArrayList) this.g));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new bi.n(tLObject, (c5.m) this.e, (c5.g) this.c, (ih.s) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.g, (List) this.b, tL_error, 9));
                break;
            default:
                org.telegram.messenger.i0.g3(new bi.n(tLObject, (c5.m) this.e, (c5.g) this.c, (q70) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.g, (List) this.b, tL_error, 10));
                break;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
