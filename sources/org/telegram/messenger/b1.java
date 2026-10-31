package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b1 extends x2 {
    public final long e;

    public b1(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
