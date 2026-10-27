package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ di.s a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ j2[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public r4(di.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.a = sVar;
        this.b = wallettransactionArr;
        this.c = q4Var;
        this.d = i10;
        this.e = callback2;
        this.f = j2VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean[], java.io.Serializable] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.run(this.b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addWeakObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addWeakObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.n, 12));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
