package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class je extends File {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(int i3, File file, String str) {
        super(file, str);
        this.a = i3;
    }

    @Override // java.io.File
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (r2.a) {
                    a8.d("delete voice file (trimmed)");
                }
                break;
            case 1:
                if (r2.a) {
                    a8.d("delete voice file (from resume)");
                }
                break;
            default:
                if (r2.a) {
                    a8.d("delete camera file");
                }
                break;
        }
        return super.delete();
    }
}
