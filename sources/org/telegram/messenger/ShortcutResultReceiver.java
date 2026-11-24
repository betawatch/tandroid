package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", y6c.t0);
        p8c p8cVar = (p8c) hq6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (p8cVar != null) {
            gl.c3(new mn0(p8cVar, (byte) 12));
        }
    }
}
