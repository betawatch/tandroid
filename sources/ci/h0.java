package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ h0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                i0 i0Var = this.b;
                outline.setRoundRect(Math.round(i0Var.n - translationX), Math.round(i0Var.r - translationY), Math.round(i0Var.s - translationX), Math.round(i0Var.w - translationY), i0Var.x);
                break;
            default:
                int height = view.getHeight();
                i0 i0Var2 = this.b;
                outline.setRoundRect(i0Var2.b0, i0Var2.c0, view.getWidth() - i0Var2.b0, view.getHeight() - i0Var2.d0, ((height - r4) - i0Var2.d0) / 2.0f);
                break;
        }
    }
}
