package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class qe extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (r2.a) {
            a8.d("delete voice file");
        }
        return super.delete();
    }
}
