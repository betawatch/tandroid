package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lb0 extends br {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.n = obj;
    }

    @Override // org.telegram.ui.br
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
                    postDelayed(new gf0(this, 3), 260L);
                    break;
                }
            default:
                ((za1) this.n).H0();
                break;
        }
    }
}
