package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class oe extends File {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe(int i7, File file, String str) {
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
