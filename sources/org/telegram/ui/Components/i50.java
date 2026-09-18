package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class i50 extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("delete camera file");
        }
        return super.delete();
    }
}
