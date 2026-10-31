package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class oe extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (v2.a) {
            f8.d("delete voice file (joined)");
        }
        return super.delete();
    }
}
