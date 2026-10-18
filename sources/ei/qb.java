package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public abstract class qb {
    public float b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public ci.q3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static ob b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = e7Var.getImageView();
        ob obVar = new ob(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        obVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        obVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.y);
        obVar.b = Math.max(obVar.c.width(), obVar.c.height()) / 2.0f;
        return obVar;
    }

    public static pb c(ci.q qVar) {
        if (qVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = qVar.r;
        if (qVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        pb pbVar = new pb(qVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        qVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        pbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        pbVar.e = imageReceiver;
        pbVar.b = Math.max(pbVar.c.width(), pbVar.c.height()) / 2.0f;
        return pbVar;
    }

    public static ob d(ci.z9 z9Var) {
        ci.p4 currentPeerView;
        ci.q3 q3Var;
        if (z9Var == null) {
            return null;
        }
        ob obVar = new ob(z9Var, 1);
        ci.p9 p9Var = z9Var.n0;
        if (p9Var == null || (currentPeerView = p9Var.getCurrentPeerView()) == null || (q3Var = currentPeerView.c1) == null) {
            return null;
        }
        ci.n9 n9Var = z9Var.s;
        float x10 = n9Var == null ? 0.0f : n9Var.getX();
        ci.n9 n9Var2 = z9Var.s;
        float y3 = n9Var2 != null ? n9Var2.getY() : 0.0f;
        obVar.c.set(q3Var.getX() + currentPeerView.getX() + z9Var.X + x10 + z9Var.v.getLeft(), q3Var.getY() + currentPeerView.getY() + z9Var.W + y3 + z9Var.v.getTop(), (((x10 + z9Var.X) + z9Var.v.getRight()) - (z9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - q3Var.getRight()), (((y3 + z9Var.W) + z9Var.v.getBottom()) - (z9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - q3Var.getBottom()));
        obVar.a = 1;
        obVar.b = AndroidUtilities.dp(8.0f);
        ci.p4 t10 = z9Var.t();
        if (t10 != null) {
            obVar.f = t10.c1;
        }
        return obVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
