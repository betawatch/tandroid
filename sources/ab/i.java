package ab;

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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i7;
        ComponentName startService;
        String lambda$scheduleLogRecordingConfigurationsTask$0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                b0 k10 = b0.k();
                k10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) k10.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (k10) {
                    try {
                        str = (String) k10.b;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        k10.b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        k10.b = serviceInfo.name;
                                    }
                                    str = (String) k10.b;
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
                    if (k10.m(context)) {
                        startService = m0.d(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i7 = 404;
                    } else {
                        i7 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i7 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i7 = 401;
                }
                return Integer.valueOf(i7);
            case 1:
                j2.i iVar = (j2.i) this.b;
                byte[] bArr = (byte[]) this.c;
                boolean z9 = iVar.d;
                Bitmap b10 = bg.o0.b(bArr.length, iVar.c, bArr);
                return z9 ? bg.o0.e(b10) : b10;
            case 2:
                j2.i iVar2 = (j2.i) this.b;
                Uri uri = (Uri) this.c;
                j2.h createDataSource = iVar2.b.createDataSource();
                int i10 = iVar2.c;
                boolean z10 = iVar2.d;
                try {
                    j2.m mVar = new j2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
                    j2.o oVar = (j2.o) createDataSource;
                    oVar.open(mVar);
                    byte[] bArr2 = new byte[1024];
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 != -1) {
                        if (i12 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                        i11 = oVar.read(bArr2, i12, bArr2.length - i12);
                        if (i11 != -1) {
                            i12 += i11;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i12);
                    Bitmap b11 = bg.o0.b(copyOf.length, i10, copyOf);
                    if (z10) {
                        b11 = bg.o0.e(b11);
                    }
                    oVar.close();
                    return b11;
                } catch (Throwable th2) {
                    ((j2.o) createDataSource).close();
                    throw th2;
                }
            default:
                lambda$scheduleLogRecordingConfigurationsTask$0 = ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
        }
    }
}
