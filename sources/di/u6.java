package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
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
                org.telegram.messenger.g0.h3(new g7(tLObject, (f5.m) this.b, (f5.f) this.c, (org.telegram.ui.Wallet.t1) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.g, this.e, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new g7(tLObject, (f5.m) this.b, (f5.f) this.c, (bi.v5) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.g, this.e, tL_error, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new g7((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.g, (ArrayList) this.e));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new g7(tL_error, (z10) this.b, tLObject, this.e, (f5.f) this.c, (z10) this.f, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 9));
                break;
            default:
                org.telegram.messenger.g0.h3(new g7(tL_error, (z10) this.b, tLObject, this.e, (f5.f) this.c, (z10) this.f, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 10));
                break;
        }
    }

    public /* synthetic */ u6(z10 z10Var, List list, f5.f fVar, z10 z10Var2, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.a = i7;
        this.b = z10Var;
        this.e = list;
        this.c = fVar;
        this.f = z10Var2;
        this.d = e2Var;
        this.g = inputStorePaymentPurpose;
    }
}
