package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dq;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class t1 extends View {
    public final /* synthetic */ int a = 1;
    public final dq b;

    public t1(Context context) {
        super(context);
        this.b = new dq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                dq dqVar = this.b;
                dqVar.setBounds(dp, dp, width, height);
                dqVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                dq dqVar2 = this.b;
                dqVar2.setBounds(0, 0, width2, height2);
                dqVar2.setAlpha(255);
                dqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public t1(Activity activity) {
        super(activity);
        this.b = new dq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.m5, false));
    }
}
