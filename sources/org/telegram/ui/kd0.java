package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kd0 extends sr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.sr
    public final void a() {
        switch (this.h) {
            case 0:
                ((od0) this.n).h(null);
                break;
            case 1:
                ((ie0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    postDelayed(new ek0(this, 1), 260L);
                    break;
                }
            default:
                ((xf1) this.n).C0();
                break;
        }
    }
}
