package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t0 extends ViewOutlineProvider {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public t0(int i7, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = z9;
        this.b = i7;
        this.c = z10;
        this.d = z11;
        this.e = z12;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z9 = this.a;
        int i7 = this.b;
        outline.setRoundRect(-(z9 ? 0 : i7), -(this.c ? 0 : i7), width + (this.d ? 0 : i7), height + (this.e ? 0 : i7), i7);
    }
}
