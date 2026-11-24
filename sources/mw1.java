// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mw1 extends qy1 {
    public final Rect G;
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw1(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.H = chatActivityEnterView;
        this.G = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.g0()) {
            if (chatActivityEnterView.p1 == null) {
                Drawable mutate = getResources().getDrawable(R.drawable.input_dictation).mutate();
                chatActivityEnterView.p1 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int L = gl.L(12.0f);
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
        rect.inset(gl.L(7.5f), gl.L(7.5f));
        Drawable drawable = getCurrentState() == oy1.b ? chatActivityEnterView.D4 : chatActivityEnterView.C4;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
