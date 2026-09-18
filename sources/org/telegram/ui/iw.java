package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ iw(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                wy.B0(this.b, (Boolean) obj);
                break;
            default:
                wy.s0(this.b, (Boolean) obj);
                break;
        }
    }
}
