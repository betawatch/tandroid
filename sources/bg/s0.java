package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class s0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public s0(int i7, float f10) {
        this.a = i7;
        this.b = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i7 = this.a;
        int height = view.getHeight() - i7;
        float f10 = this.b;
        int i10 = this.a;
        outline.setRoundRect(i10, i10, width - i7, height, f10);
    }
}
