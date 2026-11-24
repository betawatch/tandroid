package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", y6c.t0);
        p8c p8cVar = (p8c) hq6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (p8cVar != null) {
            gl.d3(new mn0(p8cVar, (byte) 12));
        }
    }
}
