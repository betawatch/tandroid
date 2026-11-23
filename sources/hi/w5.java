package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ w5(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        u8.n nVar;
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                if (z5Var.a.get() != null && z5Var.f != null && !z5Var.b.get()) {
                    TextureView textureView = z5Var.f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f10 = width;
                            float f11 = height;
                            float min = Math.min(720.0f / f10, 720.0f / f11);
                            width = (int) (f10 * min);
                            height = (int) (f11 * min);
                        }
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = z5Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != z5Var.g.getHeight()) {
                            z5Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(z5Var.g);
                        Bitmap bitmap2 = z5Var.g;
                        String str = z5Var.e;
                        x5 x5Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) z5Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            md0 md0Var = new md0(18);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            md0Var.d = bitmap2;
                            b7.d dVar = (b7.d) md0Var.b;
                            dVar.a = width3;
                            dVar.b = height3;
                            SparseArray e12 = nVar.e1(md0Var);
                            for (int i10 = 0; i10 < e12.size(); i10++) {
                                u8.m mVar = (u8.m) e12.valueAt(i10);
                                String str2 = mVar.b;
                                Point[] pointArr = mVar.e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i11 = 0; i11 < pointArr.length; i11++) {
                                        Point point = pointArr[i11];
                                        pointFArr[i11] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    x5Var = new x5(trim, pointFArr);
                                }
                            }
                        }
                        x5 x5Var2 = z5Var.d;
                        if ((x5Var2 != null) == (x5Var != null)) {
                            if (x5Var != null && x5Var2 != null) {
                                PointF[] pointFArr2 = x5Var.b;
                                PointF[] pointFArr3 = x5Var2.b;
                                if (TextUtils.equals(x5Var.a, x5Var2.a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            while (i7 < pointFArr2.length) {
                                                i7 = (Math.abs(pointFArr2[i7].x - pointFArr3[i7].x) <= 0.001f && Math.abs(pointFArr2[i7].y - pointFArr3[i7].y) <= 0.001f) ? i7 + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z5Var.d = x5Var;
                        org.telegram.messenger.g0.g3(new c(10, z5Var, x5Var));
                    }
                    if (!z5Var.b.get()) {
                        Utilities.e.a(z5Var.h);
                        Utilities.e.d(z5Var.h, z5Var.b());
                        break;
                    }
                }
                break;
            default:
                this.b.c.a(null);
                break;
        }
    }
}
