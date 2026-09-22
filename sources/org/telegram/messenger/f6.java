package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ f6(Utilities.Callback callback, Uri uri, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c);
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }
}
