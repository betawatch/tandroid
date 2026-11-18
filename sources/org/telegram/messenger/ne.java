package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
