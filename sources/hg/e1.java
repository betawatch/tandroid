package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.h9;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class e1 extends View {
    public final Drawable a;
    public final ImageReceiver b;

    public e1(f1 f1Var, Context context) {
        super(context);
        this.a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        h9 h9Var = new h9((d6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        h9Var.r(f1Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(f1Var.getUserConfig().getCurrentUser(), h9Var);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(62.0f);
        int dp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, dp, dp2);
        drawable.draw(canvas);
        int dp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setRoundRadius(dp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), TLObject.FLAG_30));
    }
}
