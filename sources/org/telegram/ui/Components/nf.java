package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements bi.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ nf(qf qfVar, FrameLayout frameLayout, int i7) {
        this.a = i7;
        this.b = qfVar;
        this.c = frameLayout;
    }

    @Override // bi.a1
    public final void a(Canvas canvas) {
        switch (this.a) {
            case 0:
                qf qfVar = this.b;
                qfVar.getClass();
                this.c.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                cu0 cu0Var = chatActivityEnterView.c2;
                cu0Var.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r2[0], r1[1] - r2[1]);
                Drawable backgroundImage = cu0Var.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                org.telegram.ui.bj bjVar = bnVar != null ? bnVar.A0 : null;
                if (bjVar != null && bjVar.getWidth() > 0) {
                    canvas.translate(bjVar.getX(), bjVar.getY());
                    bjVar.draw(canvas);
                }
                canvas.restore();
                break;
            default:
                qf qfVar2 = this.b;
                qfVar2.getClass();
                this.c.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView2 = qfVar2.a;
                cu0 cu0Var2 = chatActivityEnterView2.c2;
                cu0Var2.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r2[0], r1[1] - r2[1]);
                Drawable backgroundImage2 = cu0Var2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
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
