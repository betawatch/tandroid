// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class en5 implements Runnable {
    public final File a;
    public final byte b;
    public final dn5 c;
    public final /* synthetic */ fn5 d;

    /* JADX WARN: Multi-variable type inference failed */
    public en5(fn5 fn5Var, int i, File file, dn5 dn5Var) {
        this.d = fn5Var;
        this.b = i;
        this.a = file;
        this.c = dn5Var;
    }

    public final void a() {
        this.d.s.c(new fd5(this, bc4.r(null, this.c.a), (byte) 12));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        Bitmap createScaledBitmap;
        File file = this.a;
        dn5 dn5Var = this.c;
        try {
            String str = "q_" + dn5Var.a.dc_id + "_" + dn5Var.a.id;
            File file2 = new File(bc4.z(4), str.concat(".jpg"));
            try {
                if (file2.exists() || !file.exists()) {
                    a();
                    return;
                }
                if (dn5Var.e) {
                    Point point = gm.q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = gm.q;
                    min = Math.min(nm7.J2, Math.min(point2.x, point2.y) / 4);
                }
                byte b = this.b;
                Bitmap bitmap = null;
                if (b == 0) {
                    float f = min;
                    bitmap = fn5.G(file.toString(), null, f, f, false);
                } else {
                    if (b == 2) {
                        bitmap = a6a.q(dn5Var.e ? 2 : 1, file.toString());
                    } else if (b == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            bitmap = a6a.q(dn5Var.e ? 2 : 1, file.toString());
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f2 = min;
                            bitmap = fn5.G(lowerCase, null, f2, f2, false);
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
                bitmap.compress(Bitmap.CompressFormat.JPEG, dn5Var.e ? 83 : 60, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                gm.c3(new v15((Object) this, str, (Serializable) new ArrayList(dn5Var.c), (Object) new BitmapDrawable(bitmap), (Object) new ArrayList(dn5Var.d), (byte) 8));
            } catch (Throwable th) {
                th = th;
                fc4.g(th, true);
                a();
            }
        } catch (Throwable th2) {
            th = th2;
            fc4.g(th, true);
            a();
        }
    }
}
