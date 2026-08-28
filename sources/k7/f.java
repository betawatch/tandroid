package k7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;
import x5.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends g {
    @Override // x5.g
    public final boolean C() {
        return false;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // x5.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return v7.f.c;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // x5.g
    public final boolean y() {
        return true;
    }
}
