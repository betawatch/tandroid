package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class na {
    public float b;
    public org.telegram.ui.Cells.b7 d;
    public ImageReceiver e;
    public fi.e3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static la b(org.telegram.ui.Cells.c7 c7Var) {
        if (c7Var == null) {
            return null;
        }
        org.telegram.ui.Components.i9 imageView = c7Var.getImageView();
        la laVar = new la(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float f10 = i7;
        float f11 = iArr[1];
        float width = imageView.getWidth() + i7;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = laVar.c;
        rectF.set(f10, f11, width, height);
        laVar.d = new org.telegram.ui.Cells.b7(imageView.getContext(), null, false, R.drawable.large_repost_story, c7Var.E);
        laVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return laVar;
    }

    public static ma c(fi.p pVar) {
        if (pVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = pVar.r;
        if (pVar.getRootView() == null) {
            return null;
        }
        float f10 = imageReceiver.N0;
        ma maVar = new ma(pVar, f10 / 2.0f);
        float[] fArr = new float[2];
        pVar.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
        float f11 = r5[0] + fArr[0] + imageReceiver.L0;
        float f12 = r5[1] + fArr[1] + imageReceiver.M0;
        maVar.c.set(f11, f12, f11 + f10, f10 + f12);
        maVar.e = imageReceiver;
        maVar.b = Math.max(maVar.c.width(), maVar.c.height()) / 2.0f;
        return maVar;
    }

    public static la d(fi.i9 i9Var) {
        fi.b4 currentPeerView;
        fi.e3 e3Var;
        if (i9Var == null) {
            return null;
        }
        la laVar = new la(i9Var, 1);
        fi.y8 y8Var = i9Var.o0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (e3Var = currentPeerView.M0) == null) {
            return null;
        }
        fi.w8 w8Var = i9Var.s;
        float x10 = w8Var == null ? 0.0f : w8Var.getX();
        fi.w8 w8Var2 = i9Var.s;
        float y10 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        laVar.c.set(e3Var.getX() + currentPeerView.getX() + i9Var.Y + x10 + i9Var.w.getLeft(), e3Var.getY() + currentPeerView.getY() + i9Var.X + y10 + i9Var.w.getTop(), (((x10 + i9Var.Y) + i9Var.w.getRight()) - (i9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - e3Var.getRight()), (((y10 + i9Var.X) + i9Var.w.getBottom()) - (i9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - e3Var.getBottom()));
        laVar.a = 1;
        laVar.b = org.telegram.messenger.g0.L(8.0f);
        fi.b4 z10 = i9Var.z();
        if (z10 != null) {
            laVar.f = z10.M0;
        }
        return laVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
