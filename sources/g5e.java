// default package

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g5e extends jg0 {
    public final /* synthetic */ byte q = 0;
    public final /* synthetic */ byte[] r;
    public final /* synthetic */ String s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5e(o6d o6dVar, byte[] bArr, String str) {
        super(ss9.a, o6dVar);
        this.r = bArr;
        this.s = str;
        this.t = new vdf(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, kg0
    public final /* bridge */ /* synthetic */ void a(ie9 ie9Var) {
        switch (this.q) {
            case 0:
                a(ie9Var);
                break;
            default:
                a(ie9Var);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ ie9 d(Status status) {
        switch (this.q) {
            case 0:
                return new c7e(status, -1);
            default:
                return new zbf(status, null);
        }
    }

    @Override // jg0
    public final void n(d05 d05Var) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.q;
        String str = this.s;
        byte[] bArr = this.r;
        Object obj = this.t;
        switch (b) {
            case 0:
                b4e b4eVar = (b4e) ((ape) d05Var).k();
                xne xneVar = new xne();
                xneVar.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(b4eVar.c);
                int i = sld.a;
                obtain.writeStrongBinder(xneVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    b4eVar.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                gbd gbdVar = (gbd) d05Var;
                vdf vdfVar = (vdf) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = gbdVar.F;
                    str = "";
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
                }
                xge xgeVar = (xge) gbdVar.k();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i2 = qld.a;
                if (vdfVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(vdfVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    xgeVar.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5e(o6d o6dVar, String str, String str2, byte[] bArr) {
        super(qwc.a, o6dVar);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
