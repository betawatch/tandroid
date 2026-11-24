// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class el5 implements Runnable {
    public final File a;
    public final byte b;
    public final dl5 c;
    public final /* synthetic */ fl5 d;

    /* JADX WARN: Multi-variable type inference failed */
    public el5(fl5 fl5Var, int i, File file, dl5 dl5Var) {
        this.d = fl5Var;
        this.b = i;
        this.a = file;
        this.c = dl5Var;
    }

    public final void a() {
        this.d.s.c(new hb5(this, ba4.r(null, this.c.a), (byte) 11));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        Bitmap createScaledBitmap;
        File file = this.a;
        dl5 dl5Var = this.c;
        try {
            String str = "q_" + dl5Var.a.dc_id + "_" + dl5Var.a.id;
            File file2 = new File(ba4.z(4), str.concat(".jpg"));
            try {
                if (file2.exists() || !file.exists()) {
                    a();
                    return;
                }
                if (dl5Var.e) {
                    Point point = gl.q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = gl.q;
                    min = Math.min(kk7.J2, Math.min(point2.x, point2.y) / 4);
                }
                byte b = this.b;
                Bitmap bitmap = null;
                if (b == 0) {
                    float f = min;
                    bitmap = fl5.G(file.toString(), null, f, f, false);
                } else {
                    if (b == 2) {
                        bitmap = z3a.q(dl5Var.e ? 2 : 1, file.toString());
                    } else if (b == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            bitmap = z3a.q(dl5Var.e ? 2 : 1, file.toString());
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f2 = min;
                            bitmap = fl5.G(lowerCase, null, f2, f2, false);
                        }
                    }
                }
                if (bitmap == null) {
                    a();
                    return;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width == 0 || height == 0) {
                    a();
                    return;
                }
                float f3 = width;
                float f4 = min;
                float f5 = height;
                float min2 = Math.min(f3 / f4, f5 / f4);
                if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f3 / min2), (int) (f5 / min2), true)) != bitmap) {
                    bitmap.recycle();
                    bitmap = createScaledBitmap;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, dl5Var.e ? 83 : 60, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                gl.c3(new vz4((Object) this, str, (Serializable) new ArrayList(dl5Var.c), (Object) new BitmapDrawable(bitmap), (Object) new ArrayList(dl5Var.d), (byte) 8));
            } catch (Throwable th) {
                th = th;
                fa4.g(th, true);
                a();
            }
        } catch (Throwable th2) {
            th = th2;
            fa4.g(th, true);
            a();
        }
    }
}
