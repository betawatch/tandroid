package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wd extends jg {
    public final /* synthetic */ ChatActivityEnterView F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.F = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.jg, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.F;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() == null || chatActivityEnterView.p1 == null || chatActivityEnterView.W0 || this.x || org.telegram.messenger.ui.b0(chatActivityEnterView.Q).u0[0].isEmpty() || paint == null) {
            return;
        }
        canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
    }
}
