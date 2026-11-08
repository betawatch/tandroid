package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class y0 extends t2 {
    public final long e;

    public y0(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
