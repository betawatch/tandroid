package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ib0 extends xq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib0(int i3, Context context, Object obj) {
        super(context);
        this.h = i3;
        this.n = obj;
    }

    @Override // org.telegram.ui.xq
    public final void a() {
        switch (this.h) {
            case 0:
                ((lb0) this.n).h(null);
                break;
            case 1:
                ((fc0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.F != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new sg0(this, 2), 260L);
                    break;
                }
            default:
                ((ra1) this.n).H0();
                break;
        }
    }
}
