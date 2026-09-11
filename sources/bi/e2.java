package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class e2 extends View {
    public final /* synthetic */ int a = 1;
    public final sp b;

    public e2(Context context) {
        super(context);
        this.b = new sp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                sp spVar = this.b;
                spVar.setBounds(dp, dp, width, height);
                spVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                sp spVar2 = this.b;
                spVar2.setBounds(0, 0, width2, height2);
                spVar2.setAlpha(255);
                spVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public e2(Activity activity) {
        super(activity);
        this.b = new sp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m5, false));
    }
}
