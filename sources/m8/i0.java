package m8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i0 extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ byte[] r;
    public final /* synthetic */ String s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(a8.c.a, mVar);
        this.r = bArr;
        this.s = str;
        this.t = new p7.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.f
    public final /* bridge */ /* synthetic */ void a(com.google.android.gms.common.api.q qVar) {
        switch (this.q) {
            case 0:
                a(qVar);
                break;
            default:
                a(qVar);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        switch (this.q) {
            case 0:
                return new j0(status, -1);
            default:
                return new p7.d(status, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.q;
        String str = this.s;
        byte[] bArr = this.r;
        Object obj = this.t;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) ((z0) cVar).u();
                y0 y0Var = new y0();
                y0Var.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(h0Var.c);
                int i11 = t7.a.a;
                obtain.writeStrongBinder(y0Var);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    h0Var.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                p7.a aVar = (p7.a) cVar;
                p7.e eVar = (p7.e) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar.R;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                            String str2 = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    str = "";
                }
                p7.c cVar2 = (p7.c) aVar.u();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i12 = p7.b.a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.google.android.gms.common.api.internal.t0 t0Var, String str, String str2, byte[] bArr) {
        super(l8.j.a, t0Var);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
