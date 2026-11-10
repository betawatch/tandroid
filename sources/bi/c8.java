package bi;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.a = i7;
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
                org.telegram.messenger.g0.h3(new n8(tLObject, (f5.l) this.b, (f5.f) this.c, (org.telegram.ui.Wallet.t1) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.g, this.e, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new n8(tLObject, (f5.l) this.b, (f5.f) this.c, (mc) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.g, this.e, tL_error, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new n8((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.g, (ArrayList) this.e));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new n8(tL_error, (c20) this.b, tLObject, this.e, (f5.f) this.c, (c20) this.f, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 9));
                break;
            default:
                org.telegram.messenger.g0.h3(new n8(tL_error, (c20) this.b, tLObject, this.e, (f5.f) this.c, (c20) this.f, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 10));
                break;
        }
    }

    public /* synthetic */ c8(c20 c20Var, List list, f5.f fVar, c20 c20Var2, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.a = i7;
        this.b = c20Var;
        this.e = list;
        this.c = fVar;
        this.f = c20Var2;
        this.d = f2Var;
        this.g = inputStorePaymentPurpose;
    }
}
