package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.f5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ p(Context context, int i10, int i11, int i12) {
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
                    f5.f(this.b, this.c, this.d);
                    break;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                }
        }
    }
}
