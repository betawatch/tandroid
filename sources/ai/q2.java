package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class q2 extends View {
    public final /* synthetic */ int a = 1;
    public final up b;

    public q2(Context context) {
        super(context);
        this.b = new up(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                up upVar = this.b;
                upVar.setBounds(dp, dp, width, height);
                upVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                up upVar2 = this.b;
                upVar2.setBounds(0, 0, width2, height2);
                upVar2.setAlpha(255);
                upVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public q2(Activity activity) {
        super(activity);
        this.b = new up(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.m5, false));
    }
}
