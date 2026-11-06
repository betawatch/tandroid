package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class qa {
    public float b;
    public org.telegram.ui.Cells.c7 d;
    public ImageReceiver e;
    public di.j3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static oa b(org.telegram.ui.Cells.d7 d7Var) {
        if (d7Var == null) {
            return null;
        }
        org.telegram.ui.Components.l9 imageView = d7Var.getImageView();
        oa oaVar = new oa(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float f10 = i7;
        float f11 = iArr[1];
        float width = imageView.getWidth() + i7;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = oaVar.c;
        rectF.set(f10, f11, width, height);
        oaVar.d = new org.telegram.ui.Cells.c7(imageView.getContext(), null, false, R.drawable.large_repost_story, d7Var.D);
        oaVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return oaVar;
    }

    public static pa c(di.p pVar) {
        if (pVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = pVar.r;
        if (pVar.getRootView() == null) {
            return null;
        }
        float f10 = imageReceiver.M0;
        pa paVar = new pa(pVar, f10 / 2.0f);
        float[] fArr = new float[2];
        pVar.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
        float f11 = r5[0] + fArr[0] + imageReceiver.K0;
        float f12 = r5[1] + fArr[1] + imageReceiver.L0;
        paVar.c.set(f11, f12, f11 + f10, f10 + f12);
        paVar.e = imageReceiver;
        paVar.b = Math.max(paVar.c.width(), paVar.c.height()) / 2.0f;
        return paVar;
    }

    public static oa d(di.p9 p9Var) {
        di.i4 currentPeerView;
        di.j3 j3Var;
        if (p9Var == null) {
            return null;
        }
        oa oaVar = new oa(p9Var, 1);
        di.f9 f9Var = p9Var.n0;
        if (f9Var == null || (currentPeerView = f9Var.getCurrentPeerView()) == null || (j3Var = currentPeerView.L0) == null) {
            return null;
        }
        di.d9 d9Var = p9Var.s;
        float x10 = d9Var == null ? 0.0f : d9Var.getX();
        di.d9 d9Var2 = p9Var.s;
        float y10 = d9Var2 != null ? d9Var2.getY() : 0.0f;
        oaVar.c.set(j3Var.getX() + currentPeerView.getX() + p9Var.X + x10 + p9Var.w.getLeft(), j3Var.getY() + currentPeerView.getY() + p9Var.W + y10 + p9Var.w.getTop(), (((x10 + p9Var.X) + p9Var.w.getRight()) - (p9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((y10 + p9Var.W) + p9Var.w.getBottom()) - (p9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
        oaVar.a = 1;
        oaVar.b = org.telegram.messenger.g0.L(8.0f);
        di.i4 z9 = p9Var.z();
        if (z9 != null) {
            oaVar.f = z9.L0;
        }
        return oaVar;
    }

    public abstract void e();

    public abstract void f(boolean z9);

    public void a(Canvas canvas, float f10) {
    }
}
