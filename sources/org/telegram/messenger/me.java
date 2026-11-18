package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
