package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.q5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                    q5.g(this.b, this.c, this.d);
                    break;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                }
        }
    }
}
