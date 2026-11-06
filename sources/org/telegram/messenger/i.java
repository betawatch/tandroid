package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements yi0, f5.g {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // f5.g
    public void a(f5.f fVar) {
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = (TLRPC.InputStorePaymentPurpose) this.a;
        Purchase purchase = (Purchase) this.b;
        Runnable runnable = (Runnable) this.c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append(inputStorePaymentPurpose);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i7 = fVar.a;
        sb2.append(i7 == 0 ? "OK" : Integer.valueOf(i7));
        sb2.append(" ");
        org.telegram.ui.Cells.f1.u(fVar.c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.a;
        String str = (String) this.b;
        pj0 pj0Var = (pj0) this.c;
        int i7 = -1;
        try {
            Field declaredField = f2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            v4.b0 b0Var = (v4.b0) pj0Var.getLayoutManager();
            i7 = declaredField.getInt(f2Var);
            b0Var.h1(i7, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return i7;
        }
    }
}
