package ag;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i10) {
        this.a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(29.0f) + view.getHeight(), AndroidUtilities.dp(29.0f));
                break;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                break;
            case 5:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 7:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 8:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                break;
            case 9:
                outline.setRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), view.getMeasuredWidth() - AndroidUtilities.dp(1.0f), view.getMeasuredHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
                break;
            case 10:
                int i10 = AndroidUtilities.roundMessageSize;
                outline.setOval(0, 0, i10, i10);
                break;
            case 11:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                break;
            case 12:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                break;
            case 13:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                break;
            case 14:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 15:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 16:
                outline.setOval(0, 0, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
                break;
            case 17:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                break;
            case 18:
                outline.setRoundRect(0, AndroidUtilities.dp(50.0f), view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
                break;
            case 19:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                break;
            case 20:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * AndroidUtilities.dp(4.0f));
                break;
            case 21:
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                break;
            case 22:
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                break;
            case 23:
                float dp = AndroidUtilities.dp(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + dp), dp);
                break;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                break;
        }
    }
}
