package o7;

import android.os.IBinder;
import android.os.IInterface;
import m6.i;
import q6.h;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b extends h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 261200000;
    }

    @Override // q6.d
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return i.b;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
