package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ob0 extends br {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.n = obj;
    }

    @Override // org.telegram.ui.br
    public final void a() {
        switch (this.h) {
            case 0:
                ((rb0) this.n).h(null);
                break;
            case 1:
                ((kc0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new hf0(this, 3), 260L);
                    break;
                }
            default:
                ((cb1) this.n).H0();
                break;
        }
    }
}
