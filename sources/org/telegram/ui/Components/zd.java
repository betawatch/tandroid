package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zd extends fg {
    public final Rect F;
    public final /* synthetic */ ChatActivityEnterView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
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
        rect.inset(org.telegram.messenger.i0.L(7.5f), org.telegram.messenger.i0.L(7.5f));
        Drawable drawable = getCurrentState() == dg.b ? chatActivityEnterView.O3 : chatActivityEnterView.N3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
