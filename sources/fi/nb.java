package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class nb {
    public float b;
    public org.telegram.ui.Cells.j7 d;
    public ImageReceiver e;
    public di.q3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static lb b(org.telegram.ui.Cells.k7 k7Var) {
        if (k7Var == null) {
            return null;
        }
        org.telegram.ui.Components.y9 imageView = k7Var.getImageView();
        lb lbVar = new lb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        lbVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        lbVar.d = new org.telegram.ui.Cells.j7(imageView.getContext(), null, false, k7Var.y);
        lbVar.b = Math.max(lbVar.c.width(), lbVar.c.height()) / 2.0f;
        return lbVar;
    }

    public static mb c(di.q qVar) {
        if (qVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = qVar.r;
        if (qVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        mb mbVar = new mb(qVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        qVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        mbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        mbVar.e = imageReceiver;
        mbVar.b = Math.max(mbVar.c.width(), mbVar.c.height()) / 2.0f;
        return mbVar;
    }

    public static lb d(di.y9 y9Var) {
        di.q4 currentPeerView;
        di.q3 q3Var;
        if (y9Var == null) {
            return null;
        }
        lb lbVar = new lb(y9Var, 1);
        di.o9 o9Var = y9Var.n0;
        if (o9Var == null || (currentPeerView = o9Var.getCurrentPeerView()) == null || (q3Var = currentPeerView.R0) == null) {
            return null;
        }
        di.m9 m9Var = y9Var.s;
        float x9 = m9Var == null ? 0.0f : m9Var.getX();
        di.m9 m9Var2 = y9Var.s;
        float y3 = m9Var2 != null ? m9Var2.getY() : 0.0f;
        lbVar.c.set(q3Var.getX() + currentPeerView.getX() + y9Var.X + x9 + y9Var.v.getLeft(), q3Var.getY() + currentPeerView.getY() + y9Var.W + y3 + y9Var.v.getTop(), (((x9 + y9Var.X) + y9Var.v.getRight()) - (y9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - q3Var.getRight()), (((y3 + y9Var.W) + y9Var.v.getBottom()) - (y9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - q3Var.getBottom()));
        lbVar.a = 1;
        lbVar.b = AndroidUtilities.dp(8.0f);
        di.q4 t10 = y9Var.t();
        if (t10 != null) {
            lbVar.f = t10.R0;
        }
        return lbVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
