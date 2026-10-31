package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import v7.j5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v0 extends BroadcastReceiver {
    public Context a;
    public final j5 b;

    public v0(j5 j5Var) {
        this.b = j5Var;
    }

    public final synchronized void a() {
        try {
            Context context = this.a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            a();
        }
    }
}
