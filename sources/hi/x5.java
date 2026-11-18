package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ x5(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        u8.n nVar;
        switch (this.a) {
            case 0:
                a6 a6Var = this.b;
                if (a6Var.a.get() != null && a6Var.f != null && !a6Var.b.get()) {
                    TextureView textureView = a6Var.f.getTextureView();
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
                        Bitmap bitmap = a6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != a6Var.g.getHeight()) {
                            a6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(a6Var.g);
                        Bitmap bitmap2 = a6Var.g;
                        String str = a6Var.e;
                        y5 y5Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) a6Var.a.get()) != null && nVar.b.k()) {
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
                                    y5Var = new y5(trim, pointFArr);
                                }
                            }
                        }
                        y5 y5Var2 = a6Var.d;
                        if ((y5Var2 != null) == (y5Var != null)) {
                            if (y5Var != null && y5Var2 != null) {
                                PointF[] pointFArr2 = y5Var.b;
                                PointF[] pointFArr3 = y5Var2.b;
                                if (TextUtils.equals(y5Var.a, y5Var2.a)) {
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
                        a6Var.d = y5Var;
                        org.telegram.messenger.g0.g3(new r1(8, a6Var, y5Var));
                    }
                    if (!a6Var.b.get()) {
                        Utilities.e.a(a6Var.h);
                        Utilities.e.d(a6Var.h, a6Var.b());
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
