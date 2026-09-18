package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hk extends bo {
    public final /* synthetic */ int f;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle, int i10) {
        super(context, d5Var, bundle);
        this.f = i10;
    }

    @Override // org.telegram.ui.bo
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
