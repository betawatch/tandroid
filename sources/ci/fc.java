package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public abstract class fc {
    public float b;
    public org.telegram.ui.Cells.f7 d;
    public ImageReceiver e;
    public ai.a5 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static dc b(org.telegram.ui.Cells.g7 g7Var) {
        if (g7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = g7Var.getImageView();
        dc dcVar = new dc(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        dcVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        dcVar.d = new org.telegram.ui.Cells.f7(imageView.getContext(), null, false, g7Var.y);
        dcVar.b = Math.max(dcVar.c.width(), dcVar.c.height()) / 2.0f;
        return dcVar;
    }

    public static ec c(ai.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        ImageReceiver imageReceiver = a0Var.r;
        if (a0Var.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        ec ecVar = new ec(a0Var, imageWidth / 2.0f);
        float[] fArr = new float[2];
        a0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        ecVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        ecVar.e = imageReceiver;
        ecVar.b = Math.max(ecVar.c.width(), ecVar.c.height()) / 2.0f;
        return ecVar;
    }

    public static dc d(ai.jc jcVar) {
        ai.e6 currentPeerView;
        ai.a5 a5Var;
        if (jcVar == null) {
            return null;
        }
        dc dcVar = new dc(jcVar, 1);
        ai.zb zbVar = jcVar.n0;
        if (zbVar == null || (currentPeerView = zbVar.getCurrentPeerView()) == null || (a5Var = currentPeerView.c1) == null) {
            return null;
        }
        ai.xb xbVar = jcVar.s;
        float x10 = xbVar == null ? 0.0f : xbVar.getX();
        ai.xb xbVar2 = jcVar.s;
        float y3 = xbVar2 != null ? xbVar2.getY() : 0.0f;
        dcVar.c.set(a5Var.getX() + currentPeerView.getX() + jcVar.X + x10 + jcVar.v.getLeft(), a5Var.getY() + currentPeerView.getY() + jcVar.W + y3 + jcVar.v.getTop(), (((x10 + jcVar.X) + jcVar.v.getRight()) - (jcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - a5Var.getRight()), (((y3 + jcVar.W) + jcVar.v.getBottom()) - (jcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - a5Var.getBottom()));
        dcVar.a = 1;
        dcVar.b = AndroidUtilities.dp(8.0f);
        ai.e6 t10 = jcVar.t();
        if (t10 != null) {
            dcVar.f = t10.c1;
        }
        return dcVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
