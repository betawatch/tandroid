package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fk extends yn {
    public final /* synthetic */ int f;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle, int i10) {
        super(context, b5Var, bundle);
        this.f = i10;
    }

    @Override // org.telegram.ui.yn
    public final void a() {
        switch (this.f) {
            case 0:
                if (!this.h) {
                    this.h = true;
                    super.a();
                    break;
                }
                break;
            default:
                if (!this.h) {
                    this.h = true;
                    super.a();
                    break;
                }
                break;
        }
    }
}
