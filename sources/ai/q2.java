package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vp;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class q2 extends View {
    public final /* synthetic */ int a = 1;
    public final vp b;

    public q2(Context context) {
        super(context);
        this.b = new vp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                vp vpVar = this.b;
                vpVar.setBounds(dp, dp, width, height);
                vpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                vp vpVar2 = this.b;
                vpVar2.setBounds(0, 0, width2, height2);
                vpVar2.setAlpha(255);
                vpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public q2(Activity activity) {
        super(activity);
        this.b = new vp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.m5, false));
    }
}
