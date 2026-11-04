package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.hc;

/* loaded from: classes.dex */
public final class e2 extends ContentObserver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(Handler handler, int i3) {
        super(handler);
        this.a = i3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.a) {
            case 0:
                d2.e.set(true);
                break;
            case 1:
                super.onChange(z10);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                hc hcVar = new hc(6);
                MediaController.Z1 = hcVar;
                org.telegram.messenger.g0.i3(hcVar, 2000L);
                break;
            case 2:
                super.onChange(z10);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.r(runnable2);
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 17);
                MediaController.Z1 = aVar;
                org.telegram.messenger.g0.i3(aVar, 2000L);
                break;
            default:
                d1.f.A(d1.f.g());
                break;
        }
    }
}
