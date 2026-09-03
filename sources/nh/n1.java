package nh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n1 extends View {
    public final /* synthetic */ int a = 1;
    public final qp b;

    public n1(Context context) {
        super(context);
        this.b = new qp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                qp qpVar = this.b;
                qpVar.setBounds(dp, dp, width, height);
                qpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                qp qpVar2 = this.b;
                qpVar2.setBounds(0, 0, width2, height2);
                qpVar2.setAlpha(255);
                qpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public n1(Activity activity) {
        super(activity);
        this.b = new qp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m5, false));
    }
}
