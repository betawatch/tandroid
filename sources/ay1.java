// default package

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay1 implements yv4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ ay1(c cVar, FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = frameLayout;
    }

    @Override // yv4
    public final void a(Canvas canvas) {
        wq1 wq1Var;
        byte b = this.a;
        FrameLayout frameLayout = this.c;
        c cVar = this.b;
        cVar.getClass();
        switch (b) {
            case 0:
                frameLayout.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                wma wmaVar = chatActivityEnterView.b2;
                wmaVar.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r4[0] - r0[0], r4[1] - r0[1]);
                Drawable backgroundImage = wmaVar.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                zu1 zu1Var = chatActivityEnterView.E3;
                wq1Var = zu1Var != null ? zu1Var.A0 : null;
                if (wq1Var != null && wq1Var.getWidth() > 0) {
                    canvas.translate(wq1Var.getX(), wq1Var.getY());
                    wq1Var.draw(canvas);
                }
                canvas.restore();
                break;
            default:
                frameLayout.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                wma wmaVar2 = chatActivityEnterView2.b2;
                wmaVar2.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r4[0] - r0[0], r4[1] - r0[1]);
                Drawable backgroundImage2 = wmaVar2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                zu1 zu1Var2 = chatActivityEnterView2.E3;
                wq1Var = zu1Var2 != null ? zu1Var2.A0 : null;
                if (wq1Var != null && wq1Var.getWidth() > 0) {
                    canvas.translate(wq1Var.getX(), wq1Var.getY());
                    wq1Var.draw(canvas);
                }
                canvas.restore();
                break;
        }
    }
}
