package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r50 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(Object obj, int i10) {
        super(1);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                super.setAlpha(i10);
                ((p60) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i10);
                en0 en0Var = (en0) this.b;
                en0Var.a.setAlpha(Math.round(i10 * 0.2f));
                en0Var.invalidate();
                break;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
