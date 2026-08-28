package kh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ s6(v6 v6Var, int i9) {
        this.a = i9;
        this.b = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        b8.n nVar;
        switch (this.a) {
            case 0:
                v6 v6Var = this.b;
                if (v6Var.a.get() != null && v6Var.f != null && !v6Var.b.get()) {
                    TextureView textureView = v6Var.f.getTextureView();
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
                        Bitmap bitmap = v6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != v6Var.g.getHeight()) {
                            v6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(v6Var.g);
                        Bitmap bitmap2 = v6Var.g;
                        String str = v6Var.e;
                        t6 t6Var = null;
                        if (bitmap2 != null && (nVar = (b8.n) v6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            a5.m mVar = new a5.m(1);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            mVar.d = bitmap2;
                            a8.b bVar = (a8.b) mVar.b;
                            bVar.a = width3;
                            bVar.b = height3;
                            SparseArray Q = nVar.Q(mVar);
                            for (int i10 = 0; i10 < Q.size(); i10++) {
                                b8.m mVar2 = (b8.m) Q.valueAt(i10);
                                String str2 = mVar2.b;
                                Point[] pointArr = mVar2.e;
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
                                            while (i9 < pointFArr2.length) {
                                                i9 = (Math.abs(pointFArr2[i9].x - pointFArr3[i9].x) <= 0.001f && Math.abs(pointFArr2[i9].y - pointFArr3[i9].y) <= 0.001f) ? i9 + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        v6Var.d = t6Var;
                        AndroidUtilities.runOnUIThread(new ih.j7(21, v6Var, t6Var));
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
