package org.telegram.messenger;

import android.database.ContentObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g5 extends ContentObserver {
    public final ag.f3 a;
    public final /* synthetic */ i5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(i5 i5Var) {
        super(null);
        this.b = i5Var;
        this.a = new ag.f3(14);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.b.f) {
            try {
                if (this.b.d) {
                    return;
                }
                Utilities.e.a(this.a);
                Utilities.e.d(this.a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
