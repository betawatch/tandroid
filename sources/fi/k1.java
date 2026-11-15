package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k1 extends View {
    public final /* synthetic */ int a = 1;
    public final lp b;

    public k1(Context context) {
        super(context);
        this.b = new lp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                int width = (getWidth() - L) - L;
                int height = (getHeight() - L) - L;
                lp lpVar = this.b;
                lpVar.setBounds(L, L, width, height);
                lpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                lp lpVar2 = this.b;
                lpVar2.setBounds(0, 0, width2, height2);
                lpVar2.b(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.m5, false));
                lpVar2.setAlpha(ns.e4);
                lpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public k1(Activity activity) {
        super(activity);
        this.b = new lp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.m5, false));
    }
}
