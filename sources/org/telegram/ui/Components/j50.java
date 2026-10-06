package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class j50 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j50(Object obj, int i10) {
        super(1);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                super.setAlpha(i10);
                ((f60) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i10);
                om0 om0Var = (om0) this.b;
                om0Var.a.setAlpha(Math.round(i10 * 0.2f));
                om0Var.invalidate();
                break;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
