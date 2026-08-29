package nh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class bb {
    public float b;
    public org.telegram.ui.Cells.b7 d;
    public ImageReceiver e;
    public lh.h3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static za b(org.telegram.ui.Cells.c7 c7Var) {
        if (c7Var == null) {
            return null;
        }
        org.telegram.ui.Components.t9 imageView = c7Var.getImageView();
        za zaVar = new za(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        zaVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        zaVar.d = new org.telegram.ui.Cells.b7(imageView.getContext(), null, false, c7Var.y);
        zaVar.b = Math.max(zaVar.c.width(), zaVar.c.height()) / 2.0f;
        return zaVar;
    }

    public static ab c(lh.o oVar) {
        if (oVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = oVar.r;
        if (oVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        ab abVar = new ab(oVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        oVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        abVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        abVar.e = imageReceiver;
        abVar.b = Math.max(abVar.c.width(), abVar.c.height()) / 2.0f;
        return abVar;
    }

    public static za d(lh.i9 i9Var) {
        lh.d4 currentPeerView;
        lh.h3 h3Var;
        if (i9Var == null) {
            return null;
        }
        za zaVar = new za(i9Var, 1);
        lh.y8 y8Var = i9Var.j0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (h3Var = currentPeerView.Y0) == null) {
            return null;
        }
        lh.w8 w8Var = i9Var.s;
        float x4 = w8Var == null ? 0.0f : w8Var.getX();
        lh.w8 w8Var2 = i9Var.s;
        float y8 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        zaVar.c.set(h3Var.getX() + currentPeerView.getX() + i9Var.T + x4 + i9Var.v.getLeft(), h3Var.getY() + currentPeerView.getY() + i9Var.S + y8 + i9Var.v.getTop(), (((x4 + i9Var.T) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - h3Var.getRight()), (((y8 + i9Var.S) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - h3Var.getBottom()));
        zaVar.a = 1;
        zaVar.b = AndroidUtilities.dp(8.0f);
        lh.d4 t10 = i9Var.t();
        if (t10 != null) {
            zaVar.f = t10.Y0;
        }
        return zaVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f9) {
    }
}
