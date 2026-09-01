package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fk extends zn {
    public final /* synthetic */ int f;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk(Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle, int i10) {
        super(context, f5Var, bundle);
        this.f = i10;
    }

    @Override // org.telegram.ui.zn
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
