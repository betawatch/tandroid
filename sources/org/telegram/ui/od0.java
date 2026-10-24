package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class od0 extends sr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.sr
    public final void a() {
        switch (this.h) {
            case 0:
                ((rd0) this.n).h(null);
                break;
            case 1:
                ((me0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    postDelayed(new oj0(this, 2), 260L);
                    break;
                }
            default:
                ((bg1) this.n).C0();
                break;
        }
    }
}
