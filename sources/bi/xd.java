package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class xd {
    public float b;
    public org.telegram.ui.Cells.g7 d;
    public ImageReceiver e;
    public zh.h2 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static ud b(org.telegram.ui.Cells.h7 h7Var) {
        if (h7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = h7Var.getImageView();
        ud udVar = new ud(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        udVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        udVar.d = new org.telegram.ui.Cells.g7(imageView.getContext(), null, false, h7Var.y);
        udVar.b = Math.max(udVar.c.width(), udVar.c.height()) / 2.0f;
        return udVar;
    }

    public static wd c(zh.k kVar) {
        if (kVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = kVar.r;
        if (kVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        wd wdVar = new wd(kVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        kVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(kVar, (ViewGroup) kVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        wdVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        wdVar.e = imageReceiver;
        wdVar.b = Math.max(wdVar.c.width(), wdVar.c.height()) / 2.0f;
        return wdVar;
    }

    public static ud d(zh.u7 u7Var) {
        zh.a3 currentPeerView;
        zh.h2 h2Var;
        if (u7Var == null) {
            return null;
        }
        ud udVar = new ud(u7Var, 1);
        zh.k7 k7Var = u7Var.n0;
        if (k7Var == null || (currentPeerView = k7Var.getCurrentPeerView()) == null || (h2Var = currentPeerView.c1) == null) {
            return null;
        }
        zh.i7 i7Var = u7Var.s;
        float x10 = i7Var == null ? 0.0f : i7Var.getX();
        zh.i7 i7Var2 = u7Var.s;
        float y3 = i7Var2 != null ? i7Var2.getY() : 0.0f;
        udVar.c.set(h2Var.getX() + currentPeerView.getX() + u7Var.X + x10 + u7Var.v.getLeft(), h2Var.getY() + currentPeerView.getY() + u7Var.W + y3 + u7Var.v.getTop(), (((x10 + u7Var.X) + u7Var.v.getRight()) - (u7Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - h2Var.getRight()), (((y3 + u7Var.W) + u7Var.v.getBottom()) - (u7Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - h2Var.getBottom()));
        udVar.a = 1;
        udVar.b = AndroidUtilities.dp(8.0f);
        zh.a3 t10 = u7Var.t();
        if (t10 != null) {
            udVar.f = t10.c1;
        }
        return udVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
