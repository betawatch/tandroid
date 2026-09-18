package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class te extends zg {
    public final Rect x;
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.y = chatActivityEnterView;
        this.x = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.y;
        if (!chatActivityEnterView.a1) {
            super.draw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.x;
        rect.set(0, 0, measuredWidth, measuredHeight);
        rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
        Drawable drawable = getCurrentState() == xg.b ? chatActivityEnterView.N3 : chatActivityEnterView.M3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
