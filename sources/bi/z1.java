package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class z1 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ z1(int i10) {
        this.a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                break;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(29.0f) + view.getHeight(), AndroidUtilities.dp(29.0f));
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 5:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 7:
                outline.setRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), view.getMeasuredWidth() - AndroidUtilities.dp(1.0f), view.getMeasuredHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
                break;
            case 8:
                int i10 = AndroidUtilities.roundMessageSize;
                outline.setOval(0, 0, i10, i10);
                break;
            case 9:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                break;
            case 10:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                break;
            case 11:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                break;
            case 12:
                outline.setOval(0, 0, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
                break;
            case 13:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                break;
            case 14:
                outline.setRoundRect(0, AndroidUtilities.dp(50.0f), view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
                break;
            case 15:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                break;
            case 16:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * AndroidUtilities.dp(4.0f));
                break;
            case 17:
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                break;
            case 18:
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                break;
            case 19:
                float dp = AndroidUtilities.dp(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + dp), dp);
                break;
            case 20:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                break;
            case 21:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                break;
        }
    }
}
