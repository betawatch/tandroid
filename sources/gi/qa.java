package gi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class qa {
    public float b;
    public org.telegram.ui.Cells.b7 d;
    public ImageReceiver e;
    public ei.m3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static oa b(org.telegram.ui.Cells.c7 c7Var) {
        if (c7Var == null) {
            return null;
        }
        org.telegram.ui.Components.k9 imageView = c7Var.getImageView();
        oa oaVar = new oa(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        float f10 = i3;
        float f11 = iArr[1];
        float width = imageView.getWidth() + i3;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = oaVar.c;
        rectF.set(f10, f11, width, height);
        oaVar.d = new org.telegram.ui.Cells.b7(imageView.getContext(), null, false, R.drawable.large_repost_story, c7Var.E);
        oaVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return oaVar;
    }

    public static pa c(ei.q qVar) {
        if (qVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = qVar.r;
        if (qVar.getRootView() == null) {
            return null;
        }
        float f10 = imageReceiver.N0;
        pa paVar = new pa(qVar, f10 / 2.0f);
        float[] fArr = new float[2];
        qVar.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(qVar, (ViewGroup) qVar.getRootView(), fArr);
        float f11 = r5[0] + fArr[0] + imageReceiver.L0;
        float f12 = r5[1] + fArr[1] + imageReceiver.M0;
        paVar.c.set(f11, f12, f11 + f10, f10 + f12);
        paVar.e = imageReceiver;
        paVar.b = Math.max(paVar.c.width(), paVar.c.height()) / 2.0f;
        return paVar;
    }

    public static oa d(ei.r9 r9Var) {
        ei.j4 currentPeerView;
        ei.m3 m3Var;
        if (r9Var == null) {
            return null;
        }
        oa oaVar = new oa(r9Var, 1);
        ei.g9 g9Var = r9Var.o0;
        if (g9Var == null || (currentPeerView = g9Var.getCurrentPeerView()) == null || (m3Var = currentPeerView.M0) == null) {
            return null;
        }
        ei.e9 e9Var = r9Var.s;
        float x10 = e9Var == null ? 0.0f : e9Var.getX();
        ei.e9 e9Var2 = r9Var.s;
        float y9 = e9Var2 != null ? e9Var2.getY() : 0.0f;
        oaVar.c.set(m3Var.getX() + currentPeerView.getX() + r9Var.Y + x10 + r9Var.w.getLeft(), m3Var.getY() + currentPeerView.getY() + r9Var.X + y9 + r9Var.w.getTop(), (((x10 + r9Var.Y) + r9Var.w.getRight()) - (r9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - m3Var.getRight()), (((y9 + r9Var.X) + r9Var.w.getBottom()) - (r9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - m3Var.getBottom()));
        oaVar.a = 1;
        oaVar.b = org.telegram.messenger.g0.L(8.0f);
        ei.j4 H = r9Var.H();
        if (H != null) {
            oaVar.f = H.M0;
        }
        return oaVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
