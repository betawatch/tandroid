package e8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
import v8.p;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b extends n6.g {
    public final Context U;
    public final int V;
    public final String W;
    public final int X;
    public final boolean Y;

    public b(Context context, Looper looper, p3 p3Var, k kVar, l lVar, int i10) {
        super(context, looper, 4, p3Var, kVar, lVar, 0);
        this.U = context;
        this.V = i10;
        this.W = null;
        this.X = 1;
        this.Y = true;
    }

    @Override // n6.g
    public final boolean C() {
        return true;
    }

    public final Bundle G() {
        String packageName = this.U.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.V);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.Y);
        bundle.putString("androidPackageName", packageName);
        String str = this.W;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.X);
        return bundle;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12600000;
    }

    @Override // n6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return p.c;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
