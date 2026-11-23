package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class me extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (s2.a) {
            a8.d("delete voice file (joined)");
        }
        return super.delete();
    }
}
