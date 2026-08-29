package m7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import z5.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends g {
    @Override // z5.g
    public final boolean C() {
        return false;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // z5.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return x7.f.c;
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // z5.g
    public final boolean y() {
        return true;
    }
}
