package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements bi.w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ ef(gf gfVar, FrameLayout frameLayout, int i7) {
        this.a = i7;
        this.b = gfVar;
        this.c = frameLayout;
    }

    @Override // bi.w0
    public final void a(Canvas canvas) {
        switch (this.a) {
            case 0:
                gf gfVar = this.b;
                gfVar.getClass();
                this.c.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView = gfVar.a;
                st0 st0Var = chatActivityEnterView.U1;
                st0Var.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r2[0], r1[1] - r2[1]);
                Drawable backgroundImage = st0Var.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                org.telegram.ui.an anVar = chatActivityEnterView.x3;
                org.telegram.ui.aj ajVar = anVar != null ? anVar.A0 : null;
                if (ajVar != null && ajVar.getWidth() > 0) {
                    canvas.translate(ajVar.getX(), ajVar.getY());
                    ajVar.draw(canvas);
                }
                canvas.restore();
                break;
            default:
                gf gfVar2 = this.b;
                gfVar2.getClass();
                this.c.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView2 = gfVar2.a;
                st0 st0Var2 = chatActivityEnterView2.U1;
                st0Var2.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r2[0], r1[1] - r2[1]);
                Drawable backgroundImage2 = st0Var2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                org.telegram.ui.an anVar2 = chatActivityEnterView2.x3;
                org.telegram.ui.aj ajVar2 = anVar2 != null ? anVar2.A0 : null;
                if (ajVar2 != null && ajVar2.getWidth() > 0) {
                    canvas.translate(ajVar2.getX(), ajVar2.getY());
                    ajVar2.draw(canvas);
                }
                canvas.restore();
                break;
        }
    }
}
