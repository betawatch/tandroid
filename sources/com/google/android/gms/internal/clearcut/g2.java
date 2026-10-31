package com.google.android.gms.internal.clearcut;

import ag.f3;
import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;

/* loaded from: classes.dex */
public final class g2 extends ContentObserver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Handler handler, int i10) {
        super(handler);
        this.a = i10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.a) {
            case 0:
                f2.e.set(true);
                break;
            case 1:
                super.onChange(z10);
                Runnable runnable = MediaController.X1;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                f3 f3Var = new f3(23);
                MediaController.X1 = f3Var;
                org.telegram.messenger.i0.h3(f3Var, 2000L);
                break;
            case 2:
                super.onChange(z10);
                Runnable runnable2 = MediaController.X1;
                if (runnable2 != null) {
                    org.telegram.messenger.i0.r(runnable2);
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 17);
                MediaController.X1 = aVar;
                org.telegram.messenger.i0.h3(aVar, 2000L);
                break;
            default:
                b5.d.A(b5.d.g());
                break;
        }
    }
}
