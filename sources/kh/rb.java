package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class rb {
    public float b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public ih.l3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static pb b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.o9 imageView = e7Var.getImageView();
        pb pbVar = new pb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        pbVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        pbVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.y);
        pbVar.b = Math.max(pbVar.c.width(), pbVar.c.height()) / 2.0f;
        return pbVar;
    }

    public static qb c(ih.q qVar) {
        if (qVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = qVar.r;
        if (qVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        qb qbVar = new qb(qVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        qVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        qbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        qbVar.e = imageReceiver;
        qbVar.b = Math.max(qbVar.c.width(), qbVar.c.height()) / 2.0f;
        return qbVar;
    }

    public static pb d(ih.m9 m9Var) {
        ih.i4 currentPeerView;
        ih.l3 l3Var;
        if (m9Var == null) {
            return null;
        }
        pb pbVar = new pb(m9Var, 1);
        ih.c9 c9Var = m9Var.j0;
        if (c9Var == null || (currentPeerView = c9Var.getCurrentPeerView()) == null || (l3Var = currentPeerView.Y0) == null) {
            return null;
        }
        ih.a9 a9Var = m9Var.s;
        float x10 = a9Var == null ? 0.0f : a9Var.getX();
        ih.a9 a9Var2 = m9Var.s;
        float y10 = a9Var2 != null ? a9Var2.getY() : 0.0f;
        pbVar.c.set(l3Var.getX() + currentPeerView.getX() + m9Var.T + x10 + m9Var.v.getLeft(), l3Var.getY() + currentPeerView.getY() + m9Var.S + y10 + m9Var.v.getTop(), (((x10 + m9Var.T) + m9Var.v.getRight()) - (m9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - l3Var.getRight()), (((y10 + m9Var.S) + m9Var.v.getBottom()) - (m9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - l3Var.getBottom()));
        pbVar.a = 1;
        pbVar.b = AndroidUtilities.dp(8.0f);
        ih.i4 t10 = m9Var.t();
        if (t10 != null) {
            pbVar.f = t10.Y0;
        }
        return pbVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
