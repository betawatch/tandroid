package l7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import y5.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends g {
    @Override // y5.g
    public final boolean C() {
        return false;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // y5.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return w7.g.c;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // y5.g
    public final boolean y() {
        return true;
    }
}
