package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ o80(fh.j6 j6Var, int i9) {
        this.a = i9;
        this.b = j6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        Runnable runnable = this.b;
        String str = (String) obj;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
