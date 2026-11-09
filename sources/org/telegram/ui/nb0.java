package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nb0 extends ar {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.n = obj;
    }

    @Override // org.telegram.ui.ar
    public final void a() {
        switch (this.h) {
            case 0:
                ((qb0) this.n).h(null);
                break;
            case 1:
                ((jc0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new gf0(this, 3), 260L);
                    break;
                }
            default:
                ((bb1) this.n).H0();
                break;
        }
    }
}
