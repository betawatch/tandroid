package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ i0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.b;
                outline.setRoundRect(Math.round(j0Var.n - translationX), Math.round(j0Var.r - translationY), Math.round(j0Var.s - translationX), Math.round(j0Var.w - translationY), j0Var.x);
                break;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.b;
                outline.setRoundRect(j0Var2.b0, j0Var2.c0, view.getWidth() - j0Var2.b0, view.getHeight() - j0Var2.d0, ((height - r4) - j0Var2.d0) / 2.0f);
                break;
        }
    }
}
