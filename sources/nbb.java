// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class nbb {
    public float b;
    public mea d;
    public ImageReceiver e;
    public u58 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static lbb b(nea neaVar) {
        if (neaVar == null) {
            return null;
        }
        de0 imageView = neaVar.getImageView();
        lbb lbbVar = new lbb(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float f = i;
        float f2 = iArr[1];
        float width = imageView.getWidth() + i;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = lbbVar.c;
        rectF.set(f, f2, width, height);
        lbbVar.d = new mea(imageView.getContext(), null, false, R.drawable.large_repost_story, neaVar.E);
        lbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return lbbVar;
    }

    public static mbb c(og3 og3Var) {
        if (og3Var == null) {
            return null;
        }
        ImageReceiver imageReceiver = og3Var.r;
        if (og3Var.getRootView() == null) {
            return null;
        }
        float f = imageReceiver.N0;
        mbb mbbVar = new mbb(og3Var, f / 2.0f);
        float[] fArr = new float[2];
        og3Var.getRootView().getLocationOnScreen(new int[2]);
        hl.p1(og3Var, (ViewGroup) og3Var.getRootView(), fArr);
        float f2 = r5[0] + fArr[0] + imageReceiver.L0;
        float f3 = r5[1] + fArr[1] + imageReceiver.M0;
        RectF rectF = mbbVar.c;
        rectF.set(f2, f3, f2 + f, f + f3);
        mbbVar.e = imageReceiver;
        mbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return mbbVar;
    }

    public static lbb d(lcb lcbVar) {
        o68 currentPeerView;
        u58 u58Var;
        if (lcbVar == null) {
            return null;
        }
        lbb lbbVar = new lbb(lcbVar, (byte) 1);
        bcb bcbVar = lcbVar.o0;
        if (bcbVar == null || (currentPeerView = bcbVar.getCurrentPeerView()) == null || (u58Var = currentPeerView.M0) == null) {
            return null;
        }
        zbb zbbVar = lcbVar.s;
        float x = zbbVar == null ? 0.0f : zbbVar.getX();
        zbb zbbVar2 = lcbVar.s;
        float y = zbbVar2 != null ? zbbVar2.getY() : 0.0f;
        lbbVar.c.set(u58Var.getX() + currentPeerView.getX() + lcbVar.Y + x + lcbVar.w.getLeft(), u58Var.getY() + currentPeerView.getY() + lcbVar.X + y + lcbVar.w.getTop(), (((x + lcbVar.Y) + lcbVar.w.getRight()) - (lcbVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - u58Var.getRight()), (((y + lcbVar.X) + lcbVar.w.getBottom()) - (lcbVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - u58Var.getBottom()));
        lbbVar.a = true;
        lbbVar.b = hl.L(8.0f);
        o68 w = lcbVar.w();
        if (w != null) {
            lbbVar.f = w.M0;
        }
        return lbbVar;
    }

    public abstract void e();

    public abstract void f(boolean z);

    public void a(Canvas canvas, float f) {
    }
}
