package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements dk0, c5.h {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // c5.h
    public void a(c5.g gVar) {
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
        int i10 = gVar.a;
        sb2.append(i10 == 0 ? "OK" : Integer.valueOf(i10));
        sb2.append(" ");
        a1.g.z(gVar.c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public int run() {
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.a;
        String str = (String) this.b;
        tk0 tk0Var = (tk0) this.c;
        int i10 = -1;
        try {
            Field declaredField = k2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            s4.a0 a0Var = (s4.a0) tk0Var.getLayoutManager();
            i10 = declaredField.getInt(k2Var);
            a0Var.h1(i10, i0.L(60.0f));
            declaredField.setAccessible(false);
            return i10;
        } catch (Throwable unused) {
            return i10;
        }
    }
}
