package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p5 extends View {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.zp b;

    public p5(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.zp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int width = getWidth();
                int height = getHeight();
                org.telegram.ui.Components.zp zpVar = this.b;
                zpVar.setBounds(0, 0, width, height);
                zpVar.setAlpha(255);
                zpVar.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
            default:
                int dp = AndroidUtilities.dp(1.0f);
                int width2 = (getWidth() - dp) - dp;
                int height2 = (getHeight() - dp) - dp;
                org.telegram.ui.Components.zp zpVar2 = this.b;
                zpVar2.setBounds(dp, dp, width2, height2);
                zpVar2.draw(canvas);
                invalidate();
                break;
        }
    }

    public p5(Activity activity) {
        super(activity);
        this.b = new org.telegram.ui.Components.zp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m5, false));
    }
}
