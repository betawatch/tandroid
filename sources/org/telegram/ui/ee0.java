package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ee0 extends ds {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.ds
    public final void a() {
        switch (this.h) {
            case 0:
                ((he0) this.n).h(null);
                break;
            case 1:
                ((bf0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new sl0(this, 0), 260L);
                    break;
                }
            default:
                ((gh1) this.n).C0();
                break;
        }
    }
}
