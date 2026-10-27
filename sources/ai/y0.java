package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ y0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                z0 z0Var = this.b;
                outline.setRoundRect(Math.round(z0Var.n - translationX), Math.round(z0Var.r - translationY), Math.round(z0Var.s - translationX), Math.round(z0Var.v - translationY), z0Var.w);
                break;
            default:
                int height = view.getHeight();
                z0 z0Var2 = this.b;
                outline.setRoundRect(z0Var2.a0, z0Var2.b0, view.getWidth() - z0Var2.a0, view.getHeight() - z0Var2.c0, ((height - r4) - z0Var2.c0) / 2.0f);
                break;
        }
    }
}
