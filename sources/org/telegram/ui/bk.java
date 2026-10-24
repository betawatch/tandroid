package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bk extends un {
    public final /* synthetic */ int f;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk(Context context, org.telegram.ui.ActionBar.h5 h5Var, Bundle bundle, int i10) {
        super(context, h5Var, bundle);
        this.f = i10;
    }

    @Override // org.telegram.ui.un
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
