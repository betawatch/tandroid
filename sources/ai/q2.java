package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class q2 extends View {
    public final /* synthetic */ int a = 1;
    public final wp b;

    public q2(Context context) {
        super(context);
        this.b = new wp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                wp wpVar = this.b;
                wpVar.setBounds(dp, dp, width, height);
                wpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                wp wpVar2 = this.b;
                wpVar2.setBounds(0, 0, width2, height2);
                wpVar2.setAlpha(255);
                wpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public q2(Activity activity) {
        super(activity);
        this.b = new wp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.m5, false));
    }
}
