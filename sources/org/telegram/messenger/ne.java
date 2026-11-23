package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class ne extends File {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne(int i7, File file, String str) {
        super(file, str);
        this.a = i7;
    }

    @Override // java.io.File
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (s2.a) {
                    a8.d("delete voice file (trimmed)");
                }
                break;
            case 1:
                if (s2.a) {
                    a8.d("delete voice file (from resume)");
                }
                break;
            default:
                if (s2.a) {
                    a8.d("delete camera file");
                }
                break;
        }
        return super.delete();
    }
}
