package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class fc implements Runnable {
    public final File a;
    public final int b;
    public final ec c;
    public final /* synthetic */ gc d;

    public fc(gc gcVar, int i7, File file, ec ecVar) {
        this.d = gcVar;
        this.b = i7;
        this.a = file;
        this.c = ecVar;
    }

    public final void a() {
        this.d.s.c(new y4(20, this, w7.r(null, this.c.a)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        Bitmap createScaledBitmap;
        File file = this.a;
        ec ecVar = this.c;
        try {
            String str = "q_" + ecVar.a.dc_id + "_" + ecVar.a.id;
            File file2 = new File(w7.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (ecVar.e) {
                    Point point = g0.q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = g0.q;
                    min = Math.min(qs.K2, Math.min(point2.x, point2.y) / 4);
                }
                int i7 = this.b;
                Bitmap bitmap = null;
                if (i7 == 0) {
                    String file3 = file.toString();
                    float f10 = min;
                    bitmap = gc.K(file3, null, f10, f10, false);
                } else {
                    int i10 = 2;
                    if (i7 == 2) {
                        String file4 = file.toString();
                        if (!ecVar.e) {
                            i10 = 1;
                        }
                        bitmap = gz.r(i10, file4);
                    } else if (i7 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!ecVar.e) {
                                i10 = 1;
                            }
                            bitmap = gz.r(i10, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f11 = min;
                            bitmap = gc.K(lowerCase, null, f11, f11, false);
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
                    float f12 = width;
                    float f13 = min;
                    float f14 = height;
                    float min2 = Math.min(f12 / f13, f14 / f13);
                    if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f12 / min2), (int) (f14 / min2), true)) != bitmap) {
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, ecVar.e ? 83 : 60, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    g0.h3(new mn(this, str, new ArrayList(ecVar.c), new BitmapDrawable(bitmap), new ArrayList(ecVar.d), 4));
                    return;
                }
                a();
                return;
            }
            a();
        } catch (Throwable th2) {
            a8.g(th2, true);
            a();
        }
    }
}
