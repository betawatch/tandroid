package i2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.net.Uri;
import android.util.Log;
import cg.n0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.webrtc.audio.WebRtcAudioRecord;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$scheduleLogRecordingConfigurationsTask$0;
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i3;
        ComponentName startService;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                byte[] bArr = (byte[]) this.c;
                boolean z10 = jVar.d;
                Bitmap b10 = n0.b(bArr.length, jVar.c, bArr);
                return z10 ? n0.e(b10) : b10;
            case 1:
                j jVar2 = (j) this.b;
                Uri uri = (Uri) this.c;
                h createDataSource = jVar2.b.createDataSource();
                int i10 = jVar2.c;
                boolean z11 = jVar2.d;
                try {
                    n nVar = new n(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
                    o oVar = (o) createDataSource;
                    oVar.open(nVar);
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
                    Bitmap b11 = n0.b(copyOf.length, i10, copyOf);
                    if (z11) {
                        b11 = n0.e(b11);
                    }
                    oVar.close();
                    return b11;
                } catch (Throwable th2) {
                    ((o) createDataSource).close();
                    throw th2;
                }
            case 2:
                lambda$scheduleLogRecordingConfigurationsTask$0 = ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
            default:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                za.p r5 = za.p.r();
                r5.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) r5.d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (r5) {
                    try {
                        str = (String) r5.a;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        r5.a = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        r5.a = serviceInfo.name;
                                    }
                                    str = (String) r5.a;
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
                    if (r5.t(context)) {
                        startService = za.x.d(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i3 = 404;
                    } else {
                        i3 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i3 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i3 = 401;
                }
                return Integer.valueOf(i3);
        }
    }
}
