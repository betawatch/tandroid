package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h {
    public final /* synthetic */ int a;

    public final long a() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
