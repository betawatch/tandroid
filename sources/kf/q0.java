package kf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public q0(int i10, float f10) {
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
