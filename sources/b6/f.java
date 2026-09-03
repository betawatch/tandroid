package b6;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public y5.c[] r;
    public y5.c[] s;
    public final boolean v;
    public final int w;
    public boolean x;
    public final String y;
    public static final Parcelable.Creator<f> CREATOR = new w.a(28);
    public static final Scope[] B = new Scope[0];
    public static final y5.c[] C = new y5.c[0];

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, y5.c[] cVarArr, y5.c[] cVarArr2, boolean z4, int i13, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? B : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        y5.c[] cVarArr3 = C;
        y5.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i m0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var2 = (m0) m0Var;
                        Parcel K0 = m0Var2.K0(m0Var2.M0(), 2);
                        Account account3 = (Account) a7.d.a(K0, Account.CREATOR);
                        K0.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
            this.n = account2;
        } else {
            this.e = iBinder;
            this.n = account;
        }
        this.f = scopeArr2;
        this.h = bundle2;
        this.r = cVarArr4;
        this.s = cVarArr3;
        this.v = z4;
        this.w = i13;
        this.x = z10;
        this.y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w.a.a(this, parcel, i10);
    }
}
