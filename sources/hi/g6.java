package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ g6(j6 j6Var, int i7) {
        this.a = i7;
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        u8.n nVar;
        switch (this.a) {
            case 0:
                j6 j6Var = this.b;
                if (j6Var.a.get() != null && j6Var.f != null && !j6Var.b.get()) {
                    TextureView textureView = j6Var.f.getTextureView();
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
                        Bitmap bitmap = j6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != j6Var.g.getHeight()) {
                            j6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(j6Var.g);
                        Bitmap bitmap2 = j6Var.g;
                        String str = j6Var.e;
                        h6 h6Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) j6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            i61 i61Var = new i61(20);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            i61Var.d = bitmap2;
                            b7.d dVar = (b7.d) i61Var.b;
                            dVar.a = width3;
                            dVar.b = height3;
                            SparseArray e12 = nVar.e1(i61Var);
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
                                            while (i7 < pointFArr2.length) {
                                                i7 = (Math.abs(pointFArr2[i7].x - pointFArr3[i7].x) <= 0.001f && Math.abs(pointFArr2[i7].y - pointFArr3[i7].y) <= 0.001f) ? i7 + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j6Var.d = h6Var;
                        org.telegram.messenger.g0.g3(new c(11, j6Var, h6Var));
                    }
                    if (!j6Var.b.get()) {
                        Utilities.e.a(j6Var.h);
                        Utilities.e.d(j6Var.h, j6Var.b());
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
