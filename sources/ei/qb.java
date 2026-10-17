package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public abstract class qb {
    public float b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public ci.r3 f;
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

    public static ob d(ci.aa aaVar) {
        ci.q4 currentPeerView;
        ci.r3 r3Var;
        if (aaVar == null) {
            return null;
        }
        ob obVar = new ob(aaVar, 1);
        ci.q9 q9Var = aaVar.n0;
        if (q9Var == null || (currentPeerView = q9Var.getCurrentPeerView()) == null || (r3Var = currentPeerView.c1) == null) {
            return null;
        }
        ci.o9 o9Var = aaVar.s;
        float x10 = o9Var == null ? 0.0f : o9Var.getX();
        ci.o9 o9Var2 = aaVar.s;
        float y3 = o9Var2 != null ? o9Var2.getY() : 0.0f;
        obVar.c.set(r3Var.getX() + currentPeerView.getX() + aaVar.X + x10 + aaVar.v.getLeft(), r3Var.getY() + currentPeerView.getY() + aaVar.W + y3 + aaVar.v.getTop(), (((x10 + aaVar.X) + aaVar.v.getRight()) - (aaVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - r3Var.getRight()), (((y3 + aaVar.W) + aaVar.v.getBottom()) - (aaVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - r3Var.getBottom()));
        obVar.a = 1;
        obVar.b = AndroidUtilities.dp(8.0f);
        ci.q4 t10 = aaVar.t();
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
