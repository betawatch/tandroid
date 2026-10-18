package a8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g extends n6.g {
    @Override // n6.g
    public final boolean C() {
        return false;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return l8.f.c;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // n6.g
    public final boolean y() {
        return true;
    }
}
