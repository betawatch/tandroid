package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ gb0(int i9) {
        this.a = i9;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
