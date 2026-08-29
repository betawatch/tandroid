package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class md0 extends sr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.sr
    public final void a() {
        switch (this.h) {
            case 0:
                ((pd0) this.n).h(null);
                break;
            case 1:
                ((ie0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.A != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new vk0(this, 0), 260L);
                    break;
                }
            default:
                ((cg1) this.n).C0();
                break;
        }
    }
}
