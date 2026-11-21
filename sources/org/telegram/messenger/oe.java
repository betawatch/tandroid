package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
