package bi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ f8(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r8.n nVar;
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                if (i8Var.a.get() != null && i8Var.f != null && !i8Var.b.get()) {
                    TextureView textureView = i8Var.f.getTextureView();
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
                        Bitmap bitmap = i8Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != i8Var.g.getHeight()) {
                            i8Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(i8Var.g);
                        Bitmap bitmap2 = i8Var.g;
                        String str = i8Var.e;
                        g8 g8Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) i8Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            m.e3 e3Var = new m.e3(20);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            e3Var.d = bitmap2;
                            a3.l lVar = (a3.l) e3Var.b;
                            lVar.a = width3;
                            lVar.b = height3;
                            SparseArray Z0 = nVar.Z0(e3Var);
                            for (int i11 = 0; i11 < Z0.size(); i11++) {
                                r8.m mVar = (r8.m) Z0.valueAt(i11);
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
                                    g8Var = new g8(trim, pointFArr);
                                }
                            }
                        }
                        g8 g8Var2 = i8Var.d;
                        if ((g8Var2 != null) == (g8Var != null)) {
                            if (g8Var != null && g8Var2 != null) {
                                PointF[] pointFArr2 = g8Var.b;
                                PointF[] pointFArr3 = g8Var2.b;
                                if (TextUtils.equals(g8Var.a, g8Var2.a)) {
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
                        i8Var.d = g8Var;
                        AndroidUtilities.runOnUIThread(new a1.e(19, i8Var, g8Var));
                    }
                    if (!i8Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(i8Var.h);
                        Utilities.globalQueue.postRunnable(i8Var.h, i8Var.b());
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
