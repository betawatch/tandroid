package nh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ g6(j6 j6Var, int i10) {
        this.a = i10;
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        d8.n nVar;
        switch (this.a) {
            case 0:
                j6 j6Var = this.b;
                if (j6Var.a.get() != null && j6Var.f != null && !j6Var.b.get()) {
                    TextureView textureView = j6Var.f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f9 = width;
                            float f10 = height;
                            float min = Math.min(720.0f / f9, 720.0f / f10);
                            width = (int) (f9 * min);
                            height = (int) (f10 * min);
                        }
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = j6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != j6Var.g.getHeight()) {
                            j6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(j6Var.g);
                        Bitmap bitmap2 = j6Var.g;
                        String str = j6Var.e;
                        h6 h6Var = null;
                        if (bitmap2 != null && (nVar = (d8.n) j6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            androidx.biometric.e eVar = new androidx.biometric.e(5);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            eVar.d = bitmap2;
                            c8.a aVar = (c8.a) eVar.b;
                            aVar.a = width3;
                            aVar.b = height3;
                            SparseArray Q = nVar.Q(eVar);
                            for (int i11 = 0; i11 < Q.size(); i11++) {
                                d8.m mVar = (d8.m) Q.valueAt(i11);
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
                                    h6Var = new h6(trim, pointFArr);
                                }
                            }
                        }
                        h6 h6Var2 = j6Var.d;
                        if ((h6Var2 != null) == (h6Var != null)) {
                            if (h6Var != null && h6Var2 != null) {
                                PointF[] pointFArr2 = h6Var.b;
                                PointF[] pointFArr3 = h6Var2.b;
                                if (TextUtils.equals(h6Var.a, h6Var2.a)) {
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
                        j6Var.d = h6Var;
                        AndroidUtilities.runOnUIThread(new b6(4, j6Var, h6Var));
                    }
                    if (!j6Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(j6Var.h);
                        Utilities.globalQueue.postRunnable(j6Var.h, j6Var.b());
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
