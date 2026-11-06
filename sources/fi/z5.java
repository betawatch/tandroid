package fi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ z5(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        u8.n nVar;
        switch (this.a) {
            case 0:
                c6 c6Var = this.b;
                if (c6Var.a.get() != null && c6Var.f != null && !c6Var.b.get()) {
                    TextureView textureView = c6Var.f.getTextureView();
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
                        Bitmap bitmap = c6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != c6Var.g.getHeight()) {
                            c6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(c6Var.g);
                        Bitmap bitmap2 = c6Var.g;
                        String str = c6Var.e;
                        a6 a6Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) c6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            hy0 hy0Var = new hy0(17);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            hy0Var.d = bitmap2;
                            b7.d dVar = (b7.d) hy0Var.b;
                            dVar.a = width3;
                            dVar.b = height3;
                            SparseArray e12 = nVar.e1(hy0Var);
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
                                    a6Var = new a6(trim, pointFArr);
                                }
                            }
                        }
                        a6 a6Var2 = c6Var.d;
                        if ((a6Var2 != null) == (a6Var != null)) {
                            if (a6Var != null && a6Var2 != null) {
                                PointF[] pointFArr2 = a6Var.b;
                                PointF[] pointFArr3 = a6Var2.b;
                                if (TextUtils.equals(a6Var.a, a6Var2.a)) {
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
                        c6Var.d = a6Var;
                        org.telegram.messenger.g0.h3(new f2.h(11, c6Var, a6Var));
                    }
                    if (!c6Var.b.get()) {
                        Utilities.e.a(c6Var.h);
                        Utilities.e.d(c6Var.h, c6Var.b());
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
