package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            wp r12 = wp.r1(e20.s0);
            String string = intent.getExtras().getString("referrer");
            if (string == null) {
                return;
            }
            r12.T3 = string;
            r12.f7.edit().putString("installReferer", string).commit();
        } catch (Exception unused) {
        }
    }
}
