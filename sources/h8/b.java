package h8;

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
import y8.p;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class b extends q6.h {
    public final Context F;
    public final int G;
    public final String H;
    public final int I;
    public final boolean J;

    public b(Context context, Looper looper, o3 o3Var, k kVar, l lVar, int i7) {
        super(context, looper, 4, o3Var, kVar, lVar, 0);
        this.F = context;
        this.G = i7;
        this.H = null;
        this.I = 1;
        this.J = true;
    }

    public final Bundle B() {
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

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12600000;
    }

    @Override // q6.d
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return p.c;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
