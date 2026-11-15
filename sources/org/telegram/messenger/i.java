package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements dj0, f5.h {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // f5.h
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
        org.telegram.ui.Cells.y0.t(fVar.c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public int run() {
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.a;
        String str = (String) this.b;
        uj0 uj0Var = (uj0) this.c;
        int i7 = -1;
        try {
            Field declaredField = e2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            v4.b0 b0Var = (v4.b0) uj0Var.getLayoutManager();
            i7 = declaredField.getInt(e2Var);
            b0Var.h1(i7, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return i7;
        }
    }
}
