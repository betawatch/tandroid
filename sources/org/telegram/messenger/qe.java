package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class qe extends File {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe(int i10, File file, String str) {
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
