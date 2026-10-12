package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ie0 extends hs {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.hs
    public final void a() {
        switch (this.h) {
            case 0:
                ((le0) this.n).h(null);
                break;
            case 1:
                ((ff0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    postDelayed(new yk0(this, 1), 260L);
                    break;
                }
            default:
                ((oh1) this.n).C0();
                break;
        }
    }
}
