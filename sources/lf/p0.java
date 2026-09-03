package lf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
