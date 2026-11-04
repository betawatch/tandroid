package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p30 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p30(Object obj, int i3) {
        super(1);
        this.a = i3;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i3) {
        switch (this.a) {
            case 0:
                super.setAlpha(i3);
                ((k40) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i3);
                jk0 jk0Var = (jk0) this.b;
                jk0Var.a.setAlpha(Math.round(i3 * 0.2f));
                jk0Var.invalidate();
                break;
            default:
                super.setAlpha(i3);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
