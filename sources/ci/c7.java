package ci;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;

    public /* synthetic */ c7(f7 f7Var, int i10) {
        this.a = i10;
        this.b = f7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r8.n nVar;
        switch (this.a) {
            case 0:
                f7 f7Var = this.b;
                if (f7Var.a.get() != null && f7Var.f != null && !f7Var.b.get()) {
                    TextureView textureView = f7Var.f.getTextureView();
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
                        Bitmap bitmap = f7Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != f7Var.g.getHeight()) {
                            f7Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(f7Var.g);
                        Bitmap bitmap2 = f7Var.g;
                        String str = f7Var.e;
                        d7 d7Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) f7Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            la.h hVar = new la.h(23);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            hVar.d = bitmap2;
                            a3.l lVar = (a3.l) hVar.b;
                            lVar.a = width3;
                            lVar.b = height3;
                            SparseArray Z0 = nVar.Z0(hVar);
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
                                    d7Var = new d7(trim, pointFArr);
                                }
                            }
                        }
                        d7 d7Var2 = f7Var.d;
                        if ((d7Var2 != null) == (d7Var != null)) {
                            if (d7Var != null && d7Var2 != null) {
                                PointF[] pointFArr2 = d7Var.b;
                                PointF[] pointFArr3 = d7Var2.b;
                                if (TextUtils.equals(d7Var.a, d7Var2.a)) {
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
                        f7Var.d = d7Var;
                        AndroidUtilities.runOnUIThread(new ai.ba(23, f7Var, d7Var));
                    }
                    if (!f7Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(f7Var.h);
                        Utilities.globalQueue.postRunnable(f7Var.h, f7Var.b());
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
