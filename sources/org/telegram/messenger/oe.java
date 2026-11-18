package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class oe extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (s2.a) {
            a8.d("delete voice file");
        }
        return super.delete();
    }
}
