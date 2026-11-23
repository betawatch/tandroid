package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            mp u12 = mp.u1(i10.t0);
            String string = intent.getExtras().getString("referrer");
            if (string == null) {
                return;
            }
            u12.U3 = string;
            u12.h7.edit().putString("installReferer", string).commit();
        } catch (Exception unused) {
        }
    }
}
