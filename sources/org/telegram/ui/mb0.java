package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mb0 extends br {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.n = obj;
    }

    @Override // org.telegram.ui.br
    public final void a() {
        switch (this.h) {
            case 0:
                ((pb0) this.n).h(null);
                break;
            case 1:
                ((hc0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.F != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new hf0(this, 3), 260L);
                    break;
                }
            default:
                ((bb1) this.n).H0();
                break;
        }
    }
}
