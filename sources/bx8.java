// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ex8 b;

    public /* synthetic */ bx8(ex8 ex8Var, byte b) {
        this.a = b;
        this.b = ex8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        yf0 yf0Var;
        byte b = this.a;
        cx8 cx8Var = null;
        ex8 ex8Var = this.b;
        switch (b) {
            case 0:
                if (ex8Var.a.get() != null && ((a9b) ex8Var.f) != null && !((AtomicBoolean) ex8Var.b).get()) {
                    TextureView textureView = ((a9b) ex8Var.f).getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f = width;
                            float f2 = height;
                            float min = Math.min(720.0f / f, 720.0f / f2);
                            width = (int) (f * min);
                            height = (int) (f2 * min);
                        }
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = (Bitmap) ex8Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != ((Bitmap) ex8Var.g).getHeight()) {
                            ex8Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap((Bitmap) ex8Var.g);
                        Bitmap bitmap2 = (Bitmap) ex8Var.g;
                        String str = (String) ex8Var.e;
                        if (bitmap2 != null && (yf0Var = (yf0) ex8Var.a.get()) != null && yf0Var.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            in3 in3Var = new in3((byte) 4);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            in3Var.d = bitmap2;
                            pd0 pd0Var = (pd0) in3Var.b;
                            pd0Var.a = width3;
                            pd0Var.b = height3;
                            SparseArray h = yf0Var.h(in3Var);
                            for (int i2 = 0; i2 < h.size(); i2++) {
                                xf0 xf0Var = (xf0) h.valueAt(i2);
                                String str2 = xf0Var.b;
                                Point[] pointArr = xf0Var.e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i3 = 0; i3 < pointArr.length; i3++) {
                                        Point point = pointArr[i3];
                                        pointFArr[i3] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    cx8Var = new cx8(trim, pointFArr);
                                }
                            }
                        }
                        cx8 cx8Var2 = (cx8) ex8Var.d;
                        if ((cx8Var2 != null) == (cx8Var != null)) {
                            if (cx8Var != null && cx8Var2 != null) {
                                PointF[] pointFArr2 = cx8Var.b;
                                PointF[] pointFArr3 = cx8Var2.b;
                                if (TextUtils.equals(cx8Var.a, cx8Var2.a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            while (i < pointFArr2.length) {
                                                i = (Math.abs(pointFArr2[i].x - pointFArr3[i].x) <= 0.001f && Math.abs(pointFArr2[i].y - pointFArr3[i].y) <= 0.001f) ? i + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ex8Var.d = cx8Var;
                        gm.c3(new mn8(ex8Var, cx8Var, (byte) 23));
                    }
                    if (!((AtomicBoolean) ex8Var.b).get()) {
                        Utilities.e.a((bx8) ex8Var.h);
                        Utilities.e.d((bx8) ex8Var.h, ex8Var.d());
                        break;
                    }
                }
                break;
            default:
                ((g8b) ex8Var.c).a(null);
                break;
        }
    }
}
