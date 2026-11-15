package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lb0 extends ar {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.n = obj;
    }

    @Override // org.telegram.ui.ar
    public final void a() {
        switch (this.h) {
            case 0:
                ((ob0) this.n).h(null);
                break;
            case 1:
                ((gc0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.F != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new ef0(this, 3), 260L);
                    break;
                }
            default:
                ((xa1) this.n).H0();
                break;
        }
    }
}
