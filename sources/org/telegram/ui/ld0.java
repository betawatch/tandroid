package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ld0 extends sr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(Object obj, Context context, int i9) {
        super(context);
        this.h = i9;
        this.n = obj;
    }

    @Override // org.telegram.ui.sr
    public final void a() {
        switch (this.h) {
            case 0:
                ((pd0) this.n).h(null);
                break;
            case 1:
                ((je0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.A != 0) {
                    passcodeActivity.f0();
                    break;
                } else {
                    postDelayed(new zk0(this, 0), 260L);
                    break;
                }
            default:
                ((ag1) this.n).B0();
                break;
        }
    }
}
