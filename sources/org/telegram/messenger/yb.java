package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class yb implements Runnable {
    public final File a;
    public final int b;
    public final xb c;
    public final /* synthetic */ zb d;

    public yb(zb zbVar, int i3, File file, xb xbVar) {
        this.d = zbVar;
        this.b = i3;
        this.a = file;
        this.c = xbVar;
    }

    public final void a() {
        this.d.s.c(new y4(20, this, w7.r(null, this.c.a)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        Bitmap createScaledBitmap;
        File file = this.a;
        xb xbVar = this.c;
        try {
            String str = "q_" + xbVar.a.dc_id + "_" + xbVar.a.id;
            File file2 = new File(w7.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (xbVar.e) {
                    Point point = g0.q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = g0.q;
                    min = Math.min(hs.K2, Math.min(point2.x, point2.y) / 4);
                }
                int i3 = this.b;
                Bitmap bitmap = null;
                if (i3 == 0) {
                    String file3 = file.toString();
                    float f10 = min;
                    bitmap = zb.K(file3, null, f10, f10, false);
                } else {
                    int i10 = 2;
                    if (i3 == 2) {
                        String file4 = file.toString();
                        if (!xbVar.e) {
                            i10 = 1;
                        }
                        bitmap = yy.r(i10, file4);
                    } else if (i3 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!xbVar.e) {
                                i10 = 1;
                            }
                            bitmap = yy.r(i10, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f11 = min;
                            bitmap = zb.K(lowerCase, null, f11, f11, false);
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
                    bitmap.compress(Bitmap.CompressFormat.JPEG, xbVar.e ? 83 : 60, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    g0.h3(new cn(this, str, new ArrayList(xbVar.c), new BitmapDrawable(bitmap), new ArrayList(xbVar.d), 4));
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
