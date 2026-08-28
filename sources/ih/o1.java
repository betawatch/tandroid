package ih;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o1 extends View {
    public final /* synthetic */ int a = 1;
    public final jp b;

    public o1(Context context) {
        super(context);
        this.b = new jp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - dp) - dp;
                int height = (getHeight() - dp) - dp;
                jp jpVar = this.b;
                jpVar.setBounds(dp, dp, width, height);
                jpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                jp jpVar2 = this.b;
                jpVar2.setBounds(0, 0, width2, height2);
                jpVar2.setAlpha(255);
                jpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public o1(Activity activity) {
        super(activity);
        this.b = new jp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m5, false));
    }
}
