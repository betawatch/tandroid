package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                v70 v70Var = (v70) this.b;
                if (v70Var.D()) {
                    v70Var.O();
                    break;
                }
                break;
            default:
                ox0 ox0Var = (ox0) this.b;
                ai.p4 p4Var = ox0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    ox0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
