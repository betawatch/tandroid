package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public abstract class jc {
    public float b;
    public org.telegram.ui.Cells.g7 d;
    public ImageReceiver e;
    public ai.a5 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static hc b(org.telegram.ui.Cells.h7 h7Var) {
        if (h7Var == null) {
            return null;
        }
        org.telegram.ui.Components.v9 imageView = h7Var.getImageView();
        hc hcVar = new hc(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        hcVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        hcVar.d = new org.telegram.ui.Cells.g7(imageView.getContext(), null, false, h7Var.y);
        hcVar.b = Math.max(hcVar.c.width(), hcVar.c.height()) / 2.0f;
        return hcVar;
    }

    public static ic c(ai.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        ImageReceiver imageReceiver = a0Var.r;
        if (a0Var.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        ic icVar = new ic(a0Var, imageWidth / 2.0f);
        float[] fArr = new float[2];
        a0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        icVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        icVar.e = imageReceiver;
        icVar.b = Math.max(icVar.c.width(), icVar.c.height()) / 2.0f;
        return icVar;
    }

    public static hc d(ai.jc jcVar) {
        ai.f6 currentPeerView;
        ai.a5 a5Var;
        if (jcVar == null) {
            return null;
        }
        hc hcVar = new hc(jcVar, 1);
        ai.zb zbVar = jcVar.n0;
        if (zbVar == null || (currentPeerView = zbVar.getCurrentPeerView()) == null || (a5Var = currentPeerView.c1) == null) {
            return null;
        }
        ai.xb xbVar = jcVar.s;
        float x10 = xbVar == null ? 0.0f : xbVar.getX();
        ai.xb xbVar2 = jcVar.s;
        float y3 = xbVar2 != null ? xbVar2.getY() : 0.0f;
        hcVar.c.set(a5Var.getX() + currentPeerView.getX() + jcVar.X + x10 + jcVar.v.getLeft(), a5Var.getY() + currentPeerView.getY() + jcVar.W + y3 + jcVar.v.getTop(), (((x10 + jcVar.X) + jcVar.v.getRight()) - (jcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - a5Var.getRight()), (((y3 + jcVar.W) + jcVar.v.getBottom()) - (jcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - a5Var.getBottom()));
        hcVar.a = 1;
        hcVar.b = AndroidUtilities.dp(8.0f);
        ai.f6 t10 = jcVar.t();
        if (t10 != null) {
            hcVar.f = t10.c1;
        }
        return hcVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
