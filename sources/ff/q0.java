package ff;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public q0(int i9, float f10) {
        this.a = i9;
        this.b = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i9 = this.a;
        int height = view.getHeight() - i9;
        float f10 = this.b;
        int i10 = this.a;
        outline.setRoundRect(i10, i10, width - i9, height, f10);
    }
}
