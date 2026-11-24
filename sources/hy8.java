// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hy8 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iy8 b;

    public /* synthetic */ hy8(iy8 iy8Var, byte b) {
        this.a = b;
        this.b = iy8Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        iy8 iy8Var = this.b;
        switch (b) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                outline.setRoundRect(Math.round(iy8Var.n - translationX), Math.round(iy8Var.r - translationY), Math.round(iy8Var.s - translationX), Math.round(iy8Var.w - translationY), iy8Var.x);
                break;
            default:
                int height = view.getHeight();
                outline.setRoundRect(iy8Var.b0, iy8Var.c0, view.getWidth() - iy8Var.b0, view.getHeight() - iy8Var.d0, ((height - r3) - iy8Var.d0) / 2.0f);
                break;
        }
    }
}
