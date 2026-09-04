package di;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ e7(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r8.n nVar;
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                if (h7Var.a.get() != null && h7Var.f != null && !h7Var.b.get()) {
                    TextureView textureView = h7Var.f.getTextureView();
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
                        Bitmap bitmap = h7Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != h7Var.g.getHeight()) {
                            h7Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(h7Var.g);
                        Bitmap bitmap2 = h7Var.g;
                        String str = h7Var.e;
                        f7 f7Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) h7Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            m2.t tVar = new m2.t(20);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            tVar.d = bitmap2;
                            a3.k kVar = (a3.k) tVar.b;
                            kVar.a = width3;
                            kVar.b = height3;
                            SparseArray Z0 = nVar.Z0(tVar);
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
                                    f7Var = new f7(trim, pointFArr);
                                }
                            }
                        }
                        f7 f7Var2 = h7Var.d;
                        if ((f7Var2 != null) == (f7Var != null)) {
                            if (f7Var != null && f7Var2 != null) {
                                PointF[] pointFArr2 = f7Var.b;
                                PointF[] pointFArr3 = f7Var2.b;
                                if (TextUtils.equals(f7Var.a, f7Var2.a)) {
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
                        h7Var.d = f7Var;
                        AndroidUtilities.runOnUIThread(new b7(2, h7Var, f7Var));
                    }
                    if (!h7Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(h7Var.h);
                        Utilities.globalQueue.postRunnable(h7Var.h, h7Var.b());
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
