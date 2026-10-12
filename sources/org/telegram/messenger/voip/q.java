package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.e5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ q(Context context, int i10, int i11, int i12) {
        this.a = i12;
        this.b = context;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VoIPGroupNotification.decline(this.b, this.c, this.d);
                break;
            default:
                try {
                    e5.f(this.b, this.c, this.d);
                    break;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                }
        }
    }
}
