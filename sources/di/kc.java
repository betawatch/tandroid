package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class kc {
    public float b;
    public org.telegram.ui.Cells.e7 d;
    public ImageReceiver e;
    public bi.l4 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static ic b(org.telegram.ui.Cells.f7 f7Var) {
        if (f7Var == null) {
            return null;
        }
        org.telegram.ui.Components.x9 imageView = f7Var.getImageView();
        ic icVar = new ic(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        icVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        icVar.d = new org.telegram.ui.Cells.e7(imageView.getContext(), null, false, f7Var.y);
        icVar.b = Math.max(icVar.c.width(), icVar.c.height()) / 2.0f;
        return icVar;
    }

    public static jc c(bi.u uVar) {
        if (uVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = uVar.r;
        if (uVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        jc jcVar = new jc(uVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        uVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(uVar, (ViewGroup) uVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        jcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        jcVar.e = imageReceiver;
        jcVar.b = Math.max(jcVar.c.width(), jcVar.c.height()) / 2.0f;
        return jcVar;
    }

    public static ic d(bi.pb pbVar) {
        bi.o5 currentPeerView;
        bi.l4 l4Var;
        if (pbVar == null) {
            return null;
        }
        ic icVar = new ic(pbVar, 1);
        bi.fb fbVar = pbVar.n0;
        if (fbVar == null || (currentPeerView = fbVar.getCurrentPeerView()) == null || (l4Var = currentPeerView.c1) == null) {
            return null;
        }
        bi.db dbVar = pbVar.s;
        float x10 = dbVar == null ? 0.0f : dbVar.getX();
        bi.db dbVar2 = pbVar.s;
        float y3 = dbVar2 != null ? dbVar2.getY() : 0.0f;
        icVar.c.set(l4Var.getX() + currentPeerView.getX() + pbVar.X + x10 + pbVar.v.getLeft(), l4Var.getY() + currentPeerView.getY() + pbVar.W + y3 + pbVar.v.getTop(), (((x10 + pbVar.X) + pbVar.v.getRight()) - (pbVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - l4Var.getRight()), (((y3 + pbVar.W) + pbVar.v.getBottom()) - (pbVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - l4Var.getBottom()));
        icVar.a = 1;
        icVar.b = AndroidUtilities.dp(8.0f);
        bi.o5 t10 = pbVar.t();
        if (t10 != null) {
            icVar.f = t10.c1;
        }
        return icVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
