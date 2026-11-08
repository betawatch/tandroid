package d8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import q6.h;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f extends h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // q6.d
    public final /* bridge */ /* synthetic */ IInterface i(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return o8.f.c;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }

    @Override // q6.d
    public final boolean x() {
        return false;
    }
}
