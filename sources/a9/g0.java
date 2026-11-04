package a9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 extends com.google.android.gms.common.api.internal.d {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ byte[] r;
    public final /* synthetic */ String s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(o8.c.a, mVar);
        this.r = bArr;
        this.s = str;
        this.t = new d8.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.e
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
                return new h0(status, -1);
            default:
                return new d8.d(status, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i3 = this.q;
        String str = this.s;
        byte[] bArr = this.r;
        Object obj = this.t;
        switch (i3) {
            case 0:
                f0 f0Var = (f0) ((y0) cVar).m();
                x0 x0Var = new x0();
                x0Var.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.c);
                int i10 = h8.a.a;
                obtain.writeStrongBinder(x0Var);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    f0Var.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                d8.a aVar = (d8.a) cVar;
                d8.e eVar = (d8.e) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar.F;
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
                d8.c cVar2 = (d8.c) aVar.m();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = d8.b.a;
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
    public g0(com.google.android.gms.common.api.internal.n0 n0Var, String str, String str2, byte[] bArr) {
        super(z8.c.a, n0Var);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
