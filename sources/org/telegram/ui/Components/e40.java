package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e40 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e40(Object obj, int i7) {
        super(1);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                super.setAlpha(i7);
                ((z40) this.b).invalidate();
                break;
            case 1:
                super.setAlpha(i7);
                sk0 sk0Var = (sk0) this.b;
                sk0Var.a.setAlpha(Math.round(i7 * 0.2f));
                sk0Var.invalidate();
                break;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
