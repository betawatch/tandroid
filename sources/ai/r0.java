package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                s0 s0Var = this.b;
                outline.setRoundRect(Math.round(s0Var.n - translationX), Math.round(s0Var.r - translationY), Math.round(s0Var.s - translationX), Math.round(s0Var.w - translationY), s0Var.x);
                break;
            default:
                int height = view.getHeight();
                s0 s0Var2 = this.b;
                outline.setRoundRect(s0Var2.a0, s0Var2.b0, view.getWidth() - s0Var2.a0, view.getHeight() - s0Var2.c0, ((height - r4) - s0Var2.c0) / 2.0f);
                break;
        }
    }
}
