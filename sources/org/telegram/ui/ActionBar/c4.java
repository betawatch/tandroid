package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ File c;

    public /* synthetic */ c4(Bitmap bitmap, File file, int i10) {
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
                    FileLog.e(e);
                    return;
                }
            case 1:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
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
                        FileLog.e(e10);
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            return;
                        }
                    }
                    bitmap2.recycle();
                    return;
                } catch (Throwable th2) {
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    throw th2;
                }
            case 3:
                Bitmap bitmap3 = this.b;
                try {
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.c));
                    } finally {
                        AndroidUtilities.recycleBitmap(bitmap3);
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                return;
            case 4:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            default:
                try {
                    this.b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
        }
    }

    public /* synthetic */ c4(File file, Bitmap bitmap) {
        this.a = 0;
        this.c = file;
        this.b = bitmap;
    }
}
