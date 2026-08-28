package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.AudioRecord;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import org.webrtc.audio.WebRtcAudioRecord;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i9;
        ComponentName startService;
        String lambda$scheduleLogRecordingConfigurationsTask$0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                t v = t.v();
                v.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) v.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (v) {
                    try {
                        str = (String) v.b;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        v.b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        v.b = serviceInfo.name;
                                    }
                                    str = (String) v.b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (v.x(context)) {
                        startService = c0.d(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i9 = 404;
                    } else {
                        i9 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i9 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i9 = 401;
                }
                return Integer.valueOf(i9);
            default:
                lambda$scheduleLogRecordingConfigurationsTask$0 = ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
        }
    }
}
