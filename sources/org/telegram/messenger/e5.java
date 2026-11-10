package org.telegram.messenger;

import android.database.ContentObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e5 extends ContentObserver {
    public final ai.m0 a;
    public final /* synthetic */ g5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(g5 g5Var) {
        super(null);
        this.b = g5Var;
        this.a = new ai.m0(25);
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
