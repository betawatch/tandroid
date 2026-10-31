package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class gc implements Runnable {
    public final File a;
    public final int b;
    public final fc c;
    public final /* synthetic */ hc d;

    public gc(hc hcVar, int i10, File file, fc fcVar) {
        this.d = hcVar;
        this.b = i10;
        this.a = file;
        this.c = fcVar;
    }

    public final void a() {
        this.d.s.c(new t6(18, this, b8.r(null, this.c.a)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        Bitmap createScaledBitmap;
        File file = this.a;
        fc fcVar = this.c;
        try {
            String str = "q_" + fcVar.a.dc_id + "_" + fcVar.a.id;
            File file2 = new File(b8.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (fcVar.e) {
                    Point point = i0.q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = i0.q;
                    min = Math.min(zs.K2, Math.min(point2.x, point2.y) / 4);
                }
                int i10 = this.b;
                Bitmap bitmap = null;
                if (i10 == 0) {
                    String file3 = file.toString();
                    float f7 = min;
                    bitmap = hc.K(file3, null, f7, f7, false);
                } else {
                    int i11 = 2;
                    if (i10 == 2) {
                        String file4 = file.toString();
                        if (!fcVar.e) {
                            i11 = 1;
                        }
                        bitmap = qz.r(i11, file4);
                    } else if (i10 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!fcVar.e) {
                                i11 = 1;
                            }
                            bitmap = qz.r(i11, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f10 = min;
                            bitmap = hc.K(lowerCase, null, f10, f10, false);
                        }
                    }
                }
                if (bitmap == null) {
                    a();
                    return;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != 0 && height != 0) {
                    float f11 = width;
                    float f12 = min;
                    float f13 = height;
                    float min2 = Math.min(f11 / f12, f13 / f12);
                    if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f11 / min2), (int) (f13 / min2), true)) != bitmap) {
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, fcVar.e ? 83 : 60, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    i0.g3(new cn(this, str, new ArrayList(fcVar.c), new BitmapDrawable(bitmap), new ArrayList(fcVar.d), 4));
                    return;
                }
                a();
                return;
            }
            a();
        } catch (Throwable th2) {
            f8.g(th2, true);
            a();
        }
    }
}
