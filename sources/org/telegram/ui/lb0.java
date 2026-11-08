package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class lb0 extends yq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.n = obj;
    }

    @Override // org.telegram.ui.yq
    public final void a() {
        switch (this.h) {
            case 0:
                ((ob0) this.n).h(null);
                break;
            case 1:
                ((hc0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new ef0(this, 3), 260L);
                    break;
                }
            default:
                ((za1) this.n).H0();
                break;
        }
    }
}
