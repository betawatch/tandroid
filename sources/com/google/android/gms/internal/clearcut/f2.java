package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.pd;

/* loaded from: classes.dex */
public final class f2 extends ContentObserver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(Handler handler, int i7) {
        super(handler);
        this.a = i7;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        switch (this.a) {
            case 0:
                e2.e.set(true);
                break;
            case 1:
                super.onChange(z9);
                Runnable runnable = MediaController.Y1;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                pd pdVar = new pd(2);
                MediaController.Y1 = pdVar;
                org.telegram.messenger.g0.i3(pdVar, 2000L);
                break;
            case 2:
                super.onChange(z9);
                Runnable runnable2 = MediaController.Y1;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.r(runnable2);
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 18);
                MediaController.Y1 = aVar;
                org.telegram.messenger.g0.i3(aVar, 2000L);
                break;
            default:
                d1.f.A(d1.f.g());
                break;
        }
    }
}
