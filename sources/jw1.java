// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jw1 implements gj {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ jw1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a() {
        int i = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ValueAnimator valueAnimator = chatActivityEnterView.B5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.D5 = 0.0f;
        chatActivityEnterView.C5 = 0.0f;
        ry8 ry8Var = chatActivityEnterView.h1;
        if (ry8Var != null) {
            ry8Var.setRotation(0.0f);
            chatActivityEnterView.h1.setPivotX(r1.getWidth() / 2.0f);
            chatActivityEnterView.h1.setPivotY(r1.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.z5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        kx1 kx1Var = chatActivityEnterView.y5;
        chatActivityEnterView.y5 = null;
        if (kx1Var != null) {
            kx1Var.run();
        }
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean v1 = chatActivityEnterView.v1(z, i, i2, 0L, true);
        j47 j47Var = chatActivityEnterView.M0;
        if (j47Var != null) {
            j47Var.f(!v1);
            chatActivityEnterView.M0 = null;
        }
    }
}
