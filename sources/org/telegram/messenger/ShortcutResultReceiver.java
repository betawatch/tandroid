package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", z8c.t0);
        qac qacVar = (qac) hs6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (qacVar != null) {
            gm.c3(new mo0(qacVar, (byte) 12));
        }
    }
}
