package org.telegram.messenger;

import android.database.ContentObserver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class g5 extends ContentObserver {
    public final j2 a;
    public final /* synthetic */ i5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(i5 i5Var) {
        super(null);
        this.b = i5Var;
        this.a = new j2(1);
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
