package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ie extends mg {
    public final Rect x;
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.y = chatActivityEnterView;
        this.x = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.y;
        if (!chatActivityEnterView.W0) {
            super.draw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.x;
        rect.set(0, 0, measuredWidth, measuredHeight);
        rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
        Drawable drawable = getCurrentState() == kg.b ? chatActivityEnterView.J3 : chatActivityEnterView.I3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
