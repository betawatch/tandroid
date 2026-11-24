// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fw8 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw8 b;

    public /* synthetic */ fw8(gw8 gw8Var, byte b) {
        this.a = b;
        this.b = gw8Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        gw8 gw8Var = this.b;
        switch (b) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                outline.setRoundRect(Math.round(gw8Var.n - translationX), Math.round(gw8Var.r - translationY), Math.round(gw8Var.s - translationX), Math.round(gw8Var.w - translationY), gw8Var.x);
                break;
            default:
                int height = view.getHeight();
                outline.setRoundRect(gw8Var.b0, gw8Var.c0, view.getWidth() - gw8Var.b0, view.getHeight() - gw8Var.d0, ((height - r3) - gw8Var.d0) / 2.0f);
                break;
        }
    }
}
