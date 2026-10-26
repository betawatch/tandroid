package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {
    public y a;
    public final /* synthetic */ y b;

    public x(y yVar, y yVar2) {
        this.b = yVar;
        this.a = yVar2;
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
        boolean z10;
        try {
            y yVar = this.a;
            if (yVar == null) {
                return;
            }
            if (yVar.d()) {
                if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                    z10 = false;
                    if (z10) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    y yVar2 = this.a;
                    yVar2.d.f.schedule(yVar2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
                z10 = true;
                if (z10) {
                }
                y yVar22 = this.a;
                yVar22.d.f.schedule(yVar22, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
