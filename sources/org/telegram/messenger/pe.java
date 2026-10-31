package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class pe extends File {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe(int i10, File file, String str) {
        super(file, str);
        this.a = i10;
    }

    @Override // java.io.File
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (v2.a) {
                    f8.d("delete voice file (trimmed)");
                }
                break;
            case 1:
                if (v2.a) {
                    f8.d("delete voice file (from resume)");
                }
                break;
            default:
                if (v2.a) {
                    f8.d("delete camera file");
                }
                break;
        }
        return super.delete();
    }
}
