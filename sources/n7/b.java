package n7;

import android.os.IBinder;
import android.os.IInterface;
import p6.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends h {
    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 261200000;
    }

    @Override // p6.d
    public final /* synthetic */ IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return l6.h.b;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
