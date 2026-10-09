package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class gc {
    public float b;
    public org.telegram.ui.Cells.f7 d;
    public ImageReceiver e;
    public ai.b5 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static ec b(org.telegram.ui.Cells.g7 g7Var) {
        if (g7Var == null) {
            return null;
        }
        org.telegram.ui.Components.y9 imageView = g7Var.getImageView();
        ec ecVar = new ec(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        ecVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        ecVar.d = new org.telegram.ui.Cells.f7(imageView.getContext(), null, false, g7Var.y);
        ecVar.b = Math.max(ecVar.c.width(), ecVar.c.height()) / 2.0f;
        return ecVar;
    }

    public static fc c(ai.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        ImageReceiver imageReceiver = a0Var.r;
        if (a0Var.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        fc fcVar = new fc(a0Var, imageWidth / 2.0f);
        float[] fArr = new float[2];
        a0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        fcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        fcVar.e = imageReceiver;
        fcVar.b = Math.max(fcVar.c.width(), fcVar.c.height()) / 2.0f;
        return fcVar;
    }

    public static ec d(ai.kc kcVar) {
        ai.f6 currentPeerView;
        ai.b5 b5Var;
        if (kcVar == null) {
            return null;
        }
        ec ecVar = new ec(kcVar, 1);
        ai.ac acVar = kcVar.n0;
        if (acVar == null || (currentPeerView = acVar.getCurrentPeerView()) == null || (b5Var = currentPeerView.c1) == null) {
            return null;
        }
        ai.yb ybVar = kcVar.s;
        float x10 = ybVar == null ? 0.0f : ybVar.getX();
        ai.yb ybVar2 = kcVar.s;
        float y3 = ybVar2 != null ? ybVar2.getY() : 0.0f;
        ecVar.c.set(b5Var.getX() + currentPeerView.getX() + kcVar.X + x10 + kcVar.v.getLeft(), b5Var.getY() + currentPeerView.getY() + kcVar.W + y3 + kcVar.v.getTop(), (((x10 + kcVar.X) + kcVar.v.getRight()) - (kcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - b5Var.getRight()), (((y3 + kcVar.W) + kcVar.v.getBottom()) - (kcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - b5Var.getBottom()));
        ecVar.a = 1;
        ecVar.b = AndroidUtilities.dp(8.0f);
        ai.f6 t10 = kcVar.t();
        if (t10 != null) {
            ecVar.f = t10.c1;
        }
        return ecVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
