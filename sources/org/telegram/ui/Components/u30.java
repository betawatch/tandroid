package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u30 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u30(Object obj, int i7) {
        super(1);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                super.setAlpha(i7);
                ((p40) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i7);
                gk0 gk0Var = (gk0) this.b;
                gk0Var.a.setAlpha(Math.round(i7 * 0.2f));
                gk0Var.invalidate();
                break;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
