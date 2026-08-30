package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class me extends qg {
    public final Rect x;
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.y = chatActivityEnterView;
        this.x = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.y;
        if (!chatActivityEnterView.X0) {
            super.draw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.x;
        rect.set(0, 0, measuredWidth, measuredHeight);
        rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
        Drawable drawable = getCurrentState() == og.b ? chatActivityEnterView.K3 : chatActivityEnterView.J3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
