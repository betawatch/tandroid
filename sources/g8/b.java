package g8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import x8.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends p6.h {
    public final Context F;
    public final int G;
    public final String H;
    public final int I;
    public final boolean J;

    public b(Context context, Looper looper, o3 o3Var, k kVar, l lVar, int i3) {
        super(context, looper, 4, o3Var, kVar, lVar, 0);
        this.F = context;
        this.G = i3;
        this.H = null;
        this.I = 1;
        this.J = true;
    }

    public final Bundle A() {
        String packageName = this.F.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.G);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.J);
        bundle.putString("androidPackageName", packageName);
        String str = this.H;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.I);
        return bundle;
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12600000;
    }

    @Override // p6.d
    public final /* synthetic */ IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return p.c;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
