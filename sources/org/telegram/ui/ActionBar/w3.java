package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ File c;

    public /* synthetic */ w3(Bitmap bitmap, File file, int i10) {
        this.a = i10;
        this.b = bitmap;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                File file = this.c;
                Bitmap bitmap = this.b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 2:
                Bitmap bitmap2 = this.b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                    } catch (Exception e10) {
                        f8.g(e10, true);
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                    }
                    bitmap2.recycle();
                    return;
                } catch (Throwable th2) {
                    if (!bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    throw th2;
                }
            case 3:
                Bitmap bitmap3 = this.b;
                try {
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                    return;
                } finally {
                    org.telegram.messenger.i0.z2(bitmap3);
                }
            case 4:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
            default:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e13) {
                    f8.g(e13, true);
                    return;
                }
        }
    }

    public /* synthetic */ w3(File file, Bitmap bitmap) {
        this.a = 0;
        this.c = file;
        this.b = bitmap;
    }
}
