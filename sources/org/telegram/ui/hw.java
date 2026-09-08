package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ hw(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                uy.B0(this.b, (Boolean) obj);
                break;
            default:
                uy.s0(this.b, (Boolean) obj);
                break;
        }
    }
}
