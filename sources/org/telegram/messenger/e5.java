package org.telegram.messenger;

import android.database.ContentObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e5 extends ContentObserver {
    public final ai.o a;
    public final /* synthetic */ g5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(g5 g5Var) {
        super(null);
        this.b = g5Var;
        this.a = new ai.o(29);
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
