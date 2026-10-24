package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class s1 extends View {
    public final /* synthetic */ int a = 1;
    public final eq b;

    public s1(Context context) {
        super(context);
        this.b = new eq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                eq eqVar = this.b;
                eqVar.setBounds(dp, dp, width, height);
                eqVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                eq eqVar2 = this.b;
                eqVar2.setBounds(0, 0, width2, height2);
                eqVar2.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.m5, false));
                eqVar2.setAlpha(255);
                eqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public s1(Activity activity) {
        super(activity);
        this.b = new eq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.m5, false));
    }
}
