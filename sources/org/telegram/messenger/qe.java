package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
