package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pe extends ah {
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
        int i7 = ChatActivityEnterView.s7;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.i0()) {
            if (chatActivityEnterView.p1 == null) {
                chatActivityEnterView.p1 = getResources().getDrawable(R.drawable.input_dictation).mutate();
                chatActivityEnterView.p1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int L = org.telegram.messenger.g0.L(12.0f);
            chatActivityEnterView.p1.setBounds(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
            chatActivityEnterView.p1.draw(canvas);
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
        Drawable drawable = getCurrentState() == yg.b ? chatActivityEnterView.E4 : chatActivityEnterView.D4;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
