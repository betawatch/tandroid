package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
