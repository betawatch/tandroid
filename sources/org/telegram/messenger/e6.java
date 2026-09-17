package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ e6(Utilities.Callback callback, Uri uri, int i10) {
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
