package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class t0 extends ViewOutlineProvider {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public t0(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = z10;
        this.b = i7;
        this.c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z10 = this.a;
        int i7 = this.b;
        outline.setRoundRect(-(z10 ? 0 : i7), -(this.c ? 0 : i7), width + (this.d ? 0 : i7), height + (this.e ? 0 : i7), i7);
    }
}
