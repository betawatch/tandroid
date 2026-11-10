package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t30 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t30(Object obj, int i7) {
        super(1);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                super.setAlpha(i7);
                ((o40) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i7);
                fk0 fk0Var = (fk0) this.b;
                fk0Var.a.setAlpha(Math.round(i7 * 0.2f));
                fk0Var.invalidate();
                break;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
