package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class pe extends File {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe(int i7, File file, String str) {
        super(file, str);
        this.a = i7;
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
