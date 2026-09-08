package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.webrtc.audio.WebRtcAudioRecord;
import v7.l7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        ComponentName startService;
        String lambda$scheduleLogRecordingConfigurationsTask$0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                s b10 = s.b();
                b10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) b10.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (b10) {
                    try {
                        str = (String) b10.b;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        b10.b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        b10.b = serviceInfo.name;
                                    }
                                    str = (String) b10.b;
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
                    if (b10.d(context)) {
                        startService = b0.d(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e7) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
                    i10 = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 1:
                g2.i iVar = (g2.i) this.b;
                byte[] bArr = (byte[]) this.c;
                return l7.a(bArr.length, iVar.c, bArr);
            case 2:
                g2.i iVar2 = (g2.i) this.b;
                Uri uri = (Uri) this.c;
                g2.h createDataSource = iVar2.b.createDataSource();
                int i11 = iVar2.c;
                try {
                    g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
                    g2.n nVar = (g2.n) createDataSource;
                    nVar.open(mVar);
                    byte[] bArr2 = new byte[1024];
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 != -1) {
                        if (i13 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                        i12 = nVar.read(bArr2, i13, bArr2.length - i13);
                        if (i12 != -1) {
                            i13 += i12;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i13);
                    Bitmap a2 = l7.a(copyOf.length, i11, copyOf);
                    nVar.close();
                    return a2;
                } catch (Throwable th2) {
                    ((g2.n) createDataSource).close();
                    throw th2;
                }
            default:
                lambda$scheduleLogRecordingConfigurationsTask$0 = ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
        }
    }
}
