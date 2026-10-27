package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nd0 extends xr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.xr
    public final void a() {
        switch (this.h) {
            case 0:
                ((qd0) this.n).h(null);
                break;
            case 1:
                ((le0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.q0();
                    break;
                } else {
                    postDelayed(new nj0(this, 2), 260L);
                    break;
                }
            default:
                ((fg1) this.n).D0();
                break;
        }
    }
}
