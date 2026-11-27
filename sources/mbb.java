// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class mbb {
    public float b;
    public mea d;
    public ImageReceiver e;
    public t58 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static kbb b(nea neaVar) {
        if (neaVar == null) {
            return null;
        }
        de0 imageView = neaVar.getImageView();
        kbb kbbVar = new kbb(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float f = i;
        float f2 = iArr[1];
        float width = imageView.getWidth() + i;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = kbbVar.c;
        rectF.set(f, f2, width, height);
        kbbVar.d = new mea(imageView.getContext(), null, false, R.drawable.large_repost_story, neaVar.E);
        kbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return kbbVar;
    }

    public static lbb c(og3 og3Var) {
        if (og3Var == null) {
            return null;
        }
        ImageReceiver imageReceiver = og3Var.r;
        if (og3Var.getRootView() == null) {
            return null;
        }
        float f = imageReceiver.N0;
        lbb lbbVar = new lbb(og3Var, f / 2.0f);
        float[] fArr = new float[2];
        og3Var.getRootView().getLocationOnScreen(new int[2]);
        hl.p1(og3Var, (ViewGroup) og3Var.getRootView(), fArr);
        float f2 = r5[0] + fArr[0] + imageReceiver.L0;
        float f3 = r5[1] + fArr[1] + imageReceiver.M0;
        RectF rectF = lbbVar.c;
        rectF.set(f2, f3, f2 + f, f + f3);
        lbbVar.e = imageReceiver;
        lbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return lbbVar;
    }

    public static kbb d(lcb lcbVar) {
        o68 currentPeerView;
        t58 t58Var;
        if (lcbVar == null) {
            return null;
        }
        kbb kbbVar = new kbb(lcbVar, (byte) 1);
        acb acbVar = lcbVar.o0;
        if (acbVar == null || (currentPeerView = acbVar.getCurrentPeerView()) == null || (t58Var = currentPeerView.M0) == null) {
            return null;
        }
        ybb ybbVar = lcbVar.s;
        float x = ybbVar == null ? 0.0f : ybbVar.getX();
        ybb ybbVar2 = lcbVar.s;
        float y = ybbVar2 != null ? ybbVar2.getY() : 0.0f;
        kbbVar.c.set(t58Var.getX() + currentPeerView.getX() + lcbVar.Y + x + lcbVar.w.getLeft(), t58Var.getY() + currentPeerView.getY() + lcbVar.X + y + lcbVar.w.getTop(), (((x + lcbVar.Y) + lcbVar.w.getRight()) - (lcbVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - t58Var.getRight()), (((y + lcbVar.X) + lcbVar.w.getBottom()) - (lcbVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - t58Var.getBottom()));
        kbbVar.a = true;
        kbbVar.b = hl.L(8.0f);
        o68 w = lcbVar.w();
        if (w != null) {
            kbbVar.f = w.M0;
        }
        return kbbVar;
    }

    public abstract void e();

    public abstract void f(boolean z);

    public void a(Canvas canvas, float f) {
    }
}
