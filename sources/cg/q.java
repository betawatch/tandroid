package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q extends ScrollView {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 e0Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = e0Var;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y10 = this.a.getY() + AndroidUtilities.dp(1.0f);
        int dp = AndroidUtilities.dp(36.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getMeasuredWidth() - dp) / 2.0f, y10, (getMeasuredWidth() + dp) / 2.0f, AndroidUtilities.dp(4.0f) + y10);
        j6.t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), j6.t0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.b.b.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
    }
}
