package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class ib {
    public float b;
    public org.telegram.ui.Cells.c7 d;
    public ImageReceiver e;
    public fi.c3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static gb b(org.telegram.ui.Cells.d7 d7Var) {
        if (d7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = d7Var.getImageView();
        gb gbVar = new gb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float f10 = i7;
        float f11 = iArr[1];
        float width = imageView.getWidth() + i7;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = gbVar.c;
        rectF.set(f10, f11, width, height);
        gbVar.d = new org.telegram.ui.Cells.c7(imageView.getContext(), null, false, R.drawable.large_repost_story, d7Var.E);
        gbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return gbVar;
    }

    public static hb c(fi.p pVar) {
        if (pVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = pVar.r;
        if (pVar.getRootView() == null) {
            return null;
        }
        float f10 = imageReceiver.N0;
        hb hbVar = new hb(pVar, f10 / 2.0f);
        float[] fArr = new float[2];
        pVar.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
        float f11 = r5[0] + fArr[0] + imageReceiver.L0;
        float f12 = r5[1] + fArr[1] + imageReceiver.M0;
        hbVar.c.set(f11, f12, f11 + f10, f10 + f12);
        hbVar.e = imageReceiver;
        hbVar.b = Math.max(hbVar.c.width(), hbVar.c.height()) / 2.0f;
        return hbVar;
    }

    public static gb d(fi.f9 f9Var) {
        fi.z3 currentPeerView;
        fi.c3 c3Var;
        if (f9Var == null) {
            return null;
        }
        gb gbVar = new gb(f9Var, 1);
        fi.v8 v8Var = f9Var.o0;
        if (v8Var == null || (currentPeerView = v8Var.getCurrentPeerView()) == null || (c3Var = currentPeerView.M0) == null) {
            return null;
        }
        fi.t8 t8Var = f9Var.s;
        float x10 = t8Var == null ? 0.0f : t8Var.getX();
        fi.t8 t8Var2 = f9Var.s;
        float y10 = t8Var2 != null ? t8Var2.getY() : 0.0f;
        gbVar.c.set(c3Var.getX() + currentPeerView.getX() + f9Var.Y + x10 + f9Var.w.getLeft(), c3Var.getY() + currentPeerView.getY() + f9Var.X + y10 + f9Var.w.getTop(), (((x10 + f9Var.Y) + f9Var.w.getRight()) - (f9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - c3Var.getRight()), (((y10 + f9Var.X) + f9Var.w.getBottom()) - (f9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - c3Var.getBottom()));
        gbVar.a = 1;
        gbVar.b = org.telegram.messenger.g0.L(8.0f);
        fi.z3 z10 = f9Var.z();
        if (z10 != null) {
            gbVar.f = z10.M0;
        }
        return gbVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
