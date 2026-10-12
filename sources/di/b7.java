package di;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ b7(e7 e7Var, int i10) {
        this.a = i10;
        this.b = e7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r8.n nVar;
        switch (this.a) {
            case 0:
                e7 e7Var = this.b;
                if (e7Var.a.get() != null && e7Var.f != null && !e7Var.b.get()) {
                    TextureView textureView = e7Var.f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f7 = width;
                            float f10 = height;
                            float min = Math.min(720.0f / f7, 720.0f / f10);
                            width = (int) (f7 * min);
                            height = (int) (f10 * min);
                        }
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = e7Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != e7Var.g.getHeight()) {
                            e7Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(e7Var.g);
                        Bitmap bitmap2 = e7Var.g;
                        String str = e7Var.e;
                        c7 c7Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) e7Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            li.k kVar = new li.k(23);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            kVar.d = bitmap2;
                            a3.l lVar = (a3.l) kVar.b;
                            lVar.a = width3;
                            lVar.b = height3;
                            SparseArray e12 = nVar.e1(kVar);
                            for (int i11 = 0; i11 < e12.size(); i11++) {
                                r8.m mVar = (r8.m) e12.valueAt(i11);
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
                                    for (int i12 = 0; i12 < pointArr.length; i12++) {
                                        Point point = pointArr[i12];
                                        pointFArr[i12] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    c7Var = new c7(trim, pointFArr);
                                }
                            }
                        }
                        c7 c7Var2 = e7Var.d;
                        if ((c7Var2 != null) == (c7Var != null)) {
                            if (c7Var != null && c7Var2 != null) {
                                PointF[] pointFArr2 = c7Var.b;
                                PointF[] pointFArr3 = c7Var2.b;
                                if (TextUtils.equals(c7Var.a, c7Var2.a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            while (i10 < pointFArr2.length) {
                                                i10 = (Math.abs(pointFArr2[i10].x - pointFArr3[i10].x) <= 0.001f && Math.abs(pointFArr2[i10].y - pointFArr3[i10].y) <= 0.001f) ? i10 + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e7Var.d = c7Var;
                        AndroidUtilities.runOnUIThread(new x6(4, e7Var, c7Var));
                    }
                    if (!e7Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(e7Var.h);
                        Utilities.globalQueue.postRunnable(e7Var.h, e7Var.b());
                        break;
                    }
                }
                break;
            default:
                this.b.c.run(null);
                break;
        }
    }
}
