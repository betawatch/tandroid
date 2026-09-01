package o7;

import android.os.IBinder;
import android.os.IInterface;
import b6.g;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends g {
    @Override // b6.g
    public final boolean C() {
        return false;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // b6.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // b6.g
    public final y5.c[] r() {
        return z7.f.c;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // b6.g
    public final boolean y() {
        return true;
    }
}
