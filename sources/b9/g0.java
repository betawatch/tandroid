package b9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g0 extends com.google.android.gms.common.api.internal.d {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ byte[] r;
    public final /* synthetic */ String s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(p8.c.a, mVar);
        this.r = bArr;
        this.s = str;
        this.t = new e8.e(this);
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
                return new e8.d(status, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i7 = this.q;
        String str = this.s;
        byte[] bArr = this.r;
        Object obj = this.t;
        switch (i7) {
            case 0:
                f0 f0Var = (f0) ((y0) cVar).n();
                x0 x0Var = new x0();
                x0Var.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.c);
                int i10 = i8.a.a;
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
                e8.a aVar = (e8.a) cVar;
                e8.e eVar = (e8.e) obj;
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
                e8.c cVar2 = (e8.c) aVar.n();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = e8.b.a;
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
        super(a9.c.a, n0Var);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
