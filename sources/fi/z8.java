package fi;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ File c;

    public /* synthetic */ z8(Bitmap bitmap, File file, int i7) {
        this.a = i7;
        this.b = bitmap;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                Bitmap bitmap = this.b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                        if (bitmap.isRecycled()) {
                            return;
                        }
                    } catch (Throwable th2) {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    if (bitmap.isRecycled()) {
                        return;
                    }
                }
                bitmap.recycle();
                return;
            case 2:
                Bitmap bitmap2 = this.b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    return;
                } finally {
                    org.telegram.messenger.g0.z2(bitmap2);
                }
            case 3:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 4:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                    return;
                }
            default:
                File file = this.c;
                Bitmap bitmap3 = this.b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                    return;
                }
        }
    }

    public /* synthetic */ z8(File file, Bitmap bitmap) {
        this.a = 5;
        this.c = file;
        this.b = bitmap;
    }
}
