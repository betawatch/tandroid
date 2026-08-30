package lf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public p0(int i10, float f10) {
        this.a = i10;
        this.b = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.a;
        int height = view.getHeight() - i10;
        float f10 = this.b;
        int i11 = this.a;
        outline.setRoundRect(i11, i11, width - i10, height, f10);
    }
}
