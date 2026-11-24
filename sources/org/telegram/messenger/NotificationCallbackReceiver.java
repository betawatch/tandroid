package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (y6c.q(intExtra)) {
                long longExtra = intent.getLongExtra("did", 777000L);
                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                gl.d3(new o57((Object) z3a.B(intExtra), longExtra, intent.getIntExtra("mid", 0), (Object) byteArrayExtra, (byte) 17));
            }
        }
    }
}
