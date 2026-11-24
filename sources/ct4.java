// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ct4 extends b4 {
    public static final Parcelable.Creator<ct4> CREATOR = new c0f((byte) 1);
    public static final Scope[] F = new Scope[0];
    public static final f84[] G = new f84[0];
    public final String E;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public f84[] r;
    public f84[] s;
    public final boolean w;
    public final int x;
    public boolean y;

    public ct4(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, f84[] f84VarArr, f84[] f84VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        f84[] f84VarArr3 = G;
        f84[] f84VarArr4 = f84VarArr == null ? f84VarArr3 : f84VarArr;
        f84VarArr3 = f84VarArr2 != null ? f84VarArr2 : f84VarArr3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = e5.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                ug5 kefVar = queryLocalInterface instanceof ug5 ? (ug5) queryLocalInterface : new kef(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        kef kefVar2 = (kef) kefVar;
                        Parcel P = kefVar2.P(kefVar2.R(), 2);
                        Account account3 = (Account) mgd.a(P, Account.CREATOR);
                        P.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.n = account2;
        this.f = scopeArr2;
        this.h = bundle2;
        this.r = f84VarArr4;
        this.s = f84VarArr3;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c0f.a(this, parcel, i);
    }
}
