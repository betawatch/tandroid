package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ie extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (r2.a) {
            a8.d("delete voice file (joined)");
        }
        return super.delete();
    }
}
