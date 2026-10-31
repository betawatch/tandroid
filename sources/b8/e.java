package b8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import y8.f0;
import y8.g0;
import y8.v0;
import y8.w0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q = 1;
    public final /* synthetic */ String r;
    public final /* synthetic */ byte[] s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, byte[] bArr, String str) {
        super(m8.c.a, mVar);
        this.s = bArr;
        this.r = str;
        this.t = new g(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.f
    public final /* bridge */ /* synthetic */ void a(q qVar) {
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
    public final /* bridge */ /* synthetic */ q d(Status status) {
        switch (this.q) {
            case 0:
                return new f(status, null);
            default:
                return new g0(status, -1);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.q;
        byte[] bArr = this.s;
        Object obj = this.t;
        String str = this.r;
        switch (i10) {
            case 0:
                a aVar = (a) cVar;
                g gVar = (g) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar.U;
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
                d dVar = (d) aVar.v();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = c.a;
                if (gVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(gVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    dVar.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                f0 f0Var = (f0) ((w0) cVar).v();
                v0 v0Var = new v0();
                v0Var.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.c);
                int i12 = f8.a.a;
                obtain.writeStrongBinder(v0Var);
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u0 u0Var, String str, String str2, byte[] bArr) {
        super(x8.c.a, u0Var);
        this.r = str;
        this.t = str2;
        this.s = bArr;
    }
}
