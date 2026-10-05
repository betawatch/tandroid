package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class be0 extends cs {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.cs
    public final void a() {
        switch (this.h) {
            case 0:
                ((ee0) this.n).h(null);
                break;
            case 1:
                ((ye0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.m0();
                    break;
                } else {
                    postDelayed(new nl0(this, 0), 260L);
                    break;
                }
            default:
                ((zg1) this.n).C0();
                break;
        }
    }
}
