package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jk extends bo {
    public final /* synthetic */ int f;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle, int i10) {
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
