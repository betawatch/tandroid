package com.google.firebase.messaging;

import ag.t0;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                q m10 = q.m();
                m10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) m10.d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (m10) {
                    try {
                        str = (String) m10.a;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        m10.a = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        m10.a = serviceInfo.name;
                                    }
                                    str = (String) m10.a;
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
                    if (m10.r(context)) {
                        startService = z.d(context, intent2);
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
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i10 = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 1:
                g2.i iVar = (g2.i) this.b;
                byte[] bArr = (byte[]) this.c;
                boolean z10 = iVar.d;
                Bitmap b10 = t0.b(bArr.length, iVar.c, bArr);
                return z10 ? t0.e(b10) : b10;
            case 2:
                g2.i iVar2 = (g2.i) this.b;
                Uri uri = (Uri) this.c;
                g2.h createDataSource = iVar2.b.createDataSource();
                int i11 = iVar2.c;
                boolean z11 = iVar2.d;
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
                    Bitmap b11 = t0.b(copyOf.length, i11, copyOf);
                    if (z11) {
                        b11 = t0.e(b11);
                    }
                    nVar.close();
                    return b11;
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
