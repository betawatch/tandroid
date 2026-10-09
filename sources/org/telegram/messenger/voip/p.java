package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.f5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                } catch (RuntimeException e7) {
                    FileLog.e(e7);
                }
        }
    }
}
