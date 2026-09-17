package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class de0 extends es {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.es
    public final void a() {
        switch (this.h) {
            case 0:
                ((ge0) this.n).h(null);
                break;
            case 1:
                ((af0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new rl0(this, 0), 260L);
                    break;
                }
            default:
                ((hh1) this.n).C0();
                break;
        }
    }
}
