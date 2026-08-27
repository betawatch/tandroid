package lh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ r6(u6 u6Var, int i10) {
        this.a = i10;
        this.b = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        c8.n nVar;
        switch (this.a) {
            case 0:
                u6 u6Var = this.b;
                if (u6Var.a.get() != null && u6Var.f != null && !u6Var.b.get()) {
                    TextureView textureView = u6Var.f.getTextureView();
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
                        Bitmap bitmap = u6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != u6Var.g.getHeight()) {
                            u6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(u6Var.g);
                        Bitmap bitmap2 = u6Var.g;
                        String str = u6Var.e;
                        s6 s6Var = null;
                        if (bitmap2 != null && (nVar = (c8.n) u6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            a5.n nVar2 = new a5.n(5);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            nVar2.d = bitmap2;
                            b8.b bVar = (b8.b) nVar2.b;
                            bVar.a = width3;
                            bVar.b = height3;
                            SparseArray Q = nVar.Q(nVar2);
                            for (int i11 = 0; i11 < Q.size(); i11++) {
                                c8.m mVar = (c8.m) Q.valueAt(i11);
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
                                    s6Var = new s6(trim, pointFArr);
                                }
                            }
                        }
                        s6 s6Var2 = u6Var.d;
                        if ((s6Var2 != null) == (s6Var != null)) {
                            if (s6Var != null && s6Var2 != null) {
                                PointF[] pointFArr2 = s6Var.b;
                                PointF[] pointFArr3 = s6Var2.b;
                                if (TextUtils.equals(s6Var.a, s6Var2.a)) {
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
                        u6Var.d = s6Var;
                        AndroidUtilities.runOnUIThread(new jh.p6(27, u6Var, s6Var));
                    }
                    if (!u6Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(u6Var.h);
                        Utilities.globalQueue.postRunnable(u6Var.h, u6Var.b());
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
