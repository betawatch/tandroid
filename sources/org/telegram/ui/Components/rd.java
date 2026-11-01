package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rd extends fg {
    public final /* synthetic */ ChatActivityEnterView F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.F = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.fg, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.F;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() == null || chatActivityEnterView.p1 == null || chatActivityEnterView.W0 || this.x || org.telegram.messenger.vi.b0(chatActivityEnterView.Q).u0[0].isEmpty() || paint == null) {
            return;
        }
        canvas.drawCircle(org.telegram.messenger.i0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), paint);
    }
}
