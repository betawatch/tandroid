package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
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
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.b, (f5.f) this.c, (org.telegram.ui.Wallet.e0) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.g, this.e, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.b, (f5.f) this.c, (bi.b8) this.f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.g, this.e, tL_error, 1));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new j7((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.g, (ArrayList) this.e));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new j7(tL_error, (x10) this.b, tLObject, this.e, (f5.f) this.c, (x10) this.f, (org.telegram.ui.ActionBar.h2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 9));
                break;
            default:
                org.telegram.messenger.g0.g3(new j7(tL_error, (x10) this.b, tLObject, this.e, (f5.f) this.c, (x10) this.f, (org.telegram.ui.ActionBar.h2) this.d, (TLRPC.InputStorePaymentPurpose) this.g, 10));
                break;
        }
    }

    public /* synthetic */ x6(x10 x10Var, List list, f5.f fVar, x10 x10Var2, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.a = i7;
        this.b = x10Var;
        this.e = list;
        this.c = fVar;
        this.f = x10Var2;
        this.d = h2Var;
        this.g = inputStorePaymentPurpose;
    }
}
