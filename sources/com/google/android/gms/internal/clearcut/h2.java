package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public final class h2 extends ContentObserver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Handler handler, int i10) {
        super(handler);
        this.a = i10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.a) {
            case 0:
                g2.e.set(true);
                break;
            default:
                d1.f.A(d1.f.g());
                break;
        }
    }
}
