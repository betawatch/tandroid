package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                py.A0(this.b, (Boolean) obj);
                break;
            default:
                py.r0(this.b, (Boolean) obj);
                break;
        }
    }
}
