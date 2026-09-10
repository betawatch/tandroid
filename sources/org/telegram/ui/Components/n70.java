package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                w70 w70Var = (w70) this.b;
                if (w70Var.D()) {
                    w70Var.O();
                    break;
                }
                break;
            default:
                ox0 ox0Var = (ox0) this.b;
                di.h hVar = ox0Var.h;
                if (hVar != null && hVar.getLayout() != null) {
                    ox0Var.F = hVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
