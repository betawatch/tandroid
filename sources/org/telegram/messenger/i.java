package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements cj0, e5.g {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // e5.g
    public void a(e5.f fVar) {
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
        int i3 = fVar.a;
        sb2.append(i3 == 0 ? "OK" : Integer.valueOf(i3));
        sb2.append(" ");
        k2.p1.w(fVar.c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public int run() {
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.a;
        String str = (String) this.b;
        tj0 tj0Var = (tj0) this.c;
        int i3 = -1;
        try {
            Field declaredField = d2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            u4.b0 b0Var = (u4.b0) tj0Var.getLayoutManager();
            i3 = declaredField.getInt(d2Var);
            b0Var.h1(i3, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i3;
        } catch (Throwable unused) {
            return i3;
        }
    }
}
