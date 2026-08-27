package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class nb {
    public float b;
    public org.telegram.ui.Cells.a7 d;
    public ImageReceiver e;
    public jh.j3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static lb b(org.telegram.ui.Cells.b7 b7Var) {
        if (b7Var == null) {
            return null;
        }
        org.telegram.ui.Components.n9 imageView = b7Var.getImageView();
        lb lbVar = new lb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        lbVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        lbVar.d = new org.telegram.ui.Cells.a7(imageView.getContext(), null, false, b7Var.y);
        lbVar.b = Math.max(lbVar.c.width(), lbVar.c.height()) / 2.0f;
        return lbVar;
    }

    public static mb c(jh.o oVar) {
        if (oVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = oVar.r;
        if (oVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        mb mbVar = new mb(oVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        oVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        mbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        mbVar.e = imageReceiver;
        mbVar.b = Math.max(mbVar.c.width(), mbVar.c.height()) / 2.0f;
        return mbVar;
    }

    public static lb d(jh.i9 i9Var) {
        jh.e4 currentPeerView;
        jh.j3 j3Var;
        if (i9Var == null) {
            return null;
        }
        lb lbVar = new lb(i9Var, 1);
        jh.y8 y8Var = i9Var.j0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (j3Var = currentPeerView.Y0) == null) {
            return null;
        }
        jh.w8 w8Var = i9Var.s;
        float x8 = w8Var == null ? 0.0f : w8Var.getX();
        jh.w8 w8Var2 = i9Var.s;
        float y10 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        lbVar.c.set(j3Var.getX() + currentPeerView.getX() + i9Var.T + x8 + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.S + y10 + i9Var.v.getTop(), (((x8 + i9Var.T) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((y10 + i9Var.S) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
        lbVar.a = 1;
        lbVar.b = AndroidUtilities.dp(8.0f);
        jh.e4 t10 = i9Var.t();
        if (t10 != null) {
            lbVar.f = t10.Y0;
        }
        return lbVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
