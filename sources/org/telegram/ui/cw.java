package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ cw(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                qy.B0(this.b, (Boolean) obj);
                break;
            default:
                qy.s0(this.b, (Boolean) obj);
                break;
        }
    }
}
