package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ y5(b6 b6Var, int i7) {
        this.a = i7;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        u8.n nVar;
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                if (b6Var.a.get() != null && b6Var.f != null && !b6Var.b.get()) {
                    TextureView textureView = b6Var.f.getTextureView();
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
                        Bitmap bitmap = b6Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != b6Var.g.getHeight()) {
                            b6Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(b6Var.g);
                        Bitmap bitmap2 = b6Var.g;
                        String str = b6Var.e;
                        z5 z5Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) b6Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            ld0 ld0Var = new ld0(18);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            ld0Var.d = bitmap2;
                            b7.d dVar = (b7.d) ld0Var.b;
                            dVar.a = width3;
                            dVar.b = height3;
                            SparseArray e12 = nVar.e1(ld0Var);
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
                                    z5Var = new z5(trim, pointFArr);
                                }
                            }
                        }
                        z5 z5Var2 = b6Var.d;
                        if ((z5Var2 != null) == (z5Var != null)) {
                            if (z5Var != null && z5Var2 != null) {
                                PointF[] pointFArr2 = z5Var.b;
                                PointF[] pointFArr3 = z5Var2.b;
                                if (TextUtils.equals(z5Var.a, z5Var2.a)) {
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
                        b6Var.d = z5Var;
                        org.telegram.messenger.g0.h3(new h4(6, b6Var, z5Var));
                    }
                    if (!b6Var.b.get()) {
                        Utilities.e.a(b6Var.h);
                        Utilities.e.d(b6Var.h, b6Var.b());
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
