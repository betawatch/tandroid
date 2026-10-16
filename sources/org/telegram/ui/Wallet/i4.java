package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class i4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ o3 a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ j2[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public i4(o3 o3Var, TL_wallet.walletTransaction[] wallettransactionArr, h4 h4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.a = o3Var;
        this.b = wallettransactionArr;
        this.c = h4Var;
        this.d = i10;
        this.e = callback2;
        this.f = j2VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.run(this.b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f[0].setOnDismissListener(new l(callback2, this.h, this.n, 11));
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
