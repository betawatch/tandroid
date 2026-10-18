package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.Wallet.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o(Context context, int i10, int i11, int i12) {
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
                    s5.g(this.b, this.c, this.d);
                    z5.e();
                    break;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                }
        }
    }
}
