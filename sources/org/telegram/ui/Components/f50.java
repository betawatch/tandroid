package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f50 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(Object obj, int i10) {
        super(1);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                super.setAlpha(i10);
                ((a60) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i10);
                im0 im0Var = (im0) this.b;
                float f7 = i10;
                im0Var.a.setAlpha(Math.round(0.2f * f7));
                im0Var.b.setAlpha(Math.round(f7 * 0.6f));
                im0Var.c.setAlpha(i10);
                im0Var.d.setAlpha(i10);
                im0Var.invalidate();
                break;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
