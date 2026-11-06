package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ee extends jg {
    public final Rect F;
    public final /* synthetic */ ChatActivityEnterView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.G = chatActivityEnterView;
        this.F = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        if (!chatActivityEnterView.a1) {
            super.draw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, measuredHeight);
        rect.inset(org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(7.5f));
        Drawable drawable = getCurrentState() == hg.b ? chatActivityEnterView.O3 : chatActivityEnterView.N3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
