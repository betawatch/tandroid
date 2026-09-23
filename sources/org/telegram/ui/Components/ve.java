package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ve extends ah {
    public final Rect x;
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity) {
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
        Drawable drawable = getCurrentState() == yg.b ? chatActivityEnterView.N3 : chatActivityEnterView.M3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
