// default package

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lx1 implements ut4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ lx1(c cVar, FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = frameLayout;
    }

    @Override // ut4
    public final void b(Canvas canvas) {
        jq1 jq1Var;
        byte b = this.a;
        FrameLayout frameLayout = this.c;
        c cVar = this.b;
        cVar.getClass();
        switch (b) {
            case 0:
                frameLayout.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                cja cjaVar = chatActivityEnterView.c2;
                cjaVar.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r4[0] - r0[0], r4[1] - r0[1]);
                Drawable backgroundImage = cjaVar.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                mu1 mu1Var = chatActivityEnterView.F3;
                jq1Var = mu1Var != null ? mu1Var.A0 : null;
                if (jq1Var != null && jq1Var.getWidth() > 0) {
                    canvas.translate(jq1Var.getX(), jq1Var.getY());
                    jq1Var.draw(canvas);
                }
                canvas.restore();
                break;
            default:
                frameLayout.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                cja cjaVar2 = chatActivityEnterView2.c2;
                cjaVar2.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r4[0] - r0[0], r4[1] - r0[1]);
                Drawable backgroundImage2 = cjaVar2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                mu1 mu1Var2 = chatActivityEnterView2.F3;
                jq1Var = mu1Var2 != null ? mu1Var2.A0 : null;
                if (jq1Var != null && jq1Var.getWidth() > 0) {
                    canvas.translate(jq1Var.getX(), jq1Var.getY());
                    jq1Var.draw(canvas);
                }
                canvas.restore();
                break;
        }
    }
}
