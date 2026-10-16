package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ge0 extends hs {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.hs
    public final void a() {
        switch (this.h) {
            case 0:
                ((je0) this.n).h(null);
                break;
            case 1:
                ((ef0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    postDelayed(new xk0(this, 1), 260L);
                    break;
                }
            default:
                ((oh1) this.n).C0();
                break;
        }
    }
}
