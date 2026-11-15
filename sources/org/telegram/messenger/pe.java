package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class pe extends File {
    @Override // java.io.File
    public final boolean delete() {
        if (r2.a) {
            a8.d("delete voice file");
        }
        return super.delete();
    }
}
