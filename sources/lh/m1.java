package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m1 extends View {
    public final /* synthetic */ int a = 1;
    public final np b;

    public m1(Context context) {
        super(context);
        this.b = new np(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                np npVar = this.b;
                npVar.setBounds(dp, dp, width, height);
                npVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                np npVar2 = this.b;
                npVar2.setBounds(0, 0, width2, height2);
                npVar2.setAlpha(255);
                npVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public m1(Activity activity) {
        super(activity);
        this.b = new np(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.m5, false));
    }
}
