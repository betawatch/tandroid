package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class s1 extends View {
    public final /* synthetic */ int a = 1;
    public final gq b;

    public s1(Context context) {
        super(context);
        this.b = new gq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                gq gqVar = this.b;
                gqVar.setBounds(dp, dp, width, height);
                gqVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                gq gqVar2 = this.b;
                gqVar2.setBounds(0, 0, width2, height2);
                gqVar2.b(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.m5, false));
                gqVar2.setAlpha(255);
                gqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public s1(Activity activity) {
        super(activity);
        this.b = new gq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.m5, false));
    }
}
