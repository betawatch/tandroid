package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class ne extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (r2.a) {
            a8.d("delete voice file");
        }
        return super.delete();
    }
}
