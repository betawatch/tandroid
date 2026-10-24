package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q2 extends View {
    public final /* synthetic */ r2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r2 r2Var, Context context) {
        super(context);
        this.a = r2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float clamp;
        r2 r2Var = this.a;
        if (r2Var.e == null) {
            return;
        }
        int b10 = r2Var.c.b();
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.D(6.0f, b10 - 1, AndroidUtilities.dp(7.0f) * b10);
        float f7 = r2Var.w + r2Var.v;
        if (dp < getMeasuredWidth()) {
            clamp = (getMeasuredWidth() - dp) / 2.0f;
        } else {
            float dp2 = AndroidUtilities.dp(4.0f);
            int dp3 = AndroidUtilities.dp(13.0f);
            clamp = dp2 - (Utilities.clamp(f7 - (((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3), Math.max(0, (b10 - (r10 * 2)) - 1), 0.0f) * dp3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < r2Var.e.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            k4.C1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + clamp + (AndroidUtilities.dp(13.0f) * i10), getMeasuredHeight() / 2.0f, (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(2.0f), k4.C1);
        }
        canvas.restore();
    }
}
