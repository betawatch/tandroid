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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gv4 extends c4 {
    public static final Parcelable.Creator<gv4> CREATOR = new t4f((byte) 1);
    public static final Scope[] F = new Scope[0];
    public static final a94[] G = new a94[0];
    public final String E;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public a94[] r;
    public a94[] s;
    public final boolean w;
    public final int x;
    public boolean y;

    public gv4(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, a94[] a94VarArr, a94[] a94VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        a94[] a94VarArr3 = G;
        a94[] a94VarArr4 = a94VarArr == null ? a94VarArr3 : a94VarArr;
        a94VarArr3 = a94VarArr2 != null ? a94VarArr2 : a94VarArr3;
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
                int i5 = f5.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                wi5 ajfVar = queryLocalInterface instanceof wi5 ? (wi5) queryLocalInterface : new ajf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        ajf ajfVar2 = (ajf) ajfVar;
                        Parcel P = ajfVar2.P(ajfVar2.R(), 2);
                        Account account3 = (Account) dld.a(P, Account.CREATOR);
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
        this.r = a94VarArr4;
        this.s = a94VarArr3;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        t4f.a(this, parcel, i);
    }
}
