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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dv4 extends b4 {
    public static final Parcelable.Creator<dv4> CREATOR = new e2f((byte) 1);
    public static final Scope[] F = new Scope[0];
    public static final o94[] G = new o94[0];
    public final String E;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public o94[] r;
    public o94[] s;
    public final boolean w;
    public final int x;
    public boolean y;

    public dv4(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, o94[] o94VarArr, o94[] o94VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        o94[] o94VarArr3 = G;
        o94[] o94VarArr4 = o94VarArr == null ? o94VarArr3 : o94VarArr;
        o94VarArr3 = o94VarArr2 != null ? o94VarArr2 : o94VarArr3;
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
                ti5 lgfVar = queryLocalInterface instanceof ti5 ? (ti5) queryLocalInterface : new lgf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        lgf lgfVar2 = (lgf) lgfVar;
                        Parcel P = lgfVar2.P(lgfVar2.R(), 2);
                        Account account3 = (Account) nid.a(P, Account.CREATOR);
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
        this.r = o94VarArr4;
        this.s = o94VarArr3;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        e2f.a(this, parcel, i);
    }
}
