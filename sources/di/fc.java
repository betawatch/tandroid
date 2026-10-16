package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class fc {
    public float b;
    public org.telegram.ui.Cells.e7 d;
    public ImageReceiver e;
    public bi.o4 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static dc b(org.telegram.ui.Cells.f7 f7Var) {
        if (f7Var == null) {
            return null;
        }
        org.telegram.ui.Components.z9 imageView = f7Var.getImageView();
        dc dcVar = new dc(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        dcVar.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        dcVar.d = new org.telegram.ui.Cells.e7(imageView.getContext(), null, false, f7Var.y);
        dcVar.b = Math.max(dcVar.c.width(), dcVar.c.height()) / 2.0f;
        return dcVar;
    }

    public static ec c(bi.u uVar) {
        if (uVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = uVar.r;
        if (uVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        ec ecVar = new ec(uVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        uVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(uVar, (ViewGroup) uVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        ecVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        ecVar.e = imageReceiver;
        ecVar.b = Math.max(ecVar.c.width(), ecVar.c.height()) / 2.0f;
        return ecVar;
    }

    public static dc d(bi.sb sbVar) {
        bi.q5 currentPeerView;
        bi.o4 o4Var;
        if (sbVar == null) {
            return null;
        }
        dc dcVar = new dc(sbVar, 1);
        bi.ib ibVar = sbVar.n0;
        if (ibVar == null || (currentPeerView = ibVar.getCurrentPeerView()) == null || (o4Var = currentPeerView.c1) == null) {
            return null;
        }
        bi.gb gbVar = sbVar.s;
        float x10 = gbVar == null ? 0.0f : gbVar.getX();
        bi.gb gbVar2 = sbVar.s;
        float y3 = gbVar2 != null ? gbVar2.getY() : 0.0f;
        dcVar.c.set(o4Var.getX() + currentPeerView.getX() + sbVar.X + x10 + sbVar.v.getLeft(), o4Var.getY() + currentPeerView.getY() + sbVar.W + y3 + sbVar.v.getTop(), (((x10 + sbVar.X) + sbVar.v.getRight()) - (sbVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - o4Var.getRight()), (((y3 + sbVar.W) + sbVar.v.getBottom()) - (sbVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - o4Var.getBottom()));
        dcVar.a = 1;
        dcVar.b = AndroidUtilities.dp(8.0f);
        bi.q5 t10 = sbVar.t();
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
