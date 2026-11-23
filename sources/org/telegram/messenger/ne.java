package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ne extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (s2.a) {
            a8.d("delete voice file (joined)");
        }
        return super.delete();
    }
}
