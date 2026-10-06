package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
