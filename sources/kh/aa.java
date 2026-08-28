package kh;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ File c;

    public /* synthetic */ aa(Bitmap bitmap, File file, int i9) {
        this.a = i9;
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
                    FileLog.e(e10);
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
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (bitmap == null || bitmap.isRecycled()) {
                            return;
                        }
                    }
                    bitmap.recycle();
                    return;
                } catch (Throwable th) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            case 2:
                Bitmap bitmap2 = this.b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 4:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
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
                    FileLog.e(e15);
                    return;
                }
        }
    }

    public /* synthetic */ aa(File file, Bitmap bitmap) {
        this.a = 5;
        this.c = file;
        this.b = bitmap;
    }
}
