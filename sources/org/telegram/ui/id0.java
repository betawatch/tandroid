package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class id0 extends qr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.qr
    public final void a() {
        switch (this.h) {
            case 0:
                ((md0) this.n).h(null);
                break;
            case 1:
                ((ge0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    postDelayed(new ck0(this, 1), 260L);
                    break;
                }
            default:
                ((vf1) this.n).C0();
                break;
        }
    }
}
