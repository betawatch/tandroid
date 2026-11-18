package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements bi.w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ mf(pf pfVar, FrameLayout frameLayout, int i7) {
        this.a = i7;
        this.b = pfVar;
        this.c = frameLayout;
    }

    @Override // bi.w0
    public final void a(Canvas canvas) {
        switch (this.a) {
            case 0:
                pf pfVar = this.b;
                pfVar.getClass();
                this.c.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView = pfVar.a;
                au0 au0Var = chatActivityEnterView.a2;
                au0Var.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r2[0], r1[1] - r2[1]);
                Drawable backgroundImage = au0Var.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                org.telegram.ui.bj bjVar = bnVar != null ? bnVar.A0 : null;
                if (bjVar != null && bjVar.getWidth() > 0) {
                    canvas.translate(bjVar.getX(), bjVar.getY());
                    bjVar.draw(canvas);
                }
                canvas.restore();
                break;
            default:
                pf pfVar2 = this.b;
                pfVar2.getClass();
                this.c.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView2 = pfVar2.a;
                au0 au0Var2 = chatActivityEnterView2.a2;
                au0Var2.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r2[0], r1[1] - r2[1]);
                Drawable backgroundImage2 = au0Var2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                org.telegram.ui.bn bnVar2 = chatActivityEnterView2.D3;
                org.telegram.ui.bj bjVar2 = bnVar2 != null ? bnVar2.A0 : null;
                if (bjVar2 != null && bjVar2.getWidth() > 0) {
                    canvas.translate(bjVar2.getX(), bjVar2.getY());
                    bjVar2.draw(canvas);
                }
                canvas.restore();
                break;
        }
    }
}
