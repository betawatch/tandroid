package di;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ File c;

    public /* synthetic */ pa(Bitmap bitmap, File file, int i10) {
        this.a = i10;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (bitmap == null || bitmap.isRecycled()) {
                            return;
                        }
                    }
                    bitmap.recycle();
                    return;
                } catch (Throwable th2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th2;
                }
            case 2:
                Bitmap bitmap2 = this.b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 4:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
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
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
        }
    }

    public /* synthetic */ pa(File file, Bitmap bitmap) {
        this.a = 5;
        this.c = file;
        this.b = bitmap;
    }
}
