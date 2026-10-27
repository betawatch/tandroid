package c8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import y8.j;
import z8.i0;
import z8.j0;
import z8.y0;
import z8.z0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q = 1;
    public final /* synthetic */ String r;
    public final /* synthetic */ byte[] s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, byte[] bArr, String str) {
        super(n8.c.a, mVar);
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
                return new j0(status, -1);
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
                d dVar = (d) aVar.u();
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
                i0 i0Var = (i0) ((z0) cVar).u();
                y0 y0Var = new y0();
                y0Var.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(i0Var.c);
                int i12 = g8.a.a;
                obtain.writeStrongBinder(y0Var);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    i0Var.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s0 s0Var, String str, String str2, byte[] bArr) {
        super(j.a, s0Var);
        this.r = str;
        this.t = str2;
        this.s = bArr;
    }
}
