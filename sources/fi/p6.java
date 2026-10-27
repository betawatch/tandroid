package fi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ p6(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        s8.n nVar;
        switch (this.a) {
            case 0:
                s6 s6Var = this.b;
                if (s6Var.a.get() != null && s6Var.f != null && !s6Var.b.get()) {
                    TextureView textureView = s6Var.f.getTextureView();
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
                        Bitmap bitmap = s6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != s6Var.g.getHeight()) {
                            s6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(s6Var.g);
                        Bitmap bitmap2 = s6Var.g;
                        String str = s6Var.e;
                        q6 q6Var = null;
                        if (bitmap2 != null && (nVar = (s8.n) s6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            k6.c cVar = new k6.c(28);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            cVar.d = bitmap2;
                            a3.l lVar = (a3.l) cVar.b;
                            lVar.a = width3;
                            lVar.b = height3;
                            SparseArray e12 = nVar.e1(cVar);
                            for (int i11 = 0; i11 < e12.size(); i11++) {
                                s8.m mVar = (s8.m) e12.valueAt(i11);
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
                                    q6Var = new q6(trim, pointFArr);
                                }
                            }
                        }
                        q6 q6Var2 = s6Var.d;
                        if ((q6Var2 != null) == (q6Var != null)) {
                            if (q6Var != null && q6Var2 != null) {
                                PointF[] pointFArr2 = q6Var.b;
                                PointF[] pointFArr3 = q6Var2.b;
                                if (TextUtils.equals(q6Var.a, q6Var2.a)) {
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
                        s6Var.d = q6Var;
                        AndroidUtilities.runOnUIThread(new e2.q0(13, s6Var, q6Var));
                    }
                    if (!s6Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(s6Var.h);
                        Utilities.globalQueue.postRunnable(s6Var.h, s6Var.b());
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
