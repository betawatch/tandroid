package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class y extends BroadcastReceiver {
    public z a;
    public final /* synthetic */ z b;

    public y(z zVar, z zVar2) {
        this.b = zVar;
        this.a = zVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0034), top: B:2:0x0001 }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onReceive(Context context, Intent intent) {
        boolean z4;
        try {
            z zVar = this.a;
            if (zVar == null) {
                return;
            }
            if (zVar.e()) {
                if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                    z4 = false;
                    if (z4) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    z zVar2 = this.a;
                    zVar2.d.f.schedule(zVar2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
                z4 = true;
                if (z4) {
                }
                z zVar22 = this.a;
                zVar22.d.f.schedule(zVar22, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
