package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class pe extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (v2.a) {
            f8.d("delete voice file (joined)");
        }
        return super.delete();
    }
}
