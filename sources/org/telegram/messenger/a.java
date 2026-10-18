package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AndroidUtilities.runOnUIThread(runnable);
    }
}
