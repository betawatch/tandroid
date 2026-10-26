package b8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends o6.g {
    @Override // o6.g
    public final boolean C() {
        return false;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // o6.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return m8.f.c;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // o6.g
    public final boolean y() {
        return true;
    }
}
