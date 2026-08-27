package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class od0 extends ur {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.ur
    public final void a() {
        switch (this.h) {
            case 0:
                ((sd0) this.n).h(null);
                break;
            case 1:
                ((me0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.A != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new zk0(this, 0), 260L);
                    break;
                }
            default:
                ((zf1) this.n).C0();
                break;
        }
    }
}
