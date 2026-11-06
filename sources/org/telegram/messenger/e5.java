package org.telegram.messenger;

import android.database.ContentObserver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e5 extends ContentObserver {
    public final ai.m0 a;
    public final /* synthetic */ g5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(g5 g5Var) {
        super(null);
        this.b = g5Var;
        this.a = new ai.m0(23);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        super.onChange(z9);
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
