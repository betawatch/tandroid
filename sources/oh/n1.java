package oh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n1 extends View {
    public final /* synthetic */ int a = 1;
    public final tp b;

    public n1(Context context) {
        super(context);
        this.b = new tp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                tp tpVar = this.b;
                tpVar.setBounds(dp, dp, width, height);
                tpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                tp tpVar2 = this.b;
                tpVar2.setBounds(0, 0, width2, height2);
                tpVar2.setAlpha(255);
                tpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public n1(Activity activity) {
        super(activity);
        this.b = new tp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.m5, false));
    }
}
