package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
