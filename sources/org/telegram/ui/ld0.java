package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ld0 extends vr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.vr
    public final void a() {
        switch (this.h) {
            case 0:
                ((od0) this.n).h(null);
                break;
            case 1:
                ((je0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.q0();
                    break;
                } else {
                    postDelayed(new lj0(this, 2), 260L);
                    break;
                }
            default:
                ((dg1) this.n).D0();
                break;
        }
    }
}
