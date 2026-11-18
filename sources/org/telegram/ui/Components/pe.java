package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pe extends yg {
    public final Rect G;
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.H = chatActivityEnterView;
        this.G = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.l1) {
            if (chatActivityEnterView.n1 == null) {
                chatActivityEnterView.n1 = getResources().getDrawable(R.drawable.input_dictation).mutate();
                chatActivityEnterView.n1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int L = org.telegram.messenger.g0.L(12.0f);
            chatActivityEnterView.n1.setBounds(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
            chatActivityEnterView.n1.draw(canvas);
            return;
        }
        if (!chatActivityEnterView.b1) {
            super.draw(canvas);
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Rect rect = this.G;
        rect.set(0, 0, measuredWidth2, measuredHeight2);
        rect.inset(org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(7.5f));
        Drawable drawable = getCurrentState() == wg.b ? chatActivityEnterView.C4 : chatActivityEnterView.B4;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
