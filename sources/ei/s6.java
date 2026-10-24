package ei;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ s6(v6 v6Var, int i10) {
        this.a = i10;
        this.b = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r8.n nVar;
        switch (this.a) {
            case 0:
                v6 v6Var = this.b;
                if (v6Var.a.get() != null && v6Var.f != null && !v6Var.b.get()) {
                    TextureView textureView = v6Var.f.getTextureView();
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
                        Bitmap bitmap = v6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != v6Var.g.getHeight()) {
                            v6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(v6Var.g);
                        Bitmap bitmap2 = v6Var.g;
                        String str = v6Var.e;
                        t6 t6Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) v6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            m.g3 g3Var = new m.g3(22);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            g3Var.d = bitmap2;
                            a3.l lVar = (a3.l) g3Var.b;
                            lVar.a = width3;
                            lVar.b = height3;
                            SparseArray e12 = nVar.e1(g3Var);
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
                                    t6Var = new t6(trim, pointFArr);
                                }
                            }
                        }
                        t6 t6Var2 = v6Var.d;
                        if ((t6Var2 != null) == (t6Var != null)) {
                            if (t6Var != null && t6Var2 != null) {
                                PointF[] pointFArr2 = t6Var.b;
                                PointF[] pointFArr3 = t6Var2.b;
                                if (TextUtils.equals(t6Var.a, t6Var2.a)) {
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
                        v6Var.d = t6Var;
                        AndroidUtilities.runOnUIThread(new p6(2, v6Var, t6Var));
                    }
                    if (!v6Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(v6Var.h);
                        Utilities.globalQueue.postRunnable(v6Var.h, v6Var.b());
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
