package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n5 extends View {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.kp b;

    public n5(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int width = getWidth();
                int height = getHeight();
                org.telegram.ui.Components.kp kpVar = this.b;
                kpVar.setBounds(0, 0, width, height);
                kpVar.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.m5, false));
                kpVar.setAlpha(org.telegram.messenger.at.e4);
                kpVar.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
            default:
                int L = org.telegram.messenger.i0.L(1.0f);
                int width2 = (getWidth() - L) - L;
                int height2 = (getHeight() - L) - L;
                org.telegram.ui.Components.kp kpVar2 = this.b;
                kpVar2.setBounds(L, L, width2, height2);
                kpVar2.draw(canvas);
                invalidate();
                break;
        }
    }

    public n5(Activity activity) {
        super(activity);
        this.b = new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.m5, false));
    }
}
